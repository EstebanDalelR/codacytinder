package com.tinder.auth.repository;

import android.annotation.SuppressLint;
import android.content.ContentResolver;
import android.provider.Settings.Secure;
import javax.inject.Inject;

/* renamed from: com.tinder.auth.repository.k */
public class C8297k {
    /* renamed from: a */
    private final ContentResolver f29571a;

    @Inject
    public C8297k(ContentResolver contentResolver) {
        this.f29571a = contentResolver;
    }

    @SuppressLint({"HardwareIds"})
    /* renamed from: a */
    public String m35390a() {
        return Secure.getString(this.f29571a, "android_id");
    }
}
