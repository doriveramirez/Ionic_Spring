-- MySQL dump 10.13  Distrib 8.0.17, for Win64 (x86_64)
--
-- Host: localhost    Database: db_cookies
-- ------------------------------------------------------
-- Server version	8.0.17

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `cookie`
--

create database if not exists db_cookies;
use db_cookies;

DROP TABLE IF EXISTS `cookie`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `cookie` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `phrase` varchar(200) NOT NULL,
  `times` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=35 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cookie`
--

LOCK TABLES `cookie` WRITE;
/*!40000 ALTER TABLE `cookie` DISABLE KEYS */;
insert into cookie values (null,"Vale más un diamante con defecto que un pedrusco sin ninguno",0);
insert into cookie values (null,"Es una locura amar, a menos que se ame con locura",0);
insert into cookie values (null,"Habrá un romance feliz para ti dentro de muy poco",0);
insert into cookie values (null,"Atraigo el éxito y la prosperidad con todas mis ideas",0);
insert into cookie values (null,"Estás en el lugar perfecto para llegar desde aquí",0);
insert into cookie values (null,"Estar en la ruina es una situación temporal. Ser pobre es un estado mental",0);
insert into cookie values (null,"Tengo la mayor de todas riquezas: la de no desearla",0);
insert into cookie values (null,"Me estoy volviendo mejor en lo que hago todos los días",0);
insert into cookie values (null,"A cada paso, una oportunidad aparece frente a mí",0);
insert into cookie values (null,"No te metas en el mundo de las drogas",0);
insert into cookie values (null,"La salud no es sólo la ausencia de enfermedad, sino también la armonía con uno mismo y el entorno",0);
insert into cookie values (null,"Tienes que dormir más",0);
insert into cookie values (null,"La salud es la verdadera riqueza, y no las monedas de oro y plata",0);
insert into cookie values (null,"Vale más un diamante con defecto que un pedrusco sin ninguno",0);
/*!40000 ALTER TABLE `cookie` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-10-11 20:49:13
