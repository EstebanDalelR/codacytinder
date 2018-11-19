package com.squareup.picasso;

import android.content.Context;
import android.media.ExifInterface;
import android.net.Uri;
import com.squareup.picasso.C6107q.C6106a;
import com.squareup.picasso.Picasso.LoadedFrom;
import com.tinder.api.ManagerWebServices;
import java.io.IOException;

/* renamed from: com.squareup.picasso.h */
class C7950h extends C7254e {
    C7950h(Context context) {
        super(context);
    }

    /* renamed from: a */
    public boolean mo6575a(C6104o c6104o) {
        return ManagerWebServices.PARAM_FILE.equals(c6104o.f22430d.getScheme());
    }

    /* renamed from: a */
    public C6106a mo6574a(C6104o c6104o, int i) throws IOException {
        return new C6106a(null, m31072b(c6104o), LoadedFrom.DISK, C7950h.m33811a(c6104o.f22430d));
    }

    /* renamed from: a */
    static int m33811a(Uri uri) throws IOException {
        uri = new ExifInterface(uri.getPath()).getAttributeInt("Orientation", 1);
        if (uri == 3) {
            return 180;
        }
        if (uri != 6) {
            return uri != 8 ? null : 270;
        } else {
            return 90;
        }
    }
}
