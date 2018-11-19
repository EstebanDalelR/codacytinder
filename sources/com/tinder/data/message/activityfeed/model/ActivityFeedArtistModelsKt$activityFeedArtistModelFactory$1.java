package com.tinder.data.message.activityfeed.model;

import com.tinder.domain.feed.ActivityFeedImage;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.internal.C15825i;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.FunctionReference;
import kotlin.reflect.KDeclarationContainer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0015\u0010\u0002\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u00062\u0015\u0010\u0007\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\b2\u0015\u0010\t\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\n2\u0015\u0010\u000b\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u00052\u001d\u0010\f\u001a\u0019\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u000f¢\u0006\u0002\b\u0010"}, d2 = {"<anonymous>", "Lcom/tinder/data/message/activityfeed/model/ActivityFeedArtist;", "p1", "", "Lkotlin/ParameterName;", "name", "id", "p2", "activityFeedItemId", "p3", "activityFeedSongId", "p4", "p5", "", "Lcom/tinder/domain/feed/ActivityFeedImage;", "images", "invoke"}, k = 3, mv = {1, 1, 10})
final class ActivityFeedArtistModelsKt$activityFeedArtistModelFactory$1 extends FunctionReference implements Function5<String, String, String, String, List<? extends ActivityFeedImage>, C10819k> {
    /* renamed from: a */
    public static final ActivityFeedArtistModelsKt$activityFeedArtistModelFactory$1 f45285a = new ActivityFeedArtistModelsKt$activityFeedArtistModelFactory$1();

    ActivityFeedArtistModelsKt$activityFeedArtistModelFactory$1() {
        super(5);
    }

    public final String getName() {
        return "<init>";
    }

    public final KDeclarationContainer getOwner() {
        return C15825i.a(C10819k.class);
    }

    public final String getSignature() {
        return "<init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V";
    }

    public /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        return m54363a((String) obj, (String) obj2, (String) obj3, (String) obj4, (List) obj5);
    }

    @NotNull
    /* renamed from: a */
    public final C10819k m54363a(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @Nullable List<ActivityFeedImage> list) {
        C2668g.b(str, "p1");
        C2668g.b(str2, "p2");
        C2668g.b(str3, "p3");
        C2668g.b(str4, "p4");
        return new C10819k(str, str2, str3, str4, list);
    }
}
