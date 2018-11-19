package com.tinder.data.message;

import kotlin.Metadata;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.C15825i;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.FunctionReference;
import kotlin.reflect.KDeclarationContainer;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u0015\u0010\u0002\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u00062\u0015\u0010\u0007\u001a\u00110\b¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\t2\u0015\u0010\n\u001a\u00110\b¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u000b¢\u0006\u0002\b\f"}, d2 = {"<anonymous>", "Lcom/tinder/data/message/Reaction;", "p1", "", "Lkotlin/ParameterName;", "name", "id", "p2", "", "reactionId", "p3", "messageId", "invoke"}, k = 3, mv = {1, 1, 10})
final class ReactionModels$REACTION_FACTORY$1 extends FunctionReference implements Function3<Long, String, String, az> {
    /* renamed from: a */
    public static final ReactionModels$REACTION_FACTORY$1 f45280a = new ReactionModels$REACTION_FACTORY$1();

    ReactionModels$REACTION_FACTORY$1() {
        super(3);
    }

    public final String getName() {
        return "<init>";
    }

    public final KDeclarationContainer getOwner() {
        return C15825i.a(az.class);
    }

    public final String getSignature() {
        return "<init>(JLjava/lang/String;Ljava/lang/String;)V";
    }

    public /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return m54358a(((Number) obj).longValue(), (String) obj2, (String) obj3);
    }

    @NotNull
    /* renamed from: a */
    public final az m54358a(long j, @NotNull String str, @NotNull String str2) {
        C2668g.b(str, "p2");
        C2668g.b(str2, "p3");
        return new az(j, str, str2);
    }
}
