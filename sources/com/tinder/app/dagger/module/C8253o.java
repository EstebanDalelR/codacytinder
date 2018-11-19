package com.tinder.app.dagger.module;

import android.arch.lifecycle.LifecycleObserver;
import android.content.Context;
import com.tinder.activities.MainActivity;
import com.tinder.app.dagger.module.p159a.C8243a;
import com.tinder.core.experiment.AbTestUtility;
import com.tinder.design.tabbedpagelayout.TabbedPageLayout.OnPageSelectedListener;
import com.tinder.discovery.analytics.C11125b;
import com.tinder.domain.common.repository.LastActivityDateRepository;
import com.tinder.domain.injection.qualifiers.DefaultDateTimeProvider;
import com.tinder.domain.injection.qualifiers.IoScheduler;
import com.tinder.domain.profile.usecase.IsUserDueForFeedTooltip;
import com.tinder.feed.trigger.C11705c;
import com.tinder.feed.trigger.C13269a;
import com.tinder.feed.trigger.p356a.C13268a;
import com.tinder.injection.qualifiers.MainThreadScheduler;
import com.tinder.main.p287c.C13390c;
import com.tinder.main.qualifier.MainActivityQualifier;
import com.tinder.main.tooltip.C12012a.C9833a;
import com.tinder.main.tooltip.C9835c;
import com.tinder.main.tooltip.MainTabTooltipOwner;
import com.tinder.main.trigger.MainTriggerMediator;
import com.tinder.main.trigger.Trigger;
import com.tinder.main.trigger.orchestrator.C12018a;
import com.tinder.main.trigger.orchestrator.HierarchyChangeTriggerOrchestrator;
import com.tinder.main.trigger.orchestrator.LifecycleObservingTriggerOrchestrator;
import com.tinder.module.ForApplication;
import com.tinder.places.p156a.C6251e;
import com.tinder.scope.ActivityScope;
import com.tinder.toppicks.badge.TopPicksTriggerModule;
import dagger.Lazy;
import dagger.Module;
import dagger.Provides;
import dagger.multibindings.IntoSet;
import io.reactivex.C15679f;
import java.util.LinkedList;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.joda.time.DateTime;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002JF\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\b\b\u0001\u0010\u000f\u001a\u00020\u00102\b\b\u0001\u0010\u0011\u001a\u00020\u0010H\u0007J\u001e\u0010\u0012\u001a\u00020\u00132\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u00152\u0006\u0010\u0017\u001a\u00020\u0018H\u0007J(\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u000e\b\u0001\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e2\u0006\u0010\r\u001a\u00020\u000eH\u0007J\u001e\u0010 \u001a\u00020\u00132\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u00152\u0006\u0010\u0017\u001a\u00020\u0018H\u0007J\u001e\u0010!\u001a\u00020\"2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u00152\u0006\u0010#\u001a\u00020$H\u0007J\u0016\u0010%\u001a\u00020\n2\f\u0010&\u001a\b\u0012\u0004\u0012\u00020\"0\u0015H\u0007J\u0010\u0010'\u001a\u00020\u00162\u0006\u0010(\u001a\u00020)H\u0007J\u0010\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020\u0018H\u0007J\u001b\u0010-\u001a\u00020\u00182\u0011\u0010.\u001a\r\u0012\t\u0012\u00070\u0004¢\u0006\u0002\b00/H\u0007J\b\u00101\u001a\u00020\u0006H\u0007¨\u00062"}, d2 = {"Lcom/tinder/app/dagger/module/MainTriggerModule;", "", "()V", "provideFeedTabTooltipTrigger", "Lcom/tinder/main/trigger/Trigger;", "mainTutorialDisplayQueue", "Lcom/tinder/main/tooltip/MainTutorialDisplayQueue;", "context", "Landroid/content/Context;", "tooltipRequestFactory", "Lcom/tinder/main/tooltip/MainTabTooltipRequest$Factory;", "shouldShowFeedTooltip", "Lcom/tinder/feed/trigger/ShouldShowFeedTooltip;", "abTestUtility", "Lcom/tinder/core/experiment/AbTestUtility;", "ioScheduler", "Lio/reactivex/Scheduler;", "mainThreadScheduler", "provideHierarchyChangeTriggerOrchestrator", "Landroid/arch/lifecycle/LifecycleObserver;", "mainView", "Ldagger/Lazy;", "Lcom/tinder/main/view/MainView;", "mainTriggerMediator", "Lcom/tinder/main/trigger/MainTriggerMediator;", "provideIsUserDueForFeedTooltip", "Lcom/tinder/domain/profile/usecase/IsUserDueForFeedTooltip;", "lastActivityDateRepository", "Lcom/tinder/domain/common/repository/LastActivityDateRepository;", "dateTimeProvider", "Lkotlin/Function0;", "Lorg/joda/time/DateTime;", "provideLifecycleObservingTriggerOrchestrator", "provideMainTabTooltipOwner", "Lcom/tinder/main/tooltip/MainTabTooltipOwner;", "addSessionNotificationEvent", "Lcom/tinder/discovery/analytics/AddSessionNotificationEvent;", "provideMainTabTooltipRequestFactory", "mainTabTooltipOwner", "provideMainView", "mainActivity", "Lcom/tinder/activities/MainActivity;", "providePageSelectedTriggerOrchestrator", "Lcom/tinder/design/tabbedpagelayout/TabbedPageLayout$OnPageSelectedListener;", "mediator", "provideTriggerRegistrar", "triggers", "", "Lkotlin/jvm/JvmSuppressWildcards;", "provideTutorialDisplayQueue", "Tinder_release"}, k = 1, mv = {1, 1, 10})
@Module(includes = {TopPicksTriggerModule.class, C6251e.class, C8243a.class, ad.class})
/* renamed from: com.tinder.app.dagger.module.o */
public final class C8253o {
    @ActivityScope
    @NotNull
    @Provides
    /* renamed from: a */
    public final MainTriggerMediator m35224a(@NotNull Set<Trigger> set) {
        C2668g.b(set, "triggers");
        return new MainTriggerMediator(new LinkedList(set));
    }

    @ActivityScope
    @IntoSet
    @MainActivityQualifier
    @NotNull
    @Provides
    /* renamed from: a */
    public final LifecycleObserver m35217a(@NotNull Lazy<C13390c> lazy, @NotNull MainTriggerMediator mainTriggerMediator) {
        C2668g.b(lazy, "mainView");
        C2668g.b(mainTriggerMediator, "mainTriggerMediator");
        return new HierarchyChangeTriggerOrchestrator(lazy, mainTriggerMediator);
    }

    @ActivityScope
    @IntoSet
    @MainActivityQualifier
    @NotNull
    @Provides
    /* renamed from: b */
    public final LifecycleObserver m35226b(@NotNull Lazy<C13390c> lazy, @NotNull MainTriggerMediator mainTriggerMediator) {
        C2668g.b(lazy, "mainView");
        C2668g.b(mainTriggerMediator, "mainTriggerMediator");
        return new LifecycleObservingTriggerOrchestrator(lazy, mainTriggerMediator);
    }

    @ActivityScope
    @IntoSet
    @NotNull
    @Provides
    /* renamed from: a */
    public final OnPageSelectedListener m35218a(@NotNull MainTriggerMediator mainTriggerMediator) {
        C2668g.b(mainTriggerMediator, "mediator");
        return new C12018a(mainTriggerMediator);
    }

    @NotNull
    @Provides
    /* renamed from: a */
    public final C13390c m35220a(@NotNull MainActivity mainActivity) {
        C2668g.b(mainActivity, "mainActivity");
        mainActivity = mainActivity.e();
        C2668g.a(mainActivity, "mainActivity.mainView");
        return mainActivity;
    }

    @NotNull
    @ActivityScope
    @Provides
    /* renamed from: a */
    public final C9835c m35223a() {
        return new C9835c();
    }

    @ActivityScope
    @IntoSet
    @NotNull
    @Provides
    /* renamed from: a */
    public final Trigger m35225a(@NotNull C9835c c9835c, @NotNull @ForApplication Context context, @NotNull C9833a c9833a, @NotNull C11705c c11705c, @NotNull AbTestUtility abTestUtility, @NotNull @IoScheduler C15679f c15679f, @NotNull @MainThreadScheduler C15679f c15679f2) {
        C9835c c9835c2 = c9835c;
        C2668g.b(c9835c2, "mainTutorialDisplayQueue");
        Context context2 = context;
        C2668g.b(context2, "context");
        C9833a c9833a2 = c9833a;
        C2668g.b(c9833a2, "tooltipRequestFactory");
        C11705c c11705c2 = c11705c;
        C2668g.b(c11705c2, "shouldShowFeedTooltip");
        AbTestUtility abTestUtility2 = abTestUtility;
        C2668g.b(abTestUtility2, "abTestUtility");
        C15679f c15679f3 = c15679f;
        C2668g.b(c15679f3, "ioScheduler");
        C15679f c15679f4 = c15679f2;
        C2668g.b(c15679f4, "mainThreadScheduler");
        return new C13269a(c9835c2, context2, c9833a2, c11705c2, abTestUtility2, c15679f3, c15679f4);
    }

    @NotNull
    @Provides
    /* renamed from: a */
    public final C9833a m35222a(@NotNull Lazy<MainTabTooltipOwner> lazy) {
        C2668g.b(lazy, "mainTabTooltipOwner");
        return new C9833a(lazy);
    }

    @NotNull
    @Provides
    /* renamed from: a */
    public final MainTabTooltipOwner m35221a(@NotNull Lazy<C13390c> lazy, @NotNull C11125b c11125b) {
        C2668g.b(lazy, "mainView");
        C2668g.b(c11125b, "addSessionNotificationEvent");
        lazy = lazy.get();
        C2668g.a(lazy, "mainView.get()");
        return new C13268a((MainTabTooltipOwner) lazy, c11125b);
    }

    @NotNull
    @Provides
    /* renamed from: a */
    public final IsUserDueForFeedTooltip m35219a(@NotNull LastActivityDateRepository lastActivityDateRepository, @NotNull @DefaultDateTimeProvider Function0<DateTime> function0, @NotNull AbTestUtility abTestUtility) {
        C2668g.b(lastActivityDateRepository, "lastActivityDateRepository");
        C2668g.b(function0, "dateTimeProvider");
        C2668g.b(abTestUtility, "abTestUtility");
        return new IsUserDueForFeedTooltip(lastActivityDateRepository, function0, abTestUtility.getFeedTooltipDaysInactive());
    }
}
