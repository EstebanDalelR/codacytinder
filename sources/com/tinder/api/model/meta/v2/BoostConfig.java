package com.tinder.api.model.meta.v2;

import com.squareup.moshi.Json;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B)\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\rJ\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\nJ\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0010J2\u0010\u0015\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010\u0016J\u0013\u0010\u0017\u001a\u00020\u00032\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0007HÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\nR\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\rR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001c"}, d2 = {"Lcom/tinder/api/model/meta/v2/BoostConfig;", "", "enabled", "", "duration", "", "introMultiplier", "", "(Ljava/lang/Boolean;Ljava/lang/Long;Ljava/lang/Integer;)V", "getDuration", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getEnabled", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getIntroMultiplier", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "component3", "copy", "(Ljava/lang/Boolean;Ljava/lang/Long;Ljava/lang/Integer;)Lcom/tinder/api/model/meta/v2/BoostConfig;", "equals", "other", "hashCode", "toString", "", "api_release"}, k = 1, mv = {1, 1, 10})
public final class BoostConfig {
    @Nullable
    private final Long duration;
    @Nullable
    private final Boolean enabled;
    @Nullable
    private final Integer introMultiplier;

    @NotNull
    public static /* synthetic */ BoostConfig copy$default(BoostConfig boostConfig, Boolean bool, Long l, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = boostConfig.enabled;
        }
        if ((i & 2) != 0) {
            l = boostConfig.duration;
        }
        if ((i & 4) != 0) {
            num = boostConfig.introMultiplier;
        }
        return boostConfig.copy(bool, l, num);
    }

    @Nullable
    public final Boolean component1() {
        return this.enabled;
    }

    @Nullable
    public final Long component2() {
        return this.duration;
    }

    @Nullable
    public final Integer component3() {
        return this.introMultiplier;
    }

    @NotNull
    public final BoostConfig copy(@Nullable @Json(name = "boost") Boolean bool, @Nullable @Json(name = "boost_duration") Long l, @Nullable @Json(name = "boost_intro_multiplier") Integer num) {
        return new BoostConfig(bool, l, num);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof BoostConfig) {
                BoostConfig boostConfig = (BoostConfig) obj;
                if (C2668g.a(this.enabled, boostConfig.enabled) && C2668g.a(this.duration, boostConfig.duration) && C2668g.a(this.introMultiplier, boostConfig.introMultiplier)) {
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
        Long l = this.duration;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        Integer num = this.introMultiplier;
        if (num != null) {
            i = num.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("BoostConfig(enabled=");
        stringBuilder.append(this.enabled);
        stringBuilder.append(", duration=");
        stringBuilder.append(this.duration);
        stringBuilder.append(", introMultiplier=");
        stringBuilder.append(this.introMultiplier);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public BoostConfig(@Nullable @Json(name = "boost") Boolean bool, @Nullable @Json(name = "boost_duration") Long l, @Nullable @Json(name = "boost_intro_multiplier") Integer num) {
        this.enabled = bool;
        this.duration = l;
        this.introMultiplier = num;
    }

    @Nullable
    public final Boolean getEnabled() {
        return this.enabled;
    }

    @Nullable
    public final Long getDuration() {
        return this.duration;
    }

    @Nullable
    public final Integer getIntroMultiplier() {
        return this.introMultiplier;
    }
}
