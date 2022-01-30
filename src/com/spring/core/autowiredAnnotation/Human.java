package com.spring.core.autowiredAnnotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Human {


	private Heart heart;
	
	// @Qualifier for constructors is given inside the parameters
	
	public Human(@Qualifier("heart1") Heart heart) {
		this.heart = heart;
	}
	
	// for methods , we can declare right before the method's name , like below ...
	/*
	 * @Autowired
	 * @Qualifier("heart1")
	 * 
	 */
	public void setHeart(Heart heart) {
		this.heart = heart;
	}
	
	public void livingOrNot() {
		if(heart != null) {
			heart.pumping();
		}
		else {
			System.out.println("Obj is not created and Heart stopped functioning");
		}
		
	}
	
}