package com.tinder.scarlet.lifecycle;

import com.tinder.scarlet.Lifecycle.C14785a;
import io.reactivex.schedulers.C15757b;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C15825i;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.FunctionReference;
import kotlin.reflect.KDeclarationContainer;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u00040\u0003¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lcom/tinder/scarlet/Lifecycle$State;", "p1", "", "Lio/reactivex/schedulers/Timed;", "invoke"}, k = 3, mv = {1, 1, 9})
final class FlowableLifecycle$combineWith$flowable$2 extends FunctionReference implements Function1<List<? extends C15757b<C14785a>>, C14785a> {
    /* renamed from: a */
    public static final FlowableLifecycle$combineWith$flowable$2 f59392a = new FlowableLifecycle$combineWith$flowable$2();

    FlowableLifecycle$combineWith$flowable$2() {
        super(1);
    }

    public final String getName() {
        return "combine";
    }

    public final KDeclarationContainer getOwner() {
        return C15825i.m59861a(C14819f.class, "scarlet");
    }

    public final String getSignature() {
        return "combine(Ljava/util/List;)Lcom/tinder/scarlet/Lifecycle$State;";
    }

    public /* synthetic */ Object invoke(Object obj) {
        return m68107a((List) obj);
    }

    @NotNull
    /* renamed from: a */
    public final C14785a m68107a(@NotNull List<C15757b<C14785a>> list) {
        C2668g.b(list, "p1");
        return C14819f.m56162a((List) list);
    }
}
