package tdd.diary;

import java.util.ArrayList;
import java.util.List;

public class MyDiaryCollection {
    private List<Diary> diaries;

    public MyDiaryCollection(){
        diaries = new ArrayList<>();
    }
    public void add(Diary diary){
        diaries.add(diary);
    }
    public List<Diary> findByUserName(String userName){
        List<Diary> foundDiaries = new ArrayList<>();
        for(Diary diary : diaries){
            if(diary instanceof PersonalDiary){
                PersonalDiary personalDiary = (PersonalDiary) diary;
                if(personalDiary.getOwner().equals(userName)){
                    foundDiaries.add(personalDiary);
                }
            }
        }
        return foundDiaries;
    }
    public void delete(Diary diary){
        diaries.remove(diary);
    }
}
