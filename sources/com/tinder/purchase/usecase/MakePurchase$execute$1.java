package com.tinder.purchase.usecase;

import com.tinder.purchase.domain.model.C14517l;
import com.tinder.purchase.domain.model.Transaction;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C15825i;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.FunctionReference;
import kotlin.reflect.KDeclarationContainer;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0015\u0010\u0002\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "Lcom/tinder/purchase/domain/model/Transaction;", "p1", "", "Lkotlin/ParameterName;", "name", "productId", "invoke"}, k = 3, mv = {1, 1, 10})
final class MakePurchase$execute$1 extends FunctionReference implements Function1<String, Transaction> {
    MakePurchase$execute$1(C14517l c14517l) {
        super(1, c14517l);
    }

    public final String getName() {
        return "createSuccessfulPurchaseTransaction";
    }

    public final KDeclarationContainer getOwner() {
        return C15825i.m59860a(C14517l.class);
    }

    public final String getSignature() {
        return "createSuccessfulPurchaseTransaction(Ljava/lang/String;)Lcom/tinder/purchase/domain/model/Transaction;";
    }

    public /* synthetic */ Object invoke(Object obj) {
        return m68064a((String) obj);
    }

    @NotNull
    /* renamed from: a */
    public final Transaction m68064a(@NotNull String str) {
        C2668g.b(str, "p1");
        return ((C14517l) this.receiver).m55441a(str);
    }
}
