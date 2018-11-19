package com.tinder.auth.repository;

import android.support.annotation.NonNull;
import com.tinder.auth.model.C8289c;
import javax.inject.Inject;

/* renamed from: com.tinder.auth.repository.i */
public class C10348i implements AuthSessionRepository {
    @NonNull
    /* renamed from: a */
    private final AuthSessionDataStore f33777a;

    @Inject
    public C10348i(@NonNull AuthSessionDataStore authSessionDataStore) {
        this.f33777a = authSessionDataStore;
    }

    public C8289c authSession() {
        return this.f33777a.authSession();
    }

    public void saveUserHasPreviouslyLoggedIn() {
        this.f33777a.saveUserHasPreviouslyLoggedIn();
    }
}
