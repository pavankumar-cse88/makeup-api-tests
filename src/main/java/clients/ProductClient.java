package clients;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import constants.Constants;
import io.restassured.response.Response;
import response.MakeupProduct;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.List;

import static io.restassured.RestAssured.given;

public class ProductClient {

    static ProductClient productClient;

    public List<MakeupProduct> getProducts(String productBrand, String productType, String productCategory) throws Exception {

            Response response = given()
                    .queryParam("brand", productBrand)
                    .queryParam("product_type", productType)
                    .queryParam("category", productCategory)
                    .get(Constants.BaseUri + Constants.Version + Constants.EndpointProduct);

            if (response.statusCode() != 200) {
                throw new Exception("Expected Response status code is not matching");
            }

            Gson gson = new Gson();
            Type listType = new TypeToken<Collection<MakeupProduct>>() {
            }.getType();
            List<MakeupProduct> productsList = gson.fromJson(response.asString(), listType);
            return productsList;
    }

    public static ProductClient getInstance(){

        if(productClient == null)
            return new ProductClient();
        else
            return productClient;

    }


}
