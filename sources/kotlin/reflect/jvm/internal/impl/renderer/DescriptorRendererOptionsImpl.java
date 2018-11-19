package kotlin.reflect.jvm.internal.impl.renderer;

import java.lang.reflect.Field;
import java.util.Set;
import kotlin.C15819j;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C15825i;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.properties.C15830a;
import kotlin.properties.C17564c;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KDeclarationContainer;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.renderer.ClassifierNamePolicy.SOURCE_CODE_QUALIFIED;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer.ValueParametersHandler;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer.ValueParametersHandler.DEFAULT;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions.DefaultImpls;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.text.C19296q;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class DescriptorRendererOptionsImpl implements DescriptorRendererOptions {
    static final /* synthetic */ KProperty[] $$delegatedProperties = new KProperty[]{C15825i.m59864a(new MutablePropertyReference1Impl(C15825i.m59860a(DescriptorRendererOptionsImpl.class), "classifierNamePolicy", "getClassifierNamePolicy()Lorg/jetbrains/kotlin/renderer/ClassifierNamePolicy;")), C15825i.m59864a(new MutablePropertyReference1Impl(C15825i.m59860a(DescriptorRendererOptionsImpl.class), "withDefinedIn", "getWithDefinedIn()Z")), C15825i.m59864a(new MutablePropertyReference1Impl(C15825i.m59860a(DescriptorRendererOptionsImpl.class), "withSourceFileForTopLevel", "getWithSourceFileForTopLevel()Z")), C15825i.m59864a(new MutablePropertyReference1Impl(C15825i.m59860a(DescriptorRendererOptionsImpl.class), "modifiers", "getModifiers()Ljava/util/Set;")), C15825i.m59864a(new MutablePropertyReference1Impl(C15825i.m59860a(DescriptorRendererOptionsImpl.class), "startFromName", "getStartFromName()Z")), C15825i.m59864a(new MutablePropertyReference1Impl(C15825i.m59860a(DescriptorRendererOptionsImpl.class), "startFromDeclarationKeyword", "getStartFromDeclarationKeyword()Z")), C15825i.m59864a(new MutablePropertyReference1Impl(C15825i.m59860a(DescriptorRendererOptionsImpl.class), "debugMode", "getDebugMode()Z")), C15825i.m59864a(new MutablePropertyReference1Impl(C15825i.m59860a(DescriptorRendererOptionsImpl.class), "classWithPrimaryConstructor", "getClassWithPrimaryConstructor()Z")), C15825i.m59864a(new MutablePropertyReference1Impl(C15825i.m59860a(DescriptorRendererOptionsImpl.class), "verbose", "getVerbose()Z")), C15825i.m59864a(new MutablePropertyReference1Impl(C15825i.m59860a(DescriptorRendererOptionsImpl.class), "unitReturnType", "getUnitReturnType()Z")), C15825i.m59864a(new MutablePropertyReference1Impl(C15825i.m59860a(DescriptorRendererOptionsImpl.class), "withoutReturnType", "getWithoutReturnType()Z")), C15825i.m59864a(new MutablePropertyReference1Impl(C15825i.m59860a(DescriptorRendererOptionsImpl.class), "normalizedVisibilities", "getNormalizedVisibilities()Z")), C15825i.m59864a(new MutablePropertyReference1Impl(C15825i.m59860a(DescriptorRendererOptionsImpl.class), "renderDefaultVisibility", "getRenderDefaultVisibility()Z")), C15825i.m59864a(new MutablePropertyReference1Impl(C15825i.m59860a(DescriptorRendererOptionsImpl.class), "uninferredTypeParameterAsName", "getUninferredTypeParameterAsName()Z")), C15825i.m59864a(new MutablePropertyReference1Impl(C15825i.m59860a(DescriptorRendererOptionsImpl.class), "includePropertyConstant", "getIncludePropertyConstant()Z")), C15825i.m59864a(new MutablePropertyReference1Impl(C15825i.m59860a(DescriptorRendererOptionsImpl.class), "withoutTypeParameters", "getWithoutTypeParameters()Z")), C15825i.m59864a(new MutablePropertyReference1Impl(C15825i.m59860a(DescriptorRendererOptionsImpl.class), "withoutSuperTypes", "getWithoutSuperTypes()Z")), C15825i.m59864a(new MutablePropertyReference1Impl(C15825i.m59860a(DescriptorRendererOptionsImpl.class), "typeNormalizer", "getTypeNormalizer()Lkotlin/jvm/functions/Function1;")), C15825i.m59864a(new MutablePropertyReference1Impl(C15825i.m59860a(DescriptorRendererOptionsImpl.class), "defaultParameterValueRenderer", "getDefaultParameterValueRenderer()Lkotlin/jvm/functions/Function1;")), C15825i.m59864a(new MutablePropertyReference1Impl(C15825i.m59860a(DescriptorRendererOptionsImpl.class), "secondaryConstructorsAsPrimary", "getSecondaryConstructorsAsPrimary()Z")), C15825i.m59864a(new MutablePropertyReference1Impl(C15825i.m59860a(DescriptorRendererOptionsImpl.class), "overrideRenderingPolicy", "getOverrideRenderingPolicy()Lorg/jetbrains/kotlin/renderer/OverrideRenderingPolicy;")), C15825i.m59864a(new MutablePropertyReference1Impl(C15825i.m59860a(DescriptorRendererOptionsImpl.class), "valueParametersHandler", "getValueParametersHandler()Lorg/jetbrains/kotlin/renderer/DescriptorRenderer$ValueParametersHandler;")), C15825i.m59864a(new MutablePropertyReference1Impl(C15825i.m59860a(DescriptorRendererOptionsImpl.class), "textFormat", "getTextFormat()Lorg/jetbrains/kotlin/renderer/RenderingFormat;")), C15825i.m59864a(new MutablePropertyReference1Impl(C15825i.m59860a(DescriptorRendererOptionsImpl.class), "parameterNameRenderingPolicy", "getParameterNameRenderingPolicy()Lorg/jetbrains/kotlin/renderer/ParameterNameRenderingPolicy;")), C15825i.m59864a(new MutablePropertyReference1Impl(C15825i.m59860a(DescriptorRendererOptionsImpl.class), "receiverAfterName", "getReceiverAfterName()Z")), C15825i.m59864a(new MutablePropertyReference1Impl(C15825i.m59860a(DescriptorRendererOptionsImpl.class), "renderCompanionObjectName", "getRenderCompanionObjectName()Z")), C15825i.m59864a(new MutablePropertyReference1Impl(C15825i.m59860a(DescriptorRendererOptionsImpl.class), "renderAccessors", "getRenderAccessors()Z")), C15825i.m59864a(new MutablePropertyReference1Impl(C15825i.m59860a(DescriptorRendererOptionsImpl.class), "renderDefaultAnnotationArguments", "getRenderDefaultAnnotationArguments()Z")), C15825i.m59864a(new MutablePropertyReference1Impl(C15825i.m59860a(DescriptorRendererOptionsImpl.class), "excludedAnnotationClasses", "getExcludedAnnotationClasses()Ljava/util/Set;")), C15825i.m59864a(new MutablePropertyReference1Impl(C15825i.m59860a(DescriptorRendererOptionsImpl.class), "excludedTypeAnnotationClasses", "getExcludedTypeAnnotationClasses()Ljava/util/Set;")), C15825i.m59864a(new MutablePropertyReference1Impl(C15825i.m59860a(DescriptorRendererOptionsImpl.class), "annotationArgumentsRenderingPolicy", "getAnnotationArgumentsRenderingPolicy()Lorg/jetbrains/kotlin/renderer/AnnotationArgumentsRenderingPolicy;")), C15825i.m59864a(new MutablePropertyReference1Impl(C15825i.m59860a(DescriptorRendererOptionsImpl.class), "alwaysRenderModifiers", "getAlwaysRenderModifiers()Z")), C15825i.m59864a(new MutablePropertyReference1Impl(C15825i.m59860a(DescriptorRendererOptionsImpl.class), "renderConstructorKeyword", "getRenderConstructorKeyword()Z")), C15825i.m59864a(new MutablePropertyReference1Impl(C15825i.m59860a(DescriptorRendererOptionsImpl.class), "renderUnabbreviatedType", "getRenderUnabbreviatedType()Z")), C15825i.m59864a(new MutablePropertyReference1Impl(C15825i.m59860a(DescriptorRendererOptionsImpl.class), "includeAdditionalModifiers", "getIncludeAdditionalModifiers()Z")), C15825i.m59864a(new MutablePropertyReference1Impl(C15825i.m59860a(DescriptorRendererOptionsImpl.class), "parameterNamesInFunctionalTypes", "getParameterNamesInFunctionalTypes()Z")), C15825i.m59864a(new MutablePropertyReference1Impl(C15825i.m59860a(DescriptorRendererOptionsImpl.class), "renderFunctionContracts", "getRenderFunctionContracts()Z"))};
    @NotNull
    private final ReadWriteProperty alwaysRenderModifiers$delegate = property(Boolean.valueOf(false));
    @NotNull
    private final ReadWriteProperty annotationArgumentsRenderingPolicy$delegate = property(AnnotationArgumentsRenderingPolicy.NO_ARGUMENTS);
    @NotNull
    private final ReadWriteProperty classWithPrimaryConstructor$delegate = property(Boolean.valueOf(false));
    @NotNull
    private final ReadWriteProperty classifierNamePolicy$delegate = property(SOURCE_CODE_QUALIFIED.INSTANCE);
    @NotNull
    private final ReadWriteProperty debugMode$delegate = property(Boolean.valueOf(false));
    @Nullable
    private final ReadWriteProperty defaultParameterValueRenderer$delegate = property(DescriptorRendererOptionsImpl$defaultParameterValueRenderer$2.INSTANCE);
    @NotNull
    private final ReadWriteProperty excludedAnnotationClasses$delegate = property(am.m64176a());
    @NotNull
    private final ReadWriteProperty excludedTypeAnnotationClasses$delegate = property(ExcludedTypeAnnotations.INSTANCE.getInternalAnnotationsForResolve());
    @NotNull
    private final ReadWriteProperty includeAdditionalModifiers$delegate = property(Boolean.valueOf(true));
    @NotNull
    private final ReadWriteProperty includePropertyConstant$delegate = property(Boolean.valueOf(false));
    private boolean isLocked;
    @NotNull
    private final ReadWriteProperty modifiers$delegate = property(DescriptorRendererModifier.DEFAULTS);
    @NotNull
    private final ReadWriteProperty normalizedVisibilities$delegate = property(Boolean.valueOf(false));
    @NotNull
    private final ReadWriteProperty overrideRenderingPolicy$delegate = property(OverrideRenderingPolicy.RENDER_OPEN);
    @NotNull
    private final ReadWriteProperty parameterNameRenderingPolicy$delegate = property(ParameterNameRenderingPolicy.ALL);
    @NotNull
    private final ReadWriteProperty parameterNamesInFunctionalTypes$delegate = property(Boolean.valueOf(true));
    @NotNull
    private final ReadWriteProperty receiverAfterName$delegate = property(Boolean.valueOf(false));
    @NotNull
    private final ReadWriteProperty renderAccessors$delegate = property(Boolean.valueOf(false));
    @NotNull
    private final ReadWriteProperty renderCompanionObjectName$delegate = property(Boolean.valueOf(false));
    @NotNull
    private final ReadWriteProperty renderConstructorKeyword$delegate = property(Boolean.valueOf(true));
    @NotNull
    private final ReadWriteProperty renderDefaultAnnotationArguments$delegate = property(Boolean.valueOf(false));
    @NotNull
    private final ReadWriteProperty renderDefaultVisibility$delegate = property(Boolean.valueOf(true));
    @NotNull
    private final ReadWriteProperty renderFunctionContracts$delegate = property(Boolean.valueOf(false));
    @NotNull
    private final ReadWriteProperty renderUnabbreviatedType$delegate = property(Boolean.valueOf(true));
    @NotNull
    private final ReadWriteProperty secondaryConstructorsAsPrimary$delegate = property(Boolean.valueOf(true));
    @NotNull
    private final ReadWriteProperty startFromDeclarationKeyword$delegate = property(Boolean.valueOf(false));
    @NotNull
    private final ReadWriteProperty startFromName$delegate = property(Boolean.valueOf(false));
    @NotNull
    private final ReadWriteProperty textFormat$delegate = property(RenderingFormat.PLAIN);
    @NotNull
    private final ReadWriteProperty typeNormalizer$delegate = property(DescriptorRendererOptionsImpl$typeNormalizer$2.INSTANCE);
    @NotNull
    private final ReadWriteProperty uninferredTypeParameterAsName$delegate = property(Boolean.valueOf(false));
    @NotNull
    private final ReadWriteProperty unitReturnType$delegate = property(Boolean.valueOf(true));
    @NotNull
    private final ReadWriteProperty valueParametersHandler$delegate = property(DEFAULT.INSTANCE);
    @NotNull
    private final ReadWriteProperty verbose$delegate = property(Boolean.valueOf(false));
    @NotNull
    private final ReadWriteProperty withDefinedIn$delegate = property(Boolean.valueOf(true));
    @NotNull
    private final ReadWriteProperty withSourceFileForTopLevel$delegate = property(Boolean.valueOf(true));
    @NotNull
    private final ReadWriteProperty withoutReturnType$delegate = property(Boolean.valueOf(false));
    @NotNull
    private final ReadWriteProperty withoutSuperTypes$delegate = property(Boolean.valueOf(false));
    @NotNull
    private final ReadWriteProperty withoutTypeParameters$delegate = property(Boolean.valueOf(false));

    public boolean getAlwaysRenderModifiers() {
        return ((Boolean) this.alwaysRenderModifiers$delegate.getValue(this, $$delegatedProperties[31])).booleanValue();
    }

    @NotNull
    public AnnotationArgumentsRenderingPolicy getAnnotationArgumentsRenderingPolicy() {
        return (AnnotationArgumentsRenderingPolicy) this.annotationArgumentsRenderingPolicy$delegate.getValue(this, $$delegatedProperties[30]);
    }

    public boolean getClassWithPrimaryConstructor() {
        return ((Boolean) this.classWithPrimaryConstructor$delegate.getValue(this, $$delegatedProperties[7])).booleanValue();
    }

    @NotNull
    public ClassifierNamePolicy getClassifierNamePolicy() {
        return (ClassifierNamePolicy) this.classifierNamePolicy$delegate.getValue(this, $$delegatedProperties[0]);
    }

    public boolean getDebugMode() {
        return ((Boolean) this.debugMode$delegate.getValue(this, $$delegatedProperties[6])).booleanValue();
    }

    @Nullable
    public Function1<ValueParameterDescriptor, String> getDefaultParameterValueRenderer() {
        return (Function1) this.defaultParameterValueRenderer$delegate.getValue(this, $$delegatedProperties[18]);
    }

    @NotNull
    public Set<FqName> getExcludedAnnotationClasses() {
        return (Set) this.excludedAnnotationClasses$delegate.getValue(this, $$delegatedProperties[28]);
    }

    @NotNull
    public Set<FqName> getExcludedTypeAnnotationClasses() {
        return (Set) this.excludedTypeAnnotationClasses$delegate.getValue(this, $$delegatedProperties[29]);
    }

    public boolean getIncludeAdditionalModifiers() {
        return ((Boolean) this.includeAdditionalModifiers$delegate.getValue(this, $$delegatedProperties[34])).booleanValue();
    }

    public boolean getIncludePropertyConstant() {
        return ((Boolean) this.includePropertyConstant$delegate.getValue(this, $$delegatedProperties[14])).booleanValue();
    }

    @NotNull
    public Set<DescriptorRendererModifier> getModifiers() {
        return (Set) this.modifiers$delegate.getValue(this, $$delegatedProperties[3]);
    }

    public boolean getNormalizedVisibilities() {
        return ((Boolean) this.normalizedVisibilities$delegate.getValue(this, $$delegatedProperties[11])).booleanValue();
    }

    @NotNull
    public OverrideRenderingPolicy getOverrideRenderingPolicy() {
        return (OverrideRenderingPolicy) this.overrideRenderingPolicy$delegate.getValue(this, $$delegatedProperties[20]);
    }

    @NotNull
    public ParameterNameRenderingPolicy getParameterNameRenderingPolicy() {
        return (ParameterNameRenderingPolicy) this.parameterNameRenderingPolicy$delegate.getValue(this, $$delegatedProperties[23]);
    }

    public boolean getParameterNamesInFunctionalTypes() {
        return ((Boolean) this.parameterNamesInFunctionalTypes$delegate.getValue(this, $$delegatedProperties[35])).booleanValue();
    }

    public boolean getReceiverAfterName() {
        return ((Boolean) this.receiverAfterName$delegate.getValue(this, $$delegatedProperties[24])).booleanValue();
    }

    public boolean getRenderAccessors() {
        return ((Boolean) this.renderAccessors$delegate.getValue(this, $$delegatedProperties[26])).booleanValue();
    }

    public boolean getRenderCompanionObjectName() {
        return ((Boolean) this.renderCompanionObjectName$delegate.getValue(this, $$delegatedProperties[25])).booleanValue();
    }

    public boolean getRenderConstructorKeyword() {
        return ((Boolean) this.renderConstructorKeyword$delegate.getValue(this, $$delegatedProperties[32])).booleanValue();
    }

    public boolean getRenderDefaultAnnotationArguments() {
        return ((Boolean) this.renderDefaultAnnotationArguments$delegate.getValue(this, $$delegatedProperties[27])).booleanValue();
    }

    public boolean getRenderDefaultVisibility() {
        return ((Boolean) this.renderDefaultVisibility$delegate.getValue(this, $$delegatedProperties[12])).booleanValue();
    }

    public boolean getRenderUnabbreviatedType() {
        return ((Boolean) this.renderUnabbreviatedType$delegate.getValue(this, $$delegatedProperties[33])).booleanValue();
    }

    public boolean getSecondaryConstructorsAsPrimary() {
        return ((Boolean) this.secondaryConstructorsAsPrimary$delegate.getValue(this, $$delegatedProperties[19])).booleanValue();
    }

    public boolean getStartFromDeclarationKeyword() {
        return ((Boolean) this.startFromDeclarationKeyword$delegate.getValue(this, $$delegatedProperties[5])).booleanValue();
    }

    public boolean getStartFromName() {
        return ((Boolean) this.startFromName$delegate.getValue(this, $$delegatedProperties[4])).booleanValue();
    }

    @NotNull
    public RenderingFormat getTextFormat() {
        return (RenderingFormat) this.textFormat$delegate.getValue(this, $$delegatedProperties[22]);
    }

    @NotNull
    public Function1<KotlinType, KotlinType> getTypeNormalizer() {
        return (Function1) this.typeNormalizer$delegate.getValue(this, $$delegatedProperties[17]);
    }

    public boolean getUninferredTypeParameterAsName() {
        return ((Boolean) this.uninferredTypeParameterAsName$delegate.getValue(this, $$delegatedProperties[13])).booleanValue();
    }

    public boolean getUnitReturnType() {
        return ((Boolean) this.unitReturnType$delegate.getValue(this, $$delegatedProperties[9])).booleanValue();
    }

    @NotNull
    public ValueParametersHandler getValueParametersHandler() {
        return (ValueParametersHandler) this.valueParametersHandler$delegate.getValue(this, $$delegatedProperties[21]);
    }

    public boolean getVerbose() {
        return ((Boolean) this.verbose$delegate.getValue(this, $$delegatedProperties[8])).booleanValue();
    }

    public boolean getWithDefinedIn() {
        return ((Boolean) this.withDefinedIn$delegate.getValue(this, $$delegatedProperties[1])).booleanValue();
    }

    public boolean getWithSourceFileForTopLevel() {
        return ((Boolean) this.withSourceFileForTopLevel$delegate.getValue(this, $$delegatedProperties[2])).booleanValue();
    }

    public boolean getWithoutReturnType() {
        return ((Boolean) this.withoutReturnType$delegate.getValue(this, $$delegatedProperties[10])).booleanValue();
    }

    public boolean getWithoutSuperTypes() {
        return ((Boolean) this.withoutSuperTypes$delegate.getValue(this, $$delegatedProperties[16])).booleanValue();
    }

    public boolean getWithoutTypeParameters() {
        return ((Boolean) this.withoutTypeParameters$delegate.getValue(this, $$delegatedProperties[15])).booleanValue();
    }

    public void setAnnotationArgumentsRenderingPolicy(@NotNull AnnotationArgumentsRenderingPolicy annotationArgumentsRenderingPolicy) {
        C2668g.b(annotationArgumentsRenderingPolicy, "<set-?>");
        this.annotationArgumentsRenderingPolicy$delegate.setValue(this, $$delegatedProperties[30], annotationArgumentsRenderingPolicy);
    }

    public void setClassifierNamePolicy(@NotNull ClassifierNamePolicy classifierNamePolicy) {
        C2668g.b(classifierNamePolicy, "<set-?>");
        this.classifierNamePolicy$delegate.setValue(this, $$delegatedProperties[0], classifierNamePolicy);
    }

    public void setDebugMode(boolean z) {
        this.debugMode$delegate.setValue(this, $$delegatedProperties[6], Boolean.valueOf(z));
    }

    public void setExcludedTypeAnnotationClasses(@NotNull Set<FqName> set) {
        C2668g.b(set, "<set-?>");
        this.excludedTypeAnnotationClasses$delegate.setValue(this, $$delegatedProperties[29], set);
    }

    public void setModifiers(@NotNull Set<? extends DescriptorRendererModifier> set) {
        C2668g.b(set, "<set-?>");
        this.modifiers$delegate.setValue(this, $$delegatedProperties[3], set);
    }

    public void setParameterNameRenderingPolicy(@NotNull ParameterNameRenderingPolicy parameterNameRenderingPolicy) {
        C2668g.b(parameterNameRenderingPolicy, "<set-?>");
        this.parameterNameRenderingPolicy$delegate.setValue(this, $$delegatedProperties[23], parameterNameRenderingPolicy);
    }

    public void setReceiverAfterName(boolean z) {
        this.receiverAfterName$delegate.setValue(this, $$delegatedProperties[24], Boolean.valueOf(z));
    }

    public void setRenderCompanionObjectName(boolean z) {
        this.renderCompanionObjectName$delegate.setValue(this, $$delegatedProperties[25], Boolean.valueOf(z));
    }

    public void setStartFromName(boolean z) {
        this.startFromName$delegate.setValue(this, $$delegatedProperties[4], Boolean.valueOf(z));
    }

    public void setTextFormat(@NotNull RenderingFormat renderingFormat) {
        C2668g.b(renderingFormat, "<set-?>");
        this.textFormat$delegate.setValue(this, $$delegatedProperties[22], renderingFormat);
    }

    public void setVerbose(boolean z) {
        this.verbose$delegate.setValue(this, $$delegatedProperties[8], Boolean.valueOf(z));
    }

    public void setWithDefinedIn(boolean z) {
        this.withDefinedIn$delegate.setValue(this, $$delegatedProperties[1], Boolean.valueOf(z));
    }

    public void setWithoutSuperTypes(boolean z) {
        this.withoutSuperTypes$delegate.setValue(this, $$delegatedProperties[16], Boolean.valueOf(z));
    }

    public void setWithoutTypeParameters(boolean z) {
        this.withoutTypeParameters$delegate.setValue(this, $$delegatedProperties[15], Boolean.valueOf(z));
    }

    public boolean getIncludeAnnotationArguments() {
        return DefaultImpls.getIncludeAnnotationArguments(this);
    }

    public boolean getIncludeEmptyAnnotationArguments() {
        return DefaultImpls.getIncludeEmptyAnnotationArguments(this);
    }

    public final boolean isLocked() {
        return this.isLocked;
    }

    public final void lock() {
        int i = this.isLocked ^ 1;
        if (C15819j.f49018a && i == 0) {
            throw new AssertionError("Assertion failed");
        }
        this.isLocked = true;
    }

    @NotNull
    public final DescriptorRendererOptionsImpl copy() {
        DescriptorRendererOptionsImpl descriptorRendererOptionsImpl = new DescriptorRendererOptionsImpl();
        for (Field field : getClass().getDeclaredFields()) {
            C2668g.a(field, "field");
            if ((field.getModifiers() & 8) == 0) {
                field.setAccessible(true);
                Object obj = field.get(this);
                if (!(obj instanceof C17564c)) {
                    obj = null;
                }
                C17564c c17564c = (C17564c) obj;
                if (c17564c != null) {
                    String name = field.getName();
                    C2668g.a(name, "field.name");
                    int b = 1 ^ C19296q.m68678b(name, "is", false, 2, null);
                    if (C15819j.f49018a && b == 0) {
                        throw new AssertionError("Fields named is* are not supported here yet");
                    }
                    KDeclarationContainer a = C15825i.m59860a(DescriptorRendererOptionsImpl.class);
                    String name2 = field.getName();
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("get");
                    String name3 = field.getName();
                    C2668g.a(name3, "field.name");
                    stringBuilder.append(C19296q.m68681d(name3));
                    field.set(descriptorRendererOptionsImpl, descriptorRendererOptionsImpl.property(c17564c.getValue(this, new PropertyReference1Impl(a, name2, stringBuilder.toString()))));
                } else {
                    continue;
                }
            }
        }
        return descriptorRendererOptionsImpl;
    }

    private final <T> ReadWriteProperty<DescriptorRendererOptionsImpl, T> property(T t) {
        C15830a c15830a = C15830a.f49034a;
        return new DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(t, t, this);
    }
}
