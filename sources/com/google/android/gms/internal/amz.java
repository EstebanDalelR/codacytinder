package com.google.android.gms.internal;

import android.support.v7.widget.helper.ItemTouchHelper.Callback;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public final class amz {
    /* renamed from: a */
    public final int f15513a;
    /* renamed from: b */
    public final byte[] f15514b;
    /* renamed from: c */
    public final Map<String, String> f15515c;
    /* renamed from: d */
    public final List<ajr> f15516d;
    /* renamed from: e */
    public final boolean f15517e;
    /* renamed from: f */
    private long f15518f;

    private amz(int i, byte[] bArr, Map<String, String> map, List<ajr> list, boolean z, long j) {
        this.f15513a = i;
        this.f15514b = bArr;
        this.f15515c = map;
        this.f15516d = list == null ? null : Collections.unmodifiableList(list);
        this.f15517e = z;
        this.f15518f = j;
    }

    @Deprecated
    public amz(int i, byte[] bArr, Map<String, String> map, boolean z, long j) {
        this(i, bArr, map, m19375a((Map) map), z, j);
    }

    public amz(int i, byte[] bArr, boolean z, long j, List<ajr> list) {
        this(i, bArr, m19376a((List) list), list, z, j);
    }

    @Deprecated
    public amz(byte[] bArr, Map<String, String> map) {
        this((int) Callback.DEFAULT_DRAG_ANIMATION_DURATION, bArr, (Map) map, false, 0);
    }

    /* renamed from: a */
    private static List<ajr> m19375a(Map<String, String> map) {
        if (map == null) {
            return null;
        }
        if (map.isEmpty()) {
            return Collections.emptyList();
        }
        List<ajr> arrayList = new ArrayList(map.size());
        for (Entry entry : map.entrySet()) {
            arrayList.add(new ajr((String) entry.getKey(), (String) entry.getValue()));
        }
        return arrayList;
    }

    /* renamed from: a */
    private static Map<String, String> m19376a(List<ajr> list) {
        if (list == null) {
            return null;
        }
        if (list.isEmpty()) {
            return Collections.emptyMap();
        }
        Map<String, String> treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        for (ajr ajr : list) {
            treeMap.put(ajr.m19223a(), ajr.m19224b());
        }
        return treeMap;
    }
}
