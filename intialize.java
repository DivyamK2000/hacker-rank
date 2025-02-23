import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Intialize{
	static int B;
	static int H;
	static boolean flag;
	
	static{
		Scanner sc = new Scanner(System.in);
		B = sc.nextInt();
		H = sc.nextInt();
		flag = true;
		
		try{
			if(B<=0 || H<=0){
				flag = false;
				throw(new Exception("java.lang.Exception: Breadth and height must be positive"));
			}
			else if(B<-100 || B>100 && H<-100 || H>100){
				flag = false;
				throw(new Exception("java.lang.Exception: Breadth and height are outside constraints"));
			}
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
	}
	
	public static void main(String[] args){
		if(flag){
			int area=B*H;
			System.out.print(area);
		}
	}
}
