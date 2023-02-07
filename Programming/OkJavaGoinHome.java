import lib.org.opentutorials.iot.Lighting;
import lib.org.opentutorials.iot.Security;
import lib.org.opentutorials.iot.Elevator;

public class OkJavaGoinHome {


	public static void main(String[] args) {
		
		String id = "Myodon APT 1994";

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
		
		
	} 

}
