package com.itc.langPack;

public class Hello implements Cloneable {
	int y;
	Hai hai;
	public Hello(int y, Hai hai) {
		super();
		this.y = y;
		this.hai = hai;
	}
	void show(){
		System.out.println("Hello->y :"+y);
		System.out.println("Hai->x :"+hai.x);
	}
	//Shallow Cloning -> Only Current object Object will get cloned
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
	//Deep Cloning ->Current as well as Member Object will get cloned
	/*@Override
	protected Object clone() throws CloneNotSupportedException {
		if(this instanceof Cloneable){
			Hai hai = new Hai(this.hai.x);
			Hello h = new Hello(this.y,hai);
			return h;
		}
		else throw new CloneNotSupportedException(getClass().getName());
	}*/
	
}
