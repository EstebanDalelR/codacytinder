package com.tinder.data.meta.store;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.tinder.domain.meta.model.BoostSettings;

public interface ProfileStore {
    void clear();

    @Nullable
    BoostSettings getBoostSettings();

    void removeBoostSettings();

    void saveBoostSettings(@NonNull BoostSettings boostSettings);
}
