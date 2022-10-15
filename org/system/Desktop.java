package org.system;

public class Desktop extends Computer{
	public void desktopSize() {
		System.out.println("desktopSize");
	}
	public static void main(String[] args) {
		Computer C = new Computer();
		C.computerModel();
		Desktop D= new Desktop();
		D.desktopSize();
		System.out.println("******************************");
		D.computerModel();
		
	}
	

}
