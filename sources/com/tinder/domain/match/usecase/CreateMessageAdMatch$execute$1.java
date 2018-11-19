package com.tinder.domain.match.usecase;

import com.tinder.domain.match.model.MessageAdMatch;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/tinder/domain/match/model/MessageAdMatch;", "call"}, k = 3, mv = {1, 1, 10})
final class CreateMessageAdMatch$execute$1<V> implements Callable<T> {
    final /* synthetic */ MessageAdMatch $request;

    CreateMessageAdMatch$execute$1(MessageAdMatch messageAdMatch) {
        this.$request = messageAdMatch;
    }

    @NotNull
    public final MessageAdMatch call() {
        return this.$request;
    }
}
