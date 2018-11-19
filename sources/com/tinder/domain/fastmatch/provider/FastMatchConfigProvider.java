package com.tinder.domain.fastmatch.provider;

import com.tinder.domain.fastmatch.model.FastMatchConfig;
import com.tinder.domain.meta.model.FastMatchSettings;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import rx.Observable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0003H&J\u0010\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u000bH&¨\u0006\f"}, d2 = {"Lcom/tinder/domain/fastmatch/provider/FastMatchConfigProvider;", "", "get", "Lcom/tinder/domain/fastmatch/model/FastMatchConfig;", "observe", "Lrx/Observable;", "update", "", "fastMatchConfig", "updateWithSettings", "fastMatchSettings", "Lcom/tinder/domain/meta/model/FastMatchSettings;", "domain_release"}, k = 1, mv = {1, 1, 10})
public interface FastMatchConfigProvider {
    @NotNull
    FastMatchConfig get();

    @NotNull
    Observable<FastMatchConfig> observe();

    void update(@NotNull FastMatchConfig fastMatchConfig);

    void updateWithSettings(@NotNull FastMatchSettings fastMatchSettings);
}
