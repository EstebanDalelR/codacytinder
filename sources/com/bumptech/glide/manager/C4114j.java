package com.bumptech.glide.manager;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.support.v4.app.Fragment;
import android.util.Log;
import com.bumptech.glide.RequestManager;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.bumptech.glide.manager.j */
public class C4114j extends Fragment {
    /* renamed from: a */
    private RequestManager f12996a;
    /* renamed from: b */
    private final C3111a f12997b;
    /* renamed from: c */
    private final RequestManagerTreeNode f12998c;
    /* renamed from: d */
    private final HashSet<C4114j> f12999d;
    /* renamed from: e */
    private C4114j f13000e;

    /* renamed from: com.bumptech.glide.manager.j$a */
    private class C3115a implements RequestManagerTreeNode {
        /* renamed from: a */
        final /* synthetic */ C4114j f9631a;

        private C3115a(C4114j c4114j) {
            this.f9631a = c4114j;
        }

        public Set<RequestManager> getDescendants() {
            Set<C4114j> d = this.f9631a.m15991d();
            Set hashSet = new HashSet(d.size());
            for (C4114j c4114j : d) {
                if (c4114j.m15989b() != null) {
                    hashSet.add(c4114j.m15989b());
                }
            }
            return hashSet;
        }
    }

    public C4114j() {
        this(new C3111a());
    }

    @SuppressLint({"ValidFragment"})
    public C4114j(C3111a c3111a) {
        this.f12998c = new C3115a();
        this.f12999d = new HashSet();
        this.f12997b = c3111a;
    }

    /* renamed from: a */
    public void m15988a(RequestManager requestManager) {
        this.f12996a = requestManager;
    }

    /* renamed from: a */
    C3111a m15987a() {
        return this.f12997b;
    }

    /* renamed from: b */
    public RequestManager m15989b() {
        return this.f12996a;
    }

    /* renamed from: c */
    public RequestManagerTreeNode m15990c() {
        return this.f12998c;
    }

    /* renamed from: a */
    private void m15984a(C4114j c4114j) {
        this.f12999d.add(c4114j);
    }

    /* renamed from: b */
    private void m15986b(C4114j c4114j) {
        this.f12999d.remove(c4114j);
    }

    /* renamed from: d */
    public Set<C4114j> m15991d() {
        if (this.f13000e == null) {
            return Collections.emptySet();
        }
        if (this.f13000e == this) {
            return Collections.unmodifiableSet(this.f12999d);
        }
        Set hashSet = new HashSet();
        for (C4114j c4114j : this.f13000e.m15991d()) {
            if (m15985a(c4114j.getParentFragment())) {
                hashSet.add(c4114j);
            }
        }
        return Collections.unmodifiableSet(hashSet);
    }

    /* renamed from: a */
    private boolean m15985a(Fragment fragment) {
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
            this.f13000e = C1063h.m3655a().m3664a(getActivity().getSupportFragmentManager());
            if (this.f13000e != this) {
                this.f13000e.m15984a(this);
            }
        } catch (Activity activity2) {
            if (Log.isLoggable("SupportRMFragment", 5)) {
                Log.w("SupportRMFragment", "Unable to register fragment with root", activity2);
            }
        }
    }

    public void onDetach() {
        super.onDetach();
        if (this.f13000e != null) {
            this.f13000e.m15986b(this);
            this.f13000e = null;
        }
    }

    public void onStart() {
        super.onStart();
        this.f12997b.m12073a();
    }

    public void onStop() {
        super.onStop();
        this.f12997b.m12074b();
    }

    public void onDestroy() {
        super.onDestroy();
        this.f12997b.m12075c();
    }

    public void onLowMemory() {
        super.onLowMemory();
        if (this.f12996a != null) {
            this.f12996a.m11776a();
        }
    }
}
