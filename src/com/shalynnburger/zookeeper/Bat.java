package com.shalynnburger.zookeeper;

public class Bat extends Mammal {

	public Bat() {
		super();
		this.setEnergyLevel(300);
	}
	
	//methods
		public void fly() {
			this.setEnergyLevel(getEnergyLevel() - 50);
			System.out.println("Your bat has taken flight...WWHHHOOOSHHH.");
		}
		
		public void eatHuman() {
			this.setEnergyLevel(getEnergyLevel() + 25);
			System.out.println("Your bat has eaten...");
		}
	
		public void attackTown() {
			this.setEnergyLevel(getEnergyLevel() - 100);
			System.out.println("Your bat has caught the town on fire!");
		}
	
	
}
