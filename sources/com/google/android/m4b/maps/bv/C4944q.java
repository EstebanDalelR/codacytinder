package com.google.android.m4b.maps.bv;

import android.opengl.Matrix;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.os.SystemClock;
import com.google.android.m4b.maps.ar.C4662a;
import com.google.android.m4b.maps.bc.C4754b;
import com.google.android.m4b.maps.cg.bp;
import com.google.android.m4b.maps.de.ab;
import com.google.android.m4b.maps.model.LatLng;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.m4b.maps.bv.q */
public final class C4944q implements Parcelable {
    public static final Creator<C4944q> CREATOR = new C49431();
    /* renamed from: a */
    public static final long f18256a = TimeUnit.HOURS.toMillis(2);
    /* renamed from: A */
    public float f18257A;
    /* renamed from: B */
    public int f18258B;
    /* renamed from: C */
    private float f18259C;
    /* renamed from: D */
    private float[] f18260D;
    /* renamed from: E */
    private long f18261E = System.currentTimeMillis();
    /* renamed from: b */
    public boolean f18262b;
    /* renamed from: c */
    public int f18263c;
    /* renamed from: d */
    public int f18264d;
    /* renamed from: e */
    public int f18265e;
    /* renamed from: f */
    public int f18266f;
    /* renamed from: g */
    public int f18267g;
    /* renamed from: h */
    public int f18268h;
    /* renamed from: i */
    public String f18269i;
    /* renamed from: j */
    public LatLng f18270j;
    /* renamed from: k */
    public int f18271k;
    /* renamed from: l */
    public String f18272l;
    /* renamed from: m */
    public String f18273m;
    /* renamed from: n */
    public String f18274n;
    /* renamed from: o */
    public int f18275o;
    /* renamed from: p */
    public boolean f18276p = false;
    /* renamed from: q */
    public boolean f18277q = false;
    /* renamed from: r */
    public int f18278r;
    /* renamed from: s */
    public List<C4946s> f18279s;
    /* renamed from: t */
    public float f18280t;
    /* renamed from: u */
    public float f18281u;
    /* renamed from: v */
    public float f18282v;
    /* renamed from: w */
    public float f18283w;
    /* renamed from: x */
    public float f18284x;
    /* renamed from: y */
    public C4948t[] f18285y;
    /* renamed from: z */
    public C4922b f18286z;

    /* renamed from: com.google.android.m4b.maps.bv.q$1 */
    class C49431 implements Creator<C4944q> {
        C49431() {
        }

        public final /* synthetic */ Object[] newArray(int i) {
            return new C4944q[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new C4944q(parcel);
        }
    }

    public final int describeContents() {
        return 0;
    }

    /* renamed from: a */
    public static C4944q m22171a(InputStream inputStream) {
        SystemClock.uptimeMillis();
        C4662a c4662a = new C4662a(ab.f19823a);
        c4662a.m20818a(inputStream);
        return new C4944q(c4662a);
    }

    public C4944q(android.os.Parcel r8) {
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
        r7 = this;
        r7.<init>();
        r0 = 0;
        r7.f18276p = r0;
        r7.f18277q = r0;
        r1 = java.lang.System.currentTimeMillis();
        r7.f18261E = r1;
        r1 = r8.readInt();
        r2 = 6;
        if (r1 == r2) goto L_0x001d;
    L_0x0015:
        r8 = new java.lang.IllegalArgumentException;
        r0 = "unknown version";
        r8.<init>(r0);
        throw r8;
    L_0x001d:
        r1 = r8.readInt();
        if (r1 == 0) goto L_0x0025;
    L_0x0023:
        r1 = 1;
        goto L_0x0026;
    L_0x0025:
        r1 = 0;
    L_0x0026:
        r7.f18262b = r1;
        r1 = r8.readInt();
        r7.f18263c = r1;
        r7.f18264d = r0;
        r0 = r8.readInt();
        r7.f18265e = r0;
        r0 = r8.readInt();
        r7.f18266f = r0;
        r0 = r8.readInt();
        r7.f18267g = r0;
        r0 = r8.readInt();
        r7.f18268h = r0;
        r0 = r8.readString();
        r7.f18269i = r0;
        r0 = r8.readInt();
        r1 = r8.readInt();
        r2 = new com.google.android.m4b.maps.model.LatLng;
        r3 = (double) r0;
        r5 = 4517329193108106637; // 0x3eb0c6f7a0b5ed8d float:-3.081979E-19 double:1.0E-6;
        r3 = r3 * r5;
        r0 = (double) r1;
        r0 = r0 * r5;
        r2.<init>(r3, r0);
        r7.f18270j = r2;
        r0 = r8.readInt();
        r7.f18271k = r0;
        r0 = r8.readString();
        r7.f18272l = r0;
        r0 = r8.readString();
        r7.f18273m = r0;
        r0 = r8.readString();
        r7.f18274n = r0;
        r0 = r8.readInt();
        r7.f18275o = r0;
        r0 = r8.readInt();
        r7.f18278r = r0;
        r0 = r8.readFloat();
        r7.f18280t = r0;
        r0 = r8.readFloat();
        r7.f18281u = r0;
        r0 = r8.readFloat();
        r7.f18282v = r0;
        r0 = r8.readFloat();
        r7.f18283w = r0;
        r0 = r8.readFloat();
        r7.f18284x = r0;
        r0 = com.google.android.m4b.maps.bv.C4948t.CREATOR;
        r0 = r8.createTypedArray(r0);
        r0 = (com.google.android.m4b.maps.bv.C4948t[]) r0;
        r7.f18285y = r0;
        r0 = r8.readLong();
        r7.f18261E = r0;
        r0 = r8.createByteArray();
        r8 = r8.createByteArray();
        r1 = new com.google.android.m4b.maps.bv.b;	 Catch:{ IOException -> 0x00ca }
        r1.<init>(r0, r8);	 Catch:{ IOException -> 0x00ca }
        r7.f18286z = r1;	 Catch:{ IOException -> 0x00ca }
        goto L_0x00cd;
    L_0x00ca:
        r8 = 0;
        r7.f18286z = r8;
    L_0x00cd:
        r7.m22173e();
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.m4b.maps.bv.q.<init>(android.os.Parcel):void");
    }

    public C4944q(com.google.android.m4b.maps.ar.C4662a r13) {
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
        r12 = this;
        r12.<init>();
        r0 = 0;
        r12.f18276p = r0;
        r12.f18277q = r0;
        r1 = java.lang.System.currentTimeMillis();
        r12.f18261E = r1;
        r1 = 1;
        r2 = r13.m20842g(r1);
        r3 = 33;
        r3 = r13.m20842g(r3);
        r4 = 49;
        r4 = r13.m20842g(r4);
        r5 = 58;
        r13 = r13.m20842g(r5);
        r5 = 2;
        r6 = r2.m20831b(r5);
        r12.f18262b = r6;
        r6 = 3;
        r6 = r2.m20835d(r6);
        r12.f18263c = r6;
        r6 = 17;
        r7 = 100000; // 0x186a0 float:1.4013E-40 double:4.94066E-319;
        r6 = com.google.android.m4b.maps.bv.C4944q.m22169a(r2, r6, r0, r7);
        r12.f18264d = r6;
        r6 = r12.f18263c;
        if (r6 == 0) goto L_0x0064;
    L_0x0042:
        r6 = r12.f18263c;
        r7 = r12.f18264d;
        r8 = new java.lang.StringBuilder;
        r9 = 44;
        r8.<init>(r9);
        r9 = "infoLevel=";
        r8.append(r9);
        r8.append(r6);
        r6 = ", infoValue=";
        r8.append(r6);
        r8.append(r7);
        r6 = r8.toString();
        com.google.android.m4b.maps.bv.ac.m22036a(r6);
    L_0x0064:
        r6 = 4;
        r7 = 32768; // 0x8000 float:4.5918E-41 double:1.61895E-319;
        r6 = com.google.android.m4b.maps.bv.C4944q.m22169a(r2, r6, r1, r7);
        r12.f18265e = r6;
        r6 = 5;
        r6 = com.google.android.m4b.maps.bv.C4944q.m22169a(r2, r6, r1, r7);
        r12.f18266f = r6;
        r6 = 6;
        r7 = 2880; // 0xb40 float:4.036E-42 double:1.423E-320;
        r6 = com.google.android.m4b.maps.bv.C4944q.m22169a(r2, r6, r1, r7);
        r12.f18267g = r6;
        r6 = 7;
        r6 = com.google.android.m4b.maps.bv.C4944q.m22169a(r2, r6, r1, r7);
        r12.f18268h = r6;
        r6 = 8;
        r6 = r2.m20843h(r6);
        r12.f18269i = r6;
        r6 = 9;
        r7 = 14;
        r6 = com.google.android.m4b.maps.bv.C4944q.m22169a(r2, r6, r1, r7);
        r12.f18271k = r6;
        r6 = 10;
        r6 = r2.m20842g(r6);
        r7 = new com.google.android.m4b.maps.model.LatLng;
        r8 = r6.m20835d(r1);
        r8 = (double) r8;
        r10 = 4517329193108106637; // 0x3eb0c6f7a0b5ed8d float:-3.081979E-19 double:1.0E-6;
        r8 = r8 * r10;
        r5 = r6.m20835d(r5);
        r5 = (double) r5;
        r5 = r5 * r10;
        r7.<init>(r8, r5);
        r12.f18270j = r7;
        r5 = 11;
        r5 = r2.m20843h(r5);
        r12.f18272l = r5;
        r5 = 12;
        r5 = r2.m20843h(r5);
        r12.f18273m = r5;
        r5 = 13;
        r5 = r2.m20843h(r5);
        r12.f18274n = r5;
        r5 = 61;
        r2 = r2.m20835d(r5);
        r12.f18275o = r2;
        r2 = 34;
        r2 = r3.m20835d(r2);
        r2 = com.google.android.m4b.maps.bv.C4944q.m22167a(r2);
        r12.f18280t = r2;
        r2 = 35;
        r2 = r3.m20835d(r2);
        r2 = com.google.android.m4b.maps.bv.C4944q.m22167a(r2);
        r12.f18281u = r2;
        r2 = 36;
        r2 = r3.m20835d(r2);
        r2 = (float) r2;
        r5 = 897988541; // 0x358637bd float:1.0E-6 double:4.436652885E-315;
        r2 = r2 * r5;
        r5 = -1028404019; // 0xffffffffc2b3cccd float:-89.9 double:NaN;
        r6 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1));
        r7 = 1119079629; // 0x42b3cccd float:89.9 double:5.528987996E-315;
        if (r6 >= 0) goto L_0x0109;
    L_0x0105:
        r2 = -1028404019; // 0xffffffffc2b3cccd float:-89.9 double:NaN;
        goto L_0x0110;
    L_0x0109:
        r5 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1));
        if (r5 <= 0) goto L_0x0110;
    L_0x010d:
        r2 = 1119079629; // 0x42b3cccd float:89.9 double:5.528987996E-315;
    L_0x0110:
        r12.f18282v = r2;
        r12.f18278r = r0;
        r2 = 38;
        r5 = r3.m20845j(r2);
        if (r5 == 0) goto L_0x0129;
    L_0x011c:
        r2 = r3.m20835d(r2);
        switch(r2) {
            case 3: goto L_0x0127;
            case 4: goto L_0x0124;
            default: goto L_0x0123;
        };
    L_0x0123:
        goto L_0x0129;
    L_0x0124:
        r12.f18278r = r1;
        goto L_0x0129;
    L_0x0127:
        r12.f18278r = r0;
    L_0x0129:
        r1 = 40;
        r2 = -90000000; // 0xfffffffffaa2b580 float:-4.2241667E35 double:NaN;
        r1 = com.google.android.m4b.maps.bv.C4944q.m22168a(r3, r1, r2);
        r12.f18283w = r1;
        r1 = 41;
        r2 = 90000000; // 0x55d4a80 float:1.04050536E-35 double:4.4465908E-316;
        r1 = com.google.android.m4b.maps.bv.C4944q.m22168a(r3, r1, r2);
        r12.f18284x = r1;
        r1 = r12.f18283w;
        r2 = r12.f18284x;
        r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1));
        if (r1 <= 0) goto L_0x014f;
    L_0x0147:
        r1 = r12.f18283w;
        r2 = r12.f18284x;
        r12.f18283w = r2;
        r12.f18284x = r1;
    L_0x014f:
        r1 = 52;
        r2 = r4.m20846k(r1);
        r3 = new com.google.android.m4b.maps.bv.C4948t[r2];
        r12.f18285y = r3;
    L_0x0159:
        if (r0 >= r2) goto L_0x016b;
    L_0x015b:
        r3 = r4.m20833c(r1, r0);
        r5 = r12.f18285y;
        r6 = new com.google.android.m4b.maps.bv.t;
        r6.<init>(r3);
        r5[r0] = r6;
        r0 = r0 + 1;
        goto L_0x0159;
    L_0x016b:
        if (r13 == 0) goto L_0x0190;
    L_0x016d:
        r0 = 59;
        r1 = r13.m20845j(r0);
        if (r1 == 0) goto L_0x0190;
    L_0x0175:
        r1 = 60;
        r2 = r13.m20845j(r1);
        if (r2 == 0) goto L_0x0190;
    L_0x017d:
        r2 = new com.google.android.m4b.maps.bv.b;	 Catch:{ IOException -> 0x018d }
        r0 = r13.m20834c(r0);	 Catch:{ IOException -> 0x018d }
        r13 = r13.m20834c(r1);	 Catch:{ IOException -> 0x018d }
        r2.<init>(r0, r13);	 Catch:{ IOException -> 0x018d }
        r12.f18286z = r2;	 Catch:{ IOException -> 0x018d }
        goto L_0x0190;
    L_0x018d:
        r13 = 0;
        r12.f18286z = r13;
    L_0x0190:
        r12.m22173e();
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.m4b.maps.bv.q.<init>(com.google.android.m4b.maps.ar.a):void");
    }

    /* renamed from: e */
    private void m22173e() {
        this.f18259C = bp.m23007o(this.f18281u);
        if (this.f18259C < 0.0f) {
            this.f18259C += 6.2831855f;
        }
        this.f18257A = bp.m23007o(this.f18282v);
        this.f18258B = bp.m22988a(this.f18265e, this.f18266f, this.f18267g, this.f18268h);
        this.f18279s = new ArrayList();
        switch (this.f18278r) {
            case 0:
                this.f18279s.add(new C4946s(this.f18269i, 0, 0, -1, 0));
                return;
            case 1:
                this.f18279s.add(new C4946s(this.f18269i, 0, 0, 1, 0));
                this.f18279s.add(new C4946s(this.f18269i, 0, 0, 2, 0));
                this.f18279s.add(new C4946s(this.f18269i, 0, 0, 3, 0));
                this.f18279s.add(new C4946s(this.f18269i, 0, 0, 4, 0));
                this.f18279s.add(new C4946s(this.f18269i, 0, 0, 5, 0));
                this.f18279s.add(new C4946s(this.f18269i, 0, 0, 6, 0));
                return;
            default:
                throw new IllegalStateException("Unrecognized projection type.");
        }
    }

    public final String toString() {
        String str = this.f18269i;
        String str2 = this.f18273m;
        StringBuilder stringBuilder = new StringBuilder((String.valueOf(str).length() + 8) + String.valueOf(str2).length());
        stringBuilder.append(str);
        stringBuilder.append(" text=\"");
        stringBuilder.append(str2);
        stringBuilder.append("\"");
        return stringBuilder.toString();
    }

    /* renamed from: a */
    public static String m22172a(String str) {
        if (str == null) {
            return null;
        }
        String str2 = "config_";
        str = String.valueOf(str);
        return str.length() != 0 ? str2.concat(str) : new String(str2);
    }

    /* renamed from: b */
    public final boolean m22177b() {
        return (this.f18263c & 64) != 0;
    }

    /* renamed from: c */
    public final boolean m22178c() {
        return (this.f18263c & 65) != 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(6);
        parcel.writeInt(this.f18262b);
        parcel.writeInt(this.f18263c);
        parcel.writeInt(this.f18265e);
        parcel.writeInt(this.f18266f);
        parcel.writeInt(this.f18267g);
        parcel.writeInt(this.f18268h);
        parcel.writeString(this.f18269i);
        parcel.writeInt(C4754b.m21092a(this.f18270j.latitude));
        parcel.writeInt(C4754b.m21092a(this.f18270j.longitude));
        parcel.writeInt(this.f18271k);
        parcel.writeString(this.f18272l);
        parcel.writeString(this.f18273m);
        parcel.writeString(this.f18274n);
        parcel.writeInt(this.f18275o);
        parcel.writeInt(this.f18278r);
        parcel.writeFloat(this.f18280t);
        parcel.writeFloat(this.f18281u);
        parcel.writeFloat(this.f18282v);
        parcel.writeFloat(this.f18283w);
        parcel.writeFloat(this.f18284x);
        parcel.writeTypedArray(this.f18285y, i);
        parcel.writeLong(this.f18261E);
        if (this.f18286z != 0) {
            parcel.writeByteArray(this.f18286z.m22068c());
            parcel.writeByteArray(this.f18286z.m22069d());
            return;
        }
        parcel.writeByteArray(new byte[0]);
        parcel.writeByteArray(new byte[0]);
    }

    /* renamed from: d */
    public final float[] m22179d() {
        if (this.f18260D == null) {
            this.f18260D = new float[16];
            float f = this.f18281u - this.f18280t;
            Matrix.setRotateM(this.f18260D, 0, f, 0.0f, 1.0f, 0.0f);
            Matrix.rotateM(this.f18260D, 0, this.f18282v, 1.0f, 0.0f, 0.0f);
            Matrix.rotateM(this.f18260D, 0, -f, 0.0f, 1.0f, 0.0f);
        }
        return this.f18260D;
    }

    /* renamed from: a */
    public final void m22175a(float f, float f2, float[] fArr) {
        fArr[0] = (f - bp.m23004l(this.f18280t)) - 0.5f;
        fArr[1] = f2 - (((float) Math.cos((double) (bp.m23003k(f) - bp.m23007o(this.f18281u)))) * bp.m23002j(this.f18257A));
    }

    /* renamed from: a */
    public final void m22174a(float f, float f2, float f3, float[] fArr) {
        r0 = new float[4];
        int i = 0;
        r0[0] = f;
        r0[1] = f2;
        r0[2] = f3;
        r0[3] = 1.0f;
        f2 = new float[16];
        float[] fArr2 = f2;
        Matrix.setRotateM(fArr2, 0, this.f18280t + 180.0f, 0.0f, 1.0f, 0.0f);
        float[] fArr3 = f2;
        Matrix.multiplyMM(fArr2, 0, fArr3, 0, m22179d(), 0);
        Matrix.multiplyMV(r0, 0, fArr3, 0, r0, 0);
        while (i < 3) {
            fArr[i] = r0[i];
            i++;
        }
    }

    /* renamed from: a */
    public static int m22170a(C4948t[] c4948tArr, float f, float f2) {
        f2 = Float.NaN;
        if (c4948tArr != null) {
            int length = c4948tArr.length;
            float f3 = 120.0f;
            for (int i = 0; i < length; i++) {
                float a = bp.m22983a(f - c4948tArr[i].f18294a);
                if (a > 180.0f) {
                    a = 360.0f - a;
                }
                if (a < f3) {
                    f2 = i;
                    f3 = a;
                }
            }
        }
        return f2;
    }

    /* renamed from: a */
    private static int m22169a(C4662a c4662a, int i, int i2, int i3) {
        c4662a = c4662a.m20835d(i);
        if (c4662a < i2) {
            return i2;
        }
        return c4662a > i3 ? i3 : c4662a;
    }

    /* renamed from: a */
    private static float m22168a(C4662a c4662a, int i, int i2) {
        c4662a = C4944q.m22169a(c4662a, i, -90000000, 90000000);
        if (c4662a == null) {
            c4662a = i2;
        }
        return ((float) c4662a) * 897988541;
    }

    /* renamed from: a */
    public static float m22167a(int i) {
        return ((float) (i % 360000000)) * 897988541;
    }

    /* renamed from: a */
    public final boolean m22176a() {
        return System.currentTimeMillis() - this.f18261E > f18256a;
    }
}
