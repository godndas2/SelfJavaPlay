package self0309;
import java.util.Scanner;
public class ArrayScore {
public static void main(String[] args) {
	//5명의 성적 평균 배열
		Scanner sc = new Scanner(System.in);
		int[] member = new int[5];
		int sum = 0;
		
		for (int i = 0; i < member.length; i++) {
		System.out.print("점수 입력: ");
		member[i] = sc.nextInt();
		
		}
		
//		for(int i : member) {
//			System.out.println(i);
//		}
		
		
		for (int i = 0; i < member.length; i++) {
			sum += member[i];
		}
		
		System.out.println("평균은" + (sum/5.0)); //나누기에서 나오는 나머지때문에 .0 붙임
	}
}
