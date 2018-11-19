package com.squareup.okhttp.internal.framed;

import android.support.v7.widget.ActivityChooserView.ActivityChooserViewAdapter;
import com.esotericsoftware.kryo.util.DefaultClassResolver;
import com.squareup.okhttp.Protocol;
import com.squareup.okhttp.internal.framed.C6031d.C6029a;
import com.squareup.okhttp.internal.framed.C6031d.C6030b;
import com.squareup.okhttp.internal.framed.FrameReader.Handler;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import okio.BufferedSink;
import okio.BufferedSource;
import okio.ByteString;
import okio.C15982q;
import okio.C18549c;
import okio.Source;

/* renamed from: com.squareup.okhttp.internal.framed.e */
public final class C7229e implements Variant {
    /* renamed from: a */
    private static final Logger f26077a = Logger.getLogger(C6032b.class.getName());
    /* renamed from: b */
    private static final ByteString f26078b = ByteString.a("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");

    /* renamed from: com.squareup.okhttp.internal.framed.e$b */
    static final class C6032b {
        /* renamed from: a */
        private static final String[] f22112a = new String[]{"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};
        /* renamed from: b */
        private static final String[] f22113b = new String[64];
        /* renamed from: c */
        private static final String[] f22114c = new String[256];

        C6032b() {
        }

        /* renamed from: a */
        static String m26077a(boolean z, int i, int i2, byte b, byte b2) {
            String format = b < f22112a.length ? f22112a[b] : String.format("0x%02x", new Object[]{Byte.valueOf(b)});
            b = C6032b.m26076a(b, b2);
            b2 = "%s 0x%08x %5d %-13s %s";
            Object[] objArr = new Object[5];
            objArr[0] = z ? "<<" : ">>";
            objArr[1] = Integer.valueOf(i);
            objArr[true] = Integer.valueOf(i2);
            objArr[true] = format;
            objArr[true] = b;
            return String.format(b2, objArr);
        }

        /* renamed from: a */
        static String m26076a(byte b, byte b2) {
            if (b2 == (byte) 0) {
                return "";
            }
            switch (b) {
                case (byte) 2:
                case (byte) 3:
                case (byte) 7:
                case (byte) 8:
                    return f22114c[b2];
                case (byte) 4:
                case (byte) 6:
                    return b2 == (byte) 1 ? "ACK" : f22114c[b2];
                default:
                    String str;
                    if (b2 < f22113b.length) {
                        str = f22113b[b2];
                    } else {
                        str = f22114c[b2];
                    }
                    if (b != (byte) 5 || (b2 & 4) == 0) {
                        return (b != (byte) 0 || (b2 & 32) == (byte) 0) ? str : str.replace("PRIORITY", "COMPRESSED");
                    } else {
                        return str.replace("HEADERS", "PUSH_PROMISE");
                    }
            }
        }

        static {
            int i = 0;
            for (int i2 = 0; i2 < f22114c.length; i2++) {
                f22114c[i2] = String.format("%8s", new Object[]{Integer.toBinaryString(i2)}).replace(' ', '0');
            }
            f22113b[0] = "";
            f22113b[1] = "END_STREAM";
            int[] iArr = new int[]{1};
            f22113b[8] = "PADDED";
            for (int i3 : iArr) {
                String[] strArr = f22113b;
                int i4 = i3 | 8;
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(f22113b[i3]);
                stringBuilder.append("|PADDED");
                strArr[i4] = stringBuilder.toString();
            }
            f22113b[4] = "END_HEADERS";
            f22113b[32] = "PRIORITY";
            f22113b[36] = "END_HEADERS|PRIORITY";
            for (int i32 : new int[]{4, 32, 36}) {
                for (int i5 : iArr) {
                    String[] strArr2 = f22113b;
                    int i6 = i5 | i32;
                    StringBuilder stringBuilder2 = new StringBuilder();
                    stringBuilder2.append(f22113b[i5]);
                    stringBuilder2.append('|');
                    stringBuilder2.append(f22113b[i32]);
                    strArr2[i6] = stringBuilder2.toString();
                    strArr2 = f22113b;
                    i6 |= 8;
                    stringBuilder2 = new StringBuilder();
                    stringBuilder2.append(f22113b[i5]);
                    stringBuilder2.append('|');
                    stringBuilder2.append(f22113b[i32]);
                    stringBuilder2.append("|PADDED");
                    strArr2[i6] = stringBuilder2.toString();
                }
            }
            while (i < f22113b.length) {
                if (f22113b[i] == null) {
                    f22113b[i] = f22114c[i];
                }
                i++;
            }
        }
    }

    /* renamed from: com.squareup.okhttp.internal.framed.e$a */
    static final class C7226a implements Source {
        /* renamed from: a */
        int f26061a;
        /* renamed from: b */
        byte f26062b;
        /* renamed from: c */
        int f26063c;
        /* renamed from: d */
        int f26064d;
        /* renamed from: e */
        short f26065e;
        /* renamed from: f */
        private final BufferedSource f26066f;

        public void close() throws IOException {
        }

        public C7226a(BufferedSource bufferedSource) {
            this.f26066f = bufferedSource;
        }

        public long read(C18549c c18549c, long j) throws IOException {
            while (this.f26064d == 0) {
                this.f26066f.skip((long) this.f26065e);
                this.f26065e = (short) 0;
                if ((this.f26062b & 4) != 0) {
                    return -1;
                }
                m30978a();
            }
            c18549c = this.f26066f.read(c18549c, Math.min(j, (long) this.f26064d));
            if (c18549c == -1) {
                return -1;
            }
            this.f26064d = (int) (((long) this.f26064d) - c18549c);
            return c18549c;
        }

        public C15982q timeout() {
            return this.f26066f.timeout();
        }

        /* renamed from: a */
        private void m30978a() throws IOException {
            int i = this.f26063c;
            int a = C7229e.m31000b(this.f26066f);
            this.f26064d = a;
            this.f26061a = a;
            byte readByte = (byte) (this.f26066f.readByte() & 255);
            this.f26062b = (byte) (this.f26066f.readByte() & 255);
            if (C7229e.f26077a.isLoggable(Level.FINE)) {
                C7229e.f26077a.fine(C6032b.m26077a(true, this.f26063c, this.f26061a, readByte, this.f26062b));
            }
            this.f26063c = this.f26066f.readInt() & ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
            if (readByte != (byte) 9) {
                throw C7229e.m31005d("%s != TYPE_CONTINUATION", Byte.valueOf(readByte));
            } else if (this.f26063c != i) {
                throw C7229e.m31005d("TYPE_CONTINUATION streamId changed", new Object[0]);
            }
        }
    }

    /* renamed from: com.squareup.okhttp.internal.framed.e$c */
    static final class C7227c implements FrameReader {
        /* renamed from: a */
        final C6029a f26067a;
        /* renamed from: b */
        private final BufferedSource f26068b;
        /* renamed from: c */
        private final C7226a f26069c = new C7226a(this.f26068b);
        /* renamed from: d */
        private final boolean f26070d;

        C7227c(BufferedSource bufferedSource, int i, boolean z) {
            this.f26068b = bufferedSource;
            this.f26070d = z;
            this.f26067a = new C6029a(i, this.f26069c);
        }

        public void readConnectionPreface() throws IOException {
            if (!this.f26070d) {
                ByteString readByteString = this.f26068b.readByteString((long) C7229e.f26078b.h());
                if (C7229e.f26077a.isLoggable(Level.FINE)) {
                    C7229e.f26077a.fine(String.format("<< CONNECTION %s", new Object[]{readByteString.f()}));
                }
                if (!C7229e.f26078b.equals(readByteString)) {
                    throw C7229e.m31005d("Expected a connection header but was %s", readByteString.a());
                }
            }
        }

        public boolean nextFrame(com.squareup.okhttp.internal.framed.FrameReader.Handler r8) throws java.io.IOException {
            /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
            /*
            r7 = this;
            r0 = 0;
            r1 = r7.f26068b;	 Catch:{ IOException -> 0x0086 }
            r2 = 9;	 Catch:{ IOException -> 0x0086 }
            r1.require(r2);	 Catch:{ IOException -> 0x0086 }
            r1 = r7.f26068b;
            r1 = com.squareup.okhttp.internal.framed.C7229e.m31000b(r1);
            r2 = 1;
            if (r1 < 0) goto L_0x0077;
        L_0x0011:
            r3 = 16384; // 0x4000 float:2.2959E-41 double:8.0948E-320;
            if (r1 <= r3) goto L_0x0016;
        L_0x0015:
            goto L_0x0077;
        L_0x0016:
            r0 = r7.f26068b;
            r0 = r0.readByte();
            r0 = r0 & 255;
            r0 = (byte) r0;
            r3 = r7.f26068b;
            r3 = r3.readByte();
            r3 = r3 & 255;
            r3 = (byte) r3;
            r4 = r7.f26068b;
            r4 = r4.readInt();
            r5 = 2147483647; // 0x7fffffff float:NaN double:1.060997895E-314;
            r4 = r4 & r5;
            r5 = com.squareup.okhttp.internal.framed.C7229e.f26077a;
            r6 = java.util.logging.Level.FINE;
            r5 = r5.isLoggable(r6);
            if (r5 == 0) goto L_0x0049;
        L_0x003e:
            r5 = com.squareup.okhttp.internal.framed.C7229e.f26077a;
            r6 = com.squareup.okhttp.internal.framed.C7229e.C6032b.m26077a(r2, r4, r1, r0, r3);
            r5.fine(r6);
        L_0x0049:
            switch(r0) {
                case 0: goto L_0x0073;
                case 1: goto L_0x006f;
                case 2: goto L_0x006b;
                case 3: goto L_0x0067;
                case 4: goto L_0x0063;
                case 5: goto L_0x005f;
                case 6: goto L_0x005b;
                case 7: goto L_0x0057;
                case 8: goto L_0x0053;
                default: goto L_0x004c;
            };
        L_0x004c:
            r8 = r7.f26068b;
            r0 = (long) r1;
            r8.skip(r0);
            goto L_0x0076;
        L_0x0053:
            r7.m30989i(r8, r1, r3, r4);
            goto L_0x0076;
        L_0x0057:
            r7.m30988h(r8, r1, r3, r4);
            goto L_0x0076;
        L_0x005b:
            r7.m30987g(r8, r1, r3, r4);
            goto L_0x0076;
        L_0x005f:
            r7.m30986f(r8, r1, r3, r4);
            goto L_0x0076;
        L_0x0063:
            r7.m30985e(r8, r1, r3, r4);
            goto L_0x0076;
        L_0x0067:
            r7.m30984d(r8, r1, r3, r4);
            goto L_0x0076;
        L_0x006b:
            r7.m30983c(r8, r1, r3, r4);
            goto L_0x0076;
        L_0x006f:
            r7.m30981a(r8, r1, r3, r4);
            goto L_0x0076;
        L_0x0073:
            r7.m30982b(r8, r1, r3, r4);
        L_0x0076:
            return r2;
        L_0x0077:
            r8 = "FRAME_SIZE_ERROR: %s";
            r2 = new java.lang.Object[r2];
            r1 = java.lang.Integer.valueOf(r1);
            r2[r0] = r1;
            r8 = com.squareup.okhttp.internal.framed.C7229e.m31005d(r8, r2);
            throw r8;
        L_0x0086:
            return r0;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.squareup.okhttp.internal.framed.e.c.nextFrame(com.squareup.okhttp.internal.framed.FrameReader$Handler):boolean");
        }

        /* renamed from: a */
        private void m30981a(Handler handler, int i, byte b, int i2) throws IOException {
            short s = (short) 0;
            if (i2 == 0) {
                throw C7229e.m31005d("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0", new Object[0]);
            }
            boolean z = (b & 1) != 0;
            if ((b & 8) != 0) {
                s = (short) (this.f26068b.readByte() & 255);
            }
            if ((b & 32) != 0) {
                m30980a(handler, i2);
                i -= 5;
            }
            handler.headers(false, z, i2, -1, m30979a(C7229e.m30999b(i, b, s), s, b, i2), HeadersMode.HTTP_20_HEADERS);
        }

        /* renamed from: a */
        private List<C6028c> m30979a(int i, short s, byte b, int i2) throws IOException {
            C7226a c7226a = this.f26069c;
            this.f26069c.f26064d = i;
            c7226a.f26061a = i;
            this.f26069c.f26065e = s;
            this.f26069c.f26062b = b;
            this.f26069c.f26063c = i2;
            this.f26067a.m26064a();
            return this.f26067a.m26066b();
        }

        /* renamed from: b */
        private void m30982b(Handler handler, int i, byte b, int i2) throws IOException {
            Object obj = 1;
            short s = (short) 0;
            boolean z = (b & 1) != 0;
            if ((b & 32) == 0) {
                obj = null;
            }
            if (obj != null) {
                throw C7229e.m31005d("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA", new Object[0]);
            }
            if ((b & 8) != 0) {
                s = (short) (this.f26068b.readByte() & 255);
            }
            handler.data(z, i2, this.f26068b, C7229e.m30999b(i, b, s));
            this.f26068b.skip((long) s);
        }

        /* renamed from: c */
        private void m30983c(Handler handler, int i, byte b, int i2) throws IOException {
            if (i != 5) {
                throw C7229e.m31005d("TYPE_PRIORITY length: %d != 5", Integer.valueOf(i));
            } else if (i2 == 0) {
                throw C7229e.m31005d("TYPE_PRIORITY streamId == 0", new Object[0]);
            } else {
                m30980a(handler, i2);
            }
        }

        /* renamed from: a */
        private void m30980a(Handler handler, int i) throws IOException {
            int readInt = this.f26068b.readInt();
            handler.priority(i, readInt & ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED, (this.f26068b.readByte() & 255) + 1, (Integer.MIN_VALUE & readInt) != 0);
        }

        /* renamed from: d */
        private void m30984d(Handler handler, int i, byte b, int i2) throws IOException {
            if (i != 4) {
                throw C7229e.m31005d("TYPE_RST_STREAM length: %d != 4", Integer.valueOf(i));
            } else if (i2 == 0) {
                throw C7229e.m31005d("TYPE_RST_STREAM streamId == 0", new Object[0]);
            } else {
                ErrorCode fromHttp2 = ErrorCode.fromHttp2(this.f26068b.readInt());
                if (fromHttp2 == null) {
                    throw C7229e.m31005d("TYPE_RST_STREAM unexpected error code: %d", Integer.valueOf(i));
                } else {
                    handler.rstStream(i2, fromHttp2);
                }
            }
        }

        /* renamed from: e */
        private void m30985e(Handler handler, int i, byte b, int i2) throws IOException {
            if (i2 != 0) {
                throw C7229e.m31005d("TYPE_SETTINGS streamId != 0", new Object[0]);
            } else if ((b & (byte) 1) != (byte) 0) {
                if (i != 0) {
                    throw C7229e.m31005d("FRAME_SIZE_ERROR ack frame should be empty!", new Object[0]);
                }
                handler.ackSettings();
            } else if (i % 6 != (byte) 0) {
                throw C7229e.m31005d("TYPE_SETTINGS length %% 6 != 0: %s", Integer.valueOf(i));
            } else {
                b = new C6038i();
                for (int i3 = 0; i3 < i; i3 += 6) {
                    int readShort = this.f26068b.readShort();
                    int readInt = this.f26068b.readInt();
                    switch (readShort) {
                        case 1:
                        case 6:
                            break;
                        case 2:
                            if (!(readInt == 0 || readInt == 1)) {
                                throw C7229e.m31005d("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1", new Object[0]);
                            }
                        case 3:
                            readShort = 4;
                            break;
                        case 4:
                            readShort = 7;
                            if (readInt >= 0) {
                                break;
                            }
                            throw C7229e.m31005d("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1", new Object[0]);
                        case 5:
                            if (readInt >= 16384 && readInt <= 16777215) {
                                break;
                            }
                            throw C7229e.m31005d("PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: %s", Integer.valueOf(readInt));
                            break;
                        default:
                            throw C7229e.m31005d("PROTOCOL_ERROR invalid settings id: %s", Short.valueOf(readShort));
                    }
                    b.m26094a(readShort, 0, readInt);
                }
                handler.settings(false, b);
                if (b.m26100c() >= null) {
                    this.f26067a.m26065a(b.m26100c());
                }
            }
        }

        /* renamed from: f */
        private void m30986f(Handler handler, int i, byte b, int i2) throws IOException {
            short s = (short) 0;
            if (i2 == 0) {
                throw C7229e.m31005d("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0", new Object[0]);
            }
            if ((b & 8) != 0) {
                s = (short) (this.f26068b.readByte() & 255);
            }
            handler.pushPromise(i2, this.f26068b.readInt() & ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED, m30979a(C7229e.m30999b(i - 4, b, s), s, b, i2));
        }

        /* renamed from: g */
        private void m30987g(Handler handler, int i, byte b, int i2) throws IOException {
            boolean z = false;
            if (i != 8) {
                throw C7229e.m31005d("TYPE_PING length != 8: %s", Integer.valueOf(i));
            } else if (i2 != 0) {
                throw C7229e.m31005d("TYPE_PING streamId != 0", new Object[0]);
            } else {
                i = this.f26068b.readInt();
                i2 = this.f26068b.readInt();
                if ((b & (byte) 1) != (byte) 0) {
                    z = true;
                }
                handler.ping(z, i, i2);
            }
        }

        /* renamed from: h */
        private void m30988h(Handler handler, int i, byte b, int i2) throws IOException {
            if (i < 8) {
                throw C7229e.m31005d("TYPE_GOAWAY length < 8: %s", Integer.valueOf(i));
            } else if (i2 != 0) {
                throw C7229e.m31005d("TYPE_GOAWAY streamId != 0", new Object[0]);
            } else {
                i2 = this.f26068b.readInt();
                i -= 8;
                ErrorCode fromHttp2 = ErrorCode.fromHttp2(this.f26068b.readInt());
                if (fromHttp2 == null) {
                    throw C7229e.m31005d("TYPE_GOAWAY unexpected error code: %d", Integer.valueOf(r2));
                }
                b = ByteString.f49592b;
                if (i > 0) {
                    b = this.f26068b.readByteString((long) i);
                }
                handler.goAway(i2, fromHttp2, b);
            }
        }

        /* renamed from: i */
        private void m30989i(Handler handler, int i, byte b, int i2) throws IOException {
            if (i != 4) {
                throw C7229e.m31005d("TYPE_WINDOW_UPDATE length !=4: %s", Integer.valueOf(i));
            }
            long readInt = ((long) this.f26068b.readInt()) & 2147483647L;
            if (readInt == 0) {
                throw C7229e.m31005d("windowSizeIncrement was 0", Long.valueOf(readInt));
            } else {
                handler.windowUpdate(i2, readInt);
            }
        }

        public void close() throws IOException {
            this.f26068b.close();
        }
    }

    /* renamed from: com.squareup.okhttp.internal.framed.e$d */
    static final class C7228d implements FrameWriter {
        /* renamed from: a */
        private final BufferedSink f26071a;
        /* renamed from: b */
        private final boolean f26072b;
        /* renamed from: c */
        private final C18549c f26073c = new C18549c();
        /* renamed from: d */
        private final C6030b f26074d = new C6030b(this.f26073c);
        /* renamed from: e */
        private int f26075e = 16384;
        /* renamed from: f */
        private boolean f26076f;

        C7228d(BufferedSink bufferedSink, boolean z) {
            this.f26071a = bufferedSink;
            this.f26072b = z;
        }

        public synchronized void flush() throws IOException {
            if (this.f26076f) {
                throw new IOException("closed");
            }
            this.f26071a.flush();
        }

        public synchronized void ackSettings(C6038i c6038i) throws IOException {
            if (this.f26076f) {
                throw new IOException("closed");
            }
            this.f26075e = c6038i.m26102d(this.f26075e);
            m30992a(0, 0, (byte) 4, (byte) 1);
            this.f26071a.flush();
        }

        public synchronized void connectionPreface() throws IOException {
            if (this.f26076f) {
                throw new IOException("closed");
            } else if (this.f26072b) {
                if (C7229e.f26077a.isLoggable(Level.FINE)) {
                    C7229e.f26077a.fine(String.format(">> CONNECTION %s", new Object[]{C7229e.f26078b.f()}));
                }
                this.f26071a.write(C7229e.f26078b.i());
                this.f26071a.flush();
            }
        }

        public synchronized void synStream(boolean z, boolean z2, int i, int i2, List<C6028c> list) throws IOException {
            if (z2) {
                throw new UnsupportedOperationException();
            } else if (this.f26076f) {
                throw new IOException("closed");
            } else {
                m30993a(z, i, list);
            }
        }

        public synchronized void synReply(boolean z, int i, List<C6028c> list) throws IOException {
            if (this.f26076f) {
                throw new IOException("closed");
            }
            m30993a(z, i, list);
        }

        public synchronized void headers(int i, List<C6028c> list) throws IOException {
            if (this.f26076f) {
                throw new IOException("closed");
            }
            m30993a(false, i, list);
        }

        public synchronized void pushPromise(int i, int i2, List<C6028c> list) throws IOException {
            if (this.f26076f) {
                throw new IOException("closed");
            }
            this.f26074d.m26069a((List) list);
            long a = this.f26073c.a();
            list = (int) Math.min((long) (this.f26075e - 4), a);
            long j = (long) list;
            m30992a(i, list + 4, (byte) 5, a == j ? (byte) 4 : (byte) 0);
            this.f26071a.writeInt(i2 & ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED);
            this.f26071a.write(this.f26073c, j);
            if (a > j) {
                m30990a(i, a - j);
            }
        }

        /* renamed from: a */
        void m30993a(boolean z, int i, List<C6028c> list) throws IOException {
            if (this.f26076f) {
                throw new IOException("closed");
            }
            this.f26074d.m26069a((List) list);
            long a = this.f26073c.a();
            int min = (int) Math.min((long) this.f26075e, a);
            long j = (long) min;
            byte b = a == j ? (byte) 4 : (byte) 0;
            if (z) {
                b = (byte) (b | 1);
            }
            m30992a(i, min, (byte) true, b);
            this.f26071a.write(this.f26073c, j);
            if (a > j) {
                m30990a(i, a - j);
            }
        }

        /* renamed from: a */
        private void m30990a(int i, long j) throws IOException {
            while (j > 0) {
                int min = (int) Math.min((long) this.f26075e, j);
                long j2 = (long) min;
                long j3 = j - j2;
                m30992a(i, min, (byte) 9, j3 == 0 ? (byte) 4 : (byte) 0);
                this.f26071a.write(this.f26073c, j2);
                j = j3;
            }
        }

        public synchronized void rstStream(int i, ErrorCode errorCode) throws IOException {
            if (this.f26076f) {
                throw new IOException("closed");
            } else if (errorCode.httpCode == -1) {
                throw new IllegalArgumentException();
            } else {
                m30992a(i, 4, (byte) 3, (byte) 0);
                this.f26071a.writeInt(errorCode.httpCode);
                this.f26071a.flush();
            }
        }

        public int maxDataLength() {
            return this.f26075e;
        }

        public synchronized void data(boolean z, int i, C18549c c18549c, int i2) throws IOException {
            if (this.f26076f) {
                throw new IOException("closed");
            }
            byte b = (byte) 0;
            if (z) {
                b = (byte) true;
            }
            m30991a(i, b, c18549c, i2);
        }

        /* renamed from: a */
        void m30991a(int i, byte b, C18549c c18549c, int i2) throws IOException {
            m30992a(i, i2, (byte) 0, b);
            if (i2 > 0) {
                this.f26071a.write(c18549c, (long) i2);
            }
        }

        public synchronized void settings(C6038i c6038i) throws IOException {
            if (this.f26076f) {
                throw new IOException("closed");
            }
            int i = (byte) 0;
            m30992a(0, c6038i.m26098b() * 6, (byte) 4, (byte) 0);
            while (i < 10) {
                if (c6038i.m26097a(i)) {
                    int i2 = i == 4 ? 3 : i == 7 ? 4 : i;
                    this.f26071a.writeShort(i2);
                    this.f26071a.writeInt(c6038i.m26099b(i));
                }
                i++;
            }
            this.f26071a.flush();
        }

        public synchronized void ping(boolean z, int i, int i2) throws IOException {
            if (this.f26076f) {
                throw new IOException("closed");
            }
            m30992a(0, 8, (byte) 6, (byte) z);
            this.f26071a.writeInt(i);
            this.f26071a.writeInt(i2);
            this.f26071a.flush();
        }

        public synchronized void goAway(int i, ErrorCode errorCode, byte[] bArr) throws IOException {
            if (this.f26076f) {
                throw new IOException("closed");
            } else if (errorCode.httpCode == -1) {
                throw C7229e.m31004c("errorCode.httpCode == -1", new Object[0]);
            } else {
                m30992a(0, bArr.length + 8, (byte) 7, (byte) 0);
                this.f26071a.writeInt(i);
                this.f26071a.writeInt(errorCode.httpCode);
                if (bArr.length > 0) {
                    this.f26071a.write(bArr);
                }
                this.f26071a.flush();
            }
        }

        public synchronized void windowUpdate(int i, long j) throws IOException {
            if (this.f26076f) {
                throw new IOException("closed");
            }
            if (j != 0) {
                if (j <= 2147483647L) {
                    m30992a(i, 4, (byte) 8, (byte) 0);
                    this.f26071a.writeInt((int) j);
                    this.f26071a.flush();
                }
            }
            throw C7229e.m31004c("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: %s", Long.valueOf(j));
        }

        public synchronized void close() throws IOException {
            this.f26076f = true;
            this.f26071a.close();
        }

        /* renamed from: a */
        void m30992a(int i, int i2, byte b, byte b2) throws IOException {
            if (C7229e.f26077a.isLoggable(Level.FINE)) {
                C7229e.f26077a.fine(C6032b.m26077a(false, i, i2, b, b2));
            }
            if (i2 > this.f26075e) {
                throw C7229e.m31004c("FRAME_SIZE_ERROR length > %d: %d", Integer.valueOf(this.f26075e), Integer.valueOf(i2));
            } else if ((Integer.MIN_VALUE & i) != 0) {
                throw C7229e.m31004c("reserved bit set: %s", Integer.valueOf(i));
            } else {
                C7229e.m31003b(this.f26071a, i2);
                this.f26071a.writeByte(b & 255);
                this.f26071a.writeByte(b2 & 255);
                this.f26071a.writeInt(i & DefaultClassResolver.NAME);
            }
        }
    }

    public Protocol getProtocol() {
        return Protocol.HTTP_2;
    }

    public FrameReader newReader(BufferedSource bufferedSource, boolean z) {
        return new C7227c(bufferedSource, 4096, z);
    }

    public FrameWriter newWriter(BufferedSink bufferedSink, boolean z) {
        return new C7228d(bufferedSink, z);
    }

    /* renamed from: c */
    private static IllegalArgumentException m31004c(String str, Object... objArr) {
        throw new IllegalArgumentException(String.format(str, objArr));
    }

    /* renamed from: d */
    private static IOException m31005d(String str, Object... objArr) throws IOException {
        throw new IOException(String.format(str, objArr));
    }

    /* renamed from: b */
    private static int m30999b(int i, byte b, short s) throws IOException {
        if ((b & 8) != (byte) 0) {
            short s2 = i - 1;
        }
        if (s <= s2) {
            return (short) (s2 - s);
        }
        throw C7229e.m31005d("PROTOCOL_ERROR padding %s > remaining length %s", Short.valueOf(s), Integer.valueOf(s2));
    }

    /* renamed from: b */
    private static int m31000b(BufferedSource bufferedSource) throws IOException {
        return (bufferedSource.readByte() & 255) | (((bufferedSource.readByte() & 255) << 16) | ((bufferedSource.readByte() & 255) << 8));
    }

    /* renamed from: b */
    private static void m31003b(BufferedSink bufferedSink, int i) throws IOException {
        bufferedSink.writeByte((i >>> 16) & 255);
        bufferedSink.writeByte((i >>> 8) & 255);
        bufferedSink.writeByte(i & 255);
    }
}
