package com.tinder.fastmatch.preview;

import com.tinder.domain.fastmatch.model.FastMatchConfig;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C15825i;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.FunctionReference;
import kotlin.reflect.KDeclarationContainer;
import org.jetbrains.annotations.NotNull;
import rx.Observable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0015\u0010\u0003\u001a\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007¢\u0006\u0002\b\b"}, d2 = {"<anonymous>", "Lrx/Observable;", "", "p1", "Lcom/tinder/domain/fastmatch/model/FastMatchConfig;", "Lkotlin/ParameterName;", "name", "fastMatchConfig", "invoke"}, k = 3, mv = {1, 1, 10})
final class FastMatchPreviewFetcher$start$2 extends FunctionReference implements Function1<FastMatchConfig, Observable<Long>> {
    FastMatchPreviewFetcher$start$2(C9402a c9402a) {
        super(1, c9402a);
    }

    public final String getName() {
        return "startFetchingFastMatchPreview";
    }

    public final KDeclarationContainer getOwner() {
        return C15825i.a(C9402a.class);
    }

    public final String getSignature() {
        return "startFetchingFastMatchPreview(Lcom/tinder/domain/fastmatch/model/FastMatchConfig;)Lrx/Observable;";
    }

    public /* synthetic */ Object invoke(Object obj) {
        return m54409a((FastMatchConfig) obj);
    }

    @NotNull
    /* renamed from: a */
    public final Observable<Long> m54409a(@NotNull FastMatchConfig fastMatchConfig) {
        C2668g.b(fastMatchConfig, "p1");
        return ((C9402a) this.receiver).m39348a(fastMatchConfig);
    }
}
