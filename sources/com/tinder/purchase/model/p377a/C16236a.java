package com.tinder.purchase.model.p377a;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.tinder.api.model.profile.Products.Product;
import com.tinder.api.model.profile.Products.Sku;
import com.tinder.api.model.profile.Products.Variant;
import com.tinder.purchase.domain.model.C14516k;
import com.tinder.purchase.model.p377a.C14529b.C14528a;
import com.tinder.purchase.model.p377a.C14529b.C14528a.C14527a;

/* renamed from: com.tinder.purchase.model.a.a */
final class C16236a extends C14528a {
    /* renamed from: a */
    private final C14516k f50578a;
    /* renamed from: b */
    private final Variant f50579b;
    /* renamed from: c */
    private final Product f50580c;
    /* renamed from: d */
    private final Sku f50581d;
    /* renamed from: e */
    private final Sku f50582e;
    /* renamed from: f */
    private final Product f50583f;
    /* renamed from: g */
    private final Sku f50584g;
    /* renamed from: h */
    private final Sku f50585h;

    /* renamed from: com.tinder.purchase.model.a.a$a */
    static final class C16235a extends C14527a {
        /* renamed from: a */
        private C14516k f50570a;
        /* renamed from: b */
        private Variant f50571b;
        /* renamed from: c */
        private Product f50572c;
        /* renamed from: d */
        private Sku f50573d;
        /* renamed from: e */
        private Sku f50574e;
        /* renamed from: f */
        private Product f50575f;
        /* renamed from: g */
        private Sku f50576g;
        /* renamed from: h */
        private Sku f50577h;

        C16235a() {
        }

        /* renamed from: a */
        public C14527a mo11907a(C14516k c14516k) {
            this.f50570a = c14516k;
            return this;
        }

        /* renamed from: a */
        public C14527a mo11906a(Variant variant) {
            this.f50571b = variant;
            return this;
        }

        /* renamed from: a */
        public C14527a mo11904a(Product product) {
            this.f50572c = product;
            return this;
        }

        /* renamed from: a */
        public C14527a mo11905a(Sku sku) {
            this.f50573d = sku;
            return this;
        }

        /* renamed from: b */
        public C14527a mo11910b(Sku sku) {
            this.f50574e = sku;
            return this;
        }

        /* renamed from: b */
        public C14527a mo11909b(@Nullable Product product) {
            this.f50575f = product;
            return this;
        }

        /* renamed from: c */
        public C14527a mo11911c(@Nullable Sku sku) {
            this.f50576g = sku;
            return this;
        }

        /* renamed from: d */
        public C14527a mo11912d(@Nullable Sku sku) {
            this.f50577h = sku;
            return this;
        }

        /* renamed from: a */
        public C14528a mo11908a() {
            String str = "";
            if (this.f50570a == null) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(" priceListing");
                str = stringBuilder.toString();
            }
            if (this.f50571b == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(" variant");
                str = stringBuilder.toString();
            }
            if (this.f50572c == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(" regularProduct");
                str = stringBuilder.toString();
            }
            if (this.f50573d == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(" regularSku");
                str = stringBuilder.toString();
            }
            if (this.f50574e == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(" baseRegularSku");
                str = stringBuilder.toString();
            }
            if (str.isEmpty()) {
                return new C16236a(this.f50570a, this.f50571b, this.f50572c, this.f50573d, this.f50574e, this.f50575f, this.f50576g, this.f50577h);
            }
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append("Missing required properties:");
            stringBuilder2.append(str);
            throw new IllegalStateException(stringBuilder2.toString());
        }
    }

    private C16236a(C14516k c14516k, Variant variant, Product product, Sku sku, Sku sku2, @Nullable Product product2, @Nullable Sku sku3, @Nullable Sku sku4) {
        this.f50578a = c14516k;
        this.f50579b = variant;
        this.f50580c = product;
        this.f50581d = sku;
        this.f50582e = sku2;
        this.f50583f = product2;
        this.f50584g = sku3;
        this.f50585h = sku4;
    }

    @NonNull
    /* renamed from: a */
    public C14516k mo11913a() {
        return this.f50578a;
    }

    @NonNull
    /* renamed from: b */
    public Variant mo11914b() {
        return this.f50579b;
    }

    @NonNull
    /* renamed from: c */
    public Product mo11915c() {
        return this.f50580c;
    }

    @NonNull
    /* renamed from: d */
    public Sku mo11916d() {
        return this.f50581d;
    }

    @NonNull
    /* renamed from: e */
    public Sku mo11917e() {
        return this.f50582e;
    }

    @Nullable
    /* renamed from: f */
    public Product mo11918f() {
        return this.f50583f;
    }

    @Nullable
    /* renamed from: g */
    public Sku mo11919g() {
        return this.f50584g;
    }

    @Nullable
    /* renamed from: h */
    public Sku mo11920h() {
        return this.f50585h;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("SkuTuple{priceListing=");
        stringBuilder.append(this.f50578a);
        stringBuilder.append(", variant=");
        stringBuilder.append(this.f50579b);
        stringBuilder.append(", regularProduct=");
        stringBuilder.append(this.f50580c);
        stringBuilder.append(", regularSku=");
        stringBuilder.append(this.f50581d);
        stringBuilder.append(", baseRegularSku=");
        stringBuilder.append(this.f50582e);
        stringBuilder.append(", discountProduct=");
        stringBuilder.append(this.f50583f);
        stringBuilder.append(", discountSku=");
        stringBuilder.append(this.f50584g);
        stringBuilder.append(", baseDiscountSku=");
        stringBuilder.append(this.f50585h);
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
        r1 = r5 instanceof com.tinder.purchase.model.p377a.C14529b.C14528a;
        r2 = 0;
        if (r1 == 0) goto L_0x008f;
    L_0x0009:
        r5 = (com.tinder.purchase.model.p377a.C14529b.C14528a) r5;
        r1 = r4.f50578a;
        r3 = r5.mo11913a();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x008d;
    L_0x0017:
        r1 = r4.f50579b;
        r3 = r5.mo11914b();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x008d;
    L_0x0023:
        r1 = r4.f50580c;
        r3 = r5.mo11915c();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x008d;
    L_0x002f:
        r1 = r4.f50581d;
        r3 = r5.mo11916d();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x008d;
    L_0x003b:
        r1 = r4.f50582e;
        r3 = r5.mo11917e();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x008d;
    L_0x0047:
        r1 = r4.f50583f;
        if (r1 != 0) goto L_0x0052;
    L_0x004b:
        r1 = r5.mo11918f();
        if (r1 != 0) goto L_0x008d;
    L_0x0051:
        goto L_0x005e;
    L_0x0052:
        r1 = r4.f50583f;
        r3 = r5.mo11918f();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x008d;
    L_0x005e:
        r1 = r4.f50584g;
        if (r1 != 0) goto L_0x0069;
    L_0x0062:
        r1 = r5.mo11919g();
        if (r1 != 0) goto L_0x008d;
    L_0x0068:
        goto L_0x0075;
    L_0x0069:
        r1 = r4.f50584g;
        r3 = r5.mo11919g();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x008d;
    L_0x0075:
        r1 = r4.f50585h;
        if (r1 != 0) goto L_0x0080;
    L_0x0079:
        r5 = r5.mo11920h();
        if (r5 != 0) goto L_0x008d;
    L_0x007f:
        goto L_0x008e;
    L_0x0080:
        r1 = r4.f50585h;
        r5 = r5.mo11920h();
        r5 = r1.equals(r5);
        if (r5 == 0) goto L_0x008d;
    L_0x008c:
        goto L_0x008e;
    L_0x008d:
        r0 = 0;
    L_0x008e:
        return r0;
    L_0x008f:
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tinder.purchase.model.a.a.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        int i = 0;
        int hashCode = (((((((((((((this.f50578a.hashCode() ^ 1000003) * 1000003) ^ this.f50579b.hashCode()) * 1000003) ^ this.f50580c.hashCode()) * 1000003) ^ this.f50581d.hashCode()) * 1000003) ^ this.f50582e.hashCode()) * 1000003) ^ (this.f50583f == null ? 0 : this.f50583f.hashCode())) * 1000003) ^ (this.f50584g == null ? 0 : this.f50584g.hashCode())) * 1000003;
        if (this.f50585h != null) {
            i = this.f50585h.hashCode();
        }
        return hashCode ^ i;
    }
}
