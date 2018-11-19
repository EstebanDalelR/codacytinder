package com.tinder.settings.analytics;

import android.support.annotation.NonNull;
import com.tinder.analytics.fireworks.C2630h;
import com.tinder.domain.common.usecase.CompletableUseCase;
import com.tinder.etl.event.C11159a;
import com.tinder.etl.event.C11159a.C8952a;
import com.tinder.settings.model.ExitSurveyDetailReason;
import com.tinder.settings.model.ExitSurveyDislikeReason;
import com.tinder.settings.model.ExitSurveyFeedbackReason;
import com.tinder.settings.model.ExitSurveyFreshStartReason;
import com.tinder.settings.model.ExitSurveyReason;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p000a.p001a.C0001a;
import rx.Completable;

public class TrackExitSurveyEvent implements CompletableUseCase<C14862a> {
    /* renamed from: a */
    private final C2630h f51453a;
    /* renamed from: b */
    private EventCode f51454b;
    /* renamed from: c */
    private EventCode f51455c;
    /* renamed from: d */
    private Integer f51456d;
    /* renamed from: e */
    private List<Integer> f51457e;
    /* renamed from: f */
    private List<Integer> f51458f;
    /* renamed from: g */
    private String f51459g;
    /* renamed from: h */
    private List<Integer> f51460h;
    /* renamed from: i */
    private List<Integer> f51461i;
    /* renamed from: j */
    private List<Integer> f51462j;
    /* renamed from: k */
    private String f51463k;
    /* renamed from: l */
    private List<Integer> f51464l;
    /* renamed from: m */
    private List<Integer> f51465m;
    /* renamed from: n */
    private List<Integer> f51466n;
    /* renamed from: o */
    private String f51467o;
    /* renamed from: p */
    private List<Integer> f51468p;
    /* renamed from: q */
    private List<Integer> f51469q;
    /* renamed from: r */
    private List<Integer> f51470r;

    public enum Action {
        VIEW("view"),
        SUBMIT("submit"),
        CANCEL("cancel"),
        CANCEL_BACK_BUTTON("cancelBackButton"),
        DELETE("delete"),
        HIDE("hide"),
        PAUSE("pause");
        
        final String apiName;

        private Action(String str) {
            this.apiName = str;
        }
    }

    public enum EventCode {
        ASK_REASONS(1, "askReasons"),
        ASK_FEEDBACK(2, "askFeedback"),
        ARE_YOU_SURE(3, "areYouSure"),
        RETENTION_HOOK(4, "retentionHook"),
        BUG_OPTIONS(5, "bugOptions"),
        OTHER_FEEDBACK(6, "otherFeedback"),
        INITIATE_DELETE(7, "initiateDelete"),
        DEACTIVATE_INTRO(8, "deactivateIntro"),
        DISLIKE_OPTIONS(9, "dislikeOptions"),
        FRESH_START_OPTIONS(10, "freshStartOptions"),
        PAUSE_CONFIRM(11, "pauseConfirm");
        
        final String apiName;
        final int apiValue;

        private EventCode(int i, String str) {
            this.apiValue = i;
            this.apiName = str;
        }
    }

    /* renamed from: com.tinder.settings.analytics.TrackExitSurveyEvent$a */
    public static class C14862a {
        /* renamed from: a */
        private final EventCode f46514a;
        /* renamed from: b */
        private final Action f46515b;
        /* renamed from: c */
        private final Integer f46516c;
        /* renamed from: d */
        private final List<Integer> f46517d;
        /* renamed from: e */
        private final List<Integer> f46518e;
        /* renamed from: f */
        private final String f46519f;
        /* renamed from: g */
        private final List<Integer> f46520g;
        /* renamed from: h */
        private final List<Integer> f46521h;
        /* renamed from: i */
        private final List<Integer> f46522i;
        /* renamed from: j */
        private final String f46523j;
        /* renamed from: k */
        private final List<Integer> f46524k;
        /* renamed from: l */
        private final List<Integer> f46525l;
        /* renamed from: m */
        private final List<Integer> f46526m;
        /* renamed from: n */
        private final String f46527n;
        /* renamed from: o */
        private final List<Integer> f46528o;
        /* renamed from: p */
        private final List<Integer> f46529p;
        /* renamed from: q */
        private final List<Integer> f46530q;
        /* renamed from: r */
        private final Integer f46531r;

        /* renamed from: com.tinder.settings.analytics.TrackExitSurveyEvent$a$a */
        public static class C14861a {
            /* renamed from: a */
            private final EventCode f46496a;
            /* renamed from: b */
            private final Action f46497b;
            /* renamed from: c */
            private Integer f46498c = null;
            /* renamed from: d */
            private List<Integer> f46499d = null;
            /* renamed from: e */
            private List<Integer> f46500e = null;
            /* renamed from: f */
            private String f46501f = null;
            /* renamed from: g */
            private List<Integer> f46502g = null;
            /* renamed from: h */
            private List<Integer> f46503h = null;
            /* renamed from: i */
            private List<Integer> f46504i = null;
            /* renamed from: j */
            private String f46505j = null;
            /* renamed from: k */
            private List<Integer> f46506k = null;
            /* renamed from: l */
            private List<Integer> f46507l = null;
            /* renamed from: m */
            private List<Integer> f46508m = null;
            /* renamed from: n */
            private String f46509n = null;
            /* renamed from: o */
            private List<Integer> f46510o = null;
            /* renamed from: p */
            private List<Integer> f46511p = null;
            /* renamed from: q */
            private List<Integer> f46512q = null;
            /* renamed from: r */
            private Integer f46513r = null;

            public C14861a(@NonNull EventCode eventCode, @NonNull Action action) {
                this.f46496a = eventCode;
                this.f46497b = action;
            }

            /* renamed from: a */
            public C14861a m56242a(@NonNull ExitSurveyReason exitSurveyReason) {
                this.f46498c = Integer.valueOf(exitSurveyReason.getAnalyticsId());
                return this;
            }

            /* renamed from: a */
            public C14861a m56245a(@NonNull List<ExitSurveyReason> list) {
                List arrayList = new ArrayList(list.size());
                for (ExitSurveyReason analyticsId : list) {
                    arrayList.add(Integer.valueOf(analyticsId.getAnalyticsId()));
                }
                this.f46499d = arrayList;
                return this;
            }

            /* renamed from: b */
            public C14861a m56249b(@NonNull List<ExitSurveyReason> list) {
                List arrayList = new ArrayList(list.size());
                for (ExitSurveyReason analyticsId : list) {
                    arrayList.add(Integer.valueOf(analyticsId.getAnalyticsId()));
                }
                this.f46500e = arrayList;
                return this;
            }

            /* renamed from: a */
            public C14861a m56243a(@NonNull String str) {
                this.f46501f = str;
                return this;
            }

            /* renamed from: a */
            public C14861a m56244a(@NonNull Collection<ExitSurveyDetailReason> collection) {
                List arrayList = new ArrayList(collection.size());
                for (ExitSurveyDetailReason analyticsId : collection) {
                    arrayList.add(Integer.valueOf(analyticsId.getAnalyticsId()));
                }
                this.f46502g = arrayList;
                return this;
            }

            /* renamed from: c */
            public C14861a m56252c(@NonNull List<ExitSurveyFeedbackReason> list) {
                List arrayList = new ArrayList(list.size());
                for (ExitSurveyFeedbackReason analyticsId : list) {
                    arrayList.add(Integer.valueOf(analyticsId.getAnalyticsId()));
                }
                this.f46503h = arrayList;
                return this;
            }

            /* renamed from: d */
            public C14861a m56253d(@NonNull List<ExitSurveyDetailReason> list) {
                List arrayList = new ArrayList(list.size());
                for (ExitSurveyDetailReason analyticsId : list) {
                    arrayList.add(Integer.valueOf(analyticsId.getAnalyticsId()));
                }
                this.f46504i = arrayList;
                return this;
            }

            /* renamed from: b */
            public C14861a m56247b(@NonNull String str) {
                this.f46505j = str;
                return this;
            }

            /* renamed from: b */
            public C14861a m56248b(@NonNull Collection<ExitSurveyDetailReason> collection) {
                List arrayList = new ArrayList(collection.size());
                for (ExitSurveyDetailReason analyticsId : collection) {
                    arrayList.add(Integer.valueOf(analyticsId.getAnalyticsId()));
                }
                this.f46506k = arrayList;
                return this;
            }

            /* renamed from: e */
            public C14861a m56254e(@NonNull List<ExitSurveyDislikeReason> list) {
                List arrayList = new ArrayList(list.size());
                for (ExitSurveyDislikeReason analyticsId : list) {
                    arrayList.add(Integer.valueOf(analyticsId.getAnalyticsId()));
                }
                this.f46507l = arrayList;
                return this;
            }

            /* renamed from: f */
            public C14861a m56255f(@NonNull List<ExitSurveyDetailReason> list) {
                List arrayList = new ArrayList(list.size());
                for (ExitSurveyDetailReason analyticsId : list) {
                    arrayList.add(Integer.valueOf(analyticsId.getAnalyticsId()));
                }
                this.f46508m = arrayList;
                return this;
            }

            /* renamed from: c */
            public C14861a m56251c(@NonNull Collection<ExitSurveyDetailReason> collection) {
                List arrayList = new ArrayList(collection.size());
                for (ExitSurveyDetailReason analyticsId : collection) {
                    arrayList.add(Integer.valueOf(analyticsId.getAnalyticsId()));
                }
                this.f46510o = arrayList;
                return this;
            }

            /* renamed from: g */
            public C14861a m56256g(@NonNull List<ExitSurveyFreshStartReason> list) {
                List arrayList = new ArrayList(list.size());
                for (ExitSurveyFreshStartReason analyticsId : list) {
                    arrayList.add(Integer.valueOf(analyticsId.getAnalyticsId()));
                }
                this.f46511p = arrayList;
                return this;
            }

            /* renamed from: h */
            public C14861a m56257h(@NonNull List<ExitSurveyDetailReason> list) {
                List arrayList = new ArrayList(list.size());
                for (ExitSurveyDetailReason analyticsId : list) {
                    arrayList.add(Integer.valueOf(analyticsId.getAnalyticsId()));
                }
                this.f46512q = arrayList;
                return this;
            }

            /* renamed from: c */
            public C14861a m56250c(@NonNull String str) {
                this.f46509n = str;
                return this;
            }

            /* renamed from: a */
            public C14861a m56241a(int i) {
                this.f46513r = Integer.valueOf(i);
                return this;
            }

            /* renamed from: a */
            public C14862a m56246a() {
                return new C14862a();
            }
        }

        private C14862a(C14861a c14861a) {
            this.f46514a = c14861a.f46496a;
            this.f46515b = c14861a.f46497b;
            this.f46516c = c14861a.f46498c;
            this.f46517d = c14861a.f46499d;
            this.f46518e = c14861a.f46500e;
            this.f46519f = c14861a.f46501f;
            this.f46520g = c14861a.f46502g;
            this.f46521h = c14861a.f46503h;
            this.f46522i = c14861a.f46504i;
            this.f46523j = c14861a.f46505j;
            this.f46524k = c14861a.f46506k;
            this.f46525l = c14861a.f46507l;
            this.f46526m = c14861a.f46508m;
            this.f46527n = c14861a.f46509n;
            this.f46528o = c14861a.f46510o;
            this.f46529p = c14861a.f46511p;
            this.f46530q = c14861a.f46512q;
            this.f46531r = c14861a.f46513r;
        }
    }

    public /* synthetic */ Completable execute(@NonNull Object obj) {
        return m62056a((C14862a) obj);
    }

    public TrackExitSurveyEvent(C2630h c2630h) {
        this.f51453a = c2630h;
    }

    /* renamed from: a */
    public Completable m62056a(@NonNull C14862a c14862a) {
        return Completable.a(new C18828b(this, c14862a));
    }

    /* renamed from: b */
    final /* synthetic */ void m62057b(@NonNull C14862a c14862a) {
        Number c;
        C8952a a = C11159a.a();
        if (c14862a.f46514a != this.f51455c) {
            this.f51454b = this.f51455c;
        }
        if (this.f51454b != null) {
            a.d(Integer.valueOf(this.f51454b.apiValue));
            a.f(this.f51454b.apiName);
        }
        a.b(Integer.valueOf(c14862a.f46514a.apiValue));
        a.d(c14862a.f46514a.apiName);
        this.f51455c = c14862a.f46514a;
        a.c(c14862a.f46515b.apiName);
        if (c14862a.f46516c != null) {
            c = c14862a.f46516c;
        } else {
            c = this.f51456d;
        }
        if (c != null) {
            a.e(c);
            this.f51456d = c;
        }
        if (c14862a.f46517d != null) {
            a.k(c14862a.f46517d);
            this.f51457e = c14862a.f46517d;
        } else if (this.f51457e != null) {
            a.k(this.f51457e);
        }
        if (c14862a.f46518e != null) {
            a.j(c14862a.f46518e);
            this.f51458f = c14862a.f46518e;
        } else if (this.f51458f != null) {
            a.j(this.f51458f);
        }
        if (c14862a.f46519f != null) {
            a.e(c14862a.f46519f);
            this.f51459g = c14862a.f46519f;
        } else if (this.f51459g != null) {
            a.e(this.f51459g);
        }
        if (c14862a.f46520g != null) {
            a.b(c14862a.f46520g);
            this.f51460h = c14862a.f46520g;
        } else if (this.f51460h != null) {
            a.b(this.f51460h);
        }
        if (c14862a.f46521h != null) {
            a.c(c14862a.f46521h);
            this.f51461i = c14862a.f46521h;
        } else if (this.f51461i != null) {
            a.c(this.f51461i);
        }
        if (c14862a.f46522i != null) {
            a.a(c14862a.f46522i);
            this.f51462j = c14862a.f46522i;
        } else if (this.f51462j != null) {
            a.a(this.f51462j);
        }
        if (c14862a.f46523j != null) {
            a.a(c14862a.f46523j);
            this.f51463k = c14862a.f46523j;
        } else if (this.f51463k != null) {
            a.a(this.f51463k);
        }
        if (c14862a.f46526m != null) {
            a.d(c14862a.f46526m);
            this.f51466n = c14862a.f46526m;
        } else if (this.f51466n != null) {
            a.d(this.f51466n);
        }
        if (c14862a.f46524k != null) {
            a.e(c14862a.f46524k);
            this.f51464l = c14862a.f46524k;
        } else if (this.f51464l != null) {
            a.e(this.f51464l);
        }
        if (c14862a.f46525l != null) {
            a.f(c14862a.f46525l);
            this.f51465m = c14862a.f46525l;
        } else if (this.f51465m != null) {
            a.f(this.f51465m);
        }
        if (c14862a.f46527n != null) {
            a.b(c14862a.f46527n);
            this.f51467o = c14862a.f46527n;
        } else if (this.f51467o != null) {
            a.b(this.f51467o);
        }
        if (c14862a.f46530q != null) {
            a.g(c14862a.f46530q);
            this.f51470r = c14862a.f46530q;
        } else if (this.f51470r != null) {
            a.g(this.f51470r);
        }
        if (c14862a.f46528o != null) {
            a.h(c14862a.f46528o);
            this.f51468p = c14862a.f46528o;
        } else if (this.f51468p != null) {
            a.h(this.f51468p);
        }
        if (c14862a.f46529p != null) {
            a.i(c14862a.f46529p);
            this.f51469q = c14862a.f46529p;
        } else if (this.f51469q != null) {
            a.i(this.f51469q);
        }
        if (c14862a.f46531r != null) {
            a.a(c14862a.f46531r);
        }
        a.c(Integer.valueOf(7));
        c14862a = a.a();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Sending event ");
        stringBuilder.append(c14862a.toString());
        C0001a.b(stringBuilder.toString(), new Object[0]);
        this.f51453a.a(c14862a);
    }
}
