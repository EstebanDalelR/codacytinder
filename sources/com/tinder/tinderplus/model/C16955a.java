package com.tinder.tinderplus.model;

import android.support.annotation.NonNull;
import com.tinder.tinderplus.model.C15214d.C15213a;
import java.util.List;

/* renamed from: com.tinder.tinderplus.model.a */
final class C16955a extends C15214d {
    /* renamed from: a */
    private final Boolean f52263a;
    /* renamed from: b */
    private final List<String> f52264b;
    /* renamed from: c */
    private final List<String> f52265c;
    /* renamed from: d */
    private final Boolean f52266d;
    /* renamed from: e */
    private final Boolean f52267e;

    /* renamed from: com.tinder.tinderplus.model.a$a */
    static final class C16954a extends C15213a {
        /* renamed from: a */
        private Boolean f52258a;
        /* renamed from: b */
        private List<String> f52259b;
        /* renamed from: c */
        private List<String> f52260c;
        /* renamed from: d */
        private Boolean f52261d;
        /* renamed from: e */
        private Boolean f52262e;

        C16954a() {
        }

        /* renamed from: a */
        public C15213a mo12555a(Boolean bool) {
            this.f52258a = bool;
            return this;
        }

        /* renamed from: a */
        public C15213a mo12556a(List<String> list) {
            this.f52259b = list;
            return this;
        }

        /* renamed from: b */
        public C15213a mo12559b(List<String> list) {
            this.f52260c = list;
            return this;
        }

        /* renamed from: b */
        public C15213a mo12558b(Boolean bool) {
            this.f52261d = bool;
            return this;
        }

        /* renamed from: c */
        public C15213a mo12560c(Boolean bool) {
            this.f52262e = bool;
            return this;
        }

        /* renamed from: a */
        public C15214d mo12557a() {
            String str = "";
            if (this.f52258a == null) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(" featureEnabledForNonSubscribers");
                str = stringBuilder.toString();
            }
            if (this.f52259b == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(" perks");
                str = stringBuilder.toString();
            }
            if (this.f52260c == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(" incentives");
                str = stringBuilder.toString();
            }
            if (this.f52261d == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(" subscriptionExpired");
                str = stringBuilder.toString();
            }
            if (this.f52262e == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(" discountEnabled");
                str = stringBuilder.toString();
            }
            if (str.isEmpty()) {
                return new C16955a(this.f52258a, this.f52259b, this.f52260c, this.f52261d, this.f52262e);
            }
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append("Missing required properties:");
            stringBuilder2.append(str);
            throw new IllegalStateException(stringBuilder2.toString());
        }
    }

    private C16955a(Boolean bool, List<String> list, List<String> list2, Boolean bool2, Boolean bool3) {
        this.f52263a = bool;
        this.f52264b = list;
        this.f52265c = list2;
        this.f52266d = bool2;
        this.f52267e = bool3;
    }

    @NonNull
    /* renamed from: a */
    public Boolean mo12561a() {
        return this.f52263a;
    }

    @NonNull
    /* renamed from: b */
    public List<String> mo12562b() {
        return this.f52264b;
    }

    @NonNull
    /* renamed from: c */
    public List<String> mo12563c() {
        return this.f52265c;
    }

    @NonNull
    /* renamed from: d */
    public Boolean mo12564d() {
        return this.f52266d;
    }

    @NonNull
    /* renamed from: e */
    public Boolean mo12565e() {
        return this.f52267e;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("TinderPlusConfig{featureEnabledForNonSubscribers=");
        stringBuilder.append(this.f52263a);
        stringBuilder.append(", perks=");
        stringBuilder.append(this.f52264b);
        stringBuilder.append(", incentives=");
        stringBuilder.append(this.f52265c);
        stringBuilder.append(", subscriptionExpired=");
        stringBuilder.append(this.f52266d);
        stringBuilder.append(", discountEnabled=");
        stringBuilder.append(this.f52267e);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C15214d)) {
            return false;
        }
        C15214d c15214d = (C15214d) obj;
        if (!this.f52263a.equals(c15214d.mo12561a()) || !this.f52264b.equals(c15214d.mo12562b()) || !this.f52265c.equals(c15214d.mo12563c()) || !this.f52266d.equals(c15214d.mo12564d()) || this.f52267e.equals(c15214d.mo12565e()) == null) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return ((((((((this.f52263a.hashCode() ^ 1000003) * 1000003) ^ this.f52264b.hashCode()) * 1000003) ^ this.f52265c.hashCode()) * 1000003) ^ this.f52266d.hashCode()) * 1000003) ^ this.f52267e.hashCode();
    }
}
