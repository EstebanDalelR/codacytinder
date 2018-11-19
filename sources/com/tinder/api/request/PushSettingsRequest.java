package com.tinder.api.request;

import com.squareup.moshi.Json;
import com.tinder.api.model.settings.PushSettings;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.C15823e;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001B'\b\u0007\u0012\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0003\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0003\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0007HÆ\u0003J)\u0010\u0012\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0007HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0018"}, d2 = {"Lcom/tinder/api/request/PushSettingsRequest;", "", "pushSettings", "Lcom/tinder/api/model/settings/PushSettings;", "appId", "", "pnVersion", "", "(Lcom/tinder/api/model/settings/PushSettings;Ljava/lang/String;I)V", "getAppId", "()Ljava/lang/String;", "getPnVersion", "()I", "getPushSettings", "()Lcom/tinder/api/model/settings/PushSettings;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "api_release"}, k = 1, mv = {1, 1, 10})
public final class PushSettingsRequest {
    @NotNull
    private final String appId;
    private final int pnVersion;
    @Nullable
    private final PushSettings pushSettings;

    @JvmOverloads
    public PushSettingsRequest() {
        this(null, null, 0, 7, null);
    }

    @JvmOverloads
    public PushSettingsRequest(@Nullable @Json(name = "push_settings") PushSettings pushSettings) {
        this(pushSettings, null, 0, 6, null);
    }

    @JvmOverloads
    public PushSettingsRequest(@Nullable @Json(name = "push_settings") PushSettings pushSettings, @NotNull @Json(name = "app_id") String str) {
        this(pushSettings, str, 0, 4, null);
    }

    @NotNull
    public static /* synthetic */ PushSettingsRequest copy$default(PushSettingsRequest pushSettingsRequest, PushSettings pushSettings, String str, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            pushSettings = pushSettingsRequest.pushSettings;
        }
        if ((i2 & 2) != 0) {
            str = pushSettingsRequest.appId;
        }
        if ((i2 & 4) != 0) {
            i = pushSettingsRequest.pnVersion;
        }
        return pushSettingsRequest.copy(pushSettings, str, i);
    }

    @Nullable
    public final PushSettings component1() {
        return this.pushSettings;
    }

    @NotNull
    public final String component2() {
        return this.appId;
    }

    public final int component3() {
        return this.pnVersion;
    }

    @NotNull
    public final PushSettingsRequest copy(@Nullable @Json(name = "push_settings") PushSettings pushSettings, @NotNull @Json(name = "app_id") String str, @Json(name = "push_notification_version") int i) {
        C2668g.b(str, "appId");
        return new PushSettingsRequest(pushSettings, str, i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PushSettingsRequest) {
            PushSettingsRequest pushSettingsRequest = (PushSettingsRequest) obj;
            if (C2668g.a(this.pushSettings, pushSettingsRequest.pushSettings) && C2668g.a(this.appId, pushSettingsRequest.appId)) {
                if ((this.pnVersion == pushSettingsRequest.pnVersion ? 1 : null) != null) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        PushSettings pushSettings = this.pushSettings;
        int i = 0;
        int hashCode = (pushSettings != null ? pushSettings.hashCode() : 0) * 31;
        String str = this.appId;
        if (str != null) {
            i = str.hashCode();
        }
        return ((hashCode + i) * 31) + this.pnVersion;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("PushSettingsRequest(pushSettings=");
        stringBuilder.append(this.pushSettings);
        stringBuilder.append(", appId=");
        stringBuilder.append(this.appId);
        stringBuilder.append(", pnVersion=");
        stringBuilder.append(this.pnVersion);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    @JvmOverloads
    public PushSettingsRequest(@Nullable @Json(name = "push_settings") PushSettings pushSettings, @NotNull @Json(name = "app_id") String str, @Json(name = "push_notification_version") int i) {
        C2668g.b(str, "appId");
        this.pushSettings = pushSettings;
        this.appId = str;
        this.pnVersion = i;
    }

    @JvmOverloads
    public /* synthetic */ PushSettingsRequest(PushSettings pushSettings, String str, int i, int i2, C15823e c15823e) {
        if ((i2 & 1) != null) {
            pushSettings = null;
        }
        if ((i2 & 2) != null) {
            str = "com.tinder";
        }
        if ((i2 & 4) != 0) {
            i = 2;
        }
        this(pushSettings, str, i);
    }

    @Nullable
    public final PushSettings getPushSettings() {
        return this.pushSettings;
    }

    @NotNull
    public final String getAppId() {
        return this.appId;
    }

    public final int getPnVersion() {
        return this.pnVersion;
    }
}
