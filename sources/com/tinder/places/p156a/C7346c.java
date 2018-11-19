package com.tinder.places.p156a;

import com.tinder.discovery.model.DiscoverySegment;
import com.tinder.discovery.view.DiscoveryTabView.OnSegmentChangedListener;
import com.tinder.domain.places.PlacesConfigProvider;
import com.tinder.domain.places.model.PlacesConfig;
import com.tinder.domain.profile.model.Tutorial;
import com.tinder.domain.profile.model.Tutorial.PlacesToggleTooltip;
import com.tinder.domain.profile.usecase.ConfirmTutorialsViewed;
import com.tinder.places.provider.C10271c;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.C15756a;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000a.p001a.C0001a;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u001a\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016J\u0010\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\fH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/tinder/places/badge/PlacesToggleDecorationSegmentChangeListener;", "Lcom/tinder/discovery/view/DiscoveryTabView$OnSegmentChangedListener;", "placesConfigProvider", "Lcom/tinder/domain/places/PlacesConfigProvider;", "confirmTutorialsViewed", "Lcom/tinder/domain/profile/usecase/ConfirmTutorialsViewed;", "placeFrontmostProvider", "Lcom/tinder/places/provider/PlaceFrontmostProvider;", "(Lcom/tinder/domain/places/PlacesConfigProvider;Lcom/tinder/domain/profile/usecase/ConfirmTutorialsViewed;Lcom/tinder/places/provider/PlaceFrontmostProvider;)V", "onSegmentChanged", "", "nextSegment", "Lcom/tinder/discovery/model/DiscoverySegment;", "prevSegment", "onSegmentClicked", "segment", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.places.a.c */
public final class C7346c implements OnSegmentChangedListener {
    /* renamed from: a */
    private final PlacesConfigProvider f26513a;
    /* renamed from: b */
    private final ConfirmTutorialsViewed f26514b;
    /* renamed from: c */
    private final C10271c f26515c;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.places.a.c$a */
    static final class C7344a implements Action {
        /* renamed from: a */
        public static final C7344a f26511a = new C7344a();

        C7344a() {
        }

        public final void run() {
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.places.a.c$b */
    static final class C7345b<T> implements Consumer<Throwable> {
        /* renamed from: a */
        public static final C7345b f26512a = new C7345b();

        C7345b() {
        }

        public /* synthetic */ void accept(Object obj) {
            m31324a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m31324a(Throwable th) {
            C0001a.c(th, "Error retrieving places_toggle_tooltip tutorial", new Object[0]);
        }
    }

    public void onSegmentClicked(@NotNull DiscoverySegment discoverySegment) {
        C2668g.b(discoverySegment, "segment");
    }

    public C7346c(@NotNull PlacesConfigProvider placesConfigProvider, @NotNull ConfirmTutorialsViewed confirmTutorialsViewed, @NotNull C10271c c10271c) {
        C2668g.b(placesConfigProvider, "placesConfigProvider");
        C2668g.b(confirmTutorialsViewed, "confirmTutorialsViewed");
        C2668g.b(c10271c, "placeFrontmostProvider");
        this.f26513a = placesConfigProvider;
        this.f26514b = confirmTutorialsViewed;
        this.f26515c = c10271c;
    }

    public void onSegmentChanged(@NotNull DiscoverySegment discoverySegment, @Nullable DiscoverySegment discoverySegment2) {
        C2668g.b(discoverySegment, "nextSegment");
        this.f26515c.a(discoverySegment == DiscoverySegment.PLACES);
        if (discoverySegment == DiscoverySegment.PLACES) {
            PlacesConfig placesConfig = this.f26513a.get();
            if (placesConfig != null) {
                this.f26513a.update(PlacesConfig.copy$default(placesConfig, 0, null, false, false, 11, null));
            }
            this.f26514b.execute((Tutorial) PlacesToggleTooltip.INSTANCE).b(C15756a.b()).a((Action) C7344a.f26511a, C7345b.f26512a);
        }
    }
}
