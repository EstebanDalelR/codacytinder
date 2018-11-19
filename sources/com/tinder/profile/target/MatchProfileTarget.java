package com.tinder.profile.target;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.tinder.profile.model.Profile;

public interface MatchProfileTarget {
    void showProfile(@NonNull Profile profile, @Nullable String str);
}
