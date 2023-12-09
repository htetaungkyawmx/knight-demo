package org.example;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import static org.example.QuestType.Type.*;

@Component @QuestType(YOYEYO)
public class SingYoYeYoQuest implements Quest{
    @Override
    public String goQuest() {
        return "Knight sing 'YoYeYo' happily....";
    }
}
