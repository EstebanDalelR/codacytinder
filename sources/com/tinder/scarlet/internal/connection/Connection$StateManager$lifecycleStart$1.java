package com.tinder.scarlet.internal.connection;

import com.tinder.scarlet.C14788b.C16504a.C18035a;
import com.tinder.scarlet.Lifecycle.C14785a.C16490b;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u0006\u0012\u0002\b\u00030\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lcom/tinder/scarlet/Event$OnLifecycle$StateChange;", "invoke"}, k = 3, mv = {1, 1, 9})
final class Connection$StateManager$lifecycleStart$1 extends Lambda implements Function1<C18035a<?>, Boolean> {
    /* renamed from: a */
    public static final Connection$StateManager$lifecycleStart$1 f58329a = new Connection$StateManager$lifecycleStart$1();

    Connection$StateManager$lifecycleStart$1() {
        super(1);
    }

    public /* synthetic */ Object invoke(Object obj) {
        return Boolean.valueOf(m67239a((C18035a) obj));
    }

    /* renamed from: a */
    public final boolean m67239a(@NotNull C18035a<?> c18035a) {
        C2668g.b(c18035a, "$receiver");
        return C2668g.a(c18035a.m65500a(), C16490b.f51167a);
    }
}
