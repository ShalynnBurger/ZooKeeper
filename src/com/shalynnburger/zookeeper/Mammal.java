package com.shalynnburger.zookeeper;

public class Mammal {
	private int energyLevel;

	public Mammal() {
		this.energyLevel = 100;
	}
	
	//method
	public void displayEnergy(){
		System.out.println(" Your energy level is: " + energyLevel);
	}

	
	//getters and setters
	public int getEnergyLevel() {
		return energyLevel;
	}

	public void setEnergyLevel(int energyLevel) {
		this.energyLevel = energyLevel;
	}

	
	
	
}