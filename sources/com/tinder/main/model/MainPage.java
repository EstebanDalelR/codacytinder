package com.tinder.main.model;

import com.tinder.design.tabbedpagelayout.TabbedPageLayout$Page;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002B\u000f\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0004H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/tinder/main/model/MainPage;", "", "Lcom/tinder/design/tabbedpagelayout/TabbedPageLayout$Page;", "id", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getId", "PROFILE", "RECS", "MATCHES", "DISCOVERY", "FEED", "main_release"}, k = 1, mv = {1, 1, 10})
public enum MainPage implements TabbedPageLayout$Page {
    ;
    
    private final String id;

    protected MainPage(String str) {
        C2668g.m10309b(str, "id");
        this.id = str;
    }

    @NotNull
    public String getId() {
        return this.id;
    }
}
