/*
SQLyog v10.2 
MySQL - 5.7.13 : Database - scc
*********************************************************************
*/


/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`scc` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `scc`;

/*Table structure for table `bed` */

DROP TABLE IF EXISTS `bed`;

CREATE TABLE `bed` (
  `bed_id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '床位id',
  `room` varchar(30) DEFAULT NULL COMMENT '房间号',
  `floor` varchar(30) DEFAULT NULL COMMENT '所属楼房',
  `status` varchar(30) DEFAULT NULL COMMENT '床位状态，有人，无人',
  PRIMARY KEY (`bed_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `bed` */

/*Table structure for table `checkin` */

DROP TABLE IF EXISTS `checkin`;

CREATE TABLE `checkin` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '入住记录id',
  `customer_id` bigint(20) DEFAULT NULL COMMENT '客户id',
  `bed_id` bigint(20) DEFAULT NULL COMMENT '床位id',
  `bed_start` date DEFAULT NULL COMMENT '床位起始日期',
  `bed_end` date DEFAULT NULL COMMENT '床位结束日期',
  `remark` varchar(200) DEFAULT NULL COMMENT '床位详细信息',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `checkin` */

/*Table structure for table `customer` */

DROP TABLE IF EXISTS `customer`;

CREATE TABLE `customer` (
  `customer_id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '客户id',
  `customer_name` varchar(30) DEFAULT NULL COMMENT '客户姓名',
  `age` bigint(20) DEFAULT NULL COMMENT '年龄',
  `sex` varchar(30) DEFAULT NULL COMMENT '性别',
  `id_number` varchar(30) DEFAULT NULL COMMENT '身份证号',
  `bed_id` bigint(20) DEFAULT NULL COMMENT '床位id(只显示，不编辑）',
  `room` varchar(30) DEFAULT NULL COMMENT '房间号(只显示，不编辑）',
  `floor` varchar(30) DEFAULT NULL COMMENT '所属层(只显示，不编辑）',
  `file_no` varchar(30) DEFAULT NULL COMMENT '档案号',
  `customer_type` varchar(30) DEFAULT NULL COMMENT '老人类型',
  `bed_start` date DEFAULT NULL COMMENT '床位起始时间',
  `bed_end` date DEFAULT NULL COMMENT '床位结束日期',
  `phone` varchar(30) DEFAULT NULL COMMENT '联系电话',
  `birthday` date DEFAULT NULL COMMENT '出生日期',
  `high` bigint(20) DEFAULT NULL COMMENT '身高，cm',
  `wedlock` varchar(30) DEFAULT NULL COMMENT '婚姻状况，已婚未婚',
  `weight` bigint(20) DEFAULT NULL COMMENT '体重，kg',
  `blood` varchar(30) DEFAULT NULL COMMENT '血型，a b ab o',
  `photo` varchar(200) DEFAULT NULL COMMENT '头像',
  `remark` varchar(200) DEFAULT NULL COMMENT '备注信息',
  `status` varchar(30) DEFAULT NULL COMMENT '客户状态，在住未住外出',
  PRIMARY KEY (`customer_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `customer` */

/*Table structure for table `egress` */

DROP TABLE IF EXISTS `egress`;

CREATE TABLE `egress` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '外出记录id',
  `customer_id` bigint(20) DEFAULT NULL COMMENT '客户id',
  `egress_type` varchar(30) DEFAULT NULL COMMENT '退住类型，（保留床位，正常退住，岛内逛逛，其他）',
  `egress_date` date DEFAULT NULL COMMENT '外出时间',
  `back` date DEFAULT NULL COMMENT '预计回院时间',
  `companion` varchar(30) DEFAULT NULL COMMENT '陪同人',
  `relation` varchar(30) DEFAULT NULL COMMENT '与老人关系',
  `phone` varchar(30) DEFAULT NULL COMMENT '陪同人电话',
  `remark` varchar(200) DEFAULT NULL COMMENT '备注信息',
  `real_back` date DEFAULT NULL COMMENT '实际回院时间（new date）',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `egress` */

/*Table structure for table `employee` */

DROP TABLE IF EXISTS `employee`;

CREATE TABLE `employee` (
  `emp_id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '员工号',
  `emp_pwd` varchar(30) DEFAULT NULL COMMENT '密码',
  `emp_name` varchar(30) DEFAULT NULL COMMENT '姓名',
  `sex` varchar(30) DEFAULT NULL COMMENT '性别',
  `emp_type` varchar(30) DEFAULT NULL COMMENT '类型',
  `hiredate` date DEFAULT NULL COMMENT '入职日期',
  `duty` varchar(30) DEFAULT NULL COMMENT '职务',
  `duty_name` varchar(30) DEFAULT NULL COMMENT '职称',
  `phone` varchar(30) DEFAULT NULL COMMENT '手机号',
  `introduction` varchar(200) DEFAULT NULL COMMENT '简介',
  `remark` varchar(200) DEFAULT NULL COMMENT '备注',
  `power` varchar(30) DEFAULT NULL COMMENT '权限 管理员和员工',
  `status` varchar(30) DEFAULT NULL COMMENT '状态，在职和不在职',
  PRIMARY KEY (`emp_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `employee` */

/*Table structure for table `foods` */

DROP TABLE IF EXISTS `foods`;

CREATE TABLE `foods` (
  `food_id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '食品id',
  `food_name` varchar(30) DEFAULT NULL COMMENT '食品名称',
  `food_type` varchar(30) DEFAULT NULL COMMENT '食品类别',
  `tag` varchar(30) DEFAULT NULL COMMENT '食品标签',
  `price` decimal(10,2) DEFAULT NULL COMMENT '食品价格',
  `img` varchar(200) DEFAULT NULL COMMENT '食品图片',
  `steamed` varchar(30) DEFAULT NULL COMMENT '是否清蒸，是或否',
  `supply_day` varchar(30) DEFAULT NULL COMMENT '星期几供应，123456',
  `supply_type` varchar(30) DEFAULT NULL COMMENT '供应类型，早中晚餐',
  PRIMARY KEY (`food_id`)
) ENGINE=BLACKHOLE DEFAULT CHARSET=utf8;

/*Data for the table `foods` */

/*Table structure for table `meals` */

DROP TABLE IF EXISTS `meals`;

CREATE TABLE `meals` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '膳食记录',
  `customer_id` bigint(20) DEFAULT NULL COMMENT '客户id',
  `food_id` bigint(20) DEFAULT NULL COMMENT '食品id',
  `food_date` date DEFAULT NULL COMMENT '食品供应日期',
  `supply_day` varchar(30) DEFAULT NULL COMMENT '星期几供应，123456',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `meals` */

/*Table structure for table `nurrecord` */

DROP TABLE IF EXISTS `nurrecord`;

CREATE TABLE `nurrecord` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '护理记录id',
  `customer_id` bigint(20) DEFAULT NULL COMMENT '客户ID',
  `emp_id` bigint(20) DEFAULT NULL COMMENT '护理人员ID',
  `nursing_no` bigint(20) DEFAULT NULL COMMENT '护理项目ID',
  `nursing_end` datetime DEFAULT NULL COMMENT '护理结束时间',
  `remark` varchar(200) DEFAULT NULL COMMENT '护理内容',
  `nursing_num` bigint(20) DEFAULT NULL COMMENT '护理数量',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `nurrecord` */

/*Table structure for table `nursing` */

DROP TABLE IF EXISTS `nursing`;

CREATE TABLE `nursing` (
  `nursing_no` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '护理编号',
  `nursing_name` varchar(30) DEFAULT NULL COMMENT '护理名称',
  `price` decimal(10,2) DEFAULT NULL COMMENT '护理价格',
  `remark` varchar(200) DEFAULT NULL COMMENT '护理描述',
  `service` varchar(30) DEFAULT NULL COMMENT '增值服务,是否',
  `status` varchar(30) DEFAULT NULL COMMENT '护理状态，启用，禁用',
  PRIMARY KEY (`nursing_no`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `nursing` */

/*Table structure for table `retreat` */

DROP TABLE IF EXISTS `retreat`;

CREATE TABLE `retreat` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '退住记录id',
  `customer_id` bigint(20) DEFAULT NULL COMMENT '客户id',
  `retreat_type` varchar(30) DEFAULT NULL COMMENT '退住类型，（保留床位，正常退住，岛内逛逛，其他）',
  `reason` varchar(200) DEFAULT NULL COMMENT '退住原因',
  `retreat_date` date DEFAULT NULL COMMENT '退住时间',
  `apply_date` date DEFAULT NULL COMMENT '申请时间（new date）',
  `remark` varchar(200) DEFAULT NULL COMMENT '备注信息',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `retreat` */

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
