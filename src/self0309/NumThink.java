package self0309;
import java.util.Scanner;
public class NumThink {
public static void main(String[] args) {
	//1.do-while,Scanner,if
	Scanner sc = new Scanner(System.in);
	int input;
	int target = 33;
	int count=0;
	
	do { 
		System.out.print("숫자를 입력하세요: ");
		input = sc.nextInt();
		count++;
		if(input > target)
			System.out.println("너무 큽니다");
		if(input < target)
			System.out.println("너무 작아요");
	} while(input != target);
	System.out.println("시도한 총 횟수는:"+count);
	System.out.println("정답입니다..!!");
	}

}
