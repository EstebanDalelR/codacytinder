package com.tinder.crashindicator.view;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C15825i;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.FunctionReference;
import kotlin.reflect.KDeclarationContainer;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\r\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "p1", "", "invoke"}, k = 3, mv = {1, 1, 10})
final class AppCrashDialog$observeFeedbackTextChanges$1 extends FunctionReference implements Function1<Object, String> {
    /* renamed from: a */
    public static final AppCrashDialog$observeFeedbackTextChanges$1 f45131a = new AppCrashDialog$observeFeedbackTextChanges$1();

    AppCrashDialog$observeFeedbackTextChanges$1() {
        super(1);
    }

    public final String getName() {
        return "toString";
    }

    public final KDeclarationContainer getOwner() {
        return C15825i.a(CharSequence.class);
    }

    public final String getSignature() {
        return "toString()Ljava/lang/String;";
    }

    public /* synthetic */ Object invoke(Object obj) {
        return m54059a((CharSequence) obj);
    }

    @NotNull
    /* renamed from: a */
    public final String m54059a(@NotNull CharSequence charSequence) {
        C2668g.b(charSequence, "p1");
        return charSequence.toString();
    }
}
