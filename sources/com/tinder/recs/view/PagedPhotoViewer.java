package com.tinder.recs.view;

import android.content.Context;
import android.support.annotation.Nullable;
import com.bumptech.glide.load.resource.bitmap.C3082c;
import com.tinder.base.view.listener.OnPhotoPageChangeListener;
import com.tinder.profile.view.BasicInfoView.OnExitClickListener;
import com.tinder.profile.view.BasicInfoView.OnScrollStateChangeListener;
import java.util.List;

public interface PagedPhotoViewer {

    public static class PagedPhotoViewerModel {
        private int currentIndex;
        @Nullable
        private PhotoDecorator photoDecorator;
        private List<String> photoUrls;
        private String userId;

        public PagedPhotoViewerModel(String str, List<String> list, int i) {
            this.userId = str;
            this.photoUrls = list;
            this.currentIndex = i;
        }

        public PagedPhotoViewerModel(String str, List<String> list, int i, PhotoDecorator photoDecorator) {
            this.userId = str;
            this.photoUrls = list;
            this.currentIndex = i;
            this.photoDecorator = photoDecorator;
        }

        public String getUserId() {
            return this.userId;
        }

        public void setUserId(String str) {
            this.userId = str;
        }

        public List<String> getPhotoUrls() {
            return this.photoUrls;
        }

        public void setPhotoUrls(List<String> list) {
            this.photoUrls = list;
        }

        public int getCurrentIndex() {
            return this.currentIndex;
        }

        public void setCurrentIndex(int i) {
            this.currentIndex = i;
        }

        @Nullable
        public PhotoDecorator getPhotoDecorator() {
            return this.photoDecorator;
        }

        public void setPhotoDecorator(@Nullable PhotoDecorator photoDecorator) {
            this.photoDecorator = photoDecorator;
        }
    }

    public interface PhotoDecorator {
        C3082c transformer(Context context);
    }

    void bind(PagedPhotoViewerModel pagedPhotoViewerModel);

    void setOnExitClickListener(OnExitClickListener onExitClickListener);

    void setOnPhotoPageChangeListener(@Nullable OnPhotoPageChangeListener onPhotoPageChangeListener);

    void setOnScrollStateChangeListener(OnScrollStateChangeListener onScrollStateChangeListener);

    void showPhotoAtIndex(int i);
}
