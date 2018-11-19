package com.tinder.main.di;

import dagger.Component;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Component(dependencies = {MainViewComponent$Parent.class})
@MainViewScope
@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/tinder/main/di/MainViewComponent;", "", "Builder", "Parent", "Provider", "main_release"}, k = 1, mv = {1, 1, 10})
public interface MainViewComponent {

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/tinder/main/di/MainViewComponent$Builder;", "", "build", "Lcom/tinder/main/di/MainViewComponent;", "parent", "Lcom/tinder/main/di/MainViewComponent$Parent;", "main_release"}, k = 1, mv = {1, 1, 10})
    @dagger.Component.Builder
    public interface Builder {
        @NotNull
        MainViewComponent build();

        @NotNull
        Builder parent(@NotNull MainViewComponent$Parent mainViewComponent$Parent);
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, d2 = {"Lcom/tinder/main/di/MainViewComponent$Provider;", "", "getMainViewComponent", "Lcom/tinder/main/di/MainViewComponent;", "main_release"}, k = 1, mv = {1, 1, 10})
    public interface Provider {
        @NotNull
        MainViewComponent getMainViewComponent();
    }
}
