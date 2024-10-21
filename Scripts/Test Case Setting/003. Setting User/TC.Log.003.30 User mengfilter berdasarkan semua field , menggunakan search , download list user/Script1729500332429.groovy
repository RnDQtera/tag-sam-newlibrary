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

WebUI.navigateToUrl('https://console.tagsamurai.com/')

WebUI.delay(5)

WebUI.setText(findTestObject('00-01 ID'), 'user22@mailnesia.com')

WebUI.setText(findTestObject('00-02 PASS'), 'Moderator19@')

WebUI.delay(8)

WebUI.click(findTestObject('00-03 Button Login'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('OBJ Dashboard/Modul fixed asset'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(5)

WebUI.click(findTestObject('OBJ Menu Setting/003 Setting User/Menu Setting'))

WebUI.click(findTestObject('OBJ Menu Setting/003 Setting User/Reusable menu Setting - User'))

WebUI.delay(3)

WebUI.click(findTestObject('OBJ Menu Setting/003 Setting User/Button filter'))

WebUI.click(findTestObject('OBJ Menu Setting/003 Setting User/Dropdown field active'))

WebUI.delay(2)

WebUI.click(findTestObject('OBJ Menu Setting/003 Setting User/List (1) - filter'))

WebUI.click(findTestObject('OBJ Menu Setting/003 Setting User/Button apply filter'))

WebUI.delay(2)

WebUI.takeScreenshot('Screenshot/017. Menu Setting/TC.003.30 - User mengfilter active status.png', FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('OBJ Menu Setting/003 Setting User/Remove field active'))

WebUI.click(findTestObject('OBJ Menu Setting/003 Setting User/Dropdown field user type'))

WebUI.delay(2)

WebUI.click(findTestObject('OBJ Menu Setting/003 Setting User/List (1) - filter'))

WebUI.click(findTestObject('OBJ Menu Setting/003 Setting User/Button apply filter'))

WebUI.delay(2)

WebUI.takeScreenshot('Screenshot/017. Menu Setting/TC.003.31 - User mengfilter user type.png', FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('OBJ Menu Setting/003 Setting User/Remove field user type'))

WebUI.click(findTestObject('OBJ Menu Setting/003 Setting User/Dropdown field system role'))

WebUI.delay(2)

WebUI.click(findTestObject('OBJ Menu Setting/003 Setting User/List (2) filter'))

WebUI.click(findTestObject('OBJ Menu Setting/003 Setting User/Button apply filter'))

WebUI.delay(2)

WebUI.takeScreenshot('Screenshot/017. Menu Setting/TC.003.32 - User mengfilter system role.png', FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('OBJ Menu Setting/003 Setting User/Remove field system role'))

WebUI.click(findTestObject('OBJ Menu Setting/003 Setting User/Dropdown field transaction role'))

WebUI.delay(2)

WebUI.click(findTestObject('OBJ Menu Setting/003 Setting User/List (2) filter'))

WebUI.delay(2)

WebUI.click(findTestObject('OBJ Menu Setting/003 Setting User/Dropdown field transaction role'))

WebUI.delay(2)

WebUI.click(findTestObject('OBJ Menu Setting/003 Setting User/Button apply filter'))

WebUI.delay(2)

WebUI.takeScreenshot('Screenshot/017. Menu Setting/TC.003.33 - User mengfilter transaction role.png', FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('OBJ Menu Setting/003 Setting User/Remove field transaction role'))

WebUI.click(findTestObject('OBJ Menu Setting/003 Setting User/Dropdown field position'))

WebUI.delay(2)

WebUI.click(findTestObject('OBJ Menu Setting/003 Setting User/List (2) filter'))

WebUI.click(findTestObject('OBJ Menu Setting/003 Setting User/Button apply filter'))

WebUI.delay(2)

WebUI.takeScreenshot('Screenshot/017. Menu Setting/TC.003.34 - User mengfilter position.png', FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('OBJ Menu Setting/003 Setting User/Remove field position'))

WebUI.click(findTestObject('OBJ Menu Setting/003 Setting User/Dropdown field division'))

WebUI.delay(2)

WebUI.click(findTestObject('OBJ Menu Setting/003 Setting User/List (2) filter'))

WebUI.click(findTestObject('OBJ Menu Setting/003 Setting User/Button apply filter'))

WebUI.delay(2)

WebUI.takeScreenshot('Screenshot/017. Menu Setting/TC.003.35 - User mengfilter division.png', FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('OBJ Menu Setting/003 Setting User/Remove field division'))

WebUI.click(findTestObject('OBJ Menu Setting/003 Setting User/Dropdown field modified by'))

WebUI.delay(2)

WebUI.click(findTestObject('OBJ Menu Setting/003 Setting User/List (1) - filter'))

WebUI.click(findTestObject('OBJ Menu Setting/003 Setting User/Button apply filter'))

WebUI.delay(2)

WebUI.takeScreenshot('Screenshot/017. Menu Setting/TC.003.36 - User mengfilter modifiy by.png', FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('OBJ Menu Setting/003 Setting User/Remove field modified by'))

WebUI.click(findTestObject('OBJ Menu Setting/003 Setting User/Dropdown field last update'))

WebUI.delay(2)

WebUI.click(findTestObject('OBJ Menu Setting/003 Setting User/8 oktober 2024 - filter'))

WebUI.delay(4)

WebUI.click(findTestObject('OBJ Menu Setting/003 Setting User/Dropdown field last update (2)'))

WebUI.delay(4)

WebUI.click(findTestObject('OBJ Menu Setting/003 Setting User/Button apply filter'))

WebUI.delay(2)

WebUI.takeScreenshot('Screenshot/017. Menu Setting/TC.003.37 - User mengfilter last update.png', FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.refresh()

WebUI.delay(2)

WebUI.click(findTestObject('OBJ Menu Setting/003 Setting User/Button search'))

WebUI.sendKeys(findTestObject('OBJ Menu Setting/003 Setting User/Field search - user'), Keys.chord('cody gakpo', Keys.ENTER))

WebUI.delay(2)

WebUI.takeScreenshot('Screenshot/017. Menu Setting/TC.003.38 - User mengfilter menggunakan fitur search.png', FailureHandling.STOP_ON_FAILURE)

WebUI.delay(1)

WebUI.refresh()

WebUI.delay(1)

WebUI.click(findTestObject('OBJ Menu Setting/003 Setting User/Button download'))

WebUI.takeScreenshot('Screenshot/017. Menu Setting/TC.003.39 - User mendownload list user.png', FailureHandling.STOP_ON_FAILURE)

