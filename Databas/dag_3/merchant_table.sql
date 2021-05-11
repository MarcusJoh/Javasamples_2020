-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1:3306
-- Generation Time: May 11, 2021 at 01:49 PM
-- Server version: 8.0.21
-- PHP Version: 7.3.21

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `merc_demo`
--

-- --------------------------------------------------------

--
-- Table structure for table `merchant_table`
--

DROP TABLE IF EXISTS `merchant_table`;
CREATE TABLE IF NOT EXISTS `merchant_table` (
  `merchant_id` int NOT NULL AUTO_INCREMENT,
  `merchant_name` varchar(50) DEFAULT NULL,
  `merchant_phone` varchar(15) DEFAULT NULL,
  PRIMARY KEY (`merchant_id`)
) ENGINE=MyISAM AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table `merchant_table`
--

INSERT INTO `merchant_table` (`merchant_id`, `merchant_name`, `merchant_phone`) VALUES
(1, 'la vino.', NULL),
(2, 'Systemet', NULL),
(3, 'la vino.', '03429782'),
(4, 'wine inc.', 'fgf'),
(5, 'la vino.', 'trtrt');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
