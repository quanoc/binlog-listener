
## binlog-listener实战


### 1. 开启binlog日志的方法
在my.cnf的[mysqld]下

```sbtshell
log-bin=mysql-bin
```


### 2. 问题
1. 在服务器配置serverId,那么 一个服务器可以有几个客户端使用binlog? 1个吗