<meta http-equiv="Content-Type" content="text/html;charset=UTF-8">
<?php
	date_default_timezone_set("PRC");
	// $file = fopen("test.txt", "a");
	// var_dump($file);

	// for ($i=0; $i < 10; $i++) { 
	// 	fwrite($file, "give me five ...\n");
	// }
	

	// fclose($file);
	$file = fopen("test.txt", "a+");
	//echo fread($file, filesize("test.txt"));
	// echo fread($file, 10);
	// fclose($file);
	// echo "<hr>";

	// $file = fopen("http://www.163.com", "r");
	// $str = "";
	// $i = 0;
	// while (!feof($file)) {
	// 	$str .= fgets($file);
	// 	$i ++;
	// }
	// echo $i;
	// fclose($file);

	// echo ftell($file)."<br>";
	// echo fread($file, 10).'<br>';
	// echo ftell($file).'<br>';
	// echo fread($file, 20).'<br>';
	// echo ftell($file).'<br>';
	// fseek($file, 100).'<br>';


	$mess = "data.txt";
	if (isset($_POST["sub"])) {

		$str = date("H:i:s",time()).'<-->'.$_POST["username"].'<-->'.$_POST["tit"].'<-->'.$_POST["con"].'<n>';
		write($mess,$str);

		if (file_exists($mess)) {
			$con = read($mess);

			$con = rtrim($con,"<n>");
			$rows = explode("<n>", $con);
			foreach ($rows as $row) {
				list($time, $username, $title, $contents) = explode("<-->", $row);
				echo '<p><b>'.$username.'</b>在<font color="red">'.$time.'</font>说：<i>'.$title.'</i><u>'.$contents.'</u></p>';
			}


		}
	}

	function read($fileName){
		$file = fopen($fileName, "r");
		if (flock($file, LOCK_SH)) {
			$str = fread($file, filesize($fileName));
			flock($file, LOCK_UN);
		}
		fclose($file);
		return $str;
	}

	function write($fileName, $mess){
		$file = fopen($fileName, "a");
		fwrite($file, $mess);
		fclose($file);
	}





?>
<form action="fileFopen.php" method="post">
	username: <input type="text" name="username"><br><br>
	title &nbsp;: <input type="text" name="tit" ><br><br>
	contents:<br><br>&nbsp;&nbsp;&nbsp;&nbsp;<textarea name="con" cols="30" rows="5"></textarea><br><br>
	&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="submit" name="sub" value="message">
</form>