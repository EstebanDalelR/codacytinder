package com.tinder.data.auth;

import com.tinder.domain.auth.AuthStatus;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C15825i;
import kotlin.jvm.internal.FunctionReference;
import kotlin.reflect.KDeclarationContainer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0017\u0010\u0002\u001a\u0013\u0018\u00010\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "Lcom/tinder/domain/auth/AuthStatus;", "p1", "", "Lkotlin/ParameterName;", "name", "authToken", "invoke"}, k = 3, mv = {1, 1, 10})
final class AuthStatusSharedPreferenceRepository$observeAuthStatus$1 extends FunctionReference implements Function1<String, AuthStatus> {
    AuthStatusSharedPreferenceRepository$observeAuthStatus$1(C10747a c10747a) {
        super(1, c10747a);
    }

    public final String getName() {
        return "toAuthStatus";
    }

    public final KDeclarationContainer getOwner() {
        return C15825i.a(C10747a.class);
    }

    public final String getSignature() {
        return "toAuthStatus(Ljava/lang/String;)Lcom/tinder/domain/auth/AuthStatus;";
    }

    public /* synthetic */ Object invoke(Object obj) {
        return m54061a((String) obj);
    }

    @NotNull
    /* renamed from: a */
    public final AuthStatus m54061a(@Nullable String str) {
        return ((C10747a) this.receiver).m43154a(str);
    }
}
