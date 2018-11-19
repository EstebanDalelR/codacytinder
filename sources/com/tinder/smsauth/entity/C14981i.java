package com.tinder.smsauth.entity;

import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\u000e\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u0011R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0016"}, d2 = {"Lcom/tinder/smsauth/entity/PhoneNumberStatus;", "", "phoneNumber", "Lcom/tinder/smsauth/entity/PhoneNumber;", "hasValidFormat", "", "(Lcom/tinder/smsauth/entity/PhoneNumber;Z)V", "getHasValidFormat", "()Z", "getPhoneNumber", "()Lcom/tinder/smsauth/entity/PhoneNumber;", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "withCountryCode", "newCountryCode", "entity"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.smsauth.entity.i */
public final class C14981i {
    @NotNull
    /* renamed from: a */
    private final C14980h f46754a;
    /* renamed from: b */
    private final boolean f46755b;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C14981i) {
            C14981i c14981i = (C14981i) obj;
            if (C2668g.a(this.f46754a, c14981i.f46754a)) {
                if ((this.f46755b == c14981i.f46755b ? 1 : null) != null) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        C14980h c14980h = this.f46754a;
        int hashCode = (c14980h != null ? c14980h.hashCode() : 0) * 31;
        int i = this.f46755b;
        if (i != 0) {
            i = 1;
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("PhoneNumberStatus(phoneNumber=");
        stringBuilder.append(this.f46754a);
        stringBuilder.append(", hasValidFormat=");
        stringBuilder.append(this.f46755b);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public C14981i(@NotNull C14980h c14980h, boolean z) {
        C2668g.b(c14980h, "phoneNumber");
        this.f46754a = c14980h;
        this.f46755b = z;
    }

    @NotNull
    /* renamed from: a */
    public final C14980h m56580a() {
        return this.f46754a;
    }

    /* renamed from: b */
    public final boolean m56581b() {
        return this.f46755b;
    }
}
