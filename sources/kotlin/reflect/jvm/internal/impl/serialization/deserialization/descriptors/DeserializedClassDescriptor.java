package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.C17554o;
import kotlin.collections.C18457p;
import kotlin.collections.C19291t;
import kotlin.collections.C19299w;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C2668g;
import kotlin.ranges.C18464j;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses.MockClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.SupertypeLoopChecker;
import kotlin.reflect.jvm.internal.impl.descriptors.SupertypeLoopChecker.EMPTY;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Visibility;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ClassConstructorDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.incremental.UtilsKt;
import kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class.Kind;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Constructor;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.EnumEntry;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeTable;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.BooleanFlagField;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.ProtoTypeTableUtilKt;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorFactory;
import kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope.Empty;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope.DefaultImpls;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.StaticScopeForKotlinEnum;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationComponents;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationContext;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.ErrorReporter;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.MemberDeserializer;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.NameResolverUtilKt;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoContainer;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoEnumFlags;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.TypeDeserializer;
import kotlin.reflect.jvm.internal.impl.storage.MemoizedFunctionToNullable;
import kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import kotlin.reflect.jvm.internal.impl.storage.NullableLazyValue;
import kotlin.reflect.jvm.internal.impl.types.AbstractClassTypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class DeserializedClassDescriptor extends AbstractClassDescriptor {
    @NotNull
    private final Annotations annotations;
    @NotNull
    /* renamed from: c */
    private final DeserializationContext f60037c;
    private final ClassId classId;
    @NotNull
    private final Class classProto;
    private final NullableLazyValue<ClassDescriptor> companionObjectDescriptor;
    private final NotNullLazyValue<Collection<ClassConstructorDescriptor>> constructors;
    private final DeclarationDescriptor containingDeclaration;
    private final EnumEntryClassDescriptors enumEntries;
    private final ClassKind kind = ProtoEnumFlags.INSTANCE.classKind((Kind) Flags.CLASS_KIND.get(this.classProto.getFlags()));
    private final DeserializedClassMemberScope memberScope;
    private final Modality modality = ProtoEnumFlags.INSTANCE.modality((ProtoBuf.Modality) Flags.MODALITY.get(this.classProto.getFlags()));
    private final NullableLazyValue<ClassConstructorDescriptor> primaryConstructor;
    private final NotNullLazyValue<Collection<ClassDescriptor>> sealedSubclasses;
    private final SourceElement sourceElement;
    private final MemberScopeImpl staticScope;
    @NotNull
    private final ProtoContainer.Class thisAsProtoContainer;
    private final DeserializedClassTypeConstructor typeConstructor;
    private final Visibility visibility = ProtoEnumFlags.INSTANCE.visibility((ProtoBuf.Visibility) Flags.VISIBILITY.get(this.classProto.getFlags()));

    private final class EnumEntryClassDescriptors {
        private final MemoizedFunctionToNullable<Name, ClassDescriptor> enumEntryByName;
        private final Map<Name, EnumEntry> enumEntryProtos;
        private final NotNullLazyValue<Set<Name>> enumMemberNames;

        public EnumEntryClassDescriptors() {
            List enumEntryList = DeserializedClassDescriptor.this.getClassProto().getEnumEntryList();
            C2668g.a(enumEntryList, "classProto.enumEntryList");
            Iterable iterable = enumEntryList;
            Map linkedHashMap = new LinkedHashMap(C18464j.m66926c(ah.m66883a(C18457p.m66906a(iterable, 10)), 16));
            for (Object next : iterable) {
                EnumEntry enumEntry = (EnumEntry) next;
                NameResolver nameResolver = DeserializedClassDescriptor.this.getC().getNameResolver();
                C2668g.a(enumEntry, "it");
                linkedHashMap.put(NameResolverUtilKt.getName(nameResolver, enumEntry.getName()), next);
            }
            this.enumEntryProtos = linkedHashMap;
            this.enumEntryByName = DeserializedClassDescriptor.this.getC().getStorageManager().createMemoizedFunctionWithNullableValues(new C19141xaf8327b7(this));
            this.enumMemberNames = DeserializedClassDescriptor.this.getC().getStorageManager().createLazyValue(new C19142xaaca1f71(this));
        }

        @Nullable
        public final ClassDescriptor findEnumEntry(@NotNull Name name) {
            C2668g.b(name, "name");
            return (ClassDescriptor) this.enumEntryByName.invoke(name);
        }

        private final Set<Name> computeEnumMemberNames() {
            HashSet hashSet = new HashSet();
            for (KotlinType memberScope : DeserializedClassDescriptor.this.getTypeConstructor().getSupertypes()) {
                for (DeclarationDescriptor declarationDescriptor : DefaultImpls.getContributedDescriptors$default(memberScope.getMemberScope(), null, null, 3, null)) {
                    if ((declarationDescriptor instanceof SimpleFunctionDescriptor) || (declarationDescriptor instanceof PropertyDescriptor)) {
                        hashSet.add(declarationDescriptor.getName());
                    }
                }
            }
            List<Function> functionList = DeserializedClassDescriptor.this.getClassProto().getFunctionList();
            C2668g.a(functionList, "classProto.functionList");
            for (Function function : functionList) {
                Collection collection = hashSet;
                NameResolver nameResolver = DeserializedClassDescriptor.this.getC().getNameResolver();
                C2668g.a(function, "it");
                collection.add(NameResolverUtilKt.getName(nameResolver, function.getName()));
            }
            Collection collection2 = hashSet;
            Set set = (Set) collection2;
            List<Property> propertyList = DeserializedClassDescriptor.this.getClassProto().getPropertyList();
            C2668g.a(propertyList, "classProto.propertyList");
            for (Property property : propertyList) {
                nameResolver = DeserializedClassDescriptor.this.getC().getNameResolver();
                C2668g.a(property, "it");
                collection2.add(NameResolverUtilKt.getName(nameResolver, property.getName()));
            }
            return an.m66899a(set, (Iterable) collection2);
        }

        @NotNull
        public final Collection<ClassDescriptor> all() {
            Collection arrayList = new ArrayList();
            for (Name findEnumEntry : this.enumEntryProtos.keySet()) {
                ClassDescriptor findEnumEntry2 = findEnumEntry(findEnumEntry);
                if (findEnumEntry2 != null) {
                    arrayList.add(findEnumEntry2);
                }
            }
            return (List) arrayList;
        }
    }

    private final class DeserializedClassTypeConstructor extends AbstractClassTypeConstructor {
        private final NotNullLazyValue<List<TypeParameterDescriptor>> parameters;

        public boolean isDenotable() {
            return true;
        }

        public DeserializedClassTypeConstructor() {
            super(DeserializedClassDescriptor.this.getC().getStorageManager());
            this.parameters = DeserializedClassDescriptor.this.getC().getStorageManager().createLazyValue(new C19139x32944d2c(this));
        }

        @NotNull
        protected Collection<KotlinType> computeSupertypes() {
            Iterable<Type> supertypes = ProtoTypeTableUtilKt.supertypes(DeserializedClassDescriptor.this.getClassProto(), DeserializedClassDescriptor.this.getC().getTypeTable());
            Collection arrayList = new ArrayList(C18457p.m66906a((Iterable) supertypes, 10));
            for (Type type$default : supertypes) {
                arrayList.add(TypeDeserializer.type$default(DeserializedClassDescriptor.this.getC().getTypeDeserializer(), type$default, null, 2, null));
            }
            Iterable<KotlinType> b = C19299w.m68809b((Collection) (List) arrayList, (Iterable) DeserializedClassDescriptor.this.getC().getComponents().getAdditionalClassPartsProvider().getSupertypes(DeserializedClassDescriptor.this));
            arrayList = new ArrayList();
            for (KotlinType constructor : b) {
                ClassifierDescriptor declarationDescriptor = constructor.getConstructor().getDeclarationDescriptor();
                if (!(declarationDescriptor instanceof MockClassDescriptor)) {
                    declarationDescriptor = null;
                }
                MockClassDescriptor mockClassDescriptor = (MockClassDescriptor) declarationDescriptor;
                if (mockClassDescriptor != null) {
                    arrayList.add(mockClassDescriptor);
                }
            }
            List list = (List) arrayList;
            if ((list.isEmpty() ^ 1) != 0) {
                ErrorReporter errorReporter = DeserializedClassDescriptor.this.getC().getComponents().getErrorReporter();
                ClassDescriptor classDescriptor = DeserializedClassDescriptor.this;
                Iterable<MockClassDescriptor> iterable = list;
                Collection arrayList2 = new ArrayList(C18457p.m66906a((Iterable) iterable, 10));
                for (MockClassDescriptor mockClassDescriptor2 : iterable) {
                    Object asString;
                    ClassId classId = DescriptorUtilsKt.getClassId(mockClassDescriptor2);
                    if (classId != null) {
                        FqName asSingleFqName = classId.asSingleFqName();
                        if (asSingleFqName != null) {
                            asString = asSingleFqName.asString();
                            if (asString != null) {
                                arrayList2.add(asString);
                            }
                        }
                    }
                    asString = mockClassDescriptor2.getName().asString();
                    arrayList2.add(asString);
                }
                errorReporter.reportIncompleteHierarchy(classDescriptor, (List) arrayList2);
            }
            return C19299w.m68840l(b);
        }

        @NotNull
        public List<TypeParameterDescriptor> getParameters() {
            return (List) this.parameters.invoke();
        }

        @NotNull
        public DeserializedClassDescriptor getDeclarationDescriptor() {
            return DeserializedClassDescriptor.this;
        }

        @NotNull
        public String toString() {
            return DeserializedClassDescriptor.this.getName().toString();
        }

        @NotNull
        protected SupertypeLoopChecker getSupertypeLoopChecker() {
            return EMPTY.INSTANCE;
        }
    }

    private final class DeserializedClassMemberScope extends DeserializedMemberScope {
        private final NotNullLazyValue<Collection<DeclarationDescriptor>> allDescriptors;

        public DeserializedClassMemberScope() {
            DeserializationContext c = DeserializedClassDescriptor.this.getC();
            List functionList = DeserializedClassDescriptor.this.getClassProto().getFunctionList();
            C2668g.a(functionList, "classProto.functionList");
            Collection collection = functionList;
            functionList = DeserializedClassDescriptor.this.getClassProto().getPropertyList();
            C2668g.a(functionList, "classProto.propertyList");
            Collection collection2 = functionList;
            functionList = DeserializedClassDescriptor.this.getClassProto().getTypeAliasList();
            C2668g.a(functionList, "classProto.typeAliasList");
            Collection collection3 = functionList;
            functionList = DeserializedClassDescriptor.this.getClassProto().getNestedClassNameList();
            C2668g.a(functionList, "classProto.nestedClassNameList");
            Iterable<Number> iterable = functionList;
            DeserializedClassDescriptor nameResolver = DeserializedClassDescriptor.this.getC().getNameResolver();
            Collection arrayList = new ArrayList(C18457p.m66906a((Iterable) iterable, 10));
            for (Number intValue : iterable) {
                arrayList.add(NameResolverUtilKt.getName(nameResolver, intValue.intValue()));
            }
            super(c, collection, collection2, collection3, (Function0) new DeserializedClassDescriptor$DeserializedClassMemberScope$2$1((List) arrayList));
            this.allDescriptors = getC().getStorageManager().createLazyValue(new C19137xb586494b(this));
        }

        private final DeserializedClassDescriptor getClassDescriptor() {
            return DeserializedClassDescriptor.this;
        }

        @NotNull
        public Collection<DeclarationDescriptor> getContributedDescriptors(@NotNull DescriptorKindFilter descriptorKindFilter, @NotNull Function1<? super Name, Boolean> function1) {
            C2668g.b(descriptorKindFilter, "kindFilter");
            C2668g.b(function1, "nameFilter");
            return (Collection) this.allDescriptors.invoke();
        }

        @NotNull
        public Collection<SimpleFunctionDescriptor> getContributedFunctions(@NotNull Name name, @NotNull LookupLocation lookupLocation) {
            C2668g.b(name, "name");
            C2668g.b(lookupLocation, "location");
            recordLookup(name, lookupLocation);
            return super.getContributedFunctions(name, lookupLocation);
        }

        @NotNull
        public Collection<PropertyDescriptor> getContributedVariables(@NotNull Name name, @NotNull LookupLocation lookupLocation) {
            C2668g.b(name, "name");
            C2668g.b(lookupLocation, "location");
            recordLookup(name, lookupLocation);
            return super.getContributedVariables(name, lookupLocation);
        }

        protected void computeNonDeclaredFunctions(@NotNull Name name, @NotNull Collection<SimpleFunctionDescriptor> collection) {
            C2668g.b(name, "name");
            C2668g.b(collection, "functions");
            ArrayList arrayList = new ArrayList();
            for (KotlinType memberScope : getClassDescriptor().getTypeConstructor().getSupertypes()) {
                arrayList.addAll(memberScope.getMemberScope().getContributedFunctions(name, NoLookupLocation.FOR_ALREADY_TRACKED));
            }
            C19291t.m68639b(collection, new C19138x1ddbb2bd(this));
            collection.addAll(getC().getComponents().getAdditionalClassPartsProvider().getFunctions(name, DeserializedClassDescriptor.this));
            generateFakeOverrides(name, arrayList, collection);
        }

        protected void computeNonDeclaredProperties(@NotNull Name name, @NotNull Collection<PropertyDescriptor> collection) {
            C2668g.b(name, "name");
            C2668g.b(collection, "descriptors");
            ArrayList arrayList = new ArrayList();
            for (KotlinType memberScope : getClassDescriptor().getTypeConstructor().getSupertypes()) {
                arrayList.addAll(memberScope.getMemberScope().getContributedVariables(name, NoLookupLocation.FOR_ALREADY_TRACKED));
            }
            generateFakeOverrides(name, arrayList, collection);
        }

        private final <D extends CallableMemberDescriptor> void generateFakeOverrides(Name name, Collection<? extends D> collection, Collection<D> collection2) {
            OverridingUtil.generateOverridesInFunctionGroup(name, collection, new ArrayList(collection2), getClassDescriptor(), new C18527xf150c8cf(collection2));
        }

        @NotNull
        protected Set<Name> getNonDeclaredFunctionNames() {
            Collection linkedHashSet = new LinkedHashSet();
            for (KotlinType memberScope : getClassDescriptor().typeConstructor.getSupertypes()) {
                C19291t.m68635a(linkedHashSet, (Iterable) memberScope.getMemberScope().getFunctionNames());
            }
            ((LinkedHashSet) linkedHashSet).addAll(getC().getComponents().getAdditionalClassPartsProvider().getFunctionsNames(DeserializedClassDescriptor.this));
            return (Set) linkedHashSet;
        }

        @NotNull
        protected Set<Name> getNonDeclaredVariableNames() {
            Collection linkedHashSet = new LinkedHashSet();
            for (KotlinType memberScope : getClassDescriptor().typeConstructor.getSupertypes()) {
                C19291t.m68635a(linkedHashSet, (Iterable) memberScope.getMemberScope().getVariableNames());
            }
            return (Set) linkedHashSet;
        }

        @Nullable
        public ClassifierDescriptor getContributedClassifier(@NotNull Name name, @NotNull LookupLocation lookupLocation) {
            C2668g.b(name, "name");
            C2668g.b(lookupLocation, "location");
            recordLookup(name, lookupLocation);
            EnumEntryClassDescriptors access$getEnumEntries$p = getClassDescriptor().enumEntries;
            if (access$getEnumEntries$p != null) {
                ClassDescriptor findEnumEntry = access$getEnumEntries$p.findEnumEntry(name);
                if (findEnumEntry != null) {
                    return findEnumEntry;
                }
            }
            return super.getContributedClassifier(name, lookupLocation);
        }

        @NotNull
        protected ClassId createClassId(@NotNull Name name) {
            C2668g.b(name, "name");
            return DeserializedClassDescriptor.this.classId.createNestedClassId(name);
        }

        protected void addEnumEntryDescriptors(@NotNull Collection<DeclarationDescriptor> collection, @NotNull Function1<? super Name, Boolean> function1) {
            C2668g.b(collection, "result");
            C2668g.b(function1, "nameFilter");
            function1 = getClassDescriptor().enumEntries;
            function1 = function1 != null ? function1.all() : null;
            if (function1 == null) {
                function1 = C17554o.m64195a();
            }
            collection.addAll(function1);
        }

        public void recordLookup(@NotNull Name name, @NotNull LookupLocation lookupLocation) {
            C2668g.b(name, "name");
            C2668g.b(lookupLocation, "location");
            UtilsKt.record(getC().getComponents().getLookupTracker(), lookupLocation, (ClassDescriptor) getClassDescriptor(), name);
        }
    }

    public boolean isActual() {
        return false;
    }

    /* renamed from: isData */
    public /* synthetic */ boolean m71766isData() {
        return isData().booleanValue();
    }

    /* renamed from: isExpect */
    public /* synthetic */ boolean m71767isExpect() {
        return isExpect().booleanValue();
    }

    /* renamed from: isExternal */
    public /* synthetic */ boolean m71768isExternal() {
        return isExternal().booleanValue();
    }

    /* renamed from: isInline */
    public /* synthetic */ boolean m71769isInline() {
        return isInline().booleanValue();
    }

    /* renamed from: isInner */
    public /* synthetic */ boolean m71770isInner() {
        return isInner().booleanValue();
    }

    @NotNull
    public final Class getClassProto() {
        return this.classProto;
    }

    public DeserializedClassDescriptor(@NotNull DeserializationContext deserializationContext, @NotNull Class classR, @NotNull NameResolver nameResolver, @NotNull SourceElement sourceElement) {
        C2668g.b(deserializationContext, "outerContext");
        C2668g.b(classR, "classProto");
        C2668g.b(nameResolver, "nameResolver");
        C2668g.b(sourceElement, "sourceElement");
        super(deserializationContext.getStorageManager(), NameResolverUtilKt.getClassId(nameResolver, classR.getFqName()).getShortClassName());
        this.classProto = classR;
        this.sourceElement = sourceElement;
        this.classId = NameResolverUtilKt.getClassId(nameResolver, this.classProto.getFqName());
        DeclarationDescriptor declarationDescriptor = this;
        sourceElement = this.classProto.getTypeParameterList();
        C2668g.a(sourceElement, "classProto.typeParameterList");
        TypeTable typeTable = this.classProto.getTypeTable();
        C2668g.a(typeTable, "classProto.typeTable");
        this.f60037c = deserializationContext.childContext(declarationDescriptor, sourceElement, nameResolver, new kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable(typeTable));
        this.staticScope = (MemberScopeImpl) (this.kind == ClassKind.ENUM_CLASS ? new StaticScopeForKotlinEnum(this.f60037c.getStorageManager(), this) : Empty.INSTANCE);
        this.typeConstructor = new DeserializedClassTypeConstructor();
        this.memberScope = new DeserializedClassMemberScope();
        sourceElement = null;
        this.enumEntries = this.kind == ClassKind.ENUM_CLASS ? new EnumEntryClassDescriptors() : null;
        this.containingDeclaration = deserializationContext.getContainingDeclaration();
        this.primaryConstructor = this.f60037c.getStorageManager().createNullableLazyValue((Function0) new DeserializedClassDescriptor$primaryConstructor$1(this));
        this.constructors = this.f60037c.getStorageManager().createLazyValue((Function0) new DeserializedClassDescriptor$constructors$1(this));
        this.companionObjectDescriptor = this.f60037c.getStorageManager().createNullableLazyValue((Function0) new DeserializedClassDescriptor$companionObjectDescriptor$1(this));
        this.sealedSubclasses = this.f60037c.getStorageManager().createLazyValue((Function0) new DeserializedClassDescriptor$sealedSubclasses$1(this));
        Class classR2 = this.classProto;
        NameResolver nameResolver2 = this.f60037c.getNameResolver();
        kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable typeTable2 = this.f60037c.getTypeTable();
        SourceElement sourceElement2 = this.sourceElement;
        classR = this.containingDeclaration;
        if ((classR instanceof DeserializedClassDescriptor) == null) {
            classR = null;
        }
        DeserializedClassDescriptor deserializedClassDescriptor = (DeserializedClassDescriptor) classR;
        if (deserializedClassDescriptor != null) {
            sourceElement = deserializedClassDescriptor.thisAsProtoContainer;
        }
        this.thisAsProtoContainer = new ProtoContainer.Class(classR2, nameResolver2, typeTable2, sourceElement2, sourceElement);
        if (Flags.HAS_ANNOTATIONS.get(this.classProto.getFlags()).booleanValue() == null) {
            deserializationContext = Annotations.Companion.getEMPTY();
        } else {
            deserializationContext = (Annotations) new NonEmptyDeserializedAnnotations(this.f60037c.getStorageManager(), (Function0) new DeserializedClassDescriptor$annotations$1(this));
        }
        this.annotations = deserializationContext;
    }

    @NotNull
    public final DeserializationContext getC() {
        return this.f60037c;
    }

    @NotNull
    public final ProtoContainer.Class getThisAsProtoContainer$deserialization() {
        return this.thisAsProtoContainer;
    }

    @NotNull
    public Annotations getAnnotations() {
        return this.annotations;
    }

    @NotNull
    public DeclarationDescriptor getContainingDeclaration() {
        return this.containingDeclaration;
    }

    @NotNull
    public TypeConstructor getTypeConstructor() {
        return this.typeConstructor;
    }

    @NotNull
    public ClassKind getKind() {
        return this.kind;
    }

    @NotNull
    public Modality getModality() {
        return this.modality;
    }

    @NotNull
    public Visibility getVisibility() {
        return this.visibility;
    }

    @NotNull
    public Boolean isInner() {
        return Flags.IS_INNER.get(this.classProto.getFlags());
    }

    @NotNull
    public Boolean isData() {
        return Flags.IS_DATA.get(this.classProto.getFlags());
    }

    @NotNull
    public Boolean isInline() {
        return Flags.IS_INLINE_CLASS.get(this.classProto.getFlags());
    }

    @NotNull
    public Boolean isExpect() {
        return Flags.IS_EXPECT_CLASS.get(this.classProto.getFlags());
    }

    @NotNull
    public Boolean isExternal() {
        return Flags.IS_EXTERNAL_CLASS.get(this.classProto.getFlags());
    }

    @NotNull
    public MemberScope getUnsubstitutedMemberScope() {
        return this.memberScope;
    }

    @NotNull
    public MemberScopeImpl getStaticScope() {
        return this.staticScope;
    }

    public boolean isCompanionObject() {
        return ((Kind) Flags.CLASS_KIND.get(this.classProto.getFlags())) == Kind.COMPANION_OBJECT;
    }

    private final ClassConstructorDescriptor computePrimaryConstructor() {
        if (this.kind.isSingleton()) {
            ClassConstructorDescriptorImpl createPrimaryConstructorForObject = DescriptorFactory.createPrimaryConstructorForObject(this, SourceElement.NO_SOURCE);
            createPrimaryConstructorForObject.setReturnType(getDefaultType());
            return createPrimaryConstructorForObject;
        }
        ClassConstructorDescriptor classConstructorDescriptor;
        Object obj;
        List constructorList = this.classProto.getConstructorList();
        C2668g.a(constructorList, "classProto.constructorList");
        Iterator it = constructorList.iterator();
        BooleanFlagField booleanFlagField;
        Constructor constructor;
        do {
            classConstructorDescriptor = null;
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            constructor = (Constructor) obj;
            booleanFlagField = Flags.IS_SECONDARY;
            C2668g.a(constructor, "it");
        } while ((booleanFlagField.get(constructor.getFlags()).booleanValue() ^ 1) == 0);
        Constructor constructor2 = (Constructor) obj;
        if (constructor2 != null) {
            classConstructorDescriptor = this.f60037c.getMemberDeserializer().loadConstructor(constructor2, true);
        }
        return classConstructorDescriptor;
    }

    @Nullable
    public ClassConstructorDescriptor getUnsubstitutedPrimaryConstructor() {
        return (ClassConstructorDescriptor) this.primaryConstructor.invoke();
    }

    private final Collection<ClassConstructorDescriptor> computeConstructors() {
        return C19299w.m68809b((Collection) C19299w.m68809b((Collection) computeSecondaryConstructors(), (Iterable) C17554o.m64197b((Object) getUnsubstitutedPrimaryConstructor())), (Iterable) this.f60037c.getComponents().getAdditionalClassPartsProvider().getConstructors(this));
    }

    private final List<ClassConstructorDescriptor> computeSecondaryConstructors() {
        List constructorList = this.classProto.getConstructorList();
        C2668g.a(constructorList, "classProto.constructorList");
        Collection arrayList = new ArrayList();
        for (Object next : constructorList) {
            Constructor constructor = (Constructor) next;
            BooleanFlagField booleanFlagField = Flags.IS_SECONDARY;
            C2668g.a(constructor, "it");
            Boolean bool = booleanFlagField.get(constructor.getFlags());
            C2668g.a(bool, "Flags.IS_SECONDARY.get(it.flags)");
            if (bool.booleanValue()) {
                arrayList.add(next);
            }
        }
        Iterable<Constructor> iterable = (List) arrayList;
        Collection arrayList2 = new ArrayList(C18457p.m66906a((Iterable) iterable, 10));
        for (Constructor constructor2 : iterable) {
            MemberDeserializer memberDeserializer = this.f60037c.getMemberDeserializer();
            C2668g.a(constructor2, "it");
            arrayList2.add(memberDeserializer.loadConstructor(constructor2, false));
        }
        return (List) arrayList2;
    }

    @NotNull
    public Collection<ClassConstructorDescriptor> getConstructors() {
        return (Collection) this.constructors.invoke();
    }

    private final ClassDescriptor computeCompanionObjectDescriptor() {
        if (!this.classProto.hasCompanionObjectName()) {
            return null;
        }
        ClassifierDescriptor contributedClassifier = this.memberScope.getContributedClassifier(NameResolverUtilKt.getName(this.f60037c.getNameResolver(), this.classProto.getCompanionObjectName()), NoLookupLocation.FROM_DESERIALIZATION);
        if (!(contributedClassifier instanceof ClassDescriptor)) {
            contributedClassifier = null;
        }
        return (ClassDescriptor) contributedClassifier;
    }

    @Nullable
    public ClassDescriptor getCompanionObjectDescriptor() {
        return (ClassDescriptor) this.companionObjectDescriptor.invoke();
    }

    public final boolean hasNestedClass$deserialization(@NotNull Name name) {
        C2668g.b(name, "name");
        return this.memberScope.getClassNames$deserialization().contains(name);
    }

    private final Collection<ClassDescriptor> computeSubclassesForSealedClass() {
        if (this.modality != Modality.SEALED) {
            return C17554o.m64195a();
        }
        List<Integer> sealedSubclassFqNameList = this.classProto.getSealedSubclassFqNameList();
        C2668g.a(sealedSubclassFqNameList, "fqNames");
        if ((sealedSubclassFqNameList.isEmpty() ^ 1) == 0) {
            return DescriptorUtilsKt.computeSealedSubclasses(this);
        }
        Collection arrayList = new ArrayList();
        for (Integer num : sealedSubclassFqNameList) {
            DeserializationComponents components = this.f60037c.getComponents();
            NameResolver nameResolver = this.f60037c.getNameResolver();
            C2668g.a(num, "index");
            ClassDescriptor deserializeClass = components.deserializeClass(NameResolverUtilKt.getClassId(nameResolver, num.intValue()));
            if (deserializeClass != null) {
                arrayList.add(deserializeClass);
            }
        }
        return (List) arrayList;
    }

    @NotNull
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("deserialized class ");
        stringBuilder.append(getName());
        return stringBuilder.toString();
    }

    @NotNull
    public SourceElement getSource() {
        return this.sourceElement;
    }

    @NotNull
    public List<TypeParameterDescriptor> getDeclaredTypeParameters() {
        return this.f60037c.getTypeDeserializer().getOwnTypeParameters();
    }
}
