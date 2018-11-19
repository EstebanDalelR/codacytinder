package okhttp3.internal.http2;

import okhttp3.internal.C15908c;
import okio.ByteString;

/* renamed from: okhttp3.internal.http2.a */
public final class C15929a {
    /* renamed from: a */
    public static final ByteString f49359a = ByteString.m60580a(":");
    /* renamed from: b */
    public static final ByteString f49360b = ByteString.m60580a(":status");
    /* renamed from: c */
    public static final ByteString f49361c = ByteString.m60580a(":method");
    /* renamed from: d */
    public static final ByteString f49362d = ByteString.m60580a(":path");
    /* renamed from: e */
    public static final ByteString f49363e = ByteString.m60580a(":scheme");
    /* renamed from: f */
    public static final ByteString f49364f = ByteString.m60580a(":authority");
    /* renamed from: g */
    public final ByteString f49365g;
    /* renamed from: h */
    public final ByteString f49366h;
    /* renamed from: i */
    final int f49367i;

    public C15929a(String str, String str2) {
        this(ByteString.m60580a(str), ByteString.m60580a(str2));
    }

    public C15929a(ByteString byteString, String str) {
        this(byteString, ByteString.m60580a(str));
    }

    public C15929a(ByteString byteString, ByteString byteString2) {
        this.f49365g = byteString;
        this.f49366h = byteString2;
        this.f49367i = (byteString.mo13431h() + 32) + byteString2.mo13431h();
    }

    public boolean equals(Object obj) {
        boolean z = false;
        if (!(obj instanceof C15929a)) {
            return false;
        }
        C15929a c15929a = (C15929a) obj;
        if (this.f49365g.equals(c15929a.f49365g) && this.f49366h.equals(c15929a.f49366h) != null) {
            z = true;
        }
        return z;
    }

    public int hashCode() {
        return ((527 + this.f49365g.hashCode()) * 31) + this.f49366h.hashCode();
    }

    public String toString() {
        return C15908c.m60157a("%s: %s", this.f49365g.mo13419a(), this.f49366h.mo13419a());
    }
}
