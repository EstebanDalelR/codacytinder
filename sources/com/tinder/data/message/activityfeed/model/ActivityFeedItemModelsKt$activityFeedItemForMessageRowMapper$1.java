package com.tinder.data.message.activityfeed.model;

import com.tinder.data.message.activityfeed.ActivityEventType;
import kotlin.Metadata;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.C15825i;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.FunctionReference;
import kotlin.reflect.KDeclarationContainer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u0015\u0010\u0002\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u00062\u0015\u0010\u0007\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\b2\u0015\u0010\t\u001a\u00110\n¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u000b2\u0017\u0010\f\u001a\u0013\u0018\u00010\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\r¢\u0006\u0002\b\u000e"}, d2 = {"<anonymous>", "Lcom/tinder/data/message/activityfeed/model/ActivityFeedItemByMessageId;", "p1", "", "Lkotlin/ParameterName;", "name", "id", "p2", "matchId", "p3", "Lcom/tinder/data/message/activityfeed/ActivityEventType;", "activityEventType", "p4", "activityId", "invoke"}, k = 3, mv = {1, 1, 10})
final class ActivityFeedItemModelsKt$activityFeedItemForMessageRowMapper$1 extends FunctionReference implements Function4<String, String, ActivityEventType, String, C10828v> {
    /* renamed from: a */
    public static final ActivityFeedItemModelsKt$activityFeedItemForMessageRowMapper$1 f45289a = new ActivityFeedItemModelsKt$activityFeedItemForMessageRowMapper$1();

    ActivityFeedItemModelsKt$activityFeedItemForMessageRowMapper$1() {
        super(4);
    }

    public final String getName() {
        return "<init>";
    }

    public final KDeclarationContainer getOwner() {
        return C15825i.a(C10828v.class);
    }

    public final String getSignature() {
        return "<init>(Ljava/lang/String;Ljava/lang/String;Lcom/tinder/data/message/activityfeed/ActivityEventType;Ljava/lang/String;)V";
    }

    public /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        return m54367a((String) obj, (String) obj2, (ActivityEventType) obj3, (String) obj4);
    }

    @NotNull
    /* renamed from: a */
    public final C10828v m54367a(@NotNull String str, @NotNull String str2, @NotNull ActivityEventType activityEventType, @Nullable String str3) {
        C2668g.b(str, "p1");
        C2668g.b(str2, "p2");
        C2668g.b(activityEventType, "p3");
        return new C10828v(str, str2, activityEventType, str3);
    }
}
