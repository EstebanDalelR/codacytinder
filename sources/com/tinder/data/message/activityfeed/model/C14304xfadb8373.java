package com.tinder.data.message.activityfeed.model;

import kotlin.Metadata;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.C15825i;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.FunctionReference;
import kotlin.reflect.KDeclarationContainer;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\u0010\u0000\u001a\u00020\u00012\u0015\u0010\u0002\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u00062\u0015\u0010\u0007\u001a\u00110\b¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\t2\u0015\u0010\n\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u000b2\u0015\u0010\f\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\r¢\u0006\u0002\b\u000e"}, d2 = {"<anonymous>", "Lcom/tinder/data/message/activityfeed/model/ProfileSpotifyTopArtist;", "p1", "", "Lkotlin/ParameterName;", "name", "id", "p2", "", "activityFeedItemId", "p3", "userNumber", "p4", "timestamp", "invoke"}, k = 3, mv = {1, 1, 10})
/* renamed from: com.tinder.data.message.activityfeed.model.ProfileSpotifyTopArtistModelsKt$profileSpotifyTopArtistModelFactory$1 */
final class C14304xfadb8373 extends FunctionReference implements Function4<Long, String, Long, Long, by> {
    /* renamed from: a */
    public static final C14304xfadb8373 f45312a = new C14304xfadb8373();

    C14304xfadb8373() {
        super(4);
    }

    public final String getName() {
        return "<init>";
    }

    public final KDeclarationContainer getOwner() {
        return C15825i.a(by.class);
    }

    public final String getSignature() {
        return "<init>(JLjava/lang/String;JJ)V";
    }

    public /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        return m54390a(((Number) obj).longValue(), (String) obj2, ((Number) obj3).longValue(), ((Number) obj4).longValue());
    }

    @NotNull
    /* renamed from: a */
    public final by m54390a(long j, @NotNull String str, long j2, long j3) {
        String str2 = str;
        C2668g.b(str2, "p2");
        return new by(j, str2, j2, j3);
    }
}
