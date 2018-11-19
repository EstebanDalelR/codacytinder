package com.tinder.module;

import com.tinder.spotify.audio.SpotifyAudioStreamer;
import dagger.internal.C15521i;
import dagger.internal.Factory;

public final class bv implements Factory<SpotifyAudioStreamer> {
    /* renamed from: a */
    private final bs f42833a;

    public /* synthetic */ Object get() {
        return m52208a();
    }

    public bv(bs bsVar) {
        this.f42833a = bsVar;
    }

    /* renamed from: a */
    public SpotifyAudioStreamer m52208a() {
        return m52205a(this.f42833a);
    }

    /* renamed from: a */
    public static SpotifyAudioStreamer m52205a(bs bsVar) {
        return m52207c(bsVar);
    }

    /* renamed from: b */
    public static bv m52206b(bs bsVar) {
        return new bv(bsVar);
    }

    /* renamed from: c */
    public static SpotifyAudioStreamer m52207c(bs bsVar) {
        return (SpotifyAudioStreamer) C15521i.a(bsVar.m40844i(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
