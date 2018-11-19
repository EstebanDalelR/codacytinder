package com.google.android.gms.internal;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;

final class abu<FieldDescriptorType extends zzffs<FieldDescriptorType>> {
    /* renamed from: d */
    private static final abu f14996d = new abu(true);
    /* renamed from: a */
    private final ada<FieldDescriptorType, Object> f14997a = ada.m18896a(16);
    /* renamed from: b */
    private boolean f14998b;
    /* renamed from: c */
    private boolean f14999c = false;

    private abu() {
    }

    private abu(boolean z) {
        if (!this.f14998b) {
            this.f14997a.mo4207a();
            this.f14998b = true;
        }
    }

    /* renamed from: a */
    static int m18846a(zzfiy zzfiy, int i, Object obj) {
        i = zzffg.m27545e(i);
        if (zzfiy == zzfiy.GROUP) {
            abx.m18861a((zzfhe) obj);
            i <<= 1;
        }
        return i + m18852b(zzfiy, obj);
    }

    /* renamed from: a */
    private static int m18847a(Entry<FieldDescriptorType, Object> entry) {
        zzffs zzffs = (zzffs) entry.getKey();
        Object value = entry.getValue();
        return (zzffs.zzcxi() != zzfjd.MESSAGE || zzffs.zzcxj() || zzffs.zzcxk()) ? m18851b(zzffs, value) : value instanceof aby ? zzffg.m27527b(((zzffs) entry.getKey()).zzhq(), (aby) value) : zzffg.m27542d(((zzffs) entry.getKey()).zzhq(), (zzfhe) value);
    }

    /* renamed from: a */
    public static <T extends zzffs<T>> abu<T> m18848a() {
        return new abu();
    }

    /* renamed from: a */
    private void m18849a(FieldDescriptorType fieldDescriptorType, Object obj) {
        if (!fieldDescriptorType.zzcxj()) {
            m18850a(fieldDescriptorType.zzcxh(), obj);
        } else if (obj instanceof List) {
            List arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            ArrayList arrayList2 = (ArrayList) arrayList;
            int size = arrayList2.size();
            int i = 0;
            while (i < size) {
                Object obj2 = arrayList2.get(i);
                i++;
                m18850a(fieldDescriptorType.zzcxh(), obj2);
            }
            obj = arrayList;
        } else {
            throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
        }
        if (obj instanceof aby) {
            this.f14999c = true;
        }
        this.f14997a.m18904a((Comparable) fieldDescriptorType, obj);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    private static void m18850a(com.google.android.gms.internal.zzfiy r2, java.lang.Object r3) {
        /*
        com.google.android.gms.internal.abx.m18859a(r3);
        r0 = com.google.android.gms.internal.abv.f15000a;
        r2 = r2.zzdad();
        r2 = r2.ordinal();
        r2 = r0[r2];
        r0 = 1;
        r1 = 0;
        switch(r2) {
            case 1: goto L_0x0040;
            case 2: goto L_0x003d;
            case 3: goto L_0x003a;
            case 4: goto L_0x0037;
            case 5: goto L_0x0034;
            case 6: goto L_0x0031;
            case 7: goto L_0x0028;
            case 8: goto L_0x001e;
            case 9: goto L_0x0015;
            default: goto L_0x0014;
        };
    L_0x0014:
        goto L_0x0043;
    L_0x0015:
        r2 = r3 instanceof com.google.android.gms.internal.zzfhe;
        if (r2 != 0) goto L_0x0026;
    L_0x0019:
        r2 = r3 instanceof com.google.android.gms.internal.aby;
        if (r2 == 0) goto L_0x0043;
    L_0x001d:
        goto L_0x0026;
    L_0x001e:
        r2 = r3 instanceof java.lang.Integer;
        if (r2 != 0) goto L_0x0026;
    L_0x0022:
        r2 = r3 instanceof com.google.android.gms.internal.zzfga;
        if (r2 == 0) goto L_0x0043;
    L_0x0026:
        r1 = 1;
        goto L_0x0043;
    L_0x0028:
        r2 = r3 instanceof com.google.android.gms.internal.zzfes;
        if (r2 != 0) goto L_0x0026;
    L_0x002c:
        r2 = r3 instanceof byte[];
        if (r2 == 0) goto L_0x0043;
    L_0x0030:
        goto L_0x0026;
    L_0x0031:
        r0 = r3 instanceof java.lang.String;
        goto L_0x0042;
    L_0x0034:
        r0 = r3 instanceof java.lang.Boolean;
        goto L_0x0042;
    L_0x0037:
        r0 = r3 instanceof java.lang.Double;
        goto L_0x0042;
    L_0x003a:
        r0 = r3 instanceof java.lang.Float;
        goto L_0x0042;
    L_0x003d:
        r0 = r3 instanceof java.lang.Long;
        goto L_0x0042;
    L_0x0040:
        r0 = r3 instanceof java.lang.Integer;
    L_0x0042:
        r1 = r0;
    L_0x0043:
        if (r1 != 0) goto L_0x004d;
    L_0x0045:
        r2 = new java.lang.IllegalArgumentException;
        r3 = "Wrong object type used with protocol message reflection.";
        r2.<init>(r3);
        throw r2;
    L_0x004d:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.abu.a(com.google.android.gms.internal.zzfiy, java.lang.Object):void");
    }

    /* renamed from: b */
    private static int m18851b(zzffs<?> zzffs, Object obj) {
        zzfiy zzcxh = zzffs.zzcxh();
        int zzhq = zzffs.zzhq();
        if (!zzffs.zzcxj()) {
            return m18846a(zzcxh, zzhq, obj);
        }
        int i = 0;
        if (zzffs.zzcxk()) {
            for (Object obj2 : (List) obj2) {
                i += m18852b(zzcxh, obj2);
            }
            return (zzffg.m27545e(zzhq) + i) + zzffg.m27559l(i);
        }
        for (Object obj22 : (List) obj22) {
            i += m18846a(zzcxh, zzhq, obj22);
        }
        return i;
    }

    /* renamed from: b */
    private static int m18852b(zzfiy zzfiy, Object obj) {
        switch (abv.f15001b[zzfiy.ordinal()]) {
            case 1:
                return zzffg.m27519a(((Double) obj).doubleValue());
            case 2:
                return zzffg.m27520a(((Float) obj).floatValue());
            case 3:
                return zzffg.m27538c(((Long) obj).longValue());
            case 4:
                return zzffg.m27543d(((Long) obj).longValue());
            case 5:
                return zzffg.m27548f(((Integer) obj).intValue());
            case 6:
                return zzffg.m27550f(((Long) obj).longValue());
            case 7:
                return zzffg.m27556i(((Integer) obj).intValue());
            case 8:
                return zzffg.m27524a(((Boolean) obj).booleanValue());
            case 9:
                return zzffg.m27539c((zzfhe) obj);
            case 10:
                return obj instanceof aby ? zzffg.m27523a((aby) obj) : zzffg.m27531b((zzfhe) obj);
            case 11:
                return obj instanceof zzfes ? zzffg.m27530b((zzfes) obj) : zzffg.m27532b((String) obj);
            case 12:
                return obj instanceof zzfes ? zzffg.m27530b((zzfes) obj) : zzffg.m27533b((byte[]) obj);
            case 13:
                return zzffg.m27551g(((Integer) obj).intValue());
            case 14:
                return zzffg.m27557j(((Integer) obj).intValue());
            case 15:
                return zzffg.m27553g(((Long) obj).longValue());
            case 16:
                return zzffg.m27554h(((Integer) obj).intValue());
            case 17:
                return zzffg.m27547e(((Long) obj).longValue());
            case 18:
                return obj instanceof zzfga ? zzffg.m27558k(((zzfga) obj).zzhq()) : zzffg.m27558k(((Integer) obj).intValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    /* renamed from: b */
    public final Iterator<Entry<FieldDescriptorType, Object>> m18853b() {
        return this.f14999c ? new acb(this.f14997a.entrySet().iterator()) : this.f14997a.entrySet().iterator();
    }

    /* renamed from: c */
    public final int m18854c() {
        int i = 0;
        for (int i2 = 0; i2 < this.f14997a.m18908c(); i2++) {
            i += m18847a(this.f14997a.m18906b(i2));
        }
        for (Entry a : this.f14997a.m18909d()) {
            i += m18847a(a);
        }
        return i;
    }

    public final /* synthetic */ Object clone() throws CloneNotSupportedException {
        abu abu = new abu();
        for (int i = 0; i < this.f14997a.m18908c(); i++) {
            Entry b = this.f14997a.m18906b(i);
            abu.m18849a((zzffs) b.getKey(), b.getValue());
        }
        for (Entry b2 : this.f14997a.m18909d()) {
            abu.m18849a((zzffs) b2.getKey(), b2.getValue());
        }
        abu.f14999c = this.f14999c;
        return abu;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof abu)) {
            return false;
        }
        return this.f14997a.equals(((abu) obj).f14997a);
    }

    public final int hashCode() {
        return this.f14997a.hashCode();
    }
}
