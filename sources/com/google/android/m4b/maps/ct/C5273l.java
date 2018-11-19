package com.google.android.m4b.maps.ct;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* renamed from: com.google.android.m4b.maps.ct.l */
public final class C5273l {
    /* renamed from: a */
    protected static final Charset f19591a = Charset.forName("UTF-8");
    /* renamed from: b */
    public static final byte[] f19592b;
    /* renamed from: c */
    public static final C5257e f19593c;
    /* renamed from: d */
    private static Charset f19594d = Charset.forName("ISO-8859-1");
    /* renamed from: e */
    private static ByteBuffer f19595e;

    /* renamed from: com.google.android.m4b.maps.ct.l$a */
    public interface C5271a {
        /* renamed from: a */
        int m23406a();
    }

    /* renamed from: com.google.android.m4b.maps.ct.l$b */
    public interface C5272b<T extends C5271a> {
        /* renamed from: a */
        T m23407a();
    }

    /* renamed from: a */
    static boolean m23408a(C6656q c6656q) {
        return false;
    }

    static {
        byte[] bArr = new byte[0];
        f19592b = bArr;
        f19595e = ByteBuffer.wrap(bArr);
        bArr = f19592b;
        f19593c = C5257e.m23281a(bArr, 0, bArr.length);
    }
}
