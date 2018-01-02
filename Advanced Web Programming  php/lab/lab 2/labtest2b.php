
<!DOCTYPE html>
<html>
<head>
    <title></title>
    <meta charset="utf-8" />
</head>
<body>
<form method="GET" action="#">
    <label>Field1</label><input name="field1" /><br/>
    <label>Field2</label><input name="field2" /><br/>
    <label>Field3</label><input name="field3"/><br/>
    <input type="submit" name="button" value="Submit"/>
</form>
<?php
$id=101041512;
if($id%2==0){
    echo("My student number(".$id.") is even");
}
else{
    echo("My student number(".$id.") is odd");
}
$step=$id%10000;
$start=100000000;
$counter=1;
for($index=$start;$index<$id;$index+=$step){
    echo ("<br/>".$index);
    if($counter>20)
        break;
    $counter++;
}
if(isset($_GET["button"])){
    $firstValue=intval($_GET["field1"]);
    echo "<br/>first field value is:".$firstValue;
    $secondValue=intval($_GET["field2"]);
    echo "<br/>second field value is:".$secondValue;
    $thirdValue=intval($_GET["field3"]);
    echo  "<br/>third field value is:".$thirdValue;
    if($firstValue<$secondValue){
        for($i=$firstValue;$i<$secondValue;$i+=$thirdValue){
            echo "<br/>".$i;
        }
    }
    else{
        for($i=$firstValue;$i>$secondValue;$i-=$thirdValue){
            echo "<br/>".$i;
        }
    }
}
?>

</body>
</html>
