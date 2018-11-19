package com.snapchat.kit.sdk.core.metrics.business;

import com.snapchat.kit.sdk.core.metrics.model.KitEventBase;
import com.snapchat.kit.sdk.core.metrics.model.KitType;
import com.snapchat.kit.sdk.core.networking.C5945b;
import java.util.Locale;
import javax.inject.Inject;
import javax.inject.Named;

public class KitEventBaseFactory {
    /* renamed from: a */
    private final String f21714a;

    @Inject
    KitEventBaseFactory(@Named("client_id") String str) {
        this.f21714a = str;
    }

    public KitEventBase createKitEventBase(KitType kitType, String str) {
        return KitEventBase.newBuilder().setKitVariant(kitType).setKitVariantVersion(str).setOauthClientId(this.f21714a).setKitUserAgent(C5945b.f21771a).setLocale(m25534a()).setKitClientTimestampMillis(System.currentTimeMillis()).build();
    }

    /* renamed from: a */
    private static String m25534a() {
        Locale locale = Locale.getDefault();
        if (locale == null) {
            return "";
        }
        return locale.toString();
    }
}
