package com.tinder.smsauth.entity;

import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/tinder/smsauth/entity/VerifyOneTimePasswordRequest;", "", "phoneNumber", "Lcom/tinder/smsauth/entity/PhoneNumber;", "oneTimePassword", "", "(Lcom/tinder/smsauth/entity/PhoneNumber;Ljava/lang/String;)V", "getOneTimePassword", "()Ljava/lang/String;", "getPhoneNumber", "()Lcom/tinder/smsauth/entity/PhoneNumber;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "entity"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.smsauth.entity.j */
public final class C14982j {
    @NotNull
    /* renamed from: a */
    private final C14980h f46756a;
    @NotNull
    /* renamed from: b */
    private final String f46757b;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C14982j) {
                C14982j c14982j = (C14982j) obj;
                if (C2668g.a(this.f46756a, c14982j.f46756a) && C2668g.a(this.f46757b, c14982j.f46757b)) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        C14980h c14980h = this.f46756a;
        int i = 0;
        int hashCode = (c14980h != null ? c14980h.hashCode() : 0) * 31;
        String str = this.f46757b;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("VerifyOneTimePasswordRequest(phoneNumber=");
        stringBuilder.append(this.f46756a);
        stringBuilder.append(", oneTimePassword=");
        stringBuilder.append(this.f46757b);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public C14982j(@NotNull C14980h c14980h, @NotNull String str) {
        C2668g.b(c14980h, "phoneNumber");
        C2668g.b(str, "oneTimePassword");
        this.f46756a = c14980h;
        this.f46757b = str;
    }

    @NotNull
    /* renamed from: a */
    public final C14980h m56582a() {
        return this.f46756a;
    }

    @NotNull
    /* renamed from: b */
    public final String m56583b() {
        return this.f46757b;
    }
}
