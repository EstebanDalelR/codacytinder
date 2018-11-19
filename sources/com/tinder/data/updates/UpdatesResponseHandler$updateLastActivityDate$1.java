package com.tinder.data.updates;

import com.tinder.data.adapter.C10738l;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C15825i;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.FunctionReference;
import kotlin.reflect.KDeclarationContainer;
import org.jetbrains.annotations.NotNull;
import org.joda.time.DateTime;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0015\u0010\u0002\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "Lorg/joda/time/DateTime;", "p1", "", "Lkotlin/ParameterName;", "name", "dateString", "invoke"}, k = 3, mv = {1, 1, 10})
final class UpdatesResponseHandler$updateLastActivityDate$1 extends FunctionReference implements Function1<String, DateTime> {
    UpdatesResponseHandler$updateLastActivityDate$1(C10738l c10738l) {
        super(1, c10738l);
    }

    public final String getName() {
        return "fromApi";
    }

    public final KDeclarationContainer getOwner() {
        return C15825i.a(C10738l.class);
    }

    public final String getSignature() {
        return "fromApi(Ljava/lang/String;)Lorg/joda/time/DateTime;";
    }

    public /* synthetic */ Object invoke(Object obj) {
        return m54399a((String) obj);
    }

    @NotNull
    /* renamed from: a */
    public final DateTime m54399a(@NotNull String str) {
        C2668g.b(str, "p1");
        return ((C10738l) this.receiver).m43129a(str);
    }
}
