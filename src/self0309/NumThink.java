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
		System.out.print("���ڸ� �Է��ϼ���: ");
		input = sc.nextInt();
		count++;
		if(input > target)
			System.out.println("�ʹ� Ů�ϴ�");
		if(input < target)
			System.out.println("�ʹ� �۾ƿ�");
	} while(input != target);
	System.out.println("�õ��� �� Ƚ����:"+count);
	System.out.println("�����Դϴ�..!!");
	}

}
