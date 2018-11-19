package jp.wasabeef.glide.transformations;

import android.content.Context;
import android.graphics.Bitmap;
import com.bumptech.glide.C0994i;
import com.bumptech.glide.load.Transformation;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;

/* renamed from: jp.wasabeef.glide.transformations.a */
public class C17540a implements Transformation<Bitmap> {
    /* renamed from: a */
    private static int f54716a = 25;
    /* renamed from: b */
    private static int f54717b = 1;
    /* renamed from: c */
    private Context f54718c;
    /* renamed from: d */
    private BitmapPool f54719d;
    /* renamed from: e */
    private int f54720e;
    /* renamed from: f */
    private int f54721f;

    public C17540a(Context context) {
        this(context, C0994i.a(context).a(), f54716a, f54717b);
    }

    public C17540a(Context context, BitmapPool bitmapPool, int i, int i2) {
        this.f54718c = context.getApplicationContext();
        this.f54719d = bitmapPool;
        this.f54720e = i;
        this.f54721f = i2;
    }

    public com.bumptech.glide.load.engine.Resource<android.graphics.Bitmap> transform(com.bumptech.glide.load.engine.Resource<android.graphics.Bitmap> r4, int r5, int r6) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r3 = this;
        r4 = r4.get();
        r4 = (android.graphics.Bitmap) r4;
        r5 = r4.getWidth();
        r6 = r4.getHeight();
        r0 = r3.f54721f;
        r5 = r5 / r0;
        r0 = r3.f54721f;
        r6 = r6 / r0;
        r0 = r3.f54719d;
        r1 = android.graphics.Bitmap.Config.ARGB_8888;
        r0 = r0.get(r5, r6, r1);
        if (r0 != 0) goto L_0x0024;
    L_0x001e:
        r0 = android.graphics.Bitmap.Config.ARGB_8888;
        r0 = android.graphics.Bitmap.createBitmap(r5, r6, r0);
    L_0x0024:
        r5 = new android.graphics.Canvas;
        r5.<init>(r0);
        r6 = r3.f54721f;
        r6 = (float) r6;
        r1 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        r6 = r1 / r6;
        r2 = r3.f54721f;
        r2 = (float) r2;
        r1 = r1 / r2;
        r5.scale(r6, r1);
        r6 = new android.graphics.Paint;
        r6.<init>();
        r1 = 2;
        r6.setFlags(r1);
        r1 = 0;
        r5.drawBitmap(r4, r1, r1, r6);
        r4 = android.os.Build.VERSION.SDK_INT;
        r5 = 18;
        r6 = 1;
        if (r4 < r5) goto L_0x005b;
    L_0x004b:
        r4 = r3.f54718c;	 Catch:{ RSRuntimeException -> 0x0054 }
        r5 = r3.f54720e;	 Catch:{ RSRuntimeException -> 0x0054 }
        r4 = jp.wasabeef.glide.transformations.p457b.C15796b.m59802a(r4, r0, r5);	 Catch:{ RSRuntimeException -> 0x0054 }
        goto L_0x0061;
    L_0x0054:
        r4 = r3.f54720e;
        r4 = jp.wasabeef.glide.transformations.p457b.C15795a.m59801a(r0, r4, r6);
        goto L_0x0061;
    L_0x005b:
        r4 = r3.f54720e;
        r4 = jp.wasabeef.glide.transformations.p457b.C15795a.m59801a(r0, r4, r6);
    L_0x0061:
        r5 = r3.f54719d;
        r4 = com.bumptech.glide.load.resource.bitmap.C3081b.a(r4, r5);
        return r4;
        */
        throw new UnsupportedOperationException("Method not decompiled: jp.wasabeef.glide.transformations.a.transform(com.bumptech.glide.load.engine.Resource, int, int):com.bumptech.glide.load.engine.Resource<android.graphics.Bitmap>");
    }

    public String getId() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("BlurTransformation(radius=");
        stringBuilder.append(this.f54720e);
        stringBuilder.append(", sampling=");
        stringBuilder.append(this.f54721f);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}
