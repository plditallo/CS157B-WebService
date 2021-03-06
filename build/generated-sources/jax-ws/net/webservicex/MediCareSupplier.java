
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
 * This section provides names, addresses, and contact information for suppliers that provide services or products under the Medicare program. A supplier is an individual or entity that has agreed to provide health care equipment, items, or services under Medicare. A supplier may provide items such as: Durable Medical Equipment (wheelchairs, walkers, oxygen), Prosthetics (artificial limb replacements or dentures) or Orthotics (mechanical devices used to assist in mobility or supplement the joints and limbs). In addition, a type of supplier can also be Pharmacy/Drug Stores and Optometry/Opticians.This Supplier Directory lists Medicare enrolled pharmacies and suppliers.
 * 
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2-hudson-752-
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "MediCareSupplier", targetNamespace = "http://www.webservicex.net/", wsdlLocation = "http://www.webservicex.net/medicareSupplier.asmx?WSDL")
public class MediCareSupplier
    extends Service
{

    private final static URL MEDICARESUPPLIER_WSDL_LOCATION;
    private final static WebServiceException MEDICARESUPPLIER_EXCEPTION;
    private final static QName MEDICARESUPPLIER_QNAME = new QName("http://www.webservicex.net/", "MediCareSupplier");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://www.webservicex.net/medicareSupplier.asmx?WSDL");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        MEDICARESUPPLIER_WSDL_LOCATION = url;
        MEDICARESUPPLIER_EXCEPTION = e;
    }

    public MediCareSupplier() {
        super(__getWsdlLocation(), MEDICARESUPPLIER_QNAME);
    }

    public MediCareSupplier(WebServiceFeature... features) {
        super(__getWsdlLocation(), MEDICARESUPPLIER_QNAME, features);
    }

    public MediCareSupplier(URL wsdlLocation) {
        super(wsdlLocation, MEDICARESUPPLIER_QNAME);
    }

    public MediCareSupplier(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, MEDICARESUPPLIER_QNAME, features);
    }

    public MediCareSupplier(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public MediCareSupplier(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns MediCareSupplierSoap
     */
    @WebEndpoint(name = "MediCareSupplierSoap")
    public MediCareSupplierSoap getMediCareSupplierSoap() {
        return super.getPort(new QName("http://www.webservicex.net/", "MediCareSupplierSoap"), MediCareSupplierSoap.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns MediCareSupplierSoap
     */
    @WebEndpoint(name = "MediCareSupplierSoap")
    public MediCareSupplierSoap getMediCareSupplierSoap(WebServiceFeature... features) {
        return super.getPort(new QName("http://www.webservicex.net/", "MediCareSupplierSoap"), MediCareSupplierSoap.class, features);
    }

    /**
     * 
     * @return
     *     returns MediCareSupplierSoap
     */
    @WebEndpoint(name = "MediCareSupplierSoap12")
    public MediCareSupplierSoap getMediCareSupplierSoap12() {
        return super.getPort(new QName("http://www.webservicex.net/", "MediCareSupplierSoap12"), MediCareSupplierSoap.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns MediCareSupplierSoap
     */
    @WebEndpoint(name = "MediCareSupplierSoap12")
    public MediCareSupplierSoap getMediCareSupplierSoap12(WebServiceFeature... features) {
        return super.getPort(new QName("http://www.webservicex.net/", "MediCareSupplierSoap12"), MediCareSupplierSoap.class, features);
    }

    private static URL __getWsdlLocation() {
        if (MEDICARESUPPLIER_EXCEPTION!= null) {
            throw MEDICARESUPPLIER_EXCEPTION;
        }
        return MEDICARESUPPLIER_WSDL_LOCATION;
    }

}
