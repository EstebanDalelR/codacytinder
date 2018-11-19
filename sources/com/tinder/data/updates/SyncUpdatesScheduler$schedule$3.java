package com.tinder.data.updates;

import com.tinder.domain.updates.model.UpdateSignal;
import io.reactivex.C3960g;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C15825i;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.FunctionReference;
import kotlin.reflect.KDeclarationContainer;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0015\u0010\u0003\u001a\u00110\u0002¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "Lio/reactivex/Single;", "Lcom/tinder/domain/updates/model/UpdateSignal;", "p1", "Lkotlin/ParameterName;", "name", "updateSignal", "invoke"}, k = 3, mv = {1, 1, 10})
final class SyncUpdatesScheduler$schedule$3 extends FunctionReference implements Function1<UpdateSignal, C3960g<UpdateSignal>> {
    SyncUpdatesScheduler$schedule$3(C8809l c8809l) {
        super(1, c8809l);
    }

    public final String getName() {
        return "syncUpdates";
    }

    public final KDeclarationContainer getOwner() {
        return C15825i.a(C8809l.class);
    }

    public final String getSignature() {
        return "syncUpdates(Lcom/tinder/domain/updates/model/UpdateSignal;)Lio/reactivex/Single;";
    }

    public /* synthetic */ Object invoke(Object obj) {
        return m54398a((UpdateSignal) obj);
    }

    @NotNull
    /* renamed from: a */
    public final C3960g<UpdateSignal> m54398a(@NotNull UpdateSignal updateSignal) {
        C2668g.b(updateSignal, "p1");
        return ((C8809l) this.receiver).m37495a(updateSignal);
    }
}
