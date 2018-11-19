package okhttp3.internal.http2;

import android.support.v7.widget.ActivityChooserView.ActivityChooserViewAdapter;
import java.io.Closeable;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import okhttp3.internal.C15908c;
import okhttp3.internal.http2.C15932b.C15930a;
import okio.BufferedSource;
import okio.ByteString;
import okio.C15982q;
import okio.C18549c;
import okio.Source;

/* renamed from: okhttp3.internal.http2.f */
final class C15938f implements Closeable {
    /* renamed from: a */
    static final Logger f49423a = Logger.getLogger(C15933c.class.getName());
    /* renamed from: b */
    final C15930a f49424b = new C15930a(4096, this.f49426d);
    /* renamed from: c */
    private final BufferedSource f49425c;
    /* renamed from: d */
    private final C17679a f49426d = new C17679a(this.f49425c);
    /* renamed from: e */
    private final boolean f49427e;

    /* renamed from: okhttp3.internal.http2.f$b */
    interface C15937b {
        /* renamed from: a */
        void mo13368a();

        /* renamed from: a */
        void mo13369a(int i, int i2, int i3, boolean z);

        /* renamed from: a */
        void mo13370a(int i, int i2, List<C15929a> list) throws IOException;

        /* renamed from: a */
        void mo13371a(int i, long j);

        /* renamed from: a */
        void mo13372a(int i, ErrorCode errorCode);

        /* renamed from: a */
        void mo13373a(int i, ErrorCode errorCode, ByteString byteString);

        /* renamed from: a */
        void mo13374a(boolean z, int i, int i2);

        /* renamed from: a */
        void mo13375a(boolean z, int i, int i2, List<C15929a> list);

        /* renamed from: a */
        void mo13376a(boolean z, int i, BufferedSource bufferedSource, int i2) throws IOException;

        /* renamed from: a */
        void mo13377a(boolean z, C15943j c15943j);
    }

    /* renamed from: okhttp3.internal.http2.f$a */
    static final class C17679a implements Source {
        /* renamed from: a */
        int f54969a;
        /* renamed from: b */
        byte f54970b;
        /* renamed from: c */
        int f54971c;
        /* renamed from: d */
        int f54972d;
        /* renamed from: e */
        short f54973e;
        /* renamed from: f */
        private final BufferedSource f54974f;

        public void close() throws IOException {
        }

        C17679a(BufferedSource bufferedSource) {
            this.f54974f = bufferedSource;
        }

        public long read(C18549c c18549c, long j) throws IOException {
            while (this.f54972d == 0) {
                this.f54974f.skip((long) this.f54973e);
                this.f54973e = (short) 0;
                if ((this.f54970b & 4) != 0) {
                    return -1;
                }
                m64355a();
            }
            c18549c = this.f54974f.read(c18549c, Math.min(j, (long) this.f54972d));
            if (c18549c == -1) {
                return -1;
            }
            this.f54972d = (int) (((long) this.f54972d) - c18549c);
            return c18549c;
        }

        public C15982q timeout() {
            return this.f54974f.timeout();
        }

        /* renamed from: a */
        private void m64355a() throws IOException {
            int i = this.f54971c;
            int a = C15938f.m60359a(this.f54974f);
            this.f54972d = a;
            this.f54969a = a;
            byte readByte = (byte) (this.f54974f.readByte() & 255);
            this.f54970b = (byte) (this.f54974f.readByte() & 255);
            if (C15938f.f49423a.isLoggable(Level.FINE)) {
                C15938f.f49423a.fine(C15933c.m60313a(true, this.f54971c, this.f54969a, readByte, this.f54970b));
            }
            this.f54971c = this.f54974f.readInt() & ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
            if (readByte != (byte) 9) {
                throw C15933c.m60314b("%s != TYPE_CONTINUATION", Byte.valueOf(readByte));
            } else if (this.f54971c != i) {
                throw C15933c.m60314b("TYPE_CONTINUATION streamId changed", new Object[0]);
            }
        }
    }

    C15938f(BufferedSource bufferedSource, boolean z) {
        this.f49425c = bufferedSource;
        this.f49427e = z;
    }

    /* renamed from: a */
    public void m60371a(C15937b c15937b) throws IOException {
        if (!this.f49427e) {
            c15937b = this.f49425c.readByteString((long) C15933c.f49388a.mo13431h());
            if (f49423a.isLoggable(Level.FINE)) {
                f49423a.fine(C15908c.m60157a("<< CONNECTION %s", c15937b.mo13429f()));
            }
            if (!C15933c.f49388a.equals(c15937b)) {
                throw C15933c.m60314b("Expected a connection header but was %s", c15937b.mo13419a());
            }
        } else if (m60372a(true, c15937b) == null) {
            throw C15933c.m60314b("Required SETTINGS preface not received", new Object[0]);
        }
    }

    /* renamed from: a */
    public boolean m60372a(boolean r7, okhttp3.internal.http2.C15938f.C15937b r8) throws java.io.IOException {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r6 = this;
        r0 = 0;
        r1 = r6.f49425c;	 Catch:{ IOException -> 0x0097 }
        r2 = 9;	 Catch:{ IOException -> 0x0097 }
        r1.require(r2);	 Catch:{ IOException -> 0x0097 }
        r1 = r6.f49425c;
        r1 = okhttp3.internal.http2.C15938f.m60359a(r1);
        r2 = 1;
        if (r1 < 0) goto L_0x0088;
    L_0x0011:
        r3 = 16384; // 0x4000 float:2.2959E-41 double:8.0948E-320;
        if (r1 <= r3) goto L_0x0017;
    L_0x0015:
        goto L_0x0088;
    L_0x0017:
        r3 = r6.f49425c;
        r3 = r3.readByte();
        r3 = r3 & 255;
        r3 = (byte) r3;
        if (r7 == 0) goto L_0x0034;
    L_0x0022:
        r7 = 4;
        if (r3 == r7) goto L_0x0034;
    L_0x0025:
        r7 = "Expected a SETTINGS frame but was %s";
        r8 = new java.lang.Object[r2];
        r1 = java.lang.Byte.valueOf(r3);
        r8[r0] = r1;
        r7 = okhttp3.internal.http2.C15933c.m60314b(r7, r8);
        throw r7;
    L_0x0034:
        r7 = r6.f49425c;
        r7 = r7.readByte();
        r7 = r7 & 255;
        r7 = (byte) r7;
        r0 = r6.f49425c;
        r0 = r0.readInt();
        r4 = 2147483647; // 0x7fffffff float:NaN double:1.060997895E-314;
        r0 = r0 & r4;
        r4 = f49423a;
        r5 = java.util.logging.Level.FINE;
        r4 = r4.isLoggable(r5);
        if (r4 == 0) goto L_0x005a;
    L_0x0051:
        r4 = f49423a;
        r5 = okhttp3.internal.http2.C15933c.m60313a(r2, r0, r1, r3, r7);
        r4.fine(r5);
    L_0x005a:
        switch(r3) {
            case 0: goto L_0x0084;
            case 1: goto L_0x0080;
            case 2: goto L_0x007c;
            case 3: goto L_0x0078;
            case 4: goto L_0x0074;
            case 5: goto L_0x0070;
            case 6: goto L_0x006c;
            case 7: goto L_0x0068;
            case 8: goto L_0x0064;
            default: goto L_0x005d;
        };
    L_0x005d:
        r7 = r6.f49425c;
        r0 = (long) r1;
        r7.skip(r0);
        goto L_0x0087;
    L_0x0064:
        r6.m60370i(r8, r1, r7, r0);
        goto L_0x0087;
    L_0x0068:
        r6.m60369h(r8, r1, r7, r0);
        goto L_0x0087;
    L_0x006c:
        r6.m60368g(r8, r1, r7, r0);
        goto L_0x0087;
    L_0x0070:
        r6.m60367f(r8, r1, r7, r0);
        goto L_0x0087;
    L_0x0074:
        r6.m60366e(r8, r1, r7, r0);
        goto L_0x0087;
    L_0x0078:
        r6.m60365d(r8, r1, r7, r0);
        goto L_0x0087;
    L_0x007c:
        r6.m60364c(r8, r1, r7, r0);
        goto L_0x0087;
    L_0x0080:
        r6.m60362a(r8, r1, r7, r0);
        goto L_0x0087;
    L_0x0084:
        r6.m60363b(r8, r1, r7, r0);
    L_0x0087:
        return r2;
    L_0x0088:
        r7 = "FRAME_SIZE_ERROR: %s";
        r8 = new java.lang.Object[r2];
        r1 = java.lang.Integer.valueOf(r1);
        r8[r0] = r1;
        r7 = okhttp3.internal.http2.C15933c.m60314b(r7, r8);
        throw r7;
    L_0x0097:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http2.f.a(boolean, okhttp3.internal.http2.f$b):boolean");
    }

    /* renamed from: a */
    private void m60362a(C15937b c15937b, int i, byte b, int i2) throws IOException {
        short s = (short) 0;
        if (i2 == 0) {
            throw C15933c.m60314b("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0", new Object[0]);
        }
        boolean z = (b & 1) != 0;
        if ((b & 8) != 0) {
            s = (short) (this.f49425c.readByte() & 255);
        }
        if ((b & 32) != 0) {
            m60361a(c15937b, i2);
            i -= 5;
        }
        c15937b.mo13375a(z, i2, (int) (byte) -1, m60360a(C15938f.m60358a(i, b, s), s, b, i2));
    }

    /* renamed from: a */
    private List<C15929a> m60360a(int i, short s, byte b, int i2) throws IOException {
        C17679a c17679a = this.f49426d;
        this.f49426d.f54972d = i;
        c17679a.f54969a = i;
        this.f49426d.f54973e = s;
        this.f49426d.f54970b = b;
        this.f49426d.f54971c = i2;
        this.f49424b.m60298a();
        return this.f49424b.m60299b();
    }

    /* renamed from: b */
    private void m60363b(C15937b c15937b, int i, byte b, int i2) throws IOException {
        short s = (short) 0;
        if (i2 == 0) {
            throw C15933c.m60314b("PROTOCOL_ERROR: TYPE_DATA streamId == 0", new Object[0]);
        }
        Object obj = 1;
        boolean z = (b & 1) != 0;
        if ((b & 32) == 0) {
            obj = null;
        }
        if (obj != null) {
            throw C15933c.m60314b("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA", new Object[0]);
        }
        if ((b & 8) != 0) {
            s = (short) (this.f49425c.readByte() & 255);
        }
        c15937b.mo13376a(z, i2, this.f49425c, C15938f.m60358a(i, b, s));
        this.f49425c.skip((long) s);
    }

    /* renamed from: c */
    private void m60364c(C15937b c15937b, int i, byte b, int i2) throws IOException {
        if (i != 5) {
            throw C15933c.m60314b("TYPE_PRIORITY length: %d != 5", new Object[]{Integer.valueOf(i)});
        } else if (i2 == 0) {
            throw C15933c.m60314b("TYPE_PRIORITY streamId == 0", new Object[0]);
        } else {
            m60361a(c15937b, i2);
        }
    }

    /* renamed from: a */
    private void m60361a(C15937b c15937b, int i) throws IOException {
        int readInt = this.f49425c.readInt();
        c15937b.mo13369a(i, readInt & ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED, (this.f49425c.readByte() & 255) + 1, (Integer.MIN_VALUE & readInt) != 0);
    }

    /* renamed from: d */
    private void m60365d(C15937b c15937b, int i, byte b, int i2) throws IOException {
        if (i != 4) {
            throw C15933c.m60314b("TYPE_RST_STREAM length: %d != 4", new Object[]{Integer.valueOf(i)});
        } else if (i2 == 0) {
            throw C15933c.m60314b("TYPE_RST_STREAM streamId == 0", new Object[0]);
        } else {
            ErrorCode fromHttp2 = ErrorCode.fromHttp2(this.f49425c.readInt());
            if (fromHttp2 == null) {
                throw C15933c.m60314b("TYPE_RST_STREAM unexpected error code: %d", new Object[]{Integer.valueOf(i)});
            } else {
                c15937b.mo13372a(i2, fromHttp2);
            }
        }
    }

    /* renamed from: e */
    private void m60366e(C15937b c15937b, int i, byte b, int i2) throws IOException {
        if (i2 != 0) {
            throw C15933c.m60314b("TYPE_SETTINGS streamId != 0", new Object[0]);
        } else if ((b & (byte) 1) != (byte) 0) {
            if (i != 0) {
                throw C15933c.m60314b("FRAME_SIZE_ERROR ack frame should be empty!", new Object[0]);
            }
            c15937b.mo13368a();
        } else if (i % 6 != (byte) 0) {
            throw C15933c.m60314b("TYPE_SETTINGS length %% 6 != 0: %s", new Object[]{Integer.valueOf(i)});
        } else {
            C15943j c15943j = new C15943j();
            for (int i3 = 0; i3 < i; i3 += 6) {
                int readShort = this.f49425c.readShort() & 65535;
                int readInt = this.f49425c.readInt();
                switch (readShort) {
                    case 1:
                    case 6:
                        break;
                    case 2:
                        if (!(readInt == 0 || readInt == 1)) {
                            throw C15933c.m60314b("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1", new Object[0]);
                        }
                    case 3:
                        readShort = 4;
                        break;
                    case 4:
                        readShort = 7;
                        if (readInt >= 0) {
                            break;
                        }
                        throw C15933c.m60314b("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1", new Object[0]);
                    case 5:
                        if (readInt >= 16384 && readInt <= 16777215) {
                            break;
                        }
                        throw C15933c.m60314b("PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: %s", new Object[]{Integer.valueOf(readInt)});
                        break;
                    default:
                        break;
                }
                c15943j.m60415a(readShort, readInt);
            }
            c15937b.mo13377a(false, c15943j);
        }
    }

    /* renamed from: f */
    private void m60367f(C15937b c15937b, int i, byte b, int i2) throws IOException {
        short s = (short) 0;
        if (i2 == 0) {
            throw C15933c.m60314b("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0", new Object[0]);
        }
        if ((b & 8) != 0) {
            s = (short) (this.f49425c.readByte() & 255);
        }
        c15937b.mo13370a(i2, this.f49425c.readInt() & ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED, m60360a(C15938f.m60358a(i - 4, b, s), s, b, i2));
    }

    /* renamed from: g */
    private void m60368g(C15937b c15937b, int i, byte b, int i2) throws IOException {
        boolean z = false;
        if (i != 8) {
            throw C15933c.m60314b("TYPE_PING length != 8: %s", new Object[]{Integer.valueOf(i)});
        } else if (i2 != 0) {
            throw C15933c.m60314b("TYPE_PING streamId != 0", new Object[0]);
        } else {
            i = this.f49425c.readInt();
            i2 = this.f49425c.readInt();
            if ((b & (byte) 1) != (byte) 0) {
                z = true;
            }
            c15937b.mo13374a(z, i, i2);
        }
    }

    /* renamed from: h */
    private void m60369h(C15937b c15937b, int i, byte b, int i2) throws IOException {
        if (i < 8) {
            throw C15933c.m60314b("TYPE_GOAWAY length < 8: %s", new Object[]{Integer.valueOf(i)});
        } else if (i2 != 0) {
            throw C15933c.m60314b("TYPE_GOAWAY streamId != 0", new Object[0]);
        } else {
            i2 = this.f49425c.readInt();
            i -= 8;
            ErrorCode fromHttp2 = ErrorCode.fromHttp2(this.f49425c.readInt());
            if (fromHttp2 == null) {
                throw C15933c.m60314b("TYPE_GOAWAY unexpected error code: %d", new Object[]{Integer.valueOf(r2)});
            }
            ByteString byteString = ByteString.f49592b;
            if (i > 0) {
                byteString = this.f49425c.readByteString((long) i);
            }
            c15937b.mo13373a(i2, fromHttp2, byteString);
        }
    }

    /* renamed from: i */
    private void m60370i(C15937b c15937b, int i, byte b, int i2) throws IOException {
        if (i != 4) {
            throw C15933c.m60314b("TYPE_WINDOW_UPDATE length !=4: %s", new Object[]{Integer.valueOf(i)});
        }
        long readInt = ((long) this.f49425c.readInt()) & 2147483647L;
        if (readInt == 0) {
            throw C15933c.m60314b("windowSizeIncrement was 0", new Object[]{Long.valueOf(readInt)});
        } else {
            c15937b.mo13371a(i2, readInt);
        }
    }

    public void close() throws IOException {
        this.f49425c.close();
    }

    /* renamed from: a */
    static int m60359a(BufferedSource bufferedSource) throws IOException {
        return (bufferedSource.readByte() & 255) | (((bufferedSource.readByte() & 255) << 16) | ((bufferedSource.readByte() & 255) << 8));
    }

    /* renamed from: a */
    static int m60358a(int i, byte b, short s) throws IOException {
        if ((b & 8) != (byte) 0) {
            short s2 = i - 1;
        }
        if (s <= s2) {
            return (short) (s2 - s);
        }
        throw C15933c.m60314b("PROTOCOL_ERROR padding %s > remaining length %s", Short.valueOf(s), Integer.valueOf(s2));
    }
}
