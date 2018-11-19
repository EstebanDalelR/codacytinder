package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import kotlin.C15813i;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder;
import kotlin.reflect.jvm.internal.impl.load.kotlin.SignatureBuildingComponents;
import org.jetbrains.annotations.NotNull;

/* renamed from: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt$$special$$inlined$enhancement$lambda$21 */
final class C19106xe59eb42f extends Lambda implements Function1<FunctionEnhancementBuilder, C15813i> {
    final /* synthetic */ String $JFBiConsumer$inlined;
    final /* synthetic */ String $JFBiFunction$inlined;
    final /* synthetic */ String $JFConsumer$inlined;
    final /* synthetic */ String $JFFunction$inlined;
    final /* synthetic */ String $JFPredicate$inlined;
    final /* synthetic */ String $JFUnaryOperator$inlined;
    final /* synthetic */ String $JLObject$inlined;
    final /* synthetic */ String $JUOptional$inlined;
    final /* synthetic */ String $JUStream$inlined;
    final /* synthetic */ SignatureBuildingComponents receiver$0$inlined;

    C19106xe59eb42f(SignatureBuildingComponents signatureBuildingComponents, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
        this.receiver$0$inlined = signatureBuildingComponents;
        this.$JFConsumer$inlined = str;
        this.$JFPredicate$inlined = str2;
        this.$JUStream$inlined = str3;
        this.$JFUnaryOperator$inlined = str4;
        this.$JFBiConsumer$inlined = str5;
        this.$JLObject$inlined = str6;
        this.$JFBiFunction$inlined = str7;
        this.$JFFunction$inlined = str8;
        this.$JUOptional$inlined = str9;
        super(1);
    }

    public final void invoke(@NotNull FunctionEnhancementBuilder functionEnhancementBuilder) {
        C2668g.b(functionEnhancementBuilder, "$receiver");
        functionEnhancementBuilder.returns(this.$JLObject$inlined, PredefinedEnhancementInfoKt.NULLABLE);
    }
}
