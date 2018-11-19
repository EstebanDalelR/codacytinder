package com.tinder.spotify.p416b;

import com.tinder.spotify.audio.SpotifyAudioPlayer.StateListener;
import com.tinder.spotify.audio.SpotifyAudioStreamer.State;
import com.tinder.spotify.model.SearchTrack;

/* renamed from: com.tinder.spotify.b.o */
final /* synthetic */ class C16853o implements StateListener {
    /* renamed from: a */
    private final C18162n f51946a;

    C16853o(C18162n c18162n) {
        this.f51946a = c18162n;
    }

    public void onStateChanged(State state, SearchTrack searchTrack) {
        this.f51946a.m65896a(state, searchTrack);
    }
}
