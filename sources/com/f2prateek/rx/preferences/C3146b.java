package com.f2prateek.rx.preferences;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.support.annotation.NonNull;
import com.f2prateek.rx.preferences.Preference.Adapter;

/* renamed from: com.f2prateek.rx.preferences.b */
final class C3146b<T extends Enum<T>> implements Adapter<T> {
    /* renamed from: a */
    static final /* synthetic */ boolean f9699a = true;
    /* renamed from: b */
    private final Class<T> f9700b;

    public /* synthetic */ Object get(@NonNull String str, @NonNull SharedPreferences sharedPreferences) {
        return m12151a(str, sharedPreferences);
    }

    public /* synthetic */ void set(@NonNull String str, @NonNull Object obj, @NonNull Editor editor) {
        m12152a(str, (Enum) obj, editor);
    }

    C3146b(Class<T> cls) {
        this.f9700b = cls;
    }

    /* renamed from: a */
    public T m12151a(@NonNull String str, @NonNull SharedPreferences sharedPreferences) {
        str = sharedPreferences.getString(str, null);
        if (f9699a != null || str != null) {
            return Enum.valueOf(this.f9700b, str);
        }
        throw new AssertionError();
    }

    /* renamed from: a */
    public void m12152a(@NonNull String str, @NonNull T t, @NonNull Editor editor) {
        editor.putString(str, t.name());
    }
}
