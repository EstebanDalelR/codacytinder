package com.tinder.common.provider;

import android.content.SharedPreferences;
import com.tinder.data.user.CurrentUserIdProvider;
import java8.util.Objects;
import javax.annotation.Nullable;
import rx.Completable;
import rx.Observable;
import rx.subjects.C19785a;

/* renamed from: com.tinder.common.provider.e */
public class C12789e implements CurrentUserIdProvider {
    /* renamed from: a */
    private final SharedPreferences f41184a;
    /* renamed from: b */
    private C19785a<String> f41185b;

    @Nullable
    public /* synthetic */ Object get() {
        return m50276a();
    }

    public /* synthetic */ void update(Object obj) {
        m50277a((String) obj);
    }

    public C12789e(SharedPreferences sharedPreferences) {
        this.f41184a = sharedPreferences;
        this.f41185b = C19785a.f(sharedPreferences.getString("USER_ID", null));
    }

    @Nullable
    /* renamed from: a */
    public String m50276a() {
        return (String) this.f41185b.A();
    }

    public Observable<String> observe() {
        return this.f41185b.e();
    }

    /* renamed from: a */
    public void m50277a(String str) {
        if (!Objects.a(m50276a(), str)) {
            this.f41184a.edit().putString("USER_ID", str).apply();
            this.f41185b.onNext(str);
        }
    }

    public Completable clear() {
        return Completable.a(new C13772f(this));
    }

    /* renamed from: b */
    final /* synthetic */ void m50278b() {
        this.f41185b = C19785a.w();
        this.f41184a.edit().remove("USER_ID").apply();
    }
}
