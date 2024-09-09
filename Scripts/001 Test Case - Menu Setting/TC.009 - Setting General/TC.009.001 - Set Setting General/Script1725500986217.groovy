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
WebUI.click(findTestObject('001 Reusable Component/001.025 Reusable - Register Asset'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('OBJ.009 - Setting General/OBJ.009.001 Select Default Currency'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('OBJ.009 - Setting General/OBJ.009.002 Search Text Field Default Currency'), 'Hungarian')

WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('OBJ.009 - Setting General/OBJ.009.003 Select Search Result'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

WebUI.takeScreenshot('Screenshot/009. Setting General/TC.009.001 - Set Default Currency.png', FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('OBJ.009 - Setting General/OBJ.009.004 Select Time Zone'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('OBJ.009 - Setting General/OBJ.009.002 Search Text Field Default Currency'), 'America/nuuk')

WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('OBJ.009 - Setting General/OBJ.009.003 Select Search Result'), FailureHandling.STOP_ON_FAILURE)

WebUI.takeScreenshot('Screenshot/009. Setting General/TC.009.002 - Set time zone.png', FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('OBJ.009 - Setting General/OBJ.009.005 Select Date Format'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('OBJ.009 - Setting General/OBJ.009.007 Choose Date and Time Format'), FailureHandling.STOP_ON_FAILURE)

WebUI.takeScreenshot('Screenshot/009. Setting General/TC.009.003 - Set date format.png', FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('OBJ.009 - Setting General/OBJ.009.006 Select Time Format'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('OBJ.009 - Setting General/OBJ.009.007 Choose Date and Time Format'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

WebUI.takeScreenshot('Screenshot/009. Setting General/TC.009.004 -Select date and time format.png', FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('OBJ.009 - Setting General/OBJ.009.008 Save General Setting'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('OBJ.009 - Setting General/OBJ.009.009 Button Changelog'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('OBJ.009 - Setting General/OBJ.009.010 Button Search Change Log General Setting'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('OBJ.009 - Setting General/OBJ.009.011 Text Field Search Change Log'), 'Time Format')

WebUI.sendKeys(findTestObject('OBJ.009 - Setting General/OBJ.009.011 Text Field Search Change Log'), Keys.chord(Keys.ENTER))

WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

WebUI.takeScreenshot('Screenshot/009. Setting General/TC.009.008 - Search Data Filter.png', FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('OBJ.009 - Setting General/OBJ.009.012 Colapse Search Data changelog General Setting'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('OBJ.009 - Setting General/OBJ.009.013 Button Filter Changelog General Setting'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('OBJ.009 - Setting General/OBJ.009.014 Select Section Date'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('OBJ.009 - Setting General/OBJ.009.015 Choose Date'), FailureHandling.STOP_ON_FAILURE)

WebUI.takeScreenshot('Screenshot/009. Setting General/TC.009.005 - Filter Section Date.png', FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('OBJ.009 - Setting General/OBJ.009.016 Select Section Field'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('OBJ.009 - Setting General/OBJ.009.017 Search Data Filter General Setting Section Field'), 
    'Date Format')

WebUI.click(findTestObject('OBJ.009 - Setting General/OBJ.009.018 Select Serarch Result Field'), FailureHandling.STOP_ON_FAILURE)

WebUI.takeScreenshot('Screenshot/009. Setting General/TC.009.006 - Filter Section Field.png', FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('OBJ.009 - Setting General/OBJ.009.019 Select Section Modified By'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('OBJ.009 - Setting General/OBJ.009.017 Search Data Filter General Setting Section Field'), 
    'John Doe')

WebUI.click(findTestObject('OBJ.009 - Setting General/OBJ.009.018 Select Serarch Result Field'), FailureHandling.STOP_ON_FAILURE)

WebUI.takeScreenshot('Screenshot/009. Setting General/TC.009.007 - Filter Section Modified By.png', FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('OBJ.009 - Setting General/OBJ.009.020 Apply Filter General Setting'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('OBJ.009 - Setting General/OBJ.009.021 Download Data Changelog General Setting'), FailureHandling.STOP_ON_FAILURE)

WebUI.takeScreenshot('Screenshot/009. Setting General/TC.009.009 - Downlaod Data Chnagelog.png', FailureHandling.STOP_ON_FAILURE)

