package kotlin.reflect.jvm.internal.impl.builtins;

import java.io.InputStream;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C15825i;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.FunctionReference;
import kotlin.reflect.KDeclarationContainer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

final class BuiltInsLoaderImpl$createPackageFragmentProvider$1 extends FunctionReference implements Function1<String, InputStream> {
    BuiltInsLoaderImpl$createPackageFragmentProvider$1(BuiltInsResourceLoader builtInsResourceLoader) {
        super(1, builtInsResourceLoader);
    }

    public final String getName() {
        return "loadResource";
    }

    public final KDeclarationContainer getOwner() {
        return C15825i.m59860a(BuiltInsResourceLoader.class);
    }

    public final String getSignature() {
        return "loadResource(Ljava/lang/String;)Ljava/io/InputStream;";
    }

    @Nullable
    public final InputStream invoke(@NotNull String str) {
        C2668g.b(str, "p1");
        return ((BuiltInsResourceLoader) this.receiver).loadResource(str);
    }
}
