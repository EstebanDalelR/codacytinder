package com.tinder.p238f.p336c;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.tinder.data.ObservingProvider;
import com.tinder.model.UserMeta;
import javax.inject.Singleton;
import rx.Observable;
import rx.subjects.PublishSubject;

@Singleton
/* renamed from: com.tinder.f.c.a */
public class C11600a implements ObservingProvider<UserMeta> {
    @NonNull
    /* renamed from: a */
    private final PublishSubject<UserMeta> f37999a = PublishSubject.w();
    @Nullable
    /* renamed from: b */
    private UserMeta f38000b;

    @Nullable
    public /* synthetic */ Object get() {
        return m47325a();
    }

    public /* synthetic */ void update(@NonNull Object obj) {
        m47326a((UserMeta) obj);
    }

    /* renamed from: a */
    public void m47326a(@NonNull UserMeta userMeta) {
        this.f37999a.onNext(userMeta);
        this.f38000b = userMeta;
    }

    @Nullable
    /* renamed from: a */
    public UserMeta m47325a() {
        return this.f38000b;
    }

    public Observable<UserMeta> observe() {
        return this.f37999a.e().m();
    }

    /* renamed from: b */
    public void m47327b() {
        this.f38000b = null;
    }
}
