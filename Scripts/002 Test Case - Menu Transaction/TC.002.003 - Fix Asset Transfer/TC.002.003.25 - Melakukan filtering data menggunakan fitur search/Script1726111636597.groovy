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

WebUI.setText(findTestObject('00-01 ID'), GlobalVariable.id)

WebUI.setText(findTestObject('00-02 PASS'), GlobalVariable.pass)

WebUI.delay(3, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('00-03 Button Login'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('00-04 Modul Fixed Asset'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(8)

WebUI.click(findTestObject('001 Reusable Component/001.001 Reusable - Menu Fixed Asset'))

WebUI.click(findTestObject('001 Reusable Component/001.006 Reusable - Menu Fixed Asset - Transfer'))

WebUI.delay(5)

WebUI.click(findTestObject('OBJ.024 Modul Transfer/OBJ.024 - Single Action Transfer/OBJ.024.023 Tab Transaction'))

WebUI.delay(2)

WebUI.click(findTestObject('OBJ.024 Modul Transfer/OBJ.024 - Filter/Button Search Tab Transaction'))

WebUI.sendKeys(findTestObject('OBJ.024 Modul Transfer/OBJ.024 - Filter/Searchbox Tab Transaction'), 'jakarta')

WebUI.sendKeys(findTestObject('OBJ.024 Modul Transfer/OBJ.024 - Filter/Searchbox Tab Transaction'), Keys.chord(Keys.ENTER))

WebUI.delay(0)

WebUI.takeScreenshot('Screenshot/012. Asset Transfer/TC.012.025 - Melakukan filtering data menggunakan fitur search, menampilkan data sesuai dengan keyword yang dicari.png',
	FailureHandling.STOP_ON_FAILURE)

