package com.mastercard.api.mastercom.client;

import com.mastercard.api.mastercom.ApiClient;
import com.mastercard.api.mastercom.ApiException;
import com.mastercard.api.mastercom.api.ChargebacksApi;
import com.mastercard.api.mastercom.api.QueuesApi;
import com.mastercard.api.mastercom.model.ChargebackResponse;
import com.mastercard.api.mastercom.model.CreateChargebackRequest;
import com.mastercard.api.mastercom.model.Queue;
import com.mastercard.developer.interceptors.OkHttpOAuth1Interceptor;
import com.mastercard.developer.utils.AuthenticationUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.UnrecoverableKeyException;
import java.security.cert.CertificateException;
import java.util.List;

@Component
@Slf4j
public class MasterCardClient {

    public static final String consumerKey = "7AfIn4N-l_5T_DrIGww-KhCDjpT7mWumEUvpUy6F253f709d!c826141e16054850bc0fc49fca0307080000000000000000";
    public static final String signingKeyFilePath = "src/main/resources/picklu123-SANDBOX.p12";
    public static final String signingKeyAlias = "picklu123";
    public static final String signingKeyPass = "picklu123";
    private final ApiClient client;
    public MasterCardClient() {
        this.client = new ApiClient();
    }

    public List<Queue> getQueues() throws UnrecoverableKeyException, CertificateException, IOException, KeyStoreException, NoSuchAlgorithmException, ApiException {

        PrivateKey signingKey = AuthenticationUtils.loadSigningKey(signingKeyFilePath, signingKeyAlias, signingKeyPass); // Provided by the OAuth1 Signer lib

        client.setBasePath("https://sandbox.api.mastercard.com/mastercom");
        client.setDebugging(true);
        client.setHttpClient(
                client.getHttpClient()
                        .newBuilder()
                        .addInterceptor(new OkHttpOAuth1Interceptor(consumerKey, signingKey)) // Provided by the OAuth1 Signer lib
                        .build()
        );

        QueuesApi queuesApi = new QueuesApi(this.client);
        List<Queue> queues = queuesApi.getQueues();

        for(Queue q:queues){
            log.info("Queue name: {} Queue description: {}",q.getQueueName(),q.getQueueDescription());
        }
        return queues;
    }

    public ChargebackResponse createChargeBackRequest(String claimId,
                                                      CreateChargebackRequest createChargebackRequest) throws UnrecoverableKeyException, CertificateException, IOException, KeyStoreException, NoSuchAlgorithmException, ApiException {

        PrivateKey signingKey = AuthenticationUtils.loadSigningKey(signingKeyFilePath, signingKeyAlias, signingKeyPass); // Provided by the OAuth1 Signer lib

        client.setBasePath("https://sandbox.api.mastercard.com/mastercom");
        client.setDebugging(true);
        client.setHttpClient(
                client.getHttpClient()
                        .newBuilder()
                        .addInterceptor(new OkHttpOAuth1Interceptor(consumerKey, signingKey)) // Provided by the OAuth1 Signer lib
                        .build()
        );

        ChargebacksApi chargebacksApi = new ChargebacksApi(this.client);
        log.info("Creating the charge back request for claimId={}, createChargebackRequest={}",
                claimId,createChargebackRequest);
        return chargebacksApi.createChargeback(claimId, createChargebackRequest);
    }
}
