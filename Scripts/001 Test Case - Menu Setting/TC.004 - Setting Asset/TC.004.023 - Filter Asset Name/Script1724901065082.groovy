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
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.WebElement as WebElement
import org.openqa.selenium.support.ui.ExpectedConditions as ExpectedConditions
import org.openqa.selenium.support.ui.FluentWait as FluentWait
import org.openqa.selenium.support.ui.Wait as Wait
import org.openqa.selenium.support.ui.WebDriverWait as WebDriverWait
import com.kms.katalon.core.annotation.Keyword as Keyword
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.google.common.base.Function as Function

WebUI.openBrowser('')

WebUI.maximizeWindow(FailureHandling.STOP_ON_FAILURE)

WebUI.navigateToUrl(GlobalVariable.URL)

WebUI.delay(5)

WebUI.setText(findTestObject('00-01 ID'), GlobalVariable.id)

WebUI.setText(findTestObject('00-02 PASS'), GlobalVariable.pass)

WebUI.delay(3, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('00-03 Button Login'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('00-04 Modul Fixed Asset'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(8, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('001 Reusable Component/001.016 Reusable - Menu Settings'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('001 Reusable Component/001.018 Reusable - Menu Setting - Asset Name'), FailureHandling.STOP_ON_FAILURE)
WebUI.click(findTestObject('OBJ.004 - Setting Asset Name/OBJ.004.106 Filter Data Asset Name'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('OBJ.004 - Setting Asset Name/OBJ.004.107 Filter Asset Name - Sub Asset Name'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('OBJ.004 - Setting Asset Name/OBJ.004.108 Text Filed Filter Asset Name'), 'Meja Rapat Direksi')

WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('OBJ.004 - Setting Asset Name/OBJ.004.109 Choose Data Filter Asset Name'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('OBJ.004 - Setting Asset Name/OBJ.004.118 Filter Asset Name - Apply Filter'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

WebUI.takeScreenshot('Screenshot/TC.004.023 - Filter Asset Name.png', FailureHandling.STOP_ON_FAILURE)

WebUI.refresh()

WebUI.delay(3)

WebUI.click(findTestObject('OBJ.004 - Setting Asset Name/OBJ.004.106 Filter Data Asset Name'))

WebUI.click(findTestObject('OBJ.004 - Setting Asset Name/OBJ.004.110 Filter Asset Name - Sub Measuremenrt'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('OBJ.004 - Setting Asset Name/OBJ.004.108 Text Filed Filter Asset Name'), 'Unit')

WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('OBJ.004 - Setting Asset Name/OBJ.004.109 Choose Data Filter Asset Name'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('OBJ.004 - Setting Asset Name/OBJ.004.118 Filter Asset Name - Apply Filter'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

WebUI.takeScreenshot('Screenshot/TC.004.024 - Measurement.png', FailureHandling.STOP_ON_FAILURE)

WebUI.refresh()

WebUI.delay(3)

WebUI.click(findTestObject('OBJ.004 - Setting Asset Name/OBJ.004.106 Filter Data Asset Name'))

WebUI.click(findTestObject('OBJ.004 - Setting Asset Name/OBJ.004.111 Filter Asset Name - Sub Alias Code'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('OBJ.004 - Setting Asset Name/OBJ.004.108 Text Filed Filter Asset Name'), 'DKSMET-DIR')

WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('OBJ.004 - Setting Asset Name/OBJ.004.109 Choose Data Filter Asset Name'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('OBJ.004 - Setting Asset Name/OBJ.004.118 Filter Asset Name - Apply Filter'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

WebUI.takeScreenshot('Screenshot/TC.004.025 - Alias Code.png', FailureHandling.STOP_ON_FAILURE)

WebUI.refresh()

WebUI.delay(3)

WebUI.click(findTestObject('OBJ.004 - Setting Asset Name/OBJ.004.106 Filter Data Asset Name'))

WebUI.click(findTestObject('OBJ.004 - Setting Asset Name/OBJ.004.112 Filter Asset Name - Sub Brand'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('OBJ.004 - Setting Asset Name/OBJ.004.108 Text Filed Filter Asset Name'), 'Fabelio')

WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('OBJ.004 - Setting Asset Name/OBJ.004.109 Choose Data Filter Asset Name'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('OBJ.004 - Setting Asset Name/OBJ.004.118 Filter Asset Name - Apply Filter'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

WebUI.takeScreenshot('Screenshot/TC.004.026 - Brand.png', FailureHandling.STOP_ON_FAILURE)

WebUI.refresh()

WebUI.delay(3)

WebUI.click(findTestObject('OBJ.004 - Setting Asset Name/OBJ.004.106 Filter Data Asset Name'))

WebUI.click(findTestObject('OBJ.004 - Setting Asset Name/OBJ.004.113 Filter Asset Name - Sub Model Type'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('OBJ.004 - Setting Asset Name/OBJ.004.108 Text Filed Filter Asset Name'), 'Gorden dengan motif floral')

WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('OBJ.004 - Setting Asset Name/OBJ.004.109 Choose Data Filter Asset Name'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('OBJ.004 - Setting Asset Name/OBJ.004.118 Filter Asset Name - Apply Filter'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

WebUI.takeScreenshot('Screenshot/TC.004.027 - Model Type.png', FailureHandling.STOP_ON_FAILURE)

WebUI.refresh()

WebUI.delay(3)

WebUI.click(findTestObject('OBJ.004 - Setting Asset Name/OBJ.004.106 Filter Data Asset Name'))

WebUI.click(findTestObject('OBJ.004 - Setting Asset Name/OBJ.004.114 Filter Asset Name - Sub Depreciation Group'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('OBJ.004 - Setting Asset Name/OBJ.004.108 Text Filed Filter Asset Name'), 'Metode Garis Lurus')

WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('OBJ.004 - Setting Asset Name/OBJ.004.109 Choose Data Filter Asset Name'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('OBJ.004 - Setting Asset Name/OBJ.004.118 Filter Asset Name - Apply Filter'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

WebUI.takeScreenshot('Screenshot/TC.004.028 - Depreciation Group.png', FailureHandling.STOP_ON_FAILURE)

WebUI.refresh()

WebUI.delay(3)

WebUI.click(findTestObject('OBJ.004 - Setting Asset Name/OBJ.004.106 Filter Data Asset Name'))

WebUI.click(findTestObject('OBJ.004 - Setting Asset Name/OBJ.004.115 Filter Asset Name - Sub Account Name'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('OBJ.004 - Setting Asset Name/OBJ.004.108 Text Filed Filter Asset Name'), '1201')

WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('OBJ.004 - Setting Asset Name/OBJ.004.109 Choose Data Filter Asset Name'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('OBJ.004 - Setting Asset Name/OBJ.004.118 Filter Asset Name - Apply Filter'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

WebUI.takeScreenshot('Screenshot/TC.004.029 - Account Name.png', FailureHandling.STOP_ON_FAILURE)

WebUI.refresh()

WebUI.delay(3)

WebUI.click(findTestObject('OBJ.004 - Setting Asset Name/OBJ.004.106 Filter Data Asset Name'))

WebUI.click(findTestObject('OBJ.004 - Setting Asset Name/OBJ.004.116 Filter Asset Name - Sub Account Code'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('OBJ.004 - Setting Asset Name/OBJ.004.108 Text Filed Filter Asset Name'), 'FIxed Asset')

WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('OBJ.004 - Setting Asset Name/OBJ.004.109 Choose Data Filter Asset Name'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('OBJ.004 - Setting Asset Name/OBJ.004.116 Filter Asset Name - Sub Account Code'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('OBJ.004 - Setting Asset Name/OBJ.004.118 Filter Asset Name - Apply Filter'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

WebUI.takeScreenshot('Screenshot/TC.004.030 - Account Code.png', FailureHandling.STOP_ON_FAILURE)

WebUI.refresh()

WebUI.delay(3, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('OBJ.004 - Setting Asset Name/OBJ.004.106 Filter Data Asset Name'))

WebUI.click(findTestObject('OBJ.004 - Setting Asset Name/OBJ.004.119 Filter Asset Name - Last Modified'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('OBJ.004 - Setting Asset Name/OBJ.004.120 Choose Date'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('OBJ.004 - Setting Asset Name/OBJ.004.118 Filter Asset Name - Apply Filter'), FailureHandling.STOP_ON_FAILURE)

WebUI.takeScreenshot('Screenshot/TC.004.031 - Last Modified.png', FailureHandling.STOP_ON_FAILURE)

