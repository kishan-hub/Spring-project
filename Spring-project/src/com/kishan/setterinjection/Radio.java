package com.kishan.setterinjection;

public class Radio { 
	
	private IReciver iReciver;

	public void setiReciver(IReciver iReciver) {
		this.iReciver = iReciver;
	}
	
	public void listen()
	{
		 iReciver.tuneUp();
		 System.out.println("Listening....");
	}

}
