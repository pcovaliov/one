package test.one.pages;

import java.util.Locale;

import org.apache.tapestry5.PersistenceConstants;
import org.apache.tapestry5.annotations.Import;
import org.apache.tapestry5.annotations.InjectPage;
import org.apache.tapestry5.annotations.Persist;
import org.apache.tapestry5.annotations.Property;
import org.apache.tapestry5.annotations.SessionAttribute;
import org.apache.tapestry5.annotations.SessionState;
import org.apache.tapestry5.ioc.annotations.Inject;
import org.apache.tapestry5.services.PersistentLocale;

import test.one.entity.Language;
import test.one.entity.ShoppingCart;


/**
 * Start page of application one.
 */
@Import(stylesheet = {"context:css/style.css","context:css/bootstrap.css"})
public class Index
{
	@Inject
	private PersistentLocale persistentLocale;
	
	@SessionState
	private ShoppingCart shoppingCart;
	
	@SessionAttribute("loggedInUserName")
    private String userName;
	
	@Property
	@Persist(PersistenceConstants.CLIENT)
	private Language language;
	
	@InjectPage
	private Login login;
	
	Index(){
		shoppingCart = new ShoppingCart();
	}
	
	void onActionFromGetNow(){
		System.out.println("User added a pare of boots to the cart!");
		shoppingCart.getGoods().add("PARE OF BOOTS");
		
	}
	void onActionFromEnglish(){
		persistentLocale.set(new Locale("en"));
	}
	void onActionFromFrench(){
		persistentLocale.set(new Locale("fr"));
	}
	void onActionFromGerman(){
		persistentLocale.set(new Locale("de"));
	}
	
	Object onActionFromLogin(){
		shoppingCart.setNumber(123);
		return login;
	}
}
