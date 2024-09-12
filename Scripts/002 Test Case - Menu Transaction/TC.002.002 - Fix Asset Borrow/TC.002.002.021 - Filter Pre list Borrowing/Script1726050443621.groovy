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
//WebUI.navigateToUrl('https://localhost:9001')
//
//WebUI.click(findTestObject('00-05 Advance Localhost9001'))
//
//WebUI.click(findTestObject('00-06 Proceed to Localhost'))
//
//WebUI.delay(2)
//
//WebUI.navigateToUrl('https://localhost:9002')
//
//WebUI.delay(2)
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
//WebUI.click(findTestObject('00-04 Modul Fixed Asset'), FailureHandling.STOP_ON_FAILURE)
//
//WebUI.delay(8, FailureHandling.STOP_ON_FAILURE)
//
//WebUI.click(findTestObject('00-07 Sync'), FailureHandling.STOP_ON_FAILURE)
//
//WebUI.click(findTestObject('00-08 Hardware Sync'), FailureHandling.STOP_ON_FAILURE)
//
//WebUI.delay(10, FailureHandling.STOP_ON_FAILURE)
//
//WebUI.click(findTestObject('00-09 Closed Hardware Sync'), FailureHandling.STOP_ON_FAILURE)
//
//WebUI.delay(3, FailureHandling.STOP_ON_FAILURE)
//
//WebUI.click(findTestObject('001 Reusable Component/001.001 Reusable - Menu Fixed Asset'), FailureHandling.STOP_ON_FAILURE)
//
WebUI.click(findTestObject('001 Reusable Component/001.003 Reusable - Menu Fixed Asset - Available'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('OBJ.022 - Modul Borrow Transaction/OBJ.022.080 Scan List Asset in available'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('00-10 Select Single Scan RFID'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(10, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('OBJ.013 - Fixed Asset - Add Prelist Borrow/OBJ.013.001 SIngle Action Available Asset'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('OBJ.013 - Fixed Asset - Add Prelist Borrow/OBJ.013.002 Add to Pre-List Borrowing'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('OBJ.013 - Fixed Asset - Add Prelist Borrow/OBJ.013.003 Select User for Borrowing numb 1'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('OBJ.013 - Fixed Asset - Add Prelist Borrow/OBJ.013.005 Submit Borrowing Pre-List'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(5, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('001 Reusable Component/001.003 Reusable - Menu Fixed Asset - Available'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('OBJ.022 - Modul Borrow Transaction/OBJ.022.080 Scan List Asset in available'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('00-10 Select Single Scan RFID'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(10, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('OBJ.013 - Fixed Asset - Add Prelist Borrow/OBJ.013.001 SIngle Action Available Asset'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('OBJ.013 - Fixed Asset - Add Prelist Borrow/OBJ.013.002 Add to Pre-List Borrowing'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('OBJ.013 - Fixed Asset - Add Prelist Borrow/OBJ.013.004 Select User for Borrowing Numb 2'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('OBJ.013 - Fixed Asset - Add Prelist Borrow/OBJ.013.005 Submit Borrowing Pre-List'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('001 Reusable Component/001.004 Reusable - Menu Fixed Asset - Borrow'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('OBJ.022 - Modul Borrow Transaction/OBJ.022.085 Button FIlter'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('OBJ.022 - Modul Borrow Transaction/OBJ.022.086 Select Field User'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('OBJ.022 - Modul Borrow Transaction/OBJ.022.087 Text Field Search Data User'), 'John Doe')

WebUI.click(findTestObject('OBJ.022 - Modul Borrow Transaction/OBJ.022.088 Check Result Search Data'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(1, FailureHandling.STOP_ON_FAILURE)

WebUI.takeScreenshot('Screenshot/011. Modul Borrow/TC.002.002.021 -  Filter Section User.png', FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('OBJ.022 - Modul Borrow Transaction/OBJ.022.089 Select Section Group'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('OBJ.022 - Modul Borrow Transaction/OBJ.022.090 Search Data Filter'), 'Kantor Regional JaTim')

WebUI.click(findTestObject('OBJ.022 - Modul Borrow Transaction/OBJ.022.091 Check Result Search Data Group'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('OBJ.022 - Modul Borrow Transaction/OBJ.022.092 Submit Select Group'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('OBJ.022 - Modul Borrow Transaction/OBJ.022.093 Apply Filter Prelist'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

WebUI.takeScreenshot('Screenshot/011. Modul Borrow/TC.002.002.021 -  Filter Section Group.png', FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('OBJ.022 - Modul Borrow Transaction/OBJ.022.095 Clear Field Filter Pre-list'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('OBJ.022 - Modul Borrow Transaction/OBJ.022.093 Apply Filter Prelist'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('OBJ.022 - Modul Borrow Transaction/OBJ.022.093 Button Search Borrow Pre-list'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('OBJ.022 - Modul Borrow Transaction/OBJ.022.094 Text Field Button Search Pre-list'), 'Smith Doe')

WebUI.sendKeys(findTestObject('OBJ.022 - Modul Borrow Transaction/OBJ.022.094 Text Field Button Search Pre-list'), Keys.chord(
        Keys.ENTER))

WebUI.takeScreenshot('Screenshot/011. Modul Borrow/TC.002.002.021 -  Search Data Pre-list.png', FailureHandling.STOP_ON_FAILURE)

