package com.snapchat.kit.sdk.bitmoji;

import android.content.Context;
import com.snapchat.kit.sdk.bitmoji.dagger.scope.BitmojiScope;
import com.snapchat.kit.sdk.bitmoji.networking.C7864c;
import com.squareup.okhttp.C5997b;
import com.squareup.okhttp.C6068p;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.Picasso.C6080a;
import com.tinder.domain.fastmatch.model.DefaultFastMatchValues;
import dagger.Module;
import dagger.Provides;
import java.io.File;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import javax.inject.Named;

@Module
/* renamed from: com.snapchat.kit.sdk.bitmoji.b */
public class C5894b {
    @BitmojiScope
    @Provides
    /* renamed from: a */
    C5997b m25437a(Context context, @Named("bitmoji-cache") File file) {
        return new C5997b(file, C5894b.m25436b(context));
    }

    @Provides
    /* renamed from: a */
    C6068p m25438a(C5997b c5997b) {
        C6068p c6068p = new C6068p();
        c6068p.m26295a(15000, TimeUnit.MILLISECONDS);
        c6068p.m26297b(DefaultFastMatchValues.NEW_COUNT_FETCH_INTERVAL, TimeUnit.MILLISECONDS);
        c6068p.m26299c(DefaultFastMatchValues.NEW_COUNT_FETCH_INTERVAL, TimeUnit.MILLISECONDS);
        c6068p.m26294a(c5997b);
        return c6068p;
    }

    @BitmojiScope
    @Provides
    /* renamed from: a */
    Picasso m25439a(Context context, C7864c c7864c) {
        return new C6080a(context.getApplicationContext()).m26421a(c7864c).m26422a();
    }

    @Provides
    /* renamed from: a */
    Random m25441a() {
        return new Random();
    }

    @Provides
    @Named("bitmoji-cache")
    /* renamed from: a */
    File m25440a(Context context) {
        File file = new File(context.getApplicationContext().getCacheDir(), "bitmoji-cache");
        if (file.exists() == null) {
            file.mkdirs();
        }
        return file;
    }

    @Provides
    /* renamed from: b */
    ExecutorService m25442b() {
        return Executors.newSingleThreadExecutor();
    }

    /* renamed from: b */
    private static long m25436b(android.content.Context r4) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r0 = 52428800; // 0x3200000 float:4.7019774E-37 double:2.5903269E-316;
        r2 = r4.getPackageManager();	 Catch:{ NameNotFoundException -> 0x001d }
        r4 = r4.getPackageName();	 Catch:{ NameNotFoundException -> 0x001d }
        r3 = 128; // 0x80 float:1.794E-43 double:6.32E-322;	 Catch:{ NameNotFoundException -> 0x001d }
        r4 = r2.getApplicationInfo(r4, r3);	 Catch:{ NameNotFoundException -> 0x001d }
        r4 = r4.metaData;	 Catch:{ NameNotFoundException -> 0x001d }
        if (r4 != 0) goto L_0x0016;	 Catch:{ NameNotFoundException -> 0x001d }
    L_0x0015:
        return r0;	 Catch:{ NameNotFoundException -> 0x001d }
    L_0x0016:
        r2 = "com.snapchat.connect.sdk.bitmoji.cacheSize";	 Catch:{ NameNotFoundException -> 0x001d }
        r2 = r4.getLong(r2, r0);	 Catch:{ NameNotFoundException -> 0x001d }
        return r2;
    L_0x001d:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.snapchat.kit.sdk.bitmoji.b.b(android.content.Context):long");
    }
}
