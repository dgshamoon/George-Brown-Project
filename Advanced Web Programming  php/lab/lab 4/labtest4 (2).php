<?php
/**
 * Created by PhpStorm.
 * User: danial
 * Date: 2016-10-17
 * Time: 11:33 AM
 */
//part1
$var = str_split("gheshe shamoon");

echo "<br/>my last name is ". $var[0].$var[1] .$var[2] . $var[3] .$var[4] .$var[5] .$var[6] .$var[7] .$var[8].$var[9] .$var[10].$var[11] .$var[12] .$var[13]  ;

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//part2
$firstName=substr("Danial",0,3);
$lastName=substr("gheshe shamoon",0,3);
$name=$firstName." ".$lastName;
$arr2=str_split($name);

echo "<br/>my firs name and last name is".$arr2[0].$arr2[1].$arr2[2].$arr2[3].$arr2[4].$arr2[5].$arr2[6];


///////////////////////////////////////////////////////////////////////////////////////////////////
//part3
$arr3=array("a"=>"hello","b"=>"hi","c"=>"goodBye","d"=>"bye","e"=>"good");
echo "<br/>before change<br/>";
var_dump($arr3);
$arr3["c"]="good afternoon";
rsort($arr3);
echo "<br/>after change";
var_dump($arr3);
//////////////////////////////////////////////////////////////////////////////////////////////////
//part4
function add3Number($num){
	$sum1=0;
	for($i=0;$i<3;$i++){
		$sum1+=$num%10;
		$num=$num/10;
	}
	$sum2=0;
	for($i=0;$i<3;$i++){
		$sum2+=$num%10;
		$num=$num/10;
	}
	$sum3=0;
	for($i=0;$i<3;$i++){
		$sum3+=$num%10;
		$num=$num/10;
	}
	$arr4=array($sum3,$sum2,$sum1);
	return $arr4;
}

/////////////////////////////////////////////////////////////////////////////////////////////////
//part5

echo "<br/>";
var_dump(add3Number(101041512));
echo show_source(__FILE__);
?>

