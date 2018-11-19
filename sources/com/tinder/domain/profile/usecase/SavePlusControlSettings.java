package com.tinder.domain.profile.usecase;

import com.tinder.domain.common.reactivex.usecase.CompletableUseCase;
import com.tinder.domain.meta.model.PlusControlSettings;
import com.tinder.domain.profile.model.ProfileOption.PlusControl;
import com.tinder.domain.profile.repository.ProfileRemoteRepository;
import io.reactivex.C3956a;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0002H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/tinder/domain/profile/usecase/SavePlusControlSettings;", "Lcom/tinder/domain/common/reactivex/usecase/CompletableUseCase;", "Lcom/tinder/domain/meta/model/PlusControlSettings;", "loadProfileOptionData", "Lcom/tinder/domain/profile/usecase/LoadProfileOptionData;", "profileRemoteRepository", "Lcom/tinder/domain/profile/repository/ProfileRemoteRepository;", "(Lcom/tinder/domain/profile/usecase/LoadProfileOptionData;Lcom/tinder/domain/profile/repository/ProfileRemoteRepository;)V", "execute", "Lio/reactivex/Completable;", "request", "domain_release"}, k = 1, mv = {1, 1, 10})
public final class SavePlusControlSettings implements CompletableUseCase<PlusControlSettings> {
    private final LoadProfileOptionData loadProfileOptionData;
    private final ProfileRemoteRepository profileRemoteRepository;

    @Inject
    public SavePlusControlSettings(@NotNull LoadProfileOptionData loadProfileOptionData, @NotNull ProfileRemoteRepository profileRemoteRepository) {
        C2668g.b(loadProfileOptionData, "loadProfileOptionData");
        C2668g.b(profileRemoteRepository, "profileRemoteRepository");
        this.loadProfileOptionData = loadProfileOptionData;
        this.profileRemoteRepository = profileRemoteRepository;
    }

    @NotNull
    public C3956a execute(@NotNull PlusControlSettings plusControlSettings) {
        C2668g.b(plusControlSettings, "request");
        plusControlSettings = this.loadProfileOptionData.execute(PlusControl.INSTANCE).firstElement().e(new SavePlusControlSettings$execute$1(this, plusControlSettings));
        C2668g.a(plusControlSettings, "loadProfileOptionData.ex…      }\n                }");
        return plusControlSettings;
    }
}
