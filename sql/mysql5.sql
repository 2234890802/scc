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
  `bedId` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '床位id',
  `room` varchar(30) DEFAULT NULL COMMENT '房间号',
  `floor` varchar(30) DEFAULT NULL COMMENT '所属楼房',
  `status` varchar(30) DEFAULT NULL COMMENT '床位状态，有人，无人',
  PRIMARY KEY (`bedId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `bed` */

/*Table structure for table `checkin` */

DROP TABLE IF EXISTS `checkin`;

CREATE TABLE `checkin` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '入住记录id',
  `cusId` bigint(20) DEFAULT NULL COMMENT '客户id',
  `bedStart` date DEFAULT NULL COMMENT '床位起始日期',
  `bedEnd` date DEFAULT NULL COMMENT '床位结束日期',
  `content` varchar(200) DEFAULT NULL COMMENT '床位详细信息',
  `bedId` bigint(20) DEFAULT NULL COMMENT '床位id',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `checkin` */

/*Table structure for table `customer` */

DROP TABLE IF EXISTS `customer`;

CREATE TABLE `customer` (
  `cusId` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '客户id',
  `cusName` varchar(30) DEFAULT NULL COMMENT '客户姓名',
  `age` bigint(20) DEFAULT NULL COMMENT '年龄',
  `sex` varchar(30) DEFAULT NULL COMMENT '性别',
  `idNumber` varchar(30) DEFAULT NULL COMMENT '身份证号',
  `bedId` bigint(20) DEFAULT NULL COMMENT '床位id(只显示，不编辑）',
  `room` varchar(30) DEFAULT NULL COMMENT '房间号(只显示，不编辑）',
  `floor` varchar(30) DEFAULT NULL COMMENT '所属层(只显示，不编辑）',
  `fileNo` varchar(30) DEFAULT NULL COMMENT '档案号',
  `type` varchar(30) DEFAULT NULL COMMENT '老人类型',
  `bedStart` date DEFAULT NULL COMMENT '床位起始时间',
  `bedEnd` date DEFAULT NULL COMMENT '床位结束日期',
  `phone` varchar(30) DEFAULT NULL COMMENT '联系电话',
  `birthday` date DEFAULT NULL COMMENT '出生日期',
  `high` bigint(20) DEFAULT NULL COMMENT '身高，cm',
  `wedlock` varchar(30) DEFAULT NULL COMMENT '婚姻状况，已婚未婚',
  `weight` bigint(20) DEFAULT NULL COMMENT '体重，kg',
  `blood` varchar(30) DEFAULT NULL COMMENT '血型，a b ab o',
  `photo` varchar(200) DEFAULT NULL COMMENT '头像',
  `remark` varchar(200) DEFAULT NULL COMMENT '备注信息',
  `status` varchar(30) DEFAULT NULL COMMENT '客户状态，在住未住外出',
  PRIMARY KEY (`cusId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `customer` */

/*Table structure for table `egress` */

DROP TABLE IF EXISTS `egress`;

CREATE TABLE `egress` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '外出记录id',
  `cusId` bigint(20) DEFAULT NULL COMMENT '客户id',
  `type` varchar(30) DEFAULT NULL COMMENT '退住类型，（保留床位，正常退住，岛内逛逛，其他）',
  `egrDate` date DEFAULT NULL COMMENT '外出时间',
  `back` date DEFAULT NULL COMMENT '预计回院时间',
  `companion` varchar(30) DEFAULT NULL COMMENT '陪同人',
  `relation` varchar(30) DEFAULT NULL COMMENT '与老人关系',
  `phone` varchar(30) DEFAULT NULL COMMENT '陪同人电话',
  `remark` varchar(200) DEFAULT NULL COMMENT '备注信息',
  `realBack` date DEFAULT NULL COMMENT '实际回院时间（new date）',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `egress` */

/*Table structure for table `employee` */

DROP TABLE IF EXISTS `employee`;

CREATE TABLE `employee` (
  `empId` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '员工号',
  `empPwd` varchar(30) DEFAULT NULL COMMENT '密码',
  `empName` varchar(30) DEFAULT NULL COMMENT '姓名',
  `sex` varchar(30) DEFAULT NULL COMMENT '性别',
  `empType` varchar(30) DEFAULT NULL COMMENT '类型',
  `hiredate` date DEFAULT NULL COMMENT '入职日期',
  `duty` varchar(30) DEFAULT NULL COMMENT '职务',
  `dutyName` varchar(30) DEFAULT NULL COMMENT '职称',
  `phone` varchar(30) DEFAULT NULL COMMENT '手机号',
  `introduction` varchar(200) DEFAULT NULL COMMENT '简介',
  `remark` varchar(200) DEFAULT NULL COMMENT '备注',
  `power` varchar(30) DEFAULT NULL COMMENT '权限 管理员和员工',
  `status` varchar(30) DEFAULT NULL COMMENT '状态，在职和不在职',
  PRIMARY KEY (`empId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `employee` */

/*Table structure for table `foods` */

DROP TABLE IF EXISTS `foods`;

CREATE TABLE `foods` (
  `foodId` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '食品id',
  `foodName` varchar(30) DEFAULT NULL COMMENT '食品名称',
  `type` varchar(30) DEFAULT NULL COMMENT '食品类别',
  `label` varchar(30) DEFAULT NULL COMMENT '食品标签',
  `price` decimal(10,2) DEFAULT NULL COMMENT '食品价格',
  `img` varchar(200) DEFAULT NULL COMMENT '食品图片',
  `steamed` varchar(30) DEFAULT NULL COMMENT '是否清蒸，是或否',
  `supplyDay` varchar(30) DEFAULT NULL COMMENT '星期几供应，123456',
  `supplyType` varchar(30) DEFAULT NULL COMMENT '供应类型，早中晚餐',
  PRIMARY KEY (`foodId`)
) ENGINE=BLACKHOLE DEFAULT CHARSET=utf8;

/*Data for the table `foods` */

/*Table structure for table `meals` */

DROP TABLE IF EXISTS `meals`;

CREATE TABLE `meals` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '膳食记录',
  `cusId` bigint(20) DEFAULT NULL COMMENT '客户id',
  `foodId` bigint(20) DEFAULT NULL COMMENT '食品id',
  `foodDate` date DEFAULT NULL COMMENT '食品供应日期',
  `supplyDay` varchar(30) DEFAULT NULL COMMENT '星期几供应，123456',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `meals` */

/*Table structure for table `nursecord` */

DROP TABLE IF EXISTS `nursecord`;

CREATE TABLE `nursecord` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '护理记录id',
  `cusId` bigint(20) DEFAULT NULL COMMENT '客户ID',
  `nurNo` bigint(20) DEFAULT NULL COMMENT '护理项目ID',
  `nurEnd` datetime DEFAULT NULL COMMENT '护理结束时间',
  `describe` varchar(200) DEFAULT NULL COMMENT '护理内容',
  `number` bigint(20) DEFAULT NULL COMMENT '护理数量',
  `empid` bigint(20) DEFAULT NULL COMMENT '护理人员ID',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `nursecord` */

/*Table structure for table `nursing` */

DROP TABLE IF EXISTS `nursing`;

CREATE TABLE `nursing` (
  `nurNo` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '护理编号',
  `nurName` varchar(30) DEFAULT NULL COMMENT '护理名称',
  `price` decimal(10,2) DEFAULT NULL COMMENT '护理价格',
  `describe` varchar(200) DEFAULT NULL COMMENT '护理描述',
  `service` varchar(30) DEFAULT NULL COMMENT '增值服务,是否',
  `status` varchar(30) DEFAULT NULL COMMENT '护理状态，启用，禁用',
  PRIMARY KEY (`nurNo`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `nursing` */

/*Table structure for table `retreat` */

DROP TABLE IF EXISTS `retreat`;

CREATE TABLE `retreat` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '退住记录id',
  `cusId` bigint(20) DEFAULT NULL COMMENT '客户id',
  `type` varchar(30) DEFAULT NULL COMMENT '退住类型，（保留床位，正常退住，岛内逛逛，其他）',
  `reason` varchar(200) DEFAULT NULL COMMENT '退住原因',
  `retDate` date DEFAULT NULL COMMENT '退住时间',
  `applyDate` date DEFAULT NULL COMMENT '申请时间（new date）',
  `remark` varchar(200) DEFAULT NULL COMMENT '备注信息',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `retreat` */

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
