package com.tinder.data.profile.client;

import com.tinder.api.TinderUserApi;
import com.tinder.api.model.profile.UpdateSchoolRequestBody;
import com.tinder.data.adapter.NotDisplayedByDefault;
import com.tinder.data.adapter.aj;
import com.tinder.domain.common.model.School;
import io.reactivex.C3956a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C19301m;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0006\u0010\u0007\u001a\u00020\bJ\u0014\u0010\t\u001a\u00020\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bJ\u0014\u0010\r\u001a\u00020\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/tinder/data/profile/client/SchoolClient;", "", "tinderApi", "Lcom/tinder/api/TinderUserApi;", "adapter", "Lcom/tinder/data/adapter/SchoolDomainApiAdapter;", "(Lcom/tinder/api/TinderUserApi;Lcom/tinder/data/adapter/SchoolDomainApiAdapter;)V", "delete", "Lio/reactivex/Completable;", "update", "list", "", "Lcom/tinder/domain/common/model/School;", "updateForSMSUser", "data_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.data.profile.client.c */
public final class C8758c {
    /* renamed from: a */
    private final TinderUserApi f30755a;
    /* renamed from: b */
    private final aj f30756b;

    @Inject
    public C8758c(@NotNull TinderUserApi tinderUserApi, @NotNull @NotDisplayedByDefault aj ajVar) {
        C2668g.b(tinderUserApi, "tinderApi");
        C2668g.b(ajVar, "adapter");
        this.f30755a = tinderUserApi;
        this.f30756b = ajVar;
    }

    @NotNull
    /* renamed from: a */
    public final C3956a m37297a(@NotNull List<? extends School> list) {
        C2668g.b(list, "list");
        Collection arrayList = new ArrayList();
        for (Object next : list) {
            if (((School) next).displayed()) {
                arrayList.add(next);
            }
        }
        Iterable<School> iterable = (List) arrayList;
        Collection arrayList2 = new ArrayList(C19301m.a(iterable, 10));
        for (School a : iterable) {
            arrayList2.add(this.f30756b.a(a));
        }
        list = this.f30755a.updateSchool(new UpdateSchoolRequestBody((List) arrayList2));
        C2668g.a(list, "tinderApi.updateSchool(request)");
        return list;
    }

    @NotNull
    /* renamed from: b */
    public final C3956a m37298b(@NotNull List<? extends School> list) {
        C2668g.b(list, "list");
        Iterable<School> iterable = list;
        Collection arrayList = new ArrayList(C19301m.a(iterable, 10));
        for (School a : iterable) {
            arrayList.add(this.f30756b.a(a));
        }
        list = this.f30755a.updateSchoolForSMSUser(new UpdateSchoolRequestBody((List) arrayList));
        C2668g.a(list, "tinderApi.updateSchoolForSMSUser(request)");
        return list;
    }

    @NotNull
    /* renamed from: a */
    public final C3956a m37296a() {
        C3956a deleteSchool = this.f30755a.deleteSchool();
        C2668g.a(deleteSchool, "tinderApi.deleteSchool()");
        return deleteSchool;
    }
}
