package test.one.pages;

import org.apache.tapestry5.annotations.Property;
import org.apache.tapestry5.annotations.SessionState;

import test.one.entity.ShoppingCart;

public class Login {
	@SessionState
	private ShoppingCart shoppingCart;
	
	@Property
	private String number;
	
	Login(){
		number = shoppingCart.getNumber().toString();
		for ( int i = 0; i<shoppingCart.getGoods().size(); i++ ) {
			number += shoppingCart.getGoods().get(i) + " <br/> ";
		}
	}
}
