package Driver;

import Helper.HelpVehicle;
import Interface.Engine;
import Interface.vehicle;

public class vehicleDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		vehicle v = HelpVehicle.getVehicle();
		v.start();
		
		Engine e = v.getEngine();
		e.startEngine();

	}

}
