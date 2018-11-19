package com.tinder.fastmatch.viewmodel;

import android.content.res.Resources;
import com.tinder.R;
import com.tinder.domain.fastmatch.model.FastMatchStatus;
import java.util.Arrays;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C15828l;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u000e\u0010\t\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/tinder/fastmatch/viewmodel/FastMatchTextRenderer;", "", "resources", "Landroid/content/res/Resources;", "(Landroid/content/res/Resources;)V", "renderSubtitle", "", "fastMatchStatus", "Lcom/tinder/domain/fastmatch/model/FastMatchStatus;", "renderTitle", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.fastmatch.viewmodel.a */
public final class C9420a {
    /* renamed from: a */
    private final Resources f31568a;

    @Inject
    public C9420a(@NotNull Resources resources) {
        C2668g.b(resources, "resources");
        this.f31568a = resources;
    }

    @NotNull
    /* renamed from: a */
    public final String m39388a(@NotNull FastMatchStatus fastMatchStatus) {
        C2668g.b(fastMatchStatus, "fastMatchStatus");
        int count = fastMatchStatus.getCount();
        if (count <= 0) {
            fastMatchStatus = this.f31568a.getString(R.string.see_who_likes_you);
            C2668g.a(fastMatchStatus, "resources.getString(R.string.see_who_likes_you)");
            return fastMatchStatus;
        }
        if (1 <= count) {
            if (2 >= count) {
                fastMatchStatus = this.f31568a.getString(R.string.tinder_gold_you_have_already_been_liked);
                C2668g.a(fastMatchStatus, "resources.getString(R.st…_have_already_been_liked)");
                return fastMatchStatus;
            }
        }
        if (fastMatchStatus.isRange() != null) {
            fastMatchStatus = C15828l.f49033a;
            fastMatchStatus = this.f31568a.getString(R.string.tinder_gold_num_of_people_already_like_you_range);
            C2668g.a(fastMatchStatus, "resources.getString(\n   …e_already_like_you_range)");
            Object[] objArr = new Object[]{Integer.valueOf(count)};
            fastMatchStatus = String.format(fastMatchStatus, Arrays.copyOf(objArr, objArr.length));
            C2668g.a(fastMatchStatus, "java.lang.String.format(format, *args)");
            return fastMatchStatus;
        }
        fastMatchStatus = C15828l.f49033a;
        fastMatchStatus = this.f31568a.getString(R.string.tinder_gold_num_of_people_already_like_you_exact);
        C2668g.a(fastMatchStatus, "resources.getString(\n   …e_already_like_you_exact)");
        objArr = new Object[]{Integer.valueOf(count)};
        fastMatchStatus = String.format(fastMatchStatus, Arrays.copyOf(objArr, objArr.length));
        C2668g.a(fastMatchStatus, "java.lang.String.format(format, *args)");
        return fastMatchStatus;
    }

    @NotNull
    /* renamed from: b */
    public final String m39389b(@NotNull FastMatchStatus fastMatchStatus) {
        C2668g.b(fastMatchStatus, "fastMatchStatus");
        if (fastMatchStatus.getCount() == null) {
            fastMatchStatus = this.f31568a.getString(R.string.match_with_them_instantly);
            C2668g.a(fastMatchStatus, "resources.getString(R.st…atch_with_them_instantly)");
            return fastMatchStatus;
        }
        fastMatchStatus = this.f31568a.getString(R.string.see_who_likes_you_and_match_with_them_instantly);
        C2668g.a(fastMatchStatus, "resources.getString(R.st…atch_with_them_instantly)");
        return fastMatchStatus;
    }
}
