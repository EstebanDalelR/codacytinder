package kotlin.reflect.jvm.internal.impl.load.java;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import kotlin.collections.C17554o;
import kotlin.collections.C19291t;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C2668g;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.NullabilityQualifierWithApplicability;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifierWithMigrationStatus;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ArrayValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.EnumValue;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.storage.MemoizedFunctionToNullable;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import kotlin.reflect.jvm.internal.impl.utils.Jsr305State;
import kotlin.reflect.jvm.internal.impl.utils.ReportLevel;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class AnnotationTypeQualifierResolver {
    private final boolean disabled = this.jsr305State.getDisabled();
    private final Jsr305State jsr305State;
    private final MemoizedFunctionToNullable<ClassDescriptor, AnnotationDescriptor> resolvedNicknames;

    public enum QualifierApplicabilityType {
    }

    public static final class TypeQualifierWithApplicability {
        private final int applicability;
        private final AnnotationDescriptor typeQualifier;

        public TypeQualifierWithApplicability(@NotNull AnnotationDescriptor annotationDescriptor, int i) {
            C2668g.b(annotationDescriptor, "typeQualifier");
            this.typeQualifier = annotationDescriptor;
            this.applicability = i;
        }

        @NotNull
        public final AnnotationDescriptor component1() {
            return this.typeQualifier;
        }

        @NotNull
        public final List<QualifierApplicabilityType> component2() {
            QualifierApplicabilityType[] values = QualifierApplicabilityType.values();
            Collection arrayList = new ArrayList();
            for (QualifierApplicabilityType qualifierApplicabilityType : values) {
                if (isApplicableTo(qualifierApplicabilityType)) {
                    arrayList.add(qualifierApplicabilityType);
                }
            }
            return (List) arrayList;
        }

        private final boolean isApplicableTo(QualifierApplicabilityType qualifierApplicabilityType) {
            if (!isApplicableConsideringMask(QualifierApplicabilityType.TYPE_USE)) {
                if (isApplicableConsideringMask(qualifierApplicabilityType) == null) {
                    return null;
                }
            }
            return true;
        }

        private final boolean isApplicableConsideringMask(QualifierApplicabilityType qualifierApplicabilityType) {
            return ((1 << qualifierApplicabilityType.ordinal()) & this.applicability) != null;
        }
    }

    public AnnotationTypeQualifierResolver(@NotNull StorageManager storageManager, @NotNull Jsr305State jsr305State) {
        C2668g.b(storageManager, "storageManager");
        C2668g.b(jsr305State, "jsr305State");
        this.jsr305State = jsr305State;
        this.resolvedNicknames = storageManager.createMemoizedFunctionWithNullableValues((Function1) new AnnotationTypeQualifierResolver$resolvedNicknames$1(this));
    }

    private final AnnotationDescriptor computeTypeQualifierNickname(ClassDescriptor classDescriptor) {
        if (!classDescriptor.getAnnotations().hasAnnotation(AnnotationTypeQualifierResolverKt.TYPE_QUALIFIER_NICKNAME_FQNAME)) {
            return null;
        }
        AnnotationDescriptor resolveTypeQualifierAnnotation;
        for (AnnotationDescriptor resolveTypeQualifierAnnotation2 : classDescriptor.getAnnotations()) {
            resolveTypeQualifierAnnotation2 = resolveTypeQualifierAnnotation(resolveTypeQualifierAnnotation2);
            if (resolveTypeQualifierAnnotation2 != null) {
                break;
            }
        }
        resolveTypeQualifierAnnotation2 = null;
        return resolveTypeQualifierAnnotation2;
    }

    private final AnnotationDescriptor resolveTypeQualifierNickname(ClassDescriptor classDescriptor) {
        if (classDescriptor.getKind() != ClassKind.ANNOTATION_CLASS) {
            return null;
        }
        return (AnnotationDescriptor) this.resolvedNicknames.invoke(classDescriptor);
    }

    @Nullable
    public final AnnotationDescriptor resolveTypeQualifierAnnotation(@NotNull AnnotationDescriptor annotationDescriptor) {
        C2668g.b(annotationDescriptor, "annotationDescriptor");
        if (this.jsr305State.getDisabled()) {
            return null;
        }
        ClassDescriptor annotationClass = DescriptorUtilsKt.getAnnotationClass(annotationDescriptor);
        if (annotationClass == null) {
            return null;
        }
        if (AnnotationTypeQualifierResolverKt.isAnnotatedWithTypeQualifier(annotationClass)) {
            return annotationDescriptor;
        }
        return resolveTypeQualifierNickname(annotationClass);
    }

    @Nullable
    public final NullabilityQualifierWithApplicability resolveQualifierBuiltInDefaultAnnotation(@NotNull AnnotationDescriptor annotationDescriptor) {
        C2668g.b(annotationDescriptor, "annotationDescriptor");
        if (this.jsr305State.getDisabled()) {
            return null;
        }
        NullabilityQualifierWithApplicability nullabilityQualifierWithApplicability = (NullabilityQualifierWithApplicability) AnnotationTypeQualifierResolverKt.BUILT_IN_TYPE_QUALIFIER_DEFAULT_ANNOTATIONS.get(annotationDescriptor.getFqName());
        if (nullabilityQualifierWithApplicability == null) {
            return (NullabilityQualifierWithApplicability) null;
        }
        NullabilityQualifierWithMigrationStatus component1 = nullabilityQualifierWithApplicability.component1();
        Collection component2 = nullabilityQualifierWithApplicability.component2();
        annotationDescriptor = resolveJsr305AnnotationState(annotationDescriptor);
        if ((annotationDescriptor != ReportLevel.IGNORE ? 1 : null) == null) {
            annotationDescriptor = null;
        }
        if (annotationDescriptor != null) {
            return new NullabilityQualifierWithApplicability(NullabilityQualifierWithMigrationStatus.copy$default(component1, null, annotationDescriptor.isWarning(), 1, null), component2);
        }
        return null;
    }

    @Nullable
    public final TypeQualifierWithApplicability resolveTypeQualifierDefaultAnnotation(@NotNull AnnotationDescriptor annotationDescriptor) {
        C2668g.b(annotationDescriptor, "annotationDescriptor");
        if (this.jsr305State.getDisabled()) {
            return null;
        }
        ClassDescriptor annotationClass = DescriptorUtilsKt.getAnnotationClass(annotationDescriptor);
        if (annotationClass != null) {
            if (!annotationClass.getAnnotations().hasAnnotation(AnnotationTypeQualifierResolverKt.TYPE_QUALIFIER_DEFAULT_FQNAME)) {
                annotationClass = null;
            }
            if (annotationClass != null) {
                annotationDescriptor = DescriptorUtilsKt.getAnnotationClass(annotationDescriptor);
                if (annotationDescriptor == null) {
                    C2668g.a();
                }
                annotationDescriptor = annotationDescriptor.getAnnotations().findAnnotation(AnnotationTypeQualifierResolverKt.TYPE_QUALIFIER_DEFAULT_FQNAME);
                if (annotationDescriptor == null) {
                    C2668g.a();
                }
                Collection arrayList = new ArrayList();
                for (Entry entry : annotationDescriptor.getAllValueArguments().entrySet()) {
                    List mapConstantToQualifierApplicabilityTypes;
                    Name name = (Name) entry.getKey();
                    ConstantValue constantValue = (ConstantValue) entry.getValue();
                    if (C2668g.a(name, JvmAnnotationNames.DEFAULT_ANNOTATION_MEMBER_NAME)) {
                        mapConstantToQualifierApplicabilityTypes = mapConstantToQualifierApplicabilityTypes(constantValue);
                    } else {
                        mapConstantToQualifierApplicabilityTypes = C17554o.m64195a();
                    }
                    C19291t.m68635a(arrayList, (Iterable) mapConstantToQualifierApplicabilityTypes);
                }
                int i = 0;
                for (QualifierApplicabilityType ordinal : (List) arrayList) {
                    i |= 1 << ordinal.ordinal();
                }
                for (Object next : annotationClass.getAnnotations()) {
                    Object obj;
                    if (resolveTypeQualifierAnnotation((AnnotationDescriptor) next) != null) {
                        obj = 1;
                        continue;
                    } else {
                        obj = null;
                        continue;
                    }
                    if (obj != null) {
                        break;
                    }
                }
                Object next2 = null;
                AnnotationDescriptor annotationDescriptor2 = (AnnotationDescriptor) next2;
                if (annotationDescriptor2 != null) {
                    return new TypeQualifierWithApplicability(annotationDescriptor2, i);
                }
                return null;
            }
        }
        return null;
    }

    @NotNull
    public final ReportLevel resolveJsr305AnnotationState(@NotNull AnnotationDescriptor annotationDescriptor) {
        C2668g.b(annotationDescriptor, "annotationDescriptor");
        annotationDescriptor = resolveJsr305CustomState(annotationDescriptor);
        if (annotationDescriptor != null) {
            return annotationDescriptor;
        }
        return this.jsr305State.getGlobal();
    }

    @Nullable
    public final ReportLevel resolveJsr305CustomState(@NotNull AnnotationDescriptor annotationDescriptor) {
        C2668g.b(annotationDescriptor, "annotationDescriptor");
        Map user = this.jsr305State.getUser();
        FqName fqName = annotationDescriptor.getFqName();
        ReportLevel reportLevel = null;
        ReportLevel reportLevel2 = (ReportLevel) user.get(fqName != null ? fqName.asString() : null);
        if (reportLevel2 != null) {
            return reportLevel2;
        }
        annotationDescriptor = DescriptorUtilsKt.getAnnotationClass(annotationDescriptor);
        if (annotationDescriptor != null) {
            reportLevel = migrationAnnotationStatus(annotationDescriptor);
        }
        return reportLevel;
    }

    private final ReportLevel migrationAnnotationStatus(@NotNull ClassDescriptor classDescriptor) {
        classDescriptor = classDescriptor.getAnnotations().findAnnotation(AnnotationTypeQualifierResolverKt.MIGRATION_ANNOTATION_FQNAME);
        ReportLevel reportLevel = null;
        classDescriptor = classDescriptor != null ? DescriptorUtilsKt.firstArgument(classDescriptor) : null;
        if (!(classDescriptor instanceof EnumValue)) {
            classDescriptor = null;
        }
        EnumValue enumValue = (EnumValue) classDescriptor;
        if (enumValue == null) {
            return null;
        }
        ReportLevel migration = this.jsr305State.getMigration();
        if (migration != null) {
            return migration;
        }
        classDescriptor = enumValue.getEnumEntryName().asString();
        int hashCode = classDescriptor.hashCode();
        if (hashCode != -2137067054) {
            if (hashCode != -1838656823) {
                if (hashCode == 2656902) {
                    if (classDescriptor.equals("WARN") != null) {
                        reportLevel = ReportLevel.WARN;
                    }
                }
            } else if (classDescriptor.equals("STRICT") != null) {
                reportLevel = ReportLevel.STRICT;
            }
        } else if (classDescriptor.equals("IGNORE") != null) {
            reportLevel = ReportLevel.IGNORE;
        }
        return reportLevel;
    }

    private final List<QualifierApplicabilityType> mapConstantToQualifierApplicabilityTypes(@NotNull ConstantValue<?> constantValue) {
        if (constantValue instanceof ArrayValue) {
            Collection arrayList = new ArrayList();
            for (ConstantValue mapConstantToQualifierApplicabilityTypes : (Iterable) ((ArrayValue) constantValue).getValue()) {
                C19291t.m68635a(arrayList, (Iterable) mapConstantToQualifierApplicabilityTypes(mapConstantToQualifierApplicabilityTypes));
            }
            return (List) arrayList;
        } else if (!(constantValue instanceof EnumValue)) {
            return C17554o.m64195a();
        } else {
            constantValue = ((EnumValue) constantValue).getEnumEntryName().getIdentifier();
            int hashCode = constantValue.hashCode();
            if (hashCode != -2024225567) {
                if (hashCode != 66889946) {
                    if (hashCode != 107598562) {
                        if (hashCode == 446088073) {
                            if (constantValue.equals("PARAMETER") != null) {
                                constantValue = QualifierApplicabilityType.VALUE_PARAMETER;
                                return C17554o.m64197b((Object) constantValue);
                            }
                        }
                    } else if (constantValue.equals("TYPE_USE") != null) {
                        constantValue = QualifierApplicabilityType.TYPE_USE;
                        return C17554o.m64197b((Object) constantValue);
                    }
                } else if (constantValue.equals("FIELD") != null) {
                    constantValue = QualifierApplicabilityType.FIELD;
                    return C17554o.m64197b((Object) constantValue);
                }
            } else if (constantValue.equals("METHOD") != null) {
                constantValue = QualifierApplicabilityType.METHOD_RETURN_TYPE;
                return C17554o.m64197b((Object) constantValue);
            }
            constantValue = null;
            return C17554o.m64197b((Object) constantValue);
        }
    }

    public final boolean getDisabled() {
        return this.disabled;
    }
}
