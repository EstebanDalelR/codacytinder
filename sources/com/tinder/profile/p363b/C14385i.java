package com.tinder.profile.p363b;

import android.support.annotation.NonNull;
import com.tinder.analytics.fireworks.C2630h;
import com.tinder.etl.event.rs;
import javax.inject.Inject;
import rx.Completable;

/* renamed from: com.tinder.profile.b.i */
public class C14385i {
    @NonNull
    /* renamed from: a */
    private final C2630h f45584a;

    @Inject
    C14385i(@NonNull C2630h c2630h) {
        this.f45584a = c2630h;
    }

    @NonNull
    /* renamed from: a */
    public Completable m54803a() {
        this.f45584a.a(rs.a().a());
        return Completable.a();
    }
}
