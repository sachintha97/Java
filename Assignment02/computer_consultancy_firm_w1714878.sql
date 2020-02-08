-- phpMyAdmin SQL Dump
-- version 4.8.5
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Apr 08, 2019 at 09:24 AM
-- Server version: 10.1.38-MariaDB
-- PHP Version: 7.3.2

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `computer_consultancy_firm_w1714878`
--

-- --------------------------------------------------------

--
-- Table structure for table `contract`
--

CREATE TABLE `contract` (
  `contractID` varchar(20) NOT NULL,
  `contractName` varchar(50) NOT NULL,
  `creationDate` varchar(20) NOT NULL,
  `jobType` varchar(50) NOT NULL,
  `contractDescription` varchar(255) NOT NULL,
  `projectLeaderID` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `contract`
--

INSERT INTO `contract` (`contractID`, `contractName`, `creationDate`, `jobType`, `contractDescription`, `projectLeaderID`) VALUES
('C100', 'Devleopment.C', '2018/09/10', 'System Development', 'developing computer software system', 15),
('C101', 'Sofware.C', '2019/04/01', 'Software Upgrade', 'need create software for login system', 25),
('C102', 'Software repair', '02/02/2019', 'Software Development', 'repair computer software ', 15);

-- --------------------------------------------------------

--
-- Table structure for table `customer`
--

CREATE TABLE `customer` (
  `customerID` varchar(20) NOT NULL,
  `cName` varchar(50) NOT NULL,
  `customerEmail` varchar(50) NOT NULL,
  `cTelNum` int(11) NOT NULL,
  `contractID` varchar(50) NOT NULL,
  `contractID2` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `customer`
--

INSERT INTO `customer` (`customerID`, `cName`, `customerEmail`, `cTelNum`, `contractID`, `contractID2`) VALUES
('w100', 'Emma', 'emma.88@gmail.com', 712348790, 'C150', NULL),
('W101', 'George Wilson', 'George.87@yahoo.com', 772784630, 'C101', 'C102');

-- --------------------------------------------------------

--
-- Table structure for table `employee`
--

CREATE TABLE `employee` (
  `eID` int(11) NOT NULL,
  `eName` varchar(50) NOT NULL,
  `eEmail` varchar(50) NOT NULL,
  `eTelNum` int(11) NOT NULL,
  `eDOB` varchar(20) NOT NULL,
  `rID` int(11) NOT NULL,
  `rID2` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `employee`
--

INSERT INTO `employee` (`eID`, `eName`, `eEmail`, `eTelNum`, `eDOB`, `rID`, `rID2`) VALUES
(15, 'Ben Livera', 'Ben.Livera@gmil.com', 715680945, '1987/04/09', 1, NULL),
(25, 'Michel Carlo', 'Michel.C@gmail.com', 712348790, '1990/10/08', 2, 3),
(30, 'jack watson', 'jack@yahoo.com', 713479850, '1989/4/9', 1, NULL);

-- --------------------------------------------------------

--
-- Table structure for table `role`
--

CREATE TABLE `role` (
  `rID` int(11) NOT NULL,
  `hourlypay` double NOT NULL,
  `roleType` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `role`
--

INSERT INTO `role` (`rID`, `hourlypay`, `roleType`) VALUES
(1, 10000, 'Programmer'),
(2, 9000, 'software installer'),
(3, 8000, 'hardware technician');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `contract`
--
ALTER TABLE `contract`
  ADD PRIMARY KEY (`contractID`),
  ADD KEY `fk_employee_eID` (`projectLeaderID`);

--
-- Indexes for table `customer`
--
ALTER TABLE `customer`
  ADD PRIMARY KEY (`customerID`),
  ADD KEY `fk_contract_contractID` (`contractID`);

--
-- Indexes for table `employee`
--
ALTER TABLE `employee`
  ADD PRIMARY KEY (`eID`),
  ADD KEY `fk_role_rID` (`rID`);

--
-- Indexes for table `role`
--
ALTER TABLE `role`
  ADD PRIMARY KEY (`rID`);

--
-- Constraints for dumped tables
--

--
-- Constraints for table `contract`
--
ALTER TABLE `contract`
  ADD CONSTRAINT `fk_employee_eID` FOREIGN KEY (`projectLeaderID`) REFERENCES `employee` (`eID`);

--
-- Constraints for table `customer`
--
ALTER TABLE `customer`
  ADD CONSTRAINT `fk_contract_contractID` FOREIGN KEY (`contractID`) REFERENCES `contract` (`contractID`);

--
-- Constraints for table `employee`
--
ALTER TABLE `employee`
  ADD CONSTRAINT `fk_role_rID` FOREIGN KEY (`rID`) REFERENCES `role` (`rID`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
