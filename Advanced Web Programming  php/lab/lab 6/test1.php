<?php
class MyClass{
  public  $variable;
    public static $st=123;


    public function __construct($variable)
    {
        $this->$variable = "This is a bloody value";
    }

    /**
     * @param int $st
     */
    public static function setSt($st)
    {
        self::$variable = $st;
    }

}

$obj=new MyClass();
$obj::setSt(43);
echo "<br/>".$obj::$st."<br/>";
var_dump($obj);

echo show_source(__FILE__);

?>