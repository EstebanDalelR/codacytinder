package com.tinder.auth.accountkit;

import com.facebook.accountkit.AccessToken;
import com.facebook.accountkit.AccountKit;
import com.tinder.api.ManagerWebServices;
import com.tinder.auth.model.AuthType;
import com.tinder.auth.repository.LongLivedTokenRepository;
import com.tinder.auth.repository.LongLivedTokenRepository.C8294a;
import io.reactivex.C3956a;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00048BX\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u000b\u001a\u0004\u0018\u00010\f8VX\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u000f\u001a\u0004\u0018\u00010\f8VX\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u000e¨\u0006\u0011"}, d2 = {"Lcom/tinder/auth/accountkit/AccountKitAuthTokenRepository;", "Lcom/tinder/auth/repository/LongLivedTokenRepository;", "()V", "accessToken", "Lcom/facebook/accountkit/AccessToken;", "getAccessToken", "()Lcom/facebook/accountkit/AccessToken;", "authType", "Lcom/tinder/auth/model/AuthType;", "getAuthType", "()Lcom/tinder/auth/model/AuthType;", "id", "", "getId", "()Ljava/lang/String;", "token", "getToken", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.auth.accountkit.a */
public final class C10326a implements LongLivedTokenRepository {
    @NotNull
    /* renamed from: a */
    private final AuthType f33732a = AuthType.ACCOUNTKIT;

    @NotNull
    public C3956a save(@NotNull String str) {
        C2668g.b(str, ManagerWebServices.PARAM_TOKEN);
        return C8294a.m35388a(this, str);
    }

    @Nullable
    public String getToken() {
        AccessToken a = m42104a();
        return a != null ? a.getToken() : null;
    }

    @Nullable
    public String getId() {
        AccessToken a = m42104a();
        return a != null ? a.getAccountId() : null;
    }

    @NotNull
    public AuthType getAuthType() {
        return this.f33732a;
    }

    /* renamed from: a */
    private final AccessToken m42104a() {
        return AccountKit.e();
    }
}
