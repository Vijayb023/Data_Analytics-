package hw2;
import java.util.*;
public class RefrenceMystery {
	public static void main(String[]args) {
		int y= 1; 
		int x =3;
		int[] a= new int[4];
		mystery(a,y,x);
		System.out.println(x+" "+y+" "+Arrays.toString(a));
		x = y+1;
		mystery(a,y,x);
		System.out.println(x+" "+y+" "+Arrays.toString(a));
	}
	public static void mystery(int[] a, int y, int x) {
		if(y<x) {
			y++;
			a[y]=17;
		}else {
			a[x]=17;
		}
		System.out.println(y+" "+x+" "+Arrays.toString(a));
	}
}
