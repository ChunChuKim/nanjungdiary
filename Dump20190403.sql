-- MySQL dump 10.13  Distrib 5.7.9, for osx10.9 (x86_64)
--
-- Host: 127.0.0.1    Database: test
-- ------------------------------------------------------
-- Server version	8.0.12

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
-- Table structure for table `board`
--

DROP TABLE IF EXISTS `board`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `board` (
  `bno` int(11) NOT NULL AUTO_INCREMENT,
  `subject` varchar(45) NOT NULL,
  `content` varchar(45) NOT NULL,
  `writer` varchar(45) NOT NULL,
  `reg_date` datetime NOT NULL,
  PRIMARY KEY (`bno`),
  UNIQUE KEY `bno_UNIQUE` (`bno`)
) ENGINE=InnoDB AUTO_INCREMENT=22 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `board`
--

LOCK TABLES `board` WRITE;
/*!40000 ALTER TABLE `board` DISABLE KEYS */;
INSERT INTO `board` VALUES (1,'test','test1234\r\n\r\nqwe','test','2018-10-06 21:47:21'),(2,'test','test','test','2018-10-06 21:58:44'),(3,'1234','123123','1234','2018-10-06 22:18:00'),(6,'123123123','ssssaafsf','fsdfsf','2018-10-06 22:26:18'),(7,'wer','asdfasdf','ssdfff','2018-10-06 22:26:38'),(8,'asdasd','ffffffff','ddd','2018-10-06 22:30:47'),(9,'게시판 테스트','내용등록','한우리','2018-10-06 22:31:17'),(10,'파일업로드 테스트','파일업로드테스트','홍길동','2018-10-06 23:10:15'),(11,'파일 업로드 테스트','파일 디비등록 테스트','홍길동','2018-10-06 23:35:41'),(12,'파일 업로드 테스트','파일 디비등록 테스트','홍길동','2018-10-06 23:38:18'),(13,'파일 업로드 테스트','파일 디비등록 테스트','홍길동','2018-10-06 23:40:41'),(14,'파일업로드 제목','파일업로드 테스트','강길동','2018-10-06 23:42:40'),(15,'2','12','1','2018-10-07 00:17:23'),(18,'파일 등록테스트199','내용 등록','김춘추','2018-10-07 01:09:51'),(19,'qweqe','qweqwe','qweqwe','2018-10-07 01:24:50'),(20,'게시판을 처음 만들었어요','내용을 등록해봤어요.','강길동','2018-10-09 21:54:54'),(21,'title','note ','rotter','2018-12-17 22:25:54');
/*!40000 ALTER TABLE `board` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `comment`
--

DROP TABLE IF EXISTS `comment`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `comment` (
  `cno` int(11) NOT NULL AUTO_INCREMENT,
  `bno` int(11) NOT NULL,
  `content` text NOT NULL,
  `writer` varchar(20) DEFAULT NULL,
  `reg_date` datetime NOT NULL,
  PRIMARY KEY (`cno`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `comment`
--

LOCK TABLES `comment` WRITE;
/*!40000 ALTER TABLE `comment` DISABLE KEYS */;
INSERT INTO `comment` VALUES (1,1,'comment add1231232sewsdadasdasdasdasd','test','2018-10-09 21:53:08'),(2,1,'weqweqewqwedfsdsf fsdf sdf sdf ds ','test','2018-10-09 21:53:31'),(3,3,'333','test','2018-10-09 22:07:01'),(4,20,'6765765','test','2018-10-09 22:07:18'),(5,20,'765765','test','2018-10-09 22:07:23');
/*!40000 ALTER TABLE `comment` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `files`
--

DROP TABLE IF EXISTS `files`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `files` (
  `fno` int(11) NOT NULL AUTO_INCREMENT,
  `bno` int(11) NOT NULL,
  `filename` varchar(200) NOT NULL,
  `fileOriName` varchar(300) NOT NULL,
  `fileurl` varchar(500) NOT NULL,
  PRIMARY KEY (`fno`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `files`
--

LOCK TABLES `files` WRITE;
/*!40000 ALTER TABLE `files` DISABLE KEYS */;
INSERT INTO `files` VALUES (1,0,'YE0vE4GEzgpqY6PaomefZ45PPB1PNs4J.png','12.png','/Users/stivek/Documents/workspace-spring-tool-suite-4-4.0.0.RELEASE/demo/src/main/webapp/WEB-INF/uploadfile/'),(2,0,'4KTCeBjY9widulhKqurZOuw6TS90uXbw.png','B9C2C3F7.png','/Users/stivek/Documents/workspace-spring-tool-suite-4-4.0.0.RELEASE/demo/src/main/webapp/WEB-INF/uploadfile/'),(3,0,'iWxJjnxRkRpjCKChEdBF3sUJQMPLryEL.png','1.png','/Users/stivek/Documents/workspace-spring-tool-suite-4-4.0.0.RELEASE/demo/src/main/webapp/WEB-INF/uploadfile/'),(4,18,'k0OYMYNvqrEJChkKBg1eZdKa8rsccmMK.png','1.png','/Users/stivek/Documents/workspace-spring-tool-suite-4-4.0.0.RELEASE/demo/src/main/webapp/WEB-INF/uploadfile/'),(5,20,'BwT1O7yvYtvKJcFYoAOqHJWee8euRkUM.png','1.png','/Users/stivek/Documents/workspace-spring-tool-suite-4-4.0.0.RELEASE/demo/src/main/webapp/WEB-INF/uploadfile/');
/*!40000 ALTER TABLE `files` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-04-03  0:07:38
