package de.mogwailabs.research;

import java.util.*;
import my.little.library.*;

public class QLMapAccessTest {

	public static void main(String[] args) throws Exception {
		

        // This is the correctMap, which should be identified by 
		// QL as it is passed to the interesting function
        //
        System.out.println("Initialize the environment maps");
        HashMap<String,Object> insecureMap = new HashMap<String,Object>();

        // This one is a fake one, which we just use as a test
        HashMap<String,Object> secureMap = new HashMap<String,Object>();
    
        
        // Two simple entries
        insecureMap.put("blablabla", "just a test");
        insecureMap.put("testenv2", java.lang.Integer.MAX_VALUE);
        
        // setting the authentication in the wrong map
        secureMap.put("forceAuthentication", true);
        
        // calling the interesting function
        // 
        SettingsFactory.newSettings("https://test", "blablabla", insecureMap);
        
	}

}

