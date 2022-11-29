package githubaction.githubaction;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GithubActionController {
    @GetMapping("/test")
    public String githubActionTest() throws Exception {
        System.out.println("test");
        return "github action test 1231313";
    }
}
