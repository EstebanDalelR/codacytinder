package com.f2prateek.rx.preferences;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.support.annotation.NonNull;
import com.f2prateek.rx.preferences.Preference.Adapter;

/* renamed from: com.f2prateek.rx.preferences.c */
final class C3147c implements Adapter<Integer> {
    /* renamed from: a */
    static final C3147c f9701a = new C3147c();

    C3147c() {
    }

    public /* synthetic */ Object get(@NonNull String str, @NonNull SharedPreferences sharedPreferences) {
        return m12153a(str, sharedPreferences);
    }

    public /* synthetic */ void set(@NonNull String str, @NonNull Object obj, @NonNull Editor editor) {
        m12154a(str, (Integer) obj, editor);
    }

    /* renamed from: a */
    public Integer m12153a(@NonNull String str, @NonNull SharedPreferences sharedPreferences) {
        return Integer.valueOf(sharedPreferences.getInt(str, 0));
    }

    /* renamed from: a */
    public void m12154a(@NonNull String str, @NonNull Integer num, @NonNull Editor editor) {
        editor.putInt(str, num.intValue());
    }
}
