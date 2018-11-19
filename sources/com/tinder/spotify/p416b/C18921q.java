package com.tinder.spotify.p416b;

import com.tinder.spotify.target.SpotifyPlayerTarget;
import rx.functions.Action1;

/* renamed from: com.tinder.spotify.b.q */
final /* synthetic */ class C18921q implements Action1 {
    /* renamed from: a */
    static final Action1 f58573a = new C18921q();

    private C18921q() {
    }

    public void call(Object obj) {
        ((SpotifyPlayerTarget) obj).notifyPlayButtonClicked();
    }
}
