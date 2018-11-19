package com.tinder.data.user;

import android.support.annotation.NonNull;
import com.tinder.api.TinderUserApi;
import com.tinder.data.adapter.C10745y;
import com.tinder.domain.common.model.PerspectableUser;
import com.tinder.domain.common.usecase.UseCase;
import javax.inject.Inject;
import rx.Observable;

/* renamed from: com.tinder.data.user.a */
public class C11086a implements UseCase<String, PerspectableUser> {
    @NonNull
    /* renamed from: a */
    private final C10745y f35878a;
    @NonNull
    /* renamed from: b */
    private final TinderUserApi f35879b;

    @NonNull
    public /* synthetic */ Observable execute(@NonNull Object obj) {
        return m43774a((String) obj);
    }

    @Inject
    public C11086a(@NonNull C10745y c10745y, @NonNull TinderUserApi tinderUserApi) {
        this.f35878a = c10745y;
        this.f35879b = tinderUserApi;
    }

    @NonNull
    /* renamed from: a */
    public Observable<PerspectableUser> m43774a(@NonNull String str) {
        str = this.f35879b.getUser(str).k(C13130b.f41783a);
        C10745y c10745y = this.f35878a;
        c10745y.getClass();
        return str.k(C13131c.m51040a(c10745y));
    }
}
