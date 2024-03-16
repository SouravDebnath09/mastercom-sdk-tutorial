package com.mastercard.api.mastercom.service;

import com.mastercard.api.mastercom.client.MasterCardClient;
import com.mastercard.api.mastercom.model.ChargebackResponse;
import com.mastercard.api.mastercom.model.CreateChargebackRequest;
import com.mastercard.api.mastercom.model.Queue;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
@AllArgsConstructor
@Slf4j
public class MasterCardService {

    private final MasterCardClient masterCardClient;
    public List<Queue> getQueues(){
        try {
            return masterCardClient.getQueues();
        }
        catch (Exception e){
            log.error("Exception occurred ", e.getCause());
            e.printStackTrace();
        }
        return new ArrayList<>();
    }

    public ChargebackResponse createChargeBackRequest(String claimId, CreateChargebackRequest createChargebackRequest) {

        try {
            return masterCardClient.createChargeBackRequest(claimId, createChargebackRequest);
        }
        catch (Exception e){
            log.error("Exception occurred : ", e.getCause());
            e.printStackTrace();
        }
        return null;
    }
}
