package com.tinder.data.feed;

import com.tinder.data.feed.FeedApiClient.C8652a;
import com.tinder.domain.feed.FeedRequestResult;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C15825i;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.FunctionReference;
import kotlin.reflect.KDeclarationContainer;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0015\u0010\u0002\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "Lcom/tinder/domain/feed/FeedRequestResult;", "p1", "Lcom/tinder/data/feed/FeedApiClient$Result;", "Lkotlin/ParameterName;", "name", "result", "invoke"}, k = 3, mv = {1, 1, 10})
final class FeedDataRepository$checkNewItems$1$2 extends FunctionReference implements Function1<C8652a, FeedRequestResult> {
    FeedDataRepository$checkNewItems$1$2(C10778h c10778h) {
        super(1, c10778h);
    }

    public final String getName() {
        return "mapToResult";
    }

    public final KDeclarationContainer getOwner() {
        return C15825i.a(C10778h.class);
    }

    public final String getSignature() {
        return "mapToResult(Lcom/tinder/data/feed/FeedApiClient$Result;)Lcom/tinder/domain/feed/FeedRequestResult;";
    }

    public /* synthetic */ Object invoke(Object obj) {
        return m54064a((C8652a) obj);
    }

    @NotNull
    /* renamed from: a */
    public final FeedRequestResult m54064a(@NotNull C8652a c8652a) {
        C2668g.b(c8652a, "p1");
        return ((C10778h) this.receiver).m43192a(c8652a);
    }
}
