package com.tinder.profile.p363b;

import android.support.annotation.NonNull;
import com.tinder.data.user.C11086a;
import com.tinder.domain.common.model.PerspectableUser;
import com.tinder.domain.common.usecase.UseCase;
import javax.inject.Inject;
import rx.Observable;

/* renamed from: com.tinder.profile.b.ai */
public class ai implements UseCase<String, PerspectableUser> {
    @NonNull
    /* renamed from: a */
    private final C11086a f49987a;

    @NonNull
    public /* synthetic */ Observable execute(@NonNull Object obj) {
        return m60845a((String) obj);
    }

    @Inject
    public ai(@NonNull C11086a c11086a) {
        this.f49987a = c11086a;
    }

    @NonNull
    /* renamed from: a */
    public Observable<PerspectableUser> m60845a(@NonNull String str) {
        return this.f49987a.a(str);
    }
}
