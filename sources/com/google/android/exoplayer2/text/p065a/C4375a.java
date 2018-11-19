package com.google.android.exoplayer2.text.p065a;

import android.support.v7.widget.helper.ItemTouchHelper.Callback;
import android.text.Layout.Alignment;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.CharacterStyle;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import com.google.android.exoplayer2.text.C4259c;
import com.google.android.exoplayer2.text.C4260d;
import com.google.android.exoplayer2.text.Cue;
import com.google.android.exoplayer2.text.Subtitle;
import com.google.android.exoplayer2.text.SubtitleDecoderException;
import com.google.android.exoplayer2.util.C2302k;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.exoplayer2.text.a.a */
public final class C4375a extends C4257d {
    /* renamed from: a */
    private static final int[] f14481a = new int[]{11, 1, 3, 12, 14, 5, 7, 9};
    /* renamed from: b */
    private static final int[] f14482b = new int[]{0, 4, 8, 12, 16, 20, 24, 28};
    /* renamed from: c */
    private static final int[] f14483c = new int[]{-1, -16711936, -16776961, -16711681, -65536, -256, -65281};
    /* renamed from: d */
    private static final int[] f14484d = new int[]{32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 225, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 233, 93, 237, 243, Callback.DEFAULT_SWIPE_ANIMATION_DURATION, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 231, 247, 209, 241, 9632};
    /* renamed from: e */
    private static final int[] f14485e = new int[]{174, 176, 189, 191, 8482, 162, 163, 9834, 224, 32, 232, 226, 234, 238, 244, 251};
    /* renamed from: f */
    private static final int[] f14486f = new int[]{193, 201, 211, 218, 220, 252, 8216, 161, 42, 39, 8212, 169, 8480, 8226, 8220, 8221, 192, 194, 199, Callback.DEFAULT_DRAG_ANIMATION_DURATION, 202, 203, 235, 206, 207, 239, 212, 217, 249, 219, 171, 187};
    /* renamed from: g */
    private static final int[] f14487g = new int[]{195, 227, 205, 204, 236, 210, 242, 213, 245, 123, 125, 92, 94, 95, 124, 126, 196, 228, 214, 246, 223, 165, 164, 9474, 197, 229, 216, 248, 9484, 9488, 9492, 9496};
    /* renamed from: h */
    private final C2302k f14488h = new C2302k();
    /* renamed from: i */
    private final int f14489i;
    /* renamed from: j */
    private final int f14490j;
    /* renamed from: k */
    private final ArrayList<C2219a> f14491k = new ArrayList();
    /* renamed from: l */
    private C2219a f14492l = new C2219a(0, 4);
    /* renamed from: m */
    private List<Cue> f14493m;
    /* renamed from: n */
    private List<Cue> f14494n;
    /* renamed from: o */
    private int f14495o;
    /* renamed from: p */
    private int f14496p;
    /* renamed from: q */
    private boolean f14497q;
    /* renamed from: r */
    private byte f14498r;
    /* renamed from: s */
    private byte f14499s;

    /* renamed from: com.google.android.exoplayer2.text.a.a$a */
    private static class C2219a {
        /* renamed from: a */
        private final List<CharacterStyle> f6455a = new ArrayList();
        /* renamed from: b */
        private final List<C2218a> f6456b = new ArrayList();
        /* renamed from: c */
        private final List<SpannableString> f6457c = new ArrayList();
        /* renamed from: d */
        private final SpannableStringBuilder f6458d = new SpannableStringBuilder();
        /* renamed from: e */
        private int f6459e;
        /* renamed from: f */
        private int f6460f;
        /* renamed from: g */
        private int f6461g;
        /* renamed from: h */
        private int f6462h;
        /* renamed from: i */
        private int f6463i;
        /* renamed from: j */
        private int f6464j;

        /* renamed from: com.google.android.exoplayer2.text.a.a$a$a */
        private static class C2218a {
            /* renamed from: a */
            public final CharacterStyle f6452a;
            /* renamed from: b */
            public final int f6453b;
            /* renamed from: c */
            public final int f6454c;

            public C2218a(CharacterStyle characterStyle, int i, int i2) {
                this.f6452a = characterStyle;
                this.f6453b = i;
                this.f6454c = i2;
            }
        }

        public C2219a(int i, int i2) {
            m7926a(i);
            m7932b(i2);
        }

        /* renamed from: a */
        public void m7926a(int i) {
            this.f6462h = i;
            this.f6455a.clear();
            this.f6456b.clear();
            this.f6457c.clear();
            this.f6458d.clear();
            this.f6459e = 15;
            this.f6460f = 0;
            this.f6461g = 0;
            this.f6464j = -1;
        }

        /* renamed from: b */
        public void m7932b(int i) {
            this.f6463i = i;
        }

        /* renamed from: a */
        public boolean m7930a() {
            return this.f6455a.isEmpty() && this.f6456b.isEmpty() && this.f6457c.isEmpty() && this.f6458d.length() == 0;
        }

        /* renamed from: b */
        public void m7931b() {
            int length = this.f6458d.length();
            if (length > 0) {
                this.f6458d.delete(length - 1, length);
            }
        }

        /* renamed from: c */
        public int m7933c() {
            return this.f6459e;
        }

        /* renamed from: c */
        public void m7934c(int i) {
            this.f6459e = i;
        }

        /* renamed from: d */
        public void m7935d() {
            this.f6457c.add(m7937e());
            this.f6458d.clear();
            this.f6455a.clear();
            this.f6456b.clear();
            this.f6464j = -1;
            int min = Math.min(this.f6463i, this.f6459e);
            while (this.f6457c.size() >= min) {
                this.f6457c.remove(0);
            }
        }

        /* renamed from: d */
        public void m7936d(int i) {
            this.f6460f = i;
        }

        /* renamed from: e */
        public void m7938e(int i) {
            this.f6461g = i;
        }

        /* renamed from: a */
        public void m7927a(CharacterStyle characterStyle) {
            this.f6455a.add(characterStyle);
        }

        /* renamed from: a */
        public void m7928a(CharacterStyle characterStyle, int i) {
            this.f6456b.add(new C2218a(characterStyle, this.f6458d.length(), i));
        }

        /* renamed from: a */
        public void m7929a(boolean z) {
            if (z) {
                this.f6464j = this.f6458d.length();
            } else if (!this.f6464j) {
                this.f6458d.setSpan(new UnderlineSpan(), this.f6464j, this.f6458d.length(), 33);
                this.f6464j = -1;
            }
        }

        /* renamed from: a */
        public void m7925a(char c) {
            this.f6458d.append(c);
        }

        /* renamed from: e */
        public SpannableString m7937e() {
            int length = this.f6458d.length();
            int i = 0;
            for (int i2 = 0; i2 < this.f6455a.size(); i2++) {
                this.f6458d.setSpan(this.f6455a.get(i2), 0, length, 33);
            }
            while (i < this.f6456b.size()) {
                C2218a c2218a = (C2218a) this.f6456b.get(i);
                this.f6458d.setSpan(c2218a.f6452a, c2218a.f6453b, i < this.f6456b.size() - c2218a.f6454c ? ((C2218a) this.f6456b.get(c2218a.f6454c + i)).f6453b : length, 33);
                i++;
            }
            if (this.f6464j != -1) {
                this.f6458d.setSpan(new UnderlineSpan(), this.f6464j, length, 33);
            }
            return new SpannableString(this.f6458d);
        }

        /* renamed from: f */
        public Cue m7939f() {
            int i;
            CharSequence spannableStringBuilder = new SpannableStringBuilder();
            for (i = 0; i < this.f6457c.size(); i++) {
                spannableStringBuilder.append((CharSequence) this.f6457c.get(i));
                spannableStringBuilder.append('\n');
            }
            spannableStringBuilder.append(m7937e());
            if (spannableStringBuilder.length() == 0) {
                return null;
            }
            float f;
            int i2;
            int i3;
            i = this.f6460f + this.f6461g;
            int length = (32 - i) - spannableStringBuilder.length();
            int i4 = i - length;
            if (this.f6462h == 2 && (Math.abs(i4) < 3 || length < 0)) {
                f = 0.5f;
                i2 = 1;
            } else if (this.f6462h != 2 || i4 <= 0) {
                f = ((((float) i) / 32.0f) * 0.8f) + 0.1f;
                i2 = 0;
            } else {
                f = ((((float) (32 - length)) / 32.0f) * 0.8f) + 0.1f;
                i2 = 2;
            }
            if (this.f6462h != 1) {
                if (this.f6459e <= 7) {
                    i = this.f6459e;
                    i3 = 0;
                    return new Cue(spannableStringBuilder, Alignment.ALIGN_NORMAL, (float) i, 1, i3, f, i2, Float.MIN_VALUE);
                }
            }
            i = (this.f6459e - 15) - 2;
            i3 = 2;
            return new Cue(spannableStringBuilder, Alignment.ALIGN_NORMAL, (float) i, 1, i3, f, i2, Float.MIN_VALUE);
        }

        public String toString() {
            return this.f6458d.toString();
        }
    }

    /* renamed from: c */
    private static boolean m18046c(byte b, byte b2) {
        return (b & 247) == 17 && (b2 & 240) == 32;
    }

    /* renamed from: d */
    private static boolean m18048d(byte b, byte b2) {
        return (b & 240) == 16 && (b2 & 192) == 64;
    }

    /* renamed from: e */
    private static boolean m18051e(byte b, byte b2) {
        return (b & 247) == 23 && b2 >= (byte) 33 && b2 <= (byte) 35;
    }

    /* renamed from: f */
    private static boolean m18054f(byte b, byte b2) {
        return (b & 247) == 20 && (b2 & 240) == 32;
    }

    /* renamed from: g */
    private static boolean m18055g(byte b) {
        return (b & 240) == 16;
    }

    public String getName() {
        return "Cea608Decoder";
    }

    public void release() {
    }

    /* renamed from: c */
    public /* bridge */ /* synthetic */ C4260d mo3737c() throws SubtitleDecoderException {
        return super.mo3737c();
    }

    /* renamed from: d */
    public /* bridge */ /* synthetic */ C4259c mo3738d() throws SubtitleDecoderException {
        return super.mo3738d();
    }

    public /* bridge */ /* synthetic */ void setPositionUs(long j) {
        super.setPositionUs(j);
    }

    public C4375a(String str, int i) {
        this.f14489i = "application/x-mp4-cea-608".equals(str) != null ? 2 : 3;
        switch (i) {
            case 3:
            case 4:
                this.f14490j = 2;
                break;
            default:
                this.f14490j = 1;
                break;
        }
        m18040a(0);
        m18053f();
    }

    public void flush() {
        super.flush();
        this.f14493m = null;
        this.f14494n = null;
        m18040a(0);
        m18044b(4);
        m18053f();
        this.f14497q = false;
        this.f14498r = (byte) 0;
        this.f14499s = (byte) 0;
    }

    /* renamed from: a */
    protected boolean mo3734a() {
        return this.f14493m != this.f14494n;
    }

    /* renamed from: b */
    protected Subtitle mo3735b() {
        this.f14494n = this.f14493m;
        return new C3702e(this.f14493m);
    }

    /* renamed from: a */
    protected void mo3733a(C4259c c4259c) {
        this.f14488h.m8383a(c4259c.b.array(), c4259c.b.limit());
        Object obj = null;
        boolean z = false;
        while (this.f14488h.m8385b() >= this.f14489i) {
            int i;
            if (this.f14489i == 2) {
                i = -4;
            } else {
                i = (byte) this.f14488h.m8395g();
            }
            byte g = (byte) (this.f14488h.m8395g() & 127);
            byte g2 = (byte) (this.f14488h.m8395g() & 127);
            if ((i & 6) == 4) {
                if (this.f14490j != 1 || (i & 1) == 0) {
                    if (this.f14490j != 2 || (i & 1) == 1) {
                        if (g != (byte) 0 || g2 != (byte) 0) {
                            if ((g & 247) == 17 && (g2 & 240) == 48) {
                                this.f14492l.m7925a(C4375a.m18047d(g2));
                            } else if ((g & 246) == 18 && (g2 & 224) == 32) {
                                this.f14492l.m7931b();
                                if ((g & 1) == 0) {
                                    this.f14492l.m7925a(C4375a.m18049e(g2));
                                } else {
                                    this.f14492l.m7925a(C4375a.m18052f(g2));
                                }
                            } else if ((g & 224) == 0) {
                                z = m18041a(g, g2);
                            } else {
                                this.f14492l.m7925a(C4375a.m18045c(g));
                                if ((g2 & 224) != 0) {
                                    this.f14492l.m7925a(C4375a.m18045c(g2));
                                }
                            }
                            obj = 1;
                        }
                    }
                }
            }
        }
        if (obj != null) {
            if (!z) {
                this.f14497q = null;
            }
            if (this.f14495o == 1 || this.f14495o == 3) {
                this.f14493m = m18050e();
            }
        }
    }

    /* renamed from: a */
    private boolean m18041a(byte b, byte b2) {
        boolean g = C4375a.m18055g(b);
        if (g) {
            if (this.f14497q && this.f14498r == b && this.f14499s == b2) {
                this.f14497q = false;
                return true;
            }
            this.f14497q = true;
            this.f14498r = b;
            this.f14499s = b2;
        }
        if (C4375a.m18046c(b, b2)) {
            m18039a(b2);
        } else if (C4375a.m18048d(b, b2)) {
            m18043b(b, b2);
        } else if (C4375a.m18051e(b, b2)) {
            this.f14492l.m7938e(b2 - 32);
        } else if (C4375a.m18054f(b, b2) != (byte) 0) {
            m18042b(b2);
        }
        return g;
    }

    /* renamed from: a */
    private void m18039a(byte b) {
        this.f14492l.m7929a((b & 1) == 1);
        b = (b >> (byte) 1) & 15;
        if (b == (byte) 7) {
            this.f14492l.m7928a(new StyleSpan(2), 2);
            this.f14492l.m7928a(new ForegroundColorSpan(-1), 1);
            return;
        }
        this.f14492l.m7928a(new ForegroundColorSpan(f14483c[b]), 1);
    }

    /* renamed from: b */
    private void m18043b(byte b, byte b2) {
        b = f14481a[b & (byte) 7];
        if (((b2 & 32) != 0 ? 1 : null) != null) {
            b++;
        }
        if (b != this.f14492l.m7933c()) {
            if (!(this.f14495o == 1 || this.f14492l.m7930a())) {
                this.f14492l = new C2219a(this.f14495o, this.f14496p);
                this.f14491k.add(this.f14492l);
            }
            this.f14492l.m7934c(b);
        }
        if ((b2 & 1) == (byte) 1) {
            this.f14492l.m7927a(new UnderlineSpan());
        }
        b = (b2 >> 1) & 15;
        if (b > (byte) 7) {
            this.f14492l.m7936d(f14482b[b & (byte) 7]);
        } else if (b == (byte) 7) {
            this.f14492l.m7927a(new StyleSpan(2));
            this.f14492l.m7927a(new ForegroundColorSpan(-1));
        } else {
            this.f14492l.m7927a(new ForegroundColorSpan(f14483c[b]));
        }
    }

    /* renamed from: b */
    private void m18042b(byte b) {
        if (b == (byte) 32) {
            m18040a(2);
        } else if (b != (byte) 41) {
            switch (b) {
                case (byte) 37:
                    m18040a(1);
                    m18044b(2);
                    return;
                case (byte) 38:
                    m18040a(1);
                    m18044b(3);
                    return;
                case (byte) 39:
                    m18040a(1);
                    m18044b((int) (byte) 4);
                    return;
                default:
                    if (this.f14495o != 0) {
                        if (b != (byte) 33) {
                            if (b != (byte) 36) {
                                switch (b) {
                                    case (byte) 44:
                                        this.f14493m = (byte) 0;
                                        if (this.f14495o == (byte) 1 || this.f14495o == (byte) 3) {
                                            m18053f();
                                            break;
                                        }
                                    case (byte) 45:
                                        if (this.f14495o == (byte) 1 && this.f14492l.m7930a() == (byte) 0) {
                                            this.f14492l.m7935d();
                                            break;
                                        }
                                    case (byte) 46:
                                        m18053f();
                                        break;
                                    case (byte) 47:
                                        this.f14493m = m18050e();
                                        m18053f();
                                        break;
                                    default:
                                        break;
                                }
                            }
                        }
                        this.f14492l.m7931b();
                        return;
                    }
                    return;
            }
        } else {
            m18040a(3);
        }
    }

    /* renamed from: e */
    private List<Cue> m18050e() {
        List<Cue> arrayList = new ArrayList();
        for (int i = 0; i < this.f14491k.size(); i++) {
            Cue f = ((C2219a) this.f14491k.get(i)).m7939f();
            if (f != null) {
                arrayList.add(f);
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    private void m18040a(int i) {
        if (this.f14495o != i) {
            int i2 = this.f14495o;
            this.f14495o = i;
            m18053f();
            if (i2 == 3 || i == 1 || i == 0) {
                this.f14493m = 0;
            }
        }
    }

    /* renamed from: b */
    private void m18044b(int i) {
        this.f14496p = i;
        this.f14492l.m7932b(i);
    }

    /* renamed from: f */
    private void m18053f() {
        this.f14492l.m7926a(this.f14495o);
        this.f14491k.clear();
        this.f14491k.add(this.f14492l);
    }

    /* renamed from: c */
    private static char m18045c(byte b) {
        return (char) f14484d[(b & 127) - 32];
    }

    /* renamed from: d */
    private static char m18047d(byte b) {
        return (char) f14485e[b & 15];
    }

    /* renamed from: e */
    private static char m18049e(byte b) {
        return (char) f14486f[b & 31];
    }

    /* renamed from: f */
    private static char m18052f(byte b) {
        return (char) f14487g[b & 31];
    }
}
