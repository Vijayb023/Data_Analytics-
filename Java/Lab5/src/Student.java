package lab3;

public class Student {
public String major;
public double gpa;
public int creditHours;

public Student(String major,double gpa,int creditHours) {
	this.major=major;
	this.gpa = gpa;
	this.creditHours=creditHours;
}
public double getGpa() {
	return gpa;
}
public int getCreditHours() {
	return creditHours;
}
public String toString() {
	return("Major:"+ this.major+", GPA:"+this.getGpa()+", CreditHours:"+this.getCreditHours());
	}
public String getYear() {
	return(null);
}
}
