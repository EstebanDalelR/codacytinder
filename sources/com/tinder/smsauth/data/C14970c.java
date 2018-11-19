package com.tinder.smsauth.data;

import com.tinder.smsauth.entity.SmsAuthType;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 2}, k = 3, mv = {1, 1, 10})
/* renamed from: com.tinder.smsauth.data.c */
public final /* synthetic */ class C14970c {
    /* renamed from: a */
    public static final /* synthetic */ int[] f46736a = new int[SmsAuthType.values().length];

    static {
        f46736a[SmsAuthType.FACEBOOK.ordinal()] = 1;
        f46736a[SmsAuthType.SMS.ordinal()] = 2;
    }
}
