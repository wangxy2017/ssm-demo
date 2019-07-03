CREATE DATABASE IF NOT EXISTS ssm_demo default character set utf8 COLLATE utf8_general_ci;
USE ssm_demo;

-- ----------------------------
-- Table structure for ssm_user
-- ----------------------------
DROP TABLE IF EXISTS `ssm_user`;
CREATE TABLE `ssm_user`
(
    `id`       int(11)      DEFAULT NULL,
    `username` varchar(255) DEFAULT NULL,
    `password` varchar(255) DEFAULT NULL,
    `nickName` varchar(255) DEFAULT NULL
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8;

-- ----------------------------
-- Records of ssm_user
-- ----------------------------
INSERT INTO `ssm_user`
VALUES ('1', 'admin', 'admin', '管理员');
