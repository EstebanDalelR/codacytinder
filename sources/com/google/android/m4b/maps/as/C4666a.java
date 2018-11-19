package com.google.android.m4b.maps.as;

import com.tinder.domain.config.model.ProfileEditingConfig;
import java.io.DataInput;
import java.io.EOFException;
import java.io.UTFDataFormatException;

/* renamed from: com.google.android.m4b.maps.as.a */
public final class C4666a implements DataInput {
    /* renamed from: a */
    private byte[] f17112a;
    /* renamed from: b */
    private int f17113b = this.f17112a.length;
    /* renamed from: c */
    private int f17114c = null;
    /* renamed from: d */
    private char[] f17115d = new char[128];

    public C4666a(byte[] bArr) {
        this.f17112a = bArr;
    }

    /* renamed from: a */
    public final int m20865a() {
        return this.f17114c;
    }

    public final boolean readBoolean() {
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
        r3 = this;
        r0 = r3.f17112a;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0010 }
        r1 = r3.f17114c;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0010 }
        r2 = r1 + 1;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0010 }
        r3.f17114c = r2;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0010 }
        r0 = r0[r1];	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0010 }
        if (r0 == 0) goto L_0x000e;
    L_0x000c:
        r0 = 1;
        return r0;
    L_0x000e:
        r0 = 0;
        return r0;
    L_0x0010:
        r0 = new java.io.EOFException;
        r0.<init>();
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.m4b.maps.as.a.readBoolean():boolean");
    }

    public final byte readByte() {
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
        r3 = this;
        r0 = r3.f17112a;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x000b }
        r1 = r3.f17114c;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x000b }
        r2 = r1 + 1;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x000b }
        r3.f17114c = r2;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x000b }
        r0 = r0[r1];	 Catch:{ ArrayIndexOutOfBoundsException -> 0x000b }
        return r0;
    L_0x000b:
        r0 = new java.io.EOFException;
        r0.<init>();
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.m4b.maps.as.a.readByte():byte");
    }

    public final char readChar() {
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
        r4 = this;
        r0 = r4.f17112a;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x001b }
        r1 = r4.f17114c;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x001b }
        r2 = r1 + 1;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x001b }
        r4.f17114c = r2;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x001b }
        r0 = r0[r1];	 Catch:{ ArrayIndexOutOfBoundsException -> 0x001b }
        r1 = r4.f17112a;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x001b }
        r2 = r4.f17114c;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x001b }
        r3 = r2 + 1;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x001b }
        r4.f17114c = r3;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x001b }
        r1 = r1[r2];	 Catch:{ ArrayIndexOutOfBoundsException -> 0x001b }
        r1 = r1 & 255;
        r0 = r0 << 8;
        r0 = r0 | r1;
        r0 = (char) r0;
        return r0;
    L_0x001b:
        r0 = new java.io.EOFException;
        r0.<init>();
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.m4b.maps.as.a.readChar():char");
    }

    public final double readDouble() {
        return Double.longBitsToDouble(readLong());
    }

    public final float readFloat() {
        return Float.intBitsToFloat(readInt());
    }

    public final void readFully(byte[] bArr) {
        readFully(bArr, 0, bArr.length);
    }

    public final void readFully(byte[] bArr, int i, int i2) {
        if (i2 != 0) {
            if (i + i2 > bArr.length) {
                throw new IndexOutOfBoundsException();
            } else if (i2 > this.f17113b - this.f17114c) {
                this.f17114c = this.f17113b;
                throw new EOFException();
            } else {
                System.arraycopy(this.f17112a, this.f17114c, bArr, i, i2);
                this.f17114c += i2;
            }
        }
    }

    public final int readInt() {
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
        r6 = this;
        r0 = r6.f17112a;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x003a }
        r1 = r6.f17114c;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x003a }
        r2 = r1 + 1;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x003a }
        r6.f17114c = r2;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x003a }
        r0 = r0[r1];	 Catch:{ ArrayIndexOutOfBoundsException -> 0x003a }
        r0 = r0 & 255;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x003a }
        r1 = r6.f17112a;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x003a }
        r2 = r6.f17114c;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x003a }
        r3 = r2 + 1;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x003a }
        r6.f17114c = r3;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x003a }
        r1 = r1[r2];	 Catch:{ ArrayIndexOutOfBoundsException -> 0x003a }
        r1 = r1 & 255;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x003a }
        r2 = r6.f17112a;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x003a }
        r3 = r6.f17114c;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x003a }
        r4 = r3 + 1;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x003a }
        r6.f17114c = r4;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x003a }
        r2 = r2[r3];	 Catch:{ ArrayIndexOutOfBoundsException -> 0x003a }
        r2 = r2 & 255;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x003a }
        r3 = r6.f17112a;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x003a }
        r4 = r6.f17114c;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x003a }
        r5 = r4 + 1;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x003a }
        r6.f17114c = r5;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x003a }
        r3 = r3[r4];	 Catch:{ ArrayIndexOutOfBoundsException -> 0x003a }
        r3 = r3 & 255;
        r0 = r0 << 24;
        r1 = r1 << 16;
        r0 = r0 | r1;
        r1 = r2 << 8;
        r0 = r0 | r1;
        r0 = r0 | r3;
        return r0;
    L_0x003a:
        r0 = new java.io.EOFException;
        r0.<init>();
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.m4b.maps.as.a.readInt():int");
    }

    public final String readLine() {
        if (this.f17114c >= this.f17113b) {
            return null;
        }
        StringBuilder stringBuilder = new StringBuilder();
        do {
            byte[] bArr = this.f17112a;
            int i = this.f17114c;
            this.f17114c = i + 1;
            char c = (char) bArr[i];
            if (c == '\n') {
                return stringBuilder.toString();
            }
            if (c == '\r') {
                if (this.f17114c < this.f17113b && this.f17112a[this.f17114c] == (byte) 10) {
                    this.f17114c++;
                }
                return stringBuilder.toString();
            }
            stringBuilder.append(c);
        } while (this.f17114c != this.f17113b);
        return stringBuilder.toString();
    }

    public final long readLong() {
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
        r20 = this;
        r0 = r20;
        r1 = r0.f17112a;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0095 }
        r2 = r0.f17114c;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0095 }
        r3 = r2 + 1;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0095 }
        r0.f17114c = r3;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0095 }
        r1 = r1[r2];	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0095 }
        r1 = r1 & 255;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0095 }
        r1 = (long) r1;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0095 }
        r3 = r0.f17112a;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0095 }
        r4 = r0.f17114c;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0095 }
        r5 = r4 + 1;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0095 }
        r0.f17114c = r5;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0095 }
        r3 = r3[r4];	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0095 }
        r3 = r3 & 255;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0095 }
        r3 = (long) r3;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0095 }
        r5 = r0.f17112a;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0095 }
        r6 = r0.f17114c;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0095 }
        r7 = r6 + 1;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0095 }
        r0.f17114c = r7;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0095 }
        r5 = r5[r6];	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0095 }
        r5 = r5 & 255;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0095 }
        r5 = (long) r5;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0095 }
        r7 = r0.f17112a;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0095 }
        r8 = r0.f17114c;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0095 }
        r9 = r8 + 1;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0095 }
        r0.f17114c = r9;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0095 }
        r7 = r7[r8];	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0095 }
        r7 = r7 & 255;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0095 }
        r7 = (long) r7;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0095 }
        r9 = r0.f17112a;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0095 }
        r10 = r0.f17114c;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0095 }
        r11 = r10 + 1;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0095 }
        r0.f17114c = r11;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0095 }
        r9 = r9[r10];	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0095 }
        r9 = r9 & 255;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0095 }
        r9 = (long) r9;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0095 }
        r11 = r0.f17112a;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0095 }
        r12 = r0.f17114c;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0095 }
        r13 = r12 + 1;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0095 }
        r0.f17114c = r13;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0095 }
        r11 = r11[r12];	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0095 }
        r11 = r11 & 255;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0095 }
        r11 = (long) r11;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0095 }
        r13 = r0.f17112a;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0095 }
        r14 = r0.f17114c;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0095 }
        r15 = r14 + 1;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0095 }
        r0.f17114c = r15;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0095 }
        r13 = r13[r14];	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0095 }
        r13 = r13 & 255;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0095 }
        r13 = (long) r13;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0095 }
        r15 = r0.f17112a;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0095 }
        r16 = r13;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0095 }
        r13 = r0.f17114c;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0095 }
        r14 = r13 + 1;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0095 }
        r0.f17114c = r14;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0095 }
        r13 = r15[r13];	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0095 }
        r13 = r13 & 255;
        r13 = (long) r13;
        r15 = 56;
        r1 = r1 << r15;
        r15 = 48;
        r3 = r3 << r15;
        r18 = r1 | r3;
        r1 = 40;
        r1 = r5 << r1;
        r3 = r18 | r1;
        r1 = 32;
        r1 = r7 << r1;
        r5 = r3 | r1;
        r1 = 24;
        r1 = r9 << r1;
        r3 = r5 | r1;
        r1 = 16;
        r1 = r11 << r1;
        r5 = r3 | r1;
        r1 = 8;
        r1 = r16 << r1;
        r3 = r5 | r1;
        r1 = r3 | r13;
        return r1;
    L_0x0095:
        r1 = new java.io.EOFException;
        r1.<init>();
        throw r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.m4b.maps.as.a.readLong():long");
    }

    public final short readShort() {
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
        r4 = this;
        r0 = r4.f17112a;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x001b }
        r1 = r4.f17114c;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x001b }
        r2 = r1 + 1;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x001b }
        r4.f17114c = r2;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x001b }
        r0 = r0[r1];	 Catch:{ ArrayIndexOutOfBoundsException -> 0x001b }
        r1 = r4.f17112a;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x001b }
        r2 = r4.f17114c;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x001b }
        r3 = r2 + 1;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x001b }
        r4.f17114c = r3;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x001b }
        r1 = r1[r2];	 Catch:{ ArrayIndexOutOfBoundsException -> 0x001b }
        r1 = r1 & 255;
        r0 = r0 << 8;
        r0 = r0 | r1;
        r0 = (short) r0;
        return r0;
    L_0x001b:
        r0 = new java.io.EOFException;
        r0.<init>();
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.m4b.maps.as.a.readShort():short");
    }

    public final String readUTF() {
        int readUnsignedShort = readUnsignedShort();
        if (readUnsignedShort == 0) {
            return "";
        }
        if (readUnsignedShort > this.f17113b - this.f17114c) {
            this.f17114c = this.f17113b;
            throw new EOFException();
        }
        if (readUnsignedShort > this.f17115d.length) {
            this.f17115d = new char[readUnsignedShort];
        }
        String a = C4666a.m20864a(this.f17112a, this.f17115d, this.f17114c, readUnsignedShort);
        this.f17114c += readUnsignedShort;
        return a;
    }

    public final int readUnsignedByte() {
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
        r3 = this;
        r0 = r3.f17112a;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x000d }
        r1 = r3.f17114c;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x000d }
        r2 = r1 + 1;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x000d }
        r3.f17114c = r2;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x000d }
        r0 = r0[r1];	 Catch:{ ArrayIndexOutOfBoundsException -> 0x000d }
        r0 = r0 & 255;
        return r0;
    L_0x000d:
        r0 = new java.io.EOFException;
        r0.<init>();
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.m4b.maps.as.a.readUnsignedByte():int");
    }

    public final int readUnsignedShort() {
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
        r4 = this;
        r0 = r4.f17112a;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x001c }
        r1 = r4.f17114c;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x001c }
        r2 = r1 + 1;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x001c }
        r4.f17114c = r2;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x001c }
        r0 = r0[r1];	 Catch:{ ArrayIndexOutOfBoundsException -> 0x001c }
        r0 = r0 & 255;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x001c }
        r1 = r4.f17112a;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x001c }
        r2 = r4.f17114c;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x001c }
        r3 = r2 + 1;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x001c }
        r4.f17114c = r3;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x001c }
        r1 = r1[r2];	 Catch:{ ArrayIndexOutOfBoundsException -> 0x001c }
        r1 = r1 & 255;
        r0 = r0 << 8;
        r0 = r0 | r1;
        return r0;
    L_0x001c:
        r0 = new java.io.EOFException;
        r0.<init>();
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.m4b.maps.as.a.readUnsignedShort():int");
    }

    public final int skipBytes(int i) {
        if (i > this.f17113b - this.f17114c) {
            i = this.f17113b - this.f17114c;
        }
        this.f17114c += i;
        return i;
    }

    /* renamed from: a */
    private static String m20864a(byte[] bArr, char[] cArr, int i, int i2) {
        int i3 = 0;
        int i4 = 0;
        while (i3 < i2) {
            int i5 = i3 + 1;
            char c = (char) bArr[i3 + i];
            cArr[i4] = c;
            if (c < '') {
                i4++;
                i3 = i5;
            } else {
                int i6;
                int i7;
                c = cArr[i4];
                byte b;
                if ((c & 224) == 192) {
                    if (i5 >= i2) {
                        cArr = new StringBuilder(60);
                        cArr.append("Second byte at ");
                        cArr.append(i5);
                        cArr.append(" does not match UTF8 Specification");
                        throw new UTFDataFormatException(cArr.toString());
                    }
                    i6 = i5 + 1;
                    b = bArr[i5 + i];
                    if ((b & 192) != ProfileEditingConfig.DEFAULT_MAX_LENGTH) {
                        i6--;
                        cArr = new StringBuilder(60);
                        cArr.append("Second byte at ");
                        cArr.append(i6);
                        cArr.append(" does not match UTF8 Specification");
                        throw new UTFDataFormatException(cArr.toString());
                    }
                    i7 = i4 + 1;
                    cArr[i4] = (char) (((c & 31) << 6) | (b & 63));
                } else if ((c & 240) == 224) {
                    int i8 = i5 + 1;
                    if (i8 >= i2) {
                        cArr = new StringBuilder(59);
                        cArr.append("Third byte at ");
                        cArr.append(i8);
                        cArr.append(" does not match UTF8 Specification");
                        throw new UTFDataFormatException(cArr.toString());
                    }
                    b = bArr[i5 + i];
                    i6 = i8 + 1;
                    byte b2 = bArr[i8 + i];
                    if ((b & 192) == ProfileEditingConfig.DEFAULT_MAX_LENGTH) {
                        if ((b2 & 192) == ProfileEditingConfig.DEFAULT_MAX_LENGTH) {
                            i7 = i4 + 1;
                            cArr[i4] = (char) ((((c & 15) << 12) | ((b & 63) << 6)) | (b2 & 63));
                        }
                    }
                    i6 -= 2;
                    cArr = new StringBuilder(69);
                    cArr.append("Second or third byte at ");
                    cArr.append(i6);
                    cArr.append(" does not match UTF8 Specification");
                    throw new UTFDataFormatException(cArr.toString());
                } else {
                    i5--;
                    cArr = new StringBuilder(54);
                    cArr.append("Input at ");
                    cArr.append(i5);
                    cArr.append(" does not match UTF8 Specification");
                    throw new UTFDataFormatException(cArr.toString());
                }
                i4 = i7;
                i3 = i6;
            }
        }
        return new String(cArr, 0, i4);
    }
}
