package interfejsy;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtendedUrl implements Url{
	
		public String getParam (String param, String url) {
			final Pattern pattern = Pattern.compile("param1\\.(<value>[^&]+)");
			final Matcher matcher = pattern.matcher(url);
			
			if(matcher.find())
				return matcher.group("value");
			return null;
		}
	}