package com.tinder.match.dialog;

import com.tinder.domain.common.model.User;
import com.tinder.domain.match.model.Match;
import com.tinder.domain.match.provider.NewMatchProvider;
import com.tinder.domain.meta.model.CurrentUser;
import com.tinder.domain.meta.usecase.GetCurrentUser;
import com.tinder.itsamatch.C9743a;
import com.tinder.itsamatch.ItsAMatchDialogModel;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import p000a.p001a.C0001a;
import rx.Single;
import rx.Subscription;
import rx.functions.Action1;
import rx.functions.Func1;
import rx.p494a.p496b.C19397a;
import rx.schedulers.Schedulers;

@Metadata(bv = {1, 0, 2}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001f\b\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0006\u0010\r\u001a\u00020\u000eJ\b\u0010\u000f\u001a\u00020\u000eH\u0002J\u000e\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\fR\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/tinder/match/dialog/ItsAMatchDialogLauncherPresenter;", "", "newMatchProvider", "Lcom/tinder/domain/match/provider/NewMatchProvider;", "itsAMatchDialogViewModelMapper", "Lcom/tinder/itsamatch/ItsAMatchDialogViewModelMapper;", "getCurrentUser", "Lcom/tinder/domain/meta/usecase/GetCurrentUser;", "(Lcom/tinder/domain/match/provider/NewMatchProvider;Lcom/tinder/itsamatch/ItsAMatchDialogViewModelMapper;Lcom/tinder/domain/meta/usecase/GetCurrentUser;)V", "newMatchesSubscription", "Lrx/Subscription;", "target", "Lcom/tinder/match/dialog/ItsAMatchDialogLauncherTarget;", "dropTarget", "", "subscribeToNewMatches", "takeTarget", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.match.dialog.g */
public final class C9861g {
    /* renamed from: a */
    private ItsAMatchDialogLauncherTarget f32642a;
    /* renamed from: b */
    private Subscription f32643b;
    /* renamed from: c */
    private final NewMatchProvider f32644c;
    /* renamed from: d */
    private final C9743a f32645d;
    /* renamed from: e */
    private final GetCurrentUser f32646e;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a&\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0012\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\u000e\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00050\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lrx/Single;", "Lcom/tinder/itsamatch/ItsAMatchDialogModel;", "kotlin.jvm.PlatformType", "match", "Lcom/tinder/domain/match/model/Match;", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.match.dialog.g$a */
    static final class C13426a<T, R> implements Func1<T, Single<? extends R>> {
        /* renamed from: a */
        final /* synthetic */ C9861g f42581a;

        C13426a(C9861g c9861g) {
            this.f42581a = c9861g;
        }

        public /* synthetic */ Object call(Object obj) {
            return m51899a((Match) obj);
        }

        /* renamed from: a */
        public final Single<ItsAMatchDialogModel> m51899a(final Match match) {
            return this.f42581a.f32646e.execute().d(new Func1<T, R>() {
                public /* synthetic */ Object call(Object obj) {
                    return m51898a((CurrentUser) obj);
                }

                @NotNull
                /* renamed from: a */
                public final ItsAMatchDialogModel m51898a(CurrentUser currentUser) {
                    C9743a b = this.f42581a.f32645d;
                    C2668g.a(currentUser, "currentUser");
                    User user = currentUser;
                    Match match = match;
                    C2668g.a(match, "match");
                    return b.m40272a(user, match);
                }
            });
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "model", "Lcom/tinder/itsamatch/ItsAMatchDialogModel;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.match.dialog.g$b */
    static final class C14057b<T> implements Action1<ItsAMatchDialogModel> {
        /* renamed from: a */
        final /* synthetic */ C9861g f44568a;

        C14057b(C9861g c9861g) {
            this.f44568a = c9861g;
        }

        public /* synthetic */ void call(Object obj) {
            m53788a((ItsAMatchDialogModel) obj);
        }

        /* renamed from: a */
        public final void m53788a(ItsAMatchDialogModel itsAMatchDialogModel) {
            ItsAMatchDialogLauncherTarget c = this.f44568a.f32642a;
            if (c != null) {
                c.showMatchedDialog(itsAMatchDialogModel);
            }
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "error", "", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.match.dialog.g$c */
    static final class C14058c<T> implements Action1<Throwable> {
        /* renamed from: a */
        public static final C14058c f44569a = new C14058c();

        C14058c() {
        }

        public /* synthetic */ void call(Object obj) {
            m53789a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m53789a(Throwable th) {
            C0001a.c(th, "Error observing new matches", new Object[0]);
        }
    }

    @Inject
    public C9861g(@NotNull NewMatchProvider newMatchProvider, @NotNull C9743a c9743a, @NotNull GetCurrentUser getCurrentUser) {
        C2668g.b(newMatchProvider, "newMatchProvider");
        C2668g.b(c9743a, "itsAMatchDialogViewModelMapper");
        C2668g.b(getCurrentUser, "getCurrentUser");
        this.f32644c = newMatchProvider;
        this.f32645d = c9743a;
        this.f32646e = getCurrentUser;
    }

    /* renamed from: a */
    public final void m40554a(@NotNull ItsAMatchDialogLauncherTarget itsAMatchDialogLauncherTarget) {
        C2668g.b(itsAMatchDialogLauncherTarget, "target");
        this.f32642a = itsAMatchDialogLauncherTarget;
        m40551b();
    }

    /* renamed from: a */
    public final void m40553a() {
        this.f32642a = (ItsAMatchDialogLauncherTarget) null;
        Subscription subscription = this.f32643b;
        if (subscription != null) {
            subscription.unsubscribe();
        }
        this.f32643b = (Subscription) null;
    }

    /* renamed from: b */
    private final void m40551b() {
        this.f32643b = this.f32644c.observeNewMatches().j(new C13426a(this)).b(Schedulers.io()).a(C19397a.a()).a(new C14057b(this), C14058c.f44569a);
    }
}
