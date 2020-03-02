
package nl.surf.polynsi.soap.connection.requester;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 3.3.5
 * Generated source version: 3.3.5
 */

@WebFault(name = "serviceException", targetNamespace = "http://schemas.ogf.org/nsi/2013/12/connection/types")
public class ServiceException extends Exception {

    private nl.surf.polynsi.soap.framework.types.ServiceExceptionType serviceException;

    public ServiceException() {
        super();
    }

    public ServiceException(String message) {
        super(message);
    }

    public ServiceException(String message, java.lang.Throwable cause) {
        super(message, cause);
    }

    public ServiceException(String message, nl.surf.polynsi.soap.framework.types.ServiceExceptionType serviceException) {
        super(message);
        this.serviceException = serviceException;
    }

    public ServiceException(String message, nl.surf.polynsi.soap.framework.types.ServiceExceptionType serviceException, java.lang.Throwable cause) {
        super(message, cause);
        this.serviceException = serviceException;
    }

    public nl.surf.polynsi.soap.framework.types.ServiceExceptionType getFaultInfo() {
        return this.serviceException;
    }
}
