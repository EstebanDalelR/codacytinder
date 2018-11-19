package com.squareup.picasso;

import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory.Options;
import android.provider.MediaStore.Images;
import android.provider.MediaStore.Video.Thumbnails;
import com.squareup.picasso.C6107q.C6106a;
import com.squareup.picasso.Picasso.LoadedFrom;
import com.tinder.api.ManagerWebServices;
import java.io.IOException;

class MediaStoreRequestHandler extends C7254e {
    /* renamed from: b */
    private static final String[] f28557b = new String[]{"orientation"};

    enum PicassoKind {
        MICRO(3, 96, 96),
        MINI(1, 512, 384),
        FULL(2, -1, -1);
        
        final int androidKind;
        final int height;
        final int width;

        private PicassoKind(int i, int i2, int i3) {
            this.androidKind = i;
            this.width = i2;
            this.height = i3;
        }
    }

    MediaStoreRequestHandler(Context context) {
        super(context);
    }

    /* renamed from: a */
    public boolean mo6575a(C6104o c6104o) {
        c6104o = c6104o.f22430d;
        return (!"content".equals(c6104o.getScheme()) || ManagerWebServices.PARAM_MEDIA.equals(c6104o.getAuthority()) == null) ? null : true;
    }

    /* renamed from: a */
    public C6106a mo6574a(C6104o c6104o, int i) throws IOException {
        C6104o c6104o2 = c6104o;
        ContentResolver contentResolver = this.a.getContentResolver();
        int a = m33807a(contentResolver, c6104o2.f22430d);
        String type = contentResolver.getType(c6104o2.f22430d);
        Object obj = (type == null || !type.startsWith("video/")) ? null : 1;
        if (c6104o.m26520d()) {
            PicassoKind a2 = m33808a(c6104o2.f22434h, c6104o2.f22435i);
            if (obj == null && a2 == PicassoKind.FULL) {
                return new C6106a(null, m31072b(c6104o), LoadedFrom.DISK, a);
            }
            Bitmap thumbnail;
            long parseId = ContentUris.parseId(c6104o2.f22430d);
            Options c = C6107q.m26538c(c6104o);
            c.inJustDecodeBounds = true;
            Options options = c;
            C6107q.m26535a(c6104o2.f22434h, c6104o2.f22435i, a2.width, a2.height, c, c6104o2);
            if (obj != null) {
                thumbnail = Thumbnails.getThumbnail(contentResolver, parseId, a2 == PicassoKind.FULL ? 1 : a2.androidKind, options);
            } else {
                thumbnail = Images.Thumbnails.getThumbnail(contentResolver, parseId, a2.androidKind, options);
            }
            if (thumbnail != null) {
                return new C6106a(thumbnail, null, LoadedFrom.DISK, a);
            }
        }
        return new C6106a(null, m31072b(c6104o), LoadedFrom.DISK, a);
    }

    /* renamed from: a */
    static PicassoKind m33808a(int i, int i2) {
        if (i <= PicassoKind.MICRO.width && i2 <= PicassoKind.MICRO.height) {
            return PicassoKind.MICRO;
        }
        if (i > PicassoKind.MINI.width || i2 > PicassoKind.MINI.height) {
            return PicassoKind.FULL;
        }
        return PicassoKind.MINI;
    }

    /* renamed from: a */
    static int m33807a(android.content.ContentResolver r8, android.net.Uri r9) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r0 = 0;
        r1 = 0;
        r4 = f28557b;	 Catch:{ RuntimeException -> 0x0030, all -> 0x0028 }
        r5 = 0;	 Catch:{ RuntimeException -> 0x0030, all -> 0x0028 }
        r6 = 0;	 Catch:{ RuntimeException -> 0x0030, all -> 0x0028 }
        r7 = 0;	 Catch:{ RuntimeException -> 0x0030, all -> 0x0028 }
        r2 = r8;	 Catch:{ RuntimeException -> 0x0030, all -> 0x0028 }
        r3 = r9;	 Catch:{ RuntimeException -> 0x0030, all -> 0x0028 }
        r8 = r2.query(r3, r4, r5, r6, r7);	 Catch:{ RuntimeException -> 0x0030, all -> 0x0028 }
        if (r8 == 0) goto L_0x0022;
    L_0x000f:
        r9 = r8.moveToFirst();	 Catch:{ RuntimeException -> 0x0031, all -> 0x0020 }
        if (r9 != 0) goto L_0x0016;	 Catch:{ RuntimeException -> 0x0031, all -> 0x0020 }
    L_0x0015:
        goto L_0x0022;	 Catch:{ RuntimeException -> 0x0031, all -> 0x0020 }
    L_0x0016:
        r9 = r8.getInt(r0);	 Catch:{ RuntimeException -> 0x0031, all -> 0x0020 }
        if (r8 == 0) goto L_0x001f;
    L_0x001c:
        r8.close();
    L_0x001f:
        return r9;
    L_0x0020:
        r9 = move-exception;
        goto L_0x002a;
    L_0x0022:
        if (r8 == 0) goto L_0x0027;
    L_0x0024:
        r8.close();
    L_0x0027:
        return r0;
    L_0x0028:
        r9 = move-exception;
        r8 = r1;
    L_0x002a:
        if (r8 == 0) goto L_0x002f;
    L_0x002c:
        r8.close();
    L_0x002f:
        throw r9;
    L_0x0030:
        r8 = r1;
    L_0x0031:
        if (r8 == 0) goto L_0x0036;
    L_0x0033:
        r8.close();
    L_0x0036:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.picasso.MediaStoreRequestHandler.a(android.content.ContentResolver, android.net.Uri):int");
    }
}
