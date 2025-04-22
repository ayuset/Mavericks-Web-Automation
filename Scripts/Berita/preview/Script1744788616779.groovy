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

WebUI.callTestCase(findTestCase('Auth/Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Beirta/Preview/Page_CMS  Maverick/Page_CMS  Maverick/button_landa_editBtn'))

WebUI.click(findTestObject('Object Repository/Beirta/Preview/Page_CMS  Maverick/Page_CMS  Maverick/button_Preview'))

WebUI.mouseOver(findTestObject('Object Repository/Beirta/Preview/Page_CMS  Maverick/Page_CMS  Maverick/section_Ini berita coba isi konten         _5e36ff'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.scrollToPosition(100, 550)

WebUI.scrollToElement(findTestObject('Object Repository/Beirta/Preview/Page_CMS  Maverick/Page_CMS  Maverick/section_Ini berita coba isi konten         _5e36ff'), 
    100)

not_run: WebUI.mouseOver(findTestObject('Object Repository/Beirta/Preview/Page_CMS  Maverick/Page_CMS  Maverick/span_Ini berita coba isi konten_tap-descHide absolute inset-0 pointer-events-auto'))

not_run: WebUI.scrollToElement(findTestObject('Object Repository/Beirta/Preview/Page_CMS  Maverick/Page_CMS  Maverick/span_Ini berita coba isi konten_tap-descHide absolute inset-0 pointer-events-auto'), 
    100)

not_run: WebUI.rightClick(findTestObject('Object Repository/Beirta/Preview/Page_CMS  Maverick/Page_CMS  Maverick/h2_Lorem ipsum dolor sit amet, consectetur _8e1af6'))

not_run: WebUI.rightClick(findTestObject('Object Repository/Beirta/Preview/Page_CMS  Maverick/Page_CMS  Maverick/h2_Lorem ipsum dolor sit amet, consectetur _8e1af6'))

