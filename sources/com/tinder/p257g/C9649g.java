package com.tinder.p257g;

import android.support.annotation.NonNull;
import com.google.gson.Gson;
import com.google.gson.JsonParseException;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.tinder.api.ManagerWebServices;
import com.tinder.model.ProcessedPhoto;
import com.tinder.model.ProcessingPhotos;
import com.tinder.model.ProfilePhoto;
import com.tinder.utils.C15375x;
import com.tinder.utils.ad;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.tinder.g.g */
public class C9649g {
    /* renamed from: a */
    private static final Gson f32190a = C15375x.a();

    @NonNull
    /* renamed from: a */
    public static ProcessingPhotos m40052a(JsonReader jsonReader) throws IOException, JsonParseException {
        jsonReader.beginObject();
        List list = null;
        boolean z = true;
        while (jsonReader.hasNext()) {
            if (jsonReader.peek() == JsonToken.NAME) {
                String nextName = jsonReader.nextName();
                Object obj = -1;
                int hashCode = nextName.hashCode();
                if (hashCode != -989034367) {
                    if (hashCode == 1977307537) {
                        if (nextName.equals(ManagerWebServices.PARAM_PROCESSING_PHOTOS)) {
                            obj = null;
                        }
                    }
                } else if (nextName.equals("photos")) {
                    obj = 1;
                }
                switch (obj) {
                    case null:
                        z = jsonReader.nextBoolean();
                        break;
                    case 1:
                        list = C9649g.m40053b(jsonReader);
                        break;
                    default:
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("Processing Photo json field (");
                        stringBuilder.append(nextName);
                        stringBuilder.append(") is not known, skipping");
                        ad.c(stringBuilder.toString());
                        jsonReader.skipValue();
                        break;
                }
            }
            jsonReader.skipValue();
            ad.c("User processing photos JSON was invalid.");
        }
        jsonReader.endObject();
        return new ProcessingPhotos(list, z);
    }

    @NonNull
    /* renamed from: b */
    public static List<ProfilePhoto> m40053b(JsonReader jsonReader) throws IOException, JsonParseException {
        jsonReader.beginArray();
        List<ProfilePhoto> list = null;
        while (jsonReader.hasNext()) {
            jsonReader.beginObject();
            List list2 = null;
            String str = list2;
            String str2 = str;
            String str3 = str2;
            while (jsonReader.hasNext()) {
                if (jsonReader.peek() == JsonToken.NAME) {
                    String nextName = jsonReader.nextName();
                    Object obj = -1;
                    int hashCode = nextName.hashCode();
                    if (hashCode != 3355) {
                        if (hashCode != 116079) {
                            if (hashCode != 3135223) {
                                if (hashCode == 624779209) {
                                    if (nextName.equals(ManagerWebServices.PARAM_PROCESSED_FILES_CAMEL)) {
                                        obj = 3;
                                    }
                                }
                            } else if (nextName.equals(ManagerWebServices.PARAM_FACEBOOK_ID_SHORT)) {
                                obj = 2;
                            }
                        } else if (nextName.equals("url")) {
                            obj = 1;
                        }
                    } else if (nextName.equals("id")) {
                        obj = null;
                    }
                    switch (obj) {
                        case null:
                            str = jsonReader.nextString();
                            break;
                        case 1:
                            str2 = jsonReader.nextString();
                            break;
                        case 2:
                            str3 = jsonReader.nextString();
                            break;
                        case 3:
                            list2 = C9649g.m40054c(jsonReader);
                            break;
                        default:
                            StringBuilder stringBuilder = new StringBuilder();
                            stringBuilder.append("Processed Photo json field (");
                            stringBuilder.append(nextName);
                            stringBuilder.append(") is not known, skipping");
                            ad.c(stringBuilder.toString());
                            jsonReader.skipValue();
                            break;
                    }
                }
                jsonReader.skipValue();
                ad.c("User photos JSON was invalid.");
            }
            if (r2 != null) {
                for (ProcessedPhoto photoId : r2) {
                    photoId.setPhotoId(str);
                }
            }
            ProfilePhoto profilePhoto = new ProfilePhoto(str2, str, r2);
            profilePhoto.facebookId = str3;
            if (list == null) {
                list = new ArrayList();
            }
            list.add(profilePhoto);
            jsonReader.endObject();
        }
        jsonReader.endArray();
        return list == null ? Collections.EMPTY_LIST : list;
    }

    @NonNull
    /* renamed from: c */
    private static List<ProcessedPhoto> m40054c(JsonReader jsonReader) throws IOException, JsonParseException {
        jsonReader.beginArray();
        List<ProcessedPhoto> list = null;
        while (jsonReader.hasNext()) {
            jsonReader.beginObject();
            String str = null;
            int i = -1;
            int i2 = -1;
            while (jsonReader.hasNext()) {
                if (jsonReader.peek() == JsonToken.NAME) {
                    Object obj;
                    StringBuilder stringBuilder;
                    String nextName = jsonReader.nextName();
                    int hashCode = nextName.hashCode();
                    if (hashCode == -1221029593) {
                        if (nextName.equals("height")) {
                            obj = 2;
                            switch (obj) {
                                case null:
                                    str = jsonReader.nextString();
                                    break;
                                case 1:
                                    i = jsonReader.nextInt();
                                    break;
                                case 2:
                                    i2 = jsonReader.nextInt();
                                    break;
                                default:
                                    stringBuilder = new StringBuilder();
                                    stringBuilder.append("Processed Photo json field (");
                                    stringBuilder.append(nextName);
                                    stringBuilder.append(") is not known, skipping");
                                    ad.c(stringBuilder.toString());
                                    jsonReader.skipValue();
                                    break;
                            }
                        }
                    } else if (hashCode == 116079) {
                        if (nextName.equals("url")) {
                            obj = null;
                            switch (obj) {
                                case null:
                                    str = jsonReader.nextString();
                                    break;
                                case 1:
                                    i = jsonReader.nextInt();
                                    break;
                                case 2:
                                    i2 = jsonReader.nextInt();
                                    break;
                                default:
                                    stringBuilder = new StringBuilder();
                                    stringBuilder.append("Processed Photo json field (");
                                    stringBuilder.append(nextName);
                                    stringBuilder.append(") is not known, skipping");
                                    ad.c(stringBuilder.toString());
                                    jsonReader.skipValue();
                                    break;
                            }
                        }
                    } else if (hashCode == 113126854) {
                        if (nextName.equals("width")) {
                            obj = 1;
                            switch (obj) {
                                case null:
                                    str = jsonReader.nextString();
                                    break;
                                case 1:
                                    i = jsonReader.nextInt();
                                    break;
                                case 2:
                                    i2 = jsonReader.nextInt();
                                    break;
                                default:
                                    stringBuilder = new StringBuilder();
                                    stringBuilder.append("Processed Photo json field (");
                                    stringBuilder.append(nextName);
                                    stringBuilder.append(") is not known, skipping");
                                    ad.c(stringBuilder.toString());
                                    jsonReader.skipValue();
                                    break;
                            }
                        }
                    }
                    obj = -1;
                    switch (obj) {
                        case null:
                            str = jsonReader.nextString();
                            break;
                        case 1:
                            i = jsonReader.nextInt();
                            break;
                        case 2:
                            i2 = jsonReader.nextInt();
                            break;
                        default:
                            stringBuilder = new StringBuilder();
                            stringBuilder.append("Processed Photo json field (");
                            stringBuilder.append(nextName);
                            stringBuilder.append(") is not known, skipping");
                            ad.c(stringBuilder.toString());
                            jsonReader.skipValue();
                            break;
                    }
                }
                jsonReader.skipValue();
                ad.c("Processed photos JSON was invalid.");
            }
            if (str == null) {
                throw new JsonParseException("Processed photos expects `url` but did not find it.");
            } else if (i == -1) {
                throw new JsonParseException("Processed photos expects `width` but did not find it.");
            } else if (i2 == -1) {
                throw new JsonParseException("Processed photos expects `height` but did not find it.");
            } else {
                jsonReader.endObject();
                ProcessedPhoto processedPhoto = new ProcessedPhoto(str, i, i2);
                if (list == null) {
                    list = new ArrayList();
                }
                list.add(processedPhoto);
            }
        }
        jsonReader.endArray();
        return list == null ? Collections.EMPTY_LIST : list;
    }
}
