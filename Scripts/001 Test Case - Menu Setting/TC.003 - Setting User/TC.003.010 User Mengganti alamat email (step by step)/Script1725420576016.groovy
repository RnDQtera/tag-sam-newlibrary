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

WebUI.openBrowser(GlobalVariable.URL)

WebUI.maximizeWindow()

WebUI.setText(findTestObject('00-01 ID'), GlobalVariable.id)

WebUI.setText(findTestObject('00-02 PASS'), GlobalVariable.pass)

WebUI.click(findTestObject('00-03 Button Login'))

WebUI.click(findTestObject('OBJ.001 - Setting Group/0005 Menu Fixed Asset'))

WebUI.click(findTestObject('OBJ.001 - Setting Group/0042 Menu Setting'))

WebUI.click(findTestObject('OBJ.003 - Setting User/OBJ.003.001 Menu Setting User'))

WebUI.delay(5)

WebUI.click(findTestObject('OBJ.003 - Setting User/OBJ.003.052 Button Action User (4) (Rizky ) - Copy'))

WebUI.click(findTestObject('OBJ.003 - Setting User/OBJ.003.052 Button EditUser (4) (Rizky ) - Copy - Copy'))

WebUI.clearText(findTestObject('OBJ.003 - Setting User/OBJ.003.053 Field Email User (4) (Rizky ) - Copy'))

WebUI.delay(2)

WebUI.setText(findTestObject('OBJ.003 - Setting User/OBJ.003.053 Field Email User (4) (Rizky ) - Copy'), 'rizky2@mailnesia.com')

WebUI.click(findTestObject('OBJ.003 - Setting User/OBJ.003.050 Button Save Edit User (2) (fajar) - Copy'))

WebUI.click(findTestObject('OBJ.003 - Setting User/OBJ.003.051 Button Continue Edit User - Copy'))

WebUI.delay(3)

WebUI.click(findTestObject('OBJ.003 - Setting User/OBJ.003.052 Button Action User (4) (Rizky ) - Copy'))

WebUI.click(findTestObject('OBJ.003 - Setting User/OBJ.003.056 Button Detail User-(4) Copy'))

WebUI.delay(3)

WebUI.takeScreenshot('Screenshot/TC.003.010- User mengganti alamat email (step by step) .png', FailureHandling.STOP_ON_FAILURE)

