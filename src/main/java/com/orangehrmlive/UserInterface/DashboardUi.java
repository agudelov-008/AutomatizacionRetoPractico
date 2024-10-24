package com.orangehrmlive.UserInterface;

import net.serenitybdd.screenplay.targets.Target;

public class DashboardUi {

    public static final Target IMG_PROFILE_PIC = Target.the("profile pic")
            .locatedBy("//img[@alt='profile picture' and @class='oxd-userdropdown-img']");

    public static final Target I_HAMBURGUER = Target.the("hambuerguer menu")
            .locatedBy("//i[@class='oxd-icon bi-list oxd-topbar-header-hamburger']");

    public static final Target SPAN_RECRUITMENT = Target.the("recruitment span")
            .locatedBy("//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name' and contains(normalize-space(), 'Recruitment')]");




}
