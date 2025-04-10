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

//WebUI.callTestCase(findTestCase('User/Tambah user'), [:], FailureHandling.STOP_ON_FAILURE)
//WebUI.callTestCase(findTestCase('Auth/Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/User/Edit user/Page_CMS  Maverick/a_User'))

WebUI.setText(findTestObject('Object Repository/User/Edit user/Page_CMS  Maverick/input_Daftar User_form-control form-control-sm d-inline-block mr-2 field-responsive field-responsive-ipad pr-4 ng-untouched ng-pristine ng-valid'), 
    GlobalVariable.nama_user)

WebUI.click(findTestObject('Object Repository/User/Edit user/Page_CMS  Maverick/button_user_dgmail.com_editBtn'))

WebUI.setText(findTestObject('Object Repository/User/Edit user/Page_CMS  Maverick/input_Nama_name'), GlobalVariable.nama_user_edit)

WebUI.click(findTestObject('Object Repository/User/Edit user/Page_CMS  Maverick/button_Simpan'))

WebUI.click(findTestObject('Object Repository/User/Edit user/Page_CMS  Maverick/button_'))

WebUI.setText(findTestObject('Object Repository/User/Edit user/Page_CMS  Maverick/input_Daftar User_form-control form-control-sm d-inline-block mr-2 field-responsive field-responsive-ipad pr-4 ng-untouched ng-pristine ng-valid'), 
    GlobalVariable.nama_user_edit)

WebUI.click(findTestObject('Object Repository/User/Edit user/Page_CMS  Maverick/button_user_dgmail.com_deleteBtn'))

WebUI.click(findTestObject('Object Repository/User/Edit user/Page_CMS  Maverick/button_Ya'))

