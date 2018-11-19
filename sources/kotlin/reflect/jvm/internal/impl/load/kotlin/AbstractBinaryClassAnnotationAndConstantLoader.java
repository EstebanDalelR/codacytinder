package kotlin.reflect.jvm.internal.impl.load.kotlin;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.TypeCastException;
import kotlin.collections.C17554o;
import kotlin.collections.C18457p;
import kotlin.collections.C19299w;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C2668g;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationUseSiteTarget;
import kotlin.reflect.jvm.internal.impl.load.java.JvmAnnotationNames;
import kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class.Kind;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Constructor;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.EnumEntry;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeParameter;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.ValueParameter;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.ProtoBufUtilKt;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.ProtoTypeTableUtilKt;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.JvmPropertySignature;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.ClassMapperLite;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmProtoBufUtil;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessage;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.GeneratedExtension;
import kotlin.reflect.jvm.internal.impl.protobuf.MessageLite;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotatedCallableKind;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationAndConstantLoader;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoContainer;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoContainer.Class;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoContainer.Package;
import kotlin.reflect.jvm.internal.impl.storage.MemoizedFunctionToNotNull;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.text.C19296q;
import kotlin.text.C19298r;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public abstract class AbstractBinaryClassAnnotationAndConstantLoader<A, C, T> implements AnnotationAndConstantLoader<A, C, T> {
    @Deprecated
    public static final Companion Companion = new Companion();
    @NotNull
    private static final Set<ClassId> SPECIAL_ANNOTATIONS;
    private final KotlinClassFinder kotlinClassFinder;
    private final MemoizedFunctionToNotNull<KotlinJvmBinaryClass, Storage<A, C>> storage;

    private static final class Companion {
        private Companion() {
        }
    }

    private static final class Storage<A, C> {
        @NotNull
        private final Map<MemberSignature, List<A>> memberAnnotations;
        @NotNull
        private final Map<MemberSignature, C> propertyConstants;

        public Storage(@NotNull Map<MemberSignature, ? extends List<? extends A>> map, @NotNull Map<MemberSignature, ? extends C> map2) {
            C2668g.b(map, "memberAnnotations");
            C2668g.b(map2, "propertyConstants");
            this.memberAnnotations = map;
            this.propertyConstants = map2;
        }

        @NotNull
        public final Map<MemberSignature, List<A>> getMemberAnnotations() {
            return this.memberAnnotations;
        }

        @NotNull
        public final Map<MemberSignature, C> getPropertyConstants() {
            return this.propertyConstants;
        }
    }

    @Nullable
    protected byte[] getCachedFileContent(@NotNull KotlinJvmBinaryClass kotlinJvmBinaryClass) {
        C2668g.b(kotlinJvmBinaryClass, "kotlinClass");
        return null;
    }

    @Nullable
    protected abstract AnnotationArgumentVisitor loadAnnotation(@NotNull ClassId classId, @NotNull SourceElement sourceElement, @NotNull List<A> list);

    @Nullable
    protected abstract C loadConstant(@NotNull String str, @NotNull Object obj);

    @NotNull
    protected abstract List<T> loadPropertyAnnotations(@NotNull List<? extends A> list, @NotNull List<? extends A> list2, @NotNull AnnotationUseSiteTarget annotationUseSiteTarget);

    @NotNull
    protected abstract A loadTypeAnnotation(@NotNull Annotation annotation, @NotNull NameResolver nameResolver);

    @NotNull
    protected abstract List<T> transformAnnotations(@NotNull List<? extends A> list);

    public AbstractBinaryClassAnnotationAndConstantLoader(@NotNull StorageManager storageManager, @NotNull KotlinClassFinder kotlinClassFinder) {
        C2668g.b(storageManager, "storageManager");
        C2668g.b(kotlinClassFinder, "kotlinClassFinder");
        this.kotlinClassFinder = kotlinClassFinder;
        this.storage = storageManager.createMemoizedFunction((Function1) new AbstractBinaryClassAnnotationAndConstantLoader$storage$1(this));
    }

    private final AnnotationArgumentVisitor loadAnnotationIfNotSpecial(ClassId classId, SourceElement sourceElement, List<A> list) {
        if (SPECIAL_ANNOTATIONS.contains(classId)) {
            return null;
        }
        return loadAnnotation(classId, sourceElement, list);
    }

    private final KotlinJvmBinaryClass toBinaryClass(@NotNull Class classR) {
        classR = classR.getSource();
        if (!(classR instanceof KotlinJvmBinarySourceElement)) {
            classR = null;
        }
        KotlinJvmBinarySourceElement kotlinJvmBinarySourceElement = (KotlinJvmBinarySourceElement) classR;
        return kotlinJvmBinarySourceElement != null ? kotlinJvmBinarySourceElement.getBinaryClass() : null;
    }

    @NotNull
    public List<A> loadClassAnnotations(@NotNull Class classR) {
        C2668g.b(classR, "container");
        KotlinJvmBinaryClass toBinaryClass = toBinaryClass(classR);
        if (toBinaryClass != null) {
            classR = new ArrayList(1);
            toBinaryClass.loadClassAnnotations(new C17587xc0ff27f9(this, classR), getCachedFileContent(toBinaryClass));
            return (List) classR;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Class for loading annotations is not found: ");
        stringBuilder.append(classR.debugFqName());
        throw new IllegalStateException(stringBuilder.toString().toString());
    }

    @NotNull
    public List<T> loadCallableAnnotations(@NotNull ProtoContainer protoContainer, @NotNull MessageLite messageLite, @NotNull AnnotatedCallableKind annotatedCallableKind) {
        AbstractBinaryClassAnnotationAndConstantLoader abstractBinaryClassAnnotationAndConstantLoader = this;
        MessageLite messageLite2 = messageLite;
        AnnotatedCallableKind annotatedCallableKind2 = annotatedCallableKind;
        ProtoContainer protoContainer2 = protoContainer;
        C2668g.b(protoContainer2, "container");
        C2668g.b(messageLite2, "proto");
        C2668g.b(annotatedCallableKind2, "kind");
        if (annotatedCallableKind2 == AnnotatedCallableKind.PROPERTY) {
            AnnotationUseSiteTarget annotationUseSiteTarget;
            Property property = (Property) messageLite2;
            Property property2 = property;
            MemberSignature propertySignature$default = getPropertySignature$default(abstractBinaryClassAnnotationAndConstantLoader, property2, protoContainer2.getNameResolver(), protoContainer2.getTypeTable(), false, true, 8, null);
            MemberSignature propertySignature$default2 = getPropertySignature$default(abstractBinaryClassAnnotationAndConstantLoader, property2, protoContainer2.getNameResolver(), protoContainer2.getTypeTable(), true, false, 16, null);
            Boolean bool = Flags.IS_CONST.get(property.getFlags());
            List findClassAndLoadMemberAnnotations$default = propertySignature$default != null ? findClassAndLoadMemberAnnotations$default(abstractBinaryClassAnnotationAndConstantLoader, protoContainer2, propertySignature$default, true, false, bool, 8, null) : null;
            if (findClassAndLoadMemberAnnotations$default == null) {
                findClassAndLoadMemberAnnotations$default = C17554o.m64195a();
            }
            List list = findClassAndLoadMemberAnnotations$default;
            findClassAndLoadMemberAnnotations$default = propertySignature$default2 != null ? findClassAndLoadMemberAnnotations(protoContainer2, propertySignature$default2, true, true, bool) : null;
            if (findClassAndLoadMemberAnnotations$default == null) {
                findClassAndLoadMemberAnnotations$default = C17554o.m64195a();
            }
            boolean z = false;
            if (propertySignature$default2 != null) {
                String signature$descriptors_jvm = propertySignature$default2.getSignature$descriptors_jvm();
                if (signature$descriptors_jvm != null) {
                    z = C19298r.m68786b((CharSequence) signature$descriptors_jvm, (CharSequence) "$delegate", false, 2, null);
                }
            }
            if (z) {
                annotationUseSiteTarget = AnnotationUseSiteTarget.PROPERTY_DELEGATE_FIELD;
            } else {
                annotationUseSiteTarget = AnnotationUseSiteTarget.FIELD;
            }
            return loadPropertyAnnotations(list, findClassAndLoadMemberAnnotations$default, annotationUseSiteTarget);
        }
        MemberSignature callableSignature = getCallableSignature(messageLite2, protoContainer2.getNameResolver(), protoContainer2.getTypeTable(), annotatedCallableKind2);
        if (callableSignature != null) {
            return transformAnnotations(findClassAndLoadMemberAnnotations$default(abstractBinaryClassAnnotationAndConstantLoader, protoContainer2, callableSignature, false, false, null, 28, null));
        }
        return C17554o.m64195a();
    }

    @NotNull
    public List<A> loadEnumEntryAnnotations(@NotNull ProtoContainer protoContainer, @NotNull EnumEntry enumEntry) {
        C2668g.b(protoContainer, "container");
        C2668g.b(enumEntry, "proto");
        kotlin.reflect.jvm.internal.impl.load.kotlin.MemberSignature.Companion companion = MemberSignature.Companion;
        enumEntry = protoContainer.getNameResolver().getString(enumEntry.getName());
        String asString = ((Class) protoContainer).getClassId().asString();
        C2668g.a(asString, "(container as ProtoConta…Class).classId.asString()");
        return findClassAndLoadMemberAnnotations$default(this, protoContainer, companion.fromFieldNameAndDesc(enumEntry, ClassMapperLite.mapClass(asString)), false, false, null, 28, null);
    }

    static /* synthetic */ List findClassAndLoadMemberAnnotations$default(AbstractBinaryClassAnnotationAndConstantLoader abstractBinaryClassAnnotationAndConstantLoader, ProtoContainer protoContainer, MemberSignature memberSignature, boolean z, boolean z2, Boolean bool, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: findClassAndLoadMemberAnnotations");
        }
        boolean z3 = (i & 4) != null ? false : z;
        boolean z4 = i & 8 ? false : z2;
        if (i & 16) {
            bool = (Boolean) false;
        }
        return abstractBinaryClassAnnotationAndConstantLoader.findClassAndLoadMemberAnnotations(protoContainer, memberSignature, z3, z4, bool);
    }

    private final List<A> findClassAndLoadMemberAnnotations(ProtoContainer protoContainer, MemberSignature memberSignature, boolean z, boolean z2, Boolean bool) {
        protoContainer = findClassWithAnnotationsAndInitializers(protoContainer, getSpecialCaseContainerClass(protoContainer, z, z2, bool));
        if (protoContainer == null) {
            return C17554o.m64195a();
        }
        protoContainer = (List) ((Storage) this.storage.invoke(protoContainer)).getMemberAnnotations().get(memberSignature);
        if (protoContainer == null) {
            protoContainer = C17554o.m64195a();
        }
        return protoContainer;
    }

    @NotNull
    public List<A> loadValueParameterAnnotations(@NotNull ProtoContainer protoContainer, @NotNull MessageLite messageLite, @NotNull AnnotatedCallableKind annotatedCallableKind, int i, @NotNull ValueParameter valueParameter) {
        C2668g.b(protoContainer, "container");
        C2668g.b(messageLite, "callableProto");
        C2668g.b(annotatedCallableKind, "kind");
        C2668g.b(valueParameter, "proto");
        annotatedCallableKind = getCallableSignature(messageLite, protoContainer.getNameResolver(), protoContainer.getTypeTable(), annotatedCallableKind);
        if (annotatedCallableKind == null) {
            return C17554o.m64195a();
        }
        return findClassAndLoadMemberAnnotations$default(this, protoContainer, MemberSignature.Companion.fromMethodSignatureAndParameterIndex(annotatedCallableKind, i + computeJvmParameterIndexShift(protoContainer, messageLite)), false, false, null, 28, null);
    }

    private final int computeJvmParameterIndexShift(ProtoContainer protoContainer, MessageLite messageLite) {
        if (messageLite instanceof Function) {
            if (ProtoTypeTableUtilKt.hasReceiver((Function) messageLite) == null) {
                return 0;
            }
        } else if (messageLite instanceof Property) {
            if (ProtoTypeTableUtilKt.hasReceiver((Property) messageLite) == null) {
                return 0;
            }
        } else if (!(messageLite instanceof Constructor)) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Unsupported message: ");
            stringBuilder.append(messageLite.getClass());
            throw ((Throwable) new UnsupportedOperationException(stringBuilder.toString()));
        } else if (protoContainer == null) {
            throw new TypeCastException("null cannot be cast to non-null type org.jetbrains.kotlin.serialization.deserialization.ProtoContainer.Class");
        } else {
            Class classR = (Class) protoContainer;
            if (classR.getKind() == Kind.ENUM_CLASS) {
                return 2;
            }
            if (classR.isInner() == null) {
                return 0;
            }
        }
        return 1;
    }

    @NotNull
    public List<A> loadExtensionReceiverParameterAnnotations(@NotNull ProtoContainer protoContainer, @NotNull MessageLite messageLite, @NotNull AnnotatedCallableKind annotatedCallableKind) {
        C2668g.b(protoContainer, "container");
        C2668g.b(messageLite, "proto");
        C2668g.b(annotatedCallableKind, "kind");
        messageLite = getCallableSignature(messageLite, protoContainer.getNameResolver(), protoContainer.getTypeTable(), annotatedCallableKind);
        if (messageLite == null) {
            return C17554o.m64195a();
        }
        return findClassAndLoadMemberAnnotations$default(this, protoContainer, MemberSignature.Companion.fromMethodSignatureAndParameterIndex(messageLite, 0), false, false, null, 28, null);
    }

    @NotNull
    public List<A> loadTypeAnnotations(@NotNull Type type, @NotNull NameResolver nameResolver) {
        C2668g.b(type, "proto");
        C2668g.b(nameResolver, "nameResolver");
        type = type.getExtension(JvmProtoBuf.typeAnnotation);
        C2668g.a(type, "proto.getExtension(JvmProtoBuf.typeAnnotation)");
        Iterable<Annotation> iterable = (Iterable) type;
        Collection arrayList = new ArrayList(C18457p.m66906a((Iterable) iterable, 10));
        for (Annotation annotation : iterable) {
            C2668g.a(annotation, "it");
            arrayList.add(loadTypeAnnotation(annotation, nameResolver));
        }
        return (List) arrayList;
    }

    @NotNull
    public List<A> loadTypeParameterAnnotations(@NotNull TypeParameter typeParameter, @NotNull NameResolver nameResolver) {
        C2668g.b(typeParameter, "proto");
        C2668g.b(nameResolver, "nameResolver");
        typeParameter = typeParameter.getExtension(JvmProtoBuf.typeParameterAnnotation);
        C2668g.a(typeParameter, "proto.getExtension(JvmPr….typeParameterAnnotation)");
        Iterable<Annotation> iterable = (Iterable) typeParameter;
        Collection arrayList = new ArrayList(C18457p.m66906a((Iterable) iterable, 10));
        for (Annotation annotation : iterable) {
            C2668g.a(annotation, "it");
            arrayList.add(loadTypeAnnotation(annotation, nameResolver));
        }
        return (List) arrayList;
    }

    @Nullable
    public C loadPropertyConstant(@NotNull ProtoContainer protoContainer, @NotNull Property property, @NotNull KotlinType kotlinType) {
        C2668g.b(protoContainer, "container");
        C2668g.b(property, "proto");
        C2668g.b(kotlinType, "expectedType");
        kotlinType = getCallableSignature(property, protoContainer.getNameResolver(), protoContainer.getTypeTable(), AnnotatedCallableKind.PROPERTY);
        if (kotlinType == null) {
            return null;
        }
        protoContainer = findClassWithAnnotationsAndInitializers(protoContainer, getSpecialCaseContainerClass(protoContainer, true, true, Flags.IS_CONST.get(property.getFlags())));
        if (protoContainer != null) {
            return ((Storage) this.storage.invoke(protoContainer)).getPropertyConstants().get(kotlinType);
        }
        return null;
    }

    private final KotlinJvmBinaryClass findClassWithAnnotationsAndInitializers(ProtoContainer protoContainer, KotlinJvmBinaryClass kotlinJvmBinaryClass) {
        if (kotlinJvmBinaryClass != null) {
            return kotlinJvmBinaryClass;
        }
        return (protoContainer instanceof Class) != null ? toBinaryClass((Class) protoContainer) : null;
    }

    private final KotlinJvmBinaryClass getSpecialCaseContainerClass(ProtoContainer protoContainer, boolean z, boolean z2, Boolean bool) {
        Class classR;
        if (z) {
            if (bool == null) {
                z = new StringBuilder();
                z.append("isConst should not be null for property (container=");
                z.append(protoContainer);
                z.append(')');
                throw ((Throwable) new IllegalStateException(z.toString().toString()));
            }
            ClassId createNestedClassId;
            if (protoContainer instanceof Class) {
                classR = (Class) protoContainer;
                if (classR.getKind() == Kind.INTERFACE) {
                    protoContainer = this.kotlinClassFinder;
                    createNestedClassId = classR.getClassId().createNestedClassId(Name.identifier("DefaultImpls"));
                    C2668g.a(createNestedClassId, "container.classId.create…EFAULT_IMPLS_CLASS_NAME))");
                    return protoContainer.findKotlinClass(createNestedClassId);
                }
            }
            if (bool.booleanValue() && (protoContainer instanceof Package)) {
                z = protoContainer.getSource();
                if ((z instanceof JvmPackagePartSource) == null) {
                    z = false;
                }
                JvmPackagePartSource jvmPackagePartSource = (JvmPackagePartSource) z;
                z = jvmPackagePartSource != null ? jvmPackagePartSource.getFacadeClassName() : false;
                if (z) {
                    protoContainer = this.kotlinClassFinder;
                    String internalName = z.getInternalName();
                    C2668g.a(internalName, "facadeClassName.internalName");
                    createNestedClassId = ClassId.topLevel(new FqName(C19296q.m68670a(internalName, '/', '.', false, 4, null)));
                    C2668g.a(createNestedClassId, "ClassId.topLevel(FqName(…lName.replace('/', '.')))");
                    return protoContainer.findKotlinClass(createNestedClassId);
                }
            }
        }
        if (z2 && (protoContainer instanceof Class)) {
            classR = (Class) protoContainer;
            if (classR.getKind() == Kind.COMPANION_OBJECT) {
                z = classR.getOuterClass();
                if (z && (z.getKind() == Kind.CLASS || z.getKind() == Kind.ENUM_CLASS)) {
                    return toBinaryClass(z);
                }
            }
        }
        if (!(protoContainer instanceof Package) || !(protoContainer.getSource() instanceof JvmPackagePartSource)) {
            return null;
        }
        protoContainer = protoContainer.getSource();
        if (protoContainer == null) {
            throw new TypeCastException("null cannot be cast to non-null type org.jetbrains.kotlin.load.kotlin.JvmPackagePartSource");
        }
        JvmPackagePartSource jvmPackagePartSource2 = (JvmPackagePartSource) protoContainer;
        z = jvmPackagePartSource2.getKnownJvmBinaryClass();
        if (!z) {
            z = this.kotlinClassFinder.findKotlinClass(jvmPackagePartSource2.getClassId());
        }
        return z;
    }

    private final Storage<A, C> loadAnnotationsAndInitializers(KotlinJvmBinaryClass kotlinJvmBinaryClass) {
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        kotlinJvmBinaryClass.visitMembers(new C17586x2cf49cf1(this, hashMap, hashMap2), getCachedFileContent(kotlinJvmBinaryClass));
        return new Storage(hashMap, hashMap2);
    }

    static /* synthetic */ MemberSignature getPropertySignature$default(AbstractBinaryClassAnnotationAndConstantLoader abstractBinaryClassAnnotationAndConstantLoader, Property property, NameResolver nameResolver, TypeTable typeTable, boolean z, boolean z2, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getPropertySignature");
        }
        return abstractBinaryClassAnnotationAndConstantLoader.getPropertySignature(property, nameResolver, typeTable, (i & 8) != null ? false : z, i & 16 ? false : z2);
    }

    private final MemberSignature getPropertySignature(Property property, NameResolver nameResolver, TypeTable typeTable, boolean z, boolean z2) {
        ExtendableMessage extendableMessage = property;
        GeneratedExtension generatedExtension = JvmProtoBuf.propertySignature;
        C2668g.a(generatedExtension, "propertySignature");
        JvmPropertySignature jvmPropertySignature = (JvmPropertySignature) ProtoBufUtilKt.getExtensionOrNull(extendableMessage, generatedExtension);
        if (jvmPropertySignature == null) {
            return null;
        }
        if (z) {
            property = JvmProtoBufUtil.INSTANCE.getJvmFieldSignature(property, nameResolver, typeTable);
            if (property == null) {
                return null;
            }
            return MemberSignature.Companion.fromFieldNameAndDesc(property.component1(), property.component2());
        } else if (!z2 || jvmPropertySignature.hasSyntheticMethod() == null) {
            return null;
        } else {
            property = MemberSignature.Companion;
            typeTable = jvmPropertySignature.getSyntheticMethod();
            C2668g.a(typeTable, "signature.syntheticMethod");
            return property.fromMethod(nameResolver, typeTable);
        }
    }

    private final MemberSignature getCallableSignature(MessageLite messageLite, NameResolver nameResolver, TypeTable typeTable, AnnotatedCallableKind annotatedCallableKind) {
        MemberSignature memberSignature = null;
        if (messageLite instanceof Constructor) {
            annotatedCallableKind = MemberSignature.Companion;
            messageLite = JvmProtoBufUtil.INSTANCE.getJvmConstructorSignature((Constructor) messageLite, nameResolver, typeTable);
            if (messageLite == null) {
                return null;
            }
            memberSignature = annotatedCallableKind.fromMethodNameAndDesc(messageLite);
        } else if (messageLite instanceof Function) {
            annotatedCallableKind = MemberSignature.Companion;
            messageLite = JvmProtoBufUtil.INSTANCE.getJvmMethodSignature((Function) messageLite, nameResolver, typeTable);
            if (messageLite == null) {
                return null;
            }
            memberSignature = annotatedCallableKind.fromMethodNameAndDesc(messageLite);
        } else if (messageLite instanceof Property) {
            ExtendableMessage extendableMessage = (ExtendableMessage) messageLite;
            GeneratedExtension generatedExtension = JvmProtoBuf.propertySignature;
            C2668g.a(generatedExtension, "propertySignature");
            JvmPropertySignature jvmPropertySignature = (JvmPropertySignature) ProtoBufUtilKt.getExtensionOrNull(extendableMessage, generatedExtension);
            if (jvmPropertySignature != null) {
                switch (annotatedCallableKind) {
                    case PROPERTY_GETTER:
                        messageLite = MemberSignature.Companion;
                        typeTable = jvmPropertySignature.getGetter();
                        C2668g.a(typeTable, "signature.getter");
                        memberSignature = messageLite.fromMethod(nameResolver, typeTable);
                        break;
                    case PROPERTY_SETTER:
                        messageLite = MemberSignature.Companion;
                        typeTable = jvmPropertySignature.getSetter();
                        C2668g.a(typeTable, "signature.setter");
                        memberSignature = messageLite.fromMethod(nameResolver, typeTable);
                        break;
                    case PROPERTY:
                        memberSignature = getPropertySignature((Property) messageLite, nameResolver, typeTable, true, true);
                        break;
                    default:
                        break;
                }
            }
            return null;
        }
        return memberSignature;
    }

    static {
        Iterable<FqName> b = C17554o.m64199b((Object[]) new FqName[]{JvmAnnotationNames.METADATA_FQ_NAME, JvmAnnotationNames.JETBRAINS_NOT_NULL_ANNOTATION, JvmAnnotationNames.JETBRAINS_NULLABLE_ANNOTATION, new FqName("java.lang.annotation.Target"), new FqName("java.lang.annotation.Retention"), new FqName("java.lang.annotation.Documented")});
        Collection arrayList = new ArrayList(C18457p.m66906a((Iterable) b, 10));
        for (FqName topLevel : b) {
            arrayList.add(ClassId.topLevel(topLevel));
        }
        SPECIAL_ANNOTATIONS = C19299w.m68842n((List) arrayList);
    }
}
