package com.tinder.api.model.meta.v2;

import com.squareup.moshi.Json;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000bJ\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\bJ&\u0010\u000f\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0010J\u0013\u0010\u0011\u001a\u00020\u00032\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\bR\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/tinder/api/model/meta/v2/SuperLikeConfig;", "", "enabled", "", "alcMode", "", "(Ljava/lang/Boolean;Ljava/lang/Integer;)V", "getAlcMode", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getEnabled", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "copy", "(Ljava/lang/Boolean;Ljava/lang/Integer;)Lcom/tinder/api/model/meta/v2/SuperLikeConfig;", "equals", "other", "hashCode", "toString", "", "api_release"}, k = 1, mv = {1, 1, 10})
public final class SuperLikeConfig {
    @Nullable
    private final Integer alcMode;
    @Nullable
    private final Boolean enabled;

    @NotNull
    public static /* synthetic */ SuperLikeConfig copy$default(SuperLikeConfig superLikeConfig, Boolean bool, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = superLikeConfig.enabled;
        }
        if ((i & 2) != 0) {
            num = superLikeConfig.alcMode;
        }
        return superLikeConfig.copy(bool, num);
    }

    @Nullable
    public final Boolean component1() {
        return this.enabled;
    }

    @Nullable
    public final Integer component2() {
        return this.alcMode;
    }

    @NotNull
    public final SuperLikeConfig copy(@Nullable @Json(name = "super_like") Boolean bool, @Nullable @Json(name = "super_like_alc_mode") Integer num) {
        return new SuperLikeConfig(bool, num);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof SuperLikeConfig) {
                SuperLikeConfig superLikeConfig = (SuperLikeConfig) obj;
                if (C2668g.a(this.enabled, superLikeConfig.enabled) && C2668g.a(this.alcMode, superLikeConfig.alcMode)) {
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
        Integer num = this.alcMode;
        if (num != null) {
            i = num.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("SuperLikeConfig(enabled=");
        stringBuilder.append(this.enabled);
        stringBuilder.append(", alcMode=");
        stringBuilder.append(this.alcMode);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public SuperLikeConfig(@Nullable @Json(name = "super_like") Boolean bool, @Nullable @Json(name = "super_like_alc_mode") Integer num) {
        this.enabled = bool;
        this.alcMode = num;
    }

    @Nullable
    public final Boolean getEnabled() {
        return this.enabled;
    }

    @Nullable
    public final Integer getAlcMode() {
        return this.alcMode;
    }
}
