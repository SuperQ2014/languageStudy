<?php
/**
 * Created by PhpStorm.
 *Test from:
 *http://www.mianwww.com/html/2014/05/21192.html
 *author:chaoqiang
 * Date: 15-7-19
 * Time: 下午10:42
 */
echo "Welcome to this form, your name is " . $_POST["name"];
echo "<br>" . "And your title is " . $_POST["title"];
echo "<br>" . "Your body is " . $_POST["body"];

$fp = fopen("/tmp/text_data.txt", "a");
if($fp) {
    $count = 0;
    while(1) {
        $flag = fwrite($fp, $_POST["name"] . " " . $_POST["title"] . " " . $_POST["body"] . "\r\n");
        $count ++;
        if(!$flag) {
            echo "写入文件失败<br>";
            break;
        }
    }
}
fclose($fp);