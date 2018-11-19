package com.foursquare.pilgrim;

import android.content.Context;
import android.support.annotation.NonNull;
import com.foursquare.api.FoursquareLocation;
import com.foursquare.internal.util.CollectionUtils;
import com.foursquare.internal.util.Func1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public final class FrequentLocations {
    /* renamed from: a */
    private static final Comparator<ai> f5241a = new C19522();

    /* renamed from: com.foursquare.pilgrim.FrequentLocations$2 */
    class C19522 implements Comparator<ai> {
        C19522() {
        }

        public /* synthetic */ int compare(Object obj, Object obj2) {
            return m6866a((ai) obj, (ai) obj2);
        }

        /* renamed from: a */
        public int m6866a(ai aiVar, ai aiVar2) {
            return Double.compare(aiVar.f5291c, aiVar2.f5291c) * -1;
        }
    }

    /* renamed from: com.foursquare.pilgrim.FrequentLocations$1 */
    class C35051 implements Func1<ai, FoursquareLocation> {
        C35051() {
        }

        public /* synthetic */ Object call(Object obj) {
            return m13291a((ai) obj);
        }

        /* renamed from: a */
        public FoursquareLocation m13291a(ai aiVar) {
            return aiVar.m6920a();
        }
    }

    private FrequentLocations() {
    }

    public static boolean hasHomeOrWork(@NonNull Context context) {
        Object obj = null;
        Object obj2 = null;
        for (ai aiVar : bb.m7071a(context)) {
            if (aiVar.f5292d == RegionType.HOME) {
                obj = 1;
            } else if (aiVar.f5292d == RegionType.WORK) {
                obj2 = 1;
            }
        }
        if (obj == null && r2 == null) {
            return false;
        }
        return true;
    }

    public static List<FoursquareLocation> getHomeLocations(@NonNull Context context) {
        return m6867a(context, RegionType.HOME);
    }

    public static List<FoursquareLocation> getWorkLocations(@NonNull Context context) {
        return m6867a(context, RegionType.WORK);
    }

    /* renamed from: a */
    private static List<FoursquareLocation> m6867a(Context context, RegionType regionType) {
        Context<ai> a = bb.m7071a(context);
        Iterable arrayList = new ArrayList(a.size());
        for (ai aiVar : a) {
            if (aiVar.f5292d == regionType || aiVar.f5293e == regionType) {
                arrayList.add(aiVar);
            }
        }
        Collections.sort(arrayList, f5241a);
        return CollectionUtils.m6790a(arrayList, new C35051());
    }
}
