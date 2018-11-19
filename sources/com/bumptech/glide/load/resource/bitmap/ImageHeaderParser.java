package com.bumptech.glide.load.resource.bitmap;

import android.util.Log;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public class ImageHeaderParser {
    /* renamed from: a */
    private static final byte[] f2863a;
    /* renamed from: b */
    private static final int[] f2864b = new int[]{0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8};
    /* renamed from: c */
    private final C1045b f2865c;

    public enum ImageType {
        GIF(true),
        JPEG(false),
        PNG_A(true),
        PNG(false),
        UNKNOWN(false);
        
        private final boolean hasAlpha;

        private ImageType(boolean z) {
            this.hasAlpha = z;
        }

        public boolean hasAlpha() {
            return this.hasAlpha;
        }
    }

    /* renamed from: com.bumptech.glide.load.resource.bitmap.ImageHeaderParser$a */
    private static class C1044a {
        /* renamed from: a */
        private final ByteBuffer f2861a;

        public C1044a(byte[] bArr) {
            this.f2861a = ByteBuffer.wrap(bArr);
            this.f2861a.order(ByteOrder.BIG_ENDIAN);
        }

        /* renamed from: a */
        public void m3595a(ByteOrder byteOrder) {
            this.f2861a.order(byteOrder);
        }

        /* renamed from: a */
        public int m3593a() {
            return this.f2861a.array().length;
        }

        /* renamed from: a */
        public int m3594a(int i) {
            return this.f2861a.getInt(i);
        }

        /* renamed from: b */
        public short m3596b(int i) {
            return this.f2861a.getShort(i);
        }
    }

    /* renamed from: com.bumptech.glide.load.resource.bitmap.ImageHeaderParser$b */
    private static class C1045b {
        /* renamed from: a */
        private final InputStream f2862a;

        public C1045b(InputStream inputStream) {
            this.f2862a = inputStream;
        }

        /* renamed from: a */
        public int m3597a() throws IOException {
            return ((this.f2862a.read() << 8) & 65280) | (this.f2862a.read() & 255);
        }

        /* renamed from: b */
        public short m3600b() throws IOException {
            return (short) (this.f2862a.read() & 255);
        }

        /* renamed from: a */
        public long m3599a(long j) throws IOException {
            if (j < 0) {
                return 0;
            }
            long j2 = j;
            while (j2 > 0) {
                long j3;
                long skip = this.f2862a.skip(j2);
                if (skip > 0) {
                    j3 = j2 - skip;
                } else if (this.f2862a.read() == -1) {
                    break;
                } else {
                    j3 = j2 - 1;
                }
                j2 = j3;
            }
            return j - j2;
        }

        /* renamed from: a */
        public int m3598a(byte[] bArr) throws IOException {
            int length = bArr.length;
            while (length > 0) {
                int read = this.f2862a.read(bArr, bArr.length - length, length);
                if (read == -1) {
                    break;
                }
                length -= read;
            }
            return bArr.length - length;
        }

        /* renamed from: c */
        public int m3601c() throws IOException {
            return this.f2862a.read();
        }
    }

    /* renamed from: a */
    private static int m3602a(int i, int i2) {
        return (i + 2) + (i2 * 12);
    }

    /* renamed from: a */
    private static boolean m3604a(int i) {
        if (!((i & 65496) == 65496 || i == 19789)) {
            if (i != 18761) {
                return false;
            }
        }
        return true;
    }

    static {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
        /*
        r0 = 13;
        r0 = new int[r0];
        r0 = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8};
        f2864b = r0;
        r0 = 0;
        r0 = new byte[r0];
        r1 = "Exif\u0000\u0000";	 Catch:{ UnsupportedEncodingException -> 0x0015 }
        r2 = "UTF-8";	 Catch:{ UnsupportedEncodingException -> 0x0015 }
        r1 = r1.getBytes(r2);	 Catch:{ UnsupportedEncodingException -> 0x0015 }
        r0 = r1;
    L_0x0015:
        f2863a = r0;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.resource.bitmap.ImageHeaderParser.<clinit>():void");
    }

    public ImageHeaderParser(InputStream inputStream) {
        this.f2865c = new C1045b(inputStream);
    }

    /* renamed from: a */
    public boolean m3606a() throws IOException {
        return m3607b().hasAlpha();
    }

    /* renamed from: b */
    public ImageType m3607b() throws IOException {
        int a = this.f2865c.m3597a();
        if (a == 65496) {
            return ImageType.JPEG;
        }
        a = ((a << 16) & -65536) | (this.f2865c.m3597a() & 65535);
        if (a == -1991225785) {
            this.f2865c.m3599a(21);
            return this.f2865c.m3601c() >= 3 ? ImageType.PNG_A : ImageType.PNG;
        } else if ((a >> 8) == 4671814) {
            return ImageType.GIF;
        } else {
            return ImageType.UNKNOWN;
        }
    }

    /* renamed from: c */
    public int m3608c() throws IOException {
        if (!m3604a(this.f2865c.m3597a())) {
            return -1;
        }
        byte[] d = m3605d();
        Object obj = null;
        Object obj2 = (d == null || d.length <= f2863a.length) ? null : 1;
        if (obj2 != null) {
            for (int i = 0; i < f2863a.length; i++) {
                if (d[i] != f2863a[i]) {
                    break;
                }
            }
        }
        obj = obj2;
        if (obj != null) {
            return m3603a(new C1044a(d));
        }
        return -1;
    }

    /* renamed from: d */
    private byte[] m3605d() throws IOException {
        long a;
        long j;
        do {
            short b = this.f2865c.m3600b();
            if (b != (short) 255) {
                if (Log.isLoggable("ImageHeaderParser", 3)) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("Unknown segmentId=");
                    stringBuilder.append(b);
                    Log.d("ImageHeaderParser", stringBuilder.toString());
                }
                return null;
            }
            b = this.f2865c.m3600b();
            if (b == (short) 218) {
                return null;
            }
            if (b == (short) 217) {
                if (Log.isLoggable("ImageHeaderParser", 3)) {
                    Log.d("ImageHeaderParser", "Found MARKER_EOI in exif segment");
                }
                return null;
            }
            int a2 = this.f2865c.m3597a() - 2;
            if (b != (short) 225) {
                j = (long) a2;
                a = this.f2865c.m3599a(j);
            } else {
                byte[] bArr = new byte[a2];
                int a3 = this.f2865c.m3598a(bArr);
                if (a3 == a2) {
                    return bArr;
                }
                if (Log.isLoggable("ImageHeaderParser", 3)) {
                    StringBuilder stringBuilder2 = new StringBuilder();
                    stringBuilder2.append("Unable to read segment data, type: ");
                    stringBuilder2.append(b);
                    stringBuilder2.append(", length: ");
                    stringBuilder2.append(a2);
                    stringBuilder2.append(", actually read: ");
                    stringBuilder2.append(a3);
                    Log.d("ImageHeaderParser", stringBuilder2.toString());
                }
                return null;
            }
        } while (a == j);
        if (Log.isLoggable("ImageHeaderParser", 3)) {
            stringBuilder2 = new StringBuilder();
            stringBuilder2.append("Unable to skip enough data, type: ");
            stringBuilder2.append(b);
            stringBuilder2.append(", wanted to skip: ");
            stringBuilder2.append(a2);
            stringBuilder2.append(", but actually skipped: ");
            stringBuilder2.append(a);
            Log.d("ImageHeaderParser", stringBuilder2.toString());
        }
        return null;
    }

    /* renamed from: a */
    private static int m3603a(C1044a c1044a) {
        ByteOrder byteOrder;
        int length = "Exif\u0000\u0000".length();
        short b = c1044a.m3596b(length);
        if (b == (short) 19789) {
            byteOrder = ByteOrder.BIG_ENDIAN;
        } else if (b == (short) 18761) {
            byteOrder = ByteOrder.LITTLE_ENDIAN;
        } else {
            if (Log.isLoggable("ImageHeaderParser", 3)) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Unknown endianness = ");
                stringBuilder.append(b);
                Log.d("ImageHeaderParser", stringBuilder.toString());
            }
            byteOrder = ByteOrder.BIG_ENDIAN;
        }
        c1044a.m3595a(byteOrder);
        int a = c1044a.m3594a(length + 4) + length;
        short b2 = c1044a.m3596b(a);
        for (short s = (short) 0; s < b2; s++) {
            int a2 = m3602a(a, s);
            short b3 = c1044a.m3596b(a2);
            if (b3 == (short) 274) {
                StringBuilder stringBuilder2;
                short b4 = c1044a.m3596b(a2 + 2);
                if (b4 >= (short) 1) {
                    if (b4 <= (short) 12) {
                        int a3 = c1044a.m3594a(a2 + 4);
                        if (a3 >= 0) {
                            if (Log.isLoggable("ImageHeaderParser", 3)) {
                                StringBuilder stringBuilder3 = new StringBuilder();
                                stringBuilder3.append("Got tagIndex=");
                                stringBuilder3.append(s);
                                stringBuilder3.append(" tagType=");
                                stringBuilder3.append(b3);
                                stringBuilder3.append(" formatCode=");
                                stringBuilder3.append(b4);
                                stringBuilder3.append(" componentCount=");
                                stringBuilder3.append(a3);
                                Log.d("ImageHeaderParser", stringBuilder3.toString());
                            }
                            a3 += f2864b[b4];
                            if (a3 <= 4) {
                                a2 += 8;
                                if (a2 >= 0) {
                                    if (a2 <= c1044a.m3593a()) {
                                        if (a3 >= 0) {
                                            if (a3 + a2 <= c1044a.m3593a()) {
                                                return c1044a.m3596b(a2);
                                            }
                                        }
                                        if (Log.isLoggable("ImageHeaderParser", 3)) {
                                            StringBuilder stringBuilder4 = new StringBuilder();
                                            stringBuilder4.append("Illegal number of bytes for TI tag data tagType=");
                                            stringBuilder4.append(b3);
                                            Log.d("ImageHeaderParser", stringBuilder4.toString());
                                        }
                                    }
                                }
                                if (Log.isLoggable("ImageHeaderParser", 3)) {
                                    StringBuilder stringBuilder5 = new StringBuilder();
                                    stringBuilder5.append("Illegal tagValueOffset=");
                                    stringBuilder5.append(a2);
                                    stringBuilder5.append(" tagType=");
                                    stringBuilder5.append(b3);
                                    Log.d("ImageHeaderParser", stringBuilder5.toString());
                                }
                            } else if (Log.isLoggable("ImageHeaderParser", 3)) {
                                stringBuilder2 = new StringBuilder();
                                stringBuilder2.append("Got byte count > 4, not orientation, continuing, formatCode=");
                                stringBuilder2.append(b4);
                                Log.d("ImageHeaderParser", stringBuilder2.toString());
                            }
                        } else if (Log.isLoggable("ImageHeaderParser", 3)) {
                            Log.d("ImageHeaderParser", "Negative tiff component count");
                        }
                    }
                }
                if (Log.isLoggable("ImageHeaderParser", 3)) {
                    stringBuilder2 = new StringBuilder();
                    stringBuilder2.append("Got invalid format code=");
                    stringBuilder2.append(b4);
                    Log.d("ImageHeaderParser", stringBuilder2.toString());
                }
            }
        }
        return -1;
    }
}
