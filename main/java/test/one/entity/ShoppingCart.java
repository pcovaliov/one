package test.one.entity;

import java.util.List;

public class ShoppingCart {
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
