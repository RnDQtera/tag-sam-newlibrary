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

WebUI.setText(findTestObject('00-02 PASS'), 'Moderator12@')

WebUI.delay(10)

WebUI.click(findTestObject('00-03 Button Login'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('OBJ Dashboard/Modul fixed asset'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(6)

WebUI.click(findTestObject('OBJ Menu Setting/003 Setting User/Menu Setting'))

WebUI.click(findTestObject('OBJ Menu Setting/003 Setting User/Reusable menu Setting - User'))

WebUI.delay(5)

WebUI.click(findTestObject('OBJ Menu Setting/003 Setting User/Button search'))

WebUI.sendKeys(findTestObject('OBJ Menu Setting/003 Setting User/Field search - user'), Keys.chord('dony', Keys.ENTER))

WebUI.click(findTestObject('OBJ Menu Setting/003 Setting User/Button action user (1))'))

WebUI.click(findTestObject('OBJ Menu Setting/003 Setting User/Button action list (3) - detail'))

WebUI.delay(2)

WebUI.click(findTestObject('OBJ Menu Setting/003 Setting User/Role - Group role'))

WebUI.click(findTestObject('OBJ Menu Setting/003 Setting User/Button action list (1) - group role'))

WebUI.delay(2)

WebUI.click(findTestObject('OBJ Menu Setting/003 Setting User/action delete - transaction role'))

WebUI.delay(2)

WebUI.click(findTestObject('OBJ Menu Setting/003 Setting User/Button delete - delete group role'))

WebUI.delay(2)

WebUI.click(findTestObject('OBJ Menu Setting/003 Setting User/Button plus assign role'))

WebUI.delay(2)

WebUI.click(findTestObject('OBJ Menu Setting/003 Setting User/Dropdown select role - assign role - group role'))

WebUI.click(findTestObject('OBJ Menu Setting/003 Setting User/List (4) Transaction role - Audit'))

WebUI.delay(2)

WebUI.click(findTestObject('OBJ Menu Setting/003 Setting User/Button select group - assign group role'))

WebUI.click(findTestObject('OBJ Menu Setting/003 Setting User/Select group - jawa barat'))

WebUI.click(findTestObject('OBJ Menu Setting/003 Setting User/Button select - select group'))

WebUI.click(findTestObject('OBJ Menu Setting/003 Setting User/Button submit - transaction role'))

WebUI.delay(2)

WebUI.click(findTestObject('OBJ Menu Setting/003 Setting User/Balik halaman user'))

WebUI.click(findTestObject('OBJ.003 - Setting User/OBJ.003.014 Button Change Log'))

WebUI.delay(2)

WebUI.takeScreenshot('Screenshot/017. Menu Setting/TC.003.20 - Menambahkan system role.png', FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('OBJ Menu Setting/003 Setting User/Button close change log'))

WebUI.click(findTestObject('OBJ Menu Setting/003 Setting User/Button search'))

WebUI.sendKeys(findTestObject('OBJ Menu Setting/003 Setting User/Field search - user'), Keys.chord('dony', Keys.ENTER))

WebUI.click(findTestObject('OBJ Menu Setting/003 Setting User/Button action user (1))'))

WebUI.delay(3)

WebUI.click(findTestObject('OBJ Menu Setting/003 Setting User/Button action list (3) - detail'))

WebUI.delay(3)

WebUI.click(findTestObject('OBJ Menu Setting/003 Setting User/Role - Group role'))

WebUI.click(findTestObject('OBJ Menu Setting/003 Setting User/Button action list (1) - group role'))

WebUI.delay(2)

WebUI.click(findTestObject('OBJ Menu Setting/003 Setting User/Button action list (1) - edit'))

WebUI.click(findTestObject('OBJ Menu Setting/003 Setting User/Button select group - edit group role'))

WebUI.delay(2)

WebUI.click(findTestObject('OBJ Menu Setting/003 Setting User/Select group - jawa timur'))

WebUI.click(findTestObject('OBJ Menu Setting/003 Setting User/Button select - select group'))

WebUI.click(findTestObject('OBJ Menu Setting/003 Setting User/Button save'))

WebUI.delay(2)

WebUI.click(findTestObject('OBJ Menu Setting/003 Setting User/Balik halaman user'))

WebUI.delay(2)

WebUI.click(findTestObject('OBJ Menu Setting/003 Setting User/Button change log - halaman user'))

WebUI.delay(2)

WebUI.takeScreenshot('Screenshot/017. Menu Setting/TC.003.22 - Mengedit system role pada user.png', FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('OBJ Menu Setting/003 Setting User/Button close change log'))

WebUI.click(findTestObject('OBJ Menu Setting/003 Setting User/Button search'))

WebUI.sendKeys(findTestObject('OBJ Menu Setting/003 Setting User/Field search - user'), Keys.chord('dony', Keys.ENTER))

WebUI.click(findTestObject('OBJ Menu Setting/003 Setting User/Button action user (1))'))

WebUI.delay(3)

WebUI.click(findTestObject('OBJ Menu Setting/003 Setting User/Button action list (3) - detail'))

WebUI.delay(3)

WebUI.click(findTestObject('OBJ Menu Setting/003 Setting User/Role - Group role'))

WebUI.click(findTestObject('OBJ Menu Setting/003 Setting User/Button action list (1) - group role'))

WebUI.delay(2)

WebUI.click(findTestObject('OBJ Menu Setting/003 Setting User/action delete - transaction role'))

WebUI.delay(1)

WebUI.click(findTestObject('OBJ Menu Setting/003 Setting User/Button delete - delete group role'))

WebUI.click(findTestObject('OBJ Menu Setting/003 Setting User/Balik halaman user'))

WebUI.click(findTestObject('OBJ Menu Setting/003 Setting User/Button change log - halaman user'))

WebUI.delay(2)

WebUI.takeScreenshot('Screenshot/017. Menu Setting/TC.003.24 - Menghapus system role pada user.png', FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('OBJ Menu Setting/003 Setting User/Button close change log'))

WebUI.click(findTestObject('OBJ Menu Setting/003 Setting User/Button search'))

WebUI.sendKeys(findTestObject('OBJ Menu Setting/003 Setting User/Field search - user'), Keys.chord('dony', Keys.ENTER))

WebUI.click(findTestObject('OBJ Menu Setting/003 Setting User/Button action user (1))'))

WebUI.click(findTestObject('OBJ Menu Setting/003 Setting User/Button action list (3) - detail'))

WebUI.delay(2)

WebUI.click(findTestObject('OBJ Menu Setting/003 Setting User/Role - Group role'))

WebUI.click(findTestObject('OBJ Menu Setting/003 Setting User/Button plus assign role'))

WebUI.delay(2)

WebUI.click(findTestObject('OBJ Menu Setting/003 Setting User/Dropdown select role - assign role - group role'))

WebUI.click(findTestObject('OBJ Menu Setting/003 Setting User/List (4) Transaction role - Audit'))

WebUI.delay(2)

WebUI.click(findTestObject('OBJ Menu Setting/003 Setting User/Button select group - assign group role'))

WebUI.click(findTestObject('OBJ Menu Setting/003 Setting User/Select group - jawa barat'))

WebUI.click(findTestObject('OBJ Menu Setting/003 Setting User/Select group - jawa timur'))

WebUI.click(findTestObject('OBJ Menu Setting/003 Setting User/Button select - select group'))

WebUI.click(findTestObject('OBJ Menu Setting/003 Setting User/Button submit - transaction role'))

