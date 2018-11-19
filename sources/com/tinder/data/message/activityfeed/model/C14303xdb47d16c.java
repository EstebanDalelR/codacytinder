package com.tinder.data.message.activityfeed.model;

import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C15825i;
import kotlin.jvm.internal.FunctionReference;
import kotlin.reflect.KDeclarationContainer;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0005\u0010\u0000\u001a\u00020\u00012\u0015\u0010\u0002\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u00062\u0015\u0010\u0007\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\b¢\u0006\u0002\b\t"}, d2 = {"<anonymous>", "Lcom/tinder/data/message/activityfeed/model/ProfileSpotifyTopArtistByActivityFeedItemId;", "p1", "", "Lkotlin/ParameterName;", "name", "userNumber", "p2", "timestamp", "invoke"}, k = 3, mv = {1, 1, 10})
/* renamed from: com.tinder.data.message.activityfeed.model.ProfileSpotifyTopArtistModelsKt$profileSpotifyTopArtistByActivityFeedItemRowMapper$1 */
final class C14303xdb47d16c extends FunctionReference implements Function2<Long, Long, bz> {
    /* renamed from: a */
    public static final C14303xdb47d16c f45311a = new C14303xdb47d16c();

    C14303xdb47d16c() {
        super(2);
    }

    public final String getName() {
        return "<init>";
    }

    public final KDeclarationContainer getOwner() {
        return C15825i.a(bz.class);
    }

    public final String getSignature() {
        return "<init>(JJ)V";
    }

    public /* synthetic */ Object invoke(Object obj, Object obj2) {
        return m54389a(((Number) obj).longValue(), ((Number) obj2).longValue());
    }

    @NotNull
    /* renamed from: a */
    public final bz m54389a(long j, long j2) {
        return new bz(j, j2);
    }
}
