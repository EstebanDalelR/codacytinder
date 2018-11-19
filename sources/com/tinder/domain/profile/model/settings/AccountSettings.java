package com.tinder.domain.profile.model.settings;

import kotlin.Metadata;
import kotlin.jvm.JvmField;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\b\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000b\u001a\u00020\fHÖ\u0001J\t\u0010\r\u001a\u00020\u000eHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/tinder/domain/profile/model/settings/AccountSettings;", "", "deactivated", "", "(Z)V", "getDeactivated", "()Z", "component1", "copy", "equals", "other", "hashCode", "", "toString", "", "Companion", "domain_release"}, k = 1, mv = {1, 1, 10})
public final class AccountSettings {
    public static final Companion Companion = new Companion();
    @NotNull
    @JvmField
    public static final AccountSettings DEFAULT = new AccountSettings(false);
    private final boolean deactivated;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0010\u0010\u0003\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/tinder/domain/profile/model/settings/AccountSettings$Companion;", "", "()V", "DEFAULT", "Lcom/tinder/domain/profile/model/settings/AccountSettings;", "domain_release"}, k = 1, mv = {1, 1, 10})
    public static final class Companion {
        private Companion() {
        }
    }

    @NotNull
    public static /* synthetic */ AccountSettings copy$default(AccountSettings accountSettings, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = accountSettings.deactivated;
        }
        return accountSettings.copy(z);
    }

    public final boolean component1() {
        return this.deactivated;
    }

    @NotNull
    public final AccountSettings copy(boolean z) {
        return new AccountSettings(z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof AccountSettings) {
            if ((this.deactivated == ((AccountSettings) obj).deactivated ? 1 : null) != null) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        boolean z = this.deactivated;
        return z ? 1 : z;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("AccountSettings(deactivated=");
        stringBuilder.append(this.deactivated);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public AccountSettings(boolean z) {
        this.deactivated = z;
    }

    public final boolean getDeactivated() {
        return this.deactivated;
    }
}
