package com.tinder.data.message;

import com.tinder.common.function.Mapper;
import com.tinder.domain.message.Reaction;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007\b\u0007¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¨\u0006\u0007"}, d2 = {"Lcom/tinder/data/message/ReactionTypeToReactionMapper;", "Lcom/tinder/common/function/Mapper;", "", "Lcom/tinder/domain/message/Reaction;", "()V", "map", "reactionId", "data_release"}, k = 1, mv = {1, 1, 10})
public final class bc implements Mapper<String, Reaction> {
    public /* synthetic */ Object map(Object obj) {
        return m43286a((String) obj);
    }

    @NotNull
    /* renamed from: a */
    public Reaction m43286a(@NotNull String str) {
        C2668g.b(str, "reactionId");
        return new Reaction(str);
    }
}
