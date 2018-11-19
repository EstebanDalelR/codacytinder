package com.tinder.auth.repository;

import com.facebook.AccessToken;
import com.tinder.api.ManagerWebServices;
import com.tinder.auth.model.AuthType;
import com.tinder.auth.repository.LongLivedTokenRepository.C8294a;
import io.reactivex.C3956a;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.ak;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0015\u001a\u00020\u0016R\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f8F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0010\u001a\u0004\u0018\u00010\r8VX\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0013\u001a\u0004\u0018\u00010\r8VX\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0012¨\u0006\u0017"}, d2 = {"Lcom/tinder/auth/repository/FacebookAuthTokenRepository;", "Lcom/tinder/auth/repository/LongLivedTokenRepository;", "()V", "accessToken", "Lcom/facebook/AccessToken;", "getAccessToken", "()Lcom/facebook/AccessToken;", "authType", "Lcom/tinder/auth/model/AuthType;", "getAuthType", "()Lcom/tinder/auth/model/AuthType;", "grantedPermissions", "", "", "getGrantedPermissions", "()Ljava/util/Set;", "id", "getId", "()Ljava/lang/String;", "token", "getToken", "refreshToken", "", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.auth.repository.m */
public final class C10350m implements LongLivedTokenRepository {
    @NotNull
    /* renamed from: a */
    private final AuthType f33779a = AuthType.FACEBOOK;

    @NotNull
    public C3956a save(@NotNull String str) {
        C2668g.b(str, ManagerWebServices.PARAM_TOKEN);
        return C8294a.m35388a(this, str);
    }

    @Nullable
    public String getToken() {
        AccessToken a = m42160a();
        return a != null ? a.getToken() : null;
    }

    @Nullable
    public String getId() {
        AccessToken a = m42160a();
        return a != null ? a.getUserId() : null;
    }

    @NotNull
    public AuthType getAuthType() {
        return this.f33779a;
    }

    @Nullable
    /* renamed from: a */
    public final AccessToken m42160a() {
        return AccessToken.getCurrentAccessToken();
    }

    @NotNull
    /* renamed from: b */
    public final Set<String> m42161b() {
        AccessToken a = m42160a();
        if (a != null) {
            Set<String> permissions = a.getPermissions();
            if (permissions != null) {
                return permissions;
            }
        }
        return ak.a();
    }
}
