package com.tinder.domain.profile.usecase;

import com.tinder.domain.common.reactivex.usecase.CompletableUseCase;
import com.tinder.domain.profile.model.ProfileOption.WebProfile;
import com.tinder.domain.profile.model.settings.WebProfileSettings;
import com.tinder.domain.profile.repository.ProfileLocalRepository;
import com.tinder.domain.profile.repository.WebProfileRepository;
import io.reactivex.C3956a;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0002H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/tinder/domain/profile/usecase/UpdateWebProfileUsername;", "Lcom/tinder/domain/common/reactivex/usecase/CompletableUseCase;", "", "repository", "Lcom/tinder/domain/profile/repository/WebProfileRepository;", "profileLocalRepository", "Lcom/tinder/domain/profile/repository/ProfileLocalRepository;", "(Lcom/tinder/domain/profile/repository/WebProfileRepository;Lcom/tinder/domain/profile/repository/ProfileLocalRepository;)V", "execute", "Lio/reactivex/Completable;", "request", "domain_release"}, k = 1, mv = {1, 1, 10})
public final class UpdateWebProfileUsername implements CompletableUseCase<String> {
    private final ProfileLocalRepository profileLocalRepository;
    private final WebProfileRepository repository;

    @Inject
    public UpdateWebProfileUsername(@NotNull WebProfileRepository webProfileRepository, @NotNull ProfileLocalRepository profileLocalRepository) {
        C2668g.b(webProfileRepository, "repository");
        C2668g.b(profileLocalRepository, "profileLocalRepository");
        this.repository = webProfileRepository;
        this.profileLocalRepository = profileLocalRepository;
    }

    @NotNull
    public C3956a execute(@NotNull String str) {
        C2668g.b(str, "request");
        str = this.profileLocalRepository.loadProfileOption(WebProfile.INSTANCE).first(WebProfileSettings.DEFAULT).d(new UpdateWebProfileUsername$execute$1(this, str));
        C2668g.a(str, "profileLocalRepository.l…      }\n                }");
        return str;
    }
}
