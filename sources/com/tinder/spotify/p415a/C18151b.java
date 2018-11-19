package com.tinder.spotify.p415a;

import com.tinder.model.User;
import rx.functions.Func1;

/* renamed from: com.tinder.spotify.a.b */
final /* synthetic */ class C18151b implements Func1 {
    /* renamed from: a */
    static final Func1 f56318a = new C18151b();

    private C18151b() {
    }

    public Object call(Object obj) {
        return ((User) obj).getSpotifyLastUpdatedAt();
    }
}
