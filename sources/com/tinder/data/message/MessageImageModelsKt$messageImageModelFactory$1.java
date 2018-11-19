package com.tinder.data.message;

import kotlin.Metadata;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.internal.C15825i;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.FunctionReference;
import kotlin.reflect.KDeclarationContainer;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u0015\u0010\u0002\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u00062\u0015\u0010\u0007\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\b2\u0015\u0010\t\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\n2\u0015\u0010\u000b\u001a\u00110\f¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\r2\u0015\u0010\u000e\u001a\u00110\f¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u000f¢\u0006\u0002\b\u0010"}, d2 = {"<anonymous>", "Lcom/tinder/data/message/MessageImage;", "p1", "", "Lkotlin/ParameterName;", "name", "messageId", "p2", "source", "p3", "url", "p4", "", "width", "p5", "height", "invoke"}, k = 3, mv = {1, 1, 10})
final class MessageImageModelsKt$messageImageModelFactory$1 extends FunctionReference implements Function5<String, String, String, Long, Long, al> {
    /* renamed from: a */
    public static final MessageImageModelsKt$messageImageModelFactory$1 f45279a = new MessageImageModelsKt$messageImageModelFactory$1();

    MessageImageModelsKt$messageImageModelFactory$1() {
        super(5);
    }

    public final String getName() {
        return "<init>";
    }

    public final KDeclarationContainer getOwner() {
        return C15825i.a(al.class);
    }

    public final String getSignature() {
        return "<init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJ)V";
    }

    public /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        return m54356a((String) obj, (String) obj2, (String) obj3, ((Number) obj4).longValue(), ((Number) obj5).longValue());
    }

    @NotNull
    /* renamed from: a */
    public final al m54356a(@NotNull String str, @NotNull String str2, @NotNull String str3, long j, long j2) {
        String str4 = str;
        C2668g.b(str4, "p1");
        String str5 = str2;
        C2668g.b(str5, "p2");
        String str6 = str3;
        C2668g.b(str6, "p3");
        return new al(str4, str5, str6, j, j2);
    }
}
