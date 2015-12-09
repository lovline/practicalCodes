<?php
	
	// 数组的相关处理函数
	$lamp = array("os"=>"linnux","webServer"=>"Apache","db"=>"Mysql",10=>"linnux");
	$arr = array_values($lamp);

	echo "<pre>";
	print_r($arr);
	echo "</pre>";
	
	list($os, $wb, $db) = $arr;
	echo $os."<br>";

	$arr1 = array_keys($lamp);
	echo "<pre>";
	print_r($arr1);
	echo "</pre>";

	if(in_array("linnux", $lamp)){
		echo "exits<br>";
	}

	$arr2 = array_flip($lamp);
	echo "<pre>";
	print_r($arr2);
	echo "</pre>";

	$arr3 = array_reverse($lamp);
	echo "<pre>";
	print_r($arr3);
	echo "</pre>";

	$arr4 = array_count_values($lamp);
	echo "<pre>";
	print_r($arr4);
	echo "</pre>";

	$numbers = array(1,2,3,4,-5,6,8,-9,10);
	$arr5 = array_filter($numbers,myfun);
	function myfun($n){
		if($n%2 == 0){
			return true;
		}else{
			return false;
		}
	}
	echo "<pre>";
	print_r($arr5);
	echo "</pre>";

	$lang = array("os"=>"linuxe","wb"=>"apache","db"=>"mysql");
	array_walk($lang, myfun1);
	function myfun1($value, $key){
		echo "the key $key has the value $value <br>";
	}



?>