package com.tinder.domain.profile.repository;

import com.tinder.domain.profile.model.InstagramAuthResult;
import io.reactivex.C3956a;
import io.reactivex.C3960g;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&J\b\u0010\u0007\u001a\u00020\bH&¨\u0006\t"}, d2 = {"Lcom/tinder/domain/profile/repository/InstagramRepository;", "", "connect", "Lio/reactivex/Single;", "Lcom/tinder/domain/profile/model/InstagramAuthResult;", "authorizationCode", "", "disconnect", "Lio/reactivex/Completable;", "domain_release"}, k = 1, mv = {1, 1, 10})
public interface InstagramRepository {
    @NotNull
    C3960g<InstagramAuthResult> connect(@NotNull String str);

    @NotNull
    C3956a disconnect();
}
