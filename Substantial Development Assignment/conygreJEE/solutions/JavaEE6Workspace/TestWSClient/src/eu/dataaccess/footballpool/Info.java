
package eu.dataaccess.footballpool;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This Visual DataFlex Web Service exposes functions for the current football pool
 * 
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "Info", targetNamespace = "http://footballpool.dataaccess.eu", wsdlLocation = "http://footballpool.dataaccess.eu/data/info.wso?WSDL")
public class Info
    extends Service
{

    private final static URL INFO_WSDL_LOCATION;
    private final static WebServiceException INFO_EXCEPTION;
    private final static QName INFO_QNAME = new QName("http://footballpool.dataaccess.eu", "Info");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://footballpool.dataaccess.eu/data/info.wso?WSDL");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        INFO_WSDL_LOCATION = url;
        INFO_EXCEPTION = e;
    }

    public Info() {
        super(__getWsdlLocation(), INFO_QNAME);
    }

    public Info(WebServiceFeature... features) {
        super(__getWsdlLocation(), INFO_QNAME, features);
    }

    public Info(URL wsdlLocation) {
        super(wsdlLocation, INFO_QNAME);
    }

    public Info(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, INFO_QNAME, features);
    }

    public Info(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public Info(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns InfoSoapType
     */
    @WebEndpoint(name = "InfoSoap")
    public InfoSoapType getInfoSoap() {
        return super.getPort(new QName("http://footballpool.dataaccess.eu", "InfoSoap"), InfoSoapType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns InfoSoapType
     */
    @WebEndpoint(name = "InfoSoap")
    public InfoSoapType getInfoSoap(WebServiceFeature... features) {
        return super.getPort(new QName("http://footballpool.dataaccess.eu", "InfoSoap"), InfoSoapType.class, features);
    }

    private static URL __getWsdlLocation() {
        if (INFO_EXCEPTION!= null) {
            throw INFO_EXCEPTION;
        }
        return INFO_WSDL_LOCATION;
    }

}
