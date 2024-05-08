import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('https://opensource-demo.orangehrmlive.com/web/index.php/auth/login')

WebUI.setText(findTestObject('Test_manual/Page_OrangeHRM/input_Username_username'), 'Admin')

WebUI.setText(findTestObject('Test_manual/Page_OrangeHRM/input_Password_password'), 'admin123')

WebUI.click(findTestObject('Test_manual/Page_OrangeHRM/button_Login'))

WebUI.click(findTestObject('Test_manual/Page_OrangeHRM/div_Dashboard'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Test_manual/Page_OrangeHRM/a_Admin'))

WebUI.click(findTestObject('Test_manual/Page_OrangeHRM/li_Job'))

WebUI.click(findTestObject('Test_manual/Page_OrangeHRM/li_Job Titles'))

WebUI.click(findTestObject('Test_manual/Page_OrangeHRM/button_Add'))

WebUI.setText(findTestObject('Test_manual/Page_OrangeHRM/input_Job Title_oxd-input oxd-input--focus'), 'test title 1')

WebUI.verifyElementNotPresent(findTestObject('Test_manual/Page_OrangeHRM/span_Already exists'), 10)

WebUI.setText(findTestObject('Test_manual/Page_OrangeHRM/textarea_Job Description_oxd-textarea oxd-textarea--focus oxd-textarea--resize-vertical'), 
    'description')

WebUI.click(findTestObject('Test_manual/Page_OrangeHRM/button_Save'))

WebUI.verifyElementVisible(findTestObject('Page_OrangeHRM/h6_Job Titles'), FailureHandling.STOP_ON_FAILURE)

