package com.tinder.data.message.activityfeed.model;

import com.tinder.domain.feed.InstagramMedia;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function9;
import kotlin.jvm.internal.C15825i;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.FunctionReference;
import kotlin.reflect.KDeclarationContainer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000(\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0015\u0010\u0002\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u00062\u0015\u0010\u0007\u001a\u00110\b¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\t2\u0015\u0010\n\u001a\u00110\b¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u000b2\u0015\u0010\f\u001a\u00110\b¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\r2\u0015\u0010\u000e\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u000f2\u0015\u0010\u0010\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u00112\u0015\u0010\u0012\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u00132\u0015\u0010\u0014\u001a\u00110\b¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u00152\u001d\u0010\u0016\u001a\u0019\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0017¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0019¢\u0006\u0002\b\u001a"}, d2 = {"<anonymous>", "Lcom/tinder/data/message/activityfeed/model/InstagramNewMedia;", "p1", "", "Lkotlin/ParameterName;", "name", "id", "p2", "", "activityFeedItemId", "p3", "instagramMediaId", "p4", "instagramUserName", "p5", "userNumber", "p6", "instagramUserId", "p7", "timestamp", "p8", "caption", "p9", "", "Lcom/tinder/domain/feed/InstagramMedia;", "media", "invoke"}, k = 3, mv = {1, 1, 10})
final class InstagramNewMediaModelsKt$instagramNewMediaModelFactory$1 extends FunctionReference implements Function9<Long, String, String, String, Long, Long, Long, String, List<? extends InstagramMedia>, am> {
    /* renamed from: a */
    public static final InstagramNewMediaModelsKt$instagramNewMediaModelFactory$1 f45297a = new InstagramNewMediaModelsKt$instagramNewMediaModelFactory$1();

    InstagramNewMediaModelsKt$instagramNewMediaModelFactory$1() {
        super(9);
    }

    public final String getName() {
        return "<init>";
    }

    public final KDeclarationContainer getOwner() {
        return C15825i.a(am.class);
    }

    public final String getSignature() {
        return "<init>(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;JJJLjava/lang/String;Ljava/util/List;)V";
    }

    public /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9) {
        return m54375a(((Number) obj).longValue(), (String) obj2, (String) obj3, (String) obj4, ((Number) obj5).longValue(), ((Number) obj6).longValue(), ((Number) obj7).longValue(), (String) obj8, (List) obj9);
    }

    @NotNull
    /* renamed from: a */
    public final am m54375a(long j, @NotNull String str, @NotNull String str2, @NotNull String str3, long j2, long j3, long j4, @NotNull String str4, @Nullable List<InstagramMedia> list) {
        String str5 = str;
        C2668g.b(str5, "p2");
        String str6 = str2;
        C2668g.b(str6, "p3");
        String str7 = str3;
        C2668g.b(str7, "p4");
        String str8 = str4;
        C2668g.b(str8, "p8");
        return new am(j, str5, str6, str7, j2, j3, j4, str8, list);
    }
}
