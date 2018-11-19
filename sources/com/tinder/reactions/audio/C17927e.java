package com.tinder.reactions.audio;

import android.media.AudioManager;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.reactions.audio.e */
public final class C17927e implements Factory<C14593d> {
    /* renamed from: a */
    private final Provider<ReactionsAudioStreamer> f55834a;
    /* renamed from: b */
    private final Provider<AudioManager> f55835b;

    public /* synthetic */ Object get() {
        return m65234a();
    }

    public C17927e(Provider<ReactionsAudioStreamer> provider, Provider<AudioManager> provider2) {
        this.f55834a = provider;
        this.f55835b = provider2;
    }

    /* renamed from: a */
    public C14593d m65234a() {
        return C17927e.m65232a(this.f55834a, this.f55835b);
    }

    /* renamed from: a */
    public static C14593d m65232a(Provider<ReactionsAudioStreamer> provider, Provider<AudioManager> provider2) {
        return new C14593d((ReactionsAudioStreamer) provider.get(), (AudioManager) provider2.get());
    }

    /* renamed from: b */
    public static C17927e m65233b(Provider<ReactionsAudioStreamer> provider, Provider<AudioManager> provider2) {
        return new C17927e(provider, provider2);
    }
}
