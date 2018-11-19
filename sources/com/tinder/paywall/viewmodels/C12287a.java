package com.tinder.paywall.viewmodels;

import android.graphics.drawable.Drawable;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.tinder.paywall.viewmodels.C10087i.C10086a;

/* renamed from: com.tinder.paywall.viewmodels.a */
final class C12287a extends C10087i {
    /* renamed from: a */
    private final Drawable f39750a;
    /* renamed from: b */
    private final Drawable f39751b;
    /* renamed from: c */
    private final Drawable f39752c;
    /* renamed from: d */
    private final Drawable f39753d;
    /* renamed from: e */
    private final Integer f39754e;
    /* renamed from: f */
    private final Integer f39755f;
    /* renamed from: g */
    private final Integer f39756g;
    /* renamed from: h */
    private final Integer f39757h;
    /* renamed from: i */
    private final Integer f39758i;
    /* renamed from: j */
    private final Integer f39759j;
    /* renamed from: k */
    private final Integer f39760k;
    /* renamed from: l */
    private final Integer f39761l;
    /* renamed from: m */
    private final Integer f39762m;
    /* renamed from: n */
    private final Integer f39763n;

    /* renamed from: com.tinder.paywall.viewmodels.a$a */
    static final class C12286a extends C10086a {
        /* renamed from: a */
        private Drawable f39736a;
        /* renamed from: b */
        private Drawable f39737b;
        /* renamed from: c */
        private Drawable f39738c;
        /* renamed from: d */
        private Drawable f39739d;
        /* renamed from: e */
        private Integer f39740e;
        /* renamed from: f */
        private Integer f39741f;
        /* renamed from: g */
        private Integer f39742g;
        /* renamed from: h */
        private Integer f39743h;
        /* renamed from: i */
        private Integer f39744i;
        /* renamed from: j */
        private Integer f39745j;
        /* renamed from: k */
        private Integer f39746k;
        /* renamed from: l */
        private Integer f39747l;
        /* renamed from: m */
        private Integer f39748m;
        /* renamed from: n */
        private Integer f39749n;

        C12286a() {
        }

        /* renamed from: a */
        public C10086a mo10738a(@Nullable Drawable drawable) {
            this.f39736a = drawable;
            return this;
        }

        /* renamed from: b */
        public C10086a mo10741b(Drawable drawable) {
            this.f39737b = drawable;
            return this;
        }

        /* renamed from: c */
        public C10086a mo10743c(Drawable drawable) {
            this.f39738c = drawable;
            return this;
        }

        /* renamed from: d */
        public C10086a mo10745d(Drawable drawable) {
            this.f39739d = drawable;
            return this;
        }

        /* renamed from: a */
        public C10086a mo10739a(Integer num) {
            this.f39740e = num;
            return this;
        }

        /* renamed from: b */
        public C10086a mo10742b(Integer num) {
            this.f39741f = num;
            return this;
        }

        /* renamed from: c */
        public C10086a mo10744c(Integer num) {
            this.f39742g = num;
            return this;
        }

        /* renamed from: d */
        public C10086a mo10746d(Integer num) {
            this.f39743h = num;
            return this;
        }

        /* renamed from: e */
        public C10086a mo10747e(Integer num) {
            this.f39744i = num;
            return this;
        }

        /* renamed from: f */
        public C10086a mo10748f(Integer num) {
            this.f39745j = num;
            return this;
        }

        /* renamed from: g */
        public C10086a mo10749g(Integer num) {
            this.f39746k = num;
            return this;
        }

        /* renamed from: h */
        public C10086a mo10750h(Integer num) {
            this.f39747l = num;
            return this;
        }

        /* renamed from: i */
        public C10086a mo10751i(Integer num) {
            this.f39748m = num;
            return this;
        }

        /* renamed from: j */
        public C10086a mo10752j(Integer num) {
            this.f39749n = num;
            return this;
        }

        /* renamed from: a */
        public C10087i mo10740a() {
            String str = "";
            if (this.f39737b == null) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(" itemEnabled");
                str = stringBuilder.toString();
            }
            if (r0.f39738c == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(" itemDisabled");
                str = stringBuilder.toString();
            }
            if (r0.f39739d == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(" highlightInfoBackground");
                str = stringBuilder.toString();
            }
            if (r0.f39740e == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(" disabledFontColor");
                str = stringBuilder.toString();
            }
            if (r0.f39741f == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(" disabledBackgroundColor");
                str = stringBuilder.toString();
            }
            if (r0.f39742g == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(" disabledPriceFontColor");
                str = stringBuilder.toString();
            }
            if (r0.f39743h == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(" disabledPriceBackgroundColor");
                str = stringBuilder.toString();
            }
            if (r0.f39744i == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(" enabledFontColor");
                str = stringBuilder.toString();
            }
            if (r0.f39745j == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(" enabledBackgroundColor");
                str = stringBuilder.toString();
            }
            if (r0.f39746k == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(" enabledPriceFontColor");
                str = stringBuilder.toString();
            }
            if (r0.f39747l == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(" enabledPriceBackgroundColor");
                str = stringBuilder.toString();
            }
            if (r0.f39748m == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(" discountEnabledFontColor");
                str = stringBuilder.toString();
            }
            if (r0.f39749n == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(" discountDisabledFontColor");
                str = stringBuilder.toString();
            }
            if (str.isEmpty()) {
                return new C12287a(r0.f39736a, r0.f39737b, r0.f39738c, r0.f39739d, r0.f39740e, r0.f39741f, r0.f39742g, r0.f39743h, r0.f39744i, r0.f39745j, r0.f39746k, r0.f39747l, r0.f39748m, r0.f39749n);
            }
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append("Missing required properties:");
            stringBuilder2.append(str);
            throw new IllegalStateException(stringBuilder2.toString());
        }
    }

    private C12287a(@Nullable Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7, Integer num8, Integer num9, Integer num10) {
        this.f39750a = drawable;
        this.f39751b = drawable2;
        this.f39752c = drawable3;
        this.f39753d = drawable4;
        this.f39754e = num;
        this.f39755f = num2;
        this.f39756g = num3;
        this.f39757h = num4;
        this.f39758i = num5;
        this.f39759j = num6;
        this.f39760k = num7;
        this.f39761l = num8;
        this.f39762m = num9;
        this.f39763n = num10;
    }

    @Nullable
    /* renamed from: a */
    public Drawable mo10753a() {
        return this.f39750a;
    }

    @NonNull
    /* renamed from: b */
    public Drawable mo10754b() {
        return this.f39751b;
    }

    @NonNull
    /* renamed from: c */
    public Drawable mo10755c() {
        return this.f39752c;
    }

    @NonNull
    /* renamed from: d */
    public Drawable mo10756d() {
        return this.f39753d;
    }

    @NonNull
    /* renamed from: e */
    public Integer mo10757e() {
        return this.f39754e;
    }

    @NonNull
    /* renamed from: f */
    public Integer mo10758f() {
        return this.f39755f;
    }

    @NonNull
    /* renamed from: g */
    public Integer mo10759g() {
        return this.f39756g;
    }

    @NonNull
    /* renamed from: h */
    public Integer mo10760h() {
        return this.f39757h;
    }

    @NonNull
    /* renamed from: i */
    public Integer mo10761i() {
        return this.f39758i;
    }

    @NonNull
    /* renamed from: j */
    public Integer mo10762j() {
        return this.f39759j;
    }

    @NonNull
    /* renamed from: k */
    public Integer mo10763k() {
        return this.f39760k;
    }

    @NonNull
    /* renamed from: l */
    public Integer mo10764l() {
        return this.f39761l;
    }

    @NonNull
    /* renamed from: m */
    public Integer mo10765m() {
        return this.f39762m;
    }

    @NonNull
    /* renamed from: n */
    public Integer mo10766n() {
        return this.f39763n;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("PaywallItemUiElements{baseItemEnabled=");
        stringBuilder.append(this.f39750a);
        stringBuilder.append(", itemEnabled=");
        stringBuilder.append(this.f39751b);
        stringBuilder.append(", itemDisabled=");
        stringBuilder.append(this.f39752c);
        stringBuilder.append(", highlightInfoBackground=");
        stringBuilder.append(this.f39753d);
        stringBuilder.append(", disabledFontColor=");
        stringBuilder.append(this.f39754e);
        stringBuilder.append(", disabledBackgroundColor=");
        stringBuilder.append(this.f39755f);
        stringBuilder.append(", disabledPriceFontColor=");
        stringBuilder.append(this.f39756g);
        stringBuilder.append(", disabledPriceBackgroundColor=");
        stringBuilder.append(this.f39757h);
        stringBuilder.append(", enabledFontColor=");
        stringBuilder.append(this.f39758i);
        stringBuilder.append(", enabledBackgroundColor=");
        stringBuilder.append(this.f39759j);
        stringBuilder.append(", enabledPriceFontColor=");
        stringBuilder.append(this.f39760k);
        stringBuilder.append(", enabledPriceBackgroundColor=");
        stringBuilder.append(this.f39761l);
        stringBuilder.append(", discountEnabledFontColor=");
        stringBuilder.append(this.f39762m);
        stringBuilder.append(", discountDisabledFontColor=");
        stringBuilder.append(this.f39763n);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r5) {
        /*
        r4 = this;
        r0 = 1;
        if (r5 != r4) goto L_0x0004;
    L_0x0003:
        return r0;
    L_0x0004:
        r1 = r5 instanceof com.tinder.paywall.viewmodels.C10087i;
        r2 = 0;
        if (r1 == 0) goto L_0x00c1;
    L_0x0009:
        r5 = (com.tinder.paywall.viewmodels.C10087i) r5;
        r1 = r4.f39750a;
        if (r1 != 0) goto L_0x0016;
    L_0x000f:
        r1 = r5.mo10753a();
        if (r1 != 0) goto L_0x00bf;
    L_0x0015:
        goto L_0x0022;
    L_0x0016:
        r1 = r4.f39750a;
        r3 = r5.mo10753a();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x00bf;
    L_0x0022:
        r1 = r4.f39751b;
        r3 = r5.mo10754b();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x00bf;
    L_0x002e:
        r1 = r4.f39752c;
        r3 = r5.mo10755c();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x00bf;
    L_0x003a:
        r1 = r4.f39753d;
        r3 = r5.mo10756d();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x00bf;
    L_0x0046:
        r1 = r4.f39754e;
        r3 = r5.mo10757e();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x00bf;
    L_0x0052:
        r1 = r4.f39755f;
        r3 = r5.mo10758f();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x00bf;
    L_0x005e:
        r1 = r4.f39756g;
        r3 = r5.mo10759g();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x00bf;
    L_0x006a:
        r1 = r4.f39757h;
        r3 = r5.mo10760h();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x00bf;
    L_0x0076:
        r1 = r4.f39758i;
        r3 = r5.mo10761i();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x00bf;
    L_0x0082:
        r1 = r4.f39759j;
        r3 = r5.mo10762j();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x00bf;
    L_0x008e:
        r1 = r4.f39760k;
        r3 = r5.mo10763k();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x00bf;
    L_0x009a:
        r1 = r4.f39761l;
        r3 = r5.mo10764l();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x00bf;
    L_0x00a6:
        r1 = r4.f39762m;
        r3 = r5.mo10765m();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x00bf;
    L_0x00b2:
        r1 = r4.f39763n;
        r5 = r5.mo10766n();
        r5 = r1.equals(r5);
        if (r5 == 0) goto L_0x00bf;
    L_0x00be:
        goto L_0x00c0;
    L_0x00bf:
        r0 = 0;
    L_0x00c0:
        return r0;
    L_0x00c1:
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tinder.paywall.viewmodels.a.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((this.f39750a == null ? 0 : this.f39750a.hashCode()) ^ 1000003) * 1000003) ^ this.f39751b.hashCode()) * 1000003) ^ this.f39752c.hashCode()) * 1000003) ^ this.f39753d.hashCode()) * 1000003) ^ this.f39754e.hashCode()) * 1000003) ^ this.f39755f.hashCode()) * 1000003) ^ this.f39756g.hashCode()) * 1000003) ^ this.f39757h.hashCode()) * 1000003) ^ this.f39758i.hashCode()) * 1000003) ^ this.f39759j.hashCode()) * 1000003) ^ this.f39760k.hashCode()) * 1000003) ^ this.f39761l.hashCode()) * 1000003) ^ this.f39762m.hashCode()) * 1000003) ^ this.f39763n.hashCode();
    }
}
