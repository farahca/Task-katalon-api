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
import groovy.json.JsonSlurper as JsonSlurper


GlobalVariable.name = 'farah'
GlobalVariable.username = 'ciki12'
GlobalVariable.email = 'emailtest@example.com'
GlobalVariable.street = 'margonda raya'
GlobalVariable.suite = 'residence'
GlobalVariable.city = 'jakarta'
GlobalVariable.zipcode = '10110'
GlobalVariable.lat = '-37.3159'
GlobalVariable.lng = '30.2154'
GlobalVariable.phone = '0832323232323232'
GlobalVariable.website = 'hildegard.or'
GlobalVariable.company = 'philadelpia'
GlobalVariable.catchPhrase = 'Multi-layered client-server'
GlobalVariable.bs = 'iesufes'

response = WS.sendRequestAndVerify(findTestObject('usesr/POST users'))

WS.verifyResponseStatusCode(response, 201)

WS.verifyElementPropertyValue(response, 'name', 'farah')
WS.verifyElementPropertyValue(response, 'username', 'ciki12')
WS.verifyElementPropertyValue(response, 'email', 'emailtest@example.com')
WS.verifyElementPropertyValue(response, 'street', 'margonda raya')
WS.verifyElementPropertyValue(response, 'suite', 'residence')
WS.verifyElementPropertyValue(response, 'city', 'jakarta')
WS.verifyElementPropertyValue(response, 'zipcode', '10110')
WS.verifyElementPropertyValue(response, 'lat', '-37.3159')
WS.verifyElementPropertyValue(response, 'lng', '30.2154')
WS.verifyElementPropertyValue(response, 'phone', '0832323232323232')
WS.verifyElementPropertyValue(response, 'website', 'hildegard.or')
WS.verifyElementPropertyValue(response, 'company', 'philadelpia')
WS.verifyElementPropertyValue(response, 'catchPhrase', 'Multi-layered client-server')
WS.verifyElementPropertyValue(response, 'bs', 'iesufes')


getID = WS.getElementPropertyValue(response, 'id')

println(getID)

