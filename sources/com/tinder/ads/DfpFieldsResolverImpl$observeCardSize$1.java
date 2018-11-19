package com.tinder.ads;

import com.tinder.recs.card.CardSize;
import kotlin.Metadata;
import rx.functions.Func1;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "cardSize", "Lcom/tinder/recs/card/CardSize;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
final class DfpFieldsResolverImpl$observeCardSize$1<T, R> implements Func1<CardSize, Boolean> {
    public static final DfpFieldsResolverImpl$observeCardSize$1 INSTANCE = new DfpFieldsResolverImpl$observeCardSize$1();

    DfpFieldsResolverImpl$observeCardSize$1() {
    }

    public final boolean call(CardSize cardSize) {
        return cardSize != null;
    }

    public /* synthetic */ Object call(Object obj) {
        return Boolean.valueOf(call((CardSize) obj));
    }
}
