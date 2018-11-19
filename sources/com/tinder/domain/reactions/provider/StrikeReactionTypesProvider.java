package com.tinder.domain.reactions.provider;

import com.tinder.domain.reactions.model.GrandGestureType;
import java.util.Set;
import java8.util.Optional;
import kotlin.Metadata;
import kotlin.collections.C19301m;
import kotlin.collections.ak;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007\b\u0007¢\u0006\u0002\u0010\u0002J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000bH\u0002J\u0010\u0010\f\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000bH\u0002J\u0014\u0010\r\u001a\u00020\u000b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u000eJ\u000e\u0010\r\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u000bR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\bX\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/tinder/domain/reactions/provider/StrikeReactionTypesProvider;", "", "()V", "DEFAULT_STRIKE_TYPE", "Lcom/tinder/domain/reactions/model/GrandGestureType;", "getDEFAULT_STRIKE_TYPE", "()Lcom/tinder/domain/reactions/model/GrandGestureType;", "STRIKE_REACTION_TYPES", "", "getNext", "currentStrikeId", "", "getType", "nextStrikeId", "Ljava8/util/Optional;", "domain_release"}, k = 1, mv = {1, 1, 10})
public final class StrikeReactionTypesProvider {
    @NotNull
    private final GrandGestureType DEFAULT_STRIKE_TYPE = GrandGestureType.STRIKE_1;
    private final Set<GrandGestureType> STRIKE_REACTION_TYPES = ak.a(new GrandGestureType[]{GrandGestureType.STRIKE_1, GrandGestureType.STRIKE_2, GrandGestureType.STRIKE_3});

    @NotNull
    public final GrandGestureType getDEFAULT_STRIKE_TYPE() {
        return this.DEFAULT_STRIKE_TYPE;
    }

    @NotNull
    public final String nextStrikeId(@NotNull Optional<String> optional) {
        C2668g.b(optional, "currentStrikeId");
        if (!optional.c()) {
            return this.DEFAULT_STRIKE_TYPE.getGestureId();
        }
        optional = optional.b();
        C2668g.a(optional, "currentStrikeId.get()");
        return getNext((String) optional).getGestureId();
    }

    @NotNull
    public final String nextStrikeId(@NotNull String str) {
        C2668g.b(str, "currentStrikeId");
        return getNext(str).getGestureId();
    }

    private final GrandGestureType getNext(String str) {
        return (GrandGestureType) C19301m.a(this.STRIKE_REACTION_TYPES, (C19301m.b(this.STRIKE_REACTION_TYPES, getType(str)) + 1) % this.STRIKE_REACTION_TYPES.size(), new StrikeReactionTypesProvider$getNext$1(this));
    }

    private final GrandGestureType getType(String str) {
        return GrandGestureType.Companion.fromValue(str);
    }
}
