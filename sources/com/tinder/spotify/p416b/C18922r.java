package com.tinder.spotify.p416b;

import com.tinder.spotify.target.SpotifyPlayerTarget;
import rx.functions.Action1;

/* renamed from: com.tinder.spotify.b.r */
final /* synthetic */ class C18922r implements Action1 {
    /* renamed from: a */
    static final Action1 f58574a = new C18922r();

    private C18922r() {
    }

    public void call(Object obj) {
        ((SpotifyPlayerTarget) obj).notifyStopButtonClicked();
    }
}
