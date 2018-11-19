package com.bumptech.glide.load.resource.p029b;

import com.bumptech.glide.load.ResourceDecoder;
import com.bumptech.glide.load.engine.Resource;
import java.io.File;
import java.io.IOException;

/* renamed from: com.bumptech.glide.load.resource.b.a */
public class C3077a implements ResourceDecoder<File, File> {
    public String getId() {
        return "";
    }

    public /* synthetic */ Resource decode(Object obj, int i, int i2) throws IOException {
        return m12021a((File) obj, i, i2);
    }

    /* renamed from: a */
    public Resource<File> m12021a(File file, int i, int i2) {
        return new C4100b(file);
    }
}
