package chapter02.entity;

public class People {
	public String name;
	public String gender;
	public int age;
	public String address;
	public String email;
		
	public People(String name, String gender) {
		this.name = name;
		this.gender = gender;
	}
	
	public void eatBreakfast() {
		System.out.println(name + "이 7시에 아침을 먹습니다.");
	}
		
}
