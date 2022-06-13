package demo.apicall.rest;

import org.springframework.web.bind.annotation.*;

import java.time.LocalTime;

@RestController
public class Controller {

  @GetMapping("/get")
  public String get() {
    String formatted = String.format("%s: get", LocalTime.now().toString());
    return formatted;
  }

  @PostMapping("/postForm1")
  public String postWithForm(@RequestParam Long id) {
    String formatted = String.format("%s: post id %d with application/x-www-form-urlencoded", LocalTime.now().toString(), id);
    return formatted;
  }

  record ReqModel(Long id){}

  @PostMapping("/postForm2")
  public String postWithForm(@ModelAttribute ReqModel reqModel) {
    String formatted = String.format("%s: post ReqModel(id=%d) with application/x-www-form-urlencoded", LocalTime.now().toString(), reqModel.id);
    return formatted;
  }

  record ReqJson(Long id) {
  }

  @PostMapping("/postJson")
  public String postWithForm(@RequestBody ReqJson reqJson) {
    String formatted = String.format("%s: post ReqJSon(id=%d) with application/json", LocalTime.now().toString(), reqJson.id);
    return formatted;
  }


}
