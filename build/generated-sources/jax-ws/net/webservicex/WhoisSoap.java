
package net.webservicex;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2-hudson-752-
 * Generated source version: 2.2
 * 
 */
@WebService(name = "whoisSoap", targetNamespace = "http://www.webservicex.net")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface WhoisSoap {


    /**
     * Get domain name registration record by Host Name / Domain Name (WhoIS)
     * 
     * @param hostName
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "GetWhoIS", action = "http://www.webservicex.net/GetWhoIS")
    @WebResult(name = "GetWhoISResult", targetNamespace = "http://www.webservicex.net")
    @RequestWrapper(localName = "GetWhoIS", targetNamespace = "http://www.webservicex.net", className = "net.webservicex.GetWhoIS")
    @ResponseWrapper(localName = "GetWhoISResponse", targetNamespace = "http://www.webservicex.net", className = "net.webservicex.GetWhoISResponse")
    public String getWhoIS(
        @WebParam(name = "HostName", targetNamespace = "http://www.webservicex.net")
        String hostName);

}