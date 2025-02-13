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
import org.apache.commons.lang.RandomStringUtils as RandomStringUtils

// Generate an 8-character random string
// Generate an 8-character random string
// Example usage in a test case
String randomEmail = generateRandomEmail()

String randomname = generateRandomName()

//println("Generated Random Email: " + randomEmail)
WebUI.click(findTestObject('Element/div_Elements'))

WebUI.click(findTestObject('Element/span_Text Box'))

WebUI.setText(findTestObject('Element/input_Full Name_userName'), randomname)

WebUI.setText(findTestObject('Element/input_Email_userEmail'), randomEmail)

WebUI.setText(findTestObject('Element/textarea_Current Address_currentAddress'), address)

WebUI.setText(findTestObject('Element/textarea_Permanent Address_permanentAddress'), parentAddres)

WebUI.click(findTestObject('Element/button_Submit'))



def generateRandomEmail() {
    String randomString = RandomStringUtils.randomAlphanumeric(8)

    return "user_$randomString@yopmail.com"
}

def generateRandomName() {
    String randomString = RandomStringUtils.randomAlphanumeric(8)

    return "user_$randomString"
}


