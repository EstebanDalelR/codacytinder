package com.bumptech.glide.load.data;

import android.content.res.AssetManager;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.bumptech.glide.load.data.g */
public class C4085g extends C3022a<InputStream> {
    /* renamed from: a */
    protected /* synthetic */ Object mo3180a(AssetManager assetManager, String str) throws IOException {
        return m15939b(assetManager, str);
    }

    public C4085g(AssetManager assetManager, String str) {
        super(assetManager, str);
    }

    /* renamed from: b */
    protected InputStream m15939b(AssetManager assetManager, String str) throws IOException {
        return assetManager.open(str);
    }

    /* renamed from: a */
    protected void m15937a(InputStream inputStream) throws IOException {
        inputStream.close();
    }
}
