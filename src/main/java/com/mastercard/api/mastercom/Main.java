//package com.mastercard.api.mastercom;
//
//import com.mastercard.api.mastercom.api.QueuesApi;
//import com.mastercard.api.mastercom.model.Queue;
//import com.mastercard.developer.interceptors.OkHttpOAuth1Interceptor;
//import com.mastercard.developer.utils.AuthenticationUtils;
//
//import java.io.IOException;
//import java.security.KeyStoreException;
//import java.security.NoSuchAlgorithmException;
//import java.security.PrivateKey;
//import java.security.UnrecoverableKeyException;
//import java.security.cert.CertificateException;
//import java.util.List;
//
//public class Main {
//    public static void main(String[] args) throws UnrecoverableKeyException, CertificateException, IOException, KeyStoreException, NoSuchAlgorithmException, ApiException {
//        String consumerKey = "7AfIn4N-l_5T_DrIGww-KhCDjpT7mWumEUvpUy6F253f709d!c826141e16054850bc0fc49fca0307080000000000000000";
//        String signingKeyFilePath = "src/main/resources/picklu123-SANDBOX.p12";
//        String signingKeyAlias = "picklu123";
//        String signingKeyPass = "picklu123";
//
//        PrivateKey signingKey = AuthenticationUtils.loadSigningKey(signingKeyFilePath, signingKeyAlias, signingKeyPass); // Provided by the OAuth1 Signer lib
//
//        ApiClient client = new ApiClient();
//        client.setBasePath("https://sandbox.api.mastercard.com/mastercom");
//        client.setDebugging(true);
//
//        client.setHttpClient(
//                client.getHttpClient()
//                        .newBuilder()
//                        .addInterceptor(new OkHttpOAuth1Interceptor(consumerKey, signingKey)) // Provided by the OAuth1 Signer lib
//                        .build()
//        );
//
//        QueuesApi queuesApi = new QueuesApi(client);
//        List<Queue> queues = queuesApi.getQueues();
//
//        for(Queue q:queues){
//            System.out.println("Queue name: "+q.getQueueName()+" Queue description: "+ q.getQueueDescription());
//        }
//        System.out.println("Hello world!");
//    }
//}