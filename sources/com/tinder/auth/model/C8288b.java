package com.tinder.auth.model;

import com.tinder.api.ManagerWebServices;
import com.tinder.domain.config.model.ProfileEditingConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.C15823e;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\b\n\u0002\b\u0003\b\b\u0018\u0000 (2\u00020\u0001:\u0001(BK\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\r\u001a\u00020\u000e¢\u0006\u0002\u0010\u000fJ\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\nHÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\fHÆ\u0003J\t\u0010!\u001a\u00020\u000eHÆ\u0003J[\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\r\u001a\u00020\u000eHÆ\u0001J\u0013\u0010#\u001a\u00020\u00032\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010%\u001a\u00020&HÖ\u0001J\t\u0010'\u001a\u00020\fHÖ\u0001R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u0016R\u0011\u0010\u0017\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0016R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0016R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019¨\u0006)"}, d2 = {"Lcom/tinder/auth/model/AuthResult;", "", "isNewUser", "", "smsVerificationStatus", "Lcom/tinder/auth/model/SmsVerificationStatus;", "isNewUserSmsVerificationNeeded", "isAgeVerificationNeeded", "isGenderVerificationNeeded", "authState", "Lcom/tinder/auth/model/AuthState;", "authToken", "", "authType", "Lcom/tinder/auth/model/AuthType;", "(ZLcom/tinder/auth/model/SmsVerificationStatus;ZZZLcom/tinder/auth/model/AuthState;Ljava/lang/String;Lcom/tinder/auth/model/AuthType;)V", "getAuthState", "()Lcom/tinder/auth/model/AuthState;", "getAuthToken", "()Ljava/lang/String;", "getAuthType", "()Lcom/tinder/auth/model/AuthType;", "()Z", "isAuthenticated", "getSmsVerificationStatus", "()Lcom/tinder/auth/model/SmsVerificationStatus;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "other", "hashCode", "", "toString", "Companion", "domain"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.auth.model.b */
public final class C8288b {
    /* renamed from: a */
    public static final C8287a f29551a = new C8287a();
    /* renamed from: b */
    private final boolean f29552b;
    /* renamed from: c */
    private final boolean f29553c;
    @NotNull
    /* renamed from: d */
    private final C8291f f29554d;
    /* renamed from: e */
    private final boolean f29555e;
    /* renamed from: f */
    private final boolean f29556f;
    /* renamed from: g */
    private final boolean f29557g;
    @NotNull
    /* renamed from: h */
    private final AuthState f29558h;
    @Nullable
    /* renamed from: i */
    private final String f29559i;
    @NotNull
    /* renamed from: j */
    private final AuthType f29560j;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u000e\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\n"}, d2 = {"Lcom/tinder/auth/model/AuthResult$Companion;", "", "()V", "createAuthenticated", "Lcom/tinder/auth/model/AuthResult;", "authType", "Lcom/tinder/auth/model/AuthType;", "token", "", "createOnboardingRequired", "domain"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.auth.model.b$a */
    public static final class C8287a {
        private C8287a() {
        }

        @NotNull
        /* renamed from: a */
        public final C8288b m35363a(@NotNull AuthType authType) {
            C2668g.b(authType, "authType");
            return new C8288b(true, new C8291f(false, true), false, false, false, AuthState.ONBOARDING_REQUIRED, null, authType);
        }

        @NotNull
        /* renamed from: a */
        public final C8288b m35364a(@NotNull AuthType authType, @NotNull String str) {
            C2668g.b(authType, "authType");
            C2668g.b(str, ManagerWebServices.PARAM_TOKEN);
            return new C8288b(false, new C8291f(false, true), false, false, false, AuthState.AUTHENTICATED, str, authType);
        }
    }

    @NotNull
    /* renamed from: a */
    public static /* synthetic */ C8288b m35365a(C8288b c8288b, boolean z, C8291f c8291f, boolean z2, boolean z3, boolean z4, AuthState authState, String str, AuthType authType, int i, Object obj) {
        C8288b c8288b2 = c8288b;
        int i2 = i;
        return c8288b2.m35366a((i2 & 1) != 0 ? c8288b2.f29553c : z, (i2 & 2) != 0 ? c8288b2.f29554d : c8291f, (i2 & 4) != 0 ? c8288b2.f29555e : z2, (i2 & 8) != 0 ? c8288b2.f29556f : z3, (i2 & 16) != 0 ? c8288b2.f29557g : z4, (i2 & 32) != 0 ? c8288b2.f29558h : authState, (i2 & 64) != 0 ? c8288b2.f29559i : str, (i2 & ProfileEditingConfig.DEFAULT_MAX_LENGTH) != 0 ? c8288b2.f29560j : authType);
    }

    @NotNull
    /* renamed from: a */
    public final C8288b m35366a(boolean z, @NotNull C8291f c8291f, boolean z2, boolean z3, boolean z4, @NotNull AuthState authState, @Nullable String str, @NotNull AuthType authType) {
        C8291f c8291f2 = c8291f;
        C2668g.b(c8291f2, "smsVerificationStatus");
        AuthState authState2 = authState;
        C2668g.b(authState2, "authState");
        AuthType authType2 = authType;
        C2668g.b(authType2, "authType");
        return new C8288b(z, c8291f2, z2, z3, z4, authState2, str, authType2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C8288b) {
            C8288b c8288b = (C8288b) obj;
            if ((this.f29553c == c8288b.f29553c ? 1 : null) != null && C2668g.a(this.f29554d, c8288b.f29554d)) {
                if ((this.f29555e == c8288b.f29555e ? 1 : null) != null) {
                    if ((this.f29556f == c8288b.f29556f ? 1 : null) != null) {
                        return (this.f29557g == c8288b.f29557g ? 1 : null) != null && C2668g.a(this.f29558h, c8288b.f29558h) && C2668g.a(this.f29559i, c8288b.f29559i) && C2668g.a(this.f29560j, c8288b.f29560j);
                    }
                }
            }
        }
    }

    public int hashCode() {
        int i = this.f29553c;
        int i2 = 1;
        if (i != 0) {
            i = 1;
        }
        i *= 31;
        C8291f c8291f = this.f29554d;
        int i3 = 0;
        i = (i + (c8291f != null ? c8291f.hashCode() : 0)) * 31;
        int i4 = this.f29555e;
        if (i4 != 0) {
            i4 = 1;
        }
        i = (i + i4) * 31;
        i4 = this.f29556f;
        if (i4 != 0) {
            i4 = 1;
        }
        i = (i + i4) * 31;
        boolean z = this.f29557g;
        if (!z) {
            i2 = z;
        }
        i = (i + i2) * 31;
        AuthState authState = this.f29558h;
        i = (i + (authState != null ? authState.hashCode() : 0)) * 31;
        String str = this.f29559i;
        i = (i + (str != null ? str.hashCode() : 0)) * 31;
        AuthType authType = this.f29560j;
        if (authType != null) {
            i3 = authType.hashCode();
        }
        return i + i3;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("AuthResult(isNewUser=");
        stringBuilder.append(this.f29553c);
        stringBuilder.append(", smsVerificationStatus=");
        stringBuilder.append(this.f29554d);
        stringBuilder.append(", isNewUserSmsVerificationNeeded=");
        stringBuilder.append(this.f29555e);
        stringBuilder.append(", isAgeVerificationNeeded=");
        stringBuilder.append(this.f29556f);
        stringBuilder.append(", isGenderVerificationNeeded=");
        stringBuilder.append(this.f29557g);
        stringBuilder.append(", authState=");
        stringBuilder.append(this.f29558h);
        stringBuilder.append(", authToken=");
        stringBuilder.append(this.f29559i);
        stringBuilder.append(", authType=");
        stringBuilder.append(this.f29560j);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public C8288b(boolean z, @NotNull C8291f c8291f, boolean z2, boolean z3, boolean z4, @NotNull AuthState authState, @Nullable String str, @NotNull AuthType authType) {
        C2668g.b(c8291f, "smsVerificationStatus");
        C2668g.b(authState, "authState");
        C2668g.b(authType, "authType");
        this.f29553c = z;
        this.f29554d = c8291f;
        this.f29555e = z2;
        this.f29556f = z3;
        this.f29557g = z4;
        this.f29558h = authState;
        this.f29559i = str;
        this.f29560j = authType;
        this.f29552b = this.f29558h == AuthState.AUTHENTICATED;
    }

    /* renamed from: b */
    public final boolean m35368b() {
        return this.f29553c;
    }

    @NotNull
    /* renamed from: c */
    public final C8291f m35369c() {
        return this.f29554d;
    }

    /* renamed from: d */
    public final boolean m35370d() {
        return this.f29555e;
    }

    /* renamed from: e */
    public final boolean m35371e() {
        return this.f29556f;
    }

    public /* synthetic */ C8288b(boolean z, C8291f c8291f, boolean z2, boolean z3, boolean z4, AuthState authState, String str, AuthType authType, int i, C15823e c15823e) {
        this(z, c8291f, z2, (i & 8) != 0 ? false : z3, (i & 16) != 0 ? false : z4, authState, str, authType);
    }

    /* renamed from: f */
    public final boolean m35372f() {
        return this.f29557g;
    }

    @NotNull
    /* renamed from: g */
    public final AuthState m35373g() {
        return this.f29558h;
    }

    @Nullable
    /* renamed from: h */
    public final String m35374h() {
        return this.f29559i;
    }

    @NotNull
    /* renamed from: i */
    public final AuthType m35375i() {
        return this.f29560j;
    }

    /* renamed from: a */
    public final boolean m35367a() {
        return this.f29552b;
    }
}
