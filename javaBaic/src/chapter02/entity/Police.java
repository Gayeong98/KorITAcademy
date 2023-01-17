package chapter02.entity;

public class Police extends People{
	public Police(String name, String gender) {
		super(name, gender);
		// TODO Auto-generated constructor stub
	}
	// 관할 구역
	String jurisdiction;
	// 직책
	String officePosition;
}
