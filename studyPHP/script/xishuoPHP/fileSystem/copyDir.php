<?php
/**
 * Created by PhpStorm.
 * User: Administrator
 * Date: 15-7-11
 * Time: 上午10:40
 */

function copyDir($dirSrc,$dirTo){
    if(is_file($dirTo)){                    //如果目标不是一个目录则退出
        echo "目标不是目录不能创建！！";
        return;
    }
    if(!file_exists($dirTo)){               //如果目标不存在，则创建目录
        mkdir($dirTo);
    }

    if($dir_handle = @opendir($dirSrc)){            //打开目录并判断是否成功
        while($filename = readdir($dir_handle)){    //循环遍历目录
            if($filename != "." && $filename != ".."){      //排除两个特殊目录
                $subSrcFile = $dirSrc . "/" . $filename;
                $subToFile = $dirTo . "/" . $filename;
                if(is_dir($subSrcFile))                     //如果是子目录，则递归
                    copyDir($subSrcFile,$subToFile);
                if(is_file($subSrcFile))                    //如果是文件，则使用copy直接拷贝
                    copy($subSrcFile,$subToFile);
            }
        }
        closedir($dir_handle);                                //最后记得一定要关闭目录句柄
    }
}

//测试
echo "复制目录开始";
copyDir("D:/study","E:/studyCopy");
echo "复制目录结束";

?>