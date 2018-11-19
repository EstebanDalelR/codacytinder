package com.tinder.data.p218g.p219a;

import com.tinder.api.model.settings.PushSettings;
import com.tinder.domain.pushnotifications.model.LikesYouPushNotificationSetting;
import com.tinder.domain.pushnotifications.model.PushNotificationSetting;
import com.tinder.domain.pushnotifications.model.PushNotificationType;
import com.tinder.domain.pushnotifications.model.SimplePushNotificationSetting;
import java.util.Map;
import java.util.Set;
import kotlin.C15811g;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.ae;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007\b\u0007¢\u0006\u0002\u0010\u0002J\u0014\u0010\u0003\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¨\u0006\b"}, d2 = {"Lcom/tinder/data/settings/adapter/PushSettingsDomainApiAdapter;", "", "()V", "toApi", "Lcom/tinder/api/model/settings/PushSettings;", "pushNotificationSettings", "", "Lcom/tinder/domain/pushnotifications/model/PushNotificationSetting;", "data_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.data.g.a.a */
public final class C8663a {
    @NotNull
    /* renamed from: a */
    public final PushSettings m36934a(@NotNull Set<? extends PushNotificationSetting> set) {
        C2668g.b(set, "pushNotificationSettings");
        Integer num = (Integer) null;
        Map b = ae.b(new Pair[]{C15811g.a(PushNotificationType.NEW_MATCHES, null), C15811g.a(PushNotificationType.MESSAGES, null), C15811g.a(PushNotificationType.SUPER_LIKES, null), C15811g.a(PushNotificationType.MESSAGE_LIKES, null), C15811g.a(PushNotificationType.TOP_PICKS, null), C15811g.a(PushNotificationType.PLACES, null)});
        while (true) {
            Integer num2 = num;
            for (PushNotificationSetting pushNotificationSetting : set) {
                if (pushNotificationSetting instanceof SimplePushNotificationSetting) {
                    SimplePushNotificationSetting simplePushNotificationSetting = (SimplePushNotificationSetting) pushNotificationSetting;
                    b.put(simplePushNotificationSetting.getPushNotificationType(), Boolean.valueOf(simplePushNotificationSetting.getEnabled()));
                } else if (pushNotificationSetting instanceof LikesYouPushNotificationSetting) {
                    num = Integer.valueOf(((LikesYouPushNotificationSetting) pushNotificationSetting).getFrequency());
                }
            }
            return new PushSettings((Boolean) b.get(PushNotificationType.NEW_MATCHES), (Boolean) b.get(PushNotificationType.MESSAGES), (Boolean) b.get(PushNotificationType.SUPER_LIKES), (Boolean) b.get(PushNotificationType.MESSAGE_LIKES), num2, (Boolean) b.get(PushNotificationType.TOP_PICKS), (Boolean) b.get(PushNotificationType.PLACES));
        }
    }
}
