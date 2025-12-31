package com.maven;
class Bank{
	public int interest() {
		return 0;
	}
}
class SBI extends Bank{
	public int interest() {
		return 1;
	}
}
class HDFC extends Bank{
 public int interest()
	{
		return 2;
	}
}

public class override {
public static void main(String[] args) {
	Bank b1= new SBI();
	Bank b2= new HDFC();
  System.out.println("SBI - "+	b1.interest() + "%");
  System.out.println("HDFC - "+b2.interest() + "%");
}
}
