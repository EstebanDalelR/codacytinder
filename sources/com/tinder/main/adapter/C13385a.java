package com.tinder.main.adapter;

import com.tinder.base.view.C10364a;
import com.tinder.main.model.MainPage;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b&\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0016R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/tinder/main/adapter/MainPageViewPagerAdapter;", "Lcom/tinder/base/view/ViewPagerAdapter;", "pages", "", "Lcom/tinder/main/model/MainPage;", "(Ljava/util/List;)V", "getCount", "", "main_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.main.adapter.a */
public abstract class C13385a extends C10364a {
    /* renamed from: a */
    private final List<MainPage> f42436a;

    public C13385a(@NotNull List<? extends MainPage> list) {
        C2668g.b(list, "pages");
        this.f42436a = list;
    }

    public int getCount() {
        return this.f42436a.size();
    }
}
