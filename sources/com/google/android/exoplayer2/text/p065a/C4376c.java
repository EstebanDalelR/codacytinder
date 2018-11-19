package com.google.android.exoplayer2.text.p065a;

import android.graphics.Color;
import android.text.Layout.Alignment;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import android.util.Log;
import com.google.android.exoplayer2.text.C4259c;
import com.google.android.exoplayer2.text.C4260d;
import com.google.android.exoplayer2.text.Cue;
import com.google.android.exoplayer2.text.Subtitle;
import com.google.android.exoplayer2.text.SubtitleDecoderException;
import com.google.android.exoplayer2.util.C2289a;
import com.google.android.exoplayer2.util.C2301j;
import com.google.android.exoplayer2.util.C2302k;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/* renamed from: com.google.android.exoplayer2.text.a.c */
public final class C4376c extends C4257d {
    /* renamed from: a */
    private final C2302k f14500a = new C2302k();
    /* renamed from: b */
    private final C2301j f14501b = new C2301j();
    /* renamed from: c */
    private final int f14502c;
    /* renamed from: d */
    private final C2220a[] f14503d;
    /* renamed from: e */
    private C2220a f14504e;
    /* renamed from: f */
    private List<Cue> f14505f;
    /* renamed from: g */
    private List<Cue> f14506g;
    /* renamed from: h */
    private C2221b f14507h;
    /* renamed from: i */
    private int f14508i;

    /* renamed from: com.google.android.exoplayer2.text.a.c$a */
    private static final class C2220a {
        /* renamed from: a */
        public static final int f6465a = C2220a.m7940a(2, 2, 2, 0);
        /* renamed from: b */
        public static final int f6466b = C2220a.m7940a(0, 0, 0, 0);
        /* renamed from: c */
        public static final int f6467c = C2220a.m7940a(0, 0, 0, 3);
        /* renamed from: d */
        private static final int[] f6468d = new int[]{0, 0, 0, 0, 0, 2, 0};
        /* renamed from: e */
        private static final int[] f6469e = new int[]{0, 0, 0, 0, 0, 0, 2};
        /* renamed from: f */
        private static final int[] f6470f = new int[]{3, 3, 3, 3, 3, 3, 1};
        /* renamed from: g */
        private static final boolean[] f6471g = new boolean[]{false, false, false, true, true, true, false};
        /* renamed from: h */
        private static final int[] f6472h = new int[]{f6466b, f6467c, f6466b, f6466b, f6467c, f6466b, f6466b};
        /* renamed from: i */
        private static final int[] f6473i = new int[]{0, 1, 2, 3, 4, 3, 4};
        /* renamed from: j */
        private static final int[] f6474j = new int[]{0, 0, 0, 0, 0, 3, 3};
        /* renamed from: k */
        private static final int[] f6475k = new int[]{f6466b, f6466b, f6466b, f6466b, f6466b, f6467c, f6467c};
        /* renamed from: A */
        private int f6476A;
        /* renamed from: B */
        private int f6477B;
        /* renamed from: C */
        private int f6478C;
        /* renamed from: D */
        private int f6479D;
        /* renamed from: E */
        private int f6480E;
        /* renamed from: F */
        private int f6481F;
        /* renamed from: G */
        private int f6482G;
        /* renamed from: l */
        private final List<SpannableString> f6483l = new LinkedList();
        /* renamed from: m */
        private final SpannableStringBuilder f6484m = new SpannableStringBuilder();
        /* renamed from: n */
        private boolean f6485n;
        /* renamed from: o */
        private boolean f6486o;
        /* renamed from: p */
        private int f6487p;
        /* renamed from: q */
        private boolean f6488q;
        /* renamed from: r */
        private int f6489r;
        /* renamed from: s */
        private int f6490s;
        /* renamed from: t */
        private int f6491t;
        /* renamed from: u */
        private int f6492u;
        /* renamed from: v */
        private boolean f6493v;
        /* renamed from: w */
        private int f6494w;
        /* renamed from: x */
        private int f6495x;
        /* renamed from: y */
        private int f6496y;
        /* renamed from: z */
        private int f6497z;

        public C2220a() {
            m7950b();
        }

        /* renamed from: a */
        public boolean m7949a() {
            if (m7952d()) {
                if (!this.f6483l.isEmpty() || this.f6484m.length() != 0) {
                    return false;
                }
            }
            return true;
        }

        /* renamed from: b */
        public void m7950b() {
            m7951c();
            this.f6485n = false;
            this.f6486o = false;
            this.f6487p = 4;
            this.f6488q = false;
            this.f6489r = 0;
            this.f6490s = 0;
            this.f6491t = 0;
            this.f6492u = 15;
            this.f6493v = true;
            this.f6494w = 0;
            this.f6495x = 0;
            this.f6496y = 0;
            this.f6497z = f6466b;
            this.f6479D = f6465a;
            this.f6481F = f6466b;
        }

        /* renamed from: c */
        public void m7951c() {
            this.f6483l.clear();
            this.f6484m.clear();
            this.f6476A = -1;
            this.f6477B = -1;
            this.f6478C = -1;
            this.f6480E = -1;
            this.f6482G = 0;
        }

        /* renamed from: d */
        public boolean m7952d() {
            return this.f6485n;
        }

        /* renamed from: a */
        public void m7947a(boolean z) {
            this.f6486o = z;
        }

        /* renamed from: e */
        public boolean m7953e() {
            return this.f6486o;
        }

        /* renamed from: a */
        public void m7948a(boolean z, boolean z2, boolean z3, int i, boolean z4, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            boolean z5 = z2;
            int i9 = i7;
            int i10 = i8;
            this.f6485n = true;
            this.f6486o = z;
            this.f6493v = z5;
            this.f6487p = i;
            this.f6488q = z4;
            this.f6489r = i2;
            this.f6490s = i3;
            this.f6491t = i6;
            int i11 = i4 + 1;
            if (this.f6492u != i11) {
                r8.f6492u = i11;
                while (true) {
                    if ((!z5 || r8.f6483l.size() < r8.f6492u) && r8.f6483l.size() < 15) {
                        break;
                    }
                    r8.f6483l.remove(0);
                }
            }
            if (!(i9 == 0 || r8.f6495x == i9)) {
                r8.f6495x = i9;
                int i12 = i9 - 1;
                m7946a(f6472h[i12], f6467c, f6471g[i12], 0, f6469e[i12], f6470f[i12], f6468d[i12]);
            }
            if (i10 != 0 && r8.f6496y != i10) {
                r8.f6496y = i10;
                i10--;
                m7945a(0, 1, 1, false, false, f6474j[i10], f6473i[i10]);
                m7944a(f6465a, f6475k[i10], f6466b);
            }
        }

        /* renamed from: a */
        public void m7946a(int i, int i2, boolean z, int i3, int i4, int i5, int i6) {
            this.f6497z = i;
            this.f6494w = i6;
        }

        /* renamed from: a */
        public void m7945a(int i, int i2, int i3, boolean z, boolean z2, int i4, int i5) {
            if (this.f6476A != -1) {
                if (!z) {
                    this.f6484m.setSpan(new StyleSpan(2), this.f6476A, this.f6484m.length(), 33);
                    this.f6476A = -1;
                }
            } else if (z) {
                this.f6476A = this.f6484m.length();
            }
            if (this.f6477B != -1) {
                if (!z2) {
                    this.f6484m.setSpan(new UnderlineSpan(), this.f6477B, this.f6484m.length(), 33);
                    this.f6477B = -1;
                }
            } else if (z2) {
                this.f6477B = this.f6484m.length();
            }
        }

        /* renamed from: a */
        public void m7944a(int i, int i2, int i3) {
            if (!(this.f6478C == -1 || this.f6479D == i)) {
                this.f6484m.setSpan(new ForegroundColorSpan(this.f6479D), this.f6478C, this.f6484m.length(), 33);
            }
            if (i != f6465a) {
                this.f6478C = this.f6484m.length();
                this.f6479D = i;
            }
            if (!(this.f6480E == -1 || this.f6481F == i2)) {
                this.f6484m.setSpan(new BackgroundColorSpan(this.f6481F), this.f6480E, this.f6484m.length(), 33);
            }
            if (i2 != f6466b) {
                this.f6480E = this.f6484m.length();
                this.f6481F = i2;
            }
        }

        /* renamed from: a */
        public void m7943a(int i, int i2) {
            if (this.f6482G != i) {
                m7942a((char) 10);
            }
            this.f6482G = i;
        }

        /* renamed from: f */
        public void m7954f() {
            int length = this.f6484m.length();
            if (length > 0) {
                this.f6484m.delete(length - 1, length);
            }
        }

        /* renamed from: a */
        public void m7942a(char c) {
            if (c == '\n') {
                this.f6483l.add(m7955g());
                this.f6484m.clear();
                if (this.f6476A != '￿') {
                    this.f6476A = 0;
                }
                if (this.f6477B != '￿') {
                    this.f6477B = 0;
                }
                if (this.f6478C != '￿') {
                    this.f6478C = 0;
                }
                if (this.f6480E != '￿') {
                    this.f6480E = 0;
                }
                while (true) {
                    if ((this.f6493v != '\u0000' && this.f6483l.size() >= this.f6492u) || this.f6483l.size() >= '\u000f') {
                        this.f6483l.remove(0);
                    } else {
                        return;
                    }
                }
            }
            this.f6484m.append(c);
        }

        /* renamed from: g */
        public SpannableString m7955g() {
            CharSequence spannableStringBuilder = new SpannableStringBuilder(this.f6484m);
            int length = spannableStringBuilder.length();
            if (length > 0) {
                if (this.f6476A != -1) {
                    spannableStringBuilder.setSpan(new StyleSpan(2), this.f6476A, length, 33);
                }
                if (this.f6477B != -1) {
                    spannableStringBuilder.setSpan(new UnderlineSpan(), this.f6477B, length, 33);
                }
                if (this.f6478C != -1) {
                    spannableStringBuilder.setSpan(new ForegroundColorSpan(this.f6479D), this.f6478C, length, 33);
                }
                if (this.f6480E != -1) {
                    spannableStringBuilder.setSpan(new BackgroundColorSpan(this.f6481F), this.f6480E, length, 33);
                }
            }
            return new SpannableString(spannableStringBuilder);
        }

        /* renamed from: h */
        public C3701b m7956h() {
            if (m7949a()) {
                return null;
            }
            Alignment alignment;
            float f;
            float f2;
            CharSequence spannableStringBuilder = new SpannableStringBuilder();
            for (int i = 0; i < this.f6483l.size(); i++) {
                spannableStringBuilder.append((CharSequence) this.f6483l.get(i));
                spannableStringBuilder.append('\n');
            }
            spannableStringBuilder.append(m7955g());
            switch (this.f6494w) {
                case 0:
                case 3:
                    alignment = Alignment.ALIGN_NORMAL;
                    break;
                case 1:
                    alignment = Alignment.ALIGN_OPPOSITE;
                    break;
                case 2:
                    alignment = Alignment.ALIGN_CENTER;
                    break;
                default:
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("Unexpected justification value: ");
                    stringBuilder.append(this.f6494w);
                    throw new IllegalArgumentException(stringBuilder.toString());
            }
            Alignment alignment2 = alignment;
            if (this.f6488q) {
                f = ((float) this.f6490s) / 99.0f;
                f2 = ((float) this.f6489r) / 99.0f;
            } else {
                f = ((float) this.f6490s) / 209.0f;
                f2 = ((float) this.f6489r) / 74.0f;
            }
            float f3 = (f * 0.9f) + 0.05f;
            float f4 = (f2 * 0.9f) + 0.05f;
            int i2 = this.f6491t % 3 == 0 ? 0 : this.f6491t % 3 == 1 ? 1 : 2;
            int i3 = this.f6491t / 3 == 0 ? 0 : this.f6491t / 3 == 1 ? 1 : 2;
            return new C3701b(spannableStringBuilder, alignment2, f4, 0, i2, f3, i3, Float.MIN_VALUE, this.f6497z != f6466b, this.f6497z, this.f6487p);
        }

        /* renamed from: b */
        public static int m7941b(int i, int i2, int i3) {
            return C2220a.m7940a(i, i2, i3, 0);
        }

        /* renamed from: a */
        public static int m7940a(int i, int i2, int i3, int i4) {
            C2289a.m8308a(i, 0, 4);
            C2289a.m8308a(i2, 0, 4);
            C2289a.m8308a(i3, 0, 4);
            C2289a.m8308a(i4, 0, 4);
            int i5 = 255;
            switch (i4) {
                case 2:
                    i4 = 127;
                    break;
                case 3:
                    i4 = 0;
                    break;
                default:
                    i4 = 255;
                    break;
            }
            i = i > 1 ? 255 : 0;
            i2 = i2 > 1 ? 255 : 0;
            if (i3 <= 1) {
                i5 = 0;
            }
            return Color.argb(i4, i, i2, i5);
        }
    }

    /* renamed from: com.google.android.exoplayer2.text.a.c$b */
    private static final class C2221b {
        /* renamed from: a */
        public final int f6498a;
        /* renamed from: b */
        public final int f6499b;
        /* renamed from: c */
        public final byte[] f6500c;
        /* renamed from: d */
        int f6501d = 0;

        public C2221b(int i, int i2) {
            this.f6498a = i;
            this.f6499b = i2;
            this.f6500c = new byte[((i2 * 2) - 1)];
        }
    }

    public String getName() {
        return "Cea708Decoder";
    }

    /* renamed from: c */
    public /* bridge */ /* synthetic */ C4260d mo3737c() throws SubtitleDecoderException {
        return super.mo3737c();
    }

    /* renamed from: d */
    public /* bridge */ /* synthetic */ C4259c mo3738d() throws SubtitleDecoderException {
        return super.mo3738d();
    }

    public /* bridge */ /* synthetic */ void release() {
        super.release();
    }

    public /* bridge */ /* synthetic */ void setPositionUs(long j) {
        super.setPositionUs(j);
    }

    public C4376c(int i) {
        if (i == -1) {
            i = 1;
        }
        this.f14502c = i;
        this.f14503d = new C2220a[8];
        for (int i2 = 0; i2 < 8; i2++) {
            this.f14503d[i2] = new C2220a();
        }
        this.f14504e = this.f14503d[0];
        m18078l();
    }

    public void flush() {
        super.flush();
        this.f14505f = null;
        this.f14506g = null;
        this.f14508i = 0;
        this.f14504e = this.f14503d[this.f14508i];
        m18078l();
        this.f14507h = null;
    }

    /* renamed from: a */
    protected boolean mo3734a() {
        return this.f14505f != this.f14506g;
    }

    /* renamed from: b */
    protected Subtitle mo3735b() {
        this.f14506g = this.f14505f;
        return new C3702e(this.f14505f);
    }

    /* renamed from: a */
    protected void mo3733a(C4259c c4259c) {
        this.f14500a.m8383a(c4259c.b.array(), c4259c.b.limit());
        while (this.f14500a.m8385b() >= 3) {
            c4259c = this.f14500a.m8395g() & 7;
            int i = c4259c & 3;
            boolean z = false;
            c4259c = (c4259c & 4) == 4 ? true : null;
            byte g = (byte) this.f14500a.m8395g();
            byte g2 = (byte) this.f14500a.m8395g();
            if (i == 2 || i == 3) {
                if (c4259c != null) {
                    C2221b c2221b;
                    if (i == 3) {
                        m18066e();
                        c4259c = (g & 192) >> 6;
                        int i2 = g & 63;
                        if (i2 == 0) {
                            i2 = 64;
                        }
                        this.f14507h = new C2221b(c4259c, i2);
                        c4259c = this.f14507h.f6500c;
                        c2221b = this.f14507h;
                        i = c2221b.f6501d;
                        c2221b.f6501d = i + 1;
                        c4259c[i] = g2;
                    } else {
                        if (i == 2) {
                            z = true;
                        }
                        C2289a.m8311a(z);
                        if (this.f14507h == null) {
                            Log.e("Cea708Decoder", "Encountered DTVCC_PACKET_DATA before DTVCC_PACKET_START");
                        } else {
                            c4259c = this.f14507h.f6500c;
                            c2221b = this.f14507h;
                            i = c2221b.f6501d;
                            c2221b.f6501d = i + 1;
                            c4259c[i] = g;
                            c4259c = this.f14507h.f6500c;
                            c2221b = this.f14507h;
                            i = c2221b.f6501d;
                            c2221b.f6501d = i + 1;
                            c4259c[i] = g2;
                        }
                    }
                    if (this.f14507h.f6501d == (this.f14507h.f6499b * 2) - 1) {
                        m18066e();
                    }
                }
            }
        }
    }

    /* renamed from: e */
    private void m18066e() {
        if (this.f14507h != null) {
            m18068f();
            this.f14507h = null;
        }
    }

    /* renamed from: f */
    private void m18068f() {
        if (this.f14507h.f6501d != (this.f14507h.f6499b * 2) - 1) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("DtvCcPacket ended prematurely; size is ");
            stringBuilder.append((this.f14507h.f6499b * 2) - 1);
            stringBuilder.append(", but current index is ");
            stringBuilder.append(this.f14507h.f6501d);
            stringBuilder.append(" (sequence number ");
            stringBuilder.append(this.f14507h.f6498a);
            stringBuilder.append("); ignoring packet");
            Log.w("Cea708Decoder", stringBuilder.toString());
            return;
        }
        this.f14501b.m8367a(this.f14507h.f6500c, this.f14507h.f6501d);
        int c = this.f14501b.m8373c(3);
        int c2 = this.f14501b.m8373c(5);
        if (c == 7) {
            this.f14501b.m8370b(2);
            c += this.f14501b.m8373c(6);
        }
        if (c2 == 0) {
            if (c != 0) {
                StringBuilder stringBuilder2 = new StringBuilder();
                stringBuilder2.append("serviceNumber is non-zero (");
                stringBuilder2.append(c);
                stringBuilder2.append(") when blockSize is 0");
                Log.w("Cea708Decoder", stringBuilder2.toString());
            }
        } else if (c == this.f14502c) {
            Object obj = null;
            while (this.f14501b.m8363a() > 0) {
                c2 = this.f14501b.m8373c(8);
                StringBuilder stringBuilder3;
                if (c2 == 16) {
                    c2 = this.f14501b.m8373c(8);
                    if (c2 <= 31) {
                        m18064c(c2);
                    } else if (c2 <= 127) {
                        m18071g(c2);
                    } else if (c2 <= 159) {
                        m18065d(c2);
                    } else if (c2 <= 255) {
                        m18073h(c2);
                    } else {
                        stringBuilder3 = new StringBuilder();
                        stringBuilder3.append("Invalid extended command: ");
                        stringBuilder3.append(c2);
                        Log.w("Cea708Decoder", stringBuilder3.toString());
                    }
                } else if (c2 <= 31) {
                    m18062a(c2);
                } else if (c2 <= 127) {
                    m18067e(c2);
                } else if (c2 <= 159) {
                    m18063b(c2);
                } else if (c2 <= 255) {
                    m18069f(c2);
                } else {
                    stringBuilder3 = new StringBuilder();
                    stringBuilder3.append("Invalid base command: ");
                    stringBuilder3.append(c2);
                    Log.w("Cea708Decoder", stringBuilder3.toString());
                }
                obj = 1;
            }
            if (obj != null) {
                this.f14505f = m18077k();
            }
        }
    }

    /* renamed from: a */
    private void m18062a(int i) {
        if (i == 0) {
            return;
        }
        if (i == 3) {
            this.f14505f = m18077k();
        } else if (i != 8) {
            switch (i) {
                case 12:
                    m18078l();
                    return;
                case 13:
                    this.f14504e.m7942a('\n');
                    return;
                case 14:
                    return;
                default:
                    if (i >= 17 && i <= 23) {
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("Currently unsupported COMMAND_EXT1 Command: ");
                        stringBuilder.append(i);
                        Log.w("Cea708Decoder", stringBuilder.toString());
                        this.f14501b.m8370b(8);
                        return;
                    } else if (i < 24 || i > 31) {
                        r1 = new StringBuilder();
                        r1.append("Invalid C0 command: ");
                        r1.append(i);
                        Log.w("Cea708Decoder", r1.toString());
                        return;
                    } else {
                        r1 = new StringBuilder();
                        r1.append("Currently unsupported COMMAND_P16 Command: ");
                        r1.append(i);
                        Log.w("Cea708Decoder", r1.toString());
                        this.f14501b.m8370b(16);
                        return;
                    }
            }
        } else {
            this.f14504e.m7954f();
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: b */
    private void m18063b(int r5) {
        /*
        r4 = this;
        r0 = 16;
        r1 = 8;
        r2 = 1;
        switch(r5) {
            case 128: goto L_0x010c;
            case 129: goto L_0x010c;
            case 130: goto L_0x010c;
            case 131: goto L_0x010c;
            case 132: goto L_0x010c;
            case 133: goto L_0x010c;
            case 134: goto L_0x010c;
            case 135: goto L_0x010c;
            case 136: goto L_0x00f6;
            case 137: goto L_0x00df;
            case 138: goto L_0x00c8;
            case 139: goto L_0x00ac;
            case 140: goto L_0x0096;
            case 141: goto L_0x008f;
            case 142: goto L_0x011a;
            case 143: goto L_0x008a;
            case 144: goto L_0x0076;
            case 145: goto L_0x0060;
            case 146: goto L_0x004c;
            default: goto L_0x0008;
        };
    L_0x0008:
        switch(r5) {
            case 151: goto L_0x0036;
            case 152: goto L_0x0023;
            case 153: goto L_0x0023;
            case 154: goto L_0x0023;
            case 155: goto L_0x0023;
            case 156: goto L_0x0023;
            case 157: goto L_0x0023;
            case 158: goto L_0x0023;
            case 159: goto L_0x0023;
            default: goto L_0x000b;
        };
    L_0x000b:
        r0 = "Cea708Decoder";
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = "Invalid C1 command: ";
        r1.append(r2);
        r1.append(r5);
        r5 = r1.toString();
        android.util.Log.w(r0, r5);
        goto L_0x011a;
    L_0x0023:
        r5 = r5 + -152;
        r4.m18075i(r5);
        r0 = r4.f14508i;
        if (r0 == r5) goto L_0x011a;
    L_0x002c:
        r4.f14508i = r5;
        r0 = r4.f14503d;
        r5 = r0[r5];
        r4.f14504e = r5;
        goto L_0x011a;
    L_0x0036:
        r5 = r4.f14504e;
        r5 = r5.m7952d();
        if (r5 != 0) goto L_0x0047;
    L_0x003e:
        r5 = r4.f14501b;
        r0 = 32;
        r5.m8370b(r0);
        goto L_0x011a;
    L_0x0047:
        r4.m18076j();
        goto L_0x011a;
    L_0x004c:
        r5 = r4.f14504e;
        r5 = r5.m7952d();
        if (r5 != 0) goto L_0x005b;
    L_0x0054:
        r5 = r4.f14501b;
        r5.m8370b(r0);
        goto L_0x011a;
    L_0x005b:
        r4.m18074i();
        goto L_0x011a;
    L_0x0060:
        r5 = r4.f14504e;
        r5 = r5.m7952d();
        if (r5 != 0) goto L_0x0071;
    L_0x0068:
        r5 = r4.f14501b;
        r0 = 24;
        r5.m8370b(r0);
        goto L_0x011a;
    L_0x0071:
        r4.m18072h();
        goto L_0x011a;
    L_0x0076:
        r5 = r4.f14504e;
        r5 = r5.m7952d();
        if (r5 != 0) goto L_0x0085;
    L_0x007e:
        r5 = r4.f14501b;
        r5.m8370b(r0);
        goto L_0x011a;
    L_0x0085:
        r4.m18070g();
        goto L_0x011a;
    L_0x008a:
        r4.m18078l();
        goto L_0x011a;
    L_0x008f:
        r5 = r4.f14501b;
        r5.m8370b(r1);
        goto L_0x011a;
    L_0x0096:
        if (r2 > r1) goto L_0x011a;
    L_0x0098:
        r5 = r4.f14501b;
        r5 = r5.m8376e();
        if (r5 == 0) goto L_0x00a9;
    L_0x00a0:
        r5 = r4.f14503d;
        r0 = 8 - r2;
        r5 = r5[r0];
        r5.m7950b();
    L_0x00a9:
        r2 = r2 + 1;
        goto L_0x0096;
    L_0x00ac:
        r5 = 1;
    L_0x00ad:
        if (r5 > r1) goto L_0x011a;
    L_0x00af:
        r0 = r4.f14501b;
        r0 = r0.m8376e();
        if (r0 == 0) goto L_0x00c5;
    L_0x00b7:
        r0 = r4.f14503d;
        r3 = 8 - r5;
        r0 = r0[r3];
        r3 = r0.m7953e();
        r3 = r3 ^ r2;
        r0.m7947a(r3);
    L_0x00c5:
        r5 = r5 + 1;
        goto L_0x00ad;
    L_0x00c8:
        if (r2 > r1) goto L_0x011a;
    L_0x00ca:
        r5 = r4.f14501b;
        r5 = r5.m8376e();
        if (r5 == 0) goto L_0x00dc;
    L_0x00d2:
        r5 = r4.f14503d;
        r0 = 8 - r2;
        r5 = r5[r0];
        r0 = 0;
        r5.m7947a(r0);
    L_0x00dc:
        r2 = r2 + 1;
        goto L_0x00c8;
    L_0x00df:
        r5 = 1;
    L_0x00e0:
        if (r5 > r1) goto L_0x011a;
    L_0x00e2:
        r0 = r4.f14501b;
        r0 = r0.m8376e();
        if (r0 == 0) goto L_0x00f3;
    L_0x00ea:
        r0 = r4.f14503d;
        r3 = 8 - r5;
        r0 = r0[r3];
        r0.m7947a(r2);
    L_0x00f3:
        r5 = r5 + 1;
        goto L_0x00e0;
    L_0x00f6:
        if (r2 > r1) goto L_0x011a;
    L_0x00f8:
        r5 = r4.f14501b;
        r5 = r5.m8376e();
        if (r5 == 0) goto L_0x0109;
    L_0x0100:
        r5 = r4.f14503d;
        r0 = 8 - r2;
        r5 = r5[r0];
        r5.m7951c();
    L_0x0109:
        r2 = r2 + 1;
        goto L_0x00f6;
    L_0x010c:
        r5 = r5 + -128;
        r0 = r4.f14508i;
        if (r0 == r5) goto L_0x011a;
    L_0x0112:
        r4.f14508i = r5;
        r0 = r4.f14503d;
        r5 = r0[r5];
        r4.f14504e = r5;
    L_0x011a:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.text.a.c.b(int):void");
    }

    /* renamed from: c */
    private void m18064c(int i) {
        if (i > 7) {
            if (i <= 15) {
                this.f14501b.m8370b(8);
            } else if (i <= 23) {
                this.f14501b.m8370b(16);
            } else if (i <= 31) {
                this.f14501b.m8370b(24);
            }
        }
    }

    /* renamed from: d */
    private void m18065d(int i) {
        if (i <= 135) {
            this.f14501b.m8370b(32);
        } else if (i <= 143) {
            this.f14501b.m8370b(40);
        } else if (i <= 159) {
            this.f14501b.m8370b(2);
            this.f14501b.m8370b(this.f14501b.m8373c(6) * 8);
        }
    }

    /* renamed from: e */
    private void m18067e(int i) {
        if (i == 127) {
            this.f14504e.m7942a('♫');
        } else {
            this.f14504e.m7942a((char) (i & 255));
        }
    }

    /* renamed from: f */
    private void m18069f(int i) {
        this.f14504e.m7942a((char) (i & 255));
    }

    /* renamed from: g */
    private void m18071g(int i) {
        if (i == 37) {
            this.f14504e.m7942a('…');
        } else if (i == 42) {
            this.f14504e.m7942a('Š');
        } else if (i == 44) {
            this.f14504e.m7942a('Œ');
        } else if (i != 63) {
            switch (i) {
                case 32:
                    this.f14504e.m7942a(' ');
                    return;
                case 33:
                    this.f14504e.m7942a(' ');
                    return;
                default:
                    switch (i) {
                        case 48:
                            this.f14504e.m7942a('█');
                            return;
                        case 49:
                            this.f14504e.m7942a('‘');
                            return;
                        case 50:
                            this.f14504e.m7942a('’');
                            return;
                        case 51:
                            this.f14504e.m7942a('“');
                            return;
                        case 52:
                            this.f14504e.m7942a('”');
                            return;
                        case 53:
                            this.f14504e.m7942a('•');
                            return;
                        default:
                            switch (i) {
                                case 57:
                                    this.f14504e.m7942a('™');
                                    return;
                                case 58:
                                    this.f14504e.m7942a('š');
                                    return;
                                default:
                                    switch (i) {
                                        case 60:
                                            this.f14504e.m7942a('œ');
                                            return;
                                        case 61:
                                            this.f14504e.m7942a('℠');
                                            return;
                                        default:
                                            switch (i) {
                                                case 118:
                                                    this.f14504e.m7942a('⅛');
                                                    return;
                                                case 119:
                                                    this.f14504e.m7942a('⅜');
                                                    return;
                                                case 120:
                                                    this.f14504e.m7942a('⅝');
                                                    return;
                                                case 121:
                                                    this.f14504e.m7942a('⅞');
                                                    return;
                                                case 122:
                                                    this.f14504e.m7942a('│');
                                                    return;
                                                case 123:
                                                    this.f14504e.m7942a('┐');
                                                    return;
                                                case 124:
                                                    this.f14504e.m7942a('└');
                                                    return;
                                                case 125:
                                                    this.f14504e.m7942a('─');
                                                    return;
                                                case 126:
                                                    this.f14504e.m7942a('┘');
                                                    return;
                                                case 127:
                                                    this.f14504e.m7942a('┌');
                                                    return;
                                                default:
                                                    StringBuilder stringBuilder = new StringBuilder();
                                                    stringBuilder.append("Invalid G2 character: ");
                                                    stringBuilder.append(i);
                                                    Log.w("Cea708Decoder", stringBuilder.toString());
                                                    return;
                                            }
                                    }
                            }
                    }
            }
        } else {
            this.f14504e.m7942a('Ÿ');
        }
    }

    /* renamed from: h */
    private void m18073h(int i) {
        if (i == 160) {
            this.f14504e.m7942a('㏄');
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Invalid G3 character: ");
        stringBuilder.append(i);
        Log.w("Cea708Decoder", stringBuilder.toString());
        this.f14504e.m7942a('_');
    }

    /* renamed from: g */
    private void m18070g() {
        this.f14504e.m7945a(this.f14501b.m8373c(4), this.f14501b.m8373c(2), this.f14501b.m8373c(2), this.f14501b.m8376e(), this.f14501b.m8376e(), this.f14501b.m8373c(3), this.f14501b.m8373c(3));
    }

    /* renamed from: h */
    private void m18072h() {
        int a = C2220a.m7940a(this.f14501b.m8373c(2), this.f14501b.m8373c(2), this.f14501b.m8373c(2), this.f14501b.m8373c(2));
        int a2 = C2220a.m7940a(this.f14501b.m8373c(2), this.f14501b.m8373c(2), this.f14501b.m8373c(2), this.f14501b.m8373c(2));
        this.f14501b.m8370b(2);
        this.f14504e.m7944a(a, a2, C2220a.m7941b(this.f14501b.m8373c(2), this.f14501b.m8373c(2), this.f14501b.m8373c(2)));
    }

    /* renamed from: i */
    private void m18074i() {
        this.f14501b.m8370b(4);
        int c = this.f14501b.m8373c(4);
        this.f14501b.m8370b(2);
        this.f14504e.m7943a(c, this.f14501b.m8373c(6));
    }

    /* renamed from: j */
    private void m18076j() {
        int a = C2220a.m7940a(this.f14501b.m8373c(2), this.f14501b.m8373c(2), this.f14501b.m8373c(2), this.f14501b.m8373c(2));
        int c = this.f14501b.m8373c(2);
        int b = C2220a.m7941b(this.f14501b.m8373c(2), this.f14501b.m8373c(2), this.f14501b.m8373c(2));
        if (this.f14501b.m8376e()) {
            c |= 4;
        }
        int i = c;
        boolean e = this.f14501b.m8376e();
        int c2 = this.f14501b.m8373c(2);
        int c3 = this.f14501b.m8373c(2);
        int c4 = this.f14501b.m8373c(2);
        this.f14501b.m8370b(8);
        this.f14504e.m7946a(a, b, e, i, c2, c3, c4);
    }

    /* renamed from: i */
    private void m18075i(int i) {
        C2220a c2220a = this.f14503d[i];
        this.f14501b.m8370b(2);
        boolean e = this.f14501b.m8376e();
        boolean e2 = this.f14501b.m8376e();
        boolean e3 = this.f14501b.m8376e();
        i = this.f14501b.m8373c(3);
        boolean e4 = this.f14501b.m8376e();
        int c = this.f14501b.m8373c(7);
        int c2 = this.f14501b.m8373c(8);
        int c3 = this.f14501b.m8373c(4);
        int c4 = this.f14501b.m8373c(4);
        this.f14501b.m8370b(2);
        int c5 = this.f14501b.m8373c(6);
        this.f14501b.m8370b(2);
        c2220a.m7948a(e, e2, e3, i, e4, c, c2, c4, c5, c3, this.f14501b.m8373c(3), this.f14501b.m8373c(3));
    }

    /* renamed from: k */
    private List<Cue> m18077k() {
        List arrayList = new ArrayList();
        int i = 0;
        while (i < 8) {
            if (!this.f14503d[i].m7949a() && this.f14503d[i].m7953e()) {
                arrayList.add(this.f14503d[i].m7956h());
            }
            i++;
        }
        Collections.sort(arrayList);
        return Collections.unmodifiableList(arrayList);
    }

    /* renamed from: l */
    private void m18078l() {
        for (int i = 0; i < 8; i++) {
            this.f14503d[i].m7950b();
        }
    }
}
