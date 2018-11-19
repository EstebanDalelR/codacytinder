package com.tinder.domain.profile.usecase;

import com.tinder.domain.profile.repository.InstagramRepository;
import io.reactivex.C3956a;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\u0005\u001a\u00020\u0006R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/tinder/domain/profile/usecase/DisconnectInstagram;", "", "repository", "Lcom/tinder/domain/profile/repository/InstagramRepository;", "(Lcom/tinder/domain/profile/repository/InstagramRepository;)V", "execute", "Lio/reactivex/Completable;", "domain_release"}, k = 1, mv = {1, 1, 10})
public final class DisconnectInstagram {
    private final InstagramRepository repository;

    @Inject
    public DisconnectInstagram(@NotNull InstagramRepository instagramRepository) {
        C2668g.b(instagramRepository, "repository");
        this.repository = instagramRepository;
    }

    @NotNull
    public final C3956a execute() {
        return this.repository.disconnect();
    }
}
