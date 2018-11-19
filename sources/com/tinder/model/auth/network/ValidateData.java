package com.tinder.model.auth.network;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0006J\u001a\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\nJ\u0013\u0010\u000b\u001a\u00020\u00032\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Lcom/tinder/model/auth/network/ValidateData;", "", "shouldReLogin", "", "(Ljava/lang/Boolean;)V", "getShouldReLogin", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "copy", "(Ljava/lang/Boolean;)Lcom/tinder/model/auth/network/ValidateData;", "equals", "other", "hashCode", "", "toString", "", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public final class ValidateData {
    @SerializedName("requires_relogin")
    @Nullable
    private final Boolean shouldReLogin;

    @NotNull
    public static /* synthetic */ ValidateData copy$default(ValidateData validateData, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = validateData.shouldReLogin;
        }
        return validateData.copy(bool);
    }

    @Nullable
    public final Boolean component1() {
        return this.shouldReLogin;
    }

    @NotNull
    public final ValidateData copy(@Nullable Boolean bool) {
        return new ValidateData(bool);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ValidateData) {
                if (C2668g.a(this.shouldReLogin, ((ValidateData) obj).shouldReLogin)) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        Boolean bool = this.shouldReLogin;
        return bool != null ? bool.hashCode() : 0;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("ValidateData(shouldReLogin=");
        stringBuilder.append(this.shouldReLogin);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public ValidateData(@Nullable Boolean bool) {
        this.shouldReLogin = bool;
    }

    @Nullable
    public final Boolean getShouldReLogin() {
        return this.shouldReLogin;
    }
}
