-- phpMyAdmin SQL Dump
-- version 4.8.3
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Nov 02, 2019 at 10:25 AM
-- Server version: 10.1.36-MariaDB
-- PHP Version: 7.2.10

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `xcarrentaldb`
--

-- --------------------------------------------------------

--
-- Table structure for table `carregister`
--

CREATE TABLE `carregister` (
  `id` int(11) NOT NULL,
  `carno` varchar(50) NOT NULL,
  `make` varchar(50) NOT NULL,
  `model` varchar(50) NOT NULL,
  `available` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `carregister`
--

INSERT INTO `carregister` (`id`, `carno`, `make`, `model`, `available`) VALUES
(2, 'CN002', 'tayk', 'suzuki', 'Yes'),
(3, 'CN003', 'john', 'mitsubishi', 'Yes'),
(4, 'CN004', 'max', 'max', 'Yes'),
(5, 'CN005', 'gas', 'das', 'Yes'),
(6, 'CN006', 'yaaw', 'hobda', 'Yes'),
(9, 'CN007', 'asda', 'asdad', 'Yes'),
(10, 'CN008', 'asdad', 'asdad', 'Yes'),
(11, 'CN009', 'ret', 'ret', 'No'),
(12, 'CN009', 'tar', 'tar', 'No');

-- --------------------------------------------------------

--
-- Table structure for table `cus`
--

CREATE TABLE `cus` (
  `id` int(11) NOT NULL,
  `cust_id` varchar(50) NOT NULL,
  `name` varchar(50) NOT NULL,
  `address` text NOT NULL,
  `mobile` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `cus`
--

INSERT INTO `cus` (`id`, `cust_id`, `name`, `address`, `mobile`) VALUES
(1, 'CS001', 'Yaws', 'Manila', '123133123'),
(2, 'CS002', 'max', 'manila', '1212121'),
(3, 'CS003', 'gas', 'asdad', '12313'),
(4, 'CS004', 'yawki', 'asda', '12313'),
(5, 'CS005', 'yaaw', 'asdad', '23424324'),
(6, 'CS006', 'was', 'was', '23424'),
(7, 'CS007', 'gerald', 'pasay', '232323');

-- --------------------------------------------------------

--
-- Table structure for table `rental`
--

CREATE TABLE `rental` (
  `id` int(11) NOT NULL,
  `car_id` varchar(50) NOT NULL,
  `cust_id` varchar(50) NOT NULL,
  `fee` int(11) NOT NULL,
  `date` varchar(50) NOT NULL,
  `due` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `rental`
--

INSERT INTO `rental` (`id`, `car_id`, `cust_id`, `fee`, `date`, `due`) VALUES
(12, 'CN009', 'cs007', 300, '2018-06-01', '2019-11-02');

-- --------------------------------------------------------

--
-- Table structure for table `returncar`
--

CREATE TABLE `returncar` (
  `id` int(11) NOT NULL,
  `carid` varchar(50) NOT NULL,
  `custid` varchar(50) NOT NULL,
  `return_date` varchar(50) NOT NULL,
  `elap` int(11) NOT NULL,
  `fine` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `carregister`
--
ALTER TABLE `carregister`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `cus`
--
ALTER TABLE `cus`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `rental`
--
ALTER TABLE `rental`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `returncar`
--
ALTER TABLE `returncar`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `carregister`
--
ALTER TABLE `carregister`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=13;

--
-- AUTO_INCREMENT for table `cus`
--
ALTER TABLE `cus`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- AUTO_INCREMENT for table `rental`
--
ALTER TABLE `rental`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=14;

--
-- AUTO_INCREMENT for table `returncar`
--
ALTER TABLE `returncar`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
