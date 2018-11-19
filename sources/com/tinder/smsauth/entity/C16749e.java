package com.tinder.smsauth.entity;

import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0013"}, d2 = {"Lcom/tinder/smsauth/entity/OnboardingCredentials;", "Lcom/tinder/smsauth/entity/LoginCredentials;", "refreshToken", "", "onboardingToken", "(Ljava/lang/String;Ljava/lang/String;)V", "getOnboardingToken", "()Ljava/lang/String;", "getRefreshToken", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "entity"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.smsauth.entity.e */
public final class C16749e extends C14976d {
    @NotNull
    /* renamed from: a */
    private final String f51753a;
    @NotNull
    /* renamed from: b */
    private final String f51754b;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C16749e) {
                C16749e c16749e = (C16749e) obj;
                if (C2668g.a(this.f51753a, c16749e.f51753a) && C2668g.a(this.f51754b, c16749e.f51754b)) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        String str = this.f51753a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f51754b;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("OnboardingCredentials(refreshToken=");
        stringBuilder.append(this.f51753a);
        stringBuilder.append(", onboardingToken=");
        stringBuilder.append(this.f51754b);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    @NotNull
    /* renamed from: a */
    public final String m62263a() {
        return this.f51754b;
    }

    public C16749e(@NotNull String str, @NotNull String str2) {
        C2668g.b(str, "refreshToken");
        C2668g.b(str2, "onboardingToken");
        super(str);
        this.f51753a = str;
        this.f51754b = str2;
    }
}
