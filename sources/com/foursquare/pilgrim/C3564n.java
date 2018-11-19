package com.foursquare.pilgrim;

import android.support.annotation.NonNull;
import com.evernote.android.job.Job;
import com.evernote.android.job.Job.C1125a;
import com.evernote.android.job.Job.Result;
import com.evernote.android.job.JobRequest;
import com.evernote.android.job.JobRequest.C1129a;
import com.evernote.android.job.util.support.C1152b;
import com.foursquare.api.FoursquareLocation;
import com.foursquare.internal.api.C1913a;
import com.google.gson.reflect.TypeToken;
import java.util.List;

/* renamed from: com.foursquare.pilgrim.n */
final class C3564n extends Job {

    /* renamed from: com.foursquare.pilgrim.n$1 */
    class C35621 extends TypeToken<List<FoursquareLocation>> {
        C35621() {
        }
    }

    /* renamed from: com.foursquare.pilgrim.n$2 */
    class C35632 extends TypeToken<List<FoursquareLocation>> {
        C35632() {
        }
    }

    C3564n() {
    }

    @NonNull
    /* renamed from: a */
    static JobRequest m13412a(@NonNull List<FoursquareLocation> list) {
        C1152b c1152b = new C1152b();
        c1152b.m3934a("EvernoteFusedLocationUpdateReceivedJob.EXTRA_LOCATIONS", C1913a.m6653a((Object) list, new C35621()));
        return new C1129a("EvernoteFusedLocationUpdateReceivedJob").m3741a(c1152b).m3737a().m3747b();
    }

    @NonNull
    protected Result onRunJob(@NonNull C1125a c1125a) {
        Iterable a = C3564n.m13413a(c1125a);
        if (a.isEmpty()) {
            return Result.FAILURE;
        }
        if (ao.m6944a().m6948b(a, BackgroundWakeupSource.FUSED_CONTINUOUS)) {
            return Result.SUCCESS;
        }
        if (c1125a.m3693d() < 3) {
            return Result.RESCHEDULE;
        }
        return Result.FAILURE;
    }

    @NonNull
    /* renamed from: a */
    private static List<FoursquareLocation> m13413a(@NonNull C1125a c1125a) {
        String b = c1125a.m3694e().m3938b("EvernoteFusedLocationUpdateReceivedJob.EXTRA_LOCATIONS", null);
        if (b != null) {
            return (List) C1913a.m6649a(b, new C35632());
        }
        throw new IllegalArgumentException("Need to pass required param EvernoteFusedLocationUpdateReceivedJob.EXTRA_LOCATIONS");
    }
}
