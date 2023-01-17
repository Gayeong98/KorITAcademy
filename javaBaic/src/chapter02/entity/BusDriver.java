package chapter02.entity;

public class BusDriver  extends People {
	public BusDriver(String name, String gender) {
		super(name, gender);
	}
	// 버스 차종
	String vehicleModel;
	// 지역
	String busNumber;
	
}