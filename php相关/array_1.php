<?php
// 二维数组
/*
	$user = array(
			array(1,"zhagnsan",10,"nana"),
			array(2,"zlisi",20,"nv"),
			array(3,"wagnwu",15,"nana"),
		);

	// foreach($user as $arr){
	// 	foreach ($arr as $key => $value) {
	// 		echo $key."-->>".$value."<br>";
	// 	}
	// }


	// echo '<pre>';
	// 	print_r($user);
	// 	echo '<br>';
	// 	var_dump($user);
	// echo '</pre>';

// 数组遍历方法
	echo "-----------------<br>";
	$test = array(1,"name"=>"user","qq"=>"1079974085","school"=>"xidian");

	// for ($i=0; $i < count($test); $i++) { 
	// 	echo "$i"."-->>".$test[$i]."<br>";
	// }

	// foreach ($test as $key => $value) {
	// 	echo $key."-->>".$value."<br>";
	// }
	// echo "-----------------<br>";

	// $c = each($test);
	// print_r($arr);

	while ($arr = each($test)) {
		echo $arr[0]."---->>".$arr[1]."<br>";
		//echo $arr["key"]."---->>".$arr["value"]."<br>";
	}

	echo "-----------------<br>";
	list($name ,$age ,$sex) = array("zhagnsan" ,10 ,"nnn");
	echo $name;
	echo "-----------------<br>";

	$ip = "192.168.1.128";
	$ips = explode(".", $ip);
	print_r($ips);
	echo "<br>";
	echo "----------------<br>";
	list( , , , $d)  = explode(".", $ip);
	echo $d;

	echo "----------------<br>";
	$_GET = array(4,6);
	print_r($_GET);
*/
?>	

<!-- 超全局数组 -->
<?php

	// echo $_GET["username"]."<br>";
	// echo $_GET["email"]."<br>";
	// echo $_GET["page"]."<br>";
	// echo "------------<br>";
	// print_r($_GET);
	// echo "<br>----------<br>";
	// print_r($_POST);
	// echo "<br>----------<br>";
	// print_r($_REQUEST)  //不推荐使用
	// print_r($_REQUEST)  //不推荐使用
	// echo "<br>----------<br>";
	// echo "<pre>";
	// print_r($_ENV);
	// echo "</pre>";
	echo "<br>----------<br>";
	echo "<pre>";
	print_r($_SERVER);
	echo "</pre>";
	echo "<br>----------<br>";
	echo $_SERVER["DOCUMENT_ROOT"];
	echo "<br>----------<br>";
	

?>

	<form action="array.php" method="post">
		username : <input type="text" name="uname"></input>
		<br>
		password : <input type="password" name="pass"></input>
		<input type="submit" value="login"></input>
	</form>
	
	<a href="array.php?username=zhangsan&email=aa@bb.com&page=45">this is a $_GET test </a>
