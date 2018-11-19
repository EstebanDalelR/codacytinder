package kotlin.reflect.jvm.internal.impl.builtins;

import kotlin.jvm.internal.C2668g;
import kotlin.reflect.jvm.internal.impl.metadata.builtins.BuiltInsProtoBuf;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.GeneratedExtension;
import kotlin.reflect.jvm.internal.impl.serialization.SerializerExtensionProtocol;
import kotlin.text.C19296q;
import org.jetbrains.annotations.NotNull;

public final class BuiltInSerializerProtocol extends SerializerExtensionProtocol {
    @NotNull
    private static final String BUILTINS_FILE_EXTENSION = "kotlin_builtins";
    public static final BuiltInSerializerProtocol INSTANCE = new BuiltInSerializerProtocol();

    private BuiltInSerializerProtocol() {
        ExtensionRegistryLite newInstance = ExtensionRegistryLite.newInstance();
        BuiltInsProtoBuf.registerAllExtensions(newInstance);
        C2668g.a(newInstance, "ExtensionRegistryLite.ne…sterAllExtensions(this) }");
        GeneratedExtension generatedExtension = BuiltInsProtoBuf.packageFqName;
        C2668g.a(generatedExtension, "BuiltInsProtoBuf.packageFqName");
        GeneratedExtension generatedExtension2 = BuiltInsProtoBuf.constructorAnnotation;
        C2668g.a(generatedExtension2, "BuiltInsProtoBuf.constructorAnnotation");
        GeneratedExtension generatedExtension3 = BuiltInsProtoBuf.classAnnotation;
        C2668g.a(generatedExtension3, "BuiltInsProtoBuf.classAnnotation");
        GeneratedExtension generatedExtension4 = BuiltInsProtoBuf.functionAnnotation;
        C2668g.a(generatedExtension4, "BuiltInsProtoBuf.functionAnnotation");
        GeneratedExtension generatedExtension5 = BuiltInsProtoBuf.propertyAnnotation;
        C2668g.a(generatedExtension5, "BuiltInsProtoBuf.propertyAnnotation");
        GeneratedExtension generatedExtension6 = BuiltInsProtoBuf.enumEntryAnnotation;
        C2668g.a(generatedExtension6, "BuiltInsProtoBuf.enumEntryAnnotation");
        GeneratedExtension generatedExtension7 = BuiltInsProtoBuf.compileTimeValue;
        C2668g.a(generatedExtension7, "BuiltInsProtoBuf.compileTimeValue");
        GeneratedExtension generatedExtension8 = BuiltInsProtoBuf.parameterAnnotation;
        C2668g.a(generatedExtension8, "BuiltInsProtoBuf.parameterAnnotation");
        GeneratedExtension generatedExtension9 = BuiltInsProtoBuf.typeAnnotation;
        C2668g.a(generatedExtension9, "BuiltInsProtoBuf.typeAnnotation");
        GeneratedExtension generatedExtension10 = BuiltInsProtoBuf.typeParameterAnnotation;
        C2668g.a(generatedExtension10, "BuiltInsProtoBuf.typeParameterAnnotation");
        super(newInstance, generatedExtension, generatedExtension2, generatedExtension3, generatedExtension4, generatedExtension5, generatedExtension6, generatedExtension7, generatedExtension8, generatedExtension9, generatedExtension10);
    }

    @NotNull
    public final String getBuiltInsFilePath(@NotNull FqName fqName) {
        C2668g.b(fqName, "fqName");
        StringBuilder stringBuilder = new StringBuilder();
        String asString = fqName.asString();
        C2668g.a(asString, "fqName.asString()");
        stringBuilder.append(C19296q.m68670a(asString, '.', '/', false, 4, null));
        stringBuilder.append("/");
        stringBuilder.append(getBuiltInsFileName(fqName));
        return stringBuilder.toString();
    }

    @NotNull
    public final String getBuiltInsFileName(@NotNull FqName fqName) {
        C2668g.b(fqName, "fqName");
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(shortName(fqName));
        stringBuilder.append(".");
        stringBuilder.append(BUILTINS_FILE_EXTENSION);
        return stringBuilder.toString();
    }

    private final String shortName(FqName fqName) {
        if (fqName.isRoot()) {
            return "default-package";
        }
        fqName = fqName.shortName().asString();
        C2668g.a(fqName, "fqName.shortName().asString()");
        return fqName;
    }
}
