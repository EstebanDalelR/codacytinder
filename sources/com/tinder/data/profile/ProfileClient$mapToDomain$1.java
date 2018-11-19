package com.tinder.data.profile;

import com.tinder.data.adapter.C2646o;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0004\n\u0002\b\u0006\u0010\u0000\u001a\u0004\u0018\u0001H\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0003\u001a\u0002H\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "DOMAIN", "API", "it", "invoke", "(Ljava/lang/Object;)Ljava/lang/Object;"}, k = 3, mv = {1, 1, 10})
final class ProfileClient$mapToDomain$1 extends Lambda implements Function1<API, DOMAIN> {
    /* renamed from: a */
    final /* synthetic */ C2646o f43961a;

    ProfileClient$mapToDomain$1(C2646o c2646o) {
        this.f43961a = c2646o;
        super(1);
    }

    @Nullable
    public final DOMAIN invoke(API api) {
        return this.f43961a.a(api);
    }
}
