
package net.webservicex;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2-hudson-752-
 * Generated source version: 2.2
 * 
 */
@WebService(name = "USZipHttpGet", targetNamespace = "http://www.webserviceX.NET")
@SOAPBinding(style = SOAPBinding.Style.RPC)
@XmlSeeAlso({
    ObjectFactory.class
})
public interface USZipHttpGet {


    /**
     * Get State Code,City,Area Code,Time Zone,Zip Code by Zip Code
     * 
     * @param usZip
     */
    @WebMethod(operationName = "GetInfoByZIP")
    public void getInfoByZIP(
        @WebParam(name = "USZip", partName = "USZip")
        String usZip);

    /**
     * Get State Code,City,Area Code,Time Zone,Zip Code by City
     * 
     * @param usCity
     */
    @WebMethod(operationName = "GetInfoByCity")
    public void getInfoByCity(
        @WebParam(name = "USCity", partName = "USCity")
        String usCity);

    /**
     * Get State Code,City,Area Code,Time Zone,Zip Code by state
     * 
     * @param usState
     */
    @WebMethod(operationName = "GetInfoByState")
    public void getInfoByState(
        @WebParam(name = "USState", partName = "USState")
        String usState);

    /**
     * Get State Code,City,Area Code,Time Zone,Zip Code by Area Code
     * 
     * @param usAreaCode
     */
    @WebMethod(operationName = "GetInfoByAreaCode")
    public void getInfoByAreaCode(
        @WebParam(name = "USAreaCode", partName = "USAreaCode")
        String usAreaCode);

}
