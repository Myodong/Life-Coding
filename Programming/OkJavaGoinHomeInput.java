import javax.swing.JOptionPane;

import org.opentutorials.iot.DimmingLights;
import org.opentutorials.iot.Elevator;
import org.opentutorials.iot.Security;
import org.opentutorials.iot.Lighting;


public class OkJavaGoinHomeInput {

//paramter, 매개변수
	public static void main(String[] args) {
		String id = args[0];
		String bright = args[1];
		
//		String id = JOptionPane.showInputDialog("Enter a ID");
/*java popup input text swing 구글링해서 위 값을 가져온다
팝업창으로 ID 부분 사용자 입력 값으로 변경시키기*/
//		String bright = JOptionPane.showInputDialog("Enter a bright level");
/*밝기를 조절할 수 있게 값을 넣을 수 있는 팝업창 생성		
 */

		
		//Elevator call
		Elevator myElevator = new Elevator(id);
		myElevator.callForUp(1);
		
		//Security off
		Security mysecSecurity = new Security(id);
		mysecSecurity.off();
		//Light on
		Lighting hallLamp = new Lighting(id+" / hall Lamp");
		hallLamp.on();
		Lighting floorLamp = new Lighting(id+" / hall Lamp");
		floorLamp.on();
		
		
		DimmingLights moodlamp = new DimmingLights(id+"moodlamp");
		moodlamp.setBright(Double.parseDouble(bright));
		moodlamp.on();
		
	} 

}
