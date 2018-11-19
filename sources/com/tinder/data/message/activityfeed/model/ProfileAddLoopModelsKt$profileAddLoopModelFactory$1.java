package com.tinder.data.message.activityfeed.model;

import com.tinder.domain.feed.ActivityFeedLoop;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.internal.C15825i;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.FunctionReference;
import kotlin.reflect.KDeclarationContainer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000(\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0015\u0010\u0002\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u00062\u0015\u0010\u0007\u001a\u00110\b¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\t2\u0015\u0010\n\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u000b2\u0015\u0010\f\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\r2\u001d\u0010\u000e\u001a\u0019\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0011¢\u0006\u0002\b\u0012"}, d2 = {"<anonymous>", "Lcom/tinder/data/message/activityfeed/model/ProfileAddLoop;", "p1", "", "Lkotlin/ParameterName;", "name", "id", "p2", "", "activityFeedItemId", "p3", "userNumber", "p4", "timestamp", "p5", "", "Lcom/tinder/domain/feed/ActivityFeedLoop;", "loops", "invoke"}, k = 3, mv = {1, 1, 10})
final class ProfileAddLoopModelsKt$profileAddLoopModelFactory$1 extends FunctionReference implements Function5<Long, String, Long, Long, List<? extends ActivityFeedLoop>, au> {
    /* renamed from: a */
    public static final ProfileAddLoopModelsKt$profileAddLoopModelFactory$1 f45300a = new ProfileAddLoopModelsKt$profileAddLoopModelFactory$1();

    ProfileAddLoopModelsKt$profileAddLoopModelFactory$1() {
        super(5);
    }

    public final String getName() {
        return "<init>";
    }

    public final KDeclarationContainer getOwner() {
        return C15825i.a(au.class);
    }

    public final String getSignature() {
        return "<init>(JLjava/lang/String;JJLjava/util/List;)V";
    }

    public /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        return m54378a(((Number) obj).longValue(), (String) obj2, ((Number) obj3).longValue(), ((Number) obj4).longValue(), (List) obj5);
    }

    @NotNull
    /* renamed from: a */
    public final au m54378a(long j, @NotNull String str, long j2, long j3, @Nullable List<ActivityFeedLoop> list) {
        String str2 = str;
        C2668g.b(str2, "p2");
        return new au(j, str2, j2, j3, list);
    }
}
