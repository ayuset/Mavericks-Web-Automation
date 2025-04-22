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

WebUI.setText(findTestObject('Object Repository/Beirta/Edit berrita/Page_CMS  Maverick/Page_CMS  Maverick/input_Daftar Berita_form-control form-contr_d964d7'), 
    GlobalVariable.isi_judul_template)

WebUI.click(findTestObject('Object Repository/Beirta/Edit berrita/Page_CMS  Maverick/Page_CMS  Maverick/button_landa_editBtn'))

WebUI.setText(findTestObject('Object Repository/Beirta/Edit berrita/Page_CMS  Maverick/Page_CMS  Maverick/input_Judul Berita_title'), 
    GlobalVariable.isi_judul_template_edit)

WebUI.setText(findTestObject('Object Repository/Beirta/Edit berrita/Page_CMS  Maverick/Page_CMS  Maverick/input_Caption Gambar_template_param_key_ima_14b451'), 
    GlobalVariable.caption_image)

WebUI.setText(findTestObject('Object Repository/Beirta/Edit berrita/Page_CMS  Maverick/Page_CMS  Maverick/input__template_param_key_image_copyright'), 
    GlobalVariable.copyright_template)

WebUI.click(findTestObject('Object Repository/Beirta/Edit berrita/Page_CMS  Maverick/Page_CMS  Maverick/input__template_param_key_image_copyright'))

WebUI.setText(findTestObject('Object Repository/Beirta/Edit berrita/Page_CMS  Maverick/Page_CMS  Maverick/input__template_param_key_image_copyright'), 
    GlobalVariable.copyright_template)

WebUI.click(findTestObject('Object Repository/Beirta/Edit berrita/Page_CMS  Maverick/Page_CMS  Maverick/input__template_param_key_image_copyright'))

WebUI.click(findTestObject('Object Repository/Beirta/Edit berrita/Page_CMS  Maverick/Page_CMS  Maverick/svg_-- Pilih tag --_rotate-icon'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Beirta/Edit berrita/Page_CMS  Maverick/Page_CMS  Maverick/select_-- Pilih kategori --  Teskategori  I_020fa7'), 
    '290', true)

WebUI.click(findTestObject('Object Repository/Beirta/Edit berrita/Page_CMS  Maverick/Page_CMS  Maverick/p_ini paragraf'))

WebUI.click(findTestObject('Object Repository/Beirta/Edit berrita/Page_CMS  Maverick/Page_CMS  Maverick/div_Section 2 Template 4 Pilih Template Daf_d7f5f9'))

WebUI.click(findTestObject('Object Repository/Beirta/Edit berrita/Page_CMS  Maverick/Page_CMS  Maverick/input_Judul_template_param_key_title'))

WebUI.setText(findTestObject('Object Repository/Beirta/Edit berrita/Page_CMS  Maverick/Page_CMS  Maverick/input_Judul_template_param_key_title'), 
    GlobalVariable.isi_judul_template_edit)

WebUI.click(findTestObject('Object Repository/Beirta/Edit berrita/Page_CMS  Maverick/Page_CMS  Maverick/button_Simpan  Publish'))

WebUI.click(findTestObject('Object Repository/Beirta/Edit berrita/Page_CMS  Maverick/Page_CMS  Maverick/button_Ya'))

WebUI.setText(findTestObject('Object Repository/Beirta/Edit berrita/Page_CMS  Maverick/Page_CMS  Maverick/input_Daftar Berita_form-control form-contr_d964d7'), 
    GlobalVariable.isi_judul_template_edit)

WebUI.click(findTestObject('Object Repository/Beirta/Edit berrita/Page_CMS  Maverick/Page_CMS  Maverick/button_landa_deleteBtn'))

WebUI.click(findTestObject('Object Repository/Beirta/Edit berrita/Page_CMS  Maverick/Page_CMS  Maverick/button_Ya_1'))

