drop table flower

create table flower(
id int(10) primary key auto_increment comment '编号',
name varchar(30) not null comment '花名',
price float not null comment '价格',
production varchar(30) not null comment '原产地'
);

insert into flower values(default,'矮牵牛',2.5,'阿根廷');
insert into flower values(default,'百日草',5.0,'墨西哥');
insert into flower values(default,'半枝莲',4.3,'巴西');