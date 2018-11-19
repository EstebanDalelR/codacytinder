package com.tinder.bitmoji.presenter;

import com.tinder.bitmoji.C10378h;
import com.tinder.bitmoji.analytics.AppTutorialEventFactory.TutorialAction;
import com.tinder.bitmoji.analytics.AppTutorialEventFactory.TutorialContext;
import com.tinder.bitmoji.analytics.AppTutorialEventFactory.TutorialName;
import com.tinder.bitmoji.analytics.AppTutorialEventFactory.TutorialType;
import com.tinder.bitmoji.analytics.C10370a;
import com.tinder.bitmoji.analytics.C10370a.C8322a;
import com.tinder.bitmoji.target.BitmojiIntroTarget;
import com.tinder.domain.common.model.Gender;
import com.tinder.domain.common.model.Gender.Value;
import com.tinder.domain.common.model.User;
import com.tinder.domain.injection.qualifiers.IoScheduler;
import com.tinder.domain.profile.model.ProfileOption;
import com.tinder.domain.profile.usecase.GetProfileOptionData;
import com.tinder.injection.qualifiers.MainThreadScheduler;
import io.reactivex.C15679f;
import io.reactivex.C3958c;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import p000a.p001a.C0001a;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B3\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0001\u0010\b\u001a\u00020\t\u0012\b\b\u0001\u0010\n\u001a\u00020\t¢\u0006\u0002\u0010\u000bJ\u0006\u0010\u0002\u001a\u00020\u0010J\u0006\u0010\u0011\u001a\u00020\u0010J\b\u0010\u0012\u001a\u00020\u0010H\u0002J\u0006\u0010\u0013\u001a\u00020\u0010J\u0006\u0010\u0014\u001a\u00020\u0010J\u0006\u0010\u0015\u001a\u00020\u0010J\u0010\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J\b\u0010\u0019\u001a\u00020\u0010H\u0002J\u000e\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\u000fR\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u000e¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lcom/tinder/bitmoji/presenter/BitmojiIntroPresenter;", "", "connectBitmoji", "Lcom/tinder/bitmoji/ConnectBitmoji;", "getProfileOptionData", "Lcom/tinder/domain/profile/usecase/GetProfileOptionData;", "addAppTutorialEvent", "Lcom/tinder/bitmoji/analytics/AddAppTutorialEvent;", "ioScheduler", "Lio/reactivex/Scheduler;", "mainThreadScheduler", "(Lcom/tinder/bitmoji/ConnectBitmoji;Lcom/tinder/domain/profile/usecase/GetProfileOptionData;Lcom/tinder/bitmoji/analytics/AddAppTutorialEvent;Lio/reactivex/Scheduler;Lio/reactivex/Scheduler;)V", "disposable", "Lio/reactivex/disposables/Disposable;", "target", "Lcom/tinder/bitmoji/target/BitmojiIntroTarget;", "", "dropTarget", "loadGenderSpecificViews", "onCancel", "onClick", "onShow", "sendAppTutorialEvent", "action", "Lcom/tinder/bitmoji/analytics/AppTutorialEventFactory$TutorialAction;", "startAnimations", "takeTarget", "bitmoji_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.bitmoji.presenter.c */
public final class C8330c {
    /* renamed from: a */
    private Disposable f29617a;
    /* renamed from: b */
    private BitmojiIntroTarget f29618b;
    /* renamed from: c */
    private final C10378h f29619c;
    /* renamed from: d */
    private final GetProfileOptionData f29620d;
    /* renamed from: e */
    private final C10370a f29621e;
    /* renamed from: f */
    private final C15679f f29622f;
    /* renamed from: g */
    private final C15679f f29623g;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/tinder/domain/common/model/User;", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.bitmoji.presenter.c$a */
    static final class C10388a<T> implements Consumer<User> {
        /* renamed from: a */
        final /* synthetic */ C8330c f33872a;

        C10388a(C8330c c8330c) {
            this.f33872a = c8330c;
        }

        public /* synthetic */ void accept(Object obj) {
            m42211a((User) obj);
        }

        /* renamed from: a */
        public final void m42211a(User user) {
            Value value;
            BitmojiIntroTarget a;
            if (user != null) {
                Gender gender = user.gender();
                if (gender != null) {
                    value = gender.value();
                    if (value != null) {
                        switch (C8331d.f29624a[value.ordinal()]) {
                            case 1:
                                a = this.f33872a.f29618b;
                                if (a != null) {
                                    a.showFemaleIcons();
                                    break;
                                }
                                break;
                            case 2:
                                a = this.f33872a.f29618b;
                                if (a != null) {
                                    a.showMaleIcons();
                                    break;
                                }
                                break;
                            default:
                                a = this.f33872a.f29618b;
                                if (a != null) {
                                    a.showFemaleIcons();
                                    break;
                                }
                                break;
                        }
                        this.f33872a.m35449g();
                        C0001a.b("Got user gender %s", new Object[]{user});
                    }
                }
            }
            value = Value.UNKNOWN;
            switch (C8331d.f29624a[value.ordinal()]) {
                case 1:
                    a = this.f33872a.f29618b;
                    if (a != null) {
                        a.showFemaleIcons();
                        break;
                    }
                    break;
                case 2:
                    a = this.f33872a.f29618b;
                    if (a != null) {
                        a.showMaleIcons();
                        break;
                    }
                    break;
                default:
                    a = this.f33872a.f29618b;
                    if (a != null) {
                        a.showFemaleIcons();
                        break;
                    }
                    break;
            }
            this.f33872a.m35449g();
            C0001a.b("Got user gender %s", new Object[]{user});
        }
    }

    @Inject
    public C8330c(@NotNull C10378h c10378h, @NotNull GetProfileOptionData getProfileOptionData, @NotNull C10370a c10370a, @NotNull @IoScheduler C15679f c15679f, @NotNull @MainThreadScheduler C15679f c15679f2) {
        C2668g.b(c10378h, "connectBitmoji");
        C2668g.b(getProfileOptionData, "getProfileOptionData");
        C2668g.b(c10370a, "addAppTutorialEvent");
        C2668g.b(c15679f, "ioScheduler");
        C2668g.b(c15679f2, "mainThreadScheduler");
        this.f29619c = c10378h;
        this.f29620d = getProfileOptionData;
        this.f29621e = c10370a;
        this.f29622f = c15679f;
        this.f29623g = c15679f2;
    }

    /* renamed from: a */
    public final void m35451a(@NotNull BitmojiIntroTarget bitmojiIntroTarget) {
        C2668g.b(bitmojiIntroTarget, "target");
        this.f29618b = bitmojiIntroTarget;
        m35448f();
    }

    /* renamed from: a */
    public final void m35450a() {
        this.f29618b = (BitmojiIntroTarget) null;
        Disposable disposable = this.f29617a;
        if (disposable != null) {
            disposable.dispose();
        }
    }

    /* renamed from: b */
    public final void m35452b() {
        this.f29619c.execute();
    }

    /* renamed from: f */
    private final void m35448f() {
        C3958c a = this.f29620d.execute(ProfileOption.User.INSTANCE).b(this.f29622f).a(this.f29623g);
        Consumer c10388a = new C10388a(this);
        Function1 function1 = BitmojiIntroPresenter$loadGenderSpecificViews$2.f45100a;
        if (function1 != null) {
            function1 = new C10389e(function1);
        }
        this.f29617a = a.a(c10388a, (Consumer) function1);
    }

    /* renamed from: g */
    private final void m35449g() {
        BitmojiIntroTarget bitmojiIntroTarget = this.f29618b;
        if (bitmojiIntroTarget != null) {
            bitmojiIntroTarget.startAnimations();
        }
    }

    /* renamed from: c */
    public final void m35453c() {
        m35446a(TutorialAction.SHOW);
    }

    /* renamed from: d */
    public final void m35454d() {
        m35446a(TutorialAction.TAP);
    }

    /* renamed from: e */
    public final void m35455e() {
        m35446a(TutorialAction.DISMISS);
    }

    /* renamed from: a */
    private final void m35446a(TutorialAction tutorialAction) {
        this.f29621e.m42202a(new C8322a(tutorialAction, TutorialContext.RECS, TutorialName.BITMOJI_INTRO, TutorialType.MODAL));
    }
}
