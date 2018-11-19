package com.tinder.reactions.gestures.animation;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b&\u0018\u00002\u00020\u0001:\u0001\u000bB\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0005J\r\u0010\t\u001a\u00020\u0007H\u0000¢\u0006\u0002\b\nR\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/tinder/reactions/gestures/animation/ReactionExitAnimationDecorator;", "Lcom/tinder/reactions/gestures/animation/ReactionEntranceAnimationDecorator;", "()V", "animationListeners", "", "Lcom/tinder/reactions/gestures/animation/ReactionExitAnimationDecorator$ExitAnimationListener;", "addListener", "", "exitAnimationListener", "notifyExitAnimationEnded", "notifyExitAnimationEnded$Tinder_release", "ExitAnimationListener", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public abstract class ReactionExitAnimationDecorator extends ReactionEntranceAnimationDecorator {
    /* renamed from: a */
    private final List<ExitAnimationListener> f50826a = new ArrayList();

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, d2 = {"Lcom/tinder/reactions/gestures/animation/ReactionExitAnimationDecorator$ExitAnimationListener;", "", "onExitAnimationEnd", "", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    public interface ExitAnimationListener {
        void onExitAnimationEnd();
    }

    /* renamed from: a */
    public final void m61624a(@NotNull ExitAnimationListener exitAnimationListener) {
        C2668g.b(exitAnimationListener, "exitAnimationListener");
        this.f50826a.add(exitAnimationListener);
    }

    /* renamed from: b */
    public final void m61625b() {
        for (ExitAnimationListener onExitAnimationEnd : this.f50826a) {
            onExitAnimationEnd.onExitAnimationEnd();
        }
        this.f50826a.clear();
    }
}
