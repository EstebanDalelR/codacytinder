package com.tinder.data.message.activityfeed.model;

import com.tinder.domain.feed.ActivityFeedImage;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.C15825i;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.FunctionReference;
import kotlin.reflect.KDeclarationContainer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0015\u0010\u0002\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u00062\u0015\u0010\u0007\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u00052\u001d\u0010\b\u001a\u0019\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u000b¢\u0006\u0002\b\f"}, d2 = {"<anonymous>", "Lcom/tinder/data/message/activityfeed/model/ActivityFeedArtistByActivityFeedItemIdAndSongId;", "p1", "", "Lkotlin/ParameterName;", "name", "id", "p2", "p3", "", "Lcom/tinder/domain/feed/ActivityFeedImage;", "images", "invoke"}, k = 3, mv = {1, 1, 10})
final class ActivityFeedArtistModelsKt$activityFeedArtistRowMapper$1 extends FunctionReference implements Function3<String, String, List<? extends ActivityFeedImage>, C10820l> {
    /* renamed from: a */
    public static final ActivityFeedArtistModelsKt$activityFeedArtistRowMapper$1 f45286a = new ActivityFeedArtistModelsKt$activityFeedArtistRowMapper$1();

    ActivityFeedArtistModelsKt$activityFeedArtistRowMapper$1() {
        super(3);
    }

    public final String getName() {
        return "<init>";
    }

    public final KDeclarationContainer getOwner() {
        return C15825i.a(C10820l.class);
    }

    public final String getSignature() {
        return "<init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V";
    }

    public /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return m54364a((String) obj, (String) obj2, (List) obj3);
    }

    @NotNull
    /* renamed from: a */
    public final C10820l m54364a(@NotNull String str, @NotNull String str2, @Nullable List<ActivityFeedImage> list) {
        C2668g.b(str, "p1");
        C2668g.b(str2, "p2");
        return new C10820l(str, str2, list);
    }
}
