package com.foursquare.pilgrim;

import android.support.annotation.NonNull;
import android.support.annotation.RestrictTo;
import android.support.annotation.RestrictTo.Scope;
import com.foursquare.api.types.PilgrimEvent.Builder;
import com.foursquare.api.types.PilgrimEvent.EventLevel;
import com.foursquare.internal.api.C1913a;
import com.foursquare.internal.network.C1928e;
import com.foursquare.internal.util.CollectionUtils;
import com.foursquare.internal.util.Func1;
import com.foursquare.pilgrim.PilgrimSdk.LogLevel;
import com.google.gson.reflect.TypeToken;
import java.util.Date;
import java.util.List;

@RestrictTo({Scope.LIBRARY_GROUP})
public class RealExceptionReporter implements C1986v {

    /* renamed from: com.foursquare.pilgrim.RealExceptionReporter$1 */
    class C35091 extends TypeToken<List<DebugLogItem>> {
        /* renamed from: a */
        final /* synthetic */ RealExceptionReporter f10593a;

        C35091(RealExceptionReporter realExceptionReporter) {
            this.f10593a = realExceptionReporter;
        }
    }

    /* renamed from: com.foursquare.pilgrim.RealExceptionReporter$2 */
    class C35102 implements Func1<DebugLogItem, Boolean> {
        C35102() {
        }

        public /* synthetic */ Object call(Object obj) {
            return m13294a((DebugLogItem) obj);
        }

        /* renamed from: a */
        public Boolean m13294a(DebugLogItem debugLogItem) {
            return Boolean.valueOf(debugLogItem.level == LogLevel.ERROR ? true : null);
        }
    }

    public void reportException(Exception exception) {
        if (!(exception instanceof C1992y)) {
            if (!(exception instanceof IllegalAccessException)) {
                if (ax.m7003a().m7053w()) {
                    aq.m6961a(new Builder().timestamp(System.currentTimeMillis()).level(EventLevel.ERROR).message(exception.getMessage()).pilgrimExceptions(aq.m6960a(exception)).build());
                    return;
                }
                Date date = new Date();
                if ((bh.m7120c(date) > 5 ? 1 : null) == null) {
                    bh.m7125d(date);
                    C1928e.m6757a().m6760a(bf.m7089a().m7097a((Throwable) exception, C1913a.m6653a(m13295a(), new C35091(this))));
                }
            }
        }
    }

    @NonNull
    /* renamed from: a */
    private static List<DebugLogItem> m13295a() {
        return CollectionUtils.m6789a(CollectionUtils.m6797c(PilgrimSdk.getLogs(), new C35102()), 5);
    }
}
