package com.tinder.notifications;

import com.tinder.domain.common.model.Subscription;
import com.tinder.domain.purchase.SubscriptionProvider;
import com.tinder.domain.pushnotifications.model.PushNotificationSetting;
import com.tinder.domain.utils.RxJavaInteropExtKt;
import io.reactivex.C3959e;
import io.reactivex.subjects.C19040a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C19301m;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J$\u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\f\u001a\u00020\rH\u0002J\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\b0\u0007J\u0012\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0010J\u0014\u0010\u0011\u001a\u00020\u00122\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\b0\u0007RJ\u0010\u0005\u001a>\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\b \t*\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00070\u0007 \t*\u001e\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\b \t*\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00070\u0007\u0018\u00010\u00060\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/tinder/notifications/NotificationSettingsShadowRepository;", "", "subscriptionProvider", "Lcom/tinder/domain/purchase/SubscriptionProvider;", "(Lcom/tinder/domain/purchase/SubscriptionProvider;)V", "notificationSettingsBehaviorSubject", "Lio/reactivex/subjects/BehaviorSubject;", "", "Lcom/tinder/domain/pushnotifications/model/PushNotificationSetting;", "kotlin.jvm.PlatformType", "filterOutGoldItemsIfNonSubscriber", "notificationSet", "subscription", "Lcom/tinder/domain/common/model/Subscription;", "get", "observe", "Lio/reactivex/Observable;", "update", "", "notificationSettings", "settings-notifications_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.notifications.c */
public final class C9943c {
    /* renamed from: a */
    private final C19040a<Set<PushNotificationSetting>> f32777a = C19040a.a();
    /* renamed from: b */
    private final SubscriptionProvider f32778b;

    @Inject
    public C9943c(@NotNull SubscriptionProvider subscriptionProvider) {
        C2668g.b(subscriptionProvider, "subscriptionProvider");
        this.f32778b = subscriptionProvider;
    }

    @NotNull
    /* renamed from: a */
    public final C3959e<Set<PushNotificationSetting>> m40913a() {
        C3959e<Set<PushNotificationSetting>> combineLatest = C3959e.combineLatest(this.f32777a.hide(), RxJavaInteropExtKt.toV2Observable(this.f32778b.observe()), new C12146d(new NotificationSettingsShadowRepository$observe$1(this)));
        C2668g.a(combineLatest, "Observable.combineLatest…fNonSubscriber)\n        )");
        return combineLatest;
    }

    /* renamed from: a */
    private final Set<PushNotificationSetting> m40912a(Set<? extends PushNotificationSetting> set, Subscription subscription) {
        if (subscription.isGold() != null) {
            return set;
        }
        Collection collection = (Collection) new ArrayList();
        for (Object next : set) {
            if ((((PushNotificationSetting) next).getType().requiresGold() ^ 1) != 0) {
                collection.add(next);
            }
        }
        return C19301m.n((List) collection);
    }

    @NotNull
    /* renamed from: b */
    public final Set<PushNotificationSetting> m40915b() {
        C19040a c19040a = this.f32777a;
        C2668g.a(c19040a, "notificationSettingsBehaviorSubject");
        Object b = c19040a.b();
        C2668g.a(b, "notificationSettingsBehaviorSubject.value");
        return (Set) b;
    }

    /* renamed from: a */
    public final void m40914a(@NotNull Set<? extends PushNotificationSetting> set) {
        C2668g.b(set, "notificationSettings");
        this.f32777a.onNext(set);
    }
}
