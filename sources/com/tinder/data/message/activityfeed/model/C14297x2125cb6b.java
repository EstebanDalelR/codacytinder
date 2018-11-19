package com.tinder.data.message.activityfeed.model;

import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C15825i;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.FunctionReference;
import kotlin.reflect.KDeclarationContainer;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\u0010\u0000\u001a\u00020\u00012\u0015\u0010\u0002\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u00062\u0015\u0010\u0007\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\b¢\u0006\u0002\b\t"}, d2 = {"<anonymous>", "Lcom/tinder/data/message/activityfeed/model/MessageActivityFeedItem;", "p1", "", "Lkotlin/ParameterName;", "name", "messageId", "p2", "activityFeedItemId", "invoke"}, k = 3, mv = {1, 1, 10})
/* renamed from: com.tinder.data.message.activityfeed.model.MessageActivityFeedItemModelsKt$messageActivityFeedItemModelFactory$1 */
final class C14297x2125cb6b extends FunctionReference implements Function2<String, String, ar> {
    /* renamed from: a */
    public static final C14297x2125cb6b f45298a = new C14297x2125cb6b();

    C14297x2125cb6b() {
        super(2);
    }

    public final String getName() {
        return "<init>";
    }

    public final KDeclarationContainer getOwner() {
        return C15825i.a(ar.class);
    }

    public final String getSignature() {
        return "<init>(Ljava/lang/String;Ljava/lang/String;)V";
    }

    public /* synthetic */ Object invoke(Object obj, Object obj2) {
        return m54376a((String) obj, (String) obj2);
    }

    @NotNull
    /* renamed from: a */
    public final ar m54376a(@NotNull String str, @NotNull String str2) {
        C2668g.b(str, "p1");
        C2668g.b(str2, "p2");
        return new ar(str, str2);
    }
}
