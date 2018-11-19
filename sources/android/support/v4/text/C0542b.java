package android.support.v4.text;

import java.nio.CharBuffer;
import java.util.Locale;

/* renamed from: android.support.v4.text.b */
public final class C0542b {
    /* renamed from: a */
    public static final TextDirectionHeuristicCompat f1676a = new C4026e(null, false);
    /* renamed from: b */
    public static final TextDirectionHeuristicCompat f1677b = new C4026e(null, true);
    /* renamed from: c */
    public static final TextDirectionHeuristicCompat f1678c = new C4026e(C2876b.f9098a, false);
    /* renamed from: d */
    public static final TextDirectionHeuristicCompat f1679d = new C4026e(C2876b.f9098a, true);
    /* renamed from: e */
    public static final TextDirectionHeuristicCompat f1680e = new C4026e(C2875a.f9095a, false);
    /* renamed from: f */
    public static final TextDirectionHeuristicCompat f1681f = C4027f.f12780a;

    /* renamed from: android.support.v4.text.b$c */
    private interface C0541c {
        /* renamed from: a */
        int mo568a(CharSequence charSequence, int i, int i2);
    }

    /* renamed from: android.support.v4.text.b$a */
    private static class C2875a implements C0541c {
        /* renamed from: a */
        static final C2875a f9095a = new C2875a(true);
        /* renamed from: b */
        static final C2875a f9096b = new C2875a(false);
        /* renamed from: c */
        private final boolean f9097c;

        /* renamed from: a */
        public int mo568a(CharSequence charSequence, int i, int i2) {
            i2 += i;
            Object obj = null;
            while (i < i2) {
                switch (C0542b.m1993a(Character.getDirectionality(charSequence.charAt(i)))) {
                    case 0:
                        if (this.f9097c) {
                            return 0;
                        }
                        break;
                    case 1:
                        if (!this.f9097c) {
                            return 1;
                        }
                        break;
                    default:
                        continue;
                }
                obj = 1;
                i++;
            }
            return obj != null ? this.f9097c : 2;
        }

        private C2875a(boolean z) {
            this.f9097c = z;
        }
    }

    /* renamed from: android.support.v4.text.b$b */
    private static class C2876b implements C0541c {
        /* renamed from: a */
        static final C2876b f9098a = new C2876b();

        /* renamed from: a */
        public int mo568a(CharSequence charSequence, int i, int i2) {
            i2 += i;
            int i3 = 2;
            while (i < i2 && i3 == 2) {
                i3 = C0542b.m1994b(Character.getDirectionality(charSequence.charAt(i)));
                i++;
            }
            return i3;
        }

        private C2876b() {
        }
    }

    /* renamed from: android.support.v4.text.b$d */
    private static abstract class C2877d implements TextDirectionHeuristicCompat {
        /* renamed from: a */
        private final C0541c f9099a;

        /* renamed from: a */
        protected abstract boolean mo3042a();

        C2877d(C0541c c0541c) {
            this.f9099a = c0541c;
        }

        public boolean isRtl(char[] cArr, int i, int i2) {
            return isRtl(CharBuffer.wrap(cArr), i, i2);
        }

        public boolean isRtl(CharSequence charSequence, int i, int i2) {
            if (charSequence != null && i >= 0 && i2 >= 0) {
                if (charSequence.length() - i2 >= i) {
                    if (this.f9099a == null) {
                        return mo3042a();
                    }
                    return m11330a(charSequence, i, i2);
                }
            }
            throw new IllegalArgumentException();
        }

        /* renamed from: a */
        private boolean m11330a(CharSequence charSequence, int i, int i2) {
            switch (this.f9099a.mo568a(charSequence, i, i2)) {
                case null:
                    return true;
                case 1:
                    return null;
                default:
                    return mo3042a();
            }
        }
    }

    /* renamed from: android.support.v4.text.b$e */
    private static class C4026e extends C2877d {
        /* renamed from: a */
        private final boolean f12779a;

        C4026e(C0541c c0541c, boolean z) {
            super(c0541c);
            this.f12779a = z;
        }

        /* renamed from: a */
        protected boolean mo3042a() {
            return this.f12779a;
        }
    }

    /* renamed from: android.support.v4.text.b$f */
    private static class C4027f extends C2877d {
        /* renamed from: a */
        static final C4027f f12780a = new C4027f();

        C4027f() {
            super(null);
        }

        /* renamed from: a */
        protected boolean mo3042a() {
            return C0543c.m1995a(Locale.getDefault()) == 1;
        }
    }

    /* renamed from: a */
    static int m1993a(int i) {
        switch (i) {
            case 0:
                return 1;
            case 1:
            case 2:
                return 0;
            default:
                return 2;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: b */
    static int m1994b(int r0) {
        /*
        switch(r0) {
            case 0: goto L_0x000a;
            case 1: goto L_0x0008;
            case 2: goto L_0x0008;
            default: goto L_0x0003;
        };
    L_0x0003:
        switch(r0) {
            case 14: goto L_0x000a;
            case 15: goto L_0x000a;
            case 16: goto L_0x0008;
            case 17: goto L_0x0008;
            default: goto L_0x0006;
        };
    L_0x0006:
        r0 = 2;
        return r0;
    L_0x0008:
        r0 = 0;
        return r0;
    L_0x000a:
        r0 = 1;
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.text.b.b(int):int");
    }
}
