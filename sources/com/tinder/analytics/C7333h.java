package com.tinder.analytics;

import com.tinder.analytics.fireworks.C2630h;
import com.tinder.api.ManagerWebServices;
import com.tinder.etl.event.bm;
import com.tinder.smsauth.sdk.analytics.SmsAuthTracker;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0002J\b\u0010\u000f\u001a\u00020\fH\u0016J\b\u0010\u0010\u001a\u00020\fH\u0016J\b\u0010\u0011\u001a\u00020\fH\u0016J\b\u0010\u0012\u001a\u00020\fH\u0016J\b\u0010\u0013\u001a\u00020\fH\u0016J\b\u0010\u0014\u001a\u00020\fH\u0016J\b\u0010\u0015\u001a\u00020\fH\u0016J\b\u0010\u0016\u001a\u00020\fH\u0016J\b\u0010\u0017\u001a\u00020\fH\u0016J\b\u0010\u0018\u001a\u00020\fH\u0016J\b\u0010\u0019\u001a\u00020\fH\u0016J\b\u0010\u001a\u001a\u00020\fH\u0016J\b\u0010\u001b\u001a\u00020\u0006H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\u001d"}, d2 = {"Lcom/tinder/analytics/FireworksSmsAuthTracker;", "Lcom/tinder/smsauth/sdk/analytics/SmsAuthTracker;", "fireworks", "Lcom/tinder/analytics/fireworks/Fireworks;", "(Lcom/tinder/analytics/fireworks/Fireworks;)V", "regionCode", "", "getRegionCode", "()Ljava/lang/String;", "setRegionCode", "(Ljava/lang/String;)V", "fire", "", "event", "Lcom/tinder/etl/event/AuthVerifySMSEvent;", "fireCountryListViewed", "fireCountrySelected", "fireEnterPhoneNumberAutoFill", "fireEnterPhoneNumberSuccess", "fireOneTimePasswordAutoFill", "fireOneTimePasswordError", "fireOneTimePasswordResendSms", "fireOneTimePasswordResendVoice", "fireOneTimePasswordSuccess", "fireOneTimePasswordViewed", "firePhoneNumberErrorEvent", "firePhoneNumberViewed", "reason", "Companion", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.analytics.h */
public final class C7333h implements SmsAuthTracker {
    /* renamed from: a */
    public static final C6232a f26488a = new C6232a();
    @Nullable
    /* renamed from: b */
    private String f26489b;
    /* renamed from: c */
    private final C2630h f26490c;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/tinder/analytics/FireworksSmsAuthTracker$Companion;", "", "()V", "ACTION_AUTO_FILL", "", "ACTION_SUBMIT", "ACTION_VIEW", "REASON_AUTH", "REASON_LINK", "REASON_VALIDATE", "STEP_ENTER_ONE_TIME_PASSWORD", "STEP_ENTER_PHONE_NUMBER", "STEP_ERROR", "STEP_RESEND_ONE_TIME_PASSWORD", "STEP_SELECT_COUNTRY", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.analytics.h$a */
    public static final class C6232a {
        private C6232a() {
        }
    }

    /* renamed from: a */
    private final String m31296a() {
        return "auth";
    }

    @Inject
    public C7333h(@NotNull C2630h c2630h) {
        C2668g.b(c2630h, "fireworks");
        this.f26490c = c2630h;
    }

    @Nullable
    public String getRegionCode() {
        return this.f26489b;
    }

    public void setRegionCode(@Nullable String str) {
        this.f26489b = str;
    }

    public void firePhoneNumberViewed() {
        m31297a(bm.a().a("enterPhoneNumber").c("view").a(Integer.valueOf(0)).d(m31296a()).e(getRegionCode()).a());
    }

    public void fireEnterPhoneNumberAutoFill() {
        m31297a(bm.a().a("enterPhoneNumber").c("autofill").a(Integer.valueOf(1)).d(m31296a()).e(getRegionCode()).a());
    }

    public void fireEnterPhoneNumberSuccess() {
        m31297a(bm.a().a("enterPhoneNumber").c("submit").a(Integer.valueOf(1)).d(m31296a()).e(getRegionCode()).a());
    }

    public void firePhoneNumberErrorEvent() {
        C7333h c7333h = this;
        m31297a(bm.a().a("enterPhoneNumber").c("submit").a(Integer.valueOf(0)).d(m31296a()).e(getRegionCode()).a());
        m31297a(bm.a().a("error").c("view").b("phone").a(Integer.valueOf(0)).d(m31296a()).e(getRegionCode()).a());
    }

    public void fireCountryListViewed() {
        m31297a(bm.a().a("selectCountry").c("view").a(Integer.valueOf(0)).d(m31296a()).e(getRegionCode()).a());
    }

    public void fireCountrySelected() {
        m31297a(bm.a().a("selectCountry").c("submit").a(Integer.valueOf(1)).d(m31296a()).e(getRegionCode()).a());
    }

    public void fireOneTimePasswordViewed() {
        m31297a(bm.a().a("enterOTP").c("view").a(Integer.valueOf(0)).d(m31296a()).e(getRegionCode()).a());
    }

    public void fireOneTimePasswordAutoFill() {
        m31297a(bm.a().a("enterOTP").c("autofill").a(Integer.valueOf(1)).d(m31296a()).e(getRegionCode()).a());
    }

    public void fireOneTimePasswordResendSms() {
        m31297a(bm.a().a("resendOTP").b(ManagerWebServices.PARAM_TEXT).c("submit").a(Integer.valueOf(1)).d(m31296a()).e(getRegionCode()).a());
    }

    public void fireOneTimePasswordResendVoice() {
        m31297a(bm.a().a("resendOTP").b("voice").c("submit").a(Integer.valueOf(1)).d(m31296a()).e(getRegionCode()).a());
    }

    public void fireOneTimePasswordSuccess() {
        m31297a(bm.a().a("enterOTP").c("submit").a(Integer.valueOf(1)).d(m31296a()).e(getRegionCode()).a());
    }

    public void fireOneTimePasswordError() {
        C7333h c7333h = this;
        m31297a(bm.a().a("enterOTP").c("submit").a(Integer.valueOf(0)).d(m31296a()).e(getRegionCode()).a());
        m31297a(bm.a().a("error").b("otp").c("view").a(Integer.valueOf(0)).d(m31296a()).e(getRegionCode()).a());
    }

    /* renamed from: a */
    private final void m31297a(bm bmVar) {
        this.f26490c.a(bmVar);
    }
}
