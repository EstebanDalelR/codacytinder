package android.arch.lifecycle;

import android.arch.core.p003b.C2675a;
import android.arch.lifecycle.Lifecycle.Event;
import android.arch.lifecycle.Lifecycle.State;
import android.support.annotation.MainThread;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.Log;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map.Entry;

/* renamed from: android.arch.lifecycle.e */
public class C2684e extends Lifecycle {
    /* renamed from: a */
    private C2675a<LifecycleObserver, C0020a> f8495a = new C2675a();
    /* renamed from: b */
    private State f8496b;
    /* renamed from: c */
    private final WeakReference<LifecycleOwner> f8497c;
    /* renamed from: d */
    private int f8498d = 0;
    /* renamed from: e */
    private boolean f8499e = false;
    /* renamed from: f */
    private boolean f8500f = false;
    /* renamed from: g */
    private ArrayList<State> f8501g = new ArrayList();

    /* renamed from: android.arch.lifecycle.e$a */
    static class C0020a {
        /* renamed from: a */
        State f48a;
        /* renamed from: b */
        GenericLifecycleObserver f49b;

        C0020a(LifecycleObserver lifecycleObserver, State state) {
            this.f49b = C0021f.m102a((Object) lifecycleObserver);
            this.f48a = state;
        }

        /* renamed from: a */
        void m100a(LifecycleOwner lifecycleOwner, Event event) {
            State b = C2684e.m10458b(event);
            this.f48a = C2684e.m10456a(this.f48a, b);
            this.f49b.onStateChanged(lifecycleOwner, event);
            this.f48a = b;
        }
    }

    public C2684e(@NonNull LifecycleOwner lifecycleOwner) {
        this.f8497c = new WeakReference(lifecycleOwner);
        this.f8496b = State.INITIALIZED;
    }

    @MainThread
    /* renamed from: a */
    public void m10470a(@NonNull State state) {
        m10459b(state);
    }

    /* renamed from: a */
    public void m10469a(@NonNull Event event) {
        m10459b(C2684e.m10458b(event));
    }

    /* renamed from: b */
    private void m10459b(State state) {
        if (this.f8496b != state) {
            this.f8496b = state;
            if (this.f8499e == null) {
                if (this.f8498d == null) {
                    this.f8499e = true;
                    m10466d();
                    this.f8499e = null;
                    return;
                }
            }
            this.f8500f = true;
        }
    }

    /* renamed from: b */
    private boolean m10461b() {
        boolean z = true;
        if (this.f8495a.m39a() == 0) {
            return true;
        }
        State state = ((C0020a) this.f8495a.m46d().getValue()).f48a;
        State state2 = ((C0020a) this.f8495a.m47e().getValue()).f48a;
        if (state != state2 || this.f8496b != state2) {
            z = false;
        }
        return z;
    }

    /* renamed from: c */
    private State m10462c(LifecycleObserver lifecycleObserver) {
        lifecycleObserver = this.f8495a.m10436d(lifecycleObserver);
        State state = null;
        lifecycleObserver = lifecycleObserver != null ? ((C0020a) lifecycleObserver.getValue()).f48a : null;
        if (!this.f8501g.isEmpty()) {
            state = (State) this.f8501g.get(this.f8501g.size() - 1);
        }
        return C2684e.m10456a(C2684e.m10456a(this.f8496b, lifecycleObserver), state);
    }

    /* renamed from: a */
    public void mo36a(@NonNull LifecycleObserver lifecycleObserver) {
        C0020a c0020a = new C0020a(lifecycleObserver, this.f8496b == State.DESTROYED ? State.DESTROYED : State.INITIALIZED);
        if (((C0020a) this.f8495a.mo19a(lifecycleObserver, c0020a)) == null) {
            LifecycleOwner lifecycleOwner = (LifecycleOwner) this.f8497c.get();
            if (lifecycleOwner != null) {
                Object obj;
                Enum c;
                if (this.f8498d == 0) {
                    if (!this.f8499e) {
                        obj = null;
                        c = m10462c(lifecycleObserver);
                        this.f8498d++;
                        while (c0020a.f48a.compareTo(c) < 0 && this.f8495a.m10435c(lifecycleObserver)) {
                            m10464c(c0020a.f48a);
                            c0020a.m100a(lifecycleOwner, C2684e.m10467e(c0020a.f48a));
                            m10463c();
                            c = m10462c(lifecycleObserver);
                        }
                        if (obj == null) {
                            m10466d();
                        }
                        this.f8498d -= 1;
                    }
                }
                obj = 1;
                c = m10462c(lifecycleObserver);
                this.f8498d++;
                while (c0020a.f48a.compareTo(c) < 0) {
                    m10464c(c0020a.f48a);
                    c0020a.m100a(lifecycleOwner, C2684e.m10467e(c0020a.f48a));
                    m10463c();
                    c = m10462c(lifecycleObserver);
                }
                if (obj == null) {
                    m10466d();
                }
                this.f8498d -= 1;
            }
        }
    }

    /* renamed from: c */
    private void m10463c() {
        this.f8501g.remove(this.f8501g.size() - 1);
    }

    /* renamed from: c */
    private void m10464c(State state) {
        this.f8501g.add(state);
    }

    /* renamed from: b */
    public void mo37b(@NonNull LifecycleObserver lifecycleObserver) {
        this.f8495a.mo20b(lifecycleObserver);
    }

    @NonNull
    /* renamed from: a */
    public State mo35a() {
        return this.f8496b;
    }

    /* renamed from: b */
    static State m10458b(Event event) {
        switch (event) {
            case ON_CREATE:
            case ON_STOP:
                return State.CREATED;
            case ON_START:
            case ON_PAUSE:
                return State.STARTED;
            case ON_RESUME:
                return State.RESUMED;
            case ON_DESTROY:
                return State.DESTROYED;
            default:
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Unexpected event value ");
                stringBuilder.append(event);
                throw new IllegalArgumentException(stringBuilder.toString());
        }
    }

    /* renamed from: d */
    private static Event m10465d(State state) {
        switch (state) {
            case INITIALIZED:
                throw new IllegalArgumentException();
            case CREATED:
                return Event.ON_DESTROY;
            case STARTED:
                return Event.ON_STOP;
            case RESUMED:
                return Event.ON_PAUSE;
            case DESTROYED:
                throw new IllegalArgumentException();
            default:
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Unexpected state value ");
                stringBuilder.append(state);
                throw new IllegalArgumentException(stringBuilder.toString());
        }
    }

    /* renamed from: e */
    private static Event m10467e(State state) {
        switch (state) {
            case INITIALIZED:
            case DESTROYED:
                return Event.ON_CREATE;
            case CREATED:
                return Event.ON_START;
            case STARTED:
                return Event.ON_RESUME;
            case RESUMED:
                throw new IllegalArgumentException();
            default:
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Unexpected state value ");
                stringBuilder.append(state);
                throw new IllegalArgumentException(stringBuilder.toString());
        }
    }

    /* renamed from: a */
    private void m10457a(LifecycleOwner lifecycleOwner) {
        Iterator c = this.f8495a.m45c();
        while (c.hasNext() && !this.f8500f) {
            Entry entry = (Entry) c.next();
            C0020a c0020a = (C0020a) entry.getValue();
            while (c0020a.f48a.compareTo(this.f8496b) < 0 && !this.f8500f && this.f8495a.m10435c(entry.getKey())) {
                m10464c(c0020a.f48a);
                c0020a.m100a(lifecycleOwner, C2684e.m10467e(c0020a.f48a));
                m10463c();
            }
        }
    }

    /* renamed from: b */
    private void m10460b(LifecycleOwner lifecycleOwner) {
        Iterator b = this.f8495a.m44b();
        while (b.hasNext() && !this.f8500f) {
            Entry entry = (Entry) b.next();
            C0020a c0020a = (C0020a) entry.getValue();
            while (c0020a.f48a.compareTo(this.f8496b) > 0 && !this.f8500f && this.f8495a.m10435c(entry.getKey())) {
                Event d = C2684e.m10465d(c0020a.f48a);
                m10464c(C2684e.m10458b(d));
                c0020a.m100a(lifecycleOwner, d);
                m10463c();
            }
        }
    }

    /* renamed from: d */
    private void m10466d() {
        LifecycleOwner lifecycleOwner = (LifecycleOwner) this.f8497c.get();
        if (lifecycleOwner == null) {
            Log.w("LifecycleRegistry", "LifecycleOwner is garbage collected, you shouldn't try dispatch new events from it.");
            return;
        }
        while (!m10461b()) {
            this.f8500f = false;
            if (this.f8496b.compareTo(((C0020a) this.f8495a.m46d().getValue()).f48a) < 0) {
                m10460b(lifecycleOwner);
            }
            Entry e = this.f8495a.m47e();
            if (!(this.f8500f || e == null || this.f8496b.compareTo(((C0020a) e.getValue()).f48a) <= 0)) {
                m10457a(lifecycleOwner);
            }
        }
        this.f8500f = false;
    }

    /* renamed from: a */
    static State m10456a(@NonNull State state, @Nullable State state2) {
        return (state2 == null || state2.compareTo(state) >= 0) ? state : state2;
    }
}
