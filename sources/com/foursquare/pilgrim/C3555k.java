package com.foursquare.pilgrim;

import android.location.Location;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.evernote.android.job.Job;
import com.evernote.android.job.Job.C1125a;
import com.evernote.android.job.Job.Result;
import com.evernote.android.job.JobRequest;
import com.evernote.android.job.JobRequest.C1129a;
import com.evernote.android.job.util.support.C1152b;
import com.foursquare.api.Add3rdPartyCheckinParams;
import com.foursquare.api.Add3rdPartyCheckinParams.VenueIdType;
import com.foursquare.api.FoursquareLocation;
import com.foursquare.internal.api.C1913a;
import com.foursquare.internal.network.C1923d;
import com.foursquare.internal.network.C1928e;
import com.google.android.gms.location.C4486f;
import java.util.Date;
import java.util.concurrent.TimeUnit;

/* renamed from: com.foursquare.pilgrim.k */
final class C3555k extends Job {
    C3555k() {
    }

    @NonNull
    /* renamed from: a */
    public static JobRequest m13402a(@NonNull String str, @NonNull VenueIdType venueIdType, @Nullable CurrentPlace currentPlace) {
        String str2;
        C1152b c1152b = new C1152b();
        c1152b.m3934a("EvernoteAdd3rdPartyCheckinJob.KEY_VENUE_ID", str);
        c1152b.m3934a("EvernoteAdd3rdPartyCheckinJob.KEY_VENUE_ID_TYPE", C1913a.m6647a().toJson(venueIdType));
        str = "EvernoteAdd3rdPartyCheckinJob.KEY_CURRENT_PLACE_PILGRIM_VISIT_ID";
        if (currentPlace == null) {
            str2 = null;
        } else {
            str2 = currentPlace.getPilgrimVisitId();
        }
        c1152b.m3934a(str, str2);
        return new C1129a("EvernoteAdd3rdPartyCheckinJob").m3739a(TimeUnit.MINUTES.toMillis(1), TimeUnit.MINUTES.toMillis(60)).m3741a(c1152b).m3747b();
    }

    @NonNull
    protected Result onRunJob(@NonNull C1125a c1125a) {
        c1125a = c1125a.m3694e();
        Object b = c1125a.m3938b("EvernoteAdd3rdPartyCheckinJob.KEY_VENUE_ID", null);
        if (TextUtils.isEmpty(b)) {
            return Result.FAILURE;
        }
        VenueIdType venueIdType = (VenueIdType) C1913a.m6647a().fromJson(c1125a.m3938b("EvernoteAdd3rdPartyCheckinJob.KEY_VENUE_ID_TYPE", null), VenueIdType.class);
        if (venueIdType == null) {
            return Result.FAILURE;
        }
        bg a = bj.m7138a(C4486f.a(getContext()).g());
        if (a.m7105b()) {
            return Result.RESCHEDULE;
        }
        if (C1928e.m6757a().m6763b(bf.m7089a().m7091a(Add3rdPartyCheckinParams.newBuilder().venueId(b).venueIdType(venueIdType).now(new Date()).pilgrimVisitId(c1125a.m3938b("EvernoteAdd3rdPartyCheckinJob.KEY_CURRENT_PLACE_PILGRIM_VISIT_ID", null)).wifiScan(C1923d.m6723a().m6741f()).ll(new FoursquareLocation((Location) a.m7103a(new IllegalStateException("updateLocationResult was an err")))).build())).m6777f() != null) {
            return Result.SUCCESS;
        }
        return Result.RESCHEDULE;
    }
}
