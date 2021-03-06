package nl.surf.polynsi.grpc.connection.requester;

import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;
import nl.surf.polynsi.ConverterException;
import nl.surf.polynsi.Direction;
import nl.surf.polynsi.ProxyException;
import nl.surf.polynsi.soap.connection.requester.ConnectionRequesterPort;
import nl.surf.polynsi.soap.connection.requester.ServiceException;
import nl.surf.polynsi.soap.connection.types.ObjectFactory;
import nl.surf.polynsi.soap.connection.types.ReservationConfirmCriteriaType;
import nl.surf.polynsi.soap.framework.headers.CommonHeaderType;
import org.ogf.nsi.grpc.connection.requester.*;
import org.springframework.beans.factory.annotation.Autowired;

import javax.xml.ws.Holder;
import java.util.logging.Logger;

import static nl.surf.polynsi.Converter.toSoap;

@GrpcService
public class ConnectionRequesterService extends ConnectionRequesterGrpc.ConnectionRequesterImplBase {
    private static final Logger LOG = Logger.getLogger(ConnectionRequesterService.class.getName());

    @Autowired
    ConnectionRequesterPort connectionRequesterPort;

    @Override
    public void reserveConfirmed(ReserveConfirmedRequest pbReserveConfirmedRequest,
                                 StreamObserver<ReserveConfirmedResponse> responseObserver) {
        try {
            LOG.info("Executing gRPC service `reserveConfirmed`.");
            ReserveConfirmedResponse pbReserveConfirmedResponse = ReserveConfirmedResponse.newBuilder()
                    .setHeader(pbReserveConfirmedRequest.getHeader()).build();

            ObjectFactory objectFactory = new ObjectFactory();

            ReservationConfirmCriteriaType soapReservationConfirmCriteria = objectFactory
                    .createReservationConfirmCriteriaType();
            soapReservationConfirmCriteria.setVersion(pbReserveConfirmedRequest.getCriteria().getVersion());
            soapReservationConfirmCriteria.setSchedule(toSoap(pbReserveConfirmedRequest.getCriteria().getSchedule()));
            soapReservationConfirmCriteria.setServiceType(pbReserveConfirmedRequest.getCriteria().getServiceType());

            Holder<CommonHeaderType> soapHeaderHolder = new Holder<>();
            soapHeaderHolder.value = toSoap(pbReserveConfirmedRequest.getHeader());
            connectionRequesterPort
                    .reserveConfirmed(pbReserveConfirmedRequest.getConnectionId(), pbReserveConfirmedRequest
                            .getGlobalReservationId(), pbReserveConfirmedRequest
                            .getGlobalReservationId(), soapReservationConfirmCriteria, soapHeaderHolder);

            responseObserver.onNext(pbReserveConfirmedResponse);
            responseObserver.onCompleted();
        } catch (ConverterException | ServiceException e) {
            throw new ProxyException(Direction.GRPC_TO_SOAP, "Error while handling `reserveConfirmed` call.", e);
        }
    }

    @Override
    public void reserveFailed(ReserveFailedRequest pbReserveFailedRequest,
                              StreamObserver<ReserveFailedResponse> responseObserver) {
        try {
            LOG.info("Executing gRPC service `reserveFailed`.");
            ReserveFailedResponse pbReserveFailedResponse = ReserveFailedResponse.newBuilder()
                    .setHeader(pbReserveFailedRequest.getHeader()).build();

            Holder<CommonHeaderType> soapHeaderHolder = new Holder<>();
            soapHeaderHolder.value = toSoap(pbReserveFailedRequest.getHeader());
            connectionRequesterPort
                    .reserveFailed(pbReserveFailedRequest.getConnectionId(), toSoap(pbReserveFailedRequest
                            .getConnectionStates()), toSoap(pbReserveFailedRequest
                            .getServiceException()), soapHeaderHolder);

            responseObserver.onNext(pbReserveFailedResponse);
            responseObserver.onCompleted();
        } catch (ConverterException | ServiceException e) {
            throw new ProxyException(Direction.GRPC_TO_SOAP, "Error while handing `reserveFailed` call.", e);
        }
    }

    @Override
    public void reserveAbortConfirmed(ReserveAbortConfirmedRequest pbReserveAbortConfirmedRequest,
                                      StreamObserver<ReserveAbortConfirmedResponse> responseObserver) {
        try {
            LOG.info("Executing gRPC service `reserveAbortConfirmed");
            ReserveAbortConfirmedResponse pbReserveAbortConfirmedResponse = ReserveAbortConfirmedResponse.newBuilder()
                    .setHeader(pbReserveAbortConfirmedRequest.getHeader()).build();

            Holder<CommonHeaderType> soapHeaderHolder = new Holder<>();
            soapHeaderHolder.value = toSoap(pbReserveAbortConfirmedRequest.getHeader());
            connectionRequesterPort
                    .reserveAbortConfirmed(pbReserveAbortConfirmedRequest.getConnectionId(), soapHeaderHolder);

            responseObserver.onNext(pbReserveAbortConfirmedResponse);
            responseObserver.onCompleted();
        } catch (ConverterException | ServiceException e) {
            throw new ProxyException(Direction.GRPC_TO_SOAP, "Error while handing `reserveAbortConfirmed` call.", e);
        }
    }


    @Override
    public void reserveCommitConfirmed(ReserveCommitConfirmedRequest pbReserveCommitConfirmedRequest,
                                       StreamObserver<ReserveCommitConfirmedResponse> responseObserver) {
        try {
            LOG.info("Executing gRPC service `reserveCommitConfirmed`.");
            ReserveCommitConfirmedResponse pbReserveCommitConfirmedResponse = ReserveCommitConfirmedResponse
                    .newBuilder().setHeader(pbReserveCommitConfirmedRequest.getHeader()).build();

            Holder<CommonHeaderType> soapHeaderHolder = new Holder<>();
            soapHeaderHolder.value = toSoap(pbReserveCommitConfirmedRequest.getHeader());
            connectionRequesterPort
                    .reserveCommitConfirmed(pbReserveCommitConfirmedRequest.getConnectionId(), soapHeaderHolder);

            responseObserver.onNext(pbReserveCommitConfirmedResponse);
            responseObserver.onCompleted();
        } catch (ConverterException | ServiceException e) {
            throw new ProxyException(Direction.GRPC_TO_SOAP, "Error while handing `reserveCommitConfirmed` call.", e);
        }
    }

    @Override
    public void reserveCommitFailed(ReserveCommitFailedRequest pbReserveCommitFailedRequest,
                                    StreamObserver<ReserveCommitFailedResponse> responseObserver) {
        try {
            LOG.info("Executing gRPC service `reserveCommitFailed`.");
            ReserveCommitFailedResponse pbReserveCommitFailedResponse = ReserveCommitFailedResponse.newBuilder()
                    .setHeader(pbReserveCommitFailedRequest.getHeader()).build();

            Holder<CommonHeaderType> soapHeaderHolder = new Holder<>();
            soapHeaderHolder.value = toSoap(pbReserveCommitFailedRequest.getHeader());
            connectionRequesterPort.reserveCommitFailed(pbReserveCommitFailedRequest
                    .getConnectionId(), toSoap(pbReserveCommitFailedRequest
                    .getConnectionStates()), toSoap(pbReserveCommitFailedRequest
                    .getServiceException()), soapHeaderHolder);

            responseObserver.onNext(pbReserveCommitFailedResponse);
            responseObserver.onCompleted();
        } catch (ConverterException | ServiceException e) {
            throw new ProxyException(Direction.GRPC_TO_SOAP, "Error while handing `reserveCommitFailed` call.", e);
        }
    }
}

