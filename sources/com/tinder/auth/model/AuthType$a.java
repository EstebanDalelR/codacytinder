package com.tinder.auth.model;

import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0014\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0007¨\u0006\u0007"}, d2 = {"Lcom/tinder/auth/model/AuthType$Companion;", "", "()V", "fromValue", "Lcom/tinder/auth/model/AuthType;", "value", "", "domain"}, k = 1, mv = {1, 1, 10})
public final class AuthType$a {
    private AuthType$a() {
    }

    @JvmStatic
    @Nullable
    /* renamed from: a */
    public final AuthType m35358a(@Nullable String str) {
        for (AuthType authType : AuthType.values()) {
            if (C2668g.a(authType.getKey(), str)) {
                return authType;
            }
        }
        return null;
    }
}
