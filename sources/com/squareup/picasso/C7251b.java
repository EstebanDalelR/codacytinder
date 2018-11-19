package com.squareup.picasso;

import android.content.Context;
import android.content.res.AssetManager;
import com.squareup.picasso.C6107q.C6106a;
import com.squareup.picasso.Picasso.LoadedFrom;
import com.tinder.api.ManagerWebServices;
import java.io.IOException;

/* renamed from: com.squareup.picasso.b */
class C7251b extends C6107q {
    /* renamed from: a */
    private static final int f26145a = "file:///android_asset/".length();
    /* renamed from: b */
    private final AssetManager f26146b;

    public C7251b(Context context) {
        this.f26146b = context.getAssets();
    }

    /* renamed from: a */
    public boolean mo6575a(C6104o c6104o) {
        c6104o = c6104o.f22430d;
        if (!ManagerWebServices.PARAM_FILE.equals(c6104o.getScheme()) || c6104o.getPathSegments().isEmpty() || "android_asset".equals(c6104o.getPathSegments().get(0)) == null) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public C6106a mo6574a(C6104o c6104o, int i) throws IOException {
        return new C6106a(this.f26146b.open(C7251b.m31062b(c6104o)), LoadedFrom.DISK);
    }

    /* renamed from: b */
    static String m31062b(C6104o c6104o) {
        return c6104o.f22430d.toString().substring(f26145a);
    }
}
