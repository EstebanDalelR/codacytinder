package kotlin.reflect.jvm.internal.impl.load.java;

public final class UtilsKt {
    @org.jetbrains.annotations.Nullable
    public static final kotlin.reflect.jvm.internal.impl.load.java.JavaDefaultValue lexicalCastFrom(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.KotlinType r4, @org.jetbrains.annotations.NotNull java.lang.String r5) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r0 = "$receiver";
        kotlin.jvm.internal.C2668g.b(r4, r0);
        r0 = "value";
        kotlin.jvm.internal.C2668g.b(r5, r0);
        r0 = r4.getConstructor();
        r0 = r0.getDeclarationDescriptor();
        r1 = r0 instanceof kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
        r2 = 0;
        if (r1 == 0) goto L_0x004d;
    L_0x0017:
        r0 = (kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor) r0;
        r1 = r0.getKind();
        r3 = kotlin.reflect.jvm.internal.impl.descriptors.ClassKind.ENUM_CLASS;
        if (r1 != r3) goto L_0x004d;
    L_0x0021:
        r4 = r0.getUnsubstitutedInnerClassesScope();
        r5 = kotlin.reflect.jvm.internal.impl.name.Name.identifier(r5);
        r0 = "Name.identifier(value)";
        kotlin.jvm.internal.C2668g.a(r5, r0);
        r0 = kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation.FROM_BACKEND;
        r0 = (kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation) r0;
        r4 = r4.getContributedClassifier(r5, r0);
        r5 = r4 instanceof kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
        if (r5 == 0) goto L_0x004c;
    L_0x003a:
        r4 = (kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor) r4;
        r5 = r4.getKind();
        r0 = kotlin.reflect.jvm.internal.impl.descriptors.ClassKind.ENUM_ENTRY;
        if (r5 != r0) goto L_0x004c;
    L_0x0044:
        r5 = new kotlin.reflect.jvm.internal.impl.load.java.EnumEntry;
        r5.<init>(r4);
        r2 = r5;
        r2 = (kotlin.reflect.jvm.internal.impl.load.java.JavaDefaultValue) r2;
    L_0x004c:
        return r2;
    L_0x004d:
        r4 = kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt.makeNotNullable(r4);
        r0 = kotlin.reflect.jvm.internal.impl.utils.NumbersKt.extractRadix(r5);
        r1 = r0.component1();
        r0 = r0.component2();
        r3 = kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns.isBoolean(r4);	 Catch:{ IllegalArgumentException -> 0x00c2 }
        if (r3 == 0) goto L_0x006c;	 Catch:{ IllegalArgumentException -> 0x00c2 }
    L_0x0063:
        r4 = java.lang.Boolean.parseBoolean(r5);	 Catch:{ IllegalArgumentException -> 0x00c2 }
        r5 = java.lang.Boolean.valueOf(r4);	 Catch:{ IllegalArgumentException -> 0x00c2 }
        goto L_0x00c3;	 Catch:{ IllegalArgumentException -> 0x00c2 }
    L_0x006c:
        r3 = kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns.isChar(r4);	 Catch:{ IllegalArgumentException -> 0x00c2 }
        if (r3 == 0) goto L_0x0079;	 Catch:{ IllegalArgumentException -> 0x00c2 }
    L_0x0072:
        r5 = (java.lang.CharSequence) r5;	 Catch:{ IllegalArgumentException -> 0x00c2 }
        r5 = kotlin.text.C19302t.m68850f(r5);	 Catch:{ IllegalArgumentException -> 0x00c2 }
        goto L_0x00c3;	 Catch:{ IllegalArgumentException -> 0x00c2 }
    L_0x0079:
        r3 = kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns.isByte(r4);	 Catch:{ IllegalArgumentException -> 0x00c2 }
        if (r3 == 0) goto L_0x0084;	 Catch:{ IllegalArgumentException -> 0x00c2 }
    L_0x007f:
        r5 = kotlin.text.C19292p.m68640a(r1, r0);	 Catch:{ IllegalArgumentException -> 0x00c2 }
        goto L_0x00c3;	 Catch:{ IllegalArgumentException -> 0x00c2 }
    L_0x0084:
        r3 = kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns.isShort(r4);	 Catch:{ IllegalArgumentException -> 0x00c2 }
        if (r3 == 0) goto L_0x008f;	 Catch:{ IllegalArgumentException -> 0x00c2 }
    L_0x008a:
        r5 = kotlin.text.C19292p.m68641b(r1, r0);	 Catch:{ IllegalArgumentException -> 0x00c2 }
        goto L_0x00c3;	 Catch:{ IllegalArgumentException -> 0x00c2 }
    L_0x008f:
        r3 = kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns.isInt(r4);	 Catch:{ IllegalArgumentException -> 0x00c2 }
        if (r3 == 0) goto L_0x009a;	 Catch:{ IllegalArgumentException -> 0x00c2 }
    L_0x0095:
        r5 = kotlin.text.C19292p.m68643c(r1, r0);	 Catch:{ IllegalArgumentException -> 0x00c2 }
        goto L_0x00c3;	 Catch:{ IllegalArgumentException -> 0x00c2 }
    L_0x009a:
        r3 = kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns.isLong(r4);	 Catch:{ IllegalArgumentException -> 0x00c2 }
        if (r3 == 0) goto L_0x00a5;	 Catch:{ IllegalArgumentException -> 0x00c2 }
    L_0x00a0:
        r5 = kotlin.text.C19292p.m68644d(r1, r0);	 Catch:{ IllegalArgumentException -> 0x00c2 }
        goto L_0x00c3;	 Catch:{ IllegalArgumentException -> 0x00c2 }
    L_0x00a5:
        r0 = kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns.isFloat(r4);	 Catch:{ IllegalArgumentException -> 0x00c2 }
        if (r0 == 0) goto L_0x00b0;	 Catch:{ IllegalArgumentException -> 0x00c2 }
    L_0x00ab:
        r5 = kotlin.text.C19290o.m68603a(r5);	 Catch:{ IllegalArgumentException -> 0x00c2 }
        goto L_0x00c3;	 Catch:{ IllegalArgumentException -> 0x00c2 }
    L_0x00b0:
        r0 = kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns.isDouble(r4);	 Catch:{ IllegalArgumentException -> 0x00c2 }
        if (r0 == 0) goto L_0x00bb;	 Catch:{ IllegalArgumentException -> 0x00c2 }
    L_0x00b6:
        r5 = kotlin.text.C19290o.m68604b(r5);	 Catch:{ IllegalArgumentException -> 0x00c2 }
        goto L_0x00c3;	 Catch:{ IllegalArgumentException -> 0x00c2 }
    L_0x00bb:
        r4 = kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns.isString(r4);	 Catch:{ IllegalArgumentException -> 0x00c2 }
        if (r4 == 0) goto L_0x00c2;
    L_0x00c1:
        goto L_0x00c3;
    L_0x00c2:
        r5 = r2;
    L_0x00c3:
        if (r5 == 0) goto L_0x00cd;
    L_0x00c5:
        r4 = new kotlin.reflect.jvm.internal.impl.load.java.Constant;
        r4.<init>(r5);
        r2 = r4;
        r2 = (kotlin.reflect.jvm.internal.impl.load.java.JavaDefaultValue) r2;
    L_0x00cd:
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.load.java.UtilsKt.lexicalCastFrom(kotlin.reflect.jvm.internal.impl.types.KotlinType, java.lang.String):kotlin.reflect.jvm.internal.impl.load.java.JavaDefaultValue");
    }
}
