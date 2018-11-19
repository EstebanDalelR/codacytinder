package com.tinder.profiletab.presenter;

import com.tinder.data.user.CurrentUserProvider;
import com.tinder.deadshot.DeadshotTarget;
import com.tinder.deadshot.Drop;
import com.tinder.deadshot.Take;
import com.tinder.domain.common.model.ProfileUser;
import com.tinder.domain.injection.qualifiers.IoScheduler;
import com.tinder.domain.profile.model.Tutorial;
import com.tinder.domain.profile.model.Tutorial.EditInfoAnimation;
import com.tinder.domain.profile.model.Tutorial.LoopsNewMediaSelectorTooltip;
import com.tinder.domain.profile.usecase.ConfirmTutorialsViewed;
import com.tinder.domain.utils.RxJavaInteropExtKt;
import com.tinder.injection.qualifiers.MainThreadScheduler;
import com.tinder.loops.analytics.C11912a;
import com.tinder.loops.analytics.C11912a.C9759a;
import com.tinder.loops.analytics.TutorialAction;
import com.tinder.loops.analytics.TutorialContext;
import com.tinder.loops.analytics.TutorialName;
import com.tinder.loops.analytics.TutorialType;
import com.tinder.module.ViewScope;
import com.tinder.p204d.p205a.C8609a;
import com.tinder.passport.model.C10044b;
import com.tinder.passport.p303f.C12263a;
import com.tinder.profiletab.p369c.C16173a;
import com.tinder.profiletab.p369c.C16176d;
import com.tinder.profiletab.p369c.C16176d.C14466a;
import com.tinder.profiletab.p369c.C16176d.C14466a.C14465a;
import com.tinder.profiletab.p369c.C16178g;
import com.tinder.profiletab.p369c.C16184i;
import com.tinder.profiletab.p370d.C14470b;
import com.tinder.profiletab.p370d.C14470b.C14469b;
import com.tinder.profiletab.target.ProfileTabTarget;
import io.reactivex.C15679f;
import io.reactivex.C3956a;
import io.reactivex.C3959e;
import io.reactivex.disposables.C17356a;
import io.reactivex.functions.Action;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Predicate;
import io.reactivex.rxkotlin.C15747d;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import p000a.p001a.C0001a;
import rx.Completable;
import rx.Observable;
import rx.functions.Func1;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001Bk\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u0012\b\b\u0001\u0010\u0016\u001a\u00020\u0017\u0012\b\b\u0001\u0010\u0018\u001a\u00020\u0017¢\u0006\u0002\u0010\u0019J\r\u0010$\u001a\u00020%H\u0001¢\u0006\u0002\b&J\u0010\u0010\u0010\u001a\u00020%2\u0006\u0010'\u001a\u00020(H\u0002J\u0018\u0010)\u001a\u00020#2\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020-H\u0002J\u0006\u0010.\u001a\u00020%J\u000e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020+0/H\u0002J\u000e\u00100\u001a\b\u0012\u0004\u0012\u00020-0/H\u0002J\u0006\u00101\u001a\u00020%J\u0006\u00102\u001a\u00020%J\u0006\u00103\u001a\u00020%J\u000e\u00104\u001a\u00020%2\u0006\u00105\u001a\u000206J\u0010\u00107\u001a\u00020%2\u0006\u00108\u001a\u000206H\u0002J\b\u00109\u001a\u00020%H\u0002J\r\u0010:\u001a\u00020%H\u0001¢\u0006\u0002\b;J\r\u0010<\u001a\u00020%H\u0001¢\u0006\u0002\b=R\u000e\u0010\u0014\u001a\u00020\u0015X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0017X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u001c\u001a\u00020\u001d8\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u0010\u0010\"\u001a\u0004\u0018\u00010#X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006>"}, d2 = {"Lcom/tinder/profiletab/presenter/ProfileTabPresenter;", "", "userProvider", "Lcom/tinder/data/user/CurrentUserProvider;", "userInfoViewModelFactory", "Lcom/tinder/profiletab/viewmodel/UserInfoViewModel$Factory;", "observePassportLocation", "Lcom/tinder/passport/usecase/ObservePassportLocation;", "shouldShowAddMediaTooltip", "Lcom/tinder/profiletab/usecase/ShouldShowAddMediaTooltip;", "addUserInteractionSettingsEvent", "Lcom/tinder/profiletab/usecase/AddUserInteractionSettingsEvent;", "isProfileMediaFull", "Lcom/tinder/profiletab/usecase/IsProfileMediaFull;", "editProfileOpenEvent", "Lcom/tinder/profiletab/usecase/EditProfileOpenEvent;", "confirmTutorialsViewed", "Lcom/tinder/domain/profile/usecase/ConfirmTutorialsViewed;", "loopsExperimentUtility", "Lcom/tinder/loop/experiment/LoopsExperimentUtility;", "addAppTutorialMediaSelectorEvent", "Lcom/tinder/loops/analytics/AddAppTutorialMediaSelectorEvent;", "ioScheduler", "Lio/reactivex/Scheduler;", "mainThreadScheduler", "(Lcom/tinder/data/user/CurrentUserProvider;Lcom/tinder/profiletab/viewmodel/UserInfoViewModel$Factory;Lcom/tinder/passport/usecase/ObservePassportLocation;Lcom/tinder/profiletab/usecase/ShouldShowAddMediaTooltip;Lcom/tinder/profiletab/usecase/AddUserInteractionSettingsEvent;Lcom/tinder/profiletab/usecase/IsProfileMediaFull;Lcom/tinder/profiletab/usecase/EditProfileOpenEvent;Lcom/tinder/domain/profile/usecase/ConfirmTutorialsViewed;Lcom/tinder/loop/experiment/LoopsExperimentUtility;Lcom/tinder/loops/analytics/AddAppTutorialMediaSelectorEvent;Lio/reactivex/Scheduler;Lio/reactivex/Scheduler;)V", "compositeDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "target", "Lcom/tinder/profiletab/target/ProfileTabTarget;", "getTarget$Tinder_release", "()Lcom/tinder/profiletab/target/ProfileTabTarget;", "setTarget$Tinder_release", "(Lcom/tinder/profiletab/target/ProfileTabTarget;)V", "userInfoViewModel", "Lcom/tinder/profiletab/viewmodel/UserInfoViewModel;", "bindUserInfoViewModel", "", "bindUserInfoViewModel$Tinder_release", "tutorial", "Lcom/tinder/domain/profile/model/Tutorial;", "createViewModel", "passportLocationInfo", "Lcom/tinder/passport/model/PassportLocationInfo;", "profileUser", "Lcom/tinder/domain/common/model/ProfileUser;", "fireSettingsEvent", "Lio/reactivex/Observable;", "observeProfileUser", "onAvatarClicked", "onEditButtonClicked", "onMediaButtonClicked", "onToolTipClicked", "tooltipAction", "Lcom/tinder/loops/analytics/TutorialAction;", "sendAppTutorialEvent", "action", "showAddLoopsToolTip", "unsubscribe", "unsubscribe$Tinder_release", "updateMediaButtonOnTake", "updateMediaButtonOnTake$Tinder_release", "Tinder_release"}, k = 1, mv = {1, 1, 10})
@ViewScope
/* renamed from: com.tinder.profiletab.presenter.x */
public final class C14476x {
    @DeadshotTarget
    @NotNull
    /* renamed from: a */
    public ProfileTabTarget f45832a;
    /* renamed from: b */
    private final C17356a f45833b = new C17356a();
    /* renamed from: c */
    private C14470b f45834c;
    /* renamed from: d */
    private final CurrentUserProvider f45835d;
    /* renamed from: e */
    private final C14469b f45836e;
    /* renamed from: f */
    private final C12263a f45837f;
    /* renamed from: g */
    private final C16184i f45838g;
    /* renamed from: h */
    private final C16173a f45839h;
    /* renamed from: i */
    private final C16178g f45840i;
    /* renamed from: j */
    private final C16176d f45841j;
    /* renamed from: k */
    private final ConfirmTutorialsViewed f45842k;
    /* renamed from: l */
    private final C8609a f45843l;
    /* renamed from: m */
    private final C11912a f45844m;
    /* renamed from: n */
    private final C15679f f45845n;
    /* renamed from: o */
    private final C15679f f45846o;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lcom/tinder/profiletab/viewmodel/UserInfoViewModel;", "passportLocationInfo", "Lcom/tinder/passport/model/PassportLocationInfo;", "profileUser", "Lcom/tinder/domain/common/model/ProfileUser;", "apply"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.profiletab.presenter.x$a */
    static final class C16191a<T1, T2, R> implements BiFunction<C10044b, ProfileUser, C14470b> {
        /* renamed from: a */
        final /* synthetic */ C14476x f50418a;

        C16191a(C14476x c14476x) {
            this.f50418a = c14476x;
        }

        public /* synthetic */ Object apply(Object obj, Object obj2) {
            return m61148a((C10044b) obj, (ProfileUser) obj2);
        }

        @NotNull
        /* renamed from: a */
        public final C14470b m61148a(@NotNull C10044b c10044b, @NotNull ProfileUser profileUser) {
            C2668g.b(c10044b, "passportLocationInfo");
            C2668g.b(profileUser, "profileUser");
            return this.f50418a.m55272a(c10044b, profileUser);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/tinder/profiletab/viewmodel/UserInfoViewModel;", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.profiletab.presenter.x$b */
    static final class C16192b<T> implements Consumer<C14470b> {
        /* renamed from: a */
        final /* synthetic */ C14476x f50419a;

        C16192b(C14476x c14476x) {
            this.f50419a = c14476x;
        }

        public /* synthetic */ void accept(Object obj) {
            m61149a((C14470b) obj);
        }

        /* renamed from: a */
        public final void m61149a(C14470b c14470b) {
            ProfileTabTarget a = this.f50419a.m55280a();
            C2668g.a(c14470b, "it");
            a.bindUserInfoViewModel(c14470b);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.profiletab.presenter.x$c */
    static final class C16193c<T> implements Consumer<Throwable> {
        /* renamed from: a */
        public static final C16193c f50420a = new C16193c();

        C16193c() {
        }

        public /* synthetic */ void accept(Object obj) {
            m61150a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m61150a(Throwable th) {
            C0001a.c(th);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.profiletab.presenter.x$d */
    static final class C16194d implements Action {
        /* renamed from: a */
        public static final C16194d f50421a = new C16194d();

        C16194d() {
        }

        public final void run() {
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.profiletab.presenter.x$e */
    static final class C16195e<T> implements Consumer<Throwable> {
        /* renamed from: a */
        public static final C16195e f50422a = new C16195e();

        C16195e() {
        }

        public /* synthetic */ void accept(Object obj) {
            m61151a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m61151a(Throwable th) {
            C0001a.c(th);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.profiletab.presenter.x$g */
    static final class C16196g implements Action {
        /* renamed from: a */
        public static final C16196g f50423a = new C16196g();

        C16196g() {
        }

        public final void run() {
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.profiletab.presenter.x$h */
    static final class C16197h<T> implements Consumer<Throwable> {
        /* renamed from: a */
        public static final C16197h f50424a = new C16197h();

        C16197h() {
        }

        public /* synthetic */ void accept(Object obj) {
            m61152a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m61152a(Throwable th) {
            C0001a.c(th);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "isMediaFull", "", "accept"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.profiletab.presenter.x$i */
    static final class C16198i<T> implements Consumer<Boolean> {
        /* renamed from: a */
        final /* synthetic */ C14476x f50425a;

        C16198i(C14476x c14476x) {
            this.f50425a = c14476x;
        }

        public /* synthetic */ void accept(Object obj) {
            m61153a(((Boolean) obj).booleanValue());
        }

        /* renamed from: a */
        public final void m61153a(boolean z) {
            if (z) {
                this.f50425a.m55280a().showEditProfile();
            } else {
                this.f50425a.m55280a().showMediaSelector();
            }
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.profiletab.presenter.x$j */
    static final class C16199j<T> implements Consumer<Throwable> {
        /* renamed from: a */
        public static final C16199j f50426a = new C16199j();

        C16199j() {
        }

        public /* synthetic */ void accept(Object obj) {
            m61154a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m61154a(Throwable th) {
            C0001a.c(th);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "it", "test", "(Ljava/lang/Boolean;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.profiletab.presenter.x$k */
    static final class C16200k<T> implements Predicate<Boolean> {
        /* renamed from: a */
        public static final C16200k f50427a = new C16200k();

        C16200k() {
        }

        @NotNull
        /* renamed from: a */
        public final Boolean m61155a(@NotNull Boolean bool) {
            C2668g.b(bool, "it");
            return bool;
        }

        public /* synthetic */ boolean test(Object obj) {
            return m61155a((Boolean) obj).booleanValue();
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept", "(Ljava/lang/Boolean;)V"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.profiletab.presenter.x$l */
    static final class C16201l<T> implements Consumer<Boolean> {
        /* renamed from: a */
        final /* synthetic */ C14476x f50428a;

        C16201l(C14476x c14476x) {
            this.f50428a = c14476x;
        }

        public /* synthetic */ void accept(Object obj) {
            m61156a((Boolean) obj);
        }

        /* renamed from: a */
        public final void m61156a(Boolean bool) {
            this.f50428a.m55280a().showProfileAddLoopsToolTip();
            this.f50428a.m55276b(TutorialAction.SHOW);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.profiletab.presenter.x$m */
    static final class C16202m<T> implements Consumer<Throwable> {
        /* renamed from: a */
        public static final C16202m f50429a = new C16202m();

        C16202m() {
        }

        public /* synthetic */ void accept(Object obj) {
            m61157a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m61157a(Throwable th) {
            C0001a.c(th, "Error showing add media tool tip.", new Object[0]);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/tinder/domain/common/model/ProfileUser;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.profiletab.presenter.x$f */
    static final class C17787f<T, R> implements Func1<ProfileUser, Boolean> {
        /* renamed from: a */
        public static final C17787f f55500a = new C17787f();

        C17787f() {
        }

        /* renamed from: a */
        public final boolean m64994a(ProfileUser profileUser) {
            return profileUser != null;
        }

        public /* synthetic */ Object call(Object obj) {
            return Boolean.valueOf(m64994a((ProfileUser) obj));
        }
    }

    @Inject
    public C14476x(@NotNull CurrentUserProvider currentUserProvider, @NotNull C14469b c14469b, @NotNull C12263a c12263a, @NotNull C16184i c16184i, @NotNull C16173a c16173a, @NotNull C16178g c16178g, @NotNull C16176d c16176d, @NotNull ConfirmTutorialsViewed confirmTutorialsViewed, @NotNull C8609a c8609a, @NotNull C11912a c11912a, @NotNull @IoScheduler C15679f c15679f, @NotNull @MainThreadScheduler C15679f c15679f2) {
        C2668g.b(currentUserProvider, "userProvider");
        C2668g.b(c14469b, "userInfoViewModelFactory");
        C2668g.b(c12263a, "observePassportLocation");
        C2668g.b(c16184i, "shouldShowAddMediaTooltip");
        C2668g.b(c16173a, "addUserInteractionSettingsEvent");
        C2668g.b(c16178g, "isProfileMediaFull");
        C2668g.b(c16176d, "editProfileOpenEvent");
        C2668g.b(confirmTutorialsViewed, "confirmTutorialsViewed");
        C2668g.b(c8609a, "loopsExperimentUtility");
        C2668g.b(c11912a, "addAppTutorialMediaSelectorEvent");
        C2668g.b(c15679f, "ioScheduler");
        C2668g.b(c15679f2, "mainThreadScheduler");
        this.f45835d = currentUserProvider;
        this.f45836e = c14469b;
        this.f45837f = c12263a;
        this.f45838g = c16184i;
        this.f45839h = c16173a;
        this.f45840i = c16178g;
        this.f45841j = c16176d;
        this.f45842k = confirmTutorialsViewed;
        this.f45843l = c8609a;
        this.f45844m = c11912a;
        this.f45845n = c15679f;
        this.f45846o = c15679f2;
    }

    @NotNull
    /* renamed from: a */
    public final ProfileTabTarget m55280a() {
        ProfileTabTarget profileTabTarget = this.f45832a;
        if (profileTabTarget == null) {
            C2668g.b("target");
        }
        return profileTabTarget;
    }

    @Take
    /* renamed from: b */
    public final void m55282b() {
        this.f45833b.add(C3959e.combineLatest(m55277i(), m55278j(), new C16191a(this)).subscribeOn(this.f45845n).observeOn(this.f45846o).subscribe(new C16192b(this), C16193c.f50420a));
    }

    /* renamed from: i */
    private final C3959e<C10044b> m55277i() {
        return this.f45837f.execute();
    }

    /* renamed from: j */
    private final C3959e<ProfileUser> m55278j() {
        Observable f = this.f45835d.observe().f(C17787f.f55500a);
        C2668g.a(f, "userProvider\n           …   .filter { it != null }");
        C3959e<ProfileUser> distinctUntilChanged = RxJavaInteropExtKt.toV2Observable(f).distinctUntilChanged();
        C2668g.a(distinctUntilChanged, "userProvider\n           …  .distinctUntilChanged()");
        return distinctUntilChanged;
    }

    @Take
    /* renamed from: c */
    public final void m55283c() {
        boolean e = this.f45843l.e();
        if (e) {
            m55279k();
        } else if (!e) {
            ProfileTabTarget profileTabTarget = this.f45832a;
            if (profileTabTarget == null) {
                C2668g.b("target");
            }
            profileTabTarget.hideMediaButton();
        }
    }

    @Drop
    /* renamed from: d */
    public final void m55284d() {
        this.f45833b.m63446a();
    }

    /* renamed from: a */
    public final void m55281a(@NotNull TutorialAction tutorialAction) {
        C2668g.b(tutorialAction, "tooltipAction");
        m55274a((Tutorial) LoopsNewMediaSelectorTooltip.INSTANCE);
        m55276b(tutorialAction);
    }

    /* renamed from: e */
    public final void m55285e() {
        ProfileTabTarget profileTabTarget = this.f45832a;
        if (profileTabTarget == null) {
            C2668g.b("target");
        }
        profileTabTarget.dismissTooltip(TutorialAction.TAP_BUTTON);
        this.f45833b.add(this.f45840i.execute().subscribeOn(this.f45845n).observeOn(this.f45846o).subscribe(new C16198i(this), C16199j.f50426a));
    }

    /* renamed from: f */
    public final void m55286f() {
        m55274a((Tutorial) EditInfoAnimation.INSTANCE);
        ProfileUser profileUser = this.f45835d.get();
        if (profileUser != null) {
            if (this.f45834c != null) {
                C14465a j = C14466a.m55206j();
                C14470b c14470b = this.f45834c;
                String str = null;
                j = j.mo11778b(c14470b != null ? c14470b.mo11803e() : null);
                c14470b = this.f45834c;
                if (c14470b != null) {
                    str = c14470b.mo11802d();
                }
                j = j.mo11780c(str).mo11775a(profileUser.bio()).mo11774a(profileUser.photos().size()).mo11776a(profileUser.hideAge()).mo11779b(profileUser.hideDistance());
                boolean z = false;
                j = j.mo11781c(profileUser.instagram() != null).mo11782d(profileUser.spotifyConnected());
                if (profileUser.spotifyThemeTrack() != null) {
                    z = true;
                }
                Completable a = this.f45841j.m61124a(j.mo11783e(z).mo11777a());
                C2668g.a(a, "editProfileOpenEvent\n            .execute(request)");
                RxJavaInteropExtKt.toV2Completable(a).b(this.f45845n).a(C16196g.f50423a, C16197h.f50424a);
            }
        }
    }

    /* renamed from: g */
    public final void m55287g() {
        RxJavaInteropExtKt.toV2Completable(this.f45839h.execute()).b(this.f45845n).a(C16194d.f50421a, C16195e.f50422a);
    }

    /* renamed from: h */
    public final void m55288h() {
        ProfileTabTarget profileTabTarget = this.f45832a;
        if (profileTabTarget == null) {
            C2668g.b("target");
        }
        profileTabTarget.navigateToCurrentUser();
    }

    /* renamed from: a */
    private final C14470b m55272a(C10044b c10044b, ProfileUser profileUser) {
        c10044b = this.f45836e.m55227a(profileUser, c10044b.a());
        this.f45834c = c10044b;
        C2668g.a(c10044b, "userInfoViewModel");
        return c10044b;
    }

    /* renamed from: k */
    private final void m55279k() {
        this.f45833b.add(this.f45838g.execute().a(C16200k.f50427a).b(this.f45845n).a(this.f45846o).a(new C16201l(this), C16202m.f50429a));
    }

    /* renamed from: a */
    private final void m55274a(Tutorial tutorial) {
        C3956a b = this.f45842k.execute(tutorial).b(this.f45845n);
        C2668g.a(b, "confirmTutorialsViewed\n ….subscribeOn(ioScheduler)");
        C15747d.m59002a(b, new ProfileTabPresenter$confirmTutorialsViewed$1(tutorial), null, 2, null);
    }

    /* renamed from: b */
    private final void m55276b(TutorialAction tutorialAction) {
        this.f45844m.a(new C9759a(tutorialAction, TutorialContext.HOMEPAGE, TutorialName.LOOPS_NEW_MEDIA_SELECTOR_TOOLTIP, TutorialType.TOOLTIP));
    }
}
