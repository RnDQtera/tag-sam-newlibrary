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

WebUI.delay(8)

WebUI.click(findTestObject('OBJ Dashboard/Modul fixed asset'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(5)

WebUI.click(findTestObject('OBJ Menu Setting/003 Setting User/Menu Setting'))

WebUI.click(findTestObject('OBJ Menu Setting/003 Setting User/Reusable menu Setting - User'))

WebUI.delay(3)

WebUI.click(findTestObject('OBJ.003 - Setting User/OBJ.003.002 Button Tambah User'))

WebUI.delay(4)

WebUI.setText(findTestObject('OBJ.003 - Setting User/OBJ.003.003 Field First Name'), 'Agus')

WebUI.setText(findTestObject('OBJ.003 - Setting User/OBJ.003.004 Field Last Name'), 'Pamungkas')

WebUI.setText(findTestObject('OBJ Menu Setting/003 Setting User/Field position'), 'IT')

WebUI.setText(findTestObject('OBJ.003 - Setting User/OBJ.003.005 Field Division'), 'IT QA')

WebUI.setText(findTestObject('OBJ Menu Setting/003 Setting User/Field employee id'), '123')

WebUI.setText(findTestObject('OBJ.003 - Setting User/OBJ.003.006 Field Phone Number'), '01236784')

WebUI.setText(findTestObject('OBJ.003 - Setting User/OBJ.003.007 Field Email'), 'agusp@mailnesia.com')

WebUI.click(findTestObject('OBJ.003 - Setting User/OBJ.003.008 Button Select Group'))

WebUI.click(findTestObject('OBJ Menu Setting/003 Setting User/Select group - jawa timur'))

WebUI.click(findTestObject('OBJ.003 - Setting User/OBJ.003.011 Button Select'))

WebUI.uploadFile(findTestObject('OBJ Menu Setting/003 Setting User/Upload foto'), 'C:\\Users\\HP\\OneDrive\\Pictures\\219983.png')

WebUI.delay(3)

WebUI.click(findTestObject('OBJ Menu Setting/003 Setting User/Button appyl adjust photo'))

WebUI.click(findTestObject('OBJ.003 - Setting User/OBJ.003.012 Button Submit'))

WebUI.click(findTestObject('OBJ.003 - Setting User/OBJ.003.015 Button Create'))

WebUI.delay(5)

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://mailnesia.com/')

WebUI.sendKeys(findTestObject('Object Repository/OBJ Menu Setting/003 Setting User/input_mailbox'), Keys.chord('agusp', 
        Keys.ENTER))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/OBJ Menu Setting/003 Setting User/td_no-replytagsamurai.com'))

WebUI.click(findTestObject('Object Repository/OBJ Menu Setting/003 Setting User/button_Activate Account'))

WebUI.setText(findTestObject('Object Repository/OBJ Menu Setting/003 Setting User/input_flex py-1 px-3 items-center space-x-1_d9fbdb'), 
    'Moderator12@')

WebUI.setText(findTestObject('Object Repository/OBJ Menu Setting/003 Setting User/input_flex py-1 px-3 items-center space-x-1_d9fbdb_1'), 
    'Moderator12@')

WebUI.click(findTestObject('OBJ Menu Setting/003 Setting User/Button save - mailnesia'))

WebUI.delay(5)

WebUI.openBrowser('')

WebUI.maximizeWindow(FailureHandling.STOP_ON_FAILURE)

WebUI.navigateToUrl('https://console.tagsamurai.com/')

WebUI.delay(5)

WebUI.setText(findTestObject('00-01 ID'), 'user22@mailnesia.com')

WebUI.setText(findTestObject('00-02 PASS'), 'Moderator12@')

WebUI.delay(10)

WebUI.click(findTestObject('00-03 Button Login'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(8)

WebUI.click(findTestObject('OBJ Dashboard/Modul fixed asset'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(5)

WebUI.click(findTestObject('001 Reusable Component/001.016 Reusable - Menu Settings'))

WebUI.click(findTestObject('OBJ Menu Setting/003 Setting User/Reusable menu Setting - User'))

WebUI.delay(3)

WebUI.click(findTestObject('OBJ Menu Setting/003 Setting User/Button search'))

WebUI.sendKeys(findTestObject('OBJ Menu Setting/003 Setting User/Field search - user'), Keys.chord('agus', Keys.ENTER))

WebUI.click(findTestObject('OBJ Menu Setting/003 Setting User/Button action user (1))'))

WebUI.delay(2)

WebUI.click(findTestObject('OBJ Menu Setting/003 Setting User/Button action list (1) - edit'))

WebUI.delay(2)

WebUI.clearText(findTestObject('OBJ Menu Setting/003 Setting User/Field email - edit user'))

WebUI.sendKeys(findTestObject('OBJ Menu Setting/003 Setting User/Field email - edit user'), 'aguspa@mailnesia.com')

WebUI.click(findTestObject('OBJ Menu Setting/003 Setting User/Button save'))

WebUI.click(findTestObject('OBJ Menu Setting/003 Setting User/Button continue edit user'))

WebUI.delay(2)

WebUI.delay(5)

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://mailnesia.com/')

WebUI.sendKeys(findTestObject('Object Repository/OBJ Menu Setting/003 Setting User/input_mailbox'), Keys.chord('aguspa', 
        Keys.ENTER))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/OBJ Menu Setting/003 Setting User/td_no-replytagsamurai.com'))

WebUI.click(findTestObject('Object Repository/OBJ Menu Setting/003 Setting User/button_Activate Account'))

WebUI.setText(findTestObject('Object Repository/OBJ Menu Setting/003 Setting User/input_flex py-1 px-3 items-center space-x-1_d9fbdb'), 
    'Moderator12@')

WebUI.setText(findTestObject('Object Repository/OBJ Menu Setting/003 Setting User/input_flex py-1 px-3 items-center space-x-1_d9fbdb_1'), 
    'Moderator12@')

WebUI.click(findTestObject('OBJ Menu Setting/003 Setting User/Button save - mailnesia'))

WebUI.delay(6)

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

WebUI.delay(3)

WebUI.click(findTestObject('OBJ Menu Setting/003 Setting User/Button change log search user'))

WebUI.delay(3)

WebUI.takeScreenshot('Screenshot/017. Menu Setting/TC.003.09 - User mengganti alamat email.png', FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3)

WebUI.click(findTestObject('OBJ Menu Setting/003 Setting User/Button close change log'))

WebUI.click(findTestObject('OBJ Menu Setting/003 Setting User/Button search'))

WebUI.sendKeys(findTestObject('OBJ Menu Setting/003 Setting User/Field search - user'), Keys.chord('agus', Keys.ENTER))

WebUI.click(findTestObject('OBJ Menu Setting/003 Setting User/Button action user (1))'))

WebUI.click(findTestObject('OBJ Menu Setting/003 Setting User/Button action list (4) delete - user temporary'))

WebUI.click(findTestObject('OBJ Menu Setting/003 Setting User/Button delete - delete group role'))

