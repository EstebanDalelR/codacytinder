package com.tinder.tinderplus.model;

import android.support.annotation.NonNull;
import com.tinder.model.UserMeta;
import com.tinder.tinderplus.model.C16955a.C16954a;
import java.util.Collections;
import java.util.List;
import java8.util.Optional;

/* renamed from: com.tinder.tinderplus.model.d */
public abstract class C15214d {

    /* renamed from: com.tinder.tinderplus.model.d$a */
    public static abstract class C15213a {
        /* renamed from: a */
        public abstract C15213a mo12555a(Boolean bool);

        /* renamed from: a */
        public abstract C15213a mo12556a(List<String> list);

        /* renamed from: a */
        public abstract C15214d mo12557a();

        /* renamed from: b */
        public abstract C15213a mo12558b(Boolean bool);

        /* renamed from: b */
        public abstract C15213a mo12559b(List<String> list);

        /* renamed from: c */
        public abstract C15213a mo12560c(Boolean bool);
    }

    @NonNull
    /* renamed from: a */
    public abstract Boolean mo12561a();

    @NonNull
    /* renamed from: b */
    public abstract List<String> mo12562b();

    @NonNull
    /* renamed from: c */
    public abstract List<String> mo12563c();

    @NonNull
    /* renamed from: d */
    public abstract Boolean mo12564d();

    @NonNull
    /* renamed from: e */
    public abstract Boolean mo12565e();

    @NonNull
    /* renamed from: a */
    public static C15214d m57177a(@NonNull UserMeta userMeta) {
        return C15214d.m57179g().mo12556a((List) Optional.m59121b((Object) userMeta).m59122a(C16960e.f52348a).m59122a(C16961f.f52349a).m59122a(C16963h.f52351a).m59130c(Collections.emptyList())).mo12559b((List) Optional.m59121b((Object) userMeta).m59122a(C16964i.f52352a).m59122a(C16965j.f52353a).m59130c(Collections.emptyList())).mo12555a(Boolean.valueOf(((Boolean) Optional.m59121b((Object) userMeta).m59122a(C16966k.f52354a).m59122a(C16967l.f52355a).m59130c(Boolean.valueOf(false))).booleanValue())).mo12558b(Boolean.valueOf(((Boolean) Optional.m59121b((Object) userMeta).m59122a(C16968m.f52356a).m59122a(C16969n.f52357a).m59130c(Boolean.valueOf(false))).booleanValue())).mo12560c(Boolean.valueOf(((Boolean) Optional.m59121b((Object) userMeta).m59122a(C16970o.f52358a).m59122a(C16962g.f52350a).m59130c(Boolean.valueOf(false))).booleanValue())).mo12557a();
    }

    @NonNull
    /* renamed from: f */
    public static C15214d m57178f() {
        return C15214d.m57179g().mo12555a(Boolean.valueOf(false)).mo12556a(Collections.emptyList()).mo12559b(Collections.emptyList()).mo12558b(Boolean.valueOf(false)).mo12560c(Boolean.valueOf(false)).mo12557a();
    }

    /* renamed from: g */
    public static C15213a m57179g() {
        return new C16954a();
    }
}
