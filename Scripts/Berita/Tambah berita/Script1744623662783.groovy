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
import java.nio.file.*
import java.net.URL as URL
import java.io.File as File

WebUI.callTestCase(findTestCase('Auth/Login'), [:], FailureHandling.STOP_ON_FAILURE)

//WebUI.callTestCase(findTestCase('Auth/Login'), [:], FailureHandling.STOP_ON_FAILURE)
// URL gambar dari Google Drive (direct download)
String imageUrl = 'https://cms-apistory.kejaksaan.go.id/storage/mav-prod-resized/480x/ori/master/2025/4/10/1744245854.webp'

// Dapatkan path folder project
String projectDir = System.getProperty('user.dir')

// Gabungkan path ke folder Assets
String assetsDir = (projectDir + File.separator) + 'Assets'

// Pastikan folder Assets ada
File folder = new File(assetsDir)

// Jika folder assets belum ada, maka akan dibuatkan otomatis
if (!(folder.exists())) {
    folder.mkdirs()
}

// Path lengkap ke file yang akan disimpan
String localPath = (assetsDir + File.separator) + 'temp_upload.jpg'

WebUI.click(findTestObject('Object Repository/Beirta/Tambah Berita/Page_CMS  Maverick/button_Tambah Berita'))

WebUI.setText(findTestObject('Object Repository/Beirta/Tambah Berita/Page_CMS  Maverick/input_Judul Berita_title'), GlobalVariable.isi_judul_template)

WebUI.click(findTestObject('Object Repository/Beirta/Tambah Berita/Page_CMS  Maverick/button_Upload gambar'))

WebUI.verifyElementClickable(findTestObject('Beirta/Tambah Berita/Page_CMS  Maverick/div_upload_img'))

Files.copy(new URL(imageUrl).openStream(), Paths.get(localPath), StandardCopyOption.REPLACE_EXISTING)

WebUI.uploadFile(findTestObject('Beirta/Tambah Berita/Page_CMS  Maverick/div_upload_img'), localPath)

WebUI.click(findTestObject('Object Repository/Beirta/Tambah Berita/Page_CMS  Maverick/button_Tambah'))

WebUI.setText(findTestObject('Object Repository/Beirta/Tambah Berita/Page_CMS  Maverick/input_Caption Gambar_template_param_key_ima_14b451'), 
    GlobalVariable.caption_image)

WebUI.setText(findTestObject('Object Repository/Beirta/Tambah Berita/Page_CMS  Maverick/input__template_param_key_image_copyright'), 
    GlobalVariable.copyright)

WebUI.click(findTestObject('Object Repository/Beirta/Tambah Berita/Page_CMS  Maverick/svg_-- Pilih tag --_rotate-icon'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Beirta/Tambah Berita/Page_CMS  Maverick/select_-- Pilih kategori --  Teskategori  I_020fa7'), 
    '13', true)

WebUI.click(findTestObject('Object Repository/Beirta/Tambah Berita/Page_CMS  Maverick/path'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Beirta/Tambah Berita/Page_CMS  Maverick/select_-- Pilih tipe konten --  Trending  Timeless'), 
    'trending', true)

WebUI.click(findTestObject('Beirta/Tambah Berita/Page_CMS  Maverick/Page_CMS  Maverick/button_Add Section'))

WebUI.click(findTestObject('Beirta/Tambah Berita/Page_CMS  Maverick/Page_CMS  Maverick/button_Pilih Template'))

WebUI.click(findTestObject('Beirta/Tambah Berita/Page_CMS  Maverick/Page_CMS  Maverick/input_Template 3_template4_1'))

WebUI.click(findTestObject('Beirta/Tambah Berita/Page_CMS  Maverick/Page_CMS  Maverick/button_Pilih'))

WebUI.setText(findTestObject('Beirta/Tambah Berita/Page_CMS  Maverick/Page_CMS  Maverick/input_Judul_template_param_key_title'), 
    GlobalVariable.isi_judul_template)

WebUI.setText(findTestObject('Beirta/Tambah Berita/Page_CMS  Maverick/Page_CMS  Maverick/p'), GlobalVariable.isi_konten)

//WebUI.click(findTestObject('Beirta/Tambah Berita/Page_CMS  Maverick/Page_CMS  Maverick/input_Template_1'))
//WebUI.click(findTestObject('Beirta/Tambah Berita/Page_CMS  Maverick/Page_CMS  Maverick/button_Pilih'))
//WebUI.click(findTestObject('Beirta/Tambah Berita/Page_CMS  Maverick/Page_CMS  Maverick/button_upload gambar'))
//WebUI.verifyElementClickable(findTestObject('Beirta/Tambah Berita/Page_CMS  Maverick/div_upload_img'))
//Files.copy(new URL(imageUrl).openStream(), Paths.get(localPath), StandardCopyOption.REPLACE_EXISTING)
//WebUI.uploadFile(findTestObject('Beirta/Tambah Berita/Page_CMS  Maverick/div_upload_img'), localPath)
//WebUI.click(findTestObject('Object Repository/Beirta/Tambah Berita/Page_CMS  Maverick/button_Tambah'))
not_run: WebUI.acceptAlert()

not_run: WebUI.click(findTestObject('Object Repository/Beirta/Tambah Berita/Page_CMS  Maverick/button_Simpan  Publish'))

not_run: WebUI.click(findTestObject('Object Repository/Beirta/Tambah Berita/Page_CMS  Maverick/button_Ya'))

