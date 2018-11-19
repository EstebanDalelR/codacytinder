package com.tinder.data.message.activityfeed.model;

import kotlin.Metadata;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.C15825i;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.FunctionReference;
import kotlin.reflect.KDeclarationContainer;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\u0010\u0000\u001a\u00020\u00012\u0015\u0010\u0002\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u00062\u0015\u0010\u0007\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u00052\u0015\u0010\b\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\t¢\u0006\u0002\b\n"}, d2 = {"<anonymous>", "Lcom/tinder/data/message/activityfeed/model/ActivityFeedSongByActivityFeedItemId;", "p1", "", "Lkotlin/ParameterName;", "name", "id", "p2", "p3", "url", "invoke"}, k = 3, mv = {1, 1, 10})
final class ActivityFeedSongModelsKt$activityFeedSongRowMapper$1 extends FunctionReference implements Function3<String, String, String, ad> {
    /* renamed from: a */
    public static final ActivityFeedSongModelsKt$activityFeedSongRowMapper$1 f45293a = new ActivityFeedSongModelsKt$activityFeedSongRowMapper$1();

    ActivityFeedSongModelsKt$activityFeedSongRowMapper$1() {
        super(3);
    }

    public final String getName() {
        return "<init>";
    }

    public final KDeclarationContainer getOwner() {
        return C15825i.a(ad.class);
    }

    public final String getSignature() {
        return "<init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V";
    }

    public /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return m54371a((String) obj, (String) obj2, (String) obj3);
    }

    @NotNull
    /* renamed from: a */
    public final ad m54371a(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        C2668g.b(str, "p1");
        C2668g.b(str2, "p2");
        C2668g.b(str3, "p3");
        return new ad(str, str2, str3);
    }
}
