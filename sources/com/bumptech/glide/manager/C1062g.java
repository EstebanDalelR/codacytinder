package com.bumptech.glide.manager;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Fragment;
import android.os.Build.VERSION;
import android.util.Log;
import com.bumptech.glide.RequestManager;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

@TargetApi(11)
/* renamed from: com.bumptech.glide.manager.g */
public class C1062g extends Fragment {
    /* renamed from: a */
    private final C3111a f2900a;
    /* renamed from: b */
    private final RequestManagerTreeNode f2901b;
    /* renamed from: c */
    private RequestManager f2902c;
    /* renamed from: d */
    private final HashSet<C1062g> f2903d;
    /* renamed from: e */
    private C1062g f2904e;

    /* renamed from: com.bumptech.glide.manager.g$a */
    private class C3114a implements RequestManagerTreeNode {
        /* renamed from: a */
        final /* synthetic */ C1062g f9630a;

        private C3114a(C1062g c1062g) {
            this.f9630a = c1062g;
        }

        public Set<RequestManager> getDescendants() {
            Set<C1062g> d = this.f9630a.m3654d();
            Set hashSet = new HashSet(d.size());
            for (C1062g c1062g : d) {
                if (c1062g.m3652b() != null) {
                    hashSet.add(c1062g.m3652b());
                }
            }
            return hashSet;
        }
    }

    public C1062g() {
        this(new C3111a());
    }

    @SuppressLint({"ValidFragment"})
    C1062g(C3111a c3111a) {
        this.f2901b = new C3114a();
        this.f2903d = new HashSet();
        this.f2900a = c3111a;
    }

    /* renamed from: a */
    public void m3651a(RequestManager requestManager) {
        this.f2902c = requestManager;
    }

    /* renamed from: a */
    C3111a m3650a() {
        return this.f2900a;
    }

    /* renamed from: b */
    public RequestManager m3652b() {
        return this.f2902c;
    }

    /* renamed from: c */
    public RequestManagerTreeNode m3653c() {
        return this.f2901b;
    }

    /* renamed from: a */
    private void m3647a(C1062g c1062g) {
        this.f2903d.add(c1062g);
    }

    /* renamed from: b */
    private void m3649b(C1062g c1062g) {
        this.f2903d.remove(c1062g);
    }

    @TargetApi(17)
    /* renamed from: d */
    public Set<C1062g> m3654d() {
        if (this.f2904e == this) {
            return Collections.unmodifiableSet(this.f2903d);
        }
        if (this.f2904e != null) {
            if (VERSION.SDK_INT >= 17) {
                Set hashSet = new HashSet();
                for (C1062g c1062g : this.f2904e.m3654d()) {
                    if (m3648a(c1062g.getParentFragment())) {
                        hashSet.add(c1062g);
                    }
                }
                return Collections.unmodifiableSet(hashSet);
            }
        }
        return Collections.emptySet();
    }

    @TargetApi(17)
    /* renamed from: a */
    private boolean m3648a(Fragment fragment) {
        Fragment parentFragment = getParentFragment();
        while (fragment.getParentFragment() != null) {
            if (fragment.getParentFragment() == parentFragment) {
                return true;
            }
            fragment = fragment.getParentFragment();
        }
        return null;
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        try {
            this.f2904e = C1063h.m3655a().m3663a(getActivity().getFragmentManager());
            if (this.f2904e != this) {
                this.f2904e.m3647a(this);
            }
        } catch (Activity activity2) {
            if (Log.isLoggable("RMFragment", 5)) {
                Log.w("RMFragment", "Unable to register fragment with root", activity2);
            }
        }
    }

    public void onDetach() {
        super.onDetach();
        if (this.f2904e != null) {
            this.f2904e.m3649b(this);
            this.f2904e = null;
        }
    }

    public void onStart() {
        super.onStart();
        this.f2900a.m12073a();
    }

    public void onStop() {
        super.onStop();
        this.f2900a.m12074b();
    }

    public void onDestroy() {
        super.onDestroy();
        this.f2900a.m12075c();
    }

    public void onTrimMemory(int i) {
        if (this.f2902c != null) {
            this.f2902c.m11777a(i);
        }
    }

    public void onLowMemory() {
        if (this.f2902c != null) {
            this.f2902c.m11776a();
        }
    }
}
