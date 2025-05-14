-- MySQL dump 10.13  Distrib 5.7.31, for Linux (x86_64)
--
-- Host: localhost    Database: ssmj1207
-- ------------------------------------------------------
-- Server version	5.7.31

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `chat`
--

DROP TABLE IF EXISTS `chat`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `chat` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `userid` bigint(20) NOT NULL COMMENT '用户id',
  `adminid` bigint(20) DEFAULT NULL COMMENT '管理员id',
  `ask` longtext COMMENT '提问',
  `reply` longtext COMMENT '回复',
  `isreply` int(11) DEFAULT NULL COMMENT '是否回复',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1612355186262 DEFAULT CHARSET=utf8 COMMENT='在线客服';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `chat`
--

LOCK TABLES `chat` WRITE;
/*!40000 ALTER TABLE `chat` DISABLE KEYS */;
INSERT INTO `chat` VALUES (71,'2021-02-03 12:15:44',1,1,'提问1','回复1',1),(72,'2021-02-03 12:15:44',2,2,'提问2','回复2',2),(73,'2021-02-03 12:15:44',3,3,'提问3','回复3',3),(74,'2021-02-03 12:15:44',4,4,'提问4','回复4',4),(75,'2021-02-03 12:15:44',5,5,'提问5','回复5',5),(76,'2021-02-03 12:15:44',6,6,'提问6','回复6',6),(1612355076805,'2021-02-03 12:24:36',1612354951376,NULL,'你好，士大夫士大夫的',NULL,0),(1612355186261,'2021-02-03 12:26:25',1612354951376,1,NULL,'你好',NULL);
/*!40000 ALTER TABLE `chat` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `config`
--

DROP TABLE IF EXISTS `config`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `config` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `name` varchar(100) NOT NULL COMMENT '配置参数名称',
  `value` varchar(100) DEFAULT NULL COMMENT '配置参数值',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8 COMMENT='配置文件';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `config`
--

LOCK TABLES `config` WRITE;
/*!40000 ALTER TABLE `config` DISABLE KEYS */;
INSERT INTO `config` VALUES (1,'picture1','http://localhost:8080/ssmj1207/upload/picture1.jpg'),(2,'picture2','http://localhost:8080/ssmj1207/upload/picture2.jpg'),(3,'picture3','http://localhost:8080/ssmj1207/upload/picture3.jpg'),(6,'homepage',NULL);
/*!40000 ALTER TABLE `config` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `dingdanzhongxin`
--

DROP TABLE IF EXISTS `dingdanzhongxin`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `dingdanzhongxin` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `bianhao` varchar(200) DEFAULT NULL COMMENT '编号',
  `geming` varchar(200) DEFAULT NULL COMMENT '歌名',
  `yinlebiaoqian` varchar(200) DEFAULT NULL COMMENT '音乐标签',
  `yanchangzhe` varchar(200) DEFAULT NULL COMMENT '演唱者',
  `jiage` varchar(200) DEFAULT NULL COMMENT '价格',
  `yonghuming` varchar(200) DEFAULT NULL COMMENT '用户名',
  `sfsh` varchar(200) DEFAULT '否' COMMENT '是否审核',
  `shhf` longtext COMMENT '审核回复',
  `ispay` varchar(200) DEFAULT '未支付' COMMENT '是否支付',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1612355055336 DEFAULT CHARSET=utf8 COMMENT='订单中心';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `dingdanzhongxin`
--

LOCK TABLES `dingdanzhongxin` WRITE;
/*!40000 ALTER TABLE `dingdanzhongxin` DISABLE KEYS */;
INSERT INTO `dingdanzhongxin` VALUES (51,'2021-02-03 12:15:44','编号1','歌名1','音乐标签1','演唱者1','价格1','用户名1','是','','未支付'),(52,'2021-02-03 12:15:44','编号2','歌名2','音乐标签2','演唱者2','价格2','用户名2','是','','未支付'),(53,'2021-02-03 12:15:44','编号3','歌名3','音乐标签3','演唱者3','价格3','用户名3','是','','未支付'),(54,'2021-02-03 12:15:44','编号4','歌名4','音乐标签4','演唱者4','价格4','用户名4','是','','未支付'),(55,'2021-02-03 12:15:44','编号5','歌名5','音乐标签5','演唱者5','价格5','用户名5','是','','未支付'),(56,'2021-02-03 12:15:44','编号6','歌名6','音乐标签6','演唱者6','价格6','用户名6','是','','未支付'),(1612355055335,'2021-02-03 12:24:15','1612354807525','稻香','音乐标签5','周杰伦','2','123','是','已发送文件至付费音频','已支付');
/*!40000 ALTER TABLE `dingdanzhongxin` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `discussfufeiyinle`
--

DROP TABLE IF EXISTS `discussfufeiyinle`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `discussfufeiyinle` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `refid` bigint(20) NOT NULL COMMENT '关联表id',
  `userid` bigint(20) NOT NULL COMMENT '用户id',
  `content` longtext NOT NULL COMMENT '评论内容',
  `reply` longtext COMMENT '回复内容',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=117 DEFAULT CHARSET=utf8 COMMENT='付费音乐评论表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `discussfufeiyinle`
--

LOCK TABLES `discussfufeiyinle` WRITE;
/*!40000 ALTER TABLE `discussfufeiyinle` DISABLE KEYS */;
INSERT INTO `discussfufeiyinle` VALUES (111,'2021-02-03 12:15:44',1,1,'评论内容1','回复内容1'),(112,'2021-02-03 12:15:44',2,2,'评论内容2','回复内容2'),(113,'2021-02-03 12:15:44',3,3,'评论内容3','回复内容3'),(114,'2021-02-03 12:15:44',4,4,'评论内容4','回复内容4'),(115,'2021-02-03 12:15:44',5,5,'评论内容5','回复内容5'),(116,'2021-02-03 12:15:44',6,6,'评论内容6','回复内容6');
/*!40000 ALTER TABLE `discussfufeiyinle` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `discussyinleku`
--

DROP TABLE IF EXISTS `discussyinleku`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `discussyinleku` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `refid` bigint(20) NOT NULL COMMENT '关联表id',
  `userid` bigint(20) NOT NULL COMMENT '用户id',
  `content` longtext NOT NULL COMMENT '评论内容',
  `reply` longtext COMMENT '回复内容',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1612354983630 DEFAULT CHARSET=utf8 COMMENT='音乐库评论表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `discussyinleku`
--

LOCK TABLES `discussyinleku` WRITE;
/*!40000 ALTER TABLE `discussyinleku` DISABLE KEYS */;
INSERT INTO `discussyinleku` VALUES (101,'2021-02-03 12:15:44',1,1,'评论内容1','回复内容1'),(102,'2021-02-03 12:15:44',2,2,'评论内容2','回复内容2'),(103,'2021-02-03 12:15:44',3,3,'评论内容3','回复内容3'),(104,'2021-02-03 12:15:44',4,4,'评论内容4','回复内容4'),(105,'2021-02-03 12:15:44',5,5,'评论内容5','回复内容5'),(106,'2021-02-03 12:15:44',6,6,'评论内容6','回复内容6'),(1612354983629,'2021-02-03 12:23:03',1612354804333,1612354951376,'fdsg dfsg发给很反感很反感 法规的回复',NULL);
/*!40000 ALTER TABLE `discussyinleku` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `fufeiyinle`
--

DROP TABLE IF EXISTS `fufeiyinle`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `fufeiyinle` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `bianhao` varchar(200) DEFAULT NULL COMMENT '编号',
  `geming` varchar(200) DEFAULT NULL COMMENT '歌名',
  `yinlebiaoqian` varchar(200) DEFAULT NULL COMMENT '音乐标签',
  `tupian` varchar(200) DEFAULT NULL COMMENT '图片',
  `yanchangzhe` varchar(200) DEFAULT NULL COMMENT '演唱者',
  `zuoqu` varchar(200) DEFAULT NULL COMMENT '作曲',
  `zuoci` varchar(200) DEFAULT NULL COMMENT '作词',
  `yinleshipin` varchar(200) DEFAULT NULL COMMENT '音乐视频',
  `jiage` varchar(200) DEFAULT NULL COMMENT '价格',
  `shitingpianduan` varchar(200) DEFAULT NULL COMMENT '试听片段',
  `gequjieshao` longtext COMMENT '歌曲介绍',
  `thumbsupnum` int(11) DEFAULT '0' COMMENT '赞',
  `crazilynum` int(11) DEFAULT '0' COMMENT '踩',
  PRIMARY KEY (`id`),
  UNIQUE KEY `bianhao` (`bianhao`)
) ENGINE=InnoDB AUTO_INCREMENT=1612354865621 DEFAULT CHARSET=utf8 COMMENT='付费音乐';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `fufeiyinle`
--

LOCK TABLES `fufeiyinle` WRITE;
/*!40000 ALTER TABLE `fufeiyinle` DISABLE KEYS */;
INSERT INTO `fufeiyinle` VALUES (41,'2021-02-03 12:15:44','编号1','歌名1','音乐标签1','http://localhost:8080/ssmj1207/upload/fufeiyinle_tupian1.jpg','演唱者1','作曲1','作词1','','价格1','','歌曲介绍1',1,1),(42,'2021-02-03 12:15:44','编号2','歌名2','音乐标签2','http://localhost:8080/ssmj1207/upload/fufeiyinle_tupian2.jpg','演唱者2','作曲2','作词2','','价格2','','歌曲介绍2',2,2),(43,'2021-02-03 12:15:44','编号3','歌名3','音乐标签3','http://localhost:8080/ssmj1207/upload/fufeiyinle_tupian3.jpg','演唱者3','作曲3','作词3','','价格3','','歌曲介绍3',3,3),(44,'2021-02-03 12:15:44','编号4','歌名4','音乐标签4','http://localhost:8080/ssmj1207/upload/fufeiyinle_tupian4.jpg','演唱者4','作曲4','作词4','','价格4','','歌曲介绍4',4,4),(45,'2021-02-03 12:15:44','编号5','歌名5','音乐标签5','http://localhost:8080/ssmj1207/upload/fufeiyinle_tupian5.jpg','演唱者5','作曲5','作词5','','价格5','','歌曲介绍5',5,5),(46,'2021-02-03 12:15:44','编号6','歌名6','音乐标签6','http://localhost:8080/ssmj1207/upload/fufeiyinle_tupian6.jpg','演唱者6','作曲6','作词6','','价格6','','歌曲介绍6',6,6),(1612354865620,'2021-02-03 12:21:05','1612354807525','稻香','音乐标签5','http://localhost:8080/ssmj1207/upload/1612354826583.jpg','周杰伦','周杰伦','方文山','http://localhost:8080/ssmj1207/upload/1612354856014.mp4','2','http://localhost:8080/ssmj1207/upload/1612354860559.mp3','<p>讽德诵功多个单方事故多个打分给对方</p><p>打分给对方给对方</p>',1,1);
/*!40000 ALTER TABLE `fufeiyinle` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `fufeiyinpin`
--

DROP TABLE IF EXISTS `fufeiyinpin`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `fufeiyinpin` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `bianhao` varchar(200) DEFAULT NULL COMMENT '编号',
  `geming` varchar(200) DEFAULT NULL COMMENT '歌名',
  `yinlebiaoqian` varchar(200) DEFAULT NULL COMMENT '音乐标签',
  `yanchangzhe` varchar(200) DEFAULT NULL COMMENT '演唱者',
  `jiage` varchar(200) DEFAULT NULL COMMENT '价格',
  `yonghuming` varchar(200) DEFAULT NULL COMMENT '用户名',
  `yinpin` varchar(200) DEFAULT NULL COMMENT '音频',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1612355160498 DEFAULT CHARSET=utf8 COMMENT='付费音频';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `fufeiyinpin`
--

LOCK TABLES `fufeiyinpin` WRITE;
/*!40000 ALTER TABLE `fufeiyinpin` DISABLE KEYS */;
INSERT INTO `fufeiyinpin` VALUES (61,'2021-02-03 12:15:44','编号1','歌名1','音乐标签1','演唱者1','价格1','用户名1',''),(62,'2021-02-03 12:15:44','编号2','歌名2','音乐标签2','演唱者2','价格2','用户名2',''),(63,'2021-02-03 12:15:44','编号3','歌名3','音乐标签3','演唱者3','价格3','用户名3',''),(64,'2021-02-03 12:15:44','编号4','歌名4','音乐标签4','演唱者4','价格4','用户名4',''),(65,'2021-02-03 12:15:44','编号5','歌名5','音乐标签5','演唱者5','价格5','用户名5',''),(66,'2021-02-03 12:15:44','编号6','歌名6','音乐标签6','演唱者6','价格6','用户名6',''),(1612355160497,'2021-02-03 12:26:00','1612354807525','稻香','音乐标签5','周杰伦','2','123','http://localhost:8080/ssmj1207/upload/1612355159076.mp3');
/*!40000 ALTER TABLE `fufeiyinpin` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `news`
--

DROP TABLE IF EXISTS `news`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `news` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `title` varchar(200) NOT NULL COMMENT '标题',
  `introduction` longtext COMMENT '简介',
  `picture` varchar(200) NOT NULL COMMENT '图片',
  `content` longtext NOT NULL COMMENT '内容',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1612354909939 DEFAULT CHARSET=utf8 COMMENT='音乐资讯';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `news`
--

LOCK TABLES `news` WRITE;
/*!40000 ALTER TABLE `news` DISABLE KEYS */;
INSERT INTO `news` VALUES (91,'2021-02-03 12:15:44','标题1是梵蒂冈打分个梵蒂冈发给打分','简介1的飞洒刚发的广东佛山割发代首广东佛山','http://localhost:8080/ssmj1207/upload/news_picture1.jpg','<p>内容1的飞洒广东佛山功夫大使馆的飞洒</p><p>的飞洒广东佛山给对方是个单方事故打分</p><p>第三方高大上发给放到</p>'),(92,'2021-02-03 12:15:44','标题2','简介2','http://localhost:8080/ssmj1207/upload/news_picture2.jpg','内容2'),(93,'2021-02-03 12:15:44','标题3','简介3','http://localhost:8080/ssmj1207/upload/news_picture3.jpg','内容3'),(94,'2021-02-03 12:15:44','标题4','简介4','http://localhost:8080/ssmj1207/upload/news_picture4.jpg','内容4'),(95,'2021-02-03 12:15:44','标题5','简介5','http://localhost:8080/ssmj1207/upload/news_picture5.jpg','内容5'),(96,'2021-02-03 12:15:44','标题6','简介6','http://localhost:8080/ssmj1207/upload/news_picture6.jpg','内容6'),(1612354909938,'2021-02-03 12:21:49','的飞洒个地方官打分规范的是高分散的','规范恢复得更好发的规划fgd','http://localhost:8080/ssmj1207/upload/1612354906157.jpg','<p> 发的规划放到很反感回复股东会发的规划发给</p>');
/*!40000 ALTER TABLE `news` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `storeup`
--

DROP TABLE IF EXISTS `storeup`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `storeup` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `userid` bigint(20) NOT NULL COMMENT '用户id',
  `refid` bigint(20) DEFAULT NULL COMMENT '收藏id',
  `tablename` varchar(200) DEFAULT NULL COMMENT '表名',
  `name` varchar(200) NOT NULL COMMENT '收藏名称',
  `picture` varchar(200) NOT NULL COMMENT '收藏图片',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1612354988843 DEFAULT CHARSET=utf8 COMMENT='收藏表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `storeup`
--

LOCK TABLES `storeup` WRITE;
/*!40000 ALTER TABLE `storeup` DISABLE KEYS */;
INSERT INTO `storeup` VALUES (1612354988842,'2021-02-03 12:23:08',1612354951376,1612354804333,'yinleku','喜欢你','http://localhost:8080/ssmj1207/upload/1612354759682.jpg');
/*!40000 ALTER TABLE `storeup` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `token`
--

DROP TABLE IF EXISTS `token`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `token` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `userid` bigint(20) NOT NULL COMMENT '用户id',
  `username` varchar(100) NOT NULL COMMENT '用户名',
  `tablename` varchar(100) DEFAULT NULL COMMENT '表名',
  `role` varchar(100) DEFAULT NULL COMMENT '角色',
  `token` varchar(200) NOT NULL COMMENT '密码',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '新增时间',
  `expiratedtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '过期时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8 COMMENT='token表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `token`
--

LOCK TABLES `token` WRITE;
/*!40000 ALTER TABLE `token` DISABLE KEYS */;
INSERT INTO `token` VALUES (1,1,'abo','users','管理员','2y2v8tssr4jw3gfcqod25dzpfv869x6o','2021-02-03 12:18:24','2021-02-03 13:25:13'),(2,1612354951376,'123','yonghu','用户','fyjq6zz9mpoftzelpi2lmaihzjk8v7up','2021-02-03 12:22:37','2021-02-03 13:26:38');
/*!40000 ALTER TABLE `token` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `users`
--

DROP TABLE IF EXISTS `users`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `users` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `username` varchar(100) NOT NULL COMMENT '用户名',
  `password` varchar(100) NOT NULL COMMENT '密码',
  `role` varchar(100) DEFAULT '管理员' COMMENT '角色',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '新增时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COMMENT='用户表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `users`
--

LOCK TABLES `users` WRITE;
/*!40000 ALTER TABLE `users` DISABLE KEYS */;
INSERT INTO `users` VALUES (1,'abo','abo','管理员','2021-02-03 12:15:44');
/*!40000 ALTER TABLE `users` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `yinlebiaoqian`
--

DROP TABLE IF EXISTS `yinlebiaoqian`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `yinlebiaoqian` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `yinlebiaoqian` varchar(200) DEFAULT NULL COMMENT '音乐标签',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1612354722939 DEFAULT CHARSET=utf8 COMMENT='音乐标签';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `yinlebiaoqian`
--

LOCK TABLES `yinlebiaoqian` WRITE;
/*!40000 ALTER TABLE `yinlebiaoqian` DISABLE KEYS */;
INSERT INTO `yinlebiaoqian` VALUES (21,'2021-02-03 12:15:44','音乐标签1'),(22,'2021-02-03 12:15:44','音乐标签2'),(23,'2021-02-03 12:15:44','音乐标签3'),(24,'2021-02-03 12:15:44','音乐标签4'),(25,'2021-02-03 12:15:44','音乐标签5'),(26,'2021-02-03 12:15:44','音乐标签6'),(1612354722938,'2021-02-03 12:18:42','经典怀旧');
/*!40000 ALTER TABLE `yinlebiaoqian` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `yinleku`
--

DROP TABLE IF EXISTS `yinleku`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `yinleku` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `bianhao` varchar(200) DEFAULT NULL COMMENT '编号',
  `geming` varchar(200) DEFAULT NULL COMMENT '歌名',
  `yinlebiaoqian` varchar(200) DEFAULT NULL COMMENT '音乐标签',
  `tupian` varchar(200) DEFAULT NULL COMMENT '图片',
  `yanchangzhe` varchar(200) DEFAULT NULL COMMENT '演唱者',
  `zuoqu` varchar(200) DEFAULT NULL COMMENT '作曲',
  `zuoci` varchar(200) DEFAULT NULL COMMENT '作词',
  `yinleshipin` varchar(200) DEFAULT NULL COMMENT '音乐视频',
  `yinle` varchar(200) DEFAULT NULL COMMENT '音乐',
  `gequjieshao` longtext COMMENT '歌曲介绍',
  `thumbsupnum` int(11) DEFAULT '0' COMMENT '赞',
  `crazilynum` int(11) DEFAULT '0' COMMENT '踩',
  `clicktime` datetime DEFAULT NULL COMMENT '最近点击时间',
  `clicknum` int(11) DEFAULT '0' COMMENT '点击次数',
  PRIMARY KEY (`id`),
  UNIQUE KEY `bianhao` (`bianhao`)
) ENGINE=InnoDB AUTO_INCREMENT=1612354804334 DEFAULT CHARSET=utf8 COMMENT='音乐库';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `yinleku`
--

LOCK TABLES `yinleku` WRITE;
/*!40000 ALTER TABLE `yinleku` DISABLE KEYS */;
INSERT INTO `yinleku` VALUES (31,'2021-02-03 12:15:44','编号1','歌名1','音乐标签1','http://localhost:8080/ssmj1207/upload/yinleku_tupian1.jpg','演唱者1','作曲1','作词1','','','歌曲介绍1',1,1,'2021-02-03 20:15:44',1),(32,'2021-02-03 12:15:44','编号2','歌名2','音乐标签2','http://localhost:8080/ssmj1207/upload/yinleku_tupian2.jpg','演唱者2','作曲2','作词2','','','歌曲介绍2',2,2,'2021-02-03 20:15:44',2),(33,'2021-02-03 12:15:44','编号3','歌名3','音乐标签3','http://localhost:8080/ssmj1207/upload/yinleku_tupian3.jpg','演唱者3','作曲3','作词3','','','歌曲介绍3',3,3,'2021-02-03 20:15:44',3),(34,'2021-02-03 12:15:44','编号4','歌名4','音乐标签4','http://localhost:8080/ssmj1207/upload/yinleku_tupian4.jpg','演唱者4','作曲4','作词4','','','歌曲介绍4',4,4,'2021-02-03 20:15:44',4),(35,'2021-02-03 12:15:44','编号5','歌名5','音乐标签5','http://localhost:8080/ssmj1207/upload/yinleku_tupian5.jpg','演唱者5','作曲5','作词5','','','歌曲介绍5',5,5,'2021-02-03 20:15:44',5),(36,'2021-02-03 12:15:44','编号6','歌名6','音乐标签6','http://localhost:8080/ssmj1207/upload/yinleku_tupian6.jpg','演唱者6','作曲6','作词6','','','歌曲介绍6',6,6,'2021-02-03 20:21:58',7),(1612354804333,'2021-02-03 12:20:03','1612354730661','喜欢你','经典怀旧','http://localhost:8080/ssmj1207/upload/1612354759682.jpg','邓紫棋',' 发','多少发','http://localhost:8080/ssmj1207/upload/1612354785336.mp3','http://localhost:8080/ssmj1207/upload/1612354789832.mp4','<p>这首词收录在水电费稍等发按时g单方事故的飞洒跟第三方</p><p>是大法官单方事故单方事故单方事故的飞洒</p><p>单方事故单方事故的飞洒</p>',1,1,'2021-02-03 20:23:19',4);
/*!40000 ALTER TABLE `yinleku` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `yonghu`
--

DROP TABLE IF EXISTS `yonghu`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `yonghu` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `yonghuming` varchar(200) NOT NULL COMMENT '用户名',
  `mima` varchar(200) DEFAULT NULL COMMENT '密码',
  `xingming` varchar(200) DEFAULT NULL COMMENT '姓名',
  `nianling` varchar(200) DEFAULT NULL COMMENT '年龄',
  `xingbie` varchar(200) DEFAULT NULL COMMENT '性别',
  `shouji` varchar(200) DEFAULT NULL COMMENT '手机',
  `youxiang` varchar(200) DEFAULT NULL COMMENT '邮箱',
  PRIMARY KEY (`id`),
  UNIQUE KEY `yonghuming` (`yonghuming`)
) ENGINE=InnoDB AUTO_INCREMENT=1612354951377 DEFAULT CHARSET=utf8 COMMENT='用户';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `yonghu`
--

LOCK TABLES `yonghu` WRITE;
/*!40000 ALTER TABLE `yonghu` DISABLE KEYS */;
INSERT INTO `yonghu` VALUES (11,'2021-02-03 12:15:44','用户1','123456','姓名1','年龄1','男','13823888881','773890001@qq.com'),(12,'2021-02-03 12:15:44','用户2','123456','姓名2','年龄2','男','13823888882','773890002@qq.com'),(13,'2021-02-03 12:15:44','用户3','123456','姓名3','年龄3','男','13823888883','773890003@qq.com'),(14,'2021-02-03 12:15:44','用户4','123456','姓名4','年龄4','男','13823888884','773890004@qq.com'),(15,'2021-02-03 12:15:44','用户5','123456','姓名5','年龄5','男','13823888885','773890005@qq.com'),(16,'2021-02-03 12:15:44','用户6','123456','姓名6','年龄6','男','13823888886','773890006@qq.com'),(1612354951376,'2021-02-03 12:22:31','123','123','放到','21','男','13455665566','345345@qq.com');
/*!40000 ALTER TABLE `yonghu` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-02-04 12:32:55
