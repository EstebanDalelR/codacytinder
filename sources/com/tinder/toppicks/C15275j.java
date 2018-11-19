package com.tinder.toppicks;

import kotlin.Metadata;
import org.joda.time.DateTime;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0007¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004¨\u0006\u0007"}, d2 = {"Lcom/tinder/toppicks/TopPicksTimeSyncDelayCalculator;", "", "()V", "calculateFromExpirationTime", "", "currentTime", "delayTargetTime", "toppicks_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.toppicks.j */
public final class C15275j {
    /* renamed from: a */
    public final long m57384a(long j, long j2) {
        long f = ((long) new DateTime(j2).f().f()) - ((long) new DateTime(j).f().f());
        return f < 0 ? f + 60 : f;
    }
}
