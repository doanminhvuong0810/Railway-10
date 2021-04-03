CREATE DATABASE IF NOT EXISTS `Testing_System_Assignment_1`;
USE Testing_System_Assignment_1;
## IF NOT EXISTS khi mà database đã được tạo ra thì sql không tạo nữa mà chỉ đưa ra cảnh báo
CREATE TABLE IF NOT EXISTS `Department` (
    DepartmentID INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
    DepartmentName VARCHAR(50) NOT NULL
);
ALTER TABLE  Department 
MODIFY DepartmentID INT NOT NULL PRIMARY KEY AUTO_INCREMENT;
ALTER TABLE Department  
CHANGE COLUMN DepartmentName1 DepartmentName NVARCHAR(100) NOT NULL;


INSERT INTO Department (DepartmentName)
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
    AccountID INT PRIMARY KEY AUTO_INCREMENT,
    Email VARCHAR(50),
    Username VARCHAR(50) UNIQUE,
    FullName VARCHAR(50) ,
    DepartmentID INT,
    PositionID INT,
    CreateDate DATE
);

INSERT INTO `Account` (Email,Username,FullName,DepartmentID,PositionID,CreateDate)
VALUE
	    ('doanminhvuong0810@gmail.com','vuongdoan','Đoàn Minh Vương',100,1001,'2021-04-01'),
		('dangtrunghai@gmail.com','haidang','Đặng Trung Hải',101,1002,'2021-04-02'),
		('doanvanduong@gmail.com','duongdoan','Đoàn Văn Dương',102,1003,'2021-04-03'),
		('nguyenvantam@gmail.com','tamnguyen','Nguyễn Văn Tâm',103,1004,'2021-04-04'),
		('buivanduc@gmail.com','ducbui','Bùi Văn Đức',105,1005,'2021-04-05')
		;


CREATE TABLE IF NOT EXISTS `Group` (
    GroupID INT PRIMARY KEY AUTO_INCREMENT,
    GroupName VARCHAR(50),
    CreatorID INT,
    CreateDate DATE
);
INSERT INTO `Group` (GroupName,CreatorID,CreateDate)
VALUE
	    ('CNV',10,'2020-04-01'),
		('VND',11,'2020-04-01'),
		('JKM',12,'2020-05-01'),
		('HKV',13,'2020-06-02'),
		('CNV',14,'2021-07-03')
        ;

CREATE TABLE IF NOT EXISTS `GroupAccount` (
    GroupID INT PRIMARY KEY AUTO_INCREMENT,
    GroupName VARCHAR(50),
    CreatorID INT,
    CreateDate DATE
);
INSERT INTO `GroupAccount` (GroupName,CreatorID,CreateDate)
VALUE
	    ('CNV1001',5300,'2020-04-01'),
		('VND1002',5301,'2020-04-01'),
		('JKM1003',5302,'2020-05-01'),
		('HKV1004',5303,'2020-06-02'),
		('CNV1005',5304,'2021-07-03')
        ;
CREATE TABLE IF NOT EXISTS `TypeQuestion` (
    TypeID INT PRIMARY KEY AUTO_INCREMENT,
    TypeName VARCHAR(50)
);
INSERT INTO `TypeQuestion` (TypeName)
VALUE
	    ('Essay'),
		( 'Multiple-Choice'),
		( 'General'),
		( 'Specific'),
        ( 'Double-barrelled');
        
CREATE TABLE IF NOT EXISTS `CategoryQuestion` (
    CategoryID INT PRIMARY KEY AUTO_INCREMENT,
   CategoryName VARCHAR(50)
);

INSERT INTO `TypeQuestion` (TypeName)
VALUE
	    ('Essay'),
		( 'Multiple-Choice'),
		( 'General'),
		( 'Specific'),
        ( 'Double-barrelled');

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

ALTER TABLE Answer
MODIFY isCorrect ENUM('Male','Female');
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