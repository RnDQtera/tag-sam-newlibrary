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
WebUI.click(findTestObject('001 Reusable Component/001.022 Reusable - Menu Setting - Menu Accounting'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('OBJ.007. - Setting Accounting/OBJ.001.021 Sub tab account code list'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('OBJ.007. - Setting Accounting/OBJ.001.022 Add Account Code List'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('OBJ.007. - Setting Accounting/OBJ.001.023 Enter Account Code'), '2001-1')

WebUI.setText(findTestObject('OBJ.007. - Setting Accounting/OBJ.001.024 Enter Account Code Name'), 'Asset tetap')

WebUI.click(findTestObject('OBJ.007. - Setting Accounting/OBJ.001.026 Submit Account Code'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(1, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('OBJ.007. - Setting Accounting/OBJ.001.027 Button Search'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('OBJ.007. - Setting Accounting/OBJ.001.028 Text Field Search'), 'Asset tetap')

WebUI.sendKeys(findTestObject('OBJ.007. - Setting Accounting/OBJ.001.028 Text Field Search'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('OBJ.007. - Setting Accounting/OBJ.001.029 Single Action'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('OBJ.007. - Setting Accounting/OBJ.001.030 Single Action Edit'), FailureHandling.STOP_ON_FAILURE)

WebUI.sendKeys(findTestObject('OBJ.007. - Setting Accounting/OBJ.001.023 Enter Account Code'), Keys.chord(Keys.CONTROL, 
        'a', Keys.DELETE))

WebUI.setText(findTestObject('OBJ.007. - Setting Accounting/OBJ.001.023 Enter Account Code'), '1234')

WebUI.setText(findTestObject('OBJ.007. - Setting Accounting/OBJ.001.024 Enter Account Code Name'), 'Code Edited')

WebUI.click(findTestObject('OBJ.007. - Setting Accounting/OBJ.001.026 Submit Account Code'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(1, FailureHandling.STOP_ON_FAILURE)

WebUI.takeScreenshot('Screenshot/007.Accounting Setting/TC.007.006 - Edit Account Code.png', FailureHandling.STOP_ON_FAILURE)

WebUI.delay(1, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('OBJ.007. - Setting Accounting/OBJ.001.027 Button Search'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('OBJ.007. - Setting Accounting/OBJ.001.028 Text Field Search'), 'Code Edited')

WebUI.sendKeys(findTestObject('OBJ.007. - Setting Accounting/OBJ.001.028 Text Field Search'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('OBJ.007. - Setting Accounting/OBJ.001.029 Single Action'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('OBJ.007. - Setting Accounting/OBJ.001.031 Single Action Delete'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('OBJ.007. - Setting Accounting/OBJ.001.032 Confirm Delete'), FailureHandling.STOP_ON_FAILURE)

