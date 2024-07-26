package tyhyun.fortune;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import org.springframework.stereotype.Service;

@Service
public class FortuneService {
  private List<String> fortunes = Arrays.asList(
    "いい天気だから、散歩しましょう",
    "今日も一日頑張って！",
    "お疲れ様です",
    "コーヒー飲みましょう！"
  );


  public String getRandomFortune(){
    Random rand = new Random();
    return fortunes.get(rand.nextInt(fortunes.size()));
  }

}
