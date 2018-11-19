package com.tinder.main.di;

import com.tinder.design.tabbedpagelayout.TabbedPageLayout.OnPageSelectedListener;
import com.tinder.main.adapter.MainTabbedPageLayoutAdapter;
import com.tinder.main.model.MainPage;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&J\b\u0010\u0005\u001a\u00020\u0006H&J\u000e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH&¨\u0006\n"}, d2 = {"Lcom/tinder/main/di/MainViewComponent$Parent;", "", "mainPages", "", "Lcom/tinder/main/model/MainPage;", "mainTabbedPageLayoutAdapter", "Lcom/tinder/main/adapter/MainTabbedPageLayoutAdapter;", "pageSelectedListeners", "", "Lcom/tinder/design/tabbedpagelayout/TabbedPageLayout$OnPageSelectedListener;", "main_release"}, k = 1, mv = {1, 1, 10})
public interface MainViewComponent$Parent {
    @NotNull
    List<MainPage> mainPages();

    @NotNull
    MainTabbedPageLayoutAdapter mainTabbedPageLayoutAdapter();

    @NotNull
    Set<OnPageSelectedListener> pageSelectedListeners();
}
