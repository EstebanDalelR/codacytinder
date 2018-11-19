package com.tinder.profile.p366e;

import android.support.annotation.ColorRes;
import android.support.annotation.DrawableRes;
import android.support.annotation.StringRes;
import com.tinder.controlla.model.AdvertisingPageType;
import com.tinder.profile.p366e.C14408a.C14407a;

/* renamed from: com.tinder.profile.e.d */
final class C16106d extends C14408a {
    /* renamed from: a */
    private final int f50093a;
    /* renamed from: b */
    private final String f50094b;
    /* renamed from: c */
    private final int f50095c;
    /* renamed from: d */
    private final int f50096d;
    /* renamed from: e */
    private final AdvertisingPageType f50097e;

    /* renamed from: com.tinder.profile.e.d$a */
    static final class C16105a extends C14407a {
        /* renamed from: a */
        private Integer f50088a;
        /* renamed from: b */
        private String f50089b;
        /* renamed from: c */
        private Integer f50090c;
        /* renamed from: d */
        private Integer f50091d;
        /* renamed from: e */
        private AdvertisingPageType f50092e;

        C16105a() {
        }

        /* renamed from: a */
        public C14407a mo11604a(int i) {
            this.f50088a = Integer.valueOf(i);
            return this;
        }

        /* renamed from: a */
        public C14407a mo11606a(String str) {
            this.f50089b = str;
            return this;
        }

        /* renamed from: b */
        public C14407a mo11608b(int i) {
            this.f50090c = Integer.valueOf(i);
            return this;
        }

        /* renamed from: c */
        public C14407a mo11609c(int i) {
            this.f50091d = Integer.valueOf(i);
            return this;
        }

        /* renamed from: a */
        public C14407a mo11605a(AdvertisingPageType advertisingPageType) {
            this.f50092e = advertisingPageType;
            return this;
        }

        /* renamed from: a */
        public C14408a mo11607a() {
            String str = "";
            if (this.f50088a == null) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(" title");
                str = stringBuilder.toString();
            }
            if (this.f50089b == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(" description");
                str = stringBuilder.toString();
            }
            if (this.f50090c == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(" color");
                str = stringBuilder.toString();
            }
            if (this.f50091d == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(" icon");
                str = stringBuilder.toString();
            }
            if (this.f50092e == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(" pageType");
                str = stringBuilder.toString();
            }
            if (str.isEmpty()) {
                return new C16106d(this.f50088a.intValue(), this.f50089b, this.f50090c.intValue(), this.f50091d.intValue(), this.f50092e);
            }
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append("Missing required properties:");
            stringBuilder2.append(str);
            throw new IllegalStateException(stringBuilder2.toString());
        }
    }

    private C16106d(int i, String str, int i2, int i3, AdvertisingPageType advertisingPageType) {
        this.f50093a = i;
        this.f50094b = str;
        this.f50095c = i2;
        this.f50096d = i3;
        this.f50097e = advertisingPageType;
    }

    @StringRes
    /* renamed from: a */
    public int mo11610a() {
        return this.f50093a;
    }

    /* renamed from: b */
    public String mo11611b() {
        return this.f50094b;
    }

    @ColorRes
    /* renamed from: c */
    public int mo11612c() {
        return this.f50095c;
    }

    @DrawableRes
    /* renamed from: d */
    public int mo11613d() {
        return this.f50096d;
    }

    /* renamed from: e */
    public AdvertisingPageType mo11614e() {
        return this.f50097e;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("AdvertisingPanel{title=");
        stringBuilder.append(this.f50093a);
        stringBuilder.append(", description=");
        stringBuilder.append(this.f50094b);
        stringBuilder.append(", color=");
        stringBuilder.append(this.f50095c);
        stringBuilder.append(", icon=");
        stringBuilder.append(this.f50096d);
        stringBuilder.append(", pageType=");
        stringBuilder.append(this.f50097e);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C14408a)) {
            return false;
        }
        C14408a c14408a = (C14408a) obj;
        if (this.f50093a != c14408a.mo11610a() || !this.f50094b.equals(c14408a.mo11611b()) || this.f50095c != c14408a.mo11612c() || this.f50096d != c14408a.mo11613d() || this.f50097e.equals(c14408a.mo11614e()) == null) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return ((((((((this.f50093a ^ 1000003) * 1000003) ^ this.f50094b.hashCode()) * 1000003) ^ this.f50095c) * 1000003) ^ this.f50096d) * 1000003) ^ this.f50097e.hashCode();
    }
}
