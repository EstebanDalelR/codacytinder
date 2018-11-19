package com.tinder.places.onboarding.p315a;

import android.content.Context;
import android.support.v4.view.C0600i;
import android.view.View;
import android.view.ViewGroup;
import com.tinder.domain.places.model.Place;
import com.tinder.domain.places.model.PlacesOnboardingConfig;
import com.tinder.places.onboarding.C12394a;
import com.tinder.places.onboarding.C12399d;
import com.tinder.places.onboarding.C12401f;
import com.tinder.places.onboarding.PlacesOnboardingChatView;
import com.tinder.places.onboarding.PlacesOnboardingViewPager.PlacesOnboardingEventListener;
import com.tinder.places.viewmodel.C14351c;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C19301m;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u001f\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ \u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\b\u0010\u0013\u001a\u00020\u0010H\u0016J\u0018\u0010\u0014\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u0018\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0012H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u001a"}, d2 = {"Lcom/tinder/places/onboarding/adapter/PlacesOnboardingPagerAdapter;", "Landroid/support/v4/view/PagerAdapter;", "context", "Landroid/content/Context;", "config", "Lcom/tinder/domain/places/model/PlacesOnboardingConfig;", "onboardingEventListener", "Lcom/tinder/places/onboarding/PlacesOnboardingViewPager$PlacesOnboardingEventListener;", "(Landroid/content/Context;Lcom/tinder/domain/places/model/PlacesOnboardingConfig;Lcom/tinder/places/onboarding/PlacesOnboardingViewPager$PlacesOnboardingEventListener;)V", "getOnboardingEventListener", "()Lcom/tinder/places/onboarding/PlacesOnboardingViewPager$PlacesOnboardingEventListener;", "destroyItem", "", "collection", "Landroid/view/ViewGroup;", "position", "", "view", "", "getCount", "instantiateItem", "isViewFromObject", "", "Landroid/view/View;", "object", "Companion", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.places.onboarding.a.a */
public final class C12392a extends C0600i {
    /* renamed from: a */
    public static final C10255a f40022a = new C10255a();
    /* renamed from: b */
    private final Context f40023b;
    /* renamed from: c */
    private final PlacesOnboardingConfig f40024c;
    @NotNull
    /* renamed from: d */
    private final PlacesOnboardingEventListener f40025d;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/tinder/places/onboarding/adapter/PlacesOnboardingPagerAdapter$Companion;", "", "()V", "NUM_ONBOARDING_SCREENS", "", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.places.onboarding.a.a$a */
    public static final class C10255a {
        private C10255a() {
        }
    }

    public int getCount() {
        return 4;
    }

    public boolean isViewFromObject(@NotNull View view, @NotNull Object obj) {
        C2668g.b(view, "view");
        C2668g.b(obj, "object");
        return view == obj;
    }

    public C12392a(@NotNull Context context, @NotNull PlacesOnboardingConfig placesOnboardingConfig, @NotNull PlacesOnboardingEventListener placesOnboardingEventListener) {
        C2668g.b(context, "context");
        C2668g.b(placesOnboardingConfig, "config");
        C2668g.b(placesOnboardingEventListener, "onboardingEventListener");
        this.f40023b = context;
        this.f40024c = placesOnboardingConfig;
        this.f40025d = placesOnboardingEventListener;
    }

    @NotNull
    public Object instantiateItem(@NotNull ViewGroup viewGroup, int i) {
        View c12401f;
        C2668g.b(viewGroup, "collection");
        Context context;
        switch (i) {
            case 0:
                context = this.f40023b;
                String str = (String) this.f40024c.getTitles().get(0);
                Iterable<Place> pins = this.f40024c.getPins();
                Collection arrayList = new ArrayList(C19301m.a(pins, 10));
                for (Place a : pins) {
                    arrayList.add(C14351c.f45525a.a(a));
                }
                c12401f = new C12401f(context, str, (List) arrayList, this.f40025d);
                break;
            case 1:
                c12401f = new C12399d(this.f40023b, (String) this.f40024c.getTitles().get(1), this.f40024c.getRec(), this.f40024c.getPlace());
                break;
            case 2:
                c12401f = new PlacesOnboardingChatView(this.f40023b, (String) this.f40024c.getTitles().get(2), this.f40024c.getRec(), this.f40024c.getConversation());
                break;
            default:
                context = this.f40023b;
                Iterable<Place> pins2 = this.f40024c.getPins();
                Collection arrayList2 = new ArrayList(C19301m.a(pins2, 10));
                for (Place a2 : pins2) {
                    arrayList2.add(C14351c.f45525a.a(a2));
                }
                c12401f = new C12394a(context, (List) arrayList2, this.f40025d);
                break;
        }
        c12401f.setTag(Integer.valueOf(i));
        viewGroup.addView(c12401f);
        return c12401f;
    }

    public void destroyItem(@NotNull ViewGroup viewGroup, int i, @NotNull Object obj) {
        C2668g.b(viewGroup, "collection");
        C2668g.b(obj, "view");
        viewGroup.removeView((View) obj);
    }
}
