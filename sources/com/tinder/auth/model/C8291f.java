package com.tinder.auth.model;

import kotlin.Metadata;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\u00032\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u0006¨\u0006\u0011"}, d2 = {"Lcom/tinder/auth/model/SmsVerificationStatus;", "", "shouldVerifySms", "", "isDismissible", "(ZZ)V", "()Z", "getShouldVerifySms", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "domain"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.auth.model.f */
public final class C8291f {
    /* renamed from: a */
    private final boolean f29563a;
    /* renamed from: b */
    private final boolean f29564b;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C8291f) {
            C8291f c8291f = (C8291f) obj;
            if ((this.f29563a == c8291f.f29563a ? 1 : null) != null) {
                if ((this.f29564b == c8291f.f29564b ? 1 : null) != null) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        int i = this.f29563a;
        int i2 = 1;
        if (i != 0) {
            i = 1;
        }
        i *= 31;
        boolean z = this.f29564b;
        if (!z) {
            i2 = z;
        }
        return i + i2;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("SmsVerificationStatus(shouldVerifySms=");
        stringBuilder.append(this.f29563a);
        stringBuilder.append(", isDismissible=");
        stringBuilder.append(this.f29564b);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public C8291f(boolean z, boolean z2) {
        this.f29563a = z;
        this.f29564b = z2;
    }

    /* renamed from: a */
    public final boolean m35380a() {
        return this.f29563a;
    }

    /* renamed from: b */
    public final boolean m35381b() {
        return this.f29564b;
    }
}
