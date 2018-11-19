package com.tinder.domain.profile.model.settings;

import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\b\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/tinder/domain/profile/model/settings/WebProfileSettings;", "", "username", "", "(Ljava/lang/String;)V", "getUsername", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "Companion", "domain_release"}, k = 1, mv = {1, 1, 10})
public final class WebProfileSettings {
    public static final Companion Companion = new Companion();
    @NotNull
    @JvmField
    public static final WebProfileSettings DEFAULT = new WebProfileSettings(null);
    @Nullable
    private final String username;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0010\u0010\u0003\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/tinder/domain/profile/model/settings/WebProfileSettings$Companion;", "", "()V", "DEFAULT", "Lcom/tinder/domain/profile/model/settings/WebProfileSettings;", "domain_release"}, k = 1, mv = {1, 1, 10})
    public static final class Companion {
        private Companion() {
        }
    }

    @NotNull
    public static /* synthetic */ WebProfileSettings copy$default(WebProfileSettings webProfileSettings, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = webProfileSettings.username;
        }
        return webProfileSettings.copy(str);
    }

    @Nullable
    public final String component1() {
        return this.username;
    }

    @NotNull
    public final WebProfileSettings copy(@Nullable String str) {
        return new WebProfileSettings(str);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof WebProfileSettings) {
                if (C2668g.a(this.username, ((WebProfileSettings) obj).username)) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        String str = this.username;
        return str != null ? str.hashCode() : 0;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("WebProfileSettings(username=");
        stringBuilder.append(this.username);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public WebProfileSettings(@Nullable String str) {
        this.username = str;
    }

    @Nullable
    public final String getUsername() {
        return this.username;
    }
}
