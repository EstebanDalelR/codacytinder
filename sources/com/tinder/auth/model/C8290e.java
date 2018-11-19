package com.tinder.auth.model;

import com.tinder.smsauth.entity.C14976d;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u001b\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, d2 = {"Lcom/tinder/auth/model/LoginRequest;", "", "authType", "Lcom/tinder/auth/model/AuthType;", "loginCredentials", "Lcom/tinder/smsauth/entity/LoginCredentials;", "(Lcom/tinder/auth/model/AuthType;Lcom/tinder/smsauth/entity/LoginCredentials;)V", "getAuthType", "()Lcom/tinder/auth/model/AuthType;", "getLoginCredentials", "()Lcom/tinder/smsauth/entity/LoginCredentials;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.auth.model.e */
public final class C8290e {
    @NotNull
    /* renamed from: a */
    private final AuthType f29561a;
    @Nullable
    /* renamed from: b */
    private final C14976d f29562b;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C8290e) {
                C8290e c8290e = (C8290e) obj;
                if (C2668g.a(this.f29561a, c8290e.f29561a) && C2668g.a(this.f29562b, c8290e.f29562b)) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        AuthType authType = this.f29561a;
        int i = 0;
        int hashCode = (authType != null ? authType.hashCode() : 0) * 31;
        C14976d c14976d = this.f29562b;
        if (c14976d != null) {
            i = c14976d.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("LoginRequest(authType=");
        stringBuilder.append(this.f29561a);
        stringBuilder.append(", loginCredentials=");
        stringBuilder.append(this.f29562b);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    @JvmOverloads
    public C8290e(@NotNull AuthType authType, @Nullable C14976d c14976d) {
        C2668g.b(authType, "authType");
        this.f29561a = authType;
        this.f29562b = c14976d;
    }

    @NotNull
    /* renamed from: a */
    public final AuthType m35378a() {
        return this.f29561a;
    }

    @Nullable
    /* renamed from: b */
    public final C14976d m35379b() {
        return this.f29562b;
    }
}
