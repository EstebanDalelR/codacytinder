package com.leanplum;

import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.Resources.NotFoundException;
import android.graphics.drawable.Drawable;
import android.util.DisplayMetrics;
import com.leanplum.p069a.C2594s;
import com.leanplum.p069a.ao;
import com.leanplum.p069a.bc;
import com.leanplum.p069a.bd;
import com.leanplum.p069a.bo;
import com.leanplum.p069a.bq;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class LeanplumResources extends Resources {
    public LeanplumResources(Resources resources) {
        super(resources.getAssets(), resources.getDisplayMetrics(), resources.getConfiguration());
    }

    /* renamed from: a */
    final <T> Var<T> m9430a(int i) {
        try {
            String resourceEntryName = getResourceEntryName(i);
            i = getResourceTypeName(i);
            if (C2594s.f8116b == null) {
                return null;
            }
            String replace;
            HashMap hashMap = (HashMap) C2594s.f8116b.objectForKeyPath(new Object[0]);
            Map hashMap2 = new HashMap();
            synchronized (bq.f8013a) {
                for (String str : hashMap.keySet()) {
                    if (str.toLowerCase().startsWith(i)) {
                        Object obj = null;
                        for (String str2 : ((HashMap) hashMap.get(str)).keySet()) {
                            replace = str2.replace("\\.", ".");
                            int lastIndexOf = replace.lastIndexOf(46);
                            if (lastIndexOf >= 0) {
                                replace = replace.substring(0, lastIndexOf);
                            }
                            if (replace.equals(resourceEntryName)) {
                                obj = str2;
                            }
                        }
                        if (obj != null) {
                            hashMap2.put(str, obj);
                        }
                    }
                }
            }
            i = new HashMap();
            for (String str3 : hashMap2.keySet()) {
                i.put(str3, bc.m9589a(str3));
            }
            Configuration configuration = getConfiguration();
            DisplayMetrics displayMetrics = getDisplayMetrics();
            Set hashSet = new HashSet();
            for (String str4 : hashMap2.keySet()) {
                bc bcVar = (bc) i.get(str4);
                for (bd bdVar : bcVar.f7982a.keySet()) {
                    if (bdVar.m9590a().m9593a(bcVar.f7982a.get(bdVar), configuration)) {
                        hashSet.add(str4);
                    }
                }
            }
            Set set = hashSet;
            for (bd bdVar2 : bd.values()) {
                Map hashMap3 = new HashMap();
                for (String replace2 : r7) {
                    Object obj2 = ((bc) i.get(replace2)).f7982a.get(bdVar2);
                    if (obj2 != null) {
                        hashMap3.put(replace2, obj2);
                    }
                }
                Map a = bdVar2.m9590a().m9592a(hashMap3, displayMetrics);
                if (!a.isEmpty()) {
                    set = a.keySet();
                }
            }
            if (hashMap2.isEmpty() == 0) {
                String str5 = (String) ((Entry) hashMap2.entrySet().iterator().next()).getValue();
                StringBuilder stringBuilder = new StringBuilder("__Android Resources.");
                stringBuilder.append(str5);
                stringBuilder.append(".");
                stringBuilder.append((String) hashMap2.get(str5));
                return bq.m9654b(stringBuilder.toString());
            }
            return null;
        } catch (int i2) {
            ao.m9516a("Error getting resource", i2);
        }
    }

    public Drawable getDrawable(int i) throws NotFoundException {
        try {
            Var a = m9430a(i);
            if (a != null) {
                int overrideResId = a.overrideResId();
                if (overrideResId != 0) {
                    return super.getDrawable(overrideResId);
                }
                if (!a.stringValue.equals(a.defaultValue())) {
                    Drawable createFromStream = Drawable.createFromStream(a.stream(), a.fileValue());
                    if (createFromStream != null) {
                        return createFromStream;
                    }
                }
            }
        } catch (Throwable th) {
            bo.m9608a(th);
        }
        return super.getDrawable(i);
    }
}
