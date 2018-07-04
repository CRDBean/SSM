/*
Navicat MySQL Data Transfer

Source Server         : MySQL
Source Server Version : 50610
Source Host           : localhost:3306
Source Database       : demo

Target Server Type    : MYSQL
Target Server Version : 50610
File Encoding         : 65001

Date: 2018-07-02 17:33:15
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for employee
-- ----------------------------
DROP TABLE IF EXISTS `employee`;
CREATE TABLE `employee` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(50) DEFAULT NULL,
  `email` varchar(50) DEFAULT NULL,
  `gender` char(1) DEFAULT NULL,
  `age` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of employee
-- ----------------------------
INSERT INTO `employee` VALUES ('1', '11', '1@com', '1', '11');
INSERT INTO `employee` VALUES ('2', '22', 'a@com', '0', '1');
INSERT INTO `employee` VALUES ('3', '3', '3', '3', '3');
INSERT INTO `employee` VALUES ('4', '4', '4', '1', '11');
INSERT INTO `employee` VALUES ('8', '张三8', '8@com', '1', '12');

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1', 'zhangsan', '123321');
INSERT INTO `user` VALUES ('2', '李四', '123');
INSERT INTO `user` VALUES ('4', '4', '4');
INSERT INTO `user` VALUES ('5', '6', '6');
INSERT INTO `user` VALUES ('6', '6', '6');
