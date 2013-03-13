
package net.webservicex;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2-hudson-752-
 * Generated source version: 2.2
 * 
 */
@WebService(name = "TranslateServiceHttpPost", targetNamespace = "http://www.webservicex.net")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
    ObjectFactory.class
})
public interface TranslateServiceHttpPost {


    /**
     * Convert text from one lanaguage to another language .Supported languages are English to Chinese,English to French,English to German,English to Italian,English to Japanese,English to Korean,English to Portuguese,English to Spanish,Chinese to English,French to English,French to German,German to English,German to French,Italian to English,Japanese to English,Korean to English,Portuguese to English,Russian to English,Spanish to English.
     * 
     * @param text
     * @param languageMode
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "Translate")
    @WebResult(name = "string", targetNamespace = "http://www.webservicex.net", partName = "Body")
    public String translate(
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "LanguageMode")
        String languageMode,
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "Text")
        String text);

}