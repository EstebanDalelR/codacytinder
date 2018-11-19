package com.tinder.places.p156a;

import android.content.Context;
import com.tinder.discovery.p235d.C11140a.C8891a;
import com.tinder.discovery.tooltip.C11145a.C8892a;
import com.tinder.discovery.view.DiscoveryTabView.Adapter.OnSegmentsUpdatedListener;
import com.tinder.discovery.view.DiscoveryTabView.OnSegmentChangedListener;
import com.tinder.domain.places.PlacesConfigProvider;
import com.tinder.domain.profile.usecase.ConfirmTutorialsViewed;
import com.tinder.main.tooltip.C9835c;
import com.tinder.main.trigger.Trigger;
import com.tinder.module.ForApplication;
import com.tinder.places.provider.C10271c;
import com.tinder.scope.ActivityScope;
import dagger.Module;
import dagger.Provides;
import dagger.multibindings.IntoSet;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J \u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007J \u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0007J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0007J*\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u0007\u001a\u00020\b2\b\b\u0001\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0007¨\u0006\u001e"}, d2 = {"Lcom/tinder/places/badge/PlacesTriggerModule;", "", "()V", "providePlacesBadgeTrigger", "Lcom/tinder/main/trigger/Trigger;", "badgeOwnerAdapter", "Lcom/tinder/discovery/trigger/DiscoveryTabBadgeTrigger$BadgeOwnerAdapter;", "shouldShowPlacesTooltip", "Lcom/tinder/places/badge/ShouldShowPlacesTooltip;", "shouldShowPlacesBadge", "Lcom/tinder/places/badge/ShouldShowPlacesBadge;", "providePlacesDiscoverySegmentChangeListener", "Lcom/tinder/discovery/view/DiscoveryTabView$OnSegmentChangedListener;", "placesConfigProvider", "Lcom/tinder/domain/places/PlacesConfigProvider;", "confirmTutorialsViewed", "Lcom/tinder/domain/profile/usecase/ConfirmTutorialsViewed;", "placeFrontmostProvider", "Lcom/tinder/places/provider/PlaceFrontmostProvider;", "providePlacesDiscoverySegmentListenerIntoSet", "Lcom/tinder/discovery/view/DiscoveryTabView$Adapter$OnSegmentsUpdatedListener;", "placesDiscoverySegmentAvailableProvider", "Lcom/tinder/places/badge/PlacesDiscoverySegmentAvailableProvider;", "providePlacesTooltipTrigger", "mainTutorialDisplayQueue", "Lcom/tinder/main/tooltip/MainTutorialDisplayQueue;", "context", "Landroid/content/Context;", "discoveryTooltipRequestFactory", "Lcom/tinder/discovery/tooltip/DiscoveryTooltipRequest$Factory;", "Tinder_release"}, k = 1, mv = {1, 1, 10})
@Module
/* renamed from: com.tinder.places.a.e */
public final class C6251e {
    @ActivityScope
    @IntoSet
    @NotNull
    @Provides
    /* renamed from: a */
    public final Trigger m26960a(@NotNull C8891a c8891a, @NotNull C7357l c7357l, @NotNull C7353j c7353j) {
        C2668g.b(c8891a, "badgeOwnerAdapter");
        C2668g.b(c7357l, "shouldShowPlacesTooltip");
        C2668g.b(c7353j, "shouldShowPlacesBadge");
        return new C8026a(c8891a, c7353j, c7357l);
    }

    @ActivityScope
    @IntoSet
    @NotNull
    @Provides
    /* renamed from: a */
    public final Trigger m26961a(@NotNull C9835c c9835c, @NotNull C7357l c7357l, @NotNull @ForApplication Context context, @NotNull C8892a c8892a) {
        C2668g.b(c9835c, "mainTutorialDisplayQueue");
        C2668g.b(c7357l, "shouldShowPlacesTooltip");
        C2668g.b(context, "context");
        C2668g.b(c8892a, "discoveryTooltipRequestFactory");
        return new C8027d(c7357l, context, c9835c, c8892a);
    }

    @NotNull
    @IntoSet
    @Provides
    /* renamed from: a */
    public final OnSegmentChangedListener m26959a(@NotNull PlacesConfigProvider placesConfigProvider, @NotNull ConfirmTutorialsViewed confirmTutorialsViewed, @NotNull C10271c c10271c) {
        C2668g.b(placesConfigProvider, "placesConfigProvider");
        C2668g.b(confirmTutorialsViewed, "confirmTutorialsViewed");
        C2668g.b(c10271c, "placeFrontmostProvider");
        return new C7346c(placesConfigProvider, confirmTutorialsViewed, c10271c);
    }

    @ActivityScope
    @IntoSet
    @NotNull
    @Provides
    /* renamed from: a */
    public final OnSegmentsUpdatedListener m26958a(@NotNull C7343b c7343b) {
        C2668g.b(c7343b, "placesDiscoverySegmentAvailableProvider");
        return c7343b;
    }
}
