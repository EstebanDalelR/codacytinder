package com.esotericsoftware.reflectasm;

import java.lang.reflect.Field;
import java.util.ArrayList;
import org.objectweb.asm.C19346p;
import org.objectweb.asm.C19347q;
import org.objectweb.asm.C19348s;
import org.objectweb.asm.C19506g;

public abstract class FieldAccess {
    private String[] fieldNames;
    private Class[] fieldTypes;

    public abstract Object get(Object obj, int i);

    public abstract boolean getBoolean(Object obj, int i);

    public abstract byte getByte(Object obj, int i);

    public abstract char getChar(Object obj, int i);

    public abstract double getDouble(Object obj, int i);

    public abstract float getFloat(Object obj, int i);

    public abstract int getInt(Object obj, int i);

    public abstract long getLong(Object obj, int i);

    public abstract short getShort(Object obj, int i);

    public abstract String getString(Object obj, int i);

    public abstract void set(Object obj, int i, Object obj2);

    public abstract void setBoolean(Object obj, int i, boolean z);

    public abstract void setByte(Object obj, int i, byte b);

    public abstract void setChar(Object obj, int i, char c);

    public abstract void setDouble(Object obj, int i, double d);

    public abstract void setFloat(Object obj, int i, float f);

    public abstract void setInt(Object obj, int i, int i2);

    public abstract void setLong(Object obj, int i, long j);

    public abstract void setShort(Object obj, int i, short s);

    public int getIndex(String str) {
        int length = this.fieldNames.length;
        for (int i = 0; i < length; i++) {
            if (this.fieldNames[i].equals(str)) {
                return i;
            }
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Unable to find non-private field: ");
        stringBuilder.append(str);
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    public void set(Object obj, String str, Object obj2) {
        set(obj, getIndex(str), obj2);
    }

    public Object get(Object obj, String str) {
        return get(obj, getIndex(str));
    }

    public String[] getFieldNames() {
        return this.fieldNames;
    }

    public Class[] getFieldTypes() {
        return this.fieldTypes;
    }

    public int getFieldCount() {
        return this.fieldTypes.length;
    }

    public static com.esotericsoftware.reflectasm.FieldAccess get(java.lang.Class r15) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
        /*
        r0 = new java.util.ArrayList;
        r0.<init>();
        r1 = r15;
    L_0x0006:
        r2 = java.lang.Object.class;
        r3 = 0;
        if (r1 == r2) goto L_0x0031;
    L_0x000b:
        r2 = r1.getDeclaredFields();
        r4 = r2.length;
    L_0x0010:
        if (r3 >= r4) goto L_0x002c;
    L_0x0012:
        r5 = r2[r3];
        r6 = r5.getModifiers();
        r7 = java.lang.reflect.Modifier.isStatic(r6);
        if (r7 == 0) goto L_0x001f;
    L_0x001e:
        goto L_0x0029;
    L_0x001f:
        r6 = java.lang.reflect.Modifier.isPrivate(r6);
        if (r6 == 0) goto L_0x0026;
    L_0x0025:
        goto L_0x0029;
    L_0x0026:
        r0.add(r5);
    L_0x0029:
        r3 = r3 + 1;
        goto L_0x0010;
    L_0x002c:
        r1 = r1.getSuperclass();
        goto L_0x0006;
    L_0x0031:
        r1 = r0.size();
        r1 = new java.lang.String[r1];
        r2 = r0.size();
        r2 = new java.lang.Class[r2];
        r4 = r1.length;
        r5 = 0;
    L_0x003f:
        if (r5 >= r4) goto L_0x005c;
    L_0x0041:
        r6 = r0.get(r5);
        r6 = (java.lang.reflect.Field) r6;
        r6 = r6.getName();
        r1[r5] = r6;
        r6 = r0.get(r5);
        r6 = (java.lang.reflect.Field) r6;
        r6 = r6.getType();
        r2[r5] = r6;
        r5 = r5 + 1;
        goto L_0x003f;
    L_0x005c:
        r4 = r15.getName();
        r5 = new java.lang.StringBuilder;
        r5.<init>();
        r5.append(r4);
        r6 = "FieldAccess";
        r5.append(r6);
        r5 = r5.toString();
        r6 = "java.";
        r6 = r5.startsWith(r6);
        if (r6 == 0) goto L_0x008a;
    L_0x0079:
        r6 = new java.lang.StringBuilder;
        r6.<init>();
        r7 = "reflectasm.";
        r6.append(r7);
        r6.append(r5);
        r5 = r6.toString();
    L_0x008a:
        r15 = com.esotericsoftware.reflectasm.AccessClassLoader.get(r15);
        r6 = r15.loadClass(r5);	 Catch:{ ClassNotFoundException -> 0x0094 }
        goto L_0x0125;
    L_0x0094:
        monitor-enter(r15);
        r6 = r15.loadClass(r5);	 Catch:{ ClassNotFoundException -> 0x009e }
        goto L_0x0124;
    L_0x009b:
        r0 = move-exception;
        goto L_0x0148;
    L_0x009e:
        r6 = 47;
        r7 = 46;
        r11 = r5.replace(r7, r6);	 Catch:{ all -> 0x009b }
        r4 = r4.replace(r7, r6);	 Catch:{ all -> 0x009b }
        r6 = new org.objectweb.asm.g;	 Catch:{ all -> 0x009b }
        r6.<init>(r3);	 Catch:{ all -> 0x009b }
        r9 = 196653; // 0x3002d float:2.7557E-40 double:9.71595E-319;	 Catch:{ all -> 0x009b }
        r10 = 33;	 Catch:{ all -> 0x009b }
        r12 = 0;	 Catch:{ all -> 0x009b }
        r13 = "com/esotericsoftware/reflectasm/FieldAccess";	 Catch:{ all -> 0x009b }
        r14 = 0;	 Catch:{ all -> 0x009b }
        r8 = r6;	 Catch:{ all -> 0x009b }
        r8.a(r9, r10, r11, r12, r13, r14);	 Catch:{ all -> 0x009b }
        insertConstructor(r6);	 Catch:{ all -> 0x009b }
        insertGetObject(r6, r4, r0);	 Catch:{ all -> 0x009b }
        insertSetObject(r6, r4, r0);	 Catch:{ all -> 0x009b }
        r3 = org.objectweb.asm.C19348s.f60388b;	 Catch:{ all -> 0x009b }
        insertGetPrimitive(r6, r4, r0, r3);	 Catch:{ all -> 0x009b }
        r3 = org.objectweb.asm.C19348s.f60388b;	 Catch:{ all -> 0x009b }
        insertSetPrimitive(r6, r4, r0, r3);	 Catch:{ all -> 0x009b }
        r3 = org.objectweb.asm.C19348s.f60390d;	 Catch:{ all -> 0x009b }
        insertGetPrimitive(r6, r4, r0, r3);	 Catch:{ all -> 0x009b }
        r3 = org.objectweb.asm.C19348s.f60390d;	 Catch:{ all -> 0x009b }
        insertSetPrimitive(r6, r4, r0, r3);	 Catch:{ all -> 0x009b }
        r3 = org.objectweb.asm.C19348s.f60391e;	 Catch:{ all -> 0x009b }
        insertGetPrimitive(r6, r4, r0, r3);	 Catch:{ all -> 0x009b }
        r3 = org.objectweb.asm.C19348s.f60391e;	 Catch:{ all -> 0x009b }
        insertSetPrimitive(r6, r4, r0, r3);	 Catch:{ all -> 0x009b }
        r3 = org.objectweb.asm.C19348s.f60392f;	 Catch:{ all -> 0x009b }
        insertGetPrimitive(r6, r4, r0, r3);	 Catch:{ all -> 0x009b }
        r3 = org.objectweb.asm.C19348s.f60392f;	 Catch:{ all -> 0x009b }
        insertSetPrimitive(r6, r4, r0, r3);	 Catch:{ all -> 0x009b }
        r3 = org.objectweb.asm.C19348s.f60394h;	 Catch:{ all -> 0x009b }
        insertGetPrimitive(r6, r4, r0, r3);	 Catch:{ all -> 0x009b }
        r3 = org.objectweb.asm.C19348s.f60394h;	 Catch:{ all -> 0x009b }
        insertSetPrimitive(r6, r4, r0, r3);	 Catch:{ all -> 0x009b }
        r3 = org.objectweb.asm.C19348s.f60395i;	 Catch:{ all -> 0x009b }
        insertGetPrimitive(r6, r4, r0, r3);	 Catch:{ all -> 0x009b }
        r3 = org.objectweb.asm.C19348s.f60395i;	 Catch:{ all -> 0x009b }
        insertSetPrimitive(r6, r4, r0, r3);	 Catch:{ all -> 0x009b }
        r3 = org.objectweb.asm.C19348s.f60393g;	 Catch:{ all -> 0x009b }
        insertGetPrimitive(r6, r4, r0, r3);	 Catch:{ all -> 0x009b }
        r3 = org.objectweb.asm.C19348s.f60393g;	 Catch:{ all -> 0x009b }
        insertSetPrimitive(r6, r4, r0, r3);	 Catch:{ all -> 0x009b }
        r3 = org.objectweb.asm.C19348s.f60389c;	 Catch:{ all -> 0x009b }
        insertGetPrimitive(r6, r4, r0, r3);	 Catch:{ all -> 0x009b }
        r3 = org.objectweb.asm.C19348s.f60389c;	 Catch:{ all -> 0x009b }
        insertSetPrimitive(r6, r4, r0, r3);	 Catch:{ all -> 0x009b }
        insertGetString(r6, r4, r0);	 Catch:{ all -> 0x009b }
        r6.a();	 Catch:{ all -> 0x009b }
        r0 = r6.b();	 Catch:{ all -> 0x009b }
        r0 = r15.defineClass(r5, r0);	 Catch:{ all -> 0x009b }
        r6 = r0;	 Catch:{ all -> 0x009b }
    L_0x0124:
        monitor-exit(r15);	 Catch:{ all -> 0x009b }
    L_0x0125:
        r15 = r6.newInstance();	 Catch:{ Throwable -> 0x0130 }
        r15 = (com.esotericsoftware.reflectasm.FieldAccess) r15;	 Catch:{ Throwable -> 0x0130 }
        r15.fieldNames = r1;	 Catch:{ Throwable -> 0x0130 }
        r15.fieldTypes = r2;	 Catch:{ Throwable -> 0x0130 }
        return r15;
    L_0x0130:
        r15 = move-exception;
        r0 = new java.lang.RuntimeException;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = "Error constructing field access class: ";
        r1.append(r2);
        r1.append(r5);
        r1 = r1.toString();
        r0.<init>(r1, r15);
        throw r0;
    L_0x0148:
        monitor-exit(r15);	 Catch:{ all -> 0x009b }
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.esotericsoftware.reflectasm.FieldAccess.get(java.lang.Class):com.esotericsoftware.reflectasm.FieldAccess");
    }

    private static void insertConstructor(C19506g c19506g) {
        c19506g = c19506g.a(1, "<init>", "()V", null, null);
        c19506g.b();
        c19506g.b(25, 0);
        c19506g.b(183, "com/esotericsoftware/reflectasm/FieldAccess", "<init>", "()V");
        c19506g.a(177);
        c19506g.d(1, 1);
        c19506g.c();
    }

    private static void insertSetObject(C19506g c19506g, String str, ArrayList<Field> arrayList) {
        int i;
        String str2 = str;
        C19347q a = c19506g.a(1, "set", "(Ljava/lang/Object;ILjava/lang/Object;)V", null, null);
        a.b();
        a.b(21, 2);
        if (arrayList.isEmpty()) {
            i = 6;
        } else {
            int i2;
            C19346p[] c19346pArr = new C19346p[arrayList.size()];
            int length = c19346pArr.length;
            int i3 = 0;
            for (i2 = 0; i2 < length; i2++) {
                c19346pArr[i2] = new C19346p();
            }
            C19346p c19346p = new C19346p();
            a.a(0, c19346pArr.length - 1, c19346p, c19346pArr);
            i2 = c19346pArr.length;
            while (i3 < i2) {
                Field field = (Field) arrayList.get(i3);
                C19348s a2 = C19348s.a(field.getType());
                a.a(c19346pArr[i3]);
                C19348s c19348s = a2;
                a.a(3, 0, null, 0, null);
                a.b(25, 1);
                a.a(192, str2);
                a.b(25, 3);
                switch (c19348s.a()) {
                    case 1:
                        a.a(192, "java/lang/Boolean");
                        a.b(182, "java/lang/Boolean", "booleanValue", "()Z");
                        break;
                    case 2:
                        a.a(192, "java/lang/Character");
                        a.b(182, "java/lang/Character", "charValue", "()C");
                        break;
                    case 3:
                        a.a(192, "java/lang/Byte");
                        a.b(182, "java/lang/Byte", "byteValue", "()B");
                        break;
                    case 4:
                        a.a(192, "java/lang/Short");
                        a.b(182, "java/lang/Short", "shortValue", "()S");
                        break;
                    case 5:
                        a.a(192, "java/lang/Integer");
                        a.b(182, "java/lang/Integer", "intValue", "()I");
                        break;
                    case 6:
                        a.a(192, "java/lang/Float");
                        a.b(182, "java/lang/Float", "floatValue", "()F");
                        break;
                    case 7:
                        a.a(192, "java/lang/Long");
                        a.b(182, "java/lang/Long", "longValue", "()J");
                        break;
                    case 8:
                        a.a(192, "java/lang/Double");
                        a.b(182, "java/lang/Double", "doubleValue", "()D");
                        break;
                    case 9:
                        a.a(192, c19348s.f());
                        break;
                    case 10:
                        a.a(192, c19348s.e());
                        break;
                    default:
                        break;
                }
                a.a(181, str2, field.getName(), c19348s.f());
                a.a(177);
                i3++;
            }
            a.a(c19346p);
            a.a(3, 0, null, 0, null);
            i = 5;
        }
        C19347q insertThrowExceptionForFieldNotFound = insertThrowExceptionForFieldNotFound(a);
        insertThrowExceptionForFieldNotFound.d(i, 4);
        insertThrowExceptionForFieldNotFound.c();
    }

    private static void insertGetObject(C19506g c19506g, String str, ArrayList<Field> arrayList) {
        int i;
        c19506g = c19506g.a(1, "get", "(Ljava/lang/Object;I)Ljava/lang/Object;", null, null);
        c19506g.b();
        c19506g.b(21, 2);
        if (arrayList.isEmpty()) {
            i = 6;
        } else {
            int i2;
            i = 5;
            C19346p[] c19346pArr = new C19346p[arrayList.size()];
            int length = c19346pArr.length;
            int i3 = 0;
            for (i2 = 0; i2 < length; i2++) {
                c19346pArr[i2] = new C19346p();
            }
            C19346p c19346p = new C19346p();
            c19506g.a(0, c19346pArr.length - 1, c19346p, c19346pArr);
            i2 = c19346pArr.length;
            while (i3 < i2) {
                Field field = (Field) arrayList.get(i3);
                c19506g.a(c19346pArr[i3]);
                c19506g.a(3, 0, null, 0, null);
                c19506g.b(25, 1);
                c19506g.a(192, str);
                c19506g.a(180, str, field.getName(), C19348s.b(field.getType()));
                switch (C19348s.a(field.getType()).a()) {
                    case 1:
                        c19506g.b(184, "java/lang/Boolean", "valueOf", "(Z)Ljava/lang/Boolean;");
                        break;
                    case 2:
                        c19506g.b(184, "java/lang/Character", "valueOf", "(C)Ljava/lang/Character;");
                        break;
                    case 3:
                        c19506g.b(184, "java/lang/Byte", "valueOf", "(B)Ljava/lang/Byte;");
                        break;
                    case 4:
                        c19506g.b(184, "java/lang/Short", "valueOf", "(S)Ljava/lang/Short;");
                        break;
                    case 5:
                        c19506g.b(184, "java/lang/Integer", "valueOf", "(I)Ljava/lang/Integer;");
                        break;
                    case 6:
                        c19506g.b(184, "java/lang/Float", "valueOf", "(F)Ljava/lang/Float;");
                        break;
                    case 7:
                        c19506g.b(184, "java/lang/Long", "valueOf", "(J)Ljava/lang/Long;");
                        break;
                    case 8:
                        c19506g.b(184, "java/lang/Double", "valueOf", "(D)Ljava/lang/Double;");
                        break;
                    default:
                        break;
                }
                c19506g.a(176);
                i3++;
            }
            c19506g.a(c19346p);
            c19506g.a(3, 0, null, 0, null);
        }
        insertThrowExceptionForFieldNotFound(c19506g);
        c19506g.d(i, 3);
        c19506g.c();
    }

    private static void insertGetString(C19506g c19506g, String str, ArrayList<Field> arrayList) {
        int i;
        String str2 = str;
        ArrayList<Field> arrayList2 = arrayList;
        C19347q a = c19506g.a(1, "getString", "(Ljava/lang/Object;I)Ljava/lang/String;", null, null);
        a.b();
        a.b(21, 2);
        if (arrayList.isEmpty()) {
            i = 6;
        } else {
            i = 5;
            C19346p[] c19346pArr = new C19346p[arrayList.size()];
            C19346p c19346p = new C19346p();
            int length = c19346pArr.length;
            int i2 = 0;
            Object obj = null;
            for (int i3 = 0; i3 < length; i3++) {
                if (((Field) arrayList2.get(i3)).getType().equals(String.class)) {
                    c19346pArr[i3] = new C19346p();
                } else {
                    c19346pArr[i3] = c19346p;
                    obj = 1;
                }
            }
            C19346p c19346p2 = new C19346p();
            a.a(0, c19346pArr.length - 1, c19346p2, c19346pArr);
            int length2 = c19346pArr.length;
            while (i2 < length2) {
                int i4;
                if (c19346pArr[i2].equals(c19346p)) {
                    i4 = length2;
                } else {
                    a.a(c19346pArr[i2]);
                    i4 = length2;
                    a.a(3, 0, null, 0, null);
                    a.b(25, 1);
                    a.a(192, str2);
                    a.a(180, str2, ((Field) arrayList2.get(i2)).getName(), "Ljava/lang/String;");
                    a.a(176);
                }
                i2++;
                length2 = i4;
            }
            if (obj != null) {
                a.a(c19346p);
                a.a(3, 0, null, 0, null);
                insertThrowExceptionForFieldType(a, "String");
            }
            a.a(c19346p2);
            a.a(3, 0, null, 0, null);
        }
        insertThrowExceptionForFieldNotFound(a);
        a.d(i, 3);
        a.c();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void insertSetPrimitive(org.objectweb.asm.C19506g r22, java.lang.String r23, java.util.ArrayList<java.lang.reflect.Field> r24, org.objectweb.asm.C19348s r25) {
        /*
        r0 = r23;
        r1 = r24;
        r2 = r25.f();
        r3 = r25.a();
        r6 = 21;
        r7 = 4;
        switch(r3) {
            case 1: goto L_0x003a;
            case 2: goto L_0x0037;
            case 3: goto L_0x0034;
            case 4: goto L_0x0031;
            case 5: goto L_0x002e;
            case 6: goto L_0x0025;
            case 7: goto L_0x001e;
            case 8: goto L_0x0019;
            default: goto L_0x0012;
        };
    L_0x0012:
        r3 = "set";
        r10 = r3;
        r3 = 4;
        r7 = 25;
        goto L_0x0040;
    L_0x0019:
        r3 = "setDouble";
        r7 = 24;
        goto L_0x0022;
    L_0x001e:
        r3 = "setLong";
        r7 = 22;
    L_0x0022:
        r10 = r3;
        r3 = 5;
        goto L_0x0040;
    L_0x0025:
        r3 = "setFloat";
        r8 = 23;
        r10 = r3;
        r3 = 4;
        r7 = 23;
        goto L_0x0040;
    L_0x002e:
        r3 = "setInt";
        goto L_0x003c;
    L_0x0031:
        r3 = "setShort";
        goto L_0x003c;
    L_0x0034:
        r3 = "setByte";
        goto L_0x003c;
    L_0x0037:
        r3 = "setChar";
        goto L_0x003c;
    L_0x003a:
        r3 = "setBoolean";
    L_0x003c:
        r10 = r3;
        r3 = 4;
        r7 = 21;
    L_0x0040:
        r9 = 1;
        r8 = new java.lang.StringBuilder;
        r8.<init>();
        r11 = "(Ljava/lang/Object;I";
        r8.append(r11);
        r8.append(r2);
        r11 = ")V";
        r8.append(r11);
        r11 = r8.toString();
        r12 = 0;
        r13 = 0;
        r8 = r22;
        r8 = r8.a(r9, r10, r11, r12, r13);
        r8.b();
        r9 = 2;
        r8.b(r6, r9);
        r6 = r24.isEmpty();
        if (r6 != 0) goto L_0x012d;
    L_0x006c:
        r6 = r24.size();
        r6 = new org.objectweb.asm.C19346p[r6];
        r9 = new org.objectweb.asm.p;
        r9.<init>();
        r10 = r6.length;
        r11 = 0;
        r12 = 0;
        r13 = 0;
    L_0x007b:
        r15 = 1;
        if (r12 >= r10) goto L_0x00a2;
    L_0x007e:
        r14 = r1.get(r12);
        r14 = (java.lang.reflect.Field) r14;
        r14 = r14.getType();
        r14 = org.objectweb.asm.C19348s.a(r14);
        r5 = r25;
        r14 = r14.equals(r5);
        if (r14 == 0) goto L_0x009c;
    L_0x0094:
        r14 = new org.objectweb.asm.p;
        r14.<init>();
        r6[r12] = r14;
        goto L_0x009f;
    L_0x009c:
        r6[r12] = r9;
        r13 = 1;
    L_0x009f:
        r12 = r12 + 1;
        goto L_0x007b;
    L_0x00a2:
        r5 = r25;
        r10 = new org.objectweb.asm.p;
        r10.<init>();
        r12 = r6.length;
        r12 = r12 - r15;
        r8.a(r11, r12, r10, r6);
        r12 = r6.length;
    L_0x00af:
        if (r11 >= r12) goto L_0x0102;
    L_0x00b1:
        r14 = r6[r11];
        r14 = r14.equals(r9);
        if (r14 != 0) goto L_0x00fc;
    L_0x00b9:
        r14 = r6[r11];
        r8.a(r14);
        r16 = 3;
        r17 = 0;
        r18 = 0;
        r19 = 0;
        r20 = 0;
        r14 = r8;
        r4 = 1;
        r15 = r16;
        r16 = r17;
        r17 = r18;
        r18 = r19;
        r19 = r20;
        r14.a(r15, r16, r17, r18, r19);
        r14 = 25;
        r8.b(r14, r4);
        r15 = 192; // 0xc0 float:2.69E-43 double:9.5E-322;
        r8.a(r15, r0);
        r15 = 3;
        r8.b(r7, r15);
        r15 = 181; // 0xb5 float:2.54E-43 double:8.94E-322;
        r16 = r1.get(r11);
        r4 = r16;
        r4 = (java.lang.reflect.Field) r4;
        r4 = r4.getName();
        r8.a(r15, r0, r4, r2);
        r4 = 177; // 0xb1 float:2.48E-43 double:8.74E-322;
        r8.a(r4);
        goto L_0x00fe;
    L_0x00fc:
        r14 = 25;
    L_0x00fe:
        r11 = r11 + 1;
        r15 = 1;
        goto L_0x00af;
    L_0x0102:
        if (r13 == 0) goto L_0x011b;
    L_0x0104:
        r8.a(r9);
        r15 = 3;
        r16 = 0;
        r17 = 0;
        r18 = 0;
        r19 = 0;
        r14 = r8;
        r14.a(r15, r16, r17, r18, r19);
        r0 = r25.d();
        insertThrowExceptionForFieldType(r8, r0);
    L_0x011b:
        r8.a(r10);
        r15 = 3;
        r16 = 0;
        r17 = 0;
        r18 = 0;
        r19 = 0;
        r14 = r8;
        r14.a(r15, r16, r17, r18, r19);
        r5 = 5;
        goto L_0x012e;
    L_0x012d:
        r5 = 6;
    L_0x012e:
        r0 = insertThrowExceptionForFieldNotFound(r8);
        r0.d(r5, r3);
        r0.c();
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.esotericsoftware.reflectasm.FieldAccess.insertSetPrimitive(org.objectweb.asm.g, java.lang.String, java.util.ArrayList, org.objectweb.asm.s):void");
    }

    private static void insertGetPrimitive(C19506g c19506g, String str, ArrayList<Field> arrayList, C19348s c19348s) {
        String str2;
        int i;
        String str3 = str;
        ArrayList<Field> arrayList2 = arrayList;
        String f = c19348s.f();
        int i2 = 172;
        switch (c19348s.a()) {
            case 1:
                str2 = "getBoolean";
                break;
            case 2:
                str2 = "getChar";
                break;
            case 3:
                str2 = "getByte";
                break;
            case 4:
                str2 = "getShort";
                break;
            case 5:
                str2 = "getInt";
                break;
            case 6:
                str2 = "getFloat";
                i2 = 174;
                break;
            case 7:
                str2 = "getLong";
                i2 = 173;
                break;
            case 8:
                str2 = "getDouble";
                i2 = 175;
                break;
            default:
                str2 = "get";
                i2 = 176;
                break;
        }
        String str4 = str2;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("(Ljava/lang/Object;I)");
        stringBuilder.append(f);
        C19347q a = c19506g.a(1, str4, stringBuilder.toString(), null, null);
        a.b();
        a.b(21, 2);
        if (arrayList.isEmpty()) {
            i = 6;
        } else {
            int i3;
            C19346p[] c19346pArr = new C19346p[arrayList.size()];
            C19346p c19346p = new C19346p();
            int length = c19346pArr.length;
            int i4 = 0;
            Object obj = null;
            for (i3 = 0; i3 < length; i3++) {
                if (C19348s.a(((Field) arrayList2.get(i3)).getType()).equals(c19348s)) {
                    c19346pArr[i3] = new C19346p();
                } else {
                    c19346pArr[i3] = c19346p;
                    obj = 1;
                }
            }
            C19348s c19348s2 = c19348s;
            C19346p c19346p2 = new C19346p();
            a.a(0, c19346pArr.length - 1, c19346p2, c19346pArr);
            i3 = c19346pArr.length;
            while (i4 < i3) {
                Field field = (Field) arrayList2.get(i4);
                if (!c19346pArr[i4].equals(c19346p)) {
                    a.a(c19346pArr[i4]);
                    Field field2 = field;
                    a.a(3, 0, null, 0, null);
                    a.b(25, 1);
                    a.a(192, str3);
                    a.a(180, str3, field2.getName(), f);
                    a.a(i2);
                }
                i4++;
                c19348s2 = c19348s;
            }
            if (obj != null) {
                a.a(c19346p);
                a.a(3, 0, null, 0, null);
                insertThrowExceptionForFieldType(a, c19348s.d());
            }
            a.a(c19346p2);
            a.a(3, 0, null, 0, null);
            i = 5;
        }
        C19347q insertThrowExceptionForFieldNotFound = insertThrowExceptionForFieldNotFound(a);
        insertThrowExceptionForFieldNotFound.d(i, 3);
        insertThrowExceptionForFieldNotFound.c();
    }

    private static C19347q insertThrowExceptionForFieldNotFound(C19347q c19347q) {
        c19347q.a(187, "java/lang/IllegalArgumentException");
        c19347q.a(89);
        c19347q.a(187, "java/lang/StringBuilder");
        c19347q.a(89);
        c19347q.a("Field not found: ");
        c19347q.b(183, "java/lang/StringBuilder", "<init>", "(Ljava/lang/String;)V");
        c19347q.b(21, 2);
        c19347q.b(182, "java/lang/StringBuilder", "append", "(I)Ljava/lang/StringBuilder;");
        c19347q.b(182, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;");
        c19347q.b(183, "java/lang/IllegalArgumentException", "<init>", "(Ljava/lang/String;)V");
        c19347q.a(191);
        return c19347q;
    }

    private static C19347q insertThrowExceptionForFieldType(C19347q c19347q, String str) {
        c19347q.a(187, "java/lang/IllegalArgumentException");
        c19347q.a(89);
        c19347q.a(187, "java/lang/StringBuilder");
        c19347q.a(89);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Field not declared as ");
        stringBuilder.append(str);
        stringBuilder.append(": ");
        c19347q.a(stringBuilder.toString());
        c19347q.b(183, "java/lang/StringBuilder", "<init>", "(Ljava/lang/String;)V");
        c19347q.b(21, 2);
        c19347q.b(182, "java/lang/StringBuilder", "append", "(I)Ljava/lang/StringBuilder;");
        c19347q.b(182, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;");
        c19347q.b(183, "java/lang/IllegalArgumentException", "<init>", "(Ljava/lang/String;)V");
        c19347q.a(191);
        return c19347q;
    }
}
