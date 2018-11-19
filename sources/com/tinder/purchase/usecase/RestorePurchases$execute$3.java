package com.tinder.purchase.usecase;

import com.tinder.purchase.domain.model.Transaction;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C15825i;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.FunctionReference;
import kotlin.reflect.KDeclarationContainer;
import org.jetbrains.annotations.NotNull;
import rx.Single;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0015\u0010\u0003\u001a\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007¢\u0006\u0002\b\b"}, d2 = {"<anonymous>", "Lrx/Single;", "Lcom/tinder/purchase/domain/model/Transaction;", "p1", "", "Lkotlin/ParameterName;", "name", "throwable", "invoke"}, k = 3, mv = {1, 1, 10})
final class RestorePurchases$execute$3 extends FunctionReference implements Function1<Throwable, Single<Transaction>> {
    RestorePurchases$execute$3(C14541j c14541j) {
        super(1, c14541j);
    }

    public final String getName() {
        return "determineError";
    }

    public final KDeclarationContainer getOwner() {
        return C15825i.m59860a(C14541j.class);
    }

    public final String getSignature() {
        return "determineError(Ljava/lang/Throwable;)Lrx/Single;";
    }

    public /* synthetic */ Object invoke(Object obj) {
        return m68067a((Throwable) obj);
    }

    @NotNull
    /* renamed from: a */
    public final Single<Transaction> m68067a(@NotNull Throwable th) {
        C2668g.b(th, "p1");
        return ((C14541j) this.receiver).m55542a(th);
    }
}
