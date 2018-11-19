package kotlin.reflect.jvm.internal.impl.renderer;

import com.tinder.api.ManagerWebServices;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import kotlin.C15810e;
import kotlin.C15813i;
import kotlin.C15819j;
import kotlin.Lazy;
import kotlin.NoWhenBranchMatchedException;
import kotlin.TypeCastException;
import kotlin.collections.C15807n;
import kotlin.collections.C17554o;
import kotlin.collections.C18457p;
import kotlin.collections.C19299w;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C15825i;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.builtins.FunctionTypesKt;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptorWithTypeParameters;
import kotlin.reflect.jvm.internal.impl.descriptors.ConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithSource;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses.MockClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageViewDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PossiblyInnerType;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyAccessorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyGetterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertySetterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterUtilsKt;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.VariableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Visibilities;
import kotlin.reflect.jvm.internal.impl.descriptors.Visibility;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotated;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationUseSiteTarget;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationWithTarget;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.name.SpecialNames;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer.ValueParametersHandler;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils;
import kotlin.reflect.jvm.internal.impl.resolve.constants.AnnotationValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ArrayValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.KClassValue;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.AbbreviatedType;
import kotlin.reflect.jvm.internal.impl.types.ErrorUtils;
import kotlin.reflect.jvm.internal.impl.types.ErrorUtils.UninferredParameterTypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.FlexibleType;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeKt;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.SpecialTypesKt;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import kotlin.reflect.jvm.internal.impl.types.TypeUtils;
import kotlin.reflect.jvm.internal.impl.types.UnwrappedType;
import kotlin.reflect.jvm.internal.impl.types.WrappedType;
import kotlin.text.C19296q;
import kotlin.text.C19298r;
import kotlin.text.C19302t;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class DescriptorRendererImpl extends DescriptorRenderer implements DescriptorRendererOptions {
    static final /* synthetic */ KProperty[] $$delegatedProperties = new KProperty[]{C15825i.m59867a(new PropertyReference1Impl(C15825i.m59860a(DescriptorRendererImpl.class), "functionTypeAnnotationsRenderer", "getFunctionTypeAnnotationsRenderer()Lorg/jetbrains/kotlin/renderer/DescriptorRendererImpl;")), C15825i.m59867a(new PropertyReference1Impl(C15825i.m59860a(DescriptorRendererImpl.class), "functionTypeParameterTypesRenderer", "getFunctionTypeParameterTypesRenderer()Lorg/jetbrains/kotlin/renderer/DescriptorRenderer;"))};
    private final Lazy functionTypeAnnotationsRenderer$delegate;
    private final Lazy functionTypeParameterTypesRenderer$delegate;
    @NotNull
    private final DescriptorRendererOptionsImpl options;

    private final class RenderDeclarationDescriptorVisitor implements DeclarationDescriptorVisitor<C15813i, StringBuilder> {
        public void visitValueParameterDescriptor(@NotNull ValueParameterDescriptor valueParameterDescriptor, @NotNull StringBuilder stringBuilder) {
            C2668g.b(valueParameterDescriptor, "descriptor");
            C2668g.b(stringBuilder, "builder");
            DescriptorRendererImpl.this.renderValueParameter(valueParameterDescriptor, true, stringBuilder, true);
        }

        public void visitPropertyDescriptor(@NotNull PropertyDescriptor propertyDescriptor, @NotNull StringBuilder stringBuilder) {
            C2668g.b(propertyDescriptor, "descriptor");
            C2668g.b(stringBuilder, "builder");
            DescriptorRendererImpl.this.renderProperty(propertyDescriptor, stringBuilder);
        }

        public void visitPropertyGetterDescriptor(@NotNull PropertyGetterDescriptor propertyGetterDescriptor, @NotNull StringBuilder stringBuilder) {
            C2668g.b(propertyGetterDescriptor, "descriptor");
            C2668g.b(stringBuilder, "builder");
            if (DescriptorRendererImpl.this.getRenderAccessors()) {
                DescriptorRendererImpl.this.renderAccessorModifiers(propertyGetterDescriptor, stringBuilder);
                stringBuilder.append("getter for ");
                DescriptorRendererImpl descriptorRendererImpl = DescriptorRendererImpl.this;
                propertyGetterDescriptor = propertyGetterDescriptor.getCorrespondingProperty();
                C2668g.a(propertyGetterDescriptor, "descriptor.correspondingProperty");
                descriptorRendererImpl.renderProperty(propertyGetterDescriptor, stringBuilder);
                return;
            }
            visitFunctionDescriptor((FunctionDescriptor) propertyGetterDescriptor, stringBuilder);
        }

        public void visitPropertySetterDescriptor(@NotNull PropertySetterDescriptor propertySetterDescriptor, @NotNull StringBuilder stringBuilder) {
            C2668g.b(propertySetterDescriptor, "descriptor");
            C2668g.b(stringBuilder, "builder");
            if (DescriptorRendererImpl.this.getRenderAccessors()) {
                DescriptorRendererImpl.this.renderAccessorModifiers(propertySetterDescriptor, stringBuilder);
                stringBuilder.append("setter for ");
                DescriptorRendererImpl descriptorRendererImpl = DescriptorRendererImpl.this;
                propertySetterDescriptor = propertySetterDescriptor.getCorrespondingProperty();
                C2668g.a(propertySetterDescriptor, "descriptor.correspondingProperty");
                descriptorRendererImpl.renderProperty(propertySetterDescriptor, stringBuilder);
                return;
            }
            visitFunctionDescriptor((FunctionDescriptor) propertySetterDescriptor, stringBuilder);
        }

        public void visitFunctionDescriptor(@NotNull FunctionDescriptor functionDescriptor, @NotNull StringBuilder stringBuilder) {
            C2668g.b(functionDescriptor, "descriptor");
            C2668g.b(stringBuilder, "builder");
            DescriptorRendererImpl.this.renderFunction(functionDescriptor, stringBuilder);
        }

        public void visitReceiverParameterDescriptor(@NotNull ReceiverParameterDescriptor receiverParameterDescriptor, @NotNull StringBuilder stringBuilder) {
            C2668g.b(receiverParameterDescriptor, "descriptor");
            C2668g.b(stringBuilder, "builder");
            stringBuilder.append(receiverParameterDescriptor.getName());
        }

        public void visitConstructorDescriptor(@NotNull ConstructorDescriptor constructorDescriptor, @NotNull StringBuilder stringBuilder) {
            C2668g.b(constructorDescriptor, "constructorDescriptor");
            C2668g.b(stringBuilder, "builder");
            DescriptorRendererImpl.this.renderConstructor(constructorDescriptor, stringBuilder);
        }

        public void visitTypeParameterDescriptor(@NotNull TypeParameterDescriptor typeParameterDescriptor, @NotNull StringBuilder stringBuilder) {
            C2668g.b(typeParameterDescriptor, "descriptor");
            C2668g.b(stringBuilder, "builder");
            DescriptorRendererImpl.this.renderTypeParameter(typeParameterDescriptor, stringBuilder, true);
        }

        public void visitPackageFragmentDescriptor(@NotNull PackageFragmentDescriptor packageFragmentDescriptor, @NotNull StringBuilder stringBuilder) {
            C2668g.b(packageFragmentDescriptor, "descriptor");
            C2668g.b(stringBuilder, "builder");
            DescriptorRendererImpl.this.renderPackageFragment(packageFragmentDescriptor, stringBuilder);
        }

        public void visitPackageViewDescriptor(@NotNull PackageViewDescriptor packageViewDescriptor, @NotNull StringBuilder stringBuilder) {
            C2668g.b(packageViewDescriptor, "descriptor");
            C2668g.b(stringBuilder, "builder");
            DescriptorRendererImpl.this.renderPackageView(packageViewDescriptor, stringBuilder);
        }

        public void visitModuleDeclaration(@NotNull ModuleDescriptor moduleDescriptor, @NotNull StringBuilder stringBuilder) {
            C2668g.b(moduleDescriptor, "descriptor");
            C2668g.b(stringBuilder, "builder");
            DescriptorRendererImpl.this.renderName(moduleDescriptor, stringBuilder);
        }

        public void visitClassDescriptor(@NotNull ClassDescriptor classDescriptor, @NotNull StringBuilder stringBuilder) {
            C2668g.b(classDescriptor, "descriptor");
            C2668g.b(stringBuilder, "builder");
            DescriptorRendererImpl.this.renderClass(classDescriptor, stringBuilder);
        }

        public void visitTypeAliasDescriptor(@NotNull TypeAliasDescriptor typeAliasDescriptor, @NotNull StringBuilder stringBuilder) {
            C2668g.b(typeAliasDescriptor, "descriptor");
            C2668g.b(stringBuilder, "builder");
            DescriptorRendererImpl.this.renderTypeAlias(typeAliasDescriptor, stringBuilder);
        }
    }

    private final DescriptorRendererImpl getFunctionTypeAnnotationsRenderer() {
        Lazy lazy = this.functionTypeAnnotationsRenderer$delegate;
        KProperty kProperty = $$delegatedProperties[0];
        return (DescriptorRendererImpl) lazy.getValue();
    }

    private final DescriptorRenderer getFunctionTypeParameterTypesRenderer() {
        Lazy lazy = this.functionTypeParameterTypesRenderer$delegate;
        KProperty kProperty = $$delegatedProperties[1];
        return (DescriptorRenderer) lazy.getValue();
    }

    public boolean getAlwaysRenderModifiers() {
        return this.options.getAlwaysRenderModifiers();
    }

    @NotNull
    public AnnotationArgumentsRenderingPolicy getAnnotationArgumentsRenderingPolicy() {
        return this.options.getAnnotationArgumentsRenderingPolicy();
    }

    public boolean getClassWithPrimaryConstructor() {
        return this.options.getClassWithPrimaryConstructor();
    }

    @NotNull
    public ClassifierNamePolicy getClassifierNamePolicy() {
        return this.options.getClassifierNamePolicy();
    }

    public boolean getDebugMode() {
        return this.options.getDebugMode();
    }

    @Nullable
    public Function1<ValueParameterDescriptor, String> getDefaultParameterValueRenderer() {
        return this.options.getDefaultParameterValueRenderer();
    }

    @NotNull
    public Set<FqName> getExcludedAnnotationClasses() {
        return this.options.getExcludedAnnotationClasses();
    }

    @NotNull
    public Set<FqName> getExcludedTypeAnnotationClasses() {
        return this.options.getExcludedTypeAnnotationClasses();
    }

    public boolean getIncludeAdditionalModifiers() {
        return this.options.getIncludeAdditionalModifiers();
    }

    public boolean getIncludeAnnotationArguments() {
        return this.options.getIncludeAnnotationArguments();
    }

    public boolean getIncludeEmptyAnnotationArguments() {
        return this.options.getIncludeEmptyAnnotationArguments();
    }

    public boolean getIncludePropertyConstant() {
        return this.options.getIncludePropertyConstant();
    }

    @NotNull
    public Set<DescriptorRendererModifier> getModifiers() {
        return this.options.getModifiers();
    }

    public boolean getNormalizedVisibilities() {
        return this.options.getNormalizedVisibilities();
    }

    @NotNull
    public OverrideRenderingPolicy getOverrideRenderingPolicy() {
        return this.options.getOverrideRenderingPolicy();
    }

    @NotNull
    public ParameterNameRenderingPolicy getParameterNameRenderingPolicy() {
        return this.options.getParameterNameRenderingPolicy();
    }

    public boolean getParameterNamesInFunctionalTypes() {
        return this.options.getParameterNamesInFunctionalTypes();
    }

    public boolean getReceiverAfterName() {
        return this.options.getReceiverAfterName();
    }

    public boolean getRenderAccessors() {
        return this.options.getRenderAccessors();
    }

    public boolean getRenderCompanionObjectName() {
        return this.options.getRenderCompanionObjectName();
    }

    public boolean getRenderConstructorKeyword() {
        return this.options.getRenderConstructorKeyword();
    }

    public boolean getRenderDefaultAnnotationArguments() {
        return this.options.getRenderDefaultAnnotationArguments();
    }

    public boolean getRenderDefaultVisibility() {
        return this.options.getRenderDefaultVisibility();
    }

    public boolean getRenderUnabbreviatedType() {
        return this.options.getRenderUnabbreviatedType();
    }

    public boolean getSecondaryConstructorsAsPrimary() {
        return this.options.getSecondaryConstructorsAsPrimary();
    }

    public boolean getStartFromDeclarationKeyword() {
        return this.options.getStartFromDeclarationKeyword();
    }

    public boolean getStartFromName() {
        return this.options.getStartFromName();
    }

    @NotNull
    public RenderingFormat getTextFormat() {
        return this.options.getTextFormat();
    }

    @NotNull
    public Function1<KotlinType, KotlinType> getTypeNormalizer() {
        return this.options.getTypeNormalizer();
    }

    public boolean getUninferredTypeParameterAsName() {
        return this.options.getUninferredTypeParameterAsName();
    }

    public boolean getUnitReturnType() {
        return this.options.getUnitReturnType();
    }

    @NotNull
    public ValueParametersHandler getValueParametersHandler() {
        return this.options.getValueParametersHandler();
    }

    public boolean getVerbose() {
        return this.options.getVerbose();
    }

    public boolean getWithDefinedIn() {
        return this.options.getWithDefinedIn();
    }

    public boolean getWithSourceFileForTopLevel() {
        return this.options.getWithSourceFileForTopLevel();
    }

    public boolean getWithoutReturnType() {
        return this.options.getWithoutReturnType();
    }

    public boolean getWithoutSuperTypes() {
        return this.options.getWithoutSuperTypes();
    }

    public boolean getWithoutTypeParameters() {
        return this.options.getWithoutTypeParameters();
    }

    public void setAnnotationArgumentsRenderingPolicy(@NotNull AnnotationArgumentsRenderingPolicy annotationArgumentsRenderingPolicy) {
        C2668g.b(annotationArgumentsRenderingPolicy, "<set-?>");
        this.options.setAnnotationArgumentsRenderingPolicy(annotationArgumentsRenderingPolicy);
    }

    public void setClassifierNamePolicy(@NotNull ClassifierNamePolicy classifierNamePolicy) {
        C2668g.b(classifierNamePolicy, "<set-?>");
        this.options.setClassifierNamePolicy(classifierNamePolicy);
    }

    public void setDebugMode(boolean z) {
        this.options.setDebugMode(z);
    }

    public void setExcludedTypeAnnotationClasses(@NotNull Set<FqName> set) {
        C2668g.b(set, "<set-?>");
        this.options.setExcludedTypeAnnotationClasses(set);
    }

    public void setModifiers(@NotNull Set<? extends DescriptorRendererModifier> set) {
        C2668g.b(set, "<set-?>");
        this.options.setModifiers(set);
    }

    public void setParameterNameRenderingPolicy(@NotNull ParameterNameRenderingPolicy parameterNameRenderingPolicy) {
        C2668g.b(parameterNameRenderingPolicy, "<set-?>");
        this.options.setParameterNameRenderingPolicy(parameterNameRenderingPolicy);
    }

    public void setReceiverAfterName(boolean z) {
        this.options.setReceiverAfterName(z);
    }

    public void setRenderCompanionObjectName(boolean z) {
        this.options.setRenderCompanionObjectName(z);
    }

    public void setStartFromName(boolean z) {
        this.options.setStartFromName(z);
    }

    public void setTextFormat(@NotNull RenderingFormat renderingFormat) {
        C2668g.b(renderingFormat, "<set-?>");
        this.options.setTextFormat(renderingFormat);
    }

    public void setVerbose(boolean z) {
        this.options.setVerbose(z);
    }

    public void setWithDefinedIn(boolean z) {
        this.options.setWithDefinedIn(z);
    }

    public void setWithoutSuperTypes(boolean z) {
        this.options.setWithoutSuperTypes(z);
    }

    public void setWithoutTypeParameters(boolean z) {
        this.options.setWithoutTypeParameters(z);
    }

    @NotNull
    public final DescriptorRendererOptionsImpl getOptions() {
        return this.options;
    }

    public DescriptorRendererImpl(@NotNull DescriptorRendererOptionsImpl descriptorRendererOptionsImpl) {
        C2668g.b(descriptorRendererOptionsImpl, "options");
        this.options = descriptorRendererOptionsImpl;
        descriptorRendererOptionsImpl = this.options.isLocked();
        if (C15819j.f49018a && descriptorRendererOptionsImpl == null) {
            throw new AssertionError("Assertion failed");
        }
        this.functionTypeAnnotationsRenderer$delegate = C15810e.m59833a((Function0) new DescriptorRendererImpl$functionTypeAnnotationsRenderer$2(this));
        this.functionTypeParameterTypesRenderer$delegate = C15810e.m59833a((Function0) new DescriptorRendererImpl$functionTypeParameterTypesRenderer$2(this));
    }

    private final String renderKeyword(String str) {
        switch (getTextFormat()) {
            case PLAIN:
                return str;
            case HTML:
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("<b>");
                stringBuilder.append(str);
                stringBuilder.append("</b>");
                return stringBuilder.toString();
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    private final String renderError(String str) {
        switch (getTextFormat()) {
            case PLAIN:
                return str;
            case HTML:
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("<font color=red><b>");
                stringBuilder.append(str);
                stringBuilder.append("</b></font>");
                return stringBuilder.toString();
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    private final String escape(String str) {
        return getTextFormat().escape(str);
    }

    private final String lt() {
        return escape("<");
    }

    private final String gt() {
        return escape(">");
    }

    private final String arrow() {
        switch (getTextFormat()) {
            case PLAIN:
                return escape("->");
            case HTML:
                return "&rarr;";
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    @NotNull
    public String renderMessage(@NotNull String str) {
        C2668g.b(str, "message");
        switch (getTextFormat()) {
            case PLAIN:
                return str;
            case HTML:
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("<i>");
                stringBuilder.append(str);
                stringBuilder.append("</i>");
                return stringBuilder.toString();
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    @NotNull
    public String renderName(@NotNull Name name) {
        C2668g.b(name, "name");
        return escape(RenderingUtilsKt.render(name));
    }

    private final void renderName(DeclarationDescriptor declarationDescriptor, StringBuilder stringBuilder) {
        declarationDescriptor = declarationDescriptor.getName();
        C2668g.a(declarationDescriptor, "descriptor.name");
        stringBuilder.append(renderName(declarationDescriptor));
    }

    private final void renderCompanionObjectName(DeclarationDescriptor declarationDescriptor, StringBuilder stringBuilder) {
        if (getRenderCompanionObjectName()) {
            if (getStartFromName()) {
                stringBuilder.append("companion object");
            }
            renderSpaceIfNeeded(stringBuilder);
            DeclarationDescriptor containingDeclaration = declarationDescriptor.getContainingDeclaration();
            if (containingDeclaration != null) {
                stringBuilder.append("of ");
                Name name = containingDeclaration.getName();
                C2668g.a(name, "containingDeclaration.name");
                stringBuilder.append(renderName(name));
            }
        }
        if (getVerbose() || (C2668g.a(declarationDescriptor.getName(), SpecialNames.DEFAULT_NAME_FOR_COMPANION_OBJECT) ^ 1) != 0) {
            if (!getStartFromName()) {
                renderSpaceIfNeeded(stringBuilder);
            }
            declarationDescriptor = declarationDescriptor.getName();
            C2668g.a(declarationDescriptor, "descriptor.name");
            stringBuilder.append(renderName(declarationDescriptor));
        }
    }

    @NotNull
    public String renderFqName(@NotNull FqNameUnsafe fqNameUnsafe) {
        C2668g.b(fqNameUnsafe, "fqName");
        List pathSegments = fqNameUnsafe.pathSegments();
        C2668g.a(pathSegments, "fqName.pathSegments()");
        return renderFqName(pathSegments);
    }

    private final String renderFqName(List<Name> list) {
        return escape(RenderingUtilsKt.renderFqName(list));
    }

    @NotNull
    public String renderClassifierName(@NotNull ClassifierDescriptor classifierDescriptor) {
        C2668g.b(classifierDescriptor, "klass");
        if (ErrorUtils.isError(classifierDescriptor)) {
            return classifierDescriptor.getTypeConstructor().toString();
        }
        return getClassifierNamePolicy().renderClassifier(classifierDescriptor, this);
    }

    @NotNull
    public String renderType(@NotNull KotlinType kotlinType) {
        C2668g.b(kotlinType, "type");
        StringBuilder stringBuilder = new StringBuilder();
        renderNormalizedType(stringBuilder, (KotlinType) getTypeNormalizer().invoke(kotlinType));
        kotlinType = stringBuilder.toString();
        C2668g.a(kotlinType, "StringBuilder().apply(builderAction).toString()");
        return kotlinType;
    }

    private final void renderNormalizedType(@NotNull StringBuilder stringBuilder, KotlinType kotlinType) {
        UnwrappedType unwrap = kotlinType.unwrap();
        if (!(unwrap instanceof AbbreviatedType)) {
            unwrap = null;
        }
        AbbreviatedType abbreviatedType = (AbbreviatedType) unwrap;
        if (abbreviatedType != null) {
            renderNormalizedTypeAsIs(stringBuilder, abbreviatedType.getAbbreviation());
            if (getRenderUnabbreviatedType() != null) {
                renderAbbreviatedTypeExpansion(stringBuilder, abbreviatedType);
            }
            return;
        }
        renderNormalizedTypeAsIs(stringBuilder, kotlinType);
    }

    private final void renderAbbreviatedTypeExpansion(@NotNull StringBuilder stringBuilder, AbbreviatedType abbreviatedType) {
        if (getTextFormat() == RenderingFormat.HTML) {
            stringBuilder.append("<font color=\"808080\"><i>");
        }
        stringBuilder.append(" /* = ");
        renderNormalizedTypeAsIs(stringBuilder, abbreviatedType.getExpandedType());
        stringBuilder.append(" */");
        if (getTextFormat() == RenderingFormat.HTML) {
            stringBuilder.append("</i></font>");
        }
    }

    private final void renderNormalizedTypeAsIs(@NotNull StringBuilder stringBuilder, KotlinType kotlinType) {
        if ((kotlinType instanceof WrappedType) && getDebugMode() && !((WrappedType) kotlinType).isComputed()) {
            stringBuilder.append("<Not computed yet>");
            return;
        }
        kotlinType = kotlinType.unwrap();
        if (kotlinType instanceof FlexibleType) {
            stringBuilder.append(((FlexibleType) kotlinType).render(this, this));
        } else if (kotlinType instanceof SimpleType) {
            renderSimpleType(stringBuilder, (SimpleType) kotlinType);
        }
    }

    private final void renderSimpleType(@NotNull StringBuilder stringBuilder, SimpleType simpleType) {
        if (!C2668g.a(simpleType, TypeUtils.CANT_INFER_FUNCTION_PARAM_TYPE)) {
            KotlinType kotlinType = simpleType;
            if (!TypeUtils.isDontCarePlaceholder(kotlinType)) {
                if (ErrorUtils.isUninferredParameter(kotlinType)) {
                    if (getUninferredTypeParameterAsName()) {
                        simpleType = simpleType.getConstructor();
                        if (simpleType == null) {
                            throw new TypeCastException("null cannot be cast to non-null type org.jetbrains.kotlin.types.ErrorUtils.UninferredParameterTypeConstructor");
                        }
                        simpleType = ((UninferredParameterTypeConstructor) simpleType).getTypeParameterDescriptor();
                        C2668g.a(simpleType, "(type.constructor as Uni…).typeParameterDescriptor");
                        simpleType = simpleType.getName().toString();
                        C2668g.a(simpleType, "(type.constructor as Uni…escriptor.name.toString()");
                        stringBuilder.append(renderError(simpleType));
                    } else {
                        stringBuilder.append("???");
                    }
                    return;
                } else if (KotlinTypeKt.isError(kotlinType) != null) {
                    renderDefaultType(stringBuilder, kotlinType);
                    return;
                } else {
                    if (shouldRenderAsPrettyFunctionType(kotlinType) != null) {
                        renderFunctionType(stringBuilder, kotlinType);
                    } else {
                        renderDefaultType(stringBuilder, kotlinType);
                    }
                    return;
                }
            }
        }
        stringBuilder.append("???");
    }

    private final boolean shouldRenderAsPrettyFunctionType(KotlinType kotlinType) {
        if (!FunctionTypesKt.isBuiltinFunctionalType(kotlinType)) {
            return false;
        }
        Iterable<TypeProjection> arguments = kotlinType.getArguments();
        if (!((arguments instanceof Collection) && ((Collection) arguments).isEmpty())) {
            for (TypeProjection isStarProjection : arguments) {
                if (isStarProjection.isStarProjection()) {
                    kotlinType = null;
                    break;
                }
            }
        }
        kotlinType = true;
        if (kotlinType != null) {
            return true;
        }
        return false;
    }

    @NotNull
    public String renderFlexibleType(@NotNull String str, @NotNull String str2, @NotNull KotlinBuiltIns kotlinBuiltIns) {
        DescriptorRendererImpl descriptorRendererImpl = this;
        String str3 = str;
        String str4 = str2;
        C2668g.b(str3, "lowerRendered");
        C2668g.b(str4, "upperRendered");
        C2668g.b(kotlinBuiltIns, "builtIns");
        StringBuilder stringBuilder;
        if (!differsOnlyInNullability(str, str2)) {
            ClassifierNamePolicy classifierNamePolicy = getClassifierNamePolicy();
            ClassDescriptor collection = kotlinBuiltIns.getCollection();
            C2668g.a(collection, "builtIns.collection");
            DescriptorRenderer descriptorRenderer = descriptorRendererImpl;
            String a = C19298r.m68752a(classifierNamePolicy.renderClassifier(collection, descriptorRenderer), "Collection", null, 2, null);
            String str5 = "Mutable";
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append(a);
            stringBuilder2.append(str5);
            String stringBuilder3 = stringBuilder2.toString();
            stringBuilder2 = new StringBuilder();
            stringBuilder2.append("");
            stringBuilder2.append(a);
            stringBuilder2.append('(');
            stringBuilder2.append(str5);
            stringBuilder2.append(')');
            str5 = replacePrefixes(str3, stringBuilder3, str4, a, stringBuilder2.toString());
            if (str5 != null) {
                return str5;
            }
            stringBuilder = new StringBuilder();
            stringBuilder.append(a);
            stringBuilder.append("MutableMap.MutableEntry");
            stringBuilder3 = stringBuilder.toString();
            stringBuilder = new StringBuilder();
            stringBuilder.append(a);
            stringBuilder.append("Map.Entry");
            String stringBuilder4 = stringBuilder.toString();
            stringBuilder = new StringBuilder();
            stringBuilder.append(a);
            stringBuilder.append("(Mutable)Map.(Mutable)Entry");
            str5 = replacePrefixes(str3, stringBuilder3, str4, stringBuilder4, stringBuilder.toString());
            if (str5 != null) {
                return str5;
            }
            classifierNamePolicy = getClassifierNamePolicy();
            collection = kotlinBuiltIns.getArray();
            C2668g.a(collection, "builtIns.array");
            str5 = C19298r.m68752a(classifierNamePolicy.renderClassifier(collection, descriptorRenderer), "Array", null, 2, null);
            stringBuilder2 = new StringBuilder();
            stringBuilder2.append(str5);
            stringBuilder2.append(escape("Array<"));
            stringBuilder3 = stringBuilder2.toString();
            stringBuilder2 = new StringBuilder();
            stringBuilder2.append(str5);
            stringBuilder2.append(escape("Array<out "));
            stringBuilder4 = stringBuilder2.toString();
            stringBuilder2 = new StringBuilder();
            stringBuilder2.append(str5);
            stringBuilder2.append(escape("Array<(out) "));
            str5 = replacePrefixes(str3, stringBuilder3, str4, stringBuilder4, stringBuilder2.toString());
            if (str5 != null) {
                return str5;
            }
            stringBuilder = new StringBuilder();
            stringBuilder.append('(');
            stringBuilder.append(str3);
            stringBuilder.append("..");
            stringBuilder.append(str4);
            stringBuilder.append(')');
            return stringBuilder.toString();
        } else if (C19296q.m68678b(str4, "(", false, 2, null)) {
            stringBuilder = new StringBuilder();
            stringBuilder.append('(');
            stringBuilder.append(str3);
            stringBuilder.append(")!");
            return stringBuilder.toString();
        } else {
            stringBuilder = new StringBuilder();
            stringBuilder.append(str3);
            stringBuilder.append("!");
            return stringBuilder.toString();
        }
    }

    @NotNull
    public String renderTypeArguments(@NotNull List<? extends TypeProjection> list) {
        C2668g.b(list, "typeArguments");
        if (list.isEmpty()) {
            return "";
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(lt());
        appendTypeProjections(stringBuilder, list);
        stringBuilder.append(gt());
        list = stringBuilder.toString();
        C2668g.a(list, "StringBuilder().apply(builderAction).toString()");
        return list;
    }

    private final void renderDefaultType(@NotNull StringBuilder stringBuilder, KotlinType kotlinType) {
        renderAnnotations(stringBuilder, kotlinType);
        if (KotlinTypeKt.isError(kotlinType)) {
            stringBuilder.append(kotlinType.getConstructor().toString());
            stringBuilder.append(renderTypeArguments(kotlinType.getArguments()));
        } else {
            renderTypeConstructorAndArguments$default(this, stringBuilder, kotlinType, null, 2, null);
        }
        if (kotlinType.isMarkedNullable()) {
            stringBuilder.append("?");
        }
        if (SpecialTypesKt.isDefinitelyNotNullType(kotlinType) != null) {
            stringBuilder.append("!!");
        }
    }

    static /* synthetic */ void renderTypeConstructorAndArguments$default(DescriptorRendererImpl descriptorRendererImpl, StringBuilder stringBuilder, KotlinType kotlinType, TypeConstructor typeConstructor, int i, Object obj) {
        if ((i & 2) != 0) {
            typeConstructor = kotlinType.getConstructor();
        }
        descriptorRendererImpl.renderTypeConstructorAndArguments(stringBuilder, kotlinType, typeConstructor);
    }

    private final void renderTypeConstructorAndArguments(@NotNull StringBuilder stringBuilder, KotlinType kotlinType, TypeConstructor typeConstructor) {
        PossiblyInnerType buildPossiblyInnerType = TypeParameterUtilsKt.buildPossiblyInnerType(kotlinType);
        if (buildPossiblyInnerType == null) {
            stringBuilder.append(renderTypeConstructor(typeConstructor));
            stringBuilder.append(renderTypeArguments(kotlinType.getArguments()));
            return;
        }
        renderPossiblyInnerType(stringBuilder, buildPossiblyInnerType);
    }

    private final void renderPossiblyInnerType(@NotNull StringBuilder stringBuilder, PossiblyInnerType possiblyInnerType) {
        PossiblyInnerType outerType = possiblyInnerType.getOuterType();
        if (outerType != null) {
            renderPossiblyInnerType(stringBuilder, outerType);
            stringBuilder.append('.');
            Name name = possiblyInnerType.getClassifierDescriptor().getName();
            C2668g.a(name, "possiblyInnerType.classifierDescriptor.name");
            stringBuilder.append(renderName(name));
            if (stringBuilder != null) {
                stringBuilder.append(renderTypeArguments(possiblyInnerType.getArguments()));
            }
        }
        TypeConstructor typeConstructor = possiblyInnerType.getClassifierDescriptor().getTypeConstructor();
        C2668g.a(typeConstructor, "possiblyInnerType.classi…escriptor.typeConstructor");
        stringBuilder.append(renderTypeConstructor(typeConstructor));
        stringBuilder.append(renderTypeArguments(possiblyInnerType.getArguments()));
    }

    @NotNull
    public String renderTypeConstructor(@NotNull TypeConstructor typeConstructor) {
        C2668g.b(typeConstructor, "typeConstructor");
        ClassifierDescriptor declarationDescriptor = typeConstructor.getDeclarationDescriptor();
        if (!(declarationDescriptor instanceof TypeParameterDescriptor)) {
            if (!(declarationDescriptor instanceof ClassDescriptor)) {
                if (!(declarationDescriptor instanceof TypeAliasDescriptor)) {
                    if (declarationDescriptor == null) {
                        return typeConstructor.toString();
                    }
                    typeConstructor = new StringBuilder();
                    typeConstructor.append("Unexpected classifier: ");
                    typeConstructor.append(declarationDescriptor.getClass());
                    throw new IllegalStateException(typeConstructor.toString().toString());
                }
            }
        }
        return renderClassifierName(declarationDescriptor);
    }

    @NotNull
    public String renderTypeProjection(@NotNull TypeProjection typeProjection) {
        C2668g.b(typeProjection, "typeProjection");
        StringBuilder stringBuilder = new StringBuilder();
        appendTypeProjections(stringBuilder, C15807n.m59826a(typeProjection));
        typeProjection = stringBuilder.toString();
        C2668g.a(typeProjection, "StringBuilder().apply(builderAction).toString()");
        return typeProjection;
    }

    private final void appendTypeProjections(@NotNull StringBuilder stringBuilder, List<? extends TypeProjection> list) {
        C19299w.m68794a(list, stringBuilder, ", ", null, null, 0, null, (Function1) new DescriptorRendererImpl$appendTypeProjections$1(this), 60, null);
    }

    private final void renderFunctionType(@NotNull StringBuilder stringBuilder, KotlinType kotlinType) {
        Object obj;
        CharSequence charSequence;
        Name name;
        int length = stringBuilder.length();
        getFunctionTypeAnnotationsRenderer().renderAnnotations(stringBuilder, kotlinType);
        int i = 0;
        int i2 = 1;
        Object obj2 = stringBuilder.length() != length ? 1 : null;
        boolean isSuspendFunctionType = FunctionTypesKt.isSuspendFunctionType(kotlinType);
        boolean isMarkedNullable = kotlinType.isMarkedNullable();
        KotlinType receiverTypeFromFunctionType = FunctionTypesKt.getReceiverTypeFromFunctionType(kotlinType);
        if (!isMarkedNullable) {
            if (obj2 == null || receiverTypeFromFunctionType == null) {
                obj = null;
                if (obj != null) {
                    if (isSuspendFunctionType) {
                        if (obj2 != null) {
                            charSequence = stringBuilder;
                            obj2 = C19302t.m68848e(charSequence) != ' ' ? 1 : null;
                            if (!C15819j.f49018a && obj2 == null) {
                                throw ((Throwable) new AssertionError("Assertion failed"));
                            } else if (stringBuilder.charAt(C19298r.m68791d(charSequence) - 1) != ')') {
                                stringBuilder.insert(C19298r.m68791d(charSequence), "()");
                            }
                        }
                        stringBuilder.append("(");
                    } else {
                        stringBuilder.insert(length, '(');
                    }
                }
                renderModifier(stringBuilder, isSuspendFunctionType, "suspend");
                if (receiverTypeFromFunctionType != null) {
                    if (!shouldRenderAsPrettyFunctionType(receiverTypeFromFunctionType) || receiverTypeFromFunctionType.isMarkedNullable()) {
                        if (hasModifiersOrAnnotations(receiverTypeFromFunctionType)) {
                            i2 = 0;
                        }
                    }
                    if (i2 != 0) {
                        stringBuilder.append("(");
                    }
                    renderNormalizedType(stringBuilder, receiverTypeFromFunctionType);
                    if (i2 != 0) {
                        stringBuilder.append(")");
                    }
                    stringBuilder.append(".");
                }
                stringBuilder.append("(");
                for (TypeProjection typeProjection : FunctionTypesKt.getValueParameterTypesFromFunctionType(kotlinType)) {
                    if (i > 0) {
                        stringBuilder.append(", ");
                    }
                    if (getParameterNamesInFunctionalTypes()) {
                        name = null;
                    } else {
                        KotlinType type = typeProjection.getType();
                        C2668g.a(type, "typeProjection.type");
                        name = FunctionTypesKt.extractParameterNameFromFunctionTypeArgument(type);
                    }
                    if (name != null) {
                        stringBuilder.append(renderName(name));
                        stringBuilder.append(": ");
                    }
                    stringBuilder.append(getFunctionTypeParameterTypesRenderer().renderTypeProjection(typeProjection));
                    i++;
                }
                stringBuilder.append(") ");
                stringBuilder.append(arrow());
                stringBuilder.append(" ");
                renderNormalizedType(stringBuilder, FunctionTypesKt.getReturnTypeFromFunctionType(kotlinType));
                if (obj != null) {
                    stringBuilder.append(")");
                }
                if (isMarkedNullable) {
                    stringBuilder.append("?");
                }
            }
        }
        obj = 1;
        if (obj != null) {
            if (isSuspendFunctionType) {
                if (obj2 != null) {
                    charSequence = stringBuilder;
                    if (C19302t.m68848e(charSequence) != ' ') {
                    }
                    if (!C15819j.f49018a) {
                    }
                    if (stringBuilder.charAt(C19298r.m68791d(charSequence) - 1) != ')') {
                        stringBuilder.insert(C19298r.m68791d(charSequence), "()");
                    }
                }
                stringBuilder.append("(");
            } else {
                stringBuilder.insert(length, '(');
            }
        }
        renderModifier(stringBuilder, isSuspendFunctionType, "suspend");
        if (receiverTypeFromFunctionType != null) {
            if (hasModifiersOrAnnotations(receiverTypeFromFunctionType)) {
                i2 = 0;
            }
            if (i2 != 0) {
                stringBuilder.append("(");
            }
            renderNormalizedType(stringBuilder, receiverTypeFromFunctionType);
            if (i2 != 0) {
                stringBuilder.append(")");
            }
            stringBuilder.append(".");
        }
        stringBuilder.append("(");
        for (TypeProjection typeProjection2 : FunctionTypesKt.getValueParameterTypesFromFunctionType(kotlinType)) {
            if (i > 0) {
                stringBuilder.append(", ");
            }
            if (getParameterNamesInFunctionalTypes()) {
                name = null;
            } else {
                KotlinType type2 = typeProjection2.getType();
                C2668g.a(type2, "typeProjection.type");
                name = FunctionTypesKt.extractParameterNameFromFunctionTypeArgument(type2);
            }
            if (name != null) {
                stringBuilder.append(renderName(name));
                stringBuilder.append(": ");
            }
            stringBuilder.append(getFunctionTypeParameterTypesRenderer().renderTypeProjection(typeProjection2));
            i++;
        }
        stringBuilder.append(") ");
        stringBuilder.append(arrow());
        stringBuilder.append(" ");
        renderNormalizedType(stringBuilder, FunctionTypesKt.getReturnTypeFromFunctionType(kotlinType));
        if (obj != null) {
            stringBuilder.append(")");
        }
        if (isMarkedNullable) {
            stringBuilder.append("?");
        }
    }

    private final boolean hasModifiersOrAnnotations(@NotNull KotlinType kotlinType) {
        if (!FunctionTypesKt.isSuspendFunctionType(kotlinType)) {
            if (kotlinType.getAnnotations().isEmpty() != null) {
                return null;
            }
        }
        return true;
    }

    private final void appendDefinedIn(@NotNull StringBuilder stringBuilder, DeclarationDescriptor declarationDescriptor) {
        if (!(declarationDescriptor instanceof PackageFragmentDescriptor)) {
            if (!(declarationDescriptor instanceof PackageViewDescriptor)) {
                if (declarationDescriptor instanceof ModuleDescriptor) {
                    stringBuilder.append(" is a module");
                    return;
                }
                DeclarationDescriptor containingDeclaration = declarationDescriptor.getContainingDeclaration();
                if (!(containingDeclaration == null || (containingDeclaration instanceof ModuleDescriptor))) {
                    stringBuilder.append(" ");
                    stringBuilder.append(renderMessage("defined in"));
                    stringBuilder.append(" ");
                    FqNameUnsafe fqName = DescriptorUtils.getFqName(containingDeclaration);
                    C2668g.a(fqName, "fqName");
                    stringBuilder.append(fqName.isRoot() ? "root package" : renderFqName(fqName));
                    if (getWithSourceFileForTopLevel() && (containingDeclaration instanceof PackageFragmentDescriptor) && (declarationDescriptor instanceof DeclarationDescriptorWithSource)) {
                        declarationDescriptor = ((DeclarationDescriptorWithSource) declarationDescriptor).getSource();
                        C2668g.a(declarationDescriptor, "descriptor.source");
                        declarationDescriptor = declarationDescriptor.getContainingFile();
                        C2668g.a(declarationDescriptor, "descriptor.source.containingFile");
                        declarationDescriptor = declarationDescriptor.getName();
                        if (declarationDescriptor != null) {
                            stringBuilder.append(" ");
                            stringBuilder.append(renderMessage("in file"));
                            stringBuilder.append(" ");
                            stringBuilder.append(declarationDescriptor);
                        }
                    }
                }
            }
        }
    }

    private final void renderAnnotations(@NotNull StringBuilder stringBuilder, Annotated annotated) {
        if (getModifiers().contains(DescriptorRendererModifier.ANNOTATIONS)) {
            Set excludedTypeAnnotationClasses = annotated instanceof KotlinType ? getExcludedTypeAnnotationClasses() : getExcludedAnnotationClasses();
            for (AnnotationWithTarget annotationWithTarget : annotated.getAnnotations().getAllAnnotations()) {
                AnnotationDescriptor component1 = annotationWithTarget.component1();
                AnnotationUseSiteTarget component2 = annotationWithTarget.component2();
                if (!C19299w.m68802a((Iterable) excludedTypeAnnotationClasses, (Object) component1.getFqName())) {
                    stringBuilder.append(renderAnnotation(component1, component2));
                    stringBuilder.append(" ");
                }
            }
        }
    }

    @NotNull
    public String renderAnnotation(@NotNull AnnotationDescriptor annotationDescriptor, @Nullable AnnotationUseSiteTarget annotationUseSiteTarget) {
        C2668g.b(annotationDescriptor, "annotation");
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append('@');
        if (annotationUseSiteTarget != null) {
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append(annotationUseSiteTarget.getRenderName());
            stringBuilder2.append(":");
            stringBuilder.append(stringBuilder2.toString());
        }
        annotationUseSiteTarget = annotationDescriptor.getType();
        stringBuilder.append(renderType(annotationUseSiteTarget));
        if (getIncludeAnnotationArguments()) {
            annotationDescriptor = renderAndSortAnnotationArguments(annotationDescriptor);
            if (getIncludeEmptyAnnotationArguments() || (((Collection) annotationDescriptor).isEmpty() ^ 1) != 0) {
                C19299w.m68794a((Iterable) annotationDescriptor, stringBuilder, ", ", "(", ")", 0, null, null, 112, null);
            }
        }
        if (!(getVerbose() == null || (KotlinTypeKt.isError(annotationUseSiteTarget) == null && (annotationUseSiteTarget.getConstructor().getDeclarationDescriptor() instanceof MockClassDescriptor) == null))) {
            stringBuilder.append(" /* annotation class not found */");
        }
        annotationDescriptor = stringBuilder.toString();
        C2668g.a(annotationDescriptor, "StringBuilder().apply(builderAction).toString()");
        return annotationDescriptor;
    }

    private final List<String> renderAndSortAnnotationArguments(AnnotationDescriptor annotationDescriptor) {
        Collection collection;
        Name name;
        Map allValueArguments = annotationDescriptor.getAllValueArguments();
        List list = null;
        annotationDescriptor = getRenderDefaultAnnotationArguments() ? DescriptorUtilsKt.getAnnotationClass(annotationDescriptor) : null;
        if (annotationDescriptor != null) {
            annotationDescriptor = annotationDescriptor.getUnsubstitutedPrimaryConstructor();
            if (annotationDescriptor != null) {
                annotationDescriptor = annotationDescriptor.getValueParameters();
                if (annotationDescriptor != null) {
                    Collection arrayList = new ArrayList();
                    for (Object next : (Iterable) annotationDescriptor) {
                        if (((ValueParameterDescriptor) next).declaresDefaultValue()) {
                            arrayList.add(next);
                        }
                    }
                    Iterable<ValueParameterDescriptor> iterable = (List) arrayList;
                    collection = (Collection) new ArrayList(C18457p.m66906a((Iterable) iterable, 10));
                    for (ValueParameterDescriptor valueParameterDescriptor : iterable) {
                        C2668g.a(valueParameterDescriptor, "it");
                        collection.add(valueParameterDescriptor.getName());
                    }
                    list = (List) collection;
                }
            }
        }
        if (list == null) {
            list = C17554o.m64195a();
        }
        Collection arrayList2 = new ArrayList();
        for (Object next2 : list) {
            if ((allValueArguments.containsKey((Name) next2) ^ 1) != 0) {
                arrayList2.add(next2);
            }
        }
        Iterable<Name> iterable2 = (List) arrayList2;
        collection = (Collection) new ArrayList(C18457p.m66906a((Iterable) iterable2, 10));
        for (Name name2 : iterable2) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("");
            stringBuilder.append(name2.asString());
            stringBuilder.append(" = ...");
            collection.add(stringBuilder.toString());
        }
        List list2 = (List) collection;
        Iterable<Entry> entrySet = allValueArguments.entrySet();
        arrayList2 = new ArrayList(C18457p.m66906a((Iterable) entrySet, 10));
        for (Entry entry : entrySet) {
            name2 = (Name) entry.getKey();
            ConstantValue constantValue = (ConstantValue) entry.getValue();
            stringBuilder = new StringBuilder();
            stringBuilder.append("");
            stringBuilder.append(name2.asString());
            stringBuilder.append(" = ");
            stringBuilder.append(!list.contains(name2) ? renderConstant(constantValue) : "...");
            arrayList2.add(stringBuilder.toString());
        }
        return C19299w.m68837j((Iterable) C19299w.m68809b((Collection) list2, (Iterable) (List) arrayList2));
    }

    private final String renderConstant(ConstantValue<?> constantValue) {
        if (constantValue instanceof ArrayValue) {
            return C19299w.m68797a((Iterable) ((ArrayValue) constantValue).getValue(), ", ", "{", "}", 0, null, (Function1) new DescriptorRendererImpl$renderConstant$1(this), 24, null);
        }
        if (constantValue instanceof AnnotationValue) {
            return C19298r.m68750a((String) DescriptorRenderer.renderAnnotation$default(this, (AnnotationDescriptor) ((AnnotationValue) constantValue).getValue(), null, 2, null), (CharSequence) "@");
        }
        if (!(constantValue instanceof KClassValue)) {
            return constantValue.toString();
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(renderType(((KClassValue) constantValue).getValue()));
        stringBuilder.append("::class");
        return stringBuilder.toString();
    }

    private final void renderVisibility(Visibility visibility, StringBuilder stringBuilder) {
        if (getModifiers().contains(DescriptorRendererModifier.VISIBILITY)) {
            if (getNormalizedVisibilities()) {
                visibility = visibility.normalize();
            }
            if (getRenderDefaultVisibility() || !C2668g.a(visibility, Visibilities.DEFAULT_VISIBILITY)) {
                stringBuilder.append(renderKeyword(visibility.getDisplayName()));
                stringBuilder.append(" ");
            }
        }
    }

    private final void renderModality(Modality modality, StringBuilder stringBuilder) {
        boolean contains = getModifiers().contains(DescriptorRendererModifier.MODALITY);
        modality = modality.name();
        if (modality == null) {
            throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
        }
        modality = modality.toLowerCase();
        C2668g.a(modality, "(this as java.lang.String).toLowerCase()");
        renderModifier(stringBuilder, contains, modality);
    }

    private final void renderModalityForCallable(CallableMemberDescriptor callableMemberDescriptor, StringBuilder stringBuilder) {
        if ((!DescriptorUtils.isTopLevelDeclaration(callableMemberDescriptor) || callableMemberDescriptor.getModality() != Modality.FINAL) && (getOverrideRenderingPolicy() != OverrideRenderingPolicy.RENDER_OVERRIDE || callableMemberDescriptor.getModality() != Modality.OPEN || !overridesSomething(callableMemberDescriptor))) {
            callableMemberDescriptor = callableMemberDescriptor.getModality();
            C2668g.a(callableMemberDescriptor, "callable.modality");
            renderModality(callableMemberDescriptor, stringBuilder);
        }
    }

    private final void renderOverride(CallableMemberDescriptor callableMemberDescriptor, StringBuilder stringBuilder) {
        if (getModifiers().contains(DescriptorRendererModifier.OVERRIDE) && overridesSomething(callableMemberDescriptor) && getOverrideRenderingPolicy() != OverrideRenderingPolicy.RENDER_OPEN) {
            renderModifier(stringBuilder, true, "override");
            if (getVerbose()) {
                stringBuilder.append("/*");
                stringBuilder.append(callableMemberDescriptor.getOverriddenDescriptors().size());
                stringBuilder.append("*/ ");
            }
        }
    }

    private final void renderMemberKind(CallableMemberDescriptor callableMemberDescriptor, StringBuilder stringBuilder) {
        if (getModifiers().contains(DescriptorRendererModifier.MEMBER_KIND) && getVerbose() && callableMemberDescriptor.getKind() != Kind.DECLARATION) {
            stringBuilder.append("/*");
            callableMemberDescriptor = callableMemberDescriptor.getKind().name();
            if (callableMemberDescriptor == null) {
                throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
            }
            callableMemberDescriptor = callableMemberDescriptor.toLowerCase();
            C2668g.a(callableMemberDescriptor, "(this as java.lang.String).toLowerCase()");
            stringBuilder.append(callableMemberDescriptor);
            stringBuilder.append("*/ ");
        }
    }

    private final void renderModifier(StringBuilder stringBuilder, boolean z, String str) {
        if (z) {
            stringBuilder.append(renderKeyword(str));
            stringBuilder.append(" ");
        }
    }

    private final void renderMemberModifiers(MemberDescriptor memberDescriptor, StringBuilder stringBuilder) {
        renderModifier(stringBuilder, memberDescriptor.isExternal(), "external");
        boolean z = false;
        boolean z2 = getModifiers().contains(DescriptorRendererModifier.EXPECT) && memberDescriptor.isExpect();
        renderModifier(stringBuilder, z2, "expect");
        if (getModifiers().contains(DescriptorRendererModifier.ACTUAL) && memberDescriptor.isActual() != null) {
            z = true;
        }
        renderModifier(stringBuilder, z, "actual");
    }

    private final void renderAdditionalModifiers(FunctionDescriptor functionDescriptor, StringBuilder stringBuilder) {
        boolean z;
        Object obj;
        boolean z2 = false;
        if (functionDescriptor.isOperator()) {
            Object obj2;
            Collection overriddenDescriptors = functionDescriptor.getOverriddenDescriptors();
            C2668g.a(overriddenDescriptors, "functionDescriptor.overriddenDescriptors");
            Iterable<FunctionDescriptor> iterable = overriddenDescriptors;
            if (!((iterable instanceof Collection) && ((Collection) iterable).isEmpty())) {
                for (FunctionDescriptor functionDescriptor2 : iterable) {
                    C2668g.a(functionDescriptor2, "it");
                    if (functionDescriptor2.isOperator()) {
                        obj2 = null;
                        break;
                    }
                }
            }
            obj2 = 1;
            if (obj2 != null || getAlwaysRenderModifiers()) {
                z = true;
                if (functionDescriptor.isInfix()) {
                    Collection overriddenDescriptors2 = functionDescriptor.getOverriddenDescriptors();
                    C2668g.a(overriddenDescriptors2, "functionDescriptor.overriddenDescriptors");
                    Iterable<FunctionDescriptor> iterable2 = overriddenDescriptors2;
                    if (!((iterable2 instanceof Collection) && ((Collection) iterable2).isEmpty())) {
                        for (FunctionDescriptor functionDescriptor3 : iterable2) {
                            C2668g.a(functionDescriptor3, "it");
                            if (functionDescriptor3.isInfix()) {
                                obj = null;
                                break;
                            }
                        }
                    }
                    obj = 1;
                    if (obj != null || getAlwaysRenderModifiers()) {
                        z2 = true;
                    }
                }
                renderModifier(stringBuilder, functionDescriptor.isTailrec(), "tailrec");
                renderSuspendModifier(functionDescriptor, stringBuilder);
                renderModifier(stringBuilder, functionDescriptor.isInline(), "inline");
                renderModifier(stringBuilder, z2, "infix");
                renderModifier(stringBuilder, z, "operator");
            }
        }
        z = false;
        if (functionDescriptor.isInfix()) {
            Collection overriddenDescriptors22 = functionDescriptor.getOverriddenDescriptors();
            C2668g.a(overriddenDescriptors22, "functionDescriptor.overriddenDescriptors");
            Iterable<FunctionDescriptor> iterable22 = overriddenDescriptors22;
            for (FunctionDescriptor functionDescriptor32 : iterable22) {
                C2668g.a(functionDescriptor32, "it");
                if (functionDescriptor32.isInfix()) {
                    obj = null;
                    break;
                }
            }
            obj = 1;
            z2 = true;
        }
        renderModifier(stringBuilder, functionDescriptor.isTailrec(), "tailrec");
        renderSuspendModifier(functionDescriptor, stringBuilder);
        renderModifier(stringBuilder, functionDescriptor.isInline(), "inline");
        renderModifier(stringBuilder, z2, "infix");
        renderModifier(stringBuilder, z, "operator");
    }

    private final void renderSuspendModifier(FunctionDescriptor functionDescriptor, StringBuilder stringBuilder) {
        renderModifier(stringBuilder, functionDescriptor.isSuspend(), "suspend");
    }

    @NotNull
    public String render(@NotNull DeclarationDescriptor declarationDescriptor) {
        C2668g.b(declarationDescriptor, "declarationDescriptor");
        StringBuilder stringBuilder = new StringBuilder();
        declarationDescriptor.accept(new RenderDeclarationDescriptorVisitor(), stringBuilder);
        if (getWithDefinedIn()) {
            appendDefinedIn(stringBuilder, declarationDescriptor);
        }
        declarationDescriptor = stringBuilder.toString();
        C2668g.a(declarationDescriptor, "StringBuilder().apply(builderAction).toString()");
        return declarationDescriptor;
    }

    private final void renderTypeParameter(TypeParameterDescriptor typeParameterDescriptor, StringBuilder stringBuilder, boolean z) {
        if (z) {
            stringBuilder.append(lt());
        }
        if (getVerbose()) {
            stringBuilder.append("/*");
            stringBuilder.append(typeParameterDescriptor.getIndex());
            stringBuilder.append("*/ ");
        }
        renderModifier(stringBuilder, typeParameterDescriptor.isReified(), "reified");
        String label = typeParameterDescriptor.getVariance().getLabel();
        Object obj = 1;
        renderModifier(stringBuilder, ((CharSequence) label).length() > 0, label);
        renderAnnotations(stringBuilder, typeParameterDescriptor);
        renderName(typeParameterDescriptor, stringBuilder);
        int size = typeParameterDescriptor.getUpperBounds().size();
        if ((size > 1 && !z) || size == 1) {
            KotlinType kotlinType = (KotlinType) typeParameterDescriptor.getUpperBounds().iterator().next();
            if (!KotlinBuiltIns.isDefaultBound(kotlinType)) {
                stringBuilder.append(" : ");
                C2668g.a(kotlinType, "upperBound");
                stringBuilder.append(renderType(kotlinType));
            }
        } else if (z) {
            for (KotlinType kotlinType2 : typeParameterDescriptor.getUpperBounds()) {
                if (!KotlinBuiltIns.isDefaultBound(kotlinType2)) {
                    if (obj != null) {
                        stringBuilder.append(" : ");
                    } else {
                        stringBuilder.append(" & ");
                    }
                    C2668g.a(kotlinType2, "upperBound");
                    stringBuilder.append(renderType(kotlinType2));
                    obj = null;
                }
            }
        }
        if (z) {
            stringBuilder.append(gt());
        }
    }

    private final void renderTypeParameters(List<? extends TypeParameterDescriptor> list, StringBuilder stringBuilder, boolean z) {
        if (!(getWithoutTypeParameters() || list.isEmpty())) {
            stringBuilder.append(lt());
            renderTypeParameterList(stringBuilder, list);
            stringBuilder.append(gt());
            if (z) {
                stringBuilder.append(" ");
            }
        }
    }

    private final void renderTypeParameterList(StringBuilder stringBuilder, List<? extends TypeParameterDescriptor> list) {
        list = list.iterator();
        while (list.hasNext()) {
            renderTypeParameter((TypeParameterDescriptor) list.next(), stringBuilder, false);
            if (list.hasNext()) {
                stringBuilder.append(", ");
            }
        }
    }

    private final void renderFunction(FunctionDescriptor functionDescriptor, StringBuilder stringBuilder) {
        List typeParameters;
        if (!getStartFromName()) {
            if (!getStartFromDeclarationKeyword()) {
                renderAnnotations(stringBuilder, functionDescriptor);
                Visibility visibility = functionDescriptor.getVisibility();
                C2668g.a(visibility, "function.visibility");
                renderVisibility(visibility, stringBuilder);
                CallableMemberDescriptor callableMemberDescriptor = functionDescriptor;
                renderModalityForCallable(callableMemberDescriptor, stringBuilder);
                if (getIncludeAdditionalModifiers()) {
                    renderMemberModifiers(functionDescriptor, stringBuilder);
                }
                renderOverride(callableMemberDescriptor, stringBuilder);
                if (getIncludeAdditionalModifiers()) {
                    renderAdditionalModifiers(functionDescriptor, stringBuilder);
                } else {
                    renderSuspendModifier(functionDescriptor, stringBuilder);
                }
                renderMemberKind(callableMemberDescriptor, stringBuilder);
                if (getVerbose()) {
                    if (functionDescriptor.isHiddenToOvercomeSignatureClash()) {
                        stringBuilder.append("/*isHiddenToOvercomeSignatureClash*/ ");
                    }
                    if (functionDescriptor.isHiddenForResolutionEverywhereBesideSupercalls()) {
                        stringBuilder.append("/*isHiddenForResolutionEverywhereBesideSupercalls*/ ");
                    }
                }
            }
            stringBuilder.append(renderKeyword("fun"));
            stringBuilder.append(" ");
            typeParameters = functionDescriptor.getTypeParameters();
            C2668g.a(typeParameters, "function.typeParameters");
            renderTypeParameters(typeParameters, stringBuilder, true);
            renderReceiver(functionDescriptor, stringBuilder);
        }
        renderName(functionDescriptor, stringBuilder);
        typeParameters = functionDescriptor.getValueParameters();
        C2668g.a(typeParameters, "function.valueParameters");
        renderValueParameters(typeParameters, functionDescriptor.hasSynthesizedParameterNames(), stringBuilder);
        renderReceiverAfterName(functionDescriptor, stringBuilder);
        KotlinType returnType = functionDescriptor.getReturnType();
        if (!getWithoutReturnType() && (getUnitReturnType() || returnType == null || !KotlinBuiltIns.isUnit(returnType))) {
            stringBuilder.append(": ");
            stringBuilder.append(returnType == null ? "[NULL]" : renderType(returnType));
        }
        functionDescriptor = functionDescriptor.getTypeParameters();
        C2668g.a(functionDescriptor, "function.typeParameters");
        renderWhereSuffix(functionDescriptor, stringBuilder);
    }

    private final void renderReceiverAfterName(CallableDescriptor callableDescriptor, StringBuilder stringBuilder) {
        if (getReceiverAfterName()) {
            callableDescriptor = callableDescriptor.getExtensionReceiverParameter();
            if (callableDescriptor != null) {
                stringBuilder.append(" on ");
                callableDescriptor = callableDescriptor.getType();
                C2668g.a(callableDescriptor, "receiver.type");
                stringBuilder.append(renderType(callableDescriptor));
            }
        }
    }

    private final void renderReceiver(CallableDescriptor callableDescriptor, StringBuilder stringBuilder) {
        callableDescriptor = callableDescriptor.getExtensionReceiverParameter();
        if (callableDescriptor != null) {
            callableDescriptor = callableDescriptor.getType();
            C2668g.a(callableDescriptor, "type");
            String renderType = renderType(callableDescriptor);
            if (shouldRenderAsPrettyFunctionType(callableDescriptor) && TypeUtils.isNullableType(callableDescriptor) == null) {
                callableDescriptor = new StringBuilder();
                callableDescriptor.append('(');
                callableDescriptor.append(renderType);
                callableDescriptor.append(')');
                renderType = callableDescriptor.toString();
            }
            stringBuilder.append(renderType);
            stringBuilder.append(".");
        }
    }

    private final void renderConstructor(ConstructorDescriptor constructorDescriptor, StringBuilder stringBuilder) {
        List typeParameters;
        renderAnnotations(stringBuilder, constructorDescriptor);
        Visibility visibility = constructorDescriptor.getVisibility();
        C2668g.a(visibility, "constructor.visibility");
        renderVisibility(visibility, stringBuilder);
        renderMemberKind(constructorDescriptor, stringBuilder);
        if (getRenderConstructorKeyword()) {
            stringBuilder.append(renderKeyword("constructor"));
        }
        if (getSecondaryConstructorsAsPrimary()) {
            ClassifierDescriptorWithTypeParameters containingDeclaration = constructorDescriptor.getContainingDeclaration();
            if (getRenderConstructorKeyword()) {
                stringBuilder.append(" ");
            }
            C2668g.a(containingDeclaration, "classDescriptor");
            renderName(containingDeclaration, stringBuilder);
            typeParameters = constructorDescriptor.getTypeParameters();
            C2668g.a(typeParameters, "constructor.typeParameters");
            renderTypeParameters(typeParameters, stringBuilder, false);
        }
        typeParameters = constructorDescriptor.getValueParameters();
        C2668g.a(typeParameters, "constructor.valueParameters");
        renderValueParameters(typeParameters, constructorDescriptor.hasSynthesizedParameterNames(), stringBuilder);
        if (getSecondaryConstructorsAsPrimary()) {
            constructorDescriptor = constructorDescriptor.getTypeParameters();
            C2668g.a(constructorDescriptor, "constructor.typeParameters");
            renderWhereSuffix(constructorDescriptor, stringBuilder);
        }
    }

    private final void renderWhereSuffix(List<? extends TypeParameterDescriptor> list, StringBuilder stringBuilder) {
        if (!getWithoutTypeParameters()) {
            ArrayList arrayList = new ArrayList(0);
            for (TypeParameterDescriptor typeParameterDescriptor : list) {
                List upperBounds = typeParameterDescriptor.getUpperBounds();
                C2668g.a(upperBounds, "typeParameter.upperBounds");
                for (KotlinType kotlinType : C19299w.m68814c((Iterable) upperBounds, 1)) {
                    Collection collection = arrayList;
                    StringBuilder stringBuilder2 = new StringBuilder();
                    Name name = typeParameterDescriptor.getName();
                    C2668g.a(name, "typeParameter.name");
                    stringBuilder2.append(renderName(name));
                    stringBuilder2.append(" : ");
                    C2668g.a(kotlinType, "it");
                    stringBuilder2.append(renderType(kotlinType));
                    collection.add(stringBuilder2.toString());
                }
                Collection collection2 = arrayList;
            }
            if (arrayList.isEmpty() == null) {
                stringBuilder.append(" ");
                stringBuilder.append(renderKeyword("where"));
                stringBuilder.append(" ");
                C19299w.m68794a(arrayList, stringBuilder, ", ", null, null, 0, null, null, 124, null);
            }
        }
    }

    private final void renderValueParameters(Collection<? extends ValueParameterDescriptor> collection, boolean z, StringBuilder stringBuilder) {
        z = shouldRenderParameterNames(z);
        int size = collection.size();
        getValueParametersHandler().appendBeforeValueParameters(size, stringBuilder);
        int i = 0;
        for (ValueParameterDescriptor valueParameterDescriptor : collection) {
            getValueParametersHandler().appendBeforeValueParameter(valueParameterDescriptor, i, size, stringBuilder);
            renderValueParameter(valueParameterDescriptor, z, stringBuilder, false);
            getValueParametersHandler().appendAfterValueParameter(valueParameterDescriptor, i, size, stringBuilder);
            i++;
        }
        getValueParametersHandler().appendAfterValueParameters(size, stringBuilder);
    }

    private final boolean shouldRenderParameterNames(boolean z) {
        switch (getParameterNameRenderingPolicy()) {
            case ALL:
                return true;
            case ONLY_NON_SYNTHESIZED:
                return z ^ true;
            case NONE:
                return false;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    private final void renderValueParameter(ValueParameterDescriptor valueParameterDescriptor, boolean z, StringBuilder stringBuilder, boolean z2) {
        if (z2) {
            stringBuilder.append(renderKeyword("value-parameter"));
            stringBuilder.append(" ");
        }
        if (getVerbose()) {
            stringBuilder.append("/*");
            stringBuilder.append(valueParameterDescriptor.getIndex());
            stringBuilder.append("*/ ");
        }
        renderAnnotations(stringBuilder, valueParameterDescriptor);
        renderModifier(stringBuilder, valueParameterDescriptor.isCrossinline(), "crossinline");
        renderModifier(stringBuilder, valueParameterDescriptor.isNoinline(), "noinline");
        renderVariable(valueParameterDescriptor, z, stringBuilder, z2);
        if (getDefaultParameterValueRenderer()) {
            if (getDebugMode() ? valueParameterDescriptor.declaresDefaultValue() : DescriptorUtilsKt.declaresOrInheritsDefaultValue(valueParameterDescriptor)) {
                z = true;
                if (z) {
                    z = new StringBuilder();
                    z.append(" = ");
                    z2 = getDefaultParameterValueRenderer();
                    if (!z2) {
                        C2668g.a();
                    }
                    z.append((String) z2.invoke(valueParameterDescriptor));
                    stringBuilder.append(z.toString());
                }
            }
        }
        z = false;
        if (z) {
            z = new StringBuilder();
            z.append(" = ");
            z2 = getDefaultParameterValueRenderer();
            if (z2) {
                C2668g.a();
            }
            z.append((String) z2.invoke(valueParameterDescriptor));
            stringBuilder.append(z.toString());
        }
    }

    private final void renderValVarPrefix(VariableDescriptor variableDescriptor, StringBuilder stringBuilder) {
        if (!(variableDescriptor instanceof ValueParameterDescriptor)) {
            stringBuilder.append(renderKeyword(variableDescriptor.isVar() != null ? "var" : "val"));
            stringBuilder.append(" ");
        }
    }

    private final void renderVariable(VariableDescriptor variableDescriptor, boolean z, StringBuilder stringBuilder, boolean z2) {
        KotlinType kotlinType;
        KotlinType type = variableDescriptor.getType();
        ValueParameterDescriptor valueParameterDescriptor = (ValueParameterDescriptor) (!(variableDescriptor instanceof ValueParameterDescriptor) ? null : variableDescriptor);
        KotlinType varargElementType = valueParameterDescriptor != null ? valueParameterDescriptor.getVarargElementType() : null;
        if (varargElementType != null) {
            kotlinType = varargElementType;
        } else {
            C2668g.a(type, "realType");
            kotlinType = type;
        }
        renderModifier(stringBuilder, varargElementType != null, "vararg");
        if (z2 && !getStartFromName()) {
            renderValVarPrefix(variableDescriptor, stringBuilder);
        }
        if (z) {
            renderName(variableDescriptor, stringBuilder);
            stringBuilder.append(": ");
        }
        stringBuilder.append(renderType(kotlinType));
        renderInitializer(variableDescriptor, stringBuilder);
        if (getVerbose() != null && varargElementType != null) {
            stringBuilder.append(" /*");
            C2668g.a(type, "realType");
            stringBuilder.append(renderType(type));
            stringBuilder.append("*/");
        }
    }

    private final void renderProperty(PropertyDescriptor propertyDescriptor, StringBuilder stringBuilder) {
        if (!getStartFromName()) {
            if (!getStartFromDeclarationKeyword()) {
                renderAnnotations(stringBuilder, propertyDescriptor);
                Visibility visibility = propertyDescriptor.getVisibility();
                C2668g.a(visibility, "property.visibility");
                renderVisibility(visibility, stringBuilder);
                renderModifier(stringBuilder, propertyDescriptor.isConst(), "const");
                renderMemberModifiers(propertyDescriptor, stringBuilder);
                CallableMemberDescriptor callableMemberDescriptor = propertyDescriptor;
                renderModalityForCallable(callableMemberDescriptor, stringBuilder);
                renderOverride(callableMemberDescriptor, stringBuilder);
                renderModifier(stringBuilder, propertyDescriptor.isLateInit(), "lateinit");
                renderMemberKind(callableMemberDescriptor, stringBuilder);
            }
            renderValVarPrefix(propertyDescriptor, stringBuilder);
            List typeParameters = propertyDescriptor.getTypeParameters();
            C2668g.a(typeParameters, "property.typeParameters");
            renderTypeParameters(typeParameters, stringBuilder, true);
            renderReceiver(propertyDescriptor, stringBuilder);
        }
        renderName(propertyDescriptor, stringBuilder);
        stringBuilder.append(": ");
        KotlinType type = propertyDescriptor.getType();
        C2668g.a(type, "property.type");
        stringBuilder.append(renderType(type));
        renderReceiverAfterName(propertyDescriptor, stringBuilder);
        renderInitializer(propertyDescriptor, stringBuilder);
        propertyDescriptor = propertyDescriptor.getTypeParameters();
        C2668g.a(propertyDescriptor, "property.typeParameters");
        renderWhereSuffix(propertyDescriptor, stringBuilder);
    }

    private final void renderInitializer(VariableDescriptor variableDescriptor, StringBuilder stringBuilder) {
        if (getIncludePropertyConstant()) {
            variableDescriptor = variableDescriptor.getCompileTimeInitializer();
            if (variableDescriptor != null) {
                stringBuilder.append(" = ");
                C2668g.a(variableDescriptor, "constant");
                stringBuilder.append(escape(renderConstant(variableDescriptor)));
            }
        }
    }

    private final void renderTypeAlias(TypeAliasDescriptor typeAliasDescriptor, StringBuilder stringBuilder) {
        renderAnnotations(stringBuilder, typeAliasDescriptor);
        Visibility visibility = typeAliasDescriptor.getVisibility();
        C2668g.a(visibility, "typeAlias.visibility");
        renderVisibility(visibility, stringBuilder);
        renderMemberModifiers(typeAliasDescriptor, stringBuilder);
        stringBuilder.append(renderKeyword("typealias"));
        stringBuilder.append(" ");
        renderName(typeAliasDescriptor, stringBuilder);
        List declaredTypeParameters = typeAliasDescriptor.getDeclaredTypeParameters();
        C2668g.a(declaredTypeParameters, "typeAlias.declaredTypeParameters");
        renderTypeParameters(declaredTypeParameters, stringBuilder, false);
        renderCapturedTypeParametersIfRequired(typeAliasDescriptor, stringBuilder);
        stringBuilder.append(" = ");
        stringBuilder.append(renderType(typeAliasDescriptor.getUnderlyingType()));
    }

    private final void renderCapturedTypeParametersIfRequired(ClassifierDescriptorWithTypeParameters classifierDescriptorWithTypeParameters, StringBuilder stringBuilder) {
        List declaredTypeParameters = classifierDescriptorWithTypeParameters.getDeclaredTypeParameters();
        TypeConstructor typeConstructor = classifierDescriptorWithTypeParameters.getTypeConstructor();
        C2668g.a(typeConstructor, "classifier.typeConstructor");
        List parameters = typeConstructor.getParameters();
        if (getVerbose() && classifierDescriptorWithTypeParameters.isInner() != null && parameters.size() > declaredTypeParameters.size()) {
            stringBuilder.append(" /*captured type parameters: ");
            renderTypeParameterList(stringBuilder, parameters.subList(declaredTypeParameters.size(), parameters.size()));
            stringBuilder.append("*/");
        }
    }

    private final void renderClass(ClassDescriptor classDescriptor, StringBuilder stringBuilder) {
        ClassKind kind;
        boolean z = true;
        Object obj = classDescriptor.getKind() == ClassKind.ENUM_ENTRY ? 1 : null;
        if (!getStartFromName()) {
            renderAnnotations(stringBuilder, classDescriptor);
            if (obj == null) {
                Visibility visibility = classDescriptor.getVisibility();
                C2668g.a(visibility, "klass.visibility");
                renderVisibility(visibility, stringBuilder);
            }
            if (!(classDescriptor.getKind() == ClassKind.INTERFACE && classDescriptor.getModality() == Modality.ABSTRACT)) {
                kind = classDescriptor.getKind();
                C2668g.a(kind, "klass.kind");
                if (!(kind.isSingleton() && classDescriptor.getModality() == Modality.FINAL)) {
                    Modality modality = classDescriptor.getModality();
                    C2668g.a(modality, "klass.modality");
                    renderModality(modality, stringBuilder);
                }
            }
            renderMemberModifiers(classDescriptor, stringBuilder);
            boolean z2 = getModifiers().contains(DescriptorRendererModifier.INNER) && classDescriptor.isInner();
            renderModifier(stringBuilder, z2, "inner");
            z2 = getModifiers().contains(DescriptorRendererModifier.DATA) && classDescriptor.isData();
            renderModifier(stringBuilder, z2, ManagerWebServices.FB_DATA);
            if (!getModifiers().contains(DescriptorRendererModifier.INLINE) || !classDescriptor.isInline()) {
                z = false;
            }
            renderModifier(stringBuilder, z, "inline");
            renderClassKindPrefix(classDescriptor, stringBuilder);
        }
        DeclarationDescriptor declarationDescriptor = classDescriptor;
        if (DescriptorUtils.isCompanionObject(declarationDescriptor)) {
            renderCompanionObjectName(declarationDescriptor, stringBuilder);
        } else {
            if (!getStartFromName()) {
                renderSpaceIfNeeded(stringBuilder);
            }
            renderName(declarationDescriptor, stringBuilder);
        }
        if (obj == null) {
            List declaredTypeParameters = classDescriptor.getDeclaredTypeParameters();
            C2668g.a(declaredTypeParameters, "typeParameters");
            renderTypeParameters(declaredTypeParameters, stringBuilder, false);
            renderCapturedTypeParametersIfRequired(classDescriptor, stringBuilder);
            kind = classDescriptor.getKind();
            C2668g.a(kind, "klass.kind");
            if (!kind.isSingleton() && getClassWithPrimaryConstructor()) {
                ClassConstructorDescriptor unsubstitutedPrimaryConstructor = classDescriptor.getUnsubstitutedPrimaryConstructor();
                if (unsubstitutedPrimaryConstructor != null) {
                    stringBuilder.append(" ");
                    renderAnnotations(stringBuilder, unsubstitutedPrimaryConstructor);
                    Visibility visibility2 = unsubstitutedPrimaryConstructor.getVisibility();
                    C2668g.a(visibility2, "primaryConstructor.visibility");
                    renderVisibility(visibility2, stringBuilder);
                    stringBuilder.append(renderKeyword("constructor"));
                    List valueParameters = unsubstitutedPrimaryConstructor.getValueParameters();
                    C2668g.a(valueParameters, "primaryConstructor.valueParameters");
                    renderValueParameters(valueParameters, unsubstitutedPrimaryConstructor.hasSynthesizedParameterNames(), stringBuilder);
                }
            }
            renderSuperTypes(classDescriptor, stringBuilder);
            renderWhereSuffix(declaredTypeParameters, stringBuilder);
        }
    }

    private final void renderSuperTypes(ClassDescriptor classDescriptor, StringBuilder stringBuilder) {
        if (!getWithoutSuperTypes() && !KotlinBuiltIns.isNothing(classDescriptor.getDefaultType())) {
            classDescriptor = classDescriptor.getTypeConstructor();
            C2668g.a(classDescriptor, "klass.typeConstructor");
            classDescriptor = classDescriptor.getSupertypes();
            if (!classDescriptor.isEmpty()) {
                if (classDescriptor.size() != 1 || !KotlinBuiltIns.isAnyOrNullableAny((KotlinType) classDescriptor.iterator().next())) {
                    renderSpaceIfNeeded(stringBuilder);
                    stringBuilder.append(": ");
                    C2668g.a(classDescriptor, "supertypes");
                    C19299w.m68794a((Iterable) classDescriptor, stringBuilder, ", ", null, null, 0, null, (Function1) new DescriptorRendererImpl$renderSuperTypes$1(this), 60, null);
                }
            }
        }
    }

    private final void renderClassKindPrefix(ClassDescriptor classDescriptor, StringBuilder stringBuilder) {
        stringBuilder.append(renderKeyword(DescriptorRenderer.Companion.getClassifierKindPrefix(classDescriptor)));
    }

    private final void renderPackageView(PackageViewDescriptor packageViewDescriptor, StringBuilder stringBuilder) {
        renderPackageHeader(packageViewDescriptor.getFqName(), "package", stringBuilder);
        if (getDebugMode()) {
            stringBuilder.append(" in context of ");
            renderName(packageViewDescriptor.getModule(), stringBuilder);
        }
    }

    private final void renderPackageFragment(PackageFragmentDescriptor packageFragmentDescriptor, StringBuilder stringBuilder) {
        renderPackageHeader(packageFragmentDescriptor.getFqName(), "package-fragment", stringBuilder);
        if (getDebugMode()) {
            stringBuilder.append(" in ");
            renderName(packageFragmentDescriptor.getContainingDeclaration(), stringBuilder);
        }
    }

    private final void renderPackageHeader(FqName fqName, String str, StringBuilder stringBuilder) {
        stringBuilder.append(renderKeyword(str));
        FqNameUnsafe toUnsafe = fqName.toUnsafe();
        C2668g.a(toUnsafe, "fqName.toUnsafe()");
        fqName = renderFqName(toUnsafe);
        if ((((CharSequence) fqName).length() > null ? true : null) != null) {
            stringBuilder.append(" ");
            stringBuilder.append(fqName);
        }
    }

    private final void renderAccessorModifiers(PropertyAccessorDescriptor propertyAccessorDescriptor, StringBuilder stringBuilder) {
        renderMemberModifiers(propertyAccessorDescriptor, stringBuilder);
    }

    private final void renderSpaceIfNeeded(StringBuilder stringBuilder) {
        int length = stringBuilder.length();
        if (length == 0 || stringBuilder.charAt(length - 1) != ' ') {
            stringBuilder.append(' ');
        }
    }

    private final String replacePrefixes(String str, String str2, String str3, String str4, String str5) {
        if (C19296q.m68678b(str, str2, false, 2, null) && C19296q.m68678b(str3, str4, false, 2, null)) {
            str2 = str2.length();
            if (str == null) {
                throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
            }
            str = str.substring(str2);
            C2668g.a(str, "(this as java.lang.String).substring(startIndex)");
            str2 = str4.length();
            if (str3 == null) {
                throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
            }
            str2 = str3.substring(str2);
            C2668g.a(str2, "(this as java.lang.String).substring(startIndex)");
            str3 = new StringBuilder();
            str3.append(str5);
            str3.append(str);
            str3 = str3.toString();
            if (C2668g.a(str, str2) != null) {
                return str3;
            }
            if (differsOnlyInNullability(str, str2) != null) {
                str = new StringBuilder();
                str.append(str3);
                str.append("!");
                return str.toString();
            }
        }
        return null;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean differsOnlyInNullability(java.lang.String r7, java.lang.String r8) {
        /*
        r6 = this;
        r1 = "?";
        r2 = "";
        r3 = 0;
        r4 = 4;
        r5 = 0;
        r0 = r8;
        r0 = kotlin.text.C19296q.m68672a(r0, r1, r2, r3, r4, r5);
        r0 = kotlin.jvm.internal.C2668g.a(r7, r0);
        r1 = 0;
        if (r0 != 0) goto L_0x0055;
    L_0x0013:
        r0 = "?";
        r2 = 2;
        r3 = 0;
        r0 = kotlin.text.C19296q.m68680c(r8, r0, r1, r2, r3);
        if (r0 == 0) goto L_0x0039;
    L_0x001d:
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r2 = "";
        r0.append(r2);
        r0.append(r7);
        r2 = 63;
        r0.append(r2);
        r0 = r0.toString();
        r0 = kotlin.jvm.internal.C2668g.a(r0, r8);
        if (r0 != 0) goto L_0x0055;
    L_0x0039:
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r2 = 40;
        r0.append(r2);
        r0.append(r7);
        r7 = ")?";
        r0.append(r7);
        r7 = r0.toString();
        r7 = kotlin.jvm.internal.C2668g.a(r7, r8);
        if (r7 == 0) goto L_0x0056;
    L_0x0055:
        r1 = 1;
    L_0x0056:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererImpl.differsOnlyInNullability(java.lang.String, java.lang.String):boolean");
    }

    private final boolean overridesSomething(CallableMemberDescriptor callableMemberDescriptor) {
        return callableMemberDescriptor.getOverriddenDescriptors().isEmpty() ^ 1;
    }
}
