package com.tinder.profile.presenter;

import android.support.annotation.NonNull;
import com.tinder.adapters.SchoolsAdapter.SchoolRowClickListener;
import com.tinder.deadshot.DeadshotTarget;
import com.tinder.deadshot.Drop;
import com.tinder.domain.common.model.School;
import com.tinder.domain.profile.repository.SchoolRepository;
import com.tinder.domain.profile.usecase.UpdateSchool;
import com.tinder.managers.ManagerAnalytics;
import com.tinder.model.SchoolDisplayType;
import com.tinder.model.SparksEvent;
import com.tinder.profile.p366e.C14415f;
import com.tinder.profile.p366e.C14415f.C14414a;
import com.tinder.targets.SchoolTarget;
import io.reactivex.disposables.C17356a;
import io.reactivex.p453a.p455b.C15674a;
import io.reactivex.schedulers.C15756a;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import javax.inject.Inject;
import p000a.p001a.C0001a;

public class bf {
    @DeadshotTarget
    /* renamed from: a */
    SchoolTarget f45670a;
    /* renamed from: b */
    private final SchoolRepository f45671b;
    /* renamed from: c */
    private final UpdateSchool f45672c;
    /* renamed from: d */
    private final C14414a f45673d;
    /* renamed from: e */
    private final ManagerAnalytics f45674e;
    /* renamed from: f */
    private final C17356a f45675f = new C17356a();
    /* renamed from: g */
    private List<C14415f> f45676g = new ArrayList(2);
    /* renamed from: h */
    private List<C14415f> f45677h = new ArrayList();
    /* renamed from: i */
    private C14415f f45678i;
    /* renamed from: j */
    private SchoolRowClickListener f45679j = new bg(this);

    @Inject
    public bf(SchoolRepository schoolRepository, UpdateSchool updateSchool, C14414a c14414a, ManagerAnalytics managerAnalytics) {
        this.f45671b = schoolRepository;
        this.f45672c = updateSchool;
        this.f45674e = managerAnalytics;
        this.f45673d = c14414a;
    }

    /* renamed from: a */
    public SchoolRowClickListener m55030a() {
        return this.f45679j;
    }

    /* renamed from: b */
    public void m55035b() {
        if (this.f45676g.equals(this.f45677h)) {
            m55029j().exitScreen();
        } else {
            m55024c(this.f45677h);
        }
    }

    /* renamed from: c */
    public void m55036c() {
        m55025f();
    }

    /* renamed from: f */
    private void m55025f() {
        this.f45675f.add(this.f45671b.load().subscribeOn(C15756a.m59010b()).observeOn(C15674a.m58830a()).map(new bh(this)).subscribe(new bi(this), bj.f50178a));
    }

    /* renamed from: b */
    final /* synthetic */ List m55034b(List list) throws Exception {
        List<C14415f> linkedList = new LinkedList();
        for (School school : list) {
            if (school != null) {
                linkedList.add(this.f45673d.m54875a(school));
                this.f45677h = linkedList;
            }
        }
        list = new LinkedList();
        for (C14415f c14415f : linkedList) {
            if (c14415f.m54885d()) {
                list.add(c14415f);
            }
        }
        this.f45676g = list;
        C14415f a = this.f45673d.m54874a();
        this.f45678i = a;
        if (list.isEmpty() != null) {
            a.m54882a(true);
            this.f45678i = a;
        }
        linkedList.add(a);
        return linkedList;
    }

    /* renamed from: a */
    final /* synthetic */ void m55032a(List list) throws Exception {
        this.f45670a.showSchools(list);
    }

    /* renamed from: a */
    private void m55022a(@NonNull C14415f c14415f) {
        if (c14415f.equals(this.f45678i)) {
            for (C14415f a : this.f45677h) {
                a.m54882a(false);
            }
            this.f45678i.m54882a(true);
        } else {
            int i = 0;
            int i2 = 0;
            while (i < this.f45677h.size()) {
                C14415f c14415f2 = (C14415f) this.f45677h.get(i);
                if (c14415f2.equals(c14415f)) {
                    if (i2 < 2) {
                        c14415f2.m54882a(c14415f2.m54885d() ^ true);
                    } else {
                        c14415f2.m54882a(true);
                    }
                } else if (i2 > 2) {
                    c14415f2.m54882a(false);
                }
                if (c14415f2.m54885d()) {
                    i2++;
                    if (i2 == 3) {
                        i = -1;
                    }
                }
                i++;
            }
            m55026g();
        }
        m55029j().updateSelectedRow();
    }

    /* renamed from: g */
    private void m55026g() {
        boolean z = true;
        for (C14415f d : this.f45677h) {
            if (d.m54885d()) {
                z = false;
            }
        }
        this.f45678i.m54882a(z);
    }

    /* renamed from: c */
    private void m55024c(@NonNull List<C14415f> list) {
        m55028i();
        List arrayList = new ArrayList();
        for (C14415f c14415f : list) {
            if (c14415f.m54883b() == SchoolDisplayType.ID) {
                arrayList.add(c14415f.m54881a());
            }
        }
        this.f45672c.execute(arrayList).b(C15756a.m59010b()).a(C15674a.m58830a()).a(new bk(this), new bl(this, arrayList));
    }

    /* renamed from: e */
    final /* synthetic */ void m55038e() throws Exception {
        this.f45670a.showSavingSchoolFinished();
    }

    /* renamed from: a */
    final /* synthetic */ void m55033a(List list, Throwable th) throws Exception {
        this.f45670a.showSavingSchoolError();
        if (list.isEmpty() != null) {
            m55027h();
        }
        C0001a.c(th);
    }

    /* renamed from: a */
    final /* synthetic */ void m55031a(C14415f c14415f, int i) {
        m55022a(c14415f);
    }

    /* renamed from: h */
    private void m55027h() {
        this.f45674e.a(new SparksEvent("School.Deny"));
    }

    /* renamed from: i */
    private void m55028i() {
        if (this.f45676g.isEmpty()) {
            this.f45674e.a(new SparksEvent("School.Set"));
        } else {
            this.f45674e.a(new SparksEvent("School.Change"));
        }
    }

    /* renamed from: j */
    private SchoolTarget m55029j() {
        return this.f45670a;
    }

    @Drop
    /* renamed from: d */
    void m55037d() {
        this.f45675f.m63446a();
        if (this.f45679j != null) {
            this.f45679j = null;
        }
    }
}
