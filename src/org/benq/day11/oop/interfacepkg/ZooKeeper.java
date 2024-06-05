package org.benq.day11.oop.interfacepkg;

import org.benq.day11.oop.interfacepkg.music.Instrument;

public class ZooKeeper {
	public void feed(FoodInterface animal) {
		System.out.println("feed "+animal.animalFood());
	}

//	public void feed(Lion lion) {
//		// TODO Auto-generated method stub
//		System.out.println("feed gazel");
//	}
//
//	public void feed(Tiger tiger) {
//		// TODO Auto-generated method stub
//		System.out.println("feed rabbit");
//	}
//
//	public void feed(Bear bear) {
//		// TODO Auto-generated method stub
//		System.out.println("feed honey");
//	}

}
