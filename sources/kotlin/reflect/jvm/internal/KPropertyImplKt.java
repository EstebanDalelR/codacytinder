package kotlin.reflect.jvm.internal;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.reflect.jvm.internal.FunctionCaller.BoundInstanceMethod;
import kotlin.reflect.jvm.internal.FunctionCaller.BoundJvmStaticInObject;
import kotlin.reflect.jvm.internal.FunctionCaller.BoundStaticMethod;
import kotlin.reflect.jvm.internal.FunctionCaller.InstanceMethod;
import kotlin.reflect.jvm.internal.FunctionCaller.JvmStaticInObject;
import kotlin.reflect.jvm.internal.FunctionCaller.StaticMethod;
import kotlin.reflect.jvm.internal.FunctionCaller.ThrowingCaller;
import kotlin.reflect.jvm.internal.JvmPropertySignature.JavaField;
import kotlin.reflect.jvm.internal.JvmPropertySignature.JavaMethodProperty;
import kotlin.reflect.jvm.internal.JvmPropertySignature.KotlinProperty;
import kotlin.reflect.jvm.internal.KPropertyImpl.Accessor;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.JvmPropertySignature;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u001a \u0010\u0000\u001a\u0006\u0012\u0002\b\u00030\u0001*\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0002¨\u0006\u0005"}, d2 = {"computeCallerForAccessor", "Lkotlin/reflect/jvm/internal/FunctionCaller;", "Lkotlin/reflect/jvm/internal/KPropertyImpl$Accessor;", "isGetter", "", "kotlin-reflection"}, k = 2, mv = {1, 1, 10})
public final class KPropertyImplKt {
    private static final FunctionCaller<?> computeCallerForAccessor(@NotNull Accessor<?, ?> accessor, boolean z) {
        if (KDeclarationContainerImpl.Companion.getLOCAL_PROPERTY_SIGNATURE$kotlin_reflection().m59921a(accessor.getProperty().getSignature())) {
            return (FunctionCaller) ThrowingCaller.INSTANCE;
        }
        KPropertyImplKt$computeCallerForAccessor$1 kPropertyImplKt$computeCallerForAccessor$1 = new KPropertyImplKt$computeCallerForAccessor$1(accessor);
        KPropertyImplKt$computeCallerForAccessor$2 kPropertyImplKt$computeCallerForAccessor$2 = new KPropertyImplKt$computeCallerForAccessor$2(accessor);
        KPropertyImplKt$computeCallerForAccessor$4 kPropertyImplKt$computeCallerForAccessor$4 = new KPropertyImplKt$computeCallerForAccessor$4(accessor, kPropertyImplKt$computeCallerForAccessor$1, z, new KPropertyImplKt$computeCallerForAccessor$3(accessor), kPropertyImplKt$computeCallerForAccessor$2);
        JvmPropertySignature mapPropertySignature = RuntimeTypeMapper.INSTANCE.mapPropertySignature(accessor.getProperty().getDescriptor());
        if (mapPropertySignature instanceof KotlinProperty) {
            Field javaField;
            StringBuilder stringBuilder;
            KotlinProperty kotlinProperty = (KotlinProperty) mapPropertySignature;
            JvmPropertySignature signature = kotlinProperty.getSignature();
            Method method = null;
            if (z) {
                if (signature.hasGetter()) {
                    z = signature.getGetter();
                    if (z) {
                        method = accessor.getProperty().getContainer().findMethodBySignature(kotlinProperty.getNameResolver().getString(z.getName()), kotlinProperty.getNameResolver().getString(z.getDesc()), UtilKt.isPublicInBytecode(accessor.getDescriptor()));
                    }
                    if (method != null) {
                        javaField = accessor.getProperty().getJavaField();
                        if (javaField == true) {
                            accessor = kPropertyImplKt$computeCallerForAccessor$4.invoke(javaField);
                        } else {
                            stringBuilder = new StringBuilder();
                            stringBuilder.append("No accessors or field is found for property ");
                            stringBuilder.append(accessor.getProperty());
                            throw ((Throwable) new KotlinReflectionInternalError(stringBuilder.toString()));
                        }
                    } else if (Modifier.isStatic(method.getModifiers())) {
                        if (accessor.isBound()) {
                            z = (FunctionCaller.Method) new BoundInstanceMethod(method, accessor.getProperty().getBoundReceiver());
                        } else {
                            z = (FunctionCaller.Method) new InstanceMethod(method);
                        }
                        accessor = (FunctionCaller) z;
                    } else if (kPropertyImplKt$computeCallerForAccessor$2.invoke()) {
                        if (accessor.isBound() != null) {
                            accessor = (FunctionCaller.Method) new BoundJvmStaticInObject(method);
                        } else {
                            accessor = (FunctionCaller.Method) new JvmStaticInObject(method);
                        }
                        accessor = (FunctionCaller) accessor;
                    } else {
                        if (accessor.isBound()) {
                            z = (FunctionCaller.Method) new BoundStaticMethod(method, accessor.getProperty().getBoundReceiver());
                        } else {
                            z = (FunctionCaller.Method) new StaticMethod(method);
                        }
                        accessor = (FunctionCaller) z;
                    }
                }
            } else if (signature.hasSetter()) {
                z = signature.getSetter();
                if (z) {
                    method = accessor.getProperty().getContainer().findMethodBySignature(kotlinProperty.getNameResolver().getString(z.getName()), kotlinProperty.getNameResolver().getString(z.getDesc()), UtilKt.isPublicInBytecode(accessor.getDescriptor()));
                }
                if (method != null) {
                    javaField = accessor.getProperty().getJavaField();
                    if (javaField == true) {
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("No accessors or field is found for property ");
                        stringBuilder.append(accessor.getProperty());
                        throw ((Throwable) new KotlinReflectionInternalError(stringBuilder.toString()));
                    }
                    accessor = kPropertyImplKt$computeCallerForAccessor$4.invoke(javaField);
                } else if (Modifier.isStatic(method.getModifiers())) {
                    if (accessor.isBound()) {
                        z = (FunctionCaller.Method) new InstanceMethod(method);
                    } else {
                        z = (FunctionCaller.Method) new BoundInstanceMethod(method, accessor.getProperty().getBoundReceiver());
                    }
                    accessor = (FunctionCaller) z;
                } else if (kPropertyImplKt$computeCallerForAccessor$2.invoke()) {
                    if (accessor.isBound()) {
                        z = (FunctionCaller.Method) new StaticMethod(method);
                    } else {
                        z = (FunctionCaller.Method) new BoundStaticMethod(method, accessor.getProperty().getBoundReceiver());
                    }
                    accessor = (FunctionCaller) z;
                } else {
                    if (accessor.isBound() != null) {
                        accessor = (FunctionCaller.Method) new JvmStaticInObject(method);
                    } else {
                        accessor = (FunctionCaller.Method) new BoundJvmStaticInObject(method);
                    }
                    accessor = (FunctionCaller) accessor;
                }
            }
            z = false;
            if (z) {
                method = accessor.getProperty().getContainer().findMethodBySignature(kotlinProperty.getNameResolver().getString(z.getName()), kotlinProperty.getNameResolver().getString(z.getDesc()), UtilKt.isPublicInBytecode(accessor.getDescriptor()));
            }
            if (method != null) {
                javaField = accessor.getProperty().getJavaField();
                if (javaField == true) {
                    accessor = kPropertyImplKt$computeCallerForAccessor$4.invoke(javaField);
                } else {
                    stringBuilder = new StringBuilder();
                    stringBuilder.append("No accessors or field is found for property ");
                    stringBuilder.append(accessor.getProperty());
                    throw ((Throwable) new KotlinReflectionInternalError(stringBuilder.toString()));
                }
            } else if (Modifier.isStatic(method.getModifiers())) {
                if (accessor.isBound()) {
                    z = (FunctionCaller.Method) new BoundInstanceMethod(method, accessor.getProperty().getBoundReceiver());
                } else {
                    z = (FunctionCaller.Method) new InstanceMethod(method);
                }
                accessor = (FunctionCaller) z;
            } else if (kPropertyImplKt$computeCallerForAccessor$2.invoke()) {
                if (accessor.isBound() != null) {
                    accessor = (FunctionCaller.Method) new BoundJvmStaticInObject(method);
                } else {
                    accessor = (FunctionCaller.Method) new JvmStaticInObject(method);
                }
                accessor = (FunctionCaller) accessor;
            } else {
                if (accessor.isBound()) {
                    z = (FunctionCaller.Method) new BoundStaticMethod(method, accessor.getProperty().getBoundReceiver());
                } else {
                    z = (FunctionCaller.Method) new StaticMethod(method);
                }
                accessor = (FunctionCaller) z;
            }
        } else if (mapPropertySignature instanceof JavaField) {
            accessor = kPropertyImplKt$computeCallerForAccessor$4.invoke(((JavaField) mapPropertySignature).getField());
        } else if (mapPropertySignature instanceof JavaMethodProperty) {
            FunctionCaller.Method boundInstanceMethod;
            if (z) {
                z = ((JavaMethodProperty) mapPropertySignature).getGetterMethod();
            } else {
                JavaMethodProperty javaMethodProperty = (JavaMethodProperty) mapPropertySignature;
                z = javaMethodProperty.getSetterMethod();
                if (!z) {
                    z = new StringBuilder();
                    z.append("No source found for setter of Java method property: ");
                    z.append(javaMethodProperty.getGetterMethod());
                    throw ((Throwable) new KotlinReflectionInternalError(z.toString()));
                }
            }
            if (accessor.isBound()) {
                boundInstanceMethod = new BoundInstanceMethod(z, accessor.getProperty().getBoundReceiver());
            } else {
                boundInstanceMethod = (FunctionCaller.Method) new InstanceMethod(z);
            }
            accessor = boundInstanceMethod;
        } else {
            throw new NoWhenBranchMatchedException();
        }
        return accessor;
    }
}
