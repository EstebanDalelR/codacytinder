package com.tinder.recsads.model;

import com.tinder.addy.tracker.TrackingUrl.EventType;
import com.tinder.api.ManagerWebServices;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002B\u000f\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\b\u0010\u0003\u001a\u00020\u0004H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/tinder/recsads/model/RecsAdTrackingEvent;", "", "Lcom/tinder/addy/tracker/TrackingUrl$EventType;", "token", "", "(Ljava/lang/String;ILjava/lang/String;)V", "SWIPE", "IMPRESSION", "CLICK", "recs-ads_release"}, k = 1, mv = {1, 1, 10})
public enum RecsAdTrackingEvent implements EventType {
    ;
    
    private final String token;

    protected RecsAdTrackingEvent(String str) {
        C2668g.b(str, ManagerWebServices.PARAM_TOKEN);
        this.token = str;
    }

    @NotNull
    public String token() {
        return this.token;
    }
}
