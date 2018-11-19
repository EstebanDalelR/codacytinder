package com.tinder.smsauth.core;

import com.tinder.common.statemachine.C8561a.C8554a;
import com.tinder.common.statemachine.C8561a.C8554a.C8553a;
import com.tinder.common.statemachine.C8561a.C8557c;
import com.tinder.common.statemachine.C8561a.C8559d.C8558a;
import com.tinder.smsauth.entity.C14977f;
import com.tinder.smsauth.entity.C14978g;
import com.tinder.smsauth.entity.C14980h;
import com.tinder.smsauth.entity.Flow.C14972a;
import com.tinder.smsauth.entity.Flow.C14972a.C16725a;
import com.tinder.smsauth.entity.Flow.C14972a.C16726b;
import com.tinder.smsauth.entity.Flow.C14972a.C16727c;
import com.tinder.smsauth.entity.Flow.C14972a.C16728d;
import com.tinder.smsauth.entity.Flow.C14972a.C16729e;
import com.tinder.smsauth.entity.Flow.C14972a.C16730f;
import com.tinder.smsauth.entity.Flow.C14972a.C16731g;
import com.tinder.smsauth.entity.Flow.C14972a.C16732h;
import com.tinder.smsauth.entity.Flow.C14972a.C16733i;
import com.tinder.smsauth.entity.Flow.C14972a.C16734j;
import com.tinder.smsauth.entity.Flow.C14972a.C16735k;
import com.tinder.smsauth.entity.Flow.C14972a.C16736l;
import com.tinder.smsauth.entity.Flow.C14973b;
import com.tinder.smsauth.entity.Flow.C14973b.C16737a;
import com.tinder.smsauth.entity.Flow.C14973b.C16738b;
import com.tinder.smsauth.entity.Flow.C14974c;
import com.tinder.smsauth.entity.Flow.C14974c.C16739a;
import com.tinder.smsauth.entity.Flow.C14974c.C16740b;
import com.tinder.smsauth.entity.Flow.C14974c.C16741c;
import com.tinder.smsauth.entity.Flow.C14974c.C16742d;
import com.tinder.smsauth.entity.Flow.C14974c.C16743e;
import com.tinder.smsauth.entity.Flow.C14974c.C16744f;
import com.tinder.smsauth.entity.Flow.C14974c.C16745g;
import com.tinder.smsauth.entity.Flow.C14974c.C16746h;
import com.tinder.smsauth.entity.Flow.Error.OneTimePasswordVerifiedAsInvalid;
import kotlin.C15813i;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0002H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "Lcom/tinder/common/statemachine/StateMachine$Builder;", "Lcom/tinder/smsauth/entity/Flow$State;", "Lcom/tinder/smsauth/entity/Flow$Event;", "Lcom/tinder/smsauth/entity/Flow$SideEffect;", "invoke"}, k = 3, mv = {1, 1, 10})
final class SmsAuthFlowStateMachineFactory$create$1 extends Lambda implements Function1<C8554a<C14974c, C14972a, C14973b>, C15813i> {
    /* renamed from: a */
    final /* synthetic */ C14965c f58528a;
    /* renamed from: b */
    final /* synthetic */ C14974c f58529b;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u001e\u0012\u0004\u0012\u00020\u00030\u0002R\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0004H\n¢\u0006\u0002\b\b"}, d2 = {"<anonymous>", "", "Lcom/tinder/common/statemachine/StateMachine$Builder$StateDefinitionBuilder;", "Lcom/tinder/smsauth/entity/Flow$State$RequestingOneTimePassword;", "Lcom/tinder/common/statemachine/StateMachine$Builder;", "Lcom/tinder/smsauth/entity/Flow$State;", "Lcom/tinder/smsauth/entity/Flow$Event;", "Lcom/tinder/smsauth/entity/Flow$SideEffect;", "invoke"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.smsauth.core.SmsAuthFlowStateMachineFactory$create$1$3 */
    static final class C188773 extends Lambda implements Function1<C8553a<C16743e>, C15813i> {
        /* renamed from: a */
        public static final C188773 f58507a = new C188773();

        C188773() {
            super(1);
        }

        public /* synthetic */ Object invoke(Object obj) {
            m67339a((C8553a) obj);
            return C15813i.f49016a;
        }

        /* renamed from: a */
        public final void m67339a(@NotNull final C8553a<C16743e> c8553a) {
            C2668g.b(c8553a, "$receiver");
            c8553a.a(C8557c.f30299a.a(C16730f.class), new Function2<C16743e, C16730f, C8558a<? extends C14974c, ? extends C14973b>>() {
                public /* synthetic */ Object invoke(Object obj, Object obj2) {
                    return m67336a((C16743e) obj, (C16730f) obj2);
                }

                @NotNull
                /* renamed from: a */
                public final C8558a<C14974c, C14973b> m67336a(@NotNull C16743e c16743e, @NotNull C16730f c16730f) {
                    C2668g.b(c16743e, "$receiver");
                    C2668g.b(c16730f, "event");
                    return C8553a.a(c8553a, c16743e, new C16739a(c16743e.mo12366a(), new C14978g(c16730f.m62239a(), false), null, 4, null), null, 2, null);
                }
            });
            c8553a.a(C8557c.f30299a.a(C16729e.class), new Function2<C16743e, C16729e, C8558a<? extends C14974c, ? extends C14973b>>() {
                public /* synthetic */ Object invoke(Object obj, Object obj2) {
                    return m67337a((C16743e) obj, (C16729e) obj2);
                }

                @NotNull
                /* renamed from: a */
                public final C8558a<C14974c, C14973b> m67337a(@NotNull C16743e c16743e, @NotNull C16729e c16729e) {
                    C2668g.b(c16743e, "$receiver");
                    C2668g.b(c16729e, "event");
                    return C8553a.a(c8553a, c16743e, new C16741c(c16743e.mo12366a(), c16729e.m62238a()), null, 2, null);
                }
            });
            c8553a.a(C8557c.f30299a.a(C16725a.class), new Function2<C16743e, C16725a, C8558a<? extends C14974c, ? extends C14973b>>() {
                public /* synthetic */ Object invoke(Object obj, Object obj2) {
                    return m67338a((C16743e) obj, (C16725a) obj2);
                }

                @NotNull
                /* renamed from: a */
                public final C8558a<C14974c, C14973b> m67338a(@NotNull C16743e c16743e, @NotNull C16725a c16725a) {
                    C2668g.b(c16743e, "$receiver");
                    C2668g.b(c16725a, "it");
                    return C8553a.a(c8553a, c16743e, new C16740b(c16743e.mo12366a()), null, 2, null);
                }
            });
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u001e\u0012\u0004\u0012\u00020\u00030\u0002R\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0004H\n¢\u0006\u0002\b\b"}, d2 = {"<anonymous>", "", "Lcom/tinder/common/statemachine/StateMachine$Builder$StateDefinitionBuilder;", "Lcom/tinder/smsauth/entity/Flow$State$FailedToRequestOneTimePassword;", "Lcom/tinder/common/statemachine/StateMachine$Builder;", "Lcom/tinder/smsauth/entity/Flow$State;", "Lcom/tinder/smsauth/entity/Flow$Event;", "Lcom/tinder/smsauth/entity/Flow$SideEffect;", "invoke"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.smsauth.core.SmsAuthFlowStateMachineFactory$create$1$4 */
    static final class C188804 extends Lambda implements Function1<C8553a<C16741c>, C15813i> {
        /* renamed from: a */
        public static final C188804 f58510a = new C188804();

        C188804() {
            super(1);
        }

        public /* synthetic */ Object invoke(Object obj) {
            m67342a((C8553a) obj);
            return C15813i.f49016a;
        }

        /* renamed from: a */
        public final void m67342a(@NotNull final C8553a<C16741c> c8553a) {
            C2668g.b(c8553a, "$receiver");
            c8553a.a(C8557c.f30299a.a(C16735k.class), new Function2<C16741c, C16735k, C8558a<? extends C14974c, ? extends C14973b>>() {
                public /* synthetic */ Object invoke(Object obj, Object obj2) {
                    return m67340a((C16741c) obj, (C16735k) obj2);
                }

                @NotNull
                /* renamed from: a */
                public final C8558a<C14974c, C14973b> m67340a(@NotNull C16741c c16741c, @NotNull C16735k c16735k) {
                    C2668g.b(c16741c, "$receiver");
                    C2668g.b(c16735k, "it");
                    return C8553a.a(c8553a, c16741c, new C16740b(c16741c.mo12366a()), null, 2, null);
                }
            });
            c8553a.a(C8557c.f30299a.a(C16725a.class), new Function2<C16741c, C16725a, C8558a<? extends C14974c, ? extends C14973b>>() {
                public /* synthetic */ Object invoke(Object obj, Object obj2) {
                    return m67341a((C16741c) obj, (C16725a) obj2);
                }

                @NotNull
                /* renamed from: a */
                public final C8558a<C14974c, C14973b> m67341a(@NotNull C16741c c16741c, @NotNull C16725a c16725a) {
                    C2668g.b(c16741c, "$receiver");
                    C2668g.b(c16725a, "it");
                    return C8553a.a(c8553a, c16741c, new C16740b(c16741c.mo12366a()), null, 2, null);
                }
            });
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u001e\u0012\u0004\u0012\u00020\u00030\u0002R\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0004H\n¢\u0006\u0002\b\b"}, d2 = {"<anonymous>", "", "Lcom/tinder/common/statemachine/StateMachine$Builder$StateDefinitionBuilder;", "Lcom/tinder/smsauth/entity/Flow$State$UnableToVerifyOneTimePassword;", "Lcom/tinder/common/statemachine/StateMachine$Builder;", "Lcom/tinder/smsauth/entity/Flow$State;", "Lcom/tinder/smsauth/entity/Flow$Event;", "Lcom/tinder/smsauth/entity/Flow$SideEffect;", "invoke"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.smsauth.core.SmsAuthFlowStateMachineFactory$create$1$7 */
    static final class C188947 extends Lambda implements Function1<C8553a<C16745g>, C15813i> {
        /* renamed from: a */
        public static final C188947 f58526a = new C188947();

        C188947() {
            super(1);
        }

        public /* synthetic */ Object invoke(Object obj) {
            m67356a((C8553a) obj);
            return C15813i.f49016a;
        }

        /* renamed from: a */
        public final void m67356a(@NotNull final C8553a<C16745g> c8553a) {
            C2668g.b(c8553a, "$receiver");
            c8553a.a(C8557c.f30299a.a(C16735k.class), new Function2<C16745g, C16735k, C8558a<? extends C14974c, ? extends C14973b>>() {
                public /* synthetic */ Object invoke(Object obj, Object obj2) {
                    return m67354a((C16745g) obj, (C16735k) obj2);
                }

                @NotNull
                /* renamed from: a */
                public final C8558a<C14974c, C14973b> m67354a(@NotNull C16745g c16745g, @NotNull C16735k c16735k) {
                    C2668g.b(c16745g, "$receiver");
                    C2668g.b(c16735k, "it");
                    return C8553a.a(c8553a, c16745g, new C16739a(c16745g.mo12366a(), c16745g.m62258b(), null, 4, null), null, 2, null);
                }
            });
            c8553a.a(C8557c.f30299a.a(C16725a.class), new Function2<C16745g, C16725a, C8558a<? extends C14974c, ? extends C14973b>>() {
                public /* synthetic */ Object invoke(Object obj, Object obj2) {
                    return m67355a((C16745g) obj, (C16725a) obj2);
                }

                @NotNull
                /* renamed from: a */
                public final C8558a<C14974c, C14973b> m67355a(@NotNull C16745g c16745g, @NotNull C16725a c16725a) {
                    C2668g.b(c16745g, "$receiver");
                    C2668g.b(c16725a, "it");
                    return C8553a.a(c8553a, c16745g, new C16739a(c16745g.mo12366a(), c16745g.m62258b(), null, 4, null), null, 2, null);
                }
            });
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u001e\u0012\u0004\u0012\u00020\u00030\u0002R\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0004H\n¢\u0006\u0002\b\b"}, d2 = {"<anonymous>", "", "Lcom/tinder/common/statemachine/StateMachine$Builder$StateDefinitionBuilder;", "Lcom/tinder/smsauth/entity/Flow$State$LoginSuccessful;", "Lcom/tinder/common/statemachine/StateMachine$Builder;", "Lcom/tinder/smsauth/entity/Flow$State;", "Lcom/tinder/smsauth/entity/Flow$Event;", "Lcom/tinder/smsauth/entity/Flow$SideEffect;", "invoke"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.smsauth.core.SmsAuthFlowStateMachineFactory$create$1$8 */
    static final class C188958 extends Lambda implements Function1<C8553a<C16742d>, C15813i> {
        /* renamed from: a */
        public static final C188958 f58527a = new C188958();

        C188958() {
            super(1);
        }

        /* renamed from: a */
        public final void m67357a(@NotNull C8553a<C16742d> c8553a) {
            C2668g.b(c8553a, "$receiver");
        }

        public /* synthetic */ Object invoke(Object obj) {
            m67357a((C8553a) obj);
            return C15813i.f49016a;
        }
    }

    SmsAuthFlowStateMachineFactory$create$1(C14965c c14965c, C14974c c14974c) {
        this.f58528a = c14965c;
        this.f58529b = c14974c;
        super(1);
    }

    public /* synthetic */ Object invoke(Object obj) {
        m67358a((C8554a) obj);
        return C15813i.f49016a;
    }

    /* renamed from: a */
    public final void m67358a(@NotNull C8554a<C14974c, C14972a, C14973b> c8554a) {
        C2668g.b(c8554a, "$receiver");
        c8554a.a(this.f58529b);
        c8554a.a(C8557c.f30299a.a(C16740b.class), new Function1<C8553a<C16740b>, C15813i>() {
            public /* synthetic */ Object invoke(Object obj) {
                m67332a((C8553a) obj);
                return C15813i.f49016a;
            }

            /* renamed from: a */
            public final void m67332a(@NotNull final C8553a<C16740b> c8553a) {
                C2668g.b(c8553a, "$receiver");
                c8553a.a(C8557c.f30299a.a(C16734j.class), new Function2<C16740b, C16734j, C8558a<? extends C14974c, ? extends C14973b>>() {
                    public /* synthetic */ Object invoke(Object obj, Object obj2) {
                        return m67329a((C16740b) obj, (C16734j) obj2);
                    }

                    @NotNull
                    /* renamed from: a */
                    public final C8558a<C14974c, C14973b> m67329a(@NotNull C16740b c16740b, @NotNull C16734j c16734j) {
                        C2668g.b(c16740b, "$receiver");
                        C2668g.b(c16734j, "event");
                        return C8553a.a(c8553a, c16740b, new C16740b(this.f58528a.f46727a.validate(C14980h.m56572a(c16740b.mo12366a().m56580a(), 0, null, c16734j.m62242a(), null, null, 27, null))), null, 2, null);
                    }
                });
                c8553a.a(C8557c.f30299a.a(C16727c.class), new Function2<C16740b, C16727c, C8558a<? extends C14974c, ? extends C14973b>>() {
                    public /* synthetic */ Object invoke(Object obj, Object obj2) {
                        return m67330a((C16740b) obj, (C16727c) obj2);
                    }

                    @NotNull
                    /* renamed from: a */
                    public final C8558a<C14974c, C14973b> m67330a(@NotNull C16740b c16740b, @NotNull C16727c c16727c) {
                        C2668g.b(c16740b, "$receiver");
                        C2668g.b(c16727c, "it");
                        return C8553a.a(c8553a, c16740b, new C16744f(c16740b.mo12366a()), null, 2, null);
                    }
                });
                c8553a.a(C8557c.f30299a.a(C16736l.class), new Function2<C16740b, C16736l, C8558a<? extends C14974c, ? extends C14973b>>() {
                    public /* synthetic */ Object invoke(Object obj, Object obj2) {
                        return m67331a((C16740b) obj, (C16736l) obj2);
                    }

                    @NotNull
                    /* renamed from: a */
                    public final C8558a<C14974c, C14973b> m67331a(@NotNull C16740b c16740b, @NotNull C16736l c16736l) {
                        C2668g.b(c16740b, "$receiver");
                        C2668g.b(c16736l, "it");
                        if (c16740b.mo12366a().m56581b() != null) {
                            return c8553a.a(c16740b, new C16743e(c16740b.mo12366a()), new C16737a(c16740b.mo12366a().m56580a()));
                        }
                        return c8553a.a(c16740b);
                    }
                });
            }
        });
        c8554a.a(C8557c.f30299a.a(C16744f.class), new Function1<C8553a<C16744f>, C15813i>() {
            public /* synthetic */ Object invoke(Object obj) {
                m67335a((C8553a) obj);
                return C15813i.f49016a;
            }

            /* renamed from: a */
            public final void m67335a(@NotNull final C8553a<C16744f> c8553a) {
                C2668g.b(c8553a, "$receiver");
                c8553a.a(C8557c.f30299a.a(C16726b.class), new Function2<C16744f, C16726b, C8558a<? extends C14974c, ? extends C14973b>>() {
                    public /* synthetic */ Object invoke(Object obj, Object obj2) {
                        return m67333a((C16744f) obj, (C16726b) obj2);
                    }

                    @NotNull
                    /* renamed from: a */
                    public final C8558a<C14974c, C14973b> m67333a(@NotNull C16744f c16744f, @NotNull C16726b c16726b) {
                        C2668g.b(c16744f, "$receiver");
                        C2668g.b(c16726b, "event");
                        return C8553a.a(c8553a, c16744f, new C16740b(this.f58528a.f46727a.validate(C14980h.m56572a(c16744f.mo12366a().m56580a(), 0, c16726b.m62235a(), null, null, null, 29, null))), null, 2, null);
                    }
                });
                c8553a.a(C8557c.f30299a.a(C16725a.class), new Function2<C16744f, C16725a, C8558a<? extends C14974c, ? extends C14973b>>() {
                    public /* synthetic */ Object invoke(Object obj, Object obj2) {
                        return m67334a((C16744f) obj, (C16725a) obj2);
                    }

                    @NotNull
                    /* renamed from: a */
                    public final C8558a<C14974c, C14973b> m67334a(@NotNull C16744f c16744f, @NotNull C16725a c16725a) {
                        C2668g.b(c16744f, "$receiver");
                        C2668g.b(c16725a, "it");
                        return C8553a.a(c8553a, c16744f, new C16740b(c16744f.mo12366a()), null, 2, null);
                    }
                });
            }
        });
        c8554a.a(C8557c.f30299a.a(C16743e.class), C188773.f58507a);
        c8554a.a(C8557c.f30299a.a(C16741c.class), C188804.f58510a);
        c8554a.a(C8557c.f30299a.a(C16739a.class), new Function1<C8553a<C16739a>, C15813i>() {
            public /* synthetic */ Object invoke(Object obj) {
                m67349a((C8553a) obj);
                return C15813i.f49016a;
            }

            /* renamed from: a */
            public final void m67349a(@NotNull final C8553a<C16739a> c8553a) {
                C2668g.b(c8553a, "$receiver");
                c8553a.a(C8557c.f30299a.a(C16728d.class), new Function2<C16739a, C16728d, C8558a<? extends C14974c, ? extends C14973b>>() {
                    public /* synthetic */ Object invoke(Object obj, Object obj2) {
                        return m67343a((C16739a) obj, (C16728d) obj2);
                    }

                    @NotNull
                    /* renamed from: a */
                    public final C8558a<C14974c, C14973b> m67343a(@NotNull C16739a c16739a, @NotNull C16728d c16728d) {
                        C2668g.b(c16739a, "$receiver");
                        C2668g.b(c16728d, "event");
                        C14978g validate = this.f58528a.f46728b.validate(C14977f.m56565a(c16739a.m62248b().m56569a(), 0, c16728d.m62236a(), 1, null));
                        if (c16728d.m62237b() == null || validate.m56570b() == null) {
                            return C8553a.a(c8553a, c16739a, new C16739a(c16739a.mo12366a(), validate, null, 4, null), null, 2, null);
                        }
                        c16728d = c8553a;
                        C16746h c16746h = new C16746h(c16739a.mo12366a(), validate);
                        C14980h a = c16739a.mo12366a().m56580a();
                        String b = validate.m56569a().m56568b();
                        if (b == null) {
                            C2668g.a();
                        }
                        return c16728d.a(c16739a, c16746h, new C16738b(a, b));
                    }
                });
                c8553a.a(C8557c.f30299a.a(C16731g.class), new Function2<C16739a, C16731g, C8558a<? extends C14974c, ? extends C14973b>>() {
                    public /* synthetic */ Object invoke(Object obj, Object obj2) {
                        return m67344a((C16739a) obj, (C16731g) obj2);
                    }

                    @NotNull
                    /* renamed from: a */
                    public final C8558a<C14974c, C14973b> m67344a(@NotNull C16739a c16739a, @NotNull C16731g c16731g) {
                        C2668g.b(c16739a, "$receiver");
                        C2668g.b(c16731g, "it");
                        return c8553a.a(c16739a, c16739a, new C16737a(c16739a.mo12366a().m56580a()));
                    }
                });
                c8553a.a(C8557c.f30299a.a(C16730f.class), new Function2<C16739a, C16730f, C8558a<? extends C14974c, ? extends C14973b>>() {
                    public /* synthetic */ Object invoke(Object obj, Object obj2) {
                        return m67345a((C16739a) obj, (C16730f) obj2);
                    }

                    @NotNull
                    /* renamed from: a */
                    public final C8558a<C14974c, C14973b> m67345a(@NotNull C16739a c16739a, @NotNull C16730f c16730f) {
                        C2668g.b(c16739a, "$receiver");
                        C2668g.b(c16730f, "it");
                        return c8553a.a(c16739a);
                    }
                });
                c8553a.a(C8557c.f30299a.a(C16729e.class), new Function2<C16739a, C16729e, C8558a<? extends C14974c, ? extends C14973b>>() {
                    public /* synthetic */ Object invoke(Object obj, Object obj2) {
                        return m67346a((C16739a) obj, (C16729e) obj2);
                    }

                    @NotNull
                    /* renamed from: a */
                    public final C8558a<C14974c, C14973b> m67346a(@NotNull C16739a c16739a, @NotNull C16729e c16729e) {
                        C2668g.b(c16739a, "$receiver");
                        C2668g.b(c16729e, "it");
                        return c8553a.a(c16739a);
                    }
                });
                c8553a.a(C8557c.f30299a.a(C16736l.class), new Function2<C16739a, C16736l, C8558a<? extends C14974c, ? extends C14973b>>() {
                    public /* synthetic */ Object invoke(Object obj, Object obj2) {
                        return m67347a((C16739a) obj, (C16736l) obj2);
                    }

                    @NotNull
                    /* renamed from: a */
                    public final C8558a<C14974c, C14973b> m67347a(@NotNull C16739a c16739a, @NotNull C16736l c16736l) {
                        C2668g.b(c16739a, "$receiver");
                        C2668g.b(c16736l, "it");
                        if (c16739a.m62248b().m56570b() == null) {
                            return c8553a.a(c16739a);
                        }
                        c16736l = c8553a;
                        C16746h c16746h = new C16746h(c16739a.mo12366a(), c16739a.m62248b());
                        C14980h a = c16739a.mo12366a().m56580a();
                        String b = c16739a.m62248b().m56569a().m56568b();
                        if (b == null) {
                            C2668g.a();
                        }
                        return c16736l.a(c16739a, c16746h, new C16738b(a, b));
                    }
                });
                c8553a.a(C8557c.f30299a.a(C16725a.class), new Function2<C16739a, C16725a, C8558a<? extends C14974c, ? extends C14973b>>() {
                    public /* synthetic */ Object invoke(Object obj, Object obj2) {
                        return m67348a((C16739a) obj, (C16725a) obj2);
                    }

                    @NotNull
                    /* renamed from: a */
                    public final C8558a<C14974c, C14973b> m67348a(@NotNull C16739a c16739a, @NotNull C16725a c16725a) {
                        C2668g.b(c16739a, "$receiver");
                        C2668g.b(c16725a, "it");
                        return C8553a.a(c8553a, c16739a, new C16740b(c16739a.mo12366a()), null, 2, null);
                    }
                });
            }
        });
        c8554a.a(C8557c.f30299a.a(C16746h.class), new Function1<C8553a<C16746h>, C15813i>() {
            public /* synthetic */ Object invoke(Object obj) {
                m67353a((C8553a) obj);
                return C15813i.f49016a;
            }

            /* renamed from: a */
            public final void m67353a(@NotNull final C8553a<C16746h> c8553a) {
                C2668g.b(c8553a, "$receiver");
                c8553a.a(C8557c.f30299a.a(C16733i.class), new Function2<C16746h, C16733i, C8558a<? extends C14974c, ? extends C14973b>>() {
                    public /* synthetic */ Object invoke(Object obj, Object obj2) {
                        return m67350a((C16746h) obj, (C16733i) obj2);
                    }

                    @NotNull
                    /* renamed from: a */
                    public final C8558a<C14974c, C14973b> m67350a(@NotNull C16746h c16746h, @NotNull C16733i c16733i) {
                        C2668g.b(c16746h, "$receiver");
                        C2668g.b(c16733i, "event");
                        return C8553a.a(c8553a, c16746h, new C16742d(c16746h.mo12366a(), c16746h.m62261b(), c16733i.m62241a()), null, 2, null);
                    }
                });
                c8553a.a(C8557c.f30299a.a(C16732h.class), new Function2<C16746h, C16732h, C8558a<? extends C14974c, ? extends C14973b>>() {
                    public /* synthetic */ Object invoke(Object obj, Object obj2) {
                        return m67351a((C16746h) obj, (C16732h) obj2);
                    }

                    @NotNull
                    /* renamed from: a */
                    public final C8558a<C14974c, C14973b> m67351a(@NotNull C16746h c16746h, @NotNull C16732h c16732h) {
                        C2668g.b(c16746h, "$receiver");
                        C2668g.b(c16732h, "event");
                        if (C2668g.a(c16732h.m62240a(), OneTimePasswordVerifiedAsInvalid.f51713a)) {
                            C14977f a = C14977f.m56565a(c16746h.m62261b().m56569a(), 0, "", 1, null);
                            return C8553a.a(c8553a, c16746h, new C16739a(c16746h.mo12366a(), this.f58528a.f46728b.validate(a), c16732h.m62240a()), null, 2, null);
                        }
                        return C8553a.a(c8553a, c16746h, new C16745g(c16746h.mo12366a(), c16746h.m62261b(), c16732h.m62240a()), null, 2, null);
                    }
                });
                c8553a.a(C8557c.f30299a.a(C16725a.class), new Function2<C16746h, C16725a, C8558a<? extends C14974c, ? extends C14973b>>() {
                    public /* synthetic */ Object invoke(Object obj, Object obj2) {
                        return m67352a((C16746h) obj, (C16725a) obj2);
                    }

                    @NotNull
                    /* renamed from: a */
                    public final C8558a<C14974c, C14973b> m67352a(@NotNull C16746h c16746h, @NotNull C16725a c16725a) {
                        C2668g.b(c16746h, "$receiver");
                        C2668g.b(c16725a, "it");
                        return C8553a.a(c8553a, c16746h, new C16739a(c16746h.mo12366a(), c16746h.m62261b(), null, 4, null), null, 2, null);
                    }
                });
            }
        });
        c8554a.a(C8557c.f30299a.a(C16745g.class), C188947.f58526a);
        c8554a.a(C8557c.f30299a.a(C16742d.class), C188958.f58527a);
    }
}
