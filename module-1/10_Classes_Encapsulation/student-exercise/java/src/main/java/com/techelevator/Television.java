package com.techelevator;

public class Television {
	
	private boolean isOn = false;
	private int currentChannel = 3;
	private int currentVolume = 2;
	
	public void turnOff() {
		isOn = false;
	}
	public void turnOn() {
		isOn = true;
		currentChannel = 3;
		currentVolume = 2;
	}
	public void changeChannel(int newChannel) {
		
			if ((isOn) && ((newChannel >=3) && (newChannel <= 18))) {
			this.currentChannel = newChannel;	
			}
			
		}
	public void channelUp() {
		if ((isOn ) && (currentChannel >= 3 && (currentChannel <= 17))) {
			this.currentChannel = currentChannel + 1;
		}
		else if ((isOn) && (currentChannel > 17 && (currentChannel < 19))) {
			this.currentChannel = currentChannel - 15;
		}
		else {this.currentChannel = currentChannel + 0;
		}	
	}
	public void channelDown() {
		if ((isOn ) && (currentChannel >= 4 && (currentChannel <= 18))) {
			this.currentChannel = currentChannel - 1;
		}
		else if ((isOn ) && (currentChannel > 2 && (currentChannel < 4 ))) {
			this.currentChannel = currentChannel + 15 ;
		}
		else { this.currentChannel = currentChannel + 0 ;
		}
	}
	
	public void raiseVolume () {
		if ((isOn ) && (currentVolume >= 0 && (currentVolume <= 9))) {
			this.currentVolume = currentVolume +1;
		}
//		else ((isOn = true) && current)
		else if (isOn)
		{ this.currentVolume = currentVolume + 0;
		}
		}
		
	public void lowerVolume () {
		if ((isOn ) && (currentVolume > 0 && (currentVolume <= 10))) {
			this.currentVolume = currentVolume -1;
		}
		else if (isOn ) 
		{this.currentVolume = currentVolume + 0;
		}
		}
		
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public boolean isOn() {
		return isOn;
	}
	public int getCurrentChannel() {
		return currentChannel;
	}
	public int getCurrentVolume() {
		return currentVolume;
	}
	

}
