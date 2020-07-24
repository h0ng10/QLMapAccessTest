package my.little.library;

import java.util.HashMap;

public class SettingsFactory {

	//simple mock object
	public static Object newSettings(String url, String username, HashMap<String,Object> settings) {
		System.out.println("new settings got called");
		return "XXX";
	}
}
