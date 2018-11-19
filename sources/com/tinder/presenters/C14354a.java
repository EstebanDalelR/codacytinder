package com.tinder.presenters;

import com.tinder.apprating.enums.AppRatingType;
import com.tinder.apprating.p165c.C8264a;
import com.tinder.apprating.p166e.C10314b;
import com.tinder.targets.ActivitySignedInBaseTarget;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000a.p001a.C0001a;
import rx.Single;
import rx.functions.Action1;
import rx.functions.Func1;
import rx.p494a.p496b.C19397a;
import rx.p500e.C19573b;
import rx.schedulers.Schedulers;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0017\b\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0006\u0010\u0010\u001a\u00020\u0011R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R(\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\t\u001a\u0004\u0018\u00010\n@FX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, d2 = {"Lcom/tinder/presenters/ActivitySignedInBasePresenter;", "", "appRatingDialogProvider", "Lcom/tinder/apprating/provider/AppRatingDialogProvider;", "checkShowAppRatingDialog", "Lcom/tinder/apprating/usecase/CheckShowAppRatingDialog;", "(Lcom/tinder/apprating/provider/AppRatingDialogProvider;Lcom/tinder/apprating/usecase/CheckShowAppRatingDialog;)V", "compositeSubscription", "Lrx/subscriptions/CompositeSubscription;", "value", "Lcom/tinder/targets/ActivitySignedInBaseTarget;", "target", "getTarget", "()Lcom/tinder/targets/ActivitySignedInBaseTarget;", "setTarget", "(Lcom/tinder/targets/ActivitySignedInBaseTarget;)V", "subscribeToAppRatingProvider", "", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.presenters.a */
public final class C14354a {
    /* renamed from: a */
    private final C19573b f45537a = new C19573b();
    @Nullable
    /* renamed from: b */
    private ActivitySignedInBaseTarget f45538b;
    /* renamed from: c */
    private final C8264a f45539c;
    /* renamed from: d */
    private final C10314b f45540d;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "appRatingType", "Lcom/tinder/apprating/enums/AppRatingType;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.presenters.a$a */
    static final class C17739a<T, R> implements Func1<AppRatingType, Boolean> {
        /* renamed from: a */
        public static final C17739a f55204a = new C17739a();

        C17739a() {
        }

        public /* synthetic */ Object call(Object obj) {
            return Boolean.valueOf(m64625a((AppRatingType) obj));
        }

        /* renamed from: a */
        public final boolean m64625a(AppRatingType appRatingType) {
            return appRatingType == AppRatingType.NEW_MATCH ? true : null;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u000e\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lrx/Single;", "", "it", "Lcom/tinder/apprating/enums/AppRatingType;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.presenters.a$b */
    static final class C17740b<T, R> implements Func1<T, Single<? extends R>> {
        /* renamed from: a */
        final /* synthetic */ C14354a f55205a;

        C17740b(C14354a c14354a) {
            this.f55205a = c14354a;
        }

        public /* synthetic */ Object call(Object obj) {
            return m64626a((AppRatingType) obj);
        }

        @NotNull
        /* renamed from: a */
        public final Single<Boolean> m64626a(AppRatingType appRatingType) {
            return this.f55205a.f45540d.execute();
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "shouldShowRatingDialog", "", "kotlin.jvm.PlatformType", "call", "(Ljava/lang/Boolean;)V"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.presenters.a$c */
    static final class C18581c<T> implements Action1<Boolean> {
        /* renamed from: a */
        final /* synthetic */ C14354a f57851a;

        C18581c(C14354a c14354a) {
            this.f57851a = c14354a;
        }

        public /* synthetic */ void call(Object obj) {
            m67041a((Boolean) obj);
        }

        /* renamed from: a */
        public final void m67041a(Boolean bool) {
            C2668g.a(bool, "shouldShowRatingDialog");
            if (bool.booleanValue() != null) {
                bool = this.f57851a.m54677a();
                if (bool != null) {
                    bool.showAppRatingDialog();
                }
            }
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.presenters.a$d */
    static final class C18582d<T> implements Action1<Throwable> {
        /* renamed from: a */
        public static final C18582d f57852a = new C18582d();

        C18582d() {
        }

        public /* synthetic */ void call(Object obj) {
            m67042a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m67042a(Throwable th) {
            C0001a.c(th, "Error showing AppRating Dialog from New Match", new Object[0]);
        }
    }

    @Inject
    public C14354a(@NotNull C8264a c8264a, @NotNull C10314b c10314b) {
        C2668g.b(c8264a, "appRatingDialogProvider");
        C2668g.b(c10314b, "checkShowAppRatingDialog");
        this.f45539c = c8264a;
        this.f45540d = c10314b;
    }

    @Nullable
    /* renamed from: a */
    public final ActivitySignedInBaseTarget m54677a() {
        return this.f45538b;
    }

    /* renamed from: a */
    public final void m54678a(@Nullable ActivitySignedInBaseTarget activitySignedInBaseTarget) {
        if (activitySignedInBaseTarget == null) {
            this.f45537a.a();
        }
        this.f45538b = activitySignedInBaseTarget;
    }

    /* renamed from: b */
    public final void m54679b() {
        this.f45537a.a(this.f45539c.a().f(C17739a.f55204a).c(1).a().a(new C17740b(this)).b(Schedulers.io()).a(C19397a.a()).a(new C18581c(this), C18582d.f57852a));
    }
}
