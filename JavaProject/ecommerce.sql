-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: localhost
-- Generation Time: Dec 24, 2022 at 10:46 AM
-- Server version: 10.4.24-MariaDB
-- PHP Version: 8.0.19

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `ecommerce`
--

-- --------------------------------------------------------

--
-- Table structure for table `brand`
--

CREATE TABLE `brand` (
  `bid` int(11) NOT NULL,
  `brandname` varchar(30) NOT NULL,
  `brandimage` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `brand`
--

INSERT INTO `brand` (`bid`, `brandname`, `brandimage`) VALUES
(36, 'maybelline', 'maybelline_makeup.jpg'),
(37, 'huda', 'huda.jpeg'),
(38, 'sugar', 'Sugar-makeup.jpg'),
(39, 'lakme', 'lakme.jpg'),
(40, 'mac', 'mac.jpg'),
(41, 'kay', 'kay_beauty.png'),
(42, 'forever52', 'forever52.png'),
(43, 'elf', 'elf.jpg'),
(44, 'loreal', 'loreal_paris.jpg'),
(45, 'plam', 'plam.jpg'),
(46, 'pixi', 'pixi.png'),
(47, 'wishful', 'wishful.png');

-- --------------------------------------------------------

--
-- Table structure for table `category`
--

CREATE TABLE `category` (
  `cid` int(10) NOT NULL,
  `category` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `category`
--

INSERT INTO `category` (`cid`, `category`) VALUES
(3, 'haircut'),
(4, 'skin'),
(5, 'Brooming'),
(15, 'Makeup');

-- --------------------------------------------------------

--
-- Table structure for table `group_table`
--

CREATE TABLE `group_table` (
  `id` int(20) NOT NULL,
  `name` text NOT NULL,
  `username` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `group_table`
--

INSERT INTO `group_table` (`id`, `name`, `username`) VALUES
(1, 'admin', 'sevaykar');

-- --------------------------------------------------------

--
-- Table structure for table `order_master`
--

CREATE TABLE `order_master` (
  `id` int(11) NOT NULL,
  `order_id` int(11) NOT NULL,
  `pid` int(11) NOT NULL,
  `pname` varchar(255) NOT NULL,
  `qty` int(11) NOT NULL,
  `price` int(11) NOT NULL,
  `total_price` int(11) NOT NULL,
  `paid_amount` varchar(255) NOT NULL,
  `date` datetime NOT NULL DEFAULT current_timestamp(),
  `status` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `order_master`
--

INSERT INTO `order_master` (`id`, `order_id`, `pid`, `pname`, `qty`, `price`, `total_price`, `paid_amount`, `date`, `status`) VALUES
(1, 3, 15, 'Huda Beauty Fauxfilter Skin Finish Buildable Coverage Foundation Stick', 1, 3200, 3200, '', '2021-11-17 15:10:13', 'confirm'),
(2, 1, 23, 'SUGAR Goddess Of Flawless SPF30+ BB Cream', 1, 699, 699, '', '2021-11-17 15:17:05', 'pending'),
(3, 1, 61, 'Lakme Eyeconic Curling Mascara - Black', 1, 450, 450, '', '2021-11-17 15:17:05', 'confirm'),
(48, 15, 98, 'Charlotte Tilbury Wonderglow', 1, 4584, 4584, '', '2022-02-21 22:18:28', 'confirm'),
(49, 16, 52, 'Murad Retinol Youth Renewal Night Cream', 1, 6800, 6800, '', '2022-02-21 22:20:09', 'pending'),
(50, 17, 61, 'Lakme Eyeconic Curling Mascara - Black', 2, 450, 900, '900', '2022-02-22 21:09:49', 'confirm'),
(51, 18, 33, 'Charlotte Tilbury Cheek To Chic - Ecstasy', 2, 3800, 7600, '', '2022-03-19 18:01:06', 'confirm'),
(52, 18, 34, 'Huda Beauty Easy Bake Loose Powder-Coffe Cake', 1, 2950, 2950, '', '2022-03-19 18:01:06', 'confirm');

-- --------------------------------------------------------

--
-- Table structure for table `product`
--

CREATE TABLE `product` (
  `pid` int(11) NOT NULL,
  `categoryid` int(11) NOT NULL,
  `productname` varchar(30) NOT NULL,
  `brandid` int(11) NOT NULL,
  `mrp` int(11) NOT NULL,
  `sellingprice` int(11) NOT NULL,
  `qty` int(11) NOT NULL,
  `images` varchar(255) NOT NULL,
  `title` varchar(50) NOT NULL,
  `description` varchar(50) NOT NULL,
  `intgredients` varchar(50) NOT NULL,
  `howto` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `product`
--

INSERT INTO `product` (`pid`, `categoryid`, `productname`, `brandid`, `mrp`, `sellingprice`, `qty`, `images`, `title`, `description`, `intgredients`, `howto`) VALUES
(11, 15, 'abc', 36, 40, 30, 5, 's_l_matte_lipstick.jpg', 'lip', 'lip', 'lip', 'lip');

-- --------------------------------------------------------

--
-- Table structure for table `users`
--

CREATE TABLE `users` (
  `uid` int(10) NOT NULL,
  `username` varchar(255) NOT NULL,
  `email` varchar(255) NOT NULL,
  `mobilenumber` varchar(20) NOT NULL,
  `password` varchar(500) NOT NULL,
  `cpassword` varchar(500) NOT NULL,
  `address` text NOT NULL,
  `city` varchar(255) NOT NULL,
  `state` varchar(255) NOT NULL,
  `pincode` varchar(255) NOT NULL,
  `type` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `users`
--

INSERT INTO `users` (`uid`, `username`, `email`, `mobilenumber`, `password`, `cpassword`, `address`, `city`, `state`, `pincode`, `type`) VALUES
(58, 'meet', 'meet@gmail.com', '56171717', 'PBKDF2WithHmacSHA256:2048:fkSLTSnpDmpN06K+AkCZpglz2gyRsCPDw3Aqmntc8hM=:O9l3h6SbU174LraidTMIha9AmLCJfD3tfUbbR5z2hAk=', 'PBKDF2WithHmacSHA256:2048:zb8+vB2avE1yzHNeQavY7P1GicC+aIyJfmRaxMvjoEo=:32e/gIdUoOg5bLch8MCJcGUpsPoFonceLmYNSpEEumo=', 'ksjdhskdhsdh', 'lhhssihiwiiw', 'jjsisiiwiwiiwi', '989898', 'user'),
(60, 'sevaykar', 'sevaykar@gmail.com', '1234567890', 'PBKDF2WithHmacSHA256:2048:iPVyspG3RGiDHx4qR4FL63ajBgrGAbX7mKRBUMIgUXs=:gQgGxxDwRBT3JxcNGjVm4MJ9hI4qtpc0uviTU8wWcOA=', 'PBKDF2WithHmacSHA256:2048:Dw0gg0RZIgi6gI7wNHLGBBMHKBZF+qfFy/9bO/y7Ugs=:oGiEHMYfpCnIeOAH3mm48nWVYDcvMET+rsnnYYOQJRQ=', 'jhsjhjhshjjh', 'jhjshjshjshj', 'hjsjshjshshj', '394210', 'user'),
(62, 'admin', 'admin@gmail.com', '898906565', 'PBKDF2WithHmacSHA256:2048:PoPPENzeCi68+BRRipzB8Y8Dq99ZyYEYWGqeQT43N/Q=:vx3vxgBOzk003wgv5pw14zVKn2sADm8S5TDMq63MhPQ=', 'PBKDF2WithHmacSHA256:2048:YwOlm68E+EbNHnefDXjPyk+XW3U16vpk8NyCqVHGP80=:nQ7ZYanZr3iEeNY4+UFC1bWN4jARdlovDiuA+waC7UY=', 'aaa', 'surat', 'Gujrat', '394210', 'admin'),
(63, 'Anjali', 'anjali@gmail.com', '89898998', 'PBKDF2WithHmacSHA256:2048:1Tq28A1J3i8wLiGI0xQJgbn6aVLFn559CV7kO3k98xw=:+YSI2prw3NMGMJihcEfEfZoR2ivepKYS3QSxWcofl3I=', 'PBKDF2WithHmacSHA256:2048:TCMNP7E4kWp0M5Pql6IbOPrD18BBTwr+/w8mXH4qA/g=:+GahoOTL5C9H35bLpn7+bAGpmr+W02CEQVPN6wI2YpY=', 'modal town', 'surat', 'gujrat', '75787', 'user'),
(64, 'nikhilpawar', 'nikhil2002@gmail.com', '9909901923', 'PBKDF2WithHmacSHA256:2048:mKHwLAOkk/6BbrR6aTn/jGv9ZC7swzCNB9p7R/harQw=:LAI3ty/DU1LcK0DYRBbZ3wkd2S5pjj5qUWK6hQ7Rbmo=', 'PBKDF2WithHmacSHA256:2048:iEBVafnEg4wRddy/4kQo+86Alq6xRS6g1GIDD5qJBvg=:403pVkIajOwQgeHeyNdQNYx/I5EJzmsb6GGEaeIafRY=', 'godadara', 'surat', 'gujrat', '394210', 'user'),
(65, 'nikita', 'niki@gmail.com', '573575757', 'PBKDF2WithHmacSHA256:2048:lgOIqj4CvRo2Ooy8sRJSJ9ygfIaTm+JxnMRI2ipIK+o=:7vWZufYIzQOfXJYxClXBoXjft+mNRiUwyNZvvOEYfKg=', 'PBKDF2WithHmacSHA256:2048:o/maKamAFmSCjyKgVHyJ+sYvd3+kZT2ToY8jKJCdfUE=:LegNpYzfJr6DJao+bG1+GV9o5jFwa3yXFj2Az/1q5V8=', 'priyanka soc', 'surat', 'gujrat', '395010', 'user');

-- --------------------------------------------------------

--
-- Table structure for table `user_order_detail`
--

CREATE TABLE `user_order_detail` (
  `oid` int(11) NOT NULL,
  `uid` int(11) NOT NULL,
  `full_name` varchar(255) NOT NULL,
  `email` varchar(255) NOT NULL,
  `address` text NOT NULL,
  `city` varchar(255) NOT NULL,
  `state` varchar(255) NOT NULL,
  `pincode` varchar(255) NOT NULL,
  `payment_mode` varchar(255) NOT NULL,
  `paid_amount` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `user_order_detail`
--

INSERT INTO `user_order_detail` (`oid`, `uid`, `full_name`, `email`, `address`, `city`, `state`, `pincode`, `payment_mode`, `paid_amount`) VALUES
(18, 7, 'Ishika Pawar', 'ishika@gmail.com', 'astik', 'surat', 'gujrat', '1001', 'Case On Delivery', ''),
(19, 7, 'POLLY SANDRES', 'pollysanders@yahoo.com', '759 JEHOVAH DR', 'ASHBURN', 'VA', '20149', '', ''),
(20, 7, 'Nikhil Pawar', 'nikhilpawar2003@gmail.com', '307 Astik Apartment godadara surat', 'surat', 'gd', '1234', 'Google Pay', '');

-- --------------------------------------------------------

--
-- Table structure for table `wishlist`
--

CREATE TABLE `wishlist` (
  `wid` int(11) NOT NULL,
  `uid` int(11) NOT NULL,
  `pid` int(11) NOT NULL,
  `date` datetime NOT NULL DEFAULT current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `wishlist`
--

INSERT INTO `wishlist` (`wid`, `uid`, `pid`, `date`) VALUES
(16, 8, 93, '2022-08-13 16:31:03');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `brand`
--
ALTER TABLE `brand`
  ADD PRIMARY KEY (`bid`);

--
-- Indexes for table `category`
--
ALTER TABLE `category`
  ADD PRIMARY KEY (`cid`);

--
-- Indexes for table `group_table`
--
ALTER TABLE `group_table`
  ADD PRIMARY KEY (`id`),
  ADD KEY `username` (`username`);

--
-- Indexes for table `order_master`
--
ALTER TABLE `order_master`
  ADD PRIMARY KEY (`id`),
  ADD KEY `order_master_ibfk_2` (`pid`);

--
-- Indexes for table `product`
--
ALTER TABLE `product`
  ADD PRIMARY KEY (`pid`),
  ADD KEY `category` (`categoryid`),
  ADD KEY `brand` (`brandid`);

--
-- Indexes for table `users`
--
ALTER TABLE `users`
  ADD PRIMARY KEY (`uid`),
  ADD UNIQUE KEY `email` (`email`),
  ADD UNIQUE KEY `username` (`username`);

--
-- Indexes for table `user_order_detail`
--
ALTER TABLE `user_order_detail`
  ADD PRIMARY KEY (`oid`);

--
-- Indexes for table `wishlist`
--
ALTER TABLE `wishlist`
  ADD PRIMARY KEY (`wid`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `brand`
--
ALTER TABLE `brand`
  MODIFY `bid` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=48;

--
-- AUTO_INCREMENT for table `category`
--
ALTER TABLE `category`
  MODIFY `cid` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=74;

--
-- AUTO_INCREMENT for table `order_master`
--
ALTER TABLE `order_master`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=54;

--
-- AUTO_INCREMENT for table `product`
--
ALTER TABLE `product`
  MODIFY `pid` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12;

--
-- AUTO_INCREMENT for table `users`
--
ALTER TABLE `users`
  MODIFY `uid` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=66;

--
-- AUTO_INCREMENT for table `user_order_detail`
--
ALTER TABLE `user_order_detail`
  MODIFY `oid` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=21;

--
-- AUTO_INCREMENT for table `wishlist`
--
ALTER TABLE `wishlist`
  MODIFY `wid` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=17;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `group_table`
--
ALTER TABLE `group_table`
  ADD CONSTRAINT `group_table_ibfk_1` FOREIGN KEY (`username`) REFERENCES `users` (`username`);

--
-- Constraints for table `order_master`
--
ALTER TABLE `order_master`
  ADD CONSTRAINT `order_master_ibfk_2` FOREIGN KEY (`pid`) REFERENCES `product` (`pid`);

--
-- Constraints for table `product`
--
ALTER TABLE `product`
  ADD CONSTRAINT `product_ibfk_1` FOREIGN KEY (`categoryid`) REFERENCES `category` (`cid`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `product_ibfk_2` FOREIGN KEY (`brandid`) REFERENCES `brand` (`bid`) ON DELETE CASCADE ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
