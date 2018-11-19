package com.tinder.api.model.meta.v2;

import com.squareup.moshi.Json;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B5\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\bJ\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\nJ\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\nJ\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\rJ\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\nJ>\u0010\u0015\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u0016J\u0013\u0010\u0017\u001a\u00020\u00062\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\nR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\rR\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\u000f\u0010\nR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\u0010\u0010\n¨\u0006\u001c"}, d2 = {"Lcom/tinder/api/model/meta/v2/RecsConfig;", "", "recsInterval", "", "recsSize", "recsBlend", "", "adSwipeInterval", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Integer;)V", "getAdSwipeInterval", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getRecsBlend", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getRecsInterval", "getRecsSize", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Integer;)Lcom/tinder/api/model/meta/v2/RecsConfig;", "equals", "other", "hashCode", "toString", "", "api_release"}, k = 1, mv = {1, 1, 10})
public final class RecsConfig {
    @Nullable
    private final Integer adSwipeInterval;
    @Nullable
    private final Boolean recsBlend;
    @Nullable
    private final Integer recsInterval;
    @Nullable
    private final Integer recsSize;

    @NotNull
    public static /* synthetic */ RecsConfig copy$default(RecsConfig recsConfig, Integer num, Integer num2, Boolean bool, Integer num3, int i, Object obj) {
        if ((i & 1) != 0) {
            num = recsConfig.recsInterval;
        }
        if ((i & 2) != 0) {
            num2 = recsConfig.recsSize;
        }
        if ((i & 4) != 0) {
            bool = recsConfig.recsBlend;
        }
        if ((i & 8) != 0) {
            num3 = recsConfig.adSwipeInterval;
        }
        return recsConfig.copy(num, num2, bool, num3);
    }

    @Nullable
    public final Integer component1() {
        return this.recsInterval;
    }

    @Nullable
    public final Integer component2() {
        return this.recsSize;
    }

    @Nullable
    public final Boolean component3() {
        return this.recsBlend;
    }

    @Nullable
    public final Integer component4() {
        return this.adSwipeInterval;
    }

    @NotNull
    public final RecsConfig copy(@Nullable @Json(name = "recs_interval") Integer num, @Nullable @Json(name = "recs_size") Integer num2, @Nullable @Json(name = "recs_blend") Boolean bool, @Nullable @Json(name = "ad_swipe_interval") Integer num3) {
        return new RecsConfig(num, num2, bool, num3);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof RecsConfig) {
                RecsConfig recsConfig = (RecsConfig) obj;
                if (C2668g.a(this.recsInterval, recsConfig.recsInterval) && C2668g.a(this.recsSize, recsConfig.recsSize) && C2668g.a(this.recsBlend, recsConfig.recsBlend) && C2668g.a(this.adSwipeInterval, recsConfig.adSwipeInterval)) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        Integer num = this.recsInterval;
        int i = 0;
        int hashCode = (num != null ? num.hashCode() : 0) * 31;
        Integer num2 = this.recsSize;
        hashCode = (hashCode + (num2 != null ? num2.hashCode() : 0)) * 31;
        Boolean bool = this.recsBlend;
        hashCode = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        num2 = this.adSwipeInterval;
        if (num2 != null) {
            i = num2.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("RecsConfig(recsInterval=");
        stringBuilder.append(this.recsInterval);
        stringBuilder.append(", recsSize=");
        stringBuilder.append(this.recsSize);
        stringBuilder.append(", recsBlend=");
        stringBuilder.append(this.recsBlend);
        stringBuilder.append(", adSwipeInterval=");
        stringBuilder.append(this.adSwipeInterval);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public RecsConfig(@Nullable @Json(name = "recs_interval") Integer num, @Nullable @Json(name = "recs_size") Integer num2, @Nullable @Json(name = "recs_blend") Boolean bool, @Nullable @Json(name = "ad_swipe_interval") Integer num3) {
        this.recsInterval = num;
        this.recsSize = num2;
        this.recsBlend = bool;
        this.adSwipeInterval = num3;
    }

    @Nullable
    public final Integer getRecsInterval() {
        return this.recsInterval;
    }

    @Nullable
    public final Integer getRecsSize() {
        return this.recsSize;
    }

    @Nullable
    public final Boolean getRecsBlend() {
        return this.recsBlend;
    }

    @Nullable
    public final Integer getAdSwipeInterval() {
        return this.adSwipeInterval;
    }
}
