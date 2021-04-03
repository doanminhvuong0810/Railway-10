CREATE DATABASE IF NOT EXISTS `Testing_System_Assignment_1`;
USE Testing_System_Assignment_1;
## IF NOT EXISTS khi mà database đã được tạo ra thì sql không tạo nữa mà chỉ đưa ra cảnh báo
CREATE TABLE IF NOT EXISTS `Department` (
    DepartmentID INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
    DepartmentName VARCHAR(50) NOT NULL
);
ALTER TABLE Department 
MODIFY DepartmentID INT NOT NULL PRIMARY KEY AUTO_INCREMENT;
ALTER TABLE Department  
CHANGE COLUMN DepartmentName1 DepartmentName1 NVARCHAR(100) NOT NULL;


INSERT INTO Department (DepartmentName1)
VALUE
	    ('Marketing'),
		( 'Sale'),
		( N'Giám đốc'),
		( N'Nhặt lá'),
        ( N'Đá ống bơ');
        
SELECT 
    *
FROM
    Department;       
      
CREATE TABLE IF NOT EXISTS `Position` (
    PositionID INT  KEY AUTO_INCREMENT,
    PositionName VARCHAR(50)
);
INSERT INTO `Position`  (PositionName)
VALUE
	    (N'Trưởng phòng'),
		( N'Thư ký'),
		( N'Kỹ sư'),
		( N'Tạp vụ'),
        ( N'Bảo vệ');
SELECT 
    *
FROM
    Position;  

CREATE TABLE IF NOT EXISTS `Account` (
    AccountID INT  PRIMARY KEY AUTO_INCREMENT,
    Email VARCHAR(50) ,
    Username VARCHAR(50) UNIQUE,
    FullName VARCHAR(50),
    DepartmentID INT,
    PositionID INT,
    CreateDate DATE
);

CREATE TABLE IF NOT EXISTS `Group` (
    GroupID INT PRIMARY KEY AUTO_INCREMENT,
    GroupName VARCHAR(50),
    CreatorID INT,
    CreateDate DATE
);

CREATE TABLE IF NOT EXISTS `GroupAccount` (
    GroupID INT PRIMARY KEY AUTO_INCREMENT,
    GroupName VARCHAR(50),
    CreatorID INT,
    CreateDate DATE
);

CREATE TABLE IF NOT EXISTS `TypeQuestion` (
    TypeID INT PRIMARY KEY AUTO_INCREMENT,
    TypeName VARCHAR(50)
);

CREATE TABLE IF NOT EXISTS `CategoryQuestion` (
    CategoryID INT PRIMARY KEY AUTO_INCREMENT,
   CategoryName VARCHAR(50)
);

CREATE TABLE IF NOT EXISTS `Question` (
    QuestionID INT PRIMARY KEY AUTO_INCREMENT,
    Content VARCHAR(50),
    CategoryID INT,
    TypeID INT,
    CreatorID INT,
    CreateDate DATE
);

CREATE TABLE IF NOT EXISTS `Answer` (
   AnswerID INT PRIMARY KEY AUTO_INCREMENT,
    Content VARCHAR(50),
    QuestionID INT,
   isCorrect BIT
);

CREATE TABLE IF NOT EXISTS `Exam` (
    ExamID INT PRIMARY KEY AUTO_INCREMENT,
    `Code` VARCHAR(50),
    Title VARCHAR(50),
    CategoryID INT,
    Duration VARCHAR(50),
    CreatorID INT,
    CreateDate DATE
);

CREATE TABLE IF NOT EXISTS `ExamQuestion` (
    ExamID INT PRIMARY KEY AUTO_INCREMENT,
    QuestionID INT
);