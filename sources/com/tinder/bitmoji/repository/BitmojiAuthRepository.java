package com.tinder.bitmoji.repository;

import com.tinder.bitmoji.BitmojiAuthStatus;
import io.reactivex.C3959e;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\b\u0010\u0005\u001a\u00020\u0006H&J\u000e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH&¨\u0006\n"}, d2 = {"Lcom/tinder/bitmoji/repository/BitmojiAuthRepository;", "", "connect", "", "disconnect", "isConnected", "", "observeBitmojiAuthStatus", "Lio/reactivex/Observable;", "Lcom/tinder/bitmoji/BitmojiAuthStatus;", "bitmoji_release"}, k = 1, mv = {1, 1, 10})
public interface BitmojiAuthRepository {
    void connect();

    void disconnect();

    boolean isConnected();

    @NotNull
    C3959e<BitmojiAuthStatus> observeBitmojiAuthStatus();
}
