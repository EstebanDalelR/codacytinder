package com.tinder.bitmoji.repository;

import com.tinder.bitmoji.BitmojiAuthStatus;
import io.reactivex.C3959e;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\u0006\u001a\u00020\u0007H\u0016J\u000e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0016¨\u0006\u000b"}, d2 = {"Lcom/tinder/bitmoji/repository/BitmojiAuthDisabledRepository;", "Lcom/tinder/bitmoji/repository/BitmojiAuthRepository;", "()V", "connect", "", "disconnect", "isConnected", "", "observeBitmojiAuthStatus", "Lio/reactivex/Observable;", "Lcom/tinder/bitmoji/BitmojiAuthStatus;", "bitmoji_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.bitmoji.repository.b */
public final class C10391b implements BitmojiAuthRepository {
    public void connect() {
    }

    public void disconnect() {
    }

    public boolean isConnected() {
        return false;
    }

    @NotNull
    public C3959e<BitmojiAuthStatus> observeBitmojiAuthStatus() {
        C3959e<BitmojiAuthStatus> empty = C3959e.empty();
        C2668g.a(empty, "Observable.empty()");
        return empty;
    }
}
