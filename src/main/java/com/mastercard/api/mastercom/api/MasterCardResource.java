package com.mastercard.api.mastercom.api;

import com.mastercard.api.mastercom.model.ChargebackResponse;
import com.mastercard.api.mastercom.model.CreateChargebackRequest;
import com.mastercard.api.mastercom.model.Queue;
import com.mastercard.api.mastercom.service.MasterCardService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@Slf4j
@AllArgsConstructor
public class MasterCardResource {

    private final MasterCardService masterCardService;

    @GetMapping(value = "/v1/queues")
    ResponseEntity<List<Queue>> getQueues(){
        return ResponseEntity.ok(masterCardService.getQueues());
    }

    @PostMapping(value = "/v1/chargeBacks/{claimId}")
    ResponseEntity<ChargebackResponse> createChargeBack(@PathVariable(name = "claimId") String claimId,
                                                        @RequestBody CreateChargebackRequest createChargebackRequest){

        return ResponseEntity.ok(masterCardService
                .createChargeBackRequest(claimId, createChargebackRequest));
    }
}

