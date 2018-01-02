<?php
interface Color{
    public function fn();
     const con="Hello";
}
class cl implements  Color  {

    /**
     * cl constructor.
     */
    public function __construct()
    {
    }
    public $var;

    public function fn()
    {
        echo "<br>this is from function<br/>";
    }

}

echo show_source(__FILE__);

?>