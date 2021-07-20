CREATE DATABASE  IF NOT EXISTS `company`;
USE `company`;

--
-- Table structure for table `job`
--

DROP TABLE IF EXISTS `job`;
CREATE TABLE `job` (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(45) NOT NULL,
  `salary` int NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5;

--
-- Dumping data for table `job`
--

LOCK TABLES `job` WRITE;
INSERT INTO `job` VALUES (1,'Sprzedawca',1234),(2,'Programista',4321),(3,'Prezes',123),(4,'Konsultant',321);
UNLOCK TABLES;

DROP TABLE IF EXISTS `certificate`;
CREATE TABLE `certificate` (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(45) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=59;

--
-- Dumping data for table `certificate`
--

LOCK TABLES `certificate` WRITE;
INSERT INTO `certificate` VALUES (1,'ABC'),(2,'XYZ'),(3,'Certyfikat 123'),(50,'Aaa'),(51,'Bbb'),(52,'Kraków'),(53,'Warszawa'),(54,'Gdańsk'),(55,'Szczecin'),(56,'Poznań');
UNLOCK TABLES;

--
-- Table structure for table `department`
--

DROP TABLE IF EXISTS `department`;
CREATE TABLE `department` (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(45) NOT NULL,
  `location` varchar(45) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=8;

--
-- Dumping data for table `department`
--

LOCK TABLES `department` WRITE;
INSERT INTO `department` VALUES (1,'Marketing','Kraków'),(2,'Sprzedaż','Warszawa'),(3,'IT','Gdańsk'),(4,'HR','Szczecin'),(5,'Księgowość','Poznań'),(7,'Aaaa','Aaa');
UNLOCK TABLES;

--
-- Table structure for table `employee`
--

DROP TABLE IF EXISTS `employee`;
CREATE TABLE `employee` (
  `id` int NOT NULL AUTO_INCREMENT,
  `first_name` varchar(45) NOT NULL,
  `last_name` varchar(45) NOT NULL,
  `year_of_birth` int DEFAULT NULL,
  `department_id` int DEFAULT NULL,
  `job_id` int DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_employee_department_idx` (`department_id`),
  KEY `fk_employee_job_idx` (`job_id`),
  CONSTRAINT `fk_employee_department` FOREIGN KEY (`department_id`) REFERENCES `department` (`id`) ON DELETE CASCADE,
  CONSTRAINT `fk_employee_job` FOREIGN KEY (`job_id`) REFERENCES `job` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=28;

--
-- Dumping data for table `employee`
--

LOCK TABLES `employee` WRITE;
INSERT INTO `employee` VALUES (1,'Paweł','Nowak',1960,2,3),(2,'Tomasz','Kowalski',2006,1,1),(3,'Anna','Kowalska',NULL,2,NULL),(4,'Maria','Nowak',1974,NULL,2),(5,'Krystyna','Markowska',1987,3,4),(6,'Adam','Kowalski',1954,4,3),(7,'Maria','Kowalska',1974,4,2),(8,'Wiktor','Majchrzak',1965,3,1),(9,'Adam','Adamowski',1987,1,2),(10,'Bartosz','Bartoszowski',1977,2,3),(27,'Aaaa','Aaa',1234,2,3);
UNLOCK TABLES;

--
-- Table structure for table `employee_certificate`
--

DROP TABLE IF EXISTS `employee_certificate`;
CREATE TABLE `employee_certificate` (
  `employee_id` int NOT NULL,
  `certificate_id` int NOT NULL,
  PRIMARY KEY (`employee_id`,`certificate_id`),
  KEY `fk_emp_cert_cert_idx` (`certificate_id`),
  CONSTRAINT `fk_emp_cert_cert` FOREIGN KEY (`certificate_id`) REFERENCES `certificate` (`id`),
  CONSTRAINT `fk_emp_cert_emp` FOREIGN KEY (`employee_id`) REFERENCES `employee` (`id`)
) ENGINE=InnoDB;

--
-- Dumping data for table `employee_certificate`
--

LOCK TABLES `employee_certificate` WRITE;
INSERT INTO `employee_certificate` VALUES (1,1),(3,1),(1,2),(5,2);
UNLOCK TABLES;

--
-- Table structure for table `event`
--

DROP TABLE IF EXISTS `event`;
CREATE TABLE `event` (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(45) NOT NULL,
  `start_date` date NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2;

--
-- Dumping data for table `event`
--

LOCK TABLES `event` WRITE;
INSERT INTO `event` VALUES (1,'Wydarzenie XYZ','2021-07-20');
UNLOCK TABLES;
