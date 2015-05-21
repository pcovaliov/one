package test.one.entity;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
	
	public ShoppingCart(){
		goods = new ArrayList<String>();
	}
	private List<String> goods;
	
	private Integer number;

	public List<String> getGoods() {
		return goods;
	}

	public void setGoods(List<String> goods) {
		this.goods = goods;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}
}
