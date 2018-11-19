package com.tinder.settings.feed.provider;

import kotlin.C15813i;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C15825i;
import kotlin.jvm.internal.FunctionReference;
import kotlin.reflect.KDeclarationContainer;
import p000a.p001a.C0001a;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012,\u0010\u0002\u001a( \u0007*\u0013\u0018\u00010\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u00060\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006¢\u0006\u0002\b\b"}, d2 = {"<anonymous>", "", "p1", "", "Lkotlin/ParameterName;", "name", "p0", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 1, 10})
final class FeedSettingsShadowProvider$2 extends FunctionReference implements Function1<Throwable, C15813i> {
    /* renamed from: a */
    public static final FeedSettingsShadowProvider$2 f59401a = new FeedSettingsShadowProvider$2();

    FeedSettingsShadowProvider$2() {
        super(1);
    }

    public final String getName() {
        return "e";
    }

    public final KDeclarationContainer getOwner() {
        return C15825i.m59860a(C0001a.class);
    }

    public final String getSignature() {
        return "e(Ljava/lang/Throwable;)V";
    }

    public /* synthetic */ Object invoke(Object obj) {
        m68124a((Throwable) obj);
        return C15813i.f49016a;
    }

    /* renamed from: a */
    public final void m68124a(Throwable th) {
        C0001a.c(th);
    }
}
