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
  private final Random rand = new Random();

  public String getRandomFortune(){
    return fortunes.get(rand.nextInt(fortunes.size()));
  }

  public String getRandomMessage(){
    return messageList.get(rand.nextInt(messageList.size()));
  }
  public String getPersonalizedMessage(String name) {
    return name + "さん、" + getRandomMessage();
}
}
