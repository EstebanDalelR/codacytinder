package com.bumptech.glide.manager;

import com.bumptech.glide.p026d.C0987h;
import com.bumptech.glide.request.Request;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;

/* renamed from: com.bumptech.glide.manager.i */
public class C1064i {
    /* renamed from: a */
    private final Set<Request> f2910a = Collections.newSetFromMap(new WeakHashMap());
    /* renamed from: b */
    private final List<Request> f2911b = new ArrayList();
    /* renamed from: c */
    private boolean f2912c;

    /* renamed from: a */
    public void m3666a(Request request) {
        this.f2910a.add(request);
        if (this.f2912c) {
            this.f2911b.add(request);
        } else {
            request.begin();
        }
    }

    /* renamed from: b */
    public void m3668b(Request request) {
        this.f2910a.remove(request);
        this.f2911b.remove(request);
    }

    /* renamed from: a */
    public void m3665a() {
        this.f2912c = true;
        for (Request request : C0987h.m3409a(this.f2910a)) {
            if (request.isRunning()) {
                request.pause();
                this.f2911b.add(request);
            }
        }
    }

    /* renamed from: b */
    public void m3667b() {
        this.f2912c = false;
        for (Request request : C0987h.m3409a(this.f2910a)) {
            if (!(request.isComplete() || request.isCancelled() || request.isRunning())) {
                request.begin();
            }
        }
        this.f2911b.clear();
    }

    /* renamed from: c */
    public void m3669c() {
        for (Request clear : C0987h.m3409a(this.f2910a)) {
            clear.clear();
        }
        this.f2911b.clear();
    }

    /* renamed from: d */
    public void m3670d() {
        for (Request request : C0987h.m3409a(this.f2910a)) {
            if (!(request.isComplete() || request.isCancelled())) {
                request.pause();
                if (this.f2912c) {
                    this.f2911b.add(request);
                } else {
                    request.begin();
                }
            }
        }
    }
}
