package com.shalynnburger.zookeeper;

public class MammalTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("-----Mammal 1 test-----");
		
		Gorilla gor1 = new Gorilla();
		gor1.throwSomething();
		gor1.climb();
		gor1.eatBananas();
		gor1.throwSomething();
		gor1.eatBananas();
		gor1.throwSomething();
		gor1.displayEnergy();
		
		
		System.out.println("-----Mammal 2 test-----");
		
		Bat bat1 = new Bat();
		bat1.attackTown();
		bat1.fly();
		bat1.attackTown();
		bat1.eatHuman();
		bat1.fly();
		bat1.attackTown();
		bat1.eatHuman();
		bat1.displayEnergy();
		
	}

}
