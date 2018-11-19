package com.tinder.data.message.activityfeed.model;

import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C15825i;
import kotlin.jvm.internal.FunctionReference;
import kotlin.reflect.KDeclarationContainer;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0005\u0010\u0000\u001a\u00020\u00012\u0015\u0010\u0002\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u00062\u0015\u0010\u0007\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\b¢\u0006\u0002\b\t"}, d2 = {"<anonymous>", "Lcom/tinder/data/message/activityfeed/model/ProfileChangeAnthemByActivityFeedItemId;", "p1", "", "Lkotlin/ParameterName;", "name", "userNumber", "p2", "timestamp", "invoke"}, k = 3, mv = {1, 1, 10})
final class ProfileChangeAnthemModelsKt$profileChangeAnthemRowMapper$1 extends FunctionReference implements Function2<Long, Long, bf> {
    /* renamed from: a */
    public static final ProfileChangeAnthemModelsKt$profileChangeAnthemRowMapper$1 f45304a = new ProfileChangeAnthemModelsKt$profileChangeAnthemRowMapper$1();

    ProfileChangeAnthemModelsKt$profileChangeAnthemRowMapper$1() {
        super(2);
    }

    public final String getName() {
        return "<init>";
    }

    public final KDeclarationContainer getOwner() {
        return C15825i.a(bf.class);
    }

    public final String getSignature() {
        return "<init>(JJ)V";
    }

    public /* synthetic */ Object invoke(Object obj, Object obj2) {
        return m54382a(((Number) obj).longValue(), ((Number) obj2).longValue());
    }

    @NotNull
    /* renamed from: a */
    public final bf m54382a(long j, long j2) {
        return new bf(j, j2);
    }
}
