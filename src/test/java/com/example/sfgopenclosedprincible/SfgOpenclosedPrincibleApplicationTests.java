package com.example.sfgopenclosedprincible;

import com.example.sfgopenclosedprincible.with.ClaimApprovalManager;
import com.example.sfgopenclosedprincible.with.HealthInsuranceSurveyor;
import com.example.sfgopenclosedprincible.with.InsuranceSurveyor;
import com.example.sfgopenclosedprincible.with.VehicleInsuranceSurveyor;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SfgOpenclosedPrincibleApplicationTests {

    @Test
    void contextLoads() {
        InsuranceSurveyor insuranceSurveyor = new HealthInsuranceSurveyor();
        ClaimApprovalManager claimApprovalManager = new ClaimApprovalManager();
        claimApprovalManager.processHealthClaim(insuranceSurveyor);

        InsuranceSurveyor insuranceSurveyor2 = new VehicleInsuranceSurveyor();
        ClaimApprovalManager claimApprovalManager2 = new ClaimApprovalManager();
        claimApprovalManager.processHealthClaim(insuranceSurveyor2);
    }

}
