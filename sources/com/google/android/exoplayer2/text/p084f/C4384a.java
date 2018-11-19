package com.google.android.exoplayer2.text.p084f;

import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import com.google.android.exoplayer2.text.C4258a;
import com.google.android.exoplayer2.text.Cue;
import com.google.android.exoplayer2.text.Subtitle;
import com.google.android.exoplayer2.text.SubtitleDecoderException;
import com.google.android.exoplayer2.util.C2302k;
import com.google.android.exoplayer2.util.C2314v;
import java.nio.charset.Charset;
import java.util.List;

/* renamed from: com.google.android.exoplayer2.text.f.a */
public final class C4384a extends C4258a {
    /* renamed from: a */
    private static final int f14526a = C2314v.m8499g("styl");
    /* renamed from: b */
    private static final int f14527b = C2314v.m8499g("tbox");
    /* renamed from: c */
    private final C2302k f14528c = new C2302k();
    /* renamed from: d */
    private boolean f14529d;
    /* renamed from: e */
    private int f14530e;
    /* renamed from: f */
    private int f14531f;
    /* renamed from: g */
    private String f14532g;
    /* renamed from: h */
    private float f14533h;
    /* renamed from: i */
    private int f14534i;

    public C4384a(List<byte[]> list) {
        super("Tx3gDecoder");
        m18108a((List) list);
    }

    /* renamed from: a */
    private void m18108a(List<byte[]> list) {
        boolean z = false;
        if (list != null && list.size() == 1 && (((byte[]) list.get(0)).length == 48 || ((byte[]) list.get(0)).length == 53)) {
            byte[] bArr = (byte[]) list.get(0);
            this.f14530e = bArr[24];
            this.f14531f = ((((bArr[26] & 255) << 24) | ((bArr[27] & 255) << 16)) | ((bArr[28] & 255) << 8)) | (bArr[29] & 255);
            this.f14532g = "Serif".equals(new String(bArr, 43, bArr.length - 43)) ? "serif" : "sans-serif";
            this.f14534i = bArr[25] * 20;
            if ((bArr[0] & 32) != 0) {
                z = true;
            }
            this.f14529d = z;
            if (this.f14529d) {
                this.f14533h = ((float) ((bArr[11] & 255) | ((bArr[10] & 255) << 8))) / ((float) this.f14534i);
                this.f14533h = C2314v.m8454a(this.f14533h, 0.0f, 0.95f);
                return;
            }
            this.f14533h = 0.85f;
            return;
        }
        this.f14530e = 0;
        this.f14531f = -1;
        this.f14532g = "sans-serif";
        this.f14529d = false;
        this.f14533h = 0.85f;
    }

    /* renamed from: a */
    protected Subtitle mo3740a(byte[] bArr, int i, boolean z) throws SubtitleDecoderException {
        this.f14528c.m8383a(bArr, i);
        bArr = C4384a.m18104a(this.f14528c);
        if (bArr.isEmpty() != 0) {
            return C3707b.f11567a;
        }
        i = new SpannableStringBuilder(bArr);
        SpannableStringBuilder spannableStringBuilder = i;
        C4384a.m18105a(spannableStringBuilder, this.f14530e, 0, 0, i.length(), 16711680);
        C4384a.m18110b(spannableStringBuilder, this.f14531f, -1, 0, i.length(), 16711680);
        C4384a.m18106a(spannableStringBuilder, this.f14532g, "sans-serif", 0, i.length(), 16711680);
        float f = this.f14533h;
        while (this.f14528c.m8385b() >= true) {
            bArr = this.f14528c.m8389d();
            z = this.f14528c.m8403o();
            int o = this.f14528c.m8403o();
            boolean z2 = false;
            boolean z3 = true;
            if (o == f14526a) {
                if (this.f14528c.m8385b() < 2) {
                    z3 = false;
                }
                C4384a.m18109a(z3);
                o = this.f14528c.m8396h();
                int i2;
                while (i2 < o) {
                    m18107a(this.f14528c, i);
                    i2++;
                }
            } else if (o == f14527b && this.f14529d) {
                if (this.f14528c.m8385b() >= 2) {
                    z2 = true;
                }
                C4384a.m18109a(z2);
                f = C2314v.m8454a(((float) this.f14528c.m8396h()) / ((float) this.f14534i), 0.0f, 0.95f);
            }
            this.f14528c.m8388c(bArr + z);
        }
        return new C3707b(new Cue(i, null, f, 0, 0, Float.MIN_VALUE, Integer.MIN_VALUE, Float.MIN_VALUE));
    }

    /* renamed from: a */
    private static String m18104a(C2302k c2302k) throws SubtitleDecoderException {
        C4384a.m18109a(c2302k.m8385b() >= 2);
        int h = c2302k.m8396h();
        if (h == 0) {
            return "";
        }
        if (c2302k.m8385b() >= 2) {
            char f = c2302k.m8393f();
            if (f == '﻿' || f == '￾') {
                return c2302k.m8379a(h, Charset.forName("UTF-16"));
            }
        }
        return c2302k.m8379a(h, Charset.forName("UTF-8"));
    }

    /* renamed from: a */
    private void m18107a(C2302k c2302k, SpannableStringBuilder spannableStringBuilder) throws SubtitleDecoderException {
        C4384a.m18109a(c2302k.m8385b() >= 12);
        int h = c2302k.m8396h();
        int h2 = c2302k.m8396h();
        c2302k.m8390d(2);
        int g = c2302k.m8395g();
        c2302k.m8390d(1);
        c2302k = c2302k.m8403o();
        SpannableStringBuilder spannableStringBuilder2 = spannableStringBuilder;
        int i = h;
        int i2 = h2;
        C4384a.m18105a(spannableStringBuilder2, g, this.f14530e, i, i2, 0);
        C4384a.m18110b(spannableStringBuilder2, c2302k, this.f14531f, i, i2, 0);
    }

    /* renamed from: a */
    private static void m18105a(SpannableStringBuilder spannableStringBuilder, int i, int i2, int i3, int i4, int i5) {
        if (i != i2) {
            i2 = i5 | 33;
            int i6 = 1;
            i5 = (i & 1) != 0 ? 1 : 0;
            Object obj = (i & 2) != 0 ? 1 : null;
            if (i5 != 0) {
                if (obj != null) {
                    spannableStringBuilder.setSpan(new StyleSpan(3), i3, i4, i2);
                } else {
                    spannableStringBuilder.setSpan(new StyleSpan(1), i3, i4, i2);
                }
            } else if (obj != null) {
                spannableStringBuilder.setSpan(new StyleSpan(2), i3, i4, i2);
            }
            if ((i & 4) == 0) {
                i6 = 0;
            }
            if (i6 != 0) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), i3, i4, i2);
            }
            if (i6 == 0 && i5 == 0 && obj == null) {
                spannableStringBuilder.setSpan(new StyleSpan(0), i3, i4, i2);
            }
        }
    }

    /* renamed from: b */
    private static void m18110b(SpannableStringBuilder spannableStringBuilder, int i, int i2, int i3, int i4, int i5) {
        if (i != i2) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan((i >>> 8) | ((i & 255) << 24)), i3, i4, i5 | 33);
        }
    }

    /* renamed from: a */
    private static void m18106a(SpannableStringBuilder spannableStringBuilder, String str, String str2, int i, int i2, int i3) {
        if (str != str2) {
            spannableStringBuilder.setSpan(new TypefaceSpan(str), i, i2, i3 | 33);
        }
    }

    /* renamed from: a */
    private static void m18109a(boolean z) throws SubtitleDecoderException {
        if (!z) {
            throw new SubtitleDecoderException("Unexpected subtitle format.");
        }
    }
}
