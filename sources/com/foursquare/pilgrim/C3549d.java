package com.foursquare.pilgrim;

import android.support.annotation.Nullable;
import com.foursquare.api.types.FoursquareType;
import com.foursquare.api.types.NotificationConfig;
import com.foursquare.api.types.PilgrimConfig;
import com.google.gson.annotations.SerializedName;

/* renamed from: com.foursquare.pilgrim.d */
class C3549d implements FoursquareType {
    @SerializedName("shutdown")
    /* renamed from: a */
    private boolean f10642a;
    @SerializedName("matchedTrigger")
    /* renamed from: b */
    private boolean f10643b;
    @Nullable
    @SerializedName("pilgrimConfig")
    /* renamed from: c */
    private PilgrimConfig f10644c;
    @Nullable
    @SerializedName("notificationConfig")
    /* renamed from: d */
    private NotificationConfig f10645d;

    C3549d() {
    }

    /* renamed from: a */
    boolean m13375a() {
        return this.f10642a;
    }

    /* renamed from: b */
    boolean m13376b() {
        return this.f10643b;
    }

    @Nullable
    /* renamed from: c */
    PilgrimConfig m13377c() {
        return this.f10644c;
    }

    @Nullable
    /* renamed from: d */
    NotificationConfig m13378d() {
        return this.f10645d;
    }
}
