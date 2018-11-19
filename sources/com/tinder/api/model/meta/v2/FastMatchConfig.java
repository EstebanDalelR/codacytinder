package com.tinder.api.model.meta.v2;

import com.squareup.moshi.Json;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0017\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B;\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0010\b\u0001\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\nJ\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\fJ\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0014J\u0011\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0003J\u0010\u0010\u0019\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u000fJD\u0010\u001a\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0010\b\u0003\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0002\u0010\u001bJ\u0013\u0010\u001c\u001a\u00020\u00032\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\bHÖ\u0001J\t\u0010\u001f\u001a\u00020 HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\fR\u0015\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u0013\u0010\u0014¨\u0006!"}, d2 = {"Lcom/tinder/api/model/meta/v2/FastMatchConfig;", "", "enabled", "", "previewMinimumTime", "", "notificationOptions", "", "", "notificationDefault", "(Ljava/lang/Boolean;Ljava/lang/Long;Ljava/util/List;Ljava/lang/Integer;)V", "getEnabled", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getNotificationDefault", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getNotificationOptions", "()Ljava/util/List;", "getPreviewMinimumTime", "()Ljava/lang/Long;", "Ljava/lang/Long;", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/Boolean;Ljava/lang/Long;Ljava/util/List;Ljava/lang/Integer;)Lcom/tinder/api/model/meta/v2/FastMatchConfig;", "equals", "other", "hashCode", "toString", "", "api_release"}, k = 1, mv = {1, 1, 10})
public final class FastMatchConfig {
    @Nullable
    private final Boolean enabled;
    @Nullable
    private final Integer notificationDefault;
    @Nullable
    private final List<Integer> notificationOptions;
    @Nullable
    private final Long previewMinimumTime;

    @NotNull
    public static /* synthetic */ FastMatchConfig copy$default(FastMatchConfig fastMatchConfig, Boolean bool, Long l, List list, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = fastMatchConfig.enabled;
        }
        if ((i & 2) != 0) {
            l = fastMatchConfig.previewMinimumTime;
        }
        if ((i & 4) != 0) {
            list = fastMatchConfig.notificationOptions;
        }
        if ((i & 8) != 0) {
            num = fastMatchConfig.notificationDefault;
        }
        return fastMatchConfig.copy(bool, l, list, num);
    }

    @Nullable
    public final Boolean component1() {
        return this.enabled;
    }

    @Nullable
    public final Long component2() {
        return this.previewMinimumTime;
    }

    @Nullable
    public final List<Integer> component3() {
        return this.notificationOptions;
    }

    @Nullable
    public final Integer component4() {
        return this.notificationDefault;
    }

    @NotNull
    public final FastMatchConfig copy(@Nullable @Json(name = "fast_match") Boolean bool, @Nullable @Json(name = "fast_match_preview_minimum_time") Long l, @Nullable @Json(name = "fast_match_notif_options") List<Integer> list, @Nullable @Json(name = "fast_match_notif_defaults") Integer num) {
        return new FastMatchConfig(bool, l, list, num);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof FastMatchConfig) {
                FastMatchConfig fastMatchConfig = (FastMatchConfig) obj;
                if (C2668g.a(this.enabled, fastMatchConfig.enabled) && C2668g.a(this.previewMinimumTime, fastMatchConfig.previewMinimumTime) && C2668g.a(this.notificationOptions, fastMatchConfig.notificationOptions) && C2668g.a(this.notificationDefault, fastMatchConfig.notificationDefault)) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        Boolean bool = this.enabled;
        int i = 0;
        int hashCode = (bool != null ? bool.hashCode() : 0) * 31;
        Long l = this.previewMinimumTime;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        List list = this.notificationOptions;
        hashCode = (hashCode + (list != null ? list.hashCode() : 0)) * 31;
        Integer num = this.notificationDefault;
        if (num != null) {
            i = num.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("FastMatchConfig(enabled=");
        stringBuilder.append(this.enabled);
        stringBuilder.append(", previewMinimumTime=");
        stringBuilder.append(this.previewMinimumTime);
        stringBuilder.append(", notificationOptions=");
        stringBuilder.append(this.notificationOptions);
        stringBuilder.append(", notificationDefault=");
        stringBuilder.append(this.notificationDefault);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public FastMatchConfig(@Nullable @Json(name = "fast_match") Boolean bool, @Nullable @Json(name = "fast_match_preview_minimum_time") Long l, @Nullable @Json(name = "fast_match_notif_options") List<Integer> list, @Nullable @Json(name = "fast_match_notif_defaults") Integer num) {
        this.enabled = bool;
        this.previewMinimumTime = l;
        this.notificationOptions = list;
        this.notificationDefault = num;
    }

    @Nullable
    public final Boolean getEnabled() {
        return this.enabled;
    }

    @Nullable
    public final Long getPreviewMinimumTime() {
        return this.previewMinimumTime;
    }

    @Nullable
    public final List<Integer> getNotificationOptions() {
        return this.notificationOptions;
    }

    @Nullable
    public final Integer getNotificationDefault() {
        return this.notificationDefault;
    }
}
