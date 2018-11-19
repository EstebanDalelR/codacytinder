package com.google.android.gms.internal;

import com.google.android.gms.common.internal.ad;
import com.google.android.gms.common.util.C2518b;
import com.google.android.gms.common.util.C2524i;
import com.google.android.gms.common.util.C2525j;
import com.tinder.api.ManagerWebServices;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public abstract class pa {
    protected static <O, I> I zza(zzbgo<I, O> zzbgo, Object obj) {
        return zzbgo.zzgcn != null ? zzbgo.convertBack(obj) : obj;
    }

    private static void zza(StringBuilder stringBuilder, zzbgo zzbgo, Object obj) {
        String paVar;
        if (zzbgo.zzgce == 11) {
            paVar = ((pa) zzbgo.zzgck.cast(obj)).toString();
        } else if (zzbgo.zzgce == 7) {
            stringBuilder.append("\"");
            stringBuilder.append(C2524i.a((String) obj));
            paVar = "\"";
        } else {
            stringBuilder.append(obj);
            return;
        }
        stringBuilder.append(paVar);
    }

    private static void zza(StringBuilder stringBuilder, zzbgo zzbgo, ArrayList<Object> arrayList) {
        stringBuilder.append("[");
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (i > 0) {
                stringBuilder.append(",");
            }
            Object obj = arrayList.get(i);
            if (obj != null) {
                zza(stringBuilder, zzbgo, obj);
            }
        }
        stringBuilder.append("]");
    }

    public String toString() {
        Map zzaav = zzaav();
        StringBuilder stringBuilder = new StringBuilder(100);
        for (String str : zzaav.keySet()) {
            String str2;
            zzbgo zzbgo = (zzbgo) zzaav.get(str2);
            if (zza(zzbgo)) {
                Object zza = zza(zzbgo, zzb(zzbgo));
                stringBuilder.append(stringBuilder.length() == 0 ? "{" : ",");
                stringBuilder.append("\"");
                stringBuilder.append(str2);
                stringBuilder.append("\":");
                if (zza == null) {
                    str2 = ManagerWebServices.NULL_STRING_VALUE;
                } else {
                    switch (zzbgo.zzgcg) {
                        case 8:
                            stringBuilder.append("\"");
                            str2 = C2518b.a((byte[]) zza);
                            break;
                        case 9:
                            stringBuilder.append("\"");
                            str2 = C2518b.b((byte[]) zza);
                            break;
                        case 10:
                            C2525j.a(stringBuilder, (HashMap) zza);
                            continue;
                        default:
                            if (!zzbgo.zzgcf) {
                                zza(stringBuilder, zzbgo, zza);
                                break;
                            }
                            zza(stringBuilder, zzbgo, (ArrayList) zza);
                            continue;
                    }
                    stringBuilder.append(str2);
                    str2 = "\"";
                }
                stringBuilder.append(str2);
            }
        }
        stringBuilder.append(stringBuilder.length() > 0 ? "}" : "{}");
        return stringBuilder.toString();
    }

    protected boolean zza(zzbgo zzbgo) {
        if (zzbgo.zzgcg != 11) {
            return zzgp(zzbgo.zzgci);
        }
        if (zzbgo.zzgch) {
            String str = zzbgo.zzgci;
            throw new UnsupportedOperationException("Concrete type arrays not supported");
        }
        str = zzbgo.zzgci;
        throw new UnsupportedOperationException("Concrete types not supported");
    }

    public abstract Map<String, zzbgo<?, ?>> zzaav();

    protected Object zzb(zzbgo zzbgo) {
        String str = zzbgo.zzgci;
        if (zzbgo.zzgck == null) {
            return zzgo(zzbgo.zzgci);
        }
        zzgo(zzbgo.zzgci);
        ad.a(true, "Concrete field shouldn't be value object: %s", new Object[]{zzbgo.zzgci});
        boolean z = zzbgo.zzgch;
        try {
            char toUpperCase = Character.toUpperCase(str.charAt(0));
            str = str.substring(1);
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 4);
            stringBuilder.append("get");
            stringBuilder.append(toUpperCase);
            stringBuilder.append(str);
            return getClass().getMethod(stringBuilder.toString(), new Class[0]).invoke(this, new Object[0]);
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    protected abstract Object zzgo(String str);

    protected abstract boolean zzgp(String str);
}
