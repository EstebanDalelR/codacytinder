package com.f2prateek.rx.preferences2;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.support.annotation.CheckResult;
import android.support.annotation.NonNull;
import io.reactivex.C3959e;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.functions.Predicate;

/* renamed from: com.f2prateek.rx.preferences2.c */
final class C3153c<T> implements Preference<T> {
    /* renamed from: a */
    private final SharedPreferences f9708a;
    /* renamed from: b */
    private final String f9709b;
    /* renamed from: c */
    private final T f9710c;
    /* renamed from: d */
    private final C1161a<T> f9711d;
    /* renamed from: e */
    private final C3959e<T> f9712e;

    /* renamed from: com.f2prateek.rx.preferences2.c$a */
    interface C1161a<T> {
        /* renamed from: a */
        void mo1547a(@NonNull String str, @NonNull T t, @NonNull Editor editor);

        /* renamed from: b */
        T mo1548b(@NonNull String str, @NonNull SharedPreferences sharedPreferences);
    }

    /* renamed from: com.f2prateek.rx.preferences2.c$1 */
    class C31501 implements Function<String, T> {
        /* renamed from: a */
        final /* synthetic */ C3153c f9704a;

        C31501(C3153c c3153c) {
            this.f9704a = c3153c;
        }

        public /* synthetic */ Object apply(Object obj) throws Exception {
            return m12161a((String) obj);
        }

        /* renamed from: a */
        public T m12161a(String str) throws Exception {
            return this.f9704a.get();
        }
    }

    /* renamed from: com.f2prateek.rx.preferences2.c$3 */
    class C31523 implements Consumer<T> {
        /* renamed from: a */
        final /* synthetic */ C3153c f9707a;

        C31523(C3153c c3153c) {
            this.f9707a = c3153c;
        }

        public void accept(T t) throws Exception {
            this.f9707a.set(t);
        }
    }

    C3153c(SharedPreferences sharedPreferences, final String str, T t, C1161a<T> c1161a, C3959e<String> c3959e) {
        this.f9708a = sharedPreferences;
        this.f9709b = str;
        this.f9710c = t;
        this.f9711d = c1161a;
        this.f9712e = c3959e.filter(new Predicate<String>(this) {
            /* renamed from: b */
            final /* synthetic */ C3153c f9706b;

            public /* synthetic */ boolean test(Object obj) throws Exception {
                return m12162a((String) obj);
            }

            /* renamed from: a */
            public boolean m12162a(String str) throws Exception {
                return str.equals(str);
            }
        }).startWith((Object) "<init>").map(new C31501(this));
    }

    @NonNull
    public String key() {
        return this.f9709b;
    }

    @NonNull
    public T defaultValue() {
        return this.f9710c;
    }

    @NonNull
    public synchronized T get() {
        if (this.f9708a.contains(this.f9709b)) {
            return this.f9711d.mo1548b(this.f9709b, this.f9708a);
        }
        return this.f9710c;
    }

    public void set(@NonNull T t) {
        C1160b.m3961a(t, "value == null");
        Editor edit = this.f9708a.edit();
        this.f9711d.mo1547a(this.f9709b, t, edit);
        edit.apply();
    }

    public boolean isSet() {
        return this.f9708a.contains(this.f9709b);
    }

    public synchronized void delete() {
        this.f9708a.edit().remove(this.f9709b).apply();
    }

    @CheckResult
    @NonNull
    public C3959e<T> asObservable() {
        return this.f9712e;
    }

    @CheckResult
    @NonNull
    public Consumer<? super T> asConsumer() {
        return new C31523(this);
    }
}
