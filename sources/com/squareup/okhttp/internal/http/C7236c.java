package com.squareup.okhttp.internal.http;

import com.squareup.okhttp.C6066n;
import com.squareup.okhttp.C6066n.C6065a;
import com.squareup.okhttp.C6071q;
import com.squareup.okhttp.C6075s;
import com.squareup.okhttp.C6075s.C6074a;
import com.squareup.okhttp.C6076t;
import com.squareup.okhttp.Protocol;
import com.squareup.okhttp.internal.C6058i;
import com.squareup.okhttp.internal.framed.C6025a;
import com.squareup.okhttp.internal.framed.C6027b;
import com.squareup.okhttp.internal.framed.C6028c;
import com.squareup.okhttp.internal.framed.ErrorCode;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import okio.ByteString;
import okio.C15976k;
import okio.Sink;

/* renamed from: com.squareup.okhttp.internal.http.c */
public final class C7236c implements Transport {
    /* renamed from: a */
    private static final ByteString f26100a = ByteString.a("connection");
    /* renamed from: b */
    private static final ByteString f26101b = ByteString.a("host");
    /* renamed from: c */
    private static final ByteString f26102c = ByteString.a("keep-alive");
    /* renamed from: d */
    private static final ByteString f26103d = ByteString.a("proxy-connection");
    /* renamed from: e */
    private static final ByteString f26104e = ByteString.a("transfer-encoding");
    /* renamed from: f */
    private static final ByteString f26105f = ByteString.a("te");
    /* renamed from: g */
    private static final ByteString f26106g = ByteString.a("encoding");
    /* renamed from: h */
    private static final ByteString f26107h = ByteString.a("upgrade");
    /* renamed from: i */
    private static final List<ByteString> f26108i = C6058i.m26241a(f26100a, f26101b, f26102c, f26103d, f26104e, C6028c.f22092b, C6028c.f22093c, C6028c.f22094d, C6028c.f22095e, C6028c.f22096f, C6028c.f22097g);
    /* renamed from: j */
    private static final List<ByteString> f26109j = C6058i.m26241a(f26100a, f26101b, f26102c, f26103d, f26104e);
    /* renamed from: k */
    private static final List<ByteString> f26110k = C6058i.m26241a(f26100a, f26101b, f26102c, f26103d, f26105f, f26104e, f26106g, f26107h, C6028c.f22092b, C6028c.f22093c, C6028c.f22094d, C6028c.f22095e, C6028c.f22096f, C6028c.f22097g);
    /* renamed from: l */
    private static final List<ByteString> f26111l = C6058i.m26241a(f26100a, f26101b, f26102c, f26103d, f26105f, f26104e, f26106g, f26107h);
    /* renamed from: m */
    private final C6050g f26112m;
    /* renamed from: n */
    private final C6025a f26113n;
    /* renamed from: o */
    private C6027b f26114o;

    public boolean canReuseConnection() {
        return true;
    }

    public void releaseConnectionOnIdle() {
    }

    public C7236c(C6050g c6050g, C6025a c6025a) {
        this.f26112m = c6050g;
        this.f26113n = c6025a;
    }

    public Sink createRequestBody(C6071q c6071q, long j) throws IOException {
        return this.f26114o.m26048g();
    }

    public void writeRequestHeaders(C6071q c6071q) throws IOException {
        if (this.f26114o == null) {
            List b;
            this.f26112m.m26191b();
            boolean a = this.f26112m.m26190a(c6071q);
            if (this.f26113n.m26010a() == Protocol.HTTP_2) {
                b = C7236c.m31030b(c6071q);
            } else {
                b = C7236c.m31028a(c6071q);
            }
            this.f26114o = this.f26113n.m26012a(b, a, true);
            this.f26114o.m26046e().a((long) this.f26112m.f22166a.m26296b(), TimeUnit.MILLISECONDS);
        }
    }

    public void writeRequestBody(C7245m c7245m) throws IOException {
        c7245m.m31041a(this.f26114o.m26048g());
    }

    public void finishRequest() throws IOException {
        this.f26114o.m26048g().close();
    }

    public C6074a readResponseHeaders() throws IOException {
        if (this.f26113n.m26010a() == Protocol.HTTP_2) {
            return C7236c.m31029b(this.f26114o.m26045d());
        }
        return C7236c.m31026a(this.f26114o.m26045d());
    }

    /* renamed from: a */
    public static List<C6028c> m31028a(C6071q c6071q) {
        C6066n e = c6071q.m26349e();
        List<C6028c> arrayList = new ArrayList(e.m26282a() + 5);
        arrayList.add(new C6028c(C6028c.f22092b, c6071q.m26348d()));
        arrayList.add(new C6028c(C6028c.f22093c, C6054l.m26221a(c6071q.m26343a())));
        arrayList.add(new C6028c(C6028c.f22097g, "HTTP/1.1"));
        arrayList.add(new C6028c(C6028c.f22096f, C6058i.m26238a(c6071q.m26343a())));
        arrayList.add(new C6028c(C6028c.f22094d, c6071q.m26343a().m25740c()));
        c6071q = new LinkedHashSet();
        int a = e.m26282a();
        for (int i = 0; i < a; i++) {
            ByteString a2 = ByteString.a(e.m26283a(i).toLowerCase(Locale.US));
            if (!f26108i.contains(a2)) {
                String b = e.m26286b(i);
                if (c6071q.add(a2)) {
                    arrayList.add(new C6028c(a2, b));
                } else {
                    for (int i2 = 0; i2 < arrayList.size(); i2++) {
                        if (((C6028c) arrayList.get(i2)).f22098h.equals(a2)) {
                            arrayList.set(i2, new C6028c(a2, C7236c.m31027a(((C6028c) arrayList.get(i2)).f22099i.a(), b)));
                            break;
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    private static String m31027a(String str, String str2) {
        StringBuilder stringBuilder = new StringBuilder(str);
        stringBuilder.append(null);
        stringBuilder.append(str2);
        return stringBuilder.toString();
    }

    /* renamed from: b */
    public static List<C6028c> m31030b(C6071q c6071q) {
        C6066n e = c6071q.m26349e();
        List<C6028c> arrayList = new ArrayList(e.m26282a() + 4);
        arrayList.add(new C6028c(C6028c.f22092b, c6071q.m26348d()));
        arrayList.add(new C6028c(C6028c.f22093c, C6054l.m26221a(c6071q.m26343a())));
        arrayList.add(new C6028c(C6028c.f22095e, C6058i.m26238a(c6071q.m26343a())));
        arrayList.add(new C6028c(C6028c.f22094d, c6071q.m26343a().m25740c()));
        c6071q = e.m26282a();
        for (int i = 0; i < c6071q; i++) {
            ByteString a = ByteString.a(e.m26283a(i).toLowerCase(Locale.US));
            if (!f26110k.contains(a)) {
                arrayList.add(new C6028c(a, e.m26286b(i)));
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public static C6074a m31026a(List<C6028c> list) throws IOException {
        C6065a c6065a = new C6065a();
        c6065a.m26280c(C6053j.f22189d, Protocol.SPDY_3.toString());
        int size = list.size();
        String str = null;
        String str2 = "HTTP/1.1";
        int i = 0;
        while (i < size) {
            ByteString byteString = ((C6028c) list.get(i)).f22098h;
            String a = ((C6028c) list.get(i)).f22099i.a();
            String str3 = str2;
            str2 = str;
            int i2 = 0;
            while (i2 < a.length()) {
                int indexOf = a.indexOf(0, i2);
                if (indexOf == -1) {
                    indexOf = a.length();
                }
                str = a.substring(i2, indexOf);
                if (byteString.equals(C6028c.f22091a)) {
                    str2 = str;
                } else if (byteString.equals(C6028c.f22097g)) {
                    str3 = str;
                } else if (!f26109j.contains(byteString)) {
                    c6065a.m26276a(byteString.a(), str);
                }
                i2 = indexOf + 1;
            }
            i++;
            str = str2;
            str2 = str3;
        }
        if (str == null) {
            throw new ProtocolException("Expected ':status' header not present");
        }
        list = new StringBuilder();
        list.append(str2);
        list.append(" ");
        list.append(str);
        list = C6056o.m26237a(list.toString());
        return new C6074a().m26371a(Protocol.SPDY_3).m26370a(list.f22203b).m26377a(list.f22204c).m26373a(c6065a.m26277a());
    }

    /* renamed from: b */
    public static C6074a m31029b(List<C6028c> list) throws IOException {
        C6065a c6065a = new C6065a();
        c6065a.m26280c(C6053j.f22189d, Protocol.HTTP_2.toString());
        int size = list.size();
        String str = null;
        for (int i = 0; i < size; i++) {
            ByteString byteString = ((C6028c) list.get(i)).f22098h;
            String a = ((C6028c) list.get(i)).f22099i.a();
            if (byteString.equals(C6028c.f22091a)) {
                str = a;
            } else if (!f26111l.contains(byteString)) {
                c6065a.m26276a(byteString.a(), a);
            }
        }
        if (str == null) {
            throw new ProtocolException("Expected ':status' header not present");
        }
        list = new StringBuilder();
        list.append("HTTP/1.1 ");
        list.append(str);
        list = C6056o.m26237a(list.toString());
        return new C6074a().m26371a(Protocol.HTTP_2).m26370a(list.f22203b).m26377a(list.f22204c).m26373a(c6065a.m26277a());
    }

    public C6076t openResponseBody(C6075s c6075s) throws IOException {
        return new C7244k(c6075s.m26401g(), C15976k.a(this.f26114o.m26047f()));
    }

    public void disconnect(C6050g c6050g) throws IOException {
        if (this.f26114o != null) {
            this.f26114o.m26038a(ErrorCode.CANCEL);
        }
    }
}
