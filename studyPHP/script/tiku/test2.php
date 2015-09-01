<?php
/**
 * Created by PhpStorm.
 * User: Chaoqiang
 * Link:http://www.mianwww.com/html/2014/04/20533.html
 * Date: 15-7-20
 * Time: 上午8:26
 */
header("Content-type: text/html; charset=utf-8");
echo date_default_timezone_get() . "<br>";
date_default_timezone_set("Asia/Shanghai");
echo date_default_timezone_get() . "<br>";
echo '现在的时间time()显示是: ' . date('Y-m-d H:i:s', time()) . "<br>";
$time = time() - 60*60*24*2;
echo '前天的时间time()显示是: ' . date('Y-m-d H:i:s', $time) . "<br>";

$name=print "nihao" . "<br>";
echo '$name is ' . $name . "<br>";
$str = 'test print value is $name .';
print '$str is ' . $str . "<br>";
eval("\$print = \"$str\";");
echo $print . "<br>";
echo "Test var_dump and print_r: " . "<br>";
$testArray = array(
    "string1",
    "key1" => "value1",
    4,
    1,
    array(
        "key2" => "value2",
        "string2",
    )
);
echo "Using var_dump:" . "<br>";
var_dump($testArray);
echo "<br>" . "Using print_r:" . "<br>";
print_r($testArray);

//字符串翻转
$strOrigin = 'asdfg';
echo $strReverse = strrev($strOrigin);


//判断程序输出
//Test 1
class myClass {
var  $empty = '';      //var相当于class里面的public，常用于PHP4以下版本，PHP5版本及以上版本不用，public代替之
var $null = NULL;
var $bool = FALSE;
var $notSet;
var $array = array();
}
$myClass1 = new myClass();
//Test 2
$a = 'hello';
$b = &$a;
unset($b);
$b = 'world';
echo "<br>" . $a . "<br>";

function &test() {
    static $b = 0;
    $b = $b + 1;
    echo $b;
    return $b;
}
$a =  test();
$a = 5;
$a = test();
$a = &test();
$a = 5;
$a = test();

class talker {
    private $data = 'Hi';
    public function & get() {
        return $this -> data;
    }
    public function out() {
        echo $this -> data;
    }
}
$aa = new talker();
$d = &$aa -> get();
$aa -> out();
$d = 'How';
$aa -> out();
$d = 'Are';
$aa -> out();
$d = 'You';
$aa -> out();

//Test the reference
/*
 * link:http://php.net/manual/en/language.references.whatdo.php
 * time:2015/07/21 9:40
 */
function modify($obj) {
    $obj -> hello = 'world (modified)!';    //only alter the object's state(properties)
}
$obj1 -> hello = 'world';
modify($obj1);
var_dump($obj1 -> hello);        //string 'world (modified)!' (length=17)
function modify_other($obj) {
    $obj = 442;                 //Cannot alter the whole object into a new object
}
$obj2 -> hello = 'world';
modify_other($obj2);
var_dump($obj2 -> hello);       //string 'world' (length=5)
function modify_other2(&$obj) {     //Using reference can alter the whole object
    $obj = 442;
}
$obj3 -> hello = 'world';
modify_other2($obj3);
var_dump($obj3);   //int 442

function foo(&$var) {

}
foo($testNull);
var_dump($testNull);   //null
$testArray = array();
foo($testArray['b']);
var_dump(array_key_exists('b',$testArray)); //boolean true
$c = new StdClass;
foo($c -> d);
var_dump(property_exists($c,'d'));  //boolean true