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

WebUI.navigateToUrl('https://mvrcks-cms-app.venturo.pro/home')

WebUI.setText(findTestObject('Object Repository/Beirta/Tambah Berita/Page_CMS  Maverick/Page_CMS  Maverick/tambah berita new/Page_CMS  Maverick/input__form-custom ng-untouched ng-valid ng-dirty'), 
    'agung@landa.co.id')

WebUI.setEncryptedText(findTestObject('Object Repository/Beirta/Tambah Berita/Page_CMS  Maverick/Page_CMS  Maverick/tambah berita new/Page_CMS  Maverick/input__form-custom ng-untouched ng-pristine_2a171a'), 
    'VE9Pfhf12+2PJS89WoZW7A==')

WebUI.click(findTestObject('Object Repository/Beirta/Tambah Berita/Page_CMS  Maverick/Page_CMS  Maverick/tambah berita new/Page_CMS  Maverick/button_Masuk'))

WebUI.click(findTestObject('Object Repository/Beirta/Tambah Berita/Page_CMS  Maverick/Page_CMS  Maverick/tambah berita new/Page_CMS  Maverick/button_Tambah Berita'))

WebUI.click(findTestObject('Object Repository/Beirta/Tambah Berita/Page_CMS  Maverick/Page_CMS  Maverick/tambah berita new/Page_CMS  Maverick/input_Judul Berita_title'))

WebUI.setText(findTestObject('Object Repository/Beirta/Tambah Berita/Page_CMS  Maverick/Page_CMS  Maverick/tambah berita new/Page_CMS  Maverick/input_Judul Berita_title'), 
    'judul berita automation')

WebUI.click(findTestObject('Object Repository/Beirta/Tambah Berita/Page_CMS  Maverick/Page_CMS  Maverick/tambah berita new/Page_CMS  Maverick/span_Upload gambar'))

WebUI.click(findTestObject('Object Repository/Beirta/Tambah Berita/Page_CMS  Maverick/Page_CMS  Maverick/tambah berita new/Page_CMS  Maverick/div_Pilih gambar header_p-3 rounded-pill mx-auto'))

WebUI.click(findTestObject('Object Repository/Beirta/Tambah Berita/Page_CMS  Maverick/Page_CMS  Maverick/tambah berita new/Page_CMS  Maverick/div_Guru BesarStory Kejaksaan'))

WebUI.click(findTestObject('Object Repository/Beirta/Tambah Berita/Page_CMS  Maverick/Page_CMS  Maverick/tambah berita new/Page_CMS  Maverick/button_Pilih'))

WebUI.setText(findTestObject('Object Repository/Beirta/Tambah Berita/Page_CMS  Maverick/Page_CMS  Maverick/tambah berita new/Page_CMS  Maverick/input_Caption Gambar_template_param_key_ima_14b451'), 
    'caption')

WebUI.click(findTestObject('Object Repository/Beirta/Tambah Berita/Page_CMS  Maverick/Page_CMS  Maverick/tambah berita new/Page_CMS  Maverick/button_Add Section'))

WebUI.click(findTestObject('Object Repository/Beirta/Tambah Berita/Page_CMS  Maverick/Page_CMS  Maverick/tambah berita new/Page_CMS  Maverick/button_Pilih Template'))

WebUI.click(findTestObject('Object Repository/Beirta/Tambah Berita/Page_CMS  Maverick/Page_CMS  Maverick/tambah berita new/Page_CMS  Maverick/img_Template 4_img-fluid h-50'))

WebUI.click(findTestObject('Object Repository/Beirta/Tambah Berita/Page_CMS  Maverick/Page_CMS  Maverick/tambah berita new/Page_CMS  Maverick/button_Pilih'))

WebUI.setText(findTestObject('Object Repository/Beirta/Tambah Berita/Page_CMS  Maverick/Page_CMS  Maverick/tambah berita new/Page_CMS  Maverick/input_Judul_template_param_key_title'), 
    'judul automation 2')

WebUI.click(findTestObject('Object Repository/Beirta/Tambah Berita/Page_CMS  Maverick/Page_CMS  Maverick/tambah berita new/Page_CMS  Maverick/button_Add Section'))

WebUI.click(findTestObject('Object Repository/Beirta/Tambah Berita/Page_CMS  Maverick/Page_CMS  Maverick/tambah berita new/Page_CMS  Maverick/button_Pilih Template'))

WebUI.click(findTestObject('Object Repository/Beirta/Tambah Berita/Page_CMS  Maverick/Page_CMS  Maverick/tambah berita new/Page_CMS  Maverick/img_Template 4_img-fluid h-50'))

WebUI.click(findTestObject('Object Repository/Beirta/Tambah Berita/Page_CMS  Maverick/Page_CMS  Maverick/tambah berita new/Page_CMS  Maverick/button_Pilih'))

WebUI.setText(findTestObject('Object Repository/Beirta/Tambah Berita/Page_CMS  Maverick/Page_CMS  Maverick/tambah berita new/Page_CMS  Maverick/input_Judul_template_param_key_title'), 
    'judul section3')

WebUI.click(findTestObject('Object Repository/Beirta/Tambah Berita/Page_CMS  Maverick/Page_CMS  Maverick/tambah berita new/Page_CMS  Maverick/button_Add Section'))

