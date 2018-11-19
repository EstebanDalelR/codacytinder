package com.tinder.data.message.activityfeed.model;

import com.tinder.domain.feed.ActivityFeedLoop;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.C15825i;
import kotlin.jvm.internal.FunctionReference;
import kotlin.reflect.KDeclarationContainer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0015\u0010\u0002\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u00062\u0015\u0010\u0007\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\b2\u001d\u0010\t\u001a\u0019\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\f¢\u0006\u0002\b\r"}, d2 = {"<anonymous>", "Lcom/tinder/data/message/activityfeed/model/ProfileAddLoopByActivityFeedItemId;", "p1", "", "Lkotlin/ParameterName;", "name", "userNumber", "p2", "timestamp", "p3", "", "Lcom/tinder/domain/feed/ActivityFeedLoop;", "loops", "invoke"}, k = 3, mv = {1, 1, 10})
/* renamed from: com.tinder.data.message.activityfeed.model.ProfileAddLoopModelsKt$profileAddLoopByActivityFeedItemRowMapper$1 */
final class C14298x3589ef80 extends FunctionReference implements Function3<Long, Long, List<? extends ActivityFeedLoop>, av> {
    /* renamed from: a */
    public static final C14298x3589ef80 f45299a = new C14298x3589ef80();

    C14298x3589ef80() {
        super(3);
    }

    public final String getName() {
        return "<init>";
    }

    public final KDeclarationContainer getOwner() {
        return C15825i.a(av.class);
    }

    public final String getSignature() {
        return "<init>(JJLjava/util/List;)V";
    }

    public /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return m54377a(((Number) obj).longValue(), ((Number) obj2).longValue(), (List) obj3);
    }

    @NotNull
    /* renamed from: a */
    public final av m54377a(long j, long j2, @Nullable List<ActivityFeedLoop> list) {
        return new av(j, j2, list);
    }
}
