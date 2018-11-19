package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.util.Log;
import com.bumptech.glide.load.ResourceEncoder;
import com.bumptech.glide.load.engine.Resource;
import com.bumptech.glide.p026d.C0982d;
import com.bumptech.glide.p026d.C0987h;
import java.io.OutputStream;

/* renamed from: com.bumptech.glide.load.resource.bitmap.a */
public class C4102a implements ResourceEncoder<Bitmap> {
    /* renamed from: a */
    private CompressFormat f12981a;
    /* renamed from: b */
    private int f12982b;

    public String getId() {
        return "BitmapEncoder.com.bumptech.glide.load.resource.bitmap";
    }

    public /* synthetic */ boolean encode(Object obj, OutputStream outputStream) {
        return m15966a((Resource) obj, outputStream);
    }

    public C4102a() {
        this(null, 90);
    }

    public C4102a(CompressFormat compressFormat, int i) {
        this.f12981a = compressFormat;
        this.f12982b = i;
    }

    /* renamed from: a */
    public boolean m15966a(Resource<Bitmap> resource, OutputStream outputStream) {
        Bitmap bitmap = (Bitmap) resource.get();
        long a = C0982d.m3393a();
        CompressFormat a2 = m15965a(bitmap);
        bitmap.compress(a2, this.f12982b, outputStream);
        if (Log.isLoggable("BitmapEncoder", 2) != null) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Compressed with type: ");
            stringBuilder.append(a2);
            stringBuilder.append(" of size ");
            stringBuilder.append(C0987h.m3406a(bitmap));
            stringBuilder.append(" in ");
            stringBuilder.append(C0982d.m3392a(a));
            Log.v("BitmapEncoder", stringBuilder.toString());
        }
        return true;
    }

    /* renamed from: a */
    private CompressFormat m15965a(Bitmap bitmap) {
        if (this.f12981a != null) {
            return this.f12981a;
        }
        if (bitmap.hasAlpha() != null) {
            return CompressFormat.PNG;
        }
        return CompressFormat.JPEG;
    }
}
