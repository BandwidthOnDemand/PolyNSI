package nl.surf.polynsi.soap.connection.provider;

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
 * Generated source version: 3.3.5
 *
 */
@WebService(targetNamespace = "http://schemas.ogf.org/nsi/2013/12/connection/provider", name = "ConnectionProviderPort")
@XmlSeeAlso({org.oasis.saml.ObjectFactory.class, org.w3.xmldsig.ObjectFactory.class, nl.surf.polynsi.soap.services.types.ObjectFactory.class, nl.surf.polynsi.soap.connection.types.ObjectFactory.class, nl.surf.polynsi.soap.framework.headers.ObjectFactory.class, nl.surf.polynsi.soap.services.definition.ObjectFactory.class, nl.surf.polynsi.soap.framework.types.ObjectFactory.class, nl.surf.polynsi.soap.services.p2p.ObjectFactory.class, org.w3.xmlenc.ObjectFactory.class})
public interface ConnectionProviderPort {

    /**
     * The provision message is sent from a Requester NSA to a Provider
     * NSA when an existing reservation is to be transitioned into a
     * provisioned state. The provisionACK indicates that the Provider
     * NSA has accepted the provision request for processing. A
     * provisionConfirmed message will be sent asynchronously to the
     * Requester NSA when provision processing has completed.  There is
     * no associated Failed message for this operation.
     *             
     */
    @WebMethod(action = "http://schemas.ogf.org/nsi/2013/12/connection/service/provision")
    @RequestWrapper(localName = "provision", targetNamespace = "http://schemas.ogf.org/nsi/2013/12/connection/types", className = "nl.surf.polynsi.soap.connection.types.GenericRequestType")
    @ResponseWrapper(localName = "acknowledgment", targetNamespace = "http://schemas.ogf.org/nsi/2013/12/connection/types", className = "nl.surf.polynsi.soap.connection.types.GenericAcknowledgmentType")
    public void provision(

        @WebParam(name = "connectionId", targetNamespace = "")
        java.lang.String connectionId,
        @WebParam(mode = WebParam.Mode.INOUT, name = "nsiHeader", targetNamespace = "http://schemas.ogf.org/nsi/2013/12/framework/headers", header = true)
        javax.xml.ws.Holder<nl.surf.polynsi.soap.framework.headers.CommonHeaderType> header
    ) throws ServiceException;

    /**
     * The querySummarySync message can be sent from a Requester NSA
     * to determine the status of existing reservations on the Provider
     * NSA. The querySummarySync is a synchronous operation that will
     * block until the results of the query operation have been
     * collected.  These results will be returned in the SOAP
     * response.
     *             
     */
    @WebMethod(action = "http://schemas.ogf.org/nsi/2013/12/connection/service/querySummarySync")
    @SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
    @WebResult(name = "querySummarySyncConfirmed", targetNamespace = "http://schemas.ogf.org/nsi/2013/12/connection/types", partName = "querySummarySyncConfirmed")
    public nl.surf.polynsi.soap.connection.types.QuerySummaryConfirmedType querySummarySync(

        @WebParam(partName = "querySummarySync", name = "querySummarySync", targetNamespace = "http://schemas.ogf.org/nsi/2013/12/connection/types")
        nl.surf.polynsi.soap.connection.types.QueryType querySummarySync,
        @WebParam(partName = "header", mode = WebParam.Mode.INOUT, name = "nsiHeader", targetNamespace = "http://schemas.ogf.org/nsi/2013/12/framework/headers", header = true)
        javax.xml.ws.Holder<nl.surf.polynsi.soap.framework.headers.CommonHeaderType> header
    ) throws Error;

    /**
     * The queryRecursive message can be sent from either a Provider or
     * Requester NSA to determine the status of existing reservations.
     * The queryRecursiveACK indicates that the target NSA has accepted
     * the queryRecursive request for processing. A queryRecursiveConfirmed
     * or queryRecursiveFailed message will be sent asynchronously to the
     * requesting NSA when query processing has completed.
     *             
     */
    @WebMethod(action = "http://schemas.ogf.org/nsi/2013/12/connection/service/queryRecursive")
    @SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
    @WebResult(name = "acknowledgment", targetNamespace = "http://schemas.ogf.org/nsi/2013/12/connection/types", partName = "acknowledgment")
    public nl.surf.polynsi.soap.connection.types.GenericAcknowledgmentType queryRecursive(

        @WebParam(partName = "queryRecursive", name = "queryRecursive", targetNamespace = "http://schemas.ogf.org/nsi/2013/12/connection/types")
        nl.surf.polynsi.soap.connection.types.QueryType queryRecursive,
        @WebParam(partName = "header", mode = WebParam.Mode.INOUT, name = "nsiHeader", targetNamespace = "http://schemas.ogf.org/nsi/2013/12/framework/headers", header = true)
        javax.xml.ws.Holder<nl.surf.polynsi.soap.framework.headers.CommonHeaderType> header
    ) throws ServiceException;

    /**
     * The reserveCommit message is sent from a Requester NSA to a
     * Provider NSA when a reservation or modification to an existing
     * reservation is being committed. The reserveCommitACK indicates
     * that the Provider NSA has accepted the modify request for
     * processing. A reserveCommitConfirmed or reserveCommitFailed message
     * will be sent asynchronously to the Requester NSA when reserve
     * or modify processing has completed.
     *             
     */
    @WebMethod(action = "http://schemas.ogf.org/nsi/2013/12/connection/service/reserveCommit")
    @RequestWrapper(localName = "reserveCommit", targetNamespace = "http://schemas.ogf.org/nsi/2013/12/connection/types", className = "nl.surf.polynsi.soap.connection.types.GenericRequestType")
    @ResponseWrapper(localName = "acknowledgment", targetNamespace = "http://schemas.ogf.org/nsi/2013/12/connection/types", className = "nl.surf.polynsi.soap.connection.types.GenericAcknowledgmentType")
    public void reserveCommit(

        @WebParam(name = "connectionId", targetNamespace = "")
        java.lang.String connectionId,
        @WebParam(mode = WebParam.Mode.INOUT, name = "nsiHeader", targetNamespace = "http://schemas.ogf.org/nsi/2013/12/framework/headers", header = true)
        javax.xml.ws.Holder<nl.surf.polynsi.soap.framework.headers.CommonHeaderType> header
    ) throws ServiceException;

    /**
     * The queryNotification message is sent from a Requester NSA
     * to a Provider NSA to retrieve notifications against an existing
     * reservation residing on the Provider NSA. QueryNotification is an
     * asynchronous operation that will return results of the operation
     * to the Requester NSA's SOAP endpoint specified in the NSI header
     * replyTo field.
     *             
     */
    @WebMethod(action = "http://schemas.ogf.org/nsi/2013/12/connection/service/queryNotification")
    @RequestWrapper(localName = "queryNotification", targetNamespace = "http://schemas.ogf.org/nsi/2013/12/connection/types", className = "nl.surf.polynsi.soap.connection.types.QueryNotificationType")
    @ResponseWrapper(localName = "acknowledgment", targetNamespace = "http://schemas.ogf.org/nsi/2013/12/connection/types", className = "nl.surf.polynsi.soap.connection.types.GenericAcknowledgmentType")
    public void queryNotification(

        @WebParam(name = "connectionId", targetNamespace = "")
        java.lang.String connectionId,
        @WebParam(name = "startNotificationId", targetNamespace = "")
        java.lang.Long startNotificationId,
        @WebParam(name = "endNotificationId", targetNamespace = "")
        java.lang.Long endNotificationId,
        @WebParam(mode = WebParam.Mode.INOUT, name = "nsiHeader", targetNamespace = "http://schemas.ogf.org/nsi/2013/12/framework/headers", header = true)
        javax.xml.ws.Holder<nl.surf.polynsi.soap.framework.headers.CommonHeaderType> header
    ) throws ServiceException;

    /**
     * The terminate message is sent from a Requester NSA to a Provider
     * NSA when an existing reservation is to be terminated. The
     * terminateACK indicates that the Provider NSA has accepted the
     * terminate request for processing. A terminateConfirmed or
     * terminateFailed message will be sent asynchronously to the Requester
     * NSA when terminate processing has completed.
     *             
     */
    @WebMethod(action = "http://schemas.ogf.org/nsi/2013/12/connection/service/terminate")
    @RequestWrapper(localName = "terminate", targetNamespace = "http://schemas.ogf.org/nsi/2013/12/connection/types", className = "nl.surf.polynsi.soap.connection.types.GenericRequestType")
    @ResponseWrapper(localName = "acknowledgment", targetNamespace = "http://schemas.ogf.org/nsi/2013/12/connection/types", className = "nl.surf.polynsi.soap.connection.types.GenericAcknowledgmentType")
    public void terminate(

        @WebParam(name = "connectionId", targetNamespace = "")
        java.lang.String connectionId,
        @WebParam(mode = WebParam.Mode.INOUT, name = "nsiHeader", targetNamespace = "http://schemas.ogf.org/nsi/2013/12/framework/headers", header = true)
        javax.xml.ws.Holder<nl.surf.polynsi.soap.framework.headers.CommonHeaderType> header
    ) throws ServiceException;

    /**
     * The reserve message is sent from a Requester NSA to a Provider
     * NSA when a new reservation is being requested, or a modification
     * to an existing reservation is required. The reserveResponse
     * indicates that the Provider NSA has accepted the reservation
     * request for processing and has assigned it the returned
     * connectionId. A reserveConfirmed or reserveFailed message will
     * be sent asynchronously to the Requester NSA when reserve 
     * operation has completed processing.
     *             
     */
    @WebMethod(action = "http://schemas.ogf.org/nsi/2013/12/connection/service/reserve")
    @RequestWrapper(localName = "reserve", targetNamespace = "http://schemas.ogf.org/nsi/2013/12/connection/types", className = "nl.surf.polynsi.soap.connection.types.ReserveType")
    @ResponseWrapper(localName = "reserveResponse", targetNamespace = "http://schemas.ogf.org/nsi/2013/12/connection/types", className = "nl.surf.polynsi.soap.connection.types.ReserveResponseType")
    public void reserve(

        @WebParam(mode = WebParam.Mode.INOUT, name = "connectionId", targetNamespace = "")
        javax.xml.ws.Holder<java.lang.String> connectionId,
        @WebParam(name = "globalReservationId", targetNamespace = "")
        java.lang.String globalReservationId,
        @WebParam(name = "description", targetNamespace = "")
        java.lang.String description,
        @WebParam(name = "criteria", targetNamespace = "")
        nl.surf.polynsi.soap.connection.types.ReservationRequestCriteriaType criteria,
        @WebParam(mode = WebParam.Mode.INOUT, name = "nsiHeader", targetNamespace = "http://schemas.ogf.org/nsi/2013/12/framework/headers", header = true)
        javax.xml.ws.Holder<nl.surf.polynsi.soap.framework.headers.CommonHeaderType> header
    ) throws ServiceException;

    /**
     * The queryResultSync message can be sent from a Requester NSA
     * to a Provider NASA to retrieve operation results against an
     * existing reservation on the Provider NSA. The queryResultSync
     * is a synchronous operation that will block until the results
     * of the query operation have been collected.  These results
     * will be returned in the SOAP response.
     *             
     */
    @WebMethod(action = "http://schemas.ogf.org/nsi/2013/12/connection/service/queryResultSync")
    @RequestWrapper(localName = "queryResultSync", targetNamespace = "http://schemas.ogf.org/nsi/2013/12/connection/types", className = "nl.surf.polynsi.soap.connection.types.QueryResultType")
    @ResponseWrapper(localName = "queryResultSyncConfirmed", targetNamespace = "http://schemas.ogf.org/nsi/2013/12/connection/types", className = "nl.surf.polynsi.soap.connection.types.QueryResultConfirmedType")
    @WebResult(name = "result", targetNamespace = "")
    public java.util.List<nl.surf.polynsi.soap.connection.types.QueryResultResponseType> queryResultSync(

        @WebParam(name = "connectionId", targetNamespace = "")
        java.lang.String connectionId,
        @WebParam(name = "startResultId", targetNamespace = "")
        java.lang.Long startResultId,
        @WebParam(name = "endResultId", targetNamespace = "")
        java.lang.Long endResultId,
        @WebParam(mode = WebParam.Mode.INOUT, name = "nsiHeader", targetNamespace = "http://schemas.ogf.org/nsi/2013/12/framework/headers", header = true)
        javax.xml.ws.Holder<nl.surf.polynsi.soap.framework.headers.CommonHeaderType> header
    ) throws Error;

    /**
     * The release message is sent from a Requester NSA to a Provider
     * NSA when an existing reservation is to be transitioned into a
     * released state. The releaseACK indicates that the Provider NSA
     * has accepted the release request for processing. A
     * releaseConfirmed message will be sent asynchronously to the
     * Requester NSA when release processing has completed.  There is
     * no associated Failed message for this operation.
     *             
     */
    @WebMethod(action = "http://schemas.ogf.org/nsi/2013/12/connection/service/release")
    @RequestWrapper(localName = "release", targetNamespace = "http://schemas.ogf.org/nsi/2013/12/connection/types", className = "nl.surf.polynsi.soap.connection.types.GenericRequestType")
    @ResponseWrapper(localName = "acknowledgment", targetNamespace = "http://schemas.ogf.org/nsi/2013/12/connection/types", className = "nl.surf.polynsi.soap.connection.types.GenericAcknowledgmentType")
    public void release(

        @WebParam(name = "connectionId", targetNamespace = "")
        java.lang.String connectionId,
        @WebParam(mode = WebParam.Mode.INOUT, name = "nsiHeader", targetNamespace = "http://schemas.ogf.org/nsi/2013/12/framework/headers", header = true)
        javax.xml.ws.Holder<nl.surf.polynsi.soap.framework.headers.CommonHeaderType> header
    ) throws ServiceException;

    /**
     * The reserveAbort message is sent from a Requester NSA to a
     * Provider NSA when a cancellation to an existing reserve or
     * modify operation is being requested. The reserveAbortACK
     * indicates that the Provider NSA has accepted the reserveAbort
     * request for processing. A reserveAbortConfirmed or
     * reserveAbortFailed message will be sent asynchronously to the
     * Requester NSA when reserveAbort processing has completed.
     *             
     */
    @WebMethod(action = "http://schemas.ogf.org/nsi/2013/12/connection/service/reserveAbort")
    @RequestWrapper(localName = "reserveAbort", targetNamespace = "http://schemas.ogf.org/nsi/2013/12/connection/types", className = "nl.surf.polynsi.soap.connection.types.GenericRequestType")
    @ResponseWrapper(localName = "acknowledgment", targetNamespace = "http://schemas.ogf.org/nsi/2013/12/connection/types", className = "nl.surf.polynsi.soap.connection.types.GenericAcknowledgmentType")
    public void reserveAbort(

        @WebParam(name = "connectionId", targetNamespace = "")
        java.lang.String connectionId,
        @WebParam(mode = WebParam.Mode.INOUT, name = "nsiHeader", targetNamespace = "http://schemas.ogf.org/nsi/2013/12/framework/headers", header = true)
        javax.xml.ws.Holder<nl.surf.polynsi.soap.framework.headers.CommonHeaderType> header
    ) throws ServiceException;

    /**
     * The querySummary message is sent from a Requester NSA to a
     * Provider NSA to determine the status of existing reservations.
     * The querySummaryACK indicates that the target NSA has
     * accepted the querySummary request for processing. A
     * querySummaryConfirmed or querySummaryFailed message will be
     * sent asynchronously to the requesting NSA when querySummary
     * processing has completed.
     *             
     */
    @WebMethod(action = "http://schemas.ogf.org/nsi/2013/12/connection/service/querySummary")
    @SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
    @WebResult(name = "acknowledgment", targetNamespace = "http://schemas.ogf.org/nsi/2013/12/connection/types", partName = "acknowledgment")
    public nl.surf.polynsi.soap.connection.types.GenericAcknowledgmentType querySummary(

        @WebParam(partName = "querySummary", name = "querySummary", targetNamespace = "http://schemas.ogf.org/nsi/2013/12/connection/types")
        nl.surf.polynsi.soap.connection.types.QueryType querySummary,
        @WebParam(partName = "header", mode = WebParam.Mode.INOUT, name = "nsiHeader", targetNamespace = "http://schemas.ogf.org/nsi/2013/12/framework/headers", header = true)
        javax.xml.ws.Holder<nl.surf.polynsi.soap.framework.headers.CommonHeaderType> header
    ) throws ServiceException;

    /**
     * The queryResult message is sent from a Requester NSA to a Provider
     * NSA to retrieve operation results against an existing reservation
     * residing on the Provider NSA. QueryResult is an asynchronous
     * operation that will return results of the operation to the Requester
     * NSA's SOAP endpoint specified in the NSI header replyTo field.
     *             
     */
    @WebMethod(action = "http://schemas.ogf.org/nsi/2013/12/connection/service/queryResult")
    @RequestWrapper(localName = "queryResult", targetNamespace = "http://schemas.ogf.org/nsi/2013/12/connection/types", className = "nl.surf.polynsi.soap.connection.types.QueryResultType")
    @ResponseWrapper(localName = "acknowledgment", targetNamespace = "http://schemas.ogf.org/nsi/2013/12/connection/types", className = "nl.surf.polynsi.soap.connection.types.GenericAcknowledgmentType")
    public void queryResult(

        @WebParam(name = "connectionId", targetNamespace = "")
        java.lang.String connectionId,
        @WebParam(name = "startResultId", targetNamespace = "")
        java.lang.Long startResultId,
        @WebParam(name = "endResultId", targetNamespace = "")
        java.lang.Long endResultId,
        @WebParam(mode = WebParam.Mode.INOUT, name = "nsiHeader", targetNamespace = "http://schemas.ogf.org/nsi/2013/12/framework/headers", header = true)
        javax.xml.ws.Holder<nl.surf.polynsi.soap.framework.headers.CommonHeaderType> header
    ) throws ServiceException;

    /**
     * The queryNotificationSync message can be sent from a Requester NSA
     * to notifications against an existing reservations on the Provider
     * NSA. The queryNotificationSync is a synchronous operation that
     * will block until the results of the query operation have been
     * collected.  These results will be returned in the SOAP response.
     *             
     */
    @WebMethod(action = "http://schemas.ogf.org/nsi/2013/12/connection/service/queryNotificationSync")
    @SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
    @WebResult(name = "queryNotificationSyncConfirmed", targetNamespace = "http://schemas.ogf.org/nsi/2013/12/connection/types", partName = "queryNotificationSyncConfirmed")
    public nl.surf.polynsi.soap.connection.types.QueryNotificationConfirmedType queryNotificationSync(

        @WebParam(partName = "queryNotificationSync", name = "queryNotificationSync", targetNamespace = "http://schemas.ogf.org/nsi/2013/12/connection/types")
        nl.surf.polynsi.soap.connection.types.QueryNotificationType queryNotificationSync,
        @WebParam(partName = "header", mode = WebParam.Mode.INOUT, name = "nsiHeader", targetNamespace = "http://schemas.ogf.org/nsi/2013/12/framework/headers", header = true)
        javax.xml.ws.Holder<nl.surf.polynsi.soap.framework.headers.CommonHeaderType> header
    ) throws Error;
}
