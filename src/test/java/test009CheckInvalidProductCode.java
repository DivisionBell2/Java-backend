import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import api.Specification;
import services.CatalogService;

public class test009CheckInvalidProductCode implements Specification, TextGenerator {

    private CatalogService catalogService;

    @BeforeMethod
    public void setUp() {
        catalogService = new CatalogService();
    }

    @Test(description = "Correct checkout order of the iPhone application")
    void test() {
        catalogService.getCatalogGoodsInvalid("SM-AAAAAAAAAA");
    }
}

