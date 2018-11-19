package com.tinder.profile.adapters;

import android.support.annotation.NonNull;
import com.tinder.enums.UserType;
import com.tinder.profile.model.Profile.Source;

/* renamed from: com.tinder.profile.adapters.s */
public class C14371s {
    @NonNull
    /* renamed from: a */
    public static UserType m54747a(@NonNull Source source, boolean z) {
        switch (source) {
            case REC:
                if (z) {
                    return UserType.GROUP_REC;
                }
                return UserType.REC;
            case MATCH:
                if (z) {
                    return UserType.GROUP_MATCH;
                }
                return UserType.MATCH;
            case USER:
                return UserType.ME;
            case FASTMATCH:
                return UserType.FASTMATCH;
            case TOP_PICKS:
                return UserType.TOP_PICKS;
            case PLACES:
                return UserType.PLACES;
            default:
                throw new IllegalArgumentException("Unknown source type");
        }
    }
}
