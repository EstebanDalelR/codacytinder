package com.mapbox.android.gestures;

import android.util.Pair;

/* renamed from: com.mapbox.android.gestures.e */
public class C5770e extends Pair<Integer, Integer> {
    public C5770e(Integer num, Integer num2) {
        super(num, num2);
    }

    public boolean equals(Object obj) {
        if (obj instanceof C5770e) {
            C5770e c5770e = (C5770e) obj;
            if ((((Integer) this.first).equals(c5770e.first) && ((Integer) this.second).equals(c5770e.second)) || (((Integer) this.first).equals(c5770e.second) && ((Integer) this.second).equals(c5770e.first) != null)) {
                return true;
            }
        }
        return null;
    }
}
