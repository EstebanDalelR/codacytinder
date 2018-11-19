package com.google.android.m4b.maps.ar;

import com.google.android.m4b.maps.ap.C4654b;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.zip.GZIPInputStream;

/* renamed from: com.google.android.m4b.maps.ar.c */
public final class C4665c {
    /* renamed from: a */
    private static boolean f17111a = false;

    /* renamed from: a */
    public static int m20854a(com.google.android.m4b.maps.ar.C4662a r1, int r2, int r3) {
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
        if (r1 == 0) goto L_0x000f;
    L_0x0002:
        r0 = r1.m20845j(r2);	 Catch:{ IllegalArgumentException -> 0x000e, ClassCastException -> 0x000d }
        if (r0 == 0) goto L_0x000f;	 Catch:{ IllegalArgumentException -> 0x000e, ClassCastException -> 0x000d }
    L_0x0008:
        r1 = r1.m20835d(r2);	 Catch:{ IllegalArgumentException -> 0x000e, ClassCastException -> 0x000d }
        return r1;
    L_0x000d:
        return r3;
    L_0x000e:
        return r3;
    L_0x000f:
        return r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.m4b.maps.ar.c.a(com.google.android.m4b.maps.ar.a, int, int):int");
    }

    /* renamed from: a */
    public static long m20856a(com.google.android.m4b.maps.ar.C4662a r1, int r2, long r3) {
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
        if (r1 == 0) goto L_0x0010;
    L_0x0002:
        r2 = 3;
        r0 = r1.m20845j(r2);	 Catch:{ IllegalArgumentException -> 0x000f, ClassCastException -> 0x000e }
        if (r0 == 0) goto L_0x0010;	 Catch:{ IllegalArgumentException -> 0x000f, ClassCastException -> 0x000e }
    L_0x0009:
        r1 = r1.m20838e(r2);	 Catch:{ IllegalArgumentException -> 0x000f, ClassCastException -> 0x000e }
        return r1;
    L_0x000e:
        return r3;
    L_0x000f:
        return r3;
    L_0x0010:
        return r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.m4b.maps.ar.c.a(com.google.android.m4b.maps.ar.a, int, long):long");
    }

    /* renamed from: a */
    public static int m20853a(C4662a c4662a, int i) {
        return C4665c.m20854a(c4662a, i, 0);
    }

    /* renamed from: a */
    public static InputStream m20859a(DataInput dataInput) {
        int readInt = dataInput.readInt();
        InputStream c4654b = new C4654b((InputStream) dataInput, Math.abs(readInt));
        if (readInt >= 0) {
            return c4654b;
        }
        f17111a = true;
        return new GZIPInputStream(c4654b);
    }

    /* renamed from: a */
    public static int m20855a(C4664b c4664b, InputStream inputStream, C4662a c4662a) {
        long a = C4662a.m20795a(inputStream, true);
        if (a == -1) {
            return -1;
        }
        if ((a & 7) != 2) {
            throw new IOException("Message expected");
        }
        int i = (int) (a >>> 3);
        c4662a.m20817a((C4664b) c4664b.m20852b(i));
        c4662a.m20811a(inputStream, (int) C4662a.m20795a(inputStream, (boolean) null));
        return i;
    }

    /* renamed from: a */
    public static C4662a m20858a(C4664b c4664b, DataInput dataInput) {
        C4662a c4662a = new C4662a(c4664b);
        InputStream a = C4665c.m20859a(dataInput);
        c4662a.m20818a(a);
        if (a.read() != -1) {
            throw new IOException();
        }
        a.close();
        return c4662a;
    }

    /* renamed from: b */
    public static C4662a m20861b(C4662a c4662a, int i) {
        C4662a a = c4662a.m20813a(i);
        c4662a.m20827b(i, a);
        return a;
    }

    /* renamed from: c */
    public static C4662a m20863c(C4662a c4662a, int i) {
        C4662a a = c4662a.m20813a(i);
        c4662a.m20821a(i, a);
        return a;
    }

    /* renamed from: a */
    public static void m20860a(DataOutput dataOutput, C4662a c4662a) {
        OutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        c4662a.m20830b(byteArrayOutputStream);
        c4662a = byteArrayOutputStream.toByteArray();
        dataOutput.writeInt(c4662a.length);
        dataOutput.write(c4662a);
    }

    /* renamed from: a */
    public static C4662a m20857a(C4662a c4662a) {
        C4662a c4662a2 = new C4662a(c4662a.m20829b());
        c4662a2.m20819a(c4662a.m20837d());
        return c4662a2;
    }

    /* renamed from: b */
    public static DataInput m20862b(C4662a c4662a) {
        OutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        C4665c.m20860a(new DataOutputStream(byteArrayOutputStream), c4662a);
        return new DataInputStream(new ByteArrayInputStream(byteArrayOutputStream.toByteArray()));
    }
}
