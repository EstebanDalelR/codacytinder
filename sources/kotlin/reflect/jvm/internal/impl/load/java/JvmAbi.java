package kotlin.reflect.jvm.internal.impl.load.java;

import kotlin.reflect.jvm.internal.impl.builtins.CompanionObjectMapping;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils;
import kotlin.reflect.jvm.internal.impl.util.capitalizeDecapitalize.CapitalizeDecapitalizeKt;
import org.jetbrains.annotations.NotNull;

public final class JvmAbi {
    public static final ClassId REFLECTION_FACTORY_IMPL = ClassId.topLevel(new FqName("kotlin.reflect.jvm.internal.ReflectionFactoryImpl"));

    public static boolean isGetterName(@NotNull String str) {
        if (!str.startsWith("get")) {
            if (str.startsWith("is") == null) {
                return null;
            }
        }
        return true;
    }

    public static boolean isSetterName(@NotNull String str) {
        return str.startsWith("set");
    }

    @NotNull
    public static String getterName(@NotNull String str) {
        if (startsWithIsPrefix(str)) {
            return str;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("get");
        stringBuilder.append(CapitalizeDecapitalizeKt.capitalizeAsciiOnly(str));
        return stringBuilder.toString();
    }

    @NotNull
    public static String setterName(@NotNull String str) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("set");
        stringBuilder.append(startsWithIsPrefix(str) ? str.substring("is".length()) : CapitalizeDecapitalizeKt.capitalizeAsciiOnly(str));
        return stringBuilder.toString();
    }

    public static boolean startsWithIsPrefix(String str) {
        boolean z = false;
        if (!str.startsWith("is") || str.length() == "is".length()) {
            return false;
        }
        str = str.charAt("is".length());
        if (97 > str || str > 122) {
            z = true;
        }
        return z;
    }

    public static boolean isCompanionObjectWithBackingFieldsInOuter(@NotNull DeclarationDescriptor declarationDescriptor) {
        return (DescriptorUtils.isCompanionObject(declarationDescriptor) && DescriptorUtils.isClassOrEnumClass(declarationDescriptor.getContainingDeclaration()) && isMappedIntrinsicCompanionObject((ClassDescriptor) declarationDescriptor) == null) ? true : null;
    }

    public static boolean isMappedIntrinsicCompanionObject(@NotNull ClassDescriptor classDescriptor) {
        return CompanionObjectMapping.INSTANCE.isMappedIntrinsicCompanionObject(classDescriptor);
    }
}
