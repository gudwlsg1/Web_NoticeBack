use notice;

/*create table User(
  id bigint auto_increment primary key ,
  account varchar(50) not null unique,
  password varchar(100) not null,
  nickname varchar(255) not null,
  created datetime default current_timestamp,
  updated datetime on update current_timestamp
)engine=InnoDB default charset=utf8;

create table Post(
  id bigint auto_increment primary key,
  title varchar(255),
  content text,
  user_id bigint,
  created datetime default current_timestamp,
  updated datetime on update current_timestamp
)engine=InnoDB default charset=utf8;

create table Attach(
  id bigint auto_increment primary key,
  post_id bigint,
  filename varchar(100),
  filepath LONGBLOB
)engine=InnoDB default charset=utf8;

create table Comment(
  id bigint auto_increment primary key,
  user_id bigint,
  post_id bigint,
  content varchar(100),
  created datetime default current_timestamp,
  updated datetime on update current_timestamp
)engine=InnoDB default charset=utf8;*/
