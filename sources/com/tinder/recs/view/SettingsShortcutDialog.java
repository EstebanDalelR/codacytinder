package com.tinder.recs.view;

import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.support.annotation.StringRes;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatDialog;
import android.support.v7.widget.CardView;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import butterknife.BindColor;
import butterknife.BindDimen;
import butterknife.BindDrawable;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.tinder.R;
import com.tinder.deadshot.Deadshot;
import com.tinder.recs.analytics.AddRecsInteractEvent.Type;
import com.tinder.recs.component.RecsViewComponentProvider;
import com.tinder.recs.model.AgeConfig;
import com.tinder.recs.presenter.SettingsShortcutPresenter;
import com.tinder.recs.target.SettingsShortcutTarget;
import com.tinder.views.RangeSeekBar;
import com.tinder.views.RangeSeekBar.OnRangeSeekBarChangeListener;
import java.util.Arrays;
import java.util.Locale;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TypeCastException;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.C15828l;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\f*\u0002$:\u0018\u00002\u00020\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\r\u0010F\u001a\u00020GH\u0001¢\u0006\u0002\bHJ\u0010\u0010I\u001a\u00020G2\u0006\u0010J\u001a\u00020\u0010H\u0002J\b\u0010K\u001a\u00020GH\u0002J\u0014\u0010L\u001a\u000e\u0012\u0004\u0012\u00020N\u0012\u0004\u0012\u00020\b0MH\u0002J\b\u0010O\u001a\u00020GH\u0016J\b\u0010P\u001a\u00020GH\u0016J\r\u0010Q\u001a\u00020GH\u0001¢\u0006\u0002\bRJ\u0018\u0010S\u001a\u00020G2\u0006\u0010T\u001a\u00020\b2\u0006\u0010U\u001a\u00020\bH\u0016J \u0010V\u001a\u00020G2\u0006\u0010W\u001a\u00020\b2\u0006\u0010X\u001a\u00020\b2\u0006\u0010Y\u001a\u00020\bH\u0016J\u0010\u0010Z\u001a\u00020G2\u0006\u0010[\u001a\u00020\\H\u0016J\u001a\u0010]\u001a\u00020G2\b\b\u0001\u0010^\u001a\u00020\b2\u0006\u0010_\u001a\u00020\bH\u0016J\b\u0010`\u001a\u00020GH\u0002J\u0010\u0010a\u001a\u00020G2\u0006\u0010b\u001a\u00020\bH\u0016J\b\u0010c\u001a\u00020GH\u0016J\b\u0010d\u001a\u00020GH\u0016J\u0012\u0010e\u001a\u00020G2\b\b\u0001\u0010f\u001a\u00020\bH\u0002J\b\u0010g\u001a\u00020GH\u0016R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X.¢\u0006\u0002\n\u0000R\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001e\u0010\u0015\u001a\u00020\u00168\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001e\u0010\u001b\u001a\u00020\u001c8\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u0014\u0010!\u001a\b\u0012\u0004\u0012\u00020\b0\"X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010#\u001a\u00020$X\u0004¢\u0006\u0004\n\u0002\u0010%R\u001e\u0010&\u001a\u00020'8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u001e\u0010,\u001a\u00020-8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\u001e\u00102\u001a\u00020-8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b3\u0010/\"\u0004\b4\u00101R\u0012\u00105\u001a\u00020\b8\u0000@\u0000X\u000e¢\u0006\u0002\n\u0000R\u0012\u00106\u001a\u00020\b8\u0000@\u0000X\u000e¢\u0006\u0002\n\u0000R\u000e\u00107\u001a\u000208X.¢\u0006\u0002\n\u0000R\u0010\u00109\u001a\u00020:X\u0004¢\u0006\u0004\n\u0002\u0010;R\u001e\u0010<\u001a\u00020=8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR\u001e\u0010B\u001a\u00020=8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\bC\u0010?\"\u0004\bD\u0010AR\u0012\u0010E\u001a\u00020\b8\u0000@\u0000X\u000e¢\u0006\u0002\n\u0000¨\u0006h"}, d2 = {"Lcom/tinder/recs/view/SettingsShortcutDialog;", "Landroid/support/v7/app/AppCompatDialog;", "Lcom/tinder/recs/target/SettingsShortcutTarget;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "ageBar", "Lcom/tinder/views/RangeSeekBar;", "", "agePrefsContainer", "Landroid/widget/FrameLayout;", "getAgePrefsContainer", "()Landroid/widget/FrameLayout;", "setAgePrefsContainer", "(Landroid/widget/FrameLayout;)V", "analyticsType", "Lcom/tinder/recs/analytics/AddRecsInteractEvent$Type;", "getAnalyticsType", "()Lcom/tinder/recs/analytics/AddRecsInteractEvent$Type;", "setAnalyticsType", "(Lcom/tinder/recs/analytics/AddRecsInteractEvent$Type;)V", "cardView", "Landroid/support/v7/widget/CardView;", "getCardView", "()Landroid/support/v7/widget/CardView;", "setCardView", "(Landroid/support/v7/widget/CardView;)V", "presenter", "Lcom/tinder/recs/presenter/SettingsShortcutPresenter;", "getPresenter$Tinder_release", "()Lcom/tinder/recs/presenter/SettingsShortcutPresenter;", "setPresenter$Tinder_release", "(Lcom/tinder/recs/presenter/SettingsShortcutPresenter;)V", "rangeSeekBarChangeListener", "Lcom/tinder/views/RangeSeekBar$OnRangeSeekBarChangeListener;", "seekBarChangeListener", "com/tinder/recs/view/SettingsShortcutDialog$seekBarChangeListener$1", "Lcom/tinder/recs/view/SettingsShortcutDialog$seekBarChangeListener$1;", "seekBarDistance", "Landroid/widget/SeekBar;", "getSeekBarDistance", "()Landroid/widget/SeekBar;", "setSeekBarDistance", "(Landroid/widget/SeekBar;)V", "seekBarThumb", "Landroid/graphics/drawable/Drawable;", "getSeekBarThumb", "()Landroid/graphics/drawable/Drawable;", "setSeekBarThumb", "(Landroid/graphics/drawable/Drawable;)V", "seekBarThumbSelected", "getSeekBarThumbSelected", "setSeekBarThumbSelected", "sliderColor", "sliderLineWidth", "snackBar", "Landroid/support/design/widget/Snackbar;", "snackBarCallBack", "com/tinder/recs/view/SettingsShortcutDialog$snackBarCallBack$1", "Lcom/tinder/recs/view/SettingsShortcutDialog$snackBarCallBack$1;", "textDistance", "Landroid/widget/TextView;", "getTextDistance", "()Landroid/widget/TextView;", "setTextDistance", "(Landroid/widget/TextView;)V", "textYears", "getTextYears", "setTextYears", "thumbColor", "cancelDialog", "", "cancelDialog$Tinder_release", "fireRecsInterctEvent", "type", "initializeAgeSeekbar", "newAgeAndDistanceValues", "Lkotlin/Pair;", "Lcom/tinder/recs/model/AgeConfig;", "onAttachedToWindow", "onDetachedFromWindow", "saveDiscoveryPref", "saveDiscoveryPref$Tinder_release", "setAgeBarValues", "prefAgeMin", "prefAgeMax", "setAgeRange", "configAgeMin", "configAgeMax", "configAgeMaxMin", "setAgeText", "ageText", "", "setDistanceText", "distanceUnit", "distanceInEitherMilesOrKms", "setListeners", "setStartingDistance", "distanceInMiles", "showFailedToUpdateProfile", "showNothingToUpdateMessage", "showSnackBarWithDismissCallBack", "stringResource", "showSuccessfulUpdatedProfile", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public final class SettingsShortcutDialog extends AppCompatDialog implements SettingsShortcutTarget {
    private RangeSeekBar<Integer> ageBar;
    @NotNull
    @BindView(2131362819)
    public FrameLayout agePrefsContainer;
    @Nullable
    private Type analyticsType;
    @NotNull
    @BindView(2131362051)
    public CardView cardView;
    @Inject
    @NotNull
    public SettingsShortcutPresenter presenter;
    private final OnRangeSeekBarChangeListener<Integer> rangeSeekBarChangeListener = new SettingsShortcutDialog$rangeSeekBarChangeListener$1(this);
    private final SettingsShortcutDialog$seekBarChangeListener$1 seekBarChangeListener = new SettingsShortcutDialog$seekBarChangeListener$1(this);
    @NotNull
    @BindView(2131363533)
    public SeekBar seekBarDistance;
    @NotNull
    @BindDrawable(2131231866)
    public Drawable seekBarThumb;
    @NotNull
    @BindDrawable(2131231868)
    public Drawable seekBarThumbSelected;
    @BindColor(2131099909)
    @JvmField
    public int sliderColor;
    @BindDimen(2131166149)
    @JvmField
    public int sliderLineWidth;
    private Snackbar snackBar;
    private final SettingsShortcutDialog$snackBarCallBack$1 snackBarCallBack = new SettingsShortcutDialog$snackBarCallBack$1(this);
    @NotNull
    @BindView(2131363760)
    public TextView textDistance;
    @NotNull
    @BindView(2131363764)
    public TextView textYears;
    @BindColor(2131100253)
    @JvmField
    public int thumbColor;

    @NotNull
    public static final /* synthetic */ Snackbar access$getSnackBar$p(SettingsShortcutDialog settingsShortcutDialog) {
        settingsShortcutDialog = settingsShortcutDialog.snackBar;
        if (settingsShortcutDialog == null) {
            C2668g.b("snackBar");
        }
        return settingsShortcutDialog;
    }

    public SettingsShortcutDialog(@NotNull Context context) {
        C2668g.b(context, "context");
        super(context, R.style.Theme.FloatingDialog);
        ((RecsViewComponentProvider) context).getRecsViewComponent().inject(this);
        setContentView(R.layout.rec_settings_dialog);
        ButterKnife.a(this);
        setCanceledOnTouchOutside(true);
        setCancelable(true);
    }

    @NotNull
    public final FrameLayout getAgePrefsContainer() {
        FrameLayout frameLayout = this.agePrefsContainer;
        if (frameLayout == null) {
            C2668g.b("agePrefsContainer");
        }
        return frameLayout;
    }

    public final void setAgePrefsContainer(@NotNull FrameLayout frameLayout) {
        C2668g.b(frameLayout, "<set-?>");
        this.agePrefsContainer = frameLayout;
    }

    @NotNull
    public final TextView getTextYears() {
        TextView textView = this.textYears;
        if (textView == null) {
            C2668g.b("textYears");
        }
        return textView;
    }

    public final void setTextYears(@NotNull TextView textView) {
        C2668g.b(textView, "<set-?>");
        this.textYears = textView;
    }

    @NotNull
    public final SeekBar getSeekBarDistance() {
        SeekBar seekBar = this.seekBarDistance;
        if (seekBar == null) {
            C2668g.b("seekBarDistance");
        }
        return seekBar;
    }

    public final void setSeekBarDistance(@NotNull SeekBar seekBar) {
        C2668g.b(seekBar, "<set-?>");
        this.seekBarDistance = seekBar;
    }

    @NotNull
    public final TextView getTextDistance() {
        TextView textView = this.textDistance;
        if (textView == null) {
            C2668g.b("textDistance");
        }
        return textView;
    }

    public final void setTextDistance(@NotNull TextView textView) {
        C2668g.b(textView, "<set-?>");
        this.textDistance = textView;
    }

    @NotNull
    public final CardView getCardView() {
        CardView cardView = this.cardView;
        if (cardView == null) {
            C2668g.b("cardView");
        }
        return cardView;
    }

    public final void setCardView(@NotNull CardView cardView) {
        C2668g.b(cardView, "<set-?>");
        this.cardView = cardView;
    }

    @NotNull
    public final Drawable getSeekBarThumb() {
        Drawable drawable = this.seekBarThumb;
        if (drawable == null) {
            C2668g.b("seekBarThumb");
        }
        return drawable;
    }

    public final void setSeekBarThumb(@NotNull Drawable drawable) {
        C2668g.b(drawable, "<set-?>");
        this.seekBarThumb = drawable;
    }

    @NotNull
    public final Drawable getSeekBarThumbSelected() {
        Drawable drawable = this.seekBarThumbSelected;
        if (drawable == null) {
            C2668g.b("seekBarThumbSelected");
        }
        return drawable;
    }

    public final void setSeekBarThumbSelected(@NotNull Drawable drawable) {
        C2668g.b(drawable, "<set-?>");
        this.seekBarThumbSelected = drawable;
    }

    @NotNull
    public final SettingsShortcutPresenter getPresenter$Tinder_release() {
        SettingsShortcutPresenter settingsShortcutPresenter = this.presenter;
        if (settingsShortcutPresenter == null) {
            C2668g.b("presenter");
        }
        return settingsShortcutPresenter;
    }

    public final void setPresenter$Tinder_release(@NotNull SettingsShortcutPresenter settingsShortcutPresenter) {
        C2668g.b(settingsShortcutPresenter, "<set-?>");
        this.presenter = settingsShortcutPresenter;
    }

    @Nullable
    public final Type getAnalyticsType() {
        return this.analyticsType;
    }

    public final void setAnalyticsType(@Nullable Type type) {
        this.analyticsType = type;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        SettingsShortcutPresenter settingsShortcutPresenter = this.presenter;
        if (settingsShortcutPresenter == null) {
            C2668g.b("presenter");
        }
        Deadshot.take(this, settingsShortcutPresenter);
        setOnDismissListener(new SettingsShortcutDialog$onAttachedToWindow$1(this));
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Deadshot.drop(this);
    }

    public void setAgeRange(int i, int i2, int i3) {
        Drawable drawable = this.seekBarThumb;
        if (drawable == null) {
            C2668g.b("seekBarThumb");
        }
        if (drawable == null) {
            throw new TypeCastException("null cannot be cast to non-null type android.graphics.drawable.BitmapDrawable");
        }
        BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
        drawable = this.seekBarThumbSelected;
        if (drawable == null) {
            C2668g.b("seekBarThumbSelected");
        }
        if (drawable == null) {
            throw new TypeCastException("null cannot be cast to non-null type android.graphics.drawable.BitmapDrawable");
        }
        this.ageBar = new RangeSeekBar(bitmapDrawable, (BitmapDrawable) drawable, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), getContext());
        initializeAgeSeekbar();
    }

    public void setAgeBarValues(int i, int i2) {
        RangeSeekBar rangeSeekBar = this.ageBar;
        if (rangeSeekBar == null) {
            C2668g.b("ageBar");
        }
        rangeSeekBar.setSelectedMinValue(Integer.valueOf(i));
        rangeSeekBar.setSelectedMaxValue(Integer.valueOf(i2));
    }

    public void setAgeText(@NotNull String str) {
        C2668g.b(str, "ageText");
        TextView textView = this.textYears;
        if (textView == null) {
            C2668g.b("textYears");
        }
        textView.setText(str);
    }

    public void showNothingToUpdateMessage() {
        showSnackBarWithDismissCallBack(R.string.no_updates_found);
    }

    public void setStartingDistance(int i) {
        i = Math.max(1, i);
        SeekBar seekBar = this.seekBarDistance;
        if (seekBar == null) {
            C2668g.b("seekBarDistance");
        }
        seekBar.setProgress(i);
    }

    public void setDistanceText(@StringRes int i, int i2) {
        i = getContext().getString(i);
        TextView textView = this.textDistance;
        if (textView == null) {
            C2668g.b("textDistance");
        }
        C15828l c15828l = C15828l.f49033a;
        Locale locale = Locale.getDefault();
        C2668g.a(locale, "Locale.getDefault()");
        Object[] objArr = new Object[]{Integer.valueOf(i2), i};
        i = String.format(locale, "%d%s", Arrays.copyOf(objArr, objArr.length));
        C2668g.a(i, "java.lang.String.format(locale, format, *args)");
        textView.setText((CharSequence) i);
    }

    public void showFailedToUpdateProfile() {
        showSnackBarWithDismissCallBack(R.string.failed_update_profile);
    }

    public void showSuccessfulUpdatedProfile() {
        dismiss();
    }

    @OnClick({2131362028})
    public final void cancelDialog$Tinder_release() {
        fireRecsInterctEvent(Type.SETTINGS_CANCEL);
        dismiss();
    }

    @OnClick({2131363920})
    public final void saveDiscoveryPref$Tinder_release() {
        Pair newAgeAndDistanceValues = newAgeAndDistanceValues();
        AgeConfig ageConfig = (AgeConfig) newAgeAndDistanceValues.m59805c();
        int intValue = ((Number) newAgeAndDistanceValues.m59806d()).intValue();
        SettingsShortcutPresenter settingsShortcutPresenter = this.presenter;
        if (settingsShortcutPresenter == null) {
            C2668g.b("presenter");
        }
        Type type = this.analyticsType;
        if (type == null) {
            type = Type.SETTINGS_UPDATE;
        }
        settingsShortcutPresenter.updateDiscoveryPrefs(ageConfig, intValue, type);
    }

    private final Pair<AgeConfig, Integer> newAgeAndDistanceValues() {
        RangeSeekBar rangeSeekBar = this.ageBar;
        if (rangeSeekBar == null) {
            C2668g.b("ageBar");
        }
        Number selectedMinValue = rangeSeekBar.getSelectedMinValue();
        C2668g.a(selectedMinValue, "ageBar.selectedMinValue");
        int intValue = selectedMinValue.intValue();
        RangeSeekBar rangeSeekBar2 = this.ageBar;
        if (rangeSeekBar2 == null) {
            C2668g.b("ageBar");
        }
        Number selectedMaxValue = rangeSeekBar2.getSelectedMaxValue();
        C2668g.a(selectedMaxValue, "ageBar.selectedMaxValue");
        AgeConfig ageConfig = new AgeConfig(intValue, selectedMaxValue.intValue());
        SeekBar seekBar = this.seekBarDistance;
        if (seekBar == null) {
            C2668g.b("seekBarDistance");
        }
        intValue = seekBar.getProgress();
        if (intValue < 1) {
            intValue = 1;
        }
        return new Pair(ageConfig, Integer.valueOf(intValue));
    }

    private final void fireRecsInterctEvent(Type type) {
        Pair newAgeAndDistanceValues = newAgeAndDistanceValues();
        AgeConfig ageConfig = (AgeConfig) newAgeAndDistanceValues.m59805c();
        int intValue = ((Number) newAgeAndDistanceValues.m59806d()).intValue();
        SettingsShortcutPresenter settingsShortcutPresenter = this.presenter;
        if (settingsShortcutPresenter == null) {
            C2668g.b("presenter");
        }
        settingsShortcutPresenter.fireRecsInteractEvent(type, ageConfig, intValue);
    }

    private final void initializeAgeSeekbar() {
        RangeSeekBar rangeSeekBar = this.ageBar;
        if (rangeSeekBar == null) {
            C2668g.b("ageBar");
        }
        rangeSeekBar.setLineHeight((float) this.sliderLineWidth);
        rangeSeekBar.setSliderSecondaryColor(this.sliderColor);
        rangeSeekBar.setSliderPrimaryColor(this.thumbColor);
        rangeSeekBar.setThumbColor(this.thumbColor);
        rangeSeekBar.setNotifyWhileDragging(true);
        rangeSeekBar.setContentDescription("age_range_bar");
        FrameLayout frameLayout = this.agePrefsContainer;
        if (frameLayout == null) {
            C2668g.b("agePrefsContainer");
        }
        LayoutParams layoutParams = frameLayout.getLayoutParams();
        if (layoutParams == null) {
            throw new TypeCastException("null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
        }
        RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
        FrameLayout frameLayout2 = this.agePrefsContainer;
        if (frameLayout2 == null) {
            C2668g.b("agePrefsContainer");
        }
        RangeSeekBar rangeSeekBar2 = this.ageBar;
        if (rangeSeekBar2 == null) {
            C2668g.b("ageBar");
        }
        frameLayout2.addView(rangeSeekBar2, layoutParams2);
        setListeners();
    }

    private final void setListeners() {
        RangeSeekBar rangeSeekBar = this.ageBar;
        if (rangeSeekBar == null) {
            C2668g.b("ageBar");
        }
        rangeSeekBar.setOnRangeSeekBarChangeListener(this.rangeSeekBarChangeListener);
        SeekBar seekBar = this.seekBarDistance;
        if (seekBar == null) {
            C2668g.b("seekBarDistance");
        }
        seekBar.setOnSeekBarChangeListener(this.seekBarChangeListener);
    }

    private final void showSnackBarWithDismissCallBack(@StringRes int i) {
        CardView cardView = this.cardView;
        if (cardView == null) {
            C2668g.b("cardView");
        }
        i = Snackbar.a(cardView.getRootView(), i, 500);
        C2668g.a(i, "Snackbar.make(cardView.r…e, SNACKBAR_LENGTH_SHORT)");
        this.snackBar = i;
        i = this.snackBar;
        if (i == 0) {
            C2668g.b("snackBar");
        }
        i.a(this.snackBarCallBack);
        i = this.snackBar;
        if (i == 0) {
            C2668g.b("snackBar");
        }
        i.b();
    }
}
