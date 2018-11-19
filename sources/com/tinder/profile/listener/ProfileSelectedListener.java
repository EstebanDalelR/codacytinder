package com.tinder.profile.listener;

import android.support.annotation.NonNull;
import com.tinder.profile.model.Profile;

public interface ProfileSelectedListener {
    void onSelected(@NonNull Profile profile);
}
