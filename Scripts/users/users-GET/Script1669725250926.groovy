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
import groovy.json.JsonSlurper

response = WS.sendRequestAndVerify(findTestObject('usesr/GET users'))

WS.verifyElementPropertyValue(response, '[0].id', '1')
WS.verifyElementPropertyValue(response, '[0].name', 'Leanne Graham')
WS.verifyElementPropertyValue(response, '[0].username', 'Bret')
WS.verifyElementPropertyValue(response, '[0].email', 'Sincere@april.biz')
WS.verifyElementPropertyValue(response, '[0].address.street', 'Kulas Light')
WS.verifyElementPropertyValue(response, '[0].address.suite', 'Apt. 556')
WS.verifyElementPropertyValue(response, '[0].address.city', 'Gwenborough')
WS.verifyElementPropertyValue(response, '[0].address.zipcode', '92998-3874')
WS.verifyElementPropertyValue(response, '[0].address.geo.lat', '-37.3159')
WS.verifyElementPropertyValue(response, '[0].address.geo.lng', '81.1496')
WS.verifyElementPropertyValue(response, '[0].phone', '1-770-736-8031 x56442')
WS.verifyElementPropertyValue(response, '[0].website', 'hildegard.org')
WS.verifyElementPropertyValue(response, '[0].company.name', 'Romaguera-Crona')
WS.verifyElementPropertyValue(response, '[0].company.catchPhrase', 'Multi-layered client-server neural-net')
WS.verifyElementPropertyValue(response, '[0].company.bs', 'harness real-time e-markets')

WS.verifyElementPropertyValue(response, '[1].id', '2')
WS.verifyElementPropertyValue(response, '[1].name', 'Ervin Howell')
WS.verifyElementPropertyValue(response, '[1].username', 'Antonette')
WS.verifyElementPropertyValue(response, '[1].email', 'Shanna@melissa.tv')
WS.verifyElementPropertyValue(response, '[1].address.street', 'Victor Plains')
WS.verifyElementPropertyValue(response, '[1].address.suite', 'Suite 879')
WS.verifyElementPropertyValue(response, '[1].address.city', 'Wisokyburgh')
WS.verifyElementPropertyValue(response, '[1].address.zipcode', '90566-7771')
WS.verifyElementPropertyValue(response, '[1].address.geo.lat', '-43.9509')
WS.verifyElementPropertyValue(response, '[1].address.geo.lng', '-34.4618')
WS.verifyElementPropertyValue(response, '[1].phone', '010-692-6593 x09125')
WS.verifyElementPropertyValue(response, '[1].website', 'anastasia.net')
WS.verifyElementPropertyValue(response, '[1].company.name', 'Deckow-Crist')
WS.verifyElementPropertyValue(response, '[1].company.catchPhrase', 'Proactive didactic contingency')
WS.verifyElementPropertyValue(response, '[1].company.bs', 'synergize scalable supply-chains')

WS.verifyResponseStatusCode(response, 200)

