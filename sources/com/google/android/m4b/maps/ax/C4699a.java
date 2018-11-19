package com.google.android.m4b.maps.ax;

import com.google.android.m4b.maps.ag.C4610b;
import com.google.android.m4b.maps.an.C4646a.C8199a;
import java.io.DataInput;
import java.util.regex.Pattern;

/* renamed from: com.google.android.m4b.maps.ax.a */
public abstract class C4699a {
    /* renamed from: a */
    public static final C4699a f17284a = new C6404a(0, 0);

    /* renamed from: com.google.android.m4b.maps.ax.a$a */
    public static class C6404a extends C4699a {
        /* renamed from: b */
        protected final long f23758b;
        /* renamed from: c */
        protected final long f23759c;
        /* renamed from: d */
        protected final long f23760d;

        C6404a(long j) {
            this(0, j);
        }

        C6404a(long j, long j2) {
            this.f23758b = C4699a.m20893a(j, j2);
            this.f23759c = j;
            this.f23760d = j2;
        }

        /* renamed from: c */
        public final C8199a m27942c() {
            return (C8199a) C8199a.m34966b().m34962a(this.f23759c).m34963b(this.f23760d).m34393e();
        }

        /* renamed from: a */
        public final String mo4870a() {
            String valueOf = String.valueOf(Long.toHexString(this.f23759c));
            String valueOf2 = String.valueOf(Long.toHexString(this.f23760d));
            StringBuilder stringBuilder = new StringBuilder((String.valueOf(valueOf).length() + 5) + String.valueOf(valueOf2).length());
            stringBuilder.append("0x");
            stringBuilder.append(valueOf);
            stringBuilder.append(":0x");
            stringBuilder.append(valueOf2);
            return stringBuilder.toString();
        }

        public String toString() {
            return mo4870a();
        }

        public int hashCode() {
            return (int) (this.f23758b ^ (this.f23758b >>> 32));
        }

        public boolean equals(Object obj) {
            if (obj instanceof C6405b) {
                return ((C6405b) obj).f23761b == this.f23758b ? true : null;
            } else {
                return mo4871a(obj);
            }
        }

        /* renamed from: a */
        public final boolean mo4871a(Object obj) {
            if (!(obj instanceof C6404a)) {
                return false;
            }
            C6404a c6404a = (C6404a) obj;
            if (c6404a.f23759c == this.f23759c && c6404a.f23760d == this.f23760d && c6404a.f23758b == this.f23758b) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: com.google.android.m4b.maps.ax.a$b */
    public static class C6405b extends C4699a {
        /* renamed from: b */
        protected final long f23761b;

        /* renamed from: a */
        public final String mo4870a() {
            return "";
        }

        C6405b(long j) {
            this.f23761b = j;
        }

        public final String toString() {
            long j = this.f23761b;
            StringBuilder stringBuilder = new StringBuilder(27);
            stringBuilder.append("[hash:");
            stringBuilder.append(j);
            stringBuilder.append("]");
            return stringBuilder.toString();
        }

        public final int hashCode() {
            return (int) (this.f23761b ^ (this.f23761b >>> 32));
        }

        public final boolean equals(Object obj) {
            if (obj instanceof C6404a) {
                return ((C6404a) obj).f23758b == this.f23761b ? true : null;
            } else {
                return mo4871a(obj);
            }
        }

        /* renamed from: a */
        public final boolean mo4871a(Object obj) {
            if ((obj instanceof C6405b) && ((C6405b) obj).f23761b == this.f23761b) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: com.google.android.m4b.maps.ax.a$d */
    public static class C6406d extends C4699a {
        /* renamed from: b */
        private C4700b f23762b;
        /* renamed from: c */
        private int f23763c;

        C6406d(C4700b c4700b, int i) {
            this.f23762b = c4700b;
            this.f23763c = i;
        }

        /* renamed from: a */
        public final String mo4870a() {
            int a = this.f23762b.m20900a();
            int b = this.f23762b.m20901b();
            String valueOf = String.valueOf(Integer.toString(this.f23763c));
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 24);
            stringBuilder.append(a);
            stringBuilder.append("|");
            stringBuilder.append(b);
            stringBuilder.append("|");
            stringBuilder.append(valueOf);
            return stringBuilder.toString();
        }

        public final int hashCode() {
            return mo4870a().hashCode();
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C6406d)) {
                return false;
            }
            C6406d c6406d = (C6406d) obj;
            if (c6406d.f23762b.equals(this.f23762b) && c6406d.f23763c == this.f23763c) {
                return true;
            }
            return false;
        }

        /* renamed from: a */
        public final boolean mo4871a(Object obj) {
            return equals(obj);
        }
    }

    /* renamed from: com.google.android.m4b.maps.ax.a$c */
    public static final class C7436c extends C6404a {
        public C7436c(long j, long j2) {
            super(j, j2);
        }

        /* renamed from: b */
        public static com.google.android.m4b.maps.ax.C4699a.C7436c m32017b(java.lang.String r5) {
            /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
            /*
            r5 = com.google.android.m4b.maps.ax.C4699a.m20895a(r5);	 Catch:{ IllegalArgumentException -> 0x0017 }
            r0 = r5 instanceof com.google.android.m4b.maps.ax.C4699a.C6404a;	 Catch:{ IllegalArgumentException -> 0x0017 }
            if (r0 == 0) goto L_0x0017;	 Catch:{ IllegalArgumentException -> 0x0017 }
        L_0x0008:
            r0 = new com.google.android.m4b.maps.ax.a$c;	 Catch:{ IllegalArgumentException -> 0x0017 }
            r1 = r5;	 Catch:{ IllegalArgumentException -> 0x0017 }
            r1 = (com.google.android.m4b.maps.ax.C4699a.C6404a) r1;	 Catch:{ IllegalArgumentException -> 0x0017 }
            r1 = r1.f23759c;	 Catch:{ IllegalArgumentException -> 0x0017 }
            r5 = (com.google.android.m4b.maps.ax.C4699a.C6404a) r5;	 Catch:{ IllegalArgumentException -> 0x0017 }
            r3 = r5.f23760d;	 Catch:{ IllegalArgumentException -> 0x0017 }
            r0.<init>(r1, r3);	 Catch:{ IllegalArgumentException -> 0x0017 }
            return r0;
        L_0x0017:
            r5 = 0;
            return r5;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.m4b.maps.ax.a.c.b(java.lang.String):com.google.android.m4b.maps.ax.a$c");
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return obj instanceof C7436c ? this.d == ((C7436c) obj).d : (obj instanceof C4701c) && this.d == ((C4701c) obj).m20902a().d;
        }

        public final int hashCode() {
            return (int) (this.d ^ (this.d >>> 32));
        }

        /* renamed from: d */
        public final String m32018d() {
            return Long.toHexString(this.d);
        }
    }

    /* renamed from: a */
    static /* synthetic */ long m20893a(long j, long j2) {
        long j3 = j >>> 16;
        j3 = (((j3 << 4) ^ (j3 >>> 44)) & 281474976710655L) ^ (((j << 32) & 281474976710655L) | (j2 >>> 32));
        return (((j3 << 4) ^ (j3 >>> 44)) & 281474976710655L) ^ (j2 & 4294967295L);
    }

    /* renamed from: b */
    public static int m20896b() {
        return 40;
    }

    /* renamed from: a */
    public abstract String mo4870a();

    /* renamed from: a */
    boolean mo4871a(Object obj) {
        return false;
    }

    /* renamed from: a */
    public static C6404a m20894a(DataInput dataInput) {
        return new C6404a(dataInput.readLong(), dataInput.readLong());
    }

    /* renamed from: b */
    public static C6405b m20897b(DataInput dataInput) {
        return new C6405b(((((long) dataInput.readShort()) & 65535) << 32) | (((long) dataInput.readInt()) & 4294967295L));
    }

    /* renamed from: a */
    public static C4699a m20895a(String str) {
        if (str == null) {
            throw new IllegalArgumentException("null feature id");
        }
        String[] split = str.split(":");
        String[] split2 = str.split("\\|");
        String str2;
        if (split.length == 2) {
            if (split[0].startsWith("0x")) {
                if (split[1].startsWith("0x")) {
                    return new C6404a(C4702d.m20904a(split[0].substring(2)), C4702d.m20904a(split[1].substring(2)));
                }
            }
            str2 = "malformed feature id ";
            str = String.valueOf(str);
            throw new IllegalArgumentException(str.length() != 0 ? str2.concat(str) : new String(str2));
        } else if (split2.length == 3) {
            return new C6406d(new C4700b(Integer.parseInt(split2[0]), Integer.parseInt(split2[1])), Integer.parseInt(split2[2]));
        } else if (str.startsWith("0x")) {
            return new C6405b(C4702d.m20904a(str.substring(2)));
        } else {
            if (Pattern.matches("[0-9]{1,20}", str)) {
                return new C6404a(C4610b.m20700a(str));
            }
            str2 = "malformed feature id ";
            str = String.valueOf(str);
            throw new IllegalArgumentException(str.length() != 0 ? str2.concat(str) : new String(str2));
        }
    }
}
