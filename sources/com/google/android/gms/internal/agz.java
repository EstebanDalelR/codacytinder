package com.google.android.gms.internal;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.PriorityQueue;

@zzzv
public final class agz {
    /* renamed from: a */
    private final int f15256a;
    /* renamed from: b */
    private final int f15257b;
    /* renamed from: c */
    private final int f15258c;
    /* renamed from: d */
    private final agy f15259d = new ahd();

    public agz(int i) {
        this.f15257b = i;
        this.f15256a = 6;
        this.f15258c = 0;
    }

    /* renamed from: a */
    private final String m19162a(String str) {
        String[] split = str.split("\n");
        if (split.length == 0) {
            return "";
        }
        ahb ahb = new ahb();
        PriorityQueue priorityQueue = new PriorityQueue(this.f15257b, new aha(this));
        for (String a : split) {
            String[] a2 = ahc.m19166a(a, false);
            if (a2.length != 0) {
                ahe.m19170a(a2, this.f15257b, this.f15256a, priorityQueue);
            }
        }
        Iterator it = priorityQueue.iterator();
        while (it.hasNext()) {
            try {
                ahb.m19164a(this.f15259d.mo4244a(((ahf) it.next()).f15263b));
            } catch (Throwable e) {
                hx.m19912b("Error while writing hash to byteStream", e);
            }
        }
        return ahb.toString();
    }

    /* renamed from: a */
    public final String m19163a(ArrayList<String> arrayList) {
        StringBuffer stringBuffer = new StringBuffer();
        ArrayList arrayList2 = arrayList;
        int size = arrayList2.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList2.get(i);
            i++;
            stringBuffer.append(((String) obj).toLowerCase(Locale.US));
            stringBuffer.append('\n');
        }
        return m19162a(stringBuffer.toString());
    }
}
