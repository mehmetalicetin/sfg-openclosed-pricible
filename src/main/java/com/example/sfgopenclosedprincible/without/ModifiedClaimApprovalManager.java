package com.example.sfgopenclosedprincible.without;

/**
 * @Author mehmetali.cetin
 * @Date 2022-07-21
 */
public class ModifiedClaimApprovalManager {
    public void processHealthClaim (HealthInsuranceSurveyor surveyor)    {
        if(surveyor.isValidClaim()){
            System.out.println("ClaimApprovalManager: Valid claim. Currently processing claim for approval....");
        }
    }
    public void processVehicleClaim (VehicleInsuranceSurveyor surveyor)    {
        if(surveyor.isValidClaim()){
            System.out.println("ClaimApprovalManager: Valid claim. Currently processing claim for approval....");
        }
    }
}
