package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import java.util.Map;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancementBuilder.ClassEnhancementBuilder;
import kotlin.reflect.jvm.internal.impl.load.kotlin.SignatureBuildingComponents;
import org.jetbrains.annotations.NotNull;

public final class PredefinedEnhancementInfoKt {
    private static final JavaTypeQualifiers NOT_NULLABLE = new JavaTypeQualifiers(NullabilityQualifier.NOT_NULL, null, true, false, 8, null);
    private static final JavaTypeQualifiers NOT_PLATFORM = new JavaTypeQualifiers(NullabilityQualifier.NOT_NULL, null, false, false, 8, null);
    private static final JavaTypeQualifiers NULLABLE = new JavaTypeQualifiers(NullabilityQualifier.NULLABLE, null, false, false, 8, null);
    @NotNull
    private static final Map<String, PredefinedFunctionEnhancementInfo> PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE;

    static {
        SignatureBuildingComponents signatureBuildingComponents = SignatureBuildingComponents.INSTANCE;
        String javaLang = signatureBuildingComponents.javaLang("Object");
        String javaFunction = signatureBuildingComponents.javaFunction("Predicate");
        String javaFunction2 = signatureBuildingComponents.javaFunction("Function");
        String javaFunction3 = signatureBuildingComponents.javaFunction("Consumer");
        String javaFunction4 = signatureBuildingComponents.javaFunction("BiFunction");
        String javaFunction5 = signatureBuildingComponents.javaFunction("BiConsumer");
        String javaFunction6 = signatureBuildingComponents.javaFunction("UnaryOperator");
        String javaUtil = signatureBuildingComponents.javaUtil("stream/Stream");
        String javaUtil2 = signatureBuildingComponents.javaUtil("Optional");
        SignatureEnhancementBuilder signatureEnhancementBuilder = new SignatureEnhancementBuilder();
        SignatureBuildingComponents signatureBuildingComponents2 = signatureBuildingComponents;
        String str = javaFunction3;
        String str2 = javaFunction;
        String str3 = javaFunction;
        String str4 = javaUtil;
        String str5 = javaFunction3;
        ClassEnhancementBuilder classEnhancementBuilder = new ClassEnhancementBuilder(signatureEnhancementBuilder, signatureBuildingComponents.javaUtil("Iterator"));
        String str6 = javaFunction6;
        String str7 = javaFunction6;
        SignatureEnhancementBuilder signatureEnhancementBuilder2 = signatureEnhancementBuilder;
        String str8 = javaFunction5;
        String str9 = javaUtil2;
        javaUtil2 = javaLang;
        String str10 = javaFunction4;
        String str11 = javaFunction2;
        String str12 = str9;
        classEnhancementBuilder.function("forEachRemaining", new C19104xd5dbd441(signatureBuildingComponents2, str, str2, str4, str6, str8, javaUtil2, str10, str11, str12));
        str = str5;
        str2 = str3;
        str6 = str7;
        new ClassEnhancementBuilder(signatureEnhancementBuilder2, signatureBuildingComponents.javaLang("Iterable")).function("spliterator", new C19114xd5dbd442(signatureBuildingComponents2, str, str2, str4, str6, str8, javaUtil2, str10, str11, str12));
        classEnhancementBuilder = new ClassEnhancementBuilder(signatureEnhancementBuilder2, signatureBuildingComponents.javaUtil("Collection"));
        classEnhancementBuilder.function("removeIf", new C19115xd5dbd443(signatureBuildingComponents2, str, str2, str4, str6, str8, javaUtil2, str10, str11, str12));
        classEnhancementBuilder.function("stream", new C19116xd5dbd444(signatureBuildingComponents2, str, str2, str4, str6, str8, javaUtil2, str10, str11, str12));
        classEnhancementBuilder.function("parallelStream", new C19117xd5dbd445(signatureBuildingComponents2, str, str2, str4, str6, str8, javaUtil2, str10, str11, str12));
        new ClassEnhancementBuilder(signatureEnhancementBuilder2, signatureBuildingComponents.javaUtil("List")).function("replaceAll", new C19118xd5dbd446(signatureBuildingComponents2, str, str2, str4, str6, str8, javaUtil2, str10, str11, str12));
        classEnhancementBuilder = new ClassEnhancementBuilder(signatureEnhancementBuilder2, signatureBuildingComponents.javaUtil("Map"));
        classEnhancementBuilder.function("forEach", new C19119xd5dbd447(signatureBuildingComponents2, str, str2, str4, str6, str8, javaUtil2, str10, str11, str12));
        classEnhancementBuilder.function("putIfAbsent", new C19120xd5dbd448(signatureBuildingComponents2, str, str2, str4, str6, str8, javaUtil2, str10, str11, str12));
        classEnhancementBuilder.function("replace", new C19121xd5dbd449(signatureBuildingComponents2, str, str2, str4, str6, str8, javaUtil2, str10, str11, str12));
        classEnhancementBuilder.function("replace", new C19094xe59eb40f(signatureBuildingComponents2, str, str2, str4, str6, str8, javaUtil2, str10, str11, str12));
        classEnhancementBuilder.function("replaceAll", new C19095xe59eb410(signatureBuildingComponents2, str, str2, str4, str6, str8, javaUtil2, str10, str11, str12));
        classEnhancementBuilder.function("compute", new C19096xe59eb411(signatureBuildingComponents2, str, str2, str4, str6, str8, javaUtil2, str10, str11, str12));
        classEnhancementBuilder.function("computeIfAbsent", new C19097xe59eb412(signatureBuildingComponents2, str, str2, str4, str6, str8, javaUtil2, str10, str11, str12));
        classEnhancementBuilder.function("computeIfPresent", new C19098xe59eb413(signatureBuildingComponents2, str, str2, str4, str6, str8, javaUtil2, str10, str11, str12));
        classEnhancementBuilder.function("merge", new C19099xe59eb414(signatureBuildingComponents2, str, str2, str4, str6, str8, javaUtil2, str10, str11, str12));
        javaFunction3 = str9;
        ClassEnhancementBuilder classEnhancementBuilder2 = new ClassEnhancementBuilder(signatureEnhancementBuilder2, javaFunction3);
        SignatureEnhancementBuilder signatureEnhancementBuilder3 = signatureEnhancementBuilder2;
        javaUtil2 = javaLang;
        str12 = javaFunction3;
        classEnhancementBuilder2.function("empty", new C19100xe59eb415(signatureBuildingComponents2, str, str2, str4, str6, str8, javaUtil2, str10, str11, str12));
        classEnhancementBuilder2.function("of", new C19101xe59eb416(signatureBuildingComponents2, str, str2, str4, str6, str8, javaUtil2, str10, str11, str12));
        classEnhancementBuilder2.function("ofNullable", new C19102xe59eb417(signatureBuildingComponents2, str, str2, str4, str6, str8, javaUtil2, str10, str11, str12));
        classEnhancementBuilder2.function("get", new C19103xe59eb418(signatureBuildingComponents2, str, str2, str4, str6, str8, javaUtil2, str10, str11, str12));
        classEnhancementBuilder2.function("ifPresent", new C19105xe59eb42e(signatureBuildingComponents2, str, str2, str4, str6, str8, javaUtil2, str10, str11, str12));
        SignatureEnhancementBuilder signatureEnhancementBuilder4 = signatureEnhancementBuilder3;
        String str13 = javaFunction5;
        SignatureEnhancementBuilder signatureEnhancementBuilder5 = signatureEnhancementBuilder4;
        new ClassEnhancementBuilder(signatureEnhancementBuilder4, signatureBuildingComponents.javaLang("ref/Reference")).function("get", new C19106xe59eb42f(signatureBuildingComponents2, str, str2, str4, str6, str8, javaLang, str10, str11, str12));
        javaFunction6 = str3;
        str2 = javaFunction6;
        str8 = str13;
        String str14 = javaFunction6;
        javaUtil2 = javaLang;
        new ClassEnhancementBuilder(signatureEnhancementBuilder5, javaFunction6).function("test", new C19107xe59eb430(signatureBuildingComponents2, str, str2, str4, str6, str8, javaUtil2, str10, str11, str12));
        str2 = str14;
        new ClassEnhancementBuilder(signatureEnhancementBuilder5, signatureBuildingComponents.javaFunction("BiPredicate")).function("test", new C19108xe59eb431(signatureBuildingComponents2, str, str2, str4, str6, str8, javaUtil2, str10, str11, str12));
        javaFunction6 = str5;
        String str15 = javaFunction6;
        new ClassEnhancementBuilder(signatureEnhancementBuilder5, javaFunction6).function("accept", new C19109xe59eb432(signatureBuildingComponents2, javaFunction6, str2, str4, str6, str8, javaLang, str10, str11, str12));
        javaFunction6 = str13;
        str = str15;
        str8 = javaFunction6;
        String str16 = javaFunction6;
        javaUtil2 = javaLang;
        new ClassEnhancementBuilder(signatureEnhancementBuilder5, javaFunction6).function("accept", new C19110xe59eb433(signatureBuildingComponents2, str, str2, str4, str6, str8, javaUtil2, str10, str11, str12));
        str8 = str16;
        new ClassEnhancementBuilder(signatureEnhancementBuilder5, javaFunction2).function("apply", new C19111xe59eb434(signatureBuildingComponents2, str, str2, str4, str6, str8, javaUtil2, str10, str11, str12));
        new ClassEnhancementBuilder(signatureEnhancementBuilder5, javaFunction4).function("apply", new C19112xe59eb435(signatureBuildingComponents2, str, str2, str4, str6, str8, javaUtil2, str10, str11, str12));
        new ClassEnhancementBuilder(signatureEnhancementBuilder5, signatureBuildingComponents.javaFunction("Supplier")).function("get", new C19113xe59eb436(signatureBuildingComponents2, str, str2, str4, str6, str8, javaUtil2, str10, str11, str12));
        PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE = signatureEnhancementBuilder5.build();
    }

    @NotNull
    public static final Map<String, PredefinedFunctionEnhancementInfo> getPREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE() {
        return PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE;
    }
}
