package com.tinder.purchase.usecase;

import android.app.Activity;
import com.tinder.purchase.domain.model.C14517l;
import com.tinder.purchase.domain.model.Transaction;
import com.tinder.purchase.domain.model.TransactionFlowError.Adapter;
import com.tinder.purchase.p372b.C14482a;
import com.tinder.purchase.register.Register;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import p000a.p001a.C0001a;
import rx.Single;
import rx.functions.Func1;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u001e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\u001c\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0010\u001a\u00020\u0011R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/tinder/purchase/usecase/MakePurchase;", "", "register", "Lcom/tinder/purchase/register/Register;", "transactionFactory", "Lcom/tinder/purchase/domain/model/TransactionFactory;", "purchaseFlowErrorFactory", "Lcom/tinder/purchase/domain/model/TransactionFlowError$Adapter;", "purchaseMadeRelay", "Lcom/tinder/purchase/relay/PurchaseMadeRelay;", "(Lcom/tinder/purchase/register/Register;Lcom/tinder/purchase/domain/model/TransactionFactory;Lcom/tinder/purchase/domain/model/TransactionFlowError$Adapter;Lcom/tinder/purchase/relay/PurchaseMadeRelay;)V", "determineError", "Lrx/Single;", "Lcom/tinder/purchase/domain/model/Transaction;", "throwable", "", "productId", "", "execute", "activity", "Landroid/app/Activity;", "purchase_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.purchase.usecase.e */
public final class C14539e {
    /* renamed from: a */
    private final Register f45945a;
    /* renamed from: b */
    private final C14517l f45946b;
    /* renamed from: c */
    private final Adapter f45947c;
    /* renamed from: d */
    private final C14482a f45948d;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u000e\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lrx/Single;", "Lcom/tinder/purchase/domain/model/Transaction;", "throwable", "", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.purchase.usecase.e$a */
    static final class C17870a<T, R> implements Func1<Throwable, Single<? extends Transaction>> {
        /* renamed from: a */
        final /* synthetic */ C14539e f55748a;
        /* renamed from: b */
        final /* synthetic */ String f55749b;

        C17870a(C14539e c14539e, String str) {
            this.f55748a = c14539e;
            this.f55749b = str;
        }

        public /* synthetic */ Object call(Object obj) {
            return m65148a((Throwable) obj);
        }

        @NotNull
        /* renamed from: a */
        public final Single<Transaction> m65148a(Throwable th) {
            C14539e c14539e = this.f55748a;
            C2668g.a(th, "throwable");
            return c14539e.m55537a(th, this.f55749b);
        }
    }

    public C14539e(@NotNull Register register, @NotNull C14517l c14517l, @NotNull Adapter adapter, @NotNull C14482a c14482a) {
        C2668g.b(register, "register");
        C2668g.b(c14517l, "transactionFactory");
        C2668g.b(adapter, "purchaseFlowErrorFactory");
        C2668g.b(c14482a, "purchaseMadeRelay");
        this.f45945a = register;
        this.f45946b = c14517l;
        this.f45947c = adapter;
        this.f45948d = c14482a;
    }

    @NotNull
    /* renamed from: a */
    public final Single<Transaction> m55538a(@NotNull Activity activity, @NotNull String str) {
        C2668g.b(activity, "activity");
        C2668g.b(str, "productId");
        activity = this.f45945a.purchase(activity, str).d(new C17871g(new MakePurchase$execute$1(this.f45946b))).d(new C18646f(new MakePurchase$execute$2(this.f45948d))).f(new C17870a(this, str));
        C2668g.a(activity, "register\n               …r(throwable, productId) }");
        return activity;
    }

    /* renamed from: a */
    private final Single<Transaction> m55537a(Throwable th, String str) {
        C0001a.c(th);
        th = Single.a(this.f45946b.m55442a(str, this.f45947c.create(th)));
        C2668g.a(th, "Single.just(transactionF…action(productId, error))");
        return th;
    }
}
