package kotlin.reflect.jvm.internal;

import com.tinder.api.ManagerWebServices;
import java.lang.reflect.Field;
import kotlin.C15813i;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C15825i;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.CallableReference;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.KFunction;
import kotlin.reflect.KProperty;
import kotlin.reflect.full.IllegalPropertyDelegateAccessException;
import kotlin.reflect.jvm.internal.ReflectProperties.LazySoftVal;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyAccessorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyGetterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertySetterDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0006\b \u0018\u0000 ;*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u0002H\u00010\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003:\u0004:;<=B)\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u000bB\u0017\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0002\u0010\u000eB3\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u0010J\n\u00101\u001a\u0004\u0018\u00010*H\u0004J\u0013\u00102\u001a\u00020%2\b\u00103\u001a\u0004\u0018\u00010\nH\u0002J\u001e\u00104\u001a\u0004\u0018\u00010\n2\b\u00105\u001a\u0004\u0018\u00010*2\b\u00106\u001a\u0004\u0018\u00010\nH\u0004J\b\u00107\u001a\u000208H\u0016J\b\u00109\u001a\u00020\u0007H\u0016R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0013\u001a\u0006\u0012\u0002\b\u00030\u00148VX\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0019\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00148VX\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0016R\u0014\u0010\f\u001a\u00020\r8VX\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u001c\u0010\u001d\u001a\u0010\u0012\f\u0012\n \u001f*\u0004\u0018\u00010\r0\r0\u001eX\u0004¢\u0006\u0002\n\u0000R\u0018\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00000!X¦\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#R\u0014\u0010$\u001a\u00020%8VX\u0004¢\u0006\u0006\u001a\u0004\b$\u0010&R\u0014\u0010'\u001a\u00020%8VX\u0004¢\u0006\u0006\u001a\u0004\b'\u0010&R\u0014\u0010(\u001a\u00020%8VX\u0004¢\u0006\u0006\u001a\u0004\b(\u0010&R\u0013\u0010)\u001a\u0004\u0018\u00010*8F¢\u0006\u0006\u001a\u0004\b+\u0010,R\u0016\u0010-\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010*0\u001eX\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\b\n\u0000\u001a\u0004\b.\u0010/R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b0\u0010/¨\u0006>"}, d2 = {"Lkotlin/reflect/jvm/internal/KPropertyImpl;", "R", "Lkotlin/reflect/jvm/internal/KCallableImpl;", "Lkotlin/reflect/KProperty;", "container", "Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", "name", "", "signature", "boundReceiver", "", "(Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V", "descriptor", "Lkotlin/reflect/jvm/internal/impl/descriptors/PropertyDescriptor;", "(Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;)V", "descriptorInitialValue", "(Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;Ljava/lang/String;Ljava/lang/String;Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;Ljava/lang/Object;)V", "getBoundReceiver", "()Ljava/lang/Object;", "caller", "Lkotlin/reflect/jvm/internal/FunctionCaller;", "getCaller", "()Lkotlin/reflect/jvm/internal/FunctionCaller;", "getContainer", "()Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", "defaultCaller", "getDefaultCaller", "getDescriptor", "()Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;", "descriptor_", "Lkotlin/reflect/jvm/internal/ReflectProperties$LazySoftVal;", "kotlin.jvm.PlatformType", "getter", "Lkotlin/reflect/jvm/internal/KPropertyImpl$Getter;", "getGetter", "()Lkotlin/reflect/jvm/internal/KPropertyImpl$Getter;", "isBound", "", "()Z", "isConst", "isLateinit", "javaField", "Ljava/lang/reflect/Field;", "getJavaField", "()Ljava/lang/reflect/Field;", "javaField_", "getName", "()Ljava/lang/String;", "getSignature", "computeDelegateField", "equals", "other", "getDelegate", "field", "receiver", "hashCode", "", "toString", "Accessor", "Companion", "Getter", "Setter", "kotlin-reflection"}, k = 1, mv = {1, 1, 10})
public abstract class KPropertyImpl<R> extends KCallableImpl<R> implements KProperty<R> {
    public static final Companion Companion = new Companion();
    @NotNull
    private static final Object EXTENSION_PROPERTY_DELEGATE = new Object();
    @Nullable
    private final Object boundReceiver;
    @NotNull
    private final KDeclarationContainerImpl container;
    private final LazySoftVal<PropertyDescriptor> descriptor_;
    private final LazySoftVal<Field> javaField_;
    @NotNull
    private final String name;
    @NotNull
    private final String signature;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lkotlin/reflect/jvm/internal/KPropertyImpl$Companion;", "", "()V", "EXTENSION_PROPERTY_DELEGATE", "getEXTENSION_PROPERTY_DELEGATE", "()Ljava/lang/Object;", "kotlin-reflection"}, k = 1, mv = {1, 1, 10})
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final Object getEXTENSION_PROPERTY_DELEGATE() {
            return KPropertyImpl.EXTENSION_PROPERTY_DELEGATE;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u0000*\u0006\b\u0001\u0010\u0001 \u0001*\u0006\b\u0002\u0010\u0002 \u00012\b\u0012\u0004\u0012\u0002H\u00020\u00032\b\u0012\u0004\u0012\u0002H\u00010\u00042\b\u0012\u0004\u0012\u0002H\u00020\u0005B\u0005¢\u0006\u0002\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\b8VX\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\b\u0012\u0002\b\u0003\u0018\u00010\f8VX\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0012\u0010\u000f\u001a\u00020\u0010X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\u00020\u00148VX\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0015R\u0014\u0010\u0016\u001a\u00020\u00148VX\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\u00148VX\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0015R\u0014\u0010\u0018\u001a\u00020\u00148VX\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0015R\u0014\u0010\u0019\u001a\u00020\u00148VX\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0015R\u0014\u0010\u001a\u001a\u00020\u00148VX\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0015R\u0018\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00010\u001cX¦\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Lkotlin/reflect/jvm/internal/KPropertyImpl$Accessor;", "PropertyType", "ReturnType", "Lkotlin/reflect/jvm/internal/KCallableImpl;", "Lkotlin/reflect/KProperty$Accessor;", "Lkotlin/reflect/KFunction;", "()V", "container", "Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", "getContainer", "()Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", "defaultCaller", "Lkotlin/reflect/jvm/internal/FunctionCaller;", "getDefaultCaller", "()Lkotlin/reflect/jvm/internal/FunctionCaller;", "descriptor", "Lkotlin/reflect/jvm/internal/impl/descriptors/PropertyAccessorDescriptor;", "getDescriptor", "()Lorg/jetbrains/kotlin/descriptors/PropertyAccessorDescriptor;", "isBound", "", "()Z", "isExternal", "isInfix", "isInline", "isOperator", "isSuspend", "property", "Lkotlin/reflect/jvm/internal/KPropertyImpl;", "getProperty", "()Lkotlin/reflect/jvm/internal/KPropertyImpl;", "kotlin-reflection"}, k = 1, mv = {1, 1, 10})
    public static abstract class Accessor<PropertyType, ReturnType> extends KCallableImpl<ReturnType> implements KFunction<ReturnType>, kotlin.reflect.KProperty.Accessor<PropertyType> {
        @Nullable
        public FunctionCaller<?> getDefaultCaller() {
            return null;
        }

        @NotNull
        public abstract PropertyAccessorDescriptor getDescriptor();

        @NotNull
        public abstract KPropertyImpl<PropertyType> getProperty();

        @NotNull
        public KDeclarationContainerImpl getContainer() {
            return getProperty().getContainer();
        }

        public boolean isBound() {
            return getProperty().isBound();
        }

        public boolean isInline() {
            return getDescriptor().isInline();
        }

        public boolean isExternal() {
            return getDescriptor().isExternal();
        }

        public boolean isOperator() {
            return getDescriptor().isOperator();
        }

        public boolean isInfix() {
            return getDescriptor().isInfix();
        }

        public boolean isSuspend() {
            return getDescriptor().isSuspend();
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\b&\u0018\u0000*\u0006\b\u0001\u0010\u0001 \u00012\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00010\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B\u0005¢\u0006\u0002\u0010\u0004R\u001f\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00068VX\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\u000b\u001a\u00020\f8VX\u0002¢\u0006\f\n\u0004\b\u000f\u0010\n\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u00118VX\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lkotlin/reflect/jvm/internal/KPropertyImpl$Getter;", "R", "Lkotlin/reflect/jvm/internal/KPropertyImpl$Accessor;", "Lkotlin/reflect/KProperty$Getter;", "()V", "caller", "Lkotlin/reflect/jvm/internal/FunctionCaller;", "getCaller", "()Lkotlin/reflect/jvm/internal/FunctionCaller;", "caller$delegate", "Lkotlin/reflect/jvm/internal/ReflectProperties$LazySoftVal;", "descriptor", "Lkotlin/reflect/jvm/internal/impl/descriptors/PropertyGetterDescriptor;", "getDescriptor", "()Lorg/jetbrains/kotlin/descriptors/PropertyGetterDescriptor;", "descriptor$delegate", "name", "", "getName", "()Ljava/lang/String;", "kotlin-reflection"}, k = 1, mv = {1, 1, 10})
    public static abstract class Getter<R> extends Accessor<R, R> implements kotlin.reflect.KProperty.Getter<R> {
        static final /* synthetic */ KProperty[] $$delegatedProperties = new KProperty[]{C15825i.m59867a(new PropertyReference1Impl(C15825i.m59860a(Getter.class), "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/PropertyGetterDescriptor;")), C15825i.m59867a(new PropertyReference1Impl(C15825i.m59860a(Getter.class), "caller", "getCaller()Lkotlin/reflect/jvm/internal/FunctionCaller;"))};
        @NotNull
        private final LazySoftVal caller$delegate = ReflectProperties.lazySoft(new KPropertyImpl$Getter$caller$2(this));
        @NotNull
        private final LazySoftVal descriptor$delegate = ReflectProperties.lazySoft(new KPropertyImpl$Getter$descriptor$2(this));

        @NotNull
        public FunctionCaller<?> getCaller() {
            return (FunctionCaller) this.caller$delegate.getValue(this, $$delegatedProperties[1]);
        }

        @NotNull
        public PropertyGetterDescriptor getDescriptor() {
            return (PropertyGetterDescriptor) this.descriptor$delegate.getValue(this, $$delegatedProperties[0]);
        }

        @NotNull
        public String getName() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("<get-");
            stringBuilder.append(getProperty().getName());
            stringBuilder.append('>');
            return stringBuilder.toString();
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\b&\u0018\u0000*\u0004\b\u0001\u0010\u00012\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u00020\u00030\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0004B\u0005¢\u0006\u0002\u0010\u0005R\u001f\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u00078VX\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR\u001b\u0010\f\u001a\u00020\r8VX\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u000b\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u00128VX\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lkotlin/reflect/jvm/internal/KPropertyImpl$Setter;", "R", "Lkotlin/reflect/jvm/internal/KPropertyImpl$Accessor;", "", "Lkotlin/reflect/KMutableProperty$Setter;", "()V", "caller", "Lkotlin/reflect/jvm/internal/FunctionCaller;", "getCaller", "()Lkotlin/reflect/jvm/internal/FunctionCaller;", "caller$delegate", "Lkotlin/reflect/jvm/internal/ReflectProperties$LazySoftVal;", "descriptor", "Lkotlin/reflect/jvm/internal/impl/descriptors/PropertySetterDescriptor;", "getDescriptor", "()Lorg/jetbrains/kotlin/descriptors/PropertySetterDescriptor;", "descriptor$delegate", "name", "", "getName", "()Ljava/lang/String;", "kotlin-reflection"}, k = 1, mv = {1, 1, 10})
    public static abstract class Setter<R> extends Accessor<R, C15813i> implements kotlin.reflect.KMutableProperty.Setter<R> {
        static final /* synthetic */ KProperty[] $$delegatedProperties = new KProperty[]{C15825i.m59867a(new PropertyReference1Impl(C15825i.m59860a(Setter.class), "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/PropertySetterDescriptor;")), C15825i.m59867a(new PropertyReference1Impl(C15825i.m59860a(Setter.class), "caller", "getCaller()Lkotlin/reflect/jvm/internal/FunctionCaller;"))};
        @NotNull
        private final LazySoftVal caller$delegate = ReflectProperties.lazySoft(new KPropertyImpl$Setter$caller$2(this));
        @NotNull
        private final LazySoftVal descriptor$delegate = ReflectProperties.lazySoft(new KPropertyImpl$Setter$descriptor$2(this));

        @NotNull
        public FunctionCaller<?> getCaller() {
            return (FunctionCaller) this.caller$delegate.getValue(this, $$delegatedProperties[1]);
        }

        @NotNull
        public PropertySetterDescriptor getDescriptor() {
            return (PropertySetterDescriptor) this.descriptor$delegate.getValue(this, $$delegatedProperties[0]);
        }

        @NotNull
        public String getName() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("<set-");
            stringBuilder.append(getProperty().getName());
            stringBuilder.append('>');
            return stringBuilder.toString();
        }
    }

    @NotNull
    public abstract Getter<R> getGetter();

    @NotNull
    public KDeclarationContainerImpl getContainer() {
        return this.container;
    }

    @NotNull
    public String getName() {
        return this.name;
    }

    @NotNull
    public final String getSignature() {
        return this.signature;
    }

    @Nullable
    public final Object getBoundReceiver() {
        return this.boundReceiver;
    }

    private KPropertyImpl(KDeclarationContainerImpl kDeclarationContainerImpl, String str, String str2, PropertyDescriptor propertyDescriptor, Object obj) {
        this.container = kDeclarationContainerImpl;
        this.name = str;
        this.signature = str2;
        this.boundReceiver = obj;
        this.javaField_ = ReflectProperties.lazySoft((Function0) new KPropertyImpl$javaField_$1(this));
        this.descriptor_ = ReflectProperties.lazySoft(propertyDescriptor, (Function0) new KPropertyImpl$descriptor_$1(this));
    }

    public KPropertyImpl(@NotNull KDeclarationContainerImpl kDeclarationContainerImpl, @NotNull String str, @NotNull String str2, @Nullable Object obj) {
        C2668g.b(kDeclarationContainerImpl, "container");
        C2668g.b(str, "name");
        C2668g.b(str2, ManagerWebServices.PARAM_SIGNATURE);
        this(kDeclarationContainerImpl, str, str2, null, obj);
    }

    public KPropertyImpl(@NotNull KDeclarationContainerImpl kDeclarationContainerImpl, @NotNull PropertyDescriptor propertyDescriptor) {
        C2668g.b(kDeclarationContainerImpl, "container");
        C2668g.b(propertyDescriptor, "descriptor");
        String asString = propertyDescriptor.getName().asString();
        C2668g.a(asString, "descriptor.name.asString()");
        this(kDeclarationContainerImpl, asString, RuntimeTypeMapper.INSTANCE.mapPropertySignature(propertyDescriptor).asString(), propertyDescriptor, CallableReference.NO_RECEIVER);
    }

    public boolean isBound() {
        return C2668g.a(this.boundReceiver, CallableReference.NO_RECEIVER) ^ 1;
    }

    @Nullable
    public final Field getJavaField() {
        return (Field) this.javaField_.invoke();
    }

    @Nullable
    protected final Field computeDelegateField() {
        return getDescriptor().isDelegated() ? getJavaField() : null;
    }

    @Nullable
    protected final Object getDelegate(@Nullable Field field, @Nullable Object obj) {
        try {
            if (obj != EXTENSION_PROPERTY_DELEGATE || getDescriptor().getExtensionReceiverParameter() != null) {
                return field != null ? field.get(obj) : null;
            } else {
                obj = new StringBuilder();
                obj.append('\'');
                obj.append(this);
                obj.append("' is not an extension property and thus getExtensionDelegate() ");
                obj.append("is not going to work, use getDelegate() instead");
                throw ((Throwable) new RuntimeException(obj.toString()));
            }
        } catch (Field field2) {
            throw ((Throwable) new IllegalPropertyDelegateAccessException(field2));
        }
    }

    @NotNull
    public PropertyDescriptor getDescriptor() {
        Object invoke = this.descriptor_.invoke();
        C2668g.a(invoke, "descriptor_()");
        return (PropertyDescriptor) invoke;
    }

    @NotNull
    public FunctionCaller<?> getCaller() {
        return getGetter().getCaller();
    }

    @Nullable
    public FunctionCaller<?> getDefaultCaller() {
        return getGetter().getDefaultCaller();
    }

    public boolean isLateinit() {
        return getDescriptor().isLateInit();
    }

    public boolean isConst() {
        return getDescriptor().isConst();
    }

    public boolean equals(@Nullable Object obj) {
        obj = UtilKt.asKPropertyImpl(obj);
        boolean z = false;
        if (obj == null) {
            return false;
        }
        if (C2668g.a(getContainer(), obj.getContainer()) && C2668g.a(getName(), obj.getName()) && C2668g.a(this.signature, obj.signature) && C2668g.a(this.boundReceiver, obj.boundReceiver) != null) {
            z = true;
        }
        return z;
    }

    public int hashCode() {
        return (((getContainer().hashCode() * 31) + getName().hashCode()) * 31) + this.signature.hashCode();
    }

    @NotNull
    public String toString() {
        return ReflectionObjectRenderer.INSTANCE.renderProperty(getDescriptor());
    }
}
