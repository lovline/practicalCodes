<meta http-equiv="Content-Type" content="text/html;charset=utf-8">
<?php


	class  MysqlTool{

		private $conn;
		private $host = "localhost";
		private $user = "root";
		private $password = "lovline";
		private $db = "php7";

		// 初始化工作
		function __construct(){
			$this->conn = mysql_connect($this->host, $this->user, $this->password);
			if (!$this->conn) {
				die("连接数据库失败。。。".mysql_error());
			}
			mysql_select_db($this->db, $this->conn);
			mysql_query("set names utf8");

		}

		// 完成查询任务
		//**********************dql***********************//
		public function execute_dql($sql){
			$res = mysql_query($sql, $this->conn) or die(mysql_error());
			return $res;
		}

		//完成增insert删delete改update任务
		//**********************dml***********************//
		public function execute_dml($sql){
			$b = mysql_query($sql, $this->conn);
			if (!$b) {
				return 0;     //失败
			}else{
				if (mysql_affected_rows($this->conn) > 0) {
					return 1; // 表示成功
				}else{
					return 2; // 表示没有行数改变。
				}
			}
		}


	}


?>