package com.tinder.smsauth.domain.usecase;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C15825i;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.FunctionReference;
import kotlin.reflect.KDeclarationContainer;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0015\u0010\u0002\u001a\u00110\u0001¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0005¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "p1", "Lkotlin/ParameterName;", "name", "sms", "invoke"}, k = 3, mv = {1, 1, 10})
final class ReadOneTimePasswordFromSms$invoke$1 extends FunctionReference implements Function1<String, String> {
    ReadOneTimePasswordFromSms$invoke$1(C18102k c18102k) {
        super(1, c18102k);
    }

    public final String getName() {
        return "extractCodeFromSms";
    }

    public final KDeclarationContainer getOwner() {
        return C15825i.m59860a(C18102k.class);
    }

    public final String getSignature() {
        return "extractCodeFromSms(Ljava/lang/String;)Ljava/lang/String;";
    }

    public /* synthetic */ Object invoke(Object obj) {
        return m68134a((String) obj);
    }

    @NotNull
    /* renamed from: a */
    public final String m68134a(@NotNull String str) {
        C2668g.b(str, "p1");
        return ((C18102k) this.receiver).m65707a(str);
    }
}
