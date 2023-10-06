package ex06;

import java.util.*;

//10.2 + 10 => 20.2  ; 정수 + 문자열 => 문자열
// 실수 + 문자열 => 문자열 10.2 + "";    "10.2"
class Num{
	private int num;
	public Num(int num) {this.num = num;}
	@Override
	public String toString() {
		return num + ""; 
//		return String.valueOf(num);  // 10 ===> "10"
		}
	
}
public class SetCollection02 {

	public static void main(String[] args) {

		Set<Num> set = new HashSet<>();
		
		set.add(new Num(9999));
		set.add(new Num(8888));
		set.add(new Num(7777));
		set.add(new Num(9999));
		
		
		
		Iterator<Num> itr = set.iterator();
		while(itr.hasNext()) 
		System.out.println(itr.next());
		

	}
}