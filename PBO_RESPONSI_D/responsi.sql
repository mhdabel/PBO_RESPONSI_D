-- phpMyAdmin SQL Dump
-- version 4.9.0.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: May 13, 2020 at 06:00 PM
-- Server version: 10.4.6-MariaDB
-- PHP Version: 7.3.9

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `responsi`
--

-- --------------------------------------------------------

--
-- Table structure for table `admin`
--

CREATE TABLE `admin` (
  `ID_A` varchar(9) NOT NULL,
  `Nama_A` varchar(20) NOT NULL,
  `Alamat_A` text NOT NULL,
  `No_hp_A` varchar(15) NOT NULL,
  `Posisi_A` varchar(15) NOT NULL,
  `Gaji_A` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `admin`
--

INSERT INTO `admin` (`ID_A`, `Nama_A`, `Alamat_A`, `No_hp_A`, `Posisi_A`, `Gaji_A`) VALUES
('123', 'qweqwesdf', 'sdff34', '3434', '12', 324234);

-- --------------------------------------------------------

--
-- Table structure for table `karyawan`
--

CREATE TABLE `karyawan` (
  `Total_gaji` varchar(20) NOT NULL,
  `ID` varchar(20) NOT NULL,
  `Nama` varchar(20) NOT NULL,
  `Posisi` varchar(20) NOT NULL,
  `Alamat` varchar(20) NOT NULL,
  `NoHp` varchar(20) NOT NULL,
  `Gaji_pokok` varchar(20) NOT NULL,
  `Lembur` varchar(20) NOT NULL,
  `Tunjangan` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `karyawan`
--

INSERT INTO `karyawan` (`Total_gaji`, `ID`, `Nama`, `Posisi`, `Alamat`, `NoHp`, `Gaji_pokok`, `Lembur`, `Tunjangan`) VALUES
('301892', '123321', 'adssda', 'Direktur', 'asdasd', '213123', '123123', '12', '180000');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
