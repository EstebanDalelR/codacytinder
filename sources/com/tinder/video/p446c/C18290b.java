package com.tinder.video.p446c;

import android.content.Context;
import com.google.android.exoplayer2.extractor.ExtractorsFactory;
import com.google.android.exoplayer2.trackselection.TrackSelector;
import com.google.android.exoplayer2.upstream.DataSource;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.video.c.b */
public final class C18290b implements Factory<C15412a> {
    /* renamed from: a */
    private final Provider<DataSource.Factory> f56631a;
    /* renamed from: b */
    private final Provider<ExtractorsFactory> f56632b;
    /* renamed from: c */
    private final Provider<TrackSelector> f56633c;
    /* renamed from: d */
    private final Provider<Context> f56634d;

    public /* synthetic */ Object get() {
        return m66236a();
    }

    public C18290b(Provider<DataSource.Factory> provider, Provider<ExtractorsFactory> provider2, Provider<TrackSelector> provider3, Provider<Context> provider4) {
        this.f56631a = provider;
        this.f56632b = provider2;
        this.f56633c = provider3;
        this.f56634d = provider4;
    }

    /* renamed from: a */
    public C15412a m66236a() {
        return C18290b.m66234a(this.f56631a, this.f56632b, this.f56633c, this.f56634d);
    }

    /* renamed from: a */
    public static C15412a m66234a(Provider<DataSource.Factory> provider, Provider<ExtractorsFactory> provider2, Provider<TrackSelector> provider3, Provider<Context> provider4) {
        return new C15412a((DataSource.Factory) provider.get(), (ExtractorsFactory) provider2.get(), (TrackSelector) provider3.get(), (Context) provider4.get());
    }

    /* renamed from: b */
    public static C18290b m66235b(Provider<DataSource.Factory> provider, Provider<ExtractorsFactory> provider2, Provider<TrackSelector> provider3, Provider<Context> provider4) {
        return new C18290b(provider, provider2, provider3, provider4);
    }
}
