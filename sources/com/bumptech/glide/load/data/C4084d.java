package com.bumptech.glide.load.data;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import java.io.FileNotFoundException;
import java.io.IOException;

/* renamed from: com.bumptech.glide.load.data.d */
public class C4084d extends C3026f<ParcelFileDescriptor> {
    /* renamed from: b */
    protected /* synthetic */ Object mo3183b(Uri uri, ContentResolver contentResolver) throws FileNotFoundException {
        return m15932a(uri, contentResolver);
    }

    public C4084d(Context context, Uri uri) {
        super(context, uri);
    }

    /* renamed from: a */
    protected ParcelFileDescriptor m15932a(Uri uri, ContentResolver contentResolver) throws FileNotFoundException {
        return contentResolver.openAssetFileDescriptor(uri, "r").getParcelFileDescriptor();
    }

    /* renamed from: a */
    protected void m15933a(ParcelFileDescriptor parcelFileDescriptor) throws IOException {
        parcelFileDescriptor.close();
    }
}
