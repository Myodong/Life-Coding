import java.io.IOException;
import java.io.PrintWriter;

public class InstanceApp {

	public static void main(String[] args) throws IOException {
		
		PrintWriter p1 = new PrintWriter("result1.txt");
		// new 뒤부터가 Constructors 이다 PrintWriter("result1.txt");
		// p1 인스터스 이며
		// 어떤 값이 올수 있냐 라는 것을 규제하기 위해 PrintWriter라는 클래스 이름을 적는다
		
		p1.write("Hello 1");
		p1.close();
		
		PrintWriter p2 = new PrintWriter("result2.txt");
		p2.write("Hello 2");
		p2.close();
		
		// Constructors 가 없으면 일회용이라고 생각해라!
		// 어디서 확인 가능한가 ? https://docs.oracle.com/javase/7/docs/api/
		// 자바 api 에서 확인가능
		
	}
}
