package ex02_3;

import java.util.ArrayList;

class Apple{
	public String toString() {
		return "I am an apple";
	}
}

class Orange{
	public String toString() {
		return "I am an orange";
	}
}
// 제네릭 클래스
class Box<T extends Number> {  // Number은 정수의 꼭대기 , Number이거나 Number를 상속한 클래스만 전달해라.
	private T obj;
	
	void setObj(T obj) {
		this.obj = obj;
	}
	
	T getObj() {
		return obj;
	}
	
}



public class Generices1 {
	public static void main(String[] args) {

		Box<Integer> aBox = new Box(); //<>안에는 Number 부터 하위클래스 전부 들어올수있다.
	
		ArrayList<Integer> list = new ArrayList();// <> 안에 타입을 적으면 배열에 타입을 정해준다. (원래는 아무거나 넣어줄수있다.)
		}
}
