package com.google.android.gms.internal;

import io.fabric.sdk.android.services.events.C15645a;
import java.util.List;

final class acq {
    /* renamed from: a */
    static String m18878a(zzfhe zzfhe, String str) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("# ");
        stringBuilder.append(str);
        m18880a(zzfhe, stringBuilder, 0);
        return stringBuilder.toString();
    }

    /* renamed from: a */
    private static final String m18879a(String str) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (Character.isUpperCase(charAt)) {
                stringBuilder.append(C15645a.ROLL_OVER_FILE_NAME_SEPARATOR);
            }
            stringBuilder.append(Character.toLowerCase(charAt));
        }
        return stringBuilder.toString();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    private static void m18880a(com.google.android.gms.internal.zzfhe r12, java.lang.StringBuilder r13, int r14) {
        /*
        r0 = new java.util.HashMap;
        r0.<init>();
        r1 = new java.util.HashMap;
        r1.<init>();
        r2 = new java.util.TreeSet;
        r2.<init>();
        r3 = r12.getClass();
        r3 = r3.getDeclaredMethods();
        r4 = r3.length;
        r5 = 0;
        r6 = 0;
    L_0x001a:
        if (r6 >= r4) goto L_0x0049;
    L_0x001c:
        r7 = r3[r6];
        r8 = r7.getName();
        r1.put(r8, r7);
        r8 = r7.getParameterTypes();
        r8 = r8.length;
        if (r8 != 0) goto L_0x0046;
    L_0x002c:
        r8 = r7.getName();
        r0.put(r8, r7);
        r8 = r7.getName();
        r9 = "get";
        r8 = r8.startsWith(r9);
        if (r8 == 0) goto L_0x0046;
    L_0x003f:
        r7 = r7.getName();
        r2.add(r7);
    L_0x0046:
        r6 = r6 + 1;
        goto L_0x001a;
    L_0x0049:
        r2 = r2.iterator();
    L_0x004d:
        r3 = r2.hasNext();
        if (r3 == 0) goto L_0x021b;
    L_0x0053:
        r3 = r2.next();
        r3 = (java.lang.String) r3;
        r4 = "get";
        r6 = "";
        r3 = r3.replaceFirst(r4, r6);
        r4 = "List";
        r4 = r3.endsWith(r4);
        r6 = 1;
        if (r4 == 0) goto L_0x00d7;
    L_0x006a:
        r4 = "OrBuilderList";
        r4 = r3.endsWith(r4);
        if (r4 != 0) goto L_0x00d7;
    L_0x0072:
        r4 = r3.substring(r5, r6);
        r4 = r4.toLowerCase();
        r4 = java.lang.String.valueOf(r4);
        r7 = r3.length();
        r7 = r7 + -4;
        r7 = r3.substring(r6, r7);
        r7 = java.lang.String.valueOf(r7);
        r8 = r7.length();
        if (r8 == 0) goto L_0x0097;
    L_0x0092:
        r4 = r4.concat(r7);
        goto L_0x009d;
    L_0x0097:
        r7 = new java.lang.String;
        r7.<init>(r4);
        r4 = r7;
    L_0x009d:
        r7 = "get";
        r8 = java.lang.String.valueOf(r3);
        r9 = r8.length();
        if (r9 == 0) goto L_0x00ae;
    L_0x00a9:
        r7 = r7.concat(r8);
        goto L_0x00b4;
    L_0x00ae:
        r8 = new java.lang.String;
        r8.<init>(r7);
        r7 = r8;
    L_0x00b4:
        r7 = r0.get(r7);
        r7 = (java.lang.reflect.Method) r7;
        if (r7 == 0) goto L_0x00d7;
    L_0x00bc:
        r8 = r7.getReturnType();
        r9 = java.util.List.class;
        r8 = r8.equals(r9);
        if (r8 == 0) goto L_0x00d7;
    L_0x00c8:
        r3 = m18879a(r4);
        r4 = new java.lang.Object[r5];
        r4 = com.google.android.gms.internal.zzffu.m34109a(r7, r12, r4);
        m18881a(r13, r14, r3, r4);
        goto L_0x004d;
    L_0x00d7:
        r4 = "set";
        r7 = java.lang.String.valueOf(r3);
        r8 = r7.length();
        if (r8 == 0) goto L_0x00e8;
    L_0x00e3:
        r4 = r4.concat(r7);
        goto L_0x00ee;
    L_0x00e8:
        r7 = new java.lang.String;
        r7.<init>(r4);
        r4 = r7;
    L_0x00ee:
        r4 = r1.get(r4);
        r4 = (java.lang.reflect.Method) r4;
        if (r4 == 0) goto L_0x004d;
    L_0x00f6:
        r4 = "Bytes";
        r4 = r3.endsWith(r4);
        if (r4 == 0) goto L_0x0125;
    L_0x00fe:
        r4 = "get";
        r7 = r3.length();
        r7 = r7 + -5;
        r7 = r3.substring(r5, r7);
        r7 = java.lang.String.valueOf(r7);
        r8 = r7.length();
        if (r8 == 0) goto L_0x0119;
    L_0x0114:
        r4 = r4.concat(r7);
        goto L_0x011f;
    L_0x0119:
        r7 = new java.lang.String;
        r7.<init>(r4);
        r4 = r7;
    L_0x011f:
        r4 = r0.containsKey(r4);
        if (r4 != 0) goto L_0x004d;
    L_0x0125:
        r4 = r3.substring(r5, r6);
        r4 = r4.toLowerCase();
        r4 = java.lang.String.valueOf(r4);
        r7 = r3.substring(r6);
        r7 = java.lang.String.valueOf(r7);
        r8 = r7.length();
        if (r8 == 0) goto L_0x0144;
    L_0x013f:
        r4 = r4.concat(r7);
        goto L_0x014a;
    L_0x0144:
        r7 = new java.lang.String;
        r7.<init>(r4);
        r4 = r7;
    L_0x014a:
        r7 = "get";
        r8 = java.lang.String.valueOf(r3);
        r9 = r8.length();
        if (r9 == 0) goto L_0x015b;
    L_0x0156:
        r7 = r7.concat(r8);
        goto L_0x0161;
    L_0x015b:
        r8 = new java.lang.String;
        r8.<init>(r7);
        r7 = r8;
    L_0x0161:
        r7 = r0.get(r7);
        r7 = (java.lang.reflect.Method) r7;
        r8 = "has";
        r3 = java.lang.String.valueOf(r3);
        r9 = r3.length();
        if (r9 == 0) goto L_0x0178;
    L_0x0173:
        r3 = r8.concat(r3);
        goto L_0x017d;
    L_0x0178:
        r3 = new java.lang.String;
        r3.<init>(r8);
    L_0x017d:
        r3 = r0.get(r3);
        r3 = (java.lang.reflect.Method) r3;
        if (r7 == 0) goto L_0x004d;
    L_0x0185:
        r8 = new java.lang.Object[r5];
        r7 = com.google.android.gms.internal.zzffu.m34109a(r7, r12, r8);
        if (r3 != 0) goto L_0x0204;
    L_0x018d:
        r3 = r7 instanceof java.lang.Boolean;
        if (r3 == 0) goto L_0x019f;
    L_0x0191:
        r3 = r7;
        r3 = (java.lang.Boolean) r3;
        r3 = r3.booleanValue();
        if (r3 != 0) goto L_0x019d;
    L_0x019a:
        r3 = 1;
        goto L_0x01fe;
    L_0x019d:
        r3 = 0;
        goto L_0x01fe;
    L_0x019f:
        r3 = r7 instanceof java.lang.Integer;
        if (r3 == 0) goto L_0x01ad;
    L_0x01a3:
        r3 = r7;
        r3 = (java.lang.Integer) r3;
        r3 = r3.intValue();
        if (r3 != 0) goto L_0x019d;
    L_0x01ac:
        goto L_0x019a;
    L_0x01ad:
        r3 = r7 instanceof java.lang.Float;
        if (r3 == 0) goto L_0x01be;
    L_0x01b1:
        r3 = r7;
        r3 = (java.lang.Float) r3;
        r3 = r3.floatValue();
        r8 = 0;
        r3 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1));
        if (r3 != 0) goto L_0x019d;
    L_0x01bd:
        goto L_0x019a;
    L_0x01be:
        r3 = r7 instanceof java.lang.Double;
        if (r3 == 0) goto L_0x01d0;
    L_0x01c2:
        r3 = r7;
        r3 = (java.lang.Double) r3;
        r8 = r3.doubleValue();
        r10 = 0;
        r3 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1));
        if (r3 != 0) goto L_0x019d;
    L_0x01cf:
        goto L_0x019a;
    L_0x01d0:
        r3 = r7 instanceof java.lang.String;
        if (r3 == 0) goto L_0x01db;
    L_0x01d4:
        r3 = "";
    L_0x01d6:
        r3 = r7.equals(r3);
        goto L_0x01fe;
    L_0x01db:
        r3 = r7 instanceof com.google.android.gms.internal.zzfes;
        if (r3 == 0) goto L_0x01e2;
    L_0x01df:
        r3 = com.google.android.gms.internal.zzfes.f16682a;
        goto L_0x01d6;
    L_0x01e2:
        r3 = r7 instanceof com.google.android.gms.internal.zzfhe;
        if (r3 == 0) goto L_0x01f0;
    L_0x01e6:
        r3 = r7;
        r3 = (com.google.android.gms.internal.zzfhe) r3;
        r3 = r3.zzcxq();
        if (r7 != r3) goto L_0x019d;
    L_0x01ef:
        goto L_0x019a;
    L_0x01f0:
        r3 = r7 instanceof java.lang.Enum;
        if (r3 == 0) goto L_0x019d;
    L_0x01f4:
        r3 = r7;
        r3 = (java.lang.Enum) r3;
        r3 = r3.ordinal();
        if (r3 != 0) goto L_0x019d;
    L_0x01fd:
        goto L_0x019a;
    L_0x01fe:
        if (r3 != 0) goto L_0x0202;
    L_0x0200:
        r3 = 1;
        goto L_0x0210;
    L_0x0202:
        r3 = 0;
        goto L_0x0210;
    L_0x0204:
        r6 = new java.lang.Object[r5];
        r3 = com.google.android.gms.internal.zzffu.m34109a(r3, r12, r6);
        r3 = (java.lang.Boolean) r3;
        r3 = r3.booleanValue();
    L_0x0210:
        if (r3 == 0) goto L_0x004d;
    L_0x0212:
        r3 = m18879a(r4);
        m18881a(r13, r14, r3, r7);
        goto L_0x004d;
    L_0x021b:
        r0 = r12 instanceof com.google.android.gms.internal.zzffu.C8193d;
        if (r0 == 0) goto L_0x023d;
    L_0x021f:
        r0 = r12;
        r0 = (com.google.android.gms.internal.zzffu.C8193d) r0;
        r0 = r0.f29328d;
        r0 = r0.m18853b();
        r1 = r0.hasNext();
        if (r1 == 0) goto L_0x023d;
    L_0x022e:
        r12 = r0.next();
        r12 = (java.util.Map.Entry) r12;
        r12.getKey();
        r12 = new java.lang.NoSuchMethodError;
        r12.<init>();
        throw r12;
    L_0x023d:
        r12 = (com.google.android.gms.internal.zzffu) r12;
        r0 = r12.f28829b;
        if (r0 == 0) goto L_0x0248;
    L_0x0243:
        r12 = r12.f28829b;
        r12.m18927a(r13, r14);
    L_0x0248:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.acq.a(com.google.android.gms.internal.zzfhe, java.lang.StringBuilder, int):void");
    }

    /* renamed from: a */
    static final void m18881a(StringBuilder stringBuilder, int i, String str, Object obj) {
        if (obj instanceof List) {
            for (Object a : (List) obj) {
                m18881a(stringBuilder, i, str, a);
            }
            return;
        }
        stringBuilder.append('\n');
        for (int i2 = 0; i2 < i; i2++) {
            stringBuilder.append(' ');
        }
        stringBuilder.append(str);
        if (obj instanceof String) {
            stringBuilder.append(": \"");
            stringBuilder.append(adj.m18914a(zzfes.m20297a((String) obj)));
            stringBuilder.append('\"');
        } else if (obj instanceof zzfes) {
            stringBuilder.append(": \"");
            stringBuilder.append(adj.m18914a((zzfes) obj));
            stringBuilder.append('\"');
        } else if (obj instanceof zzffu) {
            stringBuilder.append(" {");
            m18880a((zzffu) obj, stringBuilder, i + 2);
            stringBuilder.append("\n");
            for (int i3 = 0; i3 < i; i3++) {
                stringBuilder.append(' ');
            }
            stringBuilder.append("}");
        } else {
            stringBuilder.append(": ");
            stringBuilder.append(obj.toString());
        }
    }
}
