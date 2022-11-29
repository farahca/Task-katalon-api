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


GlobalVariable.name = 'farah camilla'
GlobalVariable.email = 'email123@example.com'
GlobalVariable.body_comment = 'Comment untuk assignment katalon'

response = WS.sendRequest(findTestObject('comment/POST comment'))

WS.verifyResponseStatusCode(response, 201)

WS.verifyElementPropertyValue(response, 'name ', 'farah camilla')
WS.verifyElementPropertyValue(response, 'email', 'email123@example.com')
WS.verifyElementPropertyValue(response, 'body', 'Comment untuk assignment katalon')
getID = WS.getElementPropertyValue(response, 'id')
println(getID)


GlobalVariable.name = 'fulan bin fulan'
GlobalVariable.email = 'email345@example.com'
GlobalVariable.body_comment = 'Komen 2 untuk assignment katalon api'

response1 = WS.sendRequest(findTestObject('comment/POST comment'))

WS.verifyResponseStatusCode(response1, 201)

WS.verifyElementPropertyValue(response1, 'name ', 'fulan bin fulan')
WS.verifyElementPropertyValue(response1, 'email', 'email345@example.com')
WS.verifyElementPropertyValue(response1, 'body', 'Komen 2 untuk assignment katalon api')
getID = WS.getElementPropertyValue(response1, 'id')
println(getID)