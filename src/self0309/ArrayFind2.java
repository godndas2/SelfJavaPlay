package self0309;

import java.util.Scanner;

public class ArrayFind2 {
public static void main(String[] args) {
	//1.배열에 숫자 넣기
	//2.배열에 있는 값을 하나씩 호출
	//3.배열에 있는 값들을 비교
	//4.배열의 값=입력값->location = i+1
	//5.배열의 있는 값이 임시변수에 있는 값보다 작은지만 체크
	//6.작은 값을 임시변수에 변수를 둔다
	//7.제일 작은 값 출력
	int[] num = {55,33,21,22,39};
	Scanner sc = new Scanner(System.in);
	int find = sc.nextInt();
	int location = 0;
	
	for (int i = 1; i < num.length; i++) {
		if(num[i] == find) {
			location = i + 1;
		}
	}
	
	System.out.println("위치값은 : " + location);
	}

}
