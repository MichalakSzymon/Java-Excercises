package interfejsy;

import java.util.regex.Pattern;

public class Main {

	public static void main(String[] args) {
		
		final standardUrl standardUrl = new standardUrl();
		final String param1 = standardUrl.getParam("param1", "url_example?param1=99&param2=string");
		System.out.println(param1);
		
		final ExtendedUrl extendedUrl = new ExtendedUrl();
		final String param1Ext = extendedUrl.getParam("param1", "url_example/param1.99/param2.string");
		System.out.println(param1Ext);
		
	}


}
