<body>
<?php
	include 'labtest3a.header.php';
	$num=101041512;
	function firstFunction($input){
		return gettype($input);
	}
	function secondFunction($input1,$input2,$input3){
		$re=$input3;
		$input3="<table >";
		for($i=0;$i<$input1;$i++){
			$input3=$input3."<tr>";
			for($j=0;$j<$input2;$j++){
				$input3=$input3."<td>".$re."</td>";
			}
			$input3=$input3."</tr>";
		}
		$input3=$input3."</table>";
		return $input3;
	}
	echo "The data type of 123 is: ".firstFunction(123);
	echo "<br/> The data type of Danial is: ".firstFunction("Danial");
	echo "<br/> Using the second function and passing the parameters 4,5,hello<br/>";
	echo secondFunction(4,5,"hello");
	echo show_source(__FILE__);
	require 'labtest3a.footer.php';
?>
</body>
