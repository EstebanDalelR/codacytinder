package com.f2prateek.rx.preferences2;

import android.content.SharedPreferences;
import android.content.SharedPreferences.OnSharedPreferenceChangeListener;
import android.support.annotation.CheckResult;
import android.support.annotation.NonNull;
import io.reactivex.C3959e;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.functions.Cancellable;

/* renamed from: com.f2prateek.rx.preferences2.d */
public final class C1163d {
    /* renamed from: a */
    private static final Float f3065a = Float.valueOf(0.0f);
    /* renamed from: b */
    private static final Integer f3066b = Integer.valueOf(0);
    /* renamed from: c */
    private static final Boolean f3067c = Boolean.valueOf(false);
    /* renamed from: d */
    private static final Long f3068d = Long.valueOf(0);
    /* renamed from: e */
    private final SharedPreferences f3069e;
    /* renamed from: f */
    private final C3959e<String> f3070f;

    @CheckResult
    @NonNull
    /* renamed from: a */
    public static C1163d m3964a(@NonNull SharedPreferences sharedPreferences) {
        C1160b.m3961a(sharedPreferences, "preferences == null");
        return new C1163d(sharedPreferences);
    }

    private C1163d(final SharedPreferences sharedPreferences) {
        this.f3069e = sharedPreferences;
        this.f3070f = C3959e.create(new ObservableOnSubscribe<String>(this) {
            /* renamed from: b */
            final /* synthetic */ C1163d f9716b;

            public void subscribe(final ObservableEmitter<String> observableEmitter) throws Exception {
                final OnSharedPreferenceChangeListener c11621 = new OnSharedPreferenceChangeListener(this) {
                    /* renamed from: b */
                    final /* synthetic */ C31551 f3064b;

                    public void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
                        observableEmitter.onNext(str);
                    }
                };
                observableEmitter.setCancellable(new Cancellable(this) {
                    /* renamed from: b */
                    final /* synthetic */ C31551 f9714b;

                    public void cancel() throws Exception {
                        sharedPreferences.unregisterOnSharedPreferenceChangeListener(c11621);
                    }
                });
                sharedPreferences.registerOnSharedPreferenceChangeListener(c11621);
            }
        }).share();
    }

    @CheckResult
    @NonNull
    /* renamed from: a */
    public Preference<Boolean> m3965a(@NonNull String str, @NonNull Boolean bool) {
        C1160b.m3961a(str, "key == null");
        C1160b.m3961a(bool, "defaultValue == null");
        return new C3153c(this.f3069e, str, bool, C3149a.f9703a, this.f3070f);
    }
}
