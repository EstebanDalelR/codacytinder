package com.bumptech.glide.integration.okhttp3;

import android.content.Context;
import com.bumptech.glide.C0994i;
import com.bumptech.glide.C0995j;
import com.bumptech.glide.integration.okhttp3.OkHttpUrlLoader.Factory;
import com.bumptech.glide.load.model.C1036d;
import com.bumptech.glide.module.GlideModule;
import java.io.InputStream;

public class OkHttpGlideModule implements GlideModule {
    public void applyOptions(Context context, C0995j c0995j) {
    }

    public void registerComponents(Context context, C0994i c0994i) {
        c0994i.m3494a(C1036d.class, InputStream.class, new Factory());
    }
}
