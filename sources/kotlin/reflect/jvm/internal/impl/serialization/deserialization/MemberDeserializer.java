package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.TypeCastException;
import kotlin.collections.C15807n;
import kotlin.collections.C17554o;
import kotlin.collections.C18457p;
import kotlin.collections.C19299w;
import kotlin.jvm.internal.C2668g;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor.UserDataKey;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertySetterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Visibility;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationsImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyGetterDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertySetterDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ValueParameterDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Constructor;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.MemberKind;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeAlias;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.ValueParameter;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.ProtoTypeTableUtilKt;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.protobuf.MessageLite;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorFactory;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoContainer.Package;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedAnnotationsWithPossibleTargets;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedPropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedSimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedTypeAliasDescriptor;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.NonEmptyDeserializedAnnotations;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.NonEmptyDeserializedAnnotationsWithPossibleTargets;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import org.jetbrains.annotations.NotNull;

public final class MemberDeserializer {
    private final AnnotationDeserializer annotationDeserializer = new AnnotationDeserializer(this.f49042c.getComponents().getModuleDescriptor(), this.f49042c.getComponents().getNotFoundClasses());
    /* renamed from: c */
    private final DeserializationContext f49042c;

    private final int loadOldFlags(int i) {
        return (i & 63) + ((i >> 8) << 6);
    }

    public MemberDeserializer(@NotNull DeserializationContext deserializationContext) {
        C2668g.b(deserializationContext, "c");
        this.f49042c = deserializationContext;
    }

    @NotNull
    public final PropertyDescriptor loadProperty(@NotNull Property property) {
        MessageLite messageLite;
        DeserializedPropertyDescriptor deserializedPropertyDescriptor;
        int i;
        Property property2;
        Annotations receiverParameterAnnotations$default;
        Boolean bool;
        int i2;
        Boolean bool2;
        boolean z;
        boolean z2;
        PropertyGetterDescriptorImpl propertyGetterDescriptorImpl;
        Property property3;
        int i3;
        MemberDeserializer memberDeserializer = this;
        Property property4 = property;
        C2668g.b(property4, "proto");
        int flags = property.hasFlags() ? property.getFlags() : loadOldFlags(property.getOldFlags());
        DeclarationDescriptor containingDeclaration = memberDeserializer.f49042c.getContainingDeclaration();
        MessageLite messageLite2 = property4;
        Annotations annotations = getAnnotations(messageLite2, flags, AnnotatedCallableKind.PROPERTY);
        Modality modality = ProtoEnumFlags.INSTANCE.modality((ProtoBuf.Modality) Flags.MODALITY.get(flags));
        Visibility visibility = ProtoEnumFlags.INSTANCE.visibility((ProtoBuf.Visibility) Flags.VISIBILITY.get(flags));
        C2668g.a(visibility, "ProtoEnumFlags.visibilit…gs.VISIBILITY.get(flags))");
        Boolean bool3 = Flags.IS_VAR.get(flags);
        C2668g.a(bool3, "Flags.IS_VAR.get(flags)");
        boolean booleanValue = bool3.booleanValue();
        Name name = NameResolverUtilKt.getName(memberDeserializer.f49042c.getNameResolver(), property.getName());
        Kind memberKind = ProtoEnumFlags.INSTANCE.memberKind((MemberKind) Flags.MEMBER_KIND.get(flags));
        bool3 = Flags.IS_LATEINIT.get(flags);
        C2668g.a(bool3, "Flags.IS_LATEINIT.get(flags)");
        boolean booleanValue2 = bool3.booleanValue();
        bool3 = Flags.IS_CONST.get(flags);
        C2668g.a(bool3, "Flags.IS_CONST.get(flags)");
        boolean booleanValue3 = bool3.booleanValue();
        bool3 = Flags.IS_EXTERNAL_PROPERTY.get(flags);
        C2668g.a(bool3, "Flags.IS_EXTERNAL_PROPERTY.get(flags)");
        boolean booleanValue4 = bool3.booleanValue();
        bool3 = Flags.IS_DELEGATED.get(flags);
        C2668g.a(bool3, "Flags.IS_DELEGATED.get(flags)");
        boolean booleanValue5 = bool3.booleanValue();
        bool3 = Flags.IS_EXPECT_PROPERTY.get(flags);
        C2668g.a(bool3, "Flags.IS_EXPECT_PROPERTY.get(flags)");
        DeserializedPropertyDescriptor deserializedPropertyDescriptor2 = new DeserializedPropertyDescriptor(containingDeclaration, null, annotations, modality, visibility, booleanValue, name, memberKind, booleanValue2, booleanValue3, booleanValue4, booleanValue5, bool3.booleanValue(), property4, memberDeserializer.f49042c.getNameResolver(), memberDeserializer.f49042c.getTypeTable(), memberDeserializer.f49042c.getVersionRequirementTable(), memberDeserializer.f49042c.getContainerSource());
        DeserializationContext deserializationContext = memberDeserializer.f49042c;
        DeclarationDescriptor declarationDescriptor = deserializedPropertyDescriptor2;
        List typeParameterList = property.getTypeParameterList();
        C2668g.a(typeParameterList, "proto.typeParameterList");
        DeserializationContext childContext$default = DeserializationContext.childContext$default(deserializationContext, declarationDescriptor, typeParameterList, null, null, 12, null);
        Boolean bool4 = Flags.HAS_GETTER.get(flags);
        C2668g.a(bool4, "hasGetter");
        if (bool4.booleanValue() && ProtoTypeTableUtilKt.hasReceiver(property)) {
            messageLite = messageLite2;
            deserializedPropertyDescriptor = deserializedPropertyDescriptor2;
            i = flags;
            property2 = property4;
            receiverParameterAnnotations$default = getReceiverParameterAnnotations$default(memberDeserializer, messageLite2, AnnotatedCallableKind.PROPERTY_GETTER, null, 4, null);
        } else {
            messageLite = messageLite2;
            deserializedPropertyDescriptor = deserializedPropertyDescriptor2;
            i = flags;
            property2 = property4;
            receiverParameterAnnotations$default = Annotations.Companion.getEMPTY();
        }
        Annotations annotations2 = null;
        KotlinType type$default = TypeDeserializer.type$default(childContext$default.getTypeDeserializer(), ProtoTypeTableUtilKt.returnType(property2, memberDeserializer.f49042c.getTypeTable()), null, 2, null);
        List ownTypeParameters = childContext$default.getTypeDeserializer().getOwnTypeParameters();
        ReceiverParameterDescriptor dispatchReceiverParameter = getDispatchReceiverParameter();
        Type receiverType = ProtoTypeTableUtilKt.receiverType(property2, memberDeserializer.f49042c.getTypeTable());
        deserializedPropertyDescriptor.setType(type$default, ownTypeParameters, dispatchReceiverParameter, receiverType != null ? childContext$default.getTypeDeserializer().type(receiverType, receiverParameterAnnotations$default) : null);
        if (bool4.booleanValue()) {
            Annotations annotations3;
            int getterFlags = property.getGetterFlags();
            if (property.hasGetterFlags()) {
                bool = Flags.IS_NOT_DEFAULT.get(getterFlags);
                C2668g.a(bool, "Flags.IS_NOT_DEFAULT.get(getterFlags)");
                if (bool.booleanValue()) {
                    i2 = 1;
                    if (property.hasGetterFlags()) {
                        bool2 = Flags.IS_EXTERNAL_ACCESSOR.get(getterFlags);
                        C2668g.a(bool2, "Flags.IS_EXTERNAL_ACCESSOR.get(getterFlags)");
                        if (bool2.booleanValue()) {
                            z = true;
                            if (property.hasGetterFlags()) {
                                bool2 = Flags.IS_INLINE_ACCESSOR.get(getterFlags);
                                C2668g.a(bool2, "Flags.IS_INLINE_ACCESSOR.get(getterFlags)");
                                if (bool2.booleanValue()) {
                                    z2 = true;
                                    annotations3 = getAnnotations(messageLite, getterFlags, AnnotatedCallableKind.PROPERTY_GETTER);
                                    if (i2 == 0) {
                                        propertyGetterDescriptorImpl = new PropertyGetterDescriptorImpl(deserializedPropertyDescriptor, annotations3, ProtoEnumFlags.INSTANCE.modality((ProtoBuf.Modality) Flags.MODALITY.get(getterFlags)), ProtoEnumFlags.INSTANCE.visibility((ProtoBuf.Visibility) Flags.VISIBILITY.get(getterFlags)), i2 ^ 1, z, z2, deserializedPropertyDescriptor.getKind(), null, SourceElement.NO_SOURCE);
                                    } else {
                                        propertyGetterDescriptorImpl = DescriptorFactory.createDefaultGetter(deserializedPropertyDescriptor, annotations3);
                                        C2668g.a(propertyGetterDescriptorImpl, "DescriptorFactory.create…er(property, annotations)");
                                    }
                                    propertyGetterDescriptorImpl.initialize(deserializedPropertyDescriptor.getReturnType());
                                }
                            }
                            z2 = false;
                            annotations3 = getAnnotations(messageLite, getterFlags, AnnotatedCallableKind.PROPERTY_GETTER);
                            if (i2 == 0) {
                                propertyGetterDescriptorImpl = DescriptorFactory.createDefaultGetter(deserializedPropertyDescriptor, annotations3);
                                C2668g.a(propertyGetterDescriptorImpl, "DescriptorFactory.create…er(property, annotations)");
                            } else {
                                propertyGetterDescriptorImpl = new PropertyGetterDescriptorImpl(deserializedPropertyDescriptor, annotations3, ProtoEnumFlags.INSTANCE.modality((ProtoBuf.Modality) Flags.MODALITY.get(getterFlags)), ProtoEnumFlags.INSTANCE.visibility((ProtoBuf.Visibility) Flags.VISIBILITY.get(getterFlags)), i2 ^ 1, z, z2, deserializedPropertyDescriptor.getKind(), null, SourceElement.NO_SOURCE);
                            }
                            propertyGetterDescriptorImpl.initialize(deserializedPropertyDescriptor.getReturnType());
                        }
                    }
                    z = false;
                    if (property.hasGetterFlags()) {
                        bool2 = Flags.IS_INLINE_ACCESSOR.get(getterFlags);
                        C2668g.a(bool2, "Flags.IS_INLINE_ACCESSOR.get(getterFlags)");
                        if (bool2.booleanValue()) {
                            z2 = true;
                            annotations3 = getAnnotations(messageLite, getterFlags, AnnotatedCallableKind.PROPERTY_GETTER);
                            if (i2 == 0) {
                                propertyGetterDescriptorImpl = new PropertyGetterDescriptorImpl(deserializedPropertyDescriptor, annotations3, ProtoEnumFlags.INSTANCE.modality((ProtoBuf.Modality) Flags.MODALITY.get(getterFlags)), ProtoEnumFlags.INSTANCE.visibility((ProtoBuf.Visibility) Flags.VISIBILITY.get(getterFlags)), i2 ^ 1, z, z2, deserializedPropertyDescriptor.getKind(), null, SourceElement.NO_SOURCE);
                            } else {
                                propertyGetterDescriptorImpl = DescriptorFactory.createDefaultGetter(deserializedPropertyDescriptor, annotations3);
                                C2668g.a(propertyGetterDescriptorImpl, "DescriptorFactory.create…er(property, annotations)");
                            }
                            propertyGetterDescriptorImpl.initialize(deserializedPropertyDescriptor.getReturnType());
                        }
                    }
                    z2 = false;
                    annotations3 = getAnnotations(messageLite, getterFlags, AnnotatedCallableKind.PROPERTY_GETTER);
                    if (i2 == 0) {
                        propertyGetterDescriptorImpl = DescriptorFactory.createDefaultGetter(deserializedPropertyDescriptor, annotations3);
                        C2668g.a(propertyGetterDescriptorImpl, "DescriptorFactory.create…er(property, annotations)");
                    } else {
                        propertyGetterDescriptorImpl = new PropertyGetterDescriptorImpl(deserializedPropertyDescriptor, annotations3, ProtoEnumFlags.INSTANCE.modality((ProtoBuf.Modality) Flags.MODALITY.get(getterFlags)), ProtoEnumFlags.INSTANCE.visibility((ProtoBuf.Visibility) Flags.VISIBILITY.get(getterFlags)), i2 ^ 1, z, z2, deserializedPropertyDescriptor.getKind(), null, SourceElement.NO_SOURCE);
                    }
                    propertyGetterDescriptorImpl.initialize(deserializedPropertyDescriptor.getReturnType());
                }
            }
            i2 = 0;
            if (property.hasGetterFlags()) {
                bool2 = Flags.IS_EXTERNAL_ACCESSOR.get(getterFlags);
                C2668g.a(bool2, "Flags.IS_EXTERNAL_ACCESSOR.get(getterFlags)");
                if (bool2.booleanValue()) {
                    z = true;
                    if (property.hasGetterFlags()) {
                        bool2 = Flags.IS_INLINE_ACCESSOR.get(getterFlags);
                        C2668g.a(bool2, "Flags.IS_INLINE_ACCESSOR.get(getterFlags)");
                        if (bool2.booleanValue()) {
                            z2 = true;
                            annotations3 = getAnnotations(messageLite, getterFlags, AnnotatedCallableKind.PROPERTY_GETTER);
                            if (i2 == 0) {
                                propertyGetterDescriptorImpl = new PropertyGetterDescriptorImpl(deserializedPropertyDescriptor, annotations3, ProtoEnumFlags.INSTANCE.modality((ProtoBuf.Modality) Flags.MODALITY.get(getterFlags)), ProtoEnumFlags.INSTANCE.visibility((ProtoBuf.Visibility) Flags.VISIBILITY.get(getterFlags)), i2 ^ 1, z, z2, deserializedPropertyDescriptor.getKind(), null, SourceElement.NO_SOURCE);
                            } else {
                                propertyGetterDescriptorImpl = DescriptorFactory.createDefaultGetter(deserializedPropertyDescriptor, annotations3);
                                C2668g.a(propertyGetterDescriptorImpl, "DescriptorFactory.create…er(property, annotations)");
                            }
                            propertyGetterDescriptorImpl.initialize(deserializedPropertyDescriptor.getReturnType());
                        }
                    }
                    z2 = false;
                    annotations3 = getAnnotations(messageLite, getterFlags, AnnotatedCallableKind.PROPERTY_GETTER);
                    if (i2 == 0) {
                        propertyGetterDescriptorImpl = DescriptorFactory.createDefaultGetter(deserializedPropertyDescriptor, annotations3);
                        C2668g.a(propertyGetterDescriptorImpl, "DescriptorFactory.create…er(property, annotations)");
                    } else {
                        propertyGetterDescriptorImpl = new PropertyGetterDescriptorImpl(deserializedPropertyDescriptor, annotations3, ProtoEnumFlags.INSTANCE.modality((ProtoBuf.Modality) Flags.MODALITY.get(getterFlags)), ProtoEnumFlags.INSTANCE.visibility((ProtoBuf.Visibility) Flags.VISIBILITY.get(getterFlags)), i2 ^ 1, z, z2, deserializedPropertyDescriptor.getKind(), null, SourceElement.NO_SOURCE);
                    }
                    propertyGetterDescriptorImpl.initialize(deserializedPropertyDescriptor.getReturnType());
                }
            }
            z = false;
            if (property.hasGetterFlags()) {
                bool2 = Flags.IS_INLINE_ACCESSOR.get(getterFlags);
                C2668g.a(bool2, "Flags.IS_INLINE_ACCESSOR.get(getterFlags)");
                if (bool2.booleanValue()) {
                    z2 = true;
                    annotations3 = getAnnotations(messageLite, getterFlags, AnnotatedCallableKind.PROPERTY_GETTER);
                    if (i2 == 0) {
                        propertyGetterDescriptorImpl = new PropertyGetterDescriptorImpl(deserializedPropertyDescriptor, annotations3, ProtoEnumFlags.INSTANCE.modality((ProtoBuf.Modality) Flags.MODALITY.get(getterFlags)), ProtoEnumFlags.INSTANCE.visibility((ProtoBuf.Visibility) Flags.VISIBILITY.get(getterFlags)), i2 ^ 1, z, z2, deserializedPropertyDescriptor.getKind(), null, SourceElement.NO_SOURCE);
                    } else {
                        propertyGetterDescriptorImpl = DescriptorFactory.createDefaultGetter(deserializedPropertyDescriptor, annotations3);
                        C2668g.a(propertyGetterDescriptorImpl, "DescriptorFactory.create…er(property, annotations)");
                    }
                    propertyGetterDescriptorImpl.initialize(deserializedPropertyDescriptor.getReturnType());
                }
            }
            z2 = false;
            annotations3 = getAnnotations(messageLite, getterFlags, AnnotatedCallableKind.PROPERTY_GETTER);
            if (i2 == 0) {
                propertyGetterDescriptorImpl = DescriptorFactory.createDefaultGetter(deserializedPropertyDescriptor, annotations3);
                C2668g.a(propertyGetterDescriptorImpl, "DescriptorFactory.create…er(property, annotations)");
            } else {
                propertyGetterDescriptorImpl = new PropertyGetterDescriptorImpl(deserializedPropertyDescriptor, annotations3, ProtoEnumFlags.INSTANCE.modality((ProtoBuf.Modality) Flags.MODALITY.get(getterFlags)), ProtoEnumFlags.INSTANCE.visibility((ProtoBuf.Visibility) Flags.VISIBILITY.get(getterFlags)), i2 ^ 1, z, z2, deserializedPropertyDescriptor.getKind(), null, SourceElement.NO_SOURCE);
            }
            propertyGetterDescriptorImpl.initialize(deserializedPropertyDescriptor.getReturnType());
        } else {
            propertyGetterDescriptorImpl = null;
        }
        bool = Flags.HAS_SETTER.get(i);
        C2668g.a(bool, "Flags.HAS_SETTER.get(flags)");
        if (bool.booleanValue()) {
            Annotations annotations4;
            PropertySetterDescriptorImpl propertySetterDescriptorImpl;
            PropertySetterDescriptorImpl createDefaultSetter;
            int i4;
            i2 = property.getSetterFlags();
            if (property.hasSetterFlags()) {
                Boolean bool5 = Flags.IS_NOT_DEFAULT.get(i2);
                C2668g.a(bool5, "Flags.IS_NOT_DEFAULT.get(setterFlags)");
                if (bool5.booleanValue()) {
                    flags = 1;
                    if (property.hasSetterFlags()) {
                        bool2 = Flags.IS_EXTERNAL_ACCESSOR.get(i2);
                        C2668g.a(bool2, "Flags.IS_EXTERNAL_ACCESSOR.get(setterFlags)");
                        if (bool2.booleanValue()) {
                            z = true;
                            if (property.hasGetterFlags()) {
                                bool2 = Flags.IS_INLINE_ACCESSOR.get(i2);
                                C2668g.a(bool2, "Flags.IS_INLINE_ACCESSOR.get(setterFlags)");
                                if (bool2.booleanValue()) {
                                    z2 = true;
                                    annotations4 = getAnnotations(messageLite, i2, AnnotatedCallableKind.PROPERTY_SETTER);
                                    if (flags == 0) {
                                        propertySetterDescriptorImpl = new PropertySetterDescriptorImpl(deserializedPropertyDescriptor, annotations4, ProtoEnumFlags.INSTANCE.modality((ProtoBuf.Modality) Flags.MODALITY.get(i2)), ProtoEnumFlags.INSTANCE.visibility((ProtoBuf.Visibility) Flags.VISIBILITY.get(i2)), flags ^ 1, z, z2, deserializedPropertyDescriptor.getKind(), null, SourceElement.NO_SOURCE);
                                        property3 = property2;
                                        flags = i;
                                        propertySetterDescriptorImpl.initialize((ValueParameterDescriptor) C19299w.m68836j(DeserializationContext.childContext$default(childContext$default, propertySetterDescriptorImpl, C17554o.m64195a(), null, null, 12, null).getMemberDeserializer().valueParameters(C15807n.m59826a(property.getSetterValueParameter()), messageLite, AnnotatedCallableKind.PROPERTY_SETTER)));
                                        i3 = flags;
                                        annotations2 = propertySetterDescriptorImpl;
                                    } else {
                                        property3 = property2;
                                        flags = i;
                                        createDefaultSetter = DescriptorFactory.createDefaultSetter(deserializedPropertyDescriptor, annotations4);
                                        C2668g.a(createDefaultSetter, "DescriptorFactory.create…er(property, annotations)");
                                        i4 = flags;
                                        annotations2 = createDefaultSetter;
                                        i3 = i4;
                                    }
                                }
                            }
                            z2 = false;
                            annotations4 = getAnnotations(messageLite, i2, AnnotatedCallableKind.PROPERTY_SETTER);
                            if (flags == 0) {
                                property3 = property2;
                                flags = i;
                                createDefaultSetter = DescriptorFactory.createDefaultSetter(deserializedPropertyDescriptor, annotations4);
                                C2668g.a(createDefaultSetter, "DescriptorFactory.create…er(property, annotations)");
                                i4 = flags;
                                annotations2 = createDefaultSetter;
                                i3 = i4;
                            } else {
                                propertySetterDescriptorImpl = new PropertySetterDescriptorImpl(deserializedPropertyDescriptor, annotations4, ProtoEnumFlags.INSTANCE.modality((ProtoBuf.Modality) Flags.MODALITY.get(i2)), ProtoEnumFlags.INSTANCE.visibility((ProtoBuf.Visibility) Flags.VISIBILITY.get(i2)), flags ^ 1, z, z2, deserializedPropertyDescriptor.getKind(), null, SourceElement.NO_SOURCE);
                                property3 = property2;
                                flags = i;
                                propertySetterDescriptorImpl.initialize((ValueParameterDescriptor) C19299w.m68836j(DeserializationContext.childContext$default(childContext$default, propertySetterDescriptorImpl, C17554o.m64195a(), null, null, 12, null).getMemberDeserializer().valueParameters(C15807n.m59826a(property.getSetterValueParameter()), messageLite, AnnotatedCallableKind.PROPERTY_SETTER)));
                                i3 = flags;
                                annotations2 = propertySetterDescriptorImpl;
                            }
                        }
                    }
                    z = false;
                    if (property.hasGetterFlags()) {
                        bool2 = Flags.IS_INLINE_ACCESSOR.get(i2);
                        C2668g.a(bool2, "Flags.IS_INLINE_ACCESSOR.get(setterFlags)");
                        if (bool2.booleanValue()) {
                            z2 = true;
                            annotations4 = getAnnotations(messageLite, i2, AnnotatedCallableKind.PROPERTY_SETTER);
                            if (flags == 0) {
                                propertySetterDescriptorImpl = new PropertySetterDescriptorImpl(deserializedPropertyDescriptor, annotations4, ProtoEnumFlags.INSTANCE.modality((ProtoBuf.Modality) Flags.MODALITY.get(i2)), ProtoEnumFlags.INSTANCE.visibility((ProtoBuf.Visibility) Flags.VISIBILITY.get(i2)), flags ^ 1, z, z2, deserializedPropertyDescriptor.getKind(), null, SourceElement.NO_SOURCE);
                                property3 = property2;
                                flags = i;
                                propertySetterDescriptorImpl.initialize((ValueParameterDescriptor) C19299w.m68836j(DeserializationContext.childContext$default(childContext$default, propertySetterDescriptorImpl, C17554o.m64195a(), null, null, 12, null).getMemberDeserializer().valueParameters(C15807n.m59826a(property.getSetterValueParameter()), messageLite, AnnotatedCallableKind.PROPERTY_SETTER)));
                                i3 = flags;
                                annotations2 = propertySetterDescriptorImpl;
                            } else {
                                property3 = property2;
                                flags = i;
                                createDefaultSetter = DescriptorFactory.createDefaultSetter(deserializedPropertyDescriptor, annotations4);
                                C2668g.a(createDefaultSetter, "DescriptorFactory.create…er(property, annotations)");
                                i4 = flags;
                                annotations2 = createDefaultSetter;
                                i3 = i4;
                            }
                        }
                    }
                    z2 = false;
                    annotations4 = getAnnotations(messageLite, i2, AnnotatedCallableKind.PROPERTY_SETTER);
                    if (flags == 0) {
                        property3 = property2;
                        flags = i;
                        createDefaultSetter = DescriptorFactory.createDefaultSetter(deserializedPropertyDescriptor, annotations4);
                        C2668g.a(createDefaultSetter, "DescriptorFactory.create…er(property, annotations)");
                        i4 = flags;
                        annotations2 = createDefaultSetter;
                        i3 = i4;
                    } else {
                        propertySetterDescriptorImpl = new PropertySetterDescriptorImpl(deserializedPropertyDescriptor, annotations4, ProtoEnumFlags.INSTANCE.modality((ProtoBuf.Modality) Flags.MODALITY.get(i2)), ProtoEnumFlags.INSTANCE.visibility((ProtoBuf.Visibility) Flags.VISIBILITY.get(i2)), flags ^ 1, z, z2, deserializedPropertyDescriptor.getKind(), null, SourceElement.NO_SOURCE);
                        property3 = property2;
                        flags = i;
                        propertySetterDescriptorImpl.initialize((ValueParameterDescriptor) C19299w.m68836j(DeserializationContext.childContext$default(childContext$default, propertySetterDescriptorImpl, C17554o.m64195a(), null, null, 12, null).getMemberDeserializer().valueParameters(C15807n.m59826a(property.getSetterValueParameter()), messageLite, AnnotatedCallableKind.PROPERTY_SETTER)));
                        i3 = flags;
                        annotations2 = propertySetterDescriptorImpl;
                    }
                }
            }
            flags = 0;
            if (property.hasSetterFlags()) {
                bool2 = Flags.IS_EXTERNAL_ACCESSOR.get(i2);
                C2668g.a(bool2, "Flags.IS_EXTERNAL_ACCESSOR.get(setterFlags)");
                if (bool2.booleanValue()) {
                    z = true;
                    if (property.hasGetterFlags()) {
                        bool2 = Flags.IS_INLINE_ACCESSOR.get(i2);
                        C2668g.a(bool2, "Flags.IS_INLINE_ACCESSOR.get(setterFlags)");
                        if (bool2.booleanValue()) {
                            z2 = true;
                            annotations4 = getAnnotations(messageLite, i2, AnnotatedCallableKind.PROPERTY_SETTER);
                            if (flags == 0) {
                                propertySetterDescriptorImpl = new PropertySetterDescriptorImpl(deserializedPropertyDescriptor, annotations4, ProtoEnumFlags.INSTANCE.modality((ProtoBuf.Modality) Flags.MODALITY.get(i2)), ProtoEnumFlags.INSTANCE.visibility((ProtoBuf.Visibility) Flags.VISIBILITY.get(i2)), flags ^ 1, z, z2, deserializedPropertyDescriptor.getKind(), null, SourceElement.NO_SOURCE);
                                property3 = property2;
                                flags = i;
                                propertySetterDescriptorImpl.initialize((ValueParameterDescriptor) C19299w.m68836j(DeserializationContext.childContext$default(childContext$default, propertySetterDescriptorImpl, C17554o.m64195a(), null, null, 12, null).getMemberDeserializer().valueParameters(C15807n.m59826a(property.getSetterValueParameter()), messageLite, AnnotatedCallableKind.PROPERTY_SETTER)));
                                i3 = flags;
                                annotations2 = propertySetterDescriptorImpl;
                            } else {
                                property3 = property2;
                                flags = i;
                                createDefaultSetter = DescriptorFactory.createDefaultSetter(deserializedPropertyDescriptor, annotations4);
                                C2668g.a(createDefaultSetter, "DescriptorFactory.create…er(property, annotations)");
                                i4 = flags;
                                annotations2 = createDefaultSetter;
                                i3 = i4;
                            }
                        }
                    }
                    z2 = false;
                    annotations4 = getAnnotations(messageLite, i2, AnnotatedCallableKind.PROPERTY_SETTER);
                    if (flags == 0) {
                        property3 = property2;
                        flags = i;
                        createDefaultSetter = DescriptorFactory.createDefaultSetter(deserializedPropertyDescriptor, annotations4);
                        C2668g.a(createDefaultSetter, "DescriptorFactory.create…er(property, annotations)");
                        i4 = flags;
                        annotations2 = createDefaultSetter;
                        i3 = i4;
                    } else {
                        propertySetterDescriptorImpl = new PropertySetterDescriptorImpl(deserializedPropertyDescriptor, annotations4, ProtoEnumFlags.INSTANCE.modality((ProtoBuf.Modality) Flags.MODALITY.get(i2)), ProtoEnumFlags.INSTANCE.visibility((ProtoBuf.Visibility) Flags.VISIBILITY.get(i2)), flags ^ 1, z, z2, deserializedPropertyDescriptor.getKind(), null, SourceElement.NO_SOURCE);
                        property3 = property2;
                        flags = i;
                        propertySetterDescriptorImpl.initialize((ValueParameterDescriptor) C19299w.m68836j(DeserializationContext.childContext$default(childContext$default, propertySetterDescriptorImpl, C17554o.m64195a(), null, null, 12, null).getMemberDeserializer().valueParameters(C15807n.m59826a(property.getSetterValueParameter()), messageLite, AnnotatedCallableKind.PROPERTY_SETTER)));
                        i3 = flags;
                        annotations2 = propertySetterDescriptorImpl;
                    }
                }
            }
            z = false;
            if (property.hasGetterFlags()) {
                bool2 = Flags.IS_INLINE_ACCESSOR.get(i2);
                C2668g.a(bool2, "Flags.IS_INLINE_ACCESSOR.get(setterFlags)");
                if (bool2.booleanValue()) {
                    z2 = true;
                    annotations4 = getAnnotations(messageLite, i2, AnnotatedCallableKind.PROPERTY_SETTER);
                    if (flags == 0) {
                        propertySetterDescriptorImpl = new PropertySetterDescriptorImpl(deserializedPropertyDescriptor, annotations4, ProtoEnumFlags.INSTANCE.modality((ProtoBuf.Modality) Flags.MODALITY.get(i2)), ProtoEnumFlags.INSTANCE.visibility((ProtoBuf.Visibility) Flags.VISIBILITY.get(i2)), flags ^ 1, z, z2, deserializedPropertyDescriptor.getKind(), null, SourceElement.NO_SOURCE);
                        property3 = property2;
                        flags = i;
                        propertySetterDescriptorImpl.initialize((ValueParameterDescriptor) C19299w.m68836j(DeserializationContext.childContext$default(childContext$default, propertySetterDescriptorImpl, C17554o.m64195a(), null, null, 12, null).getMemberDeserializer().valueParameters(C15807n.m59826a(property.getSetterValueParameter()), messageLite, AnnotatedCallableKind.PROPERTY_SETTER)));
                        i3 = flags;
                        annotations2 = propertySetterDescriptorImpl;
                    } else {
                        property3 = property2;
                        flags = i;
                        createDefaultSetter = DescriptorFactory.createDefaultSetter(deserializedPropertyDescriptor, annotations4);
                        C2668g.a(createDefaultSetter, "DescriptorFactory.create…er(property, annotations)");
                        i4 = flags;
                        annotations2 = createDefaultSetter;
                        i3 = i4;
                    }
                }
            }
            z2 = false;
            annotations4 = getAnnotations(messageLite, i2, AnnotatedCallableKind.PROPERTY_SETTER);
            if (flags == 0) {
                property3 = property2;
                flags = i;
                createDefaultSetter = DescriptorFactory.createDefaultSetter(deserializedPropertyDescriptor, annotations4);
                C2668g.a(createDefaultSetter, "DescriptorFactory.create…er(property, annotations)");
                i4 = flags;
                annotations2 = createDefaultSetter;
                i3 = i4;
            } else {
                propertySetterDescriptorImpl = new PropertySetterDescriptorImpl(deserializedPropertyDescriptor, annotations4, ProtoEnumFlags.INSTANCE.modality((ProtoBuf.Modality) Flags.MODALITY.get(i2)), ProtoEnumFlags.INSTANCE.visibility((ProtoBuf.Visibility) Flags.VISIBILITY.get(i2)), flags ^ 1, z, z2, deserializedPropertyDescriptor.getKind(), null, SourceElement.NO_SOURCE);
                property3 = property2;
                flags = i;
                propertySetterDescriptorImpl.initialize((ValueParameterDescriptor) C19299w.m68836j(DeserializationContext.childContext$default(childContext$default, propertySetterDescriptorImpl, C17554o.m64195a(), null, null, 12, null).getMemberDeserializer().valueParameters(C15807n.m59826a(property.getSetterValueParameter()), messageLite, AnnotatedCallableKind.PROPERTY_SETTER)));
                i3 = flags;
                annotations2 = propertySetterDescriptorImpl;
            }
        } else {
            property3 = property2;
            i3 = i;
        }
        Boolean bool6 = Flags.HAS_CONSTANT.get(i3);
        C2668g.a(bool6, "Flags.HAS_CONSTANT.get(flags)");
        if (bool6.booleanValue()) {
            deserializedPropertyDescriptor.setCompileTimeInitializer(memberDeserializer.f49042c.getStorageManager().createNullableLazyValue(new MemberDeserializer$loadProperty$2(memberDeserializer, property3, deserializedPropertyDescriptor)));
        }
        deserializedPropertyDescriptor.initialize(propertyGetterDescriptorImpl, (PropertySetterDescriptor) annotations2);
        return deserializedPropertyDescriptor;
    }

    @NotNull
    public final SimpleFunctionDescriptor loadFunction(@NotNull Function function) {
        Annotations receiverParameterAnnotations$default;
        MemberDeserializer memberDeserializer = this;
        Function function2 = function;
        C2668g.b(function2, "proto");
        int flags = function.hasFlags() ? function.getFlags() : loadOldFlags(function.getOldFlags());
        MessageLite messageLite = function2;
        Annotations annotations = getAnnotations(messageLite, flags, AnnotatedCallableKind.FUNCTION);
        if (ProtoTypeTableUtilKt.hasReceiver(function)) {
            receiverParameterAnnotations$default = getReceiverParameterAnnotations$default(memberDeserializer, messageLite, AnnotatedCallableKind.FUNCTION, null, 4, null);
        } else {
            receiverParameterAnnotations$default = Annotations.Companion.getEMPTY();
        }
        MessageLite messageLite2 = messageLite;
        int i = flags;
        Function function3 = function2;
        DeserializedSimpleFunctionDescriptor deserializedSimpleFunctionDescriptor = new DeserializedSimpleFunctionDescriptor(memberDeserializer.f49042c.getContainingDeclaration(), null, annotations, NameResolverUtilKt.getName(memberDeserializer.f49042c.getNameResolver(), function.getName()), ProtoEnumFlags.INSTANCE.memberKind((MemberKind) Flags.MEMBER_KIND.get(flags)), function2, memberDeserializer.f49042c.getNameResolver(), memberDeserializer.f49042c.getTypeTable(), memberDeserializer.f49042c.getVersionRequirementTable(), memberDeserializer.f49042c.getContainerSource(), null, 1024, null);
        DeserializationContext deserializationContext = memberDeserializer.f49042c;
        DeclarationDescriptor declarationDescriptor = deserializedSimpleFunctionDescriptor;
        List typeParameterList = function.getTypeParameterList();
        C2668g.a(typeParameterList, "proto.typeParameterList");
        deserializationContext = DeserializationContext.childContext$default(deserializationContext, declarationDescriptor, typeParameterList, null, null, 12, null);
        Type receiverType = ProtoTypeTableUtilKt.receiverType(function3, memberDeserializer.f49042c.getTypeTable());
        KotlinType type = receiverType != null ? deserializationContext.getTypeDeserializer().type(receiverType, receiverParameterAnnotations$default) : null;
        ReceiverParameterDescriptor dispatchReceiverParameter = getDispatchReceiverParameter();
        List ownTypeParameters = deserializationContext.getTypeDeserializer().getOwnTypeParameters();
        MemberDeserializer memberDeserializer2 = deserializationContext.getMemberDeserializer();
        typeParameterList = function.getValueParameterList();
        C2668g.a(typeParameterList, "proto.valueParameterList");
        deserializedSimpleFunctionDescriptor.initialize(type, dispatchReceiverParameter, ownTypeParameters, memberDeserializer2.valueParameters(typeParameterList, messageLite2, AnnotatedCallableKind.FUNCTION), TypeDeserializer.type$default(deserializationContext.getTypeDeserializer(), ProtoTypeTableUtilKt.returnType(function3, memberDeserializer.f49042c.getTypeTable()), null, 2, null), ProtoEnumFlags.INSTANCE.modality((ProtoBuf.Modality) Flags.MODALITY.get(i)), ProtoEnumFlags.INSTANCE.visibility((ProtoBuf.Visibility) Flags.VISIBILITY.get(i)), ah.m66884a());
        Boolean bool = Flags.IS_OPERATOR.get(i);
        C2668g.a(bool, "Flags.IS_OPERATOR.get(flags)");
        deserializedSimpleFunctionDescriptor.setOperator(bool.booleanValue());
        bool = Flags.IS_INFIX.get(i);
        C2668g.a(bool, "Flags.IS_INFIX.get(flags)");
        deserializedSimpleFunctionDescriptor.setInfix(bool.booleanValue());
        bool = Flags.IS_EXTERNAL_FUNCTION.get(i);
        C2668g.a(bool, "Flags.IS_EXTERNAL_FUNCTION.get(flags)");
        deserializedSimpleFunctionDescriptor.setExternal(bool.booleanValue());
        bool = Flags.IS_INLINE.get(i);
        C2668g.a(bool, "Flags.IS_INLINE.get(flags)");
        deserializedSimpleFunctionDescriptor.setInline(bool.booleanValue());
        bool = Flags.IS_TAILREC.get(i);
        C2668g.a(bool, "Flags.IS_TAILREC.get(flags)");
        deserializedSimpleFunctionDescriptor.setTailrec(bool.booleanValue());
        bool = Flags.IS_SUSPEND.get(i);
        C2668g.a(bool, "Flags.IS_SUSPEND.get(flags)");
        deserializedSimpleFunctionDescriptor.setSuspend(bool.booleanValue());
        bool = Flags.IS_EXPECT_FUNCTION.get(i);
        C2668g.a(bool, "Flags.IS_EXPECT_FUNCTION.get(flags)");
        deserializedSimpleFunctionDescriptor.setExpect(bool.booleanValue());
        Pair deserializeContractFromFunction = memberDeserializer.f49042c.getComponents().getContractDeserializer().deserializeContractFromFunction(function3, deserializedSimpleFunctionDescriptor, memberDeserializer.f49042c.getTypeTable(), memberDeserializer.f49042c.getTypeDeserializer());
        if (deserializeContractFromFunction != null) {
            deserializedSimpleFunctionDescriptor.putInUserDataMap((UserDataKey) deserializeContractFromFunction.m59803a(), deserializeContractFromFunction.m59804b());
        }
        return deserializedSimpleFunctionDescriptor;
    }

    @NotNull
    public final TypeAliasDescriptor loadTypeAlias(@NotNull TypeAlias typeAlias) {
        MemberDeserializer memberDeserializer = this;
        TypeAlias typeAlias2 = typeAlias;
        C2668g.b(typeAlias2, "proto");
        List annotationList = typeAlias.getAnnotationList();
        C2668g.a(annotationList, "proto.annotationList");
        Iterable<Annotation> iterable = annotationList;
        Collection arrayList = new ArrayList(C18457p.m66906a((Iterable) iterable, 10));
        for (Annotation annotation : iterable) {
            AnnotationDeserializer annotationDeserializer = memberDeserializer.annotationDeserializer;
            C2668g.a(annotation, "it");
            arrayList.add(annotationDeserializer.deserializeAnnotation(annotation, memberDeserializer.f49042c.getNameResolver()));
        }
        AnnotationsImpl annotationsImpl = new AnnotationsImpl((List) arrayList);
        Visibility visibility = ProtoEnumFlags.INSTANCE.visibility((ProtoBuf.Visibility) Flags.VISIBILITY.get(typeAlias.getFlags()));
        StorageManager storageManager = memberDeserializer.f49042c.getStorageManager();
        DeclarationDescriptor containingDeclaration = memberDeserializer.f49042c.getContainingDeclaration();
        Annotations annotations = annotationsImpl;
        Name name = NameResolverUtilKt.getName(memberDeserializer.f49042c.getNameResolver(), typeAlias.getName());
        C2668g.a(visibility, "visibility");
        DeserializedTypeAliasDescriptor deserializedTypeAliasDescriptor = new DeserializedTypeAliasDescriptor(storageManager, containingDeclaration, annotations, name, visibility, typeAlias2, memberDeserializer.f49042c.getNameResolver(), memberDeserializer.f49042c.getTypeTable(), memberDeserializer.f49042c.getVersionRequirementTable(), memberDeserializer.f49042c.getContainerSource());
        DeserializationContext deserializationContext = memberDeserializer.f49042c;
        DeclarationDescriptor declarationDescriptor = deserializedTypeAliasDescriptor;
        annotationList = typeAlias.getTypeParameterList();
        C2668g.a(annotationList, "proto.typeParameterList");
        DeserializationContext childContext$default = DeserializationContext.childContext$default(deserializationContext, declarationDescriptor, annotationList, null, null, 12, null);
        deserializedTypeAliasDescriptor.initialize(childContext$default.getTypeDeserializer().getOwnTypeParameters(), TypeDeserializer.simpleType$default(childContext$default.getTypeDeserializer(), ProtoTypeTableUtilKt.underlyingType(typeAlias2, memberDeserializer.f49042c.getTypeTable()), null, 2, null), TypeDeserializer.simpleType$default(childContext$default.getTypeDeserializer(), ProtoTypeTableUtilKt.expandedType(typeAlias2, memberDeserializer.f49042c.getTypeTable()), null, 2, null));
        return deserializedTypeAliasDescriptor;
    }

    private final ReceiverParameterDescriptor getDispatchReceiverParameter() {
        DeclarationDescriptor containingDeclaration = this.f49042c.getContainingDeclaration();
        if (!(containingDeclaration instanceof ClassDescriptor)) {
            containingDeclaration = null;
        }
        ClassDescriptor classDescriptor = (ClassDescriptor) containingDeclaration;
        return classDescriptor != null ? classDescriptor.getThisAsReceiverParameter() : null;
    }

    @NotNull
    public final ClassConstructorDescriptor loadConstructor(@NotNull Constructor constructor, boolean z) {
        Constructor constructor2 = constructor;
        C2668g.b(constructor2, "proto");
        DeclarationDescriptor containingDeclaration = this.f49042c.getContainingDeclaration();
        if (containingDeclaration == null) {
            throw new TypeCastException("null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
        }
        ClassDescriptor classDescriptor = (ClassDescriptor) containingDeclaration;
        MessageLite messageLite = constructor2;
        MessageLite messageLite2 = messageLite;
        DeserializedClassConstructorDescriptor deserializedClassConstructorDescriptor = r1;
        ClassDescriptor classDescriptor2 = classDescriptor;
        DeserializedClassConstructorDescriptor deserializedClassConstructorDescriptor2 = new DeserializedClassConstructorDescriptor(classDescriptor, null, getAnnotations(messageLite, constructor.getFlags(), AnnotatedCallableKind.FUNCTION), z, Kind.DECLARATION, constructor2, r0.f49042c.getNameResolver(), r0.f49042c.getTypeTable(), r0.f49042c.getVersionRequirementTable(), r0.f49042c.getContainerSource(), null, 1024, null);
        DeserializedClassConstructorDescriptor deserializedClassConstructorDescriptor3 = deserializedClassConstructorDescriptor;
        MemberDeserializer memberDeserializer = DeserializationContext.childContext$default(r0.f49042c, deserializedClassConstructorDescriptor3, C17554o.m64195a(), null, null, 12, null).getMemberDeserializer();
        List valueParameterList = constructor.getValueParameterList();
        C2668g.a(valueParameterList, "proto.valueParameterList");
        deserializedClassConstructorDescriptor3.initialize(memberDeserializer.valueParameters(valueParameterList, messageLite2, AnnotatedCallableKind.FUNCTION), ProtoEnumFlags.INSTANCE.visibility((ProtoBuf.Visibility) Flags.VISIBILITY.get(constructor.getFlags())));
        deserializedClassConstructorDescriptor3.setReturnType(classDescriptor2.getDefaultType());
        return deserializedClassConstructorDescriptor3;
    }

    private final Annotations getAnnotations(MessageLite messageLite, int i, AnnotatedCallableKind annotatedCallableKind) {
        if (Flags.HAS_ANNOTATIONS.get(i).booleanValue() == 0) {
            return Annotations.Companion.getEMPTY();
        }
        return (Annotations) new NonEmptyDeserializedAnnotationsWithPossibleTargets(this.f49042c.getStorageManager(), new MemberDeserializer$getAnnotations$1(this, messageLite, annotatedCallableKind));
    }

    static /* synthetic */ Annotations getReceiverParameterAnnotations$default(MemberDeserializer memberDeserializer, MessageLite messageLite, AnnotatedCallableKind annotatedCallableKind, AnnotatedCallableKind annotatedCallableKind2, int i, Object obj) {
        if ((i & 4) != 0) {
            annotatedCallableKind2 = annotatedCallableKind;
        }
        return memberDeserializer.getReceiverParameterAnnotations(messageLite, annotatedCallableKind, annotatedCallableKind2);
    }

    private final Annotations getReceiverParameterAnnotations(MessageLite messageLite, AnnotatedCallableKind annotatedCallableKind, AnnotatedCallableKind annotatedCallableKind2) {
        return (Annotations) new DeserializedAnnotationsWithPossibleTargets(this.f49042c.getStorageManager(), new MemberDeserializer$getReceiverParameterAnnotations$1(this, messageLite, annotatedCallableKind2));
    }

    private final List<ValueParameterDescriptor> valueParameters(List<ValueParameter> list, MessageLite messageLite, AnnotatedCallableKind annotatedCallableKind) {
        DeclarationDescriptor containingDeclaration = this.f49042c.getContainingDeclaration();
        if (containingDeclaration == null) {
            throw new TypeCastException("null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.CallableDescriptor");
        }
        CallableDescriptor callableDescriptor = (CallableDescriptor) containingDeclaration;
        containingDeclaration = callableDescriptor.getContainingDeclaration();
        C2668g.a(containingDeclaration, "callableDescriptor.containingDeclaration");
        ProtoContainer asProtoContainer = asProtoContainer(containingDeclaration);
        Iterable iterable = list;
        Collection arrayList = new ArrayList(C18457p.m66906a(iterable, 10));
        Iterator it = iterable.iterator();
        int i = 0;
        while (it.hasNext()) {
            Iterator it2;
            Annotations nonEmptyDeserializedAnnotations;
            Name name;
            KotlinType type$default;
            Boolean bool;
            boolean booleanValue;
            boolean booleanValue2;
            boolean booleanValue3;
            Type varargElementType;
            KotlinType type$default2;
            SourceElement sourceElement;
            Iterator it3;
            Collection collection;
            Name name2;
            CallableDescriptor callableDescriptor2;
            int i2 = i + 1;
            ValueParameter valueParameter = (ValueParameter) it.next();
            int flags = valueParameter.hasFlags() ? valueParameter.getFlags() : 0;
            if (asProtoContainer != null) {
                Boolean bool2 = Flags.HAS_ANNOTATIONS.get(flags);
                C2668g.a(bool2, "Flags.HAS_ANNOTATIONS.get(flags)");
                if (bool2.booleanValue()) {
                    it2 = it;
                    nonEmptyDeserializedAnnotations = new NonEmptyDeserializedAnnotations(r8.f49042c.getStorageManager(), new MemberDeserializer$valueParameters$$inlined$mapIndexed$lambda$1(i, valueParameter, r8, asProtoContainer, messageLite, annotatedCallableKind, callableDescriptor));
                    name = NameResolverUtilKt.getName(r8.f49042c.getNameResolver(), valueParameter.getName());
                    type$default = TypeDeserializer.type$default(r8.f49042c.getTypeDeserializer(), ProtoTypeTableUtilKt.type(valueParameter, r8.f49042c.getTypeTable()), null, 2, null);
                    bool = Flags.DECLARES_DEFAULT_VALUE.get(flags);
                    C2668g.a(bool, "Flags.DECLARES_DEFAULT_VALUE.get(flags)");
                    booleanValue = bool.booleanValue();
                    bool = Flags.IS_CROSSINLINE.get(flags);
                    C2668g.a(bool, "Flags.IS_CROSSINLINE.get(flags)");
                    booleanValue2 = bool.booleanValue();
                    bool = Flags.IS_NOINLINE.get(flags);
                    C2668g.a(bool, "Flags.IS_NOINLINE.get(flags)");
                    booleanValue3 = bool.booleanValue();
                    varargElementType = ProtoTypeTableUtilKt.varargElementType(valueParameter, r8.f49042c.getTypeTable());
                    type$default2 = varargElementType == null ? TypeDeserializer.type$default(r8.f49042c.getTypeDeserializer(), varargElementType, null, 2, null) : null;
                    sourceElement = SourceElement.NO_SOURCE;
                    C2668g.a(sourceElement, "SourceElement.NO_SOURCE");
                    it3 = it2;
                    collection = arrayList;
                    name2 = name;
                    callableDescriptor2 = callableDescriptor;
                    collection.add(new ValueParameterDescriptorImpl(callableDescriptor, null, i, nonEmptyDeserializedAnnotations, name2, type$default, booleanValue, booleanValue2, booleanValue3, type$default2, sourceElement));
                    callableDescriptor = callableDescriptor2;
                    it = it3;
                    arrayList = collection;
                    i = i2;
                }
            }
            it2 = it;
            nonEmptyDeserializedAnnotations = Annotations.Companion.getEMPTY();
            name = NameResolverUtilKt.getName(r8.f49042c.getNameResolver(), valueParameter.getName());
            type$default = TypeDeserializer.type$default(r8.f49042c.getTypeDeserializer(), ProtoTypeTableUtilKt.type(valueParameter, r8.f49042c.getTypeTable()), null, 2, null);
            bool = Flags.DECLARES_DEFAULT_VALUE.get(flags);
            C2668g.a(bool, "Flags.DECLARES_DEFAULT_VALUE.get(flags)");
            booleanValue = bool.booleanValue();
            bool = Flags.IS_CROSSINLINE.get(flags);
            C2668g.a(bool, "Flags.IS_CROSSINLINE.get(flags)");
            booleanValue2 = bool.booleanValue();
            bool = Flags.IS_NOINLINE.get(flags);
            C2668g.a(bool, "Flags.IS_NOINLINE.get(flags)");
            booleanValue3 = bool.booleanValue();
            varargElementType = ProtoTypeTableUtilKt.varargElementType(valueParameter, r8.f49042c.getTypeTable());
            if (varargElementType == null) {
            }
            sourceElement = SourceElement.NO_SOURCE;
            C2668g.a(sourceElement, "SourceElement.NO_SOURCE");
            it3 = it2;
            collection = arrayList;
            name2 = name;
            callableDescriptor2 = callableDescriptor;
            collection.add(new ValueParameterDescriptorImpl(callableDescriptor, null, i, nonEmptyDeserializedAnnotations, name2, type$default, booleanValue, booleanValue2, booleanValue3, type$default2, sourceElement));
            callableDescriptor = callableDescriptor2;
            it = it3;
            arrayList = collection;
            i = i2;
        }
        return C19299w.m68840l((List) arrayList);
    }

    private final ProtoContainer asProtoContainer(@NotNull DeclarationDescriptor declarationDescriptor) {
        if (declarationDescriptor instanceof PackageFragmentDescriptor) {
            return new Package(((PackageFragmentDescriptor) declarationDescriptor).getFqName(), this.f49042c.getNameResolver(), this.f49042c.getTypeTable(), this.f49042c.getContainerSource());
        }
        return declarationDescriptor instanceof DeserializedClassDescriptor ? ((DeserializedClassDescriptor) declarationDescriptor).getThisAsProtoContainer$deserialization() : null;
    }
}
