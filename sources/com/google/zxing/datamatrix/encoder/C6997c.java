package com.google.zxing.datamatrix.encoder;

/* renamed from: com.google.zxing.datamatrix.encoder.c */
class C6997c implements C5668g {
    /* renamed from: a */
    public int mo7367a() {
        return 1;
    }

    C6997c() {
    }

    /* renamed from: a */
    public void mo6177a(C5669h c5669h) {
        StringBuilder stringBuilder = new StringBuilder();
        while (c5669h.m24804g()) {
            char b = c5669h.m24797b();
            c5669h.f21004a++;
            int a = mo7368a(b, stringBuilder);
            int d = c5669h.m24801d() + ((stringBuilder.length() / 3) << 1);
            c5669h.m24800c(d);
            int f = c5669h.m24806i().m24837f() - d;
            if (!c5669h.m24804g()) {
                StringBuilder stringBuilder2 = new StringBuilder();
                if (stringBuilder.length() % 3 == 2 && (f < 2 || f > 2)) {
                    a = m30486a(c5669h, stringBuilder, stringBuilder2, a);
                }
                while (stringBuilder.length() % 3 == 1 && ((a <= 3 && f != 1) || a > 3)) {
                    a = m30486a(c5669h, stringBuilder, stringBuilder2, a);
                }
            } else if (stringBuilder.length() % 3 == 0) {
                a = C5671j.m24814a(c5669h.m24791a(), c5669h.f21004a, mo7367a());
                if (a != mo7367a()) {
                    c5669h.m24798b(a);
                    break;
                }
            }
        }
        mo7369b(c5669h, stringBuilder);
    }

    /* renamed from: a */
    private int m30486a(C5669h c5669h, StringBuilder stringBuilder, StringBuilder stringBuilder2, int i) {
        int length = stringBuilder.length();
        stringBuilder.delete(length - i, length);
        c5669h.f21004a--;
        stringBuilder = mo7368a(c5669h.m24797b(), stringBuilder2);
        c5669h.m24808k();
        return stringBuilder;
    }

    /* renamed from: a */
    static void m30488a(C5669h c5669h, StringBuilder stringBuilder) {
        c5669h.m24796a(C6997c.m30487a((CharSequence) stringBuilder, 0));
        stringBuilder.delete(0, 3);
    }

    /* renamed from: b */
    void mo7369b(C5669h c5669h, StringBuilder stringBuilder) {
        int length = stringBuilder.length() % 3;
        int d = c5669h.m24801d() + ((stringBuilder.length() / 3) << 1);
        c5669h.m24800c(d);
        int f = c5669h.m24806i().m24837f() - d;
        if (length == 2) {
            stringBuilder.append('\u0000');
            while (stringBuilder.length() >= 3) {
                C6997c.m30488a(c5669h, stringBuilder);
            }
            if (c5669h.m24804g() != null) {
                c5669h.m24792a('þ');
            }
        } else if (f == 1 && length == 1) {
            while (stringBuilder.length() >= 3) {
                C6997c.m30488a(c5669h, stringBuilder);
            }
            if (c5669h.m24804g() != null) {
                c5669h.m24792a('þ');
            }
            c5669h.f21004a -= 1;
        } else if (length == 0) {
            while (stringBuilder.length() >= 3) {
                C6997c.m30488a(c5669h, stringBuilder);
            }
            if (f > 0 || c5669h.m24804g() != null) {
                c5669h.m24792a('þ');
            }
        } else {
            throw new IllegalStateException("Unexpected case. Please report!");
        }
        c5669h.m24798b(0);
    }

    /* renamed from: a */
    int mo7368a(char c, StringBuilder stringBuilder) {
        if (c == ' ') {
            stringBuilder.append('\u0003');
            return 1;
        } else if (c >= '0' && c <= '9') {
            stringBuilder.append((char) ((c - '0') + 4));
            return 1;
        } else if (c >= 'A' && c <= 'Z') {
            stringBuilder.append((char) ((c - 'A') + 14));
            return 1;
        } else if (c >= '\u0000' && c <= '\u001f') {
            stringBuilder.append('\u0000');
            stringBuilder.append(c);
            return 2;
        } else if (c >= '!' && c <= '/') {
            stringBuilder.append('\u0001');
            stringBuilder.append((char) (c - '!'));
            return 2;
        } else if (c >= ':' && c <= '@') {
            stringBuilder.append('\u0001');
            stringBuilder.append((char) ((c - ':') + 15));
            return 2;
        } else if (c >= '[' && c <= '_') {
            stringBuilder.append('\u0001');
            stringBuilder.append((char) ((c - '[') + 22));
            return 2;
        } else if (c >= '`' && c <= '') {
            stringBuilder.append('\u0002');
            stringBuilder.append((char) (c - '`'));
            return 2;
        } else if (c >= '') {
            stringBuilder.append("\u0001\u001e");
            return mo7368a((char) (c - ''), stringBuilder) + '\u0002';
        } else {
            StringBuilder stringBuilder2 = new StringBuilder("Illegal character: ");
            stringBuilder2.append(c);
            throw new IllegalArgumentException(stringBuilder2.toString());
        }
    }

    /* renamed from: a */
    private static String m30487a(CharSequence charSequence, int i) {
        char charAt = (char) (((((charSequence.charAt(i) * 1600) + (charSequence.charAt(i + 1) * 40)) + charSequence.charAt(i + 2)) + 1) % 256);
        return new String(new char[]{(char) (r0 / 256), charAt});
    }
}
