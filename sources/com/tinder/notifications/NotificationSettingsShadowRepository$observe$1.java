package com.tinder.notifications;

import com.tinder.domain.common.model.Subscription;
import com.tinder.domain.pushnotifications.model.PushNotificationSetting;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C15825i;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.FunctionReference;
import kotlin.reflect.KDeclarationContainer;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u001b\u0010\u0003\u001a\u0017\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u00062\u0015\u0010\u0007\u001a\u00110\b¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\t¢\u0006\u0002\b\n"}, d2 = {"<anonymous>", "", "Lcom/tinder/domain/pushnotifications/model/PushNotificationSetting;", "p1", "Lkotlin/ParameterName;", "name", "notificationSet", "p2", "Lcom/tinder/domain/common/model/Subscription;", "subscription", "invoke"}, k = 3, mv = {1, 1, 10})
final class NotificationSettingsShadowRepository$observe$1 extends FunctionReference implements Function2<Set<? extends PushNotificationSetting>, Subscription, Set<? extends PushNotificationSetting>> {
    NotificationSettingsShadowRepository$observe$1(C9943c c9943c) {
        super(2, c9943c);
    }

    public final String getName() {
        return "filterOutGoldItemsIfNonSubscriber";
    }

    public final KDeclarationContainer getOwner() {
        return C15825i.a(C9943c.class);
    }

    public final String getSignature() {
        return "filterOutGoldItemsIfNonSubscriber(Ljava/util/Set;Lcom/tinder/domain/common/model/Subscription;)Ljava/util/Set;";
    }

    public /* synthetic */ Object invoke(Object obj, Object obj2) {
        return m54438a((Set) obj, (Subscription) obj2);
    }

    @NotNull
    /* renamed from: a */
    public final Set<PushNotificationSetting> m54438a(@NotNull Set<? extends PushNotificationSetting> set, @NotNull Subscription subscription) {
        C2668g.b(set, "p1");
        C2668g.b(subscription, "p2");
        return ((C9943c) this.receiver).m40912a(set, subscription);
    }
}
