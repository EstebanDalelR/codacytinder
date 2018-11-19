package com.tinder.feed.view.footer;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tinder.C6250b.C6248a;
import com.tinder.R;
import com.tinder.chat.view.model.C8493c;
import com.tinder.chat.view.model.C8495g;
import com.tinder.common.C8533f;
import com.tinder.common.view.extension.C8587g;
import com.tinder.domain.common.model.Gender;
import com.tinder.domain.common.model.Gender.Value;
import com.tinder.feed.view.model.C9539e;
import com.tinder.module.FeedViewComponentProvider;
import com.tinder.profile.p365d.C14398a;
import com.tinder.utils.au;
import java.util.HashMap;
import java.util.List;
import javax.inject.Inject;
import kotlin.C18451c;
import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.collections.C19301m;
import kotlin.jvm.internal.C15823e;
import kotlin.jvm.internal.C15825i;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J6\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\b\b\u0002\u0010 \u001a\u00020!2\b\b\u0002\u0010\"\u001a\u00020!2\b\b\u0002\u0010#\u001a\u00020!2\b\b\u0002\u0010$\u001a\u00020!J\u001f\u0010%\u001a\u00020\u001d2\b\u0010&\u001a\u0004\u0018\u00010'2\u0006\u0010$\u001a\u00020!H\u0002¢\u0006\u0002\u0010(J\u0018\u0010)\u001a\u00020\u001d2\u0006\u0010*\u001a\u00020+2\u0006\u0010#\u001a\u00020!H\u0002J\u001e\u0010,\u001a\u00020\u001d2\f\u0010-\u001a\b\u0012\u0004\u0012\u00020/0.2\u0006\u0010 \u001a\u00020!H\u0002J\u001e\u00100\u001a\u00020\u001d2\f\u00101\u001a\b\u0012\u0004\u0012\u0002020.2\u0006\u0010\"\u001a\u00020!H\u0002R\u001b\u0010\u0007\u001a\u00020\b8BX\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nR\u001e\u0010\r\u001a\u00020\u000e8\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001b\u0010\u0013\u001a\u00020\b8BX\u0002¢\u0006\f\n\u0004\b\u0015\u0010\f\u001a\u0004\b\u0014\u0010\nR\u001b\u0010\u0016\u001a\u00020\b8BX\u0002¢\u0006\f\n\u0004\b\u0018\u0010\f\u001a\u0004\b\u0017\u0010\nR\u001b\u0010\u0019\u001a\u00020\b8BX\u0002¢\u0006\f\n\u0004\b\u001b\u0010\f\u001a\u0004\b\u001a\u0010\n¨\u00063"}, d2 = {"Lcom/tinder/feed/view/footer/FeedFooterDescriptionView;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "distanceDescriptionView", "Landroid/widget/TextView;", "getDistanceDescriptionView", "()Landroid/widget/TextView;", "distanceDescriptionView$delegate", "Lkotlin/Lazy;", "distanceFormatter", "Lcom/tinder/common/DistanceFormatter;", "getDistanceFormatter$Tinder_release", "()Lcom/tinder/common/DistanceFormatter;", "setDistanceFormatter$Tinder_release", "(Lcom/tinder/common/DistanceFormatter;)V", "genderDescriptionView", "getGenderDescriptionView", "genderDescriptionView$delegate", "jobDescriptionView", "getJobDescriptionView", "jobDescriptionView$delegate", "schoolDescriptionView", "getSchoolDescriptionView", "schoolDescriptionView$delegate", "bind", "", "userInfo", "Lcom/tinder/feed/view/model/FeedUserInfoViewModel;", "showJob", "", "showSchool", "showGender", "showDistance", "bindDistanceDescription", "distanceInMiles", "", "(Ljava/lang/Double;Z)V", "bindGenderDescription", "gender", "Lcom/tinder/domain/common/model/Gender;", "bindJobDescription", "jobList", "", "Lcom/tinder/chat/view/model/ActivityFeedJobViewModel;", "bindSchoolDescription", "schools", "Lcom/tinder/chat/view/model/ActivityFeedSchoolViewModel;", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public final class FeedFooterDescriptionView extends LinearLayout {
    /* renamed from: a */
    static final /* synthetic */ KProperty[] f31817a = new KProperty[]{C15825i.a(new PropertyReference1Impl(C15825i.a(FeedFooterDescriptionView.class), "jobDescriptionView", "getJobDescriptionView()Landroid/widget/TextView;")), C15825i.a(new PropertyReference1Impl(C15825i.a(FeedFooterDescriptionView.class), "schoolDescriptionView", "getSchoolDescriptionView()Landroid/widget/TextView;")), C15825i.a(new PropertyReference1Impl(C15825i.a(FeedFooterDescriptionView.class), "genderDescriptionView", "getGenderDescriptionView()Landroid/widget/TextView;")), C15825i.a(new PropertyReference1Impl(C15825i.a(FeedFooterDescriptionView.class), "distanceDescriptionView", "getDistanceDescriptionView()Landroid/widget/TextView;"))};
    @Inject
    @NotNull
    /* renamed from: b */
    public C8533f f31818b;
    /* renamed from: c */
    private final Lazy f31819c;
    /* renamed from: d */
    private final Lazy f31820d;
    /* renamed from: e */
    private final Lazy f31821e;
    /* renamed from: f */
    private final Lazy f31822f;
    /* renamed from: g */
    private HashMap f31823g;

    private final TextView getDistanceDescriptionView() {
        Lazy lazy = this.f31822f;
        KProperty kProperty = f31817a[3];
        return (TextView) lazy.getValue();
    }

    private final TextView getGenderDescriptionView() {
        Lazy lazy = this.f31821e;
        KProperty kProperty = f31817a[2];
        return (TextView) lazy.getValue();
    }

    private final TextView getJobDescriptionView() {
        Lazy lazy = this.f31819c;
        KProperty kProperty = f31817a[0];
        return (TextView) lazy.getValue();
    }

    private final TextView getSchoolDescriptionView() {
        Lazy lazy = this.f31820d;
        KProperty kProperty = f31817a[1];
        return (TextView) lazy.getValue();
    }

    /* renamed from: a */
    public View m39735a(int i) {
        if (this.f31823g == null) {
            this.f31823g = new HashMap();
        }
        View view = (View) this.f31823g.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        view = findViewById(i);
        this.f31823g.put(Integer.valueOf(i), view);
        return view;
    }

    public /* synthetic */ FeedFooterDescriptionView(Context context, AttributeSet attributeSet, int i, C15823e c15823e) {
        if ((i & 2) != 0) {
            attributeSet = null;
        }
        this(context, attributeSet);
    }

    public FeedFooterDescriptionView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        C2668g.b(context, "context");
        super(context, attributeSet);
        this.f31819c = C18451c.a(LazyThreadSafetyMode.NONE, new FeedFooterDescriptionView$$special$$inlined$bindView$1(this, R.id.feedFooterJobDescriptionTextView));
        this.f31820d = C18451c.a(LazyThreadSafetyMode.NONE, new FeedFooterDescriptionView$$special$$inlined$bindView$2(this, R.id.feedFooterSchoolDescriptionTextView));
        this.f31821e = C18451c.a(LazyThreadSafetyMode.NONE, new FeedFooterDescriptionView$$special$$inlined$bindView$3(this, R.id.feedFooterGenderDescriptionTextView));
        this.f31822f = C18451c.a(LazyThreadSafetyMode.NONE, new FeedFooterDescriptionView$$special$$inlined$bindView$4(this, R.id.feedFooterDistanceDescriptionTextView));
        if (isInEditMode() == null) {
            attributeSet = C14398a.a(context);
            if (attributeSet == null) {
                throw new TypeCastException("null cannot be cast to non-null type com.tinder.module.FeedViewComponentProvider");
            }
            ((FeedViewComponentProvider) attributeSet).provideFeedViewComponent().inject(this);
        }
        LinearLayout.inflate(context, R.layout.feed_footer_description, this);
    }

    @NotNull
    public final C8533f getDistanceFormatter$Tinder_release() {
        C8533f c8533f = this.f31818b;
        if (c8533f == null) {
            C2668g.b("distanceFormatter");
        }
        return c8533f;
    }

    public final void setDistanceFormatter$Tinder_release(@NotNull C8533f c8533f) {
        C2668g.b(c8533f, "<set-?>");
        this.f31818b = c8533f;
    }

    /* renamed from: a */
    public final void m39736a(@NotNull C9539e c9539e, boolean z, boolean z2, boolean z3, boolean z4) {
        C2668g.b(c9539e, "userInfo");
        m39733a(c9539e.m39807e(), z);
        m39734b(c9539e.m39806d(), z2);
        m39731a(c9539e.m39809g(), z3);
        m39732a(c9539e.m39808f(), z4);
    }

    /* renamed from: a */
    private final void m39733a(List<C8493c> list, boolean z) {
        int i = 0;
        z = z && (list.isEmpty() ^ true);
        C8587g.m36614a(getJobDescriptionView(), z);
        ImageView imageView = (ImageView) m39735a(C6248a.feedFooterJobDescriptionImageView);
        C2668g.a(imageView, "feedFooterJobDescriptionImageView");
        C8587g.m36614a(imageView, z);
        if (z) {
            C8493c c8493c = (C8493c) C19301m.f(list);
            z = c8493c.m36354a();
            list = c8493c.m36355b();
            CharSequence charSequence = (CharSequence) z;
            if ((charSequence.length() > 0 ? 1 : null) != null) {
                if ((((CharSequence) list).length() > 0 ? 1 : null) != null) {
                    z = getResources().getString(R.string.job_at, new Object[]{list, z});
                    getJobDescriptionView().setText((CharSequence) z);
                }
            }
            if ((charSequence.length() > 0 ? 1 : null) == null) {
                if (((CharSequence) list).length() <= false) {
                    i = 1;
                }
                z = i != 0 ? list : "";
            }
            getJobDescriptionView().setText((CharSequence) z);
        }
    }

    /* renamed from: b */
    private final void m39734b(List<C8495g> list, boolean z) {
        boolean z2 = true;
        if (!z || !(list.isEmpty() ^ true)) {
            z2 = false;
        }
        C8587g.m36614a(getSchoolDescriptionView(), z2);
        ImageView imageView = (ImageView) m39735a(C6248a.feedFooterSchoolDescriptionImageView);
        C2668g.a(imageView, "feedFooterSchoolDescriptionImageView");
        C8587g.m36614a(imageView, z2);
        if (z2) {
            getSchoolDescriptionView().setText(((C8495g) C19301m.f(list)).m36356a());
        }
    }

    /* renamed from: a */
    private final void m39731a(Gender gender, boolean z) {
        int i;
        int i2;
        ImageView imageView;
        CharSequence customGender = gender.customGender();
        boolean z2 = true;
        if (customGender != null) {
            if (customGender.length() != 0) {
                i = 0;
                i ^= 1;
                i2 = gender.value() == Value.UNKNOWN ? 1 : 0;
                if (z || !(i | i2)) {
                    z2 = false;
                }
                C8587g.m36614a(getGenderDescriptionView(), z2);
                imageView = (ImageView) m39735a(C6248a.feedFooterGenderDescriptionImageView);
                C2668g.a(imageView, "feedFooterGenderDescriptionImageView");
                C8587g.m36614a(imageView, z2);
                if (!z2) {
                    if (i != 0) {
                        getGenderDescriptionView().setText(gender.customGender());
                    } else if (i2 != 0) {
                        if (gender.value() != Value.FEMALE) {
                            gender = R.string.woman;
                        } else {
                            int i3 = R.string.man;
                        }
                        getGenderDescriptionView().setText(au.a(this, gender, new String[0]));
                    }
                }
            }
        }
        i = 1;
        i ^= 1;
        if (gender.value() == Value.UNKNOWN) {
        }
        if (z) {
        }
        z2 = false;
        C8587g.m36614a(getGenderDescriptionView(), z2);
        imageView = (ImageView) m39735a(C6248a.feedFooterGenderDescriptionImageView);
        C2668g.a(imageView, "feedFooterGenderDescriptionImageView");
        C8587g.m36614a(imageView, z2);
        if (!z2) {
            if (i != 0) {
                getGenderDescriptionView().setText(gender.customGender());
            } else if (i2 != 0) {
                if (gender.value() != Value.FEMALE) {
                    int i32 = R.string.man;
                } else {
                    gender = R.string.woman;
                }
                getGenderDescriptionView().setText(au.a(this, gender, new String[0]));
            }
        }
    }

    /* renamed from: a */
    private final void m39732a(Double d, boolean z) {
        if (d != null) {
            d = (int) d.doubleValue();
            z = z && d >= null;
            C8587g.m36614a(getDistanceDescriptionView(), z);
            ImageView imageView = (ImageView) m39735a(C6248a.feedFooterDistanceDescriptionImageView);
            C2668g.a(imageView, "feedFooterDistanceDescriptionImageView");
            C8587g.m36614a(imageView, z);
            if (z) {
                z = getDistanceDescriptionView();
                C8533f c8533f = this.f31818b;
                if (c8533f == null) {
                    C2668g.b("distanceFormatter");
                }
                Context context = getDistanceDescriptionView().getContext();
                C2668g.a(context, "distanceDescriptionView.context");
                z.setText(c8533f.m36501a(d, context));
            }
        }
    }
}
