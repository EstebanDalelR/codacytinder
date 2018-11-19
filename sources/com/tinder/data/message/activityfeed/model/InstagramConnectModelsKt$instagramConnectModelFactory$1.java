package com.tinder.data.message.activityfeed.model;

import com.tinder.domain.feed.ActivityFeedPhoto;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function6;
import kotlin.jvm.internal.C15825i;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.FunctionReference;
import kotlin.reflect.KDeclarationContainer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000(\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0015\u0010\u0002\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u00062\u0015\u0010\u0007\u001a\u00110\b¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\t2\u0015\u0010\n\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u000b2\u0015\u0010\f\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\r2\u0015\u0010\u000e\u001a\u00110\b¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u000f2\u001d\u0010\u0010\u001a\u0019\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0013¢\u0006\u0002\b\u0014"}, d2 = {"<anonymous>", "Lcom/tinder/data/message/activityfeed/model/InstagramConnect;", "p1", "", "Lkotlin/ParameterName;", "name", "id", "p2", "", "activityFeedItemId", "p3", "userNumber", "p4", "timestamp", "p5", "instagramUserName", "p6", "", "Lcom/tinder/domain/feed/ActivityFeedPhoto;", "photos", "invoke"}, k = 3, mv = {1, 1, 10})
final class InstagramConnectModelsKt$instagramConnectModelFactory$1 extends FunctionReference implements Function6<Long, String, Long, Long, String, List<? extends ActivityFeedPhoto>, ah> {
    /* renamed from: a */
    public static final InstagramConnectModelsKt$instagramConnectModelFactory$1 f45295a = new InstagramConnectModelsKt$instagramConnectModelFactory$1();

    InstagramConnectModelsKt$instagramConnectModelFactory$1() {
        super(6);
    }

    public final String getName() {
        return "<init>";
    }

    public final KDeclarationContainer getOwner() {
        return C15825i.a(ah.class);
    }

    public final String getSignature() {
        return "<init>(JLjava/lang/String;JJLjava/lang/String;Ljava/util/List;)V";
    }

    public /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        return m54373a(((Number) obj).longValue(), (String) obj2, ((Number) obj3).longValue(), ((Number) obj4).longValue(), (String) obj5, (List) obj6);
    }

    @NotNull
    /* renamed from: a */
    public final ah m54373a(long j, @NotNull String str, long j2, long j3, @NotNull String str2, @Nullable List<ActivityFeedPhoto> list) {
        String str3 = str;
        C2668g.b(str3, "p2");
        String str4 = str2;
        C2668g.b(str4, "p5");
        return new ah(j, str3, j2, j3, str4, list);
    }
}
