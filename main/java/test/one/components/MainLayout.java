package test.one.components;

import org.apache.tapestry5.annotations.BeforeRenderTemplate;
import org.apache.tapestry5.annotations.Import;
import org.apache.tapestry5.annotations.Property;

@Import(stylesheet = "context:css/mainlayout.css")
public class MainLayout {
	@Property
	private String[] pages;
	
	@Property
	private String page;
	
	public MainLayout() {
		page = "Index";
		pages = new String[3];
		pages[0] = "Index";
		pages[1] = "About";
		pages[2] = "Contact";
	}
	
}
