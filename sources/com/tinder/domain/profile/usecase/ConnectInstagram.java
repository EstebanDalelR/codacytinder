package com.tinder.domain.profile.usecase;

import com.tinder.domain.common.reactivex.usecase.SingleUseCase;
import com.tinder.domain.profile.model.InstagramAuthResult;
import com.tinder.domain.profile.repository.InstagramRepository;
import io.reactivex.C3960g;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\b2\u0006\u0010\t\u001a\u00020\u0002H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/tinder/domain/profile/usecase/ConnectInstagram;", "Lcom/tinder/domain/common/reactivex/usecase/SingleUseCase;", "", "Lcom/tinder/domain/profile/model/InstagramAuthResult;", "repository", "Lcom/tinder/domain/profile/repository/InstagramRepository;", "(Lcom/tinder/domain/profile/repository/InstagramRepository;)V", "execute", "Lio/reactivex/Single;", "authorizationCode", "domain_release"}, k = 1, mv = {1, 1, 10})
public final class ConnectInstagram implements SingleUseCase<String, InstagramAuthResult> {
    private final InstagramRepository repository;

    @Inject
    public ConnectInstagram(@NotNull InstagramRepository instagramRepository) {
        C2668g.b(instagramRepository, "repository");
        this.repository = instagramRepository;
    }

    @NotNull
    public C3960g<InstagramAuthResult> execute(@NotNull String str) {
        C2668g.b(str, "authorizationCode");
        return this.repository.connect(str);
    }
}
