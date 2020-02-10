package services;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Base64;
import java.util.HashMap;
import java.util.UUID;

public class BodyForTest {

    protected HashMap getHashMapImageEncoder(String imageType, String path) {
        return new HashMap() {{
            try {
                put("imageData", new String(Base64.getEncoder().encode(FileUtils.readFileToByteArray
                        (new File(path)))));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            put("imageType", imageType);
        }};
    }

    protected HashMap getBodyBasketOnline(String countModel, String goodCode) {
        return new HashMap() {{
            put("agentId", "null");
            put("basketData", new ArrayList<HashMap>() {{
                add(new HashMap() {{
                    put("count", countModel);
                    put("goodCode", goodCode);
                    put("tradeInfo", "null");
                }});
            }});
            put("channel", "channelName");
            put("lang", "ru");
            put("partnerData", new HashMap() {{
                put("infoData", "{}");
            }});
            put("usid", UUID.randomUUID());
        }};
    }

    protected HashMap getBodyForApplicationId(String basketId, String typeApplication, String email, String mobilePhone) {
        return new HashMap() {{
            put("agreementSimpleSign", "true");
            put("basketId", basketId);
            put("email", email);
            put("mobilePhone", mobilePhone);
            put("previousApplicationId", null);
            put("type", typeApplication);
        }};
    }

    protected HashMap getBodyForAuthToken(String mobileCode) {
        return new HashMap() {{
            put("otp", mobileCode);
        }};
    }

    protected HashMap getBodyForClientData() {
        return new HashMap() {{
            put("clientInfo", new HashMap() {{
                put("birthDate", "1972-07-23");
                put("birthPlace", "С. ФРОНТОВКА ОРАТОВСКОГО Р-НА ВИННИЦКОЙ ОБЛ.");
                put("documentType", "PASSPORT");
                put("firstName", "СЕРГЕЙ");
                put("hasMiddleName", true);
                put("issueDate", "2015-12-18");
                put("issuer", "ОТДЕЛ УФМС РОССИИ ПО РЕСПУБЛИКЕ КРЫМ В КИЕВСКОМ РАЙОНЕ Г. СИМФЕРОПОЛЯ");
                put("issuerCode", "910-003");
                put("lastName", "ЗДРИЛЮК");
                put("patronymicName", "АНАТОЛЬЕВИЧ");
                put("registrationAddress", new HashMap() {{
                    put("blockNum", null);
                    put("buildingNum", null);
                    put("district", null);
                    put("districtCode", "000");
                    put("flatNum", "3");
                    put("locality", "Авиационный");
                    put("localityCode", "000");
                    put("localityType", null);
                    put("region", "Московская");
                    put("regionCode", "50");
                    put("street", "Королева");
                    put("streetCode", "0784");
                    put("streetNum", "10");
                    put("taxCode", "142007");
                    put("town", "Домодедово");
                    put("townCode", "001");
                }});
                put("sex", "MALE");
            }});
            put("monthlySalary", "70000");
            put("occupation", "COMMERCIAL_EMPLOYEE");
        }};
    }
}
