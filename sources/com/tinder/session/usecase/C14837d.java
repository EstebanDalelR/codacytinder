package com.tinder.session.usecase;

import com.tinder.app.AppVisibilityTracker;
import com.tinder.app.AppVisibilityTracker$Visibility;
import com.tinder.core.experiment.AbTestUtility;
import com.tinder.domain.auth.AuthStatus;
import com.tinder.domain.auth.AuthStatusRepository;
import com.tinder.domain.profile.model.ProfileDataRequest;
import com.tinder.domain.profile.model.ProfileOption;
import com.tinder.domain.profile.model.ProfileOption.Products;
import com.tinder.domain.profile.model.ProfileOption.Purchase;
import com.tinder.domain.profile.usecase.SyncProfileData;
import io.reactivex.C3956a;
import io.reactivex.CompletableSource;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.functions.Predicate;
import io.reactivex.schedulers.C15756a;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import p000a.p001a.C0001a;

@Metadata(bv = {1, 0, 2}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0006\u0010\r\u001a\u00020\u000eR\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/tinder/session/usecase/ForegroundSyncRevenueData;", "", "appVisibilityTracker", "Lcom/tinder/app/AppVisibilityTracker;", "syncProfileData", "Lcom/tinder/domain/profile/usecase/SyncProfileData;", "abTestUtility", "Lcom/tinder/core/experiment/AbTestUtility;", "authStatusRepository", "Lcom/tinder/domain/auth/AuthStatusRepository;", "(Lcom/tinder/app/AppVisibilityTracker;Lcom/tinder/domain/profile/usecase/SyncProfileData;Lcom/tinder/core/experiment/AbTestUtility;Lcom/tinder/domain/auth/AuthStatusRepository;)V", "request", "Lcom/tinder/domain/profile/model/ProfileDataRequest;", "execute", "Lio/reactivex/Completable;", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.session.usecase.d */
public final class C14837d {
    /* renamed from: a */
    private final ProfileDataRequest f46451a = ProfileDataRequest.Companion.builder().with((ProfileOption) Products.INSTANCE).with((ProfileOption) Purchase.INSTANCE).build();
    /* renamed from: b */
    private final AppVisibilityTracker f46452b;
    /* renamed from: c */
    private final SyncProfileData f46453c;
    /* renamed from: d */
    private final AbTestUtility f46454d;
    /* renamed from: e */
    private final AuthStatusRepository f46455e;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/tinder/app/AppVisibilityTracker$Visibility;", "test"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.session.usecase.d$a */
    static final class C16582a<T> implements Predicate<AppVisibilityTracker$Visibility> {
        /* renamed from: a */
        public static final C16582a f51284a = new C16582a();

        C16582a() {
        }

        public /* synthetic */ boolean test(Object obj) {
            return m62014a((AppVisibilityTracker$Visibility) obj);
        }

        /* renamed from: a */
        public final boolean m62014a(@NotNull AppVisibilityTracker$Visibility appVisibilityTracker$Visibility) {
            C2668g.b(appVisibilityTracker$Visibility, "it");
            return AppVisibilityTracker$Visibility.FOREGROUND == appVisibilityTracker$Visibility ? true : null;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "status", "Lcom/tinder/domain/auth/AuthStatus;", "test"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.session.usecase.d$b */
    static final class C16583b<T> implements Predicate<AuthStatus> {
        /* renamed from: a */
        public static final C16583b f51285a = new C16583b();

        C16583b() {
        }

        public /* synthetic */ boolean test(Object obj) {
            return m62015a((AuthStatus) obj);
        }

        /* renamed from: a */
        public final boolean m62015a(@NotNull AuthStatus authStatus) {
            C2668g.b(authStatus, "status");
            return authStatus == AuthStatus.LOGGED_OUT ? true : null;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lio/reactivex/Completable;", "kotlin.jvm.PlatformType", "it", "Lcom/tinder/app/AppVisibilityTracker$Visibility;", "apply"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.session.usecase.d$c */
    static final class C16585c<T, R> implements Function<AppVisibilityTracker$Visibility, CompletableSource> {
        /* renamed from: a */
        final /* synthetic */ C14837d f51287a;

        @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 10})
        /* renamed from: com.tinder.session.usecase.d$c$1 */
        static final class C165841<T> implements Consumer<Throwable> {
            /* renamed from: a */
            public static final C165841 f51286a = new C165841();

            C165841() {
            }

            public /* synthetic */ void accept(Object obj) {
                m62016a((Throwable) obj);
            }

            /* renamed from: a */
            public final void m62016a(Throwable th) {
                C0001a.b(th, "Error syncing revenue profile data.", new Object[0]);
            }
        }

        C16585c(C14837d c14837d) {
            this.f51287a = c14837d;
        }

        public /* synthetic */ Object apply(Object obj) {
            return m62017a((AppVisibilityTracker$Visibility) obj);
        }

        /* renamed from: a */
        public final C3956a m62017a(@NotNull AppVisibilityTracker$Visibility appVisibilityTracker$Visibility) {
            C2668g.b(appVisibilityTracker$Visibility, "it");
            return this.f51287a.f46453c.execute(this.f51287a.f46451a).a(C165841.f51286a).c();
        }
    }

    @Inject
    public C14837d(@NotNull AppVisibilityTracker appVisibilityTracker, @NotNull SyncProfileData syncProfileData, @NotNull AbTestUtility abTestUtility, @NotNull AuthStatusRepository authStatusRepository) {
        C2668g.b(appVisibilityTracker, "appVisibilityTracker");
        C2668g.b(syncProfileData, "syncProfileData");
        C2668g.b(abTestUtility, "abTestUtility");
        C2668g.b(authStatusRepository, "authStatusRepository");
        this.f46452b = appVisibilityTracker;
        this.f46453c = syncProfileData;
        this.f46454d = abTestUtility;
        this.f46455e = authStatusRepository;
    }

    @NotNull
    /* renamed from: a */
    public final C3956a m56208a() {
        if (this.f46454d.profileV2EnabledForRevenue()) {
            C3956a flatMapCompletable = this.f46452b.trackVisibility().observeOn(C15756a.m59010b()).skip(1).filter(C16582a.f51284a).takeUntil(this.f46455e.observeAuthStatus().a(C16583b.f51285a).p()).flatMapCompletable(new C16585c(this));
            C2668g.a(flatMapCompletable, "appVisibilityTracker.tra…plete()\n                }");
            return flatMapCompletable;
        }
        flatMapCompletable = C3956a.a();
        C2668g.a(flatMapCompletable, "Completable.complete()");
        return flatMapCompletable;
    }
}
