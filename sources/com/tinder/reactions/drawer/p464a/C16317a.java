package com.tinder.reactions.drawer.p464a;

import com.tinder.reactions.drawer.mediator.AnimatorControllerInterface;
import com.tinder.reactions.drawer.mediator.C14629b;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\u0006\u0010\u0007\u001a\u00020\bJ\u0006\u0010\t\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/tinder/reactions/drawer/controller/ReactionsInputStateController;", "Lcom/tinder/reactions/drawer/mediator/AnimatorControllerInterface;", "chatInputStateDelegate", "Lcom/tinder/reactions/drawer/mediator/ChatInputStateDelegate;", "(Lcom/tinder/reactions/drawer/mediator/ChatInputStateDelegate;)V", "allowDrag", "", "clear", "", "start", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.reactions.drawer.a.a */
public final class C16317a implements AnimatorControllerInterface {
    /* renamed from: a */
    private final C14629b f50756a;

    @Inject
    public C16317a(@NotNull C14629b c14629b) {
        C2668g.b(c14629b, "chatInputStateDelegate");
        this.f50756a = c14629b;
    }

    public boolean allowDrag() {
        return this.f50756a.m55798a() ^ 1;
    }

    /* renamed from: a */
    public final void m61524a() {
        this.f50756a.m55803f();
    }

    /* renamed from: b */
    public final void m61525b() {
        this.f50756a.m55804g();
    }
}
