package response;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProductColorsData {
    private String colour_name;
    private String hex_value;

    @Override
    public String toString() {
        return "ProductColorsData{" +
                "colour_name='" + colour_name + '\'' +
                ", hex_value='" + hex_value + '\'' +
                '}';
    }
}
