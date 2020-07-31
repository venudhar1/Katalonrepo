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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://adfsvtv9r.veripark.com/adfs/ls/?wa=wsignin1.0&wtrealm=https%3a%2f%2ffull-vtqa.veripark.com%2f&wctx=rm%3d1%26id%3dc00661d2-4980-4dd6-a1bb-f59de86cfa71%26ru%3dhttps%253a%252f%252ffull-vtqa.veripark.com%252fmain.aspx%253fappid%253d9b809064-3ca6-ea11-843b-0050568eec17%26crmorgid%3dfd92ac35-0e8d-ea11-843a-0050568eec17&wct=2020-07-31T12%3a39%3a32Z&wauth=urn%3aoasis%3anames%3atc%3aSAML%3a1.0%3aam%3apassword')

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Object Repository/Page_Sign In/input_Sign in with your organizational acco_d4c899'), 'testautomation@VTV9R')

WebUI.sendKeys(findTestObject('Object Repository/Page_Sign In/input_Sign in with your organizational acco_04b8f7'), '1qaz!QAZ')

WebUI.click(findTestObject('Object Repository/Page_Sign In/span_Sign in'))

WebUI.closeBrowser()

