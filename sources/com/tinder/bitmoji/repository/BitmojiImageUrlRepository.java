package com.tinder.bitmoji.repository;

import io.reactivex.C3956a;
import io.reactivex.C3959e;
import java8.util.Optional;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0005H&J\u0014\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0007H&J\b\u0010\n\u001a\u00020\u000bH&¨\u0006\f"}, d2 = {"Lcom/tinder/bitmoji/repository/BitmojiImageUrlRepository;", "", "clearImageUrl", "", "isUserBitmojiAvatarAvailable", "", "observeImageUrl", "Lio/reactivex/Observable;", "Ljava8/util/Optional;", "", "syncImageUrl", "Lio/reactivex/Completable;", "bitmoji_release"}, k = 1, mv = {1, 1, 10})
public interface BitmojiImageUrlRepository {
    void clearImageUrl();

    boolean isUserBitmojiAvatarAvailable();

    @NotNull
    C3959e<Optional<String>> observeImageUrl();

    @NotNull
    C3956a syncImageUrl();
}
