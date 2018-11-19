package com.tinder.utils;

import android.content.Context;
import com.bumptech.glide.C0994i;
import com.bumptech.glide.C0995j;
import com.bumptech.glide.integration.okhttp3.OkHttpUrlLoader.Factory;
import com.bumptech.glide.load.model.C1036d;
import com.bumptech.glide.module.GlideModule;
import com.tinder.managers.ManagerApp;
import java.io.InputStream;
import javax.inject.Inject;

public class OkHttpGlideModule implements GlideModule {
    @Inject
    /* renamed from: a */
    Factory f52809a;

    public void applyOptions(Context context, C0995j c0995j) {
    }

    public void registerComponents(Context context, C0994i c0994i) {
        ((ManagerApp) context.getApplicationContext()).h().inject(this);
        c0994i.a(C1036d.class, InputStream.class, this.f52809a);
    }
}
