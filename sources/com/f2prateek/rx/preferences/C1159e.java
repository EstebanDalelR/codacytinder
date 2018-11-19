package com.f2prateek.rx.preferences;

import android.content.SharedPreferences;
import android.content.SharedPreferences.OnSharedPreferenceChangeListener;
import android.support.annotation.CheckResult;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import rx.C19571c;
import rx.Observable;
import rx.Observable.OnSubscribe;
import rx.functions.Action0;
import rx.p500e.C19407e;

/* renamed from: com.f2prateek.rx.preferences.e */
public final class C1159e {
    /* renamed from: a */
    private static final Float f3057a = Float.valueOf(0.0f);
    /* renamed from: b */
    private static final Integer f3058b = Integer.valueOf(0);
    /* renamed from: c */
    private static final Boolean f3059c = Boolean.valueOf(false);
    /* renamed from: d */
    private static final Long f3060d = Long.valueOf(0);
    /* renamed from: e */
    private final SharedPreferences f3061e;
    /* renamed from: f */
    private final Observable<String> f3062f;

    @CheckResult
    @NonNull
    /* renamed from: a */
    public static C1159e m3956a(@NonNull SharedPreferences sharedPreferences) {
        C1157d.m3955a(sharedPreferences, "preferences == null");
        return new C1159e(sharedPreferences);
    }

    private C1159e(final SharedPreferences sharedPreferences) {
        this.f3061e = sharedPreferences;
        this.f3062f = Observable.a(new OnSubscribe<String>(this) {
            /* renamed from: b */
            final /* synthetic */ C1159e f14741b;

            public /* synthetic */ void call(Object obj) {
                m18446a((C19571c) obj);
            }

            /* renamed from: a */
            public void m18446a(final C19571c<? super String> c19571c) {
                final OnSharedPreferenceChangeListener c11581 = new OnSharedPreferenceChangeListener(this) {
                    /* renamed from: b */
                    final /* synthetic */ C44371 f3056b;

                    public void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
                        c19571c.onNext(str);
                    }
                };
                sharedPreferences.registerOnSharedPreferenceChangeListener(c11581);
                c19571c.add(C19407e.a(new Action0(this) {
                    /* renamed from: b */
                    final /* synthetic */ C44371 f14207b;

                    public void call() {
                        sharedPreferences.unregisterOnSharedPreferenceChangeListener(c11581);
                    }
                }));
            }
        }).r();
    }

    @CheckResult
    @NonNull
    /* renamed from: a */
    public Preference<Boolean> m3957a(@NonNull String str, @Nullable Boolean bool) {
        C1157d.m3955a(str, "key == null");
        return new Preference(this.f3061e, str, bool, C3145a.f9698a, this.f3062f);
    }

    @CheckResult
    @NonNull
    /* renamed from: a */
    public <T extends Enum<T>> Preference<T> m3958a(@NonNull String str, @Nullable T t, @NonNull Class<T> cls) {
        C1157d.m3955a(str, "key == null");
        C1157d.m3955a(cls, "enumClass == null");
        return new Preference(this.f3061e, str, t, new C3146b(cls), this.f3062f);
    }

    @CheckResult
    @NonNull
    /* renamed from: a */
    public Preference<Integer> m3959a(@NonNull String str, @Nullable Integer num) {
        C1157d.m3955a(str, "key == null");
        return new Preference(this.f3061e, str, num, C3147c.f9701a, this.f3062f);
    }

    @CheckResult
    @NonNull
    /* renamed from: a */
    public Preference<String> m3960a(@NonNull String str, @Nullable String str2) {
        C1157d.m3955a(str, "key == null");
        return new Preference(this.f3061e, str, str2, C3148f.f9702a, this.f3062f);
    }
}
