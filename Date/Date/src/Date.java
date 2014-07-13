
public class Date {
	private int day;
	private int date;
	private int month;
	private int year;
	public static final String[] DAYS_NAME = {"Sunday", "Monday", "Tuesday",
		"Wednesday", "Thursday", "Friday", "Saturday"};
	
	public static final String[] MONTHS_NAME = {"", "January", "Febuary",
		  "March", "April", "May", "June", "July", "August", "September", "October",
		  "November", "December"};
	
	public int getDate() {
		return date;
	}
	
	public void setDate(int date) {
		this.date = date;
	}
	
	public int getMonth() {
		return month;
	}
	
	public void setMonth(int month) {
		this.month = month;
	}
	
	public int getYear() {
		return year;
	}
	
	public void setYear(int year) {
		this.year = year;
	}

	public Date(int year, int month, int date) {
		this.year = year;
		this.month = month;
		this.date = date;
		
		// zeller's formula
		int c = year / 100;
		int y = year % 100;
		int m = month;
		int d = date;
		
		if (month < 3) {
			m += 12;
			c = (year - 1) / 100;
			y = (year - 1) % 100;
		}
		
		int w = (y + y/4 + c/4 - c*2 + 26*(m+1)/10 + d - 1);
		
		if (year <= 1582 && month <= 10 && date <= 4)
			w = (y + y/4 - c + 26*(m+1)/10 + d + 4);

		this.day = ( w % 7 + 7 ) % 7;
	}

	public void printAmerican() {
		String dayName = DAYS_NAME[this.day];
		String monthName = MONTHS_NAME[this.month];
		System.out.printf("%s, %s %d, %d", dayName, monthName, this.date, this.year);
	}

}