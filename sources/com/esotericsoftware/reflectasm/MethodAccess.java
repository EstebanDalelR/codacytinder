package com.esotericsoftware.reflectasm;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;

public abstract class MethodAccess {
    private String[] methodNames;
    private Class[][] parameterTypes;
    private Class[] returnTypes;

    public static com.esotericsoftware.reflectasm.MethodAccess get(java.lang.Class r34) {
        /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxRuntimeException: Not initialized variable reg: 23, insn: 0x035d: MOVE  (r4 ?[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (r23 ?[int, float, boolean, short, byte, char, OBJECT, ARRAY]), block:B:73:0x0353, method: com.esotericsoftware.reflectasm.MethodAccess.get(java.lang.Class):com.esotericsoftware.reflectasm.MethodAccess
	at jadx.core.dex.visitors.ssa.SSATransform.renameVar(SSATransform.java:168)
	at jadx.core.dex.visitors.ssa.SSATransform.renameVar(SSATransform.java:197)
	at jadx.core.dex.visitors.ssa.SSATransform.renameVar(SSATransform.java:197)
	at jadx.core.dex.visitors.ssa.SSATransform.renameVar(SSATransform.java:197)
	at jadx.core.dex.visitors.ssa.SSATransform.renameVar(SSATransform.java:197)
	at jadx.core.dex.visitors.ssa.SSATransform.renameVar(SSATransform.java:197)
	at jadx.core.dex.visitors.ssa.SSATransform.renameVar(SSATransform.java:197)
	at jadx.core.dex.visitors.ssa.SSATransform.renameVar(SSATransform.java:197)
	at jadx.core.dex.visitors.ssa.SSATransform.renameVar(SSATransform.java:197)
	at jadx.core.dex.visitors.ssa.SSATransform.renameVar(SSATransform.java:197)
	at jadx.core.dex.visitors.ssa.SSATransform.renameVar(SSATransform.java:197)
	at jadx.core.dex.visitors.ssa.SSATransform.renameVar(SSATransform.java:197)
	at jadx.core.dex.visitors.ssa.SSATransform.renameVar(SSATransform.java:197)
	at jadx.core.dex.visitors.ssa.SSATransform.renameVar(SSATransform.java:197)
	at jadx.core.dex.visitors.ssa.SSATransform.renameVar(SSATransform.java:197)
	at jadx.core.dex.visitors.ssa.SSATransform.renameVar(SSATransform.java:197)
	at jadx.core.dex.visitors.ssa.SSATransform.renameVar(SSATransform.java:197)
	at jadx.core.dex.visitors.ssa.SSATransform.renameVar(SSATransform.java:197)
	at jadx.core.dex.visitors.ssa.SSATransform.renameVar(SSATransform.java:197)
	at jadx.core.dex.visitors.ssa.SSATransform.renameVar(SSATransform.java:197)
	at jadx.core.dex.visitors.ssa.SSATransform.renameVar(SSATransform.java:197)
	at jadx.core.dex.visitors.ssa.SSATransform.renameVar(SSATransform.java:197)
	at jadx.core.dex.visitors.ssa.SSATransform.renameVar(SSATransform.java:197)
	at jadx.core.dex.visitors.ssa.SSATransform.renameVar(SSATransform.java:197)
	at jadx.core.dex.visitors.ssa.SSATransform.renameVariables(SSATransform.java:132)
	at jadx.core.dex.visitors.ssa.SSATransform.process(SSATransform.java:52)
	at jadx.core.dex.visitors.ssa.SSATransform.visit(SSATransform.java:42)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
        /*
        r1 = new java.util.ArrayList;
        r1.<init>();
        r2 = r34.isInterface();
        if (r2 != 0) goto L_0x001c;
    L_0x000b:
        r3 = r34;
    L_0x000d:
        r4 = java.lang.Object.class;
        if (r3 == r4) goto L_0x0019;
    L_0x0011:
        addDeclaredMethodsToList(r3, r1);
        r3 = r3.getSuperclass();
        goto L_0x000d;
    L_0x0019:
        r3 = r34;
        goto L_0x0021;
    L_0x001c:
        r3 = r34;
        recursiveAddInterfaceMethodsToList(r3, r1);
    L_0x0021:
        r4 = r1.size();
        r5 = new java.lang.String[r4];
        r6 = new java.lang.Class[r4][];
        r7 = new java.lang.Class[r4];
        r8 = 0;
        r9 = 0;
    L_0x002d:
        if (r9 >= r4) goto L_0x004a;
    L_0x002f:
        r10 = r1.get(r9);
        r10 = (java.lang.reflect.Method) r10;
        r11 = r10.getName();
        r5[r9] = r11;
        r11 = r10.getParameterTypes();
        r6[r9] = r11;
        r10 = r10.getReturnType();
        r7[r9] = r10;
        r9 = r9 + 1;
        goto L_0x002d;
    L_0x004a:
        r9 = r34.getName();
        r10 = new java.lang.StringBuilder;
        r10.<init>();
        r10.append(r9);
        r11 = "MethodAccess";
        r10.append(r11);
        r10 = r10.toString();
        r11 = "java.";
        r11 = r10.startsWith(r11);
        if (r11 == 0) goto L_0x0078;
    L_0x0067:
        r11 = new java.lang.StringBuilder;
        r11.<init>();
        r12 = "reflectasm.";
        r11.append(r12);
        r11.append(r10);
        r10 = r11.toString();
    L_0x0078:
        r3 = com.esotericsoftware.reflectasm.AccessClassLoader.get(r34);
        r11 = r3.loadClass(r10);	 Catch:{ ClassNotFoundException -> 0x0086 }
        r29 = r6;
        r28 = r7;
        goto L_0x03f3;
    L_0x0086:
        monitor-enter(r3);
        r11 = r3.loadClass(r10);	 Catch:{ ClassNotFoundException -> 0x0095 }
        r29 = r6;
        r28 = r7;
        goto L_0x03f2;
    L_0x0091:
        r0 = move-exception;
        r1 = r0;
        goto L_0x041d;
    L_0x0095:
        r11 = 47;
        r12 = 46;
        r16 = r10.replace(r12, r11);	 Catch:{ all -> 0x0091 }
        r9 = r9.replace(r12, r11);	 Catch:{ all -> 0x0091 }
        r11 = new org.objectweb.asm.g;	 Catch:{ all -> 0x0091 }
        r12 = 1;	 Catch:{ all -> 0x0091 }
        r11.<init>(r12);	 Catch:{ all -> 0x0091 }
        r14 = 196653; // 0x3002d float:2.7557E-40 double:9.71595E-319;	 Catch:{ all -> 0x0091 }
        r15 = 33;	 Catch:{ all -> 0x0091 }
        r17 = 0;	 Catch:{ all -> 0x0091 }
        r18 = "com/esotericsoftware/reflectasm/MethodAccess";	 Catch:{ all -> 0x0091 }
        r19 = 0;	 Catch:{ all -> 0x0091 }
        r13 = r11;	 Catch:{ all -> 0x0091 }
        r13.a(r14, r15, r16, r17, r18, r19);	 Catch:{ all -> 0x0091 }
        r18 = 1;	 Catch:{ all -> 0x0091 }
        r19 = "<init>";	 Catch:{ all -> 0x0091 }
        r20 = "()V";	 Catch:{ all -> 0x0091 }
        r21 = 0;	 Catch:{ all -> 0x0091 }
        r22 = 0;	 Catch:{ all -> 0x0091 }
        r17 = r11;	 Catch:{ all -> 0x0091 }
        r13 = r17.a(r18, r19, r20, r21, r22);	 Catch:{ all -> 0x0091 }
        r13.b();	 Catch:{ all -> 0x0091 }
        r14 = 25;	 Catch:{ all -> 0x0091 }
        r13.b(r14, r8);	 Catch:{ all -> 0x0091 }
        r15 = "com/esotericsoftware/reflectasm/MethodAccess";	 Catch:{ all -> 0x0091 }
        r12 = "<init>";	 Catch:{ all -> 0x0091 }
        r14 = "()V";	 Catch:{ all -> 0x0091 }
        r8 = 183; // 0xb7 float:2.56E-43 double:9.04E-322;	 Catch:{ all -> 0x0091 }
        r13.b(r8, r15, r12, r14);	 Catch:{ all -> 0x0091 }
        r12 = 177; // 0xb1 float:2.48E-43 double:8.74E-322;	 Catch:{ all -> 0x0091 }
        r13.a(r12);	 Catch:{ all -> 0x0091 }
        r12 = 0;	 Catch:{ all -> 0x0091 }
        r13.d(r12, r12);	 Catch:{ all -> 0x0091 }
        r13.c();	 Catch:{ all -> 0x0091 }
        r18 = 129; // 0x81 float:1.81E-43 double:6.37E-322;	 Catch:{ all -> 0x0091 }
        r19 = "invoke";	 Catch:{ all -> 0x0091 }
        r20 = "(Ljava/lang/Object;I[Ljava/lang/Object;)Ljava/lang/Object;";	 Catch:{ all -> 0x0091 }
        r21 = 0;	 Catch:{ all -> 0x0091 }
        r22 = 0;	 Catch:{ all -> 0x0091 }
        r17 = r11;	 Catch:{ all -> 0x0091 }
        r15 = r17.a(r18, r19, r20, r21, r22);	 Catch:{ all -> 0x0091 }
        r15.b();	 Catch:{ all -> 0x0091 }
        r12 = r1.isEmpty();	 Catch:{ all -> 0x0091 }
        r14 = 2;	 Catch:{ all -> 0x0091 }
        r13 = 21;	 Catch:{ all -> 0x0091 }
        if (r12 != 0) goto L_0x0384;	 Catch:{ all -> 0x0091 }
    L_0x0101:
        r8 = 25;	 Catch:{ all -> 0x0091 }
        r12 = 1;	 Catch:{ all -> 0x0091 }
        r15.b(r8, r12);	 Catch:{ all -> 0x0091 }
        r8 = 192; // 0xc0 float:2.69E-43 double:9.5E-322;	 Catch:{ all -> 0x0091 }
        r15.a(r8, r9);	 Catch:{ all -> 0x0091 }
        r12 = 58;	 Catch:{ all -> 0x0091 }
        r8 = 4;	 Catch:{ all -> 0x0091 }
        r15.b(r12, r8);	 Catch:{ all -> 0x0091 }
        r15.b(r13, r14);	 Catch:{ all -> 0x0091 }
        r12 = new org.objectweb.asm.C19346p[r4];	 Catch:{ all -> 0x0091 }
        r13 = 0;	 Catch:{ all -> 0x0091 }
    L_0x0118:
        if (r13 >= r4) goto L_0x0125;	 Catch:{ all -> 0x0091 }
    L_0x011a:
        r14 = new org.objectweb.asm.p;	 Catch:{ all -> 0x0091 }
        r14.<init>();	 Catch:{ all -> 0x0091 }
        r12[r13] = r14;	 Catch:{ all -> 0x0091 }
        r13 = r13 + 1;	 Catch:{ all -> 0x0091 }
        r14 = 2;	 Catch:{ all -> 0x0091 }
        goto L_0x0118;	 Catch:{ all -> 0x0091 }
    L_0x0125:
        r14 = new org.objectweb.asm.p;	 Catch:{ all -> 0x0091 }
        r14.<init>();	 Catch:{ all -> 0x0091 }
        r13 = r12.length;	 Catch:{ all -> 0x0091 }
        r16 = 1;	 Catch:{ all -> 0x0091 }
        r13 = r13 + -1;	 Catch:{ all -> 0x0091 }
        r8 = 0;	 Catch:{ all -> 0x0091 }
        r15.a(r8, r13, r14, r12);	 Catch:{ all -> 0x0091 }
        r8 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0091 }
        r13 = 128; // 0x80 float:1.794E-43 double:6.32E-322;	 Catch:{ all -> 0x0091 }
        r8.<init>(r13);	 Catch:{ all -> 0x0091 }
        r13 = 0;	 Catch:{ all -> 0x0091 }
    L_0x013b:
        if (r13 >= r4) goto L_0x036b;	 Catch:{ all -> 0x0091 }
    L_0x013d:
        r23 = r4;
        r4 = r12[r13];	 Catch:{ all -> 0x0091 }
        r15.a(r4);	 Catch:{ all -> 0x0091 }
        if (r13 != 0) goto L_0x0169;	 Catch:{ all -> 0x0091 }
    L_0x0146:
        r16 = 1;	 Catch:{ all -> 0x0091 }
        r24 = r14;	 Catch:{ all -> 0x0091 }
        r4 = 1;	 Catch:{ all -> 0x0091 }
        r14 = new java.lang.Object[r4];	 Catch:{ all -> 0x0091 }
        r4 = 0;	 Catch:{ all -> 0x0091 }
        r14[r4] = r9;	 Catch:{ all -> 0x0091 }
        r4 = 0;	 Catch:{ all -> 0x0091 }
        r17 = 0;	 Catch:{ all -> 0x0091 }
        r18 = r12;	 Catch:{ all -> 0x0091 }
        r12 = r15;	 Catch:{ all -> 0x0091 }
        r25 = r13;	 Catch:{ all -> 0x0091 }
        r13 = 1;	 Catch:{ all -> 0x0091 }
        r19 = r14;	 Catch:{ all -> 0x0091 }
        r26 = r24;	 Catch:{ all -> 0x0091 }
        r14 = r16;	 Catch:{ all -> 0x0091 }
        r27 = r15;	 Catch:{ all -> 0x0091 }
        r15 = r19;	 Catch:{ all -> 0x0091 }
        r16 = r4;	 Catch:{ all -> 0x0091 }
        r12.a(r13, r14, r15, r16, r17);	 Catch:{ all -> 0x0091 }
        goto L_0x017d;	 Catch:{ all -> 0x0091 }
    L_0x0169:
        r18 = r12;	 Catch:{ all -> 0x0091 }
        r25 = r13;	 Catch:{ all -> 0x0091 }
        r26 = r14;	 Catch:{ all -> 0x0091 }
        r27 = r15;	 Catch:{ all -> 0x0091 }
        r13 = 3;	 Catch:{ all -> 0x0091 }
        r14 = 0;	 Catch:{ all -> 0x0091 }
        r15 = 0;	 Catch:{ all -> 0x0091 }
        r16 = 0;	 Catch:{ all -> 0x0091 }
        r17 = 0;	 Catch:{ all -> 0x0091 }
        r12 = r27;	 Catch:{ all -> 0x0091 }
        r12.a(r13, r14, r15, r16, r17);	 Catch:{ all -> 0x0091 }
    L_0x017d:
        r4 = r27;	 Catch:{ all -> 0x0091 }
        r12 = 25;	 Catch:{ all -> 0x0091 }
        r13 = 4;	 Catch:{ all -> 0x0091 }
        r4.b(r12, r13);	 Catch:{ all -> 0x0091 }
        r12 = 0;	 Catch:{ all -> 0x0091 }
        r8.setLength(r12);	 Catch:{ all -> 0x0091 }
        r12 = 40;	 Catch:{ all -> 0x0091 }
        r8.append(r12);	 Catch:{ all -> 0x0091 }
        r12 = r25;	 Catch:{ all -> 0x0091 }
        r14 = r6[r12];	 Catch:{ all -> 0x0091 }
        r15 = r7[r12];	 Catch:{ all -> 0x0091 }
        r28 = r7;	 Catch:{ all -> 0x0091 }
        r13 = 0;	 Catch:{ all -> 0x0091 }
    L_0x0197:
        r7 = r14.length;	 Catch:{ all -> 0x0091 }
        if (r13 >= r7) goto L_0x02bb;	 Catch:{ all -> 0x0091 }
    L_0x019a:
        r7 = 3;	 Catch:{ all -> 0x0091 }
        r29 = r6;	 Catch:{ all -> 0x0091 }
        r6 = 25;	 Catch:{ all -> 0x0091 }
        r4.b(r6, r7);	 Catch:{ all -> 0x0091 }
        r7 = 16;	 Catch:{ all -> 0x0091 }
        r4.a(r7, r13);	 Catch:{ all -> 0x0091 }
        r7 = 50;	 Catch:{ all -> 0x0091 }
        r4.a(r7);	 Catch:{ all -> 0x0091 }
        r7 = r14[r13];	 Catch:{ all -> 0x0091 }
        r7 = org.objectweb.asm.C19348s.a(r7);	 Catch:{ all -> 0x0091 }
        r16 = r7.a();	 Catch:{ all -> 0x0091 }
        switch(r16) {
            case 1: goto L_0x0290;
            case 2: goto L_0x0277;
            case 3: goto L_0x025e;
            case 4: goto L_0x0245;
            case 5: goto L_0x022c;
            case 6: goto L_0x0212;
            case 7: goto L_0x01f8;
            case 8: goto L_0x01de;
            case 9: goto L_0x01d2;
            case 10: goto L_0x01c1;
            default: goto L_0x01b9;
        };	 Catch:{ all -> 0x0091 }
    L_0x01b9:
        r31 = r10;	 Catch:{ all -> 0x0091 }
        r32 = r11;	 Catch:{ all -> 0x0091 }
        r30 = r14;	 Catch:{ all -> 0x0091 }
        goto L_0x02a8;	 Catch:{ all -> 0x0091 }
    L_0x01c1:
        r6 = r7.e();	 Catch:{ all -> 0x0091 }
        r30 = r14;	 Catch:{ all -> 0x0091 }
        r14 = 192; // 0xc0 float:2.69E-43 double:9.5E-322;	 Catch:{ all -> 0x0091 }
        r4.a(r14, r6);	 Catch:{ all -> 0x0091 }
    L_0x01cc:
        r31 = r10;	 Catch:{ all -> 0x0091 }
        r32 = r11;	 Catch:{ all -> 0x0091 }
        goto L_0x02a8;	 Catch:{ all -> 0x0091 }
    L_0x01d2:
        r30 = r14;	 Catch:{ all -> 0x0091 }
        r14 = 192; // 0xc0 float:2.69E-43 double:9.5E-322;	 Catch:{ all -> 0x0091 }
        r6 = r7.f();	 Catch:{ all -> 0x0091 }
        r4.a(r14, r6);	 Catch:{ all -> 0x0091 }
        goto L_0x01cc;	 Catch:{ all -> 0x0091 }
    L_0x01de:
        r30 = r14;	 Catch:{ all -> 0x0091 }
        r14 = 192; // 0xc0 float:2.69E-43 double:9.5E-322;	 Catch:{ all -> 0x0091 }
        r6 = "java/lang/Double";	 Catch:{ all -> 0x0091 }
        r4.a(r14, r6);	 Catch:{ all -> 0x0091 }
        r6 = "java/lang/Double";	 Catch:{ all -> 0x0091 }
        r14 = "doubleValue";	 Catch:{ all -> 0x0091 }
        r31 = r10;	 Catch:{ all -> 0x0091 }
        r10 = "()D";	 Catch:{ all -> 0x0091 }
        r32 = r11;	 Catch:{ all -> 0x0091 }
        r11 = 182; // 0xb6 float:2.55E-43 double:9.0E-322;	 Catch:{ all -> 0x0091 }
        r4.b(r11, r6, r14, r10);	 Catch:{ all -> 0x0091 }
        goto L_0x02a8;	 Catch:{ all -> 0x0091 }
    L_0x01f8:
        r31 = r10;	 Catch:{ all -> 0x0091 }
        r32 = r11;	 Catch:{ all -> 0x0091 }
        r30 = r14;	 Catch:{ all -> 0x0091 }
        r6 = "java/lang/Long";	 Catch:{ all -> 0x0091 }
        r10 = 192; // 0xc0 float:2.69E-43 double:9.5E-322;	 Catch:{ all -> 0x0091 }
        r4.a(r10, r6);	 Catch:{ all -> 0x0091 }
        r6 = "java/lang/Long";	 Catch:{ all -> 0x0091 }
        r10 = "longValue";	 Catch:{ all -> 0x0091 }
        r11 = "()J";	 Catch:{ all -> 0x0091 }
        r14 = 182; // 0xb6 float:2.55E-43 double:9.0E-322;	 Catch:{ all -> 0x0091 }
        r4.b(r14, r6, r10, r11);	 Catch:{ all -> 0x0091 }
        goto L_0x02a8;	 Catch:{ all -> 0x0091 }
    L_0x0212:
        r31 = r10;	 Catch:{ all -> 0x0091 }
        r32 = r11;	 Catch:{ all -> 0x0091 }
        r30 = r14;	 Catch:{ all -> 0x0091 }
        r6 = "java/lang/Float";	 Catch:{ all -> 0x0091 }
        r10 = 192; // 0xc0 float:2.69E-43 double:9.5E-322;	 Catch:{ all -> 0x0091 }
        r4.a(r10, r6);	 Catch:{ all -> 0x0091 }
        r6 = "java/lang/Float";	 Catch:{ all -> 0x0091 }
        r10 = "floatValue";	 Catch:{ all -> 0x0091 }
        r11 = "()F";	 Catch:{ all -> 0x0091 }
        r14 = 182; // 0xb6 float:2.55E-43 double:9.0E-322;	 Catch:{ all -> 0x0091 }
        r4.b(r14, r6, r10, r11);	 Catch:{ all -> 0x0091 }
        goto L_0x02a8;	 Catch:{ all -> 0x0091 }
    L_0x022c:
        r31 = r10;	 Catch:{ all -> 0x0091 }
        r32 = r11;	 Catch:{ all -> 0x0091 }
        r30 = r14;	 Catch:{ all -> 0x0091 }
        r6 = "java/lang/Integer";	 Catch:{ all -> 0x0091 }
        r10 = 192; // 0xc0 float:2.69E-43 double:9.5E-322;	 Catch:{ all -> 0x0091 }
        r4.a(r10, r6);	 Catch:{ all -> 0x0091 }
        r6 = "java/lang/Integer";	 Catch:{ all -> 0x0091 }
        r10 = "intValue";	 Catch:{ all -> 0x0091 }
        r11 = "()I";	 Catch:{ all -> 0x0091 }
        r14 = 182; // 0xb6 float:2.55E-43 double:9.0E-322;	 Catch:{ all -> 0x0091 }
        r4.b(r14, r6, r10, r11);	 Catch:{ all -> 0x0091 }
        goto L_0x02a8;	 Catch:{ all -> 0x0091 }
    L_0x0245:
        r31 = r10;	 Catch:{ all -> 0x0091 }
        r32 = r11;	 Catch:{ all -> 0x0091 }
        r30 = r14;	 Catch:{ all -> 0x0091 }
        r6 = "java/lang/Short";	 Catch:{ all -> 0x0091 }
        r10 = 192; // 0xc0 float:2.69E-43 double:9.5E-322;	 Catch:{ all -> 0x0091 }
        r4.a(r10, r6);	 Catch:{ all -> 0x0091 }
        r6 = "java/lang/Short";	 Catch:{ all -> 0x0091 }
        r10 = "shortValue";	 Catch:{ all -> 0x0091 }
        r11 = "()S";	 Catch:{ all -> 0x0091 }
        r14 = 182; // 0xb6 float:2.55E-43 double:9.0E-322;	 Catch:{ all -> 0x0091 }
        r4.b(r14, r6, r10, r11);	 Catch:{ all -> 0x0091 }
        goto L_0x02a8;	 Catch:{ all -> 0x0091 }
    L_0x025e:
        r31 = r10;	 Catch:{ all -> 0x0091 }
        r32 = r11;	 Catch:{ all -> 0x0091 }
        r30 = r14;	 Catch:{ all -> 0x0091 }
        r6 = "java/lang/Byte";	 Catch:{ all -> 0x0091 }
        r10 = 192; // 0xc0 float:2.69E-43 double:9.5E-322;	 Catch:{ all -> 0x0091 }
        r4.a(r10, r6);	 Catch:{ all -> 0x0091 }
        r6 = "java/lang/Byte";	 Catch:{ all -> 0x0091 }
        r10 = "byteValue";	 Catch:{ all -> 0x0091 }
        r11 = "()B";	 Catch:{ all -> 0x0091 }
        r14 = 182; // 0xb6 float:2.55E-43 double:9.0E-322;	 Catch:{ all -> 0x0091 }
        r4.b(r14, r6, r10, r11);	 Catch:{ all -> 0x0091 }
        goto L_0x02a8;	 Catch:{ all -> 0x0091 }
    L_0x0277:
        r31 = r10;	 Catch:{ all -> 0x0091 }
        r32 = r11;	 Catch:{ all -> 0x0091 }
        r30 = r14;	 Catch:{ all -> 0x0091 }
        r6 = "java/lang/Character";	 Catch:{ all -> 0x0091 }
        r10 = 192; // 0xc0 float:2.69E-43 double:9.5E-322;	 Catch:{ all -> 0x0091 }
        r4.a(r10, r6);	 Catch:{ all -> 0x0091 }
        r6 = "java/lang/Character";	 Catch:{ all -> 0x0091 }
        r10 = "charValue";	 Catch:{ all -> 0x0091 }
        r11 = "()C";	 Catch:{ all -> 0x0091 }
        r14 = 182; // 0xb6 float:2.55E-43 double:9.0E-322;	 Catch:{ all -> 0x0091 }
        r4.b(r14, r6, r10, r11);	 Catch:{ all -> 0x0091 }
        goto L_0x02a8;	 Catch:{ all -> 0x0091 }
    L_0x0290:
        r31 = r10;	 Catch:{ all -> 0x0091 }
        r32 = r11;	 Catch:{ all -> 0x0091 }
        r30 = r14;	 Catch:{ all -> 0x0091 }
        r6 = "java/lang/Boolean";	 Catch:{ all -> 0x0091 }
        r10 = 192; // 0xc0 float:2.69E-43 double:9.5E-322;	 Catch:{ all -> 0x0091 }
        r4.a(r10, r6);	 Catch:{ all -> 0x0091 }
        r6 = "java/lang/Boolean";	 Catch:{ all -> 0x0091 }
        r11 = "booleanValue";	 Catch:{ all -> 0x0091 }
        r14 = "()Z";	 Catch:{ all -> 0x0091 }
        r10 = 182; // 0xb6 float:2.55E-43 double:9.0E-322;	 Catch:{ all -> 0x0091 }
        r4.b(r10, r6, r11, r14);	 Catch:{ all -> 0x0091 }
    L_0x02a8:
        r6 = r7.f();	 Catch:{ all -> 0x0091 }
        r8.append(r6);	 Catch:{ all -> 0x0091 }
        r13 = r13 + 1;	 Catch:{ all -> 0x0091 }
        r6 = r29;	 Catch:{ all -> 0x0091 }
        r14 = r30;	 Catch:{ all -> 0x0091 }
        r10 = r31;	 Catch:{ all -> 0x0091 }
        r11 = r32;	 Catch:{ all -> 0x0091 }
        goto L_0x0197;	 Catch:{ all -> 0x0091 }
    L_0x02bb:
        r29 = r6;	 Catch:{ all -> 0x0091 }
        r31 = r10;	 Catch:{ all -> 0x0091 }
        r32 = r11;	 Catch:{ all -> 0x0091 }
        r6 = 41;	 Catch:{ all -> 0x0091 }
        r8.append(r6);	 Catch:{ all -> 0x0091 }
        r6 = org.objectweb.asm.C19348s.b(r15);	 Catch:{ all -> 0x0091 }
        r8.append(r6);	 Catch:{ all -> 0x0091 }
        r6 = 184; // 0xb8 float:2.58E-43 double:9.1E-322;	 Catch:{ all -> 0x0091 }
        if (r2 == 0) goto L_0x02d4;	 Catch:{ all -> 0x0091 }
    L_0x02d1:
        r7 = 185; // 0xb9 float:2.59E-43 double:9.14E-322;	 Catch:{ all -> 0x0091 }
        goto L_0x02e9;	 Catch:{ all -> 0x0091 }
    L_0x02d4:
        r7 = r1.get(r12);	 Catch:{ all -> 0x0091 }
        r7 = (java.lang.reflect.Method) r7;	 Catch:{ all -> 0x0091 }
        r7 = r7.getModifiers();	 Catch:{ all -> 0x0091 }
        r7 = java.lang.reflect.Modifier.isStatic(r7);	 Catch:{ all -> 0x0091 }
        if (r7 == 0) goto L_0x02e7;	 Catch:{ all -> 0x0091 }
    L_0x02e4:
        r7 = 184; // 0xb8 float:2.58E-43 double:9.1E-322;	 Catch:{ all -> 0x0091 }
        goto L_0x02e9;	 Catch:{ all -> 0x0091 }
    L_0x02e7:
        r7 = 182; // 0xb6 float:2.55E-43 double:9.0E-322;	 Catch:{ all -> 0x0091 }
    L_0x02e9:
        r10 = r5[r12];	 Catch:{ all -> 0x0091 }
        r11 = r8.toString();	 Catch:{ all -> 0x0091 }
        r4.b(r7, r9, r10, r11);	 Catch:{ all -> 0x0091 }
        r7 = org.objectweb.asm.C19348s.a(r15);	 Catch:{ all -> 0x0091 }
        r7 = r7.a();	 Catch:{ all -> 0x0091 }
        switch(r7) {
            case 0: goto L_0x034f;
            case 1: goto L_0x0345;
            case 2: goto L_0x033b;
            case 3: goto L_0x0331;
            case 4: goto L_0x0327;
            case 5: goto L_0x031d;
            case 6: goto L_0x0313;
            case 7: goto L_0x0309;
            case 8: goto L_0x02ff;
            default: goto L_0x02fd;
        };	 Catch:{ all -> 0x0091 }
    L_0x02fd:
        r6 = 1;	 Catch:{ all -> 0x0091 }
        goto L_0x0353;	 Catch:{ all -> 0x0091 }
    L_0x02ff:
        r7 = "java/lang/Double";	 Catch:{ all -> 0x0091 }
        r10 = "valueOf";	 Catch:{ all -> 0x0091 }
        r11 = "(D)Ljava/lang/Double;";	 Catch:{ all -> 0x0091 }
        r4.b(r6, r7, r10, r11);	 Catch:{ all -> 0x0091 }
        goto L_0x02fd;	 Catch:{ all -> 0x0091 }
    L_0x0309:
        r7 = "java/lang/Long";	 Catch:{ all -> 0x0091 }
        r10 = "valueOf";	 Catch:{ all -> 0x0091 }
        r11 = "(J)Ljava/lang/Long;";	 Catch:{ all -> 0x0091 }
        r4.b(r6, r7, r10, r11);	 Catch:{ all -> 0x0091 }
        goto L_0x02fd;	 Catch:{ all -> 0x0091 }
    L_0x0313:
        r7 = "java/lang/Float";	 Catch:{ all -> 0x0091 }
        r10 = "valueOf";	 Catch:{ all -> 0x0091 }
        r11 = "(F)Ljava/lang/Float;";	 Catch:{ all -> 0x0091 }
        r4.b(r6, r7, r10, r11);	 Catch:{ all -> 0x0091 }
        goto L_0x02fd;	 Catch:{ all -> 0x0091 }
    L_0x031d:
        r7 = "java/lang/Integer";	 Catch:{ all -> 0x0091 }
        r10 = "valueOf";	 Catch:{ all -> 0x0091 }
        r11 = "(I)Ljava/lang/Integer;";	 Catch:{ all -> 0x0091 }
        r4.b(r6, r7, r10, r11);	 Catch:{ all -> 0x0091 }
        goto L_0x02fd;	 Catch:{ all -> 0x0091 }
    L_0x0327:
        r7 = "java/lang/Short";	 Catch:{ all -> 0x0091 }
        r10 = "valueOf";	 Catch:{ all -> 0x0091 }
        r11 = "(S)Ljava/lang/Short;";	 Catch:{ all -> 0x0091 }
        r4.b(r6, r7, r10, r11);	 Catch:{ all -> 0x0091 }
        goto L_0x02fd;	 Catch:{ all -> 0x0091 }
    L_0x0331:
        r7 = "java/lang/Byte";	 Catch:{ all -> 0x0091 }
        r10 = "valueOf";	 Catch:{ all -> 0x0091 }
        r11 = "(B)Ljava/lang/Byte;";	 Catch:{ all -> 0x0091 }
        r4.b(r6, r7, r10, r11);	 Catch:{ all -> 0x0091 }
        goto L_0x02fd;	 Catch:{ all -> 0x0091 }
    L_0x033b:
        r7 = "java/lang/Character";	 Catch:{ all -> 0x0091 }
        r10 = "valueOf";	 Catch:{ all -> 0x0091 }
        r11 = "(C)Ljava/lang/Character;";	 Catch:{ all -> 0x0091 }
        r4.b(r6, r7, r10, r11);	 Catch:{ all -> 0x0091 }
        goto L_0x02fd;	 Catch:{ all -> 0x0091 }
    L_0x0345:
        r7 = "java/lang/Boolean";	 Catch:{ all -> 0x0091 }
        r10 = "valueOf";	 Catch:{ all -> 0x0091 }
        r11 = "(Z)Ljava/lang/Boolean;";	 Catch:{ all -> 0x0091 }
        r4.b(r6, r7, r10, r11);	 Catch:{ all -> 0x0091 }
        goto L_0x02fd;	 Catch:{ all -> 0x0091 }
    L_0x034f:
        r6 = 1;	 Catch:{ all -> 0x0091 }
        r4.a(r6);	 Catch:{ all -> 0x0091 }
    L_0x0353:
        r7 = 176; // 0xb0 float:2.47E-43 double:8.7E-322;	 Catch:{ all -> 0x0091 }
        r4.a(r7);	 Catch:{ all -> 0x0091 }
        r13 = r12 + 1;	 Catch:{ all -> 0x0091 }
        r15 = r4;	 Catch:{ all -> 0x0091 }
        r12 = r18;	 Catch:{ all -> 0x0091 }
        r4 = r23;	 Catch:{ all -> 0x0091 }
        r14 = r26;	 Catch:{ all -> 0x0091 }
        r7 = r28;	 Catch:{ all -> 0x0091 }
        r6 = r29;	 Catch:{ all -> 0x0091 }
        r10 = r31;	 Catch:{ all -> 0x0091 }
        r11 = r32;	 Catch:{ all -> 0x0091 }
        goto L_0x013b;	 Catch:{ all -> 0x0091 }
    L_0x036b:
        r29 = r6;	 Catch:{ all -> 0x0091 }
        r28 = r7;	 Catch:{ all -> 0x0091 }
        r31 = r10;	 Catch:{ all -> 0x0091 }
        r32 = r11;	 Catch:{ all -> 0x0091 }
        r1 = r14;	 Catch:{ all -> 0x0091 }
        r4 = r15;	 Catch:{ all -> 0x0091 }
        r4.a(r1);	 Catch:{ all -> 0x0091 }
        r13 = 3;	 Catch:{ all -> 0x0091 }
        r14 = 0;	 Catch:{ all -> 0x0091 }
        r15 = 0;	 Catch:{ all -> 0x0091 }
        r16 = 0;	 Catch:{ all -> 0x0091 }
        r17 = 0;	 Catch:{ all -> 0x0091 }
        r12 = r4;	 Catch:{ all -> 0x0091 }
        r12.a(r13, r14, r15, r16, r17);	 Catch:{ all -> 0x0091 }
        goto L_0x038d;	 Catch:{ all -> 0x0091 }
    L_0x0384:
        r29 = r6;	 Catch:{ all -> 0x0091 }
        r28 = r7;	 Catch:{ all -> 0x0091 }
        r31 = r10;	 Catch:{ all -> 0x0091 }
        r32 = r11;	 Catch:{ all -> 0x0091 }
        r4 = r15;	 Catch:{ all -> 0x0091 }
    L_0x038d:
        r1 = "java/lang/IllegalArgumentException";	 Catch:{ all -> 0x0091 }
        r2 = 187; // 0xbb float:2.62E-43 double:9.24E-322;	 Catch:{ all -> 0x0091 }
        r4.a(r2, r1);	 Catch:{ all -> 0x0091 }
        r1 = 89;	 Catch:{ all -> 0x0091 }
        r4.a(r1);	 Catch:{ all -> 0x0091 }
        r6 = "java/lang/StringBuilder";	 Catch:{ all -> 0x0091 }
        r4.a(r2, r6);	 Catch:{ all -> 0x0091 }
        r4.a(r1);	 Catch:{ all -> 0x0091 }
        r1 = "Method not found: ";	 Catch:{ all -> 0x0091 }
        r4.a(r1);	 Catch:{ all -> 0x0091 }
        r1 = "java/lang/StringBuilder";	 Catch:{ all -> 0x0091 }
        r2 = "<init>";	 Catch:{ all -> 0x0091 }
        r6 = "(Ljava/lang/String;)V";	 Catch:{ all -> 0x0091 }
        r7 = 183; // 0xb7 float:2.56E-43 double:9.04E-322;	 Catch:{ all -> 0x0091 }
        r4.b(r7, r1, r2, r6);	 Catch:{ all -> 0x0091 }
        r1 = 21;	 Catch:{ all -> 0x0091 }
        r2 = 2;	 Catch:{ all -> 0x0091 }
        r4.b(r1, r2);	 Catch:{ all -> 0x0091 }
        r1 = "java/lang/StringBuilder";	 Catch:{ all -> 0x0091 }
        r2 = "append";	 Catch:{ all -> 0x0091 }
        r6 = "(I)Ljava/lang/StringBuilder;";	 Catch:{ all -> 0x0091 }
        r7 = 182; // 0xb6 float:2.55E-43 double:9.0E-322;	 Catch:{ all -> 0x0091 }
        r4.b(r7, r1, r2, r6);	 Catch:{ all -> 0x0091 }
        r1 = "java/lang/StringBuilder";	 Catch:{ all -> 0x0091 }
        r2 = "toString";	 Catch:{ all -> 0x0091 }
        r6 = "()Ljava/lang/String;";	 Catch:{ all -> 0x0091 }
        r4.b(r7, r1, r2, r6);	 Catch:{ all -> 0x0091 }
        r1 = "java/lang/IllegalArgumentException";	 Catch:{ all -> 0x0091 }
        r2 = "<init>";	 Catch:{ all -> 0x0091 }
        r6 = "(Ljava/lang/String;)V";	 Catch:{ all -> 0x0091 }
        r7 = 183; // 0xb7 float:2.56E-43 double:9.04E-322;	 Catch:{ all -> 0x0091 }
        r4.b(r7, r1, r2, r6);	 Catch:{ all -> 0x0091 }
        r1 = 191; // 0xbf float:2.68E-43 double:9.44E-322;	 Catch:{ all -> 0x0091 }
        r4.a(r1);	 Catch:{ all -> 0x0091 }
        r1 = 0;	 Catch:{ all -> 0x0091 }
        r4.d(r1, r1);	 Catch:{ all -> 0x0091 }
        r4.c();	 Catch:{ all -> 0x0091 }
        r1 = r32;	 Catch:{ all -> 0x0091 }
        r1.a();	 Catch:{ all -> 0x0091 }
        r1 = r1.b();	 Catch:{ all -> 0x0091 }
        r10 = r31;	 Catch:{ all -> 0x0091 }
        r1 = r3.defineClass(r10, r1);	 Catch:{ all -> 0x0091 }
        r11 = r1;	 Catch:{ all -> 0x0091 }
    L_0x03f2:
        monitor-exit(r3);	 Catch:{ all -> 0x0091 }
    L_0x03f3:
        r1 = r11.newInstance();	 Catch:{ Throwable -> 0x0404 }
        r1 = (com.esotericsoftware.reflectasm.MethodAccess) r1;	 Catch:{ Throwable -> 0x0404 }
        r1.methodNames = r5;	 Catch:{ Throwable -> 0x0404 }
        r2 = r29;	 Catch:{ Throwable -> 0x0404 }
        r1.parameterTypes = r2;	 Catch:{ Throwable -> 0x0404 }
        r2 = r28;	 Catch:{ Throwable -> 0x0404 }
        r1.returnTypes = r2;	 Catch:{ Throwable -> 0x0404 }
        return r1;
    L_0x0404:
        r0 = move-exception;
        r1 = r0;
        r2 = new java.lang.RuntimeException;
        r3 = new java.lang.StringBuilder;
        r3.<init>();
        r4 = "Error constructing method access class: ";
        r3.append(r4);
        r3.append(r10);
        r3 = r3.toString();
        r2.<init>(r3, r1);
        throw r2;
    L_0x041d:
        monitor-exit(r3);	 Catch:{ all -> 0x0091 }
        throw r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.esotericsoftware.reflectasm.MethodAccess.get(java.lang.Class):com.esotericsoftware.reflectasm.MethodAccess");
    }

    public abstract Object invoke(Object obj, int i, Object... objArr);

    public Object invoke(Object obj, String str, Class[] clsArr, Object... objArr) {
        return invoke(obj, getIndex(str, clsArr), objArr);
    }

    public Object invoke(Object obj, String str, Object... objArr) {
        return invoke(obj, getIndex(str, objArr == null ? 0 : objArr.length), objArr);
    }

    public int getIndex(String str) {
        int length = this.methodNames.length;
        for (int i = 0; i < length; i++) {
            if (this.methodNames[i].equals(str)) {
                return i;
            }
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Unable to find non-private method: ");
        stringBuilder.append(str);
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    public int getIndex(String str, Class... clsArr) {
        int length = this.methodNames.length;
        int i = 0;
        while (i < length) {
            if (this.methodNames[i].equals(str) && Arrays.equals(clsArr, this.parameterTypes[i])) {
                return i;
            }
            i++;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Unable to find non-private method: ");
        stringBuilder.append(str);
        stringBuilder.append(" ");
        stringBuilder.append(Arrays.toString(clsArr));
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    public int getIndex(String str, int i) {
        int length = this.methodNames.length;
        int i2 = 0;
        while (i2 < length) {
            if (this.methodNames[i2].equals(str) && this.parameterTypes[i2].length == i) {
                return i2;
            }
            i2++;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Unable to find non-private method: ");
        stringBuilder.append(str);
        stringBuilder.append(" with ");
        stringBuilder.append(i);
        stringBuilder.append(" params.");
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    public String[] getMethodNames() {
        return this.methodNames;
    }

    public Class[][] getParameterTypes() {
        return this.parameterTypes;
    }

    public Class[] getReturnTypes() {
        return this.returnTypes;
    }

    private static void addDeclaredMethodsToList(Class cls, ArrayList<Method> arrayList) {
        for (Method method : cls.getDeclaredMethods()) {
            if (!Modifier.isPrivate(method.getModifiers())) {
                arrayList.add(method);
            }
        }
    }

    private static void recursiveAddInterfaceMethodsToList(Class cls, ArrayList<Method> arrayList) {
        addDeclaredMethodsToList(cls, arrayList);
        for (Class recursiveAddInterfaceMethodsToList : cls.getInterfaces()) {
            recursiveAddInterfaceMethodsToList(recursiveAddInterfaceMethodsToList, arrayList);
        }
    }
}
