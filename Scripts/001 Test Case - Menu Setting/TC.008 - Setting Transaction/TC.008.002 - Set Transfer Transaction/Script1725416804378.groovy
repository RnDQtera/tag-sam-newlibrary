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

WebUI.openBrowser('')

WebUI.maximizeWindow(FailureHandling.STOP_ON_FAILURE)

WebUI.navigateToUrl(GlobalVariable.URL)

WebUI.delay(5)

WebUI.setText(findTestObject('0001 ID'), GlobalVariable.id)

WebUI.setText(findTestObject('0002 PASS'), GlobalVariable.pass)

WebUI.delay(3, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('0003 Button Login'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('0004 Modul Fixed Asset'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(8, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('001 Reusable Component/001.016 Reusable - Menu Settings'), FailureHandling.STOP_ON_FAILURE)
WebUI.click(findTestObject('001 Reusable Component/001.023 Reusable - Menu Setting - Menu Transaction'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3, FailureHandling.STOP_ON_FAILURE)
WebUI.click(findTestObject('OBJ.008 - Setting Transaction/002. Transfer/OBJ.008.002.001 Sub Tab Transfer'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('OBJ.008 - Setting Transaction/002. Transfer/OBJ.008.002.002 Set Text Transaction Time Out'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.delay(0, FailureHandling.STOP_ON_FAILURE)

WebUI.sendKeys(findTestObject('OBJ.008 - Setting Transaction/002. Transfer/OBJ.008.002.002 Set Text Transaction Time Out'), 
    Keys.chord(Keys.CONTROL, 'A', Keys.DELETE))

WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('OBJ.008 - Setting Transaction/002. Transfer/OBJ.008.002.002 Set Text Transaction Time Out'), 
    '4')

WebUI.click(findTestObject('OBJ.008 - Setting Transaction/001. Borrowing and Assignment/OBJ.008.001.005 Save Data Borrowing Assignment'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.delay(4, FailureHandling.STOP_ON_FAILURE)

WebUI.takeScreenshot('Screenshot/008. Transaction Setting/TC.008.010 - Save Time Transfer Transaction.png', FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('OBJ.008 - Setting Transaction/001. Borrowing and Assignment/OBJ.008.001.006 Data Change Log'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('OBJ.008 - Setting Transaction/001. Borrowing and Assignment/OBJ.008.001.007 Button Search Data Changelog'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('OBJ.008 - Setting Transaction/001. Borrowing and Assignment/OBJ.008.001.008 Text Field Changelog Transaction Setting'), 
    'Transaction Timeout')

WebUI.sendKeys(findTestObject('OBJ.008 - Setting Transaction/001. Borrowing and Assignment/OBJ.008.001.008 Text Field Changelog Transaction Setting'), 
    Keys.chord(Keys.ENTER))

WebUI.sendKeys(findTestObject('OBJ.008 - Setting Transaction/001. Borrowing and Assignment/OBJ.008.001.008 Text Field Changelog Transaction Setting'), 
    Keys.chord(Keys.CONTROL, 'A', Keys.DELETE, Keys.ENTER))

WebUI.takeScreenshot('Screenshot/008. Transaction Setting/TC.008.011 - Search Data FIlter.png', FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('OBJ.008 - Setting Transaction/001. Borrowing and Assignment/OBJ.008.001.009 Collapase Box Search'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('OBJ.008 - Setting Transaction/001. Borrowing and Assignment/OBJ.008.001.010 Button Filter'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('OBJ.008 - Setting Transaction/001. Borrowing and Assignment/OBJ.008.001.011 Select Date Filter'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('OBJ.008 - Setting Transaction/001. Borrowing and Assignment/OBJ.008.001.012 Select options date'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('OBJ.008 - Setting Transaction/002. Transfer/OBJ.008.002.003 Apply Filter'), FailureHandling.STOP_ON_FAILURE)

WebUI.takeScreenshot('Screenshot/008. Transaction Setting/TC.008.012 -Change log filter date.png', FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('OBJ.008 - Setting Transaction/001. Borrowing and Assignment/OBJ.008.001.013 Select options Field'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('OBJ.008 - Setting Transaction/001. Borrowing and Assignment/OBJ.008.001.014 Search Filter Field'), 
    'John Doe')

WebUI.click(findTestObject('OBJ.008 - Setting Transaction/001. Borrowing and Assignment/OBJ.008.001.015 Check Search Sub Field'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('OBJ.008 - Setting Transaction/002. Transfer/OBJ.008.002.003 Apply Filter'), FailureHandling.STOP_ON_FAILURE)

WebUI.takeScreenshot('Screenshot/008. Transaction Setting/TC.008.013 - Change Log Filter Modified By.png', FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('OBJ.008 - Setting Transaction/001. Borrowing and Assignment/OBJ.008.001.019 Download Data Change Log'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.takeScreenshot('Screenshot/008. Transaction Setting/TC.008.014 - Download Data Change Log.png', FailureHandling.STOP_ON_FAILURE)

