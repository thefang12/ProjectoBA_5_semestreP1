-- MySQL dump 10.13  Distrib 5.7.12, for Win64 (x86_64)
--
-- Host: localhost    Database: modeloott
-- ------------------------------------------------------
-- Server version	5.7.11

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
-- Table structure for table `cluster`
--

DROP TABLE IF EXISTS `cluster`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `cluster` (
  `idCluster` int(11) NOT NULL AUTO_INCREMENT,
  `fkOficina` int(11) NOT NULL,
  `nombre` varchar(45) NOT NULL,
  `descripcion` varchar(500) NOT NULL,
  PRIMARY KEY (`idCluster`,`fkOficina`),
  UNIQUE KEY `idCluster_UNIQUE` (`idCluster`),
  KEY `fkOficina` (`fkOficina`),
  CONSTRAINT `fkOficina` FOREIGN KEY (`fkOficina`) REFERENCES `oficina` (`idOficina`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cluster`
--

LOCK TABLES `cluster` WRITE;
/*!40000 ALTER TABLE `cluster` DISABLE KEYS */;
INSERT INTO `cluster` VALUES (1,1,'Automotriz','La industria automotriz es uno de los sectores económicos más importantes a nivel \nmundial. Con ganancias superiores a los $2,000 billones dólares anuales actualmente, se estima\n que estas ganancias crecerán un 50% para el año 2014.'),(2,2,'Sauld','La salud es un área de primera necesidad que todos los seres humanos deben de cumplir para tener una vida plena. \nSe estima que el Mercado de los equipos médicos, ópticos y de medición presentará un superávit comercial de cerca de \n2,000 millones de dólares en el presente año.'),(3,3,'Alimentos','La industria alimentaria es la que suple las necesidades de primera mano de toda la población, \nademás de ser una industria \nque crece conforme aumenta el número de habitantes del globo.\nEste crecimiento poblacional plantea muchos retos para esta industria, \nno solamente se requieren cada vez más alimentos, sino también de mayor calidad y \nque aporten soluciones a situaciones como la obesidad, la contaminación y el encarecimiento de costos.');
/*!40000 ALTER TABLE `cluster` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `direccion`
--

DROP TABLE IF EXISTS `direccion`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `direccion` (
  `iddireccion` int(11) NOT NULL AUTO_INCREMENT,
  `calle` varchar(45) NOT NULL,
  `colonia` varchar(45) NOT NULL,
  `municipio` varchar(45) NOT NULL,
  `estado` varchar(45) NOT NULL,
  `cp` int(11) NOT NULL,
  PRIMARY KEY (`iddireccion`),
  UNIQUE KEY `iddireccion_UNIQUE` (`iddireccion`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `direccion`
--

LOCK TABLES `direccion` WRITE;
/*!40000 ALTER TABLE `direccion` DISABLE KEYS */;
INSERT INTO `direccion` VALUES (1,'analco','bellavista','xochitepec','morelos',62120),(2,'chamilpa','delicias','jojutla','morelos',62305),(3,'17 abril','acapatzingo','cuernavaca','morelos',62876);
/*!40000 ALTER TABLE `direccion` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `institucion`
--

DROP TABLE IF EXISTS `institucion`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `institucion` (
  `idInstitucion` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(45) NOT NULL,
  PRIMARY KEY (`idInstitucion`),
  UNIQUE KEY `idInstitucion_UNIQUE` (`idInstitucion`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `institucion`
--

LOCK TABLES `institucion` WRITE;
/*!40000 ALTER TABLE `institucion` DISABLE KEYS */;
INSERT INTO `institucion` VALUES (1,'TEC CVA'),(2,'TEC CCM'),(3,'TEC GDL');
/*!40000 ALTER TABLE `institucion` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `investigadores`
--

DROP TABLE IF EXISTS `investigadores`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `investigadores` (
  `idInvestigadores` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(45) NOT NULL,
  PRIMARY KEY (`idInvestigadores`),
  UNIQUE KEY `idInvestigadores_UNIQUE` (`idInvestigadores`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `investigadores`
--

LOCK TABLES `investigadores` WRITE;
/*!40000 ALTER TABLE `investigadores` DISABLE KEYS */;
INSERT INTO `investigadores` VALUES (1,'Arturo'),(2,'Gary'),(3,'Hugo');
/*!40000 ALTER TABLE `investigadores` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `ofertas_tecnologicas`
--

DROP TABLE IF EXISTS `ofertas_tecnologicas`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `ofertas_tecnologicas` (
  `idOT` int(11) NOT NULL AUTO_INCREMENT,
  `fkIdCluster` int(11) NOT NULL,
  `nombre` varchar(150) NOT NULL,
  `Descripcion` text NOT NULL,
  `estatus` text NOT NULL,
  `ventajas` text NOT NULL,
  `antecedentes` text NOT NULL,
  `aplicaciones` text NOT NULL,
  PRIMARY KEY (`idOT`,`fkIdCluster`),
  UNIQUE KEY `idOT_UNIQUE` (`idOT`),
  KEY `fkIdCluster` (`fkIdCluster`),
  CONSTRAINT `fkIdCluster` FOREIGN KEY (`fkIdCluster`) REFERENCES `cluster` (`idCluster`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ofertas_tecnologicas`
--

LOCK TABLES `ofertas_tecnologicas` WRITE;
/*!40000 ALTER TABLE `ofertas_tecnologicas` DISABLE KEYS */;
INSERT INTO `ofertas_tecnologicas` VALUES (2,2,'métodos y sistema de localización de estaciones moviles','Método para la localización o posicionamiento de una estación móvil MS para tecnología GSM o cualquier otra\ntecnología de comunicación móvil que involucre infraestructura en base a celdas de cobertura en donde la técnica\ncomún de triangulación no es posible, aplicable en zonas semi-rurales o suburbanas y en zonas de bloqueo de señal.','Experimental. 1 Solicitud de patente (Mx/a/2007/013138)','Bajo costo debido a que la infraestructura es de menor complejidad al no\ntener que usar satélites. Funciona en zonas rurales mediante el uso de unidades de medición LMU en\ntoda la red.','Existen diversas técnicas de localización de una estación móvil MS (Mobile\nStation). Dentro de algunas técnicas de localización comúnmente usadas\nencontramos la de medición de tiempo de llegada TOA (Time of Arrival), la de\nmedición de diferencia de tiempos de llegada TDOA (Time Difference of Arrival),\ny la de medición de ángulo de llegada AOA (Angle of Arrival) mediante el uso de\nantenas inteligentes. Así mismo existen técnicas híbridas de localización las\ncuales son el resultado de combinar algunas de las técnicas anteriores. En GSM\nse usa la técnica híbrida E-OTD (Enhaced Observed Time Difference), la cual\nconsta de antenas base BS que realizan mediciones de tiempo y de unidades de\nmedición LMU para referenciar las estaciones base BS.','Su principal enfoque es en el mercado de la telefonía celular, principalmente dirigido a compañías\nque proporcionan los servicios de comunicación.'),(3,3,'aprovechamiento de salvar hispánia','Proceso efectivo y de alto rendimiento para la extracción y aislamiento de mucilago de la semilla de Chia,\nasí como la obtención de aceite y un producto cárnico mejorado, en base a esta semilla.','6 solicitudes de patentes (NL/a/2006/000071, NL/a/2006/000072,\nNL/a/2006/000075, PCT/MX/20007/000111, PCT/MX/2007/000112,\nPCT/MX/20007/000115).','Mayor fuente vegetal de ácidos grasos Omega – 3 , Ayuda a regular la coagulación de la sangre, células de la piel, membranas,\nmucosas y nervios.','La planta de salvia hispánica, mejor conocida como Chia, tiene altísimos valores\nnutricionales, así como propiedades medicinales; además se ha utilizado en\nadornos originarios de México.','61% de los consumidores, prefieren comprar productos elaborados con\ningredientes saludables, aunque los otros sean más baratos.');
/*!40000 ALTER TABLE `ofertas_tecnologicas` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `ofertas_tecnologicas_has_investigadores`
--

DROP TABLE IF EXISTS `ofertas_tecnologicas_has_investigadores`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `ofertas_tecnologicas_has_investigadores` (
  `fkIdOT` int(11) NOT NULL,
  `fkIdInvestigadores` int(11) NOT NULL,
  PRIMARY KEY (`fkIdOT`,`fkIdInvestigadores`),
  KEY `fk_ofertas_Tecnologicas_has_Investigadores_Investigadores1_idx` (`fkIdInvestigadores`),
  KEY `fk_ofertas_Tecnologicas_has_Investigadores_ofertas_Tecnolog_idx` (`fkIdOT`),
  CONSTRAINT `fk_ofertas_Tecnologicas_has_Investigadores_Investigadores1` FOREIGN KEY (`fkIdInvestigadores`) REFERENCES `investigadores` (`idInvestigadores`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_ofertas_Tecnologicas_has_Investigadores_ofertas_Tecnologic1` FOREIGN KEY (`fkIdOT`) REFERENCES `ofertas_tecnologicas` (`idOT`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ofertas_tecnologicas_has_investigadores`
--

LOCK TABLES `ofertas_tecnologicas_has_investigadores` WRITE;
/*!40000 ALTER TABLE `ofertas_tecnologicas_has_investigadores` DISABLE KEYS */;
INSERT INTO `ofertas_tecnologicas_has_investigadores` VALUES (2,1),(3,3);
/*!40000 ALTER TABLE `ofertas_tecnologicas_has_investigadores` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `oficina`
--

DROP TABLE IF EXISTS `oficina`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `oficina` (
  `idOficina` int(11) NOT NULL AUTO_INCREMENT,
  `fkIdInstitucion` int(11) NOT NULL,
  `fkIdDireccion` int(11) NOT NULL,
  `nombre` varchar(45) NOT NULL,
  PRIMARY KEY (`idOficina`,`fkIdInstitucion`),
  UNIQUE KEY `idOficina_UNIQUE` (`idOficina`),
  KEY `fk_oficina_direccion1_idx` (`fkIdDireccion`),
  KEY `fkIdInstitucion` (`fkIdInstitucion`),
  CONSTRAINT `fkIdInstitucion` FOREIGN KEY (`fkIdInstitucion`) REFERENCES `institucion` (`idInstitucion`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_oficina_direccion1` FOREIGN KEY (`fkIdDireccion`) REFERENCES `direccion` (`iddireccion`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `oficina`
--

LOCK TABLES `oficina` WRITE;
/*!40000 ALTER TABLE `oficina` DISABLE KEYS */;
INSERT INTO `oficina` VALUES (1,1,1,'oficina cuernavaca'),(2,2,2,'oficina ciudad de mexico'),(3,3,3,'oficina guadalajara');
/*!40000 ALTER TABLE `oficina` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `usuario`
--

DROP TABLE IF EXISTS `usuario`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `usuario` (
  `idUsuario` int(11) NOT NULL AUTO_INCREMENT,
  `fkInstitucion` int(11) NOT NULL,
  `tipo` varchar(45) NOT NULL,
  `nombre` varchar(45) NOT NULL,
  `usuario` varchar(45) NOT NULL,
  `contrasena` varchar(45) NOT NULL,
  PRIMARY KEY (`idUsuario`),
  UNIQUE KEY `idUsuario_UNIQUE` (`idUsuario`),
  KEY `fkInstitucion` (`fkInstitucion`),
  CONSTRAINT `fkInstitucion` FOREIGN KEY (`fkInstitucion`) REFERENCES `institucion` (`idInstitucion`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `usuario`
--

LOCK TABLES `usuario` WRITE;
/*!40000 ALTER TABLE `usuario` DISABLE KEYS */;
INSERT INTO `usuario` VALUES (1,1,'administrador','Hugo','hugo007','123hugo'),(2,2,'investigador','Arturo','arturo007','123arturo');
/*!40000 ALTER TABLE `usuario` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2016-09-07 14:52:04
