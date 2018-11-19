package com.facebook.accountkit.internal;

import com.facebook.accountkit.AccountKitError.Type;
import com.facebook.accountkit.AccountKitException;

/* renamed from: com.facebook.accountkit.internal.g */
final class C1228g {
    /* renamed from: a */
    private final int f3285a;
    /* renamed from: b */
    private final int f3286b;
    /* renamed from: c */
    private final String f3287c;
    /* renamed from: d */
    private final String f3288d;
    /* renamed from: e */
    private final String f3289e;
    /* renamed from: f */
    private final AccountKitException f3290f;
    /* renamed from: g */
    private final int f3291g;

    public C1228g(int i, int i2, int i3, String str, String str2, String str3, AccountKitException accountKitException) {
        this.f3291g = i;
        this.f3285a = i2;
        this.f3287c = str;
        this.f3288d = str2;
        this.f3286b = i3;
        this.f3289e = str3;
        if (accountKitException != null) {
            this.f3290f = new AccountKitServiceException(this, accountKitException);
        } else {
            this.f3290f = new AccountKitServiceException(this, Type.SERVER_ERROR, new InternalAccountKitError(i2, str2));
        }
    }

    public C1228g(AccountKitException accountKitException) {
        this(-1, accountKitException.m4126a().getDetailErrorCode(), -1, null, null, null, accountKitException);
    }

    /* renamed from: a */
    public int m4335a() {
        return this.f3285a;
    }

    /* renamed from: b */
    public String m4336b() {
        if (this.f3288d != null) {
            return this.f3288d;
        }
        return this.f3290f.getLocalizedMessage();
    }

    /* renamed from: c */
    public String m4337c() {
        return this.f3287c;
    }

    /* renamed from: d */
    public AccountKitException m4338d() {
        return this.f3290f;
    }

    /* renamed from: e */
    public int m4339e() {
        return this.f3291g;
    }

    /* renamed from: f */
    public int m4340f() {
        return this.f3286b;
    }

    /* renamed from: g */
    public String m4341g() {
        return this.f3289e;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("{HttpStatus: ");
        stringBuilder.append(this.f3291g);
        stringBuilder.append(", errorCode: ");
        stringBuilder.append(this.f3285a);
        stringBuilder.append(", errorType: ");
        stringBuilder.append(this.f3287c);
        stringBuilder.append(", errorMessage: ");
        stringBuilder.append(m4336b());
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}
