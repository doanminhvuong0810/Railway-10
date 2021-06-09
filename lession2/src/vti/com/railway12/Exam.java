package vti.com.railway12;
import java.time.LocalDate;


public class Exam {
	int ExamID;
	String Code;
	String Title;
	CategoryQuestion category;
	int Duration;
	Account creator;
	LocalDate createDate;
	Question[] questions;
}
