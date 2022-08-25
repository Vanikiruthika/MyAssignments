package org.system;

public class Desktop extends Computer{

	public void desktopSize()
	{
		System.out.println("Desktop size : 21 inches");
	}
	public static void main(String[] args) {
	
	
		System.out.println("Computer obj:");
		Computer compObj=new Computer();
		compObj.computerModel();
		
		System.out.println("Desktop obj:");
		Desktop desktopObj=new Desktop();
		desktopObj.desktopSize();
		desktopObj.computerModel();
	}

}
