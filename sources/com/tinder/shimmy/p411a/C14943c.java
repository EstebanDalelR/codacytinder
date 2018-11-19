package com.tinder.shimmy.p411a;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000a.p001a.C0001a;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J \u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\tJ \u0010\n\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\tH\u0002¨\u0006\u000b"}, d2 = {"Lcom/tinder/shimmy/utils/SafeBitmapFactory;", "", "()V", "create", "Landroid/graphics/Bitmap;", "width", "", "height", "bitmapConfig", "Landroid/graphics/Bitmap$Config;", "createBitmapAndGcIfNecessary", "shimmy_release"}, k = 1, mv = {1, 1, 9})
/* renamed from: com.tinder.shimmy.a.c */
public final class C14943c {
    @Nullable
    /* renamed from: a */
    public final Bitmap m56449a(int i, int i2, @NotNull Config config) {
        C2668g.b(config, "bitmapConfig");
        if (i != 0) {
            if (i2 != 0) {
                try {
                    return m56448b(i, i2, config);
                } catch (int i3) {
                    C0001a.c(i3);
                    return null;
                }
            }
        }
        return null;
    }

    /* renamed from: b */
    private final android.graphics.Bitmap m56448b(int r3, int r4, android.graphics.Bitmap.Config r5) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r2 = this;
        r0 = android.graphics.Bitmap.createBitmap(r3, r4, r5);	 Catch:{ OutOfMemoryError -> 0x000a }
        r1 = "Bitmap.createBitmap(width, height, bitmapConfig)";	 Catch:{ OutOfMemoryError -> 0x000a }
        kotlin.jvm.internal.C2668g.a(r0, r1);	 Catch:{ OutOfMemoryError -> 0x000a }
        return r0;
    L_0x000a:
        java.lang.System.gc();
        r3 = android.graphics.Bitmap.createBitmap(r3, r4, r5);
        r4 = "Bitmap.createBitmap(width, height, bitmapConfig)";
        kotlin.jvm.internal.C2668g.a(r3, r4);
        return r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tinder.shimmy.a.c.b(int, int, android.graphics.Bitmap$Config):android.graphics.Bitmap");
    }
}
