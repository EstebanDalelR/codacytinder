package android.support.transition;

import android.graphics.Rect;
import android.support.annotation.NonNull;
import android.support.annotation.RestrictTo;
import android.support.annotation.RestrictTo.Scope;
import android.support.transition.Transition.C0321b;
import android.support.transition.Transition.TransitionListener;
import android.support.v4.app.C0419q;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;

@RestrictTo({Scope.LIBRARY_GROUP})
public class FragmentTransitionSupport extends C0419q {
    /* renamed from: a */
    public boolean mo322a(Object obj) {
        return obj instanceof Transition;
    }

    /* renamed from: b */
    public Object mo323b(Object obj) {
        return obj != null ? ((Transition) obj).mo372m() : null;
    }

    /* renamed from: c */
    public Object mo328c(Object obj) {
        if (obj == null) {
            return null;
        }
        C2811x c2811x = new C2811x();
        c2811x.m10956b((Transition) obj);
        return c2811x;
    }

    /* renamed from: a */
    public void mo318a(Object obj, View view, ArrayList<View> arrayList) {
        obj = (C2811x) obj;
        List g = obj.m1219g();
        g.clear();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C0419q.m1540a(g, (View) arrayList.get(i));
        }
        g.add(view);
        arrayList.add(view);
        mo320a(obj, (ArrayList) arrayList);
    }

    /* renamed from: a */
    public void mo317a(Object obj, View view) {
        if (view != null) {
            Transition transition = (Transition) obj;
            final Rect rect = new Rect();
            m1545a(view, rect);
            transition.mo361a(new C0321b(this) {
                /* renamed from: b */
                final /* synthetic */ FragmentTransitionSupport f8847b;
            });
        }
    }

    /* renamed from: a */
    public void mo320a(Object obj, ArrayList<View> arrayList) {
        Transition transition = (Transition) obj;
        if (transition != null) {
            int i = 0;
            int o;
            if (transition instanceof C2811x) {
                C2811x c2811x = (C2811x) transition;
                o = c2811x.mo373o();
                while (i < o) {
                    mo320a(c2811x.m10952b(i), (ArrayList) arrayList);
                    i++;
                }
            } else if (!m10870a(transition) && C0419q.m1541a(transition.m1219g())) {
                o = arrayList.size();
                while (i < o) {
                    transition.mo365b((View) arrayList.get(i));
                    i++;
                }
            }
        }
    }

    /* renamed from: a */
    private static boolean m10870a(Transition transition) {
        if (C0419q.m1541a(transition.m1218f()) && C0419q.m1541a(transition.m1220h())) {
            if (C0419q.m1541a((List) transition.m1221i()) != null) {
                return null;
            }
        }
        return true;
    }

    /* renamed from: a */
    public Object mo314a(Object obj, Object obj2, Object obj3) {
        C2811x c2811x = new C2811x();
        if (obj != null) {
            c2811x.m10956b((Transition) obj);
        }
        if (obj2 != null) {
            c2811x.m10956b((Transition) obj2);
        }
        if (obj3 != null) {
            c2811x.m10956b((Transition) obj3);
        }
        return c2811x;
    }

    /* renamed from: b */
    public void mo326b(Object obj, final View view, final ArrayList<View> arrayList) {
        ((Transition) obj).mo359a(new TransitionListener(this) {
            /* renamed from: c */
            final /* synthetic */ FragmentTransitionSupport f8850c;

            public void onTransitionCancel(@NonNull Transition transition) {
            }

            public void onTransitionPause(@NonNull Transition transition) {
            }

            public void onTransitionResume(@NonNull Transition transition) {
            }

            public void onTransitionStart(@NonNull Transition transition) {
            }

            public void onTransitionEnd(@NonNull Transition transition) {
                transition.mo364b((TransitionListener) this);
                view.setVisibility(8);
                transition = arrayList.size();
                for (int i = 0; i < transition; i++) {
                    ((View) arrayList.get(i)).setVisibility(0);
                }
            }
        });
    }

    /* renamed from: b */
    public Object mo324b(Object obj, Object obj2, Object obj3) {
        Transition transition = (Transition) obj;
        Transition transition2 = (Transition) obj2;
        Transition transition3 = (Transition) obj3;
        if (transition != null && transition2 != null) {
            transition = new C2811x().m10956b(transition).m10956b(transition2).m10947a(1);
        } else if (transition == null) {
            transition = transition2 != null ? transition2 : null;
        }
        if (transition3 == null) {
            return transition;
        }
        obj2 = new C2811x();
        if (transition != null) {
            obj2.m10956b(transition);
        }
        obj2.m10956b(transition3);
        return obj2;
    }

    /* renamed from: a */
    public void mo315a(ViewGroup viewGroup, Object obj) {
        C0355v.m1298a(viewGroup, (Transition) obj);
    }

    /* renamed from: a */
    public void mo319a(Object obj, Object obj2, ArrayList<View> arrayList, Object obj3, ArrayList<View> arrayList2, Object obj4, ArrayList<View> arrayList3) {
        final Object obj5 = obj2;
        final ArrayList<View> arrayList4 = arrayList;
        final Object obj6 = obj3;
        final ArrayList<View> arrayList5 = arrayList2;
        final Object obj7 = obj4;
        final ArrayList<View> arrayList6 = arrayList3;
        ((Transition) obj).mo359a(new TransitionListener(this) {
            /* renamed from: g */
            final /* synthetic */ FragmentTransitionSupport f8857g;

            public void onTransitionCancel(@NonNull Transition transition) {
            }

            public void onTransitionEnd(@NonNull Transition transition) {
            }

            public void onTransitionPause(@NonNull Transition transition) {
            }

            public void onTransitionResume(@NonNull Transition transition) {
            }

            public void onTransitionStart(@NonNull Transition transition) {
                if (obj5 != null) {
                    this.f8857g.mo327b(obj5, arrayList4, null);
                }
                if (obj6 != null) {
                    this.f8857g.mo327b(obj6, arrayList5, null);
                }
                if (obj7 != null) {
                    this.f8857g.mo327b(obj7, arrayList6, null);
                }
            }
        });
    }

    /* renamed from: a */
    public void mo321a(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        obj = (C2811x) obj;
        if (obj != null) {
            obj.m1219g().clear();
            obj.m1219g().addAll(arrayList2);
            mo327b(obj, (ArrayList) arrayList, (ArrayList) arrayList2);
        }
    }

    /* renamed from: b */
    public void mo327b(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        Transition transition = (Transition) obj;
        int i = 0;
        int o;
        if (transition instanceof C2811x) {
            C2811x c2811x = (C2811x) transition;
            o = c2811x.mo373o();
            while (i < o) {
                mo327b(c2811x.m10952b(i), (ArrayList) arrayList, (ArrayList) arrayList2);
                i++;
            }
        } else if (!m10870a(transition)) {
            List g = transition.m1219g();
            if (g.size() == arrayList.size() && g.containsAll(arrayList)) {
                if (arrayList2 == null) {
                    o = 0;
                } else {
                    o = arrayList2.size();
                }
                while (i < o) {
                    transition.mo365b((View) arrayList2.get(i));
                    i++;
                }
                for (arrayList2 = arrayList.size() - 1; arrayList2 >= null; arrayList2--) {
                    transition.mo366c((View) arrayList.get(arrayList2));
                }
            }
        }
    }

    /* renamed from: b */
    public void mo325b(Object obj, View view) {
        if (obj != null) {
            ((Transition) obj).mo365b(view);
        }
    }

    /* renamed from: c */
    public void mo329c(Object obj, View view) {
        if (obj != null) {
            ((Transition) obj).mo366c(view);
        }
    }

    /* renamed from: a */
    public void mo316a(Object obj, final Rect rect) {
        if (obj != null) {
            ((Transition) obj).mo361a(new C0321b(this) {
                /* renamed from: b */
                final /* synthetic */ FragmentTransitionSupport f8859b;
            });
        }
    }
}
