package kotlin.reflect.jvm.internal;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.KClassImpl.Data;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "T", "", "invoke"}, k = 3, mv = {1, 1, 10})
final class KClassImpl$Data$qualifiedName$2 extends Lambda implements Function0<String> {
    final /* synthetic */ Data this$0;

    KClassImpl$Data$qualifiedName$2(Data data) {
        this.this$0 = data;
        super(0);
    }

    @Nullable
    public final String invoke() {
        String str = null;
        if (this.this$0.this$0.getJClass().isAnonymousClass()) {
            return null;
        }
        ClassId access$getClassId$p = this.this$0.this$0.getClassId();
        if (!access$getClassId$p.isLocal()) {
            str = access$getClassId$p.asSingleFqName().asString();
        }
        return str;
    }
}
