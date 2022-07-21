package com.example.sfgopenclosedprincible.with;

/**
 * @Author mehmetali.cetin
 * @Date 2022-07-21
 */
public class ClaimApprovalManager {
    public void processHealthClaim (InsuranceSurveyor surveyor)    {
        if(surveyor.isValidClaim()){
            System.out.println("ClaimApprovalManager: Valid claim. Currently processing claim for approval....");
        }
    }
}
