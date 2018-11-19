package com.tinder.purchase.domain.model;

import com.tinder.domain.common.model.TimeInterval;
import com.tinder.domain.profile.model.ProductType;
import com.tinder.domain.profile.model.PurchaseType;
import com.tinder.purchase.domain.model.C14510e.C14507a;
import com.tinder.purchase.domain.model.C14510e.C14509b;
import io.reactivex.annotations.NonNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.tinder.purchase.domain.model.a */
final class C16223a extends C14510e {
    /* renamed from: a */
    private final String f50516a;
    /* renamed from: b */
    private final ProductType f50517b;
    /* renamed from: c */
    private final PurchaseType f50518c;
    /* renamed from: d */
    private final C14514j f50519d;
    /* renamed from: e */
    private final TimeInterval f50520e;
    /* renamed from: f */
    private final Integer f50521f;
    /* renamed from: g */
    private final C14509b f50522g;
    /* renamed from: h */
    private final boolean f50523h;
    /* renamed from: i */
    private final boolean f50524i;
    /* renamed from: j */
    private final C14514j f50525j;
    /* renamed from: k */
    private final Integer f50526k;

    /* renamed from: com.tinder.purchase.domain.model.a$a */
    static final class C16220a extends C14507a {
        /* renamed from: a */
        private String f50502a;
        /* renamed from: b */
        private ProductType f50503b;
        /* renamed from: c */
        private PurchaseType f50504c;
        /* renamed from: d */
        private C14514j f50505d;
        /* renamed from: e */
        private TimeInterval f50506e;
        /* renamed from: f */
        private Integer f50507f;
        /* renamed from: g */
        private C14509b f50508g;
        /* renamed from: h */
        private Boolean f50509h;
        /* renamed from: i */
        private Boolean f50510i;
        /* renamed from: j */
        private C14514j f50511j;
        /* renamed from: k */
        private Integer f50512k;

        C16220a() {
        }

        C16220a(C14510e c14510e) {
            this.f50502a = c14510e.mo11839a();
            this.f50503b = c14510e.mo11840b();
            this.f50504c = c14510e.mo11841c();
            this.f50505d = c14510e.mo11842d();
            this.f50506e = c14510e.mo11843e();
            this.f50507f = c14510e.mo11844f();
            this.f50508g = c14510e.mo11845g();
            this.f50509h = Boolean.valueOf(c14510e.mo11846h());
            this.f50510i = Boolean.valueOf(c14510e.mo11847i());
            this.f50511j = c14510e.mo11848j();
            this.f50512k = c14510e.mo11849k();
        }

        /* renamed from: a */
        public C14507a mo11833a(String str) {
            this.f50502a = str;
            return this;
        }

        /* renamed from: a */
        public C14507a mo11828a(ProductType productType) {
            this.f50503b = productType;
            return this;
        }

        /* renamed from: a */
        public C14507a mo11829a(PurchaseType purchaseType) {
            this.f50504c = purchaseType;
            return this;
        }

        /* renamed from: a */
        public C14507a mo11831a(C14514j c14514j) {
            this.f50505d = c14514j;
            return this;
        }

        /* renamed from: a */
        public C14507a mo11827a(@Nullable TimeInterval timeInterval) {
            this.f50506e = timeInterval;
            return this;
        }

        /* renamed from: a */
        public C14507a mo11832a(@Nullable Integer num) {
            this.f50507f = num;
            return this;
        }

        /* renamed from: a */
        public C14507a mo11830a(@Nullable C14509b c14509b) {
            this.f50508g = c14509b;
            return this;
        }

        /* renamed from: a */
        public C14507a mo11834a(boolean z) {
            this.f50509h = Boolean.valueOf(z);
            return this;
        }

        /* renamed from: b */
        public C14507a mo11838b(boolean z) {
            this.f50510i = Boolean.valueOf(z);
            return this;
        }

        /* renamed from: b */
        public C14507a mo11836b(C14514j c14514j) {
            this.f50511j = c14514j;
            return this;
        }

        /* renamed from: b */
        public C14507a mo11837b(Integer num) {
            this.f50512k = num;
            return this;
        }

        /* renamed from: a */
        public C14510e mo11835a() {
            String str = "";
            if (this.f50502a == null) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(" productId");
                str = stringBuilder.toString();
            }
            if (this.f50503b == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(" productType");
                str = stringBuilder.toString();
            }
            if (this.f50504c == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(" purchaseType");
                str = stringBuilder.toString();
            }
            if (this.f50505d == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(" price");
                str = stringBuilder.toString();
            }
            if (this.f50509h == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(" isBaseOffer");
                str = stringBuilder.toString();
            }
            if (this.f50510i == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(" isPrimaryOffer");
                str = stringBuilder.toString();
            }
            if (this.f50511j == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(" basePrice");
                str = stringBuilder.toString();
            }
            if (this.f50512k == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(" baseAmount");
                str = stringBuilder.toString();
            }
            if (str.isEmpty()) {
                return new C16223a(this.f50502a, this.f50503b, this.f50504c, this.f50505d, this.f50506e, this.f50507f, this.f50508g, this.f50509h.booleanValue(), this.f50510i.booleanValue(), this.f50511j, this.f50512k);
            }
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append("Missing required properties:");
            stringBuilder2.append(str);
            throw new IllegalStateException(stringBuilder2.toString());
        }
    }

    private C16223a(String str, ProductType productType, PurchaseType purchaseType, C14514j c14514j, @Nullable TimeInterval timeInterval, @Nullable Integer num, @Nullable C14509b c14509b, boolean z, boolean z2, C14514j c14514j2, Integer num2) {
        this.f50516a = str;
        this.f50517b = productType;
        this.f50518c = purchaseType;
        this.f50519d = c14514j;
        this.f50520e = timeInterval;
        this.f50521f = num;
        this.f50522g = c14509b;
        this.f50523h = z;
        this.f50524i = z2;
        this.f50525j = c14514j2;
        this.f50526k = num2;
    }

    @NonNull
    /* renamed from: a */
    public String mo11839a() {
        return this.f50516a;
    }

    @NonNull
    /* renamed from: b */
    public ProductType mo11840b() {
        return this.f50517b;
    }

    @NonNull
    /* renamed from: c */
    public PurchaseType mo11841c() {
        return this.f50518c;
    }

    @NonNull
    /* renamed from: d */
    public C14514j mo11842d() {
        return this.f50519d;
    }

    @Nullable
    /* renamed from: e */
    public TimeInterval mo11843e() {
        return this.f50520e;
    }

    @Nullable
    /* renamed from: f */
    public Integer mo11844f() {
        return this.f50521f;
    }

    @Nullable
    /* renamed from: g */
    public C14509b mo11845g() {
        return this.f50522g;
    }

    /* renamed from: h */
    public boolean mo11846h() {
        return this.f50523h;
    }

    /* renamed from: i */
    public boolean mo11847i() {
        return this.f50524i;
    }

    @NonNull
    /* renamed from: j */
    public C14514j mo11848j() {
        return this.f50525j;
    }

    @NonNull
    /* renamed from: k */
    public Integer mo11849k() {
        return this.f50526k;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Offer{productId=");
        stringBuilder.append(this.f50516a);
        stringBuilder.append(", productType=");
        stringBuilder.append(this.f50517b);
        stringBuilder.append(", purchaseType=");
        stringBuilder.append(this.f50518c);
        stringBuilder.append(", price=");
        stringBuilder.append(this.f50519d);
        stringBuilder.append(", subscriptionLength=");
        stringBuilder.append(this.f50520e);
        stringBuilder.append(", consumableAmount=");
        stringBuilder.append(this.f50521f);
        stringBuilder.append(", discount=");
        stringBuilder.append(this.f50522g);
        stringBuilder.append(", isBaseOffer=");
        stringBuilder.append(this.f50523h);
        stringBuilder.append(", isPrimaryOffer=");
        stringBuilder.append(this.f50524i);
        stringBuilder.append(", basePrice=");
        stringBuilder.append(this.f50525j);
        stringBuilder.append(", baseAmount=");
        stringBuilder.append(this.f50526k);
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
        r1 = r5 instanceof com.tinder.purchase.domain.model.C14510e;
        r2 = 0;
        if (r1 == 0) goto L_0x00ab;
    L_0x0009:
        r5 = (com.tinder.purchase.domain.model.C14510e) r5;
        r1 = r4.f50516a;
        r3 = r5.mo11839a();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x00a9;
    L_0x0017:
        r1 = r4.f50517b;
        r3 = r5.mo11840b();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x00a9;
    L_0x0023:
        r1 = r4.f50518c;
        r3 = r5.mo11841c();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x00a9;
    L_0x002f:
        r1 = r4.f50519d;
        r3 = r5.mo11842d();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x00a9;
    L_0x003b:
        r1 = r4.f50520e;
        if (r1 != 0) goto L_0x0046;
    L_0x003f:
        r1 = r5.mo11843e();
        if (r1 != 0) goto L_0x00a9;
    L_0x0045:
        goto L_0x0052;
    L_0x0046:
        r1 = r4.f50520e;
        r3 = r5.mo11843e();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x00a9;
    L_0x0052:
        r1 = r4.f50521f;
        if (r1 != 0) goto L_0x005d;
    L_0x0056:
        r1 = r5.mo11844f();
        if (r1 != 0) goto L_0x00a9;
    L_0x005c:
        goto L_0x0069;
    L_0x005d:
        r1 = r4.f50521f;
        r3 = r5.mo11844f();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x00a9;
    L_0x0069:
        r1 = r4.f50522g;
        if (r1 != 0) goto L_0x0074;
    L_0x006d:
        r1 = r5.mo11845g();
        if (r1 != 0) goto L_0x00a9;
    L_0x0073:
        goto L_0x0080;
    L_0x0074:
        r1 = r4.f50522g;
        r3 = r5.mo11845g();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x00a9;
    L_0x0080:
        r1 = r4.f50523h;
        r3 = r5.mo11846h();
        if (r1 != r3) goto L_0x00a9;
    L_0x0088:
        r1 = r4.f50524i;
        r3 = r5.mo11847i();
        if (r1 != r3) goto L_0x00a9;
    L_0x0090:
        r1 = r4.f50525j;
        r3 = r5.mo11848j();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x00a9;
    L_0x009c:
        r1 = r4.f50526k;
        r5 = r5.mo11849k();
        r5 = r1.equals(r5);
        if (r5 == 0) goto L_0x00a9;
    L_0x00a8:
        goto L_0x00aa;
    L_0x00a9:
        r0 = 0;
    L_0x00aa:
        return r0;
    L_0x00ab:
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tinder.purchase.domain.model.a.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        int i = 0;
        int hashCode = (((((((((((this.f50516a.hashCode() ^ 1000003) * 1000003) ^ this.f50517b.hashCode()) * 1000003) ^ this.f50518c.hashCode()) * 1000003) ^ this.f50519d.hashCode()) * 1000003) ^ (this.f50520e == null ? 0 : this.f50520e.hashCode())) * 1000003) ^ (this.f50521f == null ? 0 : this.f50521f.hashCode())) * 1000003;
        if (this.f50522g != null) {
            i = this.f50522g.hashCode();
        }
        hashCode = (hashCode ^ i) * 1000003;
        i = 1237;
        hashCode = (hashCode ^ (this.f50523h ? 1231 : 1237)) * 1000003;
        if (this.f50524i) {
            i = 1231;
        }
        return ((((hashCode ^ i) * 1000003) ^ this.f50525j.hashCode()) * 1000003) ^ this.f50526k.hashCode();
    }
}
