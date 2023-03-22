package com.example.storageserver.ui;

import com.example.storageserver.storage.JourneyOutcome;
import io.mateu.mdd.core.annotations.MateuUI;
import io.mateu.mdd.shared.annotations.Caption;
import io.mateu.mdd.shared.annotations.MenuOption;
import io.mateu.mdd.shared.interfaces.JpaCrud;
import io.mateu.mdd.shared.interfaces.UserJourney;
import io.mateu.mdd.shared.interfaces.UserJourneyStarter;

@MateuUI(path = "")
@Caption("")
public class MyUI {

    @MenuOption(order = 5)
    private UserJourneyStarter startAnyUserJourney = new UserJourneyStarter("https://remote.mateu.io");

    @MenuOption(order = 10)
    private UserJourney termLife = new UserJourney("https://remote.mateu.io", "Process_1bxh4ag:6:20c176ea-b559-11ed-a424-960001f240a0");

    @MenuOption(order = 100)
    private JpaCrud<JourneyOutcome> inbox;

}
