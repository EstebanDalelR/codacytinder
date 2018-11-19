package com.tinder.p260i;

import com.tinder.exception.LoopsEngineCreationException;
import com.tinder.exception.LoopsEngineExtractionException;
import com.tinder.exception.LoopsEngineVideoFormatException;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import p000a.p001a.C0001a;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\"\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u001c\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u001a\u001a\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\n\u0010\u0007\u001a\u00060\bj\u0002`\t¨\u0006\n"}, d2 = {"tinderCheck", "", "value", "", "lazyMessage", "Lkotlin/Function0;", "", "exception", "Ljava/lang/Exception;", "Lkotlin/Exception;", "tindercheck_release"}, k = 2, mv = {1, 1, 10})
/* renamed from: com.tinder.i.a */
public final class C9706a {
    /* renamed from: a */
    public static final void m40169a(boolean z, @NotNull Function0<? extends Object> function0) {
        C2668g.b(function0, "lazyMessage");
        C9706a.m40168a(z, (Exception) new IllegalStateException(function0.invoke().toString()));
    }

    /* renamed from: a */
    public static final void m40168a(boolean z, @NotNull Exception exception) {
        C2668g.b(exception, "exception");
        if (!z) {
            C0001a.e(exception.getMessage(), new Object[0]);
            if (exception instanceof LoopsEngineExtractionException) {
                throw exception;
            } else if (exception instanceof LoopsEngineCreationException) {
                throw exception;
            } else if (exception instanceof LoopsEngineVideoFormatException) {
                throw exception;
            }
        }
    }
}
