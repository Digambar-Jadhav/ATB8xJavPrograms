package Oct.ex_14102024.OtherEx;

public class Lab144 {
    public static void main(String[] args) {

        CHROMETC c  = new CHROMETC();
        c.openBrowser("chrome");
        c.closeBrowser("chrome");
        c.takeScreenshot();
        c.NoBodyKnowsWhereIamPresent();

        FIREFOXTC firefoxtc = new FIREFOXTC();
        firefoxtc.openBrowser("FIREFOX");
        firefoxtc.closeBrowser("FIREFOX");


    }
}