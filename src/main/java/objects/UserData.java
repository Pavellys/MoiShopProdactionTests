package objects;

import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class UserData {
    String fullName;
    @SerializedName("phone-mask")
    String phone_mask;
    String comment;
}
