package com.google.zxing.datamatrix.encoder;

/* renamed from: com.google.zxing.datamatrix.encoder.m */
final class C7801m extends C6997c {
    /* renamed from: a */
    public int mo7367a() {
        return 3;
    }

    C7801m() {
    }

    /* renamed from: a */
    public void mo6177a(C5669h c5669h) {
        StringBuilder stringBuilder = new StringBuilder();
        while (c5669h.m24804g()) {
            char b = c5669h.m24797b();
            c5669h.f21004a++;
            mo7368a(b, stringBuilder);
            if (stringBuilder.length() % 3 == 0) {
                C6997c.m30488a(c5669h, stringBuilder);
                int a = C5671j.m24814a(c5669h.m24791a(), c5669h.f21004a, mo7367a());
                if (a != mo7367a()) {
                    c5669h.m24798b(a);
                    break;
                }
            }
        }
        mo7369b(c5669h, stringBuilder);
    }

    /* renamed from: a */
    int mo7368a(char c, StringBuilder stringBuilder) {
        if (c == '\r') {
            stringBuilder.append('\u0000');
        } else if (c == '*') {
            stringBuilder.append('\u0001');
        } else if (c == '>') {
            stringBuilder.append('\u0002');
        } else if (c == ' ') {
            stringBuilder.append('\u0003');
        } else if (c >= '0' && c <= '9') {
            stringBuilder.append((char) ((c - '0') + 4));
        } else if (c < 'A' || c > 'Z') {
            C5671j.m24820c(c);
        } else {
            stringBuilder.append((char) ((c - 'A') + 14));
        }
        return 1;
    }

    /* renamed from: b */
    void mo7369b(C5669h c5669h, StringBuilder stringBuilder) {
        c5669h.m24807j();
        int f = c5669h.m24806i().m24837f() - c5669h.m24801d();
        c5669h.f21004a -= stringBuilder.length();
        if (c5669h.m24805h() > 1 || f > 1 || c5669h.m24805h() != f) {
            c5669h.m24792a('þ');
        }
        if (c5669h.m24802e() < null) {
            c5669h.m24798b(null);
        }
    }
}
