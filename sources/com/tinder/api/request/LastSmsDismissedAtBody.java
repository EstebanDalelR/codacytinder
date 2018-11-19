package com.tinder.api.request;

import com.squareup.moshi.Json;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/tinder/api/request/LastSmsDismissedAtBody;", "", "accountSettings", "Lcom/tinder/api/request/AccountSettings;", "(Lcom/tinder/api/request/AccountSettings;)V", "getAccountSettings", "()Lcom/tinder/api/request/AccountSettings;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "api_release"}, k = 1, mv = {1, 1, 10})
public final class LastSmsDismissedAtBody {
    @NotNull
    private final AccountSettings accountSettings;

    @NotNull
    public static /* synthetic */ LastSmsDismissedAtBody copy$default(LastSmsDismissedAtBody lastSmsDismissedAtBody, AccountSettings accountSettings, int i, Object obj) {
        if ((i & 1) != 0) {
            accountSettings = lastSmsDismissedAtBody.accountSettings;
        }
        return lastSmsDismissedAtBody.copy(accountSettings);
    }

    @NotNull
    public final AccountSettings component1() {
        return this.accountSettings;
    }

    @NotNull
    public final LastSmsDismissedAtBody copy(@NotNull @Json(name = "account_settings") AccountSettings accountSettings) {
        C2668g.b(accountSettings, "accountSettings");
        return new LastSmsDismissedAtBody(accountSettings);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof LastSmsDismissedAtBody) {
                if (C2668g.a(this.accountSettings, ((LastSmsDismissedAtBody) obj).accountSettings)) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        AccountSettings accountSettings = this.accountSettings;
        return accountSettings != null ? accountSettings.hashCode() : 0;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("LastSmsDismissedAtBody(accountSettings=");
        stringBuilder.append(this.accountSettings);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public LastSmsDismissedAtBody(@NotNull @Json(name = "account_settings") AccountSettings accountSettings) {
        C2668g.b(accountSettings, "accountSettings");
        this.accountSettings = accountSettings;
    }

    @NotNull
    public final AccountSettings getAccountSettings() {
        return this.accountSettings;
    }
}
