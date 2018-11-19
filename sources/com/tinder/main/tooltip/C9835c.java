package com.tinder.main.tooltip;

import com.tinder.main.trigger.Trigger;
import com.tinder.main.trigger.Trigger.CancelListener;
import com.tinder.main.trigger.Trigger.CompletionListener;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;
import kotlin.Metadata;
import kotlin.collections.C19301m;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import p000a.p001a.C0001a;

@Metadata(bv = {1, 0, 2}, d1 = {"\u00001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004*\u0001\u0004\u0018\u00002\u00020\u0001:\u0001\u0011B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\fJ\u0010\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\fH\u0002R\u0010\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0004\n\u0002\u0010\u0005R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/tinder/main/tooltip/MainTutorialDisplayQueue;", "", "()V", "cancelListener", "com/tinder/main/tooltip/MainTutorialDisplayQueue$cancelListener$1", "Lcom/tinder/main/tooltip/MainTutorialDisplayQueue$cancelListener$1;", "completionListener", "Lcom/tinder/main/trigger/Trigger$CompletionListener;", "isShowingTutorial", "", "requestQueue", "Ljava/util/Queue;", "Lcom/tinder/main/tooltip/MainTutorialDisplayQueue$DisplayRequest;", "enqueueTutorial", "", "displayRequest", "showTutorial", "DisplayRequest", "main_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.main.tooltip.c */
public final class C9835c {
    /* renamed from: a */
    private final Queue<C9834a> f32548a = new LinkedBlockingQueue();
    /* renamed from: b */
    private boolean f32549b;
    /* renamed from: c */
    private final CompletionListener f32550c = new C12015c(this);
    /* renamed from: d */
    private final C12014b f32551d = new C12014b(this);

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\b&\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0007\u001a\u00020\bH&R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/tinder/main/tooltip/MainTutorialDisplayQueue$DisplayRequest;", "", "trigger", "Lcom/tinder/main/trigger/Trigger;", "(Lcom/tinder/main/trigger/Trigger;)V", "getTrigger", "()Lcom/tinder/main/trigger/Trigger;", "execute", "", "main_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.main.tooltip.c$a */
    public static abstract class C9834a {
        @NotNull
        /* renamed from: a */
        private final Trigger f32547a;

        /* renamed from: a */
        public abstract void mo10002a();

        public C9834a(@NotNull Trigger trigger) {
            C2668g.b(trigger, "trigger");
            this.f32547a = trigger;
        }

        @NotNull
        /* renamed from: b */
        public final Trigger m40446b() {
            return this.f32547a;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, d2 = {"com/tinder/main/tooltip/MainTutorialDisplayQueue$cancelListener$1", "Lcom/tinder/main/trigger/Trigger$CancelListener;", "(Lcom/tinder/main/tooltip/MainTutorialDisplayQueue;)V", "onTriggerCancelled", "", "trigger", "Lcom/tinder/main/trigger/Trigger;", "main_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.main.tooltip.c$b */
    public static final class C12014b implements CancelListener {
        /* renamed from: a */
        final /* synthetic */ C9835c f38979a;

        C12014b(C9835c c9835c) {
            this.f38979a = c9835c;
        }

        public void onTriggerCancelled(@NotNull Trigger trigger) {
            C2668g.b(trigger, "trigger");
            C19301m.a(this.f38979a.f32548a, new MainTutorialDisplayQueue$cancelListener$1$onTriggerCancelled$1(trigger));
            trigger.m40457b((CancelListener) this);
            trigger.m40458b(this.f38979a.f32550c);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, d2 = {"com/tinder/main/tooltip/MainTutorialDisplayQueue$completionListener$1", "Lcom/tinder/main/trigger/Trigger$CompletionListener;", "(Lcom/tinder/main/tooltip/MainTutorialDisplayQueue;)V", "onTriggerComplete", "", "trigger", "Lcom/tinder/main/trigger/Trigger;", "main_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.main.tooltip.c$c */
    public static final class C12015c implements CompletionListener {
        /* renamed from: a */
        final /* synthetic */ C9835c f38980a;

        C12015c(C9835c c9835c) {
            this.f38980a = c9835c;
        }

        public void onTriggerComplete(@NotNull Trigger trigger) {
            C2668g.b(trigger, "trigger");
            this.f38980a.f32549b = false;
            trigger.m40458b((CompletionListener) this);
            C9834a c9834a = (C9834a) this.f38980a.f32548a.poll();
            if (c9834a != null) {
                this.f38980a.m40451b(c9834a);
            }
        }
    }

    /* renamed from: a */
    public final void m40452a(@NotNull C9834a c9834a) {
        C2668g.b(c9834a, "displayRequest");
        if (!this.f32548a.contains(c9834a)) {
            Trigger b = c9834a.m40446b();
            b.m40455a(this.f32550c);
            b.m40454a((CancelListener) this.f32551d);
            if (this.f32548a.isEmpty()) {
                if (!this.f32549b) {
                    m40451b(c9834a);
                    return;
                }
            }
            C0001a.b("Adding Trigger To Queue: %s", new Object[]{b});
            this.f32548a.add(c9834a);
        }
    }

    /* renamed from: b */
    private final void m40451b(C9834a c9834a) {
        this.f32549b = true;
        c9834a.mo10002a();
    }
}
