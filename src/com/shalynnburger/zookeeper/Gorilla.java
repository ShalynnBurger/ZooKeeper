package com.shalynnburger.zookeeper;

public class Gorilla extends Mammal {

	
	//methods
	public void throwSomething() {
		this.setEnergyLevel(getEnergyLevel() - 5);
		System.out.println("Your Gorilla has thrown something.");
	}
	
	public void eatBananas() {
		this.setEnergyLevel(getEnergyLevel() + 10);
		System.out.println("Your Gorilla has eaten a banana.");
	}
	
	public void climb() {
		this.setEnergyLevel(getEnergyLevel() - 10);
		System.out.println("Your Gorilla has climbed a tree.");
	}
	
}
