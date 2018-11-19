package com.tinder.domain.settings.email.model;

import java.util.Collection;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.ak;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\b\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB\u001d\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J%\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\t2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\u000e\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u0017J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001c"}, d2 = {"Lcom/tinder/domain/settings/email/model/EmailSettings;", "", "emailAddress", "", "options", "", "Lcom/tinder/domain/settings/email/model/EmailSettingOption;", "(Ljava/lang/String;Ljava/util/Set;)V", "areOptionsEnabled", "", "getAreOptionsEnabled", "()Z", "getEmailAddress", "()Ljava/lang/String;", "getOptions", "()Ljava/util/Set;", "component1", "component2", "copy", "equals", "other", "getOption", "emailSettingType", "Lcom/tinder/domain/settings/email/model/EmailSettingType;", "hashCode", "", "toString", "Companion", "domain_release"}, k = 1, mv = {1, 1, 10})
public final class EmailSettings {
    public static final Companion Companion = new Companion();
    @NotNull
    private static final EmailSettings DEFAULT = new EmailSettings(null, ak.a(new EmailSettingOption[]{new EmailSettingOption(EmailSettingType.NEW_MATCHES, true), new EmailSettingOption(EmailSettingType.NEW_MESSAGES, true), new EmailSettingOption(EmailSettingType.PROMOTIONS, true)}));
    @Nullable
    private final String emailAddress;
    @NotNull
    private final Set<EmailSettingOption> options;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/tinder/domain/settings/email/model/EmailSettings$Companion;", "", "()V", "DEFAULT", "Lcom/tinder/domain/settings/email/model/EmailSettings;", "getDEFAULT", "()Lcom/tinder/domain/settings/email/model/EmailSettings;", "domain_release"}, k = 1, mv = {1, 1, 10})
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final EmailSettings getDEFAULT() {
            return EmailSettings.DEFAULT;
        }
    }

    @NotNull
    public static /* synthetic */ EmailSettings copy$default(EmailSettings emailSettings, String str, Set set, int i, Object obj) {
        if ((i & 1) != 0) {
            str = emailSettings.emailAddress;
        }
        if ((i & 2) != 0) {
            set = emailSettings.options;
        }
        return emailSettings.copy(str, set);
    }

    @Nullable
    public final String component1() {
        return this.emailAddress;
    }

    @NotNull
    public final Set<EmailSettingOption> component2() {
        return this.options;
    }

    @NotNull
    public final EmailSettings copy(@Nullable String str, @NotNull Set<EmailSettingOption> set) {
        C2668g.b(set, "options");
        return new EmailSettings(str, set);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof EmailSettings) {
                EmailSettings emailSettings = (EmailSettings) obj;
                if (C2668g.a(this.emailAddress, emailSettings.emailAddress) && C2668g.a(this.options, emailSettings.options)) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        String str = this.emailAddress;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        Set set = this.options;
        if (set != null) {
            i = set.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("EmailSettings(emailAddress=");
        stringBuilder.append(this.emailAddress);
        stringBuilder.append(", options=");
        stringBuilder.append(this.options);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public EmailSettings(@Nullable String str, @NotNull Set<EmailSettingOption> set) {
        C2668g.b(set, "options");
        this.emailAddress = str;
        this.options = set;
    }

    @Nullable
    public final String getEmailAddress() {
        return this.emailAddress;
    }

    @NotNull
    public final Set<EmailSettingOption> getOptions() {
        return this.options;
    }

    public final boolean getAreOptionsEnabled() {
        Iterable<EmailSettingOption> iterable = this.options;
        if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
            return false;
        }
        for (EmailSettingOption enabled : iterable) {
            if (enabled.getEnabled()) {
                return true;
            }
        }
        return false;
    }

    @NotNull
    public final EmailSettingOption getOption(@NotNull EmailSettingType emailSettingType) {
        C2668g.b(emailSettingType, "emailSettingType");
        for (EmailSettingOption emailSettingOption : this.options) {
            Object obj;
            if (emailSettingOption.getType() == emailSettingType) {
                obj = 1;
                continue;
            } else {
                obj = null;
                continue;
            }
            if (obj != null) {
                return emailSettingOption;
            }
        }
        throw ((Throwable) new NoSuchElementException("Collection contains no element matching the predicate."));
    }
}
