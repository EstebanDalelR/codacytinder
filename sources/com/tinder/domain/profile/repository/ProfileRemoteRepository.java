package com.tinder.domain.profile.repository;

import com.tinder.domain.profile.model.ProfileDataRequest;
import com.tinder.domain.profile.model.ProfileUpdateRequest;
import io.reactivex.C3956a;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import rx.annotations.Experimental;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0007H&¨\u0006\b"}, d2 = {"Lcom/tinder/domain/profile/repository/ProfileRemoteRepository;", "", "fetch", "Lio/reactivex/Completable;", "request", "Lcom/tinder/domain/profile/model/ProfileDataRequest;", "update", "Lcom/tinder/domain/profile/model/ProfileUpdateRequest;", "domain_release"}, k = 1, mv = {1, 1, 10})
@Experimental
public interface ProfileRemoteRepository {
    @NotNull
    C3956a fetch(@NotNull ProfileDataRequest profileDataRequest);

    @NotNull
    C3956a update(@NotNull ProfileUpdateRequest profileUpdateRequest);
}
