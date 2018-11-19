package com.tinder.auth.interactor;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.facebook.accountkit.ui.LoginFlowState;
import com.tinder.api.ManagerWebServices;
import com.tinder.auth.model.AuthAnalyticsConstants.Value.AuthFrom;
import com.tinder.auth.model.AuthAnalyticsConstants.Value.LocationPermissionType;
import com.tinder.auth.model.AuthType;
import com.tinder.auth.repository.AuthSessionRepository;
import com.tinder.common.p077b.C8524b;
import com.tinder.common.repository.C10698c;
import com.tinder.core.experiment.AbTestUtility;
import com.tinder.core.experiment.AuthExperiment;
import com.tinder.core.experiment.CanIGetYoEmailExperimentProvider.Variant;
import com.tinder.managers.ManagerAnalytics;
import com.tinder.managers.bk;
import com.tinder.model.SparksEvent;
import com.tinder.model.analytics.AnalyticsConstants;
import com.tinder.model.auth.LogoutFrom;
import com.tinder.onboarding.interactor.OnboardingAnalyticsInteractor;
import com.tinder.onboarding.model.OnboardingEventCode;
import com.tinder.utils.ab;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import javax.inject.Inject;

/* renamed from: com.tinder.auth.interactor.h */
public class C10333h implements OnboardingAnalyticsInteractor {
    @NonNull
    /* renamed from: a */
    private final ManagerAnalytics f33744a;
    @NonNull
    /* renamed from: b */
    private final AbTestUtility f33745b;
    @NonNull
    /* renamed from: c */
    private final AuthSessionRepository f33746c;
    @NonNull
    /* renamed from: d */
    private final bk f33747d;
    @NonNull
    /* renamed from: e */
    private final Map<OnboardingEventCode, Integer> f33748e = new HashMap(OnboardingEventCode.values().length);
    @NonNull
    /* renamed from: f */
    private final Map<OnboardingEventCode, Integer> f33749f = new HashMap(OnboardingEventCode.values().length);
    @NonNull
    /* renamed from: g */
    private Set<OnboardingEventCode> f33750g = C8524b.m36481a(OnboardingEventCode.values());
    @NonNull
    /* renamed from: h */
    private Set<OnboardingEventCode> f33751h = C8524b.m36481a(OnboardingEventCode.values());

    /* renamed from: com.tinder.auth.interactor.h$1 */
    static /* synthetic */ class C82781 {
        /* renamed from: a */
        static final /* synthetic */ int[] f29527a = new int[AuthType.values().length];

        static {
            /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
            /*
            r0 = com.tinder.auth.model.AuthType.values();
            r0 = r0.length;
            r0 = new int[r0];
            f29527a = r0;
            r0 = f29527a;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = com.tinder.auth.model.AuthType.FACEBOOK;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0014 }
            r2 = 1;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0014 }
        L_0x0014:
            r0 = f29527a;	 Catch:{ NoSuchFieldError -> 0x001f }
            r1 = com.tinder.auth.model.AuthType.ACCOUNTKIT;	 Catch:{ NoSuchFieldError -> 0x001f }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x001f }
            r2 = 2;	 Catch:{ NoSuchFieldError -> 0x001f }
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x001f }
        L_0x001f:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tinder.auth.interactor.h.1.<clinit>():void");
        }
    }

    @Inject
    public C10333h(@NonNull ManagerAnalytics managerAnalytics, @NonNull AbTestUtility abTestUtility, @NonNull AuthSessionRepository authSessionRepository, @NonNull bk bkVar) {
        this.f33744a = managerAnalytics;
        this.f33745b = abTestUtility;
        this.f33746c = authSessionRepository;
        this.f33747d = bkVar;
    }

    public void setRequiredFields(@NonNull Set<OnboardingEventCode> set) {
        this.f33750g = set;
    }

    public void setEditableFields(@NonNull Set<OnboardingEventCode> set) {
        this.f33751h = set;
    }

    /* renamed from: a */
    public void m42125a(int i) {
        SparksEvent sparksEvent = new SparksEvent("Account.TermsOfService");
        sparksEvent.put(ManagerWebServices.PARAM_FROM, i);
        m42114a(sparksEvent);
    }

    /* renamed from: b */
    public void m42136b(int i) {
        SparksEvent sparksEvent = new SparksEvent("Account.PrivacyPolicy");
        sparksEvent.put(ManagerWebServices.PARAM_FROM, i);
        m42114a(sparksEvent);
    }

    /* renamed from: a */
    public void m42124a() {
        m42114a(new SparksEvent("Account.FacebookPolicy"));
    }

    /* renamed from: b */
    public void m42135b() {
        m42114a(new SparksEvent("Auth.NonFacebook"));
    }

    /* renamed from: c */
    public void m42138c() {
        SparksEvent sparksEvent = new SparksEvent("Auth.Facebook");
        sparksEvent.put("variant", AnalyticsConstants.VALUE_ACCOUNTKIT);
        m42114a(sparksEvent);
    }

    /* renamed from: d */
    public void m42141d() {
        AuthExperiment authExperiment = this.f33745b.authExperiment();
        if (authExperiment != null) {
            if (!authExperiment.m36629c()) {
                SparksEvent sparksEvent = new SparksEvent("Auth.Experiment");
                sparksEvent.put("variant", ((Variant) authExperiment.m36630d()).getAnalyticsName());
                m42114a(sparksEvent);
            }
        }
    }

    /* renamed from: a */
    public void m42131a(@NonNull AuthType authType, @NonNull AuthFrom authFrom) {
        SparksEvent sparksEvent = new SparksEvent("Auth.Start");
        sparksEvent.put("method", authType.getKey());
        sparksEvent.put("authFrom", authFrom.getValue());
        sparksEvent.put("hasPreviouslyLoggedIn", this.f33746c.authSession().mo9233a());
        m42114a(sparksEvent);
    }

    /* renamed from: a */
    public void m42132a(@NonNull AuthType authType, boolean z) {
        SparksEvent sparksEvent = new SparksEvent("Auth.Success");
        sparksEvent.put("method", authType.getKey());
        sparksEvent.put("isNewUser", z);
        sparksEvent.put("hasPreviouslyLoggedIn", this.f33746c.authSession().mo9233a());
        this.f33746c.saveUserHasPreviouslyLoggedIn();
        m42114a(sparksEvent);
    }

    /* renamed from: a */
    public void m42127a(@NonNull AuthType authType) {
        SparksEvent sparksEvent = new SparksEvent("OAuth.PresentUI");
        sparksEvent.put("method", authType.getKey());
        m42114a(sparksEvent);
    }

    /* renamed from: b */
    public void m42137b(@NonNull AuthType authType) {
        SparksEvent sparksEvent = new SparksEvent("OAuth.Success");
        sparksEvent.put("method", authType.getKey());
        m42114a(sparksEvent);
    }

    /* renamed from: c */
    public void m42140c(@NonNull AuthType authType) {
        m42128a(authType, -1);
    }

    /* renamed from: a */
    public void m42128a(@NonNull AuthType authType, int i) {
        SparksEvent sparksEvent = new SparksEvent("OAuth.Error");
        sparksEvent.put("method", authType.getKey());
        sparksEvent.put("errorCode", i);
        m42114a(sparksEvent);
    }

    /* renamed from: d */
    public void m42142d(@NonNull AuthType authType) {
        SparksEvent sparksEvent = new SparksEvent("OAuth.Cancel");
        sparksEvent.put("method", authType.getKey());
        m42114a(sparksEvent);
    }

    /* renamed from: e */
    public void m42144e(@NonNull AuthType authType) {
        SparksEvent sparksEvent = new SparksEvent("Login.Start");
        sparksEvent.put("method", authType.getKey());
        sparksEvent.put("hasPreviouslyLoggedIn", this.f33746c.authSession().mo9233a());
        m42114a(sparksEvent);
    }

    /* renamed from: a */
    public void m42130a(@NonNull AuthType authType, long j, boolean z) {
        SparksEvent sparksEvent = new SparksEvent("Login.Success");
        sparksEvent.put("method", authType.getKey());
        sparksEvent.put("timeElapsed", j);
        sparksEvent.put("isNewUser", z);
        sparksEvent.put("hasPreviouslyLoggedIn", this.f33746c.authSession().mo9233a());
        m42114a(sparksEvent);
    }

    /* renamed from: a */
    public void m42129a(@NonNull AuthType authType, int i, @NonNull Class<? extends Throwable> cls) {
        SparksEvent sparksEvent = new SparksEvent("Login.Error");
        sparksEvent.put("method", authType.getKey());
        sparksEvent.put("errorCode", i);
        sparksEvent.put("errorName", cls.getSimpleName());
        sparksEvent.put("hasCachedAuthToken", TextUtils.isEmpty(C10698c.m43017a()) ^ 1);
        m42114a(sparksEvent);
    }

    /* renamed from: a */
    public void m42133a(@NonNull LogoutFrom logoutFrom) {
        SparksEvent sparksEvent = new SparksEvent("Logout.Start");
        sparksEvent.put("method", logoutFrom.getAnalyticsValue());
        m42114a(sparksEvent);
    }

    /* renamed from: e */
    public void m42143e() {
        m42114a(new SparksEvent("Logout.Success"));
    }

    /* renamed from: f */
    public void m42145f() {
        m42114a(new SparksEvent("Device"));
    }

    /* renamed from: a */
    public void m42126a(@NonNull LoginFlowState loginFlowState) {
        SparksEvent sparksEvent = new SparksEvent("AccountKit.View");
        sparksEvent.put("eventCode", loginFlowState.ordinal());
        m42114a(sparksEvent);
    }

    /* renamed from: g */
    public void m42146g() {
        m42114a(new SparksEvent("Account.Intro"));
    }

    /* renamed from: c */
    public void m42139c(int i) {
        SparksEvent sparksEvent = new SparksEvent("Account.IntroFeatureView");
        sparksEvent.put("position", i);
        m42114a(sparksEvent);
    }

    /* renamed from: h */
    public void m42147h() {
        SparksEvent sparksEvent = new SparksEvent("Account.PermissionPrompt");
        sparksEvent.put("type", "location");
        m42114a(sparksEvent);
    }

    /* renamed from: a */
    public void m42134a(boolean z) {
        int value;
        SparksEvent sparksEvent = new SparksEvent("Account.PermissionGrant");
        String str = "locationPermission";
        if (z) {
            value = LocationPermissionType.ALWAYS.getValue();
        } else {
            value = LocationPermissionType.NEVER.getValue();
        }
        sparksEvent.put(str, value);
        m42114a(sparksEvent);
    }

    /* renamed from: i */
    public void m42148i() {
        m42114a(new SparksEvent("AgeGenderVerification.View"));
    }

    /* renamed from: j */
    public void m42149j() {
        m42114a(new SparksEvent("AgeGenderVerification.Cancel"));
    }

    public void fireOnboardingViewEvent(@NonNull OnboardingEventCode onboardingEventCode) {
        fireOnboardingViewEvent(onboardingEventCode, null);
    }

    public void fireOnboardingViewEvent(@NonNull OnboardingEventCode onboardingEventCode, @Nullable String str) {
        SparksEvent sparksEvent = new SparksEvent("Onboarding.Event");
        sparksEvent.put("eventCode", onboardingEventCode.getValue());
        sparksEvent.put("attemptNum", m42118b(onboardingEventCode));
        m42115a(onboardingEventCode);
        sparksEvent.put("required", m42121e(onboardingEventCode));
        sparksEvent.put("editable", m42122f(onboardingEventCode));
        sparksEvent.put("action", "view");
        sparksEvent.put("status", 0);
        if (str != null) {
            sparksEvent.put("eventValue", str);
        }
        sparksEvent.put("eventVersion", m42123k());
        m42114a(sparksEvent);
    }

    public void fireOnboardingSubmitEvent(@NonNull OnboardingEventCode onboardingEventCode, @Nullable String str, boolean z) {
        m42116a(onboardingEventCode, "submit", str, z);
    }

    public void fireOnboardingSkipEvent(@NonNull OnboardingEventCode onboardingEventCode, boolean z) {
        m42116a(onboardingEventCode, "skip", null, z);
    }

    public void fireOnboardingSmsCancelEvent(boolean z) {
        m42117a(OnboardingEventCode.SMS_CONFIRM, z);
    }

    public void fireOnboardingCancelEvent(boolean z) {
        m42117a(OnboardingEventCode.NAME, z);
    }

    /* renamed from: a */
    private void m42117a(OnboardingEventCode onboardingEventCode, boolean z) {
        SparksEvent sparksEvent = new SparksEvent("Onboarding.Event");
        sparksEvent.put("eventCode", onboardingEventCode.getValue());
        sparksEvent.put("status", (int) z);
        sparksEvent.put("required", m42121e(onboardingEventCode));
        sparksEvent.put("eventVersion", m42123k());
        sparksEvent.put("action", "cancel");
        m42114a(sparksEvent);
    }

    public void fireOnboardingErrorEvent(int i) {
        SparksEvent sparksEvent = new SparksEvent("Onboarding.Error");
        sparksEvent.put("errorCode", i);
        sparksEvent.put("eventVersion", m42123k());
        m42114a(sparksEvent);
    }

    public void fireOnboardingJsonUnparsableError(@Nullable String str) {
        SparksEvent sparksEvent = new SparksEvent("Onboarding.Error");
        sparksEvent.put("errorCode", 0);
        if (str != null) {
            sparksEvent.put("unparsableError", str);
        }
        m42114a(sparksEvent);
    }

    public void fireOnboardingAgeGateEvent(int i) {
        i = ((int) Math.ceil((double) (((float) i) / 1119092736))) * 90;
        SparksEvent sparksEvent = new SparksEvent("Auth.AgeGate");
        sparksEvent.put("daysLeft", i);
        m42114a(sparksEvent);
    }

    /* renamed from: a */
    private void m42114a(@NonNull SparksEvent sparksEvent) {
        sparksEvent.put("version", "authV2");
        sparksEvent.put("localeCountry", ab.b());
        this.f33744a.m40477a(sparksEvent);
    }

    /* renamed from: a */
    private void m42116a(@NonNull OnboardingEventCode onboardingEventCode, @NonNull String str, @Nullable String str2, boolean z) {
        SparksEvent sparksEvent = new SparksEvent("Onboarding.Event");
        sparksEvent.put("eventCode", onboardingEventCode.getValue());
        if (str2 != null) {
            sparksEvent.put("eventValue", str2);
        }
        sparksEvent.put("attemptNum", m42120d(onboardingEventCode));
        m42119c(onboardingEventCode);
        sparksEvent.put("status", (int) z);
        sparksEvent.put("required", m42121e(onboardingEventCode));
        sparksEvent.put("action", str);
        sparksEvent.put("eventVersion", m42123k());
        m42114a(sparksEvent);
    }

    /* renamed from: a */
    private void m42115a(@NonNull OnboardingEventCode onboardingEventCode) {
        this.f33748e.put(onboardingEventCode, Integer.valueOf(((Integer) this.f33748e.get(onboardingEventCode)).intValue() + 1));
    }

    /* renamed from: k */
    private int m42123k() {
        AuthType aa = this.f33747d.aa();
        if (aa != null) {
            switch (C82781.f29527a[aa.ordinal()]) {
                case 1:
                    return 2;
                case 2:
                    return 1;
                default:
                    break;
            }
        }
        return -1;
    }

    /* renamed from: b */
    private int m42118b(@NonNull OnboardingEventCode onboardingEventCode) {
        Integer num = (Integer) this.f33748e.get(onboardingEventCode);
        if (num != null) {
            return num.intValue();
        }
        this.f33748e.put(onboardingEventCode, Integer.valueOf(0));
        return 0;
    }

    /* renamed from: c */
    private void m42119c(@NonNull OnboardingEventCode onboardingEventCode) {
        this.f33749f.put(onboardingEventCode, Integer.valueOf(((Integer) this.f33749f.get(onboardingEventCode)).intValue() + 1));
    }

    /* renamed from: d */
    private int m42120d(@NonNull OnboardingEventCode onboardingEventCode) {
        Integer num = (Integer) this.f33749f.get(onboardingEventCode);
        if (num != null) {
            return num.intValue();
        }
        this.f33749f.put(onboardingEventCode, Integer.valueOf(0));
        return 0;
    }

    /* renamed from: e */
    private boolean m42121e(OnboardingEventCode onboardingEventCode) {
        return this.f33750g.contains(onboardingEventCode);
    }

    /* renamed from: f */
    private boolean m42122f(OnboardingEventCode onboardingEventCode) {
        return this.f33751h.contains(onboardingEventCode);
    }
}
