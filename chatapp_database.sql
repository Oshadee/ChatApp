-- phpMyAdmin SQL Dump
-- version 4.6.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Mar 29, 2018 at 12:11 PM
-- Server version: 5.7.14
-- PHP Version: 5.6.25

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `chatapp_database`
--

-- --------------------------------------------------------

--
-- Table structure for table `threadinfo`
--

CREATE TABLE `threadinfo` (
  `id` int(11) NOT NULL,
  `threadTypeID` int(11) NOT NULL,
  `message` varchar(1000) NOT NULL,
  `userID` varchar(500) NOT NULL,
  `addedDate` varchar(500) NOT NULL,
  `addedTime` varchar(500) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `threadinfo`
--

INSERT INTO `threadinfo` (`id`, `threadTypeID`, `message`, `userID`, `addedDate`, `addedTime`) VALUES
(1, 1, 'Hi', 'Rashmal', '2018/03/29', '02:23:22'),
(2, 1, 'Hey', 'Rashmal', '2018/03/29', '02:46:00'),
(3, 1, 'Hello', 'Rashmal', '2018/03/29', '17:07:22'),
(4, 1, 'ABC', 'Rashmal', '2018/03/29', '17:07:30'),
(5, 1, 'Jass', 'Kevin', '2018/03/29', '17:27:54');

-- --------------------------------------------------------

--
-- Table structure for table `threadtypeinfo`
--

CREATE TABLE `threadtypeinfo` (
  `id` int(11) NOT NULL,
  `title` varchar(500) NOT NULL,
  `userID` varchar(500) NOT NULL,
  `createdDate` varchar(500) NOT NULL,
  `createdTime` varchar(500) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `threadtypeinfo`
--

INSERT INTO `threadtypeinfo` (`id`, `title`, `userID`, `createdDate`, `createdTime`) VALUES
(1, 'AC', 'Rashmal', '2018/03/29', '12:41:22'),
(2, 'ACC', 'Rashmal', '2018/03/29', '12:59:39');

-- --------------------------------------------------------

--
-- Table structure for table `userinfo`
--

CREATE TABLE `userinfo` (
  `ID` int(11) NOT NULL,
  `UserID` varchar(500) NOT NULL,
  `Nickname` varchar(500) NOT NULL,
  `Password` varchar(500) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `userinfo`
--

INSERT INTO `userinfo` (`ID`, `UserID`, `Nickname`, `Password`) VALUES
(5, 'AA', 'AA', 'AA'),
(4, 'Rashmal', 'Rashmal', 'Rashmal'),
(6, 'kevin', 'Kevin', 'Kevin');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `threadinfo`
--
ALTER TABLE `threadinfo`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `threadtypeinfo`
--
ALTER TABLE `threadtypeinfo`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `userinfo`
--
ALTER TABLE `userinfo`
  ADD PRIMARY KEY (`ID`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `threadinfo`
--
ALTER TABLE `threadinfo`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;
--
-- AUTO_INCREMENT for table `threadtypeinfo`
--
ALTER TABLE `threadtypeinfo`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
--
-- AUTO_INCREMENT for table `userinfo`
--
ALTER TABLE `userinfo`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
