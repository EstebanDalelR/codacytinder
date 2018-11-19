package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.C15807n;
import kotlin.collections.C18457p;
import kotlin.collections.C19299w;
import kotlin.jvm.internal.C2668g;
import kotlin.ranges.C18464j;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.FindClassInModuleKt;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value.Type;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.KClassValue;
import kotlin.reflect.jvm.internal.impl.types.ErrorUtils;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeProjectionImpl;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;
import org.jetbrains.annotations.NotNull;

public final class AnnotationDeserializer {
    private final ModuleDescriptor module;
    private final NotFoundClasses notFoundClasses;

    public AnnotationDeserializer(@NotNull ModuleDescriptor moduleDescriptor, @NotNull NotFoundClasses notFoundClasses) {
        C2668g.b(moduleDescriptor, "module");
        C2668g.b(notFoundClasses, "notFoundClasses");
        this.module = moduleDescriptor;
        this.notFoundClasses = notFoundClasses;
    }

    private final KotlinBuiltIns getBuiltIns() {
        return this.module.getBuiltIns();
    }

    @NotNull
    public final AnnotationDescriptor deserializeAnnotation(@NotNull Annotation annotation, @NotNull NameResolver nameResolver) {
        C2668g.b(annotation, "proto");
        C2668g.b(nameResolver, "nameResolver");
        ClassDescriptor resolveClass = resolveClass(NameResolverUtilKt.getClassId(nameResolver, annotation.getId()));
        Map a = ah.m66884a();
        if (annotation.getArgumentCount() != 0) {
            DeclarationDescriptor declarationDescriptor = resolveClass;
            if (!ErrorUtils.isError(declarationDescriptor) && DescriptorUtils.isAnnotationClass(declarationDescriptor)) {
                Collection constructors = resolveClass.getConstructors();
                C2668g.a(constructors, "annotationClass.constructors");
                ClassConstructorDescriptor classConstructorDescriptor = (ClassConstructorDescriptor) C19299w.m68830g((Iterable) constructors);
                if (classConstructorDescriptor != null) {
                    List valueParameters = classConstructorDescriptor.getValueParameters();
                    C2668g.a(valueParameters, "constructor.valueParameters");
                    Iterable iterable = valueParameters;
                    Map linkedHashMap = new LinkedHashMap(C18464j.m66926c(ah.m66883a(C18457p.m66906a(iterable, 10)), 16));
                    for (Object next : iterable) {
                        ValueParameterDescriptor valueParameterDescriptor = (ValueParameterDescriptor) next;
                        C2668g.a(valueParameterDescriptor, "it");
                        linkedHashMap.put(valueParameterDescriptor.getName(), next);
                    }
                    annotation = annotation.getArgumentList();
                    C2668g.a(annotation, "proto.argumentList");
                    Collection arrayList = new ArrayList();
                    for (Argument argument : (Iterable) annotation) {
                        C2668g.a(argument, "it");
                        Pair resolveArgument = resolveArgument(argument, linkedHashMap, nameResolver);
                        if (resolveArgument != null) {
                            arrayList.add(resolveArgument);
                        }
                    }
                    a = ah.m66885a((Iterable) (List) arrayList);
                }
            }
        }
        return (AnnotationDescriptor) new AnnotationDescriptorImpl(resolveClass.getDefaultType(), a, SourceElement.NO_SOURCE);
    }

    private final Pair<Name, ConstantValue<?>> resolveArgument(Argument argument, Map<Name, ? extends ValueParameterDescriptor> map, NameResolver nameResolver) {
        ValueParameterDescriptor valueParameterDescriptor = (ValueParameterDescriptor) map.get(NameResolverUtilKt.getName(nameResolver, argument.getNameId()));
        if (valueParameterDescriptor == null) {
            return null;
        }
        Name name = NameResolverUtilKt.getName(nameResolver, argument.getNameId());
        map = valueParameterDescriptor.getType();
        C2668g.a(map, "parameter.type");
        argument = argument.getValue();
        C2668g.a(argument, "proto.value");
        return new Pair(name, resolveValue(map, argument, nameResolver));
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    @org.jetbrains.annotations.NotNull
    public final kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue<?> resolveValue(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.KotlinType r8, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value r9, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver r10) {
        /*
        r7 = this;
        r0 = "expectedType";
        kotlin.jvm.internal.C2668g.b(r8, r0);
        r0 = "value";
        kotlin.jvm.internal.C2668g.b(r9, r0);
        r0 = "nameResolver";
        kotlin.jvm.internal.C2668g.b(r10, r0);
        r0 = r9.getType();
        if (r0 != 0) goto L_0x0017;
    L_0x0015:
        goto L_0x01bf;
    L_0x0017:
        r1 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationDeserializer.WhenMappings.$EnumSwitchMapping$0;
        r0 = r0.ordinal();
        r0 = r1[r0];
        r1 = 0;
        r2 = 1;
        switch(r0) {
            case 1: goto L_0x0198;
            case 2: goto L_0x0189;
            case 3: goto L_0x017a;
            case 4: goto L_0x016c;
            case 5: goto L_0x015f;
            case 6: goto L_0x0152;
            case 7: goto L_0x0145;
            case 8: goto L_0x0131;
            case 9: goto L_0x011f;
            case 10: goto L_0x0111;
            case 11: goto L_0x00f7;
            case 12: goto L_0x00e0;
            case 13: goto L_0x0026;
            default: goto L_0x0024;
        };
    L_0x0024:
        goto L_0x01bf;
    L_0x0026:
        r0 = kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns.isArray(r8);
        if (r0 != 0) goto L_0x0032;
    L_0x002c:
        r0 = kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns.isPrimitiveArray(r8);
        if (r0 == 0) goto L_0x0033;
    L_0x0032:
        r1 = 1;
    L_0x0033:
        r9 = r9.getArrayElementList();
        r0 = "arrayElements";
        kotlin.jvm.internal.C2668g.a(r9, r0);
        r0 = r9;
        r0 = (java.util.Collection) r0;
        r0 = r0.isEmpty();
        r0 = r0 ^ r2;
        if (r0 == 0) goto L_0x0077;
    L_0x0046:
        r0 = kotlin.collections.C19299w.m68829f(r9);
        r2 = "arrayElements.first()";
        kotlin.jvm.internal.C2668g.a(r0, r2);
        r0 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value) r0;
        r0 = r7.resolveArrayElementType(r0, r10);
        r2 = r7.getBuiltIns();
        r0 = (kotlin.reflect.jvm.internal.impl.types.KotlinType) r0;
        r2 = r2.getPrimitiveArrayKotlinTypeByPrimitiveKotlinType(r0);
        if (r2 == 0) goto L_0x0065;
    L_0x0061:
        r0 = r2;
        r0 = (kotlin.reflect.jvm.internal.impl.types.KotlinType) r0;
        goto L_0x0096;
    L_0x0065:
        r2 = r7.getBuiltIns();
        r3 = kotlin.reflect.jvm.internal.impl.types.Variance.INVARIANT;
        r0 = r2.getArrayType(r3, r0);
        r2 = "builtIns.getArrayType(Va…RIANT, actualElementType)";
        kotlin.jvm.internal.C2668g.a(r0, r2);
        r0 = (kotlin.reflect.jvm.internal.impl.types.KotlinType) r0;
        goto L_0x0096;
    L_0x0077:
        if (r1 == 0) goto L_0x007b;
    L_0x0079:
        r0 = r8;
        goto L_0x0096;
    L_0x007b:
        r0 = r7.getBuiltIns();
        r2 = kotlin.reflect.jvm.internal.impl.types.Variance.INVARIANT;
        r3 = r7.getBuiltIns();
        r3 = r3.getAnyType();
        r3 = (kotlin.reflect.jvm.internal.impl.types.KotlinType) r3;
        r0 = r0.getArrayType(r2, r3);
        r2 = "builtIns.getArrayType(Va…ARIANT, builtIns.anyType)";
        kotlin.jvm.internal.C2668g.a(r0, r2);
        r0 = (kotlin.reflect.jvm.internal.impl.types.KotlinType) r0;
    L_0x0096:
        r2 = r7.getBuiltIns();
        if (r1 == 0) goto L_0x009e;
    L_0x009c:
        r1 = r8;
        goto L_0x009f;
    L_0x009e:
        r1 = r0;
    L_0x009f:
        r1 = r2.getArrayElementType(r1);
        r2 = kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValueFactory.INSTANCE;
        r9 = (java.lang.Iterable) r9;
        r3 = new java.util.ArrayList;
        r4 = 10;
        r4 = kotlin.collections.C18457p.m66906a(r9, r4);
        r3.<init>(r4);
        r3 = (java.util.Collection) r3;
        r9 = r9.iterator();
    L_0x00b8:
        r4 = r9.hasNext();
        if (r4 == 0) goto L_0x00d6;
    L_0x00be:
        r4 = r9.next();
        r4 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value) r4;
        r5 = "expectedElementType";
        kotlin.jvm.internal.C2668g.a(r1, r5);
        r5 = "it";
        kotlin.jvm.internal.C2668g.a(r4, r5);
        r4 = r7.resolveValue(r1, r4, r10);
        r3.add(r4);
        goto L_0x00b8;
    L_0x00d6:
        r3 = (java.util.List) r3;
        r9 = r2.createArrayValue(r3, r0);
        r9 = (kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue) r9;
        goto L_0x01a6;
    L_0x00e0:
        r0 = new kotlin.reflect.jvm.internal.impl.resolve.constants.AnnotationValue;
        r9 = r9.getAnnotation();
        r1 = "value.annotation";
        kotlin.jvm.internal.C2668g.a(r9, r1);
        r9 = r7.deserializeAnnotation(r9, r10);
        r0.<init>(r9);
        r9 = r0;
        r9 = (kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue) r9;
        goto L_0x01a6;
    L_0x00f7:
        r0 = new kotlin.reflect.jvm.internal.impl.resolve.constants.EnumValue;
        r1 = r9.getClassId();
        r1 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.NameResolverUtilKt.getClassId(r10, r1);
        r9 = r9.getEnumValueId();
        r9 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.NameResolverUtilKt.getName(r10, r9);
        r0.<init>(r1, r9);
        r9 = r0;
        r9 = (kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue) r9;
        goto L_0x01a6;
    L_0x0111:
        r9 = r9.getClassId();
        r9 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.NameResolverUtilKt.getClassId(r10, r9);
        r9 = r7.resolveClassLiteralValue(r9);
        goto L_0x01a6;
    L_0x011f:
        r0 = new kotlin.reflect.jvm.internal.impl.resolve.constants.StringValue;
        r9 = r9.getStringValue();
        r9 = r10.getString(r9);
        r0.<init>(r9);
        r9 = r0;
        r9 = (kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue) r9;
        goto L_0x01a6;
    L_0x0131:
        r10 = new kotlin.reflect.jvm.internal.impl.resolve.constants.BooleanValue;
        r3 = r9.getIntValue();
        r5 = 0;
        r9 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1));
        if (r9 == 0) goto L_0x013e;
    L_0x013d:
        r1 = 1;
    L_0x013e:
        r10.<init>(r1);
        r9 = r10;
        r9 = (kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue) r9;
        goto L_0x01a6;
    L_0x0145:
        r10 = new kotlin.reflect.jvm.internal.impl.resolve.constants.DoubleValue;
        r0 = r9.getDoubleValue();
        r10.<init>(r0);
        r9 = r10;
        r9 = (kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue) r9;
        goto L_0x01a6;
    L_0x0152:
        r10 = new kotlin.reflect.jvm.internal.impl.resolve.constants.FloatValue;
        r9 = r9.getFloatValue();
        r10.<init>(r9);
        r9 = r10;
        r9 = (kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue) r9;
        goto L_0x01a6;
    L_0x015f:
        r10 = new kotlin.reflect.jvm.internal.impl.resolve.constants.LongValue;
        r0 = r9.getIntValue();
        r10.<init>(r0);
        r9 = r10;
        r9 = (kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue) r9;
        goto L_0x01a6;
    L_0x016c:
        r10 = new kotlin.reflect.jvm.internal.impl.resolve.constants.IntValue;
        r0 = r9.getIntValue();
        r9 = (int) r0;
        r10.<init>(r9);
        r9 = r10;
        r9 = (kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue) r9;
        goto L_0x01a6;
    L_0x017a:
        r10 = new kotlin.reflect.jvm.internal.impl.resolve.constants.ShortValue;
        r0 = r9.getIntValue();
        r9 = (int) r0;
        r9 = (short) r9;
        r10.<init>(r9);
        r9 = r10;
        r9 = (kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue) r9;
        goto L_0x01a6;
    L_0x0189:
        r10 = new kotlin.reflect.jvm.internal.impl.resolve.constants.CharValue;
        r0 = r9.getIntValue();
        r9 = (int) r0;
        r9 = (char) r9;
        r10.<init>(r9);
        r9 = r10;
        r9 = (kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue) r9;
        goto L_0x01a6;
    L_0x0198:
        r10 = new kotlin.reflect.jvm.internal.impl.resolve.constants.ByteValue;
        r0 = r9.getIntValue();
        r9 = (int) r0;
        r9 = (byte) r9;
        r10.<init>(r9);
        r9 = r10;
        r9 = (kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue) r9;
    L_0x01a6:
        r10 = r7.module;
        r10 = r9.getType(r10);
        r8 = kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt.isSubtypeOf(r10, r8);
        if (r8 == 0) goto L_0x01b3;
    L_0x01b2:
        goto L_0x01be;
    L_0x01b3:
        r8 = kotlin.reflect.jvm.internal.impl.resolve.constants.ErrorValue.Companion;
        r9 = "Unexpected argument value";
        r8 = r8.create(r9);
        r9 = r8;
        r9 = (kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue) r9;
    L_0x01be:
        return r9;
    L_0x01bf:
        r10 = new java.lang.StringBuilder;
        r10.<init>();
        r0 = "Unsupported annotation argument type: ";
        r10.append(r0);
        r9 = r9.getType();
        r10.append(r9);
        r9 = " (expected ";
        r10.append(r9);
        r10.append(r8);
        r8 = 41;
        r10.append(r8);
        r8 = r10.toString();
        r9 = new java.lang.IllegalStateException;
        r8 = r8.toString();
        r9.<init>(r8);
        r9 = (java.lang.Throwable) r9;
        throw r9;
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationDeserializer.resolveValue(kotlin.reflect.jvm.internal.impl.types.KotlinType, kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation$Argument$Value, kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver):kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue<?>");
    }

    private final ConstantValue<?> resolveClassLiteralValue(ClassId classId) {
        classId = resolveClass(classId).getDefaultType();
        C2668g.a(classId, "resolveClass(classId).defaultType");
        classId = TypeUtilsKt.replaceArgumentsWithStarProjections((KotlinType) classId);
        ClassId topLevel = ClassId.topLevel(KotlinBuiltIns.FQ_NAMES.kClass.toSafe());
        C2668g.a(topLevel, "ClassId.topLevel(KotlinB…FQ_NAMES.kClass.toSafe())");
        return new KClassValue(KotlinTypeFactory.simpleNotNullType(Annotations.Companion.getEMPTY(), resolveClass(topLevel), C15807n.m59826a(new TypeProjectionImpl(classId))));
    }

    private final SimpleType resolveArrayElementType(Value value, NameResolver nameResolver) {
        KotlinBuiltIns builtIns = getBuiltIns();
        Type type = value.getType();
        if (type != null) {
            switch (type) {
                case BYTE:
                    value = builtIns.getByteType();
                    C2668g.a(value, "byteType");
                    return value;
                case CHAR:
                    value = builtIns.getCharType();
                    C2668g.a(value, "charType");
                    return value;
                case SHORT:
                    value = builtIns.getShortType();
                    C2668g.a(value, "shortType");
                    return value;
                case INT:
                    value = builtIns.getIntType();
                    C2668g.a(value, "intType");
                    return value;
                case LONG:
                    value = builtIns.getLongType();
                    C2668g.a(value, "longType");
                    return value;
                case FLOAT:
                    value = builtIns.getFloatType();
                    C2668g.a(value, "floatType");
                    return value;
                case DOUBLE:
                    value = builtIns.getDoubleType();
                    C2668g.a(value, "doubleType");
                    return value;
                case BOOLEAN:
                    value = builtIns.getBooleanType();
                    C2668g.a(value, "booleanType");
                    return value;
                case STRING:
                    value = builtIns.getStringType();
                    C2668g.a(value, "stringType");
                    return value;
                case CLASS:
                    throw ((Throwable) new IllegalStateException("Arrays of class literals are not supported yet".toString()));
                case ENUM:
                    value = resolveClass(NameResolverUtilKt.getClassId(nameResolver, value.getClassId())).getDefaultType();
                    C2668g.a(value, "resolveClass(nameResolve…lue.classId)).defaultType");
                    return value;
                case ANNOTATION:
                    value = value.getAnnotation();
                    C2668g.a(value, "value.annotation");
                    value = resolveClass(NameResolverUtilKt.getClassId(nameResolver, value.getId())).getDefaultType();
                    C2668g.a(value, "resolveClass(nameResolve…notation.id)).defaultType");
                    return value;
                case ARRAY:
                    throw ((Throwable) new IllegalStateException("Array of arrays is impossible".toString()));
                default:
                    break;
            }
        }
        nameResolver = new StringBuilder();
        nameResolver.append("Unknown type: ");
        nameResolver.append(value.getType());
        throw ((Throwable) new IllegalStateException(nameResolver.toString().toString()));
    }

    private final ClassDescriptor resolveClass(ClassId classId) {
        return FindClassInModuleKt.findNonGenericClassAcrossDependencies(this.module, classId, this.notFoundClasses);
    }
}
