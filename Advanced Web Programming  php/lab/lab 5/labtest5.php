<?php session_start();?>
<html>
<head>
    <title>labtest 5</title>
</head>
<body>
<?php

setcookie("nextClass","next class: monday november 14 2016 11 am",time() + (86400 *365*10),"/");
echo ($_COOKIE["nextClass"]);

if(isset($_POST["change"])){
    $_SESSION["color"]=$_POST["color"];
}
?>
<div>
<form method="post" action="labtest5.php">
    <input name="color" />
<input type="submit" name="change" value="change color">
</form>
</div>
<div style="background-color: <?php if(isset($_SESSION["color"])){echo $_SESSION["color"];}?>">
    <h2>Part2 background color is <?php if(isset($_SESSION["color"])){echo $_SESSION["color"];}?></h2>
</div>

<div>
    <?php
    echo "Cookies<br/>";
    var_dump($_COOKIE);
    echo "<br/> Sessions<br/>";
    var_dump($_SESSION);
    show_source(__FILE__)
    ?>

</div>
</body>

</html>
