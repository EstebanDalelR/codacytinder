package com.tinder.recs;

import android.support.annotation.NonNull;
import com.tinder.domain.meta.model.DiscoverySettings;
import com.tinder.domain.meta.model.DiscoverySettings.GenderFilter;
import com.tinder.model.User;
import javax.inject.Inject;

public class DiscoverySettingsLegacyUserAdapter {
    @Inject
    DiscoverySettingsLegacyUserAdapter() {
    }

    @NonNull
    public DiscoverySettings fromUser(@NonNull User user) {
        return DiscoverySettings.builder().minAgeFilter(user.getAgeFilterMin()).maxAgeFilter(user.getAgeFilterMax()).isDiscoverable(user.isDiscoverable()).genderFilter(parseGenderFilter(user.isInterestedInMales(), user.isInterestedInFemales())).distanceFilter(user.getDistanceFilter()).build();
    }

    @NonNull
    private GenderFilter parseGenderFilter(boolean z, boolean z2) {
        if (z2 && z) {
            return GenderFilter.BOTH;
        }
        if (z2) {
            return GenderFilter.FEMALE;
        }
        if (z) {
            return GenderFilter.MALE;
        }
        throw new IllegalArgumentException("Unknown GenderFilter configuration");
    }
}
