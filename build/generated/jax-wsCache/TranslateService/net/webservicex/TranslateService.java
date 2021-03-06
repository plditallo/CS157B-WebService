
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
@WebServiceClient(name = "TranslateService", targetNamespace = "http://www.webservicex.net", wsdlLocation = "http://www.webservicex.net/TranslateService.asmx?WSDL")
public class TranslateService
    extends Service
{

    private final static URL TRANSLATESERVICE_WSDL_LOCATION;
    private final static WebServiceException TRANSLATESERVICE_EXCEPTION;
    private final static QName TRANSLATESERVICE_QNAME = new QName("http://www.webservicex.net", "TranslateService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://www.webservicex.net/TranslateService.asmx?WSDL");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        TRANSLATESERVICE_WSDL_LOCATION = url;
        TRANSLATESERVICE_EXCEPTION = e;
    }

    public TranslateService() {
        super(__getWsdlLocation(), TRANSLATESERVICE_QNAME);
    }

    public TranslateService(WebServiceFeature... features) {
        super(__getWsdlLocation(), TRANSLATESERVICE_QNAME, features);
    }

    public TranslateService(URL wsdlLocation) {
        super(wsdlLocation, TRANSLATESERVICE_QNAME);
    }

    public TranslateService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, TRANSLATESERVICE_QNAME, features);
    }

    public TranslateService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public TranslateService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns TranslateServiceSoap
     */
    @WebEndpoint(name = "TranslateServiceSoap")
    public TranslateServiceSoap getTranslateServiceSoap() {
        return super.getPort(new QName("http://www.webservicex.net", "TranslateServiceSoap"), TranslateServiceSoap.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns TranslateServiceSoap
     */
    @WebEndpoint(name = "TranslateServiceSoap")
    public TranslateServiceSoap getTranslateServiceSoap(WebServiceFeature... features) {
        return super.getPort(new QName("http://www.webservicex.net", "TranslateServiceSoap"), TranslateServiceSoap.class, features);
    }

    /**
     * 
     * @return
     *     returns TranslateServiceSoap
     */
    @WebEndpoint(name = "TranslateServiceSoap12")
    public TranslateServiceSoap getTranslateServiceSoap12() {
        return super.getPort(new QName("http://www.webservicex.net", "TranslateServiceSoap12"), TranslateServiceSoap.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns TranslateServiceSoap
     */
    @WebEndpoint(name = "TranslateServiceSoap12")
    public TranslateServiceSoap getTranslateServiceSoap12(WebServiceFeature... features) {
        return super.getPort(new QName("http://www.webservicex.net", "TranslateServiceSoap12"), TranslateServiceSoap.class, features);
    }

    /**
     * 
     * @return
     *     returns TranslateServiceHttpGet
     */
    @WebEndpoint(name = "TranslateServiceHttpGet")
    public TranslateServiceHttpGet getTranslateServiceHttpGet() {
        return super.getPort(new QName("http://www.webservicex.net", "TranslateServiceHttpGet"), TranslateServiceHttpGet.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns TranslateServiceHttpGet
     */
    @WebEndpoint(name = "TranslateServiceHttpGet")
    public TranslateServiceHttpGet getTranslateServiceHttpGet(WebServiceFeature... features) {
        return super.getPort(new QName("http://www.webservicex.net", "TranslateServiceHttpGet"), TranslateServiceHttpGet.class, features);
    }

    /**
     * 
     * @return
     *     returns TranslateServiceHttpPost
     */
    @WebEndpoint(name = "TranslateServiceHttpPost")
    public TranslateServiceHttpPost getTranslateServiceHttpPost() {
        return super.getPort(new QName("http://www.webservicex.net", "TranslateServiceHttpPost"), TranslateServiceHttpPost.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns TranslateServiceHttpPost
     */
    @WebEndpoint(name = "TranslateServiceHttpPost")
    public TranslateServiceHttpPost getTranslateServiceHttpPost(WebServiceFeature... features) {
        return super.getPort(new QName("http://www.webservicex.net", "TranslateServiceHttpPost"), TranslateServiceHttpPost.class, features);
    }

    private static URL __getWsdlLocation() {
        if (TRANSLATESERVICE_EXCEPTION!= null) {
            throw TRANSLATESERVICE_EXCEPTION;
        }
        return TRANSLATESERVICE_WSDL_LOCATION;
    }

}
