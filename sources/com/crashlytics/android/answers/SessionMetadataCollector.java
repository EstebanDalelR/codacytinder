package com.crashlytics.android.answers;

import android.content.Context;
import io.fabric.sdk.android.services.common.CommonUtils;
import io.fabric.sdk.android.services.common.IdManager;
import io.fabric.sdk.android.services.common.IdManager.DeviceIdentifierType;
import java.util.Map;
import java.util.UUID;

class SessionMetadataCollector {
    private final Context context;
    private final IdManager idManager;
    private final String versionCode;
    private final String versionName;

    public SessionMetadataCollector(Context context, IdManager idManager, String str, String str2) {
        this.context = context;
        this.idManager = idManager;
        this.versionCode = str;
        this.versionName = str2;
    }

    public SessionEventMetadata getMetadata() {
        Map h = this.idManager.h();
        return new SessionEventMetadata(this.idManager.c(), UUID.randomUUID().toString(), this.idManager.b(), this.idManager.j(), (String) h.get(DeviceIdentifierType.FONT_TOKEN), CommonUtils.m(this.context), this.idManager.d(), this.idManager.g(), this.versionCode, this.versionName);
    }
}
