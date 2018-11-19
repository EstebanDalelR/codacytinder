package com.tinder.common.statemachine;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.C15813i;
import kotlin.Metadata;
import kotlin.collections.C19301m;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\u0018\u0000 \"*\b\b\u0000\u0010\u0001*\u00020\u0002*\b\b\u0001\u0010\u0003*\u00020\u0002*\b\b\u0002\u0010\u0004*\u00020\u00022\u00020\u0002:\u0005!\"#$%B\u0007\b\u0002¢\u0006\u0002\u0010\u0005J%\u0010\u0015\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\t2\u0006\u0010\u0016\u001a\u00028\u0001¢\u0006\u0002\u0010\u0017J#\u0010\u0018\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0011*\u00028\u0000H\u0002¢\u0006\u0002\u0010\u0019J+\u0010\u001a\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\t*\u00028\u00002\u0006\u0010\u0016\u001a\u00028\u0001H\u0002¢\u0006\u0002\u0010\u001bJ\u0019\u0010\u001c\u001a\u00020\n*\u00028\u00002\u0006\u0010\u001d\u001a\u00028\u0001H\u0002¢\u0006\u0002\u0010\u001eJ\u0019\u0010\u001f\u001a\u00020\n*\u00028\u00002\u0006\u0010\u001d\u001a\u00028\u0001H\u0002¢\u0006\u0002\u0010\u001eJ\u001e\u0010 \u001a\u00020\n*\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\tH\u0002R2\u0010\u0006\u001a&\u0012\"\u0012 \u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\t\u0012\u0004\u0012\u00020\n0\b0\u0007X\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u000b\u001a\u00028\u00008F¢\u0006\u0006\u001a\u0004\b\f\u0010\rRf\u0010\u000e\u001aZ\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00000\u0010\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00110\u000fj,\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00000\u0010\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0011`\u0012X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0014X\u0004¢\u0006\u0002\n\u0000¨\u0006&"}, d2 = {"Lcom/tinder/common/statemachine/StateMachine;", "STATE", "", "EVENT", "SIDE_EFFECT", "()V", "onTransitionListeners", "", "Lkotlin/Function1;", "Lcom/tinder/common/statemachine/StateMachine$Transition;", "", "state", "getState", "()Ljava/lang/Object;", "stateDefinitions", "Ljava/util/LinkedHashMap;", "Lcom/tinder/common/statemachine/StateMachine$Matcher;", "Lcom/tinder/common/statemachine/StateMachine$StateDefinition;", "Lkotlin/collections/LinkedHashMap;", "stateRef", "Ljava/util/concurrent/atomic/AtomicReference;", "transition", "event", "(Ljava/lang/Object;)Lcom/tinder/common/statemachine/StateMachine$Transition;", "getDefinition", "(Ljava/lang/Object;)Lcom/tinder/common/statemachine/StateMachine$StateDefinition;", "getTransition", "(Ljava/lang/Object;Ljava/lang/Object;)Lcom/tinder/common/statemachine/StateMachine$Transition;", "notifyOnEnter", "cause", "(Ljava/lang/Object;Ljava/lang/Object;)V", "notifyOnExit", "notifyOnTransition", "Builder", "Companion", "Matcher", "StateDefinition", "Transition", "core"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.common.statemachine.a */
public final class C8561a<STATE, EVENT, SIDE_EFFECT> {
    /* renamed from: a */
    public static final C8555b f30307a = new C8555b();
    /* renamed from: b */
    private final AtomicReference<STATE> f30308b;
    /* renamed from: c */
    private final LinkedHashMap<C8557c<STATE, STATE>, C8559d<STATE, EVENT, SIDE_EFFECT>> f30309c;
    /* renamed from: d */
    private final List<Function1<C8560e<? extends STATE, ? extends EVENT, ? extends SIDE_EFFECT>, C15813i>> f30310d;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000*\b\b\u0003\u0010\u0001*\u00020\u0002*\b\b\u0004\u0010\u0003*\u00020\u0002*\b\b\u0005\u0010\u0004*\u00020\u00022\u00020\u0002:\u0001\u0018B\u0005¢\u0006\u0002\u0010\u0005J\u0018\u0010\b\u001a\u0014\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u00050\u0007J\u0013\u0010\t\u001a\u00020\n2\u0006\u0010\t\u001a\u00028\u0003¢\u0006\u0002\u0010\u000bJ,\u0010\f\u001a\u00020\n2$\u0010\r\u001a \u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u00050\u000f\u0012\u0004\u0012\u00020\n0\u000eJY\u0010\u0010\u001a\u00020\n\"\n\b\u0006\u0010\u0011\u0018\u0001*\u00028\u00032\u0006\u0010\u0010\u001a\u0002H\u001125\b\b\u0010\u0012\u001a/\u0012 \u0012\u001e\u0012\u0004\u0012\u0002H\u00110\u0013R\u0014\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u00050\u0000\u0012\u0004\u0012\u00020\n0\u000e¢\u0006\u0002\b\u0014H\b¢\u0006\u0002\u0010\u0015JL\u0010\u0010\u001a\u00020\n\"\n\b\u0006\u0010\u0011\u0018\u0001*\u00028\u000325\b\b\u0010\u0012\u001a/\u0012 \u0012\u001e\u0012\u0004\u0012\u0002H\u00110\u0013R\u0014\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u00050\u0000\u0012\u0004\u0012\u00020\n0\u000e¢\u0006\u0002\b\u0014H\bJY\u0010\u0010\u001a\u00020\n\"\b\b\u0006\u0010\u0011*\u00028\u00032\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u0002H\u00110\u001723\u0010\u0012\u001a/\u0012 \u0012\u001e\u0012\u0004\u0012\u0002H\u00110\u0013R\u0014\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u00050\u0000\u0012\u0004\u0012\u00020\n0\u000e¢\u0006\u0002\b\u0014R \u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u00050\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/tinder/common/statemachine/StateMachine$Builder;", "STATE", "", "EVENT", "SIDE_EFFECT", "()V", "stateMachine", "Lcom/tinder/common/statemachine/StateMachine;", "build", "initialState", "", "(Ljava/lang/Object;)V", "onTransition", "listener", "Lkotlin/Function1;", "Lcom/tinder/common/statemachine/StateMachine$Transition;", "state", "S", "init", "Lcom/tinder/common/statemachine/StateMachine$Builder$StateDefinitionBuilder;", "Lkotlin/ExtensionFunctionType;", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V", "stateMatcher", "Lcom/tinder/common/statemachine/StateMachine$Matcher;", "StateDefinitionBuilder", "core"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.common.statemachine.a$a */
    public static final class C8554a<STATE, EVENT, SIDE_EFFECT> {
        /* renamed from: a */
        private final C8561a<STATE, EVENT, SIDE_EFFECT> f30298a = new C8561a();

        @Metadata(bv = {1, 0, 2}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0004\u0018\u0000*\b\b\u0006\u0010\u0001*\u00028\u00032\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003J!\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u0002H\b0\u0007\"\n\b\u0007\u0010\b\u0018\u0001*\u00028\u0004H\bJ\u0018\u0010\t\u001a\u0014\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u00050\u0005J.\u0010\n\u001a\u000e\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u0002H\u000b0\u0007\"\n\b\u0007\u0010\u000b\u0018\u0001*\u00028\u00042\u0006\u0010\f\u001a\u0002H\u000bH\b¢\u0006\u0002\u0010\rJO\u0010\u000e\u001a\u00020\u000f\"\n\b\u0007\u0010\b\u0018\u0001*\u00028\u00042\u0006\u0010\u0010\u001a\u0002H\b2+\b\b\u0010\u0011\u001a%\u0012\u0004\u0012\u00028\u0006\u0012\u0004\u0012\u0002H\b\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u00050\u00130\u0012¢\u0006\u0002\b\u0014H\b¢\u0006\u0002\u0010\u0015JB\u0010\u000e\u001a\u00020\u000f\"\n\b\u0007\u0010\b\u0018\u0001*\u00028\u00042+\b\b\u0010\u0011\u001a%\u0012\u0004\u0012\u00028\u0006\u0012\u0004\u0012\u0002H\b\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u00050\u00130\u0012¢\u0006\u0002\b\u0014H\bJO\u0010\u000e\u001a\u00020\u000f\"\b\b\u0007\u0010\b*\u00028\u00042\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u0002H\b0\u00072)\u0010\u0011\u001a%\u0012\u0004\u0012\u00028\u0006\u0012\u0004\u0012\u0002H\b\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u00050\u00130\u0012¢\u0006\u0002\b\u0014J%\u0010\u0017\u001a\u00020\u00182\u001d\u0010\u0019\u001a\u0019\u0012\u0004\u0012\u00028\u0006\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00020\u000f0\u0012¢\u0006\u0002\b\u0014J%\u0010\u001a\u001a\u00020\u00182\u001d\u0010\u0019\u001a\u0019\u0012\u0004\u0012\u00028\u0006\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00020\u000f0\u0012¢\u0006\u0002\b\u0014J\u001b\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u00050\u0013*\u00028\u0006¢\u0006\u0002\u0010\u001cJ1\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u00050\u0013*\u00028\u00062\u0006\u0010\u001e\u001a\u00028\u00032\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00018\u0005H\u0007¢\u0006\u0002\u0010 R \u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u00050\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006!"}, d2 = {"Lcom/tinder/common/statemachine/StateMachine$Builder$StateDefinitionBuilder;", "S", "", "(Lcom/tinder/common/statemachine/StateMachine$Builder;)V", "stateDefinition", "Lcom/tinder/common/statemachine/StateMachine$StateDefinition;", "any", "Lcom/tinder/common/statemachine/StateMachine$Matcher;", "E", "build", "eq", "R", "value", "(Ljava/lang/Object;)Lcom/tinder/common/statemachine/StateMachine$Matcher;", "on", "", "event", "createTransitionTo", "Lkotlin/Function2;", "Lcom/tinder/common/statemachine/StateMachine$StateDefinition$TransitionTo;", "Lkotlin/ExtensionFunctionType;", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V", "eventMatcher", "onEnter", "", "listener", "onExit", "dontTransition", "(Ljava/lang/Object;)Lcom/tinder/common/statemachine/StateMachine$StateDefinition$TransitionTo;", "transitionTo", "state", "sideEffect", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lcom/tinder/common/statemachine/StateMachine$StateDefinition$TransitionTo;", "core"}, k = 1, mv = {1, 1, 10})
        /* renamed from: com.tinder.common.statemachine.a$a$a */
        public final class C8553a<S extends STATE> {
            /* renamed from: a */
            final /* synthetic */ C8554a f30296a;
            /* renamed from: b */
            private final C8559d<STATE, EVENT, SIDE_EFFECT> f30297b = new C8559d();

            public C8553a(C8554a c8554a) {
                this.f30296a = c8554a;
            }

            /* renamed from: a */
            public final <E extends EVENT> void m36541a(@NotNull C8557c<EVENT, ? extends E> c8557c, @NotNull Function2<? super S, ? super E, ? extends C8558a<? extends STATE, ? extends SIDE_EFFECT>> function2) {
                C2668g.b(c8557c, "eventMatcher");
                C2668g.b(function2, "createTransitionTo");
                this.f30297b.m36553c().put(c8557c, new StateMachine$Builder$StateDefinitionBuilder$on$1(function2));
            }

            @NotNull
            /* renamed from: a */
            public final C8559d<STATE, EVENT, SIDE_EFFECT> m36540a() {
                return this.f30297b;
            }

            @NotNull
            /* renamed from: a */
            public static /* synthetic */ C8558a m36537a(C8553a c8553a, Object obj, Object obj2, Object obj3, int i, Object obj4) {
                if ((i & 2) != 0) {
                    obj3 = null;
                }
                return c8553a.m36539a(obj, obj2, obj3);
            }

            @NotNull
            /* renamed from: a */
            public final C8558a<STATE, SIDE_EFFECT> m36539a(@NotNull S s, @NotNull STATE state, @Nullable SIDE_EFFECT side_effect) {
                C2668g.b(s, "$receiver");
                C2668g.b(state, "state");
                return new C8558a(state, side_effect);
            }

            @NotNull
            /* renamed from: a */
            public final C8558a<STATE, SIDE_EFFECT> m36538a(@NotNull S s) {
                C2668g.b(s, "$receiver");
                return C8553a.m36537a(this, s, s, null, 2, null);
            }
        }

        /* renamed from: a */
        public final <S extends STATE> void m36543a(@NotNull C8557c<STATE, ? extends S> c8557c, @NotNull Function1<? super C8553a<S>, C15813i> function1) {
            C2668g.b(c8557c, "stateMatcher");
            C2668g.b(function1, "init");
            Map a = this.f30298a.f30309c;
            C8553a c8553a = new C8553a(this);
            function1.invoke(c8553a);
            a.put(c8557c, c8553a.m36540a());
        }

        /* renamed from: a */
        public final void m36544a(@NotNull STATE state) {
            C2668g.b(state, "initialState");
            this.f30298a.f30308b.set(state);
        }

        @NotNull
        /* renamed from: a */
        public final C8561a<STATE, EVENT, SIDE_EFFECT> m36542a() {
            C8561a c8561a = this.f30298a;
            if (c8561a.f30308b.get() != null) {
                return c8561a;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002Ja\u0010\u0003\u001a\u0014\u0012\u0004\u0012\u0002H\u0005\u0012\u0004\u0012\u0002H\u0006\u0012\u0004\u0012\u0002H\u00070\u0004\"\b\b\u0003\u0010\u0005*\u00020\u0001\"\b\b\u0004\u0010\u0006*\u00020\u0001\"\b\b\u0005\u0010\u0007*\u00020\u00012)\u0010\b\u001a%\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u0002H\u0005\u0012\u0004\u0012\u0002H\u0006\u0012\u0004\u0012\u0002H\u00070\n\u0012\u0004\u0012\u00020\u000b0\t¢\u0006\u0002\b\f¨\u0006\r"}, d2 = {"Lcom/tinder/common/statemachine/StateMachine$Companion;", "", "()V", "create", "Lcom/tinder/common/statemachine/StateMachine;", "STATE", "EVENT", "SIDE_EFFECT", "init", "Lkotlin/Function1;", "Lcom/tinder/common/statemachine/StateMachine$Builder;", "", "Lkotlin/ExtensionFunctionType;", "core"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.common.statemachine.a$b */
    public static final class C8555b {
        private C8555b() {
        }

        @NotNull
        /* renamed from: a */
        public final <STATE, EVENT, SIDE_EFFECT> C8561a<STATE, EVENT, SIDE_EFFECT> m36545a(@NotNull Function1<? super C8554a<STATE, EVENT, SIDE_EFFECT>, C15813i> function1) {
            C2668g.b(function1, "init");
            C8554a c8554a = new C8554a();
            function1.invoke(c8554a);
            return c8554a.m36542a();
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u0011*\b\b\u0003\u0010\u0001*\u00020\u0002*\n\b\u0004\u0010\u0003 \u0001*\u0002H\u00012\u00020\u0002:\u0001\u0011B\u0015\b\u0002\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00040\u0005¢\u0006\u0002\u0010\u0006J\u0013\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00028\u0003¢\u0006\u0002\u0010\rJ+\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u00040\u00002\u0017\u0010\u000f\u001a\u0013\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0002\b\u0010R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00040\u0005X\u0004¢\u0006\u0002\n\u0000R \u0010\u0007\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00020\n0\t0\bX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/tinder/common/statemachine/StateMachine$Matcher;", "T", "", "R", "clazz", "Ljava/lang/Class;", "(Ljava/lang/Class;)V", "predicates", "", "Lkotlin/Function1;", "", "matches", "value", "(Ljava/lang/Object;)Z", "where", "predicate", "Lkotlin/ExtensionFunctionType;", "Companion", "core"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.common.statemachine.a$c */
    public static final class C8557c<T, R extends T> {
        /* renamed from: a */
        public static final C8556a f30299a = new C8556a();
        /* renamed from: b */
        private final List<Function1<T, Boolean>> f30300b;
        /* renamed from: c */
        private final Class<R> f30301c;

        @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J+\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u0002H\u0005\u0012\u0004\u0012\u0002H\u00060\u0004\"\b\b\u0005\u0010\u0005*\u00020\u0001\"\n\b\u0006\u0010\u0006\u0018\u0001*\u0002H\u0005H\bJ4\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u0002H\u0005\u0012\u0004\u0012\u0002H\u00060\u0004\"\b\b\u0005\u0010\u0005*\u00020\u0001\"\b\b\u0006\u0010\u0006*\u0002H\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u0002H\u00060\bJ8\u0010\t\u001a\u000e\u0012\u0004\u0012\u0002H\u0005\u0012\u0004\u0012\u0002H\u00060\u0004\"\b\b\u0005\u0010\u0005*\u00020\u0001\"\n\b\u0006\u0010\u0006\u0018\u0001*\u0002H\u00052\u0006\u0010\n\u001a\u0002H\u0006H\b¢\u0006\u0002\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/tinder/common/statemachine/StateMachine$Matcher$Companion;", "", "()V", "any", "Lcom/tinder/common/statemachine/StateMachine$Matcher;", "T", "R", "clazz", "Ljava/lang/Class;", "eq", "value", "(Ljava/lang/Object;)Lcom/tinder/common/statemachine/StateMachine$Matcher;", "core"}, k = 1, mv = {1, 1, 10})
        /* renamed from: com.tinder.common.statemachine.a$c$a */
        public static final class C8556a {
            private C8556a() {
            }

            @NotNull
            /* renamed from: a */
            public final <T, R extends T> C8557c<T, R> m36546a(@NotNull Class<R> cls) {
                C2668g.b(cls, "clazz");
                return new C8557c(cls);
            }
        }

        private C8557c(Class<R> cls) {
            this.f30301c = cls;
            this.f30300b = C19301m.c(new Function1[]{new StateMachine$Matcher$predicates$1(this)});
        }

        /* renamed from: a */
        public final boolean m36548a(@NotNull T t) {
            C2668g.b(t, "value");
            Iterable<Function1> iterable = this.f30300b;
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

    @Metadata(bv = {1, 0, 2}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000*\b\b\u0003\u0010\u0001*\u00020\u0002*\b\b\u0004\u0010\u0003*\u00020\u0002*\b\b\u0005\u0010\u0004*\u00020\u00022\u00020\u0002:\u0001\u0015B\u0007\b\u0000¢\u0006\u0002\u0010\u0005R)\u0010\u0006\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00020\t0\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR)\u0010\f\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00020\t0\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0001\u0010\u000e\u001ar\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u00040\u0010\u0012\"\u0012 \u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u00050\u00110\b0\u000fj8\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u00040\u0010\u0012\"\u0012 \u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u00050\u00110\b`\u0012¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"Lcom/tinder/common/statemachine/StateMachine$StateDefinition;", "STATE", "", "EVENT", "SIDE_EFFECT", "()V", "onEnterListeners", "", "Lkotlin/Function2;", "", "getOnEnterListeners", "()Ljava/util/List;", "onExitListeners", "getOnExitListeners", "transitions", "Ljava/util/LinkedHashMap;", "Lcom/tinder/common/statemachine/StateMachine$Matcher;", "Lcom/tinder/common/statemachine/StateMachine$StateDefinition$TransitionTo;", "Lkotlin/collections/LinkedHashMap;", "getTransitions", "()Ljava/util/LinkedHashMap;", "TransitionTo", "core"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.common.statemachine.a$d */
    public static final class C8559d<STATE, EVENT, SIDE_EFFECT> {
        @NotNull
        /* renamed from: a */
        private final List<Function2<STATE, EVENT, C15813i>> f30304a = new ArrayList();
        @NotNull
        /* renamed from: b */
        private final List<Function2<STATE, EVENT, C15813i>> f30305b = new ArrayList();
        @NotNull
        /* renamed from: c */
        private final LinkedHashMap<C8557c<EVENT, EVENT>, Function2<STATE, EVENT, C8558a<STATE, SIDE_EFFECT>>> f30306c = new LinkedHashMap();

        @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u0000*\n\b\u0006\u0010\u0001 \u0001*\u00020\u0002*\n\b\u0007\u0010\u0003 \u0001*\u00020\u00022\u00020\u0002B\u0019\b\u0000\u0012\u0006\u0010\u0004\u001a\u00028\u0006\u0012\b\u0010\u0005\u001a\u0004\u0018\u00018\u0007¢\u0006\u0002\u0010\u0006J\u000e\u0010\u000b\u001a\u00028\u0006HÆ\u0003¢\u0006\u0002\u0010\bJ\u0010\u0010\f\u001a\u0004\u0018\u00018\u0007HÆ\u0003¢\u0006\u0002\u0010\bJ0\u0010\r\u001a\u000e\u0012\u0004\u0012\u00028\u0006\u0012\u0004\u0012\u00028\u00070\u00002\b\b\u0002\u0010\u0004\u001a\u00028\u00062\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00018\u0007HÆ\u0001¢\u0006\u0002\u0010\u000eJ\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0002HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0015\u0010\u0005\u001a\u0004\u0018\u00018\u0007¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u00028\u0006¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\n\u0010\b¨\u0006\u0016"}, d2 = {"Lcom/tinder/common/statemachine/StateMachine$StateDefinition$TransitionTo;", "STATE", "", "SIDE_EFFECT", "toState", "sideEffect", "(Ljava/lang/Object;Ljava/lang/Object;)V", "getSideEffect", "()Ljava/lang/Object;", "Ljava/lang/Object;", "getToState", "component1", "component2", "copy", "(Ljava/lang/Object;Ljava/lang/Object;)Lcom/tinder/common/statemachine/StateMachine$StateDefinition$TransitionTo;", "equals", "", "other", "hashCode", "", "toString", "", "core"}, k = 1, mv = {1, 1, 10})
        /* renamed from: com.tinder.common.statemachine.a$d$a */
        public static final class C8558a<STATE, SIDE_EFFECT> {
            @NotNull
            /* renamed from: a */
            private final STATE f30302a;
            @Nullable
            /* renamed from: b */
            private final SIDE_EFFECT f30303b;

            @NotNull
            /* renamed from: a */
            public final STATE m36549a() {
                return this.f30302a;
            }

            @Nullable
            /* renamed from: b */
            public final SIDE_EFFECT m36550b() {
                return this.f30303b;
            }

            public boolean equals(Object obj) {
                if (this != obj) {
                    if (obj instanceof C8558a) {
                        C8558a c8558a = (C8558a) obj;
                        if (C2668g.a(this.f30302a, c8558a.f30302a) && C2668g.a(this.f30303b, c8558a.f30303b)) {
                        }
                    }
                    return false;
                }
                return true;
            }

            public int hashCode() {
                Object obj = this.f30302a;
                int i = 0;
                int hashCode = (obj != null ? obj.hashCode() : 0) * 31;
                Object obj2 = this.f30303b;
                if (obj2 != null) {
                    i = obj2.hashCode();
                }
                return hashCode + i;
            }

            public String toString() {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("TransitionTo(toState=");
                stringBuilder.append(this.f30302a);
                stringBuilder.append(", sideEffect=");
                stringBuilder.append(this.f30303b);
                stringBuilder.append(")");
                return stringBuilder.toString();
            }

            public C8558a(@NotNull STATE state, @Nullable SIDE_EFFECT side_effect) {
                C2668g.b(state, "toState");
                this.f30302a = state;
                this.f30303b = side_effect;
            }
        }

        @NotNull
        /* renamed from: a */
        public final List<Function2<STATE, EVENT, C15813i>> m36551a() {
            return this.f30304a;
        }

        @NotNull
        /* renamed from: b */
        public final List<Function2<STATE, EVENT, C15813i>> m36552b() {
            return this.f30305b;
        }

        @NotNull
        /* renamed from: c */
        public final LinkedHashMap<C8557c<EVENT, EVENT>, Function2<STATE, EVENT, C8558a<STATE, SIDE_EFFECT>>> m36553c() {
            return this.f30306c;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000*\n\b\u0003\u0010\u0001 \u0001*\u00020\u0002*\n\b\u0004\u0010\u0003 \u0001*\u00020\u0002*\n\b\u0005\u0010\u0004 \u0001*\u00020\u00022\u00020\u0002:\u0002\u000b\fB\u0007\b\u0002¢\u0006\u0002\u0010\u0005R\u0012\u0010\u0006\u001a\u00028\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0012\u0010\t\u001a\u00028\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\b\u0001\u0002\r\u000e¨\u0006\u000f"}, d2 = {"Lcom/tinder/common/statemachine/StateMachine$Transition;", "STATE", "", "EVENT", "SIDE_EFFECT", "()V", "event", "getEvent", "()Ljava/lang/Object;", "fromState", "getFromState", "Invalid", "Valid", "Lcom/tinder/common/statemachine/StateMachine$Transition$Valid;", "Lcom/tinder/common/statemachine/StateMachine$Transition$Invalid;", "core"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.common.statemachine.a$e */
    public static abstract class C8560e<STATE, EVENT, SIDE_EFFECT> {

        @Metadata(bv = {1, 0, 2}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u0000*\n\b\u0006\u0010\u0001 \u0001*\u00020\u0002*\n\b\u0007\u0010\u0003 \u0001*\u00020\u0002*\n\b\b\u0010\u0004 \u0001*\u00020\u00022\u0014\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u0003\u0012\u0004\u0012\u0002H\u00040\u0005B\u0017\b\u0000\u0012\u0006\u0010\u0006\u001a\u00028\u0006\u0012\u0006\u0010\u0007\u001a\u00028\u0007¢\u0006\u0002\u0010\bJ\u000e\u0010\r\u001a\u00028\u0006HÆ\u0003¢\u0006\u0002\u0010\nJ\u000e\u0010\u000e\u001a\u00028\u0007HÆ\u0003¢\u0006\u0002\u0010\nJ4\u0010\u000f\u001a\u0014\u0012\u0004\u0012\u00028\u0006\u0012\u0004\u0012\u00028\u0007\u0012\u0004\u0012\u00028\b0\u00002\b\b\u0002\u0010\u0006\u001a\u00028\u00062\b\b\u0002\u0010\u0007\u001a\u00028\u0007HÆ\u0001¢\u0006\u0002\u0010\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0002HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u0016\u0010\u0007\u001a\u00028\u0007X\u0004¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0006\u001a\u00028\u0006X\u0004¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\f\u0010\n¨\u0006\u0018"}, d2 = {"Lcom/tinder/common/statemachine/StateMachine$Transition$Invalid;", "STATE", "", "EVENT", "SIDE_EFFECT", "Lcom/tinder/common/statemachine/StateMachine$Transition;", "fromState", "event", "(Ljava/lang/Object;Ljava/lang/Object;)V", "getEvent", "()Ljava/lang/Object;", "Ljava/lang/Object;", "getFromState", "component1", "component2", "copy", "(Ljava/lang/Object;Ljava/lang/Object;)Lcom/tinder/common/statemachine/StateMachine$Transition$Invalid;", "equals", "", "other", "hashCode", "", "toString", "", "core"}, k = 1, mv = {1, 1, 10})
        /* renamed from: com.tinder.common.statemachine.a$e$a */
        public static final class C10699a<STATE, EVENT, SIDE_EFFECT> extends C8560e<STATE, EVENT, SIDE_EFFECT> {
            @NotNull
            /* renamed from: a */
            private final STATE f35043a;
            @NotNull
            /* renamed from: b */
            private final EVENT f35044b;

            public boolean equals(Object obj) {
                if (this != obj) {
                    if (obj instanceof C10699a) {
                        C10699a c10699a = (C10699a) obj;
                        if (C2668g.a(m43021b(), c10699a.m43021b()) && C2668g.a(mo9445a(), c10699a.mo9445a())) {
                        }
                    }
                    return false;
                }
                return true;
            }

            public int hashCode() {
                Object b = m43021b();
                int i = 0;
                int hashCode = (b != null ? b.hashCode() : 0) * 31;
                Object a = mo9445a();
                if (a != null) {
                    i = a.hashCode();
                }
                return hashCode + i;
            }

            public String toString() {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Invalid(fromState=");
                stringBuilder.append(m43021b());
                stringBuilder.append(", event=");
                stringBuilder.append(mo9445a());
                stringBuilder.append(")");
                return stringBuilder.toString();
            }

            @NotNull
            /* renamed from: b */
            public STATE m43021b() {
                return this.f35043a;
            }

            @NotNull
            /* renamed from: a */
            public EVENT mo9445a() {
                return this.f35044b;
            }

            public C10699a(@NotNull STATE state, @NotNull EVENT event) {
                C2668g.b(state, "fromState");
                C2668g.b(event, "event");
                super();
                this.f35043a = state;
                this.f35044b = event;
            }
        }

        @Metadata(bv = {1, 0, 2}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u0000*\n\b\u0006\u0010\u0001 \u0001*\u00020\u0002*\n\b\u0007\u0010\u0003 \u0001*\u00020\u0002*\n\b\b\u0010\u0004 \u0001*\u00020\u00022\u0014\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u0003\u0012\u0004\u0012\u0002H\u00040\u0005B)\b\u0000\u0012\u0006\u0010\u0006\u001a\u00028\u0006\u0012\u0006\u0010\u0007\u001a\u00028\u0007\u0012\u0006\u0010\b\u001a\u00028\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00018\b¢\u0006\u0002\u0010\nJ\u000e\u0010\u0011\u001a\u00028\u0006HÆ\u0003¢\u0006\u0002\u0010\fJ\u000e\u0010\u0012\u001a\u00028\u0007HÆ\u0003¢\u0006\u0002\u0010\fJ\u000e\u0010\u0013\u001a\u00028\u0006HÆ\u0003¢\u0006\u0002\u0010\fJ\u0010\u0010\u0014\u001a\u0004\u0018\u00018\bHÆ\u0003¢\u0006\u0002\u0010\fJJ\u0010\u0015\u001a\u0014\u0012\u0004\u0012\u00028\u0006\u0012\u0004\u0012\u00028\u0007\u0012\u0004\u0012\u00028\b0\u00002\b\b\u0002\u0010\u0006\u001a\u00028\u00062\b\b\u0002\u0010\u0007\u001a\u00028\u00072\b\b\u0002\u0010\b\u001a\u00028\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00018\bHÆ\u0001¢\u0006\u0002\u0010\u0016J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0002HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001R\u0016\u0010\u0007\u001a\u00028\u0007X\u0004¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0006\u001a\u00028\u0006X\u0004¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000e\u0010\fR\u0015\u0010\t\u001a\u0004\u0018\u00018\b¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000f\u0010\fR\u0013\u0010\b\u001a\u00028\u0006¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u0010\u0010\f¨\u0006\u001e"}, d2 = {"Lcom/tinder/common/statemachine/StateMachine$Transition$Valid;", "STATE", "", "EVENT", "SIDE_EFFECT", "Lcom/tinder/common/statemachine/StateMachine$Transition;", "fromState", "event", "toState", "sideEffect", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V", "getEvent", "()Ljava/lang/Object;", "Ljava/lang/Object;", "getFromState", "getSideEffect", "getToState", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lcom/tinder/common/statemachine/StateMachine$Transition$Valid;", "equals", "", "other", "hashCode", "", "toString", "", "core"}, k = 1, mv = {1, 1, 10})
        /* renamed from: com.tinder.common.statemachine.a$e$b */
        public static final class C10700b<STATE, EVENT, SIDE_EFFECT> extends C8560e<STATE, EVENT, SIDE_EFFECT> {
            @NotNull
            /* renamed from: a */
            private final STATE f35045a;
            @NotNull
            /* renamed from: b */
            private final EVENT f35046b;
            @NotNull
            /* renamed from: c */
            private final STATE f35047c;
            @Nullable
            /* renamed from: d */
            private final SIDE_EFFECT f35048d;

            public boolean equals(Object obj) {
                if (this != obj) {
                    if (obj instanceof C10700b) {
                        C10700b c10700b = (C10700b) obj;
                        if (C2668g.a(m43023b(), c10700b.m43023b()) && C2668g.a(mo9445a(), c10700b.mo9445a()) && C2668g.a(this.f35047c, c10700b.f35047c) && C2668g.a(this.f35048d, c10700b.f35048d)) {
                        }
                    }
                    return false;
                }
                return true;
            }

            public int hashCode() {
                Object b = m43023b();
                int i = 0;
                int hashCode = (b != null ? b.hashCode() : 0) * 31;
                Object a = mo9445a();
                hashCode = (hashCode + (a != null ? a.hashCode() : 0)) * 31;
                a = this.f35047c;
                hashCode = (hashCode + (a != null ? a.hashCode() : 0)) * 31;
                a = this.f35048d;
                if (a != null) {
                    i = a.hashCode();
                }
                return hashCode + i;
            }

            public String toString() {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Valid(fromState=");
                stringBuilder.append(m43023b());
                stringBuilder.append(", event=");
                stringBuilder.append(mo9445a());
                stringBuilder.append(", toState=");
                stringBuilder.append(this.f35047c);
                stringBuilder.append(", sideEffect=");
                stringBuilder.append(this.f35048d);
                stringBuilder.append(")");
                return stringBuilder.toString();
            }

            @NotNull
            /* renamed from: b */
            public STATE m43023b() {
                return this.f35045a;
            }

            @NotNull
            /* renamed from: a */
            public EVENT mo9445a() {
                return this.f35046b;
            }

            @NotNull
            /* renamed from: c */
            public final STATE m43024c() {
                return this.f35047c;
            }

            @Nullable
            /* renamed from: d */
            public final SIDE_EFFECT m43025d() {
                return this.f35048d;
            }

            public C10700b(@NotNull STATE state, @NotNull EVENT event, @NotNull STATE state2, @Nullable SIDE_EFFECT side_effect) {
                C2668g.b(state, "fromState");
                C2668g.b(event, "event");
                C2668g.b(state2, "toState");
                super();
                this.f35045a = state;
                this.f35046b = event;
                this.f35047c = state2;
                this.f35048d = side_effect;
            }
        }

        @NotNull
        /* renamed from: a */
        public abstract EVENT mo9445a();

        private C8560e() {
        }
    }

    private C8561a() {
        this.f30308b = new AtomicReference();
        this.f30309c = new LinkedHashMap();
        this.f30310d = new ArrayList();
    }

    @NotNull
    /* renamed from: a */
    public final STATE m36563a() {
        STATE state = this.f30308b.get();
        C2668g.a(state, "stateRef.get()");
        return state;
    }

    @NotNull
    /* renamed from: a */
    public final C8560e<STATE, EVENT, SIDE_EFFECT> m36562a(@NotNull EVENT event) {
        C8560e a;
        C2668g.b(event, "event");
        synchronized (this.f30308b) {
            Object obj = this.f30308b.get();
            C2668g.a(obj, "fromState");
            a = m36555a(obj, event);
            if (a instanceof C10700b) {
                this.f30308b.set(((C10700b) a).m43024c());
            }
        }
        if (a instanceof C10700b) {
            C10700b c10700b = (C10700b) a;
            m36561c(c10700b.m43023b(), event);
            m36560b(c10700b.m43024c(), event);
        }
        m36557a(a);
        return a;
    }

    /* renamed from: a */
    private final C8560e<STATE, EVENT, SIDE_EFFECT> m36555a(@NotNull STATE state, EVENT event) {
        for (Entry entry : m36558b((Object) state).m36553c().entrySet()) {
            C8557c c8557c = (C8557c) entry.getKey();
            Function2 function2 = (Function2) entry.getValue();
            if (c8557c.m36548a((Object) event)) {
                C8558a c8558a = (C8558a) function2.invoke(state, event);
                return new C10700b(state, event, c8558a.m36549a(), c8558a.m36550b());
            }
        }
        return new C10699a(state, event);
    }

    /* renamed from: b */
    private final C8559d<STATE, EVENT, SIDE_EFFECT> m36558b(@NotNull STATE state) {
        Map linkedHashMap = new LinkedHashMap();
        for (Entry entry : this.f30309c.entrySet()) {
            if (((C8557c) entry.getKey()).m36548a((Object) state)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        Collection collection = (Collection) new ArrayList(linkedHashMap.size());
        for (Entry value : linkedHashMap.entrySet()) {
            collection.add((C8559d) value.getValue());
        }
        C8559d c8559d = (C8559d) C19301m.g((List) collection);
        if (c8559d != null) {
            return c8559d;
        }
        throw new IllegalStateException("Required value was null.".toString());
    }

    /* renamed from: b */
    private final void m36560b(@NotNull STATE state, EVENT event) {
        for (Function2 invoke : m36558b((Object) state).m36551a()) {
            invoke.invoke(state, event);
        }
    }

    /* renamed from: c */
    private final void m36561c(@NotNull STATE state, EVENT event) {
        for (Function2 invoke : m36558b((Object) state).m36552b()) {
            invoke.invoke(state, event);
        }
    }

    /* renamed from: a */
    private final void m36557a(@NotNull C8560e<? extends STATE, ? extends EVENT, ? extends SIDE_EFFECT> c8560e) {
        for (Function1 invoke : this.f30310d) {
            invoke.invoke(c8560e);
        }
    }
}
