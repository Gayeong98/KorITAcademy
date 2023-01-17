package chapter02;

import chapter02.entity.*;

public class Example06 {

	public static void main(String[] args) {
		Developer developer = new Developer(null, null, null);
		Police police = new Police(null, null);
		BusDriver busDriver = new BusDriver(null, null);
		
		developer.languageSkill = "";
		System.out.println(developer.name);
		developer.eatBreakfast(11);
		police.eatBreakfast();
		busDriver.eatBreakfast();
	}

}
