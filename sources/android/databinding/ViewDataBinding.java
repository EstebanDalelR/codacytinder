package android.databinding;

import android.annotation.TargetApi;
import android.arch.lifecycle.Lifecycle.Event;
import android.arch.lifecycle.LifecycleObserver;
import android.arch.lifecycle.LifecycleOwner;
import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.Observer;
import android.arch.lifecycle.OnLifecycleEvent;
import android.databinding.C0117c.C0116a;
import android.databinding.Observable.C0095a;
import android.databinding.ObservableList.C0102a;
import android.databinding.ObservableMap.C0104a;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Looper;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.util.SparseIntArray;
import android.view.Choreographer;
import android.view.Choreographer.FrameCallback;
import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import android.view.ViewGroup;
import com.android.p018a.p019a.C0864a.C0863a;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

public abstract class ViewDataBinding extends C2727a {
    /* renamed from: a */
    static int f12642a = VERSION.SDK_INT;
    /* renamed from: c */
    private static final int f12643c = "binding_".length();
    /* renamed from: d */
    private static final boolean f12644d = (f12642a >= 16);
    /* renamed from: e */
    private static final C0110a f12645e = new C27181();
    /* renamed from: f */
    private static final C0110a f12646f = new C27192();
    /* renamed from: g */
    private static final C0110a f12647g = new C27203();
    /* renamed from: h */
    private static final C0110a f12648h = new C27214();
    /* renamed from: i */
    private static final C0116a<C0120g, ViewDataBinding, Void> f12649i = new C27225();
    /* renamed from: j */
    private static final ReferenceQueue<ViewDataBinding> f12650j = new ReferenceQueue();
    /* renamed from: k */
    private static final OnAttachStateChangeListener f12651k;
    /* renamed from: b */
    protected final DataBindingComponent f12652b;
    /* renamed from: l */
    private final Runnable f12653l = new C01087(this);
    /* renamed from: m */
    private boolean f12654m = false;
    /* renamed from: n */
    private boolean f12655n = false;
    /* renamed from: o */
    private C0113f[] f12656o;
    /* renamed from: p */
    private final View f12657p;
    /* renamed from: q */
    private C0117c<C0120g, ViewDataBinding, Void> f12658q;
    /* renamed from: r */
    private boolean f12659r;
    /* renamed from: s */
    private Choreographer f12660s;
    /* renamed from: t */
    private final FrameCallback f12661t;
    /* renamed from: u */
    private Handler f12662u;
    /* renamed from: v */
    private ViewDataBinding f12663v;
    /* renamed from: w */
    private LifecycleOwner f12664w;
    /* renamed from: x */
    private boolean f12665x;

    /* renamed from: android.databinding.ViewDataBinding$6 */
    static class C01076 implements OnAttachStateChangeListener {
        public void onViewDetachedFromWindow(View view) {
        }

        C01076() {
        }

        @TargetApi(19)
        public void onViewAttachedToWindow(View view) {
            ViewDataBinding.m15553b(view).f12653l.run();
            view.removeOnAttachStateChangeListener(this);
        }
    }

    /* renamed from: android.databinding.ViewDataBinding$7 */
    class C01087 implements Runnable {
        /* renamed from: a */
        final /* synthetic */ ViewDataBinding f254a;

        C01087(ViewDataBinding viewDataBinding) {
            this.f254a = viewDataBinding;
        }

        public void run() {
            synchronized (this) {
                this.f254a.f12654m = false;
            }
            ViewDataBinding.m15562j();
            if (VERSION.SDK_INT < 19 || this.f254a.f12657p.isAttachedToWindow()) {
                this.f254a.m15563a();
                return;
            }
            this.f254a.f12657p.removeOnAttachStateChangeListener(ViewDataBinding.f12651k);
            this.f254a.f12657p.addOnAttachStateChangeListener(ViewDataBinding.f12651k);
        }
    }

    /* renamed from: android.databinding.ViewDataBinding$8 */
    class C01098 implements FrameCallback {
        /* renamed from: a */
        final /* synthetic */ ViewDataBinding f255a;

        C01098(ViewDataBinding viewDataBinding) {
            this.f255a = viewDataBinding;
        }

        public void doFrame(long j) {
            this.f255a.f12653l.run();
        }
    }

    /* renamed from: android.databinding.ViewDataBinding$a */
    private interface C0110a {
        /* renamed from: a */
        C0113f mo132a(ViewDataBinding viewDataBinding, int i);
    }

    /* renamed from: android.databinding.ViewDataBinding$b */
    protected static class C0111b {
        /* renamed from: a */
        public final String[][] f256a;
        /* renamed from: b */
        public final int[][] f257b;
        /* renamed from: c */
        public final int[][] f258c;
    }

    /* renamed from: android.databinding.ViewDataBinding$d */
    private interface C0112d<T> {
        /* renamed from: a */
        void mo134a(LifecycleOwner lifecycleOwner);

        /* renamed from: a */
        void mo135a(T t);

        /* renamed from: b */
        void mo136b(T t);
    }

    /* renamed from: android.databinding.ViewDataBinding$f */
    private static class C0113f<T> extends WeakReference<ViewDataBinding> {
        /* renamed from: a */
        protected final int f259a;
        /* renamed from: b */
        private final C0112d<T> f260b;
        /* renamed from: c */
        private T f261c;

        public C0113f(ViewDataBinding viewDataBinding, int i, C0112d<T> c0112d) {
            super(viewDataBinding, ViewDataBinding.f12650j);
            this.f259a = i;
            this.f260b = c0112d;
        }

        /* renamed from: a */
        public void m333a(LifecycleOwner lifecycleOwner) {
            this.f260b.mo134a(lifecycleOwner);
        }

        /* renamed from: a */
        public void m334a(T t) {
            m335a();
            this.f261c = t;
            if (this.f261c != null) {
                this.f260b.mo136b(this.f261c);
            }
        }

        /* renamed from: a */
        public boolean m335a() {
            boolean z;
            if (this.f261c != null) {
                this.f260b.mo135a(this.f261c);
                z = true;
            } else {
                z = false;
            }
            this.f261c = null;
            return z;
        }

        /* renamed from: b */
        public T m336b() {
            return this.f261c;
        }

        /* renamed from: c */
        protected ViewDataBinding m337c() {
            ViewDataBinding viewDataBinding = (ViewDataBinding) get();
            if (viewDataBinding == null) {
                m335a();
            }
            return viewDataBinding;
        }
    }

    /* renamed from: android.databinding.ViewDataBinding$1 */
    static class C27181 implements C0110a {
        C27181() {
        }

        /* renamed from: a */
        public C0113f mo132a(ViewDataBinding viewDataBinding, int i) {
            return new C2726h(viewDataBinding, i).m10590a();
        }
    }

    /* renamed from: android.databinding.ViewDataBinding$2 */
    static class C27192 implements C0110a {
        C27192() {
        }

        /* renamed from: a */
        public C0113f mo132a(ViewDataBinding viewDataBinding, int i) {
            return new C2724e(viewDataBinding, i).m10578a();
        }
    }

    /* renamed from: android.databinding.ViewDataBinding$3 */
    static class C27203 implements C0110a {
        C27203() {
        }

        /* renamed from: a */
        public C0113f mo132a(ViewDataBinding viewDataBinding, int i) {
            return new C2725g(viewDataBinding, i).m10584a();
        }
    }

    /* renamed from: android.databinding.ViewDataBinding$4 */
    static class C27214 implements C0110a {
        C27214() {
        }

        /* renamed from: a */
        public C0113f mo132a(ViewDataBinding viewDataBinding, int i) {
            return new C2723c(viewDataBinding, i).m10572a();
        }
    }

    /* renamed from: android.databinding.ViewDataBinding$5 */
    static class C27225 extends C0116a<C0120g, ViewDataBinding, Void> {
        C27225() {
        }

        /* renamed from: a */
        public void m10570a(C0120g c0120g, ViewDataBinding viewDataBinding, int i, Void voidR) {
            switch (i) {
                case 1:
                    if (c0120g.m362a(viewDataBinding) == null) {
                        viewDataBinding.f12655n = true;
                        return;
                    }
                    return;
                case 2:
                    c0120g.m363b(viewDataBinding);
                    return;
                case 3:
                    c0120g.m364c(viewDataBinding);
                    return;
                default:
                    return;
            }
        }
    }

    public class OnStartListener implements LifecycleObserver {
        /* renamed from: a */
        final /* synthetic */ ViewDataBinding f8581a;

        @OnLifecycleEvent(Event.ON_START)
        public void onStart() {
            this.f8581a.m15563a();
        }
    }

    /* renamed from: android.databinding.ViewDataBinding$c */
    private static class C2723c implements Observer, C0112d<LiveData<?>> {
        /* renamed from: a */
        final C0113f<LiveData<?>> f8582a;
        /* renamed from: b */
        LifecycleOwner f8583b;

        /* renamed from: a */
        public /* synthetic */ void mo135a(Object obj) {
            m10576b((LiveData) obj);
        }

        /* renamed from: b */
        public /* synthetic */ void mo136b(Object obj) {
            m10574a((LiveData) obj);
        }

        public C2723c(ViewDataBinding viewDataBinding, int i) {
            this.f8582a = new C0113f(viewDataBinding, i, this);
        }

        /* renamed from: a */
        public void mo134a(LifecycleOwner lifecycleOwner) {
            LiveData liveData = (LiveData) this.f8582a.m336b();
            if (liveData != null) {
                if (this.f8583b != null) {
                    liveData.mo3031b((Observer) this);
                }
                if (lifecycleOwner != null) {
                    liveData.m66a(lifecycleOwner, (Observer) this);
                }
            }
            this.f8583b = lifecycleOwner;
        }

        /* renamed from: a */
        public C0113f<LiveData<?>> m10572a() {
            return this.f8582a;
        }

        /* renamed from: a */
        public void m10574a(LiveData<?> liveData) {
            if (this.f8583b != null) {
                liveData.m66a(this.f8583b, (Observer) this);
            }
        }

        /* renamed from: b */
        public void m10576b(LiveData<?> liveData) {
            liveData.mo3031b((Observer) this);
        }

        public void onChanged(@Nullable Object obj) {
            this.f8582a.m337c().m15555b(this.f8582a.f259a, this.f8582a.m336b(), 0);
        }
    }

    /* renamed from: android.databinding.ViewDataBinding$e */
    private static class C2724e extends C0102a implements C0112d<ObservableList> {
        /* renamed from: a */
        final C0113f<ObservableList> f8584a;

        /* renamed from: a */
        public void mo134a(LifecycleOwner lifecycleOwner) {
        }

        /* renamed from: a */
        public /* synthetic */ void mo135a(Object obj) {
            m10582b((ObservableList) obj);
        }

        /* renamed from: b */
        public /* synthetic */ void mo136b(Object obj) {
            m10580a((ObservableList) obj);
        }

        public C2724e(ViewDataBinding viewDataBinding, int i) {
            this.f8584a = new C0113f(viewDataBinding, i, this);
        }

        /* renamed from: a */
        public C0113f<ObservableList> m10578a() {
            return this.f8584a;
        }

        /* renamed from: a */
        public void m10580a(ObservableList observableList) {
            observableList.addOnListChangedCallback(this);
        }

        /* renamed from: b */
        public void m10582b(ObservableList observableList) {
            observableList.removeOnListChangedCallback(this);
        }
    }

    /* renamed from: android.databinding.ViewDataBinding$g */
    private static class C2725g extends C0104a implements C0112d<ObservableMap> {
        /* renamed from: a */
        final C0113f<ObservableMap> f8585a;

        /* renamed from: a */
        public void mo134a(LifecycleOwner lifecycleOwner) {
        }

        /* renamed from: a */
        public /* synthetic */ void mo135a(Object obj) {
            m10588b((ObservableMap) obj);
        }

        /* renamed from: b */
        public /* synthetic */ void mo136b(Object obj) {
            m10586a((ObservableMap) obj);
        }

        public C2725g(ViewDataBinding viewDataBinding, int i) {
            this.f8585a = new C0113f(viewDataBinding, i, this);
        }

        /* renamed from: a */
        public C0113f<ObservableMap> m10584a() {
            return this.f8585a;
        }

        /* renamed from: a */
        public void m10586a(ObservableMap observableMap) {
            observableMap.addOnMapChangedCallback(this);
        }

        /* renamed from: b */
        public void m10588b(ObservableMap observableMap) {
            observableMap.removeOnMapChangedCallback(this);
        }
    }

    /* renamed from: android.databinding.ViewDataBinding$h */
    private static class C2726h extends C0095a implements C0112d<Observable> {
        /* renamed from: a */
        final C0113f<Observable> f8586a;

        /* renamed from: a */
        public void mo134a(LifecycleOwner lifecycleOwner) {
        }

        /* renamed from: a */
        public /* synthetic */ void mo135a(Object obj) {
            m10595b((Observable) obj);
        }

        /* renamed from: b */
        public /* synthetic */ void mo136b(Object obj) {
            m10592a((Observable) obj);
        }

        public C2726h(ViewDataBinding viewDataBinding, int i) {
            this.f8586a = new C0113f(viewDataBinding, i, this);
        }

        /* renamed from: a */
        public C0113f<Observable> m10590a() {
            return this.f8586a;
        }

        /* renamed from: a */
        public void m10592a(Observable observable) {
            observable.addOnPropertyChangedCallback(this);
        }

        /* renamed from: b */
        public void m10595b(Observable observable) {
            observable.removeOnPropertyChangedCallback(this);
        }

        /* renamed from: a */
        public void mo137a(Observable observable, int i) {
            ViewDataBinding c = this.f8586a.m337c();
            if (c != null && ((Observable) this.f8586a.m336b()) == observable) {
                c.m15555b(this.f8586a.f259a, (Object) observable, i);
            }
        }
    }

    /* renamed from: a */
    protected abstract boolean m15569a(int i, Object obj, int i2);

    /* renamed from: b */
    protected abstract void m15570b();

    /* renamed from: c */
    public abstract boolean m15571c();

    static {
        if (VERSION.SDK_INT < 19) {
            f12651k = null;
        } else {
            f12651k = new C01076();
        }
    }

    protected ViewDataBinding(DataBindingComponent dataBindingComponent, View view, int i) {
        this.f12652b = dataBindingComponent;
        this.f12656o = new C0113f[i];
        this.f12657p = view;
        if (Looper.myLooper() == null) {
            throw new IllegalStateException("DataBinding must be created in view's UI Thread");
        } else if (f12644d != null) {
            this.f12660s = Choreographer.getInstance();
            this.f12661t = new C01098(this);
        } else {
            this.f12661t = null;
            this.f12662u = new Handler(Looper.myLooper());
        }
    }

    /* renamed from: a */
    protected void m15565a(View view) {
        view.setTag(C0863a.dataBinding, this);
    }

    /* renamed from: a */
    protected void m15566a(View[] viewArr) {
        for (View tag : viewArr) {
            tag.setTag(C0863a.dataBinding, this);
        }
    }

    /* renamed from: a */
    public void m15563a() {
        if (this.f12663v == null) {
            m15561i();
        } else {
            this.f12663v.m15563a();
        }
    }

    /* renamed from: i */
    private void m15561i() {
        if (this.f12659r) {
            m15573e();
        } else if (m15571c()) {
            this.f12659r = true;
            this.f12655n = false;
            if (this.f12658q != null) {
                this.f12658q.m352a(this, 1, null);
                if (this.f12655n) {
                    this.f12658q.m352a(this, 2, null);
                }
            }
            if (!this.f12655n) {
                m15570b();
                if (this.f12658q != null) {
                    this.f12658q.m352a(this, 3, null);
                }
            }
            this.f12659r = false;
        }
    }

    /* renamed from: b */
    static ViewDataBinding m15553b(View view) {
        return view != null ? (ViewDataBinding) view.getTag(C0863a.dataBinding) : null;
    }

    @NonNull
    /* renamed from: d */
    public View m15572d() {
        return this.f12657p;
    }

    /* renamed from: b */
    private void m15555b(int i, Object obj, int i2) {
        if (!(this.f12665x || m15569a(i, obj, i2) == 0)) {
            m15573e();
        }
    }

    /* renamed from: a */
    protected boolean m15567a(int i) {
        i = this.f12656o[i];
        return i != 0 ? i.m335a() : false;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: e */
    protected void m15573e() {
        /*
        r2 = this;
        r0 = r2.f12663v;
        if (r0 == 0) goto L_0x000a;
    L_0x0004:
        r0 = r2.f12663v;
        r0.m15573e();
        goto L_0x003f;
    L_0x000a:
        monitor-enter(r2);
        r0 = r2.f12654m;	 Catch:{ all -> 0x0040 }
        if (r0 == 0) goto L_0x0011;
    L_0x000f:
        monitor-exit(r2);	 Catch:{ all -> 0x0040 }
        return;
    L_0x0011:
        r0 = 1;
        r2.f12654m = r0;	 Catch:{ all -> 0x0040 }
        monitor-exit(r2);	 Catch:{ all -> 0x0040 }
        r0 = r2.f12664w;
        if (r0 == 0) goto L_0x002c;
    L_0x0019:
        r0 = r2.f12664w;
        r0 = r0.getLifecycle();
        r0 = r0.mo35a();
        r1 = android.arch.lifecycle.Lifecycle.State.STARTED;
        r0 = r0.isAtLeast(r1);
        if (r0 != 0) goto L_0x002c;
    L_0x002b:
        return;
    L_0x002c:
        r0 = f12644d;
        if (r0 == 0) goto L_0x0038;
    L_0x0030:
        r0 = r2.f12660s;
        r1 = r2.f12661t;
        r0.postFrameCallback(r1);
        goto L_0x003f;
    L_0x0038:
        r0 = r2.f12662u;
        r1 = r2.f12653l;
        r0.post(r1);
    L_0x003f:
        return;
    L_0x0040:
        r0 = move-exception;
        monitor-exit(r2);	 Catch:{ all -> 0x0040 }
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.databinding.ViewDataBinding.e():void");
    }

    /* renamed from: b */
    private boolean m15556b(int i, Object obj, C0110a c0110a) {
        if (obj == null) {
            return m15567a(i);
        }
        C0113f c0113f = this.f12656o[i];
        if (c0113f == null) {
            m15564a(i, obj, c0110a);
            return true;
        } else if (c0113f.m336b() == obj) {
            return false;
        } else {
            m15567a(i);
            m15564a(i, obj, c0110a);
            return true;
        }
    }

    /* renamed from: a */
    protected boolean m15568a(int i, Observable observable) {
        return m15556b(i, (Object) observable, f12645e);
    }

    /* renamed from: a */
    protected void m15564a(int i, Object obj, C0110a c0110a) {
        if (obj != null) {
            C0113f c0113f = this.f12656o[i];
            if (c0113f == null) {
                c0113f = c0110a.mo132a(this, i);
                this.f12656o[i] = c0113f;
                if (this.f12664w != 0) {
                    c0113f.m333a(this.f12664w);
                }
            }
            c0113f.m334a(obj);
        }
    }

    /* renamed from: a */
    protected static Object[] m15550a(DataBindingComponent dataBindingComponent, View view, int i, C0111b c0111b, SparseIntArray sparseIntArray) {
        i = new Object[i];
        m15546a(dataBindingComponent, view, i, c0111b, sparseIntArray, true);
        return i;
    }

    /* renamed from: a */
    protected static Object[] m15551a(DataBindingComponent dataBindingComponent, View[] viewArr, int i, C0111b c0111b, SparseIntArray sparseIntArray) {
        i = new Object[i];
        for (View a : viewArr) {
            m15546a(dataBindingComponent, a, i, c0111b, sparseIntArray, true);
        }
        return i;
    }

    /* renamed from: a */
    private static void m15546a(DataBindingComponent dataBindingComponent, View view, Object[] objArr, C0111b c0111b, SparseIntArray sparseIntArray, boolean z) {
        DataBindingComponent dataBindingComponent2 = dataBindingComponent;
        View view2 = view;
        C0111b c0111b2 = c0111b;
        SparseIntArray sparseIntArray2 = sparseIntArray;
        if (m15553b(view) == null) {
            int lastIndexOf;
            int b;
            int i;
            Object tag = view.getTag();
            String str = tag instanceof String ? (String) tag : null;
            int i2 = 1;
            if (z && str != null && str.startsWith("layout")) {
                lastIndexOf = str.lastIndexOf(95);
                if (lastIndexOf > 0) {
                    lastIndexOf++;
                    if (m15549a(str, lastIndexOf)) {
                        b = m15552b(str, lastIndexOf);
                        if (objArr[b] == null) {
                            objArr[b] = view2;
                        }
                        if (c0111b2 == null) {
                            b = -1;
                        }
                        lastIndexOf = b;
                        tag = 1;
                        i = lastIndexOf;
                    }
                }
                tag = null;
                lastIndexOf = -1;
                i = lastIndexOf;
            } else if (str == null || !str.startsWith("binding_")) {
                tag = null;
                i = -1;
            } else {
                b = m15552b(str, f12643c);
                if (objArr[b] == null) {
                    objArr[b] = view2;
                }
                if (c0111b2 == null) {
                    b = -1;
                }
                i = b;
                tag = 1;
            }
            if (tag == null) {
                b = view.getId();
                if (b > 0 && sparseIntArray2 != null) {
                    b = sparseIntArray2.get(b, -1);
                    if (b >= 0 && objArr[b] == null) {
                        objArr[b] = view2;
                    }
                }
            }
            if (view2 instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view2;
                int childCount = viewGroup.getChildCount();
                int i3 = 0;
                b = 0;
                while (i3 < childCount) {
                    int i4;
                    int i5;
                    View childAt = viewGroup.getChildAt(i3);
                    if (i >= 0 && (childAt.getTag() instanceof String)) {
                        String str2 = (String) childAt.getTag();
                        if (str2.endsWith("_0") && str2.startsWith("layout") && str2.indexOf(47) > 0) {
                            lastIndexOf = m15544a(str2, b, c0111b2, i);
                            if (lastIndexOf >= 0) {
                                b = lastIndexOf + 1;
                                int i6 = c0111b2.f257b[i][lastIndexOf];
                                lastIndexOf = c0111b2.f258c[i][lastIndexOf];
                                int a = m15543a(viewGroup, i3);
                                if (a == i3) {
                                    objArr[i6] = C0119f.m357a(dataBindingComponent2, childAt, lastIndexOf);
                                    i4 = i3;
                                    i5 = b;
                                } else {
                                    a = (a - i3) + i2;
                                    View[] viewArr = new View[a];
                                    for (i4 = 0; i4 < a; i4++) {
                                        viewArr[i4] = viewGroup.getChildAt(i3 + i4);
                                    }
                                    objArr[i6] = C0119f.m359a(dataBindingComponent2, viewArr, lastIndexOf);
                                    i4 = i3 + (a - 1);
                                    i5 = b;
                                    i2 = 1;
                                }
                                if (i2 == 0) {
                                    m15546a(dataBindingComponent2, childAt, objArr, c0111b2, sparseIntArray2, false);
                                }
                                i3 = i4 + 1;
                                b = i5;
                                i2 = 1;
                            }
                        }
                    }
                    i4 = i3;
                    i5 = b;
                    i2 = 0;
                    if (i2 == 0) {
                        m15546a(dataBindingComponent2, childAt, objArr, c0111b2, sparseIntArray2, false);
                    }
                    i3 = i4 + 1;
                    b = i5;
                    i2 = 1;
                }
            }
        }
    }

    /* renamed from: a */
    private static int m15544a(String str, int i, C0111b c0111b, int i2) {
        str = str.subSequence(str.indexOf(47) + 1, str.length() - 2);
        c0111b = c0111b.f256a[i2];
        i2 = c0111b.length;
        while (i < i2) {
            if (TextUtils.equals(str, c0111b[i])) {
                return i;
            }
            i++;
        }
        return -1;
    }

    /* renamed from: a */
    private static int m15543a(ViewGroup viewGroup, int i) {
        String str = (String) viewGroup.getChildAt(i).getTag();
        String substring = str.substring(0, str.length() - 1);
        int length = substring.length();
        int childCount = viewGroup.getChildCount();
        for (int i2 = i + 1; i2 < childCount; i2++) {
            View childAt = viewGroup.getChildAt(i2);
            String str2 = childAt.getTag() instanceof String ? (String) childAt.getTag() : null;
            if (str2 != null && str2.startsWith(substring)) {
                if (str2.length() == str.length() && str2.charAt(str2.length() - 1) == '0') {
                    return i;
                }
                if (m15549a(str2, length)) {
                    i = i2;
                }
            }
        }
        return i;
    }

    /* renamed from: a */
    private static boolean m15549a(String str, int i) {
        int length = str.length();
        if (length == i) {
            return false;
        }
        while (i < length) {
            if (!Character.isDigit(str.charAt(i))) {
                return false;
            }
            i++;
        }
        return true;
    }

    /* renamed from: b */
    private static int m15552b(String str, int i) {
        int i2 = 0;
        while (i < str.length()) {
            i2 = (i2 * 10) + (str.charAt(i) - 48);
            i++;
        }
        return i2;
    }

    /* renamed from: j */
    private static void m15562j() {
        while (true) {
            Reference poll = f12650j.poll();
            if (poll == null) {
                return;
            }
            if (poll instanceof C0113f) {
                ((C0113f) poll).m335a();
            }
        }
    }
}
