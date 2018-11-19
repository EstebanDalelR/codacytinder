package android.support.v4.app;

import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.app.Fragment.SavedState;
import android.support.v4.view.C0600i;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

/* renamed from: android.support.v4.app.m */
public abstract class C2833m extends C0600i {
    /* renamed from: a */
    private final FragmentManager f9006a;
    /* renamed from: b */
    private C0405n f9007b = null;
    /* renamed from: c */
    private ArrayList<SavedState> f9008c = new ArrayList();
    /* renamed from: d */
    private ArrayList<Fragment> f9009d = new ArrayList();
    /* renamed from: e */
    private Fragment f9010e = null;

    /* renamed from: a */
    public abstract Fragment m11203a(int i);

    public C2833m(FragmentManager fragmentManager) {
        this.f9006a = fragmentManager;
    }

    public void startUpdate(ViewGroup viewGroup) {
        if (viewGroup.getId() == -1) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ViewPager with adapter ");
            stringBuilder.append(this);
            stringBuilder.append(" requires a view id");
            throw new IllegalStateException(stringBuilder.toString());
        }
    }

    public Object instantiateItem(ViewGroup viewGroup, int i) {
        Fragment fragment;
        if (this.f9009d.size() > i) {
            fragment = (Fragment) this.f9009d.get(i);
            if (fragment != null) {
                return fragment;
            }
        }
        if (this.f9007b == null) {
            this.f9007b = this.f9006a.mo429a();
        }
        fragment = m11203a(i);
        if (this.f9008c.size() > i) {
            SavedState savedState = (SavedState) this.f9008c.get(i);
            if (savedState != null) {
                fragment.setInitialSavedState(savedState);
            }
        }
        while (this.f9009d.size() <= i) {
            this.f9009d.add(null);
        }
        fragment.setMenuVisibility(false);
        fragment.setUserVisibleHint(false);
        this.f9009d.set(i, fragment);
        this.f9007b.mo402a(viewGroup.getId(), fragment);
        return fragment;
    }

    public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        Fragment fragment = (Fragment) obj;
        if (this.f9007b == null) {
            this.f9007b = this.f9006a.mo429a();
        }
        while (this.f9008c.size() <= i) {
            this.f9008c.add(null);
        }
        this.f9008c.set(i, fragment.isAdded() ? this.f9006a.mo425a(fragment) : null);
        this.f9009d.set(i, null);
        this.f9007b.mo404a(fragment);
    }

    public void setPrimaryItem(ViewGroup viewGroup, int i, Object obj) {
        Fragment fragment = (Fragment) obj;
        if (fragment != this.f9010e) {
            if (this.f9010e != null) {
                this.f9010e.setMenuVisibility(false);
                this.f9010e.setUserVisibleHint(false);
            }
            if (fragment != null) {
                fragment.setMenuVisibility(true);
                fragment.setUserVisibleHint(true);
            }
            this.f9010e = fragment;
        }
    }

    public void finishUpdate(ViewGroup viewGroup) {
        if (this.f9007b != null) {
            this.f9007b.mo414f();
            this.f9007b = null;
        }
    }

    public boolean isViewFromObject(View view, Object obj) {
        return ((Fragment) obj).getView() == view ? true : null;
    }

    public Parcelable saveState() {
        Parcelable bundle;
        if (this.f9008c.size() > 0) {
            bundle = new Bundle();
            Parcelable[] parcelableArr = new SavedState[this.f9008c.size()];
            this.f9008c.toArray(parcelableArr);
            bundle.putParcelableArray("states", parcelableArr);
        } else {
            bundle = null;
        }
        for (int i = 0; i < this.f9009d.size(); i++) {
            Fragment fragment = (Fragment) this.f9009d.get(i);
            if (fragment != null && fragment.isAdded()) {
                if (bundle == null) {
                    bundle = new Bundle();
                }
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("f");
                stringBuilder.append(i);
                this.f9006a.mo431a(bundle, stringBuilder.toString(), fragment);
            }
        }
        return bundle;
    }

    public void restoreState(Parcelable parcelable, ClassLoader classLoader) {
        if (parcelable != null) {
            Bundle bundle = (Bundle) parcelable;
            bundle.setClassLoader(classLoader);
            classLoader = bundle.getParcelableArray("states");
            this.f9008c.clear();
            this.f9009d.clear();
            if (classLoader != null) {
                for (Object obj : classLoader) {
                    this.f9008c.add((SavedState) obj);
                }
            }
            for (String str : bundle.keySet()) {
                if (str.startsWith("f")) {
                    int parseInt = Integer.parseInt(str.substring(1));
                    Fragment a = this.f9006a.mo427a(bundle, str);
                    if (a != null) {
                        while (this.f9009d.size() <= parseInt) {
                            this.f9009d.add(null);
                        }
                        a.setMenuVisibility(false);
                        this.f9009d.set(parseInt, a);
                    } else {
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("Bad fragment at key ");
                        stringBuilder.append(str);
                        Log.w("FragmentStatePagerAdapt", stringBuilder.toString());
                    }
                }
            }
        }
    }
}
