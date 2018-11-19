package com.tinder.data.meta.p226a;

import com.tinder.api.model.meta.Meta.Globals;
import com.tinder.data.adapter.C2646o;
import com.tinder.domain.meta.model.TopPicksSettings;
import kotlin.Metadata;
import kotlin.collections.ae;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007\b\u0007¢\u0006\u0002\u0010\u0004J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0006\u001a\u00020\u0003H\u0016¨\u0006\u0007"}, d2 = {"Lcom/tinder/data/meta/adapter/TopPicksSettingsAdapter;", "Lcom/tinder/data/adapter/DomainApiAdapter;", "Lcom/tinder/domain/meta/model/TopPicksSettings;", "Lcom/tinder/api/model/meta/Meta$Globals;", "()V", "fromApi", "apiModel", "data_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.data.meta.a.p */
public final class C10850p extends C2646o<TopPicksSettings, Globals> {
    @Nullable
    /* renamed from: a */
    public TopPicksSettings m43328a(@NotNull Globals globals) {
        C2668g.b(globals, "apiModel");
        Boolean isTopPicksEnabled = globals.isTopPicksEnabled();
        if (isTopPicksEnabled == null) {
            isTopPicksEnabled = Boolean.valueOf(false);
        }
        boolean booleanValue = isTopPicksEnabled.booleanValue();
        Boolean topPicksLocalDailyNotificationsEnabled = globals.topPicksLocalDailyNotificationsEnabled();
        if (topPicksLocalDailyNotificationsEnabled == null) {
            topPicksLocalDailyNotificationsEnabled = Boolean.valueOf(false);
        }
        boolean booleanValue2 = topPicksLocalDailyNotificationsEnabled.booleanValue();
        String topPicksLocalNotificationMessage = globals.topPicksLocalNotificationMessage();
        if (topPicksLocalNotificationMessage == null) {
            topPicksLocalNotificationMessage = "";
        }
        globals = globals.topPicksLocalDailyOffsets();
        if (globals == null) {
            globals = ae.a();
        }
        return new TopPicksSettings(booleanValue, booleanValue2, topPicksLocalNotificationMessage, globals);
    }
}
