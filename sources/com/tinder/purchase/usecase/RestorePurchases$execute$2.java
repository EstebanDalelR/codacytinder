package com.tinder.purchase.usecase;

import com.tinder.purchase.domain.model.Transaction;
import com.tinder.purchase.p372b.C14483c;
import kotlin.C15813i;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C15825i;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.FunctionReference;
import kotlin.reflect.KDeclarationContainer;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0015\u0010\u0002\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "p1", "Lcom/tinder/purchase/domain/model/Transaction;", "Lkotlin/ParameterName;", "name", "transaction", "invoke"}, k = 3, mv = {1, 1, 10})
final class RestorePurchases$execute$2 extends FunctionReference implements Function1<Transaction, C15813i> {
    RestorePurchases$execute$2(C14483c c14483c) {
        super(1, c14483c);
    }

    public final String getName() {
        return "push";
    }

    public final KDeclarationContainer getOwner() {
        return C15825i.m59860a(C14483c.class);
    }

    public final String getSignature() {
        return "push(Lcom/tinder/purchase/domain/model/Transaction;)V";
    }

    public /* synthetic */ Object invoke(Object obj) {
        m68066a((Transaction) obj);
        return C15813i.f49016a;
    }

    /* renamed from: a */
    public final void m68066a(@NotNull Transaction transaction) {
        C2668g.b(transaction, "p1");
        ((C14483c) this.receiver).m55329a(transaction);
    }
}
