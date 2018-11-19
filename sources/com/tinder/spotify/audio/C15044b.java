package com.tinder.spotify.audio;

import android.media.AudioManager.OnAudioFocusChangeListener;

/* renamed from: com.tinder.spotify.audio.b */
final /* synthetic */ class C15044b implements OnAudioFocusChangeListener {
    /* renamed from: a */
    private final SpotifyAudioPlayer f46853a;

    C15044b(SpotifyAudioPlayer spotifyAudioPlayer) {
        this.f46853a = spotifyAudioPlayer;
    }

    public void onAudioFocusChange(int i) {
        this.f46853a.m56699a(i);
    }
}
