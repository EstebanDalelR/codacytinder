package com.squareup.okhttp;

import com.squareup.okhttp.C6066n.C6065a;
import com.squareup.okhttp.C6071q.C6070a;
import com.squareup.okhttp.C6075s.C6074a;
import com.squareup.okhttp.internal.C6020b;
import com.squareup.okhttp.internal.C6020b.C6017a;
import com.squareup.okhttp.internal.C6020b.C6019c;
import com.squareup.okhttp.internal.C6058i;
import com.squareup.okhttp.internal.InternalCache;
import com.squareup.okhttp.internal.http.C6044b;
import com.squareup.okhttp.internal.http.C6053j;
import com.squareup.okhttp.internal.http.C6056o;
import com.squareup.okhttp.internal.http.CacheRequest;
import com.squareup.okhttp.internal.io.FileSystem;
import com.tinder.api.ManagerWebServices;
import java.io.File;
import java.io.IOException;
import java.security.cert.Certificate;
import java.security.cert.CertificateFactory;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import okio.BufferedSink;
import okio.BufferedSource;
import okio.ByteString;
import okio.C15976k;
import okio.C17703e;
import okio.C17704f;
import okio.C18549c;
import okio.Sink;
import okio.Source;

/* renamed from: com.squareup.okhttp.b */
public final class C5997b {
    /* renamed from: a */
    final InternalCache f21920a;
    /* renamed from: b */
    private final C6020b f21921b;
    /* renamed from: c */
    private int f21922c;
    /* renamed from: d */
    private int f21923d;
    /* renamed from: e */
    private int f21924e;
    /* renamed from: f */
    private int f21925f;
    /* renamed from: g */
    private int f21926g;

    /* renamed from: com.squareup.okhttp.b$c */
    private static final class C5996c {
        /* renamed from: a */
        private final String f21912a;
        /* renamed from: b */
        private final C6066n f21913b;
        /* renamed from: c */
        private final String f21914c;
        /* renamed from: d */
        private final Protocol f21915d;
        /* renamed from: e */
        private final int f21916e;
        /* renamed from: f */
        private final String f21917f;
        /* renamed from: g */
        private final C6066n f21918g;
        /* renamed from: h */
        private final C6063m f21919h;

        public C5996c(Source source) throws IOException {
            try {
                BufferedSource a = C15976k.a(source);
                this.f21912a = a.readUtf8LineStrict();
                this.f21914c = a.readUtf8LineStrict();
                C6065a c6065a = new C6065a();
                int a2 = C5997b.m25781b(a);
                for (int i = 0; i < a2; i++) {
                    c6065a.m26275a(a.readUtf8LineStrict());
                }
                this.f21913b = c6065a.m26277a();
                C6056o a3 = C6056o.m26237a(a.readUtf8LineStrict());
                this.f21915d = a3.f22202a;
                this.f21916e = a3.f22203b;
                this.f21917f = a3.f22204c;
                c6065a = new C6065a();
                a2 = C5997b.m25781b(a);
                for (int i2 = 0; i2 < a2; i2++) {
                    c6065a.m26275a(a.readUtf8LineStrict());
                }
                this.f21918g = c6065a.m26277a();
                if (m25766a()) {
                    String readUtf8LineStrict = a.readUtf8LineStrict();
                    if (readUtf8LineStrict.length() > 0) {
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("expected \"\" but was \"");
                        stringBuilder.append(readUtf8LineStrict);
                        stringBuilder.append("\"");
                        throw new IOException(stringBuilder.toString());
                    }
                    this.f21919h = C6063m.m26268a(a.readUtf8LineStrict(), m25764a(a), m25764a(a));
                } else {
                    this.f21919h = null;
                }
                source.close();
            } catch (Throwable th) {
                source.close();
            }
        }

        public C5996c(C6075s c6075s) {
            this.f21912a = c6075s.m26393a().m26347c();
            this.f21913b = C6053j.m26218c(c6075s);
            this.f21914c = c6075s.m26393a().m26348d();
            this.f21915d = c6075s.m26396b();
            this.f21916e = c6075s.m26397c();
            this.f21917f = c6075s.m26399e();
            this.f21918g = c6075s.m26401g();
            this.f21919h = c6075s.m26400f();
        }

        /* renamed from: a */
        public void m25768a(C6017a c6017a) throws IOException {
            int i = 0;
            BufferedSink a = C15976k.a(c6017a.m25895a(0));
            a.writeUtf8(this.f21912a);
            a.writeByte(10);
            a.writeUtf8(this.f21914c);
            a.writeByte(10);
            a.writeDecimalLong((long) this.f21913b.m26282a());
            a.writeByte(10);
            int a2 = this.f21913b.m26282a();
            for (int i2 = 0; i2 < a2; i2++) {
                a.writeUtf8(this.f21913b.m26283a(i2));
                a.writeUtf8(": ");
                a.writeUtf8(this.f21913b.m26286b(i2));
                a.writeByte(10);
            }
            a.writeUtf8(new C6056o(this.f21915d, this.f21916e, this.f21917f).toString());
            a.writeByte(10);
            a.writeDecimalLong((long) this.f21918g.m26282a());
            a.writeByte(10);
            a2 = this.f21918g.m26282a();
            while (i < a2) {
                a.writeUtf8(this.f21918g.m26283a(i));
                a.writeUtf8(": ");
                a.writeUtf8(this.f21918g.m26286b(i));
                a.writeByte(10);
                i++;
            }
            if (m25766a()) {
                a.writeByte(10);
                a.writeUtf8(this.f21919h.m26270a());
                a.writeByte(10);
                m25765a(a, this.f21919h.m26271b());
                m25765a(a, this.f21919h.m26272c());
            }
            a.close();
        }

        /* renamed from: a */
        private boolean m25766a() {
            return this.f21912a.startsWith("https://");
        }

        /* renamed from: a */
        private List<Certificate> m25764a(BufferedSource bufferedSource) throws IOException {
            int a = C5997b.m25781b(bufferedSource);
            if (a == -1) {
                return Collections.emptyList();
            }
            try {
                CertificateFactory instance = CertificateFactory.getInstance("X.509");
                List<Certificate> arrayList = new ArrayList(a);
                for (int i = 0; i < a; i++) {
                    String readUtf8LineStrict = bufferedSource.readUtf8LineStrict();
                    C18549c c18549c = new C18549c();
                    c18549c.a(ByteString.b(readUtf8LineStrict));
                    arrayList.add(instance.generateCertificate(c18549c.inputStream()));
                }
                return arrayList;
            } catch (BufferedSource bufferedSource2) {
                throw new IOException(bufferedSource2.getMessage());
            }
        }

        /* renamed from: a */
        private void m25765a(BufferedSink bufferedSink, List<Certificate> list) throws IOException {
            try {
                bufferedSink.writeDecimalLong((long) list.size());
                bufferedSink.writeByte(10);
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    bufferedSink.writeUtf8(ByteString.a(((Certificate) list.get(i)).getEncoded()).b());
                    bufferedSink.writeByte(10);
                }
            } catch (BufferedSink bufferedSink2) {
                throw new IOException(bufferedSink2.getMessage());
            }
        }

        /* renamed from: a */
        public boolean m25769a(C6071q c6071q, C6075s c6075s) {
            return (this.f21912a.equals(c6071q.m26347c()) && this.f21914c.equals(c6071q.m26348d()) && C6053j.m26212a(c6075s, this.f21913b, c6071q) != null) ? true : null;
        }

        /* renamed from: a */
        public C6075s m25767a(C6071q c6071q, C6019c c6019c) {
            c6071q = this.f21918g.m26284a(ManagerWebServices.PARAM_CONTENT_TYPE);
            String a = this.f21918g.m26284a("Content-Length");
            return new C6074a().m26374a(new C6070a().m26332a(this.f21912a).m26333a(this.f21914c, null).m26330a(this.f21913b).m26335a()).m26371a(this.f21915d).m26370a(this.f21916e).m26377a(this.f21917f).m26373a(this.f21918g).m26376a(new C7208b(c6019c, c6071q, a)).m26372a(this.f21919h).m26379a();
        }
    }

    /* renamed from: com.squareup.okhttp.b$1 */
    class C72061 implements InternalCache {
        /* renamed from: a */
        final /* synthetic */ C5997b f26000a;

        C72061(C5997b c5997b) {
            this.f26000a = c5997b;
        }

        public C6075s get(C6071q c6071q) throws IOException {
            return this.f26000a.m25786a(c6071q);
        }

        public CacheRequest put(C6075s c6075s) throws IOException {
            return this.f26000a.m25772a(c6075s);
        }

        public void remove(C6071q c6071q) throws IOException {
            this.f26000a.m25785c(c6071q);
        }

        public void update(C6075s c6075s, C6075s c6075s2) throws IOException {
            this.f26000a.m25779a(c6075s, c6075s2);
        }

        public void trackConditionalCacheHit() {
            this.f26000a.m25784c();
        }

        public void trackResponse(C6044b c6044b) {
            this.f26000a.m25778a(c6044b);
        }
    }

    /* renamed from: com.squareup.okhttp.b$a */
    private final class C7207a implements CacheRequest {
        /* renamed from: a */
        final /* synthetic */ C5997b f26001a;
        /* renamed from: b */
        private final C6017a f26002b;
        /* renamed from: c */
        private Sink f26003c;
        /* renamed from: d */
        private boolean f26004d;
        /* renamed from: e */
        private Sink f26005e;

        public C7207a(final C5997b c5997b, final C6017a c6017a) throws IOException {
            this.f26001a = c5997b;
            this.f26002b = c6017a;
            this.f26003c = c6017a.m25895a(1);
            this.f26005e = new C17703e(this, this.f26003c) {
                /* renamed from: c */
                final /* synthetic */ C7207a f28543c;

                public void close() throws IOException {
                    synchronized (this.f28543c.f26001a) {
                        if (this.f28543c.f26004d) {
                            return;
                        }
                        this.f28543c.f26004d = true;
                        this.f28543c.f26001a.f21922c = this.f28543c.f26001a.f21922c + 1;
                        super.close();
                        c6017a.m25896a();
                    }
                }
            };
        }

        public void abort() {
            /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
            /*
            r2 = this;
            r0 = r2.f26001a;
            monitor-enter(r0);
            r1 = r2.f26004d;	 Catch:{ all -> 0x001d }
            if (r1 == 0) goto L_0x0009;	 Catch:{ all -> 0x001d }
        L_0x0007:
            monitor-exit(r0);	 Catch:{ all -> 0x001d }
            return;	 Catch:{ all -> 0x001d }
        L_0x0009:
            r1 = 1;	 Catch:{ all -> 0x001d }
            r2.f26004d = r1;	 Catch:{ all -> 0x001d }
            r1 = r2.f26001a;	 Catch:{ all -> 0x001d }
            r1.f21923d = r1.f21923d + 1;	 Catch:{ all -> 0x001d }
            monitor-exit(r0);	 Catch:{ all -> 0x001d }
            r0 = r2.f26003c;
            com.squareup.okhttp.internal.C6058i.m26247a(r0);
            r0 = r2.f26002b;	 Catch:{ IOException -> 0x001c }
            r0.m25897b();	 Catch:{ IOException -> 0x001c }
        L_0x001c:
            return;
        L_0x001d:
            r1 = move-exception;
            monitor-exit(r0);	 Catch:{ all -> 0x001d }
            throw r1;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.squareup.okhttp.b.a.abort():void");
        }

        public Sink body() {
            return this.f26005e;
        }
    }

    /* renamed from: com.squareup.okhttp.b$b */
    private static class C7208b extends C6076t {
        /* renamed from: a */
        private final C6019c f26006a;
        /* renamed from: b */
        private final BufferedSource f26007b;
        /* renamed from: c */
        private final String f26008c;
        /* renamed from: d */
        private final String f26009d;

        public C7208b(final C6019c c6019c, String str, String str2) {
            this.f26006a = c6019c;
            this.f26008c = str;
            this.f26009d = str2;
            this.f26007b = C15976k.a(new C17704f(this, c6019c.m25914a(1)) {
                /* renamed from: b */
                final /* synthetic */ C7208b f28545b;

                public void close() throws IOException {
                    c6019c.close();
                    super.close();
                }
            });
        }

        /* renamed from: a */
        public C6067o mo6485a() {
            return this.f26008c != null ? C6067o.m26289a(this.f26008c) : null;
        }

        /* renamed from: b */
        public long mo6486b() {
            /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
            /*
            r4 = this;
            r0 = -1;
            r2 = r4.f26009d;	 Catch:{ NumberFormatException -> 0x000e }
            if (r2 == 0) goto L_0x000d;	 Catch:{ NumberFormatException -> 0x000e }
        L_0x0006:
            r2 = r4.f26009d;	 Catch:{ NumberFormatException -> 0x000e }
            r2 = java.lang.Long.parseLong(r2);	 Catch:{ NumberFormatException -> 0x000e }
            r0 = r2;
        L_0x000d:
            return r0;
        L_0x000e:
            return r0;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.squareup.okhttp.b.b.b():long");
        }

        /* renamed from: c */
        public BufferedSource mo6487c() {
            return this.f26007b;
        }
    }

    public C5997b(File file, long j) {
        this(file, j, FileSystem.f22210a);
    }

    C5997b(File file, long j, FileSystem fileSystem) {
        this.f21920a = new C72061(this);
        this.f21921b = C6020b.m25918a(fileSystem, file, 201105, 2, j);
    }

    /* renamed from: b */
    private static String m25782b(C6071q c6071q) {
        return C6058i.m26239a(c6071q.m26347c());
    }

    /* renamed from: a */
    com.squareup.okhttp.C6075s m25786a(com.squareup.okhttp.C6071q r5) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r4 = this;
        r0 = com.squareup.okhttp.C5997b.m25782b(r5);
        r1 = 0;
        r2 = r4.f21921b;	 Catch:{ IOException -> 0x002f }
        r0 = r2.m25942a(r0);	 Catch:{ IOException -> 0x002f }
        if (r0 != 0) goto L_0x000e;
    L_0x000d:
        return r1;
    L_0x000e:
        r2 = new com.squareup.okhttp.b$c;	 Catch:{ IOException -> 0x002b }
        r3 = 0;	 Catch:{ IOException -> 0x002b }
        r3 = r0.m25914a(r3);	 Catch:{ IOException -> 0x002b }
        r2.<init>(r3);	 Catch:{ IOException -> 0x002b }
        r0 = r2.m25767a(r5, r0);
        r5 = r2.m25769a(r5, r0);
        if (r5 != 0) goto L_0x002a;
    L_0x0022:
        r5 = r0.m26402h();
        com.squareup.okhttp.internal.C6058i.m26247a(r5);
        return r1;
    L_0x002a:
        return r0;
    L_0x002b:
        com.squareup.okhttp.internal.C6058i.m26247a(r0);
        return r1;
    L_0x002f:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.okhttp.b.a(com.squareup.okhttp.q):com.squareup.okhttp.s");
    }

    /* renamed from: a */
    private com.squareup.okhttp.internal.http.CacheRequest m25772a(com.squareup.okhttp.C6075s r4) throws java.io.IOException {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r3 = this;
        r0 = r4.m26393a();
        r0 = r0.m26348d();
        r1 = r4.m26393a();
        r1 = r1.m26348d();
        r1 = com.squareup.okhttp.internal.http.C6051h.m26200a(r1);
        r2 = 0;
        if (r1 == 0) goto L_0x001f;
    L_0x0017:
        r4 = r4.m26393a();	 Catch:{ IOException -> 0x001e }
        r3.m25785c(r4);	 Catch:{ IOException -> 0x001e }
    L_0x001e:
        return r2;
    L_0x001f:
        r1 = "GET";
        r0 = r0.equals(r1);
        if (r0 != 0) goto L_0x0028;
    L_0x0027:
        return r2;
    L_0x0028:
        r0 = com.squareup.okhttp.internal.http.C6053j.m26217b(r4);
        if (r0 == 0) goto L_0x002f;
    L_0x002e:
        return r2;
    L_0x002f:
        r0 = new com.squareup.okhttp.b$c;
        r0.<init>(r4);
        r1 = r3.f21921b;	 Catch:{ IOException -> 0x004e }
        r4 = r4.m26393a();	 Catch:{ IOException -> 0x004e }
        r4 = com.squareup.okhttp.C5997b.m25782b(r4);	 Catch:{ IOException -> 0x004e }
        r4 = r1.m25944b(r4);	 Catch:{ IOException -> 0x004e }
        if (r4 != 0) goto L_0x0045;
    L_0x0044:
        return r2;
    L_0x0045:
        r0.m25768a(r4);	 Catch:{ IOException -> 0x004f }
        r0 = new com.squareup.okhttp.b$a;	 Catch:{ IOException -> 0x004f }
        r0.<init>(r3, r4);	 Catch:{ IOException -> 0x004f }
        return r0;
    L_0x004e:
        r4 = r2;
    L_0x004f:
        r3.m25777a(r4);
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.okhttp.b.a(com.squareup.okhttp.s):com.squareup.okhttp.internal.http.CacheRequest");
    }

    /* renamed from: c */
    private void m25785c(C6071q c6071q) throws IOException {
        this.f21921b.m25947c(C5997b.m25782b(c6071q));
    }

    /* renamed from: a */
    private void m25779a(com.squareup.okhttp.C6075s r2, com.squareup.okhttp.C6075s r3) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r1 = this;
        r0 = new com.squareup.okhttp.b$c;
        r0.<init>(r3);
        r2 = r2.m26402h();
        r2 = (com.squareup.okhttp.C5997b.C7208b) r2;
        r2 = r2.f26006a;
        r2 = r2.m25913a();	 Catch:{ IOException -> 0x001c }
        if (r2 == 0) goto L_0x0020;
    L_0x0015:
        r0.m25768a(r2);	 Catch:{ IOException -> 0x001d }
        r2.m25896a();	 Catch:{ IOException -> 0x001d }
        goto L_0x0020;
    L_0x001c:
        r2 = 0;
    L_0x001d:
        r1.m25777a(r2);
    L_0x0020:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.okhttp.b.a(com.squareup.okhttp.s, com.squareup.okhttp.s):void");
    }

    /* renamed from: a */
    private void m25777a(com.squareup.okhttp.internal.C6020b.C6017a r1) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r0 = this;
        if (r1 == 0) goto L_0x0005;
    L_0x0002:
        r1.m25897b();	 Catch:{ IOException -> 0x0005 }
    L_0x0005:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.okhttp.b.a(com.squareup.okhttp.internal.b$a):void");
    }

    /* renamed from: a */
    public void m25787a() throws IOException {
        this.f21921b.m25948d();
    }

    /* renamed from: b */
    public void m25788b() throws IOException {
        this.f21921b.close();
    }

    /* renamed from: a */
    private synchronized void m25778a(C6044b c6044b) {
        this.f21926g++;
        if (c6044b.f22152a != null) {
            this.f21924e++;
        } else if (c6044b.f22153b != null) {
            this.f21925f++;
        }
    }

    /* renamed from: c */
    private synchronized void m25784c() {
        this.f21925f++;
    }

    /* renamed from: b */
    private static int m25781b(BufferedSource bufferedSource) throws IOException {
        try {
            long readDecimalLong = bufferedSource.readDecimalLong();
            bufferedSource = bufferedSource.readUtf8LineStrict();
            if (readDecimalLong >= 0 && readDecimalLong <= 2147483647L) {
                if (bufferedSource.isEmpty()) {
                    return (int) readDecimalLong;
                }
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("expected an int but was \"");
            stringBuilder.append(readDecimalLong);
            stringBuilder.append(bufferedSource);
            stringBuilder.append("\"");
            throw new IOException(stringBuilder.toString());
        } catch (BufferedSource bufferedSource2) {
            throw new IOException(bufferedSource2.getMessage());
        }
    }
}
