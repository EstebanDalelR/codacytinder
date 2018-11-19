package com.tinder.places.card.presenter;

import android.support.annotation.UiThread;
import com.tinder.api.ManagerWebServices;
import com.tinder.data.places.provider.PlacesConfigExpansionProvider;
import com.tinder.deadshot.DeadshotTarget;
import com.tinder.deadshot.Drop;
import com.tinder.deadshot.Take;
import com.tinder.domain.injection.qualifiers.ComputationScheduler;
import com.tinder.domain.places.PlacesRepository.PlaceVisitorInfo;
import com.tinder.domain.places.model.PlacesConfigExpansion;
import com.tinder.domain.places.model.PlacesConfigExpansion.Size;
import com.tinder.domain.recs.RecsEngine;
import com.tinder.domain.recs.RecsEngineRegistry;
import com.tinder.domain.recs.model.RecSource;
import com.tinder.domain.recs.model.RecsLoadingStatus;
import com.tinder.domain.recs.model.RecsLoadingStatus.NoMoreRecs;
import com.tinder.domain.recs.model.RecsUpdate;
import com.tinder.places.analytics.C10117g;
import com.tinder.places.p311f.C12339d;
import com.tinder.places.recs.target.PlaceRecsContainerTarget;
import com.tinder.places.viewmodel.PlaceColor;
import com.tinder.places.viewmodel.PlaceColor.C14345a;
import com.tinder.places.viewmodel.PlaceColor.C14346b;
import com.tinder.utils.RxUtils;
import com.tinder.views.grid.presenter.C15460a;
import java.util.concurrent.TimeUnit;
import javax.inject.Inject;
import kotlin.C18451c;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C15825i;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import p000a.p001a.C0001a;
import rx.C2671a;
import rx.Observable;
import rx.functions.Action1;
import rx.p494a.p496b.C19397a;
import rx.p500e.C19573b;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B9\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0002\u0010\u000eJ\b\u00100\u001a\u000201H\u0002J\u0018\u00102\u001a\u0002012\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u00103\u001a\u00020\u001cH\u0002J\n\u00104\u001a\u0004\u0018\u00010\u0010H\u0002J\n\u00105\u001a\u0004\u0018\u00010\u0010H\u0002J\n\u00106\u001a\u0004\u0018\u00010\u0010H\u0002J\u000f\u00107\u001a\u0004\u0018\u00010\u0013H\u0002¢\u0006\u0002\u00108J\n\u00109\u001a\u0004\u0018\u00010\u0010H\u0002J\u0018\u0010:\u001a\u0002012\u0006\u0010;\u001a\u00020<2\u0006\u0010=\u001a\u00020>H\u0017J\u0006\u0010?\u001a\u000201J\u000e\u0010@\u001a\u0002012\u0006\u0010A\u001a\u00020\u0019J\u0006\u0010B\u001a\u000201J\u0006\u0010C\u001a\u000201J\u000e\u0010D\u001a\u0002012\u0006\u0010E\u001a\u00020FJ\b\u0010G\u001a\u000201H\u0007J\b\u0010H\u001a\u000201H\u0007J\u000e\u0010I\u001a\u0002012\u0006\u0010J\u001a\u00020\u0010J\u000e\u0010K\u001a\u0002012\u0006\u0010J\u001a\u00020\u0010J\u000e\u0010L\u001a\u0002012\u0006\u0010M\u001a\u00020\u0010J\u000e\u0010N\u001a\u0002012\u0006\u0010O\u001a\u00020\u0013J\u000e\u0010P\u001a\u0002012\u0006\u0010J\u001a\u00020\u0010R\u000e\u0010\f\u001a\u00020\rX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0010X\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u000e¢\u0006\u0004\n\u0002\u0010\u0014R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0010X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0019X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u001d\u001a\u00020\u001eX.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u001d\u0010#\u001a\u0004\u0018\u00010$8BX\u0002¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b%\u0010&R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010)\u001a\u00020\u0019X\u000e¢\u0006\u0002\n\u0000R\u001e\u0010*\u001a\u00020+8\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/¨\u0006Q"}, d2 = {"Lcom/tinder/places/card/presenter/PlacesCardExpandedPresenter;", "Lcom/tinder/views/grid/presenter/RecsGridContainerPresenter;", "recSource", "Lcom/tinder/domain/recs/model/RecSource;", "recsEngineRegistry", "Lcom/tinder/domain/recs/RecsEngineRegistry;", "computationScheduler", "Lrx/Scheduler;", "expansionConfigProvider", "Lcom/tinder/data/places/provider/PlacesConfigExpansionProvider;", "getPlaceVisitorInfo", "Lcom/tinder/places/usecase/GetPlaceVisitorInfo;", "addPlacesViewDetailEvent", "Lcom/tinder/places/analytics/AddPlacesViewDetailEvent;", "(Lcom/tinder/domain/recs/model/RecSource;Lcom/tinder/domain/recs/RecsEngineRegistry;Lrx/Scheduler;Lcom/tinder/data/places/provider/PlacesConfigExpansionProvider;Lcom/tinder/places/usecase/GetPlaceVisitorInfo;Lcom/tinder/places/analytics/AddPlacesViewDetailEvent;)V", "carouselIntroSize", "Lcom/tinder/domain/places/model/PlacesConfigExpansion$Size;", "carouselTeaserSize", "carouselTitleFontSize", "", "Ljava/lang/Float;", "carouselTitleSize", "compositeSubscription", "Lrx/subscriptions/CompositeSubscription;", "firedPlacesViewDetailEvent", "", "isContracting", "latestVisitorsInfo", "Lcom/tinder/domain/places/PlacesRepository$PlaceVisitorInfo;", "placeId", "", "getPlaceId", "()Ljava/lang/String;", "setPlaceId", "(Ljava/lang/String;)V", "recsEngine", "Lcom/tinder/domain/recs/RecsEngine;", "getRecsEngine", "()Lcom/tinder/domain/recs/RecsEngine;", "recsEngine$delegate", "Lkotlin/Lazy;", "shouldMeasureViewsPositions", "target", "Lcom/tinder/places/recs/target/PlaceRecsContainerTarget;", "getTarget$Tinder_release", "()Lcom/tinder/places/recs/target/PlaceRecsContainerTarget;", "setTarget$Tinder_release", "(Lcom/tinder/places/recs/target/PlaceRecsContainerTarget;)V", "delayedShrink", "", "firePlacesViewDetailEventOnce", "info", "getInitialSize", "getIntroSize", "getTeaserStartSize", "getTitleFontSize", "()Ljava/lang/Float;", "getTitleSize", "handleRecsEngineUpdate", "loadingStatus", "Lcom/tinder/domain/recs/model/RecsLoadingStatus;", "recsUpdate", "Lcom/tinder/domain/recs/model/RecsUpdate;", "handleTeaserThumbnailsCreated", "onBackPressed", "alreadyHandled", "onLayout", "shrink", "startMeasure", "nonAdjustedConfig", "Lcom/tinder/domain/places/model/PlacesConfigExpansion;", "subscribe", "unsubscribe", "updateInitialMeasurement", "adjusted", "updateIntroMeasurement", "updateTeaserMeasurement", "size", "updateTitleFontMeasurement", "titleFontSize", "updateTitleMeasurement", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.places.card.presenter.h */
public final class C12306h extends C15460a {
    /* renamed from: a */
    static final /* synthetic */ KProperty[] f39830a = new KProperty[]{C15825i.a(new PropertyReference1Impl(C15825i.a(C12306h.class), "recsEngine", "getRecsEngine()Lcom/tinder/domain/recs/RecsEngine;"))};
    @DeadshotTarget
    @NotNull
    /* renamed from: b */
    public PlaceRecsContainerTarget f39831b;
    @NotNull
    /* renamed from: c */
    public String f39832c;
    /* renamed from: d */
    private final C19573b f39833d = new C19573b();
    /* renamed from: e */
    private final Lazy f39834e = C18451c.a((Function0) new PlacesCardExpandedPresenter$recsEngine$2(this));
    /* renamed from: f */
    private boolean f39835f;
    /* renamed from: g */
    private PlaceVisitorInfo f39836g;
    /* renamed from: h */
    private boolean f39837h;
    /* renamed from: i */
    private Size f39838i;
    /* renamed from: j */
    private Size f39839j;
    /* renamed from: k */
    private Size f39840k;
    /* renamed from: l */
    private Float f39841l;
    /* renamed from: m */
    private boolean f39842m;
    /* renamed from: n */
    private final RecSource f39843n;
    /* renamed from: o */
    private final RecsEngineRegistry f39844o;
    /* renamed from: p */
    private final C2671a f39845p;
    /* renamed from: q */
    private final PlacesConfigExpansionProvider f39846q;
    /* renamed from: r */
    private final C12339d f39847r;
    /* renamed from: s */
    private final C10117g f39848s;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "call", "(Ljava/lang/Long;)V"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.places.card.presenter.h$a */
    static final class C14177a<T> implements Action1<Long> {
        /* renamed from: a */
        final /* synthetic */ C12306h f44940a;

        C14177a(C12306h c12306h) {
            this.f44940a = c12306h;
        }

        public /* synthetic */ void call(Object obj) {
            m53861a((Long) obj);
        }

        /* renamed from: a */
        public final void m53861a(Long l) {
            this.f44940a.m48599e();
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "info", "Lcom/tinder/domain/places/PlacesRepository$PlaceVisitorInfo;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.places.card.presenter.h$b */
    static final class C14178b<T> implements Action1<PlaceVisitorInfo> {
        /* renamed from: a */
        final /* synthetic */ C12306h f44941a;

        C14178b(C12306h c12306h) {
            this.f44941a = c12306h;
        }

        public /* synthetic */ void call(Object obj) {
            m53862a((PlaceVisitorInfo) obj);
        }

        /* renamed from: a */
        public final void m53862a(PlaceVisitorInfo placeVisitorInfo) {
            this.f44941a.f39836g = placeVisitorInfo;
            this.f44941a.m48586a().setTotalVisitorsCount(placeVisitorInfo.getTotalVisitors());
            C12306h c12306h = this.f44941a;
            String b = this.f44941a.m48593b();
            C2668g.a(placeVisitorInfo, "info");
            c12306h.m48577a(b, placeVisitorInfo);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.places.card.presenter.h$c */
    static final class C14179c<T> implements Action1<Throwable> {
        /* renamed from: a */
        public static final C14179c f44942a = new C14179c();

        C14179c() {
        }

        public /* synthetic */ void call(Object obj) {
            m53863a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m53863a(Throwable th) {
            C0001a.c(th, "getPlaceVisitorInfo failed", new Object[0]);
        }
    }

    /* renamed from: h */
    private final RecsEngine m48579h() {
        Lazy lazy = this.f39834e;
        KProperty kProperty = f39830a[0];
        return (RecsEngine) lazy.getValue();
    }

    @Inject
    public C12306h(@NotNull RecSource recSource, @NotNull RecsEngineRegistry recsEngineRegistry, @NotNull @ComputationScheduler C2671a c2671a, @NotNull PlacesConfigExpansionProvider placesConfigExpansionProvider, @NotNull C12339d c12339d, @NotNull C10117g c10117g) {
        C2668g.b(recSource, "recSource");
        C2668g.b(recsEngineRegistry, "recsEngineRegistry");
        C2668g.b(c2671a, "computationScheduler");
        C2668g.b(placesConfigExpansionProvider, "expansionConfigProvider");
        C2668g.b(c12339d, "getPlaceVisitorInfo");
        C2668g.b(c10117g, "addPlacesViewDetailEvent");
        this.f39843n = recSource;
        this.f39844o = recsEngineRegistry;
        this.f39845p = c2671a;
        this.f39846q = placesConfigExpansionProvider;
        this.f39847r = c12339d;
        this.f39848s = c10117g;
    }

    @NotNull
    /* renamed from: a */
    public final PlaceRecsContainerTarget m48586a() {
        PlaceRecsContainerTarget placeRecsContainerTarget = this.f39831b;
        if (placeRecsContainerTarget == null) {
            C2668g.b("target");
        }
        return placeRecsContainerTarget;
    }

    /* renamed from: a */
    public final void m48591a(@NotNull String str) {
        C2668g.b(str, "<set-?>");
        this.f39832c = str;
    }

    @NotNull
    /* renamed from: b */
    public final String m48593b() {
        String str = this.f39832c;
        if (str == null) {
            C2668g.b("placeId");
        }
        return str;
    }

    @Take
    /* renamed from: c */
    public final void m48595c() {
        RecsEngine h = m48579h();
        if (h != null) {
            this.f39833d.a(a(h));
        } else {
            m48599e();
        }
        C12339d c12339d = this.f39847r;
        String str = this.f39832c;
        if (str == null) {
            C2668g.b("placeId");
        }
        this.f39833d.a(c12339d.m48722a(str).a(RxUtils.a()).a(new C14178b(this), C14179c.f44942a));
    }

    @Drop
    /* renamed from: d */
    public final void m48597d() {
        this.f39833d.a();
    }

    @UiThread
    /* renamed from: a */
    public void m48590a(@NotNull RecsLoadingStatus recsLoadingStatus, @NotNull RecsUpdate recsUpdate) {
        C2668g.b(recsLoadingStatus, "loadingStatus");
        C2668g.b(recsUpdate, "recsUpdate");
        if (C2668g.a(recsLoadingStatus, NoMoreRecs.INSTANCE) != null && recsUpdate.getCurrentRecs().isEmpty() != null) {
            m48580i();
        }
    }

    /* renamed from: a */
    public final void m48592a(boolean z) {
        if (!z) {
            m48599e();
        }
    }

    /* renamed from: e */
    public final void m48599e() {
        if (!this.f39835f) {
            this.f39835f = true;
            Size size = new Size(0, 0, 0, 0);
            Size j = m48581j();
            Size size2 = j != null ? j : size;
            j = m48583l();
            Size size3 = j != null ? j : size;
            j = m48582k();
            Size size4 = j != null ? j : size;
            j = m48584m();
            Size size5 = j != null ? j : size;
            Float n = m48585n();
            float floatValue = n != null ? n.floatValue() : 0.0f;
            PlaceRecsContainerTarget placeRecsContainerTarget = this.f39831b;
            if (placeRecsContainerTarget == null) {
                C2668g.b("target");
            }
            placeRecsContainerTarget.shrink(size2, size3, size4, size5, floatValue);
        }
    }

    /* renamed from: i */
    private final void m48580i() {
        Observable.b(1500, TimeUnit.MILLISECONDS, this.f39845p).a(C19397a.a()).d(new C14177a(this));
    }

    /* renamed from: a */
    private final void m48577a(String str, PlaceVisitorInfo placeVisitorInfo) {
        if (!this.f39842m) {
            this.f39842m = true;
            this.f39848s.m41354a(str, placeVisitorInfo.getNewVisitors(), placeVisitorInfo.getTotalVisitors());
        }
    }

    /* renamed from: f */
    public final void m48600f() {
        PlaceVisitorInfo placeVisitorInfo = this.f39836g;
        if (placeVisitorInfo != null) {
            C14345a c14345a = PlaceColor.Companion;
            String str = this.f39832c;
            if (str == null) {
                C2668g.b("placeId");
            }
            C14346b backgroundGradient = c14345a.a(Long.parseLong(str)).getBackgroundGradient();
            PlaceRecsContainerTarget placeRecsContainerTarget = this.f39831b;
            if (placeRecsContainerTarget == null) {
                C2668g.b("target");
            }
            placeRecsContainerTarget.setTeaserVisitorCounts(placeVisitorInfo.getTotalVisitors(), placeVisitorInfo.getNewVisitors(), backgroundGradient);
        }
    }

    /* renamed from: a */
    public final void m48588a(@NotNull Size size) {
        C2668g.b(size, "adjusted");
        this.f39846q.update(PlacesConfigExpansion.copy$default(this.f39846q.get(), size, null, null, null, null, 30, null));
    }

    /* renamed from: b */
    public final void m48594b(@NotNull Size size) {
        C2668g.b(size, ManagerWebServices.PARAM_SIZE);
        this.f39846q.update(PlacesConfigExpansion.copy$default(this.f39846q.get(), null, null, null, size, null, 23, null));
    }

    /* renamed from: c */
    public final void m48596c(@NotNull Size size) {
        C2668g.b(size, "adjusted");
        this.f39846q.update(PlacesConfigExpansion.copy$default(this.f39846q.get(), null, size, null, null, null, 29, null));
    }

    /* renamed from: d */
    public final void m48598d(@NotNull Size size) {
        C2668g.b(size, "adjusted");
        this.f39846q.update(PlacesConfigExpansion.copy$default(this.f39846q.get(), null, null, size, null, null, 27, null));
    }

    /* renamed from: a */
    public final void m48587a(float f) {
        this.f39846q.update(PlacesConfigExpansion.copy$default(this.f39846q.get(), null, null, null, null, Float.valueOf(f), 15, null));
    }

    /* renamed from: a */
    public final void m48589a(@NotNull PlacesConfigExpansion placesConfigExpansion) {
        C2668g.b(placesConfigExpansion, "nonAdjustedConfig");
        this.f39837h = true;
        this.f39838i = placesConfigExpansion.getTeaserSize();
        this.f39839j = placesConfigExpansion.getTitleSize();
        this.f39840k = placesConfigExpansion.getIntroSize();
        this.f39841l = placesConfigExpansion.getTitleFontSize();
        PlaceRecsContainerTarget placeRecsContainerTarget = this.f39831b;
        if (placeRecsContainerTarget == null) {
            C2668g.b("target");
        }
        placesConfigExpansion = placesConfigExpansion.getInitialSize();
        if (placesConfigExpansion == null) {
            C2668g.a();
        }
        placeRecsContainerTarget.measureCard(placesConfigExpansion);
    }

    /* renamed from: g */
    public final void m48601g() {
        if (this.f39837h) {
            PlaceRecsContainerTarget placeRecsContainerTarget;
            this.f39837h = false;
            Size size = this.f39838i;
            if (size != null) {
                placeRecsContainerTarget = this.f39831b;
                if (placeRecsContainerTarget == null) {
                    C2668g.b("target");
                }
                placeRecsContainerTarget.measureTeaser(size);
            }
            size = this.f39839j;
            if (size != null) {
                placeRecsContainerTarget = this.f39831b;
                if (placeRecsContainerTarget == null) {
                    C2668g.b("target");
                }
                placeRecsContainerTarget.measureTitle(size);
            }
            size = this.f39840k;
            if (size != null) {
                placeRecsContainerTarget = this.f39831b;
                if (placeRecsContainerTarget == null) {
                    C2668g.b("target");
                }
                placeRecsContainerTarget.measureIntro(size);
            }
            Float f = this.f39841l;
            if (f != null) {
                float floatValue = f.floatValue();
                m48587a(floatValue);
                placeRecsContainerTarget = this.f39831b;
                if (placeRecsContainerTarget == null) {
                    C2668g.b("target");
                }
                placeRecsContainerTarget.setTitleTextFontSize(floatValue);
            }
            size = new Size(0, 0, 0, 0);
            Size l = m48583l();
            if (l == null) {
                l = size;
            }
            Size k = m48582k();
            if (k != null) {
                size = k;
            }
            placeRecsContainerTarget = this.f39831b;
            if (placeRecsContainerTarget == null) {
                C2668g.b("target");
            }
            placeRecsContainerTarget.setTitlePosition(l);
            PlaceRecsContainerTarget placeRecsContainerTarget2 = this.f39831b;
            if (placeRecsContainerTarget2 == null) {
                C2668g.b("target");
            }
            placeRecsContainerTarget2.setRecsPosition(size);
            placeRecsContainerTarget2 = this.f39831b;
            if (placeRecsContainerTarget2 == null) {
                C2668g.b("target");
            }
            placeRecsContainerTarget2.resizeRecsToWindow();
            placeRecsContainerTarget2 = this.f39831b;
            if (placeRecsContainerTarget2 == null) {
                C2668g.b("target");
            }
            placeRecsContainerTarget2.expand();
        }
    }

    /* renamed from: j */
    private final Size m48581j() {
        return this.f39846q.get().getInitialSize();
    }

    /* renamed from: k */
    private final Size m48582k() {
        return this.f39846q.get().getTeaserSize();
    }

    /* renamed from: l */
    private final Size m48583l() {
        return this.f39846q.get().getTitleSize();
    }

    /* renamed from: m */
    private final Size m48584m() {
        return this.f39846q.get().getIntroSize();
    }

    /* renamed from: n */
    private final Float m48585n() {
        return this.f39846q.get().getTitleFontSize();
    }
}
