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

WebUI.click(findTestObject('00-04 Modul Fixed Asset'))

WebUI.click(findTestObject('OBJ.001 - Setting Group/0042 Menu Setting'))

WebUI.click(findTestObject('OBJ.003 - Setting User/OBJ.003.001 Menu Setting User'))

WebUI.click(findTestObject('OBJ.003 - Setting User/OBJ.003.045 Button Action 2 (Fajar)'))

WebUI.click(findTestObject('OBJ.003 - Setting User/OBJ.003.044 Option Detail (Fajar)'))

WebUI.click(findTestObject('OBJ.003 - Setting User/OBJ.003.027 Click Transaction Role'))

WebUI.click(findTestObject('OBJ.003 - Setting User/OBJ.003.018 Button Tambah Assign Role'))

WebUI.click(findTestObject('OBJ.003 - Setting User/OBJ.003.019 Button Select Group'))

WebUI.click(findTestObject('OBJ.003 - Setting User/OBJ.003.028 Click Kantor Pusat Jakarta'))

WebUI.click(findTestObject('OBJ.003 - Setting User/OBJ.003.021 Button Select (Group)'))

WebUI.click(findTestObject('OBJ.003 - Setting User/OBJ.003.029 Dropdown Transaction Role'))

WebUI.click(findTestObject('OBJ.003 - Setting User/OBJ.003.031 Pilih (Transaction Atau Select Role ) 2'))

WebUI.click(findTestObject('OBJ.003 - Setting User/OBJ.003.034 Dropdown Select Role'))

WebUI.click(findTestObject('OBJ.003 - Setting User/OBJ.003.031 Pilih (Transaction Atau Select Role ) 2'))

WebUI.click(findTestObject('OBJ.003 - Setting User/OBJ.003.026 Button Submit Assign System Role Dan Transaction Role'))

WebUI.click(findTestObject('OBJ.003 - Setting User/OBJ.003.067 Button close detail user Copy'))

WebUI.click(findTestObject('OBJ.003 - Setting User/OBJ.003.014 Button Change Log'))

WebUI.delay(2)

WebUI.takeScreenshot('Screenshot/TC.003.021- Menambahkan transaction role pada user.png', FailureHandling.STOP_ON_FAILURE)

