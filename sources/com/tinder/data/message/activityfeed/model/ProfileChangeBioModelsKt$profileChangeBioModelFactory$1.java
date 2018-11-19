package com.tinder.data.message.activityfeed.model;

import kotlin.Metadata;
import kotlin.jvm.functions.Function6;
import kotlin.jvm.internal.C15825i;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.FunctionReference;
import kotlin.reflect.KDeclarationContainer;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\n\u0010\u0000\u001a\u00020\u00012\u0015\u0010\u0002\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u00062\u0015\u0010\u0007\u001a\u00110\b¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\t2\u0015\u0010\n\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u000b2\u0015\u0010\f\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\r2\u0015\u0010\u000e\u001a\u00110\b¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u000f2\u0015\u0010\u0010\u001a\u00110\b¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0011¢\u0006\u0002\b\u0012"}, d2 = {"<anonymous>", "Lcom/tinder/data/message/activityfeed/model/ProfileChangeBio;", "p1", "", "Lkotlin/ParameterName;", "name", "id", "p2", "", "activityFeedItemId", "p3", "userNumber", "p4", "timestamp", "p5", "bio", "p6", "oldBio", "invoke"}, k = 3, mv = {1, 1, 10})
final class ProfileChangeBioModelsKt$profileChangeBioModelFactory$1 extends FunctionReference implements Function6<Long, String, Long, Long, String, String, bj> {
    /* renamed from: a */
    public static final ProfileChangeBioModelsKt$profileChangeBioModelFactory$1 f45306a = new ProfileChangeBioModelsKt$profileChangeBioModelFactory$1();

    ProfileChangeBioModelsKt$profileChangeBioModelFactory$1() {
        super(6);
    }

    public final String getName() {
        return "<init>";
    }

    public final KDeclarationContainer getOwner() {
        return C15825i.a(bj.class);
    }

    public final String getSignature() {
        return "<init>(JLjava/lang/String;JJLjava/lang/String;Ljava/lang/String;)V";
    }

    public /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        return m54384a(((Number) obj).longValue(), (String) obj2, ((Number) obj3).longValue(), ((Number) obj4).longValue(), (String) obj5, (String) obj6);
    }

    @NotNull
    /* renamed from: a */
    public final bj m54384a(long j, @NotNull String str, long j2, long j3, @NotNull String str2, @NotNull String str3) {
        String str4 = str;
        C2668g.b(str4, "p2");
        String str5 = str2;
        C2668g.b(str5, "p5");
        String str6 = str3;
        C2668g.b(str6, "p6");
        return new bj(j, str4, j2, j3, str5, str6);
    }
}
