package com.tinder.domain.settings.email.usecase;

import com.tinder.common.logger.Logger;
import com.tinder.domain.common.usecase.VoidUseCase;
import com.tinder.domain.profile.model.EmailSettingsUpdateRequest;
import com.tinder.domain.profile.repository.ProfileRemoteRepository;
import com.tinder.domain.settings.email.model.EmailSettings;
import io.reactivex.schedulers.C15756a;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0002H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/tinder/domain/settings/email/usecase/SaveEmailSettings;", "Lcom/tinder/domain/common/usecase/VoidUseCase;", "Lcom/tinder/domain/settings/email/model/EmailSettings;", "profileRemoteRepository", "Lcom/tinder/domain/profile/repository/ProfileRemoteRepository;", "logger", "Lcom/tinder/common/logger/Logger;", "(Lcom/tinder/domain/profile/repository/ProfileRemoteRepository;Lcom/tinder/common/logger/Logger;)V", "execute", "", "request", "domain_release"}, k = 1, mv = {1, 1, 10})
public final class SaveEmailSettings implements VoidUseCase<EmailSettings> {
    private final Logger logger;
    private final ProfileRemoteRepository profileRemoteRepository;

    @Inject
    public SaveEmailSettings(@NotNull ProfileRemoteRepository profileRemoteRepository, @NotNull Logger logger) {
        C2668g.b(profileRemoteRepository, "profileRemoteRepository");
        C2668g.b(logger, "logger");
        this.profileRemoteRepository = profileRemoteRepository;
        this.logger = logger;
    }

    public void execute(@NotNull EmailSettings emailSettings) {
        C2668g.b(emailSettings, "request");
        this.profileRemoteRepository.update(new EmailSettingsUpdateRequest(emailSettings)).b(C15756a.b()).a(new SaveEmailSettings$execute$1(this, emailSettings), new SaveEmailSettings$execute$2(this, emailSettings));
    }
}
