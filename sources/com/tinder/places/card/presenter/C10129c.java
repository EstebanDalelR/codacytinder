package com.tinder.places.card.presenter;

import android.graphics.drawable.Drawable;
import com.tinder.deadshot.DeadshotTarget;
import com.tinder.deadshot.Drop;
import com.tinder.domain.profile.model.Tutorial.PlacesEditPlaceTooltip;
import com.tinder.domain.profile.model.TutorialViewStatus;
import com.tinder.domain.profile.usecase.CheckTutorialViewed;
import com.tinder.domain.profile.usecase.ConfirmTutorialsViewed;
import com.tinder.places.card.target.PlaceCardFrontTarget;
import com.tinder.viewmodel.C15424c;
import com.tinder.viewmodel.C15425d;
import io.reactivex.disposables.C17356a;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Predicate;
import io.reactivex.p453a.p455b.C15674a;
import io.reactivex.rxkotlin.C15745a;
import io.reactivex.schedulers.C15756a;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.joda.time.DateTime;
import org.joda.time.Days;
import org.joda.time.ReadableInstant;
import org.joda.time.base.BaseSingleFieldPeriod;
import p000a.p001a.C0001a;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0007\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u000e\u0010\u0011\u001a\u00020\u00122\u0006\u0010\t\u001a\u00020\nJ\u0014\u0010\u0013\u001a\u00020\u00122\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015J \u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u001cH\u0002J\b\u0010\u001d\u001a\u00020\u0012H\u0007J\u0010\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!H\u0002J\b\u0010\"\u001a\u00020\u0012H\u0007J\u0016\u0010#\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0019J\u0006\u0010$\u001a\u00020\u0012J\b\u0010%\u001a\u00020\u0012H\u0002J\u0006\u0010&\u001a\u00020\u0012J\u0010\u0010'\u001a\u00020\u00122\u0006\u0010\u001b\u001a\u00020\u001cH\u0002J\u000e\u0010(\u001a\u00020\u00122\u0006\u0010)\u001a\u00020*J\u0018\u0010+\u001a\u00020\u00122\u0006\u0010 \u001a\u00020!2\u0006\u0010,\u001a\u00020\u001fH\u0002J\u0010\u0010-\u001a\u00020\u00122\u0006\u0010.\u001a\u00020\u0016H\u0002J\u0015\u0010/\u001a\u00020\u00122\b\u00100\u001a\u0004\u0018\u00010\u0019¢\u0006\u0002\u00101J\u0006\u00102\u001a\u00020\u0012J\u000e\u00103\u001a\u00020\u00122\u0006\u0010,\u001a\u00020\u001fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u000b\u001a\u00020\f8\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u00064"}, d2 = {"Lcom/tinder/places/card/presenter/PlaceCardFrontPresenter;", "", "checkTutorialViewed", "Lcom/tinder/domain/profile/usecase/CheckTutorialViewed;", "confirmTutorialsViewed", "Lcom/tinder/domain/profile/usecase/ConfirmTutorialsViewed;", "(Lcom/tinder/domain/profile/usecase/CheckTutorialViewed;Lcom/tinder/domain/profile/usecase/ConfirmTutorialsViewed;)V", "compositeDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "placeCardFrontViewModel", "Lcom/tinder/viewmodel/PlaceCardFrontViewModel;", "target", "Lcom/tinder/places/card/target/PlaceCardFrontTarget;", "getTarget$Tinder_release", "()Lcom/tinder/places/card/target/PlaceCardFrontTarget;", "setTarget$Tinder_release", "(Lcom/tinder/places/card/target/PlaceCardFrontTarget;)V", "bind", "", "bindTeasers", "teasers", "", "", "bindVisitorInfo", "totalVisitors", "", "newVisitors", "backgroundDrawable", "Landroid/graphics/drawable/Drawable;", "clearDisposable", "determineIfExpiringSoon", "", "expirationTime", "Lorg/joda/time/DateTime;", "dismissTooltip", "displayVisitorInfo", "handleEntranceAnimationEnded", "markTutorialSeen", "resetTeasers", "setCardBackground", "setContentAlpha", "alphaToSet", "", "setIntroText", "viewed", "setPlaceName", "title", "setRecsErrorState", "code", "(Ljava/lang/Integer;)V", "setRecsLoadingState", "updateVisitedText", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.places.card.presenter.c */
public final class C10129c {
    @DeadshotTarget
    @NotNull
    /* renamed from: a */
    public PlaceCardFrontTarget f33116a;
    /* renamed from: b */
    private C15424c f33117b;
    /* renamed from: c */
    private final C17356a f33118c = new C17356a();
    /* renamed from: d */
    private final CheckTutorialViewed f33119d;
    /* renamed from: e */
    private final ConfirmTutorialsViewed f33120e;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/tinder/domain/profile/model/TutorialViewStatus;", "test"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.places.card.presenter.c$a */
    static final class C12301a<T> implements Predicate<TutorialViewStatus> {
        /* renamed from: a */
        public static final C12301a f39825a = new C12301a();

        C12301a() {
        }

        public /* synthetic */ boolean test(Object obj) {
            return m48570a((TutorialViewStatus) obj);
        }

        /* renamed from: a */
        public final boolean m48570a(@NotNull TutorialViewStatus tutorialViewStatus) {
            C2668g.b(tutorialViewStatus, "it");
            return tutorialViewStatus == TutorialViewStatus.UNSEEN ? true : null;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/tinder/domain/profile/model/TutorialViewStatus;", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.places.card.presenter.c$b */
    static final class C12302b<T> implements Consumer<TutorialViewStatus> {
        /* renamed from: a */
        final /* synthetic */ C10129c f39826a;

        C12302b(C10129c c10129c) {
            this.f39826a = c10129c;
        }

        public /* synthetic */ void accept(Object obj) {
            m48571a((TutorialViewStatus) obj);
        }

        /* renamed from: a */
        public final void m48571a(TutorialViewStatus tutorialViewStatus) {
            this.f39826a.m41419a().showTutorialTooltip();
            this.f39826a.m41418g();
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.places.card.presenter.c$c */
    static final class C12303c<T> implements Consumer<Throwable> {
        /* renamed from: a */
        public static final C12303c f39827a = new C12303c();

        C12303c() {
        }

        public /* synthetic */ void accept(Object obj) {
            m48572a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m48572a(Throwable th) {
            C0001a.c(th, "Failed to check for place card tooltip conditions", new Object[0]);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.places.card.presenter.c$d */
    static final class C12304d implements Action {
        /* renamed from: a */
        public static final C12304d f39828a = new C12304d();

        C12304d() {
        }

        public final void run() {
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.places.card.presenter.c$e */
    static final class C12305e<T> implements Consumer<Throwable> {
        /* renamed from: a */
        public static final C12305e f39829a = new C12305e();

        C12305e() {
        }

        public /* synthetic */ void accept(Object obj) {
            m48573a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m48573a(Throwable th) {
            C0001a.c(th, "Error marking edit place tooltip tutorial as seen", new Object[0]);
        }
    }

    @Inject
    public C10129c(@NotNull CheckTutorialViewed checkTutorialViewed, @NotNull ConfirmTutorialsViewed confirmTutorialsViewed) {
        C2668g.b(checkTutorialViewed, "checkTutorialViewed");
        C2668g.b(confirmTutorialsViewed, "confirmTutorialsViewed");
        this.f33119d = checkTutorialViewed;
        this.f33120e = confirmTutorialsViewed;
    }

    @NotNull
    /* renamed from: a */
    public final PlaceCardFrontTarget m41419a() {
        PlaceCardFrontTarget placeCardFrontTarget = this.f33116a;
        if (placeCardFrontTarget == null) {
            C2668g.b("target");
        }
        return placeCardFrontTarget;
    }

    /* renamed from: a */
    public final void m41422a(@NotNull C15424c c15424c) {
        C2668g.b(c15424c, "placeCardFrontViewModel");
        this.f33117b = c15424c;
        m41415a(c15424c.a());
        m41413a(c15424c.d());
        m41416a(c15424c.b(), c15424c.c());
        List g = c15424c.g();
        if (g != null) {
            m41424a(g);
        }
        Integer e = c15424c.e();
        if (e != null) {
            int intValue = e.intValue();
            Integer f = c15424c.f();
            m41412a(intValue, f != null ? f.intValue() : 0, c15424c.d());
        }
    }

    @Drop
    /* renamed from: b */
    public final void m41426b() {
        this.f33118c.a();
    }

    /* renamed from: a */
    public final void m41421a(int i, int i2) {
        C15424c c15424c = this.f33117b;
        if (c15424c != null) {
            this.f33117b = C15424c.a(c15424c, null, null, false, null, Integer.valueOf(i), Integer.valueOf(i2), null, 79, null);
            m41412a(i, i2, c15424c.d());
        }
    }

    /* renamed from: a */
    public final void m41420a(float f) {
        PlaceCardFrontTarget placeCardFrontTarget = this.f33116a;
        if (placeCardFrontTarget == null) {
            C2668g.b("target");
        }
        placeCardFrontTarget.setContentAlpha(f);
    }

    /* renamed from: c */
    public final void m41427c() {
        PlaceCardFrontTarget placeCardFrontTarget = this.f33116a;
        if (placeCardFrontTarget == null) {
            C2668g.b("target");
        }
        placeCardFrontTarget.resetTeaserImageViews();
    }

    /* renamed from: a */
    public final void m41425a(boolean z) {
        C15424c c15424c = this.f33117b;
        if (c15424c != null) {
            this.f33117b = C15424c.a(c15424c, null, null, z, null, null, null, null, 123, null);
            m41416a(c15424c.b(), z);
        }
    }

    /* renamed from: a */
    public final void m41423a(@Nullable Integer num) {
        PlaceCardFrontTarget placeCardFrontTarget = this.f33116a;
        if (placeCardFrontTarget == null) {
            C2668g.b("target");
        }
        placeCardFrontTarget.showRecsErrorText(num);
        num = this.f33116a;
        if (num == null) {
            C2668g.b("target");
        }
        num.showErrorButton();
        num = this.f33116a;
        if (num == null) {
            C2668g.b("target");
        }
        num.stopShimmer();
    }

    /* renamed from: d */
    public final void m41428d() {
        m41427c();
        PlaceCardFrontTarget placeCardFrontTarget = this.f33116a;
        if (placeCardFrontTarget == null) {
            C2668g.b("target");
        }
        placeCardFrontTarget.hideRecsErrorText();
        placeCardFrontTarget = this.f33116a;
        if (placeCardFrontTarget == null) {
            C2668g.b("target");
        }
        placeCardFrontTarget.showNoVisitorButton();
        placeCardFrontTarget = this.f33116a;
        if (placeCardFrontTarget == null) {
            C2668g.b("target");
        }
        placeCardFrontTarget.startShimmer();
    }

    /* renamed from: e */
    public final void m41429e() {
        Disposable a = this.f33119d.execute(PlacesEditPlaceTooltip.INSTANCE).a(C12301a.f39825a).b(C15756a.b()).a(C15674a.a()).a(new C12302b(this), C12303c.f39827a);
        C2668g.a(a, "checkTutorialViewed.exec…nditions\")\n            })");
        C15745a.a(a, this.f33118c);
    }

    @Drop
    /* renamed from: f */
    public final void m41430f() {
        PlaceCardFrontTarget placeCardFrontTarget = this.f33116a;
        if (placeCardFrontTarget == null) {
            C2668g.b("target");
        }
        placeCardFrontTarget.dismissTooltipIfPresent();
    }

    /* renamed from: a */
    public final void m41424a(@NotNull List<String> list) {
        C2668g.b(list, "teasers");
        C15424c c15424c = this.f33117b;
        if (c15424c != null) {
            this.f33117b = C15424c.a(c15424c, null, null, false, null, null, null, list, 63, null);
        }
        c15424c = this.f33117b;
        C15425d c15425d = new C15425d(list, c15424c != null ? c15424c.d() : null);
        list = this.f33116a;
        if (list == null) {
            C2668g.b("target");
        }
        list.hideRecsErrorText();
        list = this.f33116a;
        if (list == null) {
            C2668g.b("target");
        }
        list.stopShimmer();
        list = this.f33116a;
        if (list == null) {
            C2668g.b("target");
        }
        list.bindTeasers(c15425d);
    }

    /* renamed from: a */
    private final void m41415a(String str) {
        PlaceCardFrontTarget placeCardFrontTarget = this.f33116a;
        if (placeCardFrontTarget == null) {
            C2668g.b("target");
        }
        placeCardFrontTarget.setPlaceName(str);
    }

    /* renamed from: a */
    private final void m41413a(Drawable drawable) {
        PlaceCardFrontTarget placeCardFrontTarget = this.f33116a;
        if (placeCardFrontTarget == null) {
            C2668g.b("target");
        }
        placeCardFrontTarget.setColor(drawable);
    }

    /* renamed from: a */
    private final void m41416a(DateTime dateTime, boolean z) {
        if (m41417a(dateTime) != null) {
            dateTime = this.f33116a;
            if (dateTime == null) {
                C2668g.b("target");
            }
            dateTime.setExpiringTitle();
        } else if (z) {
            dateTime = this.f33116a;
            if (dateTime == null) {
                C2668g.b("target");
            }
            dateTime.setRegularTitle();
        } else {
            dateTime = this.f33116a;
            if (dateTime == null) {
                C2668g.b("target");
            }
            dateTime.setNewPlaceTitle();
        }
    }

    /* renamed from: a */
    private final boolean m41417a(DateTime dateTime) {
        return Days.a((ReadableInstant) DateTime.a(), (ReadableInstant) dateTime).a((BaseSingleFieldPeriod) C10130d.f33121a) <= null ? true : null;
    }

    /* renamed from: a */
    private final void m41412a(int i, int i2, Drawable drawable) {
        PlaceCardFrontTarget placeCardFrontTarget = this.f33116a;
        if (placeCardFrontTarget == null) {
            C2668g.b("target");
        }
        placeCardFrontTarget.setVisitorInfo(i, i2, drawable);
    }

    /* renamed from: g */
    private final void m41418g() {
        this.f33120e.execute(PlacesEditPlaceTooltip.INSTANCE).b(C15756a.b()).a(C12304d.f39828a, C12305e.f39829a);
    }
}
