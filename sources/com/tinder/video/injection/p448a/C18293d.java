package com.tinder.video.injection.p448a;

import com.google.android.exoplayer2.extractor.ExtractorsFactory;
import dagger.internal.C15521i;
import dagger.internal.Factory;

/* renamed from: com.tinder.video.injection.a.d */
public final class C18293d implements Factory<ExtractorsFactory> {
    /* renamed from: a */
    private final C15414a f56638a;

    public /* synthetic */ Object get() {
        return m66248a();
    }

    public C18293d(C15414a c15414a) {
        this.f56638a = c15414a;
    }

    /* renamed from: a */
    public ExtractorsFactory m66248a() {
        return C18293d.m66245a(this.f56638a);
    }

    /* renamed from: a */
    public static ExtractorsFactory m66245a(C15414a c15414a) {
        return C18293d.m66247c(c15414a);
    }

    /* renamed from: b */
    public static C18293d m66246b(C15414a c15414a) {
        return new C18293d(c15414a);
    }

    /* renamed from: c */
    public static ExtractorsFactory m66247c(C15414a c15414a) {
        return (ExtractorsFactory) C15521i.m58001a(c15414a.m57798b(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
