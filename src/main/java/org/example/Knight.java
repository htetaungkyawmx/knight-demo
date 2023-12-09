package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import static org.example.QuestType.Type.*;
@Component
public class Knight {
    @Autowired @QuestType(YOYEYO)
    private Quest quest;
    private String name;
    public void setQuest(Quest quest) {
        this.quest = quest;
    }

    public String goQuest(){
        return quest.goQuest();
    }
}
