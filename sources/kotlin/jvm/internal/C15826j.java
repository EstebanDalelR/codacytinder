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

/* renamed from: kotlin.jvm.internal.j */
public class C15826j {
    private static final String KOTLIN_JVM_FUNCTIONS = "kotlin.jvm.functions.";

    public KFunction function(FunctionReference functionReference) {
        return functionReference;
    }

    public KMutableProperty0 mutableProperty0(MutablePropertyReference0 mutablePropertyReference0) {
        return mutablePropertyReference0;
    }

    public KMutableProperty1 mutableProperty1(MutablePropertyReference1 mutablePropertyReference1) {
        return mutablePropertyReference1;
    }

    public KMutableProperty2 mutableProperty2(MutablePropertyReference2 mutablePropertyReference2) {
        return mutablePropertyReference2;
    }

    public KProperty0 property0(PropertyReference0 propertyReference0) {
        return propertyReference0;
    }

    public KProperty1 property1(PropertyReference1 propertyReference1) {
        return propertyReference1;
    }

    public KProperty2 property2(PropertyReference2 propertyReference2) {
        return propertyReference2;
    }

    public KClass createKotlinClass(Class cls) {
        return new C18458c(cls);
    }

    public KClass createKotlinClass(Class cls, String str) {
        return new C18458c(cls);
    }

    public KDeclarationContainer getOrCreateKotlinPackage(Class cls, String str) {
        return new C18459h(cls, str);
    }

    public KClass getOrCreateKotlinClass(Class cls) {
        return new C18458c(cls);
    }

    public KClass getOrCreateKotlinClass(Class cls, String str) {
        return new C18458c(cls);
    }

    @SinceKotlin(version = "1.1")
    public String renderLambdaToString(Lambda lambda) {
        lambda = lambda.getClass().getGenericInterfaces()[0].toString();
        return lambda.startsWith(KOTLIN_JVM_FUNCTIONS) ? lambda.substring(KOTLIN_JVM_FUNCTIONS.length()) : lambda;
    }
}
