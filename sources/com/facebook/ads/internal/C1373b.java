package com.facebook.ads.internal;

import android.text.TextUtils;
import com.facebook.ads.AdError;
import com.facebook.ads.internal.protocol.AdErrorType;
import com.facebook.ads.internal.protocol.C1520a;

/* renamed from: com.facebook.ads.internal.b */
public class C1373b {
    /* renamed from: a */
    private final AdErrorType f3722a;
    /* renamed from: b */
    private final String f3723b;

    public C1373b(int i, String str) {
        this(AdErrorType.adErrorTypeFromCode(i), str);
    }

    public C1373b(AdErrorType adErrorType, String str) {
        if (TextUtils.isEmpty(str)) {
            str = adErrorType.getDefaultErrorMessage();
        }
        this.f3722a = adErrorType;
        this.f3723b = str;
    }

    /* renamed from: a */
    public static C1373b m4793a(AdErrorType adErrorType, String str) {
        return new C1373b(adErrorType, str);
    }

    /* renamed from: a */
    public static C1373b m4794a(C1520a c1520a) {
        return new C1373b(c1520a.m5359a(), c1520a.m5360b());
    }

    /* renamed from: a */
    public AdErrorType m4795a() {
        return this.f3722a;
    }

    /* renamed from: b */
    public AdError m4796b() {
        return this.f3722a.isPublicError() ? new AdError(this.f3722a.getErrorCode(), this.f3723b) : new AdError(AdErrorType.UNKNOWN_ERROR.getErrorCode(), AdErrorType.UNKNOWN_ERROR.getDefaultErrorMessage());
    }
}
