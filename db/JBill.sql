/*
SQLyog v10.2 
MySQL - 5.7.25 : Database - jbill
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`jbill` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `jbill`;

/*Table structure for table `student` */

DROP TABLE IF EXISTS `student`;

CREATE TABLE `student` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(20) NOT NULL,
  `age` int(11) DEFAULT '-1',
  `sex` enum('男','女','不明') DEFAULT '不明',
  `status` int(11) DEFAULT '0' COMMENT '用户状态：0--不可用，1--可用',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8;

/*Data for the table `student` */

insert  into `student`(`id`,`name`,`age`,`sex`,`status`) values (8,'tao',12,'男',1),(9,'hv',10,'女',1);

/*Table structure for table `wx_bill` */

DROP TABLE IF EXISTS `wx_bill`;

CREATE TABLE `wx_bill` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `gmt_create` bigint(20) DEFAULT NULL,
  `gmt_modified` bigint(20) DEFAULT NULL,
  `bill_type` smallint(1) DEFAULT NULL COMMENT '账单类型：0-其他 1-转入零钱通-来自零钱 2-转账 3-微信红包 4-扫二维码付款 5-商户消费 6转账-退款 7-微信红包-退款',
  `income_type` smallint(1) DEFAULT NULL COMMENT '收支类型：1-收入 -1-支出 0-内部资金流转',
  `pay_type` varchar(20) DEFAULT NULL COMMENT '支付方式：零钱通、零钱、XXX银行、转账或红包',
  `pay_time` bigint(20) DEFAULT NULL COMMENT '交易时间',
  `pay_num` decimal(10,0) DEFAULT NULL COMMENT '账单支出',
  `pay_return` decimal(10,0) DEFAULT NULL COMMENT '退款',
  `pay_num_real` decimal(10,0) DEFAULT NULL COMMENT '实际支出=账单支出-退款',
  `status` varchar(20) DEFAULT NULL COMMENT '支付状态说明',
  `goods` varchar(100) DEFAULT NULL COMMENT '商品名称',
  `bill_id` bigint(20) DEFAULT NULL COMMENT '交易单号',
  `store_id` bigint(20) DEFAULT NULL COMMENT '商家单号',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `wx_bill` */

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
