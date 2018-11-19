package com.tinder.profile.p363b;

import android.support.annotation.NonNull;
import com.tinder.profile.model.Profile.Source;
import com.tinder.profile.p363b.C16076h.C14384a;
import com.tinder.profile.p363b.C16076h.C14384a.C14383a;

/* renamed from: com.tinder.profile.b.v */
final class C16086v extends C14384a {
    /* renamed from: a */
    private final Source f50013a;
    /* renamed from: b */
    private final int f50014b;
    /* renamed from: c */
    private final int f50015c;
    /* renamed from: d */
    private final boolean f50016d;
    /* renamed from: e */
    private final String f50017e;
    /* renamed from: f */
    private final String f50018f;

    /* renamed from: com.tinder.profile.b.v$a */
    static final class C16085a extends C14383a {
        /* renamed from: a */
        private Source f50007a;
        /* renamed from: b */
        private Integer f50008b;
        /* renamed from: c */
        private Integer f50009c;
        /* renamed from: d */
        private Boolean f50010d;
        /* renamed from: e */
        private String f50011e;
        /* renamed from: f */
        private String f50012f;

        C16085a() {
        }

        /* renamed from: a */
        public C14383a mo11574a(Source source) {
            this.f50007a = source;
            return this;
        }

        /* renamed from: a */
        public C14383a mo11573a(int i) {
            this.f50008b = Integer.valueOf(i);
            return this;
        }

        /* renamed from: b */
        public C14383a mo11578b(int i) {
            this.f50009c = Integer.valueOf(i);
            return this;
        }

        /* renamed from: a */
        public C14383a mo11576a(boolean z) {
            this.f50010d = Boolean.valueOf(z);
            return this;
        }

        /* renamed from: a */
        public C14383a mo11575a(String str) {
            this.f50011e = str;
            return this;
        }

        /* renamed from: b */
        public C14383a mo11579b(String str) {
            this.f50012f = str;
            return this;
        }

        /* renamed from: a */
        public C14384a mo11577a() {
            String str = "";
            if (this.f50007a == null) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(" source");
                str = stringBuilder.toString();
            }
            if (this.f50008b == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(" direction");
                str = stringBuilder.toString();
            }
            if (this.f50009c == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(" position");
                str = stringBuilder.toString();
            }
            if (this.f50010d == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(" isLastPage");
                str = stringBuilder.toString();
            }
            if (this.f50011e == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(" id");
                str = stringBuilder.toString();
            }
            if (this.f50012f == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(" instagramUsername");
                str = stringBuilder.toString();
            }
            if (str.isEmpty()) {
                return new C16086v(this.f50007a, this.f50008b.intValue(), this.f50009c.intValue(), this.f50010d.booleanValue(), this.f50011e, this.f50012f);
            }
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append("Missing required properties:");
            stringBuilder2.append(str);
            throw new IllegalStateException(stringBuilder2.toString());
        }
    }

    private C16086v(Source source, int i, int i2, boolean z, String str, String str2) {
        this.f50013a = source;
        this.f50014b = i;
        this.f50015c = i2;
        this.f50016d = z;
        this.f50017e = str;
        this.f50018f = str2;
    }

    @NonNull
    /* renamed from: a */
    public Source mo11580a() {
        return this.f50013a;
    }

    @NonNull
    /* renamed from: b */
    public int mo11581b() {
        return this.f50014b;
    }

    @NonNull
    /* renamed from: c */
    public int mo11582c() {
        return this.f50015c;
    }

    @NonNull
    /* renamed from: d */
    public boolean mo11583d() {
        return this.f50016d;
    }

    @NonNull
    /* renamed from: e */
    public String mo11584e() {
        return this.f50017e;
    }

    @NonNull
    /* renamed from: f */
    public String mo11585f() {
        return this.f50018f;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Request{source=");
        stringBuilder.append(this.f50013a);
        stringBuilder.append(", direction=");
        stringBuilder.append(this.f50014b);
        stringBuilder.append(", position=");
        stringBuilder.append(this.f50015c);
        stringBuilder.append(", isLastPage=");
        stringBuilder.append(this.f50016d);
        stringBuilder.append(", id=");
        stringBuilder.append(this.f50017e);
        stringBuilder.append(", instagramUsername=");
        stringBuilder.append(this.f50018f);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C14384a)) {
            return false;
        }
        C14384a c14384a = (C14384a) obj;
        if (!this.f50013a.equals(c14384a.mo11580a()) || this.f50014b != c14384a.mo11581b() || this.f50015c != c14384a.mo11582c() || this.f50016d != c14384a.mo11583d() || !this.f50017e.equals(c14384a.mo11584e()) || this.f50018f.equals(c14384a.mo11585f()) == null) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return ((((((((((this.f50013a.hashCode() ^ 1000003) * 1000003) ^ this.f50014b) * 1000003) ^ this.f50015c) * 1000003) ^ (this.f50016d ? 1231 : 1237)) * 1000003) ^ this.f50017e.hashCode()) * 1000003) ^ this.f50018f.hashCode();
    }
}
