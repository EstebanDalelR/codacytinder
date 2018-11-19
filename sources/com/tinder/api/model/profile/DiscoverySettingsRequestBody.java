package com.tinder.api.model.profile;

import com.squareup.moshi.Json;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0016\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001BA\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\tJ\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000eJ\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000eJ\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000eJ\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u000bJ\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000eJJ\u0010\u0018\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u0019J\u0013\u0010\u001a\u001a\u00020\u00072\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000bR\u0015\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000eR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\u0010\u0010\u000eR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\u0011\u0010\u000eR\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\u0012\u0010\u000e¨\u0006\u001f"}, d2 = {"Lcom/tinder/api/model/profile/DiscoverySettingsRequestBody;", "", "minAge", "", "maxAge", "genderFilter", "discoverable", "", "distanceFilter", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Integer;)V", "getDiscoverable", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getDistanceFilter", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getGenderFilter", "getMaxAge", "getMinAge", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Integer;)Lcom/tinder/api/model/profile/DiscoverySettingsRequestBody;", "equals", "other", "hashCode", "toString", "", "api_release"}, k = 1, mv = {1, 1, 10})
public final class DiscoverySettingsRequestBody {
    @Nullable
    private final Boolean discoverable;
    @Nullable
    private final Integer distanceFilter;
    @Nullable
    private final Integer genderFilter;
    @Nullable
    private final Integer maxAge;
    @Nullable
    private final Integer minAge;

    @NotNull
    public static /* synthetic */ DiscoverySettingsRequestBody copy$default(DiscoverySettingsRequestBody discoverySettingsRequestBody, Integer num, Integer num2, Integer num3, Boolean bool, Integer num4, int i, Object obj) {
        if ((i & 1) != 0) {
            num = discoverySettingsRequestBody.minAge;
        }
        if ((i & 2) != 0) {
            num2 = discoverySettingsRequestBody.maxAge;
        }
        Integer num5 = num2;
        if ((i & 4) != 0) {
            num3 = discoverySettingsRequestBody.genderFilter;
        }
        Integer num6 = num3;
        if ((i & 8) != 0) {
            bool = discoverySettingsRequestBody.discoverable;
        }
        Boolean bool2 = bool;
        if ((i & 16) != 0) {
            num4 = discoverySettingsRequestBody.distanceFilter;
        }
        return discoverySettingsRequestBody.copy(num, num5, num6, bool2, num4);
    }

    @Nullable
    public final Integer component1() {
        return this.minAge;
    }

    @Nullable
    public final Integer component2() {
        return this.maxAge;
    }

    @Nullable
    public final Integer component3() {
        return this.genderFilter;
    }

    @Nullable
    public final Boolean component4() {
        return this.discoverable;
    }

    @Nullable
    public final Integer component5() {
        return this.distanceFilter;
    }

    @NotNull
    public final DiscoverySettingsRequestBody copy(@Nullable @Json(name = "age_filter_min") Integer num, @Nullable @Json(name = "age_filter_max") Integer num2, @Nullable @Json(name = "gender_filter") Integer num3, @Nullable @Json(name = "discoverable") Boolean bool, @Nullable @Json(name = "distance_filter") Integer num4) {
        return new DiscoverySettingsRequestBody(num, num2, num3, bool, num4);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof DiscoverySettingsRequestBody) {
                DiscoverySettingsRequestBody discoverySettingsRequestBody = (DiscoverySettingsRequestBody) obj;
                if (C2668g.a(this.minAge, discoverySettingsRequestBody.minAge) && C2668g.a(this.maxAge, discoverySettingsRequestBody.maxAge) && C2668g.a(this.genderFilter, discoverySettingsRequestBody.genderFilter) && C2668g.a(this.discoverable, discoverySettingsRequestBody.discoverable) && C2668g.a(this.distanceFilter, discoverySettingsRequestBody.distanceFilter)) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        Integer num = this.minAge;
        int i = 0;
        int hashCode = (num != null ? num.hashCode() : 0) * 31;
        Integer num2 = this.maxAge;
        hashCode = (hashCode + (num2 != null ? num2.hashCode() : 0)) * 31;
        num2 = this.genderFilter;
        hashCode = (hashCode + (num2 != null ? num2.hashCode() : 0)) * 31;
        Boolean bool = this.discoverable;
        hashCode = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        num2 = this.distanceFilter;
        if (num2 != null) {
            i = num2.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("DiscoverySettingsRequestBody(minAge=");
        stringBuilder.append(this.minAge);
        stringBuilder.append(", maxAge=");
        stringBuilder.append(this.maxAge);
        stringBuilder.append(", genderFilter=");
        stringBuilder.append(this.genderFilter);
        stringBuilder.append(", discoverable=");
        stringBuilder.append(this.discoverable);
        stringBuilder.append(", distanceFilter=");
        stringBuilder.append(this.distanceFilter);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public DiscoverySettingsRequestBody(@Nullable @Json(name = "age_filter_min") Integer num, @Nullable @Json(name = "age_filter_max") Integer num2, @Nullable @Json(name = "gender_filter") Integer num3, @Nullable @Json(name = "discoverable") Boolean bool, @Nullable @Json(name = "distance_filter") Integer num4) {
        this.minAge = num;
        this.maxAge = num2;
        this.genderFilter = num3;
        this.discoverable = bool;
        this.distanceFilter = num4;
    }

    @Nullable
    public final Integer getMinAge() {
        return this.minAge;
    }

    @Nullable
    public final Integer getMaxAge() {
        return this.maxAge;
    }

    @Nullable
    public final Integer getGenderFilter() {
        return this.genderFilter;
    }

    @Nullable
    public final Boolean getDiscoverable() {
        return this.discoverable;
    }

    @Nullable
    public final Integer getDistanceFilter() {
        return this.distanceFilter;
    }
}
