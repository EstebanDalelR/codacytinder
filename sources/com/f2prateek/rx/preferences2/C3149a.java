package com.f2prateek.rx.preferences2;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.support.annotation.NonNull;
import com.f2prateek.rx.preferences2.C3153c.C1161a;

/* renamed from: com.f2prateek.rx.preferences2.a */
final class C3149a implements C1161a<Boolean> {
    /* renamed from: a */
    static final C3149a f9703a = new C3149a();

    C3149a() {
    }

    /* renamed from: b */
    public /* synthetic */ Object mo1548b(@NonNull String str, @NonNull SharedPreferences sharedPreferences) {
        return m12157a(str, sharedPreferences);
    }

    /* renamed from: a */
    public Boolean m12157a(@NonNull String str, @NonNull SharedPreferences sharedPreferences) {
        return Boolean.valueOf(sharedPreferences.getBoolean(str, false));
    }

    /* renamed from: a */
    public void m12158a(@NonNull String str, @NonNull Boolean bool, @NonNull Editor editor) {
        editor.putBoolean(str, bool.booleanValue());
    }
}
