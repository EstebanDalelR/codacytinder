package com.f2prateek.rx.preferences;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.support.annotation.CheckResult;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import rx.Observable;
import rx.functions.Func1;

public final class Preference<T> {
    /* renamed from: a */
    private final SharedPreferences f3050a;
    /* renamed from: b */
    private final String f3051b;
    /* renamed from: c */
    private final T f3052c;
    /* renamed from: d */
    private final Adapter<T> f3053d;
    /* renamed from: e */
    private final Observable<T> f3054e;

    public interface Adapter<T> {
        T get(@NonNull String str, @NonNull SharedPreferences sharedPreferences);

        void set(@NonNull String str, @NonNull T t, @NonNull Editor editor);
    }

    /* renamed from: com.f2prateek.rx.preferences.Preference$1 */
    class C41201 implements Func1<String, T> {
        /* renamed from: a */
        final /* synthetic */ Preference f13010a;

        C41201(Preference preference) {
            this.f13010a = preference;
        }

        public /* synthetic */ Object call(Object obj) {
            return m15999a((String) obj);
        }

        /* renamed from: a */
        public T m15999a(String str) {
            return this.f13010a.m3951a();
        }
    }

    Preference(SharedPreferences sharedPreferences, final String str, T t, Adapter<T> adapter, Observable<String> observable) {
        this.f3050a = sharedPreferences;
        this.f3051b = str;
        this.f3052c = t;
        this.f3053d = adapter;
        this.f3054e = observable.f(new Func1<String, Boolean>(this) {
            /* renamed from: b */
            final /* synthetic */ Preference f13012b;

            public /* synthetic */ Object call(Object obj) {
                return m16000a((String) obj);
            }

            /* renamed from: a */
            public Boolean m16000a(String str) {
                return Boolean.valueOf(str.equals(str));
            }
        }).e("<init>").m().k(new C41201(this));
    }

    @Nullable
    /* renamed from: a */
    public T m3951a() {
        if (this.f3050a.contains(this.f3051b)) {
            return this.f3053d.get(this.f3051b, this.f3050a);
        }
        return this.f3052c;
    }

    /* renamed from: a */
    public void m3952a(@Nullable T t) {
        Editor edit = this.f3050a.edit();
        if (t == null) {
            edit.remove(this.f3051b);
        } else {
            this.f3053d.set(this.f3051b, t, edit);
        }
        edit.apply();
    }

    /* renamed from: b */
    public void m3953b() {
        m3952a(null);
    }

    @CheckResult
    @NonNull
    /* renamed from: c */
    public Observable<T> m3954c() {
        return this.f3054e;
    }
}
