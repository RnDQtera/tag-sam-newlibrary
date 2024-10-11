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

WebUI.delay(5)

WebUI.click(findTestObject('001 Reusable Component/001.016 Reusable - Menu Settings'))

WebUI.click(findTestObject('OBJ Menu Setting/003 Setting User/Reusable menu Setting - User'))

WebUI.delay(2)

WebUI.click(findTestObject('OBJ.003 - Setting User/OBJ.003.002 Button Tambah User'))

WebUI.delay(5)

WebUI.setText(findTestObject('OBJ.003 - Setting User/OBJ.003.003 Field First Name'), 'Heru')

WebUI.setText(findTestObject('OBJ.003 - Setting User/OBJ.003.004 Field Last Name'), 'Pambudi')

WebUI.setText(findTestObject('OBJ Menu Setting/003 Setting User/Field position'), 'IT')

WebUI.setText(findTestObject('OBJ.003 - Setting User/OBJ.003.005 Field Division'), 'IT QA')

WebUI.setText(findTestObject('OBJ Menu Setting/003 Setting User/Field employee id'), '65440')

WebUI.setText(findTestObject('OBJ.003 - Setting User/OBJ.003.006 Field Phone Number'), '01236924')

WebUI.setText(findTestObject('OBJ.003 - Setting User/OBJ.003.007 Field Email'), 'herup@mailnesia.com')

WebUI.click(findTestObject('OBJ Menu Setting/003 Setting User/Set as temporary user'))

WebUI.click(findTestObject('OBJ Menu Setting/003 Setting User/Dropdown active period until'))

WebUI.click(findTestObject('OBJ Menu Setting/003 Setting User/31 oktober 2024'))

WebUI.click(findTestObject('OBJ.003 - Setting User/OBJ.003.008 Button Select Group'))

WebUI.click(findTestObject('OBJ Menu Setting/003 Setting User/Select group - jawa timur'))

WebUI.click(findTestObject('OBJ.003 - Setting User/OBJ.003.011 Button Select'))

WebUI.uploadFile(findTestObject('OBJ Menu Setting/003 Setting User/Upload foto'), 'C:\\Users\\HP\\OneDrive\\Pictures\\219983.png')

WebUI.delay(3)

WebUI.click(findTestObject('OBJ Menu Setting/003 Setting User/Button appyl adjust photo'))

WebUI.click(findTestObject('OBJ.003 - Setting User/OBJ.003.012 Button Submit'))

WebUI.click(findTestObject('OBJ.003 - Setting User/OBJ.003.015 Button Create'))

WebUI.delay(2)

WebUI.click(findTestObject('OBJ Menu Setting/003 Setting User/Button change log - halaman user'))

WebUI.delay(2)

WebUI.takeScreenshot('Screenshot/017. Menu Setting/TC.003.04 - Membuat user baru (temporary).png', FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.click(findTestObject('OBJ Menu Setting/003 Setting User/Button close change log'))

WebUI.click(findTestObject('OBJ Menu Setting/003 Setting User/Button search'))

WebUI.sendKeys(findTestObject('OBJ Menu Setting/003 Setting User/Field search - user'), Keys.chord('heru', Keys.ENTER))

WebUI.click(findTestObject('OBJ Menu Setting/003 Setting User/Button action user list (1)'))

WebUI.click(findTestObject('OBJ Menu Setting/003 Setting User/Button action list (4) delete - user temporary'))

WebUI.click(findTestObject('OBJ Menu Setting/003 Setting User/Button delete - delete group role'))

