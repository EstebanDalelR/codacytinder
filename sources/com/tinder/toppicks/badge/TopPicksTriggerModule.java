package com.tinder.toppicks.badge;

import android.content.res.Resources;
import com.tinder.discovery.model.DiscoverySegment;
import com.tinder.discovery.p235d.C11140a.C8891a;
import com.tinder.discovery.tooltip.C11145a.C8892a;
import com.tinder.discovery.view.DiscoveryTabView.Adapter.OnSegmentsUpdatedListener;
import com.tinder.discovery.view.DiscoveryTabView.OnSegmentChangedListener;
import com.tinder.domain.config.TopPicksConfig;
import com.tinder.domain.injection.qualifiers.DefaultDateTimeProvider;
import com.tinder.domain.profile.usecase.CheckTutorialViewed;
import com.tinder.domain.profile.usecase.ConfirmTutorialsViewed;
import com.tinder.domain.toppicks.repo.TopPicksApplicationRepository;
import com.tinder.fireboarding.domain.C11806k;
import com.tinder.main.tooltip.C9835c;
import com.tinder.main.trigger.Trigger;
import com.tinder.recs.domain.repository.SwipeCountRepository;
import com.tinder.scope.ActivityScope;
import com.tinder.toppicks.C15235b.C15232h;
import com.tinder.toppicks.tooltip.TopPicksNewUserTooltipTrigger;
import dagger.Module;
import dagger.Provides;
import dagger.multibindings.IntoSet;
import io.reactivex.C3959e;
import io.reactivex.subjects.C18432c;
import io.reactivex.subjects.C19040a;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.joda.time.DateTime;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001%B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007J@\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u000e\b\u0001\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u000e\b\u0001\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007J(\u0010\u0012\u001a\u00020\u00132\u0006\u0010\b\u001a\u00020\t2\u000e\b\u0001\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\u000f\u001a\u00020\u0010H\u0007J\u0018\u0010\u0014\u001a\u00020\u00152\u000e\b\u0001\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007JX\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u000e\b\u0001\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010#\u001a\u00020$H\u0007¨\u0006&"}, d2 = {"Lcom/tinder/toppicks/badge/TopPicksTriggerModule;", "", "()V", "provideSegmentChangeRelay", "Lio/reactivex/subjects/Subject;", "", "provideTopPicksBadgeTrigger", "Lcom/tinder/main/trigger/Trigger;", "topPicksApplicationRepository", "Lcom/tinder/domain/toppicks/repo/TopPicksApplicationRepository;", "dateTimeProvider", "Lkotlin/Function0;", "Lorg/joda/time/DateTime;", "markAdapter", "Lcom/tinder/discovery/trigger/DiscoveryTabBadgeTrigger$BadgeOwnerAdapter;", "topPicksConfig", "Lcom/tinder/domain/config/TopPicksConfig;", "relay", "provideTopPicksDiscoverySegmentChangeListener", "Lcom/tinder/discovery/view/DiscoveryTabView$OnSegmentChangedListener;", "provideTopPicksOnSegmentChangedListener", "Lcom/tinder/discovery/view/DiscoveryTabView$Adapter$OnSegmentsUpdatedListener;", "provideTopPicksTooltipTrigger", "mainTutorialDisplayQueue", "Lcom/tinder/main/tooltip/MainTutorialDisplayQueue;", "swipeCountRepository", "Lcom/tinder/recs/domain/repository/SwipeCountRepository;", "resources", "Landroid/content/res/Resources;", "isNewAccount", "Lcom/tinder/fireboarding/domain/IsNewAccount;", "checkTutorialViewed", "Lcom/tinder/domain/profile/usecase/CheckTutorialViewed;", "confirmTutorialsViewed", "Lcom/tinder/domain/profile/usecase/ConfirmTutorialsViewed;", "discoveryTooltipRequestFactory", "Lcom/tinder/discovery/tooltip/DiscoveryTooltipRequest$Factory;", "TopPicksSegmentRelay", "toppicks_release"}, k = 1, mv = {1, 1, 10})
@Module
public final class TopPicksTriggerModule {

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016¨\u0006\b"}, d2 = {"com/tinder/toppicks/badge/TopPicksTriggerModule$provideTopPicksOnSegmentChangedListener$1", "Lcom/tinder/discovery/view/DiscoveryTabView$Adapter$OnSegmentsUpdatedListener;", "(Lio/reactivex/subjects/Subject;)V", "onSegmentsUpdated", "", "newDiscoverySegments", "", "Lcom/tinder/discovery/model/DiscoverySegment;", "toppicks_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.toppicks.badge.TopPicksTriggerModule$a */
    public static final class C16980a implements OnSegmentsUpdatedListener {
        /* renamed from: a */
        final /* synthetic */ C18432c f52375a;

        C16980a(C18432c c18432c) {
            this.f52375a = c18432c;
        }

        public void onSegmentsUpdated(@NotNull List<? extends DiscoverySegment> list) {
            C2668g.b(list, "newDiscoverySegments");
            this.f52375a.onNext(Boolean.valueOf(list.contains(DiscoverySegment.TOP_PICKS)));
        }
    }

    @IntoSet
    @NotNull
    @Provides
    /* renamed from: a */
    public final Trigger m57296a(@NotNull TopPicksApplicationRepository topPicksApplicationRepository, @NotNull @DefaultDateTimeProvider Function0<DateTime> function0, @NotNull C8891a c8891a, @NotNull TopPicksConfig topPicksConfig, @NotNull @TopPicksTriggerModule$TopPicksSegmentRelay C18432c<Boolean> c18432c) {
        C2668g.b(topPicksApplicationRepository, "topPicksApplicationRepository");
        C2668g.b(function0, "dateTimeProvider");
        C2668g.b(c8891a, "markAdapter");
        C2668g.b(topPicksConfig, "topPicksConfig");
        C2668g.b(c18432c, "relay");
        C3959e hide = c18432c.hide();
        C2668g.a(hide, "relay.hide()");
        return new C18221b(topPicksApplicationRepository, function0, topPicksConfig, hide, c8891a);
    }

    @IntoSet
    @NotNull
    @Provides
    /* renamed from: a */
    public final Trigger m57297a(@NotNull C9835c c9835c, @NotNull SwipeCountRepository swipeCountRepository, @NotNull Resources resources, @NotNull TopPicksConfig topPicksConfig, @NotNull C11806k c11806k, @NotNull CheckTutorialViewed checkTutorialViewed, @NotNull ConfirmTutorialsViewed confirmTutorialsViewed, @NotNull @TopPicksTriggerModule$TopPicksSegmentRelay C18432c<Boolean> c18432c, @NotNull C8892a c8892a) {
        Resources resources2 = resources;
        C9835c c9835c2 = c9835c;
        C2668g.b(c9835c2, "mainTutorialDisplayQueue");
        SwipeCountRepository swipeCountRepository2 = swipeCountRepository;
        C2668g.b(swipeCountRepository2, "swipeCountRepository");
        C2668g.b(resources2, "resources");
        TopPicksConfig topPicksConfig2 = topPicksConfig;
        C2668g.b(topPicksConfig2, "topPicksConfig");
        C11806k c11806k2 = c11806k;
        C2668g.b(c11806k2, "isNewAccount");
        CheckTutorialViewed checkTutorialViewed2 = checkTutorialViewed;
        C2668g.b(checkTutorialViewed2, "checkTutorialViewed");
        ConfirmTutorialsViewed confirmTutorialsViewed2 = confirmTutorialsViewed;
        C2668g.b(confirmTutorialsViewed2, "confirmTutorialsViewed");
        C2668g.b(c18432c, "relay");
        C8892a c8892a2 = c8892a;
        C2668g.b(c8892a2, "discoveryTooltipRequestFactory");
        String string = resources2.getString(C15232h.top_picks_tooltip_message);
        C2668g.a(string, "resources.getString(R.st…op_picks_tooltip_message)");
        CharSequence charSequence = string;
        C3959e hide = c18432c.hide();
        C2668g.a(hide, "relay.hide()");
        return new TopPicksNewUserTooltipTrigger(swipeCountRepository2, topPicksConfig2, charSequence, c11806k2, checkTutorialViewed2, confirmTutorialsViewed2, hide, c9835c2, c8892a2);
    }

    @IntoSet
    @NotNull
    @Provides
    /* renamed from: a */
    public final OnSegmentChangedListener m57295a(@NotNull TopPicksApplicationRepository topPicksApplicationRepository, @NotNull @DefaultDateTimeProvider Function0<DateTime> function0, @NotNull TopPicksConfig topPicksConfig) {
        C2668g.b(topPicksApplicationRepository, "topPicksApplicationRepository");
        C2668g.b(function0, "dateTimeProvider");
        C2668g.b(topPicksConfig, "topPicksConfig");
        return new C16981a(topPicksApplicationRepository, function0, topPicksConfig);
    }

    @ActivityScope
    @NotNull
    @TopPicksTriggerModule$TopPicksSegmentRelay
    @Provides
    /* renamed from: a */
    public final C18432c<Boolean> m57298a() {
        C18432c<Boolean> d = C19040a.m67695a(Boolean.valueOf(false)).m66611d();
        C2668g.a(d, "BehaviorSubject.createDe…ult(false).toSerialized()");
        return d;
    }

    @IntoSet
    @NotNull
    @Provides
    /* renamed from: a */
    public final OnSegmentsUpdatedListener m57294a(@NotNull @TopPicksTriggerModule$TopPicksSegmentRelay C18432c<Boolean> c18432c) {
        C2668g.b(c18432c, "relay");
        return new C16980a(c18432c);
    }
}
