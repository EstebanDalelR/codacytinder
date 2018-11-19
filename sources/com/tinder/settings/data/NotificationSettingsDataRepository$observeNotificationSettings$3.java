package com.tinder.settings.data;

import com.tinder.domain.pushnotifications.model.PushNotificationSetting;
import io.reactivex.C3960g;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C15825i;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.FunctionReference;
import kotlin.reflect.KDeclarationContainer;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u00012\u001b\u0010\u0004\u001a\u0017\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b¢\u0006\u0002\b\t"}, d2 = {"<anonymous>", "Lio/reactivex/Single;", "", "Lcom/tinder/domain/pushnotifications/model/PushNotificationSetting;", "p1", "", "Lkotlin/ParameterName;", "name", "pushNotificationSettings", "invoke"}, k = 3, mv = {1, 1, 10})
final class NotificationSettingsDataRepository$observeNotificationSettings$3 extends FunctionReference implements Function1<Set<? extends PushNotificationSetting>, C3960g<Set<PushNotificationSetting>>> {
    NotificationSettingsDataRepository$observeNotificationSettings$3(C16626c c16626c) {
        super(1, c16626c);
    }

    public final String getName() {
        return "filterPlacesNotification";
    }

    public final KDeclarationContainer getOwner() {
        return C15825i.m59860a(C16626c.class);
    }

    public final String getSignature() {
        return "filterPlacesNotification(Ljava/util/Set;)Lio/reactivex/Single;";
    }

    public /* synthetic */ Object invoke(Object obj) {
        return m68122a((Set) obj);
    }

    @NotNull
    /* renamed from: a */
    public final C3960g<Set<PushNotificationSetting>> m68122a(@NotNull Set<? extends PushNotificationSetting> set) {
        C2668g.b(set, "p1");
        return ((C16626c) this.receiver).m62080e((Set) set);
    }
}
