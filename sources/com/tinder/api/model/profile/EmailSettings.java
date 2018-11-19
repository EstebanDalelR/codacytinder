package com.tinder.api.model.profile;

import com.squareup.moshi.Json;
import kotlin.Metadata;
import kotlin.jvm.internal.C15823e;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\b\u0018\u00002\u00020\u0001:\u0001\u0014B\u001d\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\r\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, d2 = {"Lcom/tinder/api/model/profile/EmailSettings;", "", "email", "", "emailSettingOptions", "Lcom/tinder/api/model/profile/EmailSettings$Options;", "(Ljava/lang/String;Lcom/tinder/api/model/profile/EmailSettings$Options;)V", "getEmail", "()Ljava/lang/String;", "getEmailSettingOptions", "()Lcom/tinder/api/model/profile/EmailSettings$Options;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "Options", "api_release"}, k = 1, mv = {1, 1, 10})
public final class EmailSettings {
    @Nullable
    private final String email;
    @Nullable
    private final Options emailSettingOptions;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B)\u0012\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0006J\u0010\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\bJ\u0010\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\bJ\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\bJ2\u0010\u000f\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u0010J\u0013\u0010\u0011\u001a\u00020\u00032\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\bR\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\n\u0010\bR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u000b\u0010\b¨\u0006\u0017"}, d2 = {"Lcom/tinder/api/model/profile/EmailSettings$Options;", "", "newMatches", "", "messages", "promotions", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "getMessages", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getNewMatches", "getPromotions", "component1", "component2", "component3", "copy", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)Lcom/tinder/api/model/profile/EmailSettings$Options;", "equals", "other", "hashCode", "", "toString", "", "api_release"}, k = 1, mv = {1, 1, 10})
    public static final class Options {
        @Nullable
        private final Boolean messages;
        @Nullable
        private final Boolean newMatches;
        @Nullable
        private final Boolean promotions;

        public Options() {
            this(null, null, null, 7, null);
        }

        @NotNull
        public static /* synthetic */ Options copy$default(Options options, Boolean bool, Boolean bool2, Boolean bool3, int i, Object obj) {
            if ((i & 1) != 0) {
                bool = options.newMatches;
            }
            if ((i & 2) != 0) {
                bool2 = options.messages;
            }
            if ((i & 4) != 0) {
                bool3 = options.promotions;
            }
            return options.copy(bool, bool2, bool3);
        }

        @Nullable
        public final Boolean component1() {
            return this.newMatches;
        }

        @Nullable
        public final Boolean component2() {
            return this.messages;
        }

        @Nullable
        public final Boolean component3() {
            return this.promotions;
        }

        @NotNull
        public final Options copy(@Nullable @Json(name = "new_matches") Boolean bool, @Nullable @Json(name = "messages") Boolean bool2, @Nullable @Json(name = "promotions") Boolean bool3) {
            return new Options(bool, bool2, bool3);
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof Options) {
                    Options options = (Options) obj;
                    if (C2668g.a(this.newMatches, options.newMatches) && C2668g.a(this.messages, options.messages) && C2668g.a(this.promotions, options.promotions)) {
                    }
                }
                return false;
            }
            return true;
        }

        public int hashCode() {
            Boolean bool = this.newMatches;
            int i = 0;
            int hashCode = (bool != null ? bool.hashCode() : 0) * 31;
            Boolean bool2 = this.messages;
            hashCode = (hashCode + (bool2 != null ? bool2.hashCode() : 0)) * 31;
            bool2 = this.promotions;
            if (bool2 != null) {
                i = bool2.hashCode();
            }
            return hashCode + i;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Options(newMatches=");
            stringBuilder.append(this.newMatches);
            stringBuilder.append(", messages=");
            stringBuilder.append(this.messages);
            stringBuilder.append(", promotions=");
            stringBuilder.append(this.promotions);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }

        public Options(@Nullable @Json(name = "new_matches") Boolean bool, @Nullable @Json(name = "messages") Boolean bool2, @Nullable @Json(name = "promotions") Boolean bool3) {
            this.newMatches = bool;
            this.messages = bool2;
            this.promotions = bool3;
        }

        public /* synthetic */ Options(Boolean bool, Boolean bool2, Boolean bool3, int i, C15823e c15823e) {
            if ((i & 1) != null) {
                bool = Boolean.valueOf(true);
            }
            if ((i & 2) != null) {
                bool2 = Boolean.valueOf(true);
            }
            if ((i & 4) != 0) {
                bool3 = Boolean.valueOf(true);
            }
            this(bool, bool2, bool3);
        }

        @Nullable
        public final Boolean getNewMatches() {
            return this.newMatches;
        }

        @Nullable
        public final Boolean getMessages() {
            return this.messages;
        }

        @Nullable
        public final Boolean getPromotions() {
            return this.promotions;
        }
    }

    @NotNull
    public static /* synthetic */ EmailSettings copy$default(EmailSettings emailSettings, String str, Options options, int i, Object obj) {
        if ((i & 1) != 0) {
            str = emailSettings.email;
        }
        if ((i & 2) != 0) {
            options = emailSettings.emailSettingOptions;
        }
        return emailSettings.copy(str, options);
    }

    @Nullable
    public final String component1() {
        return this.email;
    }

    @Nullable
    public final Options component2() {
        return this.emailSettingOptions;
    }

    @NotNull
    public final EmailSettings copy(@Nullable @Json(name = "email") String str, @Nullable @Json(name = "email_settings") Options options) {
        return new EmailSettings(str, options);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof EmailSettings) {
                EmailSettings emailSettings = (EmailSettings) obj;
                if (C2668g.a(this.email, emailSettings.email) && C2668g.a(this.emailSettingOptions, emailSettings.emailSettingOptions)) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        String str = this.email;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        Options options = this.emailSettingOptions;
        if (options != null) {
            i = options.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("EmailSettings(email=");
        stringBuilder.append(this.email);
        stringBuilder.append(", emailSettingOptions=");
        stringBuilder.append(this.emailSettingOptions);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public EmailSettings(@Nullable @Json(name = "email") String str, @Nullable @Json(name = "email_settings") Options options) {
        this.email = str;
        this.emailSettingOptions = options;
    }

    @Nullable
    public final String getEmail() {
        return this.email;
    }

    @Nullable
    public final Options getEmailSettingOptions() {
        return this.emailSettingOptions;
    }
}
