package com.bumptech.glide.load.model;

import android.os.ParcelFileDescriptor;
import com.bumptech.glide.load.Encoder;
import java.io.InputStream;
import java.io.OutputStream;

/* renamed from: com.bumptech.glide.load.model.g */
public class C3059g implements Encoder<C1037f> {
    /* renamed from: a */
    private final Encoder<InputStream> f9516a;
    /* renamed from: b */
    private final Encoder<ParcelFileDescriptor> f9517b;
    /* renamed from: c */
    private String f9518c;

    public /* synthetic */ boolean encode(Object obj, OutputStream outputStream) {
        return m12006a((C1037f) obj, outputStream);
    }

    public C3059g(Encoder<InputStream> encoder, Encoder<ParcelFileDescriptor> encoder2) {
        this.f9516a = encoder;
        this.f9517b = encoder2;
    }

    /* renamed from: a */
    public boolean m12006a(C1037f c1037f, OutputStream outputStream) {
        if (c1037f.m3582a() != null) {
            return this.f9516a.encode(c1037f.m3582a(), outputStream);
        }
        return this.f9517b.encode(c1037f.m3583b(), outputStream);
    }

    public String getId() {
        if (this.f9518c == null) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(this.f9516a.getId());
            stringBuilder.append(this.f9517b.getId());
            this.f9518c = stringBuilder.toString();
        }
        return this.f9518c;
    }
}
