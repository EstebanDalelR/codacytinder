package com.tinder.domain.reactions.provider;

import com.tinder.domain.reactions.model.GrandGestureType;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/tinder/domain/reactions/model/GrandGestureType;", "it", "", "invoke"}, k = 3, mv = {1, 1, 10})
final class StrikeReactionTypesProvider$getNext$1 extends Lambda implements Function1<Integer, GrandGestureType> {
    final /* synthetic */ StrikeReactionTypesProvider this$0;

    StrikeReactionTypesProvider$getNext$1(StrikeReactionTypesProvider strikeReactionTypesProvider) {
        this.this$0 = strikeReactionTypesProvider;
        super(1);
    }

    public /* synthetic */ Object invoke(Object obj) {
        return invoke(((Number) obj).intValue());
    }

    @NotNull
    public final GrandGestureType invoke(int i) {
        return this.this$0.getDEFAULT_STRIKE_TYPE();
    }
}
