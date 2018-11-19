package com.facebook.login.widget;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.annotation.Nullable;
import android.view.View.MeasureSpec;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.facebook.FacebookException;
import com.facebook.LoggingBehavior;
import com.facebook.internal.C1731m;
import com.facebook.internal.C1732n;
import com.facebook.internal.C1738r;
import com.facebook.internal.ImageRequest;
import com.facebook.internal.ImageRequest.C1685a;
import com.facebook.internal.ImageRequest.Callback;
import com.facebook.internal.Utility;
import com.facebook.login.C1780f.C1773a;
import com.facebook.login.C1780f.C1774b;

public class ProfilePictureView extends FrameLayout {
    /* renamed from: a */
    public static final String f4873a = "ProfilePictureView";
    /* renamed from: b */
    private String f4874b;
    /* renamed from: c */
    private int f4875c;
    /* renamed from: d */
    private int f4876d;
    /* renamed from: e */
    private boolean f4877e;
    /* renamed from: f */
    private Bitmap f4878f;
    /* renamed from: g */
    private ImageView f4879g;
    /* renamed from: h */
    private int f4880h;
    /* renamed from: i */
    private ImageRequest f4881i;
    /* renamed from: j */
    private OnErrorListener f4882j;
    /* renamed from: k */
    private Bitmap f4883k;

    public interface OnErrorListener {
        void onError(FacebookException facebookException);
    }

    /* renamed from: com.facebook.login.widget.ProfilePictureView$1 */
    class C34391 implements Callback {
        /* renamed from: a */
        final /* synthetic */ ProfilePictureView f10445a;

        C34391(ProfilePictureView profilePictureView) {
            this.f10445a = profilePictureView;
        }

        public void onCompleted(C1732n c1732n) {
            this.f10445a.m6156a(c1732n);
        }
    }

    public final int getPresetSize() {
        return this.f4880h;
    }

    public final void setPresetSize(int i) {
        switch (i) {
            case -4:
            case -3:
            case -2:
            case -1:
                this.f4880h = i;
                requestLayout();
                return;
            default:
                throw new IllegalArgumentException("Must use a predefined preset size");
        }
    }

    /* renamed from: a */
    public final boolean m6163a() {
        return this.f4877e;
    }

    public final void setCropped(boolean z) {
        this.f4877e = z;
        m6158a(false);
    }

    public final String getProfileId() {
        return this.f4874b;
    }

    public final void setProfileId(@Nullable String str) {
        boolean z;
        if (!Utility.m5785a(this.f4874b)) {
            if (this.f4874b.equalsIgnoreCase(str)) {
                z = false;
                this.f4874b = str;
                m6158a(z);
            }
        }
        m6159b();
        z = true;
        this.f4874b = str;
        m6158a(z);
    }

    public final OnErrorListener getOnErrorListener() {
        return this.f4882j;
    }

    public final void setOnErrorListener(OnErrorListener onErrorListener) {
        this.f4882j = onErrorListener;
    }

    public final void setDefaultProfilePicture(Bitmap bitmap) {
        this.f4883k = bitmap;
    }

    protected void onMeasure(int i, int i2) {
        Object obj;
        LayoutParams layoutParams = getLayoutParams();
        int size = MeasureSpec.getSize(i2);
        int size2 = MeasureSpec.getSize(i);
        if (MeasureSpec.getMode(i2) == 1073741824 || layoutParams.height != -2) {
            obj = null;
        } else {
            size = m6161c(true);
            i2 = MeasureSpec.makeMeasureSpec(size, 1073741824);
            obj = 1;
        }
        if (MeasureSpec.getMode(i) != 1073741824 && layoutParams.width == -2) {
            size2 = m6161c(true);
            i = MeasureSpec.makeMeasureSpec(size2, 1073741824);
            obj = 1;
        }
        if (obj != null) {
            setMeasuredDimension(size2, size);
            measureChildren(i, i2);
            return;
        }
        super.onMeasure(i, i2);
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        m6158a(false);
    }

    protected Parcelable onSaveInstanceState() {
        Parcelable onSaveInstanceState = super.onSaveInstanceState();
        Parcelable bundle = new Bundle();
        bundle.putParcelable("ProfilePictureView_superState", onSaveInstanceState);
        bundle.putString("ProfilePictureView_profileId", this.f4874b);
        bundle.putInt("ProfilePictureView_presetSize", this.f4880h);
        bundle.putBoolean("ProfilePictureView_isCropped", this.f4877e);
        bundle.putInt("ProfilePictureView_width", this.f4876d);
        bundle.putInt("ProfilePictureView_height", this.f4875c);
        bundle.putBoolean("ProfilePictureView_refresh", this.f4881i != null);
        return bundle;
    }

    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable.getClass() != Bundle.class) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        Bundle bundle = (Bundle) parcelable;
        super.onRestoreInstanceState(bundle.getParcelable("ProfilePictureView_superState"));
        this.f4874b = bundle.getString("ProfilePictureView_profileId");
        this.f4880h = bundle.getInt("ProfilePictureView_presetSize");
        this.f4877e = bundle.getBoolean("ProfilePictureView_isCropped");
        this.f4876d = bundle.getInt("ProfilePictureView_width");
        this.f4875c = bundle.getInt("ProfilePictureView_height");
        m6158a(true);
    }

    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f4881i = null;
    }

    /* renamed from: a */
    private void m6158a(boolean z) {
        boolean c = m6162c();
        if (!(this.f4874b == null || this.f4874b.length() == 0)) {
            if (this.f4876d != 0 || this.f4875c != 0) {
                if (c || z) {
                    m6160b(true);
                    return;
                }
                return;
            }
        }
        m6159b();
    }

    /* renamed from: b */
    private void m6159b() {
        if (this.f4881i != null) {
            C1731m.m5961b(this.f4881i);
        }
        if (this.f4883k == null) {
            setImageBitmap(BitmapFactory.decodeResource(getResources(), m6163a() ? C1774b.com_facebook_profile_picture_blank_square : C1774b.com_facebook_profile_picture_blank_portrait));
            return;
        }
        m6162c();
        setImageBitmap(Bitmap.createScaledBitmap(this.f4883k, this.f4876d, this.f4875c, false));
    }

    private void setImageBitmap(Bitmap bitmap) {
        if (this.f4879g != null && bitmap != null) {
            this.f4878f = bitmap;
            this.f4879g.setImageBitmap(bitmap);
        }
    }

    /* renamed from: b */
    private void m6160b(boolean z) {
        ImageRequest a = new C1685a(getContext(), ImageRequest.m5732a(this.f4874b, this.f4876d, this.f4875c)).m5730a(z).m5729a((Object) this).m5728a(new C34391(this)).m5731a();
        if (this.f4881i != null) {
            C1731m.m5961b(this.f4881i);
        }
        this.f4881i = a;
        C1731m.m5952a(a);
    }

    /* renamed from: a */
    private void m6156a(C1732n c1732n) {
        if (c1732n.m5962a() == this.f4881i) {
            this.f4881i = null;
            Bitmap c = c1732n.m5964c();
            Throwable b = c1732n.m5963b();
            if (b != null) {
                c1732n = this.f4882j;
                if (c1732n != null) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("Error in downloading profile picture for profileId: ");
                    stringBuilder.append(getProfileId());
                    c1732n.onError(new FacebookException(stringBuilder.toString(), b));
                    return;
                }
                C1738r.m5976a(LoggingBehavior.REQUESTS, 6, f4873a, b.toString());
            } else if (c != null) {
                setImageBitmap(c);
                if (c1732n.m5965d() != null) {
                    m6160b(null);
                }
            }
        }
    }

    /* renamed from: c */
    private boolean m6162c() {
        int height = getHeight();
        int width = getWidth();
        boolean z = true;
        if (width >= 1) {
            if (height >= 1) {
                int c = m6161c(false);
                if (c != 0) {
                    height = c;
                    width = height;
                }
                if (width <= height) {
                    height = m6163a() ? width : 0;
                } else {
                    width = m6163a() ? height : 0;
                }
                if (width == this.f4876d) {
                    if (height == this.f4875c) {
                        z = false;
                    }
                }
                this.f4876d = width;
                this.f4875c = height;
                return z;
            }
        }
        return false;
    }

    /* renamed from: c */
    private int m6161c(boolean z) {
        switch (this.f4880h) {
            case -4:
                z = C1773a.com_facebook_profilepictureview_preset_size_large;
                break;
            case -3:
                z = C1773a.com_facebook_profilepictureview_preset_size_normal;
                break;
            case -2:
                z = C1773a.com_facebook_profilepictureview_preset_size_small;
                break;
            case -1:
                if (z) {
                    z = C1773a.com_facebook_profilepictureview_preset_size_normal;
                    break;
                }
                return 0;
            default:
                return 0;
        }
        return getResources().getDimensionPixelSize(z);
    }
}
