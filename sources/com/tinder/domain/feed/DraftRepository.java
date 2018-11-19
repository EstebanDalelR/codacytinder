package com.tinder.domain.feed;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import rx.Completable;
import rx.Single;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u0006H&J\"\u0010\t\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u00062\u0006\u0010\n\u001a\u00020\u0006H&¨\u0006\u000b"}, d2 = {"Lcom/tinder/domain/feed/DraftRepository;", "", "clear", "Lrx/Completable;", "loadDraft", "Lrx/Single;", "", "feedItemId", "carouselItemId", "saveDraft", "message", "domain_release"}, k = 1, mv = {1, 1, 10})
public interface DraftRepository {
    @NotNull
    Completable clear();

    @NotNull
    Single<String> loadDraft(@NotNull String str, @Nullable String str2);

    @NotNull
    Completable saveDraft(@NotNull String str, @Nullable String str2, @NotNull String str3);
}
