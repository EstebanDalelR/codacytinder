package com.tinder.domain.profile.usecase;

import com.tinder.domain.profile.model.ProfileOption;
import com.tinder.domain.profile.repository.ProfileLocalRepository;
import io.reactivex.C3959e;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J \u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00070\u0006\"\u0004\b\u0000\u0010\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u0002H\u00070\tJ/\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00070\u0006\"\u0004\b\u0000\u0010\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u0002H\u00070\t2\b\u0010\n\u001a\u0004\u0018\u0001H\u0007¢\u0006\u0002\u0010\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/tinder/domain/profile/usecase/LoadProfileOptionData;", "", "repository", "Lcom/tinder/domain/profile/repository/ProfileLocalRepository;", "(Lcom/tinder/domain/profile/repository/ProfileLocalRepository;)V", "execute", "Lio/reactivex/Observable;", "T", "request", "Lcom/tinder/domain/profile/model/ProfileOption;", "defaultValue", "(Lcom/tinder/domain/profile/model/ProfileOption;Ljava/lang/Object;)Lio/reactivex/Observable;", "domain_release"}, k = 1, mv = {1, 1, 10})
public final class LoadProfileOptionData {
    private final ProfileLocalRepository repository;

    @Inject
    public LoadProfileOptionData(@NotNull ProfileLocalRepository profileLocalRepository) {
        C2668g.b(profileLocalRepository, "repository");
        this.repository = profileLocalRepository;
    }

    @NotNull
    public final <T> C3959e<T> execute(@NotNull ProfileOption<? extends T> profileOption, @Nullable T t) {
        C2668g.b(profileOption, "request");
        if (t != null) {
            t = this.repository.loadProfileOption(profileOption, t);
            if (t != null) {
                return t;
            }
        }
        return this.repository.loadProfileOption(profileOption);
    }

    @NotNull
    public final <T> C3959e<T> execute(@NotNull ProfileOption<? extends T> profileOption) {
        C2668g.b(profileOption, "request");
        return execute(profileOption, profileOption.getDefaultValue());
    }
}
