package com.bumptech.glide.load.data;

import com.bumptech.glide.Priority;
import java.io.ByteArrayInputStream;
import java.io.InputStream;

/* renamed from: com.bumptech.glide.load.data.b */
public class C3023b implements DataFetcher<InputStream> {
    /* renamed from: a */
    private final byte[] f9422a;
    /* renamed from: b */
    private final String f9423b;

    public void cancel() {
    }

    public void cleanup() {
    }

    public /* synthetic */ Object loadData(Priority priority) throws Exception {
        return m11924a(priority);
    }

    public C3023b(byte[] bArr, String str) {
        this.f9422a = bArr;
        this.f9423b = str;
    }

    /* renamed from: a */
    public InputStream m11924a(Priority priority) {
        return new ByteArrayInputStream(this.f9422a);
    }

    public String getId() {
        return this.f9423b;
    }
}
