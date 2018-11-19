package com.tinder.domain.profile.model;

import com.tinder.domain.meta.model.DiscoverySettings.GenderFilter;
import kotlin.Metadata;
import kotlin.jvm.internal.C15823e;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001BA\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nJ\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\fJ\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\fJ\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0010J\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\fJ\u000b\u0010\u0018\u001a\u0004\u0018\u00010\tHÆ\u0003JJ\u0010\u0019\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0002\u0010\u001aJ\u0013\u0010\u001b\u001a\u00020\u00062\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dHÖ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001f\u001a\u00020 HÖ\u0001R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u0005\u0010\u0010R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u0012\u0010\fR\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u0013\u0010\f¨\u0006!"}, d2 = {"Lcom/tinder/domain/profile/model/DiscoverySettingsUpdateRequest;", "Lcom/tinder/domain/profile/model/ProfileUpdateRequest;", "minAge", "", "maxAge", "isDiscoverable", "", "distanceFilter", "genderFilter", "Lcom/tinder/domain/meta/model/DiscoverySettings$GenderFilter;", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Integer;Lcom/tinder/domain/meta/model/DiscoverySettings$GenderFilter;)V", "getDistanceFilter", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getGenderFilter", "()Lcom/tinder/domain/meta/model/DiscoverySettings$GenderFilter;", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getMaxAge", "getMinAge", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Integer;Lcom/tinder/domain/meta/model/DiscoverySettings$GenderFilter;)Lcom/tinder/domain/profile/model/DiscoverySettingsUpdateRequest;", "equals", "other", "", "hashCode", "toString", "", "domain_release"}, k = 1, mv = {1, 1, 10})
public final class DiscoverySettingsUpdateRequest extends ProfileUpdateRequest {
    @Nullable
    private final Integer distanceFilter;
    @Nullable
    private final GenderFilter genderFilter;
    @Nullable
    private final Boolean isDiscoverable;
    @Nullable
    private final Integer maxAge;
    @Nullable
    private final Integer minAge;

    public DiscoverySettingsUpdateRequest() {
        this(null, null, null, null, null, 31, null);
    }

    @NotNull
    public static /* synthetic */ DiscoverySettingsUpdateRequest copy$default(DiscoverySettingsUpdateRequest discoverySettingsUpdateRequest, Integer num, Integer num2, Boolean bool, Integer num3, GenderFilter genderFilter, int i, Object obj) {
        if ((i & 1) != 0) {
            num = discoverySettingsUpdateRequest.minAge;
        }
        if ((i & 2) != 0) {
            num2 = discoverySettingsUpdateRequest.maxAge;
        }
        Integer num4 = num2;
        if ((i & 4) != 0) {
            bool = discoverySettingsUpdateRequest.isDiscoverable;
        }
        Boolean bool2 = bool;
        if ((i & 8) != 0) {
            num3 = discoverySettingsUpdateRequest.distanceFilter;
        }
        Integer num5 = num3;
        if ((i & 16) != 0) {
            genderFilter = discoverySettingsUpdateRequest.genderFilter;
        }
        return discoverySettingsUpdateRequest.copy(num, num4, bool2, num5, genderFilter);
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
    public final Boolean component3() {
        return this.isDiscoverable;
    }

    @Nullable
    public final Integer component4() {
        return this.distanceFilter;
    }

    @Nullable
    public final GenderFilter component5() {
        return this.genderFilter;
    }

    @NotNull
    public final DiscoverySettingsUpdateRequest copy(@Nullable Integer num, @Nullable Integer num2, @Nullable Boolean bool, @Nullable Integer num3, @Nullable GenderFilter genderFilter) {
        return new DiscoverySettingsUpdateRequest(num, num2, bool, num3, genderFilter);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof DiscoverySettingsUpdateRequest) {
                DiscoverySettingsUpdateRequest discoverySettingsUpdateRequest = (DiscoverySettingsUpdateRequest) obj;
                if (C2668g.a(this.minAge, discoverySettingsUpdateRequest.minAge) && C2668g.a(this.maxAge, discoverySettingsUpdateRequest.maxAge) && C2668g.a(this.isDiscoverable, discoverySettingsUpdateRequest.isDiscoverable) && C2668g.a(this.distanceFilter, discoverySettingsUpdateRequest.distanceFilter) && C2668g.a(this.genderFilter, discoverySettingsUpdateRequest.genderFilter)) {
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
        Boolean bool = this.isDiscoverable;
        hashCode = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        num2 = this.distanceFilter;
        hashCode = (hashCode + (num2 != null ? num2.hashCode() : 0)) * 31;
        GenderFilter genderFilter = this.genderFilter;
        if (genderFilter != null) {
            i = genderFilter.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("DiscoverySettingsUpdateRequest(minAge=");
        stringBuilder.append(this.minAge);
        stringBuilder.append(", maxAge=");
        stringBuilder.append(this.maxAge);
        stringBuilder.append(", isDiscoverable=");
        stringBuilder.append(this.isDiscoverable);
        stringBuilder.append(", distanceFilter=");
        stringBuilder.append(this.distanceFilter);
        stringBuilder.append(", genderFilter=");
        stringBuilder.append(this.genderFilter);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public /* synthetic */ DiscoverySettingsUpdateRequest(Integer num, Integer num2, Boolean bool, Integer num3, GenderFilter genderFilter, int i, C15823e c15823e) {
        if ((i & 1) != null) {
            num = null;
        }
        if ((i & 2) != null) {
            num2 = null;
        }
        Integer num4 = num2;
        if ((i & 4) != null) {
            bool = null;
        }
        Boolean bool2 = bool;
        if ((i & 8) != null) {
            num3 = null;
        }
        Integer num5 = num3;
        if ((i & 16) != null) {
            genderFilter = null;
        }
        this(num, num4, bool2, num5, genderFilter);
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
    public final Boolean isDiscoverable() {
        return this.isDiscoverable;
    }

    @Nullable
    public final Integer getDistanceFilter() {
        return this.distanceFilter;
    }

    @Nullable
    public final GenderFilter getGenderFilter() {
        return this.genderFilter;
    }

    public DiscoverySettingsUpdateRequest(@Nullable Integer num, @Nullable Integer num2, @Nullable Boolean bool, @Nullable Integer num3, @Nullable GenderFilter genderFilter) {
        super();
        this.minAge = num;
        this.maxAge = num2;
        this.isDiscoverable = bool;
        this.distanceFilter = num3;
        this.genderFilter = genderFilter;
    }
}
