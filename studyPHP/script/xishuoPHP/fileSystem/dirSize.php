<?php
/**
 * Created by PhpStorm.
 * User: Administrator
 * Date: 15-7-11
 * Time: 上午10:26
 */
function dirSize($directory){
    $dir_size = 0;                      //累加各种文件大小
    if($dir_handle = @opendir($directory)){    //打开目录，，并判断是否能成功打开,@使用不显示错误。
        while($filename = readdir($dir_handle)){    //循环遍历目录下的所有文件
            if($filename != "." &&  $filename != ".."){     //排除两个特殊的目录
                $subFile = $directory . "/" . $filename;    //将目录下的子文件和当前目录相连
                if(is_dir($subFile))                        //如果子文件是目录，则递归
                    $dir_size += dirSize($subFile);
                if(is_file($subFile))                       // 如果是文件，则直接计算filesize大小并累加
                    $dir_size += filesize($subFile);
            }
        }
        closedir($dir_handle);                  //最后一定要记得关闭文件句柄
        return $dir_size;                       //返回输入目录的大小，单位是byte
    }
}

$dir_size = dirSize("D:/study/asdfe");
echo round($dir_size/pow(1024,1),2) . "KB";