
public class Client {
public static void main(String args[]) {
	int x=10;
	System.out.println(EvenSum(x));
	System.out.println(OddSum(x));
	System.out.println(fib(x));
}

public static int fib(int n) {

	if(n==0) 
	{
	    return 0;
	}
	else if (n==1) {
		return 1;
	}
	else{
		return fib(n-1)+fib(n-2);
				}
			}


public static int OddSum(int n) {
	// TODO Auto-generated method stub
	int i=0;
	if(n==1) {
		return 1;
	}
	else if(n%2==0) {//even case 
		return OddSum(n-1);
	}
	else {//odd case and adds the previous odd values
		return n+OddSum(n-2);
	}

}


public static int EvenSum(int n) {
	// TODO Auto-generated method stub
	int i=0;
	if(n==0) {
		return 0;
	}
	else if(n%2!=0) {
		return EvenSum(n-1);
	}
	else {
		return n+EvenSum(n-1);
	}
}
}









