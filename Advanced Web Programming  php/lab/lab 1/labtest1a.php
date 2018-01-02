<?php
echo("<h1>Danial gheshe shamoon</h1>");
echo("<h2>101041512</h2>");
if(substr("101041512",2,1)=="1")
{	$var=intval(10);
	define("val","hi");
	echo $var.'&'.val;
	
}
$s=intval(substr("101041512",0,2));
$ss=intval(substr("101041512",2,2));
$s=$s+$ss;
$s=$s*intval(substr("101041512",4,2));
$s=$s-intval(substr("101041512",4,2));
echo "<br/>value= ".$s;
?>