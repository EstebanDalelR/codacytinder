package com.tinder.scarlet.internal.connection;

import com.tinder.scarlet.C14788b;
import com.tinder.scarlet.C14788b.C16504a.C18035a;
import com.tinder.scarlet.C14788b.C16504a.C18036b;
import com.tinder.scarlet.C14788b.C16505b;
import com.tinder.scarlet.C14788b.C16506c;
import com.tinder.scarlet.C14788b.C16507d.C18037a;
import com.tinder.scarlet.C14788b.C16507d.C18038b;
import com.tinder.scarlet.C14797g;
import com.tinder.scarlet.C14797g.C16515a;
import com.tinder.scarlet.C14797g.C16516b;
import com.tinder.scarlet.C14797g.C16517c;
import com.tinder.scarlet.C14797g.C16518d;
import com.tinder.scarlet.C14797g.C16519e;
import com.tinder.scarlet.C14797g.C16520f;
import com.tinder.scarlet.Lifecycle.C14785a;
import com.tinder.scarlet.internal.connection.C14804a.C14803b;
import com.tinder.statemachine.C15065a.C15060a;
import com.tinder.statemachine.C15065a.C15060a.C15059a;
import com.tinder.statemachine.C15065a.C15060a.C15059a.C15058a;
import com.tinder.statemachine.C15065a.C15063c;
import com.tinder.statemachine.C15065a.C15063c.C15062a;
import kotlin.C15813i;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "Lcom/tinder/statemachine/StateMachine$Builder;", "Lcom/tinder/scarlet/State;", "Lcom/tinder/scarlet/Event;", "invoke"}, k = 3, mv = {1, 1, 9})
final class Connection$StateManager$stateMachine$1 extends Lambda implements Function1<C15060a<C14797g, C14788b>, C15813i> {
    /* renamed from: a */
    final /* synthetic */ C14803b f58356a;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u0018\u0012\u0004\u0012\u00020\u00030\u0002R\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "Lcom/tinder/statemachine/StateMachine$Builder$StateDefinitionBuilder;", "Lcom/tinder/scarlet/State$Disconnecting;", "Lcom/tinder/statemachine/StateMachine$Builder;", "Lcom/tinder/scarlet/State;", "Lcom/tinder/scarlet/Event;", "invoke"}, k = 3, mv = {1, 1, 9})
    /* renamed from: com.tinder.scarlet.internal.connection.Connection$StateManager$stateMachine$1$5 */
    static final class C188155 extends Lambda implements Function1<C15059a<? extends C16519e>, C15813i> {
        /* renamed from: a */
        public static final C188155 f58352a = new C188155();

        @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lcom/tinder/scarlet/State$Disconnected;", "Lcom/tinder/scarlet/State$Disconnecting;", "it", "Lcom/tinder/scarlet/Event$OnWebSocket$Terminate;", "invoke"}, k = 3, mv = {1, 1, 9})
        /* renamed from: com.tinder.scarlet.internal.connection.Connection$StateManager$stateMachine$1$5$1 */
        static final class C188141 extends Lambda implements Function2<C16519e, C18038b, C16518d> {
            /* renamed from: a */
            public static final C188141 f58351a = new C188141();

            C188141() {
                super(2);
            }

            public /* synthetic */ Object invoke(Object obj, Object obj2) {
                return m67261a((C16519e) obj, (C18038b) obj2);
            }

            @NotNull
            /* renamed from: a */
            public final C16518d m67261a(@NotNull C16519e c16519e, @NotNull C18038b c18038b) {
                C2668g.b(c16519e, "$receiver");
                C2668g.b(c18038b, "it");
                return C16518d.f51186a;
            }
        }

        C188155() {
            super(1);
        }

        public /* synthetic */ Object invoke(Object obj) {
            m67262a((C15059a) obj);
            return C15813i.f49016a;
        }

        /* renamed from: a */
        public final void m67262a(@NotNull C15059a<C16519e> c15059a) {
            C2668g.b(c15059a, "$receiver");
            C15062a c15062a = C15063c.f46892a;
            c15062a = C15063c.f46892a;
            new C15058a(c15059a, new C15063c(C18038b.class)).m56751a((Function2) C188141.f58351a);
        }
    }

    Connection$StateManager$stateMachine$1(C14803b c14803b) {
        this.f58356a = c14803b;
        super(1);
    }

    public /* synthetic */ Object invoke(Object obj) {
        m67266a((C15060a) obj);
        return C15813i.f49016a;
    }

    /* renamed from: a */
    public final void m67266a(@NotNull C15060a<C14797g, C14788b> c15060a) {
        C2668g.b(c15060a, "$receiver");
        Function1 c187981 = new Function1<C15059a<? extends C16518d>, C15813i>() {

            @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lcom/tinder/scarlet/State$Destroyed;", "Lcom/tinder/scarlet/State$Disconnected;", "it", "Lcom/tinder/scarlet/Event$OnLifecycle$Terminate;", "invoke"}, k = 3, mv = {1, 1, 9})
            /* renamed from: com.tinder.scarlet.internal.connection.Connection$StateManager$stateMachine$1$1$4 */
            static final class C187974 extends Lambda implements Function2<C16518d, C18036b, C16517c> {
                /* renamed from: a */
                public static final C187974 f58334a = new C187974();

                C187974() {
                    super(2);
                }

                public /* synthetic */ Object invoke(Object obj, Object obj2) {
                    return m67244a((C16518d) obj, (C18036b) obj2);
                }

                @NotNull
                /* renamed from: a */
                public final C16517c m67244a(@NotNull C16518d c16518d, @NotNull C18036b c18036b) {
                    C2668g.b(c16518d, "$receiver");
                    C2668g.b(c18036b, "it");
                    return C16517c.f51185a;
                }
            }

            public /* synthetic */ Object invoke(Object obj) {
                m67245a((C15059a) obj);
                return C15813i.f49016a;
            }

            /* renamed from: a */
            public final void m67245a(@NotNull C15059a<C16518d> c15059a) {
                C2668g.b(c15059a, "$receiver");
                c15059a.m56755a((Function2) new Function2<C16518d, C14788b, C15813i>() {
                    public /* synthetic */ Object invoke(Object obj, Object obj2) {
                        m67241a((C16518d) obj, (C14788b) obj2);
                        return C15813i.f49016a;
                    }

                    /* renamed from: a */
                    public final void m67241a(@NotNull C16518d c16518d, @NotNull C14788b c14788b) {
                        C2668g.b(c16518d, "$receiver");
                        C2668g.b(c14788b, "it");
                        this.f58356a.m56127e();
                    }
                });
                new C15058a(c15059a, this.f58356a.m56129f()).m56751a(new Function2<C16518d, C18035a<?>, C16516b>() {
                    public /* synthetic */ Object invoke(Object obj, Object obj2) {
                        return m67242a((C16518d) obj, (C18035a) obj2);
                    }

                    @NotNull
                    /* renamed from: a */
                    public final C16516b m67242a(@NotNull C16518d c16518d, @NotNull C18035a<?> c18035a) {
                        C2668g.b(c16518d, "$receiver");
                        C2668g.b(c18035a, "it");
                        return new C16516b(this.f58356a.m56124d(), 0);
                    }
                });
                new C15058a(c15059a, this.f58356a.m56131g()).m56752b(new Function2<C16518d, C18035a<?>, C15813i>() {
                    public /* synthetic */ Object invoke(Object obj, Object obj2) {
                        m67243a((C16518d) obj, (C18035a) obj2);
                        return C15813i.f49016a;
                    }

                    /* renamed from: a */
                    public final void m67243a(@NotNull C16518d c16518d, @NotNull C18035a<?> c18035a) {
                        C2668g.b(c16518d, "$receiver");
                        C2668g.b(c18035a, "it");
                        this.f58356a.m56127e();
                    }
                });
                C15062a c15062a = C15063c.f46892a;
                c15062a = C15063c.f46892a;
                new C15058a(c15059a, new C15063c(C18036b.class)).m56751a((Function2) C187974.f58334a);
            }
        };
        C15062a c15062a = C15063c.f46892a;
        c15062a = C15063c.f46892a;
        c15060a.m56757a(new C15063c(C16518d.class), c187981);
        c187981 = new Function1<C15059a<? extends C16520f>, C15813i>() {
            public /* synthetic */ Object invoke(Object obj) {
                m67251a((C15059a) obj);
                return C15813i.f49016a;
            }

            /* renamed from: a */
            public final void m67251a(@NotNull C15059a<C16520f> c15059a) {
                C2668g.b(c15059a, "$receiver");
                c15059a.m56755a((Function2) new Function2<C16520f, C14788b, C15813i>() {
                    public /* synthetic */ Object invoke(Object obj, Object obj2) {
                        m67246a((C16520f) obj, (C14788b) obj2);
                        return C15813i.f49016a;
                    }

                    /* renamed from: a */
                    public final void m67246a(@NotNull C16520f c16520f, @NotNull C14788b c14788b) {
                        C2668g.b(c16520f, "$receiver");
                        C2668g.b(c14788b, "it");
                        this.f58356a.m56127e();
                    }
                });
                C15062a c15062a = C15063c.f46892a;
                c15062a = C15063c.f46892a;
                new C15058a(c15059a, new C15063c(C16505b.class)).m56751a(new Function2<C16520f, C16505b, C16516b>() {
                    public /* synthetic */ Object invoke(Object obj, Object obj2) {
                        return m67247a((C16520f) obj, (C16505b) obj2);
                    }

                    @NotNull
                    /* renamed from: a */
                    public final C16516b m67247a(@NotNull C16520f c16520f, @NotNull C16505b c16505b) {
                        C2668g.b(c16520f, "$receiver");
                        C2668g.b(c16505b, "it");
                        return new C16516b(this.f58356a.m56124d(), c16520f.m61938b() + 1);
                    }
                });
                new C15058a(c15059a, this.f58356a.m56129f()).m56752b(new Function2<C16520f, C18035a<?>, C15813i>() {
                    public /* synthetic */ Object invoke(Object obj, Object obj2) {
                        m67248a((C16520f) obj, (C18035a) obj2);
                        return C15813i.f49016a;
                    }

                    /* renamed from: a */
                    public final void m67248a(@NotNull C16520f c16520f, @NotNull C18035a<?> c18035a) {
                        C2668g.b(c16520f, "$receiver");
                        C2668g.b(c18035a, "it");
                        this.f58356a.m56127e();
                    }
                });
                new C15058a(c15059a, this.f58356a.m56131g()).m56751a(new Function2<C16520f, C18035a<?>, C16518d>() {
                    public /* synthetic */ Object invoke(Object obj, Object obj2) {
                        return m67249a((C16520f) obj, (C18035a) obj2);
                    }

                    @NotNull
                    /* renamed from: a */
                    public final C16518d m67249a(@NotNull C16520f c16520f, @NotNull C18035a<?> c18035a) {
                        C2668g.b(c16520f, "$receiver");
                        C2668g.b(c18035a, "it");
                        this.f58356a.m56118a(c16520f);
                        return C16518d.f51186a;
                    }
                });
                c15062a = C15063c.f46892a;
                c15062a = C15063c.f46892a;
                new C15058a(c15059a, new C15063c(C18036b.class)).m56751a((Function2) new Function2<C16520f, C18036b, C16517c>() {
                    public /* synthetic */ Object invoke(Object obj, Object obj2) {
                        return m67250a((C16520f) obj, (C18036b) obj2);
                    }

                    @NotNull
                    /* renamed from: a */
                    public final C16517c m67250a(@NotNull C16520f c16520f, @NotNull C18036b c18036b) {
                        C2668g.b(c16520f, "$receiver");
                        C2668g.b(c18036b, "it");
                        this.f58356a.m56118a(c16520f);
                        return C16517c.f51185a;
                    }
                });
            }
        };
        c15062a = C15063c.f46892a;
        c15062a = C15063c.f46892a;
        c15060a.m56757a(new C15063c(C16520f.class), c187981);
        c187981 = new Function1<C15059a<? extends C16516b>, C15813i>() {

            @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lcom/tinder/scarlet/State$Connected;", "Lcom/tinder/scarlet/State$Connecting;", "it", "Lcom/tinder/scarlet/Event$OnWebSocket$Event;", "invoke"}, k = 3, mv = {1, 1, 9})
            /* renamed from: com.tinder.scarlet.internal.connection.Connection$StateManager$stateMachine$1$3$1 */
            static final class C188051 extends Lambda implements Function2<C16516b, C18037a<?>, C16515a> {
                /* renamed from: a */
                public static final C188051 f58342a = new C188051();

                C188051() {
                    super(2);
                }

                public /* synthetic */ Object invoke(Object obj, Object obj2) {
                    return m67252a((C16516b) obj, (C18037a) obj2);
                }

                @NotNull
                /* renamed from: a */
                public final C16515a m67252a(@NotNull C16516b c16516b, @NotNull C18037a<?> c18037a) {
                    C2668g.b(c16516b, "$receiver");
                    C2668g.b(c18037a, "it");
                    return new C16515a(c16516b.m61935a());
                }
            }

            public /* synthetic */ Object invoke(Object obj) {
                m67254a((C15059a) obj);
                return C15813i.f49016a;
            }

            /* renamed from: a */
            public final void m67254a(@NotNull C15059a<C16516b> c15059a) {
                C2668g.b(c15059a, "$receiver");
                new C15058a(c15059a, this.f58356a.m56132h()).m56751a(C188051.f58342a);
                C15062a c15062a = C15063c.f46892a;
                c15062a = C15063c.f46892a;
                new C15058a(c15059a, new C15063c(C18038b.class)).m56751a((Function2) new Function2<C16516b, C18038b, C16520f>() {
                    public /* synthetic */ Object invoke(Object obj, Object obj2) {
                        return m67253a((C16516b) obj, (C18038b) obj2);
                    }

                    @NotNull
                    /* renamed from: a */
                    public final C16520f m67253a(@NotNull C16516b c16516b, @NotNull C18038b c18038b) {
                        C2668g.b(c16516b, "$receiver");
                        C2668g.b(c18038b, "it");
                        long backoffDurationMillisAt = this.f58356a.f46400f.backoffDurationMillisAt(c16516b.m61936b());
                        return new C16520f(this.f58356a.m56115a(backoffDurationMillisAt), c16516b.m61936b(), backoffDurationMillisAt);
                    }
                });
            }
        };
        c15062a = C15063c.f46892a;
        c15062a = C15063c.f46892a;
        c15060a.m56757a(new C15063c(C16516b.class), c187981);
        c187981 = new Function1<C15059a<? extends C16515a>, C15813i>() {

            @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lcom/tinder/scarlet/State$Destroyed;", "Lcom/tinder/scarlet/State$Connected;", "it", "Lcom/tinder/scarlet/Event$OnLifecycle$Terminate;", "invoke"}, k = 3, mv = {1, 1, 9})
            /* renamed from: com.tinder.scarlet.internal.connection.Connection$StateManager$stateMachine$1$4$4 */
            static final class C188114 extends Lambda implements Function2<C16515a, C18036b, C16517c> {
                /* renamed from: a */
                public static final C188114 f58348a = new C188114();

                C188114() {
                    super(2);
                }

                public /* synthetic */ Object invoke(Object obj, Object obj2) {
                    return m67258a((C16515a) obj, (C18036b) obj2);
                }

                @NotNull
                /* renamed from: a */
                public final C16517c m67258a(@NotNull C16515a c16515a, @NotNull C18036b c18036b) {
                    C2668g.b(c16515a, "$receiver");
                    C2668g.b(c18036b, "it");
                    c16515a.m61934a().m56090a().cancel();
                    return C16517c.f51185a;
                }
            }

            public /* synthetic */ Object invoke(Object obj) {
                m67260a((C15059a) obj);
                return C15813i.f49016a;
            }

            /* renamed from: a */
            public final void m67260a(@NotNull C15059a<C16515a> c15059a) {
                C2668g.b(c15059a, "$receiver");
                c15059a.m56755a((Function2) new Function2<C16515a, C14788b, C15813i>() {
                    public /* synthetic */ Object invoke(Object obj, Object obj2) {
                        m67255a((C16515a) obj, (C14788b) obj2);
                        return C15813i.f49016a;
                    }

                    /* renamed from: a */
                    public final void m67255a(@NotNull C16515a c16515a, @NotNull C14788b c14788b) {
                        C2668g.b(c16515a, "$receiver");
                        C2668g.b(c14788b, "it");
                        this.f58356a.m56127e();
                    }
                });
                new C15058a(c15059a, this.f58356a.m56129f()).m56752b(new Function2<C16515a, C18035a<?>, C15813i>() {
                    public /* synthetic */ Object invoke(Object obj, Object obj2) {
                        m67256a((C16515a) obj, (C18035a) obj2);
                        return C15813i.f49016a;
                    }

                    /* renamed from: a */
                    public final void m67256a(@NotNull C16515a c16515a, @NotNull C18035a<?> c18035a) {
                        C2668g.b(c16515a, "$receiver");
                        C2668g.b(c18035a, "it");
                        this.f58356a.m56127e();
                    }
                });
                new C15058a(c15059a, this.f58356a.m56131g()).m56751a(new Function2<C16515a, C18035a<?>, C16519e>() {
                    public /* synthetic */ Object invoke(Object obj, Object obj2) {
                        return m67257a((C16515a) obj, (C18035a) obj2);
                    }

                    @NotNull
                    /* renamed from: a */
                    public final C16519e m67257a(@NotNull C16515a c16515a, @NotNull C18035a<?> c18035a) {
                        C2668g.b(c16515a, "$receiver");
                        C2668g.b(c18035a, "it");
                        this.f58356a.m56117a(c16515a, (C14785a) c18035a.m65500a());
                        return C16519e.f51187a;
                    }
                });
                C15062a c15062a = C15063c.f46892a;
                c15062a = C15063c.f46892a;
                new C15058a(c15059a, new C15063c(C18036b.class)).m56751a(C188114.f58348a);
                c15062a = C15063c.f46892a;
                c15062a = C15063c.f46892a;
                new C15058a(c15059a, new C15063c(C18038b.class)).m56751a((Function2) new Function2<C16515a, C18038b, C16520f>() {
                    public /* synthetic */ Object invoke(Object obj, Object obj2) {
                        return m67259a((C16515a) obj, (C18038b) obj2);
                    }

                    @NotNull
                    /* renamed from: a */
                    public final C16520f m67259a(@NotNull C16515a c16515a, @NotNull C18038b c18038b) {
                        C2668g.b(c16515a, "$receiver");
                        C2668g.b(c18038b, "it");
                        long backoffDurationMillisAt = this.f58356a.f46400f.backoffDurationMillisAt(0);
                        return new C16520f(this.f58356a.m56115a(backoffDurationMillisAt), 0, backoffDurationMillisAt);
                    }
                });
            }
        };
        c15062a = C15063c.f46892a;
        c15062a = C15063c.f46892a;
        c15060a.m56757a(new C15063c(C16515a.class), c187981);
        c187981 = C188155.f58352a;
        c15062a = C15063c.f46892a;
        c15062a = C15063c.f46892a;
        c15060a.m56757a(new C15063c(C16519e.class), c187981);
        c187981 = new Function1<C15059a<? extends C16517c>, C15813i>() {
            public /* synthetic */ Object invoke(Object obj) {
                m67264a((C15059a) obj);
                return C15813i.f49016a;
            }

            /* renamed from: a */
            public final void m67264a(@NotNull C15059a<C16517c> c15059a) {
                C2668g.b(c15059a, "$receiver");
                c15059a.m56755a((Function2) new Function2<C16517c, C14788b, C15813i>() {
                    public /* synthetic */ Object invoke(Object obj, Object obj2) {
                        m67263a((C16517c) obj, (C14788b) obj2);
                        return C15813i.f49016a;
                    }

                    /* renamed from: a */
                    public final void m67263a(@NotNull C16517c c16517c, @NotNull C14788b c14788b) {
                        C2668g.b(c16517c, "$receiver");
                        C2668g.b(c14788b, "it");
                        this.f58356a.f46395a.dispose();
                    }
                });
            }
        };
        c15062a = C15063c.f46892a;
        c15062a = C15063c.f46892a;
        c15060a.m56757a(new C15063c(C16517c.class), c187981);
        c15060a.m56758a(C16518d.f51186a);
        c15060a.m56759a((Function1) new Function1<C14797g, C15813i>() {
            public /* synthetic */ Object invoke(Object obj) {
                m67265a((C14797g) obj);
                return C15813i.f49016a;
            }

            /* renamed from: a */
            public final void m67265a(@NotNull C14797g c14797g) {
                C2668g.b(c14797g, "state");
                this.f58356a.f46396b.onNext(new C16506c(c14797g));
            }
        });
    }
}
