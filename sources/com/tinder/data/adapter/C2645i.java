package com.tinder.data.adapter;

import android.support.annotation.Nullable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.tinder.data.adapter.i */
public abstract class C2645i<OUT, IN> {
    @Nullable
    public abstract OUT adapt(IN in);

    public List<OUT> adapt(List<IN> list) {
        if (list.isEmpty()) {
            list = Collections.emptyList();
        } else {
            List<IN> arrayList = new ArrayList(list.size());
            for (Object next : list) {
                Object next2;
                if (next2 != null) {
                    next2 = adapt(next2);
                    if (next2 != null) {
                        arrayList.add(next2);
                    }
                }
            }
            list = arrayList;
        }
        return Collections.unmodifiableList(list);
    }
}
