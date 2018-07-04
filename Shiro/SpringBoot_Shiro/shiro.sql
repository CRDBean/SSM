/*
Navicat MySQL Data Transfer

Source Server         : MySQL
Source Server Version : 50610
Source Host           : localhost:3306
Source Database       : shiro

Target Server Type    : MYSQL
Target Server Version : 50610
File Encoding         : 65001

Date: 2018-07-01 14:02:55
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for permission
-- ----------------------------
DROP TABLE IF EXISTS `permission`;
CREATE TABLE `permission` (
  `permission_id` int(11) NOT NULL AUTO_INCREMENT,
  `permission_name` varchar(255) DEFAULT NULL,
  `permission_desc` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`permission_id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of permission
-- ----------------------------
INSERT INTO `permission` VALUES ('1', 'admin:query', null);
INSERT INTO `permission` VALUES ('2', 'user:query', null);

-- ----------------------------
-- Table structure for role
-- ----------------------------
DROP TABLE IF EXISTS `role`;
CREATE TABLE `role` (
  `role_id` int(11) NOT NULL AUTO_INCREMENT,
  `role_name` varchar(255) DEFAULT NULL,
  `role_desc` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`role_id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of role
-- ----------------------------
INSERT INTO `role` VALUES ('1', 'admin', '一级工程师');
INSERT INTO `role` VALUES ('2', 'user', '二级工程师');

-- ----------------------------
-- Table structure for role_permission
-- ----------------------------
DROP TABLE IF EXISTS `role_permission`;
CREATE TABLE `role_permission` (
  `role_id` int(11) DEFAULT NULL,
  `permission_id` int(11) DEFAULT NULL,
  KEY `fk_roleid` (`role_id`),
  KEY `fk_permissionid` (`permission_id`),
  CONSTRAINT `fk_permissionid` FOREIGN KEY (`permission_id`) REFERENCES `permission` (`permission_id`),
  CONSTRAINT `fk_roleid` FOREIGN KEY (`role_id`) REFERENCES `role` (`role_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of role_permission
-- ----------------------------
INSERT INTO `role_permission` VALUES ('1', '1');
INSERT INTO `role_permission` VALUES ('1', '2');
INSERT INTO `role_permission` VALUES ('2', '2');

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `user_id` int(11) NOT NULL AUTO_INCREMENT,
  `user_name` varchar(255) DEFAULT NULL,
  `user_password` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1', 'admin', '038bdaf98f2037b31f1e75b5b4c9b26e');
INSERT INTO `user` VALUES ('2', 'user', '098d2c478e9c11555ce2823231e02ec1');

-- ----------------------------
-- Table structure for user_role
-- ----------------------------
DROP TABLE IF EXISTS `user_role`;
CREATE TABLE `user_role` (
  `user_id` int(11) DEFAULT NULL,
  `role_id` int(11) DEFAULT NULL,
  KEY `fk_user_id` (`user_id`),
  KEY `fk_role_id` (`role_id`),
  CONSTRAINT `fk_user_id` FOREIGN KEY (`user_id`) REFERENCES `user` (`user_id`),
  CONSTRAINT `fk_role_id` FOREIGN KEY (`role_id`) REFERENCES `role` (`role_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user_role
-- ----------------------------
INSERT INTO `user_role` VALUES ('1', '1');
INSERT INTO `user_role` VALUES ('1', '2');
INSERT INTO `user_role` VALUES ('2', '2');
