package com.tinder.domain.tracker;

import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import rx.Completable;
import rx.Observable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u001a\u0010\b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00050\n0\tH&J\u000e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\tH&J\u0018\u0010\f\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0005H&¨\u0006\u000e"}, d2 = {"Lcom/tinder/domain/tracker/ListItemViewDurationRepository;", "", "clear", "Lrx/Completable;", "get", "Lcom/tinder/domain/tracker/ListItemViewDurationData;", "itemId", "", "observe", "Lrx/Observable;", "", "observeItemVisible", "put", "data", "domain_release"}, k = 1, mv = {1, 1, 10})
public interface ListItemViewDurationRepository {
    @NotNull
    Completable clear();

    @Nullable
    ListItemViewDurationData get(@NotNull String str);

    @NotNull
    Observable<Map<String, ListItemViewDurationData>> observe();

    @NotNull
    Observable<ListItemViewDurationData> observeItemVisible();

    @NotNull
    Completable put(@NotNull String str, @NotNull ListItemViewDurationData listItemViewDurationData);
}
