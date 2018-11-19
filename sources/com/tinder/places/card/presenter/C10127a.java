package com.tinder.places.card.presenter;

import com.tinder.data.places.PlacesApiClient.PlacesApiException;
import com.tinder.data.places.p330b.C10895c;
import com.tinder.deadshot.DeadshotTarget;
import com.tinder.domain.places.model.Place.Alternative;
import com.tinder.places.analytics.C10112a;
import com.tinder.places.card.target.PlaceCardAlternativesTarget;
import com.tinder.places.p311f.C12347l;
import com.tinder.places.p311f.C12347l.C10209a;
import com.tinder.places.viewmodel.C14347a;
import com.tinder.utils.RxUtils;
import java.util.List;
import javax.inject.Inject;
import kotlin.C15813i;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import p000a.p001a.C0001a;
import rx.Subscription;
import rx.functions.Action0;
import rx.functions.Action1;
import rx.schedulers.Schedulers;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u000e\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aJ\u0018\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\nH\u0002J\u0016\u0010\u001e\u001a\u00020\u00182\u0006\u0010\u001f\u001a\u00020\n2\u0006\u0010 \u001a\u00020!J\u000e\u0010\"\u001a\u00020\u00182\u0006\u0010#\u001a\u00020!J\u0006\u0010$\u001a\u00020\u0018J\u0016\u0010%\u001a\u00020\u00182\f\u0010&\u001a\b\u0012\u0004\u0012\u00020\u001a0'H\u0002J\u000e\u0010(\u001a\u00020\u00182\u0006\u0010)\u001a\u00020*J\u0010\u0010+\u001a\u00020\u00182\u0006\u0010,\u001a\u00020-H\u0002J\u001e\u0010.\u001a\u00020\u00182\u0006\u0010/\u001a\u0002002\u0006\u00101\u001a\u0002002\u0006\u00102\u001a\u00020!J,\u00103\u001a\u00020\u00182\u0006\u0010/\u001a\u0002002\u0006\u00101\u001a\u0002002\f\u00104\u001a\b\u0012\u0004\u0012\u00020\u0018052\u0006\u00102\u001a\u00020!R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R$\u0010\t\u001a\u00020\n8\u0006@\u0006X.¢\u0006\u0014\n\u0000\u0012\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0011\u001a\u00020\u00128\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u00066"}, d2 = {"Lcom/tinder/places/card/presenter/PlaceCardAlternativesPresenter;", "", "updateCorrectLocation", "Lcom/tinder/places/usecase/UpdateCorrectLocation;", "deletePlace", "Lcom/tinder/data/places/usecase/DeletePlace;", "addPlacesCorrectRecentPlaceEvent", "Lcom/tinder/places/analytics/AddPlacesCorrectRecentPlaceEvent;", "(Lcom/tinder/places/usecase/UpdateCorrectLocation;Lcom/tinder/data/places/usecase/DeletePlace;Lcom/tinder/places/analytics/AddPlacesCorrectRecentPlaceEvent;)V", "placeId", "", "placeId$annotations", "()V", "getPlaceId", "()Ljava/lang/String;", "setPlaceId", "(Ljava/lang/String;)V", "target", "Lcom/tinder/places/card/target/PlaceCardAlternativesTarget;", "getTarget", "()Lcom/tinder/places/card/target/PlaceCardAlternativesTarget;", "setTarget", "(Lcom/tinder/places/card/target/PlaceCardAlternativesTarget;)V", "alternativeSelectedAction", "", "alternative", "Lcom/tinder/domain/places/model/Place$Alternative;", "correctLocation", "currentPlaceId", "newPlaceId", "handleCorrectLocationConfirmed", "alternativeId", "confirmed", "", "handleNoneOfTheseSelected", "isDelete", "noneOfTheseSelectedAction", "setButtonNames", "alternatives", "", "setup", "viewModel", "Lcom/tinder/places/viewmodel/PlaceCardAlternativeViewModel;", "showErrorDialogIfNeeded", "throwable", "", "startAnimateIn", "fadeDuration", "", "slideDuration", "hasAlternatives", "startAnimateOut", "callback", "Lkotlin/Function0;", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.places.card.presenter.a */
public final class C10127a {
    @DeadshotTarget
    @NotNull
    /* renamed from: a */
    public PlaceCardAlternativesTarget f33111a;
    @NotNull
    /* renamed from: b */
    public String f33112b;
    /* renamed from: c */
    private final C12347l f33113c;
    /* renamed from: d */
    private final C10895c f33114d;
    /* renamed from: e */
    private final C10112a f33115e;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lrx/Subscription;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.places.card.presenter.a$a */
    static final class C14171a<T> implements Action1<Subscription> {
        /* renamed from: a */
        final /* synthetic */ C10127a f44933a;

        C14171a(C10127a c10127a) {
            this.f44933a = c10127a;
        }

        public /* synthetic */ void call(Object obj) {
            m53858a((Subscription) obj);
        }

        /* renamed from: a */
        public final void m53858a(Subscription subscription) {
            this.f44933a.m41402a().showLoadingState();
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.places.card.presenter.a$b */
    static final class C14172b implements Action0 {
        /* renamed from: a */
        final /* synthetic */ C10127a f44934a;

        C14172b(C10127a c10127a) {
            this.f44934a = c10127a;
        }

        public final void call() {
            this.f44934a.m41402a().hideLoadingState();
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.places.card.presenter.a$c */
    static final class C14173c implements Action0 {
        /* renamed from: a */
        public static final C14173c f44935a = new C14173c();

        C14173c() {
        }

        public final void call() {
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.places.card.presenter.a$d */
    static final class C14174d<T> implements Action1<Throwable> {
        /* renamed from: a */
        final /* synthetic */ C10127a f44936a;
        /* renamed from: b */
        final /* synthetic */ String f44937b;

        C14174d(C10127a c10127a, String str) {
            this.f44936a = c10127a;
            this.f44937b = str;
        }

        public /* synthetic */ void call(Object obj) {
            m53859a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m53859a(Throwable th) {
            PlacesApiException placesApiException = (PlacesApiException) (!(th instanceof PlacesApiException) ? null : th);
            if (placesApiException != null) {
                Integer a = placesApiException.m37235a();
                if (a != null) {
                    this.f44936a.f33115e.m41342b(this.f44937b, a.intValue());
                }
            }
            C10127a c10127a = this.f44936a;
            C2668g.a(th, "it");
            c10127a.m41400a(th);
            C0001a.c(th, "Failed to update correct location", new Object[0]);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.places.card.presenter.a$e */
    static final class C14175e implements Action0 {
        /* renamed from: a */
        public static final C14175e f44938a = new C14175e();

        C14175e() {
        }

        public final void call() {
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.places.card.presenter.a$f */
    static final class C14176f<T> implements Action1<Throwable> {
        /* renamed from: a */
        public static final C14176f f44939a = new C14176f();

        C14176f() {
        }

        public /* synthetic */ void call(Object obj) {
            m53860a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m53860a(Throwable th) {
            C0001a.c(th, "Could not delete place after selecting \"None of these\"", new Object[0]);
        }
    }

    @Inject
    public C10127a(@NotNull C12347l c12347l, @NotNull C10895c c10895c, @NotNull C10112a c10112a) {
        C2668g.b(c12347l, "updateCorrectLocation");
        C2668g.b(c10895c, "deletePlace");
        C2668g.b(c10112a, "addPlacesCorrectRecentPlaceEvent");
        this.f33113c = c12347l;
        this.f33114d = c10895c;
        this.f33115e = c10112a;
    }

    @NotNull
    /* renamed from: a */
    public final PlaceCardAlternativesTarget m41402a() {
        PlaceCardAlternativesTarget placeCardAlternativesTarget = this.f33111a;
        if (placeCardAlternativesTarget == null) {
            C2668g.b("target");
        }
        return placeCardAlternativesTarget;
    }

    /* renamed from: a */
    public final void m41406a(@NotNull C14347a c14347a) {
        C2668g.b(c14347a, "viewModel");
        List b = c14347a.b();
        this.f33112b = c14347a.a();
        if ((b.isEmpty() ^ 1) != null) {
            c14347a = b.size();
            PlaceCardAlternativesTarget placeCardAlternativesTarget = this.f33111a;
            if (placeCardAlternativesTarget == null) {
                C2668g.b("target");
            }
            placeCardAlternativesTarget.hideNoOptionsText();
            placeCardAlternativesTarget = this.f33111a;
            if (placeCardAlternativesTarget == null) {
                C2668g.b("target");
            }
            placeCardAlternativesTarget.setTotalAlternatives(c14347a);
            m41401a(b);
            return;
        }
        c14347a = this.f33111a;
        if (c14347a == null) {
            C2668g.b("target");
        }
        c14347a.showNoAlternativeState();
    }

    /* renamed from: a */
    public final void m41404a(long j, long j2, boolean z) {
        if (z) {
            z = this.f33111a;
            if (!z) {
                C2668g.b("target");
            }
            z.animateInAlternatives(j, j2);
            return;
        }
        j2 = this.f33111a;
        if (j2 == null) {
            C2668g.b("target");
        }
        j2.animateInEmptyState(j);
    }

    /* renamed from: a */
    public final void m41403a(long j, long j2, @NotNull Function0<C15813i> function0, boolean z) {
        C2668g.b(function0, "callback");
        if (z) {
            PlaceCardAlternativesTarget placeCardAlternativesTarget = this.f33111a;
            if (placeCardAlternativesTarget == null) {
                C2668g.b("target");
            }
            placeCardAlternativesTarget.animateOutAlternatives(j, j2, function0);
            return;
        }
        j2 = this.f33111a;
        if (j2 == null) {
            C2668g.b("target");
        }
        j2.animateOutEmptyState(j, function0);
    }

    /* renamed from: a */
    public final void m41405a(@NotNull Alternative alternative) {
        C2668g.b(alternative, "alternative");
        PlaceCardAlternativesTarget placeCardAlternativesTarget = this.f33111a;
        if (placeCardAlternativesTarget == null) {
            C2668g.b("target");
        }
        placeCardAlternativesTarget.showCorrectionDialog(alternative);
        String str = this.f33112b;
        if (str == null) {
            C2668g.b("placeId");
        }
        this.f33115e.m41339a(str, alternative.getId());
    }

    /* renamed from: b */
    public final void m41409b() {
        PlaceCardAlternativesTarget placeCardAlternativesTarget = this.f33111a;
        if (placeCardAlternativesTarget == null) {
            C2668g.b("target");
        }
        placeCardAlternativesTarget.showNoneOfTheseDialog();
        C10112a c10112a = this.f33115e;
        String str = this.f33112b;
        if (str == null) {
            C2668g.b("placeId");
        }
        c10112a.m41337a(str);
    }

    /* renamed from: a */
    public final void m41407a(@NotNull String str, boolean z) {
        C2668g.b(str, "alternativeId");
        String str2 = this.f33112b;
        if (str2 == null) {
            C2668g.b("placeId");
        }
        if (z) {
            m41399a(str2, str);
        }
        this.f33115e.m41340a(str2, z, str);
    }

    /* renamed from: a */
    public final void m41408a(boolean z) {
        String str;
        if (z) {
            z = this.f33114d;
            str = this.f33112b;
            if (str == null) {
                C2668g.b("placeId");
            }
            z.m43442a(str).b(Schedulers.io()).a(C14175e.f44938a, C14176f.f44939a);
            z = this.f33115e;
            str = this.f33112b;
            if (str == null) {
                C2668g.b("placeId");
            }
            z.m41343c(str);
            return;
        }
        z = this.f33115e;
        str = this.f33112b;
        if (str == null) {
            C2668g.b("placeId");
        }
        z.m41341b(str);
    }

    /* renamed from: a */
    private final void m41399a(String str, String str2) {
        this.f33113c.m48733a(new C10209a(str2, str)).a(RxUtils.a().b()).d(new C14171a(this)).d(new C14172b(this)).a(C14173c.f44935a, new C14174d(this, str));
    }

    /* renamed from: a */
    private final void m41400a(Throwable th) {
        if (th instanceof PlacesApiException) {
            PlaceCardAlternativesTarget placeCardAlternativesTarget = this.f33111a;
            if (placeCardAlternativesTarget == null) {
                C2668g.b("target");
            }
            placeCardAlternativesTarget.showErrorDialog((PlacesApiException) th);
        }
    }

    /* renamed from: a */
    private final void m41401a(List<Alternative> list) {
        int i = 0;
        int i2 = -1;
        for (Alternative alternative : list) {
            int i3 = i + 1;
            PlaceCardAlternativesTarget placeCardAlternativesTarget;
            if (i == 3) {
                placeCardAlternativesTarget = this.f33111a;
                if (placeCardAlternativesTarget == null) {
                    C2668g.b("target");
                }
                placeCardAlternativesTarget.bindNoneOfThese(i);
            } else {
                placeCardAlternativesTarget = this.f33111a;
                if (placeCardAlternativesTarget == null) {
                    C2668g.b("target");
                }
                placeCardAlternativesTarget.bindButtonName(i);
            }
            i2 = i;
            i = i3;
        }
        if (i2 < 3) {
            list = this.f33111a;
            if (list == null) {
                C2668g.b("target");
            }
            list.bindNoneOfThese(i2 + 1);
        }
    }
}
