<?php

	// 数组的排序函数
	$test = array(5=>"five",8=>"eight",1=>"one",7=>"seven",2=>"two");
	sort($test);
	print_r($test);
	echo "<br>";
	rsort($test);
	print_r($test);
	echo "<br>";
	ksort($test);
	print_r($test);
	echo "<br>";
	krsort($test);
	print_r($test);
	echo "<br>";

	$date = array("1"=>"linux","a"=>"apche","m"=>"mysql","l"=>"php");
	asort($date);
	print_r($date);
	echo "<br>";
	arsort($date);
	print_r($date);
	echo "<br>";

	$file = array("file1.txt","file11.txt","File2.txt","file22.txt");
	natsort($file);
	print_r($file);
	echo "<br>";
	natcasesort($file);
	print_r($file);
	echo "<br>";

	$data = array("linux","Apache","Mysql","Php");
	usort($data, "sortbylen");
	print_r($data);
	echo "<br>";
	function sortbylen($one, $two){
		if(strlen($one) == strlen($two)){
			return 0;
		}else{
			return (strlen($one)>strlen($two)) ? 1 :-1;
		}
	}

	echo "<hr width=90% >";
	print_r(array_combine($data, $file));
	echo "<br>";

	print_r(shuffle($data));




?>