package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.gmsg.zzt;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

@zzzv
public abstract class auv<T extends zzzb> implements zzzb<T> {
    /* renamed from: a */
    private final HashMap<String, List<zzt<? super T>>> f23171a = new HashMap();

    public void zza(String str, zzt<? super T> zzt) {
        List list = (List) this.f23171a.get(str);
        if (list == null) {
            list = new CopyOnWriteArrayList();
            this.f23171a.put(str, list);
        }
        list.add(zzt);
    }

    public void zzb(String str, zzt<? super T> zzt) {
        List list = (List) this.f23171a.get(str);
        if (list != null) {
            list.remove(zzt);
        }
    }
}
