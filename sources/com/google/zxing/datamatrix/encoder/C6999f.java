package com.google.zxing.datamatrix.encoder;

import com.tinder.api.ManagerWebServices;

/* renamed from: com.google.zxing.datamatrix.encoder.f */
final class C6999f implements C5668g {
    /* renamed from: a */
    public int m30498a() {
        return 4;
    }

    C6999f() {
    }

    /* renamed from: a */
    public void mo6177a(C5669h c5669h) {
        CharSequence stringBuilder = new StringBuilder();
        while (c5669h.m24804g()) {
            C6999f.m30496a(c5669h.m24797b(), (StringBuilder) stringBuilder);
            c5669h.f21004a++;
            if (stringBuilder.length() >= 4) {
                c5669h.m24796a(C6999f.m30495a(stringBuilder, 0));
                stringBuilder.delete(0, 4);
                if (C5671j.m24814a(c5669h.m24791a(), c5669h.f21004a, m30498a()) != m30498a()) {
                    c5669h.m24798b(0);
                    break;
                }
            }
        }
        stringBuilder.append('\u001f');
        C6999f.m30497a(c5669h, stringBuilder);
    }

    /* renamed from: a */
    private static void m30497a(C5669h c5669h, CharSequence charSequence) {
        try {
            int length = charSequence.length();
            if (length != 0) {
                int i = 1;
                if (length == 1) {
                    c5669h.m24807j();
                    int f = c5669h.m24806i().m24837f() - c5669h.m24801d();
                    if (c5669h.m24805h() == 0 && f <= 2) {
                        c5669h.m24798b(0);
                        return;
                    }
                }
                if (length > 4) {
                    throw new IllegalStateException("Count must not exceed 4");
                }
                length--;
                String a = C6999f.m30495a(charSequence, 0);
                if ((c5669h.m24804g() ^ 1) == 0 || length > 2) {
                    i = 0;
                }
                if (length <= 2) {
                    c5669h.m24800c(c5669h.m24801d() + length);
                    if (c5669h.m24806i().m24837f() - c5669h.m24801d() >= 3) {
                        c5669h.m24800c(c5669h.m24801d() + a.length());
                        i = 0;
                    }
                }
                if (i != 0) {
                    c5669h.m24808k();
                    c5669h.f21004a -= length;
                } else {
                    c5669h.m24796a(a);
                }
                c5669h.m24798b(0);
            }
        } finally {
            c5669h.m24798b(0);
        }
    }

    /* renamed from: a */
    private static void m30496a(char c, StringBuilder stringBuilder) {
        if (c >= ' ' && c <= ManagerWebServices.QUERY_QUESTION_MARK) {
            stringBuilder.append(c);
        } else if (c < '@' || c > '^') {
            C5671j.m24820c(c);
        } else {
            stringBuilder.append((char) (c - '@'));
        }
    }

    /* renamed from: a */
    private static String m30495a(CharSequence charSequence, int i) {
        int length = charSequence.length() - i;
        if (length == 0) {
            throw new IllegalStateException("StringBuilder must not be empty");
        }
        char charAt = charSequence.charAt(i);
        int i2 = 0;
        int charAt2 = length >= 2 ? charSequence.charAt(i + 1) : 0;
        int charAt3 = length >= 3 ? charSequence.charAt(i + 2) : 0;
        if (length >= 4) {
            i2 = charSequence.charAt(i + 3);
        }
        charSequence = (((charAt << 18) + (charAt2 << 12)) + (charAt3 << 6)) + i2;
        i = (char) ((charSequence >> 16) & 255);
        charAt = (char) ((charSequence >> 8) & 255);
        charSequence = (char) (charSequence & 255);
        StringBuilder stringBuilder = new StringBuilder(3);
        stringBuilder.append(i);
        if (length >= 2) {
            stringBuilder.append(charAt);
        }
        if (length >= 3) {
            stringBuilder.append(charSequence);
        }
        return stringBuilder.toString();
    }
}
