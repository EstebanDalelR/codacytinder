package com.tinder.smsauth.sdk.analytics;

import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\f\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\t\u001a\u00020\nH\u0016J\b\u0010\u000b\u001a\u00020\nH\u0016J\b\u0010\f\u001a\u00020\nH\u0016J\b\u0010\r\u001a\u00020\nH\u0016J\b\u0010\u000e\u001a\u00020\nH\u0016J\b\u0010\u000f\u001a\u00020\nH\u0016J\b\u0010\u0010\u001a\u00020\nH\u0016J\b\u0010\u0011\u001a\u00020\nH\u0016J\b\u0010\u0012\u001a\u00020\nH\u0016J\b\u0010\u0013\u001a\u00020\nH\u0016J\b\u0010\u0014\u001a\u00020\nH\u0016J\b\u0010\u0015\u001a\u00020\nH\u0016R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\u0016"}, d2 = {"Lcom/tinder/smsauth/sdk/analytics/EmptySmsAuthTracker;", "Lcom/tinder/smsauth/sdk/analytics/SmsAuthTracker;", "()V", "regionCode", "", "getRegionCode", "()Ljava/lang/String;", "setRegionCode", "(Ljava/lang/String;)V", "fireCountryListViewed", "", "fireCountrySelected", "fireEnterPhoneNumberAutoFill", "fireEnterPhoneNumberSuccess", "fireOneTimePasswordAutoFill", "fireOneTimePasswordError", "fireOneTimePasswordResendSms", "fireOneTimePasswordResendVoice", "fireOneTimePasswordSuccess", "fireOneTimePasswordViewed", "firePhoneNumberErrorEvent", "firePhoneNumberViewed", "sdk_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.smsauth.sdk.analytics.a */
public final class C16753a implements SmsAuthTracker {
    @Nullable
    /* renamed from: a */
    private String f51766a;

    public void fireCountryListViewed() {
    }

    public void fireCountrySelected() {
    }

    public void fireEnterPhoneNumberAutoFill() {
    }

    public void fireEnterPhoneNumberSuccess() {
    }

    public void fireOneTimePasswordAutoFill() {
    }

    public void fireOneTimePasswordError() {
    }

    public void fireOneTimePasswordResendSms() {
    }

    public void fireOneTimePasswordResendVoice() {
    }

    public void fireOneTimePasswordSuccess() {
    }

    public void fireOneTimePasswordViewed() {
    }

    public void firePhoneNumberErrorEvent() {
    }

    public void firePhoneNumberViewed() {
    }

    @Nullable
    public String getRegionCode() {
        return this.f51766a;
    }

    public void setRegionCode(@Nullable String str) {
        this.f51766a = str;
    }
}
