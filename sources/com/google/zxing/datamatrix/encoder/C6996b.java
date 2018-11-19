package com.google.zxing.datamatrix.encoder;

import android.support.v7.widget.helper.ItemTouchHelper.Callback;

/* renamed from: com.google.zxing.datamatrix.encoder.b */
final class C6996b implements C5668g {
    /* renamed from: a */
    public int m30484a() {
        return 5;
    }

    C6996b() {
    }

    /* renamed from: a */
    public void mo6177a(C5669h c5669h) {
        int a;
        StringBuilder stringBuilder = new StringBuilder();
        int i = 0;
        stringBuilder.append('\u0000');
        while (c5669h.m24804g()) {
            stringBuilder.append(c5669h.m24797b());
            c5669h.f21004a++;
            a = C5671j.m24814a(c5669h.m24791a(), c5669h.f21004a, m30484a());
            if (a != m30484a()) {
                c5669h.m24798b(a);
                break;
            }
        }
        a = stringBuilder.length() - 1;
        int d = (c5669h.m24801d() + a) + 1;
        c5669h.m24800c(d);
        Object obj = c5669h.m24806i().m24837f() - d > 0 ? 1 : null;
        if (c5669h.m24804g() || obj != null) {
            if (a <= 249) {
                stringBuilder.setCharAt(0, (char) a);
            } else if (a <= 1555) {
                stringBuilder.setCharAt(0, (char) ((a / Callback.DEFAULT_SWIPE_ANIMATION_DURATION) + 249));
                stringBuilder.insert(1, (char) (a % Callback.DEFAULT_SWIPE_ANIMATION_DURATION));
            } else {
                stringBuilder = new StringBuilder("Message length not in valid ranges: ");
                stringBuilder.append(a);
                throw new IllegalStateException(stringBuilder.toString());
            }
        }
        a = stringBuilder.length();
        while (i < a) {
            c5669h.m24792a(C6996b.m30483a(stringBuilder.charAt(i), c5669h.m24801d() + 1));
            i++;
        }
    }

    /* renamed from: a */
    private static char m30483a(char c, int i) {
        c += ((i * 149) % 255) + 1;
        return c <= 'ÿ' ? (char) c : (char) (c - 256);
    }
}
