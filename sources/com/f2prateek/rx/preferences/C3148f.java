package com.f2prateek.rx.preferences;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.support.annotation.NonNull;
import com.f2prateek.rx.preferences.Preference.Adapter;

/* renamed from: com.f2prateek.rx.preferences.f */
final class C3148f implements Adapter<String> {
    /* renamed from: a */
    static final C3148f f9702a = new C3148f();

    C3148f() {
    }

    public /* synthetic */ Object get(@NonNull String str, @NonNull SharedPreferences sharedPreferences) {
        return m12155a(str, sharedPreferences);
    }

    public /* synthetic */ void set(@NonNull String str, @NonNull Object obj, @NonNull Editor editor) {
        m12156a(str, (String) obj, editor);
    }

    /* renamed from: a */
    public String m12155a(@NonNull String str, @NonNull SharedPreferences sharedPreferences) {
        return sharedPreferences.getString(str, null);
    }

    /* renamed from: a */
    public void m12156a(@NonNull String str, @NonNull String str2, @NonNull Editor editor) {
        editor.putString(str, str2);
    }
}
