package android.support.transition;

import android.support.annotation.NonNull;
import android.support.annotation.RestrictTo;
import android.support.annotation.RestrictTo.Scope;
import android.support.transition.Transition.C0321b;
import android.support.transition.Transition.TransitionListener;
import android.util.AndroidRuntimeException;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: android.support.transition.x */
public class C2811x extends Transition {
    /* renamed from: g */
    private ArrayList<Transition> f8888g = new ArrayList();
    /* renamed from: h */
    private boolean f8889h = true;
    /* renamed from: i */
    private int f8890i;
    /* renamed from: j */
    private boolean f8891j = false;

    /* renamed from: android.support.transition.x$a */
    static class C4012a extends C2810u {
        /* renamed from: a */
        C2811x f12764a;

        C4012a(C2811x c2811x) {
            this.f12764a = c2811x;
        }

        public void onTransitionStart(@NonNull Transition transition) {
            if (this.f12764a.f8891j == null) {
                this.f12764a.m1222j();
                this.f12764a.f8891j = true;
            }
        }

        public void onTransitionEnd(@NonNull Transition transition) {
            C2811x.m10942b(this.f12764a);
            if (this.f12764a.f8890i == 0) {
                this.f12764a.f8891j = false;
                this.f12764a.m1223k();
            }
            transition.mo364b((TransitionListener) this);
        }
    }

    /* renamed from: b */
    static /* synthetic */ int m10942b(C2811x c2811x) {
        int i = c2811x.f8890i - 1;
        c2811x.f8890i = i;
        return i;
    }

    @NonNull
    /* renamed from: a */
    public /* synthetic */ Transition mo358a(long j) {
        return m10959c(j);
    }

    @NonNull
    /* renamed from: a */
    public /* synthetic */ Transition mo359a(@NonNull TransitionListener transitionListener) {
        return m10960c(transitionListener);
    }

    @NonNull
    /* renamed from: b */
    public /* synthetic */ Transition mo363b(long j) {
        return m10962d(j);
    }

    @NonNull
    /* renamed from: b */
    public /* synthetic */ Transition mo364b(@NonNull TransitionListener transitionListener) {
        return m10963d(transitionListener);
    }

    @NonNull
    /* renamed from: b */
    public /* synthetic */ Transition mo365b(@NonNull View view) {
        return m10967f(view);
    }

    @NonNull
    /* renamed from: c */
    public /* synthetic */ Transition mo366c(@NonNull View view) {
        return m10968g(view);
    }

    public /* synthetic */ Object clone() throws CloneNotSupportedException {
        return mo372m();
    }

    @NonNull
    /* renamed from: a */
    public C2811x m10947a(int i) {
        switch (i) {
            case 0:
                this.f8889h = true;
                break;
            case 1:
                this.f8889h = false;
                break;
            default:
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Invalid parameter for TransitionSet ordering: ");
                stringBuilder.append(i);
                throw new AndroidRuntimeException(stringBuilder.toString());
        }
        return this;
    }

    @NonNull
    /* renamed from: b */
    public C2811x m10956b(@NonNull Transition transition) {
        this.f8888g.add(transition);
        transition.f1100d = this;
        if (this.a >= 0) {
            transition.mo358a(this.a);
        }
        return this;
    }

    /* renamed from: o */
    public int mo373o() {
        return this.f8888g.size();
    }

    /* renamed from: b */
    public Transition m10952b(int i) {
        if (i >= 0) {
            if (i < this.f8888g.size()) {
                return (Transition) this.f8888g.get(i);
            }
        }
        return 0;
    }

    @NonNull
    /* renamed from: c */
    public C2811x m10959c(long j) {
        super.mo358a(j);
        if (this.a >= 0) {
            int size = this.f8888g.size();
            for (int i = 0; i < size; i++) {
                ((Transition) this.f8888g.get(i)).mo358a(j);
            }
        }
        return this;
    }

    @NonNull
    /* renamed from: d */
    public C2811x m10962d(long j) {
        return (C2811x) super.mo363b(j);
    }

    @NonNull
    /* renamed from: f */
    public C2811x m10967f(@NonNull View view) {
        for (int i = 0; i < this.f8888g.size(); i++) {
            ((Transition) this.f8888g.get(i)).mo365b(view);
        }
        return (C2811x) super.mo365b(view);
    }

    @NonNull
    /* renamed from: c */
    public C2811x m10960c(@NonNull TransitionListener transitionListener) {
        return (C2811x) super.mo359a(transitionListener);
    }

    @NonNull
    /* renamed from: g */
    public C2811x m10968g(@NonNull View view) {
        for (int i = 0; i < this.f8888g.size(); i++) {
            ((Transition) this.f8888g.get(i)).mo366c(view);
        }
        return (C2811x) super.mo366c(view);
    }

    @NonNull
    /* renamed from: d */
    public C2811x m10963d(@NonNull TransitionListener transitionListener) {
        return (C2811x) super.mo364b(transitionListener);
    }

    /* renamed from: p */
    private void m10944p() {
        TransitionListener c4012a = new C4012a(this);
        Iterator it = this.f8888g.iterator();
        while (it.hasNext()) {
            ((Transition) it.next()).mo359a(c4012a);
        }
        this.f8890i = this.f8888g.size();
    }

    @RestrictTo({Scope.LIBRARY_GROUP})
    /* renamed from: a */
    protected void mo362a(ViewGroup viewGroup, aa aaVar, aa aaVar2, ArrayList<C0358z> arrayList, ArrayList<C0358z> arrayList2) {
        long c = m1211c();
        int size = this.f8888g.size();
        int i = 0;
        while (i < size) {
            Transition transition = (Transition) r0.f8888g.get(i);
            if (c > 0 && (r0.f8889h || i == 0)) {
                long c2 = transition.m1211c();
                if (c2 > 0) {
                    transition.mo363b(c + c2);
                } else {
                    transition.mo363b(c);
                }
            }
            transition.mo362a(viewGroup, aaVar, aaVar2, arrayList, arrayList2);
            i++;
        }
    }

    @RestrictTo({Scope.LIBRARY_GROUP})
    /* renamed from: e */
    protected void mo370e() {
        if (this.f8888g.isEmpty()) {
            m1222j();
            m1223k();
            return;
        }
        m10944p();
        if (this.f8889h) {
            Iterator it = this.f8888g.iterator();
            while (it.hasNext()) {
                ((Transition) it.next()).mo370e();
            }
        } else {
            for (int i = 1; i < this.f8888g.size(); i++) {
                final Transition transition = (Transition) this.f8888g.get(i);
                ((Transition) this.f8888g.get(i - 1)).mo359a(new C2810u(this) {
                    /* renamed from: b */
                    final /* synthetic */ C2811x f12763b;

                    public void onTransitionEnd(@NonNull Transition transition) {
                        transition.mo370e();
                        transition.mo364b((TransitionListener) this);
                    }
                });
            }
            Transition transition2 = (Transition) this.f8888g.get(0);
            if (transition2 != null) {
                transition2.mo370e();
            }
        }
    }

    /* renamed from: a */
    public void mo336a(@NonNull C0358z c0358z) {
        if (m1203a(c0358z.f1197b)) {
            Iterator it = this.f8888g.iterator();
            while (it.hasNext()) {
                Transition transition = (Transition) it.next();
                if (transition.m1203a(c0358z.f1197b)) {
                    transition.mo336a(c0358z);
                    c0358z.f1198c.add(transition);
                }
            }
        }
    }

    /* renamed from: b */
    public void mo339b(@NonNull C0358z c0358z) {
        if (m1203a(c0358z.f1197b)) {
            Iterator it = this.f8888g.iterator();
            while (it.hasNext()) {
                Transition transition = (Transition) it.next();
                if (transition.m1203a(c0358z.f1197b)) {
                    transition.mo339b(c0358z);
                    c0358z.f1198c.add(transition);
                }
            }
        }
    }

    /* renamed from: c */
    void mo367c(C0358z c0358z) {
        super.mo367c(c0358z);
        int size = this.f8888g.size();
        for (int i = 0; i < size; i++) {
            ((Transition) this.f8888g.get(i)).mo367c(c0358z);
        }
    }

    @RestrictTo({Scope.LIBRARY_GROUP})
    /* renamed from: d */
    public void mo369d(View view) {
        super.mo369d(view);
        int size = this.f8888g.size();
        for (int i = 0; i < size; i++) {
            ((Transition) this.f8888g.get(i)).mo369d(view);
        }
    }

    @RestrictTo({Scope.LIBRARY_GROUP})
    /* renamed from: e */
    public void mo371e(View view) {
        super.mo371e(view);
        int size = this.f8888g.size();
        for (int i = 0; i < size; i++) {
            ((Transition) this.f8888g.get(i)).mo371e(view);
        }
    }

    /* renamed from: a */
    public void mo361a(C0321b c0321b) {
        super.mo361a(c0321b);
        int size = this.f8888g.size();
        for (int i = 0; i < size; i++) {
            ((Transition) this.f8888g.get(i)).mo361a(c0321b);
        }
    }

    /* renamed from: a */
    String mo360a(String str) {
        String a = super.mo360a(str);
        for (int i = 0; i < this.f8888g.size(); i++) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(a);
            stringBuilder.append("\n");
            Transition transition = (Transition) this.f8888g.get(i);
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append(str);
            stringBuilder2.append("  ");
            stringBuilder.append(transition.mo360a(stringBuilder2.toString()));
            a = stringBuilder.toString();
        }
        return a;
    }

    /* renamed from: m */
    public Transition mo372m() {
        C2811x c2811x = (C2811x) super.mo372m();
        c2811x.f8888g = new ArrayList();
        int size = this.f8888g.size();
        for (int i = 0; i < size; i++) {
            c2811x.m10956b(((Transition) this.f8888g.get(i)).mo372m());
        }
        return c2811x;
    }
}
