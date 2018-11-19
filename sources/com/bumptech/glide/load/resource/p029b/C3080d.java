package com.bumptech.glide.load.resource.p029b;

import com.bumptech.glide.load.Encoder;
import com.bumptech.glide.load.ResourceDecoder;
import com.bumptech.glide.load.ResourceEncoder;
import com.bumptech.glide.load.engine.Resource;
import com.bumptech.glide.load.model.C3064k;
import com.bumptech.glide.load.resource.C4101b;
import com.bumptech.glide.provider.DataLoadProvider;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.bumptech.glide.load.resource.b.d */
public class C3080d implements DataLoadProvider<InputStream, File> {
    /* renamed from: a */
    private static final C3079a f9535a = new C3079a();
    /* renamed from: b */
    private final ResourceDecoder<File, File> f9536b = new C3077a();
    /* renamed from: c */
    private final Encoder<InputStream> f9537c = new C3064k();

    /* renamed from: com.bumptech.glide.load.resource.b.d$a */
    private static class C3079a implements ResourceDecoder<InputStream, File> {
        public String getId() {
            return "";
        }

        private C3079a() {
        }

        public /* synthetic */ Resource decode(Object obj, int i, int i2) throws IOException {
            return m12023a((InputStream) obj, i, i2);
        }

        /* renamed from: a */
        public Resource<File> m12023a(InputStream inputStream, int i, int i2) {
            throw new Error("You cannot decode a File from an InputStream by default, try either #diskCacheStratey(DiskCacheStrategy.SOURCE) to avoid this call or #decoder(ResourceDecoder) to replace this Decoder");
        }
    }

    public ResourceDecoder<File, File> getCacheDecoder() {
        return this.f9536b;
    }

    public ResourceDecoder<InputStream, File> getSourceDecoder() {
        return f9535a;
    }

    public Encoder<InputStream> getSourceEncoder() {
        return this.f9537c;
    }

    public ResourceEncoder<File> getEncoder() {
        return C4101b.m15963a();
    }
}
