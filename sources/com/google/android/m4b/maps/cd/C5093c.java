package com.google.android.m4b.maps.cd;

import android.content.res.Resources;
import android.widget.TextView;
import com.google.android.m4b.maps.C4513R;
import java.util.Calendar;
import java.util.HashSet;

/* renamed from: com.google.android.m4b.maps.cd.c */
public final class C5093c {
    /* renamed from: a */
    private final Resources f18874a;
    /* renamed from: b */
    private final TextView f18875b;

    public C5093c(Resources resources, TextView textView) {
        this.f18874a = resources;
        this.f18875b = textView;
    }

    /* renamed from: a */
    private static String m22744a(HashSet<String> hashSet) {
        if (hashSet.size() == 0) {
            return "";
        }
        hashSet = hashSet.iterator();
        StringBuilder stringBuilder = new StringBuilder();
        Object obj = 1;
        while (hashSet.hasNext()) {
            if (obj == null) {
                stringBuilder.append(", ");
            } else {
                obj = null;
            }
            stringBuilder.append((String) hashSet.next());
        }
        return stringBuilder.toString();
    }

    /* renamed from: a */
    public final void m22745a(HashSet<String> hashSet, HashSet<String> hashSet2, int i) {
        if (i == -1) {
            i = Calendar.getInstance().get(1);
        }
        String a = C5093c.m22744a((HashSet) hashSet);
        String a2 = C5093c.m22744a((HashSet) hashSet2);
        if (!hashSet.isEmpty() && !hashSet2.isEmpty()) {
            hashSet = this.f18874a.getString(C4513R.string.maps_dav_map_copyrights_full, new Object[]{Integer.valueOf(i), Integer.valueOf(i), a2, Integer.valueOf(i), a});
        } else if (hashSet.isEmpty() != null && hashSet2.isEmpty() != null) {
            hashSet = this.f18874a.getString(C4513R.string.maps_dav_map_copyrights_google_only, new Object[]{Integer.valueOf(i)});
        } else if (hashSet2.isEmpty() != null) {
            hashSet = this.f18874a.getString(C4513R.string.maps_dav_map_copyrights_map_data_only, new Object[]{Integer.valueOf(i), Integer.valueOf(i), a});
        } else {
            hashSet = this.f18874a.getString(C4513R.string.maps_dav_map_copyrights_imagery_only, new Object[]{Integer.valueOf(i), Integer.valueOf(i), a2});
        }
        hashSet = hashSet.replaceAll("&copy;", "©");
        this.f18875b.post(new Runnable(this) {
            /* renamed from: b */
            private /* synthetic */ C5093c f18873b;

            public final void run() {
                this.f18873b.f18875b.setText(hashSet);
            }
        });
    }
}
