package kotlin.reflect.jvm.internal;

import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.components.ReflectKotlinClass;
import kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Package;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmNameResolver;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmProtoBufUtil;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lkotlin/Pair;", "Lkotlin/reflect/jvm/internal/impl/metadata/jvm/deserialization/JvmNameResolver;", "Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Package;", "invoke"}, k = 3, mv = {1, 1, 10})
final class KPackageImpl$Data$metadata$2 extends Lambda implements Function0<Pair<? extends JvmNameResolver, ? extends Package>> {
    final /* synthetic */ Data this$0;

    KPackageImpl$Data$metadata$2(Data data) {
        this.this$0 = data;
        super(0);
    }

    @Nullable
    public final Pair<JvmNameResolver, Package> invoke() {
        ReflectKotlinClass access$getKotlinClass$p = this.this$0.getKotlinClass();
        if (access$getKotlinClass$p == null) {
            return null;
        }
        KotlinClassHeader classHeader = access$getKotlinClass$p.getClassHeader();
        if (classHeader == null) {
            return null;
        }
        String[] data = classHeader.getData();
        String[] strings = classHeader.getStrings();
        if (data == null || strings == null) {
            return null;
        }
        return JvmProtoBufUtil.readPackageDataFrom(data, strings);
    }
}
