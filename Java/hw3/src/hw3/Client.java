package hw3;

	import java.util.ArrayList;
	import java.util.Collections;
	public class Client{
		public static void main(String[] args){
			CalenderDate c1 = new CalenderDate(9, 2, 2011);
			CalenderDate c2 = new CalenderDate(7, 18, 1995);
			CalenderDate c3 = new CalenderDate(3, 6, 1995);
			CalenderDate c4 = new CalenderDate(1, 1, 2011);
			CalenderDate c5 = new CalenderDate(4, 8, 1999);


			ArrayList calendarDates = new ArrayList();
			calendarDates.add(c1);
			calendarDates.add(c2);
			calendarDates.add(c3);
			calendarDates.add(c4);
			calendarDates.add(c5);


			System.out.println("Calendar dates before sorting: "
							+ calendarDates);

			Collections.sort(calendarDates);

			System.out.println("Calendar dates after sorting: "
							+ calendarDates);
		}
	}
