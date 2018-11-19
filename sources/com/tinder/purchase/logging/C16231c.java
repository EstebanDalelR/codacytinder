package com.tinder.purchase.logging;

import android.support.annotation.WorkerThread;
import com.tinder.api.TinderApi;
import com.tinder.api.model.purchase.PurchaseLog;
import com.tinder.api.model.purchase.PurchaseLog.Source;
import com.tinder.api.model.purchase.PurchaseLogRequest.Factory;
import com.tinder.api.model.purchase.PurchaseLogResponse;
import com.tinder.managers.C2652a;
import com.tinder.purchase.domain.exception.PurchaseGenericException;
import com.tinder.purchase.domain.exception.PurchaseLoggableException;
import com.tinder.purchase.logging.p376a.C14521a;
import com.tinder.purchase.logging.repository.PurchaseLogRepository;
import com.tinder.utils.RxUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java8.util.Objects;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C15807n;
import kotlin.collections.C18457p;
import kotlin.collections.C19299w;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000a.p001a.C0001a;
import rx.Completable;
import rx.Observable;
import rx.Subscription;
import rx.exceptions.CompositeException;
import rx.functions.Action0;
import rx.functions.Action1;
import rx.functions.Func1;
import rx.schedulers.Schedulers;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0018\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J,\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0016J\u001c\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u001c0\u001b2\u0006\u0010\u001d\u001a\u00020\u001eH\u0003J\u0016\u0010\u001f\u001a\u00020\u00102\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00180\u001cH\u0003J\b\u0010!\u001a\u00020\u0010H\u0016R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\""}, d2 = {"Lcom/tinder/purchase/logging/TinderPurchaseLogger;", "Lcom/tinder/purchase/logging/PurchaseLogger;", "tinderApi", "Lcom/tinder/api/TinderApi;", "purchaseLogRepository", "Lcom/tinder/purchase/logging/repository/PurchaseLogRepository;", "purchaseLogFactory", "Lcom/tinder/purchase/logging/model/PurchaseLogFactory;", "authenticationManager", "Lcom/tinder/managers/AuthenticationManager;", "(Lcom/tinder/api/TinderApi;Lcom/tinder/purchase/logging/repository/PurchaseLogRepository;Lcom/tinder/purchase/logging/model/PurchaseLogFactory;Lcom/tinder/managers/AuthenticationManager;)V", "purchaseLogRequestFactory", "Lcom/tinder/api/model/purchase/PurchaseLogRequest$Factory;", "subscription", "Lrx/Subscription;", "logError", "", "source", "Lcom/tinder/api/model/purchase/PurchaseLog$Source;", "error", "Lcom/tinder/purchase/domain/exception/PurchaseLoggableException;", "throwable", "", "productId", "", "receiptId", "processPurchaseLogs", "Lrx/Observable;", "", "maxCount", "", "removePurchaseLogs", "purchaseLogIds", "startLogging", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.purchase.logging.c */
public final class C16231c extends C14522a {
    /* renamed from: a */
    private final Factory f50563a = new Factory();
    /* renamed from: b */
    private Subscription f50564b;
    /* renamed from: c */
    private final TinderApi f50565c;
    /* renamed from: d */
    private final PurchaseLogRepository f50566d;
    /* renamed from: e */
    private final C14521a f50567e;
    /* renamed from: f */
    private final C2652a f50568f;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0010\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u00020\u00012\u000e\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00050\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "", "kotlin.jvm.PlatformType", "<anonymous parameter 0>", "Lcom/tinder/api/model/purchase/PurchaseLogResponse;", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.purchase.logging.c$d */
    static final class C17836d<T, R> implements Func1<T, R> {
        /* renamed from: a */
        final /* synthetic */ List f55663a;

        C17836d(List list) {
            this.f55663a = list;
        }

        public /* synthetic */ Object call(Object obj) {
            return m65127a((PurchaseLogResponse) obj);
        }

        @NotNull
        /* renamed from: a */
        public final List<String> m65127a(PurchaseLogResponse purchaseLogResponse) {
            return this.f55663a;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\u0010\u0000\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u00012\u000e\u0010\u0004\u001a\n \u0006*\u0004\u0018\u00010\u00050\u0005H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"<anonymous>", "Lrx/Observable;", "", "", "<anonymous parameter 0>", "", "kotlin.jvm.PlatformType", "call", "(Ljava/lang/Long;)Lrx/Observable;"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.purchase.logging.c$g */
    static final class C17837g<T, R> implements Func1<T, Observable<? extends R>> {
        /* renamed from: a */
        final /* synthetic */ C16231c f55664a;

        C17837g(C16231c c16231c) {
            this.f55664a = c16231c;
        }

        public /* synthetic */ Object call(Object obj) {
            return m65128a((Long) obj);
        }

        @NotNull
        /* renamed from: a */
        public final Observable<List<String>> m65128a(Long l) {
            return this.f55664a.m61283a(20);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.purchase.logging.c$a */
    static final class C18624a implements Action0 {
        /* renamed from: a */
        final /* synthetic */ C16231c f58060a;
        /* renamed from: b */
        final /* synthetic */ PurchaseLoggableException f58061b;
        /* renamed from: c */
        final /* synthetic */ Source f58062c;

        C18624a(C16231c c16231c, PurchaseLoggableException purchaseLoggableException, Source source) {
            this.f58060a = c16231c;
            this.f58061b = purchaseLoggableException;
            this.f58062c = source;
        }

        public /* synthetic */ void call() {
            m67075a();
        }

        /* renamed from: a */
        public final void m67075a() {
            C0001a.c(this.f58061b);
            if (this.f58061b.v_()) {
                PurchaseLog a = this.f58060a.f50567e.m55474a(this.f58061b, this.f58062c);
                if (a != null) {
                    this.f58060a.f50566d.savePurchaseLog(a);
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("Saved PurchaseLog: ");
                    stringBuilder.append(a);
                    C0001a.b(stringBuilder.toString(), new Object[0]);
                }
            }
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.purchase.logging.c$b */
    static final class C18625b implements Action0 {
        /* renamed from: a */
        public static final C18625b f58063a = new C18625b();

        C18625b() {
        }

        public final void call() {
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "aThrowable", "", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.purchase.logging.c$c */
    static final class C18626c<T> implements Action1<Throwable> {
        /* renamed from: a */
        public static final C18626c f58064a = new C18626c();

        C18626c() {
        }

        public /* synthetic */ void call(Object obj) {
            m67076a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m67076a(Throwable th) {
            C0001a.e("Failed to save PurchaseLog: %s", new Object[]{th.getMessage()});
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.purchase.logging.c$e */
    static final class C18627e<T> implements Action1<String> {
        /* renamed from: a */
        final /* synthetic */ C16231c f58065a;

        C18627e(C16231c c16231c) {
            this.f58065a = c16231c;
        }

        public /* synthetic */ void call(Object obj) {
            m67077a((String) obj);
        }

        /* renamed from: a */
        public final void m67077a(String str) {
            this.f58065a.f50566d.removePurchaseLog(str);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.purchase.logging.c$f */
    static final class C18628f<T> implements Action1<Throwable> {
        /* renamed from: a */
        public static final C18628f f58066a = new C18628f();

        C18628f() {
        }

        public /* synthetic */ void call(Object obj) {
            m67078a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m67078a(Throwable th) {
            C0001a.c(th);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "it", "", "", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.purchase.logging.c$h */
    static final class C18629h<T> implements Action1<List<? extends String>> {
        /* renamed from: a */
        final /* synthetic */ C16231c f58067a;

        C18629h(C16231c c16231c) {
            this.f58067a = c16231c;
        }

        public /* synthetic */ void call(Object obj) {
            m67079a((List) obj);
        }

        /* renamed from: a */
        public final void m67079a(List<String> list) {
            C16231c c16231c = this.f58067a;
            C2668g.a(list, "it");
            c16231c.m61287a((List) list);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "e", "", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.purchase.logging.c$i */
    static final class C18630i<T> implements Action1<Throwable> {
        /* renamed from: a */
        public static final C18630i f58068a = new C18630i();

        C18630i() {
        }

        public /* synthetic */ void call(Object obj) {
            m67080a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m67080a(Throwable th) {
            C0001a.c(th, "Error sending purchase log: %s", new Object[]{th.getMessage()});
        }
    }

    @Inject
    public C16231c(@NotNull TinderApi tinderApi, @NotNull PurchaseLogRepository purchaseLogRepository, @NotNull C14521a c14521a, @NotNull C2652a c2652a) {
        C2668g.b(tinderApi, "tinderApi");
        C2668g.b(purchaseLogRepository, "purchaseLogRepository");
        C2668g.b(c14521a, "purchaseLogFactory");
        C2668g.b(c2652a, "authenticationManager");
        this.f50565c = tinderApi;
        this.f50566d = purchaseLogRepository;
        this.f50567e = c14521a;
        this.f50568f = c2652a;
    }

    /* renamed from: a */
    public void mo11892a() {
        if (!RxUtils.a(this.f50564b)) {
            this.f50564b = Observable.a(30, 30, C14523b.f45921a, Schedulers.io()).c(new C17837g(this)).q().a(new C18629h(this), C18630i.f58068a);
        }
    }

    /* renamed from: a */
    public void mo11893a(@NotNull Source source, @NotNull Throwable th, @Nullable String str, @Nullable String str2) {
        C2668g.b(source, "source");
        C2668g.b(th, "throwable");
        if (th instanceof PurchaseLoggableException) {
            m61285a(source, (PurchaseLoggableException) th);
            return;
        }
        if ((th instanceof CompositeException) != null) {
            source = ((CompositeException) th).a();
        } else if ((th instanceof io.reactivex.exceptions.CompositeException) != null) {
            source = ((io.reactivex.exceptions.CompositeException) th).m58848a();
        } else {
            source = C15807n.m59826a(new PurchaseGenericException(th, str, str2));
        }
        C2668g.a(source, "exceptionList");
        for (Throwable th2 : (Iterable) source) {
            C2668g.a(th2, "it");
            m55478a(th2);
        }
    }

    /* renamed from: a */
    private final void m61285a(Source source, PurchaseLoggableException purchaseLoggableException) {
        Completable.a(new C18624a(this, purchaseLoggableException, source)).b(Schedulers.io()).a((Action0) C18625b.f58063a, C18626c.f58064a);
    }

    @WorkerThread
    /* renamed from: a */
    private final Observable<List<String>> m61283a(int i) {
        if (this.f50568f.d()) {
            List allPurchaseLogIds = this.f50566d.getAllPurchaseLogIds();
            C2668g.a(allPurchaseLogIds, "purchaseLogRepository.allPurchaseLogIds");
            i = C19299w.m68820d((Iterable) allPurchaseLogIds, i);
            Iterable<String> iterable = (Iterable) i;
            Collection arrayList = new ArrayList(C18457p.m66906a((Iterable) iterable, 10));
            for (String purchaseLog : iterable) {
                arrayList.add(this.f50566d.getPurchaseLog(purchaseLog));
            }
            Collection arrayList2 = new ArrayList();
            for (Object next : (List) arrayList) {
                if (Objects.m59118d((PurchaseLog) next)) {
                    arrayList2.add(next);
                }
            }
            allPurchaseLogIds = (List) arrayList2;
            if (allPurchaseLogIds.isEmpty()) {
                i = Observable.c();
                C2668g.a(i, "Observable.empty()");
                return i;
            }
            i = this.f50565c.sendPurchaseLogs(this.f50563a.create(allPurchaseLogIds)).k(new C17836d(i));
            C2668g.a(i, "tinderApi.sendPurchaseLo…p { _ -> purchaseLogIds }");
            return i;
        }
        i = Observable.c();
        C2668g.a(i, "Observable.empty()");
        return i;
    }

    @WorkerThread
    /* renamed from: a */
    private final void m61287a(List<String> list) {
        Observable.a(list).a(new C18627e(this), C18628f.f58066a);
    }
}
