package com.tinder.bitmoji.repository;

import io.reactivex.C3956a;
import io.reactivex.C3959e;
import java8.util.Optional;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\u0014\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\bH\u0016J\b\u0010\u000b\u001a\u00020\fH\u0016¨\u0006\r"}, d2 = {"Lcom/tinder/bitmoji/repository/BitmojiImageUrlDisabledRepository;", "Lcom/tinder/bitmoji/repository/BitmojiImageUrlRepository;", "()V", "clearImageUrl", "", "isUserBitmojiAvatarAvailable", "", "observeImageUrl", "Lio/reactivex/Observable;", "Ljava8/util/Optional;", "", "syncImageUrl", "Lio/reactivex/Completable;", "bitmoji_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.bitmoji.repository.d */
public final class C10396d implements BitmojiImageUrlRepository {
    public void clearImageUrl() {
    }

    public boolean isUserBitmojiAvatarAvailable() {
        return false;
    }

    @NotNull
    public C3956a syncImageUrl() {
        C3956a a = C3956a.a();
        C2668g.a(a, "Completable.complete()");
        return a;
    }

    @NotNull
    public C3959e<Optional<String>> observeImageUrl() {
        C3959e<Optional<String>> empty = C3959e.empty();
        C2668g.a(empty, "Observable.empty()");
        return empty;
    }
}
