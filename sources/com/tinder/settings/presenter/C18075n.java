package com.tinder.settings.presenter;

import com.tinder.analytics.fireworks.C2630h;
import com.tinder.domain.common.model.Gender;
import com.tinder.domain.common.model.Gender.Value;
import com.tinder.domain.common.model.User;
import com.tinder.domain.profile.model.EditProfileUpdateStatus;
import com.tinder.domain.profile.model.GenderSettings;
import com.tinder.domain.profile.model.ProfileOption;
import com.tinder.domain.profile.model.ProfileOption.ShowGender;
import com.tinder.domain.profile.model.ProfileUserUpdateRequest;
import com.tinder.domain.profile.usecase.LoadProfileOptionData;
import com.tinder.domain.profile.usecase.UpdateProfile;
import com.tinder.etl.event.EtlEvent;
import com.tinder.etl.event.rx;
import com.tinder.etl.event.sa;
import com.tinder.etl.event.se;
import com.tinder.presenters.PresenterBase;
import com.tinder.settings.targets.MoreGenderTarget;
import io.reactivex.C3959e;
import io.reactivex.ObservableSource;
import io.reactivex.disposables.C17356a;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Action;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.p453a.p455b.C15674a;
import io.reactivex.schedulers.C15756a;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C17554o;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import p000a.p001a.C0001a;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001aB\u001f\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\b\u0010\f\u001a\u00020\rH\u0016J\u0006\u0010\u000e\u001a\u00020\rJ\u0006\u0010\u000f\u001a\u00020\rJ\u0006\u0010\u0010\u001a\u00020\rJ\u0016\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015J\b\u0010\u0016\u001a\u00020\rH\u0002J\u000e\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018H\u0002R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lcom/tinder/settings/presenter/MoreGenderPresenter;", "Lcom/tinder/presenters/PresenterBase;", "Lcom/tinder/settings/targets/MoreGenderTarget;", "fireworks", "Lcom/tinder/analytics/fireworks/Fireworks;", "loadProfileOption", "Lcom/tinder/domain/profile/usecase/LoadProfileOptionData;", "updateProfile", "Lcom/tinder/domain/profile/usecase/UpdateProfile;", "(Lcom/tinder/analytics/fireworks/Fireworks;Lcom/tinder/domain/profile/usecase/LoadProfileOptionData;Lcom/tinder/domain/profile/usecase/UpdateProfile;)V", "compositeDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "dropTarget", "", "fireViewEvent", "loadGender", "removeMoreGender", "saveGenderSetting", "gender", "Lcom/tinder/domain/common/model/Gender$Value;", "showGenderOnProfile", "", "sendGenderAnalytics", "viewModel", "Lio/reactivex/Observable;", "Lcom/tinder/settings/presenter/MoreGenderPresenter$ViewModel;", "ViewModel", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.settings.presenter.n */
public final class C18075n extends PresenterBase<MoreGenderTarget> {
    /* renamed from: a */
    private final C17356a f56125a = new C17356a();
    /* renamed from: b */
    private final C2630h f56126b;
    /* renamed from: c */
    private final LoadProfileOptionData f56127c;
    /* renamed from: d */
    private final UpdateProfile f56128d;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/tinder/settings/presenter/MoreGenderPresenter$ViewModel;", "", "gender", "Lcom/tinder/domain/common/model/Gender;", "showGenderOnProfile", "", "(Lcom/tinder/domain/common/model/Gender;Z)V", "getGender", "()Lcom/tinder/domain/common/model/Gender;", "getShowGenderOnProfile", "()Z", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.settings.presenter.n$a */
    private static final class C14898a {
        @NotNull
        /* renamed from: a */
        private final Gender f46595a;
        /* renamed from: b */
        private final boolean f46596b;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C14898a) {
                C14898a c14898a = (C14898a) obj;
                if (C2668g.a(this.f46595a, c14898a.f46595a)) {
                    if ((this.f46596b == c14898a.f46596b ? 1 : null) != null) {
                        return true;
                    }
                }
            }
            return false;
        }

        public int hashCode() {
            Gender gender = this.f46595a;
            int hashCode = (gender != null ? gender.hashCode() : 0) * 31;
            int i = this.f46596b;
            if (i != 0) {
                i = 1;
            }
            return hashCode + i;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ViewModel(gender=");
            stringBuilder.append(this.f46595a);
            stringBuilder.append(", showGenderOnProfile=");
            stringBuilder.append(this.f46596b);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }

        public C14898a(@NotNull Gender gender, boolean z) {
            C2668g.b(gender, "gender");
            this.f46595a = gender;
            this.f46596b = z;
        }

        @NotNull
        /* renamed from: a */
        public final Gender m56380a() {
            return this.f46595a;
        }

        /* renamed from: b */
        public final boolean m56381b() {
            return this.f46596b;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "viewModel", "Lcom/tinder/settings/presenter/MoreGenderPresenter$ViewModel;", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.settings.presenter.n$b */
    static final class C16658b<T> implements Consumer<C14898a> {
        /* renamed from: a */
        final /* synthetic */ C18075n f51576a;

        C16658b(C18075n c18075n) {
            this.f51576a = c18075n;
        }

        public /* synthetic */ void accept(Object obj) {
            m62146a((C14898a) obj);
        }

        /* renamed from: a */
        public final void m62146a(C14898a c14898a) {
            MoreGenderTarget moreGenderTarget = (MoreGenderTarget) this.f51576a.H();
            if (moreGenderTarget != null) {
                Object obj;
                moreGenderTarget.setShowGenderOnProfile(c14898a.m56381b());
                String customGender = c14898a.m56380a().customGender();
                CharSequence charSequence = customGender;
                if (charSequence != null) {
                    if (charSequence.length() != 0) {
                        obj = null;
                        if (obj == null) {
                            moreGenderTarget.showBinaryGenderView();
                            moreGenderTarget.hideIncludeMeInSearchView();
                            moreGenderTarget.hideMoreGenderView();
                            moreGenderTarget.setGender(c14898a.m56380a().value());
                        }
                        moreGenderTarget.showMoreGender(customGender);
                        moreGenderTarget.showIncludeMeInSearchView(c14898a.m56380a().value());
                        moreGenderTarget.hideBinaryGenderView();
                        return;
                    }
                }
                obj = 1;
                if (obj == null) {
                    moreGenderTarget.showMoreGender(customGender);
                    moreGenderTarget.showIncludeMeInSearchView(c14898a.m56380a().value());
                    moreGenderTarget.hideBinaryGenderView();
                    return;
                }
                moreGenderTarget.showBinaryGenderView();
                moreGenderTarget.hideIncludeMeInSearchView();
                moreGenderTarget.hideMoreGenderView();
                moreGenderTarget.setGender(c14898a.m56380a().value());
            }
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "error", "", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.settings.presenter.n$c */
    static final class C16659c<T> implements Consumer<Throwable> {
        /* renamed from: a */
        public static final C16659c f51577a = new C16659c();

        C16659c() {
        }

        public /* synthetic */ void accept(Object obj) {
            m62147a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m62147a(Throwable th) {
            C0001a.c(th, "Error loading gender", new Object[0]);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lio/reactivex/disposables/Disposable;", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.settings.presenter.n$d */
    static final class C16660d<T> implements Consumer<Disposable> {
        /* renamed from: a */
        final /* synthetic */ C18075n f51578a;

        C16660d(C18075n c18075n) {
            this.f51578a = c18075n;
        }

        public /* synthetic */ void accept(Object obj) {
            m62148a((Disposable) obj);
        }

        /* renamed from: a */
        public final void m62148a(Disposable disposable) {
            MoreGenderTarget moreGenderTarget = (MoreGenderTarget) this.f51578a.H();
            if (moreGenderTarget != null) {
                moreGenderTarget.showRemoveMoreGenderLoadingIndicator();
            }
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.settings.presenter.n$e */
    static final class C16661e implements Action {
        /* renamed from: a */
        final /* synthetic */ C18075n f51579a;

        C16661e(C18075n c18075n) {
            this.f51579a = c18075n;
        }

        public final void run() {
            MoreGenderTarget moreGenderTarget = (MoreGenderTarget) this.f51579a.H();
            if (moreGenderTarget != null) {
                moreGenderTarget.dismissRemoveMoreGenderLoadingIndicator();
            }
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/tinder/domain/profile/model/EditProfileUpdateStatus;", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.settings.presenter.n$f */
    static final class C16662f<T> implements Consumer<EditProfileUpdateStatus> {
        /* renamed from: a */
        final /* synthetic */ C18075n f51580a;

        C16662f(C18075n c18075n) {
            this.f51580a = c18075n;
        }

        public /* synthetic */ void accept(Object obj) {
            m62149a((EditProfileUpdateStatus) obj);
        }

        /* renamed from: a */
        public final void m62149a(EditProfileUpdateStatus editProfileUpdateStatus) {
            this.f51580a.m65591e();
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "error", "", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.settings.presenter.n$g */
    static final class C16663g<T> implements Consumer<Throwable> {
        /* renamed from: a */
        final /* synthetic */ C18075n f51581a;

        C16663g(C18075n c18075n) {
            this.f51581a = c18075n;
        }

        public /* synthetic */ void accept(Object obj) {
            m62150a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m62150a(Throwable th) {
            C0001a.b(th, "Error removing gender", new Object[0]);
            MoreGenderTarget moreGenderTarget = (MoreGenderTarget) this.f51581a.H();
            if (moreGenderTarget != null) {
                moreGenderTarget.showRemoveMoreGenderErrorMessage();
            }
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/tinder/domain/profile/model/EditProfileUpdateStatus;", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.settings.presenter.n$h */
    static final class C16664h<T> implements Consumer<EditProfileUpdateStatus> {
        /* renamed from: a */
        final /* synthetic */ C18075n f51582a;

        C16664h(C18075n c18075n) {
            this.f51582a = c18075n;
        }

        public /* synthetic */ void accept(Object obj) {
            m62151a((EditProfileUpdateStatus) obj);
        }

        /* renamed from: a */
        public final void m62151a(EditProfileUpdateStatus editProfileUpdateStatus) {
            this.f51582a.m65591e();
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "error", "", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.settings.presenter.n$i */
    static final class C16665i<T> implements Consumer<Throwable> {
        /* renamed from: a */
        public static final C16665i f51583a = new C16665i();

        C16665i() {
        }

        public /* synthetic */ void accept(Object obj) {
            m62152a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m62152a(Throwable th) {
            C0001a.b(th, "Error saving gender settings", new Object[0]);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "Lcom/tinder/etl/event/EtlEvent;", "it", "Lcom/tinder/settings/presenter/MoreGenderPresenter$ViewModel;", "apply"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.settings.presenter.n$j */
    static final class C16666j<T, R> implements Function<T, R> {
        /* renamed from: a */
        public static final C16666j f51584a = new C16666j();

        C16666j() {
        }

        public /* synthetic */ Object apply(Object obj) {
            return m62153a((C14898a) obj);
        }

        @NotNull
        /* renamed from: a */
        public final List<EtlEvent> m62153a(@NotNull C14898a c14898a) {
            C2668g.b(c14898a, "it");
            sa a = sa.a().a(c14898a.m56380a().customGender()).a(Integer.valueOf(c14898a.m56380a().value().id())).a(Boolean.valueOf(c14898a.m56381b())).a();
            c14898a = c14898a.m56381b() ? se.a().a(Boolean.valueOf(c14898a.m56381b())).a() : null;
            return C17554o.m64202e(a, (EtlEvent) c14898a);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "events", "", "Lcom/tinder/etl/event/EtlEvent;", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.settings.presenter.n$k */
    static final class C16667k<T> implements Consumer<List<? extends EtlEvent>> {
        /* renamed from: a */
        final /* synthetic */ C18075n f51585a;

        C16667k(C18075n c18075n) {
            this.f51585a = c18075n;
        }

        public /* synthetic */ void accept(Object obj) {
            m62154a((List) obj);
        }

        /* renamed from: a */
        public final void m62154a(List<? extends EtlEvent> list) {
            C2668g.a(list, "events");
            Iterable<EtlEvent> iterable = list;
            C2630h b = this.f51585a.f56126b;
            for (EtlEvent a : iterable) {
                b.a(a);
            }
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "error", "", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.settings.presenter.n$l */
    static final class C16668l<T> implements Consumer<Throwable> {
        /* renamed from: a */
        public static final C16668l f51586a = new C16668l();

        C16668l() {
        }

        public /* synthetic */ void accept(Object obj) {
            m62155a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m62155a(Throwable th) {
            C0001a.c(th, "Error tracking gender event", new Object[0]);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/tinder/domain/common/model/Gender;", "it", "Lcom/tinder/domain/common/model/User;", "apply"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.settings.presenter.n$m */
    static final class C16669m<T, R> implements Function<T, R> {
        /* renamed from: a */
        public static final C16669m f51587a = new C16669m();

        C16669m() {
        }

        public /* synthetic */ Object apply(Object obj) {
            return m62156a((User) obj);
        }

        @NotNull
        /* renamed from: a */
        public final Gender m62156a(@NotNull User user) {
            C2668g.b(user, "it");
            return user.gender();
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/tinder/domain/profile/model/GenderSettings;", "apply"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.settings.presenter.n$n */
    static final class C16670n<T, R> implements Function<T, R> {
        /* renamed from: a */
        public static final C16670n f51588a = new C16670n();

        C16670n() {
        }

        public /* synthetic */ Object apply(Object obj) {
            return Boolean.valueOf(m62157a((GenderSettings) obj));
        }

        /* renamed from: a */
        public final boolean m62157a(@NotNull GenderSettings genderSettings) {
            C2668g.b(genderSettings, "it");
            return genderSettings.getShowGenderOnProfile();
        }
    }

    @Inject
    public C18075n(@NotNull C2630h c2630h, @NotNull LoadProfileOptionData loadProfileOptionData, @NotNull UpdateProfile updateProfile) {
        C2668g.b(c2630h, "fireworks");
        C2668g.b(loadProfileOptionData, "loadProfileOption");
        C2668g.b(updateProfile, "updateProfile");
        this.f56126b = c2630h;
        this.f56127c = loadProfileOptionData;
        this.f56128d = updateProfile;
    }

    /* renamed from: a */
    public void m65593a() {
        super.a();
        this.f56125a.m63446a();
    }

    /* renamed from: b */
    public final void m65595b() {
        this.f56125a.add(m65592f().subscribeOn(C15756a.m59010b()).observeOn(C15674a.m58830a()).subscribe(new C16658b(this), C16659c.f51577a));
    }

    /* renamed from: c */
    public final void m65596c() {
        this.f56128d.execute(new ProfileUserUpdateRequest(null, null, "", null, 11, null)).b(C15756a.m59010b()).a(C15674a.m58830a()).a(new C16660d(this)).b(new C16661e(this)).a(new C16662f(this), new C16663g(this));
    }

    /* renamed from: a */
    public final void m65594a(@NotNull Value value, boolean z) {
        C2668g.b(value, "gender");
        this.f56128d.execute(new ProfileUserUpdateRequest(null, value, null, Boolean.valueOf(z), 5, null)).b(C15756a.m59010b()).a((Consumer) new C16664h(this), C16665i.f51583a);
    }

    /* renamed from: d */
    public final void m65597d() {
        this.f56126b.a(rx.a().a());
    }

    /* renamed from: e */
    private final void m65591e() {
        m65592f().firstOrError().e(C16666j.f51584a).b(C15756a.m59010b()).a(new C16667k(this), C16668l.f51586a);
    }

    /* renamed from: f */
    private final C3959e<C14898a> m65592f() {
        ObservableSource map = this.f56127c.execute(ProfileOption.User.INSTANCE).map(C16669m.f51587a);
        ObservableSource map2 = this.f56127c.execute(ShowGender.INSTANCE).map(C16670n.f51588a);
        Function2 function2 = MoreGenderPresenter$viewModel$3.f59402a;
        if (function2 != null) {
            function2 = new C16671o(function2);
        }
        C3959e<C14898a> combineLatest = C3959e.combineLatest(map, map2, (BiFunction) function2);
        C2668g.a(combineLatest, "Observable.combineLatest…on(::ViewModel)\n        )");
        return combineLatest;
    }
}
