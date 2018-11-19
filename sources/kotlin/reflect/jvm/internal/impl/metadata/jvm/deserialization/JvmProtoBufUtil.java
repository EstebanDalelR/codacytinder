package kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization;

import com.tinder.api.ManagerWebServices;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.C17554o;
import kotlin.collections.C18457p;
import kotlin.collections.C19299w;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.C2668g;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Constructor;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Package;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.ValueParameter;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.ProtoBufUtilKt;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.ProtoTypeTableUtilKt;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.JvmFieldSignature;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.JvmMethodSignature;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.JvmPropertySignature;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.StringTableTypes;
import kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessage;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.GeneratedExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class JvmProtoBufUtil {
    @NotNull
    private static final ExtensionRegistryLite EXTENSION_REGISTRY;
    public static final JvmProtoBufUtil INSTANCE = new JvmProtoBufUtil();

    public static final class PropertySignature {
        @NotNull
        private final String desc;
        @NotNull
        private final String name;

        @NotNull
        public final String component1() {
            return this.name;
        }

        @NotNull
        public final String component2() {
            return this.desc;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof PropertySignature) {
                    PropertySignature propertySignature = (PropertySignature) obj;
                    if (C2668g.a(this.name, propertySignature.name) && C2668g.a(this.desc, propertySignature.desc)) {
                    }
                }
                return false;
            }
            return true;
        }

        public int hashCode() {
            String str = this.name;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.desc;
            if (str2 != null) {
                i = str2.hashCode();
            }
            return hashCode + i;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("PropertySignature(name=");
            stringBuilder.append(this.name);
            stringBuilder.append(", desc=");
            stringBuilder.append(this.desc);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }

        public PropertySignature(@NotNull String str, @NotNull String str2) {
            C2668g.b(str, "name");
            C2668g.b(str2, "desc");
            this.name = str;
            this.desc = str2;
        }

        @NotNull
        public final String getName() {
            return this.name;
        }
    }

    static {
        ExtensionRegistryLite newInstance = ExtensionRegistryLite.newInstance();
        JvmProtoBuf.registerAllExtensions(newInstance);
        C2668g.a(newInstance, "ExtensionRegistryLite.ne…f::registerAllExtensions)");
        EXTENSION_REGISTRY = newInstance;
    }

    private JvmProtoBufUtil() {
    }

    @NotNull
    public final ExtensionRegistryLite getEXTENSION_REGISTRY() {
        return EXTENSION_REGISTRY;
    }

    @JvmStatic
    @NotNull
    public static final Pair<JvmNameResolver, Class> readClassDataFrom(@NotNull String[] strArr, @NotNull String[] strArr2) {
        C2668g.b(strArr, ManagerWebServices.FB_DATA);
        C2668g.b(strArr2, "strings");
        byte[] decodeBytes = BitEncoding.decodeBytes(strArr);
        C2668g.a(decodeBytes, "BitEncoding.decodeBytes(data)");
        return readClassDataFrom(decodeBytes, strArr2);
    }

    @JvmStatic
    @NotNull
    public static final Pair<JvmNameResolver, Class> readClassDataFrom(@NotNull byte[] bArr, @NotNull String[] strArr) {
        C2668g.b(bArr, "bytes");
        C2668g.b(strArr, "strings");
        InputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        return new Pair(INSTANCE.readNameResolver(byteArrayInputStream, strArr), Class.parseFrom(byteArrayInputStream, EXTENSION_REGISTRY));
    }

    @JvmStatic
    @NotNull
    public static final Pair<JvmNameResolver, Package> readPackageDataFrom(@NotNull String[] strArr, @NotNull String[] strArr2) {
        C2668g.b(strArr, ManagerWebServices.FB_DATA);
        C2668g.b(strArr2, "strings");
        byte[] decodeBytes = BitEncoding.decodeBytes(strArr);
        C2668g.a(decodeBytes, "BitEncoding.decodeBytes(data)");
        return readPackageDataFrom(decodeBytes, strArr2);
    }

    @JvmStatic
    @NotNull
    public static final Pair<JvmNameResolver, Package> readPackageDataFrom(@NotNull byte[] bArr, @NotNull String[] strArr) {
        C2668g.b(bArr, "bytes");
        C2668g.b(strArr, "strings");
        InputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        return new Pair(INSTANCE.readNameResolver(byteArrayInputStream, strArr), Package.parseFrom(byteArrayInputStream, EXTENSION_REGISTRY));
    }

    @JvmStatic
    @NotNull
    public static final Pair<JvmNameResolver, Function> readFunctionDataFrom(@NotNull String[] strArr, @NotNull String[] strArr2) {
        C2668g.b(strArr, ManagerWebServices.FB_DATA);
        C2668g.b(strArr2, "strings");
        InputStream byteArrayInputStream = new ByteArrayInputStream(BitEncoding.decodeBytes(strArr));
        return new Pair(INSTANCE.readNameResolver(byteArrayInputStream, strArr2), Function.parseFrom(byteArrayInputStream, EXTENSION_REGISTRY));
    }

    private final JvmNameResolver readNameResolver(@NotNull InputStream inputStream, String[] strArr) {
        inputStream = StringTableTypes.parseDelimitedFrom(inputStream, EXTENSION_REGISTRY);
        C2668g.a(inputStream, "JvmProtoBuf.StringTableT…this, EXTENSION_REGISTRY)");
        return new JvmNameResolver(inputStream, strArr);
    }

    @Nullable
    public final String getJvmMethodSignature(@NotNull Function function, @NotNull NameResolver nameResolver, @NotNull TypeTable typeTable) {
        C2668g.b(function, "proto");
        C2668g.b(nameResolver, "nameResolver");
        C2668g.b(typeTable, "typeTable");
        ExtendableMessage extendableMessage = function;
        GeneratedExtension generatedExtension = JvmProtoBuf.methodSignature;
        C2668g.a(generatedExtension, "JvmProtoBuf.methodSignature");
        JvmMethodSignature jvmMethodSignature = (JvmMethodSignature) ProtoBufUtilKt.getExtensionOrNull(extendableMessage, generatedExtension);
        int name = (jvmMethodSignature == null || !jvmMethodSignature.hasName()) ? function.getName() : jvmMethodSignature.getName();
        if (jvmMethodSignature == null || !jvmMethodSignature.hasDesc()) {
            Collection b = C17554o.m64197b((Object) ProtoTypeTableUtilKt.receiverType(function, typeTable));
            List valueParameterList = function.getValueParameterList();
            C2668g.a(valueParameterList, "proto.valueParameterList");
            Iterable<ValueParameter> iterable = valueParameterList;
            Collection arrayList = new ArrayList(C18457p.m66906a((Iterable) iterable, 10));
            for (ValueParameter valueParameter : iterable) {
                C2668g.a(valueParameter, "it");
                arrayList.add(ProtoTypeTableUtilKt.type(valueParameter, typeTable));
            }
            Iterable<Type> b2 = C19299w.m68809b(b, (Iterable) (List) arrayList);
            Collection arrayList2 = new ArrayList(C18457p.m66906a((Iterable) b2, 10));
            for (Type mapTypeDefault : b2) {
                String mapTypeDefault2 = INSTANCE.mapTypeDefault(mapTypeDefault, nameResolver);
                if (mapTypeDefault2 == null) {
                    return null;
                }
                arrayList2.add(mapTypeDefault2);
            }
            valueParameterList = (List) arrayList2;
            function = mapTypeDefault(ProtoTypeTableUtilKt.returnType(function, typeTable), nameResolver);
            if (function == null) {
                return null;
            }
            typeTable = new StringBuilder();
            typeTable.append(C19299w.m68797a(valueParameterList, "", "(", ")", 0, null, null, 56, null));
            typeTable.append(function);
            function = typeTable.toString();
        } else {
            function = nameResolver.getString(jvmMethodSignature.getDesc());
        }
        typeTable = new StringBuilder();
        typeTable.append(nameResolver.getString(name));
        typeTable.append(function);
        return typeTable.toString();
    }

    @Nullable
    public final String getJvmConstructorSignature(@NotNull Constructor constructor, @NotNull NameResolver nameResolver, @NotNull TypeTable typeTable) {
        C2668g.b(constructor, "proto");
        C2668g.b(nameResolver, "nameResolver");
        C2668g.b(typeTable, "typeTable");
        ExtendableMessage extendableMessage = constructor;
        GeneratedExtension generatedExtension = JvmProtoBuf.constructorSignature;
        C2668g.a(generatedExtension, "JvmProtoBuf.constructorSignature");
        JvmMethodSignature jvmMethodSignature = (JvmMethodSignature) ProtoBufUtilKt.getExtensionOrNull(extendableMessage, generatedExtension);
        if (jvmMethodSignature == null || !jvmMethodSignature.hasDesc()) {
            constructor = constructor.getValueParameterList();
            C2668g.a(constructor, "proto.valueParameterList");
            Iterable<ValueParameter> iterable = (Iterable) constructor;
            Collection arrayList = new ArrayList(C18457p.m66906a((Iterable) iterable, 10));
            for (ValueParameter valueParameter : iterable) {
                JvmProtoBufUtil jvmProtoBufUtil = INSTANCE;
                C2668g.a(valueParameter, "it");
                String mapTypeDefault = jvmProtoBufUtil.mapTypeDefault(ProtoTypeTableUtilKt.type(valueParameter, typeTable), nameResolver);
                if (mapTypeDefault == null) {
                    return null;
                }
                arrayList.add(mapTypeDefault);
            }
            constructor = C19299w.m68797a((List) arrayList, "", "(", ")V", 0, null, null, 56, null);
        } else {
            constructor = nameResolver.getString(jvmMethodSignature.getDesc());
        }
        nameResolver = new StringBuilder();
        nameResolver.append("<init>");
        nameResolver.append(constructor);
        return nameResolver.toString();
    }

    @Nullable
    public final PropertySignature getJvmFieldSignature(@NotNull Property property, @NotNull NameResolver nameResolver, @NotNull TypeTable typeTable) {
        C2668g.b(property, "proto");
        C2668g.b(nameResolver, "nameResolver");
        C2668g.b(typeTable, "typeTable");
        ExtendableMessage extendableMessage = property;
        GeneratedExtension generatedExtension = JvmProtoBuf.propertySignature;
        C2668g.a(generatedExtension, "JvmProtoBuf.propertySignature");
        JvmPropertySignature jvmPropertySignature = (JvmPropertySignature) ProtoBufUtilKt.getExtensionOrNull(extendableMessage, generatedExtension);
        if (jvmPropertySignature == null) {
            return null;
        }
        JvmFieldSignature field = jvmPropertySignature.hasField() ? jvmPropertySignature.getField() : null;
        int name = (field == null || !field.hasName()) ? property.getName() : field.getName();
        if (field == null || !field.hasDesc()) {
            property = mapTypeDefault(ProtoTypeTableUtilKt.returnType(property, typeTable), nameResolver);
            if (property == null) {
                return null;
            }
        }
        property = nameResolver.getString(field.getDesc());
        return new PropertySignature(nameResolver.getString(name), property);
    }

    private final String mapTypeDefault(Type type, NameResolver nameResolver) {
        return type.hasClassName() ? ClassMapperLite.mapClass(nameResolver.getQualifiedClassName(type.getClassName())) : null;
    }
}
