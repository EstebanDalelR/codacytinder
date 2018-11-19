package com.tinder.verification.worker;

import com.tinder.common.logger.Logger;
import com.tinder.verification.usecase.AddAuthAccountLinkModalEvent;
import com.tinder.verification.usecase.AddAuthAccountLinkModalEvent.Action;
import com.tinder.verification.usecase.AddAuthAccountLinkModalEvent.C15389a;
import io.reactivex.C15679f;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.subjects.PublishSubject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u000e\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u000fJ\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\nH\u0002J\u0006\u0010\u0017\u001a\u00020\u0012J\u0006\u0010\u0018\u001a\u00020\u0012R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u0002\n\u0000R2\u0010\r\u001a&\u0012\f\u0012\n \u0010*\u0004\u0018\u00010\u000f0\u000f \u0010*\u0012\u0012\f\u0012\n \u0010*\u0004\u0018\u00010\u000f0\u000f\u0018\u00010\u000e0\u000eX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/tinder/verification/worker/AuthAccountLinkModalEventWorker;", "", "addAuthAccountLinkModalEvent", "Lcom/tinder/verification/usecase/AddAuthAccountLinkModalEvent;", "logger", "Lcom/tinder/common/logger/Logger;", "ioScheduler", "Lio/reactivex/Scheduler;", "(Lcom/tinder/verification/usecase/AddAuthAccountLinkModalEvent;Lcom/tinder/common/logger/Logger;Lio/reactivex/Scheduler;)V", "cachedAction", "Lcom/tinder/verification/usecase/AddAuthAccountLinkModalEvent$Action;", "requestDisposable", "Lio/reactivex/disposables/Disposable;", "requestSubject", "Lio/reactivex/subjects/PublishSubject;", "Lcom/tinder/verification/usecase/AddAuthAccountLinkModalEvent$Request;", "kotlin.jvm.PlatformType", "addEventRequest", "", "request", "isEventRequestAllowed", "", "requestAction", "start", "stop", "verification_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.verification.worker.a */
public final class C15393a {
    /* renamed from: a */
    private final PublishSubject<C15389a> f47666a = PublishSubject.m67682a();
    /* renamed from: b */
    private Action f47667b;
    /* renamed from: c */
    private Disposable f47668c;
    /* renamed from: d */
    private final AddAuthAccountLinkModalEvent f47669d;
    /* renamed from: e */
    private final Logger f47670e;
    /* renamed from: f */
    private final C15679f f47671f;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/tinder/verification/usecase/AddAuthAccountLinkModalEvent$Request;", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.verification.worker.a$a */
    static final class C17240a<T> implements Consumer<C15389a> {
        /* renamed from: a */
        final /* synthetic */ C15393a f52851a;

        C17240a(C15393a c15393a) {
            this.f52851a = c15393a;
        }

        public /* synthetic */ void accept(Object obj) {
            m63151a((C15389a) obj);
        }

        /* renamed from: a */
        public final void m63151a(C15389a c15389a) {
            AddAuthAccountLinkModalEvent a = this.f52851a.f47669d;
            C2668g.a(c15389a, "it");
            a.m66233a(c15389a);
        }
    }

    public C15393a(@NotNull AddAuthAccountLinkModalEvent addAuthAccountLinkModalEvent, @NotNull Logger logger, @NotNull C15679f c15679f) {
        C2668g.b(addAuthAccountLinkModalEvent, "addAuthAccountLinkModalEvent");
        C2668g.b(logger, "logger");
        C2668g.b(c15679f, "ioScheduler");
        this.f47669d = addAuthAccountLinkModalEvent;
        this.f47670e = logger;
        this.f47671f = c15679f;
    }

    /* renamed from: a */
    public final void m57727a() {
        if (this.f47668c != null) {
            this.f47670e.error(new IllegalStateException("AuthAccountLinkModalEventWorker is already started"));
        } else {
            this.f47668c = this.f47666a.subscribeOn(this.f47671f).subscribe(new C17240a(this), new C17241b(new AuthAccountLinkModalEventWorker$start$2(this.f47670e)));
        }
    }

    /* renamed from: b */
    public final void m57729b() {
        Disposable disposable = this.f47668c;
        if (disposable != null) {
            disposable.dispose();
        }
        this.f47668c = (Disposable) null;
        this.f47667b = (Action) null;
    }

    /* renamed from: a */
    public final void m57728a(@NotNull C15389a c15389a) {
        C2668g.b(c15389a, "request");
        if (m57726a(c15389a.m57719a())) {
            this.f47667b = c15389a.m57719a();
            this.f47666a.onNext(c15389a);
        }
    }

    /* renamed from: a */
    private final boolean m57726a(Action action) {
        if (action == Action.SHOW && this.f47667b == Action.SHOW) {
            return false;
        }
        if (action == Action.HIDE && this.f47667b == Action.HIDE) {
            return false;
        }
        if (action == Action.HIDE && this.f47667b == null) {
            return false;
        }
        return true;
    }
}
