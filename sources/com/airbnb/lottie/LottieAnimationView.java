package com.airbnb.lottie;

import android.animation.Animator.AnimatorListener;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.annotation.FloatRange;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.VisibleForTesting;
import android.support.v7.widget.AppCompatImageView;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View.BaseSavedState;
import com.airbnb.lottie.C0788c.C0787a;
import com.airbnb.lottie.C0797f.C0796a;
import com.airbnb.lottie.p017b.C0784f;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public class LottieAnimationView extends AppCompatImageView {
    /* renamed from: a */
    private static final String f12813a = "LottieAnimationView";
    /* renamed from: b */
    private static final Map<String, C0788c> f12814b = new HashMap();
    /* renamed from: c */
    private static final Map<String, WeakReference<C0788c>> f12815c = new HashMap();
    /* renamed from: d */
    private final OnCompositionLoadedListener f12816d = new C29631(this);
    /* renamed from: e */
    private final C0792d f12817e = new C0792d();
    /* renamed from: f */
    private CacheStrategy f12818f;
    /* renamed from: g */
    private String f12819g;
    /* renamed from: h */
    private boolean f12820h = false;
    /* renamed from: i */
    private boolean f12821i = false;
    /* renamed from: j */
    private boolean f12822j = false;
    @Nullable
    /* renamed from: k */
    private Cancellable f12823k;
    @Nullable
    /* renamed from: l */
    private C0788c f12824l;

    public enum CacheStrategy {
        None,
        Weak,
        Strong
    }

    private static class SavedState extends BaseSavedState {
        public static final Creator<SavedState> CREATOR = new C07621();
        String animationName;
        String imageAssetsFolder;
        boolean isAnimating;
        boolean isLooping;
        float progress;

        /* renamed from: com.airbnb.lottie.LottieAnimationView$SavedState$1 */
        static class C07621 implements Creator<SavedState> {
            C07621() {
            }

            public /* synthetic */ Object createFromParcel(Parcel parcel) {
                return m2687a(parcel);
            }

            public /* synthetic */ Object[] newArray(int i) {
                return m2688a(i);
            }

            /* renamed from: a */
            public SavedState m2687a(Parcel parcel) {
                return new SavedState(parcel);
            }

            /* renamed from: a */
            public SavedState[] m2688a(int i) {
                return new SavedState[i];
            }
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        private SavedState(Parcel parcel) {
            super(parcel);
            this.animationName = parcel.readString();
            this.progress = parcel.readFloat();
            boolean z = false;
            this.isAnimating = parcel.readInt() == 1;
            if (parcel.readInt() == 1) {
                z = true;
            }
            this.isLooping = z;
            this.imageAssetsFolder = parcel.readString();
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeString(this.animationName);
            parcel.writeFloat(this.progress);
            parcel.writeInt(this.isAnimating);
            parcel.writeInt(this.isLooping);
            parcel.writeString(this.imageAssetsFolder);
        }
    }

    /* renamed from: com.airbnb.lottie.LottieAnimationView$1 */
    class C29631 implements OnCompositionLoadedListener {
        /* renamed from: a */
        final /* synthetic */ LottieAnimationView f9198a;

        C29631(LottieAnimationView lottieAnimationView) {
            this.f9198a = lottieAnimationView;
        }

        public void onCompositionLoaded(@Nullable C0788c c0788c) {
            if (c0788c != null) {
                this.f9198a.setComposition(c0788c);
            }
            this.f9198a.f12823k = null;
        }
    }

    public LottieAnimationView(Context context) {
        super(context);
        m15831a((AttributeSet) null);
    }

    public LottieAnimationView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m15831a(attributeSet);
    }

    public LottieAnimationView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m15831a(attributeSet);
    }

    /* renamed from: a */
    private void m15831a(@Nullable AttributeSet attributeSet) {
        attributeSet = getContext().obtainStyledAttributes(attributeSet, C0796a.LottieAnimationView);
        this.f12818f = CacheStrategy.values()[attributeSet.getInt(C0796a.LottieAnimationView_lottie_cacheStrategy, CacheStrategy.Weak.ordinal())];
        String string = attributeSet.getString(C0796a.LottieAnimationView_lottie_fileName);
        if (!(isInEditMode() || string == null)) {
            setAnimation(string);
        }
        if (attributeSet.getBoolean(C0796a.LottieAnimationView_lottie_autoPlay, false)) {
            this.f12817e.m2855h();
            this.f12821i = true;
        }
        this.f12817e.m2848c(attributeSet.getBoolean(C0796a.LottieAnimationView_lottie_loop, false));
        setImageAssetsFolder(attributeSet.getString(C0796a.LottieAnimationView_lottie_imageAssetsFolder));
        setProgress(attributeSet.getFloat(C0796a.LottieAnimationView_lottie_progress, 0.0f));
        m15841a(attributeSet.getBoolean(C0796a.LottieAnimationView_lottie_enableMergePathsForKitKatAndAbove, false));
        if (attributeSet.hasValue(C0796a.LottieAnimationView_lottie_colorFilter)) {
            m15839a(new C0798g(attributeSet.getColor(C0796a.LottieAnimationView_lottie_colorFilter, 0)));
        }
        if (attributeSet.hasValue(C0796a.LottieAnimationView_lottie_scale)) {
            this.f12817e.m2852e(attributeSet.getFloat(C0796a.LottieAnimationView_lottie_scale, 1.0f));
        }
        attributeSet.recycle();
        if (C0784f.m2767a(getContext()) == null) {
            this.f12817e.m2851e();
        }
        m15835j();
    }

    public void setImageResource(int i) {
        m15836a();
        m15834i();
        super.setImageResource(i);
    }

    public void setImageDrawable(Drawable drawable) {
        if (drawable != this.f12817e) {
            m15836a();
        }
        m15834i();
        super.setImageDrawable(drawable);
    }

    public void setImageBitmap(Bitmap bitmap) {
        m15836a();
        m15834i();
        super.setImageBitmap(bitmap);
    }

    /* renamed from: a */
    public void m15839a(@Nullable ColorFilter colorFilter) {
        this.f12817e.m2832a(colorFilter);
    }

    public void invalidateDrawable(@NonNull Drawable drawable) {
        if (getDrawable() == this.f12817e) {
            super.invalidateDrawable(this.f12817e);
        } else {
            super.invalidateDrawable(drawable);
        }
    }

    protected Parcelable onSaveInstanceState() {
        Parcelable savedState = new SavedState(super.onSaveInstanceState());
        savedState.animationName = this.f12819g;
        savedState.progress = this.f12817e.m2857j();
        savedState.isAnimating = this.f12817e.m2854g();
        savedState.isLooping = this.f12817e.m2853f();
        savedState.imageAssetsFolder = this.f12817e.m2841b();
        return savedState;
    }

    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            SavedState savedState = (SavedState) parcelable;
            super.onRestoreInstanceState(savedState.getSuperState());
            this.f12819g = savedState.animationName;
            if (!TextUtils.isEmpty(this.f12819g)) {
                setAnimation(this.f12819g);
            }
            setProgress(savedState.progress);
            m15843b(savedState.isLooping);
            if (savedState.isAnimating) {
                m15845c();
            }
            this.f12817e.m2836a(savedState.imageAssetsFolder);
            return;
        }
        super.onRestoreInstanceState(parcelable);
    }

    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f12821i && this.f12820h) {
            m15845c();
        }
    }

    protected void onDetachedFromWindow() {
        if (m15844b()) {
            m15847e();
            this.f12820h = true;
        }
        m15836a();
        super.onDetachedFromWindow();
    }

    @VisibleForTesting
    /* renamed from: a */
    void m15836a() {
        if (this.f12817e != null) {
            this.f12817e.m2846c();
        }
    }

    /* renamed from: a */
    public void m15841a(boolean z) {
        this.f12817e.m2837a(z);
    }

    public void setAnimation(String str) {
        m15840a(str, this.f12818f);
    }

    /* renamed from: a */
    public void m15840a(final String str, final CacheStrategy cacheStrategy) {
        this.f12819g = str;
        if (f12815c.containsKey(str)) {
            C0788c c0788c = (C0788c) ((WeakReference) f12815c.get(str)).get();
            if (c0788c != null) {
                setComposition(c0788c);
                return;
            }
        } else if (f12814b.containsKey(str)) {
            setComposition((C0788c) f12814b.get(str));
            return;
        }
        this.f12819g = str;
        this.f12817e.m2862o();
        m15834i();
        this.f12823k = C0787a.m2778a(getContext(), str, new OnCompositionLoadedListener(this) {
            /* renamed from: c */
            final /* synthetic */ LottieAnimationView f9201c;

            public void onCompositionLoaded(C0788c c0788c) {
                if (cacheStrategy == CacheStrategy.Strong) {
                    LottieAnimationView.f12814b.put(str, c0788c);
                } else if (cacheStrategy == CacheStrategy.Weak) {
                    LottieAnimationView.f12815c.put(str, new WeakReference(c0788c));
                }
                this.f9201c.setComposition(c0788c);
            }
        });
    }

    public void setAnimation(JSONObject jSONObject) {
        m15834i();
        this.f12823k = C0787a.m2779a(getResources(), jSONObject, this.f12816d);
    }

    /* renamed from: i */
    private void m15834i() {
        if (this.f12823k != null) {
            this.f12823k.cancel();
            this.f12823k = null;
        }
    }

    public void setComposition(@NonNull C0788c c0788c) {
        this.f12817e.setCallback(this);
        boolean a = this.f12817e.m2839a(c0788c);
        m15835j();
        if (a) {
            setImageDrawable(null);
            setImageDrawable(this.f12817e);
            this.f12824l = c0788c;
            requestLayout();
        }
    }

    /* renamed from: a */
    public void m15838a(AnimatorListener animatorListener) {
        this.f12817e.m2831a(animatorListener);
    }

    /* renamed from: b */
    public void m15842b(AnimatorListener animatorListener) {
        this.f12817e.m2844b(animatorListener);
    }

    /* renamed from: b */
    public void m15843b(boolean z) {
        this.f12817e.m2848c(z);
    }

    /* renamed from: b */
    public boolean m15844b() {
        return this.f12817e.m2854g();
    }

    /* renamed from: c */
    public void m15845c() {
        this.f12817e.m2855h();
        m15835j();
    }

    /* renamed from: d */
    public void m15846d() {
        this.f12817e.m2856i();
        m15835j();
    }

    /* renamed from: a */
    public void m15837a(@FloatRange(from = 0.0d, to = 1.0d) float f, @FloatRange(from = 0.0d, to = 1.0d) float f2) {
        this.f12817e.m2829a(f, f2);
    }

    public void setMinFrame(int i) {
        this.f12817e.m2830a(i);
    }

    public void setMinProgress(float f) {
        this.f12817e.m2828a(f);
    }

    public void setMaxFrame(int i) {
        this.f12817e.m2843b(i);
    }

    public void setMaxProgress(float f) {
        this.f12817e.m2842b(f);
    }

    public void setSpeed(float f) {
        this.f12817e.m2847c(f);
    }

    public void setImageAssetsFolder(String str) {
        this.f12817e.m2836a(str);
    }

    @Nullable
    public String getImageAssetsFolder() {
        return this.f12817e.m2841b();
    }

    public void setImageAssetDelegate(ImageAssetDelegate imageAssetDelegate) {
        this.f12817e.m2833a(imageAssetDelegate);
    }

    public void setFontAssetDelegate(C0766a c0766a) {
        this.f12817e.m2834a(c0766a);
    }

    public void setTextDelegate(C0799h c0799h) {
        this.f12817e.m2835a(c0799h);
    }

    public void setScale(float f) {
        this.f12817e.m2852e(f);
        if (getDrawable() == this.f12817e) {
            setImageDrawable(0.0f);
            setImageDrawable(this.f12817e);
        }
    }

    public float getScale() {
        return this.f12817e.m2860m();
    }

    /* renamed from: e */
    public void m15847e() {
        this.f12817e.m2862o();
        m15835j();
    }

    /* renamed from: f */
    public void m15848f() {
        float progress = getProgress();
        this.f12817e.m2862o();
        setProgress(progress);
        m15835j();
    }

    public void setProgress(@FloatRange(from = 0.0d, to = 1.0d) float f) {
        this.f12817e.m2850d(f);
    }

    @FloatRange(from = 0.0d, to = 1.0d)
    public float getProgress() {
        return this.f12817e.m2857j();
    }

    public long getDuration() {
        return this.f12824l != null ? this.f12824l.m2801c() : 0;
    }

    public void setPerformanceTrackingEnabled(boolean z) {
        this.f12817e.m2845b(z);
    }

    @Nullable
    public PerformanceTracker getPerformanceTracker() {
        return this.f12817e.m2849d();
    }

    /* renamed from: j */
    private void m15835j() {
        int i = 1;
        Object obj = (this.f12822j && this.f12817e.m2854g()) ? 1 : null;
        if (obj != null) {
            i = 2;
        }
        setLayerType(i, null);
    }
}
