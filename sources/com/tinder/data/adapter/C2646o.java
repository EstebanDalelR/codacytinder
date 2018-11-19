package com.tinder.data.adapter;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.tinder.data.adapter.o */
public abstract class C2646o<DOMAIN, API> {
    @Nullable
    /* renamed from: a */
    public abstract DOMAIN mo2706a(@NonNull API api);

    @NonNull
    /* renamed from: a */
    public List<DOMAIN> m10048a(@NonNull List<API> list) {
        if (list.isEmpty()) {
            list = Collections.emptyList();
        } else {
            List<API> arrayList = new ArrayList(list.size());
            for (Object next : list) {
                Object next2;
                if (next2 != null) {
                    next2 = mo2706a(next2);
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
