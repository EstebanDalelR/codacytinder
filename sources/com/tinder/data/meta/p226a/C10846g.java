package com.tinder.data.meta.p226a;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.tinder.api.model.common.User;
import com.tinder.data.adapter.C2646o;
import com.tinder.domain.meta.model.DiscoverySettings;
import com.tinder.domain.meta.model.DiscoverySettings.GenderFilter;
import java8.util.Objects;

/* renamed from: com.tinder.data.meta.a.g */
public class C10846g extends C2646o<DiscoverySettings, User> {
    @Nullable
    /* renamed from: a */
    public DiscoverySettings m43319a(@NonNull User user) {
        int intValue = ((Integer) Objects.b(user.ageFilterMax(), Integer.valueOf(55))).intValue();
        int intValue2 = ((Integer) Objects.b(user.ageFilterMin(), Integer.valueOf(18))).intValue();
        int intValue3 = ((Integer) Objects.b(user.distanceFilter(), Integer.valueOf(1))).intValue();
        boolean booleanValue = ((Boolean) Objects.b(user.discoverable(), Boolean.valueOf(true))).booleanValue();
        return DiscoverySettings.builder().maxAgeFilter(intValue).minAgeFilter(intValue2).distanceFilter(intValue3).isDiscoverable(booleanValue).genderFilter(m43318a(((Integer) Objects.b(user.genderFilter(), Integer.valueOf(-1))).intValue())).build();
    }

    @NonNull
    /* renamed from: a */
    private GenderFilter m43318a(int i) {
        for (GenderFilter genderFilter : GenderFilter.values()) {
            if (genderFilter.getValue() == i) {
                return genderFilter;
            }
        }
        return GenderFilter.BOTH;
    }
}
