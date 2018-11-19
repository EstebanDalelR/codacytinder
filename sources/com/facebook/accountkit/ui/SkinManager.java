package com.facebook.accountkit.ui;

import android.app.Fragment;
import android.graphics.Color;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.support.annotation.ColorInt;
import android.support.annotation.DrawableRes;
import android.support.annotation.Nullable;

public final class SkinManager extends BaseUIManager {
    public static final Creator<SkinManager> CREATOR = new C13011();
    private static final double DISABLED_COLOR_ALPHA = 0.25d;
    private static final double MAXIMUM_TINT_INTENSITY = 0.85d;
    private static final double MINIMUM_TINT_INTENSITY = 0.55d;
    @DrawableRes
    private final int backgroundImage;
    @ColorInt
    private final int primaryColor;
    private final Skin skin;
    private final Tint tint;
    private final double tintIntensity;

    /* renamed from: com.facebook.accountkit.ui.SkinManager$1 */
    static class C13011 implements Creator<SkinManager> {
        C13011() {
        }

        public /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m4583a(parcel);
        }

        public /* synthetic */ Object[] newArray(int i) {
            return m4584a(i);
        }

        /* renamed from: a */
        public SkinManager m4583a(Parcel parcel) {
            return new SkinManager(parcel);
        }

        /* renamed from: a */
        public SkinManager[] m4584a(int i) {
            return new SkinManager[i];
        }
    }

    /* renamed from: com.facebook.accountkit.ui.SkinManager$2 */
    static /* synthetic */ class C13022 {
        /* renamed from: a */
        static final /* synthetic */ int[] f3442a = new int[Tint.values().length];

        static {
            /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
            /*
            r0 = com.facebook.accountkit.ui.SkinManager.Tint.values();
            r0 = r0.length;
            r0 = new int[r0];
            f3442a = r0;
            r0 = f3442a;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = com.facebook.accountkit.ui.SkinManager.Tint.WHITE;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0014 }
            r2 = 1;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0014 }
        L_0x0014:
            r0 = f3442a;	 Catch:{ NoSuchFieldError -> 0x001f }
            r1 = com.facebook.accountkit.ui.SkinManager.Tint.BLACK;	 Catch:{ NoSuchFieldError -> 0x001f }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x001f }
            r2 = 2;	 Catch:{ NoSuchFieldError -> 0x001f }
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x001f }
        L_0x001f:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.accountkit.ui.SkinManager.2.<clinit>():void");
        }
    }

    public enum Skin {
        NONE,
        CLASSIC,
        CONTEMPORARY,
        TRANSLUCENT
    }

    public enum Tint {
        WHITE,
        BLACK
    }

    public int describeContents() {
        return 0;
    }

    public SkinManager(Skin skin, @ColorInt int i, @DrawableRes int i2, Tint tint, double d) {
        super(-1);
        this.skin = skin;
        this.primaryColor = i;
        this.backgroundImage = i2;
        if (hasBackgroundImage() != null) {
            this.tint = tint;
            this.tintIntensity = Math.min(MAXIMUM_TINT_INTENSITY, Math.max(MINIMUM_TINT_INTENSITY, d));
            return;
        }
        this.tint = Tint.WHITE;
        this.tintIntensity = MINIMUM_TINT_INTENSITY;
    }

    public SkinManager(Skin skin, @ColorInt int i) {
        this(skin, i, -1, Tint.WHITE, MINIMUM_TINT_INTENSITY);
    }

    private SkinManager(Parcel parcel) {
        super(parcel);
        this.skin = Skin.values()[parcel.readInt()];
        this.primaryColor = parcel.readInt();
        this.backgroundImage = parcel.readInt();
        this.tint = Tint.values()[parcel.readInt()];
        this.tintIntensity = parcel.readDouble();
    }

    public Skin getSkin() {
        return this.skin;
    }

    public boolean hasBackgroundImage() {
        return this.backgroundImage >= 0;
    }

    @DrawableRes
    int getBackgroundImageResId() {
        return this.backgroundImage;
    }

    public Tint getTint() {
        return this.tint;
    }

    public double getTintIntensity() {
        return this.tintIntensity;
    }

    @ColorInt
    int getDisabledColor(@ColorInt int i) {
        int i2 = C13022.f3442a[this.tint.ordinal()] != 1 ? -16777216 : -1;
        return Color.rgb((int) ((((double) Color.red(i)) * DISABLED_COLOR_ALPHA) + (((double) Color.red(i2)) * 0.75d)), (int) ((((double) Color.green(i)) * DISABLED_COLOR_ALPHA) + (((double) Color.green(i2)) * 0.75d)), (int) ((((double) Color.blue(i)) * DISABLED_COLOR_ALPHA) + (((double) Color.blue(i2)) * 0.75d)));
    }

    @ColorInt
    public int getPrimaryColor() {
        return this.primaryColor;
    }

    @ColorInt
    int getTintColor() {
        return C13022.f3442a[this.tint.ordinal()] != 1 ? Color.argb((int) (this.tintIntensity * 255.0d), 0, 0, 0) : Color.argb((int) (this.tintIntensity * 255.0d), 255, 255, 255);
    }

    @ColorInt
    int getTextColor() {
        return C13022.f3442a[getTint().ordinal()] != 2 ? -16777216 : -1;
    }

    @Nullable
    public Fragment getBodyFragment(LoginFlowState loginFlowState) {
        return super.getBodyFragment(loginFlowState);
    }

    @Nullable
    public ButtonType getButtonType(LoginFlowState loginFlowState) {
        return super.getButtonType(loginFlowState);
    }

    @Nullable
    public Fragment getFooterFragment(LoginFlowState loginFlowState) {
        return super.getFooterFragment(loginFlowState);
    }

    @Nullable
    public Fragment getHeaderFragment(LoginFlowState loginFlowState) {
        return super.getHeaderFragment(loginFlowState);
    }

    @Nullable
    public TextPosition getTextPosition(LoginFlowState loginFlowState) {
        return super.getTextPosition(loginFlowState);
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.skin.ordinal());
        parcel.writeInt(this.primaryColor);
        parcel.writeInt(this.backgroundImage);
        parcel.writeInt(this.tint.ordinal());
        parcel.writeDouble(this.tintIntensity);
    }
}
