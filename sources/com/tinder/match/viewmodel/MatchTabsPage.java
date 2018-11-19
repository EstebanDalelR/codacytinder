package com.tinder.match.viewmodel;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import com.tinder.design.tabbedpagelayout.TabbedPageLayout$Page;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002B#\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006¢\u0006\u0002\u0010\bJ\b\u0010\t\u001a\u00020\u0004H\u0016J\u000e\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\fJ\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010R\u000e\u0010\u0007\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000j\u0002\b\u0011j\u0002\b\u0012¨\u0006\u0013"}, d2 = {"Lcom/tinder/match/viewmodel/MatchTabsPage;", "", "Lcom/tinder/design/tabbedpagelayout/TabbedPageLayout$Page;", "id", "", "tabLayoutResId", "", "headingResId", "(Ljava/lang/String;ILjava/lang/String;II)V", "getId", "toHeading", "resources", "Landroid/content/res/Resources;", "toView", "Landroid/view/View;", "context", "Landroid/content/Context;", "MESSAGES", "FEED", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public enum MatchTabsPage implements TabbedPageLayout$Page {
    ;
    
    private final int headingResId;
    private final String id;
    private final int tabLayoutResId;

    protected MatchTabsPage(String str, int i, @NotNull int i2) {
        C2668g.b(str, "id");
        this.id = str;
        this.tabLayoutResId = i;
        this.headingResId = i2;
    }

    @NotNull
    public String getId() {
        return this.id;
    }

    @NotNull
    public final View toView(@NotNull Context context) {
        C2668g.b(context, "context");
        context = LayoutInflater.from(context).inflate(this.tabLayoutResId, null);
        C2668g.a(context, "LayoutInflater.from(cont…his.tabLayoutResId, null)");
        return context;
    }

    @NotNull
    public final String toHeading(@NotNull Resources resources) {
        C2668g.b(resources, "resources");
        resources = resources.getString(this.headingResId);
        C2668g.a(resources, "resources.getString(this.headingResId)");
        return resources;
    }
}
