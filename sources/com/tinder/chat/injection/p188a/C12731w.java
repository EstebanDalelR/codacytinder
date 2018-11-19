package com.tinder.chat.injection.p188a;

import com.tinder.reactions.audio.ReactionsAudioStreamer;
import dagger.internal.C15521i;
import dagger.internal.Factory;

/* renamed from: com.tinder.chat.injection.a.w */
public final class C12731w implements Factory<ReactionsAudioStreamer> {
    /* renamed from: a */
    private final C8440a f41049a;

    public /* synthetic */ Object get() {
        return m50104a();
    }

    public C12731w(C8440a c8440a) {
        this.f41049a = c8440a;
    }

    /* renamed from: a */
    public ReactionsAudioStreamer m50104a() {
        return C12731w.m50101a(this.f41049a);
    }

    /* renamed from: a */
    public static ReactionsAudioStreamer m50101a(C8440a c8440a) {
        return C12731w.m50103c(c8440a);
    }

    /* renamed from: b */
    public static C12731w m50102b(C8440a c8440a) {
        return new C12731w(c8440a);
    }

    /* renamed from: c */
    public static ReactionsAudioStreamer m50103c(C8440a c8440a) {
        return (ReactionsAudioStreamer) C15521i.a(c8440a.m36031c(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
