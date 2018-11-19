package com.tinder.main.trigger;

import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\b&\u0018\u00002\u00020\u0001:\u0003\u0016\u0017\u0018B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0005J\u000e\u0010\u000b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0007J\u0006\u0010\f\u001a\u00020\tJ\u0006\u0010\r\u001a\u00020\tJ\b\u0010\u000e\u001a\u00020\u000fH&J\b\u0010\u0010\u001a\u00020\tH&J\b\u0010\u0011\u001a\u00020\tH&J\u000e\u0010\u0012\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0005J\u000e\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u0007J\b\u0010\u0015\u001a\u00020\tH&R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/tinder/main/trigger/Trigger;", "", "()V", "cancelListeners", "Ljava/util/concurrent/CopyOnWriteArraySet;", "Lcom/tinder/main/trigger/Trigger$CancelListener;", "completionListeners", "Lcom/tinder/main/trigger/Trigger$CompletionListener;", "addCancelListener", "", "listener", "addCompletionListener", "cancel", "complete", "getRunStrategy", "Lcom/tinder/main/trigger/Trigger$RunStrategy;", "onCancelled", "onCompleted", "removeCancelListener", "removeCompletionListener", "triggerCompletionListener", "run", "CancelListener", "CompletionListener", "RunStrategy", "main_release"}, k = 1, mv = {1, 1, 10})
public abstract class Trigger {
    /* renamed from: a */
    private final CopyOnWriteArraySet<CompletionListener> f32552a = new CopyOnWriteArraySet();
    /* renamed from: b */
    private final CopyOnWriteArraySet<CancelListener> f32553b = new CopyOnWriteArraySet();

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/tinder/main/trigger/Trigger$CancelListener;", "", "onTriggerCancelled", "", "trigger", "Lcom/tinder/main/trigger/Trigger;", "main_release"}, k = 1, mv = {1, 1, 10})
    public interface CancelListener {
        void onTriggerCancelled(@NotNull Trigger trigger);
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/tinder/main/trigger/Trigger$CompletionListener;", "", "onTriggerComplete", "", "trigger", "Lcom/tinder/main/trigger/Trigger;", "main_release"}, k = 1, mv = {1, 1, 10})
    public interface CompletionListener {
        void onTriggerComplete(@NotNull Trigger trigger);
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/tinder/main/trigger/Trigger$RunStrategy;", "", "(Ljava/lang/String;I)V", "STICKY", "TRANSIENT", "main_release"}, k = 1, mv = {1, 1, 10})
    public enum RunStrategy {
    }

    @NotNull
    /* renamed from: a */
    public abstract RunStrategy mo9999a();

    /* renamed from: b */
    public abstract void mo10000b();

    /* renamed from: d */
    public abstract void mo11131d();

    public abstract void u_();

    /* renamed from: f */
    public final void m40460f() {
        mo11131d();
        for (CancelListener onTriggerCancelled : this.f32553b) {
            onTriggerCancelled.onTriggerCancelled(this);
        }
    }

    /* renamed from: g */
    public final void m40461g() {
        mo10000b();
        for (CompletionListener onTriggerComplete : this.f32552a) {
            onTriggerComplete.onTriggerComplete(this);
        }
    }

    /* renamed from: a */
    public final void m40455a(@NotNull CompletionListener completionListener) {
        C2668g.b(completionListener, "listener");
        this.f32552a.add(completionListener);
    }

    /* renamed from: b */
    public final void m40458b(@NotNull CompletionListener completionListener) {
        C2668g.b(completionListener, "triggerCompletionListener");
        this.f32552a.remove(completionListener);
    }

    /* renamed from: a */
    public final void m40454a(@NotNull CancelListener cancelListener) {
        C2668g.b(cancelListener, "listener");
        this.f32553b.add(cancelListener);
    }

    /* renamed from: b */
    public final void m40457b(@NotNull CancelListener cancelListener) {
        C2668g.b(cancelListener, "listener");
        this.f32553b.remove(cancelListener);
    }
}
