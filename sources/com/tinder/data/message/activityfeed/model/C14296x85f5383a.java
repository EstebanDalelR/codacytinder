package com.tinder.data.message.activityfeed.model;

import com.tinder.domain.feed.InstagramMedia;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function7;
import kotlin.jvm.internal.C15825i;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.FunctionReference;
import kotlin.reflect.KDeclarationContainer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000(\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0015\u0010\u0002\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u00062\u0015\u0010\u0007\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\b2\u0015\u0010\t\u001a\u00110\n¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u000b2\u0015\u0010\f\u001a\u00110\n¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\r2\u0015\u0010\u000e\u001a\u00110\n¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u000f2\u0015\u0010\u0010\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u00112\u001d\u0010\u0012\u001a\u0019\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0015¢\u0006\u0002\b\u0016"}, d2 = {"<anonymous>", "Lcom/tinder/data/message/activityfeed/model/InstagramNewMediaByActivityFeedItemId;", "p1", "", "Lkotlin/ParameterName;", "name", "instagramMediaId", "p2", "instagramUserName", "p3", "", "userNumber", "p4", "instagramUserId", "p5", "timestamp", "p6", "caption", "p7", "", "Lcom/tinder/domain/feed/InstagramMedia;", "media", "invoke"}, k = 3, mv = {1, 1, 10})
/* renamed from: com.tinder.data.message.activityfeed.model.InstagramNewMediaModelsKt$instagramNewMediaForActivityFeedItemRowMapper$1 */
final class C14296x85f5383a extends FunctionReference implements Function7<String, String, Long, Long, Long, String, List<? extends InstagramMedia>, an> {
    /* renamed from: a */
    public static final C14296x85f5383a f45296a = new C14296x85f5383a();

    C14296x85f5383a() {
        super(7);
    }

    public final String getName() {
        return "<init>";
    }

    public final KDeclarationContainer getOwner() {
        return C15825i.a(an.class);
    }

    public final String getSignature() {
        return "<init>(Ljava/lang/String;Ljava/lang/String;JJJLjava/lang/String;Ljava/util/List;)V";
    }

    public /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
        return m54374a((String) obj, (String) obj2, ((Number) obj3).longValue(), ((Number) obj4).longValue(), ((Number) obj5).longValue(), (String) obj6, (List) obj7);
    }

    @NotNull
    /* renamed from: a */
    public final an m54374a(@NotNull String str, @NotNull String str2, long j, long j2, long j3, @NotNull String str3, @Nullable List<InstagramMedia> list) {
        String str4 = str;
        C2668g.b(str4, "p1");
        String str5 = str2;
        C2668g.b(str5, "p2");
        String str6 = str3;
        C2668g.b(str6, "p6");
        return new an(str4, str5, j, j2, j3, str6, list);
    }
}
