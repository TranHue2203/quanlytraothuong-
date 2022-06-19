-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Máy chủ: 127.0.0.1
-- Thời gian đã tạo: Th12 17, 2021 lúc 02:49 PM
-- Phiên bản máy phục vụ: 10.4.21-MariaDB
-- Phiên bản PHP: 8.0.11

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Cơ sở dữ liệu: `quan_ly_phan_thuong`
--

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `canbo`
--

CREATE TABLE `canbo` (
  `Ten` varchar(30) NOT NULL,
  `MaCanBo` int(11) NOT NULL,
  `ChucVu` varchar(20) NOT NULL,
  `DiaChi` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `de_muc_phan_thuong`
--

CREATE TABLE `de_muc_phan_thuong` (
  `TenPhanThuong` varchar(20) NOT NULL,
  `DangThuong` varchar(20) NOT NULL,
  `GiaTri` double DEFAULT NULL,
  `NgayThuong` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Đang đổ dữ liệu cho bảng `de_muc_phan_thuong`
--

INSERT INTO `de_muc_phan_thuong` (`TenPhanThuong`, `DangThuong`, `GiaTri`, `NgayThuong`) VALUES
('Bánh', 'HS Khá', 50000, '2021-12-15'),
('Bim Bim', 'HS Giỏi', 5000, '2021-12-15'),
('Kẹo', 'Bé Ngoan', 2000, '2021-12-15'),
('Tiền', 'Bé Ngoan', 100000, '2021-12-15'),
('Vở', 'HS Giỏi', 100000, '2021-12-15');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `nhan_khau`
--

CREATE TABLE `nhan_khau` (
  `ID` int(11) NOT NULL,
  `HoTen` varchar(30) NOT NULL,
  `NguyenQuan` varchar(50) NOT NULL,
  `DiaChiThuongTru` varchar(50) NOT NULL,
  `IDHoKhau` int(11) NOT NULL,
  `CCCD` char(12) DEFAULT NULL,
  `GioiTinh` varchar(10) NOT NULL,
  `Quanhevoichuho` varchar(10) NOT NULL,
  `NgaySinh` date NOT NULL,
  `NgheNghiep` varchar(20) NOT NULL,
  `ThanhTich` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Đang đổ dữ liệu cho bảng `nhan_khau`
--

INSERT INTO `nhan_khau` (`ID`, `HoTen`, `NguyenQuan`, `DiaChiThuongTru`, `IDHoKhau`, `CCCD`, `GioiTinh`, `Quanhevoichuho`, `NgaySinh`, `NgheNghiep`, `ThanhTich`) VALUES
(1, 'Trần Thị Huế', 'Xuân Trường, Nam Định', 'Xuân Trường, Nam Định', 1, '036301012278', 'Nữ', 'Chủ Hộ', '2001-03-22', 'Sinh Viên', 'Không'),
(2, 'Lê Thị Hồng', 'Thanh Hóa', 'Sầm Sơn - Thanh Hóa', 1, '036301012222', 'Nữ', 'Con', '2008-01-01', 'Sinh Viên', 'Học Sinh Giỏi'),
(3, 'Đỗ Duy Hùng', 'Hà Nội', 'Hà Nội', 3, '036201012224', 'Nam', 'Chủ Hộ', '1960-04-04', 'Làm Nông', 'Không'),
(4, 'Nguyễn Thị Hạnh', 'Thái Bình', 'Thái Bình', 1, '036301012221', 'Nữ', 'Con', '2006-07-15', 'Sinh Viên', 'Học Sinh Khá'),
(5, 'Hoàng Vinh Khánh', 'Hà Nội', 'Hà Nội', 2, '036201012111', 'Nam', 'Chủ Hộ', '1996-06-04', 'Làm Nông', 'Không'),
(6, 'Hà Việt Hòa', 'Hà Nội', 'Nam Từ Liêm - Hà Nội', 2, '036201012112', 'Nam', 'Con', '2001-04-02', 'Sinh Viên', 'Học Sinh Khá');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `so_ho_khau`
--

CREATE TABLE `so_ho_khau` (
  `ID` int(11) NOT NULL,
  `TenChuHo` varchar(30) NOT NULL,
  `DiaChi` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Đang đổ dữ liệu cho bảng `so_ho_khau`
--

INSERT INTO `so_ho_khau` (`ID`, `TenChuHo`, `DiaChi`) VALUES
(1, 'Trần Thị Huế', 'Xuân Trường, Nam Định'),
(2, 'Hoàng Vinh Khánh', 'Hà Nội'),
(3, 'Đỗ Duy Hùng', 'Hà Nội');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `tai_khoan`
--

CREATE TABLE `tai_khoan` (
  `TaiKhoan` varchar(20) NOT NULL,
  `MatKhau` varchar(20) NOT NULL,
  `IDCanBo` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Đang đổ dữ liệu cho bảng `tai_khoan`
--

INSERT INTO `tai_khoan` (`TaiKhoan`, `MatKhau`, `IDCanBo`) VALUES
('tranhue', '123456', '1');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `trao_thuong`
--

CREATE TABLE `trao_thuong` (
  `GiaTriPhanQua` double NOT NULL,
  `IDNhanKhau` int(11) NOT NULL,
  `TenPhanThuong` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Đang đổ dữ liệu cho bảng `trao_thuong`
--

INSERT INTO `trao_thuong` (`GiaTriPhanQua`, `IDNhanKhau`, `TenPhanThuong`) VALUES
(100000, 1, 'Tiền'),
(100000, 4, 'Tiền'),
(100000, 5, 'Tiền'),
(100000, 6, 'Tiền'),
(2000, 1, 'Kẹo'),
(2000, 2, 'Kẹo'),
(2000, 4, 'Kẹo'),
(2000, 5, 'Kẹo'),
(2000, 6, 'Kẹo'),
(5000, 1, 'Bim Bim'),
(5000, 2, 'Bim Bim'),
(5000, 4, 'Bim Bim'),
(5000, 5, 'Bim Bim'),
(5000, 6, 'Bim Bim');

--
-- Chỉ mục cho các bảng đã đổ
--

--
-- Chỉ mục cho bảng `canbo`
--
ALTER TABLE `canbo`
  ADD PRIMARY KEY (`MaCanBo`);

--
-- Chỉ mục cho bảng `de_muc_phan_thuong`
--
ALTER TABLE `de_muc_phan_thuong`
  ADD PRIMARY KEY (`TenPhanThuong`);

--
-- Chỉ mục cho bảng `nhan_khau`
--
ALTER TABLE `nhan_khau`
  ADD PRIMARY KEY (`ID`),
  ADD KEY `IDHoKhau` (`IDHoKhau`);

--
-- Chỉ mục cho bảng `so_ho_khau`
--
ALTER TABLE `so_ho_khau`
  ADD PRIMARY KEY (`ID`);

--
-- Chỉ mục cho bảng `tai_khoan`
--
ALTER TABLE `tai_khoan`
  ADD PRIMARY KEY (`TaiKhoan`,`MatKhau`);

--
-- Chỉ mục cho bảng `trao_thuong`
--
ALTER TABLE `trao_thuong`
  ADD KEY `IDNhanKhau` (`IDNhanKhau`),
  ADD KEY `TenPhanThuong` (`TenPhanThuong`);

--
-- AUTO_INCREMENT cho các bảng đã đổ
--

--
-- AUTO_INCREMENT cho bảng `canbo`
--
ALTER TABLE `canbo`
  MODIFY `MaCanBo` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT cho bảng `nhan_khau`
--
ALTER TABLE `nhan_khau`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- AUTO_INCREMENT cho bảng `so_ho_khau`
--
ALTER TABLE `so_ho_khau`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- Các ràng buộc cho các bảng đã đổ
--

--
-- Các ràng buộc cho bảng `nhan_khau`
--
ALTER TABLE `nhan_khau`
  ADD CONSTRAINT `nhan_khau_ibfk_1` FOREIGN KEY (`IDHoKhau`) REFERENCES `so_ho_khau` (`ID`) ON DELETE CASCADE;

--
-- Các ràng buộc cho bảng `trao_thuong`
--
ALTER TABLE `trao_thuong`
  ADD CONSTRAINT `trao_thuong_ibfk_1` FOREIGN KEY (`IDNhanKhau`) REFERENCES `nhan_khau` (`ID`) ON DELETE CASCADE,
  ADD CONSTRAINT `trao_thuong_ibfk_2` FOREIGN KEY (`TenPhanThuong`) REFERENCES `de_muc_phan_thuong` (`TenPhanThuong`) ON DELETE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
