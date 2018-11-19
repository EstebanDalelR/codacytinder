package com.squareup.okhttp.internal.framed;

import android.support.v7.widget.ActivityChooserView.ActivityChooserViewAdapter;
import com.squareup.okhttp.Protocol;
import com.squareup.okhttp.internal.C6058i;
import com.squareup.okhttp.internal.framed.FrameReader.Handler;
import java.io.IOException;
import java.util.List;
import java.util.zip.Deflater;
import okio.BufferedSink;
import okio.BufferedSource;
import okio.ByteString;
import okio.C15976k;
import okio.C17702d;
import okio.C18549c;

/* renamed from: com.squareup.okhttp.internal.framed.j */
public final class C7232j implements Variant {
    /* renamed from: a */
    static final byte[] f26087a;

    /* renamed from: com.squareup.okhttp.internal.framed.j$a */
    static final class C7230a implements FrameReader {
        /* renamed from: a */
        private final BufferedSource f26079a;
        /* renamed from: b */
        private final boolean f26080b;
        /* renamed from: c */
        private final C6036g f26081c = new C6036g(this.f26079a);

        public void readConnectionPreface() {
        }

        C7230a(BufferedSource bufferedSource, boolean z) {
            this.f26079a = bufferedSource;
            this.f26080b = z;
        }

        public boolean nextFrame(com.squareup.okhttp.internal.framed.FrameReader.Handler r8) throws java.io.IOException {
            /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
            /*
            r7 = this;
            r0 = 0;
            r1 = r7.f26079a;	 Catch:{ IOException -> 0x007d }
            r1 = r1.readInt();	 Catch:{ IOException -> 0x007d }
            r2 = r7.f26079a;	 Catch:{ IOException -> 0x007d }
            r2 = r2.readInt();	 Catch:{ IOException -> 0x007d }
            r3 = -2147483648; // 0xffffffff80000000 float:-0.0 double:NaN;
            r3 = r3 & r1;
            r4 = 1;
            if (r3 == 0) goto L_0x0015;
        L_0x0013:
            r3 = 1;
            goto L_0x0016;
        L_0x0015:
            r3 = 0;
        L_0x0016:
            r5 = -16777216; // 0xffffffffff000000 float:-1.7014118E38 double:NaN;
            r5 = r5 & r2;
            r5 = r5 >>> 24;
            r6 = 16777215; // 0xffffff float:2.3509886E-38 double:8.2890456E-317;
            r2 = r2 & r6;
            if (r3 == 0) goto L_0x006e;
        L_0x0021:
            r0 = 2147418112; // 0x7fff0000 float:NaN double:1.0609655164E-314;
            r0 = r0 & r1;
            r0 = r0 >>> 16;
            r3 = 65535; // 0xffff float:9.1834E-41 double:3.23786E-319;
            r1 = r1 & r3;
            r3 = 3;
            if (r0 == r3) goto L_0x0044;
        L_0x002d:
            r8 = new java.net.ProtocolException;
            r1 = new java.lang.StringBuilder;
            r1.<init>();
            r2 = "version != 3: ";
            r1.append(r2);
            r1.append(r0);
            r0 = r1.toString();
            r8.<init>(r0);
            throw r8;
        L_0x0044:
            switch(r1) {
                case 1: goto L_0x006a;
                case 2: goto L_0x0066;
                case 3: goto L_0x0062;
                case 4: goto L_0x005e;
                case 5: goto L_0x0047;
                case 6: goto L_0x005a;
                case 7: goto L_0x0056;
                case 8: goto L_0x0052;
                case 9: goto L_0x004e;
                default: goto L_0x0047;
            };
        L_0x0047:
            r8 = r7.f26079a;
            r0 = (long) r2;
            r8.skip(r0);
            return r4;
        L_0x004e:
            r7.m31011e(r8, r5, r2);
            return r4;
        L_0x0052:
            r7.m31010d(r8, r5, r2);
            return r4;
        L_0x0056:
            r7.m31013g(r8, r5, r2);
            return r4;
        L_0x005a:
            r7.m31012f(r8, r5, r2);
            return r4;
        L_0x005e:
            r7.m31014h(r8, r5, r2);
            return r4;
        L_0x0062:
            r7.m31009c(r8, r5, r2);
            return r4;
        L_0x0066:
            r7.m31008b(r8, r5, r2);
            return r4;
        L_0x006a:
            r7.m31007a(r8, r5, r2);
            return r4;
        L_0x006e:
            r3 = 2147483647; // 0x7fffffff float:NaN double:1.060997895E-314;
            r1 = r1 & r3;
            r3 = r5 & 1;
            if (r3 == 0) goto L_0x0077;
        L_0x0076:
            r0 = 1;
        L_0x0077:
            r3 = r7.f26079a;
            r8.data(r0, r1, r3, r2);
            return r4;
        L_0x007d:
            return r0;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.squareup.okhttp.internal.framed.j.a.nextFrame(com.squareup.okhttp.internal.framed.FrameReader$Handler):boolean");
        }

        /* renamed from: a */
        private void m31007a(Handler handler, int i, int i2) throws IOException {
            int readInt = this.f26079a.readInt() & ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
            int readInt2 = this.f26079a.readInt() & ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
            this.f26079a.readShort();
            List a = this.f26081c.m26089a(i2 - 10);
            handler.headers((i & 2) != 0, (i & 1) != 0, readInt, readInt2, a, HeadersMode.SPDY_SYN_STREAM);
        }

        /* renamed from: b */
        private void m31008b(Handler handler, int i, int i2) throws IOException {
            handler.headers(false, (i & 1) != 0, this.f26079a.readInt() & ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED, -1, this.f26081c.m26089a(i2 - 4), HeadersMode.SPDY_REPLY);
        }

        /* renamed from: c */
        private void m31009c(Handler handler, int i, int i2) throws IOException {
            if (i2 != 8) {
                throw C7230a.m31006a("TYPE_RST_STREAM length: %d != 8", Integer.valueOf(i2));
            }
            i2 = this.f26079a.readInt() & ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
            ErrorCode fromSpdy3Rst = ErrorCode.fromSpdy3Rst(this.f26079a.readInt());
            if (fromSpdy3Rst == null) {
                throw C7230a.m31006a("TYPE_RST_STREAM unexpected error code: %d", new Object[]{Integer.valueOf(r1)});
            } else {
                handler.rstStream(i2, fromSpdy3Rst);
            }
        }

        /* renamed from: d */
        private void m31010d(Handler handler, int i, int i2) throws IOException {
            handler.headers(false, false, this.f26079a.readInt() & ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED, -1, this.f26081c.m26089a(i2 - 4), HeadersMode.SPDY_HEADERS);
        }

        /* renamed from: e */
        private void m31011e(Handler handler, int i, int i2) throws IOException {
            if (i2 != 8) {
                throw C7230a.m31006a("TYPE_WINDOW_UPDATE length: %d != 8", Integer.valueOf(i2));
            }
            i2 = this.f26079a.readInt() & ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
            long readInt = (long) (this.f26079a.readInt() & ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED);
            if (readInt == 0) {
                throw C7230a.m31006a("windowSizeIncrement was 0", new Object[]{Long.valueOf(readInt)});
            } else {
                handler.windowUpdate(i2, readInt);
            }
        }

        /* renamed from: f */
        private void m31012f(Handler handler, int i, int i2) throws IOException {
            boolean z = true;
            if (i2 != 4) {
                throw C7230a.m31006a("TYPE_PING length: %d != 4", Integer.valueOf(i2));
            }
            i2 = this.f26079a.readInt();
            if (this.f26080b != ((i2 & 1) == 1)) {
                z = false;
            }
            handler.ping(z, i2, 0);
        }

        /* renamed from: g */
        private void m31013g(Handler handler, int i, int i2) throws IOException {
            if (i2 != 8) {
                throw C7230a.m31006a("TYPE_GOAWAY length: %d != 8", Integer.valueOf(i2));
            }
            i2 = this.f26079a.readInt() & ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
            ErrorCode fromSpdyGoAway = ErrorCode.fromSpdyGoAway(this.f26079a.readInt());
            if (fromSpdyGoAway == null) {
                throw C7230a.m31006a("TYPE_GOAWAY unexpected error code: %d", new Object[]{Integer.valueOf(r1)});
            } else {
                handler.goAway(i2, fromSpdyGoAway, ByteString.f49592b);
            }
        }

        /* renamed from: h */
        private void m31014h(Handler handler, int i, int i2) throws IOException {
            int readInt = this.f26079a.readInt();
            boolean z = false;
            if (i2 != (readInt * 8) + 4) {
                throw C7230a.m31006a("TYPE_SETTINGS length: %d != 4 + 8 * %d", new Object[]{Integer.valueOf(i2), Integer.valueOf(readInt)});
            }
            i2 = new C6038i();
            for (int i3 = 0; i3 < readInt; i3++) {
                int readInt2 = this.f26079a.readInt();
                int i4 = (-16777216 & readInt2) >>> 24;
                i2.m26094a(readInt2 & 16777215, i4, this.f26079a.readInt());
            }
            if ((i & 1) != 0) {
                z = true;
            }
            handler.settings(z, i2);
        }

        /* renamed from: a */
        private static IOException m31006a(String str, Object... objArr) throws IOException {
            throw new IOException(String.format(str, objArr));
        }

        public void close() throws IOException {
            this.f26081c.m26090a();
        }
    }

    /* renamed from: com.squareup.okhttp.internal.framed.j$b */
    static final class C7231b implements FrameWriter {
        /* renamed from: a */
        private final BufferedSink f26082a;
        /* renamed from: b */
        private final C18549c f26083b = new C18549c();
        /* renamed from: c */
        private final BufferedSink f26084c;
        /* renamed from: d */
        private final boolean f26085d;
        /* renamed from: e */
        private boolean f26086e;

        public void ackSettings(C6038i c6038i) {
        }

        public int maxDataLength() {
            return 16383;
        }

        public void pushPromise(int i, int i2, List<C6028c> list) throws IOException {
        }

        C7231b(BufferedSink bufferedSink, boolean z) {
            this.f26082a = bufferedSink;
            this.f26085d = z;
            bufferedSink = new Deflater();
            bufferedSink.setDictionary(C7232j.f26087a);
            this.f26084c = C15976k.a(new C17702d(this.f26083b, bufferedSink));
        }

        public synchronized void connectionPreface() {
        }

        public synchronized void flush() throws IOException {
            if (this.f26086e) {
                throw new IOException("closed");
            }
            this.f26082a.flush();
        }

        public synchronized void synStream(boolean z, boolean z2, int i, int i2, List<C6028c> list) throws IOException {
            if (this.f26086e) {
                throw new IOException("closed");
            }
            m31015a(list);
            list = (int) (this.f26083b.a() + 10);
            z |= z2 ? true : false;
            this.f26082a.writeInt(-2147287039);
            this.f26082a.writeInt(((z & 255) << 24) | (list & 16777215));
            this.f26082a.writeInt(i & ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED);
            this.f26082a.writeInt(true & i2);
            this.f26082a.writeShort(0);
            this.f26082a.writeAll(this.f26083b);
            this.f26082a.flush();
        }

        public synchronized void synReply(boolean z, int i, List<C6028c> list) throws IOException {
            if (this.f26086e) {
                throw new IOException("closed");
            }
            m31015a(list);
            list = (int) (this.f26083b.a() + 4);
            this.f26082a.writeInt(-2147287038);
            this.f26082a.writeInt(((z & 255) << 24) | (list & 16777215));
            this.f26082a.writeInt(i & ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED);
            this.f26082a.writeAll(this.f26083b);
            this.f26082a.flush();
        }

        public synchronized void headers(int i, List<C6028c> list) throws IOException {
            if (this.f26086e) {
                throw new IOException("closed");
            }
            m31015a(list);
            list = (int) (this.f26083b.a() + 4);
            this.f26082a.writeInt(-2147287032);
            this.f26082a.writeInt((list & 16777215) | 0);
            this.f26082a.writeInt(i & ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED);
            this.f26082a.writeAll(this.f26083b);
        }

        public synchronized void rstStream(int i, ErrorCode errorCode) throws IOException {
            if (this.f26086e) {
                throw new IOException("closed");
            } else if (errorCode.spdyRstCode == -1) {
                throw new IllegalArgumentException();
            } else {
                this.f26082a.writeInt(-2147287037);
                this.f26082a.writeInt(8);
                this.f26082a.writeInt(i & ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED);
                this.f26082a.writeInt(errorCode.spdyRstCode);
                this.f26082a.flush();
            }
        }

        public synchronized void data(boolean z, int i, C18549c c18549c, int i2) throws IOException {
            m31016a(i, z, c18549c, i2);
        }

        /* renamed from: a */
        void m31016a(int i, int i2, C18549c c18549c, int i3) throws IOException {
            if (this.f26086e) {
                throw new IOException("closed");
            }
            long j = (long) i3;
            if (j > 16777215) {
                i2 = new StringBuilder();
                i2.append("FRAME_TOO_LARGE max size is 16Mib: ");
                i2.append(i3);
                throw new IllegalArgumentException(i2.toString());
            }
            this.f26082a.writeInt(i & ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED);
            this.f26082a.writeInt(((i2 & 255) << 24) | (16777215 & i3));
            if (i3 > 0) {
                this.f26082a.write(c18549c, j);
            }
        }

        /* renamed from: a */
        private void m31015a(List<C6028c> list) throws IOException {
            this.f26084c.writeInt(list.size());
            int size = list.size();
            for (int i = 0; i < size; i++) {
                ByteString byteString = ((C6028c) list.get(i)).f22098h;
                this.f26084c.writeInt(byteString.h());
                this.f26084c.write(byteString);
                byteString = ((C6028c) list.get(i)).f22099i;
                this.f26084c.writeInt(byteString.h());
                this.f26084c.write(byteString);
            }
            this.f26084c.flush();
        }

        public synchronized void settings(C6038i c6038i) throws IOException {
            if (this.f26086e) {
                throw new IOException("closed");
            }
            int b = c6038i.m26098b();
            int i = (b * 8) + 4;
            this.f26082a.writeInt(-2147287036);
            int i2 = 0;
            this.f26082a.writeInt((i & 16777215) | 0);
            this.f26082a.writeInt(b);
            while (i2 <= 10) {
                if (c6038i.m26097a(i2)) {
                    this.f26082a.writeInt(((c6038i.m26101c(i2) & 255) << 24) | (i2 & 16777215));
                    this.f26082a.writeInt(c6038i.m26099b(i2));
                }
                i2++;
            }
            this.f26082a.flush();
        }

        public synchronized void ping(boolean z, int i, int i2) throws IOException {
            if (this.f26086e != 0) {
                throw new IOException("closed");
            }
            boolean z2 = false;
            if (this.f26085d != ((i & 1) == 1 ? 1 : 0)) {
                z2 = true;
            }
            if (z != z2) {
                throw new IllegalArgumentException("payload != reply");
            }
            this.f26082a.writeInt(-2147287034);
            this.f26082a.writeInt(4);
            this.f26082a.writeInt(i);
            this.f26082a.flush();
        }

        public synchronized void goAway(int i, ErrorCode errorCode, byte[] bArr) throws IOException {
            if (this.f26086e != null) {
                throw new IOException("closed");
            } else if (errorCode.spdyGoAwayCode == -1) {
                throw new IllegalArgumentException("errorCode.spdyGoAwayCode == -1");
            } else {
                this.f26082a.writeInt(-2147287033);
                this.f26082a.writeInt(8);
                this.f26082a.writeInt(i);
                this.f26082a.writeInt(errorCode.spdyGoAwayCode);
                this.f26082a.flush();
            }
        }

        public synchronized void windowUpdate(int i, long j) throws IOException {
            if (this.f26086e) {
                throw new IOException("closed");
            }
            if (j != 0) {
                if (j <= 2147483647L) {
                    this.f26082a.writeInt(-2147287031);
                    this.f26082a.writeInt(8);
                    this.f26082a.writeInt(i);
                    this.f26082a.writeInt((int) j);
                    this.f26082a.flush();
                }
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("windowSizeIncrement must be between 1 and 0x7fffffff: ");
            stringBuilder.append(j);
            throw new IllegalArgumentException(stringBuilder.toString());
        }

        public synchronized void close() throws IOException {
            this.f26086e = true;
            C6058i.m26248a(this.f26082a, this.f26084c);
        }
    }

    public Protocol getProtocol() {
        return Protocol.SPDY_3;
    }

    static {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r0 = "\u0000\u0000\u0000\u0007options\u0000\u0000\u0000\u0004head\u0000\u0000\u0000\u0004post\u0000\u0000\u0000\u0003put\u0000\u0000\u0000\u0006delete\u0000\u0000\u0000\u0005trace\u0000\u0000\u0000\u0006accept\u0000\u0000\u0000\u000eaccept-charset\u0000\u0000\u0000\u000faccept-encoding\u0000\u0000\u0000\u000faccept-language\u0000\u0000\u0000\raccept-ranges\u0000\u0000\u0000\u0003age\u0000\u0000\u0000\u0005allow\u0000\u0000\u0000\rauthorization\u0000\u0000\u0000\rcache-control\u0000\u0000\u0000\nconnection\u0000\u0000\u0000\fcontent-base\u0000\u0000\u0000\u0010content-encoding\u0000\u0000\u0000\u0010content-language\u0000\u0000\u0000\u000econtent-length\u0000\u0000\u0000\u0010content-location\u0000\u0000\u0000\u000bcontent-md5\u0000\u0000\u0000\rcontent-range\u0000\u0000\u0000\fcontent-type\u0000\u0000\u0000\u0004date\u0000\u0000\u0000\u0004etag\u0000\u0000\u0000\u0006expect\u0000\u0000\u0000\u0007expires\u0000\u0000\u0000\u0004from\u0000\u0000\u0000\u0004host\u0000\u0000\u0000\bif-match\u0000\u0000\u0000\u0011if-modified-since\u0000\u0000\u0000\rif-none-match\u0000\u0000\u0000\bif-range\u0000\u0000\u0000\u0013if-unmodified-since\u0000\u0000\u0000\rlast-modified\u0000\u0000\u0000\blocation\u0000\u0000\u0000\fmax-forwards\u0000\u0000\u0000\u0006pragma\u0000\u0000\u0000\u0012proxy-authenticate\u0000\u0000\u0000\u0013proxy-authorization\u0000\u0000\u0000\u0005range\u0000\u0000\u0000\u0007referer\u0000\u0000\u0000\u000bretry-after\u0000\u0000\u0000\u0006server\u0000\u0000\u0000\u0002te\u0000\u0000\u0000\u0007trailer\u0000\u0000\u0000\u0011transfer-encoding\u0000\u0000\u0000\u0007upgrade\u0000\u0000\u0000\nuser-agent\u0000\u0000\u0000\u0004vary\u0000\u0000\u0000\u0003via\u0000\u0000\u0000\u0007warning\u0000\u0000\u0000\u0010www-authenticate\u0000\u0000\u0000\u0006method\u0000\u0000\u0000\u0003get\u0000\u0000\u0000\u0006status\u0000\u0000\u0000\u0006200 OK\u0000\u0000\u0000\u0007version\u0000\u0000\u0000\bHTTP/1.1\u0000\u0000\u0000\u0003url\u0000\u0000\u0000\u0006public\u0000\u0000\u0000\nset-cookie\u0000\u0000\u0000\nkeep-alive\u0000\u0000\u0000\u0006origin100101201202205206300302303304305306307402405406407408409410411412413414415416417502504505203 Non-Authoritative Information204 No Content301 Moved Permanently400 Bad Request401 Unauthorized403 Forbidden404 Not Found500 Internal Server Error501 Not Implemented503 Service UnavailableJan Feb Mar Apr May Jun Jul Aug Sept Oct Nov Dec 00:00:00 Mon, Tue, Wed, Thu, Fri, Sat, Sun, GMTchunked,text/html,image/png,image/jpg,image/gif,application/xml,application/xhtml+xml,text/plain,text/javascript,publicprivatemax-age=gzip,deflate,sdchcharset=utf-8charset=iso-8859-1,utf-,*,enq=0.";	 Catch:{ UnsupportedEncodingException -> 0x000f }
        r1 = com.squareup.okhttp.internal.C6058i.f22209c;	 Catch:{ UnsupportedEncodingException -> 0x000f }
        r1 = r1.name();	 Catch:{ UnsupportedEncodingException -> 0x000f }
        r0 = r0.getBytes(r1);	 Catch:{ UnsupportedEncodingException -> 0x000f }
        f26087a = r0;	 Catch:{ UnsupportedEncodingException -> 0x000f }
        return;
    L_0x000f:
        r0 = new java.lang.AssertionError;
        r0.<init>();
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.okhttp.internal.framed.j.<clinit>():void");
    }

    public FrameReader newReader(BufferedSource bufferedSource, boolean z) {
        return new C7230a(bufferedSource, z);
    }

    public FrameWriter newWriter(BufferedSink bufferedSink, boolean z) {
        return new C7231b(bufferedSink, z);
    }
}
