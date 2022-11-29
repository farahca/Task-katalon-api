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



GlobalVariable.title = 'album pertama'
GlobalVariable.url = 'https://via.placeholder.com/2300/9fsdfc952'
GlobalVariable.thumbnailUrl = 'https://via.placeholder.com/150/ees4552'

response = WS.sendRequest(findTestObject('photos/POST photos'))

WS.verifyResponseStatusCode(response, 201)

WS.verifyElementPropertyValue(response, 'title', 'album pertama')
WS.verifyElementPropertyValue(response, 'url', 'https://via.placeholder.com/2300/9fsdfc952')
WS.verifyElementPropertyValue(response, 'thumbnailUrl', 'https://via.placeholder.com/150/ees4552')
getID = WS.getElementPropertyValue(response, 'id')
println(getID)


GlobalVariable.title = 'album kedua'
GlobalVariable.url = 'https://via.placeholder.com/2300/09302jkaj'
GlobalVariable.thumbnailUrl = 'https://via.placeholder.com/150/9833jkka'

response1 = WS.sendRequest(findTestObject('photos/POST photos'))

WS.verifyResponseStatusCode(response1, 201)

WS.verifyElementPropertyValue(response1, 'title', 'album kedua')
WS.verifyElementPropertyValue(response1, 'url', 'https://via.placeholder.com/2300/09302jkaj')
WS.verifyElementPropertyValue(response1, 'thumbnailUrl', 'https://via.placeholder.com/150/9833jkka')
getID = WS.getElementPropertyValue(response, 'id')
println(getID)
