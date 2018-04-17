/**
 * DistanciaCuerpoCelesteSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.7  Built on : Nov 20, 2017 (11:41:20 GMT)
 */
package distancia;

import org.apache.axis2.context.ConfigurationContext;
import org.apache.axis2.description.AxisService;
import org.apache.axis2.engine.ServiceLifeCycle;



/**
 *  DistanciaCuerpoCelesteSkeleton java skeleton for the axisService
 */
public class DistanciaCuerpoCelesteSkeleton implements ServiceLifeCycle{
    /**
     * Auto generated method signature
     *
     * @param getDistancia
     * @return getDistanciaResponse
     */
	static String key;
//	static UDDIClerk clerk= null;
//	static UDDIClient uddiClient;
	
    public distancia.GetDistanciaResponse getDistancia(distancia.GetDistancia getDistancia) {
    	
    	String cuerpo = getDistancia.localCuerpo;
    	GetDistanciaResponse distanciaE1 = new GetDistanciaResponse();
    	distanciaE1.set_return(ConsultaDB(cuerpo));
    	return distanciaE1;
    }
    
    public double ConsultaDB(String cuerpo) {
    	boolean found = false;

    	if(cuerpo.equalsIgnoreCase("Luna")) {
    		found=true;
    		return (double) 384400.0;
    	}
    	
    	if(cuerpo.equalsIgnoreCase("Mercurio")) {
    		found=true;
    		return (double) 91690000.0;
    	}
    	
    	if(cuerpo.equalsIgnoreCase("Venus")) {
    		found=true;
    		return (double) 42000000.0;
    	}
    	
    	if(cuerpo.equalsIgnoreCase("Marte")) {
    		found=true;
    		return (double) 69000000.0;
    	}
    	
    	if(cuerpo.equalsIgnoreCase("Jupiter")) {
    		found=true;
    		return (double) 591000000.0;
    	}
    	
    	if(cuerpo.equalsIgnoreCase("Saturno")) {
    		found=true;
    		return (double) 1200000000.0;
    	}
    	
    	if(cuerpo.equalsIgnoreCase("Urano")) {
    		found=true;
    		return (double) 2543164000.0;
    	}
    	
    	if(cuerpo.equalsIgnoreCase("Neptuno")) {
    		found=true;
    		return (double) 4500000000.0;
    	}
    	
    	if(cuerpo.equalsIgnoreCase("Pluton") || cuerpo.equalsIgnoreCase("Plutón")) {
    		found=true;
    		return (double) 5929000000.0;
    	}
    	
    	if(cuerpo.equalsIgnoreCase("Sol")) {
    		found=true;
    		return (double) 149600000.0;
    	}
    	
    	if(cuerpo.equalsIgnoreCase("Io") || cuerpo.equalsIgnoreCase("Ío")) {
    		found=true;
    		return (double) 628300000.0;
    	}
    	
    	if(cuerpo.equalsIgnoreCase("Europa")) {
    		found=true;
    		return (double) 628300000.0;
    	}
    	
    	if(cuerpo.equalsIgnoreCase("Calisto")) {
    		found=true;
    		return (double) 628300000.0;
    	}
    	
    	if(cuerpo.equalsIgnoreCase("Ganimedes") || cuerpo.equalsIgnoreCase("Ganímedes")) {
    		found=true;
    		return (double) 628300000.0;
    	}
    	
    	if(cuerpo.equalsIgnoreCase("Mimas")) {
    		found=true;
    		return (double) 1272000000.0;
    	}
    	
    	if(cuerpo.equalsIgnoreCase("Tetis")) {
    		found=true;
    		return (double) 1200000000.0;
    	}
    	
    	if(cuerpo.equalsIgnoreCase("Rea")) {
    		found=true;
    		return (double) 1200000000.0;
    	}
    	
    	if(cuerpo.equalsIgnoreCase("Umbriel")) {
    		found=true;
    		return (double) 2543164000.0;
    	}
    	
    	if(cuerpo.equalsIgnoreCase("Miranda")) {
    		found=true;
    		return (double) 2543164000.0;
    	}
    	
    	if(cuerpo.equalsIgnoreCase("Ariel")) {
    		found=true;
    		return (double) 2543164000.0;
    	}
    	
    	if(cuerpo.equalsIgnoreCase("Porteo")) {
    		found=true;
    		return (double) 4500000000.0;
    	}
    	
    	if(cuerpo.equalsIgnoreCase("Triton") || cuerpo.equalsIgnoreCase("Tritón")) {
    		found=true;
    		return (double) 4338000000.0;
    	}
    	
    	if(cuerpo.equalsIgnoreCase("Caronte")) {
    		found=true;
    		return (double) 5928000000.0;
    	}
    	
    	if(cuerpo.equalsIgnoreCase("Eris")) {
    		found=true;
    		return (double) 14316000000.0;
    	}
    	
    	if(cuerpo.equalsIgnoreCase("Fobos")) {
    		found=true;
    		return (double) 77790000.0;
    	}
    	
    	if(cuerpo.equalsIgnoreCase("Deimos")) {
    		found=true;
    		return (double) 77800000.0;
    	}
    	
    	if(cuerpo.equalsIgnoreCase("Proxima Centauri") || cuerpo.equalsIgnoreCase("Próxima Centauri")) {
    		found=true;
    		return (double) 4.1343e+13;
    	}
    	
    	if(cuerpo.equalsIgnoreCase("Estrella de Barnard")) {
    		found=true;
    		return (double) 5.667e+13;
    	}
    	
    	if(cuerpo.equalsIgnoreCase("Wolf 359")) {
    		found=true;
    		return (double) 7.37464e+13;
    	}
    	
    	if(cuerpo.equalsIgnoreCase("Lalande 21185")) {
    		found=true;
    		return (double) 7.85903e+13;
    	}
    	
    	if(cuerpo.equalsIgnoreCase("Sirio")) {
    		found=true;
    		return (double) 8.1457e+13;
    	}
    	
    	if(cuerpo.equalsIgnoreCase("Luyten 726-8")) {
    		found=true;
    		return (double) 8.2687e+13;
    	}
    	
    	if(cuerpo.equalsIgnoreCase("Ross 154")) {
    		found=true;
    		return (double) 9.0634e+13;
    	}
    	
    	if(cuerpo.equalsIgnoreCase("Ross 248")) {
    		found=true;
    		return (double) 9.7446e+13;
    	}
    	
    	if(cuerpo.equalsIgnoreCase("Alfa Centauri")) {
    		found=true;
    		return (double) 4.1343e+13;
    	}
    	
    	if(!found) {
    		return 99.9; // Indica que el cuerpo pasado por parámetro no está en la DB.
    	}
    	
    	
    	return 0.0;
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
