package self0309;
import java.util.Scanner;
public class ArrayScore {
public static void main(String[] args) {
	//5���� ���� ��� �迭
		Scanner sc = new Scanner(System.in);
		int[] member = new int[5];
		int sum = 0;
		
		for (int i = 0; i < member.length; i++) {
		System.out.print("���� �Է�: ");
		member[i] = sc.nextInt();
		
		}
		
//		for(int i : member) {
//			System.out.println(i);
//		}
		
		
		for (int i = 0; i < member.length; i++) {
			sum += member[i];
		}
		
		System.out.println("�����" + (sum/5.0)); //�����⿡�� ������ ������������ .0 ����
	}
}
