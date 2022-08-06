package week1.day1;


public class TwoWheeler {
	int noOfWheels=2;
	short noOfMirrors=1;
	long chasisNUmber=2345523243434L;
	boolean isPunctured=false;
	String bikeName="TVS Scooty";
	double runningKM=2356;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TwoWheeler objectTw= new TwoWheeler();
		System.out.println("Number of wheels : "+ objectTw.noOfWheels);
		System.out.println("Number of Mirrors : "+objectTw.noOfMirrors);
		System.out.println("Chasis Number : "+objectTw.chasisNUmber);
		System.out.println("Is Punctured : "+objectTw.isPunctured);
		System.out.println("Bike Name : "+ objectTw.bikeName);
		System.out.println("Running KM : "+ objectTw.runningKM);

	}

}
