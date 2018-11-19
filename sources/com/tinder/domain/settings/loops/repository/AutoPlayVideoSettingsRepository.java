package com.tinder.domain.settings.loops.repository;

import com.tinder.domain.settings.loops.model.AutoPlayVideoSettingsOption;
import io.reactivex.C3956a;
import io.reactivex.C3959e;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H&J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0006H&¨\u0006\t"}, d2 = {"Lcom/tinder/domain/settings/loops/repository/AutoPlayVideoSettingsRepository;", "", "clear", "Lio/reactivex/Completable;", "observe", "Lio/reactivex/Observable;", "Lcom/tinder/domain/settings/loops/model/AutoPlayVideoSettingsOption;", "update", "option", "domain_release"}, k = 1, mv = {1, 1, 10})
public interface AutoPlayVideoSettingsRepository {
    @NotNull
    C3956a clear();

    @NotNull
    C3959e<AutoPlayVideoSettingsOption> observe();

    @NotNull
    C3956a update(@NotNull AutoPlayVideoSettingsOption autoPlayVideoSettingsOption);
}
