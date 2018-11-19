package com.foursquare.pilgrim;

import android.support.annotation.NonNull;
import android.support.annotation.Size;
import android.util.Pair;
import com.foursquare.internal.util.C1943e;
import com.foursquare.internal.util.CollectionUtils;
import com.foursquare.internal.util.CollectionUtils.C1937a;
import com.foursquare.internal.util.CollectionUtils.C1938b;
import com.foursquare.internal.util.Func1;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

final class af {

    /* renamed from: com.foursquare.pilgrim.af$a */
    static class C1965a {
        /* renamed from: a */
        public Pair<Double, Double> f5284a;
        /* renamed from: b */
        public List<Double> f5285b;

        C1965a() {
        }
    }

    /* renamed from: com.foursquare.pilgrim.af$1 */
    class C35201 implements Func1<Pair<Double, Double>, Double> {
        /* renamed from: a */
        final /* synthetic */ Pair f10610a;

        C35201(Pair pair) {
            this.f10610a = pair;
        }

        public /* synthetic */ Object call(Object obj) {
            return m13312a((Pair) obj);
        }

        /* renamed from: a */
        public Double m13312a(Pair<Double, Double> pair) {
            return Double.valueOf(C1943e.m6828b(((Double) this.f10610a.first).doubleValue(), ((Double) this.f10610a.second).doubleValue(), ((Double) pair.first).doubleValue(), ((Double) pair.second).doubleValue()));
        }
    }

    /* renamed from: com.foursquare.pilgrim.af$2 */
    class C35212 implements Func1<Pair<Pair<Double, Double>, Integer>, Pair<Integer, Integer>> {
        C35212() {
        }

        public /* synthetic */ Object call(Object obj) {
            return m13313a((Pair) obj);
        }

        /* renamed from: a */
        public Pair<Integer, Integer> m13313a(Pair<Pair<Double, Double>, Integer> pair) {
            return new Pair(pair.second, Integer.valueOf(1));
        }
    }

    /* renamed from: com.foursquare.pilgrim.af$3 */
    class C35223 implements Func1<Pair<Integer, Integer>, Integer> {
        C35223() {
        }

        public /* synthetic */ Object call(Object obj) {
            return m13314a((Pair) obj);
        }

        /* renamed from: a */
        public Integer m13314a(Pair<Integer, Integer> pair) {
            return (Integer) pair.first;
        }
    }

    /* renamed from: com.foursquare.pilgrim.af$4 */
    class C35234 implements Func1<Pair<Integer, Integer>, Integer> {
        C35234() {
        }

        public /* synthetic */ Object call(Object obj) {
            return m13315a((Pair) obj);
        }

        /* renamed from: a */
        public Integer m13315a(Pair<Integer, Integer> pair) {
            return (Integer) pair.second;
        }
    }

    /* renamed from: com.foursquare.pilgrim.af$5 */
    class C35245 implements Func1<C1938b<Pair<Double, Double>>, Pair<Double, Double>> {
        /* renamed from: a */
        final /* synthetic */ HashMap f10611a;

        C35245(HashMap hashMap) {
            this.f10611a = hashMap;
        }

        public /* synthetic */ Object call(Object obj) {
            return m13316a((C1938b) obj);
        }

        /* renamed from: a */
        public Pair<Double, Double> m13316a(C1938b<Pair<Double, Double>> c1938b) {
            if (!this.f10611a.containsKey(Integer.valueOf(c1938b.f5216a))) {
                return new Pair(Double.valueOf(0.0d), Double.valueOf(0.0d));
            }
            double intValue = (double) ((Integer) this.f10611a.get(Integer.valueOf(c1938b.f5216a))).intValue();
            return new Pair(Double.valueOf(((Double) ((Pair) c1938b.f5217b).first).doubleValue() / intValue), Double.valueOf(((Double) ((Pair) c1938b.f5217b).second).doubleValue() / intValue));
        }
    }

    /* renamed from: a */
    static Double m6907a(@Size(min = 2) @NonNull List<Double> list) {
        int size = list.size() / 2;
        if (list.size() % 2 == 0) {
            return Double.valueOf((((Double) list.get(size)).doubleValue() + ((Double) list.get(size - 1)).doubleValue()) / 2.0d);
        }
        return (Double) list.get(size);
    }

    /* renamed from: a */
    static int m6905a(int i, int i2) {
        return m6906a(new Random(), i, i2);
    }

    /* renamed from: a */
    static int m6906a(@NonNull Random random, int i, int i2) {
        if (i <= i2) {
            return i + random.nextInt((i2 - i) + 1);
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("min: ");
        stringBuilder.append(i);
        stringBuilder.append(" larger than max: ");
        stringBuilder.append(i2);
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    /* renamed from: a */
    static double m6904a(double d, double d2, double d3, double d4, double d5) {
        d4 = (((d4 / 1000.0d) - (d2 / 1000.0d)) / d5) * -1.0d;
        return (Math.exp(d4) * d) + ((1.0d - Math.exp(d4)) * d3);
    }

    /* renamed from: a */
    private static boolean m6909a(Pair<Double, Double> pair, List<Pair<Double, Double>> list) {
        for (Pair pair2 : list) {
            if (C1943e.m6828b(((Double) pair.first).doubleValue(), ((Double) pair.second).doubleValue(), ((Double) pair2.first).doubleValue(), ((Double) pair2.second).doubleValue()) < 1.0d) {
                return true;
            }
        }
        return null;
    }

    @Deprecated
    @NonNull
    /* renamed from: a */
    static List<C1965a> m6908a(@NonNull Random random, @NonNull List<Pair<Double, Double>> list, int i) {
        List<C1965a> arrayList;
        Random random2 = random;
        List<Pair<Double, Double>> list2 = list;
        int i2 = i;
        int size = list.size();
        Iterable arrayList2 = new ArrayList();
        for (int i3 = 0; i3 < i2; i3++) {
            int nextInt = random2.nextInt(size);
            int i4 = 0;
            while (m6909a((Pair) list2.get(nextInt), (List) arrayList2) && i4 < 2000) {
                nextInt = random2.nextInt(size);
                i4++;
            }
            arrayList2.add(list2.get(nextInt));
        }
        double d = 1.0E10d;
        int i5 = 0;
        while (true) {
            size = (d > 1.0E-5d ? 1 : (d == 1.0E-5d ? 0 : -1));
            d = 0.0d;
            if (size <= 0 || i5 >= 30) {
                arrayList = new ArrayList();
            } else {
                Iterable<Pair> arrayList3 = new ArrayList();
                for (Pair pair : list) {
                    arrayList3.add(new Pair(pair, Integer.valueOf(CollectionUtils.m6788a(CollectionUtils.m6790a(arrayList2, new C35201(pair))))));
                }
                List<C1937a> a = CollectionUtils.m6791a(CollectionUtils.m6790a((Iterable) arrayList3, new C35212()), new C35223());
                HashMap hashMap = new HashMap();
                for (C1937a c1937a : a) {
                    hashMap.put(c1937a.f5214a, Integer.valueOf(c1937a.m6786a(new C35234())));
                }
                List arrayList4 = new ArrayList(i2);
                for (int i6 = 0; i6 < i2; i6++) {
                    arrayList4.add(new Pair(Double.valueOf(0.0d), Double.valueOf(0.0d)));
                }
                for (Pair pair2 : arrayList3) {
                    Pair pair3 = (Pair) arrayList4.get(((Integer) pair2.second).intValue());
                    arrayList4.set(((Integer) pair2.second).intValue(), new Pair(Double.valueOf(((Double) ((Pair) pair2.first).first).doubleValue() + ((Double) pair3.first).doubleValue()), Double.valueOf(((Double) ((Pair) pair2.first).second).doubleValue() + ((Double) pair3.second).doubleValue())));
                }
                List a2 = CollectionUtils.m6790a(CollectionUtils.m6795b(arrayList4), new C35245(hashMap));
                for (C1938b c1938b : CollectionUtils.m6795b(a2)) {
                    d += C1943e.m6828b(((Double) ((Pair) c1938b.f5217b).first).doubleValue(), ((Double) ((Pair) c1938b.f5217b).second).doubleValue(), ((Double) ((Pair) arrayList2.get(c1938b.f5216a)).first).doubleValue(), ((Double) ((Pair) arrayList2.get(c1938b.f5216a)).second).doubleValue());
                }
                d /= (double) i2;
                i5++;
                Object obj = a2;
            }
        }
        arrayList = new ArrayList();
        for (size = 0; size < list.size(); size++) {
            C1965a c1965a = new C1965a();
            Pair pair4 = (Pair) list2.get(size);
            c1965a.f5284a = pair4;
            c1965a.f5285b = new ArrayList();
            pair4 = m6910b(pair4, arrayList2);
            for (int i7 = 0; i7 < i2; i7++) {
                if (i7 == ((Integer) pair4.second).intValue()) {
                    c1965a.f5285b.add(Double.valueOf(1.0d));
                } else {
                    c1965a.f5285b.add(Double.valueOf(0.0d));
                }
            }
            arrayList.add(c1965a);
        }
        return arrayList;
    }

    /* renamed from: b */
    private static Pair<Pair<Double, Double>, Integer> m6910b(Pair<Double, Double> pair, List<Pair<Double, Double>> list) {
        int i = -1;
        double d = Double.POSITIVE_INFINITY;
        for (int i2 = 0; i2 < list.size(); i2++) {
            Pair pair2 = (Pair) list.get(i2);
            double b = C1943e.m6828b(((Double) pair.first).doubleValue(), ((Double) pair.second).doubleValue(), ((Double) pair2.first).doubleValue(), ((Double) pair2.second).doubleValue());
            d = Math.min(d, b);
            if (d == b) {
                i = i2;
            }
        }
        return new Pair(pair, Integer.valueOf(i));
    }
}
