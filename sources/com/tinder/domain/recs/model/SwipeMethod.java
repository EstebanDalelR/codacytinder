package com.tinder.domain.recs.model;

import com.tinder.domain.recs.model.Swipe.Method;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002B\u000f\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0011"}, d2 = {"Lcom/tinder/domain/recs/model/SwipeMethod;", "", "Lcom/tinder/domain/recs/model/Swipe$Method;", "analyticsValue", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getAnalyticsValue", "()Ljava/lang/String;", "CARD", "GAMEPAD_BUTTON", "AD_CLICK", "TOP_PICKS_GRID", "TOP_PICKS_PROFILE", "FASTMATCH_GRID", "FASTMATCH_PROFILE", "PLACES_STREAM", "PLACES_PROFILE", "domain_release"}, k = 1, mv = {1, 1, 10})
public enum SwipeMethod implements Method {
    ;
    
    @NotNull
    private final String analyticsValue;

    protected SwipeMethod(String str) {
        C2668g.b(str, "analyticsValue");
        this.analyticsValue = str;
    }

    @NotNull
    public final String getAnalyticsValue() {
        return this.analyticsValue;
    }
}
