package com.bumptech.glide.provider;

import com.bumptech.glide.load.Encoder;
import com.bumptech.glide.load.ResourceDecoder;
import com.bumptech.glide.load.ResourceEncoder;
import com.bumptech.glide.load.model.ModelLoader;
import com.bumptech.glide.load.resource.transcode.ResourceTranscoder;
import java.io.File;

/* renamed from: com.bumptech.glide.provider.d */
public class C4116d<A, T, Z, R> implements LoadProvider<A, T, Z, R> {
    /* renamed from: a */
    private final ModelLoader<A, T> f13007a;
    /* renamed from: b */
    private final ResourceTranscoder<Z, R> f13008b;
    /* renamed from: c */
    private final DataLoadProvider<T, Z> f13009c;

    public C4116d(ModelLoader<A, T> modelLoader, ResourceTranscoder<Z, R> resourceTranscoder, DataLoadProvider<T, Z> dataLoadProvider) {
        if (modelLoader == null) {
            throw new NullPointerException("ModelLoader must not be null");
        }
        this.f13007a = modelLoader;
        if (resourceTranscoder == null) {
            throw new NullPointerException("Transcoder must not be null");
        }
        this.f13008b = resourceTranscoder;
        if (dataLoadProvider == null) {
            throw new NullPointerException("DataLoadProvider must not be null");
        }
        this.f13009c = dataLoadProvider;
    }

    public ModelLoader<A, T> getModelLoader() {
        return this.f13007a;
    }

    public ResourceTranscoder<Z, R> getTranscoder() {
        return this.f13008b;
    }

    public ResourceDecoder<File, Z> getCacheDecoder() {
        return this.f13009c.getCacheDecoder();
    }

    public ResourceDecoder<T, Z> getSourceDecoder() {
        return this.f13009c.getSourceDecoder();
    }

    public Encoder<T> getSourceEncoder() {
        return this.f13009c.getSourceEncoder();
    }

    public ResourceEncoder<Z> getEncoder() {
        return this.f13009c.getEncoder();
    }
}
