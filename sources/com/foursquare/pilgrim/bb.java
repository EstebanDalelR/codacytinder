package com.foursquare.pilgrim;

import android.content.Context;
import android.location.Location;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.VisibleForTesting;
import android.util.Pair;
import android.util.SparseArray;
import com.foursquare.api.FoursquareLocation;
import com.foursquare.internal.util.C1940b;
import com.foursquare.internal.util.C1943e;
import com.foursquare.internal.util.CollectionUtils;
import com.foursquare.internal.util.CollectionUtils.C1937a;
import com.foursquare.internal.util.CollectionUtils.C1938b;
import com.foursquare.internal.util.FsLog;
import com.foursquare.internal.util.Func1;
import com.foursquare.pilgrim.af.C1965a;
import com.google.gson.reflect.TypeToken;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.TimeUnit;

@Deprecated
final class bb {
    /* renamed from: a */
    private static final String f5353a = "bb";

    /* renamed from: com.foursquare.pilgrim.bb$1 */
    class C19721 implements Comparator<C1973a> {
        C19721() {
        }

        public /* synthetic */ int compare(Object obj, Object obj2) {
            return m7064a((C1973a) obj, (C1973a) obj2);
        }

        /* renamed from: a */
        public int m7064a(C1973a c1973a, C1973a c1973a2) {
            if (c1973a.f5350b < c1973a2.f5350b) {
                return -1;
            }
            return c1973a.f5350b == c1973a2.f5350b ? null : 1;
        }
    }

    @VisibleForTesting
    /* renamed from: com.foursquare.pilgrim.bb$a */
    static class C1973a {
        /* renamed from: a */
        public double f5349a;
        /* renamed from: b */
        public long f5350b;
        /* renamed from: c */
        public double f5351c;
        /* renamed from: d */
        public double f5352d;

        public C1973a(double d, long j, double d2, double d3) {
            this.f5349a = d;
            this.f5350b = j;
            this.f5351c = d2;
            this.f5352d = d3;
        }

        public boolean equals(Object obj) {
            boolean z = true;
            if (this == obj) {
                return true;
            }
            if (obj != null) {
                if (getClass() == obj.getClass()) {
                    C1973a c1973a = (C1973a) obj;
                    if (Double.compare(c1973a.f5349a, this.f5349a) != 0 || this.f5350b != c1973a.f5350b || Double.compare(c1973a.f5351c, this.f5351c) != 0) {
                        return false;
                    }
                    if (Double.compare(c1973a.f5352d, this.f5352d) != null) {
                        z = false;
                    }
                    return z;
                }
            }
            return false;
        }

        public int hashCode() {
            long doubleToLongBits = Double.doubleToLongBits(this.f5349a);
            int i = (((int) (doubleToLongBits ^ (doubleToLongBits >>> 32))) * 31) + ((int) (this.f5350b ^ (this.f5350b >>> 32)));
            long doubleToLongBits2 = Double.doubleToLongBits(this.f5351c);
            i = (i * 31) + ((int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32)));
            doubleToLongBits2 = Double.doubleToLongBits(this.f5352d);
            return (i * 31) + ((int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32)));
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Ping{llAcc=");
            stringBuilder.append(this.f5349a);
            stringBuilder.append(", timestamp=");
            stringBuilder.append(this.f5350b);
            stringBuilder.append(", lat=");
            stringBuilder.append(this.f5351c);
            stringBuilder.append(", lng=");
            stringBuilder.append(this.f5352d);
            stringBuilder.append('}');
            return stringBuilder.toString();
        }
    }

    /* renamed from: com.foursquare.pilgrim.bb$11 */
    class AnonymousClass11 implements Func1<C1938b<List<C1973a>>, ai> {
        /* renamed from: a */
        final /* synthetic */ List f10620a;
        /* renamed from: b */
        final /* synthetic */ int f10621b;

        AnonymousClass11(List list, int i) {
            this.f10620a = list;
            this.f10621b = i;
        }

        public /* synthetic */ Object call(Object obj) {
            return m13333a((C1938b) obj);
        }

        /* renamed from: a */
        public ai m13333a(C1938b<List<C1973a>> c1938b) {
            Pair pair = (Pair) this.f10620a.get(c1938b.f5216a);
            int size = ((List) c1938b.f5217b).size();
            int[] iArr = new int[168];
            Set hashSet = new HashSet(120);
            for (C1973a c1973a : (List) c1938b.f5217b) {
                int a = bb.m7080c(c1973a.f5350b);
                iArr[a] = iArr[a] + 1;
                hashSet.add(Integer.valueOf(bb.m7082d(c1973a.f5350b)));
            }
            if (hashSet.size() < 3) {
                return null;
            }
            c1938b = bb.m7068a(iArr);
            return new ai(((Double) pair.first).doubleValue(), ((Double) pair.second).doubleValue(), (double) (((float) size) / ((float) this.f10621b)), (RegionType) c1938b.first, (RegionType) c1938b.second);
        }
    }

    /* renamed from: com.foursquare.pilgrim.bb$2 */
    class C35362 implements Func1<C1973a, Double> {
        C35362() {
        }

        public /* synthetic */ Object call(Object obj) {
            return m13336a((C1973a) obj);
        }

        /* renamed from: a */
        public Double m13336a(C1973a c1973a) {
            return Double.valueOf(c1973a.f5352d);
        }
    }

    /* renamed from: com.foursquare.pilgrim.bb$3 */
    class C35373 implements Func1<C1973a, Pair<Double, Double>> {
        /* renamed from: a */
        final /* synthetic */ double f10622a;
        /* renamed from: b */
        final /* synthetic */ double f10623b;
        /* renamed from: c */
        final /* synthetic */ double f10624c;

        C35373(double d, double d2, double d3) {
            this.f10622a = d;
            this.f10623b = d2;
            this.f10624c = d3;
        }

        public /* synthetic */ Object call(Object obj) {
            return m13337a((C1973a) obj);
        }

        /* renamed from: a */
        public Pair<Double, Double> m13337a(C1973a c1973a) {
            double toRadians = Math.toRadians(c1973a.f5351c);
            double toRadians2 = Math.toRadians(c1973a.f5352d);
            double cos = Math.cos(toRadians);
            double cos2 = Math.cos(toRadians2 - this.f10622a);
            toRadians = Math.sin(toRadians);
            double d = 1.2734E7d / (((this.f10623b * toRadians) + 1.0d) + ((this.f10624c * cos) * cos2));
            return new Pair(Double.valueOf((d * cos) * Math.sin(toRadians2 - this.f10622a)), Double.valueOf(d * ((this.f10624c * toRadians) - ((this.f10623b * cos) * cos2))));
        }
    }

    /* renamed from: com.foursquare.pilgrim.bb$4 */
    class C35384 extends TypeToken<List<ai>> {
        C35384() {
        }
    }

    /* renamed from: com.foursquare.pilgrim.bb$5 */
    class C35395 extends TypeToken<List<ai>> {
        C35395() {
        }
    }

    /* renamed from: com.foursquare.pilgrim.bb$6 */
    class C35406 implements Func1<C1965a, Integer> {
        C35406() {
        }

        public /* synthetic */ Object call(Object obj) {
            return m13338a((C1965a) obj);
        }

        /* renamed from: a */
        public Integer m13338a(C1965a c1965a) {
            for (int i = 0; i < c1965a.f5285b.size(); i++) {
                if (((Double) c1965a.f5285b.get(i)).doubleValue() > 0.0d) {
                    return Integer.valueOf(i);
                }
            }
            return null;
        }
    }

    /* renamed from: com.foursquare.pilgrim.bb$7 */
    class C35417 implements Func1<C1938b<Integer>, Integer> {
        C35417() {
        }

        public /* synthetic */ Object call(Object obj) {
            return m13339a((C1938b) obj);
        }

        /* renamed from: a */
        public Integer m13339a(C1938b<Integer> c1938b) {
            return (Integer) c1938b.f5217b;
        }
    }

    /* renamed from: com.foursquare.pilgrim.bb$8 */
    class C35428 implements Func1<C1937a<Integer, C1938b<Integer>>, List<C1973a>> {
        /* renamed from: a */
        final /* synthetic */ List f10625a;

        C35428(List list) {
            this.f10625a = list;
        }

        public /* synthetic */ Object call(Object obj) {
            return m13340a((C1937a) obj);
        }

        /* renamed from: a */
        public List<C1973a> m13340a(C1937a<Integer, C1938b<Integer>> c1937a) {
            List<C1973a> arrayList = new ArrayList(c1937a.f5215b.size());
            c1937a = c1937a.f5215b.iterator();
            while (c1937a.hasNext()) {
                arrayList.add(this.f10625a.get(((C1938b) c1937a.next()).f5216a));
            }
            return arrayList;
        }
    }

    /* renamed from: com.foursquare.pilgrim.bb$9 */
    class C35439 implements Func1<List<C1973a>, Pair<Double, Double>> {
        C35439() {
        }

        public /* synthetic */ Object call(Object obj) {
            return m13341a((List) obj);
        }

        /* renamed from: a */
        public Pair<Double, Double> m13341a(List<C1973a> list) {
            return bb.m7083d((List) list);
        }
    }

    bb() {
    }

    @Nullable
    /* renamed from: a */
    static List<ai> m7072a(@NonNull List<FoursquareLocation> list) {
        return m7074a((List) list, aj.f5294a);
    }

    @Nullable
    /* renamed from: a */
    static List<ai> m7074a(@NonNull List<FoursquareLocation> list, @NonNull Random random) {
        List b = m7078b(list, random);
        if (b == null) {
            return null;
        }
        return m7077b(b);
    }

    @Nullable
    @VisibleForTesting
    /* renamed from: b */
    static List<List<C1973a>> m7078b(@NonNull List<FoursquareLocation> list, @NonNull Random random) {
        SparseArray sparseArray = new SparseArray();
        if (list.size() <= 2) {
            return null;
        }
        int i = 0;
        long time = ((FoursquareLocation) list.get(0)).getTime();
        for (FoursquareLocation foursquareLocation : list) {
            int toMinutes = ((int) TimeUnit.MILLISECONDS.toMinutes(foursquareLocation.getTime() - time)) / 15;
            if (sparseArray.indexOfKey(toMinutes) >= 0) {
                C1973a c1973a = (C1973a) sparseArray.get(toMinutes);
                if (c1973a.f5349a == 0.0d || c1973a.f5349a > ((double) foursquareLocation.getAccuracy()) || (c1973a.f5349a == ((double) foursquareLocation.getAccuracy()) && c1973a.f5350b < foursquareLocation.getTime())) {
                    sparseArray.put(toMinutes, new C1973a((double) foursquareLocation.getAccuracy(), foursquareLocation.getTime(), foursquareLocation.getLat(), foursquareLocation.getLng()));
                }
            } else {
                sparseArray.append(toMinutes, new C1973a((double) foursquareLocation.getAccuracy(), foursquareLocation.getTime(), foursquareLocation.getLat(), foursquareLocation.getLng()));
            }
        }
        long toDays = TimeUnit.MILLISECONDS.toDays(((C1973a) sparseArray.valueAt(sparseArray.size() - 1)).f5350b - ((C1973a) sparseArray.valueAt(0)).f5350b);
        if (sparseArray.size() < 20 || toDays < 3) {
            return null;
        }
        List arrayList = new ArrayList(sparseArray.size());
        while (i < sparseArray.size()) {
            arrayList.add(sparseArray.valueAt(i));
            i++;
        }
        Collections.sort(arrayList, new C19721());
        List a = m7073a(arrayList, m7083d(arrayList));
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Total pings: ");
        stringBuilder.append(arrayList.size());
        FsLog.m6800a("Regions", stringBuilder.toString());
        return CollectionUtils.m6790a(CollectionUtils.m6791a(CollectionUtils.m6795b(CollectionUtils.m6790a(af.m6908a(random, a, 20), new C35406())), new C35417()), new C35428(arrayList));
    }

    @VisibleForTesting
    /* renamed from: b */
    static List<ai> m7077b(@NonNull List<List<C1973a>> list) {
        Iterable iterable = list;
        List arrayList = new ArrayList(list.size());
        for (List arrayList2 : list) {
            arrayList.add(new ArrayList(arrayList2));
        }
        List a = CollectionUtils.m6790a(iterable, new C35439());
        Object obj;
        for (Object obj2 = 1; obj2 != null; obj2 = obj) {
            int i = 0;
            obj = null;
            while (i < arrayList.size()) {
                int i2 = i + 1;
                Pair pair = (Pair) a.get(i);
                Object obj3 = obj;
                int i3 = i2;
                while (i3 < arrayList.size()) {
                    Pair pair2 = (Pair) a.get(i3);
                    if (m7066a(((Double) pair.first).doubleValue(), ((Double) pair.second).doubleValue(), ((Double) pair2.first).doubleValue(), ((Double) pair2.second).doubleValue()) < 200.0d) {
                        ((List) arrayList.get(i)).addAll((Collection) arrayList.get(i3));
                        a.set(i, m7083d((List) arrayList.get(i)));
                        arrayList.remove(i3);
                        a.remove(i3);
                        obj3 = 1;
                    } else {
                        i3++;
                    }
                }
                i = i2;
                obj = obj3;
            }
        }
        return CollectionUtils.m6797c(CollectionUtils.m6790a(CollectionUtils.m6795b(arrayList), new AnonymousClass11(a, CollectionUtils.m6793b(CollectionUtils.m6790a(iterable, new Func1<List<C1973a>, Integer>() {
            public /* synthetic */ Object call(Object obj) {
                return m13332a((List) obj);
            }

            /* renamed from: a */
            public Integer m13332a(List<C1973a> list) {
                return Integer.valueOf(list.size());
            }
        })))), new Func1<ai, Boolean>() {
            public /* synthetic */ Object call(Object obj) {
                return m13334a((ai) obj);
            }

            /* renamed from: a */
            public Boolean m13334a(ai aiVar) {
                aiVar = (aiVar == null || aiVar.f5291c <= 0.05d) ? null : true;
                return Boolean.valueOf(aiVar);
            }
        });
    }

    /* renamed from: c */
    private static int m7080c(long j) {
        Calendar instance = Calendar.getInstance();
        instance.setTimeInMillis(j);
        return ((instance.get(7) - 1) * 24) + instance.get(11);
    }

    /* renamed from: d */
    private static int m7082d(long j) {
        Calendar instance = Calendar.getInstance();
        instance.setTimeInMillis(j);
        return instance.get(6);
    }

    /* renamed from: d */
    private static Pair<Double, Double> m7083d(List<C1973a> list) {
        List a = CollectionUtils.m6790a((Iterable) list, new Func1<C1973a, Double>() {
            public /* synthetic */ Object call(Object obj) {
                return m13335a((C1973a) obj);
            }

            /* renamed from: a */
            public Double m13335a(C1973a c1973a) {
                return Double.valueOf(c1973a.f5351c);
            }
        });
        list = CollectionUtils.m6790a((Iterable) list, new C35362());
        Collections.sort(a);
        Collections.sort(list);
        return new Pair(af.m6907a(a), af.m6907a(list));
    }

    /* renamed from: a */
    private static List<Pair<Double, Double>> m7073a(List<C1973a> list, Pair<Double, Double> pair) {
        double toRadians = Math.toRadians(((Double) pair.first).doubleValue());
        return CollectionUtils.m6790a((Iterable) list, new C35373(Math.toRadians(((Double) pair.second).doubleValue()), Math.sin(toRadians), Math.cos(toRadians)));
    }

    /* renamed from: a */
    static List<ai> m7071a(Context context) {
        List list = (List) C1940b.m6813a(context, "regions.json", 0, new C35384(), false);
        return list == null ? new ArrayList() : list;
    }

    /* renamed from: a */
    static void m7075a(Context context, List<ai> list) {
        C1940b.m6820a(context, "regions.json", 0, (Object) list, new C35395().getType());
    }

    /* renamed from: b */
    static void m7079b(Context context) {
        C1940b.m6819a(context, "regions.json");
    }

    /* renamed from: a */
    static ai m7069a(Context context, FoursquareLocation foursquareLocation) {
        return m7070a(m7071a(context), foursquareLocation);
    }

    @Nullable
    /* renamed from: a */
    static ai m7070a(List<ai> list, FoursquareLocation foursquareLocation) {
        ai aiVar = null;
        if (list != null) {
            if (foursquareLocation != null) {
                double d = Double.MAX_VALUE;
                double a = m7065a((double) foursquareLocation.getAccuracy());
                for (ai aiVar2 : list) {
                    double a2 = (double) C1943e.m6827a(foursquareLocation, aiVar2.m6920a());
                    if (a2 < a && aiVar2.f5291c >= 0.05d && a2 < r1) {
                        aiVar = aiVar2;
                        d = a2;
                    }
                }
                return aiVar;
            }
        }
        return null;
    }

    @VisibleForTesting
    /* renamed from: a */
    static Pair<RegionType, RegionType> m7068a(int[] iArr) {
        Object obj = null;
        double d = 0.0d;
        for (int i : iArr) {
            d += (double) i;
        }
        int max = Math.max(aa.f5269a.size(), aa.f5270b.size());
        double d2 = 0.0d;
        double d3 = d2;
        for (int i2 = 0; i2 < max; i2++) {
            if (i2 < aa.f5269a.size()) {
                d3 += (double) iArr[((Integer) aa.f5269a.get(i2)).intValue()];
            }
            if (i2 < aa.f5270b.size()) {
                d2 += (double) iArr[((Integer) aa.f5270b.get(i2)).intValue()];
            }
        }
        d2 /= d;
        d3 /= d;
        iArr = d2 > 0.15d ? 1 : null;
        if (d3 > 0.15d) {
            obj = 1;
        }
        if (iArr == null || obj == null) {
            if (iArr != null) {
                return new Pair(RegionType.HOME, RegionType.UNKNOWN);
            }
            if (obj != null) {
                return new Pair(RegionType.WORK, RegionType.UNKNOWN);
            }
            return new Pair(RegionType.UNKNOWN, RegionType.UNKNOWN);
        } else if (d2 > d3) {
            return new Pair(RegionType.HOME, RegionType.WORK);
        } else {
            return new Pair(RegionType.WORK, RegionType.HOME);
        }
    }

    /* renamed from: a */
    private static double m7066a(double d, double d2, double d3, double d4) {
        float[] fArr = new float[1];
        Location.distanceBetween(d, d2, d3, d4, fArr);
        return (double) fArr[0];
    }

    /* renamed from: a */
    private static final double m7065a(double d) {
        return Math.max(50.0d, Math.min(d * 3.0d, 200.0d));
    }
}
