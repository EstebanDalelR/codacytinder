package com.squareup.picasso;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import com.squareup.picasso.C6107q.C6106a;
import com.squareup.picasso.Picasso.LoadedFrom;
import java.io.IOException;

/* renamed from: com.squareup.picasso.r */
class C7258r extends C6107q {
    /* renamed from: a */
    private final Context f26159a;

    C7258r(Context context) {
        this.f26159a = context;
    }

    /* renamed from: a */
    public boolean mo6575a(C6104o c6104o) {
        if (c6104o.f22431e != 0) {
            return true;
        }
        return "android.resource".equals(c6104o.f22430d.getScheme());
    }

    /* renamed from: a */
    public C6106a mo6574a(C6104o c6104o, int i) throws IOException {
        Resources a = C6120v.m26567a(this.f26159a, c6104o);
        return new C6106a(C7258r.m31080a(a, C6120v.m26564a(a, c6104o), c6104o), LoadedFrom.DISK);
    }

    /* renamed from: a */
    private static Bitmap m31080a(Resources resources, int i, C6104o c6104o) {
        Options c = C6107q.m26538c(c6104o);
        if (C6107q.m26537a(c)) {
            BitmapFactory.decodeResource(resources, i, c);
            C6107q.m26536a(c6104o.f22434h, c6104o.f22435i, c, c6104o);
        }
        return BitmapFactory.decodeResource(resources, i, c);
    }
}
