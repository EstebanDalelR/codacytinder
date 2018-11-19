package com.tinder.auth.model;

import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\r\u001a\u00020\u00032\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0013"}, d2 = {"Lcom/tinder/auth/model/AuthLedger;", "", "isNewUser", "", "smsVerificationStatus", "Lcom/tinder/auth/model/SmsVerificationStatus;", "(ZLcom/tinder/auth/model/SmsVerificationStatus;)V", "()Z", "getSmsVerificationStatus", "()Lcom/tinder/auth/model/SmsVerificationStatus;", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "domain"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.auth.model.a */
public final class C8286a {
    /* renamed from: a */
    private final boolean f29549a;
    @NotNull
    /* renamed from: b */
    private final C8291f f29550b;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C8286a) {
            C8286a c8286a = (C8286a) obj;
            return (this.f29549a == c8286a.f29549a ? 1 : null) != null && C2668g.a(this.f29550b, c8286a.f29550b);
        }
    }

    public int hashCode() {
        int i = this.f29549a;
        if (i != 0) {
            i = 1;
        }
        i *= 31;
        C8291f c8291f = this.f29550b;
        return i + (c8291f != null ? c8291f.hashCode() : 0);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("AuthLedger(isNewUser=");
        stringBuilder.append(this.f29549a);
        stringBuilder.append(", smsVerificationStatus=");
        stringBuilder.append(this.f29550b);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public C8286a(boolean z, @NotNull C8291f c8291f) {
        C2668g.b(c8291f, "smsVerificationStatus");
        this.f29549a = z;
        this.f29550b = c8291f;
    }

    /* renamed from: a */
    public final boolean m35361a() {
        return this.f29549a;
    }

    @NotNull
    /* renamed from: b */
    public final C8291f m35362b() {
        return this.f29550b;
    }
}
