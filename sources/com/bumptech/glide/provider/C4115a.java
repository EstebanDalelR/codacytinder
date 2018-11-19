package com.bumptech.glide.provider;

import com.bumptech.glide.load.Encoder;
import com.bumptech.glide.load.ResourceDecoder;
import com.bumptech.glide.load.ResourceEncoder;
import com.bumptech.glide.load.model.ModelLoader;
import com.bumptech.glide.load.resource.transcode.ResourceTranscoder;
import java.io.File;

/* renamed from: com.bumptech.glide.provider.a */
public class C4115a<A, T, Z, R> implements LoadProvider<A, T, Z, R>, Cloneable {
    /* renamed from: a */
    private final LoadProvider<A, T, Z, R> f13001a;
    /* renamed from: b */
    private ResourceDecoder<File, Z> f13002b;
    /* renamed from: c */
    private ResourceDecoder<T, Z> f13003c;
    /* renamed from: d */
    private ResourceEncoder<Z> f13004d;
    /* renamed from: e */
    private ResourceTranscoder<Z, R> f13005e;
    /* renamed from: f */
    private Encoder<T> f13006f;

    public /* synthetic */ Object clone() throws CloneNotSupportedException {
        return m15992a();
    }

    public C4115a(LoadProvider<A, T, Z, R> loadProvider) {
        this.f13001a = loadProvider;
    }

    public ModelLoader<A, T> getModelLoader() {
        return this.f13001a.getModelLoader();
    }

    /* renamed from: a */
    public void m15994a(ResourceDecoder<T, Z> resourceDecoder) {
        this.f13003c = resourceDecoder;
    }

    /* renamed from: a */
    public void m15993a(Encoder<T> encoder) {
        this.f13006f = encoder;
    }

    public ResourceDecoder<File, Z> getCacheDecoder() {
        if (this.f13002b != null) {
            return this.f13002b;
        }
        return this.f13001a.getCacheDecoder();
    }

    public ResourceDecoder<T, Z> getSourceDecoder() {
        if (this.f13003c != null) {
            return this.f13003c;
        }
        return this.f13001a.getSourceDecoder();
    }

    public Encoder<T> getSourceEncoder() {
        if (this.f13006f != null) {
            return this.f13006f;
        }
        return this.f13001a.getSourceEncoder();
    }

    public ResourceEncoder<Z> getEncoder() {
        if (this.f13004d != null) {
            return this.f13004d;
        }
        return this.f13001a.getEncoder();
    }

    public ResourceTranscoder<Z, R> getTranscoder() {
        if (this.f13005e != null) {
            return this.f13005e;
        }
        return this.f13001a.getTranscoder();
    }

    /* renamed from: a */
    public C4115a<A, T, Z, R> m15992a() {
        try {
            return (C4115a) super.clone();
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
}
