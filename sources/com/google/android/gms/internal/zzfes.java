package com.google.android.gms.internal;

import java.io.IOException;
import java.io.Serializable;
import java.util.Iterator;

public abstract class zzfes implements Serializable, Iterable<Byte> {
    /* renamed from: a */
    public static final zzfes f16682a = new zzfez(abx.f15003b);
    /* renamed from: b */
    private static final abh f16683b;
    /* renamed from: c */
    private int f16684c = 0;

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
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
        /*
        r0 = new com.google.android.gms.internal.zzfez;
        r1 = com.google.android.gms.internal.abx.f15003b;
        r0.<init>(r1);
        f16682a = r0;
        r0 = "android.content.Context";	 Catch:{ ClassNotFoundException -> 0x0010 }
        java.lang.Class.forName(r0);	 Catch:{ ClassNotFoundException -> 0x0010 }
        r0 = 1;
        goto L_0x0011;
    L_0x0010:
        r0 = 0;
    L_0x0011:
        r1 = 0;
        if (r0 == 0) goto L_0x001a;
    L_0x0014:
        r0 = new com.google.android.gms.internal.abj;
        r0.<init>(r1);
        goto L_0x001f;
    L_0x001a:
        r0 = new com.google.android.gms.internal.abg;
        r0.<init>(r1);
    L_0x001f:
        f16683b = r0;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zzfes.<clinit>():void");
    }

    zzfes() {
    }

    /* renamed from: a */
    public static zzfes m20297a(String str) {
        return new zzfez(str.getBytes(abx.f15002a));
    }

    /* renamed from: a */
    public static zzfes m20298a(byte[] bArr) {
        return m20299a(bArr, 0, bArr.length);
    }

    /* renamed from: a */
    public static zzfes m20299a(byte[] bArr, int i, int i2) {
        return new zzfez(f16683b.mo4173a(bArr, i, i2));
    }

    /* renamed from: b */
    static int m20300b(int i, int i2, int i3) {
        int i4 = i2 - i;
        if ((((i | i2) | i4) | (i3 - i2)) >= 0) {
            return i4;
        }
        if (i < 0) {
            StringBuilder stringBuilder = new StringBuilder(32);
            stringBuilder.append("Beginning index: ");
            stringBuilder.append(i);
            stringBuilder.append(" < 0");
            throw new IndexOutOfBoundsException(stringBuilder.toString());
        } else if (i2 < i) {
            r1 = new StringBuilder(66);
            r1.append("Beginning index larger than ending index: ");
            r1.append(i);
            r1.append(", ");
            r1.append(i2);
            throw new IndexOutOfBoundsException(r1.toString());
        } else {
            r1 = new StringBuilder(37);
            r1.append("End index: ");
            r1.append(i2);
            r1.append(" >= ");
            r1.append(i3);
            throw new IndexOutOfBoundsException(r1.toString());
        }
    }

    /* renamed from: b */
    static abi m20301b(int i) {
        return new abi(i);
    }

    /* renamed from: b */
    static zzfes m20302b(byte[] bArr) {
        return new zzfez(bArr);
    }

    /* renamed from: b */
    static void m20303b(int i, int i2) {
        if (((i2 - (i + 1)) | i) >= 0) {
            return;
        }
        if (i < 0) {
            StringBuilder stringBuilder = new StringBuilder(22);
            stringBuilder.append("Index < 0: ");
            stringBuilder.append(i);
            throw new ArrayIndexOutOfBoundsException(stringBuilder.toString());
        }
        StringBuilder stringBuilder2 = new StringBuilder(40);
        stringBuilder2.append("Index > length: ");
        stringBuilder2.append(i);
        stringBuilder2.append(", ");
        stringBuilder2.append(i2);
        throw new ArrayIndexOutOfBoundsException(stringBuilder2.toString());
    }

    /* renamed from: a */
    public abstract byte mo6929a(int i);

    /* renamed from: a */
    public abstract int mo6930a();

    /* renamed from: a */
    protected abstract int mo6931a(int i, int i2, int i3);

    /* renamed from: a */
    public abstract zzfes mo6932a(int i, int i2);

    /* renamed from: a */
    abstract void mo6933a(abe abe) throws IOException;

    /* renamed from: a */
    protected abstract void mo6934a(byte[] bArr, int i, int i2, int i3);

    /* renamed from: b */
    public final boolean m20310b() {
        return mo6930a() == 0;
    }

    /* renamed from: c */
    public final byte[] m20311c() {
        int a = mo6930a();
        if (a == 0) {
            return abx.f15003b;
        }
        byte[] bArr = new byte[a];
        mo6934a(bArr, 0, 0, a);
        return bArr;
    }

    /* renamed from: d */
    public abstract abk mo6936d();

    /* renamed from: e */
    protected final int m20313e() {
        return this.f16684c;
    }

    public abstract boolean equals(Object obj);

    public final int hashCode() {
        int i = this.f16684c;
        if (i == 0) {
            i = mo6930a();
            i = mo6931a(i, 0, i);
            if (i == 0) {
                i = 1;
            }
            this.f16684c = i;
        }
        return i;
    }

    public /* synthetic */ Iterator iterator() {
        return new abf(this);
    }

    public final String toString() {
        return String.format("<ByteString@%s size=%d>", new Object[]{Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(mo6930a())});
    }
}
