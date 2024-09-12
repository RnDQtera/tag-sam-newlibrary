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
//WebUI.setText(findTestObject('00-01 ID'), GlobalVariable.id2)
//
//WebUI.setText(findTestObject('00-02 PASS'), GlobalVariable.pass)
//
//WebUI.delay(3, FailureHandling.STOP_ON_FAILURE)
//
//WebUI.click(findTestObject('00-03 Button Login'), FailureHandling.STOP_ON_FAILURE)
//
//WebUI.click(findTestObject('00-04 Modul Fixed Asset'), FailureHandling.STOP_ON_FAILURE)
//
//WebUI.delay(10, FailureHandling.STOP_ON_FAILURE)
//
//WebUI.click(findTestObject('001 Reusable Component/001.001 Reusable - Menu Fixed Asset'), FailureHandling.STOP_ON_FAILURE)
//
//WebUI.click(findTestObject('001 Reusable Component/001.003 Reusable - Menu Fixed Asset - Available'), FailureHandling.STOP_ON_FAILURE)
//
//WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)
WebUI.click(findTestObject('001 Reusable Component/001.026 Reusable - Button FIlter Available Asset'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('001 Reusable Component/001.027 Reusable - Select Data Asset Name'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('001 Reusable Component/001.028 Reusable - Text Field Filter Data'), 'Sofa Ruang Kerja')

WebUI.click(findTestObject('001 Reusable Component/001.029 Reusable - Check Result Text Field'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('001 Reusable Component/001.030 Reusable - Apply Filter Available Asset'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('OBJ.022 - Modul Borrow Transaction/OBJ.022.060 Check Box Available Asset'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('OBJ.00 - Fixed Asset - Bulk Action Add Pre-list Borrows/OBJ.027.002 Button Bulk Action'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(1, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('OBJ.00 - Fixed Asset - Bulk Action Add Pre-list Borrows/OBJ.027.010 Action Bulk Add to Borrowing Pre-list'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.delay(5, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('OBJ.00 - Fixed Asset - Bulk Action Add Pre-list Borrows/OBJ.027.011 Button Search User Add Borrowing Pre-list'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('OBJ.00 - Fixed Asset - Bulk Action Add Pre-list Borrows/OBJ.027.012 Text Field Search User Add Borrowing Pre-list'), 
    'Smith Doe')

WebUI.sendKeys(findTestObject('OBJ.00 - Fixed Asset - Bulk Action Add Pre-list Borrows/OBJ.027.012 Text Field Search User Add Borrowing Pre-list'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('OBJ.00 - Fixed Asset - Bulk Action Add Pre-list Borrows/OBJ.027.013 Select user from search result'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('OBJ.00 - Fixed Asset - Bulk Action Add Pre-list Borrows/OBJ.027.014 Select and Seubmit Pre-list borrow'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('001 Reusable Component/001.004 Reusable - Menu Fixed Asset - Borrow'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('OBJ.022 - Modul Borrow Transaction/OBJ.022.001 Single Action Tab Pre-list Modul Borrow'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('OBJ.022 - Modul Borrow Transaction/OBJ.022.002 Action Request Borrowing'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('OBJ.022 - Modul Borrow Transaction/OBJ.022.061 Check Asset for remove'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('OBJ.022 - Modul Borrow Transaction/OBJ.022.062 Bulk Action Borrowing requet'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('OBJ.022 - Modul Borrow Transaction/OBJ.022.065 Action Bulk Delete Asset Request'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('OBJ.022 - Modul Borrow Transaction/OBJ.022.066 Confirm Rmeove from Bulk Action'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

WebUI.takeScreenshot('Screenshot/011. Modul Borrow/TC.002.002.015 - Remove Asset yang akan di request Borrow.png', FailureHandling.STOP_ON_FAILURE)

