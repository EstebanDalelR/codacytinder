package com.google.zxing.datamatrix.encoder;

/* renamed from: com.google.zxing.datamatrix.encoder.a */
final class C6995a implements C5668g {
    /* renamed from: a */
    public int m30481a() {
        return 0;
    }

    C6995a() {
    }

    /* renamed from: a */
    public void mo6177a(C5669h c5669h) {
        if (C5671j.m24813a(c5669h.m24791a(), c5669h.f21004a) >= 2) {
            c5669h.m24792a(C6995a.m30480a(c5669h.m24791a().charAt(c5669h.f21004a), c5669h.m24791a().charAt(c5669h.f21004a + 1)));
            c5669h.f21004a += 2;
            return;
        }
        char b = c5669h.m24797b();
        int a = C5671j.m24814a(c5669h.m24791a(), c5669h.f21004a, m30481a());
        if (a != m30481a()) {
            switch (a) {
                case 1:
                    c5669h.m24792a('æ');
                    c5669h.m24798b(1);
                    return;
                case 2:
                    c5669h.m24792a('ï');
                    c5669h.m24798b(2);
                    return;
                case 3:
                    c5669h.m24792a('î');
                    c5669h.m24798b(3);
                    return;
                case 4:
                    c5669h.m24792a('ð');
                    c5669h.m24798b(4);
                    return;
                case 5:
                    c5669h.m24792a('ç');
                    c5669h.m24798b(5);
                    return;
                default:
                    StringBuilder stringBuilder = new StringBuilder("Illegal mode: ");
                    stringBuilder.append(a);
                    throw new IllegalStateException(stringBuilder.toString());
            }
        } else if (C5671j.m24819b(b)) {
            c5669h.m24792a('ë');
            c5669h.m24792a((char) ((b - 128) + 1));
            c5669h.f21004a++;
        } else {
            c5669h.m24792a((char) (b + 1));
            c5669h.f21004a++;
        }
    }

    /* renamed from: a */
    private static char m30480a(char c, char c2) {
        if (C5671j.m24818a(c) && C5671j.m24818a(c2)) {
            return (char) ((((c - 48) * 10) + (c2 - 48)) + 130);
        }
        StringBuilder stringBuilder = new StringBuilder("not digits: ");
        stringBuilder.append(c);
        stringBuilder.append(c2);
        throw new IllegalArgumentException(stringBuilder.toString());
    }
}
