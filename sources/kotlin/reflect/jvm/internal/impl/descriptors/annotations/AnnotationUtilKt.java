package kotlin.reflect.jvm.internal.impl.descriptors.annotations;

import java.util.Collection;
import kotlin.C15811g;
import kotlin.C15819j;
import kotlin.Pair;
import kotlin.collections.C17554o;
import kotlin.jvm.internal.C2668g;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils;
import kotlin.reflect.jvm.internal.impl.resolve.constants.AnnotationValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ArrayValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.EnumValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.StringValue;
import org.jetbrains.annotations.NotNull;

public final class AnnotationUtilKt {
    private static final Name DEPRECATED_LEVEL_NAME = Name.identifier("level");
    private static final Name DEPRECATED_MESSAGE_NAME = Name.identifier("message");
    private static final Name DEPRECATED_REPLACE_WITH_NAME = Name.identifier("replaceWith");
    private static final FqName INLINE_ONLY_ANNOTATION_FQ_NAME = new FqName("kotlin.internal.InlineOnly");
    private static final Name REPLACE_WITH_EXPRESSION_NAME = Name.identifier("expression");
    private static final Name REPLACE_WITH_IMPORTS_NAME = Name.identifier("imports");

    @NotNull
    public static /* synthetic */ AnnotationDescriptor createDeprecatedAnnotation$default(KotlinBuiltIns kotlinBuiltIns, String str, String str2, String str3, int i, Object obj) {
        if ((i & 2) != null) {
            str2 = "";
        }
        if ((i & 4) != 0) {
            str3 = "WARNING";
        }
        return createDeprecatedAnnotation(kotlinBuiltIns, str, str2, str3);
    }

    @NotNull
    public static final AnnotationDescriptor createDeprecatedAnnotation(@NotNull KotlinBuiltIns kotlinBuiltIns, @NotNull String str, @NotNull String str2, @NotNull String str3) {
        C2668g.b(kotlinBuiltIns, "$receiver");
        C2668g.b(str, "message");
        C2668g.b(str2, "replaceWith");
        C2668g.b(str3, "level");
        FqName fqName = KotlinBuiltIns.FQ_NAMES.replaceWith;
        C2668g.a(fqName, "KotlinBuiltIns.FQ_NAMES.replaceWith");
        BuiltInAnnotationDescriptor builtInAnnotationDescriptor = new BuiltInAnnotationDescriptor(kotlinBuiltIns, fqName, ah.m66889a(C15811g.m59834a(REPLACE_WITH_EXPRESSION_NAME, new StringValue(str2)), C15811g.m59834a(REPLACE_WITH_IMPORTS_NAME, new ArrayValue(C17554o.m64195a(), new C19083xf14e0c1a(kotlinBuiltIns)))));
        fqName = KotlinBuiltIns.FQ_NAMES.deprecated;
        C2668g.a(fqName, "KotlinBuiltIns.FQ_NAMES.deprecated");
        Pair[] pairArr = new Pair[3];
        pairArr[0] = C15811g.m59834a(DEPRECATED_MESSAGE_NAME, new StringValue(str));
        pairArr[1] = C15811g.m59834a(DEPRECATED_REPLACE_WITH_NAME, new AnnotationValue(builtInAnnotationDescriptor));
        str = DEPRECATED_LEVEL_NAME;
        ClassId topLevel = ClassId.topLevel(KotlinBuiltIns.FQ_NAMES.deprecationLevel);
        C2668g.a(topLevel, "ClassId.topLevel(KotlinB…Q_NAMES.deprecationLevel)");
        str3 = Name.identifier(str3);
        C2668g.a(str3, "Name.identifier(level)");
        pairArr[2] = C15811g.m59834a(str, new EnumValue(topLevel, str3));
        return (AnnotationDescriptor) new BuiltInAnnotationDescriptor(kotlinBuiltIns, fqName, ah.m66889a(pairArr));
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean isInlineOnlyOrReifiable(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor r2) {
        /*
        r0 = "$receiver";
        kotlin.jvm.internal.C2668g.b(r2, r0);
        r0 = r2 instanceof kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
        if (r0 == 0) goto L_0x0029;
    L_0x0009:
        r0 = r2;
        r0 = (kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor) r0;
        r1 = isReifiable(r0);
        if (r1 != 0) goto L_0x0027;
    L_0x0012:
        r0 = kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils.getDirectMember(r0);
        r1 = "DescriptorUtils.getDirectMember(this)";
        kotlin.jvm.internal.C2668g.a(r0, r1);
        r0 = isReifiable(r0);
        if (r0 != 0) goto L_0x0027;
    L_0x0021:
        r2 = isInlineOnly(r2);
        if (r2 == 0) goto L_0x0029;
    L_0x0027:
        r2 = 1;
        goto L_0x002a;
    L_0x0029:
        r2 = 0;
    L_0x002a:
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationUtilKt.isInlineOnlyOrReifiable(kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor):boolean");
    }

    public static final boolean isEffectivelyInlineOnly(@NotNull MemberDescriptor memberDescriptor) {
        C2668g.b(memberDescriptor, "$receiver");
        if (!isInlineOnlyOrReifiable(memberDescriptor)) {
            if (!(memberDescriptor instanceof FunctionDescriptor)) {
                memberDescriptor = null;
            }
            FunctionDescriptor functionDescriptor = (FunctionDescriptor) memberDescriptor;
            if (functionDescriptor == null) {
                return false;
            }
            memberDescriptor = (!functionDescriptor.isSuspend() || functionDescriptor.isInline() == null) ? null : true;
            if (memberDescriptor != 1) {
                return false;
            }
        }
        return true;
    }

    public static final boolean isInlineOnly(@NotNull MemberDescriptor memberDescriptor) {
        C2668g.b(memberDescriptor, "$receiver");
        if (memberDescriptor instanceof FunctionDescriptor) {
            CallableMemberDescriptor callableMemberDescriptor = (CallableMemberDescriptor) memberDescriptor;
            if (!hasInlineOnlyAnnotation(callableMemberDescriptor)) {
                callableMemberDescriptor = DescriptorUtils.getDirectMember(callableMemberDescriptor);
                C2668g.a(callableMemberDescriptor, "DescriptorUtils.getDirectMember(this)");
                if (!hasInlineOnlyAnnotation(callableMemberDescriptor)) {
                }
            }
            boolean isInline = ((FunctionDescriptor) memberDescriptor).isInline();
            if (!C15819j.f49018a || isInline) {
                return true;
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Function is not inline: ");
            stringBuilder.append(memberDescriptor);
            throw new AssertionError(stringBuilder.toString());
        }
        return null;
    }

    private static final boolean isReifiable(@NotNull CallableMemberDescriptor callableMemberDescriptor) {
        callableMemberDescriptor = callableMemberDescriptor.getTypeParameters();
        C2668g.a(callableMemberDescriptor, "typeParameters");
        Iterable<TypeParameterDescriptor> iterable = (Iterable) callableMemberDescriptor;
        if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
            return false;
        }
        for (TypeParameterDescriptor typeParameterDescriptor : iterable) {
            C2668g.a(typeParameterDescriptor, "it");
            if (typeParameterDescriptor.isReified()) {
                return true;
            }
        }
        return false;
    }

    private static final boolean hasInlineOnlyAnnotation(@NotNull CallableMemberDescriptor callableMemberDescriptor) {
        return callableMemberDescriptor.getAnnotations().hasAnnotation(INLINE_ONLY_ANNOTATION_FQ_NAME);
    }
}
