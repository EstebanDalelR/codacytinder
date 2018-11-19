package com.tinder.data.buckets;

import com.tinder.domain.experiments.Buckets;
import java.util.List;
import java.util.Map;
import kotlin.C15811g;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C19301m;
import kotlin.collections.ae;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\b\u0000\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u0007\b\u0007¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\u00020\u00042\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u0006J\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\tJ\u001a\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u000b\u001a\u00020\u0004¨\u0006\r"}, d2 = {"Lcom/tinder/data/buckets/BucketsAdapter;", "", "()V", "fromMap", "Lcom/tinder/domain/experiments/Buckets;", "map", "", "", "supportedFields", "", "toMap", "buckets", "Companion", "data_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.data.buckets.a */
public final class C8627a {
    /* renamed from: a */
    public static final C8626a f30479a = new C8626a();

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/tinder/data/buckets/BucketsAdapter$Companion;", "", "()V", "SMS_AUTH", "", "SMS_AUTH_V1", "SMS_AUTH_V2", "data_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.data.buckets.a$a */
    public static final class C8626a {
        private C8626a() {
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    @org.jetbrains.annotations.NotNull
    /* renamed from: a */
    public final com.tinder.domain.experiments.Buckets m36771a(@org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.String> r3) {
        /*
        r2 = this;
        r0 = "map";
        kotlin.jvm.internal.C2668g.b(r3, r0);
        r0 = new com.tinder.domain.experiments.Buckets;
        r1 = "sms_auth_v2";
        r3 = r3.get(r1);
        r3 = (java.lang.String) r3;
        if (r3 != 0) goto L_0x0012;
    L_0x0011:
        goto L_0x0030;
    L_0x0012:
        r1 = r3.hashCode();
        switch(r1) {
            case -646523790: goto L_0x0025;
            case -646523789: goto L_0x001a;
            default: goto L_0x0019;
        };
    L_0x0019:
        goto L_0x0030;
    L_0x001a:
        r1 = "auth_v2";
        r3 = r3.equals(r1);
        if (r3 == 0) goto L_0x0030;
    L_0x0022:
        r3 = com.tinder.domain.experiments.Buckets.SmsAuthBucket.TINDER_SMS;
        goto L_0x0032;
    L_0x0025:
        r1 = "auth_v1";
        r3 = r3.equals(r1);
        if (r3 == 0) goto L_0x0030;
    L_0x002d:
        r3 = com.tinder.domain.experiments.Buckets.SmsAuthBucket.ACCOUNT_KIT;
        goto L_0x0032;
    L_0x0030:
        r3 = com.tinder.domain.experiments.Buckets.SmsAuthBucket.ACCOUNT_KIT;
    L_0x0032:
        r0.<init>(r3);
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tinder.data.buckets.a.a(java.util.Map):com.tinder.domain.experiments.Buckets");
    }

    @NotNull
    /* renamed from: a */
    public final Map<String, String> m36773a(@NotNull Buckets buckets) {
        C2668g.b(buckets, "buckets");
        String str = "sms_auth_v2";
        switch (C8628b.f30480a[buckets.getSmsAuth().ordinal()]) {
            case 1:
                buckets = "auth_v1";
                break;
            case 2:
                buckets = "auth_v2";
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        return ae.a(C15811g.a(str, buckets));
    }

    @NotNull
    /* renamed from: a */
    public final List<String> m36772a() {
        return C19301m.a("sms_auth_v2");
    }
}
