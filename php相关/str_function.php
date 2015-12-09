<?php
	
	// echo "con<br>";
	// // print(error);
	// exit;

	// echo "1111111";

	// die("die...");

	$test = "  0123what aRe you taKing About ?   ";
	echo strlen($test)."<br>";
	$str = trim($test);
	echo trim($str)."<br>";
	echo strlen($str)."<br>";
	echo trim($str, '0..9')."<br>";
	echo str_pad(trim($test, '0..9 '), 40, "!!")."<br>";

	echo "<hr width=95% >";
	$sr = trim($test, '0..9 ');
	echo strtoupper($sr)."<br>";
	echo strtolower($sr)."<br>";
	echo ucfirst($sr)."<br>";
	echo ucwords($sr)."<br>";
	// echo lcfirst($sr)."<br>";

	echo "<hr width=95% >";
	$te = "abc\ndef\nwww\naaa";
	echo nl2br($te);
	echo "<br>";

	echo "<hr width=95% >";
	$price = 123456789.123456;
	echo $price."<br>";
	echo number_format($price)."<br>";
	echo number_format($price, 2)."<br>";
	echo number_format($price, 2, '.', ',')."<br>";
	echo "<hr width=95% >";
	$pass = "123$&456";
	if(md5($pass)=="41f728bba219544984ac2b1c400b314e"){
		echo "ok<br>";
	}

	echo "<hr width=95% >";
	echo strcmp("abc", "aBc")."<br>";
	echo "<hr width=95% >";


?>
<form>
	text:<input type="text" name="str"></input>
	<input type="submit" value="submit"></input>
	<br>
</form>
<?php
	
	echo $_GET["str"]."<br>";
	echo htmlspecialchars($_GET["str"])."<br>";
	echo stripslashes($_GET["str"])."<br>";
	echo strip_tags($_GET["str"])."<br>";


	
?>