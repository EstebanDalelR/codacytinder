package com.snapchat.kit.sdk.bitmoji.search;

import android.os.AsyncTask;
import android.support.annotation.VisibleForTesting;
import com.snapchat.kit.sdk.bitmoji.models.Sticker;
import com.snapchat.kit.sdk.bitmoji.models.StickerPack;
import com.snapchat.kit.sdk.bitmoji.p143a.p145b.C5891c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.inject.Inject;
import javax.inject.Named;

public class StickerIndexingTask extends AsyncTask<StickerPack, Void, C5909d> {
    /* renamed from: a */
    private final OnIndexCompleteListener f21636a;
    /* renamed from: b */
    private final C5891c f21637b;

    public interface OnIndexCompleteListener {
        void onIndexComplete(C5909d c5909d);
    }

    /* renamed from: com.snapchat.kit.sdk.bitmoji.search.StickerIndexingTask$a */
    private static class C5907a {
        /* renamed from: a */
        private final HashSet<Sticker> f21631a;
        /* renamed from: b */
        private final HashSet<Sticker> f21632b;
        /* renamed from: c */
        private final HashSet<Sticker> f21633c;
        /* renamed from: d */
        private final HashSet<Sticker> f21634d;
        /* renamed from: e */
        private boolean f21635e;

        private C5907a() {
            this.f21631a = new HashSet();
            this.f21632b = new HashSet();
            this.f21633c = new HashSet();
            this.f21634d = new HashSet();
            this.f21635e = false;
        }

        /* renamed from: a */
        public void m25484a(Sticker sticker, boolean z) {
            if (sticker.isFriendmoji()) {
                m25482a(sticker, this.f21631a, this.f21633c, z);
                return;
            }
            this.f21635e = true;
            m25482a(sticker, this.f21632b, this.f21634d, z);
        }

        /* renamed from: a */
        public List<Sticker> m25483a() {
            List<Sticker> arrayList = new ArrayList(((this.f21631a.size() + this.f21632b.size()) + this.f21633c.size()) + this.f21634d.size());
            arrayList.addAll(this.f21631a);
            arrayList.addAll(this.f21632b);
            arrayList.addAll(this.f21633c);
            arrayList.addAll(this.f21634d);
            return arrayList;
        }

        /* renamed from: b */
        public boolean m25485b() {
            return this.f21635e;
        }

        /* renamed from: a */
        private void m25482a(Sticker sticker, HashSet<Sticker> hashSet, HashSet<Sticker> hashSet2, boolean z) {
            if (!hashSet.contains(sticker)) {
                if (z) {
                    hashSet.add(sticker);
                    hashSet2.remove(sticker);
                } else {
                    hashSet2.add(sticker);
                }
            }
        }
    }

    protected /* synthetic */ Object doInBackground(Object[] objArr) {
        return m25487a((StickerPack[]) objArr);
    }

    protected /* synthetic */ void onPostExecute(Object obj) {
        m25488a((C5909d) obj);
    }

    @Inject
    public StickerIndexingTask(OnIndexCompleteListener onIndexCompleteListener, @Named("search:indexing") C5891c c5891c) {
        this.f21636a = onIndexCompleteListener;
        this.f21637b = c5891c;
    }

    protected void onPreExecute() {
        this.f21637b.m25428a();
    }

    /* renamed from: a */
    protected C5909d m25487a(StickerPack... stickerPackArr) {
        StickerPack[] stickerPackArr2 = stickerPackArr;
        HashMap hashMap = new HashMap();
        Map hashMap2 = new HashMap();
        Map hashMap3 = new HashMap();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int length = stickerPackArr2.length;
        int i = 0;
        C59061 c59061 = null;
        int i2 = 0;
        while (i2 < length) {
            StickerPack stickerPack = stickerPackArr2[i2];
            C5908a a = C5908a.m25489a(stickerPack.getId());
            if (stickerPack.isVisible()) {
                linkedHashMap.put(stickerPack.getTitle(), stickerPack);
            }
            if ("popular".equals(stickerPack.getId())) {
                c59061 = stickerPack;
            }
            for (Sticker sticker : stickerPack.getStickers()) {
                for (Object obj : sticker.getTags()) {
                    Object obj2;
                    if (!obj2.contains(":")) {
                        if (!obj2.contains("#")) {
                            boolean z;
                            if (obj2.endsWith("*")) {
                                obj2 = obj2.substring(i, obj2.length() - 1);
                                z = true;
                            } else {
                                z = false;
                            }
                            i = hashMap2.containsKey(obj2) ? ((Integer) hashMap2.get(obj2)).intValue() : 0;
                            if (!hashMap.containsKey(obj2)) {
                                hashMap.put(obj2, new C5907a());
                            }
                            if (a != null) {
                                hashMap3.put(obj2, a);
                            }
                            ((C5907a) hashMap.get(obj2)).m25484a(sticker, z);
                            hashMap2.put(obj2, Integer.valueOf(i + 1));
                            stickerPackArr2 = stickerPackArr;
                            i = 0;
                        }
                    }
                }
            }
            i2++;
            stickerPackArr2 = stickerPackArr;
            i = 0;
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        Set hashSet = new HashSet();
        for (String str : m25486a(hashMap2)) {
            C5907a c5907a = (C5907a) hashMap.get(str);
            linkedHashMap2.put(str, c5907a.m25483a());
            if (c5907a.m25485b()) {
                hashSet.add(str);
            }
        }
        return new C5909d(linkedHashMap2, linkedHashMap, hashMap3, hashSet, c59061);
    }

    /* renamed from: a */
    protected void m25488a(C5909d c5909d) {
        this.f21637b.m25429b();
        this.f21636a.onIndexComplete(c5909d);
    }

    @VisibleForTesting
    /* renamed from: a */
    static List<String> m25486a(final Map<String, Integer> map) {
        List<String> arrayList = new ArrayList(map.keySet());
        Collections.sort(arrayList, new Comparator<String>() {
            public /* synthetic */ int compare(Object obj, Object obj2) {
                return m25481a((String) obj, (String) obj2);
            }

            /* renamed from: a */
            public int m25481a(String str, String str2) {
                return ((Integer) map.get(str2)).intValue() - ((Integer) map.get(str)).intValue();
            }
        });
        return arrayList;
    }
}
