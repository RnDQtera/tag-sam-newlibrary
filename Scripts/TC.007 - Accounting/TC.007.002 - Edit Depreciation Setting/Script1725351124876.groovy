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
//WebUI.setText(findTestObject('0001 ID'), GlobalVariable.id)
//
//WebUI.setText(findTestObject('0002 PASS'), GlobalVariable.pass)
//
//WebUI.delay(3, FailureHandling.STOP_ON_FAILURE)
//
//WebUI.click(findTestObject('0003 Button Login'), FailureHandling.STOP_ON_FAILURE)
//
//WebUI.click(findTestObject('0004 Modul Fixed Asset'), FailureHandling.STOP_ON_FAILURE)
//
//WebUI.delay(8, FailureHandling.STOP_ON_FAILURE)
//
//WebUI.click(findTestObject('001 Reusable Component/001.016 Reusable - Menu Settings'), FailureHandling.STOP_ON_FAILURE)
WebUI.click(findTestObject('001 Reusable Component/001.022 Reusable - Menu Setting - Menu Accounting'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('OBJ.007. - Setting Accounting/OBJ.001.001 Add Depreciation Group'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('OBJ.007. - Setting Accounting/OBJ.001.002 Enter Tengible Asset Group'), 'Test Data Depreciation Setting')

WebUI.setText(findTestObject('OBJ.007. - Setting Accounting/OBJ.001.003 Enter Number of Userful life'), '5')

WebUI.click(findTestObject('OBJ.007. - Setting Accounting/OBJ.001.005 Submit Create Depreciation Group'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('OBJ.007. - Setting Accounting/OBJ.001.006 Button Search'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('OBJ.007. - Setting Accounting/OBJ.001.007 Text Field Search Data Table'), 'Test Data Depreciation Setting')

WebUI.sendKeys(findTestObject('OBJ.007. - Setting Accounting/OBJ.001.007 Text Field Search Data Table'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('OBJ.007. - Setting Accounting/OBJ.001.008 Single Action'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('OBJ.007. - Setting Accounting/OBJ.001.009 Options Edit'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('OBJ.007. - Setting Accounting/OBJ.001.002 Enter Tengible Asset Group'), Keys.chord(Keys.CONTROL, 
        'a', Keys.DELETE))

WebUI.setText(findTestObject('OBJ.007. - Setting Accounting/OBJ.001.002 Enter Tengible Asset Group'), 'Edited Depreciation')

WebUI.setText(findTestObject('OBJ.007. - Setting Accounting/OBJ.001.003 Enter Number of Userful life'), Keys.chord(Keys.CONTROL, 
        'a', Keys.DELETE))

WebUI.setText(findTestObject('OBJ.007. - Setting Accounting/OBJ.001.003 Enter Number of Userful life'), '2')

WebUI.click(findTestObject('OBJ.007. - Setting Accounting/OBJ.001.005 Submit Create Depreciation Group'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

WebUI.takeScreenshot('Screenshot/007.Accounting Setting/TC.007.002 - Edited Depreciation Group.png', FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('OBJ.007. - Setting Accounting/OBJ.001.006 Button Search'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('OBJ.007. - Setting Accounting/OBJ.001.007 Text Field Search Data Table'), Keys.chord(Keys.CONTROL, 
        'a', Keys.DELETE))

WebUI.setText(findTestObject('OBJ.007. - Setting Accounting/OBJ.001.007 Text Field Search Data Table'), 'Edited Depreciation')

WebUI.sendKeys(findTestObject('OBJ.007. - Setting Accounting/OBJ.001.007 Text Field Search Data Table'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('OBJ.007. - Setting Accounting/OBJ.001.008 Single Action'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('OBJ.007. - Setting Accounting/OBJ.001.010 Options Delete'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('OBJ.007. - Setting Accounting/OBJ.001.012 Ok Confirm Delete'), FailureHandling.STOP_ON_FAILURE)

WebUI.refresh()

