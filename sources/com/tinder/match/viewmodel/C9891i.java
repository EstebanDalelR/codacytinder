package com.tinder.match.viewmodel;

import android.support.annotation.NonNull;
import com.esotericsoftware.kryo.NotNull;
import com.tinder.domain.fastmatch.provider.FastMatchConfigProvider;
import com.tinder.domain.match.model.Match;
import com.tinder.domain.purchase.SubscriptionProvider;
import com.tinder.match.viewmodel.NewMatchListItem.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java8.util.Optional;
import java8.util.stream.Collectors;
import java8.util.stream.StreamSupport;

/* renamed from: com.tinder.match.viewmodel.i */
public class C9891i {
    @NonNull
    /* renamed from: a */
    private C9889e f32727a;
    @NonNull
    /* renamed from: b */
    private final NewMatchListItem f32728b = NewMatchListItem.m40686c().mo10603a(Type.SPACE_VIEW).mo10604a(Optional.a()).mo10605a();
    @NonNull
    /* renamed from: c */
    private final NewMatchListItem f32729c = NewMatchListItem.m40686c().mo10603a(Type.FAST_MATCH_PREVIEW).mo10604a(Optional.a()).mo10605a();
    @NotNull
    /* renamed from: d */
    private final FastMatchConfigProvider f32730d;
    /* renamed from: e */
    private final SubscriptionProvider f32731e;

    public C9891i(C9889e c9889e, FastMatchConfigProvider fastMatchConfigProvider, SubscriptionProvider subscriptionProvider) {
        this.f32727a = c9889e;
        this.f32730d = fastMatchConfigProvider;
        this.f32731e = subscriptionProvider;
    }

    /* renamed from: a */
    public NewMatchListItem m40704a() {
        return this.f32729c;
    }

    @NonNull
    /* renamed from: a */
    public List<NewMatchListItem> m40706a(@NonNull List<Match> list, boolean z) {
        List arrayList = new ArrayList();
        arrayList.add(this.f32728b);
        if (z) {
            arrayList.add(this.f32729c);
        }
        arrayList.addAll((Collection) StreamSupport.a(list).map(new C12100j(this)).collect(Collectors.a()));
        return Collections.unmodifiableList(arrayList);
    }

    /* renamed from: a */
    final /* synthetic */ NewMatchListItem m40705a(Match match) {
        return NewMatchListItem.m40686c().mo10603a(Type.NEW_MATCH).mo10604a(Optional.a(this.f32727a.m40691a(match))).mo10605a();
    }
}
