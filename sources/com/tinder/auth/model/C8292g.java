package com.tinder.auth.model;

import kotlin.Metadata;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J'\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00032\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\u0006\u0010\u0013\u001a\u00020\u0003J\u0006\u0010\u0014\u001a\u00020\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0017"}, d2 = {"Lcom/tinder/auth/model/ValidationState;", "", "smsValidationRequired", "", "genderValidationRequired", "ageValidationRequired", "(ZZZ)V", "getAgeValidationRequired", "()Z", "getGenderValidationRequired", "getSmsValidationRequired", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "isAnyValidationRequired", "isProfileValidationRequired", "toString", "", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.auth.model.g */
public final class C8292g {
    /* renamed from: a */
    private final boolean f29565a;
    /* renamed from: b */
    private final boolean f29566b;
    /* renamed from: c */
    private final boolean f29567c;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C8292g) {
            C8292g c8292g = (C8292g) obj;
            if ((this.f29565a == c8292g.f29565a ? 1 : null) != null) {
                if ((this.f29566b == c8292g.f29566b ? 1 : null) != null) {
                    if ((this.f29567c == c8292g.f29567c ? 1 : null) != null) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public int hashCode() {
        int i = this.f29565a;
        int i2 = 1;
        if (i != 0) {
            i = 1;
        }
        i *= 31;
        int i3 = this.f29566b;
        if (i3 != 0) {
            i3 = 1;
        }
        i = (i + i3) * 31;
        boolean z = this.f29567c;
        if (!z) {
            i2 = z;
        }
        return i + i2;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("ValidationState(smsValidationRequired=");
        stringBuilder.append(this.f29565a);
        stringBuilder.append(", genderValidationRequired=");
        stringBuilder.append(this.f29566b);
        stringBuilder.append(", ageValidationRequired=");
        stringBuilder.append(this.f29567c);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public C8292g(boolean z, boolean z2, boolean z3) {
        this.f29565a = z;
        this.f29566b = z2;
        this.f29567c = z3;
    }

    /* renamed from: c */
    public final boolean m35384c() {
        return this.f29565a;
    }

    /* renamed from: d */
    public final boolean m35385d() {
        return this.f29566b;
    }

    /* renamed from: e */
    public final boolean m35386e() {
        return this.f29567c;
    }

    /* renamed from: a */
    public final boolean m35382a() {
        if (!this.f29565a) {
            if (!m35383b()) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: b */
    public final boolean m35383b() {
        if (!this.f29566b) {
            if (!this.f29567c) {
                return false;
            }
        }
        return true;
    }
}
