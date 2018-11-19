package okhttp3.internal.publicsuffix;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.net.IDN;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import okhttp3.internal.C15908c;
import okio.C15976k;
import okio.C17707i;

public final class PublicSuffixDatabase {
    /* renamed from: a */
    private static final byte[] f49458a = new byte[]{(byte) 42};
    /* renamed from: b */
    private static final String[] f49459b = new String[0];
    /* renamed from: c */
    private static final String[] f49460c = new String[]{"*"};
    /* renamed from: d */
    private static final PublicSuffixDatabase f49461d = new PublicSuffixDatabase();
    /* renamed from: e */
    private final AtomicBoolean f49462e = new AtomicBoolean(false);
    /* renamed from: f */
    private final CountDownLatch f49463f = new CountDownLatch(1);
    /* renamed from: g */
    private byte[] f49464g;
    /* renamed from: h */
    private byte[] f49465h;

    /* renamed from: a */
    public static PublicSuffixDatabase m60426a() {
        return f49461d;
    }

    /* renamed from: a */
    public String m60430a(String str) {
        if (str == null) {
            throw new NullPointerException("domain == null");
        }
        String[] split = IDN.toUnicode(str).split("\\.");
        String[] a = m60427a(split);
        if (split.length == a.length && a[0].charAt(0) != '!') {
            return null;
        }
        int length;
        if (a[0].charAt(0) == '!') {
            length = split.length - a.length;
        } else {
            length = split.length - (a.length + 1);
        }
        StringBuilder stringBuilder = new StringBuilder();
        str = str.split("\\.");
        for (length = 
/*
Method generation error in method: okhttp3.internal.publicsuffix.PublicSuffixDatabase.a(java.lang.String):java.lang.String, dex: classes4.dex
jadx.core.utils.exceptions.CodegenException: Error generate insn: PHI: (r0_7 'length' int) = (r0_4 'length' int), (r0_6 'length' int) binds: {(r0_6 'length' int)=B:12:0x0035, (r0_4 'length' int)=B:11:0x0031} in method: okhttp3.internal.publicsuffix.PublicSuffixDatabase.a(java.lang.String):java.lang.String, dex: classes4.dex
	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:226)
	at jadx.core.codegen.RegionGen.makeLoop(RegionGen.java:184)
	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:61)
	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:87)
	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:53)
	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:87)
	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:53)
	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:87)
	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:53)
	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:87)
	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:53)
	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:87)
	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:53)
	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:187)
	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:320)
	at jadx.core.codegen.ClassGen.addMethods(ClassGen.java:257)
	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:220)
	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:110)
	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:75)
	at jadx.core.codegen.CodeGen.visit(CodeGen.java:12)
	at jadx.core.ProcessClass.process(ProcessClass.java:40)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
Caused by: jadx.core.utils.exceptions.CodegenException: PHI can be used only in fallback mode
	at jadx.core.codegen.InsnGen.fallbackOnlyInsn(InsnGen.java:537)
	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:509)
	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:220)
	... 24 more

*/

        /* renamed from: a */
        private java.lang.String[] m60427a(java.lang.String[] r8) {
            /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
            /*
            r7 = this;
            r0 = r7.f49462e;
            r0 = r0.get();
            r1 = 0;
            r2 = 1;
            if (r0 != 0) goto L_0x0016;
        L_0x000a:
            r0 = r7.f49462e;
            r0 = r0.compareAndSet(r1, r2);
            if (r0 == 0) goto L_0x0016;
        L_0x0012:
            r7.m60428b();
            goto L_0x001b;
        L_0x0016:
            r0 = r7.f49463f;	 Catch:{ InterruptedException -> 0x001b }
            r0.await();	 Catch:{ InterruptedException -> 0x001b }
        L_0x001b:
            monitor-enter(r7);
            r0 = r7.f49464g;	 Catch:{ all -> 0x00bf }
            if (r0 != 0) goto L_0x0028;	 Catch:{ all -> 0x00bf }
        L_0x0020:
            r8 = new java.lang.IllegalStateException;	 Catch:{ all -> 0x00bf }
            r0 = "Unable to load publicsuffixes.gz resource from the classpath.";	 Catch:{ all -> 0x00bf }
            r8.<init>(r0);	 Catch:{ all -> 0x00bf }
            throw r8;	 Catch:{ all -> 0x00bf }
        L_0x0028:
            monitor-exit(r7);	 Catch:{ all -> 0x00bf }
            r0 = r8.length;
            r0 = new byte[r0][];
            r3 = 0;
        L_0x002d:
            r4 = r8.length;
            if (r3 >= r4) goto L_0x003d;
        L_0x0030:
            r4 = r8[r3];
            r5 = okhttp3.internal.C15908c.f49249e;
            r4 = r4.getBytes(r5);
            r0[r3] = r4;
            r3 = r3 + 1;
            goto L_0x002d;
        L_0x003d:
            r8 = 0;
        L_0x003e:
            r3 = r0.length;
            r4 = 0;
            if (r8 >= r3) goto L_0x004e;
        L_0x0042:
            r3 = r7.f49464g;
            r3 = m60425a(r3, r0, r8);
            if (r3 == 0) goto L_0x004b;
        L_0x004a:
            goto L_0x004f;
        L_0x004b:
            r8 = r8 + 1;
            goto L_0x003e;
        L_0x004e:
            r3 = r4;
        L_0x004f:
            r8 = r0.length;
            if (r8 <= r2) goto L_0x006d;
        L_0x0052:
            r8 = r0.clone();
            r8 = (byte[][]) r8;
            r5 = 0;
        L_0x0059:
            r6 = r8.length;
            r6 = r6 - r2;
            if (r5 >= r6) goto L_0x006d;
        L_0x005d:
            r6 = f49458a;
            r8[r5] = r6;
            r6 = r7.f49464g;
            r6 = m60425a(r6, r8, r5);
            if (r6 == 0) goto L_0x006a;
        L_0x0069:
            goto L_0x006e;
        L_0x006a:
            r5 = r5 + 1;
            goto L_0x0059;
        L_0x006d:
            r6 = r4;
        L_0x006e:
            if (r6 == 0) goto L_0x0080;
        L_0x0070:
            r8 = r0.length;
            r8 = r8 - r2;
            if (r1 >= r8) goto L_0x0080;
        L_0x0074:
            r8 = r7.f49465h;
            r8 = m60425a(r8, r0, r1);
            if (r8 == 0) goto L_0x007d;
        L_0x007c:
            goto L_0x0081;
        L_0x007d:
            r1 = r1 + 1;
            goto L_0x0070;
        L_0x0080:
            r8 = r4;
        L_0x0081:
            if (r8 == 0) goto L_0x009b;
        L_0x0083:
            r0 = new java.lang.StringBuilder;
            r0.<init>();
            r1 = "!";
            r0.append(r1);
            r0.append(r8);
            r8 = r0.toString();
            r0 = "\\.";
            r8 = r8.split(r0);
            return r8;
        L_0x009b:
            if (r3 != 0) goto L_0x00a2;
        L_0x009d:
            if (r6 != 0) goto L_0x00a2;
        L_0x009f:
            r8 = f49460c;
            return r8;
        L_0x00a2:
            if (r3 == 0) goto L_0x00ab;
        L_0x00a4:
            r8 = "\\.";
            r8 = r3.split(r8);
            goto L_0x00ad;
        L_0x00ab:
            r8 = f49459b;
        L_0x00ad:
            if (r6 == 0) goto L_0x00b6;
        L_0x00af:
            r0 = "\\.";
            r0 = r6.split(r0);
            goto L_0x00b8;
        L_0x00b6:
            r0 = f49459b;
        L_0x00b8:
            r1 = r8.length;
            r2 = r0.length;
            if (r1 <= r2) goto L_0x00bd;
        L_0x00bc:
            goto L_0x00be;
        L_0x00bd:
            r8 = r0;
        L_0x00be:
            return r8;
        L_0x00bf:
            r8 = move-exception;
            monitor-exit(r7);	 Catch:{ all -> 0x00bf }
            throw r8;
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.publicsuffix.PublicSuffixDatabase.a(java.lang.String[]):java.lang.String[]");
        }

        /* renamed from: a */
        private static String m60425a(byte[] bArr, byte[][] bArr2, int i) {
            byte[] bArr3 = bArr;
            byte[][] bArr4 = bArr2;
            int length = bArr3.length;
            int i2 = 0;
            while (i2 < length) {
                int i3;
                int i4 = (i2 + length) / 2;
                while (i4 > -1 && bArr3[i4] != (byte) 10) {
                    i4--;
                }
                i4++;
                int i5 = 1;
                while (true) {
                    i3 = i4 + i5;
                    if (bArr3[i3] == (byte) 10) {
                        break;
                    }
                    i5++;
                }
                int i6 = i3 - i4;
                int i7 = i;
                Object obj = null;
                int i8 = 0;
                int i9 = 0;
                while (true) {
                    int i10;
                    if (obj != null) {
                        obj = null;
                        i10 = 46;
                    } else {
                        i10 = bArr4[i7][i8] & 255;
                    }
                    i10 -= bArr3[i4 + i9] & 255;
                    if (i10 != 0) {
                        break;
                    }
                    i9++;
                    i8++;
                    if (i9 == i6) {
                        break;
                    } else if (bArr4[i7].length == i8) {
                        if (i7 == bArr4.length - 1) {
                            break;
                        }
                        i7++;
                        obj = 1;
                        i8 = -1;
                    }
                }
                if (i10 < 0) {
                    i4--;
                } else {
                    if (i10 > 0) {
                        i3++;
                    } else {
                        int i11 = i6 - i9;
                        int length2 = bArr4[i7].length - i8;
                        while (true) {
                            i7++;
                            if (i7 >= bArr4.length) {
                                break;
                            }
                            length2 += bArr4[i7].length;
                        }
                        if (length2 < i11) {
                            i4--;
                        } else if (length2 <= i11) {
                            return new String(bArr3, i4, i6, C15908c.f49249e);
                        } else {
                            i3++;
                        }
                    }
                    i2 = i3;
                }
                length = i4;
            }
            return null;
        }

        /* renamed from: b */
        private void m60428b() {
            /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
            /*
            r5 = this;
            r0 = 0;
        L_0x0001:
            r5.m60429c();	 Catch:{ InterruptedIOException -> 0x002f, IOException -> 0x0010 }
            if (r0 == 0) goto L_0x000d;
        L_0x0006:
            r0 = java.lang.Thread.currentThread();
            r0.interrupt();
        L_0x000d:
            return;
        L_0x000e:
            r1 = move-exception;
            goto L_0x0025;
        L_0x0010:
            r1 = move-exception;
            r2 = okhttp3.internal.p461b.C15904f.m60134c();	 Catch:{ all -> 0x000e }
            r3 = 5;	 Catch:{ all -> 0x000e }
            r4 = "Failed to read public suffix list";	 Catch:{ all -> 0x000e }
            r2.mo13338a(r3, r4, r1);	 Catch:{ all -> 0x000e }
            if (r0 == 0) goto L_0x0024;
        L_0x001d:
            r0 = java.lang.Thread.currentThread();
            r0.interrupt();
        L_0x0024:
            return;
        L_0x0025:
            if (r0 == 0) goto L_0x002e;
        L_0x0027:
            r0 = java.lang.Thread.currentThread();
            r0.interrupt();
        L_0x002e:
            throw r1;
        L_0x002f:
            r0 = 1;
            goto L_0x0001;
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.publicsuffix.PublicSuffixDatabase.b():void");
        }

        /* renamed from: c */
        private void m60429c() throws IOException {
            InputStream resourceAsStream = PublicSuffixDatabase.class.getResourceAsStream("publicsuffixes.gz");
            if (resourceAsStream != null) {
                Closeable a = C15976k.m60609a(new C17707i(C15976k.m60615a(resourceAsStream)));
                try {
                    byte[] bArr = new byte[a.readInt()];
                    a.readFully(bArr);
                    byte[] bArr2 = new byte[a.readInt()];
                    a.readFully(bArr2);
                    synchronized (this) {
                        this.f49464g = bArr;
                        this.f49465h = bArr2;
                    }
                    this.f49463f.countDown();
                } finally {
                    C15908c.m60165a(a);
                }
            }
        }
    }
