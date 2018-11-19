package com.tinder.data.meta.store;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.tinder.domain.meta.model.CurrentUser;
import com.tinder.domain.meta.model.DiscoverySettings;

public interface MetaStore {
    void clear();

    @Nullable
    CurrentUser getCurrentUser();

    @Nullable
    DiscoverySettings getDiscoverySettings();

    void removeCurrentUser();

    void removeDiscoverySettings();

    void saveCurrentUser(CurrentUser currentUser);

    void saveDiscoverySettings(@NonNull DiscoverySettings discoverySettings);
}
