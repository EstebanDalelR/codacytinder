package com.tinder.data.message.activityfeed.model;

import com.tinder.domain.feed.ActivityFeedImage;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C15825i;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.FunctionReference;
import kotlin.reflect.KDeclarationContainer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0015\u0010\u0002\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u00052\u001d\u0010\u0006\u001a\u0019\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\t¢\u0006\u0002\b\n"}, d2 = {"<anonymous>", "Lcom/tinder/data/message/activityfeed/model/ActivityFeedAlbumByActivityFeedItemIdAndSongId;", "p1", "", "Lkotlin/ParameterName;", "name", "p2", "", "Lcom/tinder/domain/feed/ActivityFeedImage;", "images", "invoke"}, k = 3, mv = {1, 1, 10})
final class ActivityFeedAlbumModelsKt$activityFeedAlbumRowMapper$1 extends FunctionReference implements Function2<String, List<? extends ActivityFeedImage>, C10816g> {
    /* renamed from: a */
    public static final ActivityFeedAlbumModelsKt$activityFeedAlbumRowMapper$1 f45284a = new ActivityFeedAlbumModelsKt$activityFeedAlbumRowMapper$1();

    ActivityFeedAlbumModelsKt$activityFeedAlbumRowMapper$1() {
        super(2);
    }

    public final String getName() {
        return "<init>";
    }

    public final KDeclarationContainer getOwner() {
        return C15825i.a(C10816g.class);
    }

    public final String getSignature() {
        return "<init>(Ljava/lang/String;Ljava/util/List;)V";
    }

    public /* synthetic */ Object invoke(Object obj, Object obj2) {
        return m54362a((String) obj, (List) obj2);
    }

    @NotNull
    /* renamed from: a */
    public final C10816g m54362a(@NotNull String str, @Nullable List<ActivityFeedImage> list) {
        C2668g.b(str, "p1");
        return new C10816g(str, list);
    }
}
