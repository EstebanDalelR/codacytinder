package com.google.android.m4b.maps.ac;

import com.google.android.m4b.maps.ac.C4596c.C4594a;
import com.google.android.m4b.maps.ac.C4596c.C4595b;
import com.google.android.m4b.maps.af.C4607c;
import com.google.android.m4b.maps.p125y.C5571j;
import com.google.android.m4b.maps.p125y.C6846d;
import com.tinder.domain.config.model.ProfileEditingConfig;
import java.math.RoundingMode;
import java.util.Arrays;

/* renamed from: com.google.android.m4b.maps.ac.a */
public abstract class C4591a {
    /* renamed from: a */
    private static final C4591a f16994a = new C6375b("base64()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/", Character.valueOf('='));
    /* renamed from: b */
    private static final C4591a f16995b = new C6375b("base64Url()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_", Character.valueOf('='));
    /* renamed from: c */
    private static final C4591a f16996c = new C6375b("base32()", "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567", Character.valueOf('='));
    /* renamed from: d */
    private static final C4591a f16997d = new C6375b("base32Hex()", "0123456789ABCDEFGHIJKLMNOPQRSTUV", Character.valueOf('='));
    /* renamed from: e */
    private static final C4591a f16998e = new C6375b("base16()", "0123456789ABCDEF", null);

    /* renamed from: com.google.android.m4b.maps.ac.a$b */
    static final class C6375b extends C4591a {
        /* renamed from: a */
        private final C7424a f23704a;
        /* renamed from: b */
        private final Character f23705b;

        C6375b(String str, String str2, Character ch) {
            this(new C7424a(str, str2.toCharArray()), ch);
        }

        private C6375b(C7424a c7424a, Character ch) {
            boolean z;
            this.f23704a = (C7424a) C5571j.m24292a((Object) c7424a);
            if (ch != null) {
                if (c7424a.mo7019a(ch.charValue()) != null) {
                    z = null;
                    C5571j.m24299a(z, "Padding character %s was already in alphabet", ch);
                    this.f23705b = ch;
                }
            }
            z = true;
            C5571j.m24299a(z, "Padding character %s was already in alphabet", ch);
            this.f23705b = ch;
        }

        /* renamed from: a */
        final int mo4843a(int i) {
            return this.f23704a.f27217c * C4607c.m20695a(i, this.f23704a.f27218d, RoundingMode.CEILING);
        }

        /* renamed from: a */
        final C4594a mo4845a(final C4595b c4595b) {
            C5571j.m24292a((Object) c4595b);
            return new C4594a(this) {
                /* renamed from: a */
                private int f23699a = 0;
                /* renamed from: b */
                private int f23700b = 0;
                /* renamed from: c */
                private int f23701c = 0;
                /* renamed from: e */
                private /* synthetic */ C6375b f23703e;

                /* renamed from: a */
                public final void mo4842a(byte b) {
                    this.f23699a <<= 8;
                    this.f23699a = (b & 255) | this.f23699a;
                    this.f23700b += 8;
                    while (this.f23700b >= this.f23703e.f23704a.f27216b) {
                        c4595b.mo4846a(this.f23703e.f23704a.m31996a((this.f23699a >> (this.f23700b - this.f23703e.f23704a.f27216b)) & this.f23703e.f23704a.f27215a));
                        this.f23701c++;
                        this.f23700b -= this.f23703e.f23704a.f27216b;
                    }
                }

                /* renamed from: a */
                public final void mo4841a() {
                    if (this.f23700b > 0) {
                        c4595b.mo4846a(this.f23703e.f23704a.m31996a((this.f23699a << (this.f23703e.f23704a.f27216b - this.f23700b)) & this.f23703e.f23704a.f27215a));
                        this.f23701c++;
                        if (this.f23703e.f23705b != null) {
                            while (this.f23701c % this.f23703e.f23704a.f27217c != 0) {
                                c4595b.mo4846a(this.f23703e.f23705b.charValue());
                                this.f23701c++;
                            }
                        }
                    }
                }
            };
        }

        /* renamed from: a */
        public final C4591a mo4844a() {
            return this.f23705b == null ? this : new C6375b(this.f23704a, null);
        }

        public final String toString() {
            StringBuilder stringBuilder = new StringBuilder("BaseEncoding.");
            stringBuilder.append(this.f23704a.toString());
            if (8 % this.f23704a.f27216b != 0) {
                if (this.f23705b == null) {
                    stringBuilder.append(".omitPadding()");
                } else {
                    stringBuilder.append(".withPadChar(");
                    stringBuilder.append(this.f23705b);
                    stringBuilder.append(')');
                }
            }
            return stringBuilder.toString();
        }
    }

    /* renamed from: com.google.android.m4b.maps.ac.a$a */
    static final class C7424a extends C6846d {
        /* renamed from: a */
        final int f27215a;
        /* renamed from: b */
        final int f27216b;
        /* renamed from: c */
        final int f27217c;
        /* renamed from: d */
        final int f27218d;
        /* renamed from: h */
        private final String f27219h;
        /* renamed from: i */
        private final char[] f27220i;
        /* renamed from: j */
        private final byte[] f27221j;
        /* renamed from: k */
        private final boolean[] f27222k;

        C7424a(String str, char[] cArr) {
            this.f27219h = (String) C5571j.m24292a((Object) str);
            this.f27220i = (char[]) C5571j.m24292a((Object) cArr);
            try {
                this.f27216b = C4607c.m20696a(cArr.length, RoundingMode.UNNECESSARY);
                str = Math.min(8, Integer.lowestOneBit(this.f27216b));
                this.f27217c = 8 / str;
                this.f27218d = this.f27216b / str;
                this.f27215a = cArr.length - 1;
                str = new byte[ProfileEditingConfig.DEFAULT_MAX_LENGTH];
                Arrays.fill(str, (byte) -1);
                int i = 0;
                for (int i2 = 0; i2 < cArr.length; i2++) {
                    char c = cArr[i2];
                    C5571j.m24299a(C6846d.f25385e.mo7019a(c), "Non-ASCII character: %s", Character.valueOf(c));
                    C5571j.m24299a(str[c] == (byte) -1, "Duplicate character: %s", Character.valueOf(c));
                    str[c] = (byte) i2;
                }
                this.f27221j = str;
                str = new boolean[this.f27217c];
                while (i < this.f27218d) {
                    str[C4607c.m20695a(i * 8, this.f27216b, RoundingMode.CEILING)] = 1;
                    i++;
                }
                this.f27222k = str;
            } catch (String str2) {
                StringBuilder stringBuilder = new StringBuilder("Illegal alphabet length ");
                stringBuilder.append(cArr.length);
                throw new IllegalArgumentException(stringBuilder.toString(), str2);
            }
        }

        /* renamed from: a */
        final char m31996a(int i) {
            return this.f27220i[i];
        }

        /* renamed from: a */
        public final boolean mo7019a(char c) {
            return C6846d.f25385e.mo7019a(c) && this.f27221j[c] != '￿';
        }

        public final String toString() {
            return this.f27219h;
        }
    }

    /* renamed from: a */
    abstract int mo4843a(int i);

    /* renamed from: a */
    public abstract C4591a mo4844a();

    /* renamed from: a */
    abstract C4594a mo4845a(C4595b c4595b);

    C4591a() {
    }

    /* renamed from: a */
    public final String m20685a(byte[] bArr) {
        return m20680a((byte[]) C5571j.m24292a((Object) bArr), 0, bArr.length);
    }

    /* renamed from: a */
    private java.lang.String m20680a(byte[] r4, int r5, int r6) {
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
        com.google.android.m4b.maps.p125y.C5571j.m24292a(r4);
        r5 = r6 + 0;
        r0 = r4.length;
        r1 = 0;
        com.google.android.m4b.maps.p125y.C5571j.m24296a(r1, r5, r0);
        r5 = r3.mo4843a(r6);
        r0 = new java.lang.StringBuilder;
        r0.<init>(r5);
        r5 = new com.google.android.m4b.maps.ac.c$1;
        r5.<init>(r0);
        r0 = r3.mo4845a(r5);
    L_0x001c:
        if (r1 >= r6) goto L_0x0028;
    L_0x001e:
        r2 = r1 + 0;
        r2 = r4[r2];	 Catch:{ IOException -> 0x0030 }
        r0.mo4842a(r2);	 Catch:{ IOException -> 0x0030 }
        r1 = r1 + 1;	 Catch:{ IOException -> 0x0030 }
        goto L_0x001c;	 Catch:{ IOException -> 0x0030 }
    L_0x0028:
        r0.mo4841a();	 Catch:{ IOException -> 0x0030 }
        r4 = r5.toString();
        return r4;
    L_0x0030:
        r4 = new java.lang.AssertionError;
        r5 = "impossible";
        r4.<init>(r5);
        throw r4;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.m4b.maps.ac.a.a(byte[], int, int):java.lang.String");
    }

    /* renamed from: b */
    public static C4591a m20681b() {
        return f16995b;
    }
}
