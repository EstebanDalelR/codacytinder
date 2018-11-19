package com.tinder.auth.repository;

import android.content.SharedPreferences;
import android.support.annotation.NonNull;
import com.tinder.auth.model.C8289c;

/* renamed from: com.tinder.auth.repository.j */
public class C10349j implements AuthSessionDataStore {
    @NonNull
    /* renamed from: a */
    private final SharedPreferences f33778a;

    public C10349j(@NonNull SharedPreferences sharedPreferences) {
        this.f33778a = sharedPreferences;
    }

    public C8289c authSession() {
        return C8289c.m35376a(this.f33778a.getBoolean("hasPreviouslyLoggedIn", false));
    }

    public void saveUserHasPreviouslyLoggedIn() {
        this.f33778a.edit().putBoolean("hasPreviouslyLoggedIn", true).apply();
    }
}
