package com.tinder.data.buckets;

import com.tinder.domain.experiments.Buckets.SmsAuthBucket;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 2}, k = 3, mv = {1, 1, 10})
/* renamed from: com.tinder.data.buckets.b */
public final /* synthetic */ class C8628b {
    /* renamed from: a */
    public static final /* synthetic */ int[] f30480a = new int[SmsAuthBucket.values().length];

    static {
        f30480a[SmsAuthBucket.ACCOUNT_KIT.ordinal()] = 1;
        f30480a[SmsAuthBucket.TINDER_SMS.ordinal()] = 2;
    }
}
