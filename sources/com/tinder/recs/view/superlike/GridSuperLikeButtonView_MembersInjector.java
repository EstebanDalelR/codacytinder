package com.tinder.recs.view.superlike;

import com.tinder.recs.presenter.GridSuperLikeButtonPresenter;
import dagger.MembersInjector;
import javax.inject.Provider;

public final class GridSuperLikeButtonView_MembersInjector implements MembersInjector<GridSuperLikeButtonView> {
    private final Provider<GridSuperLikeButtonPresenter> presenterProvider;

    public GridSuperLikeButtonView_MembersInjector(Provider<GridSuperLikeButtonPresenter> provider) {
        this.presenterProvider = provider;
    }

    public static MembersInjector<GridSuperLikeButtonView> create(Provider<GridSuperLikeButtonPresenter> provider) {
        return new GridSuperLikeButtonView_MembersInjector(provider);
    }

    public void injectMembers(GridSuperLikeButtonView gridSuperLikeButtonView) {
        injectPresenter(gridSuperLikeButtonView, (GridSuperLikeButtonPresenter) this.presenterProvider.get());
    }

    public static void injectPresenter(GridSuperLikeButtonView gridSuperLikeButtonView, GridSuperLikeButtonPresenter gridSuperLikeButtonPresenter) {
        gridSuperLikeButtonView.presenter = gridSuperLikeButtonPresenter;
    }
}
