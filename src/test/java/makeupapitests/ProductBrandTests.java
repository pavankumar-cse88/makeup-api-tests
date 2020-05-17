package makeupapitests;

import clients.ProductClient;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import response.MakeupProduct;
import java.util.List;

public class ProductBrandTests {

    @Test(dataProvider = "queryParameters",description = "validates product colors")
    void validateProductColor(String brand,String productType,String productCategory) throws Exception {

      List<MakeupProduct> makeupResponseProducts =  ProductClient.getInstance().getProducts(brand,
              productType,productCategory);
      for(MakeupProduct makeupProduct :makeupResponseProducts)
          Assert.assertEquals(makeupProduct.getBrand(), brand);
    }

    @DataProvider(name = "queryParameters")
    Object[][] getQueryParameters(){
        return new  Object[][]{
            {"maybelline","eyeliner","pencil"}
        };
    }
}


