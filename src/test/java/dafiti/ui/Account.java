package dafiti.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Account {
    public static final Target GO_APP = Target.the("Go to App").locatedBy("//android.view.View[@content-desc='IR AL APP']/android.widget.TextView");
    public static final Target SECTION_MEN = Target.the("Section Men").locatedBy("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ImageView");
    public static final Target ACCOUNT = Target.the("Label Account").locatedBy("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.FrameLayout[4]/android.widget.LinearLayout/android.widget.TextView");
    public static final Target GET_IN = Target.the(" Get In").located(By.id("br.com.dafiti:id/label"));
    public static final Target CREATE_ACCOUNT = Target.the("Create Account").located(By.id("br.com.dafiti:id/create_account"));
    public static final Target EMAIL = Target.the("E-mail").located(By.id("br.com.dafiti:id/form_email"));
    public static final Target PASSWORD = Target.the("Password").located(By.id("br.com.dafiti:id/form_password"));
    public static final Target CONFIRMATE_PASSWORD = Target.the("Confirmate Password").located(By.id("br.com.dafiti:id/form_password_confirm"));
    public static final Target DOCUMENT_TYPE = Target.the("Document Type").located(By.id("br.com.dafiti:id/form_document_type"));
    public static final Target SELECT_DOCUMENT_TYPE = Target.the("Select document type").locatedBy("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout[2]/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]");
    public static final Target ID = Target.the("Id").located(By.id("br.com.dafiti:id/form_identification"));
    public static final Target FIRST_NAME = Target.the("first name").located(By.id("br.com.dafiti:id/form_first_name"));
    public static final Target LAST_NAME = Target.the("Last name").located(By.id("br.com.dafiti:id/form_last_name"));
    public static final Target BIRTDATE = Target.the("Birt Date").located(By.id("br.com.dafiti:id/form_birthday"));
    public static final Target GENDER = Target.the("Gender").located(By.id("br.com.dafiti:id/form_gender"));
    public static final Target SELECT_GENDER = Target.the("Select gender").locatedBy("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout[2]/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]");
    public static final Target SAVE_DATA = Target.the("Save data").located(By.id("br.com.dafiti:id/register_button"));
}
