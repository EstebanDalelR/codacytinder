package org.objectweb.asm;

import android.support.v7.widget.RecyclerView.ItemAnimator;
import com.tinder.domain.config.model.ProfileEditingConfig;

/* renamed from: org.objectweb.asm.p */
public class C19346p {
    /* renamed from: a */
    int f60374a;
    /* renamed from: b */
    int f60375b;
    /* renamed from: c */
    int f60376c;
    /* renamed from: d */
    int f60377d;
    /* renamed from: e */
    int f60378e;
    /* renamed from: f */
    C19342l f60379f;
    /* renamed from: g */
    C19346p f60380g;
    /* renamed from: h */
    C19340i f60381h;
    /* renamed from: i */
    C19346p f60382i;
    /* renamed from: j */
    private int f60383j;
    /* renamed from: k */
    private int[] f60384k;

    /* renamed from: a */
    private void m69424a(int i, int i2) {
        if (this.f60384k == null) {
            this.f60384k = new int[6];
        }
        if (this.f60383j >= this.f60384k.length) {
            Object obj = new int[(this.f60384k.length + 6)];
            System.arraycopy(this.f60384k, 0, obj, 0, this.f60384k.length);
            this.f60384k = obj;
        }
        int[] iArr = this.f60384k;
        int i3 = this.f60383j;
        this.f60383j = i3 + 1;
        iArr[i3] = i;
        int[] iArr2 = this.f60384k;
        int i4 = this.f60383j;
        this.f60383j = i4 + 1;
        iArr2[i4] = i2;
    }

    /* renamed from: a */
    C19346p m69425a() {
        return this.f60379f == null ? this : this.f60379f.f60347b;
    }

    /* renamed from: a */
    void m69426a(long j, int i) {
        if ((this.f60374a & 1024) == 0) {
            this.f60374a |= 1024;
            this.f60384k = new int[((i / 32) + 1)];
        }
        int[] iArr = this.f60384k;
        int i2 = (int) (j >>> 32);
        iArr[i2] = ((int) j) | iArr[i2];
    }

    /* renamed from: a */
    void m69427a(C19346p c19346p, long j, int i) {
        C19346p c19346p2 = this;
        while (c19346p2 != null) {
            C19346p c19346p3 = c19346p2.f60382i;
            c19346p2.f60382i = null;
            C19340i c19340i;
            if (c19346p != null) {
                if ((c19346p2.f60374a & ItemAnimator.FLAG_MOVED) == 0) {
                    c19346p2.f60374a |= ItemAnimator.FLAG_MOVED;
                    if (!((c19346p2.f60374a & 256) == 0 || c19346p2.m69430a(c19346p))) {
                        c19340i = new C19340i();
                        c19340i.f60341a = c19346p2.f60377d;
                        c19340i.f60342b = c19346p.f60381h.f60342b;
                        c19340i.f60343c = c19346p2.f60381h;
                        c19346p2.f60381h = c19340i;
                    }
                    c19340i = c19346p2.f60381h;
                    while (c19340i != null) {
                        if (((c19346p2.f60374a & ProfileEditingConfig.DEFAULT_MAX_LENGTH) == 0 || c19340i != c19346p2.f60381h.f60343c) && c19340i.f60342b.f60382i == null) {
                            c19340i.f60342b.f60382i = c19346p3;
                            c19346p3 = c19340i.f60342b;
                        }
                        c19340i = c19340i.f60343c;
                    }
                }
            } else if (!c19346p2.m69429a(j)) {
                c19346p2.m69426a(j, i);
                c19340i = c19346p2.f60381h;
                while (c19340i != null) {
                    c19340i.f60342b.f60382i = c19346p3;
                    c19346p3 = c19340i.f60342b;
                    c19340i = c19340i.f60343c;
                }
            }
            c19346p2 = c19346p3;
        }
    }

    /* renamed from: a */
    void m69428a(org.objectweb.asm.C19508r r1, org.objectweb.asm.C19336d r2, int r3, boolean r4) {
        /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:13:0x0027 in {4, 6, 7, 9, 11, 12} preds:[]
	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.computeDominators(BlockProcessor.java:129)
	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.processBlocksTree(BlockProcessor.java:48)
	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.visit(BlockProcessor.java:38)
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
        r0 = this;
        r1 = r0.f60374a;
        r1 = r1 & 2;
        if (r1 != 0) goto L_0x001d;
    L_0x0006:
        r1 = -1;
        if (r4 == 0) goto L_0x0014;
    L_0x0009:
        r3 = -1 - r3;
        r4 = r2.f60313b;
        r0.m69424a(r3, r4);
    L_0x0010:
        r2.m69360c(r1);
        return;
    L_0x0014:
        r4 = r2.f60313b;
        r0.m69424a(r3, r4);
    L_0x0019:
        r2.m69358b(r1);
        return;
    L_0x001d:
        if (r4 == 0) goto L_0x0023;
    L_0x001f:
        r1 = r0.f60376c;
        r1 = r1 - r3;
        goto L_0x0010;
    L_0x0023:
        r1 = r0.f60376c;
        r1 = r1 - r3;
        goto L_0x0019;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.objectweb.asm.p.a(org.objectweb.asm.r, org.objectweb.asm.d, int, boolean):void");
    }

    /* renamed from: a */
    boolean m69429a(long j) {
        if ((this.f60374a & 1024) == 0) {
            return false;
        }
        return (((int) j) & this.f60384k[(int) (j >>> 32)]) != 0;
    }

    /* renamed from: a */
    boolean m69430a(C19346p c19346p) {
        if ((this.f60374a & 1024) == 0 || (c19346p.f60374a & 1024) == 0) {
            return false;
        }
        for (int i = 0; i < this.f60384k.length; i++) {
            if ((this.f60384k[i] & c19346p.f60384k[i]) != 0) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    boolean m69431a(C19508r c19508r, int i, byte[] bArr) {
        this.f60374a |= 2;
        this.f60376c = i;
        int i2 = 0;
        boolean z = false;
        while (i2 < this.f60383j) {
            int i3 = i2 + 1;
            i2 = this.f60384k[i2];
            int i4 = i3 + 1;
            int i5 = this.f60384k[i3];
            if (i2 >= 0) {
                i2 = i - i2;
                if (i2 < -32768 || i2 > 32767) {
                    int i6 = i5 - 1;
                    int i7 = bArr[i6] & 255;
                    if (i7 <= 168) {
                        bArr[i6] = (byte) (i7 + 49);
                    } else {
                        bArr[i6] = (byte) (i7 + 20);
                    }
                    z = true;
                }
                i3 = i5 + 1;
                bArr[i5] = (byte) (i2 >>> 8);
                bArr[i3] = (byte) i2;
            } else {
                i2 = (i2 + i) + 1;
                i3 = i5 + 1;
                bArr[i5] = (byte) (i2 >>> 24);
                i5 = i3 + 1;
                bArr[i3] = (byte) (i2 >>> 16);
                i3 = i5 + 1;
                bArr[i5] = (byte) (i2 >>> 8);
                bArr[i3] = (byte) i2;
            }
            i2 = i4;
        }
        return z;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("L");
        stringBuffer.append(System.identityHashCode(this));
        return stringBuffer.toString();
    }
}
