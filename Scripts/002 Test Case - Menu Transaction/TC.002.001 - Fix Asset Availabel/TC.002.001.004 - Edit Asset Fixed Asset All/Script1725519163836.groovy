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
WebUI.click(findTestObject('001 Reusable Component/001.001 Reusable - Menu Fixed Asset'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('001 Reusable Component/001.002 Reusable - Menu Fixed Asset - All'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('OBJ.011 - Fixed Asset - Detail Asset/OBJ.011.001 Button Search Asset'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('OBJ.011 - Fixed Asset - Detail Asset/OBJ.011.002 Text Field Search Asset'), 'Lemari Arsip Berkas Admin - 3')

WebUI.sendKeys(findTestObject('OBJ.011 - Fixed Asset - Detail Asset/OBJ.011.002 Text Field Search Asset'), Keys.chord(Keys.ENTER))

WebUI.delay(3, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('OBJ.011 - Fixed Asset - Detail Asset/OBJ.011.003 Single Action'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('OBJ.012 - Fixed Asset - Edit Asset/OBJ.012.001 Action Edit Asset'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

WebUI.doubleClick(findTestObject('OBJ.012 - Fixed Asset - Edit Asset/OBJ.012.003 Textfield Edit Default Alias Name'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('OBJ.012 - Fixed Asset - Edit Asset/OBJ.012.003 Textfield Edit Default Alias Name'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('OBJ.012 - Fixed Asset - Edit Asset/OBJ.012.003 Textfield Edit Default Alias Name'), 'Alias Name Edit')

WebUI.click(findTestObject('OBJ.012 - Fixed Asset - Edit Asset/OBJ.012.004 Select Option Brand Edit'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('OBJ.012 - Fixed Asset - Edit Asset/OBJ.012.005 Text Field Edit Brand'), 'Fabelio')

WebUI.click(findTestObject('OBJ.012 - Fixed Asset - Edit Asset/OBJ.012.006 Select Result Search'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('OBJ.012 - Fixed Asset - Edit Asset/OBJ.012.007 Select Option Model Edit'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('OBJ.012 - Fixed Asset - Edit Asset/OBJ.012.005 Text Field Edit Brand'), 'Lemari Arsip Pembelian')

WebUI.click(findTestObject('OBJ.012 - Fixed Asset - Edit Asset/OBJ.012.006 Select Result Search'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('OBJ.012 - Fixed Asset - Edit Asset/OBJ.012.008 Delete Photo'), FailureHandling.STOP_ON_FAILURE)

WebUI.uploadFile(findTestObject('OBJ.012 - Fixed Asset - Edit Asset/OBJ.012.009 Edit Photo'), 'C:\\Users\\DELL\\Downloads\\filament.webp')

WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('OBJ.012 - Fixed Asset - Edit Asset/OBJ.012.010 Apply Edit Image'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('OBJ.012 - Fixed Asset - Edit Asset/OBJ.012.011 Save Edit Asset'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(1, FailureHandling.STOP_ON_FAILURE)

WebUI.takeScreenshot('Screenshot/010. Register Asset/TC.010.004 - Edit Asset.png', FailureHandling.STOP_ON_FAILURE)

