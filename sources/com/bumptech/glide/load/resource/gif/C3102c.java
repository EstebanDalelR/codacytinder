package com.bumptech.glide.load.resource.gif;

import android.content.Context;
import com.bumptech.glide.load.Encoder;
import com.bumptech.glide.load.ResourceDecoder;
import com.bumptech.glide.load.ResourceEncoder;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import com.bumptech.glide.load.model.C3064k;
import com.bumptech.glide.load.resource.p029b.C3078c;
import com.bumptech.glide.provider.DataLoadProvider;
import java.io.File;
import java.io.InputStream;

/* renamed from: com.bumptech.glide.load.resource.gif.c */
public class C3102c implements DataLoadProvider<InputStream, C3101b> {
    /* renamed from: a */
    private final C3107h f9608a;
    /* renamed from: b */
    private final C4111i f9609b;
    /* renamed from: c */
    private final C3064k f9610c;
    /* renamed from: d */
    private final C3078c<C3101b> f9611d = new C3078c(this.f9608a);

    public C3102c(Context context, BitmapPool bitmapPool) {
        this.f9608a = new C3107h(context, bitmapPool);
        this.f9609b = new C4111i(bitmapPool);
        this.f9610c = new C3064k();
    }

    public ResourceDecoder<File, C3101b> getCacheDecoder() {
        return this.f9611d;
    }

    public ResourceDecoder<InputStream, C3101b> getSourceDecoder() {
        return this.f9608a;
    }

    public Encoder<InputStream> getSourceEncoder() {
        return this.f9610c;
    }

    public ResourceEncoder<C3101b> getEncoder() {
        return this.f9609b;
    }
}
