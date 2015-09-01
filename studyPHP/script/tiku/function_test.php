<?php
/**
 * Created by PhpStorm.
 * User: Administrator
 * Date: 15-7-21
 * Time: 上午10:02
 */
$os = array("Mac", "NT", "Irix", "Linux");
if(in_array("mac", $os)) {
    echo "Got mac";
}
if(in_array("NT", $os)) {
    echo "Got NT";
}
$a = array('1.10', 12.4, 1.13);
if(in_array(1.10, $a, true)) {
    echo "Got 1.10";                        //Strict mode not found
}
if(in_array(1.13, $a, true)) {
    echo "1.13 found with strict check \n"; //strict mode found
}
