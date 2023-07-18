package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class Elementos {

    public static Target BTN_LOGIN = Target.the("Boton Login").locatedBy("//*[@id='HeaderControl_Login_CD']");
    public static Target TXT_USU = Target.the("Caja de texto Usuario").locatedBy("//*[@id='HeaderControl_LogonControl_LoginFormLayout_txtEmail_I']");
    public static Target TXT_CONTRA = Target.the("Caja de texto Contrasena").locatedBy("//*[@id='HeaderControl_LogonControl_LoginFormLayout_txtPassword_I_CLND']");
    public static Target TXT_CODE = Target.the("Caja de texto Codigo de verificacion").locatedBy("//*[@id='HeaderControl_LogonControl_LoginFormLayout_Captcha_TB_I']");
    public static Target BTN_CANCELAR = Target.the("Boton cancelar login").locatedBy("//*[@id='HeaderControl_LogonControl_btnCancelLogin_CD']");
    public static Target TXT_HOME = Target.the("Home").locatedBy("//*[@id='form1']/div[3]/div[2]/div[1]/div/div[2]/h1");
    public static Target TXT_LOCATION = Target.the("Campo de texto Location").locatedBy("//*[@id='MainContentPlaceHolder_SearchPanel_SearchPanelLayout_LocationComboBox_I']");
    public static Target TXT_CHECKIN = Target.the("Campo de texto Check in").locatedBy("//*[@id='MainContentPlaceHolder_SearchPanel_SearchPanelLayout_CheckInDateEdit_I']");
    public static Target TXT_CHECKONT = Target.the("Campo de texto Check out").locatedBy("//*[@id='MainContentPlaceHolder_SearchPanel_SearchPanelLayout_CheckOutDateEdit_I']");
    public static Target TXT_ROOMS = Target.the("Campo de texto Rooms").locatedBy("//*[@id='MainContentPlaceHolder_SearchPanel_SearchPanelLayout_RoomsComboBox_I']");
    public static Target TXT_ADULTS = Target.the("Campo de texto Adults").locatedBy("//*[@id='MainContentPlaceHolder_SearchPanel_SearchPanelLayout_AdultsSpinEdit_I']");
    public static Target TXT_CHILDREN = Target.the("Campo de texto Children").locatedBy("//*[@id='MainContentPlaceHolder_SearchPanel_SearchPanelLayout_ChildrenSpinEdit_I']");
    public static Target BTN_SEARCH = Target.the("Boton Search").locatedBy("//*[@id='MainContentPlaceHolder_SearchPanel_SearchPanelLayout_SearchButton_CD']");
    public static Target TXT_RESERVA = Target.the("Resultado reserva").locatedBy("//*[@id='MainContentPlaceHolder_HotelsCountLabel']");
    public static Target LKN_OPCION1 = Target.the("Link primera opcion").locatedBy("//*[@id='MainContentPlaceHolder_HotelsDataView_IT0_HotelTitleHyperLink_0']");
    public static Target TXT_OPCION1 = Target.the("Resultado reserva Opcion 1").locatedBy("//*[@id='form1']/div[3]/div[2]/div[1]/div/div[1]/h2");
}
