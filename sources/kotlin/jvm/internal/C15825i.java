package kotlin.jvm.internal;

import kotlin.SinceKotlin;
import kotlin.reflect.KClass;
import kotlin.reflect.KDeclarationContainer;
import kotlin.reflect.KFunction;
import kotlin.reflect.KMutableProperty0;
import kotlin.reflect.KMutableProperty1;
import kotlin.reflect.KMutableProperty2;
import kotlin.reflect.KProperty0;
import kotlin.reflect.KProperty1;
import kotlin.reflect.KProperty2;

/* renamed from: kotlin.jvm.internal.i */
public class C15825i {
    /* renamed from: a */
    private static final C15826j f49030a;
    /* renamed from: b */
    private static final KClass[] f49031b = new KClass[0];

    static {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r0 = 0;
        r1 = "kotlin.reflect.jvm.internal.ReflectionFactoryImpl";	 Catch:{ ClassCastException -> 0x000e, ClassCastException -> 0x000e, ClassCastException -> 0x000e, ClassCastException -> 0x000e }
        r1 = java.lang.Class.forName(r1);	 Catch:{ ClassCastException -> 0x000e, ClassCastException -> 0x000e, ClassCastException -> 0x000e, ClassCastException -> 0x000e }
        r1 = r1.newInstance();	 Catch:{ ClassCastException -> 0x000e, ClassCastException -> 0x000e, ClassCastException -> 0x000e, ClassCastException -> 0x000e }
        r1 = (kotlin.jvm.internal.C15826j) r1;	 Catch:{ ClassCastException -> 0x000e, ClassCastException -> 0x000e, ClassCastException -> 0x000e, ClassCastException -> 0x000e }
        r0 = r1;
    L_0x000e:
        if (r0 == 0) goto L_0x0011;
    L_0x0010:
        goto L_0x0016;
    L_0x0011:
        r0 = new kotlin.jvm.internal.j;
        r0.<init>();
    L_0x0016:
        f49030a = r0;
        r0 = 0;
        r0 = new kotlin.reflect.KClass[r0];
        f49031b = r0;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.i.<clinit>():void");
    }

    /* renamed from: a */
    public static KDeclarationContainer m59861a(Class cls, String str) {
        return f49030a.getOrCreateKotlinPackage(cls, str);
    }

    /* renamed from: a */
    public static KClass m59860a(Class cls) {
        return f49030a.getOrCreateKotlinClass(cls);
    }

    @SinceKotlin(version = "1.1")
    /* renamed from: a */
    public static String m59859a(Lambda lambda) {
        return f49030a.renderLambdaToString(lambda);
    }

    /* renamed from: a */
    public static KFunction m59862a(FunctionReference functionReference) {
        return f49030a.function(functionReference);
    }

    /* renamed from: a */
    public static KProperty0 m59866a(PropertyReference0 propertyReference0) {
        return f49030a.property0(propertyReference0);
    }

    /* renamed from: a */
    public static KMutableProperty0 m59863a(MutablePropertyReference0 mutablePropertyReference0) {
        return f49030a.mutableProperty0(mutablePropertyReference0);
    }

    /* renamed from: a */
    public static KProperty1 m59867a(PropertyReference1 propertyReference1) {
        return f49030a.property1(propertyReference1);
    }

    /* renamed from: a */
    public static KMutableProperty1 m59864a(MutablePropertyReference1 mutablePropertyReference1) {
        return f49030a.mutableProperty1(mutablePropertyReference1);
    }

    /* renamed from: a */
    public static KProperty2 m59868a(PropertyReference2 propertyReference2) {
        return f49030a.property2(propertyReference2);
    }

    /* renamed from: a */
    public static KMutableProperty2 m59865a(MutablePropertyReference2 mutablePropertyReference2) {
        return f49030a.mutableProperty2(mutablePropertyReference2);
    }
}
