package com.tinder.data.message.activityfeed.model;

import kotlin.Metadata;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.C15825i;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.FunctionReference;
import kotlin.reflect.KDeclarationContainer;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0006\u0010\u0000\u001a\u00020\u00012\u0015\u0010\u0002\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u00062\u0015\u0010\u0007\u001a\u00110\b¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\t2\u0015\u0010\n\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u000b2\u0015\u0010\f\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\r¢\u0006\u0002\b\u000e"}, d2 = {"<anonymous>", "Lcom/tinder/data/message/activityfeed/model/ActivityFeedCommentByActivityFeedItemId;", "p1", "", "Lkotlin/ParameterName;", "name", "activityFeedItemId", "p2", "", "createdAt", "p3", "message", "p4", "metadataCarouselItemId", "invoke"}, k = 3, mv = {1, 1, 10})
/* renamed from: com.tinder.data.message.activityfeed.model.ActivityFeedCommentModelsKt$activityFeedCommentForActivityFeedItemRowMapper$1 */
final class C14293xdc7ab7b2 extends FunctionReference implements Function4<String, Long, String, String, C10824q> {
    /* renamed from: a */
    public static final C14293xdc7ab7b2 f45287a = new C14293xdc7ab7b2();

    C14293xdc7ab7b2() {
        super(4);
    }

    public final String getName() {
        return "<init>";
    }

    public final KDeclarationContainer getOwner() {
        return C15825i.a(C10824q.class);
    }

    public final String getSignature() {
        return "<init>(Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;)V";
    }

    public /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        return m54365a((String) obj, ((Number) obj2).longValue(), (String) obj3, (String) obj4);
    }

    @NotNull
    /* renamed from: a */
    public final C10824q m54365a(@NotNull String str, long j, @NotNull String str2, @NotNull String str3) {
        C2668g.b(str, "p1");
        C2668g.b(str2, "p3");
        C2668g.b(str3, "p4");
        return new C10824q(str, j, str2, str3);
    }
}
