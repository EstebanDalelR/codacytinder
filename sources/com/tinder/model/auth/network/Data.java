package com.tinder.model.auth.network;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001BA\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u000bJ\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u000eJ\u000b\u0010\u0018\u001a\u0004\u0018\u00010\bHÆ\u0003J\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u000eJ\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003JV\u0010\u001b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u001cJ\u0013\u0010\u001d\u001a\u00020\u00062\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0004¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\u0005\u0010\u000eR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0018\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u001a\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006X\u0004¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\u0012\u0010\u000eR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006\""}, d2 = {"Lcom/tinder/model/auth/network/Data;", "", "onboardingToken", "", "authToken", "isNewUser", "", "smsValidation", "Lcom/tinder/model/auth/network/SmsValidation;", "requiresValidation", "refreshToken", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lcom/tinder/model/auth/network/SmsValidation;Ljava/lang/Boolean;Ljava/lang/String;)V", "getAuthToken", "()Ljava/lang/String;", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getOnboardingToken", "getRefreshToken", "getRequiresValidation", "getSmsValidation", "()Lcom/tinder/model/auth/network/SmsValidation;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lcom/tinder/model/auth/network/SmsValidation;Ljava/lang/Boolean;Ljava/lang/String;)Lcom/tinder/model/auth/network/Data;", "equals", "other", "hashCode", "", "toString", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public final class Data {
    @SerializedName("api_token")
    @Nullable
    private final String authToken;
    @SerializedName("is_new_user")
    @Nullable
    private final Boolean isNewUser;
    @SerializedName("onboarding_token")
    @Nullable
    private final String onboardingToken;
    @SerializedName("refresh_token")
    @Nullable
    private final String refreshToken;
    @SerializedName("requires_validation")
    @Nullable
    private final Boolean requiresValidation;
    @SerializedName("sms_validation")
    @Nullable
    private final SmsValidation smsValidation;

    @NotNull
    public static /* synthetic */ Data copy$default(Data data, String str, String str2, Boolean bool, SmsValidation smsValidation, Boolean bool2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = data.onboardingToken;
        }
        if ((i & 2) != 0) {
            str2 = data.authToken;
        }
        String str4 = str2;
        if ((i & 4) != 0) {
            bool = data.isNewUser;
        }
        Boolean bool3 = bool;
        if ((i & 8) != 0) {
            smsValidation = data.smsValidation;
        }
        SmsValidation smsValidation2 = smsValidation;
        if ((i & 16) != 0) {
            bool2 = data.requiresValidation;
        }
        Boolean bool4 = bool2;
        if ((i & 32) != 0) {
            str3 = data.refreshToken;
        }
        return data.copy(str, str4, bool3, smsValidation2, bool4, str3);
    }

    @Nullable
    public final String component1() {
        return this.onboardingToken;
    }

    @Nullable
    public final String component2() {
        return this.authToken;
    }

    @Nullable
    public final Boolean component3() {
        return this.isNewUser;
    }

    @Nullable
    public final SmsValidation component4() {
        return this.smsValidation;
    }

    @Nullable
    public final Boolean component5() {
        return this.requiresValidation;
    }

    @Nullable
    public final String component6() {
        return this.refreshToken;
    }

    @NotNull
    public final Data copy(@Nullable String str, @Nullable String str2, @Nullable Boolean bool, @Nullable SmsValidation smsValidation, @Nullable Boolean bool2, @Nullable String str3) {
        return new Data(str, str2, bool, smsValidation, bool2, str3);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof Data) {
                Data data = (Data) obj;
                if (C2668g.a(this.onboardingToken, data.onboardingToken) && C2668g.a(this.authToken, data.authToken) && C2668g.a(this.isNewUser, data.isNewUser) && C2668g.a(this.smsValidation, data.smsValidation) && C2668g.a(this.requiresValidation, data.requiresValidation) && C2668g.a(this.refreshToken, data.refreshToken)) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        String str = this.onboardingToken;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.authToken;
        hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        Boolean bool = this.isNewUser;
        hashCode = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        SmsValidation smsValidation = this.smsValidation;
        hashCode = (hashCode + (smsValidation != null ? smsValidation.hashCode() : 0)) * 31;
        bool = this.requiresValidation;
        hashCode = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        str2 = this.refreshToken;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Data(onboardingToken=");
        stringBuilder.append(this.onboardingToken);
        stringBuilder.append(", authToken=");
        stringBuilder.append(this.authToken);
        stringBuilder.append(", isNewUser=");
        stringBuilder.append(this.isNewUser);
        stringBuilder.append(", smsValidation=");
        stringBuilder.append(this.smsValidation);
        stringBuilder.append(", requiresValidation=");
        stringBuilder.append(this.requiresValidation);
        stringBuilder.append(", refreshToken=");
        stringBuilder.append(this.refreshToken);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public Data(@Nullable String str, @Nullable String str2, @Nullable Boolean bool, @Nullable SmsValidation smsValidation, @Nullable Boolean bool2, @Nullable String str3) {
        this.onboardingToken = str;
        this.authToken = str2;
        this.isNewUser = bool;
        this.smsValidation = smsValidation;
        this.requiresValidation = bool2;
        this.refreshToken = str3;
    }

    @Nullable
    public final String getOnboardingToken() {
        return this.onboardingToken;
    }

    @Nullable
    public final String getAuthToken() {
        return this.authToken;
    }

    @Nullable
    public final Boolean isNewUser() {
        return this.isNewUser;
    }

    @Nullable
    public final SmsValidation getSmsValidation() {
        return this.smsValidation;
    }

    @Nullable
    public final Boolean getRequiresValidation() {
        return this.requiresValidation;
    }

    @Nullable
    public final String getRefreshToken() {
        return this.refreshToken;
    }
}
