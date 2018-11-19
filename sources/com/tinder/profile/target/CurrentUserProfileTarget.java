package com.tinder.profile.target;

import android.support.annotation.NonNull;
import com.tinder.profile.model.Profile;

public interface CurrentUserProfileTarget {
    void bindProfile(@NonNull Profile profile);

    void showEditProfile();
}
