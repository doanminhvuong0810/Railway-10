CREATE DATABASE IF NOT EXISTS `Testing_System_Assignment_1`;
USE Testing_System_Assignment_1;

CREATE TABLE IF NOT EXISTS `Department` (
    DepartmentID INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
    DepartmentName VARCHAR(50) 
);


CREATE TABLE IF NOT EXISTS `Position` (
    PositionID INT KEY AUTO_INCREMENT,
    PositionName VARCHAR(50)
);



CREATE TABLE IF NOT EXISTS `Account` (
    AccountID INT PRIMARY KEY AUTO_INCREMENT,
    Email VARCHAR(50),
    Username VARCHAR(50) UNIQUE,
    FullName VARCHAR(50) ,
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
    GroupAccountID INT PRIMARY KEY AUTO_INCREMENT,
    GroupID INT,
    AccountID INT,
    JoinDate DATE
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
    Content VARCHAR(100),
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

/*
DROP TABLE Department;
DROP TABLE Answer;
DROP TABLE CategoryQuestion;
DROP TABLE Exam;
DROP TABLE ExamQuestion;
DROP TABLE `Group`;
DROP TABLE Position;
DROP TABLE Question;
DROP TABLE TypeQuestion;
DROP TABLE `Account`;
DROP TABLE `GroupAccount`;
*/


/*=========================================== QUESTION 1 ===========================================*/  

  INSERT INTO Department(DepartmentName) 
VALUES
						(N'Marketing'	),
						(N'Sale'		),
						(N'Bảo vệ'		),
						(N'Nhân sự'		),
						(N'Kỹ thuật'	),
						(N'Tài chính'	),
						(N'Phó giám đốc'),
						(N'Giám đốc'	),
						(N'Thư kí'		),
						(N'Bán hàng'	);
------------------------------------------------------------                       
INSERT INTO Position	(PositionName	) 
VALUES 					('Dev'			),
						('Test'			),
						('Scrum Master'	),
						('PM'			);                     
------------------------------------------------------------
INSERT INTO `Account`(Email								, Username			, FullName				, DepartmentID	, PositionID, CreateDate)
VALUES 				('haidang29productions@gmail.com'	, 'dangblack'		,'Nguyễn hải Đăng'		,   '5'			,   '1'		,'2020-03-05'),
					('account1@gmail.com'				, 'quanganh'		,'Nguyen Chien Thang2'	,   '1'			,   '2'	,    '2020-03-05'),
                    ('account2@gmail.com'				, 'vanchien'		,'Nguyen Van Chien'		,   '2'			,   '3'		,'2020-03-07'),
                    ('account3@gmail.com'				, 'cocoduongqua'	,'Duong Do'				,   '3'			,   '4'		,'2020-03-08'),
                    ('account4@gmail.com'				, 'doccocaubai'		,'Nguyen Chien Thang1'	,   '4'			,   '4'		,'2020-03-10'),
                    ('dapphatchetngay@gmail.com'		, 'khabanh'			,'Ngo Ba Kha'			,   '6'			,   '3'		,'2020-04-05'),
                    ('songcodaoly@gmail.com'			, 'huanhoahong'		,'Bui Xuan Huan'		,   '7'			,   '2'		,  NULL		),
                    ('sontungmtp@gmail.com'				, 'tungnui'			,'Nguyen Thanh Tung'	,   '8'			,   '1'		,'2020-04-07'),
                    ('duongghuu@gmail.com'				, 'duongghuu'		,'Duong Van Huu'		,   '9'			,   '2'		,'2020-04-07'),
                    ('vtiaccademy@gmail.com'			, 'vtiaccademy'		,'Vi Ti Ai'				,   '10'		,   '1'		,'2020-04-09');
-------------------------------------------------------------
INSERT INTO `Group`	(  GroupName			, CreatorID		, CreateDate)
VALUES 				(N'Testing System'		,   5			,'2019-03-05'),
					(N'Development'			,   1			,'2020-03-07'),
                    (N'VTI Sale 01'			,   2			,'2020-03-09'),
                    (N'VTI Sale 02'			,   3			,'2020-03-10'),
                    (N'VTI Sale 03'			,   4			,'2020-03-28'),
                    (N'VTI Creator'			,   6			,'2020-04-06'),
                    (N'VTI Marketing 01'	,   7			,'2020-04-07'),
                    (N'Management'			,   8			,'2020-04-08'),
                    (N'Chat with love'		,   9			,'2020-04-09'),
                    (N'Vi Ti Ai'			,   10			,'2020-04-10');
--------------------------------------------------------------------------------


 INSERT INTO `GroupAccount`	(  GroupID	, AccountID	, JoinDate	 )
VALUES 						(	1		,    1		,'2019-03-05'),
							(	1		,    2		,'2020-03-07'),
							(	3		,    3		,'2020-03-09'),
							(	3		,    4		,'2020-03-10'),
							(	5		,    5		,'2020-03-28'),
							(	1		,    3		,'2020-04-06'),
							(	1		,    7		,'2020-04-07'),
							(	8		,    3		,'2020-04-08'),
							(	1		,    9		,'2020-04-09'),
							(	10		,    10		,'2020-04-10');
--------------------------------------------------------------------------------
INSERT INTO TypeQuestion	(TypeName			) 
VALUES 						('Essay'			), 
							('Multiple-Choice'	);      
                         
--------------------------------------------------------------------------------
INSERT INTO CategoryQuestion		(CategoryName	)
VALUES 								('Java'			),
									('ASP.NET'		),
									('ADO.NET'		),
									('SQL'			),
									('Postman'		),
									('Ruby'			),
									('Python'		),
									('C++'			),
									('C Sharp'		),
									('PHP'			);
---------------------------------------------------------------------------------                                    
INSERT INTO Question	(Content			, CategoryID, TypeID		, CreatorID	, CreateDate )
VALUES 					(N'Câu hỏi về Java Câu hỏi về Java Câu hỏi về Java Câu hỏi về Java'	,	1		,   '1'			,   '2'		,'2020-04-05'),
						(N'Câu Hỏi về PHP'	,	10		,   '2'			,   '2'		,'2020-04-05'),
						(N'Hỏi về C#'		,	9		,   '2'			,   '3'		,'2020-04-06'),
						(N'Hỏi về Ruby'		,	6		,   '1'			,   '4'		,'2020-04-06'),
						(N'Hỏi về Postman'	,	5		,   '1'			,   '5'		,'2020-04-06'),
						(N'Hỏi về ADO.NET'	,	3		,   '2'			,   '6'		,'2020-04-06'),
						(N'Hỏi về ASP.NET'	,	2		,   '1'			,   '7'		,'2020-04-06'),
						(N'Hỏi về C++'		,	8		,   '1'			,   '8'		,'2020-04-07'),
						(N'Hỏi về SQL'		,	4		,   '2'			,   '9'		,'2020-04-07'),
						(N'Hỏi về Python'	,	7		,   '1'			,   '10'	,'2020-04-07');
------------------------------------------------------------------------------------                        
INSERT INTO Answer	(  Content		, QuestionID	, isCorrect	)
VALUES 				(N'Trả lời 01'	,   1			,	0		),
					(N'Trả lời 02'	,   1			,	1		),
                    (N'Trả lời 03'	,   1			,	0		),
                    (N'Trả lời 04'	,   1			,	1		),
                    (N'Trả lời 05'	,   2			,	1		),
                    (N'Trả lời 06'	,   3			,	1		),
                    (N'Trả lời 07'	,   4			,	0		),
                    (N'Trả lời 08'	,   8			,	0		),
                    (N'Trả lời 09'	,   9			,	1		),
                    (N'Trả lời 10'	,   10			,	1		);
 ------------------------------------------------------------------------------------ 
 INSERT INTO Exam	(`Code`			, Title					, CategoryID	, Duration	, CreatorID		, CreateDate )
VALUES 				('VTIQ001'		, N'Đề thi C#'			,	1			,	60		,   '5'			,'2019-04-05'),
					('VTIQ002'		, N'Đề thi PHP'			,	10			,	60		,   '2'			,'2019-04-05'),
                    ('VTIQ003'		, N'Đề thi C++'			,	9			,	120		,   '2'			,'2019-04-07'),
                    ('VTIQ004'		, N'Đề thi Java'		,	6			,	60		,   '3'			,'2020-04-08'),
                    ('VTIQ005'		, N'Đề thi Ruby'		,	5			,	120		,   '4'			,'2020-04-10'),
                    ('VTIQ006'		, N'Đề thi Postman'		,	3			,	60		,   '6'			,'2020-04-05'),
                    ('VTIQ007'		, N'Đề thi SQL'			,	2			,	60		,   '7'			,'2020-04-05'),
                    ('VTIQ008'		, N'Đề thi Python'		,	8			,	60		,   '8'			,'2020-04-07'),
                    ('VTIQ009'		, N'Đề thi ADO.NET'		,	4			,	90		,   '9'			,'2020-04-07'),
                    ('VTIQ010'		, N'Đề thi ASP.NET'		,	7			,	90		,   '10'		,'2020-04-08');
----------------------------------------------------------------------------------------
INSERT INTO ExamQuestion(ExamID	, QuestionID	) 
VALUES 					(	1	,		5		),
						(	2	,		10		), 
						(	3	,		4		), 
						(	4	,		3		), 
						(	5	,		7		), 
						(	6	,		10		), 
						(	7	,		2		), 
						(	8	,		10		), 
						(	9	,		9		), 
						(	10	,		8		); 
                        
/*=========================================== QUESTION 2 ===========================================*/         
SELECT 
    *
FROM
    Department;

/*=========================================== QUESTION 3 ===========================================*/     
 
 SELECT DepartmentID FROM  Department WHERE DepartmentName='Sale';
 
/*=========================================== QUESTION 4 ===========================================*/   


SELECT * FROM `Account` WHERE char_length(FullName) = (SELECT MAX(char_length(FullName)) FROM `Account`) ;      

/*=========================================== QUESTION 5 ===========================================*/    

SELECT * FROM `Account` WHERE char_length(FullName)  = (SELECT MAX(char_length(FullName)) FROM `Account` WHERE AccountID=3);
SELECT * FROM `Account` WHERE char_length(FullName)  = (SELECT MAX(char_length(FullName)) FROM `Account`) AND AccountID=3;


/*=========================================== QUESTION 6 ===========================================*/   

SELECT GroupName FROM `Group` WHERE CreateDate < '2019-12-20';

/*=========================================== QUESTION 7 ===========================================*/   

SELECT QuestionID FROM Answer GROUP BY QuestionID HAVING  COUNT(*)>=4 ;

/*=========================================== QUESTION 8 ===========================================*/ 

SELECT `Code` FROM Exam WHERE Duration >= 60 AND CreateDate < '2019-12-20';

/*=========================================== QUESTION 9 ===========================================*/ 

SELECT * FROM `Group` GROUP BY  CreatorID ORDER BY CreateDate DESC LIMIT 5;

/*=========================================== QUESTION 10 ===========================================*/ 

SELECT COUNT(*) AS 'SỐ NHÂN VIÊN' FROM Department WHERE DepartmentID = 2 ;

/*=========================================== QUESTION 11 ===========================================*/ 

SELECT * FROM Department WHERE DepartmentName LIKE'D%o' ;

/*=========================================== QUESTION 12 ===========================================*/ 

DELETE FROM Exam WHERE CreateDate < '2019-12-20';
       
/*=========================================== QUESTION 13 ===========================================*/ 

DELETE FROM Question WHERE Content LIKE 'câu hỏi&';

/*=========================================== QUESTION 14 ===========================================*/ 
                  
UPDATE `Account` 
SET 
    FullName = 'Nguyễn Bá Lộc',
    Email = 'loc.nguyenba@vti.com.vn'
WHERE
    AccountID = 5;
    SELECT * FROM `Account` ;
    
/*=========================================== QUESTION 15 ===========================================*/   

UPDATE `GroupAccount` 
SET 
    AccountID = 5
WHERE
    GroupID = 4;

  