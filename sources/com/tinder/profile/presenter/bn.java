package com.tinder.profile.presenter;

import com.tinder.deadshot.DeadshotTarget;
import com.tinder.deadshot.Drop;
import com.tinder.deadshot.Take;
import com.tinder.domain.tinderplus.LikeStatus;
import com.tinder.domain.utils.RxJavaInteropExtKt;
import com.tinder.profile.target.ProfileGamepadTarget;
import com.tinder.tinderplus.provider.LikeStatusProvider;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.p453a.p455b.C15674a;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import p000a.p001a.C0001a;
import rx.Observable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\r\u001a\u00020\u000eH\u0007J\b\u0010\u000f\u001a\u00020\u000eH\u0007R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u0007\u001a\u00020\b8\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006\u0010"}, d2 = {"Lcom/tinder/profile/presenter/TappyProfileGamePadPresenter;", "", "listStatusProvider", "Lcom/tinder/tinderplus/provider/LikeStatusProvider;", "(Lcom/tinder/tinderplus/provider/LikeStatusProvider;)V", "disposable", "Lio/reactivex/disposables/Disposable;", "target", "Lcom/tinder/profile/target/ProfileGamepadTarget;", "getTarget$Tinder_release", "()Lcom/tinder/profile/target/ProfileGamepadTarget;", "setTarget$Tinder_release", "(Lcom/tinder/profile/target/ProfileGamepadTarget;)V", "observeLikeStateUpdates", "", "stopObservingLikeStatusUpdates", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public final class bn {
    @DeadshotTarget
    @NotNull
    /* renamed from: a */
    public ProfileGamepadTarget f45680a;
    /* renamed from: b */
    private Disposable f45681b;
    /* renamed from: c */
    private final LikeStatusProvider f45682c;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/tinder/domain/tinderplus/LikeStatus;", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.profile.presenter.bn$a */
    static final class C16111a<T> implements Consumer<LikeStatus> {
        /* renamed from: a */
        final /* synthetic */ bn f50182a;

        C16111a(bn bnVar) {
            this.f50182a = bnVar;
        }

        public /* synthetic */ void accept(Object obj) {
            m61000a((LikeStatus) obj);
        }

        /* renamed from: a */
        public final void m61000a(LikeStatus likeStatus) {
            this.f50182a.m55041a().setLikePercentRemaining(likeStatus.likesPercentRemaining());
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "t", "", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.profile.presenter.bn$b */
    static final class C16112b<T> implements Consumer<Throwable> {
        /* renamed from: a */
        public static final C16112b f50183a = new C16112b();

        C16112b() {
        }

        public /* synthetic */ void accept(Object obj) {
            m61001a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m61001a(Throwable th) {
            C0001a.c(th, "Error observing likeStatusUpdates", new Object[0]);
        }
    }

    @Inject
    public bn(@NotNull LikeStatusProvider likeStatusProvider) {
        C2668g.b(likeStatusProvider, "listStatusProvider");
        this.f45682c = likeStatusProvider;
    }

    @NotNull
    /* renamed from: a */
    public final ProfileGamepadTarget m55041a() {
        ProfileGamepadTarget profileGamepadTarget = this.f45680a;
        if (profileGamepadTarget == null) {
            C2668g.b("target");
        }
        return profileGamepadTarget;
    }

    @Take
    /* renamed from: b */
    public final void m55042b() {
        Observable observeLikeStatusUpdates = this.f45682c.observeLikeStatusUpdates();
        C2668g.a(observeLikeStatusUpdates, "listStatusProvider.observeLikeStatusUpdates()");
        this.f45681b = RxJavaInteropExtKt.toV2Observable(observeLikeStatusUpdates).observeOn(C15674a.m58830a()).subscribe(new C16111a(this), C16112b.f50183a);
    }

    @Drop
    /* renamed from: c */
    public final void m55043c() {
        Disposable disposable = this.f45681b;
        if (disposable != null) {
            disposable.dispose();
        }
    }
}
