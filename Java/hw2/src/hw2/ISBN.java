package hw2;

public class ISBN{
	private String digits;
	private String checkSymbol;
	public ISBN(String digits, String checkSymbol) {
		this.digits = digits;
		this.checkSymbol=checkSymbol;
	}
	public String getDigits() {
		return digits;
	}
	public String getCheckSymbol() {
		return checkSymbol;
	}
	public boolean isValid() {
		int sum=0;
		String checksum="";
		for(int i=0; i<digits.length();i++) {
			sum+= Integer.parseInt(digits.charAt(i)+"")*(i+1);
		}
		System.out.println("Sum="+sum);
		int sumAfterdivision = sum/11;
	if (sumAfterdivision<10) {
		checksum = sumAfterdivision+"";
	}
	else { checksum ="x";
	}
	if(checksum.equals(checkSymbol)) {
		return true;
	}
	else { return false; 
	
	}
	}
	public String toString() {
		String isbn=digits.charAt(0)+"-"+digits.substring(1,3)+"-"+digits.substring(3)+"-"+checkSymbol;
		return isbn;
	}
}

