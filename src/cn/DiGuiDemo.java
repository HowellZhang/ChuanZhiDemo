package cn;

public class DiGuiDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(f(20));

	}
public static int  f(int n	){
	if(n==1||n==2){
		return 1;
	}else if(n==3){
		return 2;
	}else{
		return f(n-1)+f(n-2)+f(n-3);
	}
}
}
