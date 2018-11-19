package com.tinder.purchase.p372b;

import com.tinder.purchase.domain.model.Transaction;
import io.reactivex.C3959e;
import io.reactivex.subjects.C18432c;
import io.reactivex.subjects.C19040a;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Singleton
@Metadata(bv = {1, 0, 2}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007\b\u0007¢\u0006\u0002\u0010\u0002J\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\bJ\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0005R\u001c\u0010\u0003\u001a\u0010\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u00050\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/tinder/purchase/relay/PurchaseMadeRelay;", "", "()V", "relaySubject", "Lio/reactivex/subjects/Subject;", "Lcom/tinder/purchase/domain/model/Transaction;", "kotlin.jvm.PlatformType", "observe", "Lio/reactivex/Observable;", "push", "", "transaction", "purchase_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.purchase.b.a */
public final class C14482a {
    /* renamed from: a */
    private final C18432c<Transaction> f45867a = C19040a.m67694a().m66611d();

    /* renamed from: a */
    public final void m55327a(@NotNull Transaction transaction) {
        C2668g.b(transaction, "transaction");
        this.f45867a.onNext(transaction);
    }

    @NotNull
    /* renamed from: a */
    public final C3959e<Transaction> m55326a() {
        C3959e<Transaction> hide = this.f45867a.hide();
        C2668g.a(hide, "relaySubject.hide()");
        return hide;
    }
}
