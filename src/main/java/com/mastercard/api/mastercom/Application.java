package com.mastercard.api.mastercom;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}

//curl : curl --location 'http://localhost:8080/v1/queues'

//curl --location 'http://localhost:8080/v1/chargeBacks/200002020654' \
//        --header 'Content-Type: application/json' \
//        --data '{
//        "amount": "100.00",
//        "chargebackType": "CHARGEBACK",
//        "currency": "USD",
//        "documentIndicator": "false",
//        "reasonCode": "4853",
//        "credPostedAsPurchase": false,
//        "isPartialChargeback": false,
//        "messageText": "This is a test message text",
//        "settlementDate": "2024-03-22",
//        "disputeChargebackID" : "id-1",
//        "localTax1IVA": "0.60",
//        "installmentFee": 1.2,
//        "editExclusionCode": "BO",
//        "refundNotReceivedIndicator": "true",
//        "includeCurrencyConversionAssessmentCCA": "true"
//        }'