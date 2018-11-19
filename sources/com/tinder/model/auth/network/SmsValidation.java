package com.tinder.model.auth.network;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u0010\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0006J\u0010\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0006J&\u0010\n\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u000bJ\u0013\u0010\f\u001a\u00020\u00032\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0004\u0010\u0006R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0002\u0010\u0006¨\u0006\u0012"}, d2 = {"Lcom/tinder/model/auth/network/SmsValidation;", "", "isRequired", "", "isDismissible", "(Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "copy", "(Ljava/lang/Boolean;Ljava/lang/Boolean;)Lcom/tinder/model/auth/network/SmsValidation;", "equals", "other", "hashCode", "", "toString", "", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public final class SmsValidation {
    @SerializedName("dismissible")
    @Nullable
    private final Boolean isDismissible;
    @SerializedName("required")
    @Nullable
    private final Boolean isRequired;

    @NotNull
    public static /* synthetic */ SmsValidation copy$default(SmsValidation smsValidation, Boolean bool, Boolean bool2, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = smsValidation.isRequired;
        }
        if ((i & 2) != 0) {
            bool2 = smsValidation.isDismissible;
        }
        return smsValidation.copy(bool, bool2);
    }

    @Nullable
    public final Boolean component1() {
        return this.isRequired;
    }

    @Nullable
    public final Boolean component2() {
        return this.isDismissible;
    }

    @NotNull
    public final SmsValidation copy(@Nullable Boolean bool, @Nullable Boolean bool2) {
        return new SmsValidation(bool, bool2);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof SmsValidation) {
                SmsValidation smsValidation = (SmsValidation) obj;
                if (C2668g.a(this.isRequired, smsValidation.isRequired) && C2668g.a(this.isDismissible, smsValidation.isDismissible)) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        Boolean bool = this.isRequired;
        int i = 0;
        int hashCode = (bool != null ? bool.hashCode() : 0) * 31;
        Boolean bool2 = this.isDismissible;
        if (bool2 != null) {
            i = bool2.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("SmsValidation(isRequired=");
        stringBuilder.append(this.isRequired);
        stringBuilder.append(", isDismissible=");
        stringBuilder.append(this.isDismissible);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public SmsValidation(@Nullable Boolean bool, @Nullable Boolean bool2) {
        this.isRequired = bool;
        this.isDismissible = bool2;
    }

    @Nullable
    public final Boolean isRequired() {
        return this.isRequired;
    }

    @Nullable
    public final Boolean isDismissible() {
        return this.isDismissible;
    }
}
