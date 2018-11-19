package kotlin.reflect.jvm.internal;

import com.google.android.gms.ads.reward.mediation.MediationRewardedVideoAdAdapter;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C19299w;
import kotlin.jvm.internal.C2668g;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u000e\u0010\t\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\nJ\u000e\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\nJ\u000e\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u000fJ\u000e\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0011J\u000e\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0014J\u000e\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u0017J\u001a\u0010\u0018\u001a\u00020\u0019*\u00060\u001aj\u0002`\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0002J\u0018\u0010\u001e\u001a\u00020\u0019*\u00060\u001aj\u0002`\u001b2\u0006\u0010\u001f\u001a\u00020\bH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006 "}, d2 = {"Lkotlin/reflect/jvm/internal/ReflectionObjectRenderer;", "", "()V", "renderer", "Lkotlin/reflect/jvm/internal/impl/renderer/DescriptorRenderer;", "renderCallable", "", "descriptor", "Lkotlin/reflect/jvm/internal/impl/descriptors/CallableDescriptor;", "renderFunction", "Lkotlin/reflect/jvm/internal/impl/descriptors/FunctionDescriptor;", "renderLambda", "invoke", "renderParameter", "parameter", "Lkotlin/reflect/jvm/internal/KParameterImpl;", "renderProperty", "Lkotlin/reflect/jvm/internal/impl/descriptors/PropertyDescriptor;", "renderType", "type", "Lkotlin/reflect/jvm/internal/impl/types/KotlinType;", "renderTypeParameter", "typeParameter", "Lkotlin/reflect/jvm/internal/impl/descriptors/TypeParameterDescriptor;", "appendReceiverType", "", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "receiver", "Lkotlin/reflect/jvm/internal/impl/descriptors/ReceiverParameterDescriptor;", "appendReceivers", "callable", "kotlin-reflection"}, k = 1, mv = {1, 1, 10})
public final class ReflectionObjectRenderer {
    public static final ReflectionObjectRenderer INSTANCE = new ReflectionObjectRenderer();
    private static final DescriptorRenderer renderer = DescriptorRenderer.FQ_NAMES_IN_TYPES;

    private ReflectionObjectRenderer() {
    }

    private final void appendReceiverType(@NotNull StringBuilder stringBuilder, ReceiverParameterDescriptor receiverParameterDescriptor) {
        if (receiverParameterDescriptor != null) {
            receiverParameterDescriptor = receiverParameterDescriptor.getType();
            C2668g.a(receiverParameterDescriptor, "receiver.type");
            stringBuilder.append(renderType(receiverParameterDescriptor));
            stringBuilder.append(".");
        }
    }

    private final void appendReceivers(@NotNull StringBuilder stringBuilder, CallableDescriptor callableDescriptor) {
        ReceiverParameterDescriptor dispatchReceiverParameter = callableDescriptor.getDispatchReceiverParameter();
        callableDescriptor = callableDescriptor.getExtensionReceiverParameter();
        appendReceiverType(stringBuilder, dispatchReceiverParameter);
        Object obj = (dispatchReceiverParameter == null || callableDescriptor == null) ? null : 1;
        if (obj != null) {
            stringBuilder.append("(");
        }
        appendReceiverType(stringBuilder, callableDescriptor);
        if (obj != null) {
            stringBuilder.append(")");
        }
    }

    @NotNull
    public final String renderCallable(@NotNull CallableDescriptor callableDescriptor) {
        C2668g.b(callableDescriptor, "descriptor");
        if (callableDescriptor instanceof PropertyDescriptor) {
            return renderProperty((PropertyDescriptor) callableDescriptor);
        }
        if (callableDescriptor instanceof FunctionDescriptor) {
            return renderFunction((FunctionDescriptor) callableDescriptor);
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Illegal callable: ");
        stringBuilder.append(callableDescriptor);
        throw new IllegalStateException(stringBuilder.toString().toString());
    }

    @NotNull
    public final String renderProperty(@NotNull PropertyDescriptor propertyDescriptor) {
        C2668g.b(propertyDescriptor, "descriptor");
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(propertyDescriptor.isVar() ? "var " : "val ");
        INSTANCE.appendReceivers(stringBuilder, propertyDescriptor);
        DescriptorRenderer descriptorRenderer = renderer;
        Name name = propertyDescriptor.getName();
        C2668g.a(name, "descriptor.name");
        stringBuilder.append(descriptorRenderer.renderName(name));
        stringBuilder.append(": ");
        ReflectionObjectRenderer reflectionObjectRenderer = INSTANCE;
        propertyDescriptor = propertyDescriptor.getType();
        C2668g.a(propertyDescriptor, "descriptor.type");
        stringBuilder.append(reflectionObjectRenderer.renderType(propertyDescriptor));
        propertyDescriptor = stringBuilder.toString();
        C2668g.a(propertyDescriptor, "StringBuilder().apply(builderAction).toString()");
        return propertyDescriptor;
    }

    @NotNull
    public final String renderFunction(@NotNull FunctionDescriptor functionDescriptor) {
        C2668g.b(functionDescriptor, "descriptor");
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("fun ");
        INSTANCE.appendReceivers(stringBuilder, functionDescriptor);
        DescriptorRenderer descriptorRenderer = renderer;
        Name name = functionDescriptor.getName();
        C2668g.a(name, "descriptor.name");
        stringBuilder.append(descriptorRenderer.renderName(name));
        List valueParameters = functionDescriptor.getValueParameters();
        C2668g.a(valueParameters, "descriptor.valueParameters");
        C19299w.m68794a(valueParameters, stringBuilder, ", ", "(", ")", 0, null, ReflectionObjectRenderer$renderFunction$1$1.INSTANCE, 48, null);
        stringBuilder.append(": ");
        ReflectionObjectRenderer reflectionObjectRenderer = INSTANCE;
        functionDescriptor = functionDescriptor.getReturnType();
        if (functionDescriptor == null) {
            C2668g.a();
        }
        C2668g.a(functionDescriptor, "descriptor.returnType!!");
        stringBuilder.append(reflectionObjectRenderer.renderType(functionDescriptor));
        functionDescriptor = stringBuilder.toString();
        C2668g.a(functionDescriptor, "StringBuilder().apply(builderAction).toString()");
        return functionDescriptor;
    }

    @NotNull
    public final String renderLambda(@NotNull FunctionDescriptor functionDescriptor) {
        C2668g.b(functionDescriptor, "invoke");
        StringBuilder stringBuilder = new StringBuilder();
        INSTANCE.appendReceivers(stringBuilder, functionDescriptor);
        List valueParameters = functionDescriptor.getValueParameters();
        C2668g.a(valueParameters, "invoke.valueParameters");
        C19299w.m68794a(valueParameters, stringBuilder, ", ", "(", ")", 0, null, ReflectionObjectRenderer$renderLambda$1$1.INSTANCE, 48, null);
        stringBuilder.append(" -> ");
        ReflectionObjectRenderer reflectionObjectRenderer = INSTANCE;
        functionDescriptor = functionDescriptor.getReturnType();
        if (functionDescriptor == null) {
            C2668g.a();
        }
        C2668g.a(functionDescriptor, "invoke.returnType!!");
        stringBuilder.append(reflectionObjectRenderer.renderType(functionDescriptor));
        functionDescriptor = stringBuilder.toString();
        C2668g.a(functionDescriptor, "StringBuilder().apply(builderAction).toString()");
        return functionDescriptor;
    }

    @NotNull
    public final String renderParameter(@NotNull KParameterImpl kParameterImpl) {
        C2668g.b(kParameterImpl, MediationRewardedVideoAdAdapter.CUSTOM_EVENT_SERVER_PARAMETER_FIELD);
        StringBuilder stringBuilder = new StringBuilder();
        switch (kParameterImpl.getKind()) {
            case EXTENSION_RECEIVER:
                stringBuilder.append("extension receiver");
                break;
            case INSTANCE:
                stringBuilder.append("instance");
                break;
            case VALUE:
                StringBuilder stringBuilder2 = new StringBuilder();
                stringBuilder2.append("parameter #");
                stringBuilder2.append(kParameterImpl.getIndex());
                stringBuilder2.append(' ');
                stringBuilder2.append(kParameterImpl.getName());
                stringBuilder.append(stringBuilder2.toString());
                break;
            default:
                break;
        }
        stringBuilder.append(" of ");
        stringBuilder.append(INSTANCE.renderCallable(kParameterImpl.getCallable().getDescriptor()));
        kParameterImpl = stringBuilder.toString();
        C2668g.a(kParameterImpl, "StringBuilder().apply(builderAction).toString()");
        return kParameterImpl;
    }

    @NotNull
    public final String renderTypeParameter(@NotNull TypeParameterDescriptor typeParameterDescriptor) {
        C2668g.b(typeParameterDescriptor, "typeParameter");
        StringBuilder stringBuilder = new StringBuilder();
        switch (typeParameterDescriptor.getVariance()) {
            case INVARIANT:
                break;
            case IN_VARIANCE:
                stringBuilder.append("in ");
                break;
            case OUT_VARIANCE:
                stringBuilder.append("out ");
                break;
            default:
                break;
        }
        stringBuilder.append(typeParameterDescriptor.getName());
        typeParameterDescriptor = stringBuilder.toString();
        C2668g.a(typeParameterDescriptor, "StringBuilder().apply(builderAction).toString()");
        return typeParameterDescriptor;
    }

    @NotNull
    public final String renderType(@NotNull KotlinType kotlinType) {
        C2668g.b(kotlinType, "type");
        return renderer.renderType(kotlinType);
    }
}
