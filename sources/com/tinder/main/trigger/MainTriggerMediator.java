package com.tinder.main.trigger;

import android.arch.lifecycle.LifecycleObserver;
import com.tinder.main.trigger.Trigger.CompletionListener;
import com.tinder.main.trigger.Trigger.RunStrategy;
import java.util.Queue;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import p000a.p001a.C0001a;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000+\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\t\u0018\u00002\u00020\u0001:\u0001\u000eB\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\b\u0010\u000b\u001a\u00020\fH\u0007J\b\u0010\r\u001a\u00020\fH\u0007R\u000e\u0010\u0006\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0004\n\u0002\u0010\nR\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/tinder/main/trigger/MainTriggerMediator;", "Landroid/arch/lifecycle/LifecycleObserver;", "triggerQueue", "Ljava/util/Queue;", "Lcom/tinder/main/trigger/Trigger;", "(Ljava/util/Queue;)V", "state", "Lcom/tinder/main/trigger/MainTriggerMediator$State;", "triggerCompletionListener", "com/tinder/main/trigger/MainTriggerMediator$triggerCompletionListener$1", "Lcom/tinder/main/trigger/MainTriggerMediator$triggerCompletionListener$1;", "cancelTriggers", "", "runTriggers", "State", "main_release"}, k = 1, mv = {1, 1, 10})
public final class MainTriggerMediator implements LifecycleObserver {
    /* renamed from: a */
    private State f38982a = State.IDLE;
    /* renamed from: b */
    private final C12016a f38983b = new C12016a(this);
    /* renamed from: c */
    private final Queue<Trigger> f38984c;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/tinder/main/trigger/MainTriggerMediator$State;", "", "(Ljava/lang/String;I)V", "IDLE", "RUNNING", "main_release"}, k = 1, mv = {1, 1, 10})
    public enum State {
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, d2 = {"com/tinder/main/trigger/MainTriggerMediator$triggerCompletionListener$1", "Lcom/tinder/main/trigger/Trigger$CompletionListener;", "(Lcom/tinder/main/trigger/MainTriggerMediator;)V", "onTriggerComplete", "", "trigger", "Lcom/tinder/main/trigger/Trigger;", "main_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.main.trigger.MainTriggerMediator$a */
    public static final class C12016a implements CompletionListener {
        /* renamed from: a */
        final /* synthetic */ MainTriggerMediator f38981a;

        C12016a(MainTriggerMediator mainTriggerMediator) {
            this.f38981a = mainTriggerMediator;
        }

        public void onTriggerComplete(@NotNull Trigger trigger) {
            C2668g.b(trigger, "trigger");
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Trigger Complete ");
            stringBuilder.append(trigger);
            C0001a.b(stringBuilder.toString(), new Object[0]);
            synchronized (this.f38981a) {
                this.f38981a.f38984c.remove(trigger);
            }
        }
    }

    public MainTriggerMediator(@NotNull Queue<Trigger> queue) {
        C2668g.b(queue, "triggerQueue");
        this.f38984c = queue;
    }

    /* renamed from: a */
    public final synchronized void m48058a() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Asked to run ");
        stringBuilder.append(this.f38984c.size());
        stringBuilder.append(" triggers");
        C0001a.b(stringBuilder.toString(), new Object[0]);
        if (this.f38982a == State.RUNNING) {
            C0001a.b("Already running triggers, don't run", new Object[0]);
            return;
        }
        this.f38982a = State.RUNNING;
        for (Trigger trigger : this.f38984c) {
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append("Running Trigger ");
            stringBuilder2.append(trigger);
            C0001a.b(stringBuilder2.toString(), new Object[0]);
            if (trigger.mo9999a() == RunStrategy.TRANSIENT) {
                trigger.m40455a((CompletionListener) this.f38983b);
            }
            trigger.u_();
        }
    }

    /* renamed from: b */
    public final synchronized void m48059b() {
        if (this.f38982a != State.IDLE) {
            this.f38982a = State.IDLE;
            for (Trigger trigger : this.f38984c) {
                trigger.m40460f();
                if (trigger.mo9999a() == RunStrategy.TRANSIENT) {
                    trigger.m40458b((CompletionListener) this.f38983b);
                }
            }
        }
    }
}
