import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import api.Specification;
import services.BasketOnlineService;
import services.CategoriesService;
import services.LeasingApplicationService;
import services.ModelsService;

public class test004CheckOrderIphoneEmptyPhone implements Specification, TextGenerator {

    private String categoryCode;
    private String modelCode;
    private String goodCode;
    private String basketId;
    private String typeApplication;
    private String mobilePhoneEmpty = "";
    private String countModel = "1";

    private CategoriesService categoriesService;
    private ModelsService modelsService;
    private BasketOnlineService basketOnlineService;
    private LeasingApplicationService leasingApplicationService;

    @BeforeMethod
    public void setUp() {
        categoriesService = new CategoriesService();
        modelsService = new ModelsService();
        basketOnlineService = new BasketOnlineService();
        leasingApplicationService = new LeasingApplicationService();
    }

    @Test(description = "Making an application for an iPhone with empty phone")
    void test() {
        categoryCode = categoriesService
                .getCodeCategoryIphone();

        modelCode = modelsService
                .getRandomModelCode(categoryCode);

        goodCode = modelsService
                .getRandomModelGoodCode(modelCode);

        basketId = basketOnlineService
                .getBasketId(countModel, goodCode);

        typeApplication = basketOnlineService
                .getTypeApplication(basketId);

        leasingApplicationService
                .postLeasingApplicationEmptyPhone(basketId, typeApplication, generateEmail(), mobilePhoneEmpty);
    }
}

