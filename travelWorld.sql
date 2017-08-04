
--用户表
create table users(
  usid number(20) primary key,
  uname varchar2(100) not null,
  upwd varchar2(200) not null,
  email varchar2(20) unique,
  photo varchar2(100) 
)
create sequence seq_users_usid start with 1001;
--管理员
create table admin(
  aid number(20) primary key,
  aname   varchar2(100) not null,
  apwd  varchar2(200) not null
)
create sequence seq_admin_aid start with 1001;
--景点
create table attractions(
  aid  number(20) primary key,--主键
  address varchar2(100) not null,--景点地址
  atype varchar2(100) not null,--景点类型
  apic varchar2(200) not null,--图片
  aname varchar2(200) not null,
  aprice number(20) not null,--价格
  adprice number(20), --折扣价格
  amark  varchar2(200) not null, --简介
  acomment varchar2(200) not null,--点评????
  adate varchar2(100),--最佳旅游日期
  atotaltime number(20),--几日游    
  agivethethoumbsup number(10),--点赞数
  abrowsernum number(10)--游览次数
 )  
create sequence seq_attractions_aid start with 1001;
--美食关联景点
 create table food(
  fid  number(20) primary key,
  aid number(20)
      constraint FK_food_attractions_aid references attractions(aid),  --关联景点aid
  fpic varchar2(200) not null,--图片
  fname varchar2(200) not null,--名字
  fprice number(20),--价格
  fdprice number(20),--折扣价格
  fmark varchar2(2000) not null,--简介
  fdate varchar2(50) not null, --使用期限  
  fdeadline varchar2(50) not null --最后期限
)
create sequence seq_food_fid start with 1001;

--酒店关联景点
create table hotel(
  hid   number(20) primary key,
  aid number(20)
      constraint FK_hotel_attractions_aid references attractions(aid), --关联景点aid
  hpic varchar2(200) not null,--图片
  hname varchar2(200) not null,--名字
  htype varchar2(200) not null,--房间类型
  fprice number(20),--价格
  fdpricr number(20),--折扣价格
  hmark varchar2(200) not null,--简介
  hdate varchar2(50) not null,--使用期限  
  hdeadline varchar2(50) not null,--最后期限
  hgivethethoumbsup number(20),--点赞数
  hbrowsernum number(20)--游览次数
  )
  create sequence seq_hotel_hid start with 1001;


--景点订单--关联景点--关联用户
create table attrorder(
  aoid number(20) primary key,
  aid number(20)
      constraint FK_attrorder_attractions_aid references attractions(aid),--关联景点aid
  usid number(20)
      constraint FK_attrorder_users_usid references users(usid),--关联用户usid
  adate varchar2(50) not null,--购买日期
  aonum number(20) not null,--数量  
  aoprice number(20) not null,--单份购买价格
  aostatus number(20) not null,--状态
  aodescr varchar2(200)-- 备注
)
create sequence seq_attrorder_aoid start with 1001;
--美食订单--关联景点--关联用户
create table foodorder(
  foid number(20) primary key,
  aid number(20)
      constraint FK_foodorder_attractions_aid references attractions(aid),--关联景点aid
  usid number(20)
      constraint FK_foodorder_users_usid references users(usid),--关联用户usid
  fodate varchar2(50) not null,--日期
  fonum number(20) not null,--数量  
  foprice number(20) not null,--单份购买价格
  fostatus number(20) not null,--状态
  fototal  number(20) not null,--总价格
  fodescr varchar2(200)-- 备注
)
create sequence seq_foodorder_foid start with 1001;

--酒店订单--关联景点--关联用户
create table hotelorder(
  hoid number(20) primary key,
  aid number(20)
      constraint FK_hotelorder_attractions_aid references attractions(aid),--关联景点aid
  usid number(20)
      constraint FK_hoteorder_users_usid references users(usid),--关联用户usid
  hodate  varchar2(50) not null,--日期
  honum number(20) not null,--数量  
  hoprice number(20) not null,--单份购买价格
  hostatus number(20) not null,--状态
  hototal  number(20) not null,--总价格
  hodescr varchar2(200)--备注
)
create sequence seq_hotelorder_hoid start with 1001;


--游记-- 关联用户表--关联景点
create table travels(
  tid  number(20) primary key,
  aid number(20)
      constraint FK_travels_attractions_aid references attractions(aid),--关联用户表
  usid number(20)
      constraint FK_travels_users_usid references users(usid),--关联景点表
  tsubject varchar2(200) not null, --主题
  tpreface varchar2(2000) not null,--前言
  tcontent clob not null,--内容
  tgivethethoumbsup  number(20) not null,--点赞数
  tdate not null--上传日期
)
create sequence seq_travels_tid start with 1001;


create table comments(
       cid number(10) primary key,
       usid number(20)
           constraint FK_comment_users_usid references usersi(usid),
       cdate varchar2(50) not null , --日期
       ctype varchar2(20), --类型
       temp varchar2(1000) --内容
)
create sequence seq_comments_cid start with 1001;
