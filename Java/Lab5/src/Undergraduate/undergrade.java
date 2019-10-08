package Undergraduate;


public class undergrade extends student{
	public boolean honors;
	
public undergrade(String major, double gpa, int creditHours,boolean honors) {
		super(major, gpa, creditHours);
		this.honors = honors;
	}

public boolean isHonors() {
	return(honors);
}
public String getYear(int creditHours) {
	if(creditHours<32)
		return ("freshmen");
	else if(creditHours<64)
		return("sophmore");
	else if(creditHours<96)
		return("junior");
	else return("senior");
	}
public String toString() {
	return(super.toString()+" ,honors: "+this.isHonors()+", year:"+this.getYear(creditHours));
}
public boolean equals(undergrade name) {
	if((major==name.major)&&(getGpa()==name.getGpa())&&(getCreditHours()==name.getCreditHours())&&(isHonors()==name.isHonors())) {
		return true;
}
	else {
		return false;
	}
}
}