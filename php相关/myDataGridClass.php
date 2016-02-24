<!-- myDataGridClass.php 数据分页显示类 -->
<?php
/*********
类名：myDataGridClass
功能：分页显示Mysql数据库中的数据
**********/
class myDataGridClass{
	var $sql;				//所要显示的sql查询语句
	var $max_line;			//每页显示的最多行数

	var $begin_record;		//所要显示记录的首行序号
	var $total_records;		//记录总数
	var $current_records;	//本页读取的记录数
	var $result;			//读出的结果
	var $total_pages;		//总页数
	var $current_page;		//当前页数

	var $arr_page_query;	//数组，包含分页显示需要传递的参数

	/***
	构造函数：__construct()
	输入参数：$pmax_line 每页显示的最多行数
	***/
	function myDateGridClass($pmax_line){
		$this->max_line = $pmax_line;
		$this->begin_record = 0;
		$this->sql = "select * from user";
	}

	/***
	构造函数：__destruct()
	输入参数：
	**/
	function __destruct(){

	}

	//get()函数
	function __get($property_name){
		if(isset($this->$property_name)){
			return($this->$property_name);
		}
		else{
			return(null);
		}
	}

	//set()函数
	function __set($property_name, $value){
		$this->$property_name = $value;
	}

	/*
	函数名：read_data()
	功能：更具sql查询语句从表中读取相应的记录
	返回值：属性二维数组result[记录号][字段名]
	*/
	function read_data(){
		$psql = "select * from user";

		//查询数据，数据库连接
		$conn = mysql_connect("localhost","root","lovline");
		mysql_select_db("php7");
		mysql_query("set names utf8");

		$result = mysql_query($psql,$conn) or die(mysql_error());
		$this->total_records = mysql_num_rows($result);

		//利用limit关键字获取本页所要显示的行数
		if ($this->total_records>0) {
			$psql = $psql ." limit ".$this->begin_record.",".$this->max_line;

			$result = mysql_query($psql,$conn) or die(mysql_error());
			$this->current_records = mysql_num_rows($result);

			//将查询结果放在result数组中
			$i = 0;
			while ($row=mysql_fetch_array($result)) {
				$this->result[$i] = $row;
				$i++;
			}
		}
	}

	/*
	函数名：navigate()
	功能：显示首页，上下页，尾页。
	*/
	function navigate(){
		//读取总页数，当前页信息
		$this->total_pages = ceil($this->total_records/$this->max_line);
		$this->current_page = $this->begin_record/$this->max_line+1;
		echo "<div align=center>";
		echo "<font color=red size='4'>第".$this->current_page."页/共".$this->total_pages."页</font>";
		echo "  ";

		//获取将要导航到的分页的初始记录号
		$first = 0;
		$next = $this->begin_record+$this->max_line;
		$prev = $this->begin_record-$This->max_line;
		$last = ($this->total_pages-1)*$this->max_line;

		//生成导航连接
		if ($this->begin_record>=$this->max_line) {
			echo "<a href=".$_SERVER['php_SELF']."?begin_record=".$first.">首页</a>|";
		}
		if($prev>=0){
			echo "<a href=".$_SERVER['php_SELF']."?begin_record=".$prev.">上一页</a>|";
		}
		if($next<$this->total_records){
			echo "<a href=".$_SERVER['php_SELF']."?begin_record=".$next.">下一页</a>|";
		}
		if($this->total_pages!=0 && $this->current_page<$this->total_pages){
			echo "<a href=".$_SERVER['php_SELF']."?begin_record=".$last.">末页</a>|";
		}

		echo "</div>";
	}

}


?>