package com.tinder.tinderplus.dialog;

import com.tinder.paywall.legacy.ListenerPaywall;
import com.tinder.paywall.paywallflow.C10076o.C10075b;
import com.tinder.paywall.viewmodels.PaywallPerk;
import com.tinder.tinderplus.dialog.TinderPlusPaywallDialog.C15206b;
import com.tinder.tinderplus.dialog.TinderPlusPaywallDialog.C15206b.C15204a;
import java.util.List;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.tinder.tinderplus.dialog.a */
final class C16952a extends C15206b {
    /* renamed from: b */
    private final boolean f52248b;
    /* renamed from: c */
    private final int f52249c;
    /* renamed from: d */
    private final PaywallPerk f52250d;
    /* renamed from: e */
    private final List<Integer> f52251e;
    /* renamed from: f */
    private final ListenerPaywall f52252f;
    /* renamed from: g */
    private final C10075b f52253g;

    /* renamed from: com.tinder.tinderplus.dialog.a$a */
    static final class C16951a extends C15204a {
        /* renamed from: a */
        private Boolean f52242a;
        /* renamed from: b */
        private Integer f52243b;
        /* renamed from: c */
        private PaywallPerk f52244c;
        /* renamed from: d */
        private List<Integer> f52245d;
        /* renamed from: e */
        private ListenerPaywall f52246e;
        /* renamed from: f */
        private C10075b f52247f;

        C16951a() {
        }

        /* renamed from: a */
        public C15204a mo12547a(boolean z) {
            this.f52242a = Boolean.valueOf(z);
            return this;
        }

        /* renamed from: a */
        public C15204a mo12542a(int i) {
            this.f52243b = Integer.valueOf(i);
            return this;
        }

        /* renamed from: a */
        public C15204a mo12545a(@Nullable PaywallPerk paywallPerk) {
            this.f52244c = paywallPerk;
            return this;
        }

        /* renamed from: a */
        public C15204a mo12546a(@Nullable List<Integer> list) {
            this.f52245d = list;
            return this;
        }

        /* renamed from: a */
        public C15204a mo12543a(@Nullable ListenerPaywall listenerPaywall) {
            this.f52246e = listenerPaywall;
            return this;
        }

        /* renamed from: a */
        public C15204a mo12544a(@Nullable C10075b c10075b) {
            this.f52247f = c10075b;
            return this;
        }

        /* renamed from: a */
        public C15206b mo12548a() {
            String str = "";
            if (this.f52242a == null) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(" isFromDiscountNotification");
                str = stringBuilder.toString();
            }
            if (this.f52243b == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(" analyticsSource");
                str = stringBuilder.toString();
            }
            if (str.isEmpty()) {
                return new C16952a(this.f52242a.booleanValue(), this.f52243b.intValue(), this.f52244c, this.f52245d, this.f52246e, this.f52247f);
            }
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append("Missing required properties:");
            stringBuilder2.append(str);
            throw new IllegalStateException(stringBuilder2.toString());
        }
    }

    private C16952a(boolean z, int i, @Nullable PaywallPerk paywallPerk, @Nullable List<Integer> list, @Nullable ListenerPaywall listenerPaywall, @Nullable C10075b c10075b) {
        this.f52248b = z;
        this.f52249c = i;
        this.f52250d = paywallPerk;
        this.f52251e = list;
        this.f52252f = listenerPaywall;
        this.f52253g = c10075b;
    }

    /* renamed from: a */
    public boolean mo12549a() {
        return this.f52248b;
    }

    /* renamed from: b */
    public int mo12550b() {
        return this.f52249c;
    }

    @Nullable
    /* renamed from: c */
    public PaywallPerk mo12551c() {
        return this.f52250d;
    }

    @Nullable
    /* renamed from: d */
    public List<Integer> mo12552d() {
        return this.f52251e;
    }

    @Nullable
    /* renamed from: e */
    public ListenerPaywall mo12553e() {
        return this.f52252f;
    }

    @Nullable
    /* renamed from: f */
    public C10075b mo12554f() {
        return this.f52253g;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Options{isFromDiscountNotification=");
        stringBuilder.append(this.f52248b);
        stringBuilder.append(", analyticsSource=");
        stringBuilder.append(this.f52249c);
        stringBuilder.append(", firstPerk=");
        stringBuilder.append(this.f52250d);
        stringBuilder.append(", incentives=");
        stringBuilder.append(this.f52251e);
        stringBuilder.append(", listener=");
        stringBuilder.append(this.f52252f);
        stringBuilder.append(", intendedUser=");
        stringBuilder.append(this.f52253g);
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
        r1 = r5 instanceof com.tinder.tinderplus.dialog.TinderPlusPaywallDialog.C15206b;
        r2 = 0;
        if (r1 == 0) goto L_0x007a;
    L_0x0009:
        r5 = (com.tinder.tinderplus.dialog.TinderPlusPaywallDialog.C15206b) r5;
        r1 = r4.f52248b;
        r3 = r5.mo12549a();
        if (r1 != r3) goto L_0x0078;
    L_0x0013:
        r1 = r4.f52249c;
        r3 = r5.mo12550b();
        if (r1 != r3) goto L_0x0078;
    L_0x001b:
        r1 = r4.f52250d;
        if (r1 != 0) goto L_0x0026;
    L_0x001f:
        r1 = r5.mo12551c();
        if (r1 != 0) goto L_0x0078;
    L_0x0025:
        goto L_0x0032;
    L_0x0026:
        r1 = r4.f52250d;
        r3 = r5.mo12551c();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x0078;
    L_0x0032:
        r1 = r4.f52251e;
        if (r1 != 0) goto L_0x003d;
    L_0x0036:
        r1 = r5.mo12552d();
        if (r1 != 0) goto L_0x0078;
    L_0x003c:
        goto L_0x0049;
    L_0x003d:
        r1 = r4.f52251e;
        r3 = r5.mo12552d();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x0078;
    L_0x0049:
        r1 = r4.f52252f;
        if (r1 != 0) goto L_0x0054;
    L_0x004d:
        r1 = r5.mo12553e();
        if (r1 != 0) goto L_0x0078;
    L_0x0053:
        goto L_0x0060;
    L_0x0054:
        r1 = r4.f52252f;
        r3 = r5.mo12553e();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x0078;
    L_0x0060:
        r1 = r4.f52253g;
        if (r1 != 0) goto L_0x006b;
    L_0x0064:
        r5 = r5.mo12554f();
        if (r5 != 0) goto L_0x0078;
    L_0x006a:
        goto L_0x0079;
    L_0x006b:
        r1 = r4.f52253g;
        r5 = r5.mo12554f();
        r5 = r1.equals(r5);
        if (r5 == 0) goto L_0x0078;
    L_0x0077:
        goto L_0x0079;
    L_0x0078:
        r0 = 0;
    L_0x0079:
        return r0;
    L_0x007a:
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tinder.tinderplus.dialog.a.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        int i = 0;
        int hashCode = ((((((((((this.f52248b ? 1231 : 1237) ^ 1000003) * 1000003) ^ this.f52249c) * 1000003) ^ (this.f52250d == null ? 0 : this.f52250d.hashCode())) * 1000003) ^ (this.f52251e == null ? 0 : this.f52251e.hashCode())) * 1000003) ^ (this.f52252f == null ? 0 : this.f52252f.hashCode())) * 1000003;
        if (this.f52253g != null) {
            i = this.f52253g.hashCode();
        }
        return hashCode ^ i;
    }
}
