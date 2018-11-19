package com.tinder.domain.settings.email.model;

import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\b\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, d2 = {"Lcom/tinder/domain/settings/email/model/EmailDisplaySettings;", "", "emailSettings", "Lcom/tinder/domain/settings/email/model/EmailSettings;", "canEditEmail", "", "(Lcom/tinder/domain/settings/email/model/EmailSettings;Z)V", "getCanEditEmail", "()Z", "getEmailSettings", "()Lcom/tinder/domain/settings/email/model/EmailSettings;", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "Companion", "domain_release"}, k = 1, mv = {1, 1, 10})
public final class EmailDisplaySettings {
    public static final Companion Companion = new Companion();
    @NotNull
    private static final EmailDisplaySettings DEFAULT = new EmailDisplaySettings(EmailSettings.Companion.getDEFAULT(), true);
    private final boolean canEditEmail;
    @NotNull
    private final EmailSettings emailSettings;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/tinder/domain/settings/email/model/EmailDisplaySettings$Companion;", "", "()V", "DEFAULT", "Lcom/tinder/domain/settings/email/model/EmailDisplaySettings;", "getDEFAULT", "()Lcom/tinder/domain/settings/email/model/EmailDisplaySettings;", "domain_release"}, k = 1, mv = {1, 1, 10})
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final EmailDisplaySettings getDEFAULT() {
            return EmailDisplaySettings.DEFAULT;
        }
    }

    @NotNull
    public static /* synthetic */ EmailDisplaySettings copy$default(EmailDisplaySettings emailDisplaySettings, EmailSettings emailSettings, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            emailSettings = emailDisplaySettings.emailSettings;
        }
        if ((i & 2) != 0) {
            z = emailDisplaySettings.canEditEmail;
        }
        return emailDisplaySettings.copy(emailSettings, z);
    }

    @NotNull
    public final EmailSettings component1() {
        return this.emailSettings;
    }

    public final boolean component2() {
        return this.canEditEmail;
    }

    @NotNull
    public final EmailDisplaySettings copy(@NotNull EmailSettings emailSettings, boolean z) {
        C2668g.b(emailSettings, "emailSettings");
        return new EmailDisplaySettings(emailSettings, z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof EmailDisplaySettings) {
            EmailDisplaySettings emailDisplaySettings = (EmailDisplaySettings) obj;
            if (C2668g.a(this.emailSettings, emailDisplaySettings.emailSettings)) {
                if ((this.canEditEmail == emailDisplaySettings.canEditEmail ? 1 : null) != null) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        EmailSettings emailSettings = this.emailSettings;
        int hashCode = (emailSettings != null ? emailSettings.hashCode() : 0) * 31;
        int i = this.canEditEmail;
        if (i != 0) {
            i = 1;
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("EmailDisplaySettings(emailSettings=");
        stringBuilder.append(this.emailSettings);
        stringBuilder.append(", canEditEmail=");
        stringBuilder.append(this.canEditEmail);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public EmailDisplaySettings(@NotNull EmailSettings emailSettings, boolean z) {
        C2668g.b(emailSettings, "emailSettings");
        this.emailSettings = emailSettings;
        this.canEditEmail = z;
    }

    @NotNull
    public final EmailSettings getEmailSettings() {
        return this.emailSettings;
    }

    public final boolean getCanEditEmail() {
        return this.canEditEmail;
    }
}
