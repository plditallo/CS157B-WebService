
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
 * Book Information web services by ISBN or EAN bar code
 * 
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2-hudson-752-
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "ISBN", targetNamespace = "http://www.webserviceX.NET", wsdlLocation = "http://www.webservicex.net/isbn.asmx?WSDL")
public class ISBN
    extends Service
{

    private final static URL ISBN_WSDL_LOCATION;
    private final static WebServiceException ISBN_EXCEPTION;
    private final static QName ISBN_QNAME = new QName("http://www.webserviceX.NET", "ISBN");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://www.webservicex.net/isbn.asmx?WSDL");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        ISBN_WSDL_LOCATION = url;
        ISBN_EXCEPTION = e;
    }

    public ISBN() {
        super(__getWsdlLocation(), ISBN_QNAME);
    }

    public ISBN(WebServiceFeature... features) {
        super(__getWsdlLocation(), ISBN_QNAME, features);
    }

    public ISBN(URL wsdlLocation) {
        super(wsdlLocation, ISBN_QNAME);
    }

    public ISBN(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, ISBN_QNAME, features);
    }

    public ISBN(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ISBN(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns ISBNSoap
     */
    @WebEndpoint(name = "ISBNSoap")
    public ISBNSoap getISBNSoap() {
        return super.getPort(new QName("http://www.webserviceX.NET", "ISBNSoap"), ISBNSoap.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ISBNSoap
     */
    @WebEndpoint(name = "ISBNSoap")
    public ISBNSoap getISBNSoap(WebServiceFeature... features) {
        return super.getPort(new QName("http://www.webserviceX.NET", "ISBNSoap"), ISBNSoap.class, features);
    }

    /**
     * 
     * @return
     *     returns ISBNSoap
     */
    @WebEndpoint(name = "ISBNSoap12")
    public ISBNSoap getISBNSoap12() {
        return super.getPort(new QName("http://www.webserviceX.NET", "ISBNSoap12"), ISBNSoap.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ISBNSoap
     */
    @WebEndpoint(name = "ISBNSoap12")
    public ISBNSoap getISBNSoap12(WebServiceFeature... features) {
        return super.getPort(new QName("http://www.webserviceX.NET", "ISBNSoap12"), ISBNSoap.class, features);
    }

    /**
     * 
     * @return
     *     returns ISBNHttpGet
     */
    @WebEndpoint(name = "ISBNHttpGet")
    public ISBNHttpGet getISBNHttpGet() {
        return super.getPort(new QName("http://www.webserviceX.NET", "ISBNHttpGet"), ISBNHttpGet.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ISBNHttpGet
     */
    @WebEndpoint(name = "ISBNHttpGet")
    public ISBNHttpGet getISBNHttpGet(WebServiceFeature... features) {
        return super.getPort(new QName("http://www.webserviceX.NET", "ISBNHttpGet"), ISBNHttpGet.class, features);
    }

    /**
     * 
     * @return
     *     returns ISBNHttpPost
     */
    @WebEndpoint(name = "ISBNHttpPost")
    public ISBNHttpPost getISBNHttpPost() {
        return super.getPort(new QName("http://www.webserviceX.NET", "ISBNHttpPost"), ISBNHttpPost.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ISBNHttpPost
     */
    @WebEndpoint(name = "ISBNHttpPost")
    public ISBNHttpPost getISBNHttpPost(WebServiceFeature... features) {
        return super.getPort(new QName("http://www.webserviceX.NET", "ISBNHttpPost"), ISBNHttpPost.class, features);
    }

    private static URL __getWsdlLocation() {
        if (ISBN_EXCEPTION!= null) {
            throw ISBN_EXCEPTION;
        }
        return ISBN_WSDL_LOCATION;
    }

}
