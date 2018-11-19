package com.tinder.onboarding.model.network;

import android.support.annotation.Nullable;
import com.google.gson.annotations.SerializedName;
import java.util.List;

public class Photos {
    @Nullable
    @SerializedName("fbId")
    private String mFbId;
    @Nullable
    @SerializedName("extension")
    private String mFileExtension;
    @Nullable
    @SerializedName("fileName")
    private String mFileName;
    @Nullable
    @SerializedName("id")
    private String mId;
    @Nullable
    @SerializedName("url")
    private String mImageUrl;
    @Nullable
    @SerializedName("processedFiles")
    private List<ProcessedPhotos> mProcessedPhotos;

    public class ProcessedPhotos {
        @Nullable
        @SerializedName("height")
        private int mHeight;
        @Nullable
        @SerializedName("url")
        private String mUrl;
        @Nullable
        @SerializedName("width")
        private int mWidth;

        @Nullable
        public int getHeight() {
            return this.mHeight;
        }

        @Nullable
        public int getWidth() {
            return this.mWidth;
        }

        @Nullable
        public String getUrl() {
            return this.mUrl;
        }
    }

    @Nullable
    public String getId() {
        return this.mId;
    }

    @Nullable
    public String getFbId() {
        return this.mFbId;
    }

    @Nullable
    public String getFileExtension() {
        return this.mFileExtension;
    }

    @Nullable
    public String getFileName() {
        return this.mFileName;
    }

    @Nullable
    public String getImageUrl() {
        return this.mImageUrl;
    }

    @Nullable
    public List<ProcessedPhotos> getProcessedPhotos() {
        return this.mProcessedPhotos;
    }
}
