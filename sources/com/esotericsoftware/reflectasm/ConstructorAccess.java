package com.esotericsoftware.reflectasm;

import org.objectweb.asm.C19506g;

public abstract class ConstructorAccess<T> {
    boolean isNonStaticMemberClass;

    public abstract T newInstance();

    public abstract T newInstance(Object obj);

    public boolean isNonStaticMemberClass() {
        return this.isNonStaticMemberClass;
    }

    public static <T> com.esotericsoftware.reflectasm.ConstructorAccess<T> get(java.lang.Class<T> r18) {
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
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
        /*
        r1 = r18;
        r2 = r18.getEnclosingClass();
        r3 = 1;
        r4 = 0;
        if (r2 == 0) goto L_0x001c;
    L_0x000a:
        r5 = r18.isMemberClass();
        if (r5 == 0) goto L_0x001c;
    L_0x0010:
        r5 = r18.getModifiers();
        r5 = java.lang.reflect.Modifier.isStatic(r5);
        if (r5 != 0) goto L_0x001c;
    L_0x001a:
        r5 = 1;
        goto L_0x001d;
    L_0x001c:
        r5 = 0;
    L_0x001d:
        r6 = r18.getName();
        r7 = new java.lang.StringBuilder;
        r7.<init>();
        r7.append(r6);
        r8 = "ConstructorAccess";
        r7.append(r8);
        r7 = r7.toString();
        r8 = "java.";
        r8 = r7.startsWith(r8);
        if (r8 == 0) goto L_0x004b;
    L_0x003a:
        r8 = new java.lang.StringBuilder;
        r8.<init>();
        r9 = "reflectasm.";
        r8.append(r9);
        r8.append(r7);
        r7 = r8.toString();
    L_0x004b:
        r8 = com.esotericsoftware.reflectasm.AccessClassLoader.get(r18);
        r9 = r8.loadClass(r7);	 Catch:{ ClassNotFoundException -> 0x0055 }
        goto L_0x0123;
    L_0x0055:
        monitor-enter(r8);
        r9 = r8.loadClass(r7);	 Catch:{ ClassNotFoundException -> 0x0060 }
        goto L_0x0122;
    L_0x005c:
        r0 = move-exception;
        r1 = r0;
        goto L_0x018c;
    L_0x0060:
        r9 = 47;
        r10 = 46;
        r14 = r7.replace(r10, r9);	 Catch:{ all -> 0x005c }
        r6 = r6.replace(r10, r9);	 Catch:{ all -> 0x005c }
        r11 = 0;
        if (r5 != 0) goto L_0x00ba;
    L_0x006f:
        r2 = r11;	 Catch:{ Exception -> 0x009d }
        r2 = (java.lang.Class[]) r2;	 Catch:{ Exception -> 0x009d }
        r2 = r1.getDeclaredConstructor(r2);	 Catch:{ Exception -> 0x009d }
        r2 = r2.getModifiers();	 Catch:{ Exception -> 0x009d }
        r3 = java.lang.reflect.Modifier.isPrivate(r2);	 Catch:{ all -> 0x005c }
        if (r3 == 0) goto L_0x009b;	 Catch:{ all -> 0x005c }
    L_0x0080:
        r2 = new java.lang.RuntimeException;	 Catch:{ all -> 0x005c }
        r3 = new java.lang.StringBuilder;	 Catch:{ all -> 0x005c }
        r3.<init>();	 Catch:{ all -> 0x005c }
        r4 = "Class cannot be created (the no-arg constructor is private): ";	 Catch:{ all -> 0x005c }
        r3.append(r4);	 Catch:{ all -> 0x005c }
        r1 = r18.getName();	 Catch:{ all -> 0x005c }
        r3.append(r1);	 Catch:{ all -> 0x005c }
        r1 = r3.toString();	 Catch:{ all -> 0x005c }
        r2.<init>(r1);	 Catch:{ all -> 0x005c }
        throw r2;	 Catch:{ all -> 0x005c }
    L_0x009b:
        r3 = r11;	 Catch:{ all -> 0x005c }
        goto L_0x00ef;	 Catch:{ all -> 0x005c }
    L_0x009d:
        r0 = move-exception;	 Catch:{ all -> 0x005c }
        r2 = r0;	 Catch:{ all -> 0x005c }
        r3 = new java.lang.RuntimeException;	 Catch:{ all -> 0x005c }
        r4 = new java.lang.StringBuilder;	 Catch:{ all -> 0x005c }
        r4.<init>();	 Catch:{ all -> 0x005c }
        r5 = "Class cannot be created (missing no-arg constructor): ";	 Catch:{ all -> 0x005c }
        r4.append(r5);	 Catch:{ all -> 0x005c }
        r1 = r18.getName();	 Catch:{ all -> 0x005c }
        r4.append(r1);	 Catch:{ all -> 0x005c }
        r1 = r4.toString();	 Catch:{ all -> 0x005c }
        r3.<init>(r1, r2);	 Catch:{ all -> 0x005c }
        throw r3;	 Catch:{ all -> 0x005c }
    L_0x00ba:
        r11 = r2.getName();	 Catch:{ all -> 0x005c }
        r11 = r11.replace(r10, r9);	 Catch:{ all -> 0x005c }
        r3 = new java.lang.Class[r3];	 Catch:{ Exception -> 0x016f }
        r3[r4] = r2;	 Catch:{ Exception -> 0x016f }
        r2 = r1.getDeclaredConstructor(r3);	 Catch:{ Exception -> 0x016f }
        r2 = r2.getModifiers();	 Catch:{ Exception -> 0x016f }
        r3 = java.lang.reflect.Modifier.isPrivate(r2);	 Catch:{ all -> 0x005c }
        if (r3 == 0) goto L_0x009b;	 Catch:{ all -> 0x005c }
    L_0x00d4:
        r2 = new java.lang.RuntimeException;	 Catch:{ all -> 0x005c }
        r3 = new java.lang.StringBuilder;	 Catch:{ all -> 0x005c }
        r3.<init>();	 Catch:{ all -> 0x005c }
        r4 = "Non-static member class cannot be created (the enclosing class constructor is private): ";	 Catch:{ all -> 0x005c }
        r3.append(r4);	 Catch:{ all -> 0x005c }
        r1 = r18.getName();	 Catch:{ all -> 0x005c }
        r3.append(r1);	 Catch:{ all -> 0x005c }
        r1 = r3.toString();	 Catch:{ all -> 0x005c }
        r2.<init>(r1);	 Catch:{ all -> 0x005c }
        throw r2;	 Catch:{ all -> 0x005c }
    L_0x00ef:
        r2 = java.lang.reflect.Modifier.isPublic(r2);	 Catch:{ all -> 0x005c }
        if (r2 == 0) goto L_0x00f8;	 Catch:{ all -> 0x005c }
    L_0x00f5:
        r2 = "com/esotericsoftware/reflectasm/PublicConstructorAccess";	 Catch:{ all -> 0x005c }
        goto L_0x00fa;	 Catch:{ all -> 0x005c }
    L_0x00f8:
        r2 = "com/esotericsoftware/reflectasm/ConstructorAccess";	 Catch:{ all -> 0x005c }
    L_0x00fa:
        r9 = new org.objectweb.asm.g;	 Catch:{ all -> 0x005c }
        r9.<init>(r4);	 Catch:{ all -> 0x005c }
        r12 = 196653; // 0x3002d float:2.7557E-40 double:9.71595E-319;	 Catch:{ all -> 0x005c }
        r13 = 33;	 Catch:{ all -> 0x005c }
        r15 = 0;	 Catch:{ all -> 0x005c }
        r17 = 0;	 Catch:{ all -> 0x005c }
        r11 = r9;	 Catch:{ all -> 0x005c }
        r16 = r2;	 Catch:{ all -> 0x005c }
        r11.a(r12, r13, r14, r15, r16, r17);	 Catch:{ all -> 0x005c }
        insertConstructor(r9, r2);	 Catch:{ all -> 0x005c }
        insertNewInstance(r9, r6);	 Catch:{ all -> 0x005c }
        insertNewInstanceInner(r9, r6, r3);	 Catch:{ all -> 0x005c }
        r9.a();	 Catch:{ all -> 0x005c }
        r2 = r9.b();	 Catch:{ all -> 0x005c }
        r2 = r8.defineClass(r7, r2);	 Catch:{ all -> 0x005c }
        r9 = r2;	 Catch:{ all -> 0x005c }
    L_0x0122:
        monitor-exit(r8);	 Catch:{ all -> 0x005c }
    L_0x0123:
        r2 = r9.newInstance();	 Catch:{ Throwable -> 0x0156 }
        r2 = (com.esotericsoftware.reflectasm.ConstructorAccess) r2;	 Catch:{ Throwable -> 0x0156 }
        r3 = r2 instanceof com.esotericsoftware.reflectasm.PublicConstructorAccess;
        if (r3 != 0) goto L_0x0153;
    L_0x012d:
        r3 = com.esotericsoftware.reflectasm.AccessClassLoader.areInSameRuntimeClassLoader(r1, r9);
        if (r3 != 0) goto L_0x0153;
    L_0x0133:
        r2 = new java.lang.RuntimeException;
        r3 = new java.lang.StringBuilder;
        r3.<init>();
        if (r5 != 0) goto L_0x013f;
    L_0x013c:
        r4 = "Class cannot be created (the no-arg constructor is protected or package-protected, and its ConstructorAccess could not be defined in the same class loader): ";
        goto L_0x0141;
    L_0x013f:
        r4 = "Non-static member class cannot be created (the enclosing class constructor is protected or package-protected, and its ConstructorAccess could not be defined in the same class loader): ";
    L_0x0141:
        r3.append(r4);
        r1 = r18.getName();
        r3.append(r1);
        r1 = r3.toString();
        r2.<init>(r1);
        throw r2;
    L_0x0153:
        r2.isNonStaticMemberClass = r5;
        return r2;
    L_0x0156:
        r0 = move-exception;
        r1 = r0;
        r2 = new java.lang.RuntimeException;
        r3 = new java.lang.StringBuilder;
        r3.<init>();
        r4 = "Exception constructing constructor access class: ";
        r3.append(r4);
        r3.append(r7);
        r3 = r3.toString();
        r2.<init>(r3, r1);
        throw r2;
    L_0x016f:
        r0 = move-exception;
        r2 = r0;
        r3 = new java.lang.RuntimeException;	 Catch:{ all -> 0x005c }
        r4 = new java.lang.StringBuilder;	 Catch:{ all -> 0x005c }
        r4.<init>();	 Catch:{ all -> 0x005c }
        r5 = "Non-static member class cannot be created (missing enclosing class constructor): ";	 Catch:{ all -> 0x005c }
        r4.append(r5);	 Catch:{ all -> 0x005c }
        r1 = r18.getName();	 Catch:{ all -> 0x005c }
        r4.append(r1);	 Catch:{ all -> 0x005c }
        r1 = r4.toString();	 Catch:{ all -> 0x005c }
        r3.<init>(r1, r2);	 Catch:{ all -> 0x005c }
        throw r3;	 Catch:{ all -> 0x005c }
    L_0x018c:
        monitor-exit(r8);	 Catch:{ all -> 0x005c }
        throw r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.esotericsoftware.reflectasm.ConstructorAccess.get(java.lang.Class):com.esotericsoftware.reflectasm.ConstructorAccess<T>");
    }

    private static void insertConstructor(C19506g c19506g, String str) {
        c19506g = c19506g.a(1, "<init>", "()V", null, null);
        c19506g.b();
        c19506g.b(25, 0);
        c19506g.b(183, str, "<init>", "()V");
        c19506g.a(177);
        c19506g.d(1, 1);
        c19506g.c();
    }

    static void insertNewInstance(C19506g c19506g, String str) {
        c19506g = c19506g.a(1, "newInstance", "()Ljava/lang/Object;", null, null);
        c19506g.b();
        c19506g.a(187, str);
        c19506g.a(89);
        c19506g.b(183, str, "<init>", "()V");
        c19506g.a(176);
        c19506g.d(2, 1);
        c19506g.c();
    }

    static void insertNewInstanceInner(C19506g c19506g, String str, String str2) {
        c19506g = c19506g.a(1, "newInstance", "(Ljava/lang/Object;)Ljava/lang/Object;", null, null);
        c19506g.b();
        if (str2 != null) {
            c19506g.a(187, str);
            c19506g.a(89);
            c19506g.b(25, 1);
            c19506g.a(192, str2);
            c19506g.a(89);
            c19506g.b(182, "java/lang/Object", "getClass", "()Ljava/lang/Class;");
            c19506g.a(87);
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("(L");
            stringBuilder.append(str2);
            stringBuilder.append(";)V");
            c19506g.b(183, str, "<init>", stringBuilder.toString());
            c19506g.a(176);
            c19506g.d(4, 2);
        } else {
            c19506g.a(187, "java/lang/UnsupportedOperationException");
            c19506g.a(89);
            c19506g.a("Not an inner class.");
            c19506g.b(183, "java/lang/UnsupportedOperationException", "<init>", "(Ljava/lang/String;)V");
            c19506g.a(191);
            c19506g.d(3, 2);
        }
        c19506g.c();
    }
}
