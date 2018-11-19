package kotlin.reflect.jvm.internal;

import java.lang.reflect.Field;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001\"\u0006\b\u0000\u0010\u0002 \u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Ljava/lang/reflect/Field;", "R", "invoke"}, k = 3, mv = {1, 1, 10})
final class KPropertyImpl$javaField_$1 extends Lambda implements Function0<Field> {
    final /* synthetic */ KPropertyImpl this$0;

    KPropertyImpl$javaField_$1(KPropertyImpl kPropertyImpl) {
        this.this$0 = kPropertyImpl;
        super(0);
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.reflect.Field invoke() {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r6 = this;
        r0 = kotlin.reflect.jvm.internal.RuntimeTypeMapper.INSTANCE;
        r1 = r6.this$0;
        r1 = r1.getDescriptor();
        r0 = r0.mapPropertySignature(r1);
        r1 = r0 instanceof kotlin.reflect.jvm.internal.JvmPropertySignature.KotlinProperty;
        r2 = 0;
        if (r1 == 0) goto L_0x0069;
    L_0x0011:
        r0 = (kotlin.reflect.jvm.internal.JvmPropertySignature.KotlinProperty) r0;
        r1 = r0.getDescriptor();
        r3 = kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmProtoBufUtil.INSTANCE;
        r4 = r0.getProto();
        r5 = r0.getNameResolver();
        r0 = r0.getTypeTable();
        r0 = r3.getJvmFieldSignature(r4, r5, r0);
        if (r0 == 0) goto L_0x0078;
    L_0x002b:
        r3 = r1.getContainingDeclaration();
        r3 = kotlin.reflect.jvm.internal.impl.load.java.JvmAbi.isCompanionObjectWithBackingFieldsInOuter(r3);
        if (r3 == 0) goto L_0x0044;
    L_0x0035:
        r1 = r6.this$0;
        r1 = r1.getContainer();
        r1 = r1.getJClass();
        r1 = r1.getEnclosingClass();
        goto L_0x005d;
    L_0x0044:
        r1 = r1.getContainingDeclaration();
        r3 = r1 instanceof kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
        if (r3 == 0) goto L_0x0053;
    L_0x004c:
        r1 = (kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor) r1;
        r1 = kotlin.reflect.jvm.internal.UtilKt.toJavaClass(r1);
        goto L_0x005d;
    L_0x0053:
        r1 = r6.this$0;
        r1 = r1.getContainer();
        r1 = r1.getJClass();
    L_0x005d:
        if (r1 == 0) goto L_0x0078;
    L_0x005f:
        r0 = r0.getName();	 Catch:{ NoSuchFieldException -> 0x0078 }
        r0 = r1.getDeclaredField(r0);	 Catch:{ NoSuchFieldException -> 0x0078 }
        r2 = r0;
        goto L_0x0078;
    L_0x0069:
        r1 = r0 instanceof kotlin.reflect.jvm.internal.JvmPropertySignature.JavaField;
        if (r1 == 0) goto L_0x0074;
    L_0x006d:
        r0 = (kotlin.reflect.jvm.internal.JvmPropertySignature.JavaField) r0;
        r2 = r0.getField();
        goto L_0x0078;
    L_0x0074:
        r0 = r0 instanceof kotlin.reflect.jvm.internal.JvmPropertySignature.JavaMethodProperty;
        if (r0 == 0) goto L_0x0079;
    L_0x0078:
        return r2;
    L_0x0079:
        r0 = new kotlin.NoWhenBranchMatchedException;
        r0.<init>();
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.KPropertyImpl$javaField_$1.invoke():java.lang.reflect.Field");
    }
}
