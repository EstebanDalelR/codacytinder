package android.support.v4.app;

import android.support.v4.app.C2832k.C0403g;
import android.support.v4.app.Fragment.C0369b;
import android.support.v4.app.FragmentManager.BackStackEntry;
import android.support.v4.util.C0549e;
import android.util.Log;
import com.tinder.domain.config.model.ProfileEditingConfig;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;
import java.util.ArrayList;

/* renamed from: android.support.v4.app.c */
final class C2826c extends C0405n implements BackStackEntry, C0403g {
    /* renamed from: a */
    final C2832k f8933a;
    /* renamed from: b */
    ArrayList<C0388a> f8934b = new ArrayList();
    /* renamed from: c */
    int f8935c;
    /* renamed from: d */
    int f8936d;
    /* renamed from: e */
    int f8937e;
    /* renamed from: f */
    int f8938f;
    /* renamed from: g */
    int f8939g;
    /* renamed from: h */
    int f8940h;
    /* renamed from: i */
    boolean f8941i;
    /* renamed from: j */
    boolean f8942j = true;
    /* renamed from: k */
    String f8943k;
    /* renamed from: l */
    boolean f8944l;
    /* renamed from: m */
    int f8945m = -1;
    /* renamed from: n */
    int f8946n;
    /* renamed from: o */
    CharSequence f8947o;
    /* renamed from: p */
    int f8948p;
    /* renamed from: q */
    CharSequence f8949q;
    /* renamed from: r */
    ArrayList<String> f8950r;
    /* renamed from: s */
    ArrayList<String> f8951s;
    /* renamed from: t */
    boolean f8952t = false;
    /* renamed from: u */
    ArrayList<Runnable> f8953u;

    /* renamed from: android.support.v4.app.c$a */
    static final class C0388a {
        /* renamed from: a */
        int f1316a;
        /* renamed from: b */
        Fragment f1317b;
        /* renamed from: c */
        int f1318c;
        /* renamed from: d */
        int f1319d;
        /* renamed from: e */
        int f1320e;
        /* renamed from: f */
        int f1321f;

        C0388a() {
        }

        C0388a(int i, Fragment fragment) {
            this.f1316a = i;
            this.f1317b = fragment;
        }
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder(ProfileEditingConfig.DEFAULT_MAX_LENGTH);
        stringBuilder.append("BackStackEntry{");
        stringBuilder.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.f8945m >= 0) {
            stringBuilder.append(" #");
            stringBuilder.append(this.f8945m);
        }
        if (this.f8943k != null) {
            stringBuilder.append(" ");
            stringBuilder.append(this.f8943k);
        }
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    /* renamed from: a */
    public void m11036a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        m11037a(str, printWriter, true);
    }

    /* renamed from: a */
    public void m11037a(String str, PrintWriter printWriter, boolean z) {
        if (z) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.f8943k);
            printWriter.print(" mIndex=");
            printWriter.print(this.f8945m);
            printWriter.print(" mCommitted=");
            printWriter.println(this.f8944l);
            if (this.f8939g != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.f8939g));
                printWriter.print(" mTransitionStyle=#");
                printWriter.println(Integer.toHexString(this.f8940h));
            }
            if (!(this.f8935c == 0 && this.f8936d == 0)) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f8935c));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.f8936d));
            }
            if (!(this.f8937e == 0 && this.f8938f == 0)) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f8937e));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.f8938f));
            }
            if (!(this.f8946n == 0 && this.f8947o == null)) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.f8946n));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.f8947o);
            }
            if (!(this.f8948p == 0 && this.f8949q == null)) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.f8948p));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.f8949q);
            }
        }
        if (!this.f8934b.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Operations:");
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(str);
            stringBuilder.append("    ");
            stringBuilder.toString();
            int size = this.f8934b.size();
            for (int i = 0; i < size; i++) {
                String str2;
                C0388a c0388a = (C0388a) this.f8934b.get(i);
                switch (c0388a.f1316a) {
                    case 0:
                        str2 = "NULL";
                        break;
                    case 1:
                        str2 = "ADD";
                        break;
                    case 2:
                        str2 = "REPLACE";
                        break;
                    case 3:
                        str2 = "REMOVE";
                        break;
                    case 4:
                        str2 = "HIDE";
                        break;
                    case 5:
                        str2 = "SHOW";
                        break;
                    case 6:
                        str2 = "DETACH";
                        break;
                    case 7:
                        str2 = "ATTACH";
                        break;
                    case 8:
                        str2 = "SET_PRIMARY_NAV";
                        break;
                    case 9:
                        str2 = "UNSET_PRIMARY_NAV";
                        break;
                    default:
                        StringBuilder stringBuilder2 = new StringBuilder();
                        stringBuilder2.append("cmd=");
                        stringBuilder2.append(c0388a.f1316a);
                        str2 = stringBuilder2.toString();
                        break;
                }
                printWriter.print(str);
                printWriter.print("  Op #");
                printWriter.print(i);
                printWriter.print(": ");
                printWriter.print(str2);
                printWriter.print(" ");
                printWriter.println(c0388a.f1317b);
                if (z) {
                    if (!(c0388a.f1318c == 0 && c0388a.f1319d == 0)) {
                        printWriter.print(str);
                        printWriter.print("enterAnim=#");
                        printWriter.print(Integer.toHexString(c0388a.f1318c));
                        printWriter.print(" exitAnim=#");
                        printWriter.println(Integer.toHexString(c0388a.f1319d));
                    }
                    if (c0388a.f1320e != 0 || c0388a.f1321f != 0) {
                        printWriter.print(str);
                        printWriter.print("popEnterAnim=#");
                        printWriter.print(Integer.toHexString(c0388a.f1320e));
                        printWriter.print(" popExitAnim=#");
                        printWriter.println(Integer.toHexString(c0388a.f1321f));
                    }
                }
            }
        }
    }

    public C2826c(C2832k c2832k) {
        this.f8933a = c2832k;
    }

    public int getId() {
        return this.f8945m;
    }

    public int getBreadCrumbTitleRes() {
        return this.f8946n;
    }

    public int getBreadCrumbShortTitleRes() {
        return this.f8948p;
    }

    public CharSequence getBreadCrumbTitle() {
        if (this.f8946n != 0) {
            return this.f8933a.f8993m.m11070i().getText(this.f8946n);
        }
        return this.f8947o;
    }

    public CharSequence getBreadCrumbShortTitle() {
        if (this.f8948p != 0) {
            return this.f8933a.f8993m.m11070i().getText(this.f8948p);
        }
        return this.f8949q;
    }

    /* renamed from: a */
    void m11035a(C0388a c0388a) {
        this.f8934b.add(c0388a);
        c0388a.f1318c = this.f8935c;
        c0388a.f1319d = this.f8936d;
        c0388a.f1320e = this.f8937e;
        c0388a.f1321f = this.f8938f;
    }

    /* renamed from: a */
    public C0405n mo405a(Fragment fragment, String str) {
        m11021a(0, fragment, str, 1);
        return this;
    }

    /* renamed from: a */
    public C0405n mo402a(int i, Fragment fragment) {
        m11021a(i, fragment, null, 1);
        return this;
    }

    /* renamed from: a */
    public C0405n mo403a(int i, Fragment fragment, String str) {
        m11021a(i, fragment, str, 1);
        return this;
    }

    /* renamed from: a */
    private void m11021a(int i, Fragment fragment, String str, int i2) {
        Class cls = fragment.getClass();
        int modifiers = cls.getModifiers();
        if (!cls.isAnonymousClass() && Modifier.isPublic(modifiers)) {
            if (!cls.isMemberClass() || Modifier.isStatic(modifiers)) {
                fragment.mFragmentManager = this.f8933a;
                if (str != null) {
                    if (fragment.mTag == null || str.equals(fragment.mTag)) {
                        fragment.mTag = str;
                    } else {
                        i2 = new StringBuilder();
                        i2.append("Can't change tag of fragment ");
                        i2.append(fragment);
                        i2.append(": was ");
                        i2.append(fragment.mTag);
                        i2.append(" now ");
                        i2.append(str);
                        throw new IllegalStateException(i2.toString());
                    }
                }
                if (i != 0) {
                    if (i == -1) {
                        i2 = new StringBuilder();
                        i2.append("Can't add fragment ");
                        i2.append(fragment);
                        i2.append(" with tag ");
                        i2.append(str);
                        i2.append(" to container view with no id");
                        throw new IllegalArgumentException(i2.toString());
                    } else if (fragment.mFragmentId == null || fragment.mFragmentId == i) {
                        fragment.mFragmentId = i;
                        fragment.mContainerId = i;
                    } else {
                        i2 = new StringBuilder();
                        i2.append("Can't change container ID of fragment ");
                        i2.append(fragment);
                        i2.append(": was ");
                        i2.append(fragment.mFragmentId);
                        i2.append(" now ");
                        i2.append(i);
                        throw new IllegalStateException(i2.toString());
                    }
                }
                m11035a(new C0388a(i2, fragment));
                return;
            }
        }
        fragment = new StringBuilder();
        fragment.append("Fragment ");
        fragment.append(cls.getCanonicalName());
        fragment.append(" must be a public static class to be  properly recreated from");
        fragment.append(" instance state.");
        throw new IllegalStateException(fragment.toString());
    }

    /* renamed from: b */
    public C0405n mo408b(int i, Fragment fragment) {
        return m11042b(i, fragment, null);
    }

    /* renamed from: b */
    public C0405n m11042b(int i, Fragment fragment, String str) {
        if (i == 0) {
            throw new IllegalArgumentException("Must use non-zero containerViewId");
        }
        m11021a(i, fragment, str, 2);
        return this;
    }

    /* renamed from: a */
    public C0405n mo404a(Fragment fragment) {
        m11035a(new C0388a(3, fragment));
        return this;
    }

    /* renamed from: b */
    public C0405n mo409b(Fragment fragment) {
        m11035a(new C0388a(6, fragment));
        return this;
    }

    /* renamed from: c */
    public C0405n mo411c(Fragment fragment) {
        m11035a(new C0388a(7, fragment));
        return this;
    }

    /* renamed from: a */
    public C0405n mo400a(int i, int i2) {
        return mo401a(i, i2, 0, 0);
    }

    /* renamed from: a */
    public C0405n mo401a(int i, int i2, int i3, int i4) {
        this.f8935c = i;
        this.f8936d = i2;
        this.f8937e = i3;
        this.f8938f = i4;
        return this;
    }

    /* renamed from: a */
    public C0405n mo406a(String str) {
        if (this.f8942j) {
            this.f8941i = true;
            this.f8943k = str;
            return this;
        }
        throw new IllegalStateException("This FragmentTransaction is not allowed to be added to the back stack.");
    }

    /* renamed from: a */
    public C0405n mo399a() {
        if (this.f8941i) {
            throw new IllegalStateException("This transaction is already being added to the back stack");
        }
        this.f8942j = false;
        return this;
    }

    /* renamed from: a */
    void m11033a(int i) {
        if (this.f8941i) {
            if (C2832k.f8974a) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Bump nesting in ");
                stringBuilder.append(this);
                stringBuilder.append(" by ");
                stringBuilder.append(i);
                Log.v("FragmentManager", stringBuilder.toString());
            }
            int size = this.f8934b.size();
            for (int i2 = 0; i2 < size; i2++) {
                C0388a c0388a = (C0388a) this.f8934b.get(i2);
                if (c0388a.f1317b != null) {
                    Fragment fragment = c0388a.f1317b;
                    fragment.mBackStackNesting += i;
                    if (C2832k.f8974a) {
                        StringBuilder stringBuilder2 = new StringBuilder();
                        stringBuilder2.append("Bump nesting of ");
                        stringBuilder2.append(c0388a.f1317b);
                        stringBuilder2.append(" to ");
                        stringBuilder2.append(c0388a.f1317b.mBackStackNesting);
                        Log.v("FragmentManager", stringBuilder2.toString());
                    }
                }
            }
        }
    }

    /* renamed from: b */
    public void m11044b() {
        if (this.f8953u != null) {
            int size = this.f8953u.size();
            for (int i = 0; i < size; i++) {
                ((Runnable) this.f8953u.get(i)).run();
            }
            this.f8953u = null;
        }
    }

    /* renamed from: c */
    public int mo410c() {
        return m11023a(false);
    }

    /* renamed from: d */
    public int mo412d() {
        return m11023a(true);
    }

    /* renamed from: e */
    public void mo413e() {
        mo399a();
        this.f8933a.m11150b((C0403g) this, false);
    }

    /* renamed from: f */
    public void mo414f() {
        mo399a();
        this.f8933a.m11150b((C0403g) this, true);
    }

    /* renamed from: a */
    int m11023a(boolean z) {
        if (this.f8944l) {
            throw new IllegalStateException("commit already called");
        }
        if (C2832k.f8974a) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Commit: ");
            stringBuilder.append(this);
            Log.v("FragmentManager", stringBuilder.toString());
            PrintWriter printWriter = new PrintWriter(new C0549e("FragmentManager"));
            m11036a("  ", null, printWriter, null);
            printWriter.close();
        }
        this.f8944l = true;
        if (this.f8941i) {
            this.f8945m = this.f8933a.m11115a(this);
        } else {
            this.f8945m = -1;
        }
        this.f8933a.m11136a((C0403g) this, z);
        return this.f8945m;
    }

    /* renamed from: a */
    public boolean mo407a(ArrayList<C2826c> arrayList, ArrayList<Boolean> arrayList2) {
        if (C2832k.f8974a) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Run: ");
            stringBuilder.append(this);
            Log.v("FragmentManager", stringBuilder.toString());
        }
        arrayList.add(this);
        arrayList2.add(Boolean.valueOf(null));
        if (this.f8941i != null) {
            this.f8933a.m11149b(this);
        }
        return true;
    }

    /* renamed from: b */
    boolean m11046b(int i) {
        int size = this.f8934b.size();
        for (int i2 = 0; i2 < size; i2++) {
            C0388a c0388a = (C0388a) this.f8934b.get(i2);
            int i3 = c0388a.f1317b != null ? c0388a.f1317b.mContainerId : 0;
            if (i3 != 0 && i3 == i) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    boolean m11038a(ArrayList<C2826c> arrayList, int i, int i2) {
        if (i2 == i) {
            return false;
        }
        int size = this.f8934b.size();
        int i3 = -1;
        for (int i4 = 0; i4 < size; i4++) {
            C0388a c0388a = (C0388a) this.f8934b.get(i4);
            int i5 = c0388a.f1317b != null ? c0388a.f1317b.mContainerId : 0;
            if (!(i5 == 0 || i5 == r3)) {
                for (i3 = i; i3 < i2; i3++) {
                    C2826c c2826c = (C2826c) arrayList.get(i3);
                    int size2 = c2826c.f8934b.size();
                    for (int i6 = 0; i6 < size2; i6++) {
                        C0388a c0388a2 = (C0388a) c2826c.f8934b.get(i6);
                        if ((c0388a2.f1317b != null ? c0388a2.f1317b.mContainerId : 0) == i5) {
                            return true;
                        }
                    }
                }
                i3 = i5;
            }
        }
        return false;
    }

    /* renamed from: g */
    void m11052g() {
        int size = this.f8934b.size();
        for (int i = 0; i < size; i++) {
            C0388a c0388a = (C0388a) this.f8934b.get(i);
            Fragment fragment = c0388a.f1317b;
            if (fragment != null) {
                fragment.setNextTransition(this.f8939g, this.f8940h);
            }
            int i2 = c0388a.f1316a;
            if (i2 != 1) {
                switch (i2) {
                    case 3:
                        fragment.setNextAnim(c0388a.f1319d);
                        this.f8933a.m11177i(fragment);
                        break;
                    case 4:
                        fragment.setNextAnim(c0388a.f1319d);
                        this.f8933a.m11180j(fragment);
                        break;
                    case 5:
                        fragment.setNextAnim(c0388a.f1318c);
                        this.f8933a.m11182k(fragment);
                        break;
                    case 6:
                        fragment.setNextAnim(c0388a.f1319d);
                        this.f8933a.m11184l(fragment);
                        break;
                    case 7:
                        fragment.setNextAnim(c0388a.f1318c);
                        this.f8933a.m11186m(fragment);
                        break;
                    case 8:
                        this.f8933a.m11192p(fragment);
                        break;
                    case 9:
                        this.f8933a.m11192p(null);
                        break;
                    default:
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("Unknown cmd: ");
                        stringBuilder.append(c0388a.f1316a);
                        throw new IllegalArgumentException(stringBuilder.toString());
                }
            }
            fragment.setNextAnim(c0388a.f1318c);
            this.f8933a.m11132a(fragment, false);
            if (!(this.f8952t || c0388a.f1316a == 1 || fragment == null)) {
                this.f8933a.m11168f(fragment);
            }
        }
        if (!this.f8952t) {
            this.f8933a.m11124a(this.f8933a.f8992l, true);
        }
    }

    /* renamed from: b */
    void m11045b(boolean z) {
        for (int size = this.f8934b.size() - 1; size >= 0; size--) {
            C0388a c0388a = (C0388a) this.f8934b.get(size);
            Fragment fragment = c0388a.f1317b;
            if (fragment != null) {
                fragment.setNextTransition(C2832k.m11111d(this.f8939g), this.f8940h);
            }
            int i = c0388a.f1316a;
            if (i != 1) {
                switch (i) {
                    case 3:
                        fragment.setNextAnim(c0388a.f1320e);
                        this.f8933a.m11132a(fragment, false);
                        break;
                    case 4:
                        fragment.setNextAnim(c0388a.f1320e);
                        this.f8933a.m11182k(fragment);
                        break;
                    case 5:
                        fragment.setNextAnim(c0388a.f1321f);
                        this.f8933a.m11180j(fragment);
                        break;
                    case 6:
                        fragment.setNextAnim(c0388a.f1320e);
                        this.f8933a.m11186m(fragment);
                        break;
                    case 7:
                        fragment.setNextAnim(c0388a.f1321f);
                        this.f8933a.m11184l(fragment);
                        break;
                    case 8:
                        this.f8933a.m11192p(null);
                        break;
                    case 9:
                        this.f8933a.m11192p(fragment);
                        break;
                    default:
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("Unknown cmd: ");
                        stringBuilder.append(c0388a.f1316a);
                        throw new IllegalArgumentException(stringBuilder.toString());
                }
            }
            fragment.setNextAnim(c0388a.f1321f);
            this.f8933a.m11177i(fragment);
            if (!(this.f8952t || c0388a.f1316a == 3 || fragment == null)) {
                this.f8933a.m11168f(fragment);
            }
        }
        if (!this.f8952t && z) {
            this.f8933a.m11124a(this.f8933a.f8992l, true);
        }
    }

    /* renamed from: a */
    Fragment m11024a(ArrayList<Fragment> arrayList, Fragment fragment) {
        Fragment fragment2 = fragment;
        fragment = null;
        while (fragment < this.f8934b.size()) {
            C0388a c0388a = (C0388a) this.f8934b.get(fragment);
            switch (c0388a.f1316a) {
                case 1:
                case 7:
                    arrayList.add(c0388a.f1317b);
                    break;
                case 2:
                    Fragment fragment3 = c0388a.f1317b;
                    int i = fragment3.mContainerId;
                    Fragment fragment4 = fragment2;
                    int i2 = fragment;
                    fragment = null;
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        Fragment fragment5 = (Fragment) arrayList.get(size);
                        if (fragment5.mContainerId == i) {
                            if (fragment5 == fragment3) {
                                fragment = true;
                            } else {
                                if (fragment5 == fragment4) {
                                    this.f8934b.add(i2, new C0388a(9, fragment5));
                                    i2++;
                                    fragment4 = null;
                                }
                                C0388a c0388a2 = new C0388a(3, fragment5);
                                c0388a2.f1318c = c0388a.f1318c;
                                c0388a2.f1320e = c0388a.f1320e;
                                c0388a2.f1319d = c0388a.f1319d;
                                c0388a2.f1321f = c0388a.f1321f;
                                this.f8934b.add(i2, c0388a2);
                                arrayList.remove(fragment5);
                                i2++;
                            }
                        }
                    }
                    if (fragment != null) {
                        this.f8934b.remove(i2);
                        i2--;
                    } else {
                        c0388a.f1316a = 1;
                        arrayList.add(fragment3);
                    }
                    fragment = i2;
                    fragment2 = fragment4;
                    break;
                case 3:
                case 6:
                    arrayList.remove(c0388a.f1317b);
                    if (c0388a.f1317b != fragment2) {
                        break;
                    }
                    this.f8934b.add(fragment, new C0388a(9, c0388a.f1317b));
                    fragment++;
                    fragment2 = null;
                    break;
                case 8:
                    this.f8934b.add(fragment, new C0388a(9, fragment2));
                    fragment++;
                    fragment2 = c0388a.f1317b;
                    break;
                default:
                    break;
            }
            fragment += 1;
        }
        return fragment2;
    }

    /* renamed from: b */
    Fragment m11040b(ArrayList<Fragment> arrayList, Fragment fragment) {
        for (int i = 0; i < this.f8934b.size(); i++) {
            C0388a c0388a = (C0388a) this.f8934b.get(i);
            int i2 = c0388a.f1316a;
            if (i2 != 1) {
                if (i2 != 3) {
                    switch (i2) {
                        case 6:
                            break;
                        case 7:
                            break;
                        case 8:
                            fragment = null;
                            break;
                        case 9:
                            fragment = c0388a.f1317b;
                            break;
                        default:
                            break;
                    }
                }
                arrayList.add(c0388a.f1317b);
            }
            arrayList.remove(c0388a.f1317b);
        }
        return fragment;
    }

    /* renamed from: h */
    boolean m11053h() {
        for (int i = 0; i < this.f8934b.size(); i++) {
            if (C2826c.m11022b((C0388a) this.f8934b.get(i))) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    void m11034a(C0369b c0369b) {
        for (int i = 0; i < this.f8934b.size(); i++) {
            C0388a c0388a = (C0388a) this.f8934b.get(i);
            if (C2826c.m11022b(c0388a)) {
                c0388a.f1317b.setOnStartEnterTransitionListener(c0369b);
            }
        }
    }

    /* renamed from: b */
    private static boolean m11022b(C0388a c0388a) {
        c0388a = c0388a.f1317b;
        return (c0388a == null || !c0388a.mAdded || c0388a.mView == null || c0388a.mDetached || c0388a.mHidden || c0388a.isPostponed() == null) ? null : true;
    }

    public String getName() {
        return this.f8943k;
    }

    /* renamed from: i */
    public boolean mo421i() {
        return this.f8934b.isEmpty();
    }
}
