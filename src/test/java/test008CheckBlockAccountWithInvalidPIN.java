import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import api.Specification;
import services.*;

public class test008CheckBlockAccountWithInvalidPIN implements Specification, TextGenerator {

    private String categoryCode;
    private String modelCode;
    private String goodCode;
    private String basketId;
    private String typeApplication;
    private String applicationID;
    private String countModel = "1";

    private CategoriesService categoriesService;
    private ModelsService modelsService;
    private BasketOnlineService basketOnlineService;
    private LeasingApplicationService leasingApplicationService;
    private UploadPhotoService uploadPhotoService;

    @BeforeMethod
    public void setUp() {
        categoriesService = new CategoriesService();
        modelsService = new ModelsService();
        basketOnlineService = new BasketOnlineService();
        leasingApplicationService = new LeasingApplicationService();
        uploadPhotoService = new UploadPhotoService();
    }

    @Test
    void test() {
        categoryCode = categoriesService
                .getCodeCategoryIphone();
        ;

        modelCode = modelsService
                .getRandomModelCode(categoryCode);
        ;

        goodCode = modelsService
                .getRandomModelGoodCode(modelCode);
        ;

        basketId = basketOnlineService
                .getBasketId(countModel, goodCode);
        ;

        typeApplication = basketOnlineService
                .getTypeApplication(basketId);
        ;

        applicationID = leasingApplicationService
                .getApplicationId(basketId, typeApplication, generateEmail(), generateMobilePhone());
        ;

        for (int i = 0; i < 5; i++) {
            leasingApplicationService
                    .postLeasingAppCheckConsentsOtpWithInvalidMobileCode(applicationID, generateInvalidMobileCode())
            ;
        }

        leasingApplicationService
                .postLeasingAppCheckConsentsOtpWithInvalidTokenWithRejectOrder(applicationID, generateInvalidMobileCode())
        ;

        leasingApplicationService
                .getLeasingAppShortCheckWithRejectOrderInfo(applicationID)
        ;
    }
}
