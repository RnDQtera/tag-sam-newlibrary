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

//WebUI.openBrowser(GlobalVariable.URL)
//
//WebUI.maximizeWindow(FailureHandling.STOP_ON_FAILURE)
//
//WebUI.navigateToUrl(GlobalVariable.URL)
//
//WebUI.delay(5)
//
//WebUI.setText(findTestObject('00-01 ID'), GlobalVariable.id)
//
//WebUI.setText(findTestObject('00-02 PASS'), GlobalVariable.pass)
//
//WebUI.delay(3, FailureHandling.STOP_ON_FAILURE)
//
//WebUI.click(findTestObject('00-03 Button Login'), FailureHandling.STOP_ON_FAILURE)
//
//WebUI.click(findTestObject('00-04 Modul Fixed Asset'), FailureHandling.STOP_ON_FAILURE)
//
//WebUI.delay(8, FailureHandling.STOP_ON_FAILURE)
//
//WebUI.click(findTestObject('001 Reusable Component/001.016 Reusable - Menu Settings'), FailureHandling.STOP_ON_FAILURE)
//
//WebUI.click(findTestObject('001 Reusable Component/001.020 Reusable - Menu Setting - Custom FIeld'), FailureHandling.STOP_ON_FAILURE)
//
//WebUI.delay(8, FailureHandling.STOP_ON_FAILURE)
WebUI.click(findTestObject('OBJ.005 - Setting Custom Field/OBJ.005.033 Sub Tab Maintenance Routine'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('OBJ.005 - Setting Custom Field/OBJ.005.001 Add Custom Field'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('OBJ.005 - Setting Custom Field/OBJ.005.002 Create Field Name'), 'Custom Field Text Area')

WebUI.click(findTestObject('OBJ.005 - Setting Custom Field/OBJ.005.003 Choose Data Type'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('OBJ.005 - Setting Custom Field/OBJ.005.004 Select Data Type Text Area'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('OBJ.005 - Setting Custom Field/OBJ.005.016 Select Required Yes'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('OBJ.005 - Setting Custom Field/OBJ.005.018 Select Category'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('OBJ.005 - Setting Custom Field/OBJ.005.019 Serach Text Field Category'), 'Kendaraan')

WebUI.click(findTestObject('OBJ.005 - Setting Custom Field/OBJ.005.020 Choose Category'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('OBJ.005 - Setting Custom Field/OBJ.005.021 Select Category'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('OBJ.005 - Setting Custom Field/OBJ.005.023 Submit Create Custom Field'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('OBJ.005 - Setting Custom Field/OBJ.005.001 Add Custom Field'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('OBJ.005 - Setting Custom Field/OBJ.005.002 Create Field Name'), 'Field By QA')

WebUI.click(findTestObject('OBJ.005 - Setting Custom Field/OBJ.005.003 Choose Data Type'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('OBJ.005 - Setting Custom Field/OBJ.005.004 Select Data Type Text Area'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('OBJ.005 - Setting Custom Field/OBJ.005.016 Select Required Yes'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('OBJ.005 - Setting Custom Field/OBJ.005.018 Select Category'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('OBJ.005 - Setting Custom Field/OBJ.005.019 Serach Text Field Category'), 'Furnitur dan Aksesori')

WebUI.click(findTestObject('OBJ.005 - Setting Custom Field/OBJ.005.020 Choose Category'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('OBJ.005 - Setting Custom Field/OBJ.005.021 Select Category'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('OBJ.005 - Setting Custom Field/OBJ.005.023 Submit Create Custom Field'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('OBJ.005 - Setting Custom Field/OBJ.005.054 Download'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('OBJ.005 - Setting Custom Field/OBJ.005.043 Button Filter'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('OBJ.005 - Setting Custom Field/OBJ.005.044 Select Field Active Filter'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('OBJ.005 - Setting Custom Field/OBJ.005.045 Select Option Active'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('OBJ.005 - Setting Custom Field/OBJ.005.052 Apply FIlter'), FailureHandling.STOP_ON_FAILURE)

WebUI.takeScreenshot('Screenshot/005.Custom Field/TC.005.050 - FIlter Data Maintenance Routine - Sub Active.png', FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('OBJ.005 - Setting Custom Field/OBJ.005.047 Select Data Type'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('OBJ.005 - Setting Custom Field/OBJ.005.048 Select Option Text Area'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('OBJ.005 - Setting Custom Field/OBJ.005.052 Apply FIlter'), FailureHandling.STOP_ON_FAILURE)

WebUI.takeScreenshot('Screenshot/005.Custom Field/TC.005.051 - FIlter Data Maintenance Routine - Sub Data Type.png', FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('OBJ.005 - Setting Custom Field/OBJ.005.049 Select Type Required'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('OBJ.005 - Setting Custom Field/OBJ.005.051 Select Options Type Required No'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('OBJ.005 - Setting Custom Field/OBJ.005.052 Apply FIlter'), FailureHandling.STOP_ON_FAILURE)

WebUI.takeScreenshot('Screenshot/005.Custom Field/TC.005.052 - FIlter Data Maintenance Routine - Sub Required.png', FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('OBJ.005 - Setting Custom Field/OBJ.005.053 Clear Field'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('OBJ.005 - Setting Custom Field/OBJ.005.052 Apply FIlter'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('OBJ.005 - Setting Custom Field/OBJ.005.035 Select Check Box Tab General Information'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('OBJ.005 - Setting Custom Field/OBJ.005.036 Select Action Bulk Action'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('OBJ.005 - Setting Custom Field/OBJ.005.040 Delete for Bulk Action'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('OBJ.005 - Setting Custom Field/OBJ.005.041 Confirm Delete Custom FIeld'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('OBJ.005 - Setting Custom Field/OBJ.005.043 Button Filter'), FailureHandling.STOP_ON_FAILURE)

