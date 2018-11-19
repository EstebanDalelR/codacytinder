package com.tinder.statemachine;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.C15811g;
import kotlin.C15813i;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.C17554o;
import kotlin.collections.C19299w;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\u0018\u0000 \"*\b\b\u0000\u0010\u0001*\u00020\u0002*\b\b\u0001\u0010\u0003*\u00020\u00022\u00020\u0002:\u0004!\"#$B\u0007\b\u0002¢\u0006\u0002\u0010\u0004J\u0013\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00028\u0001¢\u0006\u0002\u0010\u0016J\u001d\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000f*\u00028\u0000H\u0002¢\u0006\u0002\u0010\u0018J\u001b\u0010\u0019\u001a\u0004\u0018\u00018\u0000*\u00028\u00002\u0006\u0010\u0015\u001a\u00028\u0001H\u0002¢\u0006\u0002\u0010\u001aJ\u0011\u0010\u001b\u001a\u00020\b*\u00028\u0000H\u0002¢\u0006\u0002\u0010\u001cJ\u0019\u0010\u001d\u001a\u00020\b*\u00028\u00002\u0006\u0010\u001e\u001a\u00028\u0001H\u0002¢\u0006\u0002\u0010\u001fJ\u0019\u0010 \u001a\u00020\b*\u00028\u00002\u0006\u0010\u001e\u001a\u00028\u0001H\u0002¢\u0006\u0002\u0010\u001fR \u0010\u0005\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\b0\u00070\u0006X\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\t\u001a\u00028\u00008F¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bRZ\u0010\f\u001aN\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00000\u000e\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000f0\rj&\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00000\u000e\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000f`\u0010X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0012X\u0004¢\u0006\u0002\n\u0000¨\u0006%"}, d2 = {"Lcom/tinder/statemachine/StateMachine;", "STATE", "", "EVENT", "()V", "onStateChangeListeners", "", "Lkotlin/Function1;", "", "state", "getState", "()Ljava/lang/Object;", "stateDefinitions", "Ljava/util/LinkedHashMap;", "Lcom/tinder/statemachine/StateMachine$Matcher;", "Lcom/tinder/statemachine/StateMachine$StateDefinition;", "Lkotlin/collections/LinkedHashMap;", "stateRef", "Ljava/util/concurrent/atomic/AtomicReference;", "transition", "", "event", "(Ljava/lang/Object;)Z", "getDefinition", "(Ljava/lang/Object;)Lcom/tinder/statemachine/StateMachine$StateDefinition;", "getNext", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "notifyOnChange", "(Ljava/lang/Object;)V", "notifyOnEnter", "cause", "(Ljava/lang/Object;Ljava/lang/Object;)V", "notifyOnExit", "Builder", "Companion", "Matcher", "StateDefinition", "state-machine"}, k = 1, mv = {1, 1, 9})
/* renamed from: com.tinder.statemachine.a */
public final class C15065a<STATE, EVENT> {
    /* renamed from: a */
    public static final C15061b f46899a = new C15061b();
    /* renamed from: b */
    private final AtomicReference<STATE> f46900b;
    /* renamed from: c */
    private final LinkedHashMap<C15063c<STATE, STATE>, C15064d<STATE, EVENT>> f46901c;
    /* renamed from: d */
    private final List<Function1<STATE, C15813i>> f46902d;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000*\b\b\u0002\u0010\u0001*\u00020\u0002*\b\b\u0003\u0010\u0003*\u00020\u00022\u00020\u0002:\u0001\u0017B\u0005¢\u0006\u0002\u0010\u0004J\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0006J\u0013\u0010\b\u001a\u00020\t2\u0006\u0010\b\u001a\u00028\u0002¢\u0006\u0002\u0010\nJ\u001a\u0010\u000b\u001a\u00020\f2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00020\t0\u000eJS\u0010\u000f\u001a\u00020\t\"\n\b\u0004\u0010\u0010\u0018\u0001*\u00028\u00022\u0006\u0010\u000f\u001a\u0002H\u00102/\b\b\u0010\u0011\u001a)\u0012\u001a\u0012\u0018\u0012\u0004\u0012\u0002H\u00100\u0012R\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0000\u0012\u0004\u0012\u00020\t0\u000e¢\u0006\u0002\b\u0013H\b¢\u0006\u0002\u0010\u0014JF\u0010\u000f\u001a\u00020\t\"\n\b\u0004\u0010\u0010\u0018\u0001*\u00028\u00022/\b\b\u0010\u0011\u001a)\u0012\u001a\u0012\u0018\u0012\u0004\u0012\u0002H\u00100\u0012R\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0000\u0012\u0004\u0012\u00020\t0\u000e¢\u0006\u0002\b\u0013H\bJS\u0010\u000f\u001a\u00020\t\"\b\b\u0004\u0010\u0010*\u00028\u00022\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u0002H\u00100\u00162-\u0010\u0011\u001a)\u0012\u001a\u0012\u0018\u0012\u0004\u0012\u0002H\u00100\u0012R\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0000\u0012\u0004\u0012\u00020\t0\u000e¢\u0006\u0002\b\u0013R\u001a\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/tinder/statemachine/StateMachine$Builder;", "STATE", "", "EVENT", "()V", "stateMachine", "Lcom/tinder/statemachine/StateMachine;", "build", "defaultState", "", "(Ljava/lang/Object;)V", "onStateChange", "", "listener", "Lkotlin/Function1;", "state", "S", "init", "Lcom/tinder/statemachine/StateMachine$Builder$StateDefinitionBuilder;", "Lkotlin/ExtensionFunctionType;", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V", "stateMatcher", "Lcom/tinder/statemachine/StateMachine$Matcher;", "StateDefinitionBuilder", "state-machine"}, k = 1, mv = {1, 1, 9})
    /* renamed from: com.tinder.statemachine.a$a */
    public static final class C15060a<STATE, EVENT> {
        /* renamed from: a */
        private final C15065a<STATE, EVENT> f46891a = new C15065a();

        @Metadata(bv = {1, 0, 2}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0004\u0018\u0000*\n\b\u0004\u0010\u0001 \u0001*\u00028\u00022\u00020\u0002:\u0001\u0016B\u0005¢\u0006\u0002\u0010\u0003J\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0005JB\u0010\u0007\u001a\"\u0012\u0004\u0012\u0002H\t0\bR\u0018\u0012\u0004\u0012\u00028\u00040\u0000R\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\n\"\n\b\u0005\u0010\t\u0018\u0001*\u00028\u00032\u0006\u0010\u000b\u001a\u0002H\tH\b¢\u0006\u0002\u0010\fJK\u0010\u0007\u001a\"\u0012\u0004\u0012\u0002H\t0\bR\u0018\u0012\u0004\u0012\u00028\u00040\u0000R\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\n\"\n\b\u0005\u0010\t\u0018\u0001*\u00028\u00032\u0014\b\u0002\u0010\r\u001a\u000e\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u0002H\t0\u000eH\bJ%\u0010\u000f\u001a\u00020\u00102\u001d\u0010\u0011\u001a\u0019\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00020\u00130\u0012¢\u0006\u0002\b\u0014J%\u0010\u0015\u001a\u00020\u00102\u001d\u0010\u0011\u001a\u0019\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00020\u00130\u0012¢\u0006\u0002\b\u0014R\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/tinder/statemachine/StateMachine$Builder$StateDefinitionBuilder;", "S", "", "(Lcom/tinder/statemachine/StateMachine$Builder;)V", "stateDefinition", "Lcom/tinder/statemachine/StateMachine$StateDefinition;", "build", "on", "Lcom/tinder/statemachine/StateMachine$Builder$StateDefinitionBuilder$OnEvent;", "E", "Lcom/tinder/statemachine/StateMachine$Builder;", "event", "(Ljava/lang/Object;)Lcom/tinder/statemachine/StateMachine$Builder$StateDefinitionBuilder$OnEvent;", "eventMatcher", "Lcom/tinder/statemachine/StateMachine$Matcher;", "onEnter", "", "listener", "Lkotlin/Function2;", "", "Lkotlin/ExtensionFunctionType;", "onExit", "OnEvent", "state-machine"}, k = 1, mv = {1, 1, 9})
        /* renamed from: com.tinder.statemachine.a$a$a */
        public final class C15059a<S extends STATE> {
            /* renamed from: a */
            final /* synthetic */ C15060a f46889a;
            /* renamed from: b */
            private final C15064d<STATE, EVENT> f46890b = new C15064d();

            @Metadata(bv = {1, 0, 2}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0004\u0018\u0000*\n\b\u0005\u0010\u0001 \u0001*\u00028\u00032\u00020\u0002B\u0019\u0012\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u00050\u0004¢\u0006\u0002\u0010\u0005J(\u0010\u0006\u001a\u00020\u00072\u001d\u0010\b\u001a\u0019\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u0005\u0012\u0004\u0012\u00020\u00070\t¢\u0006\u0002\b\nH\u0004J2\u0010\u000b\u001a\u00020\u0007\"\b\b\u0006\u0010\f*\u00028\u00022\u001d\u0010\r\u001a\u0019\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u0005\u0012\u0004\u0012\u0002H\f0\t¢\u0006\u0002\b\nH\u0004R\u001a\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u00050\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/tinder/statemachine/StateMachine$Builder$StateDefinitionBuilder$OnEvent;", "E", "", "matcher", "Lcom/tinder/statemachine/StateMachine$Matcher;", "(Lcom/tinder/statemachine/StateMachine$Builder$StateDefinitionBuilder;Lcom/tinder/statemachine/StateMachine$Matcher;)V", "run", "", "action", "Lkotlin/Function2;", "Lkotlin/ExtensionFunctionType;", "transitionTo", "T", "createNewState", "state-machine"}, k = 1, mv = {1, 1, 9})
            /* renamed from: com.tinder.statemachine.a$a$a$a */
            public final class C15058a<E extends EVENT> {
                /* renamed from: a */
                final /* synthetic */ C15059a f46887a;
                /* renamed from: b */
                private final C15063c<EVENT, E> f46888b;

                public C15058a(C15059a c15059a, @NotNull C15063c<EVENT, ? extends E> c15063c) {
                    C2668g.b(c15063c, "matcher");
                    this.f46887a = c15059a;
                    this.f46888b = c15063c;
                }

                /* renamed from: a */
                public final <T extends STATE> void m56751a(@NotNull Function2<? super S, ? super E, ? extends T> function2) {
                    C2668g.b(function2, "createNewState");
                    this.f46887a.f46890b.m56767d().put(this.f46888b, new C18928xc12cb50a(this, function2));
                }

                /* renamed from: b */
                public final void m56752b(@NotNull Function2<? super S, ? super E, C15813i> function2) {
                    C2668g.b(function2, "action");
                    this.f46887a.f46890b.m56766c().put(this.f46888b, new C18927x53fe1aad(this, function2));
                }
            }

            public C15059a(C15060a c15060a) {
                this.f46889a = c15060a;
            }

            /* renamed from: a */
            public final boolean m56755a(@NotNull Function2<? super S, ? super EVENT, C15813i> function2) {
                C2668g.b(function2, "listener");
                return this.f46890b.m56764a().add(new C18929xa28975d6(function2));
            }

            @NotNull
            /* renamed from: a */
            public final C15064d<STATE, EVENT> m56754a() {
                return this.f46890b;
            }
        }

        /* renamed from: a */
        public final <S extends STATE> void m56757a(@NotNull C15063c<STATE, ? extends S> c15063c, @NotNull Function1<? super C15059a<? extends S>, C15813i> function1) {
            C2668g.b(c15063c, "stateMatcher");
            C2668g.b(function1, "init");
            Map a = this.f46891a.f46901c;
            C15059a c15059a = new C15059a(this);
            function1.invoke(c15059a);
            a.put(c15063c, c15059a.m56754a());
        }

        /* renamed from: a */
        public final void m56758a(@NotNull STATE state) {
            C2668g.b(state, "defaultState");
            this.f46891a.f46900b.set(state);
        }

        /* renamed from: a */
        public final boolean m56759a(@NotNull Function1<? super STATE, C15813i> function1) {
            C2668g.b(function1, "listener");
            return this.f46891a.f46902d.add(function1);
        }

        @NotNull
        /* renamed from: a */
        public final C15065a<STATE, EVENT> m56756a() {
            C15065a c15065a = this.f46891a;
            if (c15065a.f46900b.get() != null) {
                return c15065a;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002JK\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u0002H\u0005\u0012\u0004\u0012\u0002H\u00060\u0004\"\b\b\u0002\u0010\u0005*\u00020\u0001\"\b\b\u0003\u0010\u0006*\u00020\u00012#\u0010\u0007\u001a\u001f\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0005\u0012\u0004\u0012\u0002H\u00060\t\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/tinder/statemachine/StateMachine$Companion;", "", "()V", "create", "Lcom/tinder/statemachine/StateMachine;", "STATE", "EVENT", "init", "Lkotlin/Function1;", "Lcom/tinder/statemachine/StateMachine$Builder;", "", "Lkotlin/ExtensionFunctionType;", "state-machine"}, k = 1, mv = {1, 1, 9})
    /* renamed from: com.tinder.statemachine.a$b */
    public static final class C15061b {
        private C15061b() {
        }

        @NotNull
        /* renamed from: a */
        public final <STATE, EVENT> C15065a<STATE, EVENT> m56760a(@NotNull Function1<? super C15060a<STATE, EVENT>, C15813i> function1) {
            C2668g.b(function1, "init");
            C15060a c15060a = new C15060a();
            function1.invoke(c15060a);
            return c15060a.m56756a();
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u0011*\b\b\u0002\u0010\u0001*\u00020\u0002*\n\b\u0003\u0010\u0003 \u0001*\u0002H\u00012\u00020\u0002:\u0001\u0011B\u0013\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00030\u0005¢\u0006\u0002\u0010\u0006J\u0013\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00028\u0002¢\u0006\u0002\u0010\rJ+\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u00002\u0017\u0010\u000f\u001a\u0013\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0002\b\u0010R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00030\u0005X\u0004¢\u0006\u0002\n\u0000R \u0010\u0007\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00020\n0\t0\bX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/tinder/statemachine/StateMachine$Matcher;", "T", "", "R", "clazz", "Ljava/lang/Class;", "(Ljava/lang/Class;)V", "predicates", "", "Lkotlin/Function1;", "", "matches", "value", "(Ljava/lang/Object;)Z", "where", "predicate", "Lkotlin/ExtensionFunctionType;", "Companion", "state-machine"}, k = 1, mv = {1, 1, 9})
    /* renamed from: com.tinder.statemachine.a$c */
    public static final class C15063c<T, R extends T> {
        /* renamed from: a */
        public static final C15062a f46892a = new C15062a();
        /* renamed from: b */
        private final List<Function1<T, Boolean>> f46893b = C17554o.m64200c(new Function1[]{new StateMachine$Matcher$predicates$1(this)});
        /* renamed from: c */
        private final Class<R> f46894c;

        @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J+\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u0002H\u0005\u0012\u0004\u0012\u0002H\u00060\u0004\"\b\b\u0004\u0010\u0005*\u00020\u0001\"\n\b\u0005\u0010\u0006\u0018\u0001*\u0002H\u0005H\bJ8\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u0002H\u0005\u0012\u0004\u0012\u0002H\u00060\u0004\"\b\b\u0004\u0010\u0005*\u00020\u0001\"\n\b\u0005\u0010\u0006\u0018\u0001*\u0002H\u00052\u0006\u0010\b\u001a\u0002H\u0006H\b¢\u0006\u0002\u0010\t¨\u0006\n"}, d2 = {"Lcom/tinder/statemachine/StateMachine$Matcher$Companion;", "", "()V", "any", "Lcom/tinder/statemachine/StateMachine$Matcher;", "T", "R", "eq", "value", "(Ljava/lang/Object;)Lcom/tinder/statemachine/StateMachine$Matcher;", "state-machine"}, k = 1, mv = {1, 1, 9})
        /* renamed from: com.tinder.statemachine.a$c$a */
        public static final class C15062a {
            private C15062a() {
            }
        }

        public C15063c(@NotNull Class<R> cls) {
            C2668g.b(cls, "clazz");
            this.f46894c = cls;
        }

        @NotNull
        /* renamed from: a */
        public final C15063c<T, R> m56762a(@NotNull Function1<? super R, Boolean> function1) {
            C2668g.b(function1, "predicate");
            C15063c<T, R> c15063c = this;
            c15063c.f46893b.add(new StateMachine$Matcher$where$$inlined$apply$lambda$1(function1));
            return c15063c;
        }

        /* renamed from: a */
        public final boolean m56763a(@NotNull T t) {
            C2668g.b(t, "value");
            Iterable<Function1> iterable = this.f46893b;
            if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
                return true;
            }
            for (Function1 invoke : iterable) {
                if (!((Boolean) invoke.invoke(t)).booleanValue()) {
                    return false;
                }
            }
            return true;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0007\u0018\u0000*\b\b\u0002\u0010\u0001*\u00020\u0002*\b\b\u0003\u0010\u0003*\u00020\u00022\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0004Ri\u0010\u0005\u001aZ\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u00030\u0007\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00020\t0\b0\u0006j,\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u00030\u0007\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00020\t0\b`\n¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR)\u0010\r\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00020\t0\b0\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R)\u0010\u0011\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00020\t0\b0\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010Ri\u0010\u0013\u001aZ\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u00030\u0007\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u00020\b0\u0006j,\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u00030\u0007\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u00020\b`\n¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\f¨\u0006\u0015"}, d2 = {"Lcom/tinder/statemachine/StateMachine$StateDefinition;", "STATE", "", "EVENT", "()V", "actions", "Ljava/util/LinkedHashMap;", "Lcom/tinder/statemachine/StateMachine$Matcher;", "Lkotlin/Function2;", "", "Lkotlin/collections/LinkedHashMap;", "getActions", "()Ljava/util/LinkedHashMap;", "onEnterListeners", "", "getOnEnterListeners", "()Ljava/util/List;", "onExitListeners", "getOnExitListeners", "transitions", "getTransitions", "state-machine"}, k = 1, mv = {1, 1, 9})
    /* renamed from: com.tinder.statemachine.a$d */
    public static final class C15064d<STATE, EVENT> {
        @NotNull
        /* renamed from: a */
        private final List<Function2<STATE, EVENT, C15813i>> f46895a = new ArrayList();
        @NotNull
        /* renamed from: b */
        private final List<Function2<STATE, EVENT, C15813i>> f46896b = new ArrayList();
        @NotNull
        /* renamed from: c */
        private final LinkedHashMap<C15063c<EVENT, EVENT>, Function2<STATE, EVENT, C15813i>> f46897c = new LinkedHashMap();
        @NotNull
        /* renamed from: d */
        private final LinkedHashMap<C15063c<EVENT, EVENT>, Function2<STATE, EVENT, STATE>> f46898d = new LinkedHashMap();

        @NotNull
        /* renamed from: a */
        public final List<Function2<STATE, EVENT, C15813i>> m56764a() {
            return this.f46895a;
        }

        @NotNull
        /* renamed from: b */
        public final List<Function2<STATE, EVENT, C15813i>> m56765b() {
            return this.f46896b;
        }

        @NotNull
        /* renamed from: c */
        public final LinkedHashMap<C15063c<EVENT, EVENT>, Function2<STATE, EVENT, C15813i>> m56766c() {
            return this.f46897c;
        }

        @NotNull
        /* renamed from: d */
        public final LinkedHashMap<C15063c<EVENT, EVENT>, Function2<STATE, EVENT, STATE>> m56767d() {
            return this.f46898d;
        }
    }

    private C15065a() {
        this.f46900b = new AtomicReference();
        this.f46901c = new LinkedHashMap();
        this.f46902d = new ArrayList();
    }

    @NotNull
    /* renamed from: a */
    public final STATE m56776a() {
        STATE state = this.f46900b.get();
        C2668g.a(state, "stateRef.get()");
        return state;
    }

    /* renamed from: a */
    public final boolean m56777a(@NotNull EVENT event) {
        C2668g.b(event, "event");
        synchronized (this.f46900b) {
            Object obj = this.f46900b.get();
            C2668g.a(obj, "existingState");
            Object a = m56768a(obj, event);
            if (a != null) {
                this.f46900b.set(a);
                Pair a2 = C15811g.m59834a(obj, a);
                Object c = a2.m59805c();
                obj = a2.m59806d();
                m56775c(c, event);
                m56774c(obj);
                m56772b(obj, event);
                return true;
            }
            return null;
        }
    }

    /* renamed from: b */
    private final C15064d<STATE, EVENT> m56770b(@NotNull STATE state) {
        Map linkedHashMap = new LinkedHashMap();
        for (Entry entry : this.f46901c.entrySet()) {
            if (((C15063c) entry.getKey()).m56763a((Object) state)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        Collection collection = (Collection) new ArrayList(linkedHashMap.size());
        for (Entry value : linkedHashMap.entrySet()) {
            collection.add((C15064d) value.getValue());
        }
        C15064d c15064d = (C15064d) C19299w.m68831g((List) collection);
        if (c15064d != null) {
            return c15064d;
        }
        throw new IllegalStateException("Required value was null.".toString());
    }

    /* renamed from: a */
    private final STATE m56768a(@NotNull STATE state, EVENT event) {
        for (Entry entry : m56770b((Object) state).m56766c().entrySet()) {
            C15063c c15063c = (C15063c) entry.getKey();
            Function2 function2 = (Function2) entry.getValue();
            if (c15063c.m56763a((Object) event)) {
                function2.invoke(state, event);
            }
        }
        for (Entry entry2 : m56770b((Object) state).m56767d().entrySet()) {
            c15063c = (C15063c) entry2.getKey();
            function2 = (Function2) entry2.getValue();
            if (c15063c.m56763a((Object) event)) {
                return function2.invoke(state, event);
            }
        }
        return null;
    }

    /* renamed from: c */
    private final void m56774c(@NotNull STATE state) {
        for (Function1 invoke : this.f46902d) {
            invoke.invoke(state);
        }
    }

    /* renamed from: b */
    private final void m56772b(@NotNull STATE state, EVENT event) {
        for (Function2 invoke : m56770b((Object) state).m56764a()) {
            invoke.invoke(state, event);
        }
    }

    /* renamed from: c */
    private final void m56775c(@NotNull STATE state, EVENT event) {
        for (Function2 invoke : m56770b((Object) state).m56765b()) {
            invoke.invoke(state, event);
        }
    }
}
