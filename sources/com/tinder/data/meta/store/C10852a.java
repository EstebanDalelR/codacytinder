package com.tinder.data.meta.store;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.tinder.domain.meta.model.CurrentUser;
import com.tinder.domain.meta.model.DiscoverySettings;
import io.paperdb.Book;

/* renamed from: com.tinder.data.meta.store.a */
public class C10852a implements MetaStore {
    @NonNull
    /* renamed from: a */
    private final Book f35493a;

    public C10852a(@NonNull Book book) {
        this.f35493a = book;
    }

    public void saveCurrentUser(@NonNull CurrentUser currentUser) {
        this.f35493a.write("current_user", currentUser);
    }

    public void saveDiscoverySettings(@NonNull DiscoverySettings discoverySettings) {
        this.f35493a.write("discovery_settings", discoverySettings);
    }

    @Nullable
    public CurrentUser getCurrentUser() {
        return (CurrentUser) this.f35493a.read("current_user");
    }

    @Nullable
    public DiscoverySettings getDiscoverySettings() {
        return (DiscoverySettings) this.f35493a.read("discovery_settings");
    }

    public void removeCurrentUser() {
        this.f35493a.delete("current_user");
    }

    public void removeDiscoverySettings() {
        this.f35493a.delete("discovery_settings");
    }

    public void clear() {
        this.f35493a.destroy();
    }
}
