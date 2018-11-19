package com.foursquare.pilgrim;

import android.content.Context;
import com.evernote.android.job.C1139e;
import com.foursquare.internal.util.FsLog;
import com.foursquare.pilgrim.PilgrimSdk.LogLevel;

final class at {
    /* renamed from: a */
    private static final String f5308a = "at";
    /* renamed from: b */
    private final Context f5309b;

    at(Context context) {
        this.f5309b = context;
    }

    /* renamed from: a */
    void m6972a(boolean z, boolean z2, boolean z3) {
        FsLog.m6800a(f5308a, "Doing boot service work!");
        try {
            be beVar = new be(this.f5309b);
            StringBuilder stringBuilder = new StringBuilder();
            if (z2) {
                m6970a(this.f5309b, beVar);
            }
            if (!z) {
                m6970a(this.f5309b, beVar);
            }
            if (z3) {
                stringBuilder.append("\n  Clearing the motion state");
                am.m6942c(this.f5309b);
            }
            if (z && bh.m7123c()) {
                m6971a(this.f5309b, beVar, stringBuilder);
            }
            C1979c.m7163a(stringBuilder.toString());
        } catch (boolean z4) {
            PilgrimSdk.get().log(LogLevel.ERROR, "Exception in doRegistration()", z4);
        }
    }

    /* renamed from: a */
    private void m6970a(Context context, be beVar) {
        beVar.m13357a(context);
        bd.m7084a((bd) beVar);
        context = C1139e.m3819a();
        context.m3836c("EvernoteStillSailingDailyJob");
        context.m3836c("EvernotePilgrimReportDailyJob");
        context.m3836c("EvernotePeriodicLocationRefreshJob");
        context.m3836c("EvernoteFailedVisitJob");
    }

    /* renamed from: a */
    private void m6971a(Context context, be beVar, StringBuilder stringBuilder) {
        if (!be.m13348b(context)) {
            beVar.m13358a(context, ax.m7003a().m7034d(), ax.m7003a().m7037g() != null ? (long) ax.m7003a().m7037g().getFastestIntervalInSeconds() : 60);
            bd.m7084a((bd) beVar);
            stringBuilder.append(beVar.m7087b("  "));
            context = beVar.f10632b;
        }
        C3561m.m13410a().m3756D();
        if (ax.m7003a().m7053w() != null) {
            C4231s.m16805a();
        }
        if (C1971b.m7063b() != null || ax.m7003a().m7047q() != null) {
            C4232t.m16806a();
        }
    }
}
