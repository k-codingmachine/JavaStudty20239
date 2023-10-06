package ex03;



//두정수 합을 구하는 함수
//반환타입 없고, 매개변수 있는 유형
public class Exam15 {

	public static void main(String[] args) {


		addition(3,4);
		int result = substraction(5,2);
		System.out.printf("뺴기 : %d\n" , result);
		
		
	}
	
	 static void addition(int i, int j) {
		System.out.println("더하기 : " + i + j);
	}
	 static int substraction(int i, int j) {
			return  i-j;
			 	
		}
	
	}

	

/*
 * 더하기 : 7
 * 빼기 : 3
 * 
 */
