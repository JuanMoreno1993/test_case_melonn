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

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://admin-dev.melonn.com')

WebUI.delay(1)

WebUI.setText(findTestObject('Test_1/email_login_home'), 'juan.moreno.superseller@melonn.com')

WebUI.setText(findTestObject('Test_1/password_login_home'), 'Quijote08*')

WebUI.takeScreenshot('C:\\Users\\JUANCHO\\Katalon Studio\\proyecto_uno\\Data Files\\Screenshots_Test_4\\imagen1.png')

WebUI.click(findTestObject('Test_1/button_iniciar_sesion_login_home'))

WebUI.delay(1)

WebUI.setText(findTestObject('Test_1/select_seller'), 'Seller Juan QA')

WebUI.delay(1)

WebUI.click(findTestObject('Test_1/clic_seller_select'))

WebUI.delay(1)

WebUI.click(findTestObject('Test_1/button_enter'))

WebUI.delay(3)

WebUI.click(findTestObject('Test_4/button_refresh'))

WebUI.delay(3)

WebUI.setText(findTestObject('Test_1/select_seller'), 'Seller Juan QA')

WebUI.delay(1)

WebUI.click(findTestObject('Test_1/clic_seller_select'))

WebUI.delay(1)

WebUI.click(findTestObject('Test_1/button_enter'))

WebUI.takeScreenshot('C:\\Users\\JUANCHO\\Katalon Studio\\proyecto_uno\\Data Files\\Screenshots_Test_4\\imagen2.png')

WebUI.delay(1)

WebUI.click(findTestObject('Test_1/click_ventas'))

WebUI.delay(1)

WebUI.click(findTestObject('Test_1/button_ordenes'))

WebUI.delay(1)

WebUI.click(findTestObject('Test_1/button_crear'))

WebUI.delay(1)

WebUI.setText(findTestObject('Test_1/text_field_num_orden_ext'), 'A00097')

WebUI.setText(findTestObject('Test_1/text_field_nom_completo'), 'Homero Simpson')

WebUI.setText(findTestObject('Test_1/text_field_numero_celular'), '3053022884')

WebUI.takeScreenshot('C:\\Users\\JUANCHO\\Katalon Studio\\proyecto_uno\\Data Files\\Screenshots_Test_4\\imagen3.png')

WebUI.click(findTestObject('Test_1/button_next'))

WebUI.delay(1)

WebUI.click(findTestObject('Test_4/button_agregar_productos'))

WebUI.delay(1)

WebUI.click(findTestObject('Test_2/button_agregar'))

WebUI.delay(1)

WebUI.click(findTestObject('Test_2/button_cerrar'))

WebUI.delay(1)

WebUI.takeScreenshot('C:\\Users\\JUANCHO\\Katalon Studio\\proyecto_uno\\Data Files\\Screenshots_Test_4\\imagen4.png')

WebUI.click(findTestObject('Test_4/button_siguiente'))

WebUI.delay(1)

WebUI.click(findTestObject('Test_4/button_no_aplica'))

WebUI.delay(1)

WebUI.takeScreenshot('C:\\Users\\JUANCHO\\Katalon Studio\\proyecto_uno\\Data Files\\Screenshots_Test_4\\imagen5.png')

WebUI.click(findTestObject('Test_3/button_next'))

WebUI.delay(2)

WebUI.click(findTestObject('Test_4/button_dispatch'))

WebUI.delay(1)

WebUI.takeScreenshot('C:\\Users\\JUANCHO\\Katalon Studio\\proyecto_uno\\Data Files\\Screenshots_Test_4\\imagen6.png')

WebUI.click(findTestObject('Test_4/button_next_dispatch'))

WebUI.delay(2)

WebUI.setText(findTestObject('Test_4/direction_L1'), 'Calle 62A sur # 70 34')

WebUI.delay(1)

WebUI.click(findTestObject('Test_4/clic_region'))

WebUI.delay(1)

WebUI.click(findTestObject('Test_4/clic_ciudad_bogota'))

WebUI.delay(1)

WebUI.click(findTestObject('Test_4/shipping_city'))

WebUI.delay(1)

WebUI.click(findTestObject('Test_4/click_city_bogota'))

WebUI.delay(1)

WebUI.click(findTestObject('Test_4/button_next_info'))

WebUI.delay(5)

WebUI.click(findTestObject('Test_4/metod_delivery'))

WebUI.click(findTestObject('Test_4/clic_finish'))

WebUI.delay(6)

WebUI.verifyElementText(findTestObject('Test_4/verify_text'), 'Orden creada exitosamente')

WebUI.delay(4)

WebUI.getText(findTestObject(null))

WebUI.closeBrowser()

