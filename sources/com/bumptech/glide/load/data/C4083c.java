package com.bumptech.glide.load.data;

import android.content.res.AssetManager;
import android.os.ParcelFileDescriptor;
import java.io.IOException;

/* renamed from: com.bumptech.glide.load.data.c */
public class C4083c extends C3022a<ParcelFileDescriptor> {
    /* renamed from: a */
    protected /* synthetic */ Object mo3180a(AssetManager assetManager, String str) throws IOException {
        return m15931b(assetManager, str);
    }

    public C4083c(AssetManager assetManager, String str) {
        super(assetManager, str);
    }

    /* renamed from: b */
    protected ParcelFileDescriptor m15931b(AssetManager assetManager, String str) throws IOException {
        return assetManager.openFd(str).getParcelFileDescriptor();
    }

    /* renamed from: a */
    protected void m15929a(ParcelFileDescriptor parcelFileDescriptor) throws IOException {
        parcelFileDescriptor.close();
    }
}
