<meta http-equiv="Content-Type" content="text/html;charset=UTF-8">
<?php

	$string = "today is 2015-12-06 20:34:45 pm...";
	$pattern = "/\d{4}(\W)\d{2}\\1\d{2}\s+\d{2}(\W)\d{2}\\2\d{2}\s+(?:am|pm)/";

	if (preg_match($pattern, $string, $arr)) {
		echo "regex :<h2>".$pattern."</h2>and string :<h2>".$string."</h2>macherred...<br>";
		echo "<pre>";
		print_r($arr);
		echo "</pre>";
	}else{
		echo "<h1><font color='red'>fail...</font></h1><br>";
	}

	echo "<hr>";
	$str = "后付款单佛法和哈儿jdaoihd了你说呢djfdkfd其好似我也不会到";
	echo  $str."<br>";
	echo preg_replace("/\w+/", "mine", $str)."<br>";
	echo preg_replace("/\w+/", "mine", $str, 1)."<br>";
	echo preg_replace("/([a-z]+)/i", "<font color='red'>\\1</font>", $str)."<br>";
	echo preg_replace("/([a-z]+)/ei", "strtoupper(\"\\1\")", $str)."<br>";
	echo preg_replace("/([a-z]+)/ei", '"<h2>"'.'.strtoupper("\\1").'.'"</h2>"', $str)."<br>";

	echo "<hr>";
	$str1 = "192.11.68.3";
	$arr1 = explode(".", $str1);
	echo "<pre>";
	print_r($arr1);
	echo "</pre>";
	$arrs = preg_split('/[,.?;!]/', "this a teachetr. what! who ara you ? of course, i did .");
	echo "<pre>";
	print_r($arrs);
	echo count($arrs);
	echo "</pre>";
	echo implode("=",$arrs);
	echo "<hr>";
	$array = array("zhag nsn","lisi","wangwu5","zhaoli","ni hao");
	echo "<pre>";
	print_r(preg_grep('/\s+/', $array));
	print_r(preg_grep('/^\S+$/', $array));
	print_r(preg_grep('/\d/', $array));
	echo "</pre>";


?>