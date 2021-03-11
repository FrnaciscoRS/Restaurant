package models;

import java.util.ArrayList;

import interfaces.AProduct;

public class Drink extends AProduct{

	private boolean alcoholic;
	
	public Drink() {
		//super();
	}
	
	public Drink(int id,String name, double price, boolean forCeliac, boolean alcoholic, ArrayList<Integer> bundlePack) {
		super(id, name, price, forCeliac, bundlePack);
		this.alcoholic = alcoholic;
	}

	public boolean isAlcoholic() {
		return alcoholic;
	}
	
	public ArrayList<Integer> getBundlePack() {
		return bundlePack;
	}

	public boolean setBundlePack(int id) {
		boolean result=false;
		if(id!=0) {
			//TODO things
		}
		return result;
	}

	@Override
	public boolean getIsForCeliac() {
		return super.isForCeliac();
	}

	@Override
	public String toString() {
		return name+" -- "+price+ " €";
	}
}
