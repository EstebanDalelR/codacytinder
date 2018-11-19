package com.tinder.places.main.view;

import android.content.Context;
import android.support.constraint.ConstraintLayout;
import android.view.View;
import android.widget.TextView;
import com.tinder.C6250b.C6248a;
import com.tinder.R;
import com.tinder.deadshot.Deadshot;
import com.tinder.places.injection.Place;
import com.tinder.places.injection.PlacesComponentProvider;
import com.tinder.places.main.presenter.C10217a;
import com.tinder.places.main.target.PlacesDisabledTarget;
import com.tinder.utils.au;
import java.util.HashMap;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C19301m;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\b\u0010\u0013\u001a\u00020\u0014H\u0014J\b\u0010\u0015\u001a\u00020\u0014H\u0014J\b\u0010\u0016\u001a\u00020\u0014H\u0016J\b\u0010\u0017\u001a\u00020\u0014H\u0016J\b\u0010\u0018\u001a\u00020\u0014H\u0016R$\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001e\u0010\r\u001a\u00020\u000e8\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u0019"}, d2 = {"Lcom/tinder/places/main/view/PlacesDisabledView;", "Landroid/support/constraint/ConstraintLayout;", "Lcom/tinder/places/main/target/PlacesDisabledTarget;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "categories", "", "", "getCategories", "()Ljava/util/List;", "setCategories", "(Ljava/util/List;)V", "presenter", "Lcom/tinder/places/main/presenter/PlacesDisabledPresenter;", "getPresenter$Tinder_release", "()Lcom/tinder/places/main/presenter/PlacesDisabledPresenter;", "setPresenter$Tinder_release", "(Lcom/tinder/places/main/presenter/PlacesDisabledPresenter;)V", "onAttachedToWindow", "", "onDetachedFromWindow", "setFemaleGenderPreference", "setMaleGenderPreference", "setNeutralGenderPreference", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.places.main.view.a */
public final class C12370a extends ConstraintLayout implements PlacesDisabledTarget {
    @Inject
    @NotNull
    /* renamed from: a */
    public C10217a f39989a;
    @Place
    @Inject
    @NotNull
    /* renamed from: b */
    public List<String> f39990b;
    /* renamed from: c */
    private HashMap f39991c;

    /* renamed from: a */
    public View m48768a(int i) {
        if (this.f39991c == null) {
            this.f39991c = new HashMap();
        }
        View view = (View) this.f39991c.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        view = findViewById(i);
        this.f39991c.put(Integer.valueOf(i), view);
        return view;
    }

    public C12370a(@NotNull Context context) {
        C2668g.b(context, "context");
        super(context);
        ((PlacesComponentProvider) context).getPlacesComponent().inject(this);
        ConstraintLayout.inflate(context, R.layout.view_places_disabled, this);
        PlacesPinDropView placesPinDropView = (PlacesPinDropView) m48768a(C6248a.pinDropView);
        List list = this.f39990b;
        if (list == null) {
            C2668g.b("categories");
        }
        placesPinDropView.m48765a(C19301m.a(), false, false, list, true);
    }

    @NotNull
    public final C10217a getPresenter$Tinder_release() {
        C10217a c10217a = this.f39989a;
        if (c10217a == null) {
            C2668g.b("presenter");
        }
        return c10217a;
    }

    public final void setPresenter$Tinder_release(@NotNull C10217a c10217a) {
        C2668g.b(c10217a, "<set-?>");
        this.f39989a = c10217a;
    }

    @NotNull
    public final List<String> getCategories() {
        List<String> list = this.f39990b;
        if (list == null) {
            C2668g.b("categories");
        }
        return list;
    }

    public final void setCategories(@NotNull List<String> list) {
        C2668g.b(list, "<set-?>");
        this.f39990b = list;
    }

    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        C10217a c10217a = this.f39989a;
        if (c10217a == null) {
            C2668g.b("presenter");
        }
        Deadshot.take(this, c10217a);
    }

    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Deadshot.drop(this);
    }

    public void setMaleGenderPreference() {
        String a = au.a(this, R.string.places_turn_back_on_men, new String[0]);
        TextView textView = (TextView) m48768a(C6248a.detailText);
        C2668g.a(textView, "detailText");
        textView.setText(a);
    }

    public void setFemaleGenderPreference() {
        String a = au.a(this, R.string.places_turn_back_on_women, new String[0]);
        TextView textView = (TextView) m48768a(C6248a.detailText);
        C2668g.a(textView, "detailText");
        textView.setText(a);
    }

    public void setNeutralGenderPreference() {
        String a = au.a(this, R.string.places_turn_back_on_people, new String[0]);
        TextView textView = (TextView) m48768a(C6248a.detailText);
        C2668g.a(textView, "detailText");
        textView.setText(a);
    }
}
