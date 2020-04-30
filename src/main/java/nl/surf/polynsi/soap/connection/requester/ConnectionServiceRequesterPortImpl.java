
/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

package nl.surf.polynsi.soap.connection.requester;

import java.util.logging.Logger;
import javax.annotation.Generated;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.3.5
 * 2020-04-27T16:21:08.686+02:00
 * Generated source version: 3.3.5
 *
 */

@javax.jws.WebService(
                      serviceName = "ConnectionServiceRequester",
                      portName = "ConnectionServiceRequesterPort",
                      targetNamespace = "http://schemas.ogf.org/nsi/2013/12/connection/requester",
                      wsdlLocation = "file:/usr/home/guido/devel/surfnet/polynsi/src/main/resources/wsdl/connection/ogf_nsi_connection_requester_v2_0.wsdl",
                      endpointInterface = "nl.surf.polynsi.soap.connection.requester.ConnectionRequesterPort")

@Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2020-04-27T16:21:08.686+02:00", comments = "Apache CXF 3.3.5")
public class ConnectionServiceRequesterPortImpl implements ConnectionRequesterPort {

    @Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2020-04-27T16:21:08.686+02:00")
    private static final Logger LOG = Logger.getLogger(ConnectionServiceRequesterPortImpl.class.getName());

    /* (non-Javadoc)
     * @see nl.surf.polynsi.soap.connection.requester.ConnectionRequesterPort#reserveFailed(java.lang.String connectionId, nl.surf.polynsi.soap.connection.types.ConnectionStatesType connectionStates, nl.surf.polynsi.soap.framework.types.ServiceExceptionType serviceException, nl.surf.polynsi.soap.framework.headers.CommonHeaderType header)*
     */
    @Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2020-04-27T16:21:08.686+02:00")
    public void reserveFailed(java.lang.String connectionId, nl.surf.polynsi.soap.connection.types.ConnectionStatesType connectionStates, nl.surf.polynsi.soap.framework.types.ServiceExceptionType serviceException, javax.xml.ws.Holder<nl.surf.polynsi.soap.framework.headers.CommonHeaderType> header) throws ServiceException   {
        LOG.info("Executing operation reserveFailed");
        System.out.println(connectionId);
        System.out.println(connectionStates);
        System.out.println(serviceException);
        System.out.println(header.value);
        try {
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
        //throw new ServiceException("serviceException...");
    }

    /* (non-Javadoc)
     * @see nl.surf.polynsi.soap.connection.requester.ConnectionRequesterPort#querySummaryConfirmed(java.util.List<nl.surf.polynsi.soap.connection.types.QuerySummaryResultType> reservation, java.time.OffsetDateTime lastModified, nl.surf.polynsi.soap.framework.headers.CommonHeaderType header)*
     */
    @Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2020-04-27T16:21:08.686+02:00")
    public void querySummaryConfirmed(java.util.List<nl.surf.polynsi.soap.connection.types.QuerySummaryResultType> reservation, java.time.OffsetDateTime lastModified, javax.xml.ws.Holder<nl.surf.polynsi.soap.framework.headers.CommonHeaderType> header) throws ServiceException   {
        LOG.info("Executing operation querySummaryConfirmed");
        System.out.println(reservation);
        System.out.println(lastModified);
        System.out.println(header.value);
        try {
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
        //throw new ServiceException("serviceException...");
    }

    /* (non-Javadoc)
     * @see nl.surf.polynsi.soap.connection.requester.ConnectionRequesterPort#provisionConfirmed(java.lang.String connectionId, nl.surf.polynsi.soap.framework.headers.CommonHeaderType header)*
     */
    @Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2020-04-27T16:21:08.686+02:00")
    public void provisionConfirmed(java.lang.String connectionId, javax.xml.ws.Holder<nl.surf.polynsi.soap.framework.headers.CommonHeaderType> header) throws ServiceException   {
        LOG.info("Executing operation provisionConfirmed");
        System.out.println(connectionId);
        System.out.println(header.value);
        try {
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
        //throw new ServiceException("serviceException...");
    }

    /* (non-Javadoc)
     * @see nl.surf.polynsi.soap.connection.requester.ConnectionRequesterPort#error(nl.surf.polynsi.soap.framework.types.ServiceExceptionType serviceException, nl.surf.polynsi.soap.framework.headers.CommonHeaderType header)*
     */
    @Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2020-04-27T16:21:08.686+02:00")
    public void error(nl.surf.polynsi.soap.framework.types.ServiceExceptionType serviceException, javax.xml.ws.Holder<nl.surf.polynsi.soap.framework.headers.CommonHeaderType> header) throws ServiceException   {
        LOG.info("Executing operation error");
        System.out.println(serviceException);
        System.out.println(header.value);
        try {
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
        //throw new ServiceException("serviceException...");
    }

    /* (non-Javadoc)
     * @see nl.surf.polynsi.soap.connection.requester.ConnectionRequesterPort#terminateConfirmed(java.lang.String connectionId, nl.surf.polynsi.soap.framework.headers.CommonHeaderType header)*
     */
    @Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2020-04-27T16:21:08.686+02:00")
    public void terminateConfirmed(java.lang.String connectionId, javax.xml.ws.Holder<nl.surf.polynsi.soap.framework.headers.CommonHeaderType> header) throws ServiceException   {
        LOG.info("Executing operation terminateConfirmed");
        System.out.println(connectionId);
        System.out.println(header.value);
        try {
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
        //throw new ServiceException("serviceException...");
    }

    /* (non-Javadoc)
     * @see nl.surf.polynsi.soap.connection.requester.ConnectionRequesterPort#releaseConfirmed(java.lang.String connectionId, nl.surf.polynsi.soap.framework.headers.CommonHeaderType header)*
     */
    @Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2020-04-27T16:21:08.686+02:00")
    public void releaseConfirmed(java.lang.String connectionId, javax.xml.ws.Holder<nl.surf.polynsi.soap.framework.headers.CommonHeaderType> header) throws ServiceException   {
        LOG.info("Executing operation releaseConfirmed");
        System.out.println(connectionId);
        System.out.println(header.value);
        try {
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
        //throw new ServiceException("serviceException...");
    }

    /* (non-Javadoc)
     * @see nl.surf.polynsi.soap.connection.requester.ConnectionRequesterPort#errorEvent(java.lang.String connectionId, long notificationId, java.time.OffsetDateTime timeStamp, nl.surf.polynsi.soap.connection.types.EventEnumType event, java.lang.String originatingConnectionId, java.lang.String originatingNSA, nl.surf.polynsi.soap.framework.types.TypeValuePairListType additionalInfo, nl.surf.polynsi.soap.framework.types.ServiceExceptionType serviceException, nl.surf.polynsi.soap.framework.headers.CommonHeaderType header)*
     */
    @Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2020-04-27T16:21:08.686+02:00")
    public void errorEvent(java.lang.String connectionId, long notificationId, java.time.OffsetDateTime timeStamp, nl.surf.polynsi.soap.connection.types.EventEnumType event, java.lang.String originatingConnectionId, java.lang.String originatingNSA, nl.surf.polynsi.soap.framework.types.TypeValuePairListType additionalInfo, nl.surf.polynsi.soap.framework.types.ServiceExceptionType serviceException, javax.xml.ws.Holder<nl.surf.polynsi.soap.framework.headers.CommonHeaderType> header) throws ServiceException   {
        LOG.info("Executing operation errorEvent");
        System.out.println(connectionId);
        System.out.println(notificationId);
        System.out.println(timeStamp);
        System.out.println(event);
        System.out.println(originatingConnectionId);
        System.out.println(originatingNSA);
        System.out.println(additionalInfo);
        System.out.println(serviceException);
        System.out.println(header.value);
        try {
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
        //throw new ServiceException("serviceException...");
    }

    /* (non-Javadoc)
     * @see nl.surf.polynsi.soap.connection.requester.ConnectionRequesterPort#dataPlaneStateChange(java.lang.String connectionId, long notificationId, java.time.OffsetDateTime timeStamp, nl.surf.polynsi.soap.connection.types.DataPlaneStatusType dataPlaneStatus, nl.surf.polynsi.soap.framework.headers.CommonHeaderType header)*
     */
    @Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2020-04-27T16:21:08.686+02:00")
    public void dataPlaneStateChange(java.lang.String connectionId, long notificationId, java.time.OffsetDateTime timeStamp, nl.surf.polynsi.soap.connection.types.DataPlaneStatusType dataPlaneStatus, javax.xml.ws.Holder<nl.surf.polynsi.soap.framework.headers.CommonHeaderType> header) throws ServiceException   {
        LOG.info("Executing operation dataPlaneStateChange");
        System.out.println(connectionId);
        System.out.println(notificationId);
        System.out.println(timeStamp);
        System.out.println(dataPlaneStatus);
        System.out.println(header.value);
        try {
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
        //throw new ServiceException("serviceException...");
    }

    /* (non-Javadoc)
     * @see nl.surf.polynsi.soap.connection.requester.ConnectionRequesterPort#reserveAbortConfirmed(java.lang.String connectionId, nl.surf.polynsi.soap.framework.headers.CommonHeaderType header)*
     */
    @Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2020-04-27T16:21:08.686+02:00")
    public void reserveAbortConfirmed(java.lang.String connectionId, javax.xml.ws.Holder<nl.surf.polynsi.soap.framework.headers.CommonHeaderType> header) throws ServiceException   {
        LOG.info("Executing operation reserveAbortConfirmed");
        System.out.println(connectionId);
        System.out.println(header.value);
        try {
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
        //throw new ServiceException("serviceException...");
    }

    /* (non-Javadoc)
     * @see nl.surf.polynsi.soap.connection.requester.ConnectionRequesterPort#messageDeliveryTimeout(java.lang.String connectionId, long notificationId, java.time.OffsetDateTime timeStamp, java.lang.String correlationId, nl.surf.polynsi.soap.framework.headers.CommonHeaderType header)*
     */
    @Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2020-04-27T16:21:08.686+02:00")
    public void messageDeliveryTimeout(java.lang.String connectionId, long notificationId, java.time.OffsetDateTime timeStamp, java.lang.String correlationId, javax.xml.ws.Holder<nl.surf.polynsi.soap.framework.headers.CommonHeaderType> header) throws ServiceException   {
        LOG.info("Executing operation messageDeliveryTimeout");
        System.out.println(connectionId);
        System.out.println(notificationId);
        System.out.println(timeStamp);
        System.out.println(correlationId);
        System.out.println(header.value);
        try {
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
        //throw new ServiceException("serviceException...");
    }

    /* (non-Javadoc)
     * @see nl.surf.polynsi.soap.connection.requester.ConnectionRequesterPort#reserveCommitFailed(java.lang.String connectionId, nl.surf.polynsi.soap.connection.types.ConnectionStatesType connectionStates, nl.surf.polynsi.soap.framework.types.ServiceExceptionType serviceException, nl.surf.polynsi.soap.framework.headers.CommonHeaderType header)*
     */
    @Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2020-04-27T16:21:08.686+02:00")
    public void reserveCommitFailed(java.lang.String connectionId, nl.surf.polynsi.soap.connection.types.ConnectionStatesType connectionStates, nl.surf.polynsi.soap.framework.types.ServiceExceptionType serviceException, javax.xml.ws.Holder<nl.surf.polynsi.soap.framework.headers.CommonHeaderType> header) throws ServiceException   {
        LOG.info("Executing operation reserveCommitFailed");
        System.out.println(connectionId);
        System.out.println(connectionStates);
        System.out.println(serviceException);
        System.out.println(header.value);
        try {
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
        //throw new ServiceException("serviceException...");
    }

    /* (non-Javadoc)
     * @see nl.surf.polynsi.soap.connection.requester.ConnectionRequesterPort#queryNotificationConfirmed(nl.surf.polynsi.soap.connection.types.QueryNotificationConfirmedType queryNotificationConfirmed, nl.surf.polynsi.soap.framework.headers.CommonHeaderType header)*
     */
    @Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2020-04-27T16:21:08.686+02:00")
    public nl.surf.polynsi.soap.connection.types.GenericAcknowledgmentType queryNotificationConfirmed(nl.surf.polynsi.soap.connection.types.QueryNotificationConfirmedType queryNotificationConfirmed, javax.xml.ws.Holder<nl.surf.polynsi.soap.framework.headers.CommonHeaderType> header) throws ServiceException   {
        LOG.info("Executing operation queryNotificationConfirmed");
        System.out.println(queryNotificationConfirmed);
        System.out.println(header.value);
        try {
            nl.surf.polynsi.soap.connection.types.GenericAcknowledgmentType _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
        //throw new ServiceException("serviceException...");
    }

    /* (non-Javadoc)
     * @see nl.surf.polynsi.soap.connection.requester.ConnectionRequesterPort#queryResultConfirmed(java.util.List<nl.surf.polynsi.soap.connection.types.QueryResultResponseType> result, nl.surf.polynsi.soap.framework.headers.CommonHeaderType header)*
     */
    @Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2020-04-27T16:21:08.686+02:00")
    public void queryResultConfirmed(java.util.List<nl.surf.polynsi.soap.connection.types.QueryResultResponseType> result, javax.xml.ws.Holder<nl.surf.polynsi.soap.framework.headers.CommonHeaderType> header) throws ServiceException   {
        LOG.info("Executing operation queryResultConfirmed");
        System.out.println(result);
        System.out.println(header.value);
        try {
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
        //throw new ServiceException("serviceException...");
    }

    /* (non-Javadoc)
     * @see nl.surf.polynsi.soap.connection.requester.ConnectionRequesterPort#reserveCommitConfirmed(java.lang.String connectionId, nl.surf.polynsi.soap.framework.headers.CommonHeaderType header)*
     */
    @Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2020-04-27T16:21:08.686+02:00")
    public void reserveCommitConfirmed(java.lang.String connectionId, javax.xml.ws.Holder<nl.surf.polynsi.soap.framework.headers.CommonHeaderType> header) throws ServiceException   {
        LOG.info("Executing operation reserveCommitConfirmed");
        System.out.println(connectionId);
        System.out.println(header.value);
        try {
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
        //throw new ServiceException("serviceException...");
    }

    /* (non-Javadoc)
     * @see nl.surf.polynsi.soap.connection.requester.ConnectionRequesterPort#reserveTimeout(java.lang.String connectionId, long notificationId, java.time.OffsetDateTime timeStamp, int timeoutValue, java.lang.String originatingConnectionId, java.lang.String originatingNSA, nl.surf.polynsi.soap.framework.headers.CommonHeaderType header)*
     */
    @Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2020-04-27T16:21:08.686+02:00")
    public void reserveTimeout(java.lang.String connectionId, long notificationId, java.time.OffsetDateTime timeStamp, int timeoutValue, java.lang.String originatingConnectionId, java.lang.String originatingNSA, javax.xml.ws.Holder<nl.surf.polynsi.soap.framework.headers.CommonHeaderType> header) throws ServiceException   {
        LOG.info("Executing operation reserveTimeout");
        System.out.println(connectionId);
        System.out.println(notificationId);
        System.out.println(timeStamp);
        System.out.println(timeoutValue);
        System.out.println(originatingConnectionId);
        System.out.println(originatingNSA);
        System.out.println(header.value);
        try {
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
        //throw new ServiceException("serviceException...");
    }

    /* (non-Javadoc)
     * @see nl.surf.polynsi.soap.connection.requester.ConnectionRequesterPort#reserveConfirmed(java.lang.String connectionId, java.lang.String globalReservationId, java.lang.String description, nl.surf.polynsi.soap.connection.types.ReservationConfirmCriteriaType criteria, nl.surf.polynsi.soap.framework.headers.CommonHeaderType header)*
     */
    @Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2020-04-27T16:21:08.686+02:00")
    public void reserveConfirmed(java.lang.String connectionId, java.lang.String globalReservationId, java.lang.String description, nl.surf.polynsi.soap.connection.types.ReservationConfirmCriteriaType criteria, javax.xml.ws.Holder<nl.surf.polynsi.soap.framework.headers.CommonHeaderType> header) throws ServiceException   {
        LOG.info("Executing operation reserveConfirmed");
        System.out.println(connectionId);
        System.out.println(globalReservationId);
        System.out.println(description);
        System.out.println(criteria);
        System.out.println(header.value);
        try {
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
        //throw new ServiceException("serviceException...");
    }

    /* (non-Javadoc)
     * @see nl.surf.polynsi.soap.connection.requester.ConnectionRequesterPort#queryRecursiveConfirmed(java.util.List<nl.surf.polynsi.soap.connection.types.QueryRecursiveResultType> reservation, nl.surf.polynsi.soap.framework.headers.CommonHeaderType header)*
     */
    @Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2020-04-27T16:21:08.686+02:00")
    public void queryRecursiveConfirmed(java.util.List<nl.surf.polynsi.soap.connection.types.QueryRecursiveResultType> reservation, javax.xml.ws.Holder<nl.surf.polynsi.soap.framework.headers.CommonHeaderType> header) throws ServiceException   {
        LOG.info("Executing operation queryRecursiveConfirmed");
        System.out.println(reservation);
        System.out.println(header.value);
        try {
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
        //throw new ServiceException("serviceException...");
    }

}
