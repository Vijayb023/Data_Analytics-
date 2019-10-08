package Undergraduate;

public class Exchange extends undergrade {
	String country;
	String year; 
	public Exchange (String major, double gpa, int creditHours, boolean honors, String year, String country) {
		super(major,gpa,creditHours,honors);
		this.country=country;
		this.year=year;
	}
	public String getYear() {
		String str=this.year;
		return str; 
	}
	public String getCountry() {
		String str=this.country;
		return str;
	}
	public String toString() {
		String str="Major is "+major+", gpa is "+getGpa()+", credit hours is "+getCreditHours()+", honors is "+isHonors()+", year is"+getYear()+", Country is "+getCountry();
		return str;
	}
	public boolean equals(Exchange name) {
	if((major==name.major)&&(getGpa()==name.getGpa())&&(getCreditHours()==name.getCreditHours())&&(isHonors()==name.isHonors())&&(getYear()==name.getYear())&&(getCountry()==name.getCountry())&&(getYear()==name.getYear())) {
		return true;
	}
	else {
		return false;
	}
	}
}
