package Undergraduate;


public class student {
public String major;
public double gpa;
public int creditHours;

public student(String major,double gpa,int creditHours) {
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

public String getYear() {
	return(null);
}
public String toString() {
	return("Major: "+ this.major+", GPA:"+this.getGpa()+", CreditHours: "+this.getCreditHours());
	}
public boolean equals(student s) {
	if ((this.major==s.major)&&(this.getGpa()==s.getGpa())&&(this.getCreditHours()==s.getCreditHours()&&this.getYear()==s.getYear())) {
	return true;
}
	else {
	return false;
}
}
}