package com.leanplum.p069a;

import java.util.HashMap;
import java.util.Map;

/* renamed from: com.leanplum.a.bc */
public final class bc {
    /* renamed from: a */
    public Map<bd, Object> f7982a = new HashMap();

    /* renamed from: a */
    public static bc m9589a(String str) {
        bc bcVar = new bc();
        str = str.toLowerCase().split("-");
        int length = str.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            String str2 = str[i];
            int i3 = i2;
            Object obj = null;
            while (obj == null && i3 < bd.values().length) {
                bd bdVar = bd.values()[i3];
                Object a = bdVar.m9590a().m9591a(str2);
                if (a != null) {
                    bcVar.f7982a.put(bdVar, a);
                    obj = 1;
                }
                i3++;
            }
            i++;
            i2 = i3;
        }
        return bcVar;
    }
}
