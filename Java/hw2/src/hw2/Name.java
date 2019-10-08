package hw2;

public class Name {
public String first;
public String middle;
public String last;

public Name(String first, String middle, String last) {
	this.first=first;
	this.middle=middle;
	this.last=last;
}
public String toString() {
	return(first+" "+middle+". "+last);
}
}
