
public class casting {
//casting변수
	public static void main(String[] args) {

	double a =	1.1;
	double b = 1;//실수에 정수를 써도 출력됨
	double b2 = (double) 1; 
	System.out.println(b);
	
	//int c = 1.1; 정수에 실수를 넣으면 출력안됨
	double d = 1.1;
	System.out.println(d);

	int e = (int) 1.1;//강제로 (int)로 변경
	System.out.println(e);
	
	String f = Integer.toString(1);
	System.out.println(f.getClass());
	}

}
