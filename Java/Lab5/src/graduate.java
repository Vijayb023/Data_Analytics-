import Undergraduate.student;

public class graduate extends student {
	String degree;
	String Concentration;
	int years;
	public graduate(String major,double gpa, String degree, String Concentration, int years) {
		super(major,gpa, years);
		this.degree = degree;
		this.Concentration = Concentration;
		this.years=years;
		
	}
	public String getYear() {
		String yearstring = Integer.toString(this.years);
		return yearstring; 
	}
	public String getConcentration() {
		String str= this.Concentration;
		return str;
		
	}
	public String getDegree() {
		String str=this.degree;
		return str;
	}
	public String toString() {
		String str="Major is"+major+", gpa is"+getGpa()+", degree is "+getDegree()+", Concentration is " +getConcentration()+ ", year is"+getYear();
		return str;
	}
}
