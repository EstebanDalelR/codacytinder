package com.bumptech.glide.load.resource.p030c;

import android.graphics.Bitmap;
import android.support.v7.widget.RecyclerView.ItemAnimator;
import com.bumptech.glide.load.ResourceDecoder;
import com.bumptech.glide.load.engine.Resource;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import com.bumptech.glide.load.model.C1037f;
import com.bumptech.glide.load.resource.bitmap.C3081b;
import com.bumptech.glide.load.resource.bitmap.ImageHeaderParser;
import com.bumptech.glide.load.resource.bitmap.ImageHeaderParser.ImageType;
import com.bumptech.glide.load.resource.bitmap.RecyclableBufferedInputStream;
import com.bumptech.glide.load.resource.gif.C3101b;
import com.bumptech.glide.p026d.C0979a;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.bumptech.glide.load.resource.c.c */
public class C3093c implements ResourceDecoder<C1037f, C1049a> {
    /* renamed from: a */
    private static final C1051b f9577a = new C1051b();
    /* renamed from: b */
    private static final C1050a f9578b = new C1050a();
    /* renamed from: c */
    private final ResourceDecoder<C1037f, Bitmap> f9579c;
    /* renamed from: d */
    private final ResourceDecoder<InputStream, C3101b> f9580d;
    /* renamed from: e */
    private final BitmapPool f9581e;
    /* renamed from: f */
    private final C1051b f9582f;
    /* renamed from: g */
    private final C1050a f9583g;
    /* renamed from: h */
    private String f9584h;

    /* renamed from: com.bumptech.glide.load.resource.c.c$a */
    static class C1050a {
        C1050a() {
        }

        /* renamed from: a */
        public InputStream m3626a(InputStream inputStream, byte[] bArr) {
            return new RecyclableBufferedInputStream(inputStream, bArr);
        }
    }

    /* renamed from: com.bumptech.glide.load.resource.c.c$b */
    static class C1051b {
        C1051b() {
        }

        /* renamed from: a */
        public ImageType m3627a(InputStream inputStream) throws IOException {
            return new ImageHeaderParser(inputStream).m3607b();
        }
    }

    public /* synthetic */ Resource decode(Object obj, int i, int i2) throws IOException {
        return m12051a((C1037f) obj, i, i2);
    }

    public C3093c(ResourceDecoder<C1037f, Bitmap> resourceDecoder, ResourceDecoder<InputStream, C3101b> resourceDecoder2, BitmapPool bitmapPool) {
        this(resourceDecoder, resourceDecoder2, bitmapPool, f9577a, f9578b);
    }

    C3093c(ResourceDecoder<C1037f, Bitmap> resourceDecoder, ResourceDecoder<InputStream, C3101b> resourceDecoder2, BitmapPool bitmapPool, C1051b c1051b, C1050a c1050a) {
        this.f9579c = resourceDecoder;
        this.f9580d = resourceDecoder2;
        this.f9581e = bitmapPool;
        this.f9582f = c1051b;
        this.f9583g = c1050a;
    }

    /* renamed from: a */
    public Resource<C1049a> m12051a(C1037f c1037f, int i, int i2) throws IOException {
        C0979a a = C0979a.m3383a();
        byte[] b = a.m3385b();
        try {
            c1037f = m12047a(c1037f, i, i2, b);
            return c1037f != null ? new C3092b(c1037f) : 0;
        } finally {
            a.m3384a(b);
        }
    }

    /* renamed from: a */
    private C1049a m12047a(C1037f c1037f, int i, int i2, byte[] bArr) throws IOException {
        if (c1037f.m3582a() != null) {
            return m12050b(c1037f, i, i2, bArr);
        }
        return m12049b(c1037f, i, i2);
    }

    /* renamed from: b */
    private C1049a m12050b(C1037f c1037f, int i, int i2, byte[] bArr) throws IOException {
        InputStream a = this.f9583g.m3626a(c1037f.m3582a(), bArr);
        a.mark(ItemAnimator.FLAG_MOVED);
        ImageType a2 = this.f9582f.m3627a(a);
        a.reset();
        C1049a a3 = a2 == ImageType.GIF ? m12048a(a, i, i2) : null;
        return a3 == null ? m12049b(new C1037f(a, c1037f.m3583b()), i, i2) : a3;
    }

    /* renamed from: a */
    private C1049a m12048a(InputStream inputStream, int i, int i2) throws IOException {
        inputStream = this.f9580d.decode(inputStream, i, i2);
        if (inputStream == null) {
            return 0;
        }
        C3101b c3101b = (C3101b) inputStream.get();
        if (c3101b.m12063e() > 1) {
            return new C1049a(null, inputStream);
        }
        return new C1049a(new C3081b(c3101b.m12060b(), this.f9581e), null);
    }

    /* renamed from: b */
    private C1049a m12049b(C1037f c1037f, int i, int i2) throws IOException {
        c1037f = this.f9579c.decode(c1037f, i, i2);
        if (c1037f != null) {
            return new C1049a(c1037f, null);
        }
        return null;
    }

    public String getId() {
        if (this.f9584h == null) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(this.f9580d.getId());
            stringBuilder.append(this.f9579c.getId());
            this.f9584h = stringBuilder.toString();
        }
        return this.f9584h;
    }
}
