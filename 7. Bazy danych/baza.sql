CREATE DATABASE  IF NOT EXISTS `company` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `company`;

--
-- Table structure for table `department`
--

DROP TABLE IF EXISTS `department`;

CREATE TABLE `department` (
                              `id` int NOT NULL AUTO_INCREMENT,
                              `name` varchar(45) NOT NULL,
                              `location` varchar(45) NOT NULL,
                              PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;


--
-- Dumping data for table `department`
--

LOCK TABLES `department` WRITE;
INSERT INTO `department` VALUES (1,'Marketing','Kraków'),(2,'Sprzedaż','Warszawa'),(3,'IT','Gdańsk'),(4,'HR','Szczecin'),(5,'Księgowość','Poznań');
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
                            PRIMARY KEY (`id`),
                            KEY `fk_employee_department_idx` (`department_id`),
                            CONSTRAINT `fk_employee_department` FOREIGN KEY (`department_id`) REFERENCES `department` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table `employee`
--

LOCK TABLES `employee` WRITE;
INSERT INTO `employee` VALUES (1,'Adam','Nowak',1960,2),(2,'Tomasz','Kowalski',2006,1),(3,'Anna','Kowalska',NULL,2),(4,'Maria','Nowak',1974,NULL),(5,'Krystyna','Markowska',1987,3),(6,'Adam','Kowalski',1954,4),(7,'Maria','Kowalska',1974,4),(8,'Wiktor','Majchrzak',1965,3);
UNLOCK TABLES;

-- Dump completed on 2021-07-19  9:25:10
