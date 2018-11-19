package com.tinder.purchase.usecase;

import com.tinder.domain.common.reactivex.usecase.SimpleCompletableUseCase;
import com.tinder.purchase.domain.model.Transaction;
import com.tinder.purchase.domain.model.Transaction.Status;
import com.tinder.purchase.p372b.C14482a;
import com.tinder.purchase.p372b.C14483c;
import io.reactivex.C3956a;
import io.reactivex.C3959e;
import io.reactivex.functions.Predicate;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u0007\u001a\u00020\bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/tinder/purchase/usecase/PurchaseMade;", "Lcom/tinder/domain/common/reactivex/usecase/SimpleCompletableUseCase;", "purchaesMadeRelay", "Lcom/tinder/purchase/relay/PurchaseMadeRelay;", "purchaseRestoreRelay", "Lcom/tinder/purchase/relay/PurchaseRestoreRelay;", "(Lcom/tinder/purchase/relay/PurchaseMadeRelay;Lcom/tinder/purchase/relay/PurchaseRestoreRelay;)V", "execute", "Lio/reactivex/Completable;", "purchase_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.purchase.usecase.i */
public final class C16248i implements SimpleCompletableUseCase {
    /* renamed from: a */
    private final C14482a f50618a;
    /* renamed from: b */
    private final C14483c f50619b;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/tinder/purchase/domain/model/Transaction;", "test"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.purchase.usecase.i$a */
    static final class C16247a<T> implements Predicate<Transaction> {
        /* renamed from: a */
        public static final C16247a f50617a = new C16247a();

        C16247a() {
        }

        public /* synthetic */ boolean test(Object obj) {
            return m61400a((Transaction) obj);
        }

        /* renamed from: a */
        public final boolean m61400a(@NotNull Transaction transaction) {
            C2668g.b(transaction, "it");
            return transaction.mo11878a() != Status.FAILURE ? true : null;
        }
    }

    public C16248i(@NotNull C14482a c14482a, @NotNull C14483c c14483c) {
        C2668g.b(c14482a, "purchaesMadeRelay");
        C2668g.b(c14483c, "purchaseRestoreRelay");
        this.f50618a = c14482a;
        this.f50619b = c14483c;
    }

    @NotNull
    public C3956a execute() {
        C3956a c = C3959e.merge(this.f50618a.m55326a(), this.f50619b.m55328a()).filter(C16247a.f50617a).firstOrError().c();
        C2668g.a(c, "Observable.merge(purchae…         .toCompletable()");
        return c;
    }
}
