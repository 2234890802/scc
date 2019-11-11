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
  `bed_id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键,床位id',
  `create_by` varchar(30) DEFAULT NULL COMMENT '创建者',
  `create_date` date DEFAULT NULL COMMENT '创建时间',
  `update_by` varchar(30) DEFAULT NULL COMMENT '更新者',
  `update_date` date DEFAULT NULL COMMENT '更新时间',
  `remarks` varchar(300) DEFAULT NULL COMMENT '备注信息',
  `del_flag` varchar(30) DEFAULT NULL COMMENT '逻辑删除标记（0：显示；1：隐藏）',
  `room_number` varchar(30) DEFAULT NULL COMMENT '房间号码',
  `bed_status` varchar(30) DEFAULT NULL COMMENT '床位状态',
  `position_type` varchar(30) DEFAULT NULL COMMENT '类型',
  `name` varchar(30) DEFAULT NULL COMMENT '名称',
  `sort` varchar(30) DEFAULT NULL COMMENT '排序',
  PRIMARY KEY (`bed_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `bed` */

/*Table structure for table `check_in` */

DROP TABLE IF EXISTS `check_in`;

CREATE TABLE `check_in` (
  `check_in_id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键，入住记录id',
  `create_by` varchar(30) DEFAULT NULL COMMENT '创建者',
  `create_date` date DEFAULT NULL COMMENT '创建时间',
  `update_by` varchar(30) DEFAULT NULL COMMENT '更新者',
  `update_date` date DEFAULT NULL COMMENT '更新时间',
  `remarks` varchar(300) DEFAULT NULL COMMENT '备注信息',
  `del_flag` varchar(30) DEFAULT NULL COMMENT '逻辑删除标记（0：显示；1：隐藏）',
  `customer_name` varchar(30) DEFAULT NULL COMMENT '客户姓名',
  `customer_age` bigint(20) DEFAULT NULL COMMENT '年龄',
  `customer_sex` varchar(30) DEFAULT NULL COMMENT '性别',
  `id_card` varchar(30) DEFAULT NULL COMMENT '身份证号',
  `room_number` varchar(30) DEFAULT NULL COMMENT '房间号',
  `building_number` varchar(30) DEFAULT NULL COMMENT '所属楼房',
  `record_id` varchar(30) DEFAULT NULL COMMENT '档案号',
  `elder_type` varchar(30) DEFAULT NULL COMMENT '老人类型',
  `check_in_date` date DEFAULT NULL COMMENT '入住时间',
  `expiration_date` date DEFAULT NULL COMMENT '合同到期时间',
  `contact_tel` varchar(30) DEFAULT NULL COMMENT '联系电话',
  `bed_id` bigint(20) DEFAULT NULL COMMENT '床号',
  `psychosomaticstate` varchar(300) DEFAULT NULL COMMENT '身心状况',
  `attention` varchar(300) DEFAULT NULL COMMENT '注意事项',
  `birthday` date DEFAULT NULL COMMENT '出生日期',
  `height` varchar(30) DEFAULT NULL COMMENT '身高',
  `marital_status` varchar(30) DEFAULT NULL COMMENT '婚姻状况',
  `weight` varchar(30) DEFAULT NULL COMMENT '体重',
  `blood_type` varchar(30) DEFAULT NULL COMMENT '血型',
  `file_path` varchar(300) DEFAULT NULL COMMENT '头像路径',
  PRIMARY KEY (`check_in_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `check_in` */

/*Table structure for table `customer_bed` */

DROP TABLE IF EXISTS `customer_bed`;

CREATE TABLE `customer_bed` (
  `customer_bed_id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `create_by` varchar(30) DEFAULT NULL COMMENT '创建者',
  `create_date` date DEFAULT NULL COMMENT '创建时间',
  `update_by` varchar(30) DEFAULT NULL COMMENT '更新者',
  `update_date` date DEFAULT NULL COMMENT '更新时间',
  `remarks` varchar(300) DEFAULT NULL COMMENT '备注信息',
  `del_flag` varchar(30) DEFAULT NULL COMMENT '逻辑删除标记（0：显示；1：隐藏）',
  `customer_id` bigint(20) DEFAULT NULL COMMENT '客户ID',
  `nursing_id` bigint(20) DEFAULT NULL COMMENT '护理id',
  `nursing_time` date DEFAULT NULL COMMENT '护理时间',
  `nursing_content` varchar(300) DEFAULT NULL COMMENT '护理内容',
  `nursing_count` bigint(20) DEFAULT NULL COMMENT '护理数量',
  `staff_id` bigint(20) DEFAULT NULL COMMENT '护理人员ID',
  PRIMARY KEY (`customer_bed_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `customer_bed` */

/*Table structure for table `foods` */

DROP TABLE IF EXISTS `foods`;

CREATE TABLE `foods` (
  `food_id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键,食品id',
  `create_by` varchar(30) DEFAULT NULL COMMENT '创建者',
  `create_date` date DEFAULT NULL COMMENT '创建时间',
  `update_by` varchar(30) DEFAULT NULL COMMENT '更新者',
  `update_date` date DEFAULT NULL COMMENT '更新时间',
  `remarks` varchar(300) DEFAULT NULL COMMENT '备注信息',
  `del_flag` varchar(30) DEFAULT NULL COMMENT '逻辑删除标记（0：显示；1：隐藏）',
  `food_name` varchar(30) DEFAULT NULL COMMENT '食品名称',
  `food_type` varchar(30) DEFAULT NULL COMMENT '食品类别',
  `food_tag` varchar(30) DEFAULT NULL COMMENT '食品标签',
  `food_price` decimal(10,2) DEFAULT NULL COMMENT '食品价格',
  `food_picture` varchar(300) DEFAULT NULL COMMENT '食品图片',
  `momal_flag` varchar(30) DEFAULT NULL COMMENT '是否清真',
  `supply_week` varchar(30) DEFAULT NULL COMMENT '供应星期，1234567',
  `supply_type` varchar(30) DEFAULT NULL COMMENT '供应类型 1：早餐；2午餐；3晚餐',
  PRIMARY KEY (`food_id`)
) ENGINE=BLACKHOLE DEFAULT CHARSET=utf8;

/*Data for the table `foods` */

/*Table structure for table `meals` */

DROP TABLE IF EXISTS `meals`;

CREATE TABLE `meals` (
  `meal_id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `create_by` varchar(30) DEFAULT NULL COMMENT '创建者,膳食id',
  `create_date` date DEFAULT NULL COMMENT '创建时间',
  `update_by` varchar(30) DEFAULT NULL COMMENT '更新者',
  `update_date` date DEFAULT NULL COMMENT '更新时间',
  `remarks` varchar(300) DEFAULT NULL COMMENT '备注信息',
  `del_flag` varchar(30) DEFAULT NULL COMMENT '逻辑删除标记（0：显示；1：隐藏）',
  `customer_id` bigint(20) DEFAULT NULL COMMENT '客户ID',
  `food_id` bigint(20) DEFAULT NULL COMMENT '膳食ID',
  `food_date` date DEFAULT NULL COMMENT '膳食日期',
  `food_week` varchar(30) DEFAULT NULL COMMENT '膳食星期',
  PRIMARY KEY (`meal_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `meals` */

/*Table structure for table `nursing` */

DROP TABLE IF EXISTS `nursing`;

CREATE TABLE `nursing` (
  `nursing_id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键,护理id',
  `create_by` varchar(30) DEFAULT NULL COMMENT '创建者',
  `create_date` date DEFAULT NULL COMMENT '创建时间',
  `update_by` varchar(30) DEFAULT NULL COMMENT '更新者',
  `update_date` date DEFAULT NULL COMMENT '更新时间',
  `remarks` varchar(300) DEFAULT NULL COMMENT '备注',
  `del_flag` varchar(30) DEFAULT NULL COMMENT '逻辑删除标记（0：显示；1：隐藏）',
  `nursing_name` varchar(30) DEFAULT NULL COMMENT '名称',
  `nursing_price` decimal(10,2) DEFAULT NULL COMMENT '价格',
  `describe` varchar(300) DEFAULT NULL COMMENT '描述',
  `increment_flag` varchar(30) DEFAULT NULL COMMENT '是否增值服务',
  `status` varchar(30) DEFAULT NULL COMMENT '状态 1：启用；2：停用',
  PRIMARY KEY (`nursing_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `nursing` */

/*Table structure for table `nursing_level` */

DROP TABLE IF EXISTS `nursing_level`;

CREATE TABLE `nursing_level` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `create_by` varchar(30) DEFAULT NULL COMMENT '创建者',
  `create_date` date DEFAULT NULL COMMENT '创建时间',
  `update_by` varchar(30) DEFAULT NULL COMMENT '更新者',
  `update_date` date DEFAULT NULL COMMENT '更新时间',
  `remarks` varchar(300) DEFAULT NULL COMMENT '备注信息',
  `del_flag` varchar(30) DEFAULT NULL COMMENT '逻辑删除标记（0：显示；1：隐藏）',
  `level_name` varchar(30) DEFAULT NULL COMMENT '护理级别',
  `level_status` varchar(30) DEFAULT NULL COMMENT '级别状态 1：启用；2：停用',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `nursing_level` */

/*Table structure for table `nursing_record` */

DROP TABLE IF EXISTS `nursing_record`;

CREATE TABLE `nursing_record` (
  `nursing_record_id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `create_by` varchar(30) DEFAULT NULL COMMENT '创建者',
  `create_date` date DEFAULT NULL COMMENT '创建时间',
  `update_by` varchar(30) DEFAULT NULL COMMENT '更新者',
  `update_date` date DEFAULT NULL COMMENT '更新时间',
  `remarks` varchar(300) DEFAULT NULL COMMENT '备注信息',
  `del_flag` varchar(30) DEFAULT NULL COMMENT '逻辑删除标记（0：显示；1：隐藏）',
  `customer_id` bigint(20) DEFAULT NULL COMMENT '客户ID',
  `nursing_id` bigint(20) DEFAULT NULL COMMENT '护理ID',
  `nursing_time` date DEFAULT NULL COMMENT '护理时间',
  `nursing_content` varchar(300) DEFAULT NULL COMMENT '护理内容',
  `nursing_count` bigint(20) DEFAULT NULL COMMENT '护理数量',
  `staff_id` bigint(20) DEFAULT NULL COMMENT '护理人员ID',
  PRIMARY KEY (`nursing_record_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `nursing_record` */

/*Table structure for table `outgoing` */

DROP TABLE IF EXISTS `outgoing`;

CREATE TABLE `outgoing` (
  `outgoing_id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `create_by` varchar(30) DEFAULT NULL COMMENT '创建者',
  `create_date` date DEFAULT NULL COMMENT '创建时间',
  `update_by` varchar(30) DEFAULT NULL COMMENT '更新者',
  `update_date` date DEFAULT NULL COMMENT '更新时间',
  `remarks` varchar(300) DEFAULT NULL COMMENT '备注信息',
  `del_flag` varchar(30) DEFAULT NULL COMMENT '逻辑删除标记（0：显示；1：隐藏）',
  `customer_id` bigint(20) DEFAULT NULL COMMENT '客户ID',
  `outgoing_reason` varchar(200) DEFAULT NULL COMMENT '外出原因',
  `outgoing_time` date DEFAULT NULL COMMENT '外出时间',
  `expectedreturn_time` date DEFAULT NULL COMMENT '预计回院时间',
  `actualreturn_time` date DEFAULT NULL COMMENT '实际回院时间',
  `escorted` varchar(30) DEFAULT NULL COMMENT '陪同人',
  `relation` varchar(30) DEFAULT NULL COMMENT '与老人关系',
  `phone` varchar(30) DEFAULT NULL COMMENT '陪同人电话',
  `audit_status` varchar(30) DEFAULT NULL COMMENT '审批状态',
  `audit_person` varchar(30) DEFAULT NULL COMMENT '审批人',
  `audit_time` date DEFAULT NULL COMMENT '审批时间',
  PRIMARY KEY (`outgoing_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `outgoing` */

/*Table structure for table `retreat` */

DROP TABLE IF EXISTS `retreat`;

CREATE TABLE `retreat` (
  `retreat_id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `create_by` varchar(30) DEFAULT NULL COMMENT '创建者',
  `create_date` date DEFAULT NULL COMMENT '创建时间',
  `update_by` varchar(30) DEFAULT NULL COMMENT '更新者',
  `update_date` date DEFAULT NULL COMMENT '更新时间',
  `remarks` varchar(300) DEFAULT NULL COMMENT '备注信息',
  `del_flag` varchar(30) DEFAULT NULL COMMENT '逻辑删除标记（0：显示；1：隐藏）',
  `customer_id` bigint(20) DEFAULT NULL COMMENT '客户ID',
  `retreat_time` date DEFAULT NULL COMMENT '退住时间',
  `retreat_type` varchar(30) DEFAULT NULL COMMENT '退住类型',
  `retreat_reason` varchar(300) DEFAULT NULL COMMENT '退住原因',
  `status` varchar(30) DEFAULT NULL COMMENT '状态',
  `ask_time` date DEFAULT NULL COMMENT '申请时间',
  `audit_opinion` varchar(30) DEFAULT NULL COMMENT '审核意见',
  `audit_person` varchar(30) DEFAULT NULL COMMENT '审核人',
  `audit_time` date DEFAULT NULL COMMENT '审核时间',
  PRIMARY KEY (`retreat_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `retreat` */

/*Table structure for table `service` */

DROP TABLE IF EXISTS `service`;

CREATE TABLE `service` (
  `service_id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键,服务关注id',
  `create_by` varchar(30) DEFAULT NULL COMMENT '创建者',
  `create_date` date DEFAULT NULL COMMENT '创建时间',
  `update_by` varchar(30) DEFAULT NULL COMMENT '更新者',
  `update_date` date DEFAULT NULL COMMENT '更新时间',
  `remarks` varchar(300) DEFAULT NULL COMMENT '备注信息',
  `del_flag` varchar(30) DEFAULT NULL COMMENT '逻辑删除标记（0：显示；1：隐藏）',
  `customer_id` bigint(20) DEFAULT NULL COMMENT '客户ID',
  `nursing_id` bigint(30) DEFAULT NULL COMMENT '护理ID',
  `amount` bigint(20) DEFAULT NULL COMMENT '购买数量',
  `maturity_time` date DEFAULT NULL COMMENT '服务到期日',
  `buy_time` date DEFAULT NULL COMMENT '服务购买日',
  `other_info` varchar(300) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`service_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `service` */

/*Table structure for table `staff` */

DROP TABLE IF EXISTS `staff`;

CREATE TABLE `staff` (
  `staff_id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键，职工id',
  `create_by` varchar(30) DEFAULT NULL COMMENT '创建者',
  `create_date` date DEFAULT NULL COMMENT '创建时间',
  `update_by` varchar(30) DEFAULT NULL COMMENT '更新者',
  `update_date` date DEFAULT NULL COMMENT '更新时间',
  `remarks` varchar(300) DEFAULT NULL COMMENT '备注信息',
  `del_flag` varchar(30) DEFAULT NULL COMMENT '逻辑删除标记（0：显示；1：隐藏）',
  `staff_name` varchar(30) DEFAULT NULL COMMENT '姓名',
  `staff_sex` varchar(30) DEFAULT NULL COMMENT '性别',
  `staff_age` varchar(200) DEFAULT NULL COMMENT '年龄',
  `staff_type` varchar(30) DEFAULT NULL COMMENT '员工类别',
  `entry_date` date DEFAULT NULL COMMENT '入职时间',
  `operate_name` varchar(30) DEFAULT NULL COMMENT '操作人',
  `duty` varchar(30) DEFAULT NULL COMMENT '职务',
  `positional_title` varchar(30) DEFAULT NULL COMMENT '职称',
  `brief` varchar(300) DEFAULT NULL COMMENT '简介',
  `phone` varchar(30) DEFAULT NULL COMMENT '手机号码',
  PRIMARY KEY (`staff_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `staff` */

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
