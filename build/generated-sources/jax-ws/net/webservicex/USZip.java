
package net.webservicex;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2-hudson-752-
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "USZip", targetNamespace = "http://www.webserviceX.NET", wsdlLocation = "http://www.webservicex.net/uszip.asmx?WSDL")
public class USZip
    extends Service
{

    private final static URL USZIP_WSDL_LOCATION;
    private final static WebServiceException USZIP_EXCEPTION;
    private final static QName USZIP_QNAME = new QName("http://www.webserviceX.NET", "USZip");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://www.webservicex.net/uszip.asmx?WSDL");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        USZIP_WSDL_LOCATION = url;
        USZIP_EXCEPTION = e;
    }

    public USZip() {
        super(__getWsdlLocation(), USZIP_QNAME);
    }

    public USZip(WebServiceFeature... features) {
        super(__getWsdlLocation(), USZIP_QNAME, features);
    }

    public USZip(URL wsdlLocation) {
        super(wsdlLocation, USZIP_QNAME);
    }

    public USZip(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, USZIP_QNAME, features);
    }

    public USZip(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public USZip(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns USZipSoap
     */
    @WebEndpoint(name = "USZipSoap")
    public USZipSoap getUSZipSoap() {
        return super.getPort(new QName("http://www.webserviceX.NET", "USZipSoap"), USZipSoap.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns USZipSoap
     */
    @WebEndpoint(name = "USZipSoap")
    public USZipSoap getUSZipSoap(WebServiceFeature... features) {
        return super.getPort(new QName("http://www.webserviceX.NET", "USZipSoap"), USZipSoap.class, features);
    }

    /**
     * 
     * @return
     *     returns USZipSoap
     */
    @WebEndpoint(name = "USZipSoap12")
    public USZipSoap getUSZipSoap12() {
        return super.getPort(new QName("http://www.webserviceX.NET", "USZipSoap12"), USZipSoap.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns USZipSoap
     */
    @WebEndpoint(name = "USZipSoap12")
    public USZipSoap getUSZipSoap12(WebServiceFeature... features) {
        return super.getPort(new QName("http://www.webserviceX.NET", "USZipSoap12"), USZipSoap.class, features);
    }

    /**
     * 
     * @return
     *     returns USZipHttpGet
     */
    @WebEndpoint(name = "USZipHttpGet")
    public USZipHttpGet getUSZipHttpGet() {
        return super.getPort(new QName("http://www.webserviceX.NET", "USZipHttpGet"), USZipHttpGet.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns USZipHttpGet
     */
    @WebEndpoint(name = "USZipHttpGet")
    public USZipHttpGet getUSZipHttpGet(WebServiceFeature... features) {
        return super.getPort(new QName("http://www.webserviceX.NET", "USZipHttpGet"), USZipHttpGet.class, features);
    }

    /**
     * 
     * @return
     *     returns USZipHttpPost
     */
    @WebEndpoint(name = "USZipHttpPost")
    public USZipHttpPost getUSZipHttpPost() {
        return super.getPort(new QName("http://www.webserviceX.NET", "USZipHttpPost"), USZipHttpPost.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns USZipHttpPost
     */
    @WebEndpoint(name = "USZipHttpPost")
    public USZipHttpPost getUSZipHttpPost(WebServiceFeature... features) {
        return super.getPort(new QName("http://www.webserviceX.NET", "USZipHttpPost"), USZipHttpPost.class, features);
    }

    private static URL __getWsdlLocation() {
        if (USZIP_EXCEPTION!= null) {
            throw USZIP_EXCEPTION;
        }
        return USZIP_WSDL_LOCATION;
    }

}
