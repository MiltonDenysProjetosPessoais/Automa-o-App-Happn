package Happn;
import android.app.Instrumentation;
import android.support.test.uiautomator.UiDevice;
import android.support.test.uiautomator.UiObject;
import android.support.test.uiautomator.UiObjectNotFoundException;
import android.support.test.uiautomator.UiScrollable;
import android.support.test.uiautomator.UiSelector;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static android.support.test.InstrumentationRegistry.getInstrumentation;
import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
/**
 * Created by brisatc290.silva on 7/25/2017.
 */

public class Happn extends Instrumentation{

    UiDevice mDevice;

    @Before

    public void SetUp() throws Exception{

        mDevice = UiDevice.getInstance(getInstrumentation());

    }
    //automatizador de likes happn
    @Test
    public void openHappn() throws UiObjectNotFoundException {
        //encontra o botão de todos os apps do google
        UiObject allAppsButton = new UiObject(new UiSelector().description("Apps"));
        //clica no botao
        allAppsButton.clickAndWaitForNewWindow();
        // declara o objeto de scroll como vertical
        UiScrollable appViews = new UiScrollable(new UiSelector().scrollable(true));
        appViews.setAsVerticalList();
        //srool até encontrar o texto
        appViews.scrollTextIntoView("happn");
        //declara o objeto do botão e clica no mesmo
        UiObject btnHappn = mDevice.findObject(new UiSelector().text("happn"));
        btnHappn.clickAndWaitForNewWindow();
        //declara o botão like
        UiObject btnHappn1 = mDevice.findObject(new UiSelector().resourceId("com.ftw_and_co.happn:id/action_buttons_view_no_interaction_like_button"));
        //loop para enquanto like existir continuar clicando

        //UiScrollable morePhotos = new UiScrollable(new UiSelector().scrollable(true));
        //UiObject morePhotos1 = mDevice.findObject(new UiSelector().resourceId("com.ftw_and_co.happn:id/home_recycler_view"));

    
        while(true){
            if (!btnHappn1.exists()){
                mDevice.swipe(502,1545,482,551,20);
            while(btnHappn1.exists()){
                btnHappn1.click();

                }}}
    }
}
