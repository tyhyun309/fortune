package tyhyun.fortune;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import org.springframework.stereotype.Service;

@Service
public class FortuneService {
  private List<String> messageList = Arrays.asList(
    "いい天気だから、散歩しましょう",
    "今日も一日頑張って！",
    "今日もお疲れ様でした",
    "美味しいコーヒー飲みましょう！"
  );

  private List<String> fortunes = Arrays.asList(
    "大吉です！！😍",
    "中吉です！！😆",
    "小吉です！！😀",
    "凶です！！👊🏻"
  );

  public String getRandomFortune(){
    Random rand = new Random();
    return fortunes.get(rand.nextInt(fortunes.size()));
  }

  public String getRandomMessage(){
    Random rand = new Random();
    fortunes.get(rand.nextInt(fortunes.size()));

    return messageList.get(rand.nextInt(messageList.size()));
  }
}
