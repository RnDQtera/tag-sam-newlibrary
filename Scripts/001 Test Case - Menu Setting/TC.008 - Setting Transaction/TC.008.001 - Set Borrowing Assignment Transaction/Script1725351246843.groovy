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

//WebUI.openBrowser('')
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
WebUI.click(findTestObject('001 Reusable Component/001.023 Reusable - Menu Setting - Menu Transaction'), FailureHandling.STOP_ON_FAILURE)

WebUI.sendKeys(findTestObject('OBJ.008 - Setting Transaction/001. Borrowing and Assignment/OBJ.008.001.001 Text Field Max Borrowing Time'), 
    Keys.chord(Keys.CONTROL, 'a', Keys.DELETE))

WebUI.setText(findTestObject('OBJ.008 - Setting Transaction/001. Borrowing and Assignment/OBJ.008.001.001 Text Field Max Borrowing Time'), 
    '20')

WebUI.delay(4, FailureHandling.STOP_ON_FAILURE)

WebUI.takeScreenshot('Screenshot/008. Transaction Setting/TC.008.001 - Set Max Borrowing Time.png', FailureHandling.STOP_ON_FAILURE)

WebUI.sendKeys(findTestObject('OBJ.008 - Setting Transaction/001. Borrowing and Assignment/OBJ.008.001.002 Text Field Default Borrowing Time'), 
    Keys.chord(Keys.CONTROL, 'a', Keys.DELETE))

WebUI.setText(findTestObject('OBJ.008 - Setting Transaction/001. Borrowing and Assignment/OBJ.008.001.002 Text Field Default Borrowing Time'), 
    '20')

WebUI.delay(4, FailureHandling.STOP_ON_FAILURE)

WebUI.takeScreenshot('Screenshot/008. Transaction Setting/TC.008.002 - Set Default Borrowing Time.png', FailureHandling.STOP_ON_FAILURE)

WebUI.sendKeys(findTestObject('OBJ.008 - Setting Transaction/001. Borrowing and Assignment/OBJ.008.001.003 Text Field Confirmation Email'), 
    Keys.chord(Keys.CONTROL, 'a', Keys.DELETE))

WebUI.setText(findTestObject('OBJ.008 - Setting Transaction/001. Borrowing and Assignment/OBJ.008.001.003 Text Field Confirmation Email'), 
    '1')

WebUI.delay(4, FailureHandling.STOP_ON_FAILURE)

WebUI.takeScreenshot('Screenshot/008. Transaction Setting/TC.008.003 - Set Confirm Email Timeout.png', FailureHandling.STOP_ON_FAILURE)

WebUI.sendKeys(findTestObject('OBJ.008 - Setting Transaction/001. Borrowing and Assignment/OBJ.008.001.004 Transaction Time Out'), 
    Keys.chord(Keys.CONTROL, 'a', Keys.DELETE))

WebUI.setText(findTestObject('OBJ.008 - Setting Transaction/001. Borrowing and Assignment/OBJ.008.001.004 Transaction Time Out'), 
    '20')

WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

WebUI.takeScreenshot('Screenshot/008. Transaction Setting/TC.008.004 - Set Transaction Timeout.png', FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('OBJ.008 - Setting Transaction/001. Borrowing and Assignment/OBJ.008.001.005 Save Data Borrowing Assignment'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('OBJ.008 - Setting Transaction/001. Borrowing and Assignment/OBJ.008.001.006 Data Change Log'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3, FailureHandling.STOP_ON_FAILURE)

WebUI.takeScreenshot('Screenshot/008. Transaction Setting/TC.008.001 - Set Transaction time Borrowing and Assignment.png', 
    FailureHandling.STOP_ON_FAILURE)

