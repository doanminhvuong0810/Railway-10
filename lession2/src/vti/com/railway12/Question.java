package vti.com.railway12;
import java.time.LocalDate;


public class Question {
	int QuestionID;
	String Content;
	CategoryQuestion  category;
	TypeQuestion type;
	Account creator;
	LocalDate createDate;
	Exam[] exams;
}
