package com.squareup.picasso;

import android.content.Context;
import com.squareup.picasso.C6107q.C6106a;
import com.squareup.picasso.Picasso.LoadedFrom;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.squareup.picasso.e */
class C7254e extends C6107q {
    /* renamed from: a */
    final Context f26149a;

    C7254e(Context context) {
        this.f26149a = context;
    }

    /* renamed from: a */
    public boolean mo6575a(C6104o c6104o) {
        return "content".equals(c6104o.f22430d.getScheme());
    }

    /* renamed from: a */
    public C6106a mo6574a(C6104o c6104o, int i) throws IOException {
        return new C6106a(m31072b(c6104o), LoadedFrom.DISK);
    }

    /* renamed from: b */
    InputStream m31072b(C6104o c6104o) throws FileNotFoundException {
        return this.f26149a.getContentResolver().openInputStream(c6104o.f22430d);
    }
}
