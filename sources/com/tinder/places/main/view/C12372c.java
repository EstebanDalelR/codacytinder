package com.tinder.places.main.view;

import android.content.Context;
import android.support.constraint.ConstraintLayout;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import com.tinder.C6250b.C6248a;
import com.tinder.R;
import com.tinder.data.places.PlacesApiClient.PlacesApiException;
import com.tinder.domain.meta.model.Location;
import com.tinder.domain.places.model.Place;
import com.tinder.places.map.view.PlacePinView;
import com.tinder.places.viewmodel.C14351c;
import com.tinder.utils.au;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import kotlin.C15813i;
import kotlin.C18451c;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.collections.C19301m;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C15825i;
import kotlin.jvm.internal.C15828l;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.joda.time.DateTime;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u001e\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\u0011J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0002R!\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068BX\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\t¨\u0006\u0016"}, d2 = {"Lcom/tinder/places/main/view/PlacesErrorView;", "Landroid/support/constraint/ConstraintLayout;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "pinViews", "", "Lcom/tinder/places/map/view/PlacePinView;", "getPinViews", "()Ljava/util/List;", "pinViews$delegate", "Lkotlin/Lazy;", "bind", "", "exception", "Lcom/tinder/data/places/PlacesApiClient$PlacesApiException;", "retryListener", "Lkotlin/Function0;", "getSamplePlace", "Lcom/tinder/domain/places/model/Place;", "icon", "", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.places.main.view.c */
public final class C12372c extends ConstraintLayout {
    /* renamed from: a */
    static final /* synthetic */ KProperty[] f39994a = new KProperty[]{C15825i.a(new PropertyReference1Impl(C15825i.a(C12372c.class), "pinViews", "getPinViews()Ljava/util/List;"))};
    /* renamed from: b */
    private final Lazy f39995b = C18451c.a(new PlacesErrorView$pinViews$2(this));
    /* renamed from: c */
    private HashMap f39996c;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.places.main.view.c$a */
    static final class C10228a implements OnClickListener {
        /* renamed from: a */
        final /* synthetic */ Function0 f33331a;

        C10228a(Function0 function0) {
            this.f33331a = function0;
        }

        public final void onClick(View view) {
            this.f33331a.invoke();
        }
    }

    private final List<PlacePinView> getPinViews() {
        Lazy lazy = this.f39995b;
        KProperty kProperty = f39994a[0];
        return (List) lazy.getValue();
    }

    /* renamed from: a */
    public View m48773a(int i) {
        if (this.f39996c == null) {
            this.f39996c = new HashMap();
        }
        View view = (View) this.f39996c.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        view = findViewById(i);
        this.f39996c.put(Integer.valueOf(i), view);
        return view;
    }

    public C12372c(@NotNull Context context) {
        C2668g.b(context, "context");
        super(context);
        ConstraintLayout.inflate(context, R.layout.view_places_error, this);
        context = C19301m.b(new String[]{"cocktail-bar", "outdoor", "burgers", "ice-cream", "entertainment"});
        int i = 0;
        for (PlacePinView a : getPinViews()) {
            int i2 = i + 1;
            a.m48789a(C14351c.f45525a.a(m48772a((String) context.get(i))), false);
            i = i2;
        }
    }

    /* renamed from: a */
    public final void m48774a(@Nullable PlacesApiException placesApiException, @NotNull Function0<C15813i> function0) {
        C2668g.b(function0, "retryListener");
        ((TextView) m48773a(C6248a.errorRetryButton)).setOnClickListener(new C10228a(function0));
        TextView textView = (TextView) m48773a(C6248a.errorText);
        C2668g.a(textView, "errorText");
        if (placesApiException != null) {
            placesApiException = placesApiException.m37235a();
            if (placesApiException != null) {
                placesApiException = ((Number) placesApiException).intValue();
                C15828l c15828l = C15828l.f49033a;
                Object[] objArr = new Object[]{Integer.valueOf(placesApiException)};
                placesApiException = String.format(au.a(this, R.string.error_trouble_connecting_with_code, new String[0]), Arrays.copyOf(objArr, objArr.length));
                C2668g.a(placesApiException, "java.lang.String.format(format, *args)");
                if (placesApiException != null) {
                    placesApiException = (CharSequence) placesApiException;
                    textView.setText(placesApiException);
                }
            }
        }
        placesApiException = au.a(this, R.string.error_trouble_connecting, new String[0]);
        textView.setText(placesApiException);
    }

    /* renamed from: a */
    private final Place m48772a(String str) {
        Location build = Location.builder().lat(0.0d).lon(0.0d).build();
        C2668g.a(build, "Location.builder().lat(0.0).lon(0.0).build()");
        DateTime a = DateTime.a();
        C2668g.a(a, "DateTime.now()");
        return new Place(1234, "whatever", build, str, a, false, false, C19301m.a(), null, 0, 0, 1792, null);
    }
}
