package com.tinder.auth.repository;

import com.tinder.api.ManagerWebServices;
import com.tinder.auth.model.AuthType;
import io.reactivex.C3956a;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u0007H\u0016R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u0004\u0018\u00010\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u0004\u0018\u00010\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\t¨\u0006\u000e"}, d2 = {"Lcom/tinder/auth/repository/LongLivedTokenRepository;", "", "authType", "Lcom/tinder/auth/model/AuthType;", "getAuthType", "()Lcom/tinder/auth/model/AuthType;", "id", "", "getId", "()Ljava/lang/String;", "token", "getToken", "save", "Lio/reactivex/Completable;", "domain"}, k = 1, mv = {1, 1, 10})
public interface LongLivedTokenRepository {

    @Metadata(bv = {1, 0, 2}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.auth.repository.LongLivedTokenRepository$a */
    public static final class C8294a {
        @NotNull
        /* renamed from: a */
        public static C3956a m35388a(LongLivedTokenRepository longLivedTokenRepository, @NotNull String str) {
            C2668g.b(str, ManagerWebServices.PARAM_TOKEN);
            longLivedTokenRepository = C3956a.a();
            C2668g.a(longLivedTokenRepository, "Completable.complete()");
            return longLivedTokenRepository;
        }
    }

    @NotNull
    AuthType getAuthType();

    @Nullable
    String getId();

    @Nullable
    String getToken();

    @NotNull
    C3956a save(@NotNull String str);
}
