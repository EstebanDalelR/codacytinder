package com.tinder.spotify.audio;

import android.media.AudioManager;
import dagger.internal.Factory;
import de.greenrobot.event.C2664c;
import javax.inject.Provider;

/* renamed from: com.tinder.spotify.audio.c */
public final class C18155c implements Factory<SpotifyAudioPlayer> {
    /* renamed from: a */
    private final Provider<SpotifyAudioStreamer> f56328a;
    /* renamed from: b */
    private final Provider<AudioManager> f56329b;
    /* renamed from: c */
    private final Provider<C2664c> f56330c;

    public /* synthetic */ Object get() {
        return m65856a();
    }

    public C18155c(Provider<SpotifyAudioStreamer> provider, Provider<AudioManager> provider2, Provider<C2664c> provider3) {
        this.f56328a = provider;
        this.f56329b = provider2;
        this.f56330c = provider3;
    }

    /* renamed from: a */
    public SpotifyAudioPlayer m65856a() {
        return C18155c.m65854a(this.f56328a, this.f56329b, this.f56330c);
    }

    /* renamed from: a */
    public static SpotifyAudioPlayer m65854a(Provider<SpotifyAudioStreamer> provider, Provider<AudioManager> provider2, Provider<C2664c> provider3) {
        return new SpotifyAudioPlayer((SpotifyAudioStreamer) provider.get(), (AudioManager) provider2.get(), (C2664c) provider3.get());
    }

    /* renamed from: b */
    public static C18155c m65855b(Provider<SpotifyAudioStreamer> provider, Provider<AudioManager> provider2, Provider<C2664c> provider3) {
        return new C18155c(provider, provider2, provider3);
    }
}
