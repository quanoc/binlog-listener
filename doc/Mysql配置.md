### 1. mysql 相关

grant REPLICATION CLIENT on *.* to 'qsf'@'%';
grant REPLICATION SLAVE on *.* to 'qsf'@'%';
flush privileges;

### 2. 查看是否开启binlog

show variables like 'log_%'; 

### 3. 查看所有binlog日志列表
show master logs;

### 4. 查看master状态，即最后(最新)一个binlog日志的编号名称，及其最后一个操作事件pos结束点(Position)值
