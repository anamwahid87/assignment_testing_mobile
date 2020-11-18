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

Mobile.startApplication('C:\\Users\\ANAMUNO\\Downloads\\ECommerceSAMPLEAndroid-201016-115534.apk', true)

Mobile.pressBack()

Mobile.tap(findTestObject('Object Repository/android.widget.ImageView'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.Button - ADD TO CART'), 0)

Mobile.setText(findTestObject('Object Repository/android.widget.EditText'), '5', 0)

Mobile.tap(findTestObject('Object Repository/android.widget.Button - ADD'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.TextView'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.Button - CHECKOUT'), 0)

Mobile.setText(findTestObject('Object Repository/android.widget.EditText - Your Name'), 'Anam', 0)

Mobile.setText(findTestObject('Object Repository/android.widget.EditText - your.emailgmail.com'), 'anam@gmail.com', 0)

Mobile.setText(findTestObject('Object Repository/android.widget.EditText - 628123456789'), '+6289908990899', 0)

Mobile.setText(findTestObject('Object Repository/android.widget.EditText - Your Address'), 'New York', 0)

Mobile.tap(findTestObject('Object Repository/android.widget.Button - PROCESS CHECKOUT'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.Button - YES'), 0)

Mobile.closeApplication()

