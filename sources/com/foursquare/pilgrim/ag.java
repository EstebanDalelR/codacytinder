package com.foursquare.pilgrim;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.VisibleForTesting;
import com.foursquare.api.types.NotificationConfig;
import com.foursquare.api.types.NotificationConfig.NotificationTrigger;
import com.foursquare.internal.util.C1940b;
import com.foursquare.pilgrim.Trigger.Builder;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

final class ag {
    /* renamed from: a */
    private static ag f5286a;
    @NonNull
    /* renamed from: b */
    private NotificationConfig f5287b;
    /* renamed from: c */
    private List<Trigger> f5288c;

    @NonNull
    /* renamed from: a */
    static synchronized ag m6911a(@NonNull Context context) {
        synchronized (ag.class) {
            if (f5286a == null) {
                f5286a = new ag((NotificationConfig) ah.m6919a((NotificationConfig) C1940b.m6813a(context, "cbh.json", 0, TypeToken.get(NotificationConfig.class), false), new NotificationConfig()));
            }
            context = f5286a;
        }
        return context;
    }

    @VisibleForTesting
    ag(@NonNull NotificationConfig notificationConfig) {
        this.f5287b = notificationConfig;
        m6912a();
    }

    /* renamed from: a */
    private void m6912a() {
        if (this.f5287b.getTriggers() == null) {
            this.f5288c = new ArrayList();
            this.f5288c.add(new Builder().type(TriggerPlaceType.ALL).minConfidence(Confidence.MEDIUM).build());
            return;
        }
        this.f5288c = new ArrayList();
        Iterator it = this.f5287b.getTriggers().iterator();
        while (it.hasNext()) {
            Iterator it2;
            NotificationTrigger notificationTrigger = (NotificationTrigger) it.next();
            Builder minConfidence = new Builder().minConfidence(Confidence.fromString(notificationTrigger.getMinConfidence()));
            if (notificationTrigger.getCategoryIds() != null) {
                minConfidence = minConfidence.type(TriggerPlaceType.CATEGORY);
                it2 = notificationTrigger.getCategoryIds().iterator();
                while (it2.hasNext()) {
                    this.f5288c.add(minConfidence.id((String) it2.next()).build());
                }
            }
            if (notificationTrigger.getChainIds() != null) {
                minConfidence = minConfidence.type(TriggerPlaceType.CHAIN);
                it2 = notificationTrigger.getChainIds().iterator();
                while (it2.hasNext()) {
                    this.f5288c.add(minConfidence.id((String) it2.next()).build());
                }
            }
            if (notificationTrigger.getVenueIds() != null) {
                minConfidence = minConfidence.type(TriggerPlaceType.PLACE);
                it2 = notificationTrigger.getVenueIds().iterator();
                while (it2.hasNext()) {
                    this.f5288c.add(minConfidence.id((String) it2.next()).build());
                }
            }
            if (notificationTrigger.getCategoryIds() == null && notificationTrigger.getVenueIds() == null && notificationTrigger.getChainIds() == null) {
                this.f5288c.add(minConfidence.type(TriggerPlaceType.ALL).build());
            }
        }
    }

    /* renamed from: a */
    void m6913a(@NonNull Context context, @NonNull NotificationConfig notificationConfig) {
        this.f5287b = notificationConfig;
        m6912a();
        C1940b.m6820a(context, "cbh.json", 0, this.f5287b, (Type) NotificationConfig.class);
    }

    /* renamed from: a */
    boolean m6914a(CurrentPlace currentPlace) {
        return m6915a(currentPlace, this.f5287b, this.f5288c);
    }

    /* renamed from: a */
    protected boolean m6915a(CurrentPlace currentPlace, @NonNull NotificationConfig notificationConfig, List<Trigger> list) {
        if (!notificationConfig.shouldNotifyOnExit() && currentPlace.hasExited()) {
            return false;
        }
        if (currentPlace.getType().isHomeOrWork() && ((currentPlace.getType() == RegionType.HOME && notificationConfig.shouldNotifyAtHome()) || (currentPlace.getType() == RegionType.WORK && notificationConfig.shouldNotifyAtWork() != null))) {
            return true;
        }
        while (true) {
            list = null;
            for (Trigger trigger : list) {
                if (list != null || trigger.m6884a(currentPlace.getVenue(), currentPlace.getConfidence()) != null) {
                    boolean z = true;
                }
            }
            return list;
        }
    }
}
