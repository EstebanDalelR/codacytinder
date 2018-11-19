package com.tinder.data.message.activityfeed.model;

import kotlin.Metadata;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.C15825i;
import kotlin.jvm.internal.FunctionReference;
import kotlin.reflect.KDeclarationContainer;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u00012\u0015\u0010\u0002\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u00062\u0015\u0010\u0007\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\b2\u0015\u0010\t\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\n¢\u0006\u0002\b\u000b"}, d2 = {"<anonymous>", "Lcom/tinder/data/message/activityfeed/model/ActivityEventNewMatchByActivityFeedItemId;", "p1", "", "Lkotlin/ParameterName;", "name", "userNumber", "p2", "otherUserNumber", "p3", "timestamp", "invoke"}, k = 3, mv = {1, 1, 10})
/* renamed from: com.tinder.data.message.activityfeed.model.ActivityEventNewMatchModelsKt$activityEventNewMatchForActivityFeedItemRowMapper$1 */
final class C14291x585e1d2e extends FunctionReference implements Function3<Long, Long, Long, C10812b> {
    /* renamed from: a */
    public static final C14291x585e1d2e f45281a = new C14291x585e1d2e();

    C14291x585e1d2e() {
        super(3);
    }

    public final String getName() {
        return "<init>";
    }

    public final KDeclarationContainer getOwner() {
        return C15825i.a(C10812b.class);
    }

    public final String getSignature() {
        return "<init>(JJJ)V";
    }

    public /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return m54359a(((Number) obj).longValue(), ((Number) obj2).longValue(), ((Number) obj3).longValue());
    }

    @NotNull
    /* renamed from: a */
    public final C10812b m54359a(long j, long j2, long j3) {
        return new C10812b(j, j2, j3);
    }
}
