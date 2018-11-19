package com.foursquare.pilgrim;

import android.annotation.SuppressLint;
import android.content.Context;
import android.location.Location;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.WorkerThread;
import com.foursquare.api.FoursquareLocation;
import com.foursquare.internal.util.CollectionUtils;
import com.foursquare.internal.util.Func1;

final class ao {
    @Nullable
    @SuppressLint({"StaticFieldLeak"})
    /* renamed from: a */
    private static ao f5303a;
    @NonNull
    /* renamed from: b */
    private final Context f5304b;

    /* renamed from: com.foursquare.pilgrim.ao$1 */
    class C35271 implements Func1<Location, FoursquareLocation> {
        /* renamed from: a */
        final /* synthetic */ ao f10615a;

        C35271(ao aoVar) {
            this.f10615a = aoVar;
        }

        public /* synthetic */ Object call(Object obj) {
            return m13318a((Location) obj);
        }

        /* renamed from: a */
        public FoursquareLocation m13318a(Location location) {
            return new FoursquareLocation(location);
        }
    }

    @NonNull
    /* renamed from: a */
    static ao m6944a() {
        ao aoVar = f5303a;
        if (aoVar != null) {
            return aoVar;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(ao.class.getSimpleName());
        stringBuilder.append(" not initialized yet");
        throw new IllegalStateException(stringBuilder.toString());
    }

    /* renamed from: a */
    static void m6945a(@NonNull Context context) {
        f5303a = new ao(context);
    }

    private ao(@NonNull Context context) {
        this.f5304b = context;
    }

    @WorkerThread
    /* renamed from: a */
    boolean m6947a(@NonNull Iterable<Location> iterable, @NonNull BackgroundWakeupSource backgroundWakeupSource) {
        return m6948b(CollectionUtils.m6790a((Iterable) iterable, new C35271(this)), backgroundWakeupSource);
    }

    @WorkerThread
    /* renamed from: b */
    boolean m6948b(@NonNull Iterable<FoursquareLocation> iterable, @NonNull BackgroundWakeupSource backgroundWakeupSource) {
        for (FoursquareLocation a : iterable) {
            try {
                m6946a(a, backgroundWakeupSource);
            } catch (Iterable<FoursquareLocation> iterable2) {
                new RealExceptionReporter().reportException(iterable2);
                return null;
            }
        }
        return true;
    }

    @WorkerThread
    /* renamed from: a */
    private void m6946a(@NonNull FoursquareLocation foursquareLocation, @NonNull BackgroundWakeupSource backgroundWakeupSource) throws Exception {
        aj.m6921a().m6927c().m7164a(this.f5304b, foursquareLocation, backgroundWakeupSource);
    }
}
