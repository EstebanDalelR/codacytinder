package io.reactivex.rxkotlin;

import kotlin.Metadata;
import kotlin.Triple;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.C15825i;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.FunctionReference;
import kotlin.reflect.KDeclarationContainer;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 1}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0010\u0000\u001a\u0014\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u0003\u0012\u0004\u0012\u0002H\u00040\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0005\"\b\b\u0001\u0010\u0003*\u00020\u0005\"\b\b\u0002\u0010\u0004*\u00020\u00052\u0015\u0010\u0006\u001a\u0011H\u0002¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t2\u0015\u0010\n\u001a\u0011H\u0003¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u000b2\u0015\u0010\f\u001a\u0011H\u0004¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\r¢\u0006\u0004\b\u000e\u0010\u000f"}, d2 = {"<anonymous>", "Lkotlin/Triple;", "T", "R", "U", "", "p1", "Lkotlin/ParameterName;", "name", "first", "p2", "second", "p3", "third", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Triple;"}, k = 3, mv = {1, 1, 6})
final class FlowableKt$combineLatest$3 extends FunctionReference implements Function3<T, R, U, Triple<? extends T, ? extends R, ? extends U>> {
    /* renamed from: a */
    public static final FlowableKt$combineLatest$3 f59654a = new FlowableKt$combineLatest$3();

    FlowableKt$combineLatest$3() {
        super(3);
    }

    public final String getName() {
        return "<init>";
    }

    public final KDeclarationContainer getOwner() {
        return C15825i.m59860a(Triple.class);
    }

    public final String getSignature() {
        return "<init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V";
    }

    public /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return m68250a(obj, obj2, obj3);
    }

    @NotNull
    /* renamed from: a */
    public final Triple<T, R, U> m68250a(@NotNull T t, @NotNull R r, @NotNull U u) {
        C2668g.b(t, "p1");
        C2668g.b(r, "p2");
        C2668g.b(u, "p3");
        return new Triple(t, r, u);
    }
}
