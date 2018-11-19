package com.tinder.data.updates;

import io.reactivex.C3956a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C15825i;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.FunctionReference;
import kotlin.reflect.KDeclarationContainer;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0015\u0010\u0002\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "Lio/reactivex/Completable;", "p1", "Lcom/tinder/data/updates/UpdatesRequestContext;", "Lkotlin/ParameterName;", "name", "updatesRequestContext", "invoke"}, k = 3, mv = {1, 1, 10})
final class SyncUpdates$sync$1 extends FunctionReference implements Function1<C8815y, C3956a> {
    SyncUpdates$sync$1(C8805i c8805i) {
        super(1, c8805i);
    }

    public final String getName() {
        return "handleUpdatesResponse";
    }

    public final KDeclarationContainer getOwner() {
        return C15825i.a(C8805i.class);
    }

    public final String getSignature() {
        return "handleUpdatesResponse(Lcom/tinder/data/updates/UpdatesRequestContext;)Lio/reactivex/Completable;";
    }

    public /* synthetic */ Object invoke(Object obj) {
        return m54396a((C8815y) obj);
    }

    @NotNull
    /* renamed from: a */
    public final C3956a m54396a(@NotNull C8815y c8815y) {
        C2668g.b(c8815y, "p1");
        return ((C8805i) this.receiver).m37489a(c8815y);
    }
}
