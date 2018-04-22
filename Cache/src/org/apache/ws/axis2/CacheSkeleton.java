/**
 * CacheSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.7  Built on : Nov 20, 2017 (11:41:20 GMT)
 */
package org.apache.ws.axis2;

import java.util.HashMap;
import java.util.Map;

import org.apache.axis2.context.ConfigurationContext;
import org.apache.axis2.description.AxisService;
import org.apache.axis2.engine.ServiceLifeCycle;


/**
 *  CacheSkeleton java skeleton for the axisService
 */
public class CacheSkeleton implements ServiceLifeCycle {
   
	private static String key = null;
	static Map<String, String> cache = new HashMap<String, String>();
	
    public org.apache.ws.axis2.ConsultarResponse consultar(
        org.apache.ws.axis2.Consultar consultar) {
    	String clave = consultar.getArgs0();
        ConsultarResponse response = new ConsultarResponse();
        
        if(cache.containsKey(clave)) {
        	response.set_return(cache.get(clave));
        }
        
        else {
        	response.set_return("nada");
        }
        return response;
    }

    /**
     * Auto generated method signature
     *
     * @param guardar
     * @return guardarResponse
     */
    public org.apache.ws.axis2.GuardarResponse guardar(org.apache.ws.axis2.Guardar guardar) {
       String clave = guardar.getArgs0();
       String Otro = guardar.getArgs1();
      
       
       if(!cache.containsKey(clave)) {
    	   cache.put(clave, Otro);
       }
	
       return null;
       
     
    	
    }

	@Override
	public void shutDown(ConfigurationContext arg0, AxisService arg1) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void startUp(ConfigurationContext arg0, AxisService arg1) {
		// TODO Auto-generated method stub
		
	}
}
