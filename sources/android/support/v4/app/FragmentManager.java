package android.support.v4.app;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.IdRes;
import android.support.annotation.StringRes;
import android.support.v4.app.Fragment.SavedState;
import android.view.View;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.List;

public abstract class FragmentManager {

    public interface BackStackEntry {
        CharSequence getBreadCrumbShortTitle();

        @StringRes
        int getBreadCrumbShortTitleRes();

        CharSequence getBreadCrumbTitle();

        @StringRes
        int getBreadCrumbTitleRes();

        int getId();

        String getName();
    }

    public interface OnBackStackChangedListener {
        void onBackStackChanged();
    }

    /* renamed from: android.support.v4.app.FragmentManager$a */
    public static abstract class C0372a {
        /* renamed from: a */
        public void mo28a(FragmentManager fragmentManager, Fragment fragment) {
        }

        /* renamed from: a */
        public void m1335a(FragmentManager fragmentManager, Fragment fragment, Context context) {
        }

        /* renamed from: a */
        public void mo32a(FragmentManager fragmentManager, Fragment fragment, Bundle bundle) {
        }

        /* renamed from: a */
        public void m1337a(FragmentManager fragmentManager, Fragment fragment, View view, Bundle bundle) {
        }

        /* renamed from: b */
        public void mo33b(FragmentManager fragmentManager, Fragment fragment) {
        }

        /* renamed from: b */
        public void m1339b(FragmentManager fragmentManager, Fragment fragment, Context context) {
        }

        /* renamed from: b */
        public void m1340b(FragmentManager fragmentManager, Fragment fragment, Bundle bundle) {
        }

        /* renamed from: c */
        public void mo34c(FragmentManager fragmentManager, Fragment fragment) {
        }

        /* renamed from: c */
        public void m1342c(FragmentManager fragmentManager, Fragment fragment, Bundle bundle) {
        }

        /* renamed from: d */
        public void m1343d(FragmentManager fragmentManager, Fragment fragment) {
        }

        /* renamed from: d */
        public void m1344d(FragmentManager fragmentManager, Fragment fragment, Bundle bundle) {
        }

        /* renamed from: e */
        public void m1345e(FragmentManager fragmentManager, Fragment fragment) {
        }

        /* renamed from: f */
        public void m1346f(FragmentManager fragmentManager, Fragment fragment) {
        }

        /* renamed from: g */
        public void m1347g(FragmentManager fragmentManager, Fragment fragment) {
        }
    }

    /* renamed from: a */
    public abstract SavedState mo425a(Fragment fragment);

    /* renamed from: a */
    public abstract Fragment mo426a(@IdRes int i);

    /* renamed from: a */
    public abstract Fragment mo427a(Bundle bundle, String str);

    /* renamed from: a */
    public abstract Fragment mo428a(String str);

    /* renamed from: a */
    public abstract C0405n mo429a();

    /* renamed from: a */
    public abstract void mo430a(int i, int i2);

    /* renamed from: a */
    public abstract void mo431a(Bundle bundle, String str, Fragment fragment);

    /* renamed from: a */
    public abstract void mo432a(C0372a c0372a);

    /* renamed from: a */
    public abstract void mo433a(C0372a c0372a, boolean z);

    /* renamed from: a */
    public abstract void mo434a(String str, int i);

    /* renamed from: a */
    public abstract void mo435a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

    /* renamed from: b */
    public abstract boolean mo436b();

    /* renamed from: c */
    public abstract boolean mo437c();

    /* renamed from: d */
    public abstract int mo438d();

    /* renamed from: e */
    public abstract List<Fragment> mo439e();

    /* renamed from: f */
    public abstract boolean mo440f();

    /* renamed from: g */
    public abstract boolean mo441g();
}
