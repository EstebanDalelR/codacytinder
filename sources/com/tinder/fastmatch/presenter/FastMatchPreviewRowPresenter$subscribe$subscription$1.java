package com.tinder.fastmatch.presenter;

import com.tinder.domain.fastmatch.model.FastMatchStatus;
import kotlin.C15813i;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C15825i;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.FunctionReference;
import kotlin.reflect.KDeclarationContainer;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0015\u0010\u0002\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "p1", "Lcom/tinder/domain/fastmatch/model/FastMatchStatus;", "Lkotlin/ParameterName;", "name", "fastMatchStatus", "invoke"}, k = 3, mv = {1, 1, 10})
final class FastMatchPreviewRowPresenter$subscribe$subscription$1 extends FunctionReference implements Function1<FastMatchStatus, C15813i> {
    FastMatchPreviewRowPresenter$subscribe$subscription$1(C9387c c9387c) {
        super(1, c9387c);
    }

    public final String getName() {
        return "handleFastMatchStatus";
    }

    public final KDeclarationContainer getOwner() {
        return C15825i.a(C9387c.class);
    }

    public final String getSignature() {
        return "handleFastMatchStatus(Lcom/tinder/domain/fastmatch/model/FastMatchStatus;)V";
    }

    public /* synthetic */ Object invoke(Object obj) {
        m54405a((FastMatchStatus) obj);
        return C15813i.f49016a;
    }

    /* renamed from: a */
    public final void m54405a(@NotNull FastMatchStatus fastMatchStatus) {
        C2668g.b(fastMatchStatus, "p1");
        ((C9387c) this.receiver).m39299a(fastMatchStatus);
    }
}
