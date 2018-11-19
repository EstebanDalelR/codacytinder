package com.tinder.purchase.usecase;

import com.tinder.api.ManagerWebServices;
import com.tinder.domain.profile.model.PurchaseType;
import com.tinder.purchase.domain.exception.PurchaseLoggableException;
import com.tinder.purchase.domain.model.C14517l;
import com.tinder.purchase.domain.model.Transaction;
import com.tinder.purchase.domain.model.TransactionFlowError.Adapter;
import com.tinder.purchase.p372b.C14483c;
import com.tinder.purchase.register.Register;
import com.tinder.purchase.register.Register.RestoreType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C18457p;
import kotlin.collections.C19299w;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import rx.Single;
import rx.exceptions.CompositeException;
import rx.functions.Func1;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\u0014B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u0011\u001a\u00020\u0012J\u0010\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/tinder/purchase/usecase/RestorePurchases;", "", "register", "Lcom/tinder/purchase/register/Register;", "transactionFactory", "Lcom/tinder/purchase/domain/model/TransactionFactory;", "restoreFlowErrorFactory", "Lcom/tinder/purchase/domain/model/TransactionFlowError$Adapter;", "purchaseRestoreRelay", "Lcom/tinder/purchase/relay/PurchaseRestoreRelay;", "(Lcom/tinder/purchase/register/Register;Lcom/tinder/purchase/domain/model/TransactionFactory;Lcom/tinder/purchase/domain/model/TransactionFlowError$Adapter;Lcom/tinder/purchase/relay/PurchaseRestoreRelay;)V", "determineError", "Lrx/Single;", "Lcom/tinder/purchase/domain/model/Transaction;", "throwable", "", "execute", "restoreType", "Lcom/tinder/purchase/register/Register$RestoreType;", "getValidError", "DetermineTransactionPriority", "purchase_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.purchase.usecase.j */
public final class C14541j {
    /* renamed from: a */
    private final Register f45950a;
    /* renamed from: b */
    private final C14517l f45951b;
    /* renamed from: c */
    private final Adapter f45952c;
    /* renamed from: d */
    private final C14483c f45953d;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003B\u0007\b\u0002¢\u0006\u0002\u0010\u0004J\u001c\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00022\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\t"}, d2 = {"Lcom/tinder/purchase/usecase/RestorePurchases$DetermineTransactionPriority;", "Ljava/util/Comparator;", "Lcom/tinder/purchase/domain/model/Transaction;", "Lkotlin/Comparator;", "()V", "compare", "", "p0", "p1", "purchase_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.purchase.usecase.j$a */
    public static final class C14540a implements Comparator<Transaction> {
        /* renamed from: a */
        public static final C14540a f45949a = new C14540a();

        private C14540a() {
        }

        public /* synthetic */ int compare(Object obj, Object obj2) {
            return m55539a((Transaction) obj, (Transaction) obj2);
        }

        /* renamed from: a */
        public int m55539a(@Nullable Transaction transaction, @Nullable Transaction transaction2) {
            PurchaseType purchaseType = null;
            if (transaction != null) {
                transaction = transaction.mo11883f();
                if (transaction != null) {
                    transaction = transaction.mo11840b();
                    if (transaction == null) {
                        return -1;
                    }
                    switch (C14542k.f45954a[transaction.ordinal()]) {
                        case 1:
                            break;
                        case 2:
                            if (transaction2 != null) {
                                transaction = transaction2.mo11883f();
                                if (transaction != null) {
                                    purchaseType = transaction.mo11841c();
                                }
                            }
                            if (purchaseType != PurchaseType.CONSUMABLE) {
                                return -1;
                            }
                            break;
                        case 3:
                        case 4:
                            return -1;
                        default:
                            return -1;
                    }
                    return 1;
                }
            }
            transaction = null;
            if (transaction == null) {
                return -1;
            }
            switch (C14542k.f45954a[transaction.ordinal()]) {
                case 1:
                    break;
                case 2:
                    if (transaction2 != null) {
                        transaction = transaction2.mo11883f();
                        if (transaction != null) {
                            purchaseType = transaction.mo11841c();
                        }
                    }
                    if (purchaseType != PurchaseType.CONSUMABLE) {
                        return -1;
                    }
                    break;
                case 3:
                case 4:
                    return -1;
                default:
                    return -1;
            }
            return 1;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lcom/tinder/purchase/domain/model/Transaction;", "products", "", "", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.purchase.usecase.j$b */
    static final class C17872b<T, R> implements Func1<T, R> {
        /* renamed from: a */
        final /* synthetic */ C14541j f55751a;

        C17872b(C14541j c14541j) {
            this.f55751a = c14541j;
        }

        public /* synthetic */ Object call(Object obj) {
            return m65149a((List) obj);
        }

        @Nullable
        /* renamed from: a */
        public final Transaction m65149a(List<String> list) {
            C2668g.a(list, ManagerWebServices.PARAM_PRODUCTS);
            Iterable<String> iterable = list;
            Collection arrayList = new ArrayList(C18457p.m66906a((Iterable) iterable, 10));
            for (String b : iterable) {
                arrayList.add(this.f55751a.f45951b.m55443b(b));
            }
            return (Transaction) C19299w.m68806b((Iterable) (List) arrayList, (Comparator) C14540a.f45949a);
        }
    }

    public C14541j(@NotNull Register register, @NotNull C14517l c14517l, @NotNull Adapter adapter, @NotNull C14483c c14483c) {
        C2668g.b(register, "register");
        C2668g.b(c14517l, "transactionFactory");
        C2668g.b(adapter, "restoreFlowErrorFactory");
        C2668g.b(c14483c, "purchaseRestoreRelay");
        this.f45950a = register;
        this.f45951b = c14517l;
        this.f45952c = adapter;
        this.f45953d = c14483c;
    }

    @NotNull
    /* renamed from: a */
    public final Single<Transaction> m55544a(@NotNull RestoreType restoreType) {
        C2668g.b(restoreType, "restoreType");
        restoreType = this.f45950a.restorePurchase(restoreType).d(new C17872b(this)).d(new C18647l(new RestorePurchases$execute$2(this.f45953d))).f(new C17873m(new RestorePurchases$execute$3(this)));
        C2668g.a(restoreType, "register\n               …ext(this::determineError)");
        return restoreType;
    }

    /* renamed from: a */
    private final Single<Transaction> m55542a(Throwable th) {
        th = m55543b(th);
        th = Single.a(this.f45951b.m55444b(th instanceof PurchaseLoggableException ? ((PurchaseLoggableException) th).mo11825f() : "", this.f45952c.create(th)));
        C2668g.a(th, "Single.just(transactionF…ductId, reportableError))");
        return th;
    }

    /* renamed from: b */
    private final Throwable m55543b(Throwable th) {
        if (!(th instanceof CompositeException)) {
            return th;
        }
        th = ((CompositeException) th).a();
        C2668g.a(th, "throwable.exceptions");
        th = C19299w.m68829f((List) th);
        C2668g.a(th, "throwable.exceptions.first()");
        return th;
    }
}
