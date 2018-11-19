package com.mapbox.geojson.utils;

import android.support.annotation.NonNull;
import com.mapbox.geojson.Point;
import java.util.ArrayList;
import java.util.List;

public final class PolylineUtils {
    private static final boolean SIMPLIFY_DEFAULT_HIGHEST_QUALITY = false;
    private static final double SIMPLIFY_DEFAULT_TOLERANCE = 1.0d;

    private PolylineUtils() {
    }

    @NonNull
    public static List<Point> decode(@NonNull String str, int i) {
        int length = str.length();
        double pow = Math.pow(10.0d, (double) i);
        i = new ArrayList();
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i2 < length) {
            int i5 = 1;
            int i6 = 0;
            while (true) {
                int i7 = i2 + 1;
                i2 = (str.charAt(i2) - 63) - 1;
                i5 += i2 << i6;
                i6 += 5;
                if (i2 < 31) {
                    break;
                }
                i2 = i7;
            }
            i2 = ((i5 & 1) != 0 ? (i5 >> 1) ^ -1 : i5 >> 1) + i3;
            i3 = 1;
            i5 = 0;
            while (true) {
                i6 = i7 + 1;
                i7 = (str.charAt(i7) - 63) - 1;
                i3 += i7 << i5;
                i5 += 5;
                if (i7 < 31) {
                    break;
                }
                i7 = i6;
            }
            i4 += (i3 & 1) != 0 ? (i3 >> 1) ^ -1 : i3 >> 1;
            i.add(Point.fromLngLat(((double) i4) / pow, ((double) i2) / pow));
            i3 = i2;
            i2 = i6;
        }
        return i;
    }

    @NonNull
    public static String encode(@NonNull List<Point> list, int i) {
        StringBuilder stringBuilder = new StringBuilder();
        double pow = Math.pow(10.0d, (double) i);
        long j = 0;
        long j2 = 0;
        for (Point point : list) {
            long round = Math.round(point.latitude() * pow);
            long round2 = Math.round(point.longitude() * pow);
            long j3 = round - j;
            j = round2 - j2;
            encode(j3, stringBuilder);
            encode(j, stringBuilder);
            j = round;
            j2 = round2;
        }
        return stringBuilder.toString();
    }

    private static void encode(long j, StringBuilder stringBuilder) {
        long j2 = j < 0 ? (j << 1) ^ -1 : j << 1;
        while (j2 >= 32) {
            stringBuilder.append(Character.toChars((int) (((j2 & 31) | 32) + 63)));
            j2 >>= 5;
        }
        stringBuilder.append(Character.toChars((int) (j2 + 63)));
    }

    @NonNull
    public static List<Point> simplify(@NonNull List<Point> list) {
        return simplify(list, SIMPLIFY_DEFAULT_TOLERANCE, false);
    }

    @NonNull
    public static List<Point> simplify(@NonNull List<Point> list, double d) {
        return simplify(list, d, false);
    }

    @NonNull
    public static List<Point> simplify(@NonNull List<Point> list, boolean z) {
        return simplify(list, SIMPLIFY_DEFAULT_TOLERANCE, z);
    }

    @NonNull
    public static List<Point> simplify(@NonNull List<Point> list, double d, boolean z) {
        if (list.size() <= 2) {
            return list;
        }
        d *= d;
        if (!z) {
            list = simplifyRadialDist(list, d);
        }
        return simplifyDouglasPeucker(list, d);
    }

    private static double getSqDist(Point point, Point point2) {
        double longitude = point.longitude() - point2.longitude();
        double latitude = point.latitude() - point2.latitude();
        return (longitude * longitude) + (latitude * latitude);
    }

    private static double getSqSegDist(Point point, Point point2, Point point3) {
        double longitude = point2.longitude();
        double latitude = point2.latitude();
        double longitude2 = point3.longitude() - longitude;
        double latitude2 = point3.latitude() - latitude;
        if (!(longitude2 == 0.0d && latitude2 == 0.0d)) {
            double longitude3 = (((point.longitude() - longitude) * longitude2) + ((point.latitude() - latitude) * latitude2)) / ((longitude2 * longitude2) + (latitude2 * latitude2));
            if (longitude3 > SIMPLIFY_DEFAULT_TOLERANCE) {
                longitude = point3.longitude();
                latitude = point3.latitude();
            } else if (longitude3 > 0.0d) {
                longitude += longitude2 * longitude3;
                latitude += latitude2 * longitude3;
            }
        }
        longitude2 = point.longitude() - longitude;
        longitude = point.latitude() - latitude;
        return (longitude2 * longitude2) + (longitude * longitude);
    }

    private static List<Point> simplifyRadialDist(List<Point> list, double d) {
        Point point = (Point) list.get(0);
        List arrayList = new ArrayList();
        arrayList.add(point);
        int size = list.size();
        Object obj = null;
        for (int i = 1; i < size; i++) {
            Point point2 = (Point) list.get(i);
            if (getSqDist(point2, point) > d) {
                arrayList.add(point2);
                point = point2;
            }
        }
        if (point.equals(obj) == null) {
            arrayList.add(obj);
        }
        return arrayList;
    }

    private static List<Point> simplifyDpStep(List<Point> list, int i, int i2, double d, List<Point> list2) {
        List<Point> list3 = list;
        int i3 = i2;
        List arrayList = new ArrayList();
        double d2 = d;
        int i4 = 0;
        for (int i5 = i + 1; i5 < i3; i5++) {
            double sqSegDist = getSqSegDist((Point) list3.get(i5), (Point) list3.get(i), (Point) list3.get(i3));
            if (sqSegDist > d2) {
                i4 = i5;
                d2 = sqSegDist;
            }
        }
        if (d2 > d) {
            if (i4 - i > 1) {
                arrayList.addAll(simplifyDpStep(list3, i, i4, d, list2));
            }
            arrayList.add((Point) list3.get(i4));
            if (i3 - i4 > 1) {
                arrayList.addAll(simplifyDpStep(list3, i4, i3, d, list2));
            }
        }
        return arrayList;
    }

    private static List<Point> simplifyDouglasPeucker(List<Point> list, double d) {
        int size = list.size() - 1;
        List arrayList = new ArrayList();
        arrayList.add((Point) list.get(0));
        arrayList.addAll(simplifyDpStep(list, 0, size, d, arrayList));
        arrayList.add((Point) list.get(size));
        return arrayList;
    }
}
