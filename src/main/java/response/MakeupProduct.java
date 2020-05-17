package response;

import lombok.Getter;
import lombok.Setter;
import java.util.Arrays;

@Getter
@Setter
public class MakeupProduct {

    private String website_link;
    private String image_link;
    private String rating;
    private String description;
    private String created_at;
    private String api_featured_image;
    private String product_type;
    private String updated_at;
    private String price;
    private String[] tag_list;
    private String name;
    private String id;
    private String category;
    private ProductColorsData[] product_colors;
    private String brand;
    private String product_api_url;
    private String product_link;

    @Override
    public String toString() {
        return "MakeupResponse{" +
                "website_link='" + website_link + '\'' +
                ", image_link='" + image_link + '\'' +
                ", rating='" + rating + '\'' +
                ", description='" + description + '\'' +
                ", created_at='" + created_at + '\'' +
                ", api_featured_image='" + api_featured_image + '\'' +
                ", product_type='" + product_type + '\'' +
                ", updated_at='" + updated_at + '\'' +
                ", price='" + price + '\'' +
                ", tag_list=" + Arrays.toString(tag_list) +
                ", name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", category='" + category + '\'' +
                ", product_colors=" + Arrays.toString(product_colors) +
                ", brand='" + brand + '\'' +
                ", product_api_url='" + product_api_url + '\'' +
                ", product_link='" + product_link + '\'' +
                '}';
    }


}
