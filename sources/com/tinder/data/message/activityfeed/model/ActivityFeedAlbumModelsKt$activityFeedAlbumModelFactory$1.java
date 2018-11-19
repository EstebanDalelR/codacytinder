package com.tinder.data.message.activityfeed.model;

import com.tinder.domain.feed.ActivityFeedImage;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.C15825i;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.FunctionReference;
import kotlin.reflect.KDeclarationContainer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0015\u0010\u0002\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u00062\u0015\u0010\u0007\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\b2\u0015\u0010\t\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u00052\u001d\u0010\n\u001a\u0019\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\r¢\u0006\u0002\b\u000e"}, d2 = {"<anonymous>", "Lcom/tinder/data/message/activityfeed/model/ActivityFeedAlbum;", "p1", "", "Lkotlin/ParameterName;", "name", "activityFeedItemId", "p2", "activityFeedSongId", "p3", "p4", "", "Lcom/tinder/domain/feed/ActivityFeedImage;", "images", "invoke"}, k = 3, mv = {1, 1, 10})
final class ActivityFeedAlbumModelsKt$activityFeedAlbumModelFactory$1 extends FunctionReference implements Function4<String, String, String, List<? extends ActivityFeedImage>, C10815f> {
    /* renamed from: a */
    public static final ActivityFeedAlbumModelsKt$activityFeedAlbumModelFactory$1 f45283a = new ActivityFeedAlbumModelsKt$activityFeedAlbumModelFactory$1();

    ActivityFeedAlbumModelsKt$activityFeedAlbumModelFactory$1() {
        super(4);
    }

    public final String getName() {
        return "<init>";
    }

    public final KDeclarationContainer getOwner() {
        return C15825i.a(C10815f.class);
    }

    public final String getSignature() {
        return "<init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V";
    }

    public /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        return m54361a((String) obj, (String) obj2, (String) obj3, (List) obj4);
    }

    @NotNull
    /* renamed from: a */
    public final C10815f m54361a(@NotNull String str, @NotNull String str2, @NotNull String str3, @Nullable List<ActivityFeedImage> list) {
        C2668g.b(str, "p1");
        C2668g.b(str2, "p2");
        C2668g.b(str3, "p3");
        return new C10815f(str, str2, str3, list);
    }
}
