package implement;

import Interface.Engine;
import Interface.vehicle;

public class bike implements vehicle {

	@Override
	public void start() {

		System.out.println("Bike Started");
	}

	@Override
	public Engine getEngine() {
		// TODO Auto-generated method stub
		return new EngineImp();
	}

	
}
