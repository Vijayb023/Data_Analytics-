package hw3;
public class CalenderDate implements Comparable<CalenderDate>
{	
	
	private int month;
	private int day;
	private int year; 

	public CalenderDate(int month, int day, int year)	{
		this.month = month;
		this.day = day;
		this.year = year;
	}

	public int compareTo(CalenderDate other){
		if(year != other.year){
			return year - other.year;
		}
		if(month != other.month){
			return month - other.month;
		}else{
			return day - other.day;
		}
	}

	public int getYear(){
		return year;
	}
		
	public int getMonth(){
		return month;
	}

	public int getDay(){
		return day;
	}	

	public String toString(){
		return month + "/" + day + "/" + year;
	}
}