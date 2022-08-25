package week3.day1.classroom;

public class AllVehicles {
	public static void main(String[] args) {
		BMW bwmObj=new BMW();
		Audi audiObj=new Audi();
		Bajaj bajajObj=new Bajaj();
		
		System.out.println("******Audi vehicle deails**********");
		audiObj.AudicarModel();
		audiObj.applyBrake();
		audiObj.soundHorn();
		audiObj.seats();
		audiObj.wheels();
	
		
		System.out.println("******BMW vehicle deails**********");
		bwmObj.BMWCarModel();
		bwmObj.applyBrake();
		bwmObj.soundHorn();
		bwmObj.seats();
		bwmObj.wheels();

		
		System.out.println("******Bajaj vehicle deails**********");
		bajajObj.bajajAutoModel();
		bajajObj.applyBrake();
		bajajObj.soundHorn();
		bajajObj.seats();
		bajajObj.wheels();
	}

}
