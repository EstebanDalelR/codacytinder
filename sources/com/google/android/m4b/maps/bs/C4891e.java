package com.google.android.m4b.maps.bs;

import android.support.v4.media.session.PlaybackStateCompat;
import android.support.v7.widget.ActivityChooserView.ActivityChooserViewAdapter;
import android.support.v7.widget.RecyclerView.ItemAnimator;
import android.util.Log;
import com.google.android.m4b.maps.ap.C4660g;
import com.google.android.m4b.maps.as.C4666a;
import com.google.android.m4b.maps.ay.C4712d;
import com.google.android.m4b.maps.ay.C4728u;
import com.google.android.m4b.maps.az.C4733b;
import com.google.android.m4b.maps.bg.C4783a;
import com.google.android.m4b.maps.bg.C4783a.C4782a;
import com.google.android.m4b.maps.bq.C4867g;
import com.google.android.m4b.maps.bw.C4976e;
import com.google.android.m4b.maps.ch.C5203e;
import java.io.ByteArrayOutputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.zip.CRC32;

/* renamed from: com.google.android.m4b.maps.bs.e */
public class C4891e {
    /* renamed from: a */
    private static final String f17958a = "e";
    /* renamed from: b */
    private static final byte[] f17959b = new byte[0];
    /* renamed from: c */
    private static int f17960c = 20;
    /* renamed from: d */
    private static int f17961d = 81800;
    /* renamed from: e */
    private final String f17962e;
    /* renamed from: f */
    private final C4782a f17963f;
    /* renamed from: g */
    private C4783a f17964g;
    /* renamed from: h */
    private C4883b f17965h;
    /* renamed from: i */
    private final C4890i f17966i;
    /* renamed from: j */
    private final C4882a f17967j;
    /* renamed from: k */
    private final C4783a[] f17968k;
    /* renamed from: l */
    private final C4976e<Long, C4887f> f17969l;
    /* renamed from: m */
    private final Set<C4887f> f17970m;
    /* renamed from: n */
    private final ReentrantLock f17971n = new ReentrantLock();
    /* renamed from: o */
    private final ReentrantReadWriteLock f17972o = new ReentrantReadWriteLock(true);
    /* renamed from: p */
    private boolean f17973p;
    /* renamed from: q */
    private C4894i f17974q = null;
    /* renamed from: r */
    private C4892f f17975r = null;
    /* renamed from: s */
    private Set<Integer> f17976s;
    /* renamed from: t */
    private int f17977t = 4;
    /* renamed from: u */
    private final C5203e f17978u;

    /* renamed from: com.google.android.m4b.maps.bs.e$a */
    static class C4882a {
        /* renamed from: a */
        final byte[] f17910a;
        /* renamed from: b */
        int f17911b;
        /* renamed from: c */
        private int f17912c;

        C4882a(int i, int i2) {
            this.f17910a = new byte[(i * 1024)];
            this.f17912c = i;
            this.f17911b = i2;
        }

        /* renamed from: a */
        final void m21848a(C4888g c4888g) {
            m21847a(c4888g.f17944b);
            for (int i = 0; i < c4888g.m21869b(); i++) {
                long b = c4888g.m21870b(i);
                if (b != -1) {
                    int a = c4888g.f17944b;
                    int[] a2 = C4882a.m21846a(b);
                    a *= 1024;
                    for (int i2 = 0; i2 < 3; i2++) {
                        int i3 = a2[i2] >> 3;
                        int i4 = a2[i2] & 7;
                        byte[] bArr = this.f17910a;
                        i3 += a;
                        bArr[i3] = (byte) ((1 << i4) | bArr[i3]);
                    }
                }
            }
            if (c4888g.f17944b >= this.f17911b) {
                this.f17911b = c4888g.f17944b + 1;
            }
        }

        /* renamed from: a */
        final void m21847a(int i) {
            i *= 1024;
            Arrays.fill(this.f17910a, i, i + 1020, (byte) 0);
        }

        /* renamed from: a */
        static int[] m21846a(long j) {
            r1 = new int[3];
            j = Long.rotateRight(j, 22);
            int i = 0;
            r1[0] = (int) (j % 8147);
            j = Long.rotateRight(j, 22);
            r1[1] = (int) (j % 8147);
            r1[2] = (int) (Long.rotateRight(j, 22) % 8147);
            while (i < 3) {
                if (r1[i] < null) {
                    r1[i] = r1[i] + 8147;
                }
                i++;
            }
            return r1;
        }

        /* renamed from: a */
        final boolean m21849a(int[] iArr, int i) {
            i *= 1024;
            for (int i2 = 0; i2 < iArr.length; i2++) {
                if ((this.f17910a[(iArr[i2] >> 3) + i] & (1 << (iArr[i2] & 7))) == 0) {
                    return false;
                }
            }
            return true;
        }

        /* renamed from: b */
        final void m21850b(int i) {
            i *= 1024;
            C4891e.m21903a(this.f17910a, i + 1020, C4891e.m21913c(this.f17910a, i, 1020));
        }
    }

    /* renamed from: com.google.android.m4b.maps.bs.e$b */
    static final class C4883b {
        /* renamed from: j */
        private static final int f17913j = 43;
        /* renamed from: a */
        final int f17914a;
        /* renamed from: b */
        final int f17915b;
        /* renamed from: c */
        final int f17916c;
        /* renamed from: d */
        final int f17917d;
        /* renamed from: e */
        final boolean f17918e;
        /* renamed from: f */
        final int f17919f;
        /* renamed from: g */
        final long f17920g;
        /* renamed from: h */
        final Locale f17921h;
        /* renamed from: i */
        final int f17922i;
        /* renamed from: k */
        private int f17923k;
        /* renamed from: l */
        private int f17924l;

        C4883b(int i, int i2, int i3, int i4, boolean z, int i5, long j, Locale locale) {
            this.f17914a = i;
            this.f17915b = i2;
            this.f17916c = i3;
            this.f17917d = i4;
            this.f17918e = z;
            this.f17919f = i5;
            this.f17921h = locale;
            this.f17920g = j;
            byte[] a = m21851a();
            this.f17923k = a.length;
            C4891e.m21903a(a, 4, this.f17923k);
            this.f17924l = C4891e.m21913c(a, 0, a.length - 4);
            this.f17922i = (((((this.f17916c * 1024) - 1) / 8192) + 1) * 8192) + 16384;
        }

        C4883b(byte[] bArr, int i) {
            this.f17914a = C4891e.m21886a(bArr, 0);
            if (this.f17914a == 1) {
                throw new IOException("Can't parse header for old schema");
            }
            this.f17923k = C4891e.m21886a(bArr, 4);
            if (this.f17923k >= 43) {
                if (this.f17923k + 0 <= 8192) {
                    this.f17924l = C4891e.m21886a(bArr, (this.f17923k + 0) - 4);
                    i = C4891e.m21913c(bArr, 0, this.f17923k - 4);
                    if (this.f17924l != i) {
                        int i2 = this.f17924l;
                        StringBuilder stringBuilder = new StringBuilder(44);
                        stringBuilder.append("Checksum mismatch ");
                        stringBuilder.append(i2);
                        stringBuilder.append(" vs ");
                        stringBuilder.append(i);
                        throw new IOException(stringBuilder.toString());
                    }
                    i = new C4666a(bArr);
                    i.skipBytes(8);
                    this.f17915b = i.readInt();
                    this.f17916c = i.readInt();
                    this.f17917d = i.readInt();
                    this.f17918e = i.readBoolean();
                    this.f17919f = i.readInt();
                    this.f17920g = i.readLong();
                    this.f17921h = new Locale(i.readUTF(), i.readUTF(), i.readUTF());
                    this.f17922i = (((((this.f17916c * 1024) - 1) / 8192) + 1) * 8192) + 16384;
                    return;
                }
            }
            i = this.f17923k;
            StringBuilder stringBuilder2 = new StringBuilder(30);
            stringBuilder2.append("Wrong header size: ");
            stringBuilder2.append(i);
            throw new IOException(stringBuilder2.toString());
        }

        /* renamed from: a */
        final int m21852a(byte[] bArr, int i) {
            i = m21851a();
            System.arraycopy(i, 0, bArr, 0, i.length);
            return i.length;
        }

        /* renamed from: a */
        private byte[] m21851a() {
            OutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutput dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeInt(this.f17914a);
            dataOutputStream.writeInt(this.f17923k);
            dataOutputStream.writeInt(this.f17915b);
            dataOutputStream.writeInt(this.f17916c);
            dataOutputStream.writeInt(this.f17917d);
            dataOutputStream.writeBoolean(this.f17918e);
            dataOutputStream.writeInt(this.f17919f);
            dataOutputStream.writeLong(this.f17920g);
            dataOutputStream.writeUTF(this.f17921h.getLanguage());
            dataOutputStream.writeUTF(this.f17921h.getCountry());
            dataOutputStream.writeUTF(this.f17921h.getVariant());
            dataOutputStream.writeInt(this.f17924l);
            return byteArrayOutputStream.toByteArray();
        }

        public final String toString() {
            int i = this.f17914a;
            int i2 = this.f17915b;
            int i3 = this.f17916c;
            int i4 = this.f17917d;
            boolean z = this.f17918e;
            int i5 = this.f17919f;
            long j = this.f17920g;
            int i6 = this.f17924l;
            StringBuilder stringBuilder = new StringBuilder(207);
            stringBuilder.append("CatalogVersion:");
            stringBuilder.append(i);
            stringBuilder.append(" BlockSize:");
            stringBuilder.append(i2);
            stringBuilder.append(" MaxShardCount:");
            stringBuilder.append(i3);
            stringBuilder.append(" RecordsPerBlock: ");
            stringBuilder.append(i4);
            stringBuilder.append(" AutoConfig: ");
            stringBuilder.append(z);
            stringBuilder.append(" DataVersion:");
            stringBuilder.append(i5);
            stringBuilder.append(" CacheCreationTimeMs:");
            stringBuilder.append(j);
            stringBuilder.append(" Checksum:");
            stringBuilder.append(i6);
            return stringBuilder.toString();
        }
    }

    /* renamed from: com.google.android.m4b.maps.bs.e$c */
    public static class C4884c {
        /* renamed from: a */
        public final C4885d f17925a;
        /* renamed from: b */
        public final byte[] f17926b;
        /* renamed from: c */
        public final int f17927c;
        /* renamed from: d */
        public final byte[] f17928d;

        private C4884c(C4885d c4885d, byte[] bArr) {
            this(c4885d, 0, bArr);
        }

        private C4884c(C4885d c4885d, int i, byte[] bArr) {
            if (bArr.length > 16777215) {
                throw new IllegalArgumentException("data too large");
            }
            this.f17925a = c4885d;
            this.f17926b = c4885d.m21854b();
            this.f17927c = i;
            this.f17928d = bArr;
        }
    }

    /* renamed from: com.google.android.m4b.maps.bs.e$d */
    static class C4885d {
        /* renamed from: a */
        private final long f17929a;
        /* renamed from: b */
        private final byte[] f17930b;

        C4885d(long j, byte[] bArr) {
            this.f17929a = j;
            if (bArr == null) {
                this.f17930b = C4891e.f17959b;
            } else {
                this.f17930b = bArr;
            }
        }

        /* renamed from: a */
        final long m21853a() {
            return this.f17929a;
        }

        /* renamed from: b */
        final byte[] m21854b() {
            return this.f17930b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null) {
                if (getClass() == obj.getClass()) {
                    C4885d c4885d = (C4885d) obj;
                    if (this.f17929a != c4885d.f17929a) {
                        return false;
                    }
                    return Arrays.equals(this.f17930b, c4885d.f17930b);
                }
            }
            return false;
        }

        public final int hashCode() {
            return (((int) (this.f17929a ^ (this.f17929a >>> 32))) * 31) + Arrays.hashCode(this.f17930b);
        }
    }

    /* renamed from: com.google.android.m4b.maps.bs.e$e */
    static final class C4886e {
        /* renamed from: a */
        private final byte[] f17931a;
        /* renamed from: b */
        private int f17932b = null;
        /* renamed from: c */
        private final C4783a f17933c;
        /* renamed from: d */
        private int f17934d;

        C4886e(C4783a c4783a, int i, byte[] bArr) {
            this.f17931a = bArr;
            this.f17933c = c4783a;
            this.f17934d = i;
        }

        /* renamed from: a */
        final void m21856a(byte[] bArr) {
            if (bArr.length + this.f17932b > this.f17931a.length) {
                m21855a();
            }
            if (bArr.length > this.f17931a.length) {
                synchronized (this.f17933c) {
                    this.f17933c.m21180a((long) this.f17934d);
                    this.f17933c.m21181a(bArr);
                    this.f17933c.m21183b();
                }
                this.f17934d += bArr.length;
                return;
            }
            System.arraycopy(bArr, 0, this.f17931a, this.f17932b, bArr.length);
            this.f17932b += bArr.length;
        }

        /* renamed from: a */
        final void m21855a() {
            if (this.f17932b != 0) {
                synchronized (this.f17933c) {
                    this.f17933c.m21180a((long) this.f17934d);
                    this.f17933c.m21185b(this.f17931a, 0, this.f17932b);
                    this.f17933c.m21183b();
                }
                this.f17934d += this.f17932b;
                this.f17932b = 0;
            }
        }
    }

    /* renamed from: com.google.android.m4b.maps.bs.e$f */
    static class C4887f {
        /* renamed from: a */
        final long f17935a;
        /* renamed from: b */
        final int f17936b;
        /* renamed from: c */
        final int f17937c;
        /* renamed from: d */
        final int f17938d;
        /* renamed from: e */
        final int f17939e;
        /* renamed from: f */
        final int f17940f;
        /* renamed from: g */
        final int f17941g;
        /* renamed from: h */
        final int f17942h;

        C4887f(long j, int i, int i2, int i3, int i4, int i5, int i6, int i7) {
            this.f17935a = j;
            this.f17936b = i;
            this.f17937c = i4;
            this.f17938d = i2;
            this.f17939e = i3;
            this.f17940f = i5;
            this.f17941g = i6;
            this.f17942h = i7;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null) {
                if (getClass() == obj.getClass()) {
                    C4887f c4887f = (C4887f) obj;
                    return this.f17941g == c4887f.f17941g && this.f17942h == c4887f.f17942h;
                }
            }
            return false;
        }

        public final int hashCode() {
            return (this.f17941g << 16) + this.f17942h;
        }

        /* renamed from: a */
        final void m21861a(byte[] bArr, int i) {
            C4891e.m21904a(bArr, i, this.f17935a);
            i += 8;
            int i2 = (this.f17936b << 5) | this.f17937c;
            StringBuilder stringBuilder;
            if ((i2 >>> 5) != this.f17936b) {
                i = this.f17936b;
                stringBuilder = new StringBuilder(41);
                stringBuilder.append("Could not pack data offset of ");
                stringBuilder.append(i);
                throw new IllegalArgumentException(stringBuilder.toString());
            } else if ((i2 & 31) != this.f17937c) {
                i = this.f17937c;
                stringBuilder = new StringBuilder(38);
                stringBuilder.append("Could not pack refCount of ");
                stringBuilder.append(i);
                throw new IllegalArgumentException(stringBuilder.toString());
            } else {
                C4891e.m21903a(bArr, i, i2);
                i += 4;
                C4891e.m21903a(bArr, i, (this.f17938d << 24) | this.f17939e);
                C4891e.m21903a(bArr, i + 4, this.f17940f);
            }
        }

        /* renamed from: a */
        static C4887f m21857a(byte[] bArr, int i, int i2, int i3) {
            long c = C4891e.m21914c(bArr, i);
            i += 8;
            int a = C4891e.m21886a(bArr, i);
            i += 4;
            int a2 = C4891e.m21886a(bArr, i);
            int i4 = a2 >>> 24;
            int i5 = a2 & 16777215;
            return new C4887f(c, a >>> 5, i4, i5, a & 31, C4891e.m21886a(bArr, i + 4), i2, i3);
        }

        /* renamed from: b */
        static int m21858b(byte[] bArr, int i) {
            return C4891e.m21886a(bArr, (i + 8) + 4) >>> 24;
        }

        /* renamed from: c */
        static int m21859c(byte[] bArr, int i) {
            return C4891e.m21886a(bArr, (i + 8) + 4) & 16777215;
        }

        /* renamed from: d */
        static int m21860d(byte[] bArr, int i) {
            return C4891e.m21886a(bArr, i + 8) & 31;
        }

        public final String toString() {
            long j = this.f17935a;
            int i = this.f17936b;
            int i2 = this.f17938d;
            int i3 = this.f17939e;
            int i4 = this.f17940f;
            int i5 = this.f17941g;
            int i6 = this.f17942h;
            StringBuilder stringBuilder = new StringBuilder(140);
            stringBuilder.append("ID:");
            stringBuilder.append(j);
            stringBuilder.append(" Off:");
            stringBuilder.append(i);
            stringBuilder.append(" KeyLen:");
            stringBuilder.append(i2);
            stringBuilder.append(" DataLen:");
            stringBuilder.append(i3);
            stringBuilder.append(" Checksum:");
            stringBuilder.append(i4);
            stringBuilder.append(" Shard:");
            stringBuilder.append(i5);
            stringBuilder.append(" ShardIndex:");
            stringBuilder.append(i6);
            return stringBuilder.toString();
        }
    }

    /* renamed from: com.google.android.m4b.maps.bs.e$g */
    static class C4888g {
        /* renamed from: a */
        private final byte[] f17943a;
        /* renamed from: b */
        private final int f17944b;
        /* renamed from: c */
        private int f17945c;
        /* renamed from: d */
        private int f17946d;
        /* renamed from: e */
        private int f17947e;

        C4888g(int i) {
            this(i, new byte[8192]);
        }

        private C4888g(int i, byte[] bArr) {
            this.f17946d = -1;
            this.f17947e = -1;
            this.f17943a = bArr;
            this.f17944b = i;
            this.f17945c = 0;
        }

        C4888g(byte[] bArr) {
            this.f17946d = -1;
            this.f17947e = -1;
            this.f17943a = bArr;
            this.f17944b = C4891e.m21886a(this.f17943a, 0);
            this.f17945c = C4891e.m21886a(this.f17943a, 4);
        }

        /* renamed from: a */
        final void m21866a(C4783a c4783a) {
            C4891e.m21903a(this.f17943a, 0, this.f17944b);
            C4891e.m21903a(this.f17943a, 4, this.f17945c);
            C4891e.m21903a(this.f17943a, 8188, C4891e.m21913c(this.f17943a, 0, 8188));
            c4783a.m21181a(this.f17943a);
        }

        /* renamed from: a */
        final int m21864a() {
            return this.f17944b;
        }

        /* renamed from: b */
        final int m21869b() {
            return this.f17945c;
        }

        /* renamed from: a */
        final void m21865a(int i) {
            C4891e.m21904a(this.f17943a, (i * 20) + 8, -1);
        }

        /* renamed from: b */
        final long m21870b(int i) {
            return C4891e.m21914c(this.f17943a, (i * 20) + 8);
        }

        /* renamed from: c */
        final int m21872c(int i) {
            return C4887f.m21858b(this.f17943a, (i * 20) + 8);
        }

        /* renamed from: d */
        final int m21874d(int i) {
            return C4887f.m21860d(this.f17943a, (i * 20) + 8);
        }

        /* renamed from: e */
        final C4887f m21875e(int i) {
            return C4887f.m21857a(this.f17943a, (i * 20) + 8, this.f17944b, i);
        }

        /* renamed from: a */
        final void m21867a(C4887f c4887f) {
            m21868a(c4887f, this.f17945c);
            this.f17945c++;
            this.f17946d = (c4887f.f17936b + c4887f.f17938d) + c4887f.f17939e;
            this.f17947e = -1;
        }

        /* renamed from: a */
        final void m21868a(C4887f c4887f, int i) {
            c4887f.m21861a(this.f17943a, (i * 20) + 8);
        }

        /* renamed from: c */
        final int m21871c() {
            if (this.f17945c == 0) {
                return 0;
            }
            if (this.f17946d < 0) {
                C4887f e = m21875e(this.f17945c - 1);
                this.f17946d = (e.f17936b + e.f17938d) + e.f17939e;
            }
            return this.f17946d;
        }

        /* renamed from: d */
        final int m21873d() {
            if (this.f17947e == -1) {
                int i = 0;
                this.f17947e = 0;
                while (i < this.f17945c) {
                    if (m21874d(i) > 0) {
                        this.f17947e += m21872c(i) + C4887f.m21859c(this.f17943a, (i * 20) + 8);
                    }
                    i++;
                }
            }
            return this.f17947e;
        }

        public final String toString() {
            int i = this.f17944b;
            int i2 = this.f17945c;
            StringBuilder stringBuilder = new StringBuilder(31);
            stringBuilder.append("ID:");
            stringBuilder.append(i);
            stringBuilder.append(" Size:");
            stringBuilder.append(i2);
            return stringBuilder.toString();
        }
    }

    /* renamed from: com.google.android.m4b.maps.bs.e$h */
    static class C4889h {
        /* renamed from: a */
        final C4888g f17948a;
        /* renamed from: b */
        final C4887f f17949b;
        /* renamed from: c */
        final int f17950c;

        C4889h(C4888g c4888g, C4887f c4887f, int i) {
            this.f17948a = c4888g;
            this.f17949b = c4887f;
            this.f17950c = i;
        }
    }

    /* renamed from: com.google.android.m4b.maps.bs.e$i */
    static class C4890i {
        /* renamed from: a */
        final int[] f17951a;
        /* renamed from: b */
        final int[] f17952b;
        /* renamed from: c */
        final int[] f17953c;
        /* renamed from: d */
        final int[] f17954d;
        /* renamed from: e */
        final int[] f17955e;
        /* renamed from: f */
        int f17956f = 0;
        /* renamed from: g */
        int f17957g = 0;

        C4890i(int i) {
            this.f17951a = new int[i];
            this.f17952b = new int[i];
            this.f17953c = new int[i];
            this.f17954d = new int[i];
            this.f17955e = new int[i];
        }

        /* renamed from: a */
        final void m21879a(C4783a c4783a) {
            byte[] bArr = new byte[8192];
            int i = 0;
            for (int i2 = 0; i2 < this.f17951a.length; i2++) {
                C4891e.m21903a(bArr, i, this.f17951a[i2]);
                int i3 = i + 4;
                C4891e.m21903a(bArr, i3, this.f17952b[i2]);
                i3 += 4;
                C4891e.m21912b(bArr, i3, this.f17953c[i2]);
                i3 += 2;
                C4891e.m21912b(bArr, i3, this.f17954d[i2]);
                i3 += 2;
                C4891e.m21903a(bArr, i3, this.f17955e[i2]);
                i3 += 4;
                C4891e.m21903a(bArr, i3, C4891e.m21913c(bArr, i3 - 16, 16));
                i += 20;
            }
            c4783a.m21181a(bArr);
        }

        /* renamed from: b */
        final void m21882b(C4783a c4783a) {
            byte[] bArr = new byte[8192];
            c4783a.m21184b(bArr);
            int i = null;
            this.f17956f = 0;
            this.f17957g = 0;
            int i2 = 0;
            while (i < this.f17951a.length) {
                this.f17951a[i] = C4891e.m21886a(bArr, i2);
                i2 += 4;
                this.f17952b[i] = C4891e.m21886a(bArr, i2);
                i2 += 4;
                this.f17953c[i] = C4891e.m21907b(bArr, i2);
                i2 += 2;
                this.f17954d[i] = C4891e.m21907b(bArr, i2);
                i2 += 2;
                this.f17955e[i] = C4891e.m21886a(bArr, i2);
                i2 += 4;
                if (C4891e.m21886a(bArr, i2) != C4891e.m21913c(bArr, i2 - 16, 16)) {
                    m21878a(i);
                } else {
                    if (this.f17954d[i] > 0) {
                        this.f17956f = i + 1;
                    }
                    if (this.f17955e[i] > 0) {
                        this.f17957g++;
                    }
                }
                i2 += 4;
                i++;
            }
        }

        /* renamed from: a */
        final void m21880a(C4888g c4888g) {
            int a = c4888g.f17944b;
            if (this.f17955e[a] > 0) {
                this.f17957g--;
            }
            int i = 0;
            this.f17951a[a] = 0;
            this.f17952b[a] = c4888g.m21871c();
            this.f17953c[a] = c4888g.f17945c;
            this.f17954d[a] = 0;
            this.f17955e[a] = 0;
            while (i < c4888g.f17945c) {
                if (c4888g.m21870b(i) != -1) {
                    int[] iArr = this.f17954d;
                    iArr[a] = iArr[a] + 1;
                    if (c4888g.m21874d(i) > 0) {
                        iArr = this.f17955e;
                        iArr[a] = iArr[a] + 1;
                    }
                }
                i++;
            }
            if (this.f17954d[a] > null && a >= this.f17956f) {
                this.f17956f = a + 1;
            }
            if (this.f17955e[a] > null) {
                this.f17957g++;
            }
        }

        /* renamed from: a */
        final void m21878a(int i) {
            this.f17951a[i] = 0;
            this.f17953c[i] = 0;
            this.f17954d[i] = 0;
            if (this.f17955e[i] > 0) {
                this.f17957g--;
            }
            this.f17955e[i] = 0;
            this.f17952b[i] = -1;
        }

        /* renamed from: b */
        final boolean m21883b(int i) {
            return this.f17954d[i] != 0;
        }

        /* renamed from: a */
        final int m21876a(Set<Integer> set) {
            int i = ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
            int i2 = -1;
            int i3 = 0;
            while (i3 < this.f17956f) {
                if (m21883b(i3) && this.f17955e[i3] == 0 && this.f17951a[i3] < r0 && (set == null || !set.contains(Integer.valueOf(i3)))) {
                    i = this.f17951a[i3];
                    i2 = i3;
                }
                i3++;
            }
            return i2;
        }

        /* renamed from: a */
        final long m21877a() {
            int i = 0;
            long j = 0;
            while (i < this.f17956f) {
                long j2 = this.f17952b[i] > 0 ? (long) this.f17952b[i] : 0;
                i++;
                j += j2;
            }
            return j;
        }

        /* renamed from: b */
        final int m21881b() {
            int i = 0;
            for (int i2 = 0; i2 < this.f17956f; i2++) {
                i += m21883b(i2);
            }
            return i;
        }
    }

    private C4891e(String str, C4883b c4883b, C4890i c4890i, C4882a c4882a, C4783a c4783a, C4782a c4782a, C4892f c4892f, C5203e c5203e) {
        this.f17962e = str;
        this.f17965h = c4883b;
        this.f17966i = c4890i;
        this.f17967j = c4882a;
        this.f17964g = c4783a;
        this.f17963f = c4782a;
        this.f17968k = new C4783a[c4883b.f17916c];
        this.f17969l = new C4976e(Math.min(ItemAnimator.FLAG_MOVED, m21922g()));
        this.f17970m = Collections.synchronizedSet(new HashSet());
        this.f17975r = c4892f;
        this.f17978u = c5203e;
        this.f17971n.lock();
        c4890i = null;
        for (int i = null; i < this.f17965h.f17916c; i++) {
            try {
                if ((this.f17966i.f17952b[i] == -1 ? true : null) == null) {
                    if (this.f17966i.m21883b(i) != null) {
                        c4882a = this.f17967j;
                        c4783a = i * 1024;
                        if ((C4891e.m21913c(c4882a.f17910a, c4783a, 1020) == C4891e.m21886a(c4882a.f17910a, c4783a + 1020) ? true : null) != null) {
                            continue;
                        }
                    } else {
                        continue;
                    }
                }
                c4890i = new StringBuilder(42);
                c4890i.append("Rebuilding inconsistent shard: ");
                c4890i.append(i);
                c4890i = c4890i.toString();
                c4882a = String.valueOf("Cache:");
                c4783a = String.valueOf(this.f17962e);
                if (C4728u.m21050a(c4783a.length() != null ? c4882a.concat(c4783a) : new String(c4882a), 3) != null) {
                    c4882a = String.valueOf("Cache:");
                    c4783a = String.valueOf(this.f17962e);
                    Log.d(c4783a.length() != null ? c4882a.concat(c4783a) : new String(c4882a), c4890i);
                }
                C4888g b = m21908b(i);
                this.f17966i.m21880a(b);
                this.f17967j.m21848a(b);
                m21916c(i);
            } catch (C4890i c4890i2) {
                if (C4728u.m21050a(f17958a, 6) != null) {
                    c4882a = f17958a;
                    c4783a = new StringBuilder(29);
                    c4783a.append("Rebuilding shard: ");
                    c4783a.append(i);
                    Log.e(c4882a, c4783a.toString(), c4890i2);
                }
                m21918d(i);
            } catch (Throwable th) {
                this.f17971n.unlock();
            }
            c4890i2 = true;
        }
        if (c4890i2 != null) {
            m21925j();
        }
        this.f17971n.unlock();
    }

    /* renamed from: a */
    public static C4891e m21893a(String str, int i, int i2, Locale locale, C4782a c4782a, C4892f c4892f, C5203e c5203e) {
        boolean z;
        C4782a c4782a2 = c4782a;
        int i3 = i;
        if (i3 == -1) {
            i3 = 81800;
            z = true;
        } else {
            z = false;
        }
        if (i3 < 4) {
            i3 = 4;
        }
        if (z || i3 <= 81800) {
            i3--;
            int max = Math.max(4, (i3 / 409) + 1);
            int i4 = (i3 / max) + 1;
            String valueOf = String.valueOf(str);
            String valueOf2 = String.valueOf(".m");
            c4782a2.m21178a(valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf));
            valueOf = String.valueOf(str);
            valueOf2 = String.valueOf(".m");
            C4783a a = c4782a2.m21177a(valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf), true);
            int a2 = (C4891e.m21884a(c5203e) << 16) + 20;
            C4712d.m20955a();
            C4883b c4883b = new C4883b(a2, 8192, max, i4, z, i2, C4712d.m20956b(), locale);
            C4890i c4890i = new C4890i(max);
            C4882a c4882a = new C4882a(max, 0);
            C4891e.m21898a(c4883b, c4890i, c4882a, a);
            a.m21183b();
            return new C4891e(str, c4883b, c4890i, c4882a, a, c4782a2, c4892f, c5203e);
        }
        String valueOf3 = String.valueOf("Number of records must be between 4 and ");
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf3).length() + 11);
        stringBuilder.append(valueOf3);
        stringBuilder.append(81800);
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    /* renamed from: a */
    public static C4891e m21894a(String str, C4782a c4782a, C4892f c4892f, C5203e c5203e) {
        C4783a a;
        IOException e;
        IOException iOException;
        try {
            String valueOf = String.valueOf(str);
            String valueOf2 = String.valueOf(".m");
            C4782a c4782a2 = c4782a;
            a = c4782a2.m21177a(valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf), true);
            try {
                byte[] bArr = new byte[8192];
                a.m21184b(bArr);
                C4883b c4883b = new C4883b(bArr, 0);
                int a2 = C4891e.m21884a(c5203e);
                int i = (a2 << 16) + 20;
                int i2 = (c4883b.f17914a >> 16) & 65535;
                int i3 = c4883b.f17914a & 65535;
                if (i2 == 0 && i3 != 20) {
                    String valueOf3 = String.valueOf(c4883b);
                    StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf3).length() + 161);
                    stringBuilder.append("Invalid Cache Header(1): ");
                    stringBuilder.append(valueOf3);
                    stringBuilder.append("; cached sever schema is zero but client schema part doesn't match: cachedClientSchema = ");
                    stringBuilder.append(i3);
                    stringBuilder.append(", expectedClientSchema = ");
                    stringBuilder.append(20);
                    throw new IOException(stringBuilder.toString());
                } else if ((i2 == 0 || c4883b.f17914a == i) && c4883b.f17915b == 8192) {
                    C4890i c4890i = new C4890i(c4883b.f17916c);
                    c4890i.m21882b(a);
                    C4882a c4882a = new C4882a(c4883b.f17916c, c4890i.f17956f);
                    a.m21182a(c4882a.f17910a, 0, c4882a.f17910a.length);
                    C4891e c4891e = new C4891e(str, c4883b, c4890i, c4882a, a, c4782a2, c4892f, c5203e);
                    if (i2 == 0 && a2 != 0) {
                        c4891e.m21895a(c4891e.f17965h.f17919f, i);
                    }
                    return c4891e;
                } else {
                    valueOf2 = String.valueOf(c4883b);
                    StringBuilder stringBuilder2 = new StringBuilder(String.valueOf(valueOf2).length() + 84);
                    stringBuilder2.append("Invalid Cache Header(2): ");
                    stringBuilder2.append(valueOf2);
                    stringBuilder2.append(", expect expectedSchema=");
                    stringBuilder2.append(i);
                    stringBuilder2.append(", mBlockSize=8192");
                    throw new IOException(stringBuilder2.toString());
                }
            } catch (IOException e2) {
                e = e2;
                iOException = e;
                if (a != null) {
                    a.m21179a();
                }
                throw iOException;
            }
        } catch (IOException e3) {
            e = e3;
            a = null;
            iOException = e;
            if (a != null) {
                a.m21179a();
            }
            throw iOException;
        }
    }

    /* renamed from: a */
    private static int m21884a(C5203e c5203e) {
        c5203e = c5203e.m23227c();
        if (c5203e != null) {
            return c5203e.m23231b() & 65535;
        }
        throw new IllegalStateException("VectorMapsParameters is null");
    }

    /* renamed from: a */
    private static void m21898a(C4883b c4883b, C4890i c4890i, C4882a c4882a, C4783a c4783a) {
        byte[] bArr = new byte[8192];
        int i = 0;
        c4883b.m21852a(bArr, 0);
        c4783a.m21181a(bArr);
        c4890i.m21879a(c4783a);
        while (i < c4882a.f17911b) {
            c4882a.m21850b(i);
            i++;
        }
        c4783a.m21181a(c4882a.f17910a);
    }

    /* renamed from: a */
    public final int m21928a() {
        return this.f17965h.f17919f;
    }

    /* renamed from: b */
    public final long m21934b() {
        return this.f17965h.f17920g;
    }

    /* renamed from: c */
    public final Locale m21936c() {
        return this.f17965h.f17921h;
    }

    /* renamed from: d */
    public final int m21937d() {
        this.f17972o.readLock().lock();
        try {
            C4890i c4890i = this.f17966i;
            int i = 0;
            for (int i2 = 0; i2 < c4890i.f17956f; i2++) {
                i += c4890i.f17954d[i2];
            }
            return i;
        } finally {
            this.f17972o.readLock().unlock();
        }
    }

    /* renamed from: g */
    private int m21922g() {
        return this.f17965h.f17916c * this.f17965h.f17917d;
    }

    /* renamed from: e */
    public final void m21938e() {
        this.f17971n.lock();
        try {
            if (this.f17973p) {
                this.f17971n.unlock();
                return;
            }
            IOException iOException;
            this.f17973p = true;
            this.f17972o.writeLock().lock();
            try {
                m21925j();
                iOException = null;
            } catch (IOException e) {
                iOException = e;
            }
            try {
                this.f17964g.m21179a();
            } catch (IOException e2) {
                iOException = e2;
            }
            for (int i = 0; i < this.f17968k.length; i++) {
                if (this.f17968k[i] != null) {
                    try {
                        this.f17968k[i].m21179a();
                    } catch (IOException e3) {
                        iOException = e3;
                    }
                    this.f17968k[i] = null;
                }
            }
            if (iOException != null) {
                throw iOException;
            }
            this.f17972o.writeLock().unlock();
            this.f17971n.unlock();
        } catch (Throwable th) {
            this.f17971n.unlock();
        }
    }

    /* renamed from: a */
    public final void m21932a(int i, Locale locale) {
        this.f17971n.lock();
        try {
            this.f17973p = true;
            this.f17972o.writeLock().lock();
            try {
                if (this.f17975r != null) {
                    this.f17975r.mo5159a();
                }
                synchronized (this.f17969l) {
                    this.f17969l.m22247a();
                }
                this.f17970m.clear();
                for (int i2 = 0; i2 < this.f17968k.length; i2++) {
                    if (this.f17968k[i2] != null) {
                        this.f17968k[i2].m21179a();
                        this.f17968k[i2] = null;
                    }
                    this.f17963f.m21178a(m21920f(i2));
                }
                this.f17964g.m21179a();
                C4782a c4782a = this.f17963f;
                String valueOf = String.valueOf(this.f17962e);
                String valueOf2 = String.valueOf(".m");
                c4782a.m21178a(valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf));
                c4782a = this.f17963f;
                valueOf = String.valueOf(this.f17962e);
                valueOf2 = String.valueOf(".m");
                this.f17964g = c4782a.m21177a(valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf), true);
                int a = (C4891e.m21884a(this.f17978u) << 16) + 20;
                int i3 = this.f17965h.f17915b;
                int i4 = this.f17965h.f17916c;
                int i5 = this.f17965h.f17917d;
                boolean z = this.f17965h.f17918e;
                C4712d.m20955a();
                this.f17965h = new C4883b(a, i3, i4, i5, z, i, C4712d.m20956b(), locale);
                i = this.f17966i;
                Arrays.fill(i.f17951a, 0);
                Arrays.fill(i.f17952b, 0);
                Arrays.fill(i.f17953c, 0);
                Arrays.fill(i.f17954d, 0);
                Arrays.fill(i.f17955e, 0);
                i.f17956f = 0;
                i.f17957g = 0;
                Arrays.fill(this.f17967j.f17910a, (byte) 0);
                C4891e.m21898a(this.f17965h, this.f17966i, this.f17967j, this.f17964g);
                this.f17964g.m21183b();
                this.f17973p = false;
                this.f17972o.writeLock().unlock();
                this.f17971n.unlock();
            } catch (int i6) {
                m21938e();
                throw i6;
            }
        } catch (Throwable th) {
            this.f17971n.unlock();
        }
    }

    /* renamed from: a */
    private void m21895a(int i, int i2) {
        this.f17971n.lock();
        try {
            if (!(i == this.f17965h.f17919f && i2 == this.f17965h.f17914a)) {
                C4883b c4883b = new C4883b(i2, this.f17965h.f17915b, this.f17965h.f17916c, this.f17965h.f17917d, this.f17965h.f17918e, i, this.f17965h.f17920g, this.f17965h.f17921h);
                byte[] bArr = new byte[8192];
                c4883b.m21852a(bArr, 0);
                synchronized (this.f17964g) {
                    this.f17964g.m21180a(0);
                    this.f17964g.m21181a(bArr);
                    this.f17964g.m21183b();
                }
                this.f17965h = c4883b;
            }
            this.f17971n.unlock();
        } catch (int i3) {
            try {
                m21938e();
                throw i3;
            } catch (Throwable th) {
                this.f17971n.unlock();
            }
        }
    }

    /* renamed from: a */
    public final void m21931a(int i) {
        m21895a(i, this.f17965h.f17914a);
    }

    /* renamed from: b */
    private C4888g m21908b(int i) {
        synchronized (this.f17964g) {
            this.f17964g.m21180a((long) ((i * 8192) + this.f17965h.f17922i));
            byte[] bArr = new byte[8192];
            this.f17964g.m21184b(bArr);
            i = C4891e.m21913c(bArr, 0, 8188);
            int a = C4891e.m21886a(bArr, 8188);
            if (i != a) {
                StringBuilder stringBuilder = new StringBuilder(55);
                stringBuilder.append("Unexpected checksum: ");
                stringBuilder.append(i);
                stringBuilder.append(", expected: ");
                stringBuilder.append(a);
                throw new IOException(stringBuilder.toString());
            }
            i = new C4888g(bArr);
        }
        return i;
    }

    /* renamed from: a */
    private void m21902a(C4888g c4888g, boolean z) {
        int i = this.f17966i.f17951a[c4888g.f17944b];
        this.f17972o.writeLock().lock();
        try {
            this.f17966i.m21878a(c4888g.f17944b);
            m21925j();
            synchronized (this.f17964g) {
                this.f17964g.m21180a((long) ((c4888g.f17944b * 8192) + this.f17965h.f17922i));
                c4888g.m21866a(this.f17964g);
                this.f17964g.m21183b();
            }
            this.f17967j.m21848a(c4888g);
            this.f17966i.m21880a(c4888g);
            if (z) {
                z = this.f17966i;
                z.f17951a[c4888g.f17944b] = C4891e.m21927l();
            } else {
                z = this.f17966i;
                z.f17951a[c4888g.f17944b] = i;
            }
            this.f17972o.writeLock().unlock();
            m21916c(c4888g.f17944b);
            m21925j();
        } catch (Throwable th) {
            this.f17972o.writeLock().unlock();
        }
    }

    /* renamed from: a */
    private void m21900a(C4887f c4887f, IOException iOException) {
        String valueOf = String.valueOf("Cache:");
        String valueOf2 = String.valueOf(this.f17962e);
        if (C4728u.m21050a(valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf), 6)) {
            valueOf = String.valueOf("Cache:");
            valueOf2 = String.valueOf(this.f17962e);
            Log.e(valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf), "Error reading in the cache", iOException);
        }
        this.f17970m.add(c4887f);
    }

    /* renamed from: a */
    private byte[] m21906a(C4887f c4887f) {
        if (c4887f.f17938d == 0) {
            return f17959b;
        }
        try {
            byte[] bArr = new byte[c4887f.f17938d];
            C4891e.m21897a(m21919e(c4887f.f17941g), c4887f.f17936b, bArr);
            return bArr;
        } catch (IOException e) {
            m21900a(c4887f, e);
            throw e;
        }
    }

    /* renamed from: h */
    private void m21923h() {
        if (this.f17970m.size() != 0) {
            ArrayList arrayList;
            synchronized (this.f17970m) {
                arrayList = new ArrayList(this.f17970m);
                this.f17970m.clear();
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                C4887f c4887f = (C4887f) it.next();
                try {
                    C4888g b = m21908b(c4887f.f17941g);
                    if (b.m21869b() > c4887f.f17942h) {
                        if (b.m21875e(c4887f.f17942h).f17935a == c4887f.f17935a) {
                            b.m21865a(c4887f.f17942h);
                            synchronized (this.f17969l) {
                                this.f17969l.m22254c(Long.valueOf(c4887f.f17935a));
                            }
                            m21902a(b, false);
                            if (this.f17975r != null) {
                                this.f17975r.mo5161a(c4887f.f17935a);
                            }
                        }
                    }
                } catch (Throwable e) {
                    String valueOf = String.valueOf("Cache:");
                    String valueOf2 = String.valueOf(this.f17962e);
                    if (C4728u.m21050a(valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf), 6)) {
                        valueOf = String.valueOf("Cache:");
                        valueOf2 = String.valueOf(this.f17962e);
                        Log.e(valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf), "Error reading in the cache", e);
                    }
                }
            }
        }
    }

    /* renamed from: i */
    private void m21924i() {
        if (this.f17970m.size() != 0 && this.f17971n.tryLock()) {
            try {
                m21923h();
            } finally {
                this.f17971n.unlock();
            }
        }
    }

    /* renamed from: a */
    private boolean m21905a(com.google.android.m4b.maps.bs.C4891e.C4887f r4, com.google.android.m4b.maps.bs.C4891e.C4885d r5) {
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
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
        /*
        r3 = this;
        r5 = r5.m21854b();
        r0 = r5.length;
        r1 = r4.f17938d;
        r2 = 0;
        if (r0 == r1) goto L_0x000b;
    L_0x000a:
        return r2;
    L_0x000b:
        r0 = r5.length;
        if (r0 != 0) goto L_0x0010;
    L_0x000e:
        r4 = 1;
        return r4;
    L_0x0010:
        r4 = r3.m21906a(r4);	 Catch:{ IOException -> 0x0019 }
        r4 = java.util.Arrays.equals(r5, r4);	 Catch:{ IOException -> 0x0019 }
        return r4;
    L_0x0019:
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.m4b.maps.bs.e.a(com.google.android.m4b.maps.bs.e$f, com.google.android.m4b.maps.bs.e$d):boolean");
    }

    /* renamed from: a */
    private C4889h m21892a(C4885d c4885d, int i) {
        long a = c4885d.m21853a();
        C4889h c4889h = null;
        try {
            C4888g b = m21908b(i);
            i = b.m21869b();
            List<C4887f> arrayList = new ArrayList(i);
            for (int i2 = 0; i2 < i; i2++) {
                C4887f e = b.m21875e(i2);
                if (e.f17935a != -1) {
                    arrayList.add(e);
                    if (e.f17935a == c4885d.m21853a() && m21905a(e, c4885d)) {
                        c4889h = new C4889h(b, e, i2);
                    }
                }
            }
            if (c4889h != null) {
                for (C4887f c4887f : arrayList) {
                    synchronized (this.f17969l) {
                        this.f17969l.m22255c(Long.valueOf(c4887f.f17935a), c4887f);
                    }
                }
                synchronized (this.f17969l) {
                    this.f17969l.m22255c(Long.valueOf(c4889h.f17949b.f17935a), c4889h.f17949b);
                }
            }
            return c4889h;
        } catch (C4885d c4885d2) {
            if (C4728u.m21050a(f17958a, 6)) {
                String str = f17958a;
                StringBuilder stringBuilder = new StringBuilder(67);
                stringBuilder.append("lookupShardRecordIndexFromShard: ");
                stringBuilder.append(a);
                stringBuilder.append(" : ");
                stringBuilder.append(i);
                Log.e(str, stringBuilder.toString(), c4885d2);
            }
            this.f17972o.readLock().unlock();
            if (this.f17971n.tryLock() != null) {
                m21918d(i);
                this.f17971n.unlock();
            }
            this.f17972o.readLock().lock();
            return null;
        } catch (Throwable th) {
            this.f17971n.unlock();
        }
    }

    /* renamed from: a */
    private C4887f m21890a(C4885d c4885d) {
        long a = c4885d.m21853a();
        synchronized (this.f17969l) {
            C4887f c4887f = (C4887f) this.f17969l.m22251b(Long.valueOf(a));
        }
        C4887f c4887f2 = null;
        if (!(c4887f == null || m21905a(c4887f, c4885d))) {
            c4887f = null;
        }
        if (c4887f == null || this.f17966i.m21883b(c4887f.f17941g)) {
            c4887f2 = c4887f;
        } else {
            synchronized (this.f17969l) {
                this.f17969l.m22254c(Long.valueOf(a));
            }
        }
        if (c4887f2 != null) {
            return c4887f2;
        }
        c4885d = m21909b(c4885d);
        if (c4885d != null) {
            return c4885d.f17949b;
        }
        return c4887f2;
    }

    /* renamed from: b */
    private C4889h m21909b(C4885d c4885d) {
        int[] a = C4882a.m21846a(c4885d.m21853a());
        int i = this.f17966i.f17956f;
        int i2 = 0;
        while (i2 < i) {
            if (this.f17966i.m21883b(i2) && this.f17967j.m21849a(a, i2)) {
                C4889h a2 = m21892a(c4885d, i2);
                if (a2 != null) {
                    return a2;
                }
            }
            i2++;
        }
        return null;
    }

    /* renamed from: c */
    private static C4885d m21915c(long j, String str) {
        byte[] bArr = f17959b;
        if (str != null) {
            bArr = C4660g.m20788a(str);
        }
        return new C4885d(j, bArr);
    }

    /* renamed from: a */
    public final byte[] m21933a(long j, String str) {
        this.f17972o.readLock().lock();
        try {
            if (this.f17973p) {
                return 0;
            }
            j = m21917c(C4891e.m21915c(j, str));
            this.f17972o.readLock().unlock();
            m21924i();
            return j;
        } finally {
            this.f17972o.readLock().unlock();
            m21924i();
        }
    }

    /* renamed from: c */
    private byte[] m21917c(C4885d c4885d) {
        C4887f a = m21890a(c4885d);
        if (a != null) {
            try {
                byte[] bArr = new byte[a.f17939e];
                C4891e.m21897a(m21919e(a.f17941g), a.f17936b + a.f17938d, bArr);
                int c = C4891e.m21913c(bArr, 0, bArr.length);
                if (c != a.f17940f) {
                    String valueOf = String.valueOf(a);
                    StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 40);
                    stringBuilder.append("Checksum mismatch: ");
                    stringBuilder.append(c);
                    stringBuilder.append(" record [");
                    stringBuilder.append(valueOf);
                    stringBuilder.append("]");
                    throw new IOException(stringBuilder.toString());
                }
                C4890i c4890i = this.f17966i;
                c4890i.f17951a[a.f17941g] = C4891e.m21927l();
                return bArr;
            } catch (IOException e) {
                m21900a(a, e);
            }
        }
        return null;
    }

    /* renamed from: b */
    public final boolean m21935b(long j, String str) {
        this.f17972o.readLock().lock();
        try {
            j = m21890a(C4891e.m21915c(j, str)) != null ? 1 : null;
            this.f17972o.readLock().unlock();
            m21924i();
            return j;
        } catch (Throwable th) {
            this.f17972o.readLock().unlock();
            m21924i();
        }
    }

    /* renamed from: a */
    public static C4884c m21888a(long j, String str, byte[] bArr) {
        return new C4884c(C4891e.m21915c(j, str), bArr);
    }

    /* renamed from: a */
    public static C4884c m21889a(long j, byte[] bArr) {
        return C4891e.m21888a(j, null, bArr);
    }

    /* renamed from: a */
    public static C4884c m21887a(long j, String str, int i, byte[] bArr) {
        return new C4884c(C4891e.m21915c(j, str), i, bArr);
    }

    /* renamed from: a */
    public final int m21930a(Collection<C4884c> collection) {
        Throwable th;
        Set set;
        this.f17971n.lock();
        Set set2 = null;
        try {
            int i = -1;
            if (!r1.f17973p) {
                Collection<C4884c> b = m21910b((Collection) collection);
                m21923h();
                int i2 = 0;
                for (C4884c c4884c : b) {
                    i2 += c4884c.f17928d.length + c4884c.f17926b.length;
                }
                byte[] bArr = new byte[Math.min(i2, 131072)];
                r1.f17976s = new HashSet();
                C4888g k = m21926k();
                if (k != null) {
                    List<Long> arrayList = new ArrayList();
                    C4886e c4886e = new C4886e(m21919e(k.m21864a()), k.m21871c(), bArr);
                    for (C4884c c4884c2 : b) {
                        int i3 = c4884c2.f17927c & 31;
                        if (k.m21869b() >= r1.f17965h.f17917d || k.m21871c() > 134217727) {
                            m21899a(c4886e, k);
                            if (r1.f17975r != null) {
                                for (Long longValue : arrayList) {
                                    r1.f17975r.mo5162a(longValue.longValue(), k.m21864a());
                                }
                            }
                            arrayList.clear();
                            k = m21926k();
                            if (k != null) {
                                c4886e = new C4886e(m21919e(k.m21864a()), k.m21871c(), bArr);
                            }
                        }
                        c4886e.m21856a(c4884c2.f17926b);
                        c4886e.m21856a(c4884c2.f17928d);
                        long a = c4884c2.f17925a.m21853a();
                        int c = k.m21871c();
                        int length = c4884c2.f17926b.length;
                        try {
                            C4887f c4887f = new C4887f(a, c, length, c4884c2.f17928d.length, i3, C4891e.m21913c(c4884c2.f17928d, 0, c4884c2.f17928d.length), k.m21864a(), k.m21869b());
                            k.m21867a(c4887f);
                            arrayList.add(Long.valueOf(c4887f.f17935a));
                            set2 = null;
                            i = -1;
                        } catch (Throwable th2) {
                            th = th2;
                            set = null;
                        }
                    }
                    m21899a(c4886e, k);
                    if (r1.f17975r != null) {
                        for (Long longValue2 : arrayList) {
                            r1.f17975r.mo5162a(longValue2.longValue(), k.m21864a());
                        }
                    }
                    r1.f17976s = null;
                    r1.f17971n.unlock();
                    return 0;
                }
            }
            r1.f17976s = set2;
            r1.f17971n.unlock();
            return i;
        } catch (Throwable th22) {
            set = null;
            th = th22;
            r1.f17976s = set;
            r1.f17971n.unlock();
            throw th;
        }
    }

    /* renamed from: a */
    public final int m21929a(long j, String str, int i) {
        this.f17971n.lock();
        try {
            j = m21909b(C4891e.m21915c(j, str));
            if (j == null) {
                return -1;
            }
            int i2 = this.f17966i.f17955e[j.f17948a.m21864a()];
            str = j.f17949b;
            i = C4867g.m21800a(str.f17937c, i) & 31;
            j.f17948a.m21868a(new C4887f(str.f17935a, str.f17936b, str.f17938d, str.f17939e, i, str.f17940f, str.f17941g, str.f17942h), j.f17950c);
            m21902a(j.f17948a, true);
            if (i2 == 0 && this.f17966i.f17955e[j.f17948a.m21864a()] == 1) {
                m21911b((boolean) 0);
            }
            this.f17971n.unlock();
            return i;
        } finally {
            this.f17971n.unlock();
        }
    }

    /* renamed from: c */
    private void m21916c(int i) {
        synchronized (this.f17964g) {
            int i2 = i * 1024;
            this.f17964g.m21180a((long) (i2 + 16384));
            C4882a c4882a = this.f17967j;
            C4783a c4783a = this.f17964g;
            c4882a.m21850b(i);
            c4783a.m21185b(c4882a.f17910a, i2, 1024);
            this.f17964g.m21183b();
        }
    }

    /* renamed from: j */
    private void m21925j() {
        synchronized (this.f17964g) {
            this.f17964g.m21180a((long) PlaybackStateCompat.ACTION_PLAY_FROM_URI);
            this.f17966i.m21879a(this.f17964g);
            this.f17964g.m21183b();
        }
    }

    /* renamed from: k */
    private C4888g m21926k() {
        if (this.f17976s == null) {
            throw new AssertionError();
        }
        C4888g b;
        int i = 0;
        while (i < this.f17966i.f17956f) {
            if (this.f17966i.f17953c[i] >= this.f17965h.f17917d || this.f17966i.f17952b[i] > 134217727) {
                i++;
            } else {
                try {
                    b = m21908b(i);
                    break;
                } catch (Throwable e) {
                    if (C4728u.m21050a(f17958a, 6)) {
                        String str = f17958a;
                        StringBuilder stringBuilder = new StringBuilder(31);
                        stringBuilder.append("allocateShardToUse: ");
                        stringBuilder.append(i);
                        Log.e(str, stringBuilder.toString(), e);
                    }
                    b = null;
                }
            }
        }
        b = null;
        i = -1;
        if (i == -1) {
            boolean z;
            int i2;
            int a;
            if (this.f17966i.m21881b() >= 20) {
                long b2 = C4733b.m21068b();
                long a2 = this.f17966i.m21877a();
                if (((long) (((double) (a2 + b2)) * 0.25d)) < a2) {
                    z = true;
                    m21911b(z);
                    if (this.f17965h.f17918e && z) {
                        for (i2 = 0; i2 < 2; i2++) {
                            a = this.f17966i.m21876a(this.f17976s);
                            if (a != -1) {
                                m21918d(a);
                                if (this.f17968k[a] != null) {
                                    this.f17968k[a].m21179a();
                                    this.f17968k[a] = null;
                                }
                                this.f17963f.m21178a(m21920f(a));
                            }
                        }
                    }
                    i = m21885a(z);
                    if (i == -1) {
                        if (C4728u.m21050a(f17958a, 6)) {
                            Log.e(f17958a, "Tile store full, unable to allocate shard");
                        }
                        return null;
                    }
                }
            }
            z = false;
            m21911b(z);
            for (i2 = 0; i2 < 2; i2++) {
                a = this.f17966i.m21876a(this.f17976s);
                if (a != -1) {
                    m21918d(a);
                    if (this.f17968k[a] != null) {
                        this.f17968k[a].m21179a();
                        this.f17968k[a] = null;
                    }
                    this.f17963f.m21178a(m21920f(a));
                }
            }
            i = m21885a(z);
            if (i == -1) {
                if (C4728u.m21050a(f17958a, 6)) {
                    Log.e(f17958a, "Tile store full, unable to allocate shard");
                }
                return null;
            }
        }
        if (b == null || b.m21869b() != this.f17966i.f17953c[i]) {
            b = new C4888g(i);
        }
        this.f17976s.add(Integer.valueOf(i));
        return b;
    }

    /* renamed from: a */
    private int m21885a(boolean z) {
        int i;
        for (i = 0; i < this.f17966i.f17956f; i++) {
            if (!this.f17966i.m21883b(i)) {
                return i;
            }
        }
        i = -1;
        if (z) {
            z = this.f17966i.m21876a(this.f17976s);
            if (!z) {
                m21918d(z);
                return z;
            }
        }
        if (this.f17966i.f17956f < this.f17965h.f17916c) {
            this.f17972o.writeLock().lock();
            try {
                z = this.f17966i;
                i = z.f17956f;
                int i2 = i + 1;
                z.f17956f = i2;
                z.f17951a[i] = 0;
                z.f17952b[i] = 0;
                z.f17953c[i] = 0;
                z.f17954d[i] = 0;
                if (z.f17955e[i] > 0) {
                    z.f17957g--;
                }
                z.f17955e[i] = null;
                this.f17967j.m21847a(i);
                this.f17967j.f17911b = i2;
                return i;
            } finally {
                this.f17972o.writeLock().unlock();
            }
        } else {
            z = this.f17966i.m21876a(this.f17976s);
            if (!z) {
                m21918d(z);
            }
            return z;
        }
    }

    /* renamed from: a */
    private void m21901a(C4888g c4888g, C4888g c4888g2, C4886e c4886e) {
        C4888g c4888g3 = c4888g;
        C4783a e = m21919e(c4888g.m21864a());
        int i = 0;
        while (i < c4888g.m21869b()) {
            if (c4888g3.m21870b(i) == -1 || c4888g3.m21874d(i) <= 0) {
                C4888g c4888g4 = c4888g2;
                C4886e c4886e2 = c4886e;
            } else {
                if (c4888g2.m21869b() < r0.f17965h.f17917d) {
                    if (c4888g2.m21871c() < 134217727) {
                        C4887f e2 = c4888g3.m21875e(i);
                        byte[] bArr = new byte[(e2.f17938d + e2.f17939e)];
                        C4891e.m21897a(e, e2.f17936b, bArr);
                        c4886e.m21856a(bArr);
                        C4887f c4887f = new C4887f(e2.f17935a, c4888g2.m21871c(), e2.f17938d, e2.f17939e, e2.f17937c, e2.f17940f, c4888g2.m21864a(), c4888g2.m21869b());
                        c4888g2.m21867a(c4887f);
                        if (r0.f17975r != null) {
                            r0.f17975r.mo5163b(c4887f.f17935a, c4887f.f17941g);
                        }
                    }
                }
                throw new IOException("Couldn't fit refcounted records into collecting shard");
            }
            i++;
        }
    }

    /* renamed from: a */
    private C4888g m21891a(int i, int i2, int i3) {
        i2 = Math.min((this.f17965h.f17917d * 50) / 100, this.f17965h.f17917d - i2);
        int i4 = 134217727 - i3;
        while (i < this.f17966i.f17956f) {
            if (this.f17966i.f17955e[i] > 0 && this.f17966i.f17955e[i] <= i2 && (this.f17976s == 0 || this.f17976s.contains(Integer.valueOf(i)) == 0)) {
                i3 = m21908b(i);
                if (i3.m21873d() <= i4) {
                    return i3;
                }
            }
            i++;
        }
        return 0;
    }

    /* renamed from: b */
    private void m21911b(boolean r11) {
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
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
        /*
        r10 = this;
        r0 = r10.f17965h;
        r0 = r0.f17916c;
        r1 = r10.f17977t;
        if (r0 > r1) goto L_0x0009;
    L_0x0008:
        return;
    L_0x0009:
        if (r11 == 0) goto L_0x0010;
    L_0x000b:
        r0 = r10.f17966i;
        r0 = r0.f17956f;
        goto L_0x0014;
    L_0x0010:
        r0 = r10.f17965h;
        r0 = r0.f17916c;
    L_0x0014:
        r1 = r10.f17966i;
        r1 = r1.f17957g;
        r0 = r0 - r1;
        r1 = r10.f17976s;
        if (r1 == 0) goto L_0x0024;
    L_0x001d:
        r1 = r10.f17976s;
        r1 = r1.size();
        r0 = r0 - r1;
    L_0x0024:
        r1 = r10.f17977t;
        if (r0 >= r1) goto L_0x00f4;
    L_0x0028:
        r0 = 0;
        r1 = 0;
        r2 = r10.m21891a(r1, r1, r1);	 Catch:{ IOException -> 0x00d9 }
        if (r2 != 0) goto L_0x0031;	 Catch:{ IOException -> 0x00d9 }
    L_0x0030:
        return;	 Catch:{ IOException -> 0x00d9 }
    L_0x0031:
        r3 = r2.m21864a();	 Catch:{ IOException -> 0x00d9 }
        r4 = r3 + 1;	 Catch:{ IOException -> 0x00d9 }
        r5 = r10.f17966i;	 Catch:{ IOException -> 0x00d9 }
        r5 = r5.f17955e;	 Catch:{ IOException -> 0x00d9 }
        r3 = r5[r3];	 Catch:{ IOException -> 0x00d9 }
        r5 = r2.m21873d();	 Catch:{ IOException -> 0x00d9 }
        r3 = r10.m21891a(r4, r3, r5);	 Catch:{ IOException -> 0x00d9 }
        if (r3 != 0) goto L_0x0048;	 Catch:{ IOException -> 0x00d9 }
    L_0x0047:
        return;	 Catch:{ IOException -> 0x00d9 }
    L_0x0048:
        r11 = r10.m21885a(r11);	 Catch:{ IOException -> 0x00d9 }
        r4 = -1;	 Catch:{ IOException -> 0x00d9 }
        if (r11 != r4) goto L_0x0050;	 Catch:{ IOException -> 0x00d9 }
    L_0x004f:
        return;	 Catch:{ IOException -> 0x00d9 }
    L_0x0050:
        r4 = new com.google.android.m4b.maps.bs.e$g;	 Catch:{ IOException -> 0x00d9 }
        r4.<init>(r11);	 Catch:{ IOException -> 0x00d9 }
        r5 = 131072; // 0x20000 float:1.83671E-40 double:6.47582E-319;
        r5 = new byte[r5];	 Catch:{ IOException -> 0x00d7 }
        r6 = new com.google.android.m4b.maps.bs.e$e;	 Catch:{ IOException -> 0x00d7 }
        r11 = r10.m21919e(r11);	 Catch:{ IOException -> 0x00d7 }
        r6.<init>(r11, r1, r5);	 Catch:{ IOException -> 0x00d7 }
        r11 = new java.util.HashSet;	 Catch:{ IOException -> 0x00d7 }
        r11.<init>();	 Catch:{ IOException -> 0x00d7 }
    L_0x0067:
        if (r2 == 0) goto L_0x0096;	 Catch:{ IOException -> 0x00d7 }
    L_0x0069:
        r10.m21901a(r2, r4, r6);	 Catch:{ IOException -> 0x00d7 }
        r5 = r2.m21864a();	 Catch:{ IOException -> 0x00d7 }
        r5 = java.lang.Integer.valueOf(r5);	 Catch:{ IOException -> 0x00d7 }
        r11.add(r5);	 Catch:{ IOException -> 0x00d7 }
        r5 = r11.size();	 Catch:{ IOException -> 0x00d7 }
        r7 = 4;	 Catch:{ IOException -> 0x00d7 }
        if (r5 >= r7) goto L_0x0096;	 Catch:{ IOException -> 0x00d7 }
    L_0x007e:
        if (r3 == 0) goto L_0x0083;	 Catch:{ IOException -> 0x00d7 }
    L_0x0080:
        r2 = r3;	 Catch:{ IOException -> 0x00d7 }
        r3 = r0;	 Catch:{ IOException -> 0x00d7 }
        goto L_0x0067;	 Catch:{ IOException -> 0x00d7 }
    L_0x0083:
        r2 = r2.m21864a();	 Catch:{ IOException -> 0x00d7 }
        r2 = r2 + 1;	 Catch:{ IOException -> 0x00d7 }
        r5 = r4.m21869b();	 Catch:{ IOException -> 0x00d7 }
        r7 = r4.m21871c();	 Catch:{ IOException -> 0x00d7 }
        r2 = r10.m21891a(r2, r5, r7);	 Catch:{ IOException -> 0x00d7 }
        goto L_0x0067;	 Catch:{ IOException -> 0x00d7 }
    L_0x0096:
        r10.m21899a(r6, r4);	 Catch:{ IOException -> 0x00d7 }
        r11 = r11.iterator();	 Catch:{ IOException -> 0x00d7 }
    L_0x009d:
        r0 = r11.hasNext();	 Catch:{ IOException -> 0x00d7 }
        if (r0 == 0) goto L_0x00d6;	 Catch:{ IOException -> 0x00d7 }
    L_0x00a3:
        r0 = r11.next();	 Catch:{ IOException -> 0x00d7 }
        r0 = (java.lang.Integer) r0;	 Catch:{ IOException -> 0x00d7 }
        r0 = r0.intValue();	 Catch:{ IOException -> 0x00d7 }
        r2 = r10.m21908b(r0);	 Catch:{ IOException -> 0x00d2 }
        r3 = 0;	 Catch:{ IOException -> 0x00d2 }
    L_0x00b2:
        r5 = r2.m21869b();	 Catch:{ IOException -> 0x00d2 }
        if (r3 >= r5) goto L_0x00ce;	 Catch:{ IOException -> 0x00d2 }
    L_0x00b8:
        r5 = r2.m21870b(r3);	 Catch:{ IOException -> 0x00d2 }
        r7 = -1;	 Catch:{ IOException -> 0x00d2 }
        r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1));	 Catch:{ IOException -> 0x00d2 }
        if (r9 == 0) goto L_0x00cb;	 Catch:{ IOException -> 0x00d2 }
    L_0x00c2:
        r5 = r2.m21874d(r3);	 Catch:{ IOException -> 0x00d2 }
        if (r5 <= 0) goto L_0x00cb;	 Catch:{ IOException -> 0x00d2 }
    L_0x00c8:
        r2.m21865a(r3);	 Catch:{ IOException -> 0x00d2 }
    L_0x00cb:
        r3 = r3 + 1;	 Catch:{ IOException -> 0x00d2 }
        goto L_0x00b2;	 Catch:{ IOException -> 0x00d2 }
    L_0x00ce:
        r10.m21902a(r2, r1);	 Catch:{ IOException -> 0x00d2 }
        goto L_0x009d;
    L_0x00d2:
        r10.m21918d(r0);	 Catch:{ IOException -> 0x00d7 }
        goto L_0x009d;
    L_0x00d6:
        return;
    L_0x00d7:
        r11 = move-exception;
        goto L_0x00db;
    L_0x00d9:
        r11 = move-exception;
        r4 = r0;
    L_0x00db:
        if (r4 == 0) goto L_0x00e4;
    L_0x00dd:
        r0 = r4.m21864a();
        r10.m21918d(r0);
    L_0x00e4:
        r0 = f17958a;
        r1 = 6;
        r0 = com.google.android.m4b.maps.ay.C4728u.m21050a(r0, r1);
        if (r0 == 0) goto L_0x00f4;
    L_0x00ed:
        r0 = f17958a;
        r1 = "Failed to combine refCounted records";
        android.util.Log.e(r0, r1, r11);
    L_0x00f4:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.m4b.maps.bs.e.b(boolean):void");
    }

    /* renamed from: a */
    private static void m21896a(int i, C4885d c4885d, Map<C4885d, Integer> map) {
        Integer num = (Integer) map.get(c4885d);
        if (num != null) {
            i = Integer.valueOf(C4867g.m21800a(i, num.intValue()));
        } else {
            i = Integer.valueOf(i);
        }
        map.put(c4885d, i);
    }

    /* renamed from: b */
    private java.util.Collection<com.google.android.m4b.maps.bs.C4891e.C4884c> m21910b(java.util.Collection<com.google.android.m4b.maps.bs.C4891e.C4884c> r14) {
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
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
        /*
        r13 = this;
        r0 = new java.util.HashSet;
        r1 = r14.size();
        r0.<init>(r1);
        r1 = new java.util.HashSet;
        r2 = r14.size();
        r1.<init>(r2);
        r2 = new java.util.HashMap;
        r3 = r14.size();
        r2.<init>(r3);
        r3 = new java.util.ArrayList;
        r3.<init>(r14);
        java.util.Collections.reverse(r3);
        r14 = r3.iterator();
    L_0x0027:
        r4 = r14.hasNext();
        if (r4 == 0) goto L_0x0075;
    L_0x002d:
        r4 = r14.next();
        r4 = (com.google.android.m4b.maps.bs.C4891e.C4884c) r4;
        r5 = r4.f17925a;
        r5 = r5.m21853a();
        r7 = -1;
        r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1));
        if (r9 == 0) goto L_0x0071;
    L_0x003f:
        r5 = r4.f17926b;
        r5 = r5.length;
        r6 = 255; // 0xff float:3.57E-43 double:1.26E-321;
        if (r5 <= r6) goto L_0x0047;
    L_0x0046:
        goto L_0x0071;
    L_0x0047:
        r5 = r4.f17925a;
        r5 = r1.contains(r5);
        if (r5 == 0) goto L_0x005e;
    L_0x004f:
        r14.remove();
        r5 = r4.f17927c;
        if (r5 <= 0) goto L_0x0027;
    L_0x0056:
        r5 = r4.f17927c;
        r4 = r4.f17925a;
        com.google.android.m4b.maps.bs.C4891e.m21896a(r5, r4, r2);
        goto L_0x0027;
    L_0x005e:
        r5 = r4.f17925a;
        r5 = r5.m21853a();
        r5 = java.lang.Long.valueOf(r5);
        r0.add(r5);
        r4 = r4.f17925a;
        r1.add(r4);
        goto L_0x0027;
    L_0x0071:
        r14.remove();
        goto L_0x0027;
    L_0x0075:
        r14 = 0;
        r4 = 0;
    L_0x0077:
        r5 = r13.f17966i;
        r5 = r5.f17956f;
        r6 = 1;
        if (r4 >= r5) goto L_0x013d;
    L_0x007e:
        r5 = r0.iterator();
    L_0x0082:
        r7 = r5.hasNext();
        if (r7 == 0) goto L_0x00a8;
    L_0x0088:
        r7 = r5.next();
        r7 = (java.lang.Long) r7;
        r8 = r13.f17966i;
        r8 = r8.m21883b(r4);
        if (r8 == 0) goto L_0x0082;
    L_0x0096:
        r8 = r13.f17967j;
        r9 = r7.longValue();
        r7 = com.google.android.m4b.maps.bs.C4891e.C4882a.m21846a(r9);
        r7 = r8.m21849a(r7, r4);
        if (r7 == 0) goto L_0x0082;
    L_0x00a6:
        r5 = 1;
        goto L_0x00a9;
    L_0x00a8:
        r5 = 0;
    L_0x00a9:
        if (r5 == 0) goto L_0x0139;
    L_0x00ab:
        r5 = 0;
        r7 = r13.m21908b(r4);	 Catch:{ IOException -> 0x00b2 }
        r5 = r7;
        goto L_0x00d7;
    L_0x00b2:
        r7 = move-exception;
        r8 = f17958a;
        r9 = 6;
        r8 = com.google.android.m4b.maps.ay.C4728u.m21050a(r8, r9);
        if (r8 == 0) goto L_0x00d4;
    L_0x00bc:
        r8 = f17958a;
        r9 = new java.lang.StringBuilder;
        r10 = 48;
        r9.<init>(r10);
        r10 = "removeOldRecordsAndFilterInsertions: ";
        r9.append(r10);
        r9.append(r4);
        r9 = r9.toString();
        android.util.Log.e(r8, r9, r7);
    L_0x00d4:
        r13.m21918d(r4);
    L_0x00d7:
        if (r5 == 0) goto L_0x0139;
    L_0x00d9:
        r7 = 0;
        r8 = 0;
    L_0x00db:
        r9 = r5.m21869b();
        if (r7 >= r9) goto L_0x0134;
    L_0x00e1:
        r9 = r5.m21870b(r7);
        r11 = java.lang.Long.valueOf(r9);
        r11 = r0.contains(r11);
        if (r11 == 0) goto L_0x0131;
    L_0x00ef:
        r11 = f17959b;
        r12 = r5.m21872c(r7);
        if (r12 <= 0) goto L_0x00ff;
    L_0x00f7:
        r11 = r5.m21875e(r7);
        r11 = r13.m21906a(r11);	 Catch:{ IOException -> 0x0131 }
    L_0x00ff:
        r12 = new com.google.android.m4b.maps.bs.e$d;
        r12.<init>(r9, r11);
        r11 = r1.contains(r12);
        if (r11 == 0) goto L_0x0131;
    L_0x010a:
        r8 = r13.f17975r;
        if (r8 == 0) goto L_0x0113;
    L_0x010e:
        r8 = r13.f17975r;
        r8.mo5161a(r9);
    L_0x0113:
        r11 = r13.f17969l;
        monitor-enter(r11);
        r8 = r13.f17969l;	 Catch:{ all -> 0x012e }
        r9 = java.lang.Long.valueOf(r9);	 Catch:{ all -> 0x012e }
        r8.m22254c(r9);	 Catch:{ all -> 0x012e }
        monitor-exit(r11);	 Catch:{ all -> 0x012e }
        r8 = r5.m21874d(r7);
        if (r8 <= 0) goto L_0x0129;
    L_0x0126:
        com.google.android.m4b.maps.bs.C4891e.m21896a(r8, r12, r2);
    L_0x0129:
        r5.m21865a(r7);
        r8 = 1;
        goto L_0x0131;
    L_0x012e:
        r14 = move-exception;
        monitor-exit(r11);	 Catch:{ all -> 0x012e }
        throw r14;
    L_0x0131:
        r7 = r7 + 1;
        goto L_0x00db;
    L_0x0134:
        if (r8 == 0) goto L_0x0139;
    L_0x0136:
        r13.m21902a(r5, r14);
    L_0x0139:
        r4 = r4 + 1;
        goto L_0x0077;
    L_0x013d:
        r0 = new java.util.ArrayList;
        r1 = r3.size();
        r0.<init>(r1);
        r1 = r3.size();
        r1 = r1 - r6;
    L_0x014b:
        if (r1 < 0) goto L_0x017f;
    L_0x014d:
        r4 = r3.get(r1);
        r4 = (com.google.android.m4b.maps.bs.C4891e.C4884c) r4;
        r5 = r4.f17925a;
        r5 = r2.get(r5);
        r5 = (java.lang.Integer) r5;
        if (r5 == 0) goto L_0x0179;
    L_0x015d:
        r5 = r5.intValue();
        r6 = r4.f17927c;
        r5 = com.google.android.m4b.maps.bq.C4867g.m21800a(r5, r6);
        r5 = java.lang.Integer.valueOf(r5);
        r6 = new com.google.android.m4b.maps.bs.e$c;
        r7 = r4.f17925a;
        r5 = r5.intValue();
        r4 = r4.f17928d;
        r6.<init>(r7, r5, r4);
        r4 = r6;
    L_0x0179:
        r0.add(r4);
        r1 = r1 + -1;
        goto L_0x014b;
    L_0x017f:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.m4b.maps.bs.e.b(java.util.Collection):java.util.Collection<com.google.android.m4b.maps.bs.e$c>");
    }

    /* renamed from: d */
    private void m21918d(int i) {
        try {
            m21902a(new C4888g(i), false);
            synchronized (this.f17969l) {
                this.f17969l.m22247a();
            }
            this.f17970m.clear();
            if (this.f17975r != null) {
                this.f17975r.mo5160a(i);
            }
        } catch (int i2) {
            String valueOf = String.valueOf("Cache:");
            String valueOf2 = String.valueOf(this.f17962e);
            if (C4728u.m21050a(valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf), 6)) {
                valueOf = String.valueOf("Cache:");
                valueOf2 = String.valueOf(this.f17962e);
                Log.e(valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf), "Error writing on the cache", i2);
            }
        }
    }

    /* renamed from: e */
    private C4783a m21919e(int i) {
        synchronized (this.f17968k) {
            if (this.f17968k[i] == null) {
                this.f17968k[i] = this.f17963f.m21177a(m21920f(i), true);
            }
            i = this.f17968k[i];
        }
        return i;
    }

    /* renamed from: f */
    private String m21920f(int i) {
        String str = this.f17962e;
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 12);
        stringBuilder.append(str);
        stringBuilder.append(".");
        stringBuilder.append(i);
        return stringBuilder.toString();
    }

    /* renamed from: l */
    private static int m21927l() {
        return (int) (System.currentTimeMillis() / 1000);
    }

    public String toString() {
        String str = this.f17962e;
        int i = this.f17965h.f17919f;
        String valueOf = String.valueOf(this.f17965h.f17921h);
        boolean z = this.f17965h.f17918e;
        int d = m21937d();
        int g = m21922g();
        int i2 = this.f17965h.f17916c;
        StringBuilder stringBuilder = new StringBuilder((String.valueOf(str).length() + 94) + String.valueOf(valueOf).length());
        stringBuilder.append("[");
        stringBuilder.append(str);
        stringBuilder.append(" ver:");
        stringBuilder.append(i);
        stringBuilder.append(" locale: ");
        stringBuilder.append(valueOf);
        stringBuilder.append(" auto:");
        stringBuilder.append(z);
        stringBuilder.append(" size:");
        stringBuilder.append(d);
        stringBuilder.append(" max:");
        stringBuilder.append(g);
        stringBuilder.append(" max_shards:");
        stringBuilder.append(i2);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    /* renamed from: a */
    private static void m21897a(C4783a c4783a, int i, byte[] bArr) {
        synchronized (c4783a) {
            c4783a.m21180a((long) i);
            c4783a.m21184b(bArr);
        }
    }

    /* renamed from: a */
    public static int m21886a(byte[] bArr, int i) {
        int i2 = i + 1;
        int i3 = i2 + 1;
        return (bArr[i3 + 1] & 255) | ((((bArr[i] & 255) << 24) | ((bArr[i2] & 255) << 16)) | ((bArr[i3] & 255) << 8));
    }

    /* renamed from: a */
    public static void m21903a(byte[] bArr, int i, int i2) {
        int i3 = i + 1;
        bArr[i] = (byte) (i2 >> 24);
        i = i3 + 1;
        bArr[i3] = (byte) (i2 >> 16);
        i3 = i + 1;
        bArr[i] = (byte) (i2 >> 8);
        bArr[i3] = (byte) i2;
    }

    /* renamed from: b */
    public static int m21907b(byte[] bArr, int i) {
        return (bArr[i + 1] & 255) | ((bArr[i] & 255) << 8);
    }

    /* renamed from: b */
    public static void m21912b(byte[] bArr, int i, int i2) {
        int i3 = i + 1;
        bArr[i] = (byte) (i2 >> 8);
        bArr[i3] = (byte) i2;
    }

    /* renamed from: c */
    public static long m21914c(byte[] bArr, int i) {
        return (((long) C4891e.m21886a(bArr, i)) << 32) | (((long) C4891e.m21886a(bArr, i + 4)) & 4294967295L);
    }

    /* renamed from: a */
    public static void m21904a(byte[] bArr, int i, long j) {
        C4891e.m21903a(bArr, i, (int) (j >> 32));
        C4891e.m21903a(bArr, i + 4, (int) j);
    }

    /* renamed from: c */
    static int m21913c(byte[] bArr, int i, int i2) {
        CRC32 crc32 = new CRC32();
        crc32.update(bArr, i, i2);
        return (int) crc32.getValue();
    }

    /* renamed from: a */
    private void m21899a(C4886e c4886e, C4888g c4888g) {
        c4886e.m21855a();
        m21902a(c4888g, true);
    }
}
