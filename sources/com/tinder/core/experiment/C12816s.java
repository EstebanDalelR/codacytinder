package com.tinder.core.experiment;

import com.tinder.core.experiment.CanIGetYoEmailExperimentProvider.Variant;
import com.tinder.core.experiment.LeanplumAbTestUtility.UserEndPoint;

/* renamed from: com.tinder.core.experiment.s */
public class C12816s extends LeanplumAbTestUtility {
    /* renamed from: a */
    private final AuthExperiment<Variant> f41223a;

    public boolean isControllaEnabled() {
        return true;
    }

    public boolean isFanVideoAdEnabled() {
        return false;
    }

    public boolean isFeedProfileChangeBioEnabled() {
        return false;
    }

    public boolean isFeedProfileChangeSchoolEnabled() {
        return false;
    }

    public boolean isFeedProfileChangeWorkEnabled() {
        return false;
    }

    public boolean isIntroPricingEnabled() {
        return false;
    }

    public boolean isLoopsCreationEnabled() {
        return false;
    }

    public boolean isLoopsDisplayEnabled() {
        return false;
    }

    public boolean isPhotoPreviewEnabled() {
        return false;
    }

    public C12816s(C8592c c8592c, AuthExperiment<Variant> authExperiment) {
        super(c8592c);
        this.f41223a = authExperiment;
    }

    public AuthExperiment<Variant> authExperiment() {
        return this.f41223a;
    }

    public UserEndPoint getUserEndpoint() {
        return UserEndPoint.META;
    }

    public boolean isOnboardingEmailRequired() {
        return Variant.VARIANT == this.f41223a.m36630d();
    }
}
