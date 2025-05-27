package org.exampleSeleniumFrameworkProjectVWO.tests.pageObjectModelTests.vwo;

import io.qameta.allure.Description;
import org.exampleSeleniumFrameworkProjectVWO.base.CommonToAllTest;
import org.exampleSeleniumFrameworkProjectVWO.pages.pageObjectModel.normal_POM.LoginPage;
import org.exampleSeleniumFrameworkProjectVWO.utils.PropertiesReader;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.exampleSeleniumFrameworkProjectVWO.driver.DriverManager.driver;

public class TestVWOLogin_01_NormalScript_POM extends CommonToAllTest {

    @Description("Verify that with invalid email, pass, error message is shown on the app.vwo.com")
    @Test
    public void test_negative_vwo_login() {

        // Driver Manager Code - 1
        // Page Class Code (POM Code) - 2
        LoginPage loginPage = new LoginPage(driver);
        String error_msg = loginPage.loginToVWOLoginInvalidCreds(PropertiesReader.readKey("invalid_username"), PropertiesReader.readKey("invalid_password"));

        // Assertions - 3
        assertThat(error_msg).isNotNull().isNotBlank().isNotEmpty();
        Assert.assertEquals(error_msg, PropertiesReader.readKey("error_message"));

    }

}
