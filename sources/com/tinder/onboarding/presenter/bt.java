package com.tinder.onboarding.presenter;

import com.tinder.onboarding.model.OnboardingEventCode;
import com.tinder.onboarding.model.OnboardingExperiments;
import com.tinder.onboarding.model.OnboardingUser;
import java.util.HashSet;
import java.util.Set;
import javax.inject.Inject;

class bt {
    /* renamed from: a */
    private final OnboardingExperiments f32814a;

    @Inject
    bt(OnboardingExperiments onboardingExperiments) {
        this.f32814a = onboardingExperiments;
    }

    /* renamed from: a */
    Set<OnboardingEventCode> m40950a(OnboardingUser onboardingUser) {
        Set<OnboardingEventCode> hashSet = new HashSet();
        for (OnboardingEventCode onboardingEventCode : OnboardingEventCode.values()) {
            if (m40949b(onboardingEventCode, onboardingUser)) {
                hashSet.add(onboardingEventCode);
            }
        }
        return hashSet;
    }

    /* renamed from: b */
    Set<OnboardingEventCode> m40951b(OnboardingUser onboardingUser) {
        Set<OnboardingEventCode> hashSet = new HashSet();
        for (OnboardingEventCode onboardingEventCode : OnboardingEventCode.values()) {
            if (m40948a(onboardingEventCode, onboardingUser)) {
                hashSet.add(onboardingEventCode);
            }
        }
        return hashSet;
    }

    /* renamed from: a */
    private boolean m40948a(OnboardingEventCode onboardingEventCode, OnboardingUser onboardingUser) {
        boolean z = true;
        if (C99751.f32813a[onboardingEventCode.ordinal()] != 1) {
            return true;
        }
        if (this.f32814a.isEmailStepRequired() == null) {
            if (((Boolean) onboardingUser.getEmail().a(bu.f39448a).c(Boolean.valueOf(false))).booleanValue() == null) {
                z = false;
            }
        }
        return z;
    }

    /* renamed from: b */
    private boolean m40949b(OnboardingEventCode onboardingEventCode, OnboardingUser onboardingUser) {
        switch (onboardingEventCode) {
            case EMAIL:
                return ((Boolean) onboardingUser.getEmail().a(bv.f39449a).c(Boolean.valueOf(false))).booleanValue();
            case ALLOW_EMAIL_MARKETING:
                return ((Boolean) onboardingUser.getEmail().a(bw.f39450a).c(Boolean.valueOf(false))).booleanValue();
            default:
                return true;
        }
    }
}
