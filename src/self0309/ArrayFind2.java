package self0309;

import java.util.Scanner;

public class ArrayFind2 {
public static void main(String[] args) {
	//1.�迭�� ���� �ֱ�
	//2.�迭�� �ִ� ���� �ϳ��� ȣ��
	//3.�迭�� �ִ� ������ ��
	//4.�迭�� ��=�Է°�->location = i+1
	//5.�迭�� �ִ� ���� �ӽú����� �ִ� ������ �������� üũ
	//6.���� ���� �ӽú����� ������ �д�
	//7.���� ���� �� ���
	int[] num = {55,33,21,22,39};
	Scanner sc = new Scanner(System.in);
	int find = sc.nextInt();
	int location = 0;
	
	for (int i = 1; i < num.length; i++) {
		if(num[i] == find) {
			location = i + 1;
		}
	}
	
	System.out.println("��ġ���� : " + location);
	}

}
