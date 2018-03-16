
## 出处声明：[https://ahangchen.gitbooks.io/windy-afternoon/content/kit/git/green_blush.html](https://ahangchen.gitbooks.io/windy-afternoon/content/kit/git/green_blush.html)
## 最终效果图：

![love.jpg](http://upload-images.jianshu.io/upload_images/2761819-b8475fb1e47d1630.jpg?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)
## 开发环境：
Windows
python3
## 开始：
###### 步骤一：
安装python3，下载地址：[www.python.org](http://www.python.org/)
安装注意事项：注意选中add python to path，不然要手动添加环境变量，安装之后cmd输入python，如下图表示成功：

![QQ截图20160819140559.jpg](http://upload-images.jianshu.io/upload_images/2761819-6567869606030c83.jpg?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)
###### 步骤二：
github中新建工程，clone到本地，新建zero.md文件，将https://github.com/ahangchen/green
![QQ截图20160819141816.jpg](http://upload-images.jianshu.io/upload_images/2761819-c44874576b641357.jpg?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)
工程中的文件拷贝到本地目录下。
###### 步骤三：
修改代码中的路径和时间
green.py
```
import datetime
import os

# from heavy import special_commit


def modify():
    file = open('D:\GIthubWorkspace\Love-master\zero.md', 'r')第一个参数改为zero.md所在的路径
    flag = int(file.readline()) == 0
    file.close()
    file = open('D:\GIthubWorkspace\Love-master\zero.md', 'w+')
    if flag:
        file.write('1')
    else:
        file.write('0')
        file.close()


def commit():
    os.system('git commit -a -m "test"')


def set_sys_time(year, month, day):
    os.system('date %04d/%02d/%02d' % (year, month, day))


def trick_commit(year, month, day):
    set_sys_time(year, month, day)
    modify()
    commit()


def daily_commit(start_date, end_date):
    for i in range((end_date - start_date).days + 1):
        cur_date = start_date + datetime.timedelta(days=i)
        trick_commit(cur_date.year, cur_date.month, cur_date.day)


if __name__ == '__main__':
    daily_commit(datetime.date(2015, 5, 16), datetime.date(2016, 7, 16))第一个参数为开始日期（小绿点表格左上），第二个结束日期（小绿点表格右下）

```
heavy.py
```
import datetime
import os

from green import set_sys_time, commit


def modify_other(path):
    file = open(path, 'r')
    flag = int(file.readline()) == 0
    file.close()
    file = open(path, 'w+')
    if flag:
        file.write('1')
    else:
        file.write('0')
        file.close()


def hard_commit(path, year, month, day, times):
    set_sys_time(year, month, day)
    while times > 0:
        modify_other(path)
        os.chdir(os.path.dirname(path))
        commit()
        times -= 1


def special_commit(path, date, times):
    hard_commit(path, date.year, date.month, date.day, times)


def read_etc(path):
    idxes = []
    file = open(path, 'r')
    while True:
        word = file.readline()
        if not word:
            break
        else:
            idxes.extend(word.split())
    intIdxes = []
    for idx in idxes:
        intIdxes.append(int(idx))
    return intIdxes


def love_commit(start_date, path, etc_path):
    words = read_etc(etc_path)
    for index in words:
        cur_date = start_date + datetime.timedelta(days=index)
        special_commit(path, cur_date, 15)


if __name__ == '__main__':
    love_commit(datetime.date(2015, 8, 16), 'D:\GIthubWorkspace\Love-master\zero.md', 'D:\GIthubWorkspace\Love-master\etc\love')
	第一个参数为开始日期（小绿点表格左上），第二个参数为zero.md所在路劲，第三个为love文件所在路径
```
##### 步骤四：
cmd进入工程所在目录
>git add *
>git commit -m "test"

![QQ截图20160819142915.jpg](http://upload-images.jianshu.io/upload_images/2761819-e5b88676ca563df2.jpg?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)
>python green.py 添加浅色的小绿点
>git push origin master

将系统时间修改为当前时间，登录github查看效果
>python heavy.py 根据love中记录的位置添加深色的小绿点
>git push origin master

将系统时间修改为当前时间，登录github查看效果

>小白程序员一枚，github搬运工- -！


