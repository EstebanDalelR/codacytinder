package com.f2prateek.rx.preferences;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.support.annotation.NonNull;
import com.f2prateek.rx.preferences.Preference.Adapter;

/* renamed from: com.f2prateek.rx.preferences.a */
final class C3145a implements Adapter<Boolean> {
    /* renamed from: a */
    static final C3145a f9698a = new C3145a();

    C3145a() {
    }

    public /* synthetic */ Object get(@NonNull String str, @NonNull SharedPreferences sharedPreferences) {
        return m12149a(str, sharedPreferences);
    }

    public /* synthetic */ void set(@NonNull String str, @NonNull Object obj, @NonNull Editor editor) {
        m12150a(str, (Boolean) obj, editor);
    }

    /* renamed from: a */
    public Boolean m12149a(@NonNull String str, @NonNull SharedPreferences sharedPreferences) {
        return Boolean.valueOf(sharedPreferences.getBoolean(str, false));
    }

    /* renamed from: a */
    public void m12150a(@NonNull String str, @NonNull Boolean bool, @NonNull Editor editor) {
        editor.putBoolean(str, bool.booleanValue());
    }
}
