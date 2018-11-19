package com.tinder.paywall.paywallflow;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.tinder.paywall.legacy.PaywallFlowFailureListener;
import com.tinder.paywall.legacy.PaywallFlowSuccessListener;
import com.tinder.paywall.legacy.PaywallTypeSource;
import com.tinder.paywall.paywallflow.C10076o.C10074a;
import com.tinder.paywall.paywallflow.C10076o.C10074a.C10073a;
import com.tinder.paywall.paywallflow.C10076o.C10075b;
import java.util.List;
import kotlin.C15813i;
import kotlin.jvm.functions.Function0;

/* renamed from: com.tinder.paywall.paywallflow.b */
final class C12272b extends C10074a {
    /* renamed from: a */
    private final PaywallTypeSource f39703a;
    /* renamed from: b */
    private final List<Integer> f39704b;
    /* renamed from: c */
    private final List<String> f39705c;
    /* renamed from: d */
    private final C10075b f39706d;
    /* renamed from: e */
    private final Function0<C15813i> f39707e;
    /* renamed from: f */
    private final Function0<C15813i> f39708f;
    /* renamed from: g */
    private final PaywallFlowSuccessListener f39709g;
    /* renamed from: h */
    private final PaywallFlowFailureListener f39710h;

    /* renamed from: com.tinder.paywall.paywallflow.b$a */
    static final class C12271a extends C10073a {
        /* renamed from: a */
        private PaywallTypeSource f39695a;
        /* renamed from: b */
        private List<Integer> f39696b;
        /* renamed from: c */
        private List<String> f39697c;
        /* renamed from: d */
        private C10075b f39698d;
        /* renamed from: e */
        private Function0<C15813i> f39699e;
        /* renamed from: f */
        private Function0<C15813i> f39700f;
        /* renamed from: g */
        private PaywallFlowSuccessListener f39701g;
        /* renamed from: h */
        private PaywallFlowFailureListener f39702h;

        C12271a() {
        }

        /* renamed from: a */
        public C10073a mo10713a(PaywallTypeSource paywallTypeSource) {
            this.f39695a = paywallTypeSource;
            return this;
        }

        /* renamed from: a */
        public C10073a mo10715a(List<Integer> list) {
            this.f39696b = list;
            return this;
        }

        /* renamed from: b */
        public C10073a mo10718b(@Nullable List<String> list) {
            this.f39697c = list;
            return this;
        }

        /* renamed from: a */
        public C10073a mo10714a(@Nullable C10075b c10075b) {
            this.f39698d = c10075b;
            return this;
        }

        /* renamed from: a */
        public C10073a mo10716a(@Nullable Function0<C15813i> function0) {
            this.f39699e = function0;
            return this;
        }

        /* renamed from: b */
        public C10073a mo10719b(@Nullable Function0<C15813i> function0) {
            this.f39700f = function0;
            return this;
        }

        /* renamed from: a */
        public C10073a mo10712a(@Nullable PaywallFlowSuccessListener paywallFlowSuccessListener) {
            this.f39701g = paywallFlowSuccessListener;
            return this;
        }

        /* renamed from: a */
        public C10073a mo10711a(@Nullable PaywallFlowFailureListener paywallFlowFailureListener) {
            this.f39702h = paywallFlowFailureListener;
            return this;
        }

        /* renamed from: a */
        public C10074a mo10717a() {
            String str = "";
            if (this.f39695a == null) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(" source");
                str = stringBuilder.toString();
            }
            if (this.f39696b == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(" incentiveAnalyticsValues");
                str = stringBuilder.toString();
            }
            if (str.isEmpty()) {
                return new C12272b(this.f39695a, this.f39696b, this.f39697c, this.f39698d, this.f39699e, this.f39700f, this.f39701g, this.f39702h);
            }
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append("Missing required properties:");
            stringBuilder2.append(str);
            throw new IllegalStateException(stringBuilder2.toString());
        }
    }

    private C12272b(PaywallTypeSource paywallTypeSource, List<Integer> list, @Nullable List<String> list2, @Nullable C10075b c10075b, @Nullable Function0<C15813i> function0, @Nullable Function0<C15813i> function02, @Nullable PaywallFlowSuccessListener paywallFlowSuccessListener, @Nullable PaywallFlowFailureListener paywallFlowFailureListener) {
        this.f39703a = paywallTypeSource;
        this.f39704b = list;
        this.f39705c = list2;
        this.f39706d = c10075b;
        this.f39707e = function0;
        this.f39708f = function02;
        this.f39709g = paywallFlowSuccessListener;
        this.f39710h = paywallFlowFailureListener;
    }

    @NonNull
    /* renamed from: a */
    public PaywallTypeSource mo10720a() {
        return this.f39703a;
    }

    @NonNull
    /* renamed from: b */
    public List<Integer> mo10721b() {
        return this.f39704b;
    }

    @Nullable
    /* renamed from: c */
    public List<String> mo10722c() {
        return this.f39705c;
    }

    @Nullable
    /* renamed from: d */
    public C10075b mo10723d() {
        return this.f39706d;
    }

    @Nullable
    /* renamed from: e */
    public Function0<C15813i> mo10724e() {
        return this.f39707e;
    }

    @Nullable
    /* renamed from: f */
    public Function0<C15813i> mo10725f() {
        return this.f39708f;
    }

    @Nullable
    /* renamed from: g */
    public PaywallFlowSuccessListener mo10726g() {
        return this.f39709g;
    }

    @Nullable
    /* renamed from: h */
    public PaywallFlowFailureListener mo10727h() {
        return this.f39710h;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Configuration{source=");
        stringBuilder.append(this.f39703a);
        stringBuilder.append(", incentiveAnalyticsValues=");
        stringBuilder.append(this.f39704b);
        stringBuilder.append(", imageUrls=");
        stringBuilder.append(this.f39705c);
        stringBuilder.append(", intendedUser=");
        stringBuilder.append(this.f39706d);
        stringBuilder.append(", onStartListener=");
        stringBuilder.append(this.f39707e);
        stringBuilder.append(", dismissListener=");
        stringBuilder.append(this.f39708f);
        stringBuilder.append(", successListener=");
        stringBuilder.append(this.f39709g);
        stringBuilder.append(", failureListener=");
        stringBuilder.append(this.f39710h);
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
        r1 = r5 instanceof com.tinder.paywall.paywallflow.C10076o.C10074a;
        r2 = 0;
        if (r1 == 0) goto L_0x00b0;
    L_0x0009:
        r5 = (com.tinder.paywall.paywallflow.C10076o.C10074a) r5;
        r1 = r4.f39703a;
        r3 = r5.mo10720a();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x00ae;
    L_0x0017:
        r1 = r4.f39704b;
        r3 = r5.mo10721b();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x00ae;
    L_0x0023:
        r1 = r4.f39705c;
        if (r1 != 0) goto L_0x002e;
    L_0x0027:
        r1 = r5.mo10722c();
        if (r1 != 0) goto L_0x00ae;
    L_0x002d:
        goto L_0x003a;
    L_0x002e:
        r1 = r4.f39705c;
        r3 = r5.mo10722c();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x00ae;
    L_0x003a:
        r1 = r4.f39706d;
        if (r1 != 0) goto L_0x0045;
    L_0x003e:
        r1 = r5.mo10723d();
        if (r1 != 0) goto L_0x00ae;
    L_0x0044:
        goto L_0x0051;
    L_0x0045:
        r1 = r4.f39706d;
        r3 = r5.mo10723d();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x00ae;
    L_0x0051:
        r1 = r4.f39707e;
        if (r1 != 0) goto L_0x005c;
    L_0x0055:
        r1 = r5.mo10724e();
        if (r1 != 0) goto L_0x00ae;
    L_0x005b:
        goto L_0x0068;
    L_0x005c:
        r1 = r4.f39707e;
        r3 = r5.mo10724e();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x00ae;
    L_0x0068:
        r1 = r4.f39708f;
        if (r1 != 0) goto L_0x0073;
    L_0x006c:
        r1 = r5.mo10725f();
        if (r1 != 0) goto L_0x00ae;
    L_0x0072:
        goto L_0x007f;
    L_0x0073:
        r1 = r4.f39708f;
        r3 = r5.mo10725f();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x00ae;
    L_0x007f:
        r1 = r4.f39709g;
        if (r1 != 0) goto L_0x008a;
    L_0x0083:
        r1 = r5.mo10726g();
        if (r1 != 0) goto L_0x00ae;
    L_0x0089:
        goto L_0x0096;
    L_0x008a:
        r1 = r4.f39709g;
        r3 = r5.mo10726g();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x00ae;
    L_0x0096:
        r1 = r4.f39710h;
        if (r1 != 0) goto L_0x00a1;
    L_0x009a:
        r5 = r5.mo10727h();
        if (r5 != 0) goto L_0x00ae;
    L_0x00a0:
        goto L_0x00af;
    L_0x00a1:
        r1 = r4.f39710h;
        r5 = r5.mo10727h();
        r5 = r1.equals(r5);
        if (r5 == 0) goto L_0x00ae;
    L_0x00ad:
        goto L_0x00af;
    L_0x00ae:
        r0 = 0;
    L_0x00af:
        return r0;
    L_0x00b0:
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tinder.paywall.paywallflow.b.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        int i = 0;
        int hashCode = (((((((((((((this.f39703a.hashCode() ^ 1000003) * 1000003) ^ this.f39704b.hashCode()) * 1000003) ^ (this.f39705c == null ? 0 : this.f39705c.hashCode())) * 1000003) ^ (this.f39706d == null ? 0 : this.f39706d.hashCode())) * 1000003) ^ (this.f39707e == null ? 0 : this.f39707e.hashCode())) * 1000003) ^ (this.f39708f == null ? 0 : this.f39708f.hashCode())) * 1000003) ^ (this.f39709g == null ? 0 : this.f39709g.hashCode())) * 1000003;
        if (this.f39710h != null) {
            i = this.f39710h.hashCode();
        }
        return hashCode ^ i;
    }
}
