package self0309;
public class ArrayFind {
public static void main(String[] args) {
	//1.�迭�� ���� �ֱ�
	int[] num = {55,33,21,22,39};
	//4.�迭�� ù��° ���� �ӽú����� �־�д�
	int min = num[0];
	
	//2.�迭�� �ִ� ���� �ϳ��� ȣ��
	for (int i = 1; i < num.length; i++) {
		//3.�迭�� �ִ� ������ ��
		//5.�迭�� �ִ� ���� �ӽú����� �ִ� ������ �������� üũ
		if(num[i] < min) {
			//6.���� ���� �ӽú����� ������ �д�
			min = num[i];
		}
	}
	
	//7.���� ���� �� ���
	System.out.println("���� ���� ���� : " + min);
	}

}
