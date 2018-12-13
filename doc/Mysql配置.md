### 1. mysql 相关

grant REPLICATION CLIENT on *.* to 'qsf'@'%';
grant REPLICATION SLAVE on *.* to 'qsf'@'%';
flush privileges;

- 应用级别授权

```mysql
grant all privileges on pig.* to qsf@'%' identified by '1234';
flush privileges;
```


### 2. 查看是否开启binlog

show variables like 'log_%'; 

### 3. 查看所有binlog日志列表
show master logs;

### 4. 查看master状态，即最后(最新)一个binlog日志的编号名称，及其最后一个操作事件pos结束点(Position)值


## mysql 安装

apt install mysql-server-5.7

安装完成之后

- 创建用户并授权
- 开启binlog日志
- 授予复制权限(具体什么含义)