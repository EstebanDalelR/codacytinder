package com.tinder.domain.toppicks.repo;

import com.tinder.domain.meta.model.TopPicksSettings;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\n\u0010\u0002\u001a\u0004\u0018\u00010\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0003H&¨\u0006\u0007"}, d2 = {"Lcom/tinder/domain/toppicks/repo/TopPicksSettingRepository;", "", "get", "Lcom/tinder/domain/meta/model/TopPicksSettings;", "set", "", "topPicksSettings", "domain_release"}, k = 1, mv = {1, 1, 10})
public interface TopPicksSettingRepository {
    @Nullable
    TopPicksSettings get();

    void set(@NotNull TopPicksSettings topPicksSettings);
}
