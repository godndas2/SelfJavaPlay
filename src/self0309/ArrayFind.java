package self0309;
public class ArrayFind {
public static void main(String[] args) {
	//1.배열에 숫자 넣기
	int[] num = {55,33,21,22,39};
	//4.배열의 첫번째 값을 임시변수에 넣어둔다
	int min = num[0];
	
	//2.배열에 있는 값을 하나씩 호출
	for (int i = 1; i < num.length; i++) {
		//3.배열에 있는 값들을 비교
		//5.배열의 있는 값이 임시변수에 있는 값보다 작은지만 체크
		if(num[i] < min) {
			//6.작은 값을 임시변수에 변수를 둔다
			min = num[i];
		}
	}
	
	//7.제일 작은 값 출력
	System.out.println("제일 작은 값은 : " + min);
	}

}
