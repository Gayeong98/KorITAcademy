package chapter02.entity;

public class Developer extends People {
	public String languageSkill;
	public String company;
	public String developPosition;
		
	public Developer(String name, String gender, String company) {
		super(name, gender);
		this.company = company;
	}
	public void eatBreakfast(int time) {
		System.out.println(name + "이 " + time + "시에 아침을 먹습니다.");
	}
}

