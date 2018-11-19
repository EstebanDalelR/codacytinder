package com.tinder.onboarding.view;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import com.tinder.R;
import com.tinder.onboarding.module.OnboardingComponentProvider;
import com.tinder.onboarding.presenter.es;
import com.tinder.onboarding.target.OnboardingDateWidgetTarget;
import com.tinder.onboarding.view.OnboardingDateWidgetFieldView.KeyboardActionListener;
import com.tinder.onboarding.viewmodel.C10009b;
import com.tinder.onboarding.viewmodel.C10009b.C10008b;
import com.tinder.onboarding.viewmodel.DateField;
import com.tinder.utils.C15357d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java8.util.Optional;
import javax.annotation.Nonnull;
import javax.inject.Inject;
import org.joda.time.LocalDate;

public class OnboardingDateWidgetView extends LinearLayout implements OnboardingDateWidgetTarget {
    @Inject
    /* renamed from: a */
    es f12427a;
    @NonNull
    /* renamed from: b */
    private final LayoutInflater f12428b;
    @NonNull
    /* renamed from: c */
    private final List<OnboardingDateWidgetFieldView> f12429c = new ArrayList(3);
    @Nonnull
    /* renamed from: d */
    private C10009b f12430d;
    @Nullable
    /* renamed from: e */
    private OnboardingDateWidgetView$DateWidgetInputCompleteListener f12431e;
    /* renamed from: f */
    private KeyboardActionListener f12432f = new OnboardingDateWidgetView$1(this);
    /* renamed from: g */
    private final C15357d f12433g = new OnboardingDateWidgetView$2(this);

    public OnboardingDateWidgetView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f12428b = LayoutInflater.from(context);
        setOrientation(null);
        attributeSet = new C10008b();
        this.f12430d = (C10009b) attributeSet.b().c(attributeSet.a());
        m15053c();
        if (isInEditMode() != null) {
            return;
        }
        if ((context instanceof OnboardingComponentProvider) != null) {
            ((OnboardingComponentProvider) context).provideComponent().inject(this);
            return;
        }
        throw new IllegalArgumentException("Parent activity doesn't provide an Onboarding component");
    }

    protected void onFinishInflate() {
        super.onFinishInflate();
        if (!isInEditMode()) {
            this.f12427a.a(this);
        }
    }

    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f12427a.a();
    }

    public void setFocusable(boolean z) {
        for (OnboardingDateWidgetFieldView focusable : this.f12429c) {
            focusable.setFocusable(z);
        }
        super.setFocusable(z);
    }

    public void setDateFormat(@NonNull C10009b c10009b) {
        if (!this.f12430d.equals(c10009b)) {
            this.f12430d = c10009b;
            this.f12427a.a(c10009b);
        }
    }

    public void reorderFieldViewsByDateFormat() {
        View dayView = getDayView();
        View monthView = getMonthView();
        View yearView = getYearView();
        this.f12429c.clear();
        removeAllViews();
        Iterator it = this.f12430d.a().iterator();
        while (it.hasNext()) {
            switch (OnboardingDateWidgetView$3.f32852a[((DateField) it.next()).ordinal()]) {
                case 1:
                    addView(yearView);
                    this.f12429c.add(yearView);
                    break;
                case 2:
                    addView(monthView);
                    this.f12429c.add(monthView);
                    break;
                case 3:
                    addView(dayView);
                    this.f12429c.add(dayView);
                    break;
                default:
                    break;
            }
            if (it.hasNext()) {
                m15055d();
            }
        }
    }

    public void showDay(String str) {
        getDayView().setValues(str);
    }

    public void showMonth(String str) {
        getMonthView().setValues(str);
    }

    public void showYear(String str) {
        getYearView().setValues(str);
    }

    public void clearFieldLastValue(int i) {
        if (i >= 0 && i < this.f12429c.size()) {
            ((OnboardingDateWidgetFieldView) this.f12429c.get(i)).c();
        }
    }

    public void clearFieldValue(int i, int i2) {
        if (i >= 0 && i < this.f12429c.size()) {
            OnboardingDateWidgetFieldView onboardingDateWidgetFieldView = (OnboardingDateWidgetFieldView) this.f12429c.get(i);
            onboardingDateWidgetFieldView.a(i2, "");
            onboardingDateWidgetFieldView.a(i2);
        }
    }

    public void focusFieldNext(int i) {
        if (i >= 0 && i < this.f12429c.size()) {
            ((OnboardingDateWidgetFieldView) this.f12429c.get(i)).a();
        } else if (i == this.f12429c.size()) {
            ((OnboardingDateWidgetFieldView) this.f12429c.get(i - 1)).b();
        }
    }

    public void focusFieldNext(int i, int i2) {
        if (i >= 0 && i < this.f12429c.size()) {
            ((OnboardingDateWidgetFieldView) this.f12429c.get(i)).a(i2);
        }
    }

    public void notifyFieldComplete(Optional<LocalDate> optional) {
        if (this.f12431e != null) {
            this.f12431e.onComplete(true, optional);
        }
    }

    public void notifyFieldIncomplete() {
        if (this.f12431e != null) {
            this.f12431e.onComplete(false, Optional.a());
        }
    }

    /* renamed from: a */
    public void m15057a() {
        for (OnboardingDateWidgetFieldView onboardingDateWidgetFieldView : this.f12429c) {
            if (!onboardingDateWidgetFieldView.getFieldValue().c()) {
                onboardingDateWidgetFieldView.a();
                return;
            }
        }
        ((OnboardingDateWidgetFieldView) this.f12429c.get(this.f12429c.size() - 1)).b();
    }

    /* renamed from: a */
    public void m15058a(LocalDate localDate) {
        this.f12427a.a(localDate);
    }

    public void setWidgetInputCompleteListener(@Nullable OnboardingDateWidgetView$DateWidgetInputCompleteListener onboardingDateWidgetView$DateWidgetInputCompleteListener) {
        this.f12431e = onboardingDateWidgetView$DateWidgetInputCompleteListener;
    }

    /* renamed from: b */
    public void m15060b() {
        this.f12431e = null;
    }

    /* renamed from: a */
    public void m15059a(boolean z) {
        for (OnboardingDateWidgetFieldView a : this.f12429c) {
            a.a(z);
        }
    }

    /* renamed from: c */
    private void m15053c() {
        Iterator it = this.f12430d.a().iterator();
        while (it.hasNext()) {
            m15049a((DateField) it.next());
            if (it.hasNext()) {
                m15055d();
            }
        }
    }

    /* renamed from: a */
    private void m15049a(DateField dateField) {
        Context context = getContext();
        switch (OnboardingDateWidgetView$3.f32852a[dateField.ordinal()]) {
            case 1:
                dateField = new OnboardingDateWidgetFieldYearView(context);
                break;
            case 2:
                dateField = new OnboardingDateWidgetFieldMonthView(context);
                break;
            case 3:
                dateField = new OnboardingDateWidgetFieldDayView(context);
                break;
            default:
                m15051b(dateField);
                dateField = null;
                break;
        }
        dateField.setKeyboardActionListener(this.f12432f);
        dateField.setTextChangeListener(this.f12433g);
        this.f12429c.add(dateField);
        addView(dateField);
    }

    /* renamed from: d */
    private void m15055d() {
        this.f12428b.inflate(R.layout.view_onboarding_datewidget_seperator, this);
    }

    @NonNull
    private OnboardingDateWidgetFieldView getMonthView() {
        return (OnboardingDateWidgetFieldView) this.f12429c.get(this.f12430d.a().indexOf(DateField.MONTH));
    }

    @NonNull
    private OnboardingDateWidgetFieldView getYearView() {
        return (OnboardingDateWidgetFieldView) this.f12429c.get(this.f12430d.a().indexOf(DateField.YEAR));
    }

    @NonNull
    private OnboardingDateWidgetFieldView getDayView() {
        return (OnboardingDateWidgetFieldView) this.f12429c.get(this.f12430d.a().indexOf(DateField.DAY_OF_MONTH));
    }

    /* renamed from: b */
    private void m15051b(DateField dateField) {
        throw new IllegalStateException(String.format("Unexpected DateField:%s", new Object[]{dateField}));
    }
}
