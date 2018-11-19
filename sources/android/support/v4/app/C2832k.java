package android.support.v4.app;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.arch.lifecycle.C0031p;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcelable;
import android.support.annotation.CallSuper;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment.C0369b;
import android.support.v4.app.Fragment.SavedState;
import android.support.v4.app.FragmentManager.C0372a;
import android.support.v4.app.FragmentManager.OnBackStackChangedListener;
import android.support.v4.util.C0546b;
import android.support.v4.util.C0548d;
import android.support.v4.util.C0549e;
import android.support.v4.util.C0559j;
import android.support.v4.view.ViewCompat;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater.Factory2;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.AnimationSet;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.ScaleAnimation;
import android.view.animation.Transformation;
import com.tinder.domain.config.model.ProfileEditingConfig;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: android.support.v4.app.k */
final class C2832k extends FragmentManager implements Factory2 {
    /* renamed from: F */
    static final Interpolator f8970F = new DecelerateInterpolator(2.5f);
    /* renamed from: G */
    static final Interpolator f8971G = new DecelerateInterpolator(1.5f);
    /* renamed from: H */
    static final Interpolator f8972H = new AccelerateInterpolator(2.5f);
    /* renamed from: I */
    static final Interpolator f8973I = new AccelerateInterpolator(1.5f);
    /* renamed from: a */
    static boolean f8974a = false;
    /* renamed from: q */
    static Field f8975q;
    /* renamed from: A */
    Bundle f8976A = null;
    /* renamed from: B */
    SparseArray<Parcelable> f8977B = null;
    /* renamed from: C */
    ArrayList<C2831i> f8978C;
    /* renamed from: D */
    C0404l f8979D;
    /* renamed from: E */
    Runnable f8980E = new C03931(this);
    /* renamed from: J */
    private final CopyOnWriteArrayList<C0559j<C0372a, Boolean>> f8981J = new CopyOnWriteArrayList();
    /* renamed from: b */
    ArrayList<C0403g> f8982b;
    /* renamed from: c */
    boolean f8983c;
    /* renamed from: d */
    int f8984d = 0;
    /* renamed from: e */
    final ArrayList<Fragment> f8985e = new ArrayList();
    /* renamed from: f */
    SparseArray<Fragment> f8986f;
    /* renamed from: g */
    ArrayList<C2826c> f8987g;
    /* renamed from: h */
    ArrayList<Fragment> f8988h;
    /* renamed from: i */
    ArrayList<C2826c> f8989i;
    /* renamed from: j */
    ArrayList<Integer> f8990j;
    /* renamed from: k */
    ArrayList<OnBackStackChangedListener> f8991k;
    /* renamed from: l */
    int f8992l = 0;
    /* renamed from: m */
    C2827j f8993m;
    /* renamed from: n */
    C0391h f8994n;
    /* renamed from: o */
    Fragment f8995o;
    /* renamed from: p */
    Fragment f8996p;
    /* renamed from: r */
    boolean f8997r;
    /* renamed from: s */
    boolean f8998s;
    /* renamed from: t */
    boolean f8999t;
    /* renamed from: u */
    boolean f9000u;
    /* renamed from: v */
    String f9001v;
    /* renamed from: w */
    boolean f9002w;
    /* renamed from: x */
    ArrayList<C2826c> f9003x;
    /* renamed from: y */
    ArrayList<Boolean> f9004y;
    /* renamed from: z */
    ArrayList<Fragment> f9005z;

    /* renamed from: android.support.v4.app.k$1 */
    class C03931 implements Runnable {
        /* renamed from: a */
        final /* synthetic */ C2832k f1327a;

        C03931(C2832k c2832k) {
            this.f1327a = c2832k;
        }

        public void run() {
            this.f1327a.m11178i();
        }
    }

    /* renamed from: android.support.v4.app.k$b */
    private static class C0398b implements AnimationListener {
        /* renamed from: a */
        private final AnimationListener f1338a;

        private C0398b(AnimationListener animationListener) {
            this.f1338a = animationListener;
        }

        @CallSuper
        public void onAnimationStart(Animation animation) {
            if (this.f1338a != null) {
                this.f1338a.onAnimationStart(animation);
            }
        }

        @CallSuper
        public void onAnimationEnd(Animation animation) {
            if (this.f1338a != null) {
                this.f1338a.onAnimationEnd(animation);
            }
        }

        @CallSuper
        public void onAnimationRepeat(Animation animation) {
            if (this.f1338a != null) {
                this.f1338a.onAnimationRepeat(animation);
            }
        }
    }

    /* renamed from: android.support.v4.app.k$c */
    private static class C0399c {
        /* renamed from: a */
        public final Animation f1339a;
        /* renamed from: b */
        public final Animator f1340b;

        private C0399c(Animation animation) {
            this.f1339a = animation;
            this.f1340b = null;
            if (animation == null) {
                throw new IllegalStateException("Animation cannot be null");
            }
        }

        private C0399c(Animator animator) {
            this.f1339a = null;
            this.f1340b = animator;
            if (animator == null) {
                throw new IllegalStateException("Animator cannot be null");
            }
        }
    }

    /* renamed from: android.support.v4.app.k$d */
    private static class C0400d extends AnimatorListenerAdapter {
        /* renamed from: a */
        View f1341a;

        C0400d(View view) {
            this.f1341a = view;
        }

        public void onAnimationStart(Animator animator) {
            this.f1341a.setLayerType(2, null);
        }

        public void onAnimationEnd(Animator animator) {
            this.f1341a.setLayerType(0, null);
            animator.removeListener(this);
        }
    }

    /* renamed from: android.support.v4.app.k$e */
    private static class C0401e extends AnimationSet implements Runnable {
        /* renamed from: a */
        private final ViewGroup f1342a;
        /* renamed from: b */
        private final View f1343b;
        /* renamed from: c */
        private boolean f1344c;
        /* renamed from: d */
        private boolean f1345d;

        C0401e(@NonNull Animation animation, @NonNull ViewGroup viewGroup, @NonNull View view) {
            super(false);
            this.f1342a = viewGroup;
            this.f1343b = view;
            addAnimation(animation);
        }

        public boolean getTransformation(long j, Transformation transformation) {
            if (this.f1344c) {
                return this.f1345d ^ 1;
            }
            if (super.getTransformation(j, transformation) == null) {
                this.f1344c = true;
                C0423v.m1579a(this.f1342a, this);
            }
            return true;
        }

        public boolean getTransformation(long j, Transformation transformation, float f) {
            if (this.f1344c) {
                return this.f1345d ^ 1;
            }
            if (super.getTransformation(j, transformation, f) == null) {
                this.f1344c = true;
                C0423v.m1579a(this.f1342a, this);
            }
            return true;
        }

        public void run() {
            this.f1342a.endViewTransition(this.f1343b);
            this.f1345d = true;
        }
    }

    /* renamed from: android.support.v4.app.k$f */
    static class C0402f {
        /* renamed from: a */
        public static final int[] f1346a = new int[]{16842755, 16842960, 16842961};
    }

    /* renamed from: android.support.v4.app.k$g */
    interface C0403g {
        /* renamed from: a */
        boolean mo407a(ArrayList<C2826c> arrayList, ArrayList<Boolean> arrayList2);
    }

    /* renamed from: android.support.v4.app.k$a */
    private static class C2829a extends C0398b {
        /* renamed from: a */
        View f8962a;

        /* renamed from: android.support.v4.app.k$a$1 */
        class C03971 implements Runnable {
            /* renamed from: a */
            final /* synthetic */ C2829a f1337a;

            C03971(C2829a c2829a) {
                this.f1337a = c2829a;
            }

            public void run() {
                this.f1337a.f8962a.setLayerType(0, null);
            }
        }

        C2829a(View view, AnimationListener animationListener) {
            super(animationListener);
            this.f8962a = view;
        }

        @CallSuper
        public void onAnimationEnd(Animation animation) {
            if (!ViewCompat.m2171C(this.f8962a)) {
                if (VERSION.SDK_INT < 24) {
                    this.f8962a.setLayerType(0, null);
                    super.onAnimationEnd(animation);
                }
            }
            this.f8962a.post(new C03971(this));
            super.onAnimationEnd(animation);
        }
    }

    /* renamed from: android.support.v4.app.k$h */
    private class C2830h implements C0403g {
        /* renamed from: a */
        final String f8963a;
        /* renamed from: b */
        final int f8964b;
        /* renamed from: c */
        final int f8965c;
        /* renamed from: d */
        final /* synthetic */ C2832k f8966d;

        C2830h(C2832k c2832k, String str, int i, int i2) {
            this.f8966d = c2832k;
            this.f8963a = str;
            this.f8964b = i;
            this.f8965c = i2;
        }

        /* renamed from: a */
        public boolean mo407a(ArrayList<C2826c> arrayList, ArrayList<Boolean> arrayList2) {
            if (this.f8966d.f8996p != null && this.f8964b < 0 && this.f8963a == null) {
                FragmentManager peekChildFragmentManager = this.f8966d.f8996p.peekChildFragmentManager();
                if (peekChildFragmentManager != null && peekChildFragmentManager.mo437c()) {
                    return null;
                }
            }
            return this.f8966d.m11143a((ArrayList) arrayList, (ArrayList) arrayList2, this.f8963a, this.f8964b, this.f8965c);
        }
    }

    /* renamed from: android.support.v4.app.k$i */
    static class C2831i implements C0369b {
        /* renamed from: a */
        private final boolean f8967a;
        /* renamed from: b */
        private final C2826c f8968b;
        /* renamed from: c */
        private int f8969c;

        C2831i(C2826c c2826c, boolean z) {
            this.f8967a = z;
            this.f8968b = c2826c;
        }

        /* renamed from: a */
        public void mo423a() {
            this.f8969c--;
            if (this.f8969c == 0) {
                this.f8968b.f8933a.m11082C();
            }
        }

        /* renamed from: b */
        public void mo424b() {
            this.f8969c++;
        }

        /* renamed from: c */
        public boolean m11078c() {
            return this.f8969c == 0;
        }

        /* renamed from: d */
        public void m11079d() {
            int i = this.f8969c > 0 ? 1 : 0;
            C2832k c2832k = this.f8968b.f8933a;
            int size = c2832k.f8985e.size();
            for (int i2 = 0; i2 < size; i2++) {
                Fragment fragment = (Fragment) c2832k.f8985e.get(i2);
                fragment.setOnStartEnterTransitionListener(null);
                if (i != 0 && fragment.isPostponed()) {
                    fragment.startPostponedEnterTransition();
                }
            }
            this.f8968b.f8933a.m11092a(this.f8968b, this.f8967a, i ^ true, true);
        }

        /* renamed from: e */
        public void m11080e() {
            this.f8968b.f8933a.m11092a(this.f8968b, this.f8967a, false, false);
        }
    }

    /* renamed from: b */
    public static int m11104b(int i, boolean z) {
        return i != 4097 ? i != 4099 ? i != 8194 ? -1 : z ? 3 : 4 : z ? 5 : 6 : z ? 1 : 2;
    }

    /* renamed from: d */
    public static int m11111d(int i) {
        return i != 4097 ? i != 4099 ? i != 8194 ? 0 : 4097 : 4099 : 8194;
    }

    /* renamed from: A */
    Factory2 m11114A() {
        return this;
    }

    C2832k() {
    }

    /* renamed from: a */
    static boolean m11101a(C0399c c0399c) {
        if (c0399c.f1339a instanceof AlphaAnimation) {
            return true;
        }
        if (!(c0399c.f1339a instanceof AnimationSet)) {
            return C2832k.m11100a(c0399c.f1340b);
        }
        c0399c = ((AnimationSet) c0399c.f1339a).getAnimations();
        for (int i = 0; i < c0399c.size(); i++) {
            if (c0399c.get(i) instanceof AlphaAnimation) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    static boolean m11100a(Animator animator) {
        if (animator == null) {
            return false;
        }
        int i;
        if (animator instanceof ValueAnimator) {
            animator = ((ValueAnimator) animator).getValues();
            for (PropertyValuesHolder propertyName : animator) {
                if ("alpha".equals(propertyName.getPropertyName())) {
                    return true;
                }
            }
        } else if (animator instanceof AnimatorSet) {
            animator = ((AnimatorSet) animator).getChildAnimations();
            for (i = 0; i < animator.size(); i++) {
                if (C2832k.m11100a((Animator) animator.get(i))) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: a */
    static boolean m11102a(View view, C0399c c0399c) {
        boolean z = false;
        if (view != null) {
            if (c0399c != null) {
                if (VERSION.SDK_INT >= 19 && view.getLayerType() == 0 && ViewCompat.m2228t(view) != null && C2832k.m11101a(c0399c) != null) {
                    z = true;
                }
                return z;
            }
        }
        return false;
    }

    /* renamed from: a */
    private void m11097a(RuntimeException runtimeException) {
        Log.e("FragmentManager", runtimeException.getMessage());
        Log.e("FragmentManager", "Activity state:");
        PrintWriter printWriter = new PrintWriter(new C0549e("FragmentManager"));
        if (this.f8993m != null) {
            try {
                this.f8993m.mo3022a("  ", null, printWriter, new String[0]);
            } catch (Throwable e) {
                Log.e("FragmentManager", "Failed dumping state", e);
            }
        } else {
            try {
                mo435a("  ", null, printWriter, new String[0]);
            } catch (Throwable e2) {
                Log.e("FragmentManager", "Failed dumping state", e2);
            }
        }
        throw runtimeException;
    }

    /* renamed from: a */
    public C0405n mo429a() {
        return new C2826c(this);
    }

    /* renamed from: b */
    public boolean mo436b() {
        boolean i = m11178i();
        m11084E();
        return i;
    }

    /* renamed from: c */
    public boolean mo437c() {
        m11081B();
        return m11103a(null, -1, 0);
    }

    /* renamed from: a */
    public void mo434a(String str, int i) {
        m11136a(new C2830h(this, str, -1, i), (boolean) null);
    }

    /* renamed from: a */
    public void mo430a(int i, int i2) {
        if (i < 0) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Bad id: ");
            stringBuilder.append(i);
            throw new IllegalArgumentException(stringBuilder.toString());
        }
        m11136a(new C2830h(this, null, i, i2), (boolean) 0);
    }

    /* renamed from: a */
    private boolean m11103a(String str, int i, int i2) {
        m11178i();
        m11109c(true);
        if (this.f8996p != null && i < 0 && str == null) {
            FragmentManager peekChildFragmentManager = this.f8996p.peekChildFragmentManager();
            if (peekChildFragmentManager != null && peekChildFragmentManager.mo437c()) {
                return true;
            }
        }
        str = m11143a(this.f9003x, this.f9004y, str, i, i2);
        if (str != null) {
            this.f8983c = true;
            try {
                m11107b(this.f9003x, this.f9004y);
            } finally {
                m11083D();
            }
        }
        m11179j();
        m11086G();
        return str;
    }

    /* renamed from: d */
    public int mo438d() {
        return this.f8987g != null ? this.f8987g.size() : 0;
    }

    /* renamed from: a */
    public void mo431a(Bundle bundle, String str, Fragment fragment) {
        if (fragment.mIndex < 0) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Fragment ");
            stringBuilder.append(fragment);
            stringBuilder.append(" is not currently in the FragmentManager");
            m11097a(new IllegalStateException(stringBuilder.toString()));
        }
        bundle.putInt(str, fragment.mIndex);
    }

    /* renamed from: a */
    public Fragment mo427a(Bundle bundle, String str) {
        bundle = bundle.getInt(str, -1);
        if (bundle == -1) {
            return null;
        }
        Fragment fragment = (Fragment) this.f8986f.get(bundle);
        if (fragment == null) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Fragment no longer exists for key ");
            stringBuilder.append(str);
            stringBuilder.append(": index ");
            stringBuilder.append(bundle);
            m11097a(new IllegalStateException(stringBuilder.toString()));
        }
        return fragment;
    }

    /* renamed from: e */
    public List<Fragment> mo439e() {
        if (this.f8985e.isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        List<Fragment> list;
        synchronized (this.f8985e) {
            list = (List) this.f8985e.clone();
        }
        return list;
    }

    /* renamed from: a */
    public SavedState mo425a(Fragment fragment) {
        if (fragment.mIndex < 0) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Fragment ");
            stringBuilder.append(fragment);
            stringBuilder.append(" is not currently in the FragmentManager");
            m11097a(new IllegalStateException(stringBuilder.toString()));
        }
        SavedState savedState = null;
        if (fragment.mState <= 0) {
            return null;
        }
        fragment = m11189o(fragment);
        if (fragment != null) {
            savedState = new SavedState(fragment);
        }
        return savedState;
    }

    /* renamed from: f */
    public boolean mo440f() {
        return this.f9000u;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder(ProfileEditingConfig.DEFAULT_MAX_LENGTH);
        stringBuilder.append("FragmentManager{");
        stringBuilder.append(Integer.toHexString(System.identityHashCode(this)));
        stringBuilder.append(" in ");
        if (this.f8995o != null) {
            C0548d.m2021a(this.f8995o, stringBuilder);
        } else {
            C0548d.m2021a(this.f8993m, stringBuilder);
        }
        stringBuilder.append("}}");
        return stringBuilder.toString();
    }

    /* renamed from: a */
    public void mo435a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        int i;
        Fragment fragment;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str);
        stringBuilder.append("    ");
        String stringBuilder2 = stringBuilder.toString();
        if (this.f8986f != null) {
            size = this.f8986f.size();
            if (size > 0) {
                printWriter.print(str);
                printWriter.print("Active Fragments in ");
                printWriter.print(Integer.toHexString(System.identityHashCode(this)));
                printWriter.println(":");
                for (i = 0; i < size; i++) {
                    fragment = (Fragment) this.f8986f.valueAt(i);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(i);
                    printWriter.print(": ");
                    printWriter.println(fragment);
                    if (fragment != null) {
                        fragment.dump(stringBuilder2, fileDescriptor, printWriter, strArr);
                    }
                }
            }
        }
        size = this.f8985e.size();
        if (size > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (i = 0; i < size; i++) {
                fragment = (Fragment) this.f8985e.get(i);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i);
                printWriter.print(": ");
                printWriter.println(fragment.toString());
            }
        }
        if (this.f8988h != null) {
            size = this.f8988h.size();
            if (size > 0) {
                printWriter.print(str);
                printWriter.println("Fragments Created Menus:");
                for (i = 0; i < size; i++) {
                    fragment = (Fragment) this.f8988h.get(i);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(i);
                    printWriter.print(": ");
                    printWriter.println(fragment.toString());
                }
            }
        }
        if (this.f8987g != null) {
            size = this.f8987g.size();
            if (size > 0) {
                printWriter.print(str);
                printWriter.println("Back Stack:");
                for (i = 0; i < size; i++) {
                    C2826c c2826c = (C2826c) this.f8987g.get(i);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(i);
                    printWriter.print(": ");
                    printWriter.println(c2826c.toString());
                    c2826c.m11036a(stringBuilder2, fileDescriptor, printWriter, strArr);
                }
            }
        }
        synchronized (this) {
            if (this.f8989i != null) {
                fileDescriptor = this.f8989i.size();
                if (fileDescriptor > null) {
                    printWriter.print(str);
                    printWriter.println("Back Stack Indices:");
                    for (strArr = null; strArr < fileDescriptor; strArr++) {
                        C2826c c2826c2 = (C2826c) this.f8989i.get(strArr);
                        printWriter.print(str);
                        printWriter.print("  #");
                        printWriter.print(strArr);
                        printWriter.print(": ");
                        printWriter.println(c2826c2);
                    }
                }
            }
            if (this.f8990j != null && this.f8990j.size() > null) {
                printWriter.print(str);
                printWriter.print("mAvailBackStackIndices: ");
                printWriter.println(Arrays.toString(this.f8990j.toArray()));
            }
        }
        if (this.f8982b != null) {
            fileDescriptor = this.f8982b.size();
            if (fileDescriptor > null) {
                printWriter.print(str);
                printWriter.println("Pending Actions:");
                for (int i2 = 0; i2 < fileDescriptor; i2++) {
                    C0403g c0403g = (C0403g) this.f8982b.get(i2);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(i2);
                    printWriter.print(": ");
                    printWriter.println(c0403g);
                }
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.f8993m);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.f8994n);
        if (this.f8995o != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.f8995o);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.f8992l);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.f8998s);
        printWriter.print(" mStopped=");
        printWriter.print(this.f8999t);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.f9000u);
        if (this.f8997r != null) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.f8997r);
        }
        if (this.f9001v != null) {
            printWriter.print(str);
            printWriter.print("  mNoTransactionsBecause=");
            printWriter.println(this.f9001v);
        }
    }

    /* renamed from: a */
    static C0399c m11089a(Context context, float f, float f2, float f3, float f4) {
        Animation animationSet = new AnimationSet(false);
        Animation scaleAnimation = new ScaleAnimation(f, f2, f, f2, 1, 0.5f, 1, 0.5f);
        scaleAnimation.setInterpolator(f8970F);
        scaleAnimation.setDuration(220);
        animationSet.addAnimation(scaleAnimation);
        Animation alphaAnimation = new AlphaAnimation(f3, f4);
        alphaAnimation.setInterpolator(f8971G);
        alphaAnimation.setDuration(220);
        animationSet.addAnimation(alphaAnimation);
        return new C0399c(animationSet);
    }

    /* renamed from: a */
    static C0399c m11088a(Context context, float f, float f2) {
        Animation alphaAnimation = new AlphaAnimation(f, f2);
        alphaAnimation.setInterpolator(f8971G);
        alphaAnimation.setDuration(3.08E-43f);
        return new C0399c(alphaAnimation);
    }

    /* renamed from: a */
    android.support.v4.app.C2832k.C0399c m11120a(android.support.v4.app.Fragment r6, int r7, boolean r8, int r9) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
        /*
        r5 = this;
        r0 = r6.getNextAnim();
        r1 = r6.onCreateAnimation(r7, r8, r0);
        r2 = 0;
        if (r1 == 0) goto L_0x0011;
    L_0x000b:
        r6 = new android.support.v4.app.k$c;
        r6.<init>(r1);
        return r6;
    L_0x0011:
        r6 = r6.onCreateAnimator(r7, r8, r0);
        if (r6 == 0) goto L_0x001d;
    L_0x0017:
        r7 = new android.support.v4.app.k$c;
        r7.<init>(r6);
        return r7;
    L_0x001d:
        if (r0 == 0) goto L_0x0076;
    L_0x001f:
        r6 = r5.f8993m;
        r6 = r6.m11070i();
        r6 = r6.getResources();
        r6 = r6.getResourceTypeName(r0);
        r1 = "anim";
        r6 = r1.equals(r6);
        r1 = 0;
        if (r6 == 0) goto L_0x004c;
    L_0x0036:
        r3 = r5.f8993m;	 Catch:{ NotFoundException -> 0x004a, RuntimeException -> 0x004c }
        r3 = r3.m11070i();	 Catch:{ NotFoundException -> 0x004a, RuntimeException -> 0x004c }
        r3 = android.view.animation.AnimationUtils.loadAnimation(r3, r0);	 Catch:{ NotFoundException -> 0x004a, RuntimeException -> 0x004c }
        if (r3 == 0) goto L_0x0048;	 Catch:{ NotFoundException -> 0x004a, RuntimeException -> 0x004c }
    L_0x0042:
        r4 = new android.support.v4.app.k$c;	 Catch:{ NotFoundException -> 0x004a, RuntimeException -> 0x004c }
        r4.<init>(r3);	 Catch:{ NotFoundException -> 0x004a, RuntimeException -> 0x004c }
        return r4;
    L_0x0048:
        r1 = 1;
        goto L_0x004c;
    L_0x004a:
        r6 = move-exception;
        throw r6;
    L_0x004c:
        if (r1 != 0) goto L_0x0076;
    L_0x004e:
        r1 = r5.f8993m;	 Catch:{ RuntimeException -> 0x0060 }
        r1 = r1.m11070i();	 Catch:{ RuntimeException -> 0x0060 }
        r1 = android.animation.AnimatorInflater.loadAnimator(r1, r0);	 Catch:{ RuntimeException -> 0x0060 }
        if (r1 == 0) goto L_0x0076;	 Catch:{ RuntimeException -> 0x0060 }
    L_0x005a:
        r3 = new android.support.v4.app.k$c;	 Catch:{ RuntimeException -> 0x0060 }
        r3.<init>(r1);	 Catch:{ RuntimeException -> 0x0060 }
        return r3;
    L_0x0060:
        r1 = move-exception;
        if (r6 == 0) goto L_0x0064;
    L_0x0063:
        throw r1;
    L_0x0064:
        r6 = r5.f8993m;
        r6 = r6.m11070i();
        r6 = android.view.animation.AnimationUtils.loadAnimation(r6, r0);
        if (r6 == 0) goto L_0x0076;
    L_0x0070:
        r7 = new android.support.v4.app.k$c;
        r7.<init>(r6);
        return r7;
    L_0x0076:
        if (r7 != 0) goto L_0x0079;
    L_0x0078:
        return r2;
    L_0x0079:
        r6 = android.support.v4.app.C2832k.m11104b(r7, r8);
        if (r6 >= 0) goto L_0x0080;
    L_0x007f:
        return r2;
    L_0x0080:
        r7 = 1064933786; // 0x3f79999a float:0.975 double:5.26147199E-315;
        r8 = 0;
        r0 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        switch(r6) {
            case 1: goto L_0x00d4;
            case 2: goto L_0x00c9;
            case 3: goto L_0x00be;
            case 4: goto L_0x00b0;
            case 5: goto L_0x00a5;
            case 6: goto L_0x009a;
            default: goto L_0x0089;
        };
    L_0x0089:
        if (r9 != 0) goto L_0x00e1;
    L_0x008b:
        r6 = r5.f8993m;
        r6 = r6.mo3028e();
        if (r6 == 0) goto L_0x00e1;
    L_0x0093:
        r6 = r5.f8993m;
        r9 = r6.mo3029f();
        goto L_0x00e1;
    L_0x009a:
        r6 = r5.f8993m;
        r6 = r6.m11070i();
        r6 = android.support.v4.app.C2832k.m11088a(r6, r0, r8);
        return r6;
    L_0x00a5:
        r6 = r5.f8993m;
        r6 = r6.m11070i();
        r6 = android.support.v4.app.C2832k.m11088a(r6, r8, r0);
        return r6;
    L_0x00b0:
        r6 = r5.f8993m;
        r6 = r6.m11070i();
        r7 = 1065982362; // 0x3f89999a float:1.075 double:5.26665264E-315;
        r6 = android.support.v4.app.C2832k.m11089a(r6, r0, r7, r0, r8);
        return r6;
    L_0x00be:
        r6 = r5.f8993m;
        r6 = r6.m11070i();
        r6 = android.support.v4.app.C2832k.m11089a(r6, r7, r0, r8, r0);
        return r6;
    L_0x00c9:
        r6 = r5.f8993m;
        r6 = r6.m11070i();
        r6 = android.support.v4.app.C2832k.m11089a(r6, r0, r7, r0, r8);
        return r6;
    L_0x00d4:
        r6 = r5.f8993m;
        r6 = r6.m11070i();
        r7 = 1066401792; // 0x3f900000 float:1.125 double:5.2687249E-315;
        r6 = android.support.v4.app.C2832k.m11089a(r6, r7, r0, r8, r0);
        return r6;
    L_0x00e1:
        if (r9 != 0) goto L_0x00e4;
    L_0x00e3:
        return r2;
    L_0x00e4:
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.app.k.a(android.support.v4.app.Fragment, int, boolean, int):android.support.v4.app.k$c");
    }

    /* renamed from: b */
    public void m11145b(Fragment fragment) {
        if (fragment.mDeferStart) {
            if (this.f8983c) {
                this.f9002w = true;
                return;
            }
            fragment.mDeferStart = false;
            m11128a(fragment, this.f8992l, 0, 0, false);
        }
    }

    /* renamed from: b */
    private static void m11106b(View view, C0399c c0399c) {
        if (view != null) {
            if (c0399c != null) {
                if (C2832k.m11102a(view, c0399c)) {
                    if (c0399c.f1340b != null) {
                        c0399c.f1340b.addListener(new C0400d(view));
                    } else {
                        AnimationListener a = C2832k.m11090a(c0399c.f1339a);
                        view.setLayerType(2, null);
                        c0399c.f1339a.setAnimationListener(new C2829a(view, a));
                    }
                }
            }
        }
    }

    /* renamed from: a */
    private static AnimationListener m11090a(Animation animation) {
        try {
            if (f8975q == null) {
                f8975q = Animation.class.getDeclaredField("mListener");
                f8975q.setAccessible(true);
            }
            return (AnimationListener) f8975q.get(animation);
        } catch (Animation animation2) {
            Log.e("FragmentManager", "No field with the name mListener is found in Animation class", animation2);
            return null;
        } catch (Animation animation22) {
            Log.e("FragmentManager", "Cannot access Animation's mListener field", animation22);
            return null;
        }
    }

    /* renamed from: b */
    boolean m11154b(int i) {
        return this.f8992l >= i;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    void m11128a(android.support.v4.app.Fragment r16, int r17, int r18, int r19, boolean r20) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
        /*
        r15 = this;
        r6 = r15;
        r7 = r16;
        r0 = r7.mAdded;
        r8 = 1;
        if (r0 == 0) goto L_0x0010;
    L_0x0008:
        r0 = r7.mDetached;
        if (r0 == 0) goto L_0x000d;
    L_0x000c:
        goto L_0x0010;
    L_0x000d:
        r0 = r17;
        goto L_0x0015;
    L_0x0010:
        r0 = r17;
        if (r0 <= r8) goto L_0x0015;
    L_0x0014:
        r0 = 1;
    L_0x0015:
        r1 = r7.mRemoving;
        if (r1 == 0) goto L_0x002b;
    L_0x0019:
        r1 = r7.mState;
        if (r0 <= r1) goto L_0x002b;
    L_0x001d:
        r0 = r7.mState;
        if (r0 != 0) goto L_0x0029;
    L_0x0021:
        r0 = r16.isInBackStack();
        if (r0 == 0) goto L_0x0029;
    L_0x0027:
        r0 = 1;
        goto L_0x002b;
    L_0x0029:
        r0 = r7.mState;
    L_0x002b:
        r1 = r7.mDeferStart;
        r9 = 4;
        r10 = 3;
        if (r1 == 0) goto L_0x0039;
    L_0x0031:
        r1 = r7.mState;
        if (r1 >= r9) goto L_0x0039;
    L_0x0035:
        if (r0 <= r10) goto L_0x0039;
    L_0x0037:
        r11 = 3;
        goto L_0x003a;
    L_0x0039:
        r11 = r0;
    L_0x003a:
        r0 = r7.mState;
        r12 = 2;
        r13 = 0;
        r14 = 0;
        if (r0 > r11) goto L_0x02f7;
    L_0x0041:
        r0 = r7.mFromLayout;
        if (r0 == 0) goto L_0x004a;
    L_0x0045:
        r0 = r7.mInLayout;
        if (r0 != 0) goto L_0x004a;
    L_0x0049:
        return;
    L_0x004a:
        r0 = r16.getAnimatingAway();
        if (r0 != 0) goto L_0x0056;
    L_0x0050:
        r0 = r16.getAnimator();
        if (r0 == 0) goto L_0x0068;
    L_0x0056:
        r7.setAnimatingAway(r13);
        r7.setAnimator(r13);
        r2 = r16.getStateAfterAnimating();
        r3 = 0;
        r4 = 0;
        r5 = 1;
        r0 = r6;
        r1 = r7;
        r0.m11128a(r1, r2, r3, r4, r5);
    L_0x0068:
        r0 = r7.mState;
        switch(r0) {
            case 0: goto L_0x006f;
            case 1: goto L_0x01ac;
            case 2: goto L_0x02a9;
            case 3: goto L_0x02ad;
            case 4: goto L_0x02cf;
            default: goto L_0x006d;
        };
    L_0x006d:
        goto L_0x045c;
    L_0x006f:
        if (r11 <= 0) goto L_0x01ac;
    L_0x0071:
        r0 = f8974a;
        if (r0 == 0) goto L_0x008b;
    L_0x0075:
        r0 = "FragmentManager";
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = "moveto CREATED: ";
        r1.append(r2);
        r1.append(r7);
        r1 = r1.toString();
        android.util.Log.v(r0, r1);
    L_0x008b:
        r0 = r7.mSavedFragmentState;
        if (r0 == 0) goto L_0x00e2;
    L_0x008f:
        r0 = r7.mSavedFragmentState;
        r1 = r6.f8993m;
        r1 = r1.m11070i();
        r1 = r1.getClassLoader();
        r0.setClassLoader(r1);
        r0 = r7.mSavedFragmentState;
        r1 = "android:view_state";
        r0 = r0.getSparseParcelableArray(r1);
        r7.mSavedViewState = r0;
        r0 = r7.mSavedFragmentState;
        r1 = "android:target_state";
        r0 = r6.mo427a(r0, r1);
        r7.mTarget = r0;
        r0 = r7.mTarget;
        if (r0 == 0) goto L_0x00c0;
    L_0x00b6:
        r0 = r7.mSavedFragmentState;
        r1 = "android:target_req_state";
        r0 = r0.getInt(r1, r14);
        r7.mTargetRequestCode = r0;
    L_0x00c0:
        r0 = r7.mSavedUserVisibleHint;
        if (r0 == 0) goto L_0x00cf;
    L_0x00c4:
        r0 = r7.mSavedUserVisibleHint;
        r0 = r0.booleanValue();
        r7.mUserVisibleHint = r0;
        r7.mSavedUserVisibleHint = r13;
        goto L_0x00d9;
    L_0x00cf:
        r0 = r7.mSavedFragmentState;
        r1 = "android:user_visible_hint";
        r0 = r0.getBoolean(r1, r8);
        r7.mUserVisibleHint = r0;
    L_0x00d9:
        r0 = r7.mUserVisibleHint;
        if (r0 != 0) goto L_0x00e2;
    L_0x00dd:
        r7.mDeferStart = r8;
        if (r11 <= r10) goto L_0x00e2;
    L_0x00e1:
        r11 = 3;
    L_0x00e2:
        r0 = r6.f8993m;
        r7.mHost = r0;
        r0 = r6.f8995o;
        r7.mParentFragment = r0;
        r0 = r6.f8995o;
        if (r0 == 0) goto L_0x00f3;
    L_0x00ee:
        r0 = r6.f8995o;
        r0 = r0.mChildFragmentManager;
        goto L_0x00f9;
    L_0x00f3:
        r0 = r6.f8993m;
        r0 = r0.m11072k();
    L_0x00f9:
        r7.mFragmentManager = r0;
        r0 = r7.mTarget;
        if (r0 == 0) goto L_0x0143;
    L_0x00ff:
        r0 = r6.f8986f;
        r1 = r7.mTarget;
        r1 = r1.mIndex;
        r0 = r0.get(r1);
        r1 = r7.mTarget;
        if (r0 == r1) goto L_0x0133;
    L_0x010d:
        r0 = new java.lang.IllegalStateException;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = "Fragment ";
        r1.append(r2);
        r1.append(r7);
        r2 = " declared target fragment ";
        r1.append(r2);
        r2 = r7.mTarget;
        r1.append(r2);
        r2 = " that does not belong to this FragmentManager!";
        r1.append(r2);
        r1 = r1.toString();
        r0.<init>(r1);
        throw r0;
    L_0x0133:
        r0 = r7.mTarget;
        r0 = r0.mState;
        if (r0 >= r8) goto L_0x0143;
    L_0x0139:
        r1 = r7.mTarget;
        r2 = 1;
        r3 = 0;
        r4 = 0;
        r5 = 1;
        r0 = r6;
        r0.m11128a(r1, r2, r3, r4, r5);
    L_0x0143:
        r0 = r6.f8993m;
        r0 = r0.m11070i();
        r6.m11129a(r7, r0, r14);
        r7.mCalled = r14;
        r0 = r6.f8993m;
        r0 = r0.m11070i();
        r7.onAttach(r0);
        r0 = r7.mCalled;
        if (r0 != 0) goto L_0x0177;
    L_0x015b:
        r0 = new android.support.v4.app.SuperNotCalledException;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = "Fragment ";
        r1.append(r2);
        r1.append(r7);
        r2 = " did not call through to super.onAttach()";
        r1.append(r2);
        r1 = r1.toString();
        r0.<init>(r1);
        throw r0;
    L_0x0177:
        r0 = r7.mParentFragment;
        if (r0 != 0) goto L_0x0181;
    L_0x017b:
        r0 = r6.f8993m;
        r0.mo3026b(r7);
        goto L_0x0186;
    L_0x0181:
        r0 = r7.mParentFragment;
        r0.onAttachFragment(r7);
    L_0x0186:
        r0 = r6.f8993m;
        r0 = r0.m11070i();
        r6.m11146b(r7, r0, r14);
        r0 = r7.mIsCreated;
        if (r0 != 0) goto L_0x01a3;
    L_0x0193:
        r0 = r7.mSavedFragmentState;
        r6.m11130a(r7, r0, r14);
        r0 = r7.mSavedFragmentState;
        r7.performCreate(r0);
        r0 = r7.mSavedFragmentState;
        r6.m11147b(r7, r0, r14);
        goto L_0x01aa;
    L_0x01a3:
        r0 = r7.mSavedFragmentState;
        r7.restoreChildFragmentState(r0);
        r7.mState = r8;
    L_0x01aa:
        r7.mRetaining = r14;
    L_0x01ac:
        r15.m11162d(r16);
        if (r11 <= r8) goto L_0x02a9;
    L_0x01b1:
        r0 = f8974a;
        if (r0 == 0) goto L_0x01cb;
    L_0x01b5:
        r0 = "FragmentManager";
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = "moveto ACTIVITY_CREATED: ";
        r1.append(r2);
        r1.append(r7);
        r1 = r1.toString();
        android.util.Log.v(r0, r1);
    L_0x01cb:
        r0 = r7.mFromLayout;
        if (r0 != 0) goto L_0x0294;
    L_0x01cf:
        r0 = r7.mContainerId;
        if (r0 == 0) goto L_0x0243;
    L_0x01d3:
        r0 = r7.mContainerId;
        r1 = -1;
        if (r0 != r1) goto L_0x01f6;
    L_0x01d8:
        r0 = new java.lang.IllegalArgumentException;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = "Cannot create fragment ";
        r1.append(r2);
        r1.append(r7);
        r2 = " for a container view with no id";
        r1.append(r2);
        r1 = r1.toString();
        r0.<init>(r1);
        r6.m11097a(r0);
    L_0x01f6:
        r0 = r6.f8994n;
        r1 = r7.mContainerId;
        r0 = r0.mo380a(r1);
        r0 = (android.view.ViewGroup) r0;
        if (r0 != 0) goto L_0x0244;
    L_0x0202:
        r1 = r7.mRestored;
        if (r1 != 0) goto L_0x0244;
    L_0x0206:
        r1 = r16.getResources();	 Catch:{ NotFoundException -> 0x0211 }
        r2 = r7.mContainerId;	 Catch:{ NotFoundException -> 0x0211 }
        r1 = r1.getResourceName(r2);	 Catch:{ NotFoundException -> 0x0211 }
        goto L_0x0213;
    L_0x0211:
        r1 = "unknown";
    L_0x0213:
        r2 = new java.lang.IllegalArgumentException;
        r3 = new java.lang.StringBuilder;
        r3.<init>();
        r4 = "No view found for id 0x";
        r3.append(r4);
        r4 = r7.mContainerId;
        r4 = java.lang.Integer.toHexString(r4);
        r3.append(r4);
        r4 = " (";
        r3.append(r4);
        r3.append(r1);
        r1 = ") for fragment ";
        r3.append(r1);
        r3.append(r7);
        r1 = r3.toString();
        r2.<init>(r1);
        r6.m11097a(r2);
        goto L_0x0244;
    L_0x0243:
        r0 = r13;
    L_0x0244:
        r7.mContainer = r0;
        r1 = r7.mSavedFragmentState;
        r1 = r7.performGetLayoutInflater(r1);
        r2 = r7.mSavedFragmentState;
        r1 = r7.performCreateView(r1, r0, r2);
        r7.mView = r1;
        r1 = r7.mView;
        if (r1 == 0) goto L_0x0292;
    L_0x0258:
        r1 = r7.mView;
        r7.mInnerView = r1;
        r1 = r7.mView;
        r1.setSaveFromParentEnabled(r14);
        if (r0 == 0) goto L_0x0268;
    L_0x0263:
        r1 = r7.mView;
        r0.addView(r1);
    L_0x0268:
        r0 = r7.mHidden;
        if (r0 == 0) goto L_0x0273;
    L_0x026c:
        r0 = r7.mView;
        r1 = 8;
        r0.setVisibility(r1);
    L_0x0273:
        r0 = r7.mView;
        r1 = r7.mSavedFragmentState;
        r7.onViewCreated(r0, r1);
        r0 = r7.mView;
        r1 = r7.mSavedFragmentState;
        r6.m11131a(r7, r0, r1, r14);
        r0 = r7.mView;
        r0 = r0.getVisibility();
        if (r0 != 0) goto L_0x028e;
    L_0x0289:
        r0 = r7.mContainer;
        if (r0 == 0) goto L_0x028e;
    L_0x028d:
        goto L_0x028f;
    L_0x028e:
        r8 = 0;
    L_0x028f:
        r7.mIsNewlyAdded = r8;
        goto L_0x0294;
    L_0x0292:
        r7.mInnerView = r13;
    L_0x0294:
        r0 = r7.mSavedFragmentState;
        r7.performActivityCreated(r0);
        r0 = r7.mSavedFragmentState;
        r6.m11158c(r7, r0, r14);
        r0 = r7.mView;
        if (r0 == 0) goto L_0x02a7;
    L_0x02a2:
        r0 = r7.mSavedFragmentState;
        r7.restoreViewState(r0);
    L_0x02a7:
        r7.mSavedFragmentState = r13;
    L_0x02a9:
        if (r11 <= r12) goto L_0x02ad;
    L_0x02ab:
        r7.mState = r10;
    L_0x02ad:
        if (r11 <= r10) goto L_0x02cf;
    L_0x02af:
        r0 = f8974a;
        if (r0 == 0) goto L_0x02c9;
    L_0x02b3:
        r0 = "FragmentManager";
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = "moveto STARTED: ";
        r1.append(r2);
        r1.append(r7);
        r1 = r1.toString();
        android.util.Log.v(r0, r1);
    L_0x02c9:
        r16.performStart();
        r6.m11148b(r7, r14);
    L_0x02cf:
        if (r11 <= r9) goto L_0x045c;
    L_0x02d1:
        r0 = f8974a;
        if (r0 == 0) goto L_0x02eb;
    L_0x02d5:
        r0 = "FragmentManager";
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = "moveto RESUMED: ";
        r1.append(r2);
        r1.append(r7);
        r1 = r1.toString();
        android.util.Log.v(r0, r1);
    L_0x02eb:
        r16.performResume();
        r6.m11159c(r7, r14);
        r7.mSavedFragmentState = r13;
        r7.mSavedViewState = r13;
        goto L_0x045c;
    L_0x02f7:
        r0 = r7.mState;
        if (r0 <= r11) goto L_0x045c;
    L_0x02fb:
        r0 = r7.mState;
        switch(r0) {
            case 1: goto L_0x03e6;
            case 2: goto L_0x0366;
            case 3: goto L_0x0347;
            case 4: goto L_0x0325;
            case 5: goto L_0x0302;
            default: goto L_0x0300;
        };
    L_0x0300:
        goto L_0x045c;
    L_0x0302:
        r0 = 5;
        if (r11 >= r0) goto L_0x0325;
    L_0x0305:
        r0 = f8974a;
        if (r0 == 0) goto L_0x031f;
    L_0x0309:
        r0 = "FragmentManager";
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = "movefrom RESUMED: ";
        r1.append(r2);
        r1.append(r7);
        r1 = r1.toString();
        android.util.Log.v(r0, r1);
    L_0x031f:
        r16.performPause();
        r6.m11164d(r7, r14);
    L_0x0325:
        if (r11 >= r9) goto L_0x0347;
    L_0x0327:
        r0 = f8974a;
        if (r0 == 0) goto L_0x0341;
    L_0x032b:
        r0 = "FragmentManager";
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = "movefrom STARTED: ";
        r1.append(r2);
        r1.append(r7);
        r1 = r1.toString();
        android.util.Log.v(r0, r1);
    L_0x0341:
        r16.performStop();
        r6.m11167e(r7, r14);
    L_0x0347:
        if (r11 >= r10) goto L_0x0366;
    L_0x0349:
        r0 = f8974a;
        if (r0 == 0) goto L_0x0363;
    L_0x034d:
        r0 = "FragmentManager";
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = "movefrom STOPPED: ";
        r1.append(r2);
        r1.append(r7);
        r1 = r1.toString();
        android.util.Log.v(r0, r1);
    L_0x0363:
        r16.performReallyStop();
    L_0x0366:
        if (r11 >= r12) goto L_0x03e6;
    L_0x0368:
        r0 = f8974a;
        if (r0 == 0) goto L_0x0382;
    L_0x036c:
        r0 = "FragmentManager";
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = "movefrom ACTIVITY_CREATED: ";
        r1.append(r2);
        r1.append(r7);
        r1 = r1.toString();
        android.util.Log.v(r0, r1);
    L_0x0382:
        r0 = r7.mView;
        if (r0 == 0) goto L_0x0395;
    L_0x0386:
        r0 = r6.f8993m;
        r0 = r0.mo3023a(r7);
        if (r0 == 0) goto L_0x0395;
    L_0x038e:
        r0 = r7.mSavedViewState;
        if (r0 != 0) goto L_0x0395;
    L_0x0392:
        r15.m11188n(r16);
    L_0x0395:
        r16.performDestroyView();
        r6.m11169f(r7, r14);
        r0 = r7.mView;
        if (r0 == 0) goto L_0x03de;
    L_0x039f:
        r0 = r7.mContainer;
        if (r0 == 0) goto L_0x03de;
    L_0x03a3:
        r0 = r7.mContainer;
        r1 = r7.mView;
        r0.endViewTransition(r1);
        r0 = r7.mView;
        r0.clearAnimation();
        r0 = r6.f8992l;
        r1 = 0;
        if (r0 <= 0) goto L_0x03cf;
    L_0x03b4:
        r0 = r6.f9000u;
        if (r0 != 0) goto L_0x03cf;
    L_0x03b8:
        r0 = r7.mView;
        r0 = r0.getVisibility();
        if (r0 != 0) goto L_0x03cf;
    L_0x03c0:
        r0 = r7.mPostponedAlpha;
        r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1));
        if (r0 < 0) goto L_0x03cf;
    L_0x03c6:
        r0 = r18;
        r2 = r19;
        r0 = r6.m11120a(r7, r0, r14, r2);
        goto L_0x03d0;
    L_0x03cf:
        r0 = r13;
    L_0x03d0:
        r7.mPostponedAlpha = r1;
        if (r0 == 0) goto L_0x03d7;
    L_0x03d4:
        r6.m11091a(r7, r0, r11);
    L_0x03d7:
        r0 = r7.mContainer;
        r1 = r7.mView;
        r0.removeView(r1);
    L_0x03de:
        r7.mContainer = r13;
        r7.mView = r13;
        r7.mInnerView = r13;
        r7.mInLayout = r14;
    L_0x03e6:
        if (r11 >= r8) goto L_0x045c;
    L_0x03e8:
        r0 = r6.f9000u;
        if (r0 == 0) goto L_0x040d;
    L_0x03ec:
        r0 = r16.getAnimatingAway();
        if (r0 == 0) goto L_0x03fd;
    L_0x03f2:
        r0 = r16.getAnimatingAway();
        r7.setAnimatingAway(r13);
        r0.clearAnimation();
        goto L_0x040d;
    L_0x03fd:
        r0 = r16.getAnimator();
        if (r0 == 0) goto L_0x040d;
    L_0x0403:
        r0 = r16.getAnimator();
        r7.setAnimator(r13);
        r0.cancel();
    L_0x040d:
        r0 = r16.getAnimatingAway();
        if (r0 != 0) goto L_0x0458;
    L_0x0413:
        r0 = r16.getAnimator();
        if (r0 == 0) goto L_0x041a;
    L_0x0419:
        goto L_0x0458;
    L_0x041a:
        r0 = f8974a;
        if (r0 == 0) goto L_0x0434;
    L_0x041e:
        r0 = "FragmentManager";
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = "movefrom CREATED: ";
        r1.append(r2);
        r1.append(r7);
        r1 = r1.toString();
        android.util.Log.v(r0, r1);
    L_0x0434:
        r0 = r7.mRetaining;
        if (r0 != 0) goto L_0x043f;
    L_0x0438:
        r16.performDestroy();
        r6.m11172g(r7, r14);
        goto L_0x0441;
    L_0x043f:
        r7.mState = r14;
    L_0x0441:
        r16.performDetach();
        r6.m11176h(r7, r14);
        if (r20 != 0) goto L_0x045c;
    L_0x0449:
        r0 = r7.mRetaining;
        if (r0 != 0) goto L_0x0451;
    L_0x044d:
        r15.m11175h(r16);
        goto L_0x045c;
    L_0x0451:
        r7.mHost = r13;
        r7.mParentFragment = r13;
        r7.mFragmentManager = r13;
        goto L_0x045c;
    L_0x0458:
        r7.setStateAfterAnimating(r11);
        goto L_0x045d;
    L_0x045c:
        r8 = r11;
    L_0x045d:
        r0 = r7.mState;
        if (r0 == r8) goto L_0x0490;
    L_0x0461:
        r0 = "FragmentManager";
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = "moveToState: Fragment state for ";
        r1.append(r2);
        r1.append(r7);
        r2 = " not updated inline; ";
        r1.append(r2);
        r2 = "expected state ";
        r1.append(r2);
        r1.append(r8);
        r2 = " found ";
        r1.append(r2);
        r2 = r7.mState;
        r1.append(r2);
        r1 = r1.toString();
        android.util.Log.w(r0, r1);
        r7.mState = r8;
    L_0x0490:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.app.k.a(android.support.v4.app.Fragment, int, int, int, boolean):void");
    }

    /* renamed from: a */
    private void m11091a(@NonNull final Fragment fragment, @NonNull C0399c c0399c, int i) {
        final View view = fragment.mView;
        final ViewGroup viewGroup = fragment.mContainer;
        viewGroup.startViewTransition(view);
        fragment.setStateAfterAnimating(i);
        if (c0399c.f1339a != 0) {
            Animation c0401e = new C0401e(c0399c.f1339a, viewGroup, view);
            fragment.setAnimatingAway(fragment.mView);
            c0401e.setAnimationListener(new C0398b(this, C2832k.m11090a(c0401e)) {
                /* renamed from: c */
                final /* synthetic */ C2832k f8961c;

                /* renamed from: android.support.v4.app.k$2$1 */
                class C03941 implements Runnable {
                    /* renamed from: a */
                    final /* synthetic */ C28282 f1328a;

                    C03941(C28282 c28282) {
                        this.f1328a = c28282;
                    }

                    public void run() {
                        if (fragment.getAnimatingAway() != null) {
                            fragment.setAnimatingAway(null);
                            this.f1328a.f8961c.m11128a(fragment, fragment.getStateAfterAnimating(), 0, 0, false);
                        }
                    }
                }

                public void onAnimationEnd(Animation animation) {
                    super.onAnimationEnd(animation);
                    viewGroup.post(new C03941(this));
                }
            });
            C2832k.m11106b(view, c0399c);
            fragment.mView.startAnimation(c0401e);
            return;
        }
        i = c0399c.f1340b;
        fragment.setAnimator(c0399c.f1340b);
        i.addListener(new AnimatorListenerAdapter(this) {
            /* renamed from: d */
            final /* synthetic */ C2832k f1332d;

            public void onAnimationEnd(Animator animator) {
                viewGroup.endViewTransition(view);
                animator = fragment.getAnimator();
                fragment.setAnimator(null);
                if (animator != null && viewGroup.indexOfChild(view) < null) {
                    this.f1332d.m11128a(fragment, fragment.getStateAfterAnimating(), 0, 0, false);
                }
            }
        });
        i.setTarget(fragment.mView);
        C2832k.m11106b(fragment.mView, c0399c);
        i.start();
    }

    /* renamed from: c */
    void m11157c(Fragment fragment) {
        m11128a(fragment, this.f8992l, 0, 0, false);
    }

    /* renamed from: d */
    void m11162d(Fragment fragment) {
        if (fragment.mFromLayout && !fragment.mPerformedCreateView) {
            fragment.mView = fragment.performCreateView(fragment.performGetLayoutInflater(fragment.mSavedFragmentState), null, fragment.mSavedFragmentState);
            if (fragment.mView != null) {
                fragment.mInnerView = fragment.mView;
                fragment.mView.setSaveFromParentEnabled(false);
                if (fragment.mHidden) {
                    fragment.mView.setVisibility(8);
                }
                fragment.onViewCreated(fragment.mView, fragment.mSavedFragmentState);
                m11131a(fragment, fragment.mView, fragment.mSavedFragmentState, false);
                return;
            }
            fragment.mInnerView = null;
        }
    }

    /* renamed from: e */
    void m11166e(final Fragment fragment) {
        if (fragment.mView != null) {
            C0399c a = m11120a(fragment, fragment.getNextTransition(), fragment.mHidden ^ true, fragment.getNextTransitionStyle());
            if (a == null || a.f1340b == null) {
                if (a != null) {
                    C2832k.m11106b(fragment.mView, a);
                    fragment.mView.startAnimation(a.f1339a);
                    a.f1339a.start();
                }
                int i = (!fragment.mHidden || fragment.isHideReplaced()) ? 0 : 8;
                fragment.mView.setVisibility(i);
                if (fragment.isHideReplaced()) {
                    fragment.setHideReplaced(false);
                }
            } else {
                a.f1340b.setTarget(fragment.mView);
                if (!fragment.mHidden) {
                    fragment.mView.setVisibility(0);
                } else if (fragment.isHideReplaced()) {
                    fragment.setHideReplaced(false);
                } else {
                    final ViewGroup viewGroup = fragment.mContainer;
                    final View view = fragment.mView;
                    viewGroup.startViewTransition(view);
                    a.f1340b.addListener(new AnimatorListenerAdapter(this) {
                        /* renamed from: d */
                        final /* synthetic */ C2832k f1336d;

                        public void onAnimationEnd(Animator animator) {
                            viewGroup.endViewTransition(view);
                            animator.removeListener(this);
                            if (fragment.mView != null) {
                                fragment.mView.setVisibility(8);
                            }
                        }
                    });
                }
                C2832k.m11106b(fragment.mView, a);
                a.f1340b.start();
            }
        }
        if (fragment.mAdded && fragment.mHasMenu && fragment.mMenuVisible) {
            this.f8997r = true;
        }
        fragment.mHiddenChanged = false;
        fragment.onHiddenChanged(fragment.mHidden);
    }

    /* renamed from: f */
    void m11168f(Fragment fragment) {
        if (fragment != null) {
            int i = this.f8992l;
            if (fragment.mRemoving) {
                if (fragment.isInBackStack()) {
                    i = Math.min(i, 1);
                } else {
                    i = Math.min(i, 0);
                }
            }
            m11128a(fragment, i, fragment.getNextTransition(), fragment.getNextTransitionStyle(), false);
            if (fragment.mView != null) {
                Fragment q = m11113q(fragment);
                if (q != null) {
                    View view = q.mView;
                    ViewGroup viewGroup = fragment.mContainer;
                    i = viewGroup.indexOfChild(view);
                    int indexOfChild = viewGroup.indexOfChild(fragment.mView);
                    if (indexOfChild < i) {
                        viewGroup.removeViewAt(indexOfChild);
                        viewGroup.addView(fragment.mView, i);
                    }
                }
                if (fragment.mIsNewlyAdded && fragment.mContainer != null) {
                    if (fragment.mPostponedAlpha > 0.0f) {
                        fragment.mView.setAlpha(fragment.mPostponedAlpha);
                    }
                    fragment.mPostponedAlpha = 0.0f;
                    fragment.mIsNewlyAdded = false;
                    C0399c a = m11120a(fragment, fragment.getNextTransition(), true, fragment.getNextTransitionStyle());
                    if (a != null) {
                        C2832k.m11106b(fragment.mView, a);
                        if (a.f1339a != null) {
                            fragment.mView.startAnimation(a.f1339a);
                        } else {
                            a.f1340b.setTarget(fragment.mView);
                            a.f1340b.start();
                        }
                    }
                }
            }
            if (fragment.mHiddenChanged) {
                m11166e(fragment);
            }
        }
    }

    /* renamed from: a */
    void m11124a(int i, boolean z) {
        if (this.f8993m == null && i != 0) {
            throw new IllegalStateException("No activity");
        } else if (z || i != this.f8992l) {
            this.f8992l = i;
            if (this.f8986f != 0) {
                int i2;
                i = this.f8985e.size();
                for (i2 = 0; i2 < i; i2++) {
                    m11168f((Fragment) this.f8985e.get(i2));
                }
                i = this.f8986f.size();
                for (i2 = 0; i2 < i; i2++) {
                    Fragment fragment = (Fragment) this.f8986f.valueAt(i2);
                    if (fragment != null && ((fragment.mRemoving || fragment.mDetached) && !fragment.mIsNewlyAdded)) {
                        m11168f(fragment);
                    }
                }
                m11174h();
                if (!(this.f8997r == 0 || this.f8993m == 0 || this.f8992l != 5)) {
                    this.f8993m.mo3027d();
                    this.f8997r = false;
                }
            }
        }
    }

    /* renamed from: h */
    void m11174h() {
        if (this.f8986f != null) {
            for (int i = 0; i < this.f8986f.size(); i++) {
                Fragment fragment = (Fragment) this.f8986f.valueAt(i);
                if (fragment != null) {
                    m11145b(fragment);
                }
            }
        }
    }

    /* renamed from: g */
    void m11171g(Fragment fragment) {
        if (fragment.mIndex < 0) {
            int i = this.f8984d;
            this.f8984d = i + 1;
            fragment.setIndex(i, this.f8995o);
            if (this.f8986f == null) {
                this.f8986f = new SparseArray();
            }
            this.f8986f.put(fragment.mIndex, fragment);
            if (f8974a) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Allocated fragment index ");
                stringBuilder.append(fragment);
                Log.v("FragmentManager", stringBuilder.toString());
            }
        }
    }

    /* renamed from: h */
    void m11175h(Fragment fragment) {
        if (fragment.mIndex >= 0) {
            if (f8974a) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Freeing fragment index ");
                stringBuilder.append(fragment);
                Log.v("FragmentManager", stringBuilder.toString());
            }
            this.f8986f.put(fragment.mIndex, null);
            fragment.initState();
        }
    }

    /* renamed from: a */
    public void m11132a(Fragment fragment, boolean z) {
        if (f8974a) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("add: ");
            stringBuilder.append(fragment);
            Log.v("FragmentManager", stringBuilder.toString());
        }
        m11171g(fragment);
        if (!fragment.mDetached) {
            if (this.f8985e.contains(fragment)) {
                StringBuilder stringBuilder2 = new StringBuilder();
                stringBuilder2.append("Fragment already added: ");
                stringBuilder2.append(fragment);
                throw new IllegalStateException(stringBuilder2.toString());
            }
            synchronized (this.f8985e) {
                this.f8985e.add(fragment);
            }
            fragment.mAdded = true;
            fragment.mRemoving = false;
            if (fragment.mView == null) {
                fragment.mHiddenChanged = false;
            }
            if (fragment.mHasMenu && fragment.mMenuVisible) {
                this.f8997r = true;
            }
            if (z) {
                m11157c(fragment);
            }
        }
    }

    /* renamed from: i */
    public void m11177i(Fragment fragment) {
        if (f8974a) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("remove: ");
            stringBuilder.append(fragment);
            stringBuilder.append(" nesting=");
            stringBuilder.append(fragment.mBackStackNesting);
            Log.v("FragmentManager", stringBuilder.toString());
        }
        int isInBackStack = fragment.isInBackStack() ^ 1;
        if (!fragment.mDetached || isInBackStack != 0) {
            synchronized (this.f8985e) {
                this.f8985e.remove(fragment);
            }
            if (fragment.mHasMenu && fragment.mMenuVisible) {
                this.f8997r = true;
            }
            fragment.mAdded = false;
            fragment.mRemoving = true;
        }
    }

    /* renamed from: j */
    public void m11180j(Fragment fragment) {
        if (f8974a) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("hide: ");
            stringBuilder.append(fragment);
            Log.v("FragmentManager", stringBuilder.toString());
        }
        if (!fragment.mHidden) {
            fragment.mHidden = true;
            fragment.mHiddenChanged = true ^ fragment.mHiddenChanged;
        }
    }

    /* renamed from: k */
    public void m11182k(Fragment fragment) {
        if (f8974a) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("show: ");
            stringBuilder.append(fragment);
            Log.v("FragmentManager", stringBuilder.toString());
        }
        if (fragment.mHidden) {
            fragment.mHidden = false;
            fragment.mHiddenChanged ^= 1;
        }
    }

    /* renamed from: l */
    public void m11184l(Fragment fragment) {
        if (f8974a) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("detach: ");
            stringBuilder.append(fragment);
            Log.v("FragmentManager", stringBuilder.toString());
        }
        if (!fragment.mDetached) {
            fragment.mDetached = true;
            if (fragment.mAdded) {
                if (f8974a) {
                    StringBuilder stringBuilder2 = new StringBuilder();
                    stringBuilder2.append("remove from detach: ");
                    stringBuilder2.append(fragment);
                    Log.v("FragmentManager", stringBuilder2.toString());
                }
                synchronized (this.f8985e) {
                    this.f8985e.remove(fragment);
                }
                if (fragment.mHasMenu && fragment.mMenuVisible) {
                    this.f8997r = true;
                }
                fragment.mAdded = false;
            }
        }
    }

    /* renamed from: m */
    public void m11186m(Fragment fragment) {
        if (f8974a) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("attach: ");
            stringBuilder.append(fragment);
            Log.v("FragmentManager", stringBuilder.toString());
        }
        if (fragment.mDetached) {
            fragment.mDetached = false;
            if (!fragment.mAdded) {
                if (this.f8985e.contains(fragment)) {
                    stringBuilder = new StringBuilder();
                    stringBuilder.append("Fragment already added: ");
                    stringBuilder.append(fragment);
                    throw new IllegalStateException(stringBuilder.toString());
                }
                if (f8974a) {
                    stringBuilder = new StringBuilder();
                    stringBuilder.append("add from attach: ");
                    stringBuilder.append(fragment);
                    Log.v("FragmentManager", stringBuilder.toString());
                }
                synchronized (this.f8985e) {
                    this.f8985e.add(fragment);
                }
                fragment.mAdded = true;
                if (fragment.mHasMenu && fragment.mMenuVisible != null) {
                    this.f8997r = true;
                }
            }
        }
    }

    /* renamed from: a */
    public Fragment mo426a(int i) {
        int size;
        for (size = this.f8985e.size() - 1; size >= 0; size--) {
            Fragment fragment = (Fragment) this.f8985e.get(size);
            if (fragment != null && fragment.mFragmentId == i) {
                return fragment;
            }
        }
        if (this.f8986f != null) {
            for (size = this.f8986f.size() - 1; size >= 0; size--) {
                fragment = (Fragment) this.f8986f.valueAt(size);
                if (fragment != null && fragment.mFragmentId == i) {
                    return fragment;
                }
            }
        }
        return 0;
    }

    /* renamed from: a */
    public Fragment mo428a(String str) {
        int size;
        Fragment fragment;
        if (str != null) {
            for (size = this.f8985e.size() - 1; size >= 0; size--) {
                fragment = (Fragment) this.f8985e.get(size);
                if (fragment != null && str.equals(fragment.mTag)) {
                    return fragment;
                }
            }
        }
        if (!(this.f8986f == null || str == null)) {
            for (size = this.f8986f.size() - 1; size >= 0; size--) {
                fragment = (Fragment) this.f8986f.valueAt(size);
                if (fragment != null && str.equals(fragment.mTag)) {
                    return fragment;
                }
            }
        }
        return null;
    }

    /* renamed from: b */
    public Fragment m11144b(String str) {
        if (!(this.f8986f == null || str == null)) {
            for (int size = this.f8986f.size() - 1; size >= 0; size--) {
                Fragment fragment = (Fragment) this.f8986f.valueAt(size);
                if (fragment != null) {
                    fragment = fragment.findFragmentByWho(str);
                    if (fragment != null) {
                        return fragment;
                    }
                }
            }
        }
        return null;
    }

    /* renamed from: B */
    private void m11081B() {
        if (mo441g()) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        } else if (this.f9001v != null) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Can not perform this action inside of ");
            stringBuilder.append(this.f9001v);
            throw new IllegalStateException(stringBuilder.toString());
        }
    }

    /* renamed from: g */
    public boolean mo441g() {
        if (!this.f8998s) {
            if (!this.f8999t) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    public void m11136a(C0403g c0403g, boolean z) {
        if (!z) {
            m11081B();
        }
        synchronized (this) {
            if (!this.f9000u) {
                if (this.f8993m != null) {
                    if (!this.f8982b) {
                        this.f8982b = new ArrayList();
                    }
                    this.f8982b.add(c0403g);
                    m11082C();
                    return;
                }
            }
            if (z) {
                return;
            }
            throw new IllegalStateException("Activity has been destroyed");
        }
    }

    /* renamed from: C */
    private void m11082C() {
        synchronized (this) {
            Object obj = null;
            Object obj2 = (this.f8978C == null || this.f8978C.isEmpty()) ? null : 1;
            if (this.f8982b != null && this.f8982b.size() == 1) {
                obj = 1;
            }
            if (!(obj2 == null && r1 == null)) {
                this.f8993m.m11071j().removeCallbacks(this.f8980E);
                this.f8993m.m11071j().post(this.f8980E);
            }
        }
    }

    /* renamed from: a */
    public int m11115a(C2826c c2826c) {
        synchronized (this) {
            int intValue;
            if (this.f8990j != null) {
                if (this.f8990j.size() > 0) {
                    intValue = ((Integer) this.f8990j.remove(this.f8990j.size() - 1)).intValue();
                    if (f8974a) {
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("Adding back stack index ");
                        stringBuilder.append(intValue);
                        stringBuilder.append(" with ");
                        stringBuilder.append(c2826c);
                        Log.v("FragmentManager", stringBuilder.toString());
                    }
                    this.f8989i.set(intValue, c2826c);
                    return intValue;
                }
            }
            if (this.f8989i == null) {
                this.f8989i = new ArrayList();
            }
            intValue = this.f8989i.size();
            if (f8974a) {
                stringBuilder = new StringBuilder();
                stringBuilder.append("Setting back stack index ");
                stringBuilder.append(intValue);
                stringBuilder.append(" to ");
                stringBuilder.append(c2826c);
                Log.v("FragmentManager", stringBuilder.toString());
            }
            this.f8989i.add(c2826c);
            return intValue;
        }
    }

    /* renamed from: a */
    public void m11123a(int i, C2826c c2826c) {
        synchronized (this) {
            if (this.f8989i == null) {
                this.f8989i = new ArrayList();
            }
            int size = this.f8989i.size();
            StringBuilder stringBuilder;
            if (i < size) {
                if (f8974a) {
                    stringBuilder = new StringBuilder();
                    stringBuilder.append("Setting back stack index ");
                    stringBuilder.append(i);
                    stringBuilder.append(" to ");
                    stringBuilder.append(c2826c);
                    Log.v("FragmentManager", stringBuilder.toString());
                }
                this.f8989i.set(i, c2826c);
            } else {
                while (size < i) {
                    this.f8989i.add(null);
                    if (this.f8990j == null) {
                        this.f8990j = new ArrayList();
                    }
                    if (f8974a) {
                        StringBuilder stringBuilder2 = new StringBuilder();
                        stringBuilder2.append("Adding available back stack index ");
                        stringBuilder2.append(size);
                        Log.v("FragmentManager", stringBuilder2.toString());
                    }
                    this.f8990j.add(Integer.valueOf(size));
                    size++;
                }
                if (f8974a) {
                    stringBuilder = new StringBuilder();
                    stringBuilder.append("Adding back stack index ");
                    stringBuilder.append(i);
                    stringBuilder.append(" with ");
                    stringBuilder.append(c2826c);
                    Log.v("FragmentManager", stringBuilder.toString());
                }
                this.f8989i.add(c2826c);
            }
        }
    }

    /* renamed from: c */
    public void m11156c(int i) {
        synchronized (this) {
            this.f8989i.set(i, null);
            if (this.f8990j == null) {
                this.f8990j = new ArrayList();
            }
            if (f8974a) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Freeing back stack index ");
                stringBuilder.append(i);
                Log.v("FragmentManager", stringBuilder.toString());
            }
            this.f8990j.add(Integer.valueOf(i));
        }
    }

    /* renamed from: c */
    private void m11109c(boolean z) {
        if (this.f8983c) {
            throw new IllegalStateException("FragmentManager is already executing transactions");
        } else if (this.f8993m == null) {
            throw new IllegalStateException("Fragment host has been destroyed");
        } else if (Looper.myLooper() != this.f8993m.m11071j().getLooper()) {
            throw new IllegalStateException("Must be called from main thread of fragment host");
        } else {
            if (!z) {
                m11081B();
            }
            if (!this.f9003x) {
                this.f9003x = new ArrayList();
                this.f9004y = new ArrayList();
            }
            this.f8983c = true;
            try {
                m11098a(null, null);
            } finally {
                this.f8983c = false;
            }
        }
    }

    /* renamed from: b */
    public void m11150b(C0403g c0403g, boolean z) {
        if (!z || (this.f8993m != null && !this.f9000u)) {
            m11109c(z);
            if (c0403g.mo407a(this.f9003x, this.f9004y) != null) {
                this.f8983c = true;
                try {
                    m11107b(this.f9003x, this.f9004y);
                } finally {
                    m11083D();
                }
            }
            m11179j();
            m11086G();
        }
    }

    /* renamed from: D */
    private void m11083D() {
        this.f8983c = false;
        this.f9004y.clear();
        this.f9003x.clear();
    }

    /* renamed from: i */
    public boolean m11178i() {
        m11109c(true);
        boolean z = false;
        while (m11110c(this.f9003x, this.f9004y)) {
            this.f8983c = true;
            try {
                m11107b(this.f9003x, this.f9004y);
                m11083D();
                z = true;
            } catch (Throwable th) {
                m11083D();
                throw th;
            }
        }
        m11179j();
        m11086G();
        return z;
    }

    /* renamed from: a */
    private void m11098a(ArrayList<C2826c> arrayList, ArrayList<Boolean> arrayList2) {
        int size = this.f8978C == null ? 0 : this.f8978C.size();
        int i = 0;
        while (i < size) {
            int indexOf;
            C2831i c2831i = (C2831i) this.f8978C.get(i);
            if (!(arrayList == null || c2831i.f8967a)) {
                indexOf = arrayList.indexOf(c2831i.f8968b);
                if (indexOf != -1 && ((Boolean) arrayList2.get(indexOf)).booleanValue()) {
                    c2831i.m11080e();
                    i++;
                }
            }
            if (c2831i.m11078c() || (arrayList != null && c2831i.f8968b.m11038a((ArrayList) arrayList, 0, arrayList.size()))) {
                this.f8978C.remove(i);
                i--;
                size--;
                if (!(arrayList == null || c2831i.f8967a)) {
                    indexOf = arrayList.indexOf(c2831i.f8968b);
                    if (indexOf != -1 && ((Boolean) arrayList2.get(indexOf)).booleanValue()) {
                        c2831i.m11080e();
                    }
                }
                c2831i.m11079d();
            }
            i++;
        }
    }

    /* renamed from: b */
    private void m11107b(ArrayList<C2826c> arrayList, ArrayList<Boolean> arrayList2) {
        if (arrayList != null) {
            if (!arrayList.isEmpty()) {
                if (arrayList2 != null) {
                    if (arrayList.size() == arrayList2.size()) {
                        m11098a((ArrayList) arrayList, (ArrayList) arrayList2);
                        int size = arrayList.size();
                        int i = 0;
                        int i2 = 0;
                        while (i < size) {
                            if (!((C2826c) arrayList.get(i)).f8952t) {
                                if (i2 != i) {
                                    m11099a((ArrayList) arrayList, (ArrayList) arrayList2, i2, i);
                                }
                                i2 = i + 1;
                                if (((Boolean) arrayList2.get(i)).booleanValue()) {
                                    while (i2 < size && ((Boolean) arrayList2.get(i2)).booleanValue() && !((C2826c) arrayList.get(i2)).f8952t) {
                                        i2++;
                                    }
                                }
                                m11099a((ArrayList) arrayList, (ArrayList) arrayList2, i, i2);
                                i = i2 - 1;
                            }
                            i++;
                        }
                        if (i2 != size) {
                            m11099a((ArrayList) arrayList, (ArrayList) arrayList2, i2, size);
                        }
                        return;
                    }
                }
                throw new IllegalStateException("Internal error with the back stack records");
            }
        }
    }

    /* renamed from: a */
    private void m11099a(ArrayList<C2826c> arrayList, ArrayList<Boolean> arrayList2, int i, int i2) {
        int i3;
        int i4;
        ArrayList<C2826c> arrayList3 = arrayList;
        ArrayList<Boolean> arrayList4 = arrayList2;
        int i5 = i;
        int i6 = i2;
        boolean z = ((C2826c) arrayList3.get(i5)).f8952t;
        if (this.f9005z == null) {
            r6.f9005z = new ArrayList();
        } else {
            r6.f9005z.clear();
        }
        r6.f9005z.addAll(r6.f8985e);
        Fragment z2 = m11202z();
        Object obj = null;
        for (i3 = i5; i3 < i6; i3++) {
            C2826c c2826c = (C2826c) arrayList3.get(i3);
            if (((Boolean) arrayList4.get(i3)).booleanValue()) {
                z2 = c2826c.m11040b(r6.f9005z, z2);
            } else {
                z2 = c2826c.m11024a(r6.f9005z, z2);
            }
            if (obj == null) {
                if (!c2826c.f8941i) {
                    obj = null;
                }
            }
            obj = 1;
        }
        r6.f9005z.clear();
        if (!z) {
            C0411o.m1521a(r6, (ArrayList) arrayList3, (ArrayList) arrayList4, i5, i6, false);
        }
        C2832k.m11108b(arrayList, arrayList2, i, i2);
        if (z) {
            C0546b c0546b = new C0546b();
            m11105b(c0546b);
            i3 = m11087a((ArrayList) arrayList3, (ArrayList) arrayList4, i5, i6, c0546b);
            m11096a(c0546b);
            i4 = i3;
        } else {
            i4 = i6;
        }
        if (i4 != i5 && z) {
            C0411o.m1521a(r6, (ArrayList) arrayList3, (ArrayList) arrayList4, i5, i4, true);
            m11124a(r6.f8992l, true);
        }
        while (i5 < i6) {
            C2826c c2826c2 = (C2826c) arrayList3.get(i5);
            if (((Boolean) arrayList4.get(i5)).booleanValue() && c2826c2.f8945m >= 0) {
                m11156c(c2826c2.f8945m);
                c2826c2.f8945m = -1;
            }
            c2826c2.m11044b();
            i5++;
        }
        if (obj != null) {
            m11181k();
        }
    }

    /* renamed from: a */
    private void m11096a(C0546b<Fragment> c0546b) {
        int size = c0546b.size();
        for (int i = 0; i < size; i++) {
            Fragment fragment = (Fragment) c0546b.m2013b(i);
            if (!fragment.mAdded) {
                View view = fragment.getView();
                fragment.mPostponedAlpha = view.getAlpha();
                view.setAlpha(0.0f);
            }
        }
    }

    /* renamed from: a */
    private int m11087a(ArrayList<C2826c> arrayList, ArrayList<Boolean> arrayList2, int i, int i2, C0546b<Fragment> c0546b) {
        int i3 = i2;
        for (int i4 = i2 - 1; i4 >= i; i4--) {
            C2826c c2826c = (C2826c) arrayList.get(i4);
            boolean booleanValue = ((Boolean) arrayList2.get(i4)).booleanValue();
            Object obj = (!c2826c.m11053h() || c2826c.m11038a((ArrayList) arrayList, i4 + 1, i2)) ? null : 1;
            if (obj != null) {
                if (this.f8978C == null) {
                    this.f8978C = new ArrayList();
                }
                C0369b c2831i = new C2831i(c2826c, booleanValue);
                this.f8978C.add(c2831i);
                c2826c.m11034a(c2831i);
                if (booleanValue) {
                    c2826c.m11052g();
                } else {
                    c2826c.m11045b(false);
                }
                i3--;
                if (i4 != i3) {
                    arrayList.remove(i4);
                    arrayList.add(i3, c2826c);
                }
                m11105b((C0546b) c0546b);
            }
        }
        return i3;
    }

    /* renamed from: a */
    private void m11092a(C2826c c2826c, boolean z, boolean z2, boolean z3) {
        if (z) {
            c2826c.m11045b(z3);
        } else {
            c2826c.m11052g();
        }
        ArrayList arrayList = new ArrayList(1);
        ArrayList arrayList2 = new ArrayList(1);
        arrayList.add(c2826c);
        arrayList2.add(Boolean.valueOf(z));
        if (z2) {
            C0411o.m1521a(this, arrayList, arrayList2, 0, 1, true);
        }
        if (z3) {
            m11124a(this.f8992l, true);
        }
        if (this.f8986f) {
            z = this.f8986f.size();
            for (boolean z4 = false; z4 < z; z4++) {
                Fragment fragment = (Fragment) this.f8986f.valueAt(z4);
                if (fragment != null && fragment.mView != null && fragment.mIsNewlyAdded && c2826c.m11046b(fragment.mContainerId)) {
                    if (fragment.mPostponedAlpha > 0.0f) {
                        fragment.mView.setAlpha(fragment.mPostponedAlpha);
                    }
                    if (z3) {
                        fragment.mPostponedAlpha = 0.0f;
                    } else {
                        fragment.mPostponedAlpha = -1.0f;
                        fragment.mIsNewlyAdded = false;
                    }
                }
            }
        }
    }

    /* renamed from: q */
    private Fragment m11113q(Fragment fragment) {
        ViewGroup viewGroup = fragment.mContainer;
        View view = fragment.mView;
        if (viewGroup != null) {
            if (view != null) {
                for (fragment = this.f8985e.indexOf(fragment) - 1; fragment >= null; fragment--) {
                    Fragment fragment2 = (Fragment) this.f8985e.get(fragment);
                    if (fragment2.mContainer == viewGroup && fragment2.mView != null) {
                        return fragment2;
                    }
                }
                return null;
            }
        }
        return null;
    }

    /* renamed from: b */
    private static void m11108b(ArrayList<C2826c> arrayList, ArrayList<Boolean> arrayList2, int i, int i2) {
        while (i < i2) {
            C2826c c2826c = (C2826c) arrayList.get(i);
            boolean z = true;
            if (((Boolean) arrayList2.get(i)).booleanValue()) {
                c2826c.m11033a(-1);
                if (i != i2 - 1) {
                    z = false;
                }
                c2826c.m11045b(z);
            } else {
                c2826c.m11033a(1);
                c2826c.m11052g();
            }
            i++;
        }
    }

    /* renamed from: b */
    private void m11105b(C0546b<Fragment> c0546b) {
        if (this.f8992l >= 1) {
            int min = Math.min(this.f8992l, 4);
            int size = this.f8985e.size();
            for (int i = 0; i < size; i++) {
                Fragment fragment = (Fragment) this.f8985e.get(i);
                if (fragment.mState < min) {
                    m11128a(fragment, min, fragment.getNextAnim(), fragment.getNextTransition(), false);
                    if (!(fragment.mView == null || fragment.mHidden || !fragment.mIsNewlyAdded)) {
                        c0546b.add(fragment);
                    }
                }
            }
        }
    }

    /* renamed from: E */
    private void m11084E() {
        if (this.f8978C != null) {
            while (!this.f8978C.isEmpty()) {
                ((C2831i) this.f8978C.remove(0)).m11079d();
            }
        }
    }

    /* renamed from: F */
    private void m11085F() {
        int i = 0;
        int size = this.f8986f == null ? 0 : this.f8986f.size();
        while (i < size) {
            Fragment fragment = (Fragment) this.f8986f.valueAt(i);
            if (fragment != null) {
                if (fragment.getAnimatingAway() != null) {
                    int stateAfterAnimating = fragment.getStateAfterAnimating();
                    View animatingAway = fragment.getAnimatingAway();
                    Animation animation = animatingAway.getAnimation();
                    if (animation != null) {
                        animation.cancel();
                        animatingAway.clearAnimation();
                    }
                    fragment.setAnimatingAway(null);
                    m11128a(fragment, stateAfterAnimating, 0, 0, false);
                } else if (fragment.getAnimator() != null) {
                    fragment.getAnimator().end();
                }
            }
            i++;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: c */
    private boolean m11110c(java.util.ArrayList<android.support.v4.app.C2826c> r5, java.util.ArrayList<java.lang.Boolean> r6) {
        /*
        r4 = this;
        monitor-enter(r4);
        r0 = r4.f8982b;	 Catch:{ all -> 0x003c }
        r1 = 0;
        if (r0 == 0) goto L_0x003a;
    L_0x0006:
        r0 = r4.f8982b;	 Catch:{ all -> 0x003c }
        r0 = r0.size();	 Catch:{ all -> 0x003c }
        if (r0 != 0) goto L_0x000f;
    L_0x000e:
        goto L_0x003a;
    L_0x000f:
        r0 = r4.f8982b;	 Catch:{ all -> 0x003c }
        r0 = r0.size();	 Catch:{ all -> 0x003c }
        r2 = 0;
    L_0x0016:
        if (r1 >= r0) goto L_0x0028;
    L_0x0018:
        r3 = r4.f8982b;	 Catch:{ all -> 0x003c }
        r3 = r3.get(r1);	 Catch:{ all -> 0x003c }
        r3 = (android.support.v4.app.C2832k.C0403g) r3;	 Catch:{ all -> 0x003c }
        r3 = r3.mo407a(r5, r6);	 Catch:{ all -> 0x003c }
        r2 = r2 | r3;
        r1 = r1 + 1;
        goto L_0x0016;
    L_0x0028:
        r5 = r4.f8982b;	 Catch:{ all -> 0x003c }
        r5.clear();	 Catch:{ all -> 0x003c }
        r5 = r4.f8993m;	 Catch:{ all -> 0x003c }
        r5 = r5.m11071j();	 Catch:{ all -> 0x003c }
        r6 = r4.f8980E;	 Catch:{ all -> 0x003c }
        r5.removeCallbacks(r6);	 Catch:{ all -> 0x003c }
        monitor-exit(r4);	 Catch:{ all -> 0x003c }
        return r2;
    L_0x003a:
        monitor-exit(r4);	 Catch:{ all -> 0x003c }
        return r1;
    L_0x003c:
        r5 = move-exception;
        monitor-exit(r4);	 Catch:{ all -> 0x003c }
        throw r5;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.app.k.c(java.util.ArrayList, java.util.ArrayList):boolean");
    }

    /* renamed from: j */
    void m11179j() {
        if (this.f9002w) {
            this.f9002w = false;
            m11174h();
        }
    }

    /* renamed from: k */
    void m11181k() {
        if (this.f8991k != null) {
            for (int i = 0; i < this.f8991k.size(); i++) {
                ((OnBackStackChangedListener) this.f8991k.get(i)).onBackStackChanged();
            }
        }
    }

    /* renamed from: b */
    void m11149b(C2826c c2826c) {
        if (this.f8987g == null) {
            this.f8987g = new ArrayList();
        }
        this.f8987g.add(c2826c);
    }

    /* renamed from: a */
    boolean m11143a(ArrayList<C2826c> arrayList, ArrayList<Boolean> arrayList2, String str, int i, int i2) {
        if (this.f8987g == null) {
            return false;
        }
        if (str == null && i < 0 && (i2 & 1) == 0) {
            str = this.f8987g.size() - 1;
            if (str < null) {
                return false;
            }
            arrayList.add(this.f8987g.remove(str));
            arrayList2.add(Boolean.valueOf(true));
        } else {
            int i3;
            if (str == null) {
                if (i < 0) {
                    i3 = -1;
                    if (i3 == this.f8987g.size() - 1) {
                        return false;
                    }
                    for (str = this.f8987g.size() - 1; str > i3; str--) {
                        arrayList.add(this.f8987g.remove(str));
                        arrayList2.add(Boolean.valueOf(true));
                    }
                }
            }
            i3 = this.f8987g.size() - 1;
            while (i3 >= 0) {
                C2826c c2826c = (C2826c) this.f8987g.get(i3);
                if (str == null || !str.equals(c2826c.getName())) {
                    if (i >= 0 && i == c2826c.f8945m) {
                        break;
                    }
                    i3--;
                } else {
                    break;
                }
            }
            if (i3 < 0) {
                return false;
            }
            if ((i2 & 1) != 0) {
                i3--;
                while (i3 >= 0) {
                    C2826c c2826c2 = (C2826c) this.f8987g.get(i3);
                    if ((str == null || !str.equals(c2826c2.getName())) && (i < 0 || i != c2826c2.f8945m)) {
                        break;
                    }
                    i3--;
                }
            }
            if (i3 == this.f8987g.size() - 1) {
                return false;
            }
            for (str = this.f8987g.size() - 1; str > i3; str--) {
                arrayList.add(this.f8987g.remove(str));
                arrayList2.add(Boolean.valueOf(true));
            }
        }
        return true;
    }

    /* renamed from: l */
    C0404l m11183l() {
        C2832k.m11095a(this.f8979D);
        return this.f8979D;
    }

    /* renamed from: a */
    private static void m11095a(C0404l c0404l) {
        if (c0404l != null) {
            List<Fragment> a = c0404l.m1486a();
            if (a != null) {
                for (Fragment fragment : a) {
                    fragment.mRetaining = true;
                }
            }
            C0404l<C0404l> b = c0404l.m1487b();
            if (b != null) {
                for (C0404l a2 : b) {
                    C2832k.m11095a(a2);
                }
            }
        }
    }

    /* renamed from: m */
    void m11185m() {
        List list;
        List list2;
        List list3;
        if (this.f8986f != null) {
            list = null;
            list2 = list;
            list3 = list2;
            for (int i = 0; i < this.f8986f.size(); i++) {
                Fragment fragment = (Fragment) this.f8986f.valueAt(i);
                if (fragment != null) {
                    Object obj;
                    if (fragment.mRetainInstance) {
                        if (list == null) {
                            list = new ArrayList();
                        }
                        list.add(fragment);
                        fragment.mTargetIndex = fragment.mTarget != null ? fragment.mTarget.mIndex : -1;
                        if (f8974a) {
                            StringBuilder stringBuilder = new StringBuilder();
                            stringBuilder.append("retainNonConfig: keeping retained ");
                            stringBuilder.append(fragment);
                            Log.v("FragmentManager", stringBuilder.toString());
                        }
                    }
                    if (fragment.mChildFragmentManager != null) {
                        fragment.mChildFragmentManager.m11185m();
                        obj = fragment.mChildFragmentManager.f8979D;
                    } else {
                        obj = fragment.mChildNonConfig;
                    }
                    if (list2 == null && obj != null) {
                        list2 = new ArrayList(this.f8986f.size());
                        for (int i2 = 0; i2 < i; i2++) {
                            list2.add(null);
                        }
                    }
                    if (list2 != null) {
                        list2.add(obj);
                    }
                    if (list3 == null && fragment.mViewModelStore != null) {
                        list3 = new ArrayList(this.f8986f.size());
                        for (int i3 = 0; i3 < i; i3++) {
                            list3.add(null);
                        }
                    }
                    if (list3 != null) {
                        list3.add(fragment.mViewModelStore);
                    }
                }
            }
        } else {
            list = null;
            list2 = list;
            list3 = list2;
        }
        if (list == null && list2 == null && list3 == null) {
            this.f8979D = null;
        } else {
            this.f8979D = new C0404l(list, list2, list3);
        }
    }

    /* renamed from: n */
    void m11188n(Fragment fragment) {
        if (fragment.mInnerView != null) {
            if (this.f8977B == null) {
                this.f8977B = new SparseArray();
            } else {
                this.f8977B.clear();
            }
            fragment.mInnerView.saveHierarchyState(this.f8977B);
            if (this.f8977B.size() > 0) {
                fragment.mSavedViewState = this.f8977B;
                this.f8977B = null;
            }
        }
    }

    /* renamed from: o */
    Bundle m11189o(Fragment fragment) {
        Bundle bundle;
        if (this.f8976A == null) {
            this.f8976A = new Bundle();
        }
        fragment.performSaveInstanceState(this.f8976A);
        m11163d(fragment, this.f8976A, false);
        if (this.f8976A.isEmpty()) {
            bundle = null;
        } else {
            bundle = this.f8976A;
            this.f8976A = null;
        }
        if (fragment.mView != null) {
            m11188n(fragment);
        }
        if (fragment.mSavedViewState != null) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putSparseParcelableArray("android:view_state", fragment.mSavedViewState);
        }
        if (!fragment.mUserVisibleHint) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putBoolean("android:user_visible_hint", fragment.mUserVisibleHint);
        }
        return bundle;
    }

    /* renamed from: n */
    Parcelable m11187n() {
        m11084E();
        m11085F();
        m11178i();
        this.f8998s = true;
        BackStackState[] backStackStateArr = null;
        this.f8979D = null;
        if (this.f8986f != null) {
            if (this.f8986f.size() > 0) {
                int i;
                int size = this.f8986f.size();
                FragmentState[] fragmentStateArr = new FragmentState[size];
                Object obj = null;
                for (i = 0; i < size; i++) {
                    Fragment fragment = (Fragment) this.f8986f.valueAt(i);
                    if (fragment != null) {
                        StringBuilder stringBuilder;
                        if (fragment.mIndex < 0) {
                            StringBuilder stringBuilder2 = new StringBuilder();
                            stringBuilder2.append("Failure saving state: active ");
                            stringBuilder2.append(fragment);
                            stringBuilder2.append(" has cleared index: ");
                            stringBuilder2.append(fragment.mIndex);
                            m11097a(new IllegalStateException(stringBuilder2.toString()));
                        }
                        FragmentState fragmentState = new FragmentState(fragment);
                        fragmentStateArr[i] = fragmentState;
                        if (fragment.mState <= 0 || fragmentState.mSavedFragmentState != null) {
                            fragmentState.mSavedFragmentState = fragment.mSavedFragmentState;
                        } else {
                            fragmentState.mSavedFragmentState = m11189o(fragment);
                            if (fragment.mTarget != null) {
                                if (fragment.mTarget.mIndex < 0) {
                                    stringBuilder = new StringBuilder();
                                    stringBuilder.append("Failure saving state: ");
                                    stringBuilder.append(fragment);
                                    stringBuilder.append(" has target not in fragment manager: ");
                                    stringBuilder.append(fragment.mTarget);
                                    m11097a(new IllegalStateException(stringBuilder.toString()));
                                }
                                if (fragmentState.mSavedFragmentState == null) {
                                    fragmentState.mSavedFragmentState = new Bundle();
                                }
                                mo431a(fragmentState.mSavedFragmentState, "android:target_state", fragment.mTarget);
                                if (fragment.mTargetRequestCode != 0) {
                                    fragmentState.mSavedFragmentState.putInt("android:target_req_state", fragment.mTargetRequestCode);
                                }
                            }
                        }
                        if (f8974a) {
                            stringBuilder = new StringBuilder();
                            stringBuilder.append("Saved state of ");
                            stringBuilder.append(fragment);
                            stringBuilder.append(": ");
                            stringBuilder.append(fragmentState.mSavedFragmentState);
                            Log.v("FragmentManager", stringBuilder.toString());
                        }
                        obj = 1;
                    }
                }
                if (obj == null) {
                    if (f8974a) {
                        Log.v("FragmentManager", "saveAllState: no fragments!");
                    }
                    return null;
                }
                int[] iArr;
                int size2 = this.f8985e.size();
                if (size2 > 0) {
                    iArr = new int[size2];
                    for (i = 0; i < size2; i++) {
                        StringBuilder stringBuilder3;
                        iArr[i] = ((Fragment) this.f8985e.get(i)).mIndex;
                        if (iArr[i] < 0) {
                            stringBuilder3 = new StringBuilder();
                            stringBuilder3.append("Failure saving state: active ");
                            stringBuilder3.append(this.f8985e.get(i));
                            stringBuilder3.append(" has cleared index: ");
                            stringBuilder3.append(iArr[i]);
                            m11097a(new IllegalStateException(stringBuilder3.toString()));
                        }
                        if (f8974a) {
                            stringBuilder3 = new StringBuilder();
                            stringBuilder3.append("saveAllState: adding fragment #");
                            stringBuilder3.append(i);
                            stringBuilder3.append(": ");
                            stringBuilder3.append(this.f8985e.get(i));
                            Log.v("FragmentManager", stringBuilder3.toString());
                        }
                    }
                } else {
                    iArr = null;
                }
                if (this.f8987g != null) {
                    size2 = this.f8987g.size();
                    if (size2 > 0) {
                        backStackStateArr = new BackStackState[size2];
                        for (int i2 = 0; i2 < size2; i2++) {
                            backStackStateArr[i2] = new BackStackState((C2826c) this.f8987g.get(i2));
                            if (f8974a) {
                                StringBuilder stringBuilder4 = new StringBuilder();
                                stringBuilder4.append("saveAllState: adding back stack #");
                                stringBuilder4.append(i2);
                                stringBuilder4.append(": ");
                                stringBuilder4.append(this.f8987g.get(i2));
                                Log.v("FragmentManager", stringBuilder4.toString());
                            }
                        }
                    }
                }
                Parcelable fragmentManagerState = new FragmentManagerState();
                fragmentManagerState.mActive = fragmentStateArr;
                fragmentManagerState.mAdded = iArr;
                fragmentManagerState.mBackStack = backStackStateArr;
                if (this.f8996p != null) {
                    fragmentManagerState.mPrimaryNavActiveIndex = this.f8996p.mIndex;
                }
                fragmentManagerState.mNextFragmentIndex = this.f8984d;
                m11185m();
                return fragmentManagerState;
            }
        }
        return null;
    }

    /* renamed from: a */
    void m11127a(Parcelable parcelable, C0404l c0404l) {
        if (parcelable != null) {
            FragmentManagerState fragmentManagerState = (FragmentManagerState) parcelable;
            if (fragmentManagerState.mActive != null) {
                List b;
                List c;
                if (c0404l != null) {
                    List a = c0404l.m1486a();
                    b = c0404l.m1487b();
                    c = c0404l.m1488c();
                    int size = a != null ? a.size() : 0;
                    for (int i = 0; i < size; i++) {
                        Fragment fragment = (Fragment) a.get(i);
                        if (f8974a) {
                            StringBuilder stringBuilder = new StringBuilder();
                            stringBuilder.append("restoreAllState: re-attaching retained ");
                            stringBuilder.append(fragment);
                            Log.v("FragmentManager", stringBuilder.toString());
                        }
                        int i2 = 0;
                        while (i2 < fragmentManagerState.mActive.length && fragmentManagerState.mActive[i2].mIndex != fragment.mIndex) {
                            i2++;
                        }
                        if (i2 == fragmentManagerState.mActive.length) {
                            StringBuilder stringBuilder2 = new StringBuilder();
                            stringBuilder2.append("Could not find active fragment with index ");
                            stringBuilder2.append(fragment.mIndex);
                            m11097a(new IllegalStateException(stringBuilder2.toString()));
                        }
                        FragmentState fragmentState = fragmentManagerState.mActive[i2];
                        fragmentState.mInstance = fragment;
                        fragment.mSavedViewState = null;
                        fragment.mBackStackNesting = 0;
                        fragment.mInLayout = false;
                        fragment.mAdded = false;
                        fragment.mTarget = null;
                        if (fragmentState.mSavedFragmentState != null) {
                            fragmentState.mSavedFragmentState.setClassLoader(this.f8993m.m11070i().getClassLoader());
                            fragment.mSavedViewState = fragmentState.mSavedFragmentState.getSparseParcelableArray("android:view_state");
                            fragment.mSavedFragmentState = fragmentState.mSavedFragmentState;
                        }
                    }
                } else {
                    b = null;
                    c = b;
                }
                this.f8986f = new SparseArray(fragmentManagerState.mActive.length);
                int i3 = 0;
                while (i3 < fragmentManagerState.mActive.length) {
                    FragmentState fragmentState2 = fragmentManagerState.mActive[i3];
                    if (fragmentState2 != null) {
                        C0404l c0404l2 = (b == null || i3 >= b.size()) ? null : (C0404l) b.get(i3);
                        C0031p c0031p = (c == null || i3 >= c.size()) ? null : (C0031p) c.get(i3);
                        Fragment instantiate = fragmentState2.instantiate(this.f8993m, this.f8994n, this.f8995o, c0404l2, c0031p);
                        if (f8974a) {
                            StringBuilder stringBuilder3 = new StringBuilder();
                            stringBuilder3.append("restoreAllState: active #");
                            stringBuilder3.append(i3);
                            stringBuilder3.append(": ");
                            stringBuilder3.append(instantiate);
                            Log.v("FragmentManager", stringBuilder3.toString());
                        }
                        this.f8986f.put(instantiate.mIndex, instantiate);
                        fragmentState2.mInstance = null;
                    }
                    i3++;
                }
                if (c0404l != null) {
                    c0404l = c0404l.m1486a();
                    i3 = c0404l != null ? c0404l.size() : 0;
                    for (int i4 = 0; i4 < i3; i4++) {
                        Fragment fragment2 = (Fragment) c0404l.get(i4);
                        if (fragment2.mTargetIndex >= 0) {
                            fragment2.mTarget = (Fragment) this.f8986f.get(fragment2.mTargetIndex);
                            if (fragment2.mTarget == null) {
                                StringBuilder stringBuilder4 = new StringBuilder();
                                stringBuilder4.append("Re-attaching retained fragment ");
                                stringBuilder4.append(fragment2);
                                stringBuilder4.append(" target no longer exists: ");
                                stringBuilder4.append(fragment2.mTargetIndex);
                                Log.w("FragmentManager", stringBuilder4.toString());
                            }
                        }
                    }
                }
                this.f8985e.clear();
                if (fragmentManagerState.mAdded != null) {
                    for (c0404l = null; c0404l < fragmentManagerState.mAdded.length; c0404l++) {
                        StringBuilder stringBuilder5;
                        Fragment fragment3 = (Fragment) this.f8986f.get(fragmentManagerState.mAdded[c0404l]);
                        if (fragment3 == null) {
                            stringBuilder5 = new StringBuilder();
                            stringBuilder5.append("No instantiated fragment for index #");
                            stringBuilder5.append(fragmentManagerState.mAdded[c0404l]);
                            m11097a(new IllegalStateException(stringBuilder5.toString()));
                        }
                        fragment3.mAdded = true;
                        if (f8974a) {
                            stringBuilder5 = new StringBuilder();
                            stringBuilder5.append("restoreAllState: added #");
                            stringBuilder5.append(c0404l);
                            stringBuilder5.append(": ");
                            stringBuilder5.append(fragment3);
                            Log.v("FragmentManager", stringBuilder5.toString());
                        }
                        if (this.f8985e.contains(fragment3)) {
                            throw new IllegalStateException("Already added!");
                        }
                        synchronized (this.f8985e) {
                            this.f8985e.add(fragment3);
                        }
                    }
                }
                if (fragmentManagerState.mBackStack != null) {
                    this.f8987g = new ArrayList(fragmentManagerState.mBackStack.length);
                    for (c0404l = null; c0404l < fragmentManagerState.mBackStack.length; c0404l++) {
                        C2826c instantiate2 = fragmentManagerState.mBackStack[c0404l].instantiate(this);
                        if (f8974a) {
                            StringBuilder stringBuilder6 = new StringBuilder();
                            stringBuilder6.append("restoreAllState: back stack #");
                            stringBuilder6.append(c0404l);
                            stringBuilder6.append(" (index ");
                            stringBuilder6.append(instantiate2.f8945m);
                            stringBuilder6.append("): ");
                            stringBuilder6.append(instantiate2);
                            Log.v("FragmentManager", stringBuilder6.toString());
                            PrintWriter printWriter = new PrintWriter(new C0549e("FragmentManager"));
                            instantiate2.m11037a("  ", printWriter, false);
                            printWriter.close();
                        }
                        this.f8987g.add(instantiate2);
                        if (instantiate2.f8945m >= 0) {
                            m11123a(instantiate2.f8945m, instantiate2);
                        }
                    }
                } else {
                    this.f8987g = null;
                }
                if (fragmentManagerState.mPrimaryNavActiveIndex >= null) {
                    this.f8996p = (Fragment) this.f8986f.get(fragmentManagerState.mPrimaryNavActiveIndex);
                }
                this.f8984d = fragmentManagerState.mNextFragmentIndex;
            }
        }
    }

    /* renamed from: G */
    private void m11086G() {
        if (this.f8986f != null) {
            for (int size = this.f8986f.size() - 1; size >= 0; size--) {
                if (this.f8986f.valueAt(size) == null) {
                    this.f8986f.delete(this.f8986f.keyAt(size));
                }
            }
        }
    }

    /* renamed from: a */
    public void m11135a(C2827j c2827j, C0391h c0391h, Fragment fragment) {
        if (this.f8993m != null) {
            throw new IllegalStateException("Already attached");
        }
        this.f8993m = c2827j;
        this.f8994n = c0391h;
        this.f8995o = fragment;
    }

    /* renamed from: o */
    public void m11190o() {
        this.f8979D = null;
        int i = 0;
        this.f8998s = false;
        this.f8999t = false;
        int size = this.f8985e.size();
        while (i < size) {
            Fragment fragment = (Fragment) this.f8985e.get(i);
            if (fragment != null) {
                fragment.noteStateNotSaved();
            }
            i++;
        }
    }

    /* renamed from: p */
    public void m11191p() {
        this.f8998s = false;
        this.f8999t = false;
        m11112e(1);
    }

    /* renamed from: q */
    public void m11193q() {
        this.f8998s = false;
        this.f8999t = false;
        m11112e(2);
    }

    /* renamed from: r */
    public void m11194r() {
        this.f8998s = false;
        this.f8999t = false;
        m11112e(4);
    }

    /* renamed from: s */
    public void m11195s() {
        this.f8998s = false;
        this.f8999t = false;
        m11112e(5);
    }

    /* renamed from: t */
    public void m11196t() {
        m11112e(4);
    }

    /* renamed from: u */
    public void m11197u() {
        this.f8999t = true;
        m11112e(3);
    }

    /* renamed from: v */
    public void m11198v() {
        m11112e(2);
    }

    /* renamed from: w */
    public void m11199w() {
        m11112e(1);
    }

    /* renamed from: x */
    public void m11200x() {
        this.f9000u = true;
        m11178i();
        m11112e(0);
        this.f8993m = null;
        this.f8994n = null;
        this.f8995o = null;
    }

    /* renamed from: e */
    private void m11112e(int i) {
        try {
            this.f8983c = true;
            m11124a(i, false);
            m11178i();
        } finally {
            this.f8983c = false;
        }
    }

    /* renamed from: a */
    public void m11139a(boolean z) {
        for (int size = this.f8985e.size() - 1; size >= 0; size--) {
            Fragment fragment = (Fragment) this.f8985e.get(size);
            if (fragment != null) {
                fragment.performMultiWindowModeChanged(z);
            }
        }
    }

    /* renamed from: b */
    public void m11152b(boolean z) {
        for (int size = this.f8985e.size() - 1; size >= 0; size--) {
            Fragment fragment = (Fragment) this.f8985e.get(size);
            if (fragment != null) {
                fragment.performPictureInPictureModeChanged(z);
            }
        }
    }

    /* renamed from: a */
    public void m11125a(Configuration configuration) {
        for (int i = 0; i < this.f8985e.size(); i++) {
            Fragment fragment = (Fragment) this.f8985e.get(i);
            if (fragment != null) {
                fragment.performConfigurationChanged(configuration);
            }
        }
    }

    /* renamed from: y */
    public void m11201y() {
        for (int i = 0; i < this.f8985e.size(); i++) {
            Fragment fragment = (Fragment) this.f8985e.get(i);
            if (fragment != null) {
                fragment.performLowMemory();
            }
        }
    }

    /* renamed from: a */
    public boolean m11141a(Menu menu, MenuInflater menuInflater) {
        int i = 0;
        if (this.f8992l < 1) {
            return false;
        }
        ArrayList arrayList = null;
        boolean z = false;
        for (int i2 = 0; i2 < this.f8985e.size(); i2++) {
            Fragment fragment = (Fragment) this.f8985e.get(i2);
            if (fragment != null && fragment.performCreateOptionsMenu(menu, menuInflater)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(fragment);
                z = true;
            }
        }
        if (this.f8988h != null) {
            while (i < this.f8988h.size()) {
                Fragment fragment2 = (Fragment) this.f8988h.get(i);
                if (arrayList == null || arrayList.contains(fragment2) == null) {
                    fragment2.onDestroyOptionsMenu();
                }
                i++;
            }
        }
        this.f8988h = arrayList;
        return z;
    }

    /* renamed from: a */
    public boolean m11140a(Menu menu) {
        int i = 0;
        if (this.f8992l < 1) {
            return false;
        }
        boolean z = false;
        while (i < this.f8985e.size()) {
            Fragment fragment = (Fragment) this.f8985e.get(i);
            if (fragment != null && fragment.performPrepareOptionsMenu(menu)) {
                z = true;
            }
            i++;
        }
        return z;
    }

    /* renamed from: a */
    public boolean m11142a(MenuItem menuItem) {
        if (this.f8992l < 1) {
            return false;
        }
        for (int i = 0; i < this.f8985e.size(); i++) {
            Fragment fragment = (Fragment) this.f8985e.get(i);
            if (fragment != null && fragment.performOptionsItemSelected(menuItem)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public boolean m11155b(MenuItem menuItem) {
        if (this.f8992l < 1) {
            return false;
        }
        for (int i = 0; i < this.f8985e.size(); i++) {
            Fragment fragment = (Fragment) this.f8985e.get(i);
            if (fragment != null && fragment.performContextItemSelected(menuItem)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public void m11151b(Menu menu) {
        if (this.f8992l >= 1) {
            for (int i = 0; i < this.f8985e.size(); i++) {
                Fragment fragment = (Fragment) this.f8985e.get(i);
                if (fragment != null) {
                    fragment.performOptionsMenuClosed(menu);
                }
            }
        }
    }

    /* renamed from: p */
    public void m11192p(Fragment fragment) {
        if (fragment == null || (this.f8986f.get(fragment.mIndex) == fragment && (fragment.mHost == null || fragment.getFragmentManager() == this))) {
            this.f8996p = fragment;
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Fragment ");
        stringBuilder.append(fragment);
        stringBuilder.append(" is not an active fragment of FragmentManager ");
        stringBuilder.append(this);
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    /* renamed from: z */
    public Fragment m11202z() {
        return this.f8996p;
    }

    /* renamed from: a */
    public void mo433a(C0372a c0372a, boolean z) {
        this.f8981J.add(new C0559j(c0372a, Boolean.valueOf(z)));
    }

    /* renamed from: a */
    public void mo432a(C0372a c0372a) {
        synchronized (this.f8981J) {
            int size = this.f8981J.size();
            for (int i = 0; i < size; i++) {
                if (((C0559j) this.f8981J.get(i)).f1724a == c0372a) {
                    this.f8981J.remove(i);
                    break;
                }
            }
        }
    }

    /* renamed from: a */
    void m11129a(Fragment fragment, Context context, boolean z) {
        if (this.f8995o != null) {
            FragmentManager fragmentManager = this.f8995o.getFragmentManager();
            if (fragmentManager instanceof C2832k) {
                ((C2832k) fragmentManager).m11129a(fragment, context, true);
            }
        }
        Iterator it = this.f8981J.iterator();
        while (it.hasNext()) {
            C0559j c0559j = (C0559j) it.next();
            if (!z || ((Boolean) c0559j.f1725b).booleanValue()) {
                ((C0372a) c0559j.f1724a).m1335a((FragmentManager) this, fragment, context);
            }
        }
    }

    /* renamed from: b */
    void m11146b(Fragment fragment, Context context, boolean z) {
        if (this.f8995o != null) {
            FragmentManager fragmentManager = this.f8995o.getFragmentManager();
            if (fragmentManager instanceof C2832k) {
                ((C2832k) fragmentManager).m11146b(fragment, context, true);
            }
        }
        Iterator it = this.f8981J.iterator();
        while (it.hasNext()) {
            C0559j c0559j = (C0559j) it.next();
            if (!z || ((Boolean) c0559j.f1725b).booleanValue()) {
                ((C0372a) c0559j.f1724a).m1339b((FragmentManager) this, fragment, context);
            }
        }
    }

    /* renamed from: a */
    void m11130a(Fragment fragment, Bundle bundle, boolean z) {
        if (this.f8995o != null) {
            FragmentManager fragmentManager = this.f8995o.getFragmentManager();
            if (fragmentManager instanceof C2832k) {
                ((C2832k) fragmentManager).m11130a(fragment, bundle, true);
            }
        }
        Iterator it = this.f8981J.iterator();
        while (it.hasNext()) {
            C0559j c0559j = (C0559j) it.next();
            if (!z || ((Boolean) c0559j.f1725b).booleanValue()) {
                ((C0372a) c0559j.f1724a).m1340b((FragmentManager) this, fragment, bundle);
            }
        }
    }

    /* renamed from: b */
    void m11147b(Fragment fragment, Bundle bundle, boolean z) {
        if (this.f8995o != null) {
            FragmentManager fragmentManager = this.f8995o.getFragmentManager();
            if (fragmentManager instanceof C2832k) {
                ((C2832k) fragmentManager).m11147b(fragment, bundle, true);
            }
        }
        Iterator it = this.f8981J.iterator();
        while (it.hasNext()) {
            C0559j c0559j = (C0559j) it.next();
            if (!z || ((Boolean) c0559j.f1725b).booleanValue()) {
                ((C0372a) c0559j.f1724a).mo32a((FragmentManager) this, fragment, bundle);
            }
        }
    }

    /* renamed from: c */
    void m11158c(Fragment fragment, Bundle bundle, boolean z) {
        if (this.f8995o != null) {
            FragmentManager fragmentManager = this.f8995o.getFragmentManager();
            if (fragmentManager instanceof C2832k) {
                ((C2832k) fragmentManager).m11158c(fragment, bundle, true);
            }
        }
        Iterator it = this.f8981J.iterator();
        while (it.hasNext()) {
            C0559j c0559j = (C0559j) it.next();
            if (!z || ((Boolean) c0559j.f1725b).booleanValue()) {
                ((C0372a) c0559j.f1724a).m1342c(this, fragment, bundle);
            }
        }
    }

    /* renamed from: a */
    void m11131a(Fragment fragment, View view, Bundle bundle, boolean z) {
        if (this.f8995o != null) {
            FragmentManager fragmentManager = this.f8995o.getFragmentManager();
            if (fragmentManager instanceof C2832k) {
                ((C2832k) fragmentManager).m11131a(fragment, view, bundle, true);
            }
        }
        Iterator it = this.f8981J.iterator();
        while (it.hasNext()) {
            C0559j c0559j = (C0559j) it.next();
            if (!z || ((Boolean) c0559j.f1725b).booleanValue()) {
                ((C0372a) c0559j.f1724a).m1337a(this, fragment, view, bundle);
            }
        }
    }

    /* renamed from: b */
    void m11148b(Fragment fragment, boolean z) {
        if (this.f8995o != null) {
            FragmentManager fragmentManager = this.f8995o.getFragmentManager();
            if (fragmentManager instanceof C2832k) {
                ((C2832k) fragmentManager).m11148b(fragment, true);
            }
        }
        Iterator it = this.f8981J.iterator();
        while (it.hasNext()) {
            C0559j c0559j = (C0559j) it.next();
            if (!z || ((Boolean) c0559j.f1725b).booleanValue()) {
                ((C0372a) c0559j.f1724a).mo33b(this, fragment);
            }
        }
    }

    /* renamed from: c */
    void m11159c(Fragment fragment, boolean z) {
        if (this.f8995o != null) {
            FragmentManager fragmentManager = this.f8995o.getFragmentManager();
            if (fragmentManager instanceof C2832k) {
                ((C2832k) fragmentManager).m11159c(fragment, true);
            }
        }
        Iterator it = this.f8981J.iterator();
        while (it.hasNext()) {
            C0559j c0559j = (C0559j) it.next();
            if (!z || ((Boolean) c0559j.f1725b).booleanValue()) {
                ((C0372a) c0559j.f1724a).mo34c(this, fragment);
            }
        }
    }

    /* renamed from: d */
    void m11164d(Fragment fragment, boolean z) {
        if (this.f8995o != null) {
            FragmentManager fragmentManager = this.f8995o.getFragmentManager();
            if (fragmentManager instanceof C2832k) {
                ((C2832k) fragmentManager).m11164d(fragment, true);
            }
        }
        Iterator it = this.f8981J.iterator();
        while (it.hasNext()) {
            C0559j c0559j = (C0559j) it.next();
            if (!z || ((Boolean) c0559j.f1725b).booleanValue()) {
                ((C0372a) c0559j.f1724a).m1343d(this, fragment);
            }
        }
    }

    /* renamed from: e */
    void m11167e(Fragment fragment, boolean z) {
        if (this.f8995o != null) {
            FragmentManager fragmentManager = this.f8995o.getFragmentManager();
            if (fragmentManager instanceof C2832k) {
                ((C2832k) fragmentManager).m11167e(fragment, true);
            }
        }
        Iterator it = this.f8981J.iterator();
        while (it.hasNext()) {
            C0559j c0559j = (C0559j) it.next();
            if (!z || ((Boolean) c0559j.f1725b).booleanValue()) {
                ((C0372a) c0559j.f1724a).m1345e(this, fragment);
            }
        }
    }

    /* renamed from: d */
    void m11163d(Fragment fragment, Bundle bundle, boolean z) {
        if (this.f8995o != null) {
            FragmentManager fragmentManager = this.f8995o.getFragmentManager();
            if (fragmentManager instanceof C2832k) {
                ((C2832k) fragmentManager).m11163d(fragment, bundle, true);
            }
        }
        Iterator it = this.f8981J.iterator();
        while (it.hasNext()) {
            C0559j c0559j = (C0559j) it.next();
            if (!z || ((Boolean) c0559j.f1725b).booleanValue()) {
                ((C0372a) c0559j.f1724a).m1344d(this, fragment, bundle);
            }
        }
    }

    /* renamed from: f */
    void m11169f(Fragment fragment, boolean z) {
        if (this.f8995o != null) {
            FragmentManager fragmentManager = this.f8995o.getFragmentManager();
            if (fragmentManager instanceof C2832k) {
                ((C2832k) fragmentManager).m11169f(fragment, true);
            }
        }
        Iterator it = this.f8981J.iterator();
        while (it.hasNext()) {
            C0559j c0559j = (C0559j) it.next();
            if (!z || ((Boolean) c0559j.f1725b).booleanValue()) {
                ((C0372a) c0559j.f1724a).m1346f(this, fragment);
            }
        }
    }

    /* renamed from: g */
    void m11172g(Fragment fragment, boolean z) {
        if (this.f8995o != null) {
            FragmentManager fragmentManager = this.f8995o.getFragmentManager();
            if (fragmentManager instanceof C2832k) {
                ((C2832k) fragmentManager).m11172g(fragment, true);
            }
        }
        Iterator it = this.f8981J.iterator();
        while (it.hasNext()) {
            C0559j c0559j = (C0559j) it.next();
            if (!z || ((Boolean) c0559j.f1725b).booleanValue()) {
                ((C0372a) c0559j.f1724a).mo28a(this, fragment);
            }
        }
    }

    /* renamed from: h */
    void m11176h(Fragment fragment, boolean z) {
        if (this.f8995o != null) {
            FragmentManager fragmentManager = this.f8995o.getFragmentManager();
            if (fragmentManager instanceof C2832k) {
                ((C2832k) fragmentManager).m11176h(fragment, true);
            }
        }
        Iterator it = this.f8981J.iterator();
        while (it.hasNext()) {
            C0559j c0559j = (C0559j) it.next();
            if (!z || ((Boolean) c0559j.f1725b).booleanValue()) {
                ((C0372a) c0559j.f1724a).m1347g(this, fragment);
            }
        }
    }

    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        C2832k c2832k = this;
        Context context2 = context;
        AttributeSet attributeSet2 = attributeSet;
        if (!"fragment".equals(str)) {
            return null;
        }
        String attributeValue = attributeSet2.getAttributeValue(null, "class");
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet2, C0402f.f1346a);
        int i = 0;
        if (attributeValue == null) {
            attributeValue = obtainStyledAttributes.getString(0);
        }
        String str2 = attributeValue;
        int resourceId = obtainStyledAttributes.getResourceId(1, -1);
        String string = obtainStyledAttributes.getString(2);
        obtainStyledAttributes.recycle();
        if (!Fragment.isSupportFragmentClass(c2832k.f8993m.m11070i(), str2)) {
            return null;
        }
        if (view != null) {
            i = view.getId();
        }
        if (i == -1 && resourceId == -1 && string == null) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(attributeSet.getPositionDescription());
            stringBuilder.append(": Must specify unique android:id, android:tag, or have a parent with an id for ");
            stringBuilder.append(str2);
            throw new IllegalArgumentException(stringBuilder.toString());
        }
        Fragment fragment;
        Fragment a = resourceId != -1 ? mo426a(resourceId) : null;
        if (a == null && string != null) {
            a = mo428a(string);
        }
        if (a == null && i != -1) {
            a = mo426a(i);
        }
        if (f8974a) {
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append("onCreateView: id=0x");
            stringBuilder2.append(Integer.toHexString(resourceId));
            stringBuilder2.append(" fname=");
            stringBuilder2.append(str2);
            stringBuilder2.append(" existing=");
            stringBuilder2.append(a);
            Log.v("FragmentManager", stringBuilder2.toString());
        }
        if (a == null) {
            Fragment a2 = c2832k.f8994n.mo379a(context2, str2, null);
            a2.mFromLayout = true;
            a2.mFragmentId = resourceId != 0 ? resourceId : i;
            a2.mContainerId = i;
            a2.mTag = string;
            a2.mInLayout = true;
            a2.mFragmentManager = c2832k;
            a2.mHost = c2832k.f8993m;
            a2.onInflate(c2832k.f8993m.m11070i(), attributeSet2, a2.mSavedFragmentState);
            m11132a(a2, true);
            fragment = a2;
        } else if (a.mInLayout) {
            stringBuilder = new StringBuilder();
            stringBuilder.append(attributeSet.getPositionDescription());
            stringBuilder.append(": Duplicate id 0x");
            stringBuilder.append(Integer.toHexString(resourceId));
            stringBuilder.append(", tag ");
            stringBuilder.append(string);
            stringBuilder.append(", or parent id 0x");
            stringBuilder.append(Integer.toHexString(i));
            stringBuilder.append(" with another fragment for ");
            stringBuilder.append(str2);
            throw new IllegalArgumentException(stringBuilder.toString());
        } else {
            a.mInLayout = true;
            a.mHost = c2832k.f8993m;
            if (!a.mRetaining) {
                a.onInflate(c2832k.f8993m.m11070i(), attributeSet2, a.mSavedFragmentState);
            }
            fragment = a;
        }
        if (c2832k.f8992l >= 1 || !fragment.mFromLayout) {
            m11157c(fragment);
        } else {
            m11128a(fragment, 1, 0, 0, false);
        }
        if (fragment.mView == null) {
            StringBuilder stringBuilder3 = new StringBuilder();
            stringBuilder3.append("Fragment ");
            stringBuilder3.append(str2);
            stringBuilder3.append(" did not create a view.");
            throw new IllegalStateException(stringBuilder3.toString());
        }
        if (resourceId != 0) {
            fragment.mView.setId(resourceId);
        }
        if (fragment.mView.getTag() == null) {
            fragment.mView.setTag(string);
        }
        return fragment.mView;
    }

    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }
}
