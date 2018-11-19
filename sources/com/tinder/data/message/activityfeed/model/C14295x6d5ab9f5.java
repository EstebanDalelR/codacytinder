package com.tinder.data.message.activityfeed.model;

import com.tinder.domain.feed.ActivityFeedPhoto;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.C15825i;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.FunctionReference;
import kotlin.reflect.KDeclarationContainer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000(\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0015\u0010\u0002\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u00062\u0015\u0010\u0007\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\b2\u0015\u0010\t\u001a\u00110\n¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u000b2\u001d\u0010\f\u001a\u0019\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u000f¢\u0006\u0002\b\u0010"}, d2 = {"<anonymous>", "Lcom/tinder/data/message/activityfeed/model/InstagramConnectByActivityFeedItemId;", "p1", "", "Lkotlin/ParameterName;", "name", "userNumber", "p2", "timetamp", "p3", "", "instagramUserName", "p4", "", "Lcom/tinder/domain/feed/ActivityFeedPhoto;", "photos", "invoke"}, k = 3, mv = {1, 1, 10})
/* renamed from: com.tinder.data.message.activityfeed.model.InstagramConnectModelsKt$instagramConnectForActivityFeedItemIdRowMapper$1 */
final class C14295x6d5ab9f5 extends FunctionReference implements Function4<Long, Long, String, List<? extends ActivityFeedPhoto>, ai> {
    /* renamed from: a */
    public static final C14295x6d5ab9f5 f45294a = new C14295x6d5ab9f5();

    C14295x6d5ab9f5() {
        super(4);
    }

    public final String getName() {
        return "<init>";
    }

    public final KDeclarationContainer getOwner() {
        return C15825i.a(ai.class);
    }

    public final String getSignature() {
        return "<init>(JJLjava/lang/String;Ljava/util/List;)V";
    }

    public /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        return m54372a(((Number) obj).longValue(), ((Number) obj2).longValue(), (String) obj3, (List) obj4);
    }

    @NotNull
    /* renamed from: a */
    public final ai m54372a(long j, long j2, @NotNull String str, @Nullable List<ActivityFeedPhoto> list) {
        C2668g.b(str, "p3");
        return new ai(j, j2, str, list);
    }
}
