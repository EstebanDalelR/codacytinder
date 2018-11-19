package com.tinder.api.retrofit;

import com.tinder.api.model.profile.ImageUploadResponse;
import io.reactivex.C3960g;
import kotlin.Metadata;
import okhttp3.C17690n.C15960b;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;
import retrofit2.http.Query;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\"\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\bH'¨\u0006\t"}, d2 = {"Lcom/tinder/api/retrofit/TinderImageUploadService;", "", "uploadPhoto", "Lio/reactivex/Single;", "Lcom/tinder/api/model/profile/ImageUploadResponse;", "photoId", "", "image", "Lokhttp3/MultipartBody$Part;", "api_release"}, k = 1, mv = {1, 1, 10})
public interface TinderImageUploadService {
    @Multipart
    @NotNull
    @POST("/image")
    C3960g<ImageUploadResponse> uploadPhoto(@NotNull @Query("client_photo_id") String str, @NotNull @Part C15960b c15960b);
}
