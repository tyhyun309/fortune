package tyhyun.fortune;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FortuneController {

  private final FortuneService fortuneService;

  public FortuneController(FortuneService fortuneService) {
      this.fortuneService = fortuneService;
  }

  @RequestMapping("/")
  public String index(Model model) {
    LocalDate today = LocalDate.now();
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy年MM月dd日(E)", Locale.JAPANESE);
    String formattedDate = today.format(formatter);
    model.addAttribute("today", formattedDate);
    return "index.html";
  }

  @RequestMapping("/fortune")
  public String getFortune(Model model, String name, String birthday) {
    model.addAttribute("name", name);
    LocalDate birthdayDate = LocalDate.parse(birthday);
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy年MM月dd日(E)", Locale.JAPANESE);
    String formattedBirthday = birthdayDate.format(formatter);
    model.addAttribute("birthday", formattedBirthday);
    String fortune = fortuneService.getRandomFortune();
    model.addAttribute("fortune", fortune);
    String message = fortuneService.getRandomMessage();
    model.addAttribute("message", message);
    return "fortune.html";
  }


  // @RequestMapping("/fortune")
  // public String getFortune(){
  //   double fn = Math.random();
  //   if (fn >= 0.7){
  //     return "greatFortune.html";
  //   } else if (fn >= 0.4){
  //     return "middleFortune.html";
  //   } else if (fn >= 0.1){
  //     return "smallFortune.html";
  //   } else {
  //     return "noFortune.html";
  //   }

}
