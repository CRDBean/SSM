/*
Navicat MySQL Data Transfer

Source Server         : MySQL
Source Server Version : 50711
Source Host           : localhost:3306
Source Database       : text

Target Server Type    : MYSQL
Target Server Version : 50711
File Encoding         : 65001

Date: 2017-11-13 20:57:42
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `user`
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1', 'zhangsan', '123321');
INSERT INTO `user` VALUES ('2', '李四', '123');
INSERT INTO `user` VALUES ('3', '3', '3');
INSERT INTO `user` VALUES ('4', '4', '455');
INSERT INTO `user` VALUES ('5', '5', '56');
INSERT INTO `user` VALUES ('6', '6', '6');
INSERT INTO `user` VALUES ('7', '7', '7');
INSERT INTO `user` VALUES ('8', '8', '8');
INSERT INTO `user` VALUES ('9', '9', '9');
INSERT INTO `user` VALUES ('11', '11', '11');
