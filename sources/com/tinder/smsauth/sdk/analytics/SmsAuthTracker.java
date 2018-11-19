package com.tinder.smsauth.sdk.analytics;

import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\f\bf\u0018\u00002\u00020\u0001J\b\u0010\b\u001a\u00020\tH&J\b\u0010\n\u001a\u00020\tH&J\b\u0010\u000b\u001a\u00020\tH&J\b\u0010\f\u001a\u00020\tH&J\b\u0010\r\u001a\u00020\tH&J\b\u0010\u000e\u001a\u00020\tH&J\b\u0010\u000f\u001a\u00020\tH&J\b\u0010\u0010\u001a\u00020\tH&J\b\u0010\u0011\u001a\u00020\tH&J\b\u0010\u0012\u001a\u00020\tH&J\b\u0010\u0013\u001a\u00020\tH&J\b\u0010\u0014\u001a\u00020\tH&R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007¨\u0006\u0015"}, d2 = {"Lcom/tinder/smsauth/sdk/analytics/SmsAuthTracker;", "", "regionCode", "", "getRegionCode", "()Ljava/lang/String;", "setRegionCode", "(Ljava/lang/String;)V", "fireCountryListViewed", "", "fireCountrySelected", "fireEnterPhoneNumberAutoFill", "fireEnterPhoneNumberSuccess", "fireOneTimePasswordAutoFill", "fireOneTimePasswordError", "fireOneTimePasswordResendSms", "fireOneTimePasswordResendVoice", "fireOneTimePasswordSuccess", "fireOneTimePasswordViewed", "firePhoneNumberErrorEvent", "firePhoneNumberViewed", "sdk_release"}, k = 1, mv = {1, 1, 10})
public interface SmsAuthTracker {
    void fireCountryListViewed();

    void fireCountrySelected();

    void fireEnterPhoneNumberAutoFill();

    void fireEnterPhoneNumberSuccess();

    void fireOneTimePasswordAutoFill();

    void fireOneTimePasswordError();

    void fireOneTimePasswordResendSms();

    void fireOneTimePasswordResendVoice();

    void fireOneTimePasswordSuccess();

    void fireOneTimePasswordViewed();

    void firePhoneNumberErrorEvent();

    void firePhoneNumberViewed();

    @Nullable
    String getRegionCode();

    void setRegionCode(@Nullable String str);
}
