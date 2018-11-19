package com.foursquare.pilgrim;

import android.content.Context;
import android.content.Intent;
import android.location.Location;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.WakefulBroadcastReceiver;
import com.foursquare.api.FoursquareLocation;
import com.foursquare.internal.util.CollectionUtils;
import com.foursquare.internal.util.FsLog;
import com.foursquare.internal.util.Func1;
import com.google.android.gms.location.LocationResult;
import java.util.Collections;
import java.util.List;

public class ReceiverPilgrimLocationClientFire extends WakefulBroadcastReceiver {
    public static final String TAG = "ReceiverPilgrimLocationClientFire";

    /* renamed from: com.foursquare.pilgrim.ReceiverPilgrimLocationClientFire$1 */
    class C35111 implements Func1<Location, FoursquareLocation> {
        C35111() {
        }

        public /* synthetic */ Object call(Object obj) {
            return m13296a((Location) obj);
        }

        /* renamed from: a */
        public FoursquareLocation m13296a(Location location) {
            if (location != null && location.getTime() > 0) {
                return new FoursquareLocation(location);
            }
            return null;
        }
    }

    public void onReceive(Context context, Intent intent) {
        String str = TAG;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(TAG);
        stringBuilder.append(" fired!");
        FsLog.m6800a(str, stringBuilder.toString());
        try {
            if (!C1971b.m7063b()) {
                if (!ax.m7003a().m7047q()) {
                    Intent intent2 = new Intent(context, PilgrimLocationClientFireService.class);
                    intent2.putExtras(intent);
                    C1993z.m7175a(context, intent2);
                }
            }
            List a = m13297a(intent);
            if (a.isEmpty() == null) {
                C3564n.m13412a(a).m3756D();
            }
        } catch (Context context2) {
            new RealExceptionReporter().reportException(context2);
        }
    }

    @NonNull
    /* renamed from: a */
    private static List<FoursquareLocation> m13297a(@Nullable Intent intent) {
        intent = LocationResult.extractResult(intent);
        if (intent == null) {
            return Collections.emptyList();
        }
        return CollectionUtils.m6794b(Collections.singletonList(intent.getLastLocation()), new C35111());
    }
}
