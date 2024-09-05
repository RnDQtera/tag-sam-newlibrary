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

WebUI.setText(findTestObject('0001 ID'), GlobalVariable.id)

WebUI.setText(findTestObject('0002 PASS'), GlobalVariable.pass)

WebUI.click(findTestObject('0003 Button Login'))

WebUI.click(findTestObject('OBJ.001 - Setting Group/0005 Menu Fixed Asset'))

WebUI.click(findTestObject('OBJ.001 - Setting Group/0042 Menu Setting'))

WebUI.click(findTestObject('OBJ.003 - Setting User/OBJ.003.001 Menu Setting User'))

WebUI.click(findTestObject('OBJ.003 - Setting User/OBJ.003.002 Button Tambah User'))

WebUI.setText(findTestObject('OBJ.003 - Setting User/OBJ.003.003 Field First Name'), 'Fajar')

WebUI.setText(findTestObject('OBJ.003 - Setting User/OBJ.003.004 Field Last Name'), 'Maulana')

WebUI.setText(findTestObject('OBJ.003 - Setting User/OBJ.003.005 Field Division'), 'IT QA')

WebUI.setText(findTestObject('OBJ.003 - Setting User/OBJ.003.006 Field Phone Number'), '1234568')

WebUI.setText(findTestObject('OBJ.003 - Setting User/OBJ.003.007 Field Email'), 'fajar@mailnesia.com')

WebUI.click(findTestObject('OBJ.003 - Setting User/OBJ.003.035 Checkboc Set as temporary user'))

WebUI.click(findTestObject('OBJ.003 - Setting User/OBJ.003.037 Field Active Period Until'))

WebUI.click(findTestObject('OBJ.003 - Setting User/OBJ.003.036 Tanggal Sekarang'))

WebUI.click(findTestObject('OBJ.003 - Setting User/OBJ.003.008 Button Select Group'))

WebUI.click(findTestObject('OBJ.003 - Setting User/OBJ.003.009 Click Dropdown Kantor Pusat Jakarta'))

WebUI.click(findTestObject('OBJ.003 - Setting User/OBJ.003.010 Click Cabang Jakarta Barat'))

WebUI.click(findTestObject('OBJ.003 - Setting User/OBJ.003.011 Button Select'))

WebUI.click(findTestObject('OBJ.003 - Setting User/OBJ.003.012 Button Submit'))

WebUI.click(findTestObject('OBJ.003 - Setting User/OBJ.003.015 Button Create'))

WebUI.delay(2)

WebUI.takeScreenshot('Screenshot/002 Setting User/TC.003.004- Membuat User Baru(Temporary).png', FailureHandling.STOP_ON_FAILURE)

