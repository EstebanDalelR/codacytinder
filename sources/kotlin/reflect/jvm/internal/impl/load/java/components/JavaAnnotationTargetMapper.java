package kotlin.reflect.jvm.internal.impl.load.java.components;

import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.C15811g;
import kotlin.collections.C18457p;
import kotlin.collections.C19291t;
import kotlin.jvm.internal.C2668g;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.KotlinRetention;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.KotlinTarget;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationArgument;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaEnumValueAnnotationArgument;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ArrayValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.EnumValue;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class JavaAnnotationTargetMapper {
    public static final JavaAnnotationTargetMapper INSTANCE = new JavaAnnotationTargetMapper();
    private static final Map<String, KotlinRetention> retentionNameList = ah.m66889a(C15811g.m59834a("RUNTIME", KotlinRetention.RUNTIME), C15811g.m59834a("CLASS", KotlinRetention.BINARY), C15811g.m59834a("SOURCE", KotlinRetention.SOURCE));
    private static final Map<String, EnumSet<KotlinTarget>> targetNameLists = ah.m66889a(C15811g.m59834a("PACKAGE", EnumSet.noneOf(KotlinTarget.class)), C15811g.m59834a("TYPE", EnumSet.of(KotlinTarget.CLASS, KotlinTarget.FILE)), C15811g.m59834a("ANNOTATION_TYPE", EnumSet.of(KotlinTarget.ANNOTATION_CLASS)), C15811g.m59834a("TYPE_PARAMETER", EnumSet.of(KotlinTarget.TYPE_PARAMETER)), C15811g.m59834a("FIELD", EnumSet.of(KotlinTarget.FIELD)), C15811g.m59834a("LOCAL_VARIABLE", EnumSet.of(KotlinTarget.LOCAL_VARIABLE)), C15811g.m59834a("PARAMETER", EnumSet.of(KotlinTarget.VALUE_PARAMETER)), C15811g.m59834a("CONSTRUCTOR", EnumSet.of(KotlinTarget.CONSTRUCTOR)), C15811g.m59834a("METHOD", EnumSet.of(KotlinTarget.FUNCTION, KotlinTarget.PROPERTY_GETTER, KotlinTarget.PROPERTY_SETTER)), C15811g.m59834a("TYPE_USE", EnumSet.of(KotlinTarget.TYPE)));

    private JavaAnnotationTargetMapper() {
    }

    @NotNull
    public final Set<KotlinTarget> mapJavaTargetArgumentByName(@Nullable String str) {
        EnumSet enumSet = (EnumSet) targetNameLists.get(str);
        return enumSet != null ? enumSet : am.m64176a();
    }

    @NotNull
    public final ConstantValue<?> mapJavaTargetArguments$descriptors_jvm(@NotNull List<? extends JavaAnnotationArgument> list) {
        C2668g.b(list, "arguments");
        Collection arrayList = new ArrayList();
        for (Object next : list) {
            if (next instanceof JavaEnumValueAnnotationArgument) {
                arrayList.add(next);
            }
        }
        Collection arrayList2 = new ArrayList();
        for (JavaEnumValueAnnotationArgument javaEnumValueAnnotationArgument : (List) arrayList) {
            JavaAnnotationTargetMapper javaAnnotationTargetMapper = INSTANCE;
            Name entryName = javaEnumValueAnnotationArgument.getEntryName();
            C19291t.m68635a(arrayList2, (Iterable) javaAnnotationTargetMapper.mapJavaTargetArgumentByName(entryName != null ? entryName.asString() : null));
        }
        Iterable<KotlinTarget> iterable = (List) arrayList2;
        arrayList = new ArrayList(C18457p.m66906a((Iterable) iterable, 10));
        for (KotlinTarget kotlinTarget : iterable) {
            ClassId topLevel = ClassId.topLevel(KotlinBuiltIns.FQ_NAMES.annotationTarget);
            C2668g.a(topLevel, "ClassId.topLevel(KotlinB…Q_NAMES.annotationTarget)");
            entryName = Name.identifier(kotlinTarget.name());
            C2668g.a(entryName, "Name.identifier(kotlinTarget.name)");
            arrayList.add(new EnumValue(topLevel, entryName));
        }
        return (ConstantValue) new ArrayValue((List) arrayList, JavaAnnotationTargetMapper$mapJavaTargetArguments$1.INSTANCE);
    }

    @Nullable
    public final ConstantValue<?> mapJavaRetentionArgument$descriptors_jvm(@Nullable JavaAnnotationArgument javaAnnotationArgument) {
        EnumValue enumValue = null;
        if (!(javaAnnotationArgument instanceof JavaEnumValueAnnotationArgument)) {
            javaAnnotationArgument = null;
        }
        JavaEnumValueAnnotationArgument javaEnumValueAnnotationArgument = (JavaEnumValueAnnotationArgument) javaAnnotationArgument;
        if (javaEnumValueAnnotationArgument != null) {
            Map map = retentionNameList;
            javaAnnotationArgument = javaEnumValueAnnotationArgument.getEntryName();
            KotlinRetention kotlinRetention = (KotlinRetention) map.get(javaAnnotationArgument != null ? javaAnnotationArgument.asString() : null);
            if (kotlinRetention != null) {
                ClassId topLevel = ClassId.topLevel(KotlinBuiltIns.FQ_NAMES.annotationRetention);
                C2668g.a(topLevel, "ClassId.topLevel(KotlinB…AMES.annotationRetention)");
                javaAnnotationArgument = Name.identifier(kotlinRetention.name());
                C2668g.a(javaAnnotationArgument, "Name.identifier(retention.name)");
                enumValue = new EnumValue(topLevel, javaAnnotationArgument);
            }
        }
        return enumValue;
    }
}
